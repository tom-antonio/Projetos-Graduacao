import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class Tarefas {
    private int id;
    private LocalDate data_tarefa;
    private String descricao_tarefa;
    private String observacao;
    private Prioridade prioridade;
    private Responsavel responsavel;

    public Tarefas() {
    }

    public Tarefas(int id, LocalDate data_tarefa, String descricao_tarefa, String observacao, Prioridade prioridade, Responsavel responsavel) {
        this.id = id;
        this.data_tarefa = data_tarefa;
        this.descricao_tarefa = descricao_tarefa;
        this.observacao = observacao;
        this.prioridade = prioridade;
        this.responsavel = responsavel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getData_tarefa() {
        return data_tarefa;
    }

    public void setData_tarefa(LocalDate data_tarefa) {
        this.data_tarefa = data_tarefa;
    }

    public String getDescricao_tarefa() {
        return descricao_tarefa;
    }

    public void setDescricao_tarefa(String descricao_tarefa) {
        this.descricao_tarefa = descricao_tarefa;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }

    public Responsavel getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }

    public boolean salvarTarefas() throws SQLException {
        // Assumindo tabela 'ttarefas' com colunas compatíveis com os campos abaixo
        final String SQL = "INSERT INTO tlista (id, data, descricao, observacao, fk_id_prioridade, fk_id_responsavel) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = Postgres.conectar()) {
            if (conn == null) {
                System.out.println("Falha na conexão com o banco de dados.");
                return false;
            }

            try (PreparedStatement ps = conn.prepareStatement(SQL)) {
                ps.setInt(1, this.id);
                ps.setDate(2, (this.data_tarefa != null ? Date.valueOf(this.data_tarefa) : null));
                ps.setString(3, this.descricao_tarefa);
                ps.setString(4, this.observacao);
                ps.setInt(5, this.prioridade.getId());
                ps.setInt(6, this.responsavel.getId());

                int afetados = ps.executeUpdate();
                return afetados > 0;
            }
        }
    }
    public boolean alterarTarefas() throws SQLException {
        final String SQL = "UPDATE tlista SET data = ?, descricao = ?, observacao = ?, fk_id_prioridade = ?, fk_id_responsavel = ? WHERE id = ?";

        try (Connection conn = Postgres.conectar()) {
            if (conn == null) {
                System.out.println("Falha na conexão com o banco de dados.");
                return false;
            }

            try (PreparedStatement ps = conn.prepareStatement(SQL)) {
                ps.setDate(1, (this.data_tarefa != null ? Date.valueOf(this.data_tarefa) : null));
                ps.setString(2, this.descricao_tarefa);
                ps.setString(3, this.observacao);
                ps.setInt(4, this.prioridade.getId());
                ps.setInt(5, this.responsavel.getId());
                ps.setInt(6, this.id);
                int afetados = ps.executeUpdate();
                return afetados > 0;
            }
        }
    }
    public boolean excluirTarefas() throws SQLException {
        final String SQL = "DELETE FROM tlista WHERE id = ?";

        try (Connection conn = Postgres.conectar()) {
            if (conn == null) {
                System.out.println("Falha na conexão com o banco de dados.");
                return false;
            }

            try (PreparedStatement ps = conn.prepareStatement(SQL)) {
                ps.setInt(1, this.id);
                int afetados = ps.executeUpdate();
                return afetados > 0;
            }
        }
    }
    
    public boolean pesquisarTarefas() throws SQLException {
        final String SQL = "SELECT t.data, t.descricao, t.observacao, t.fk_id_prioridade, p.descricao AS prioridade_descricao, " +
                           "t.fk_id_responsavel, r.nome AS responsavel_nome " +
                           "FROM tlista t " +
                           "LEFT JOIN tprioridade p ON p.id = t.fk_id_prioridade " +
                           "LEFT JOIN tresponsavel r ON r.id = t.fk_id_responsavel " +
                           "WHERE t.id = ?";

        try (Connection conn = Postgres.conectar()) {
            if (conn == null) {
                System.out.println("Falha na conexão com o banco de dados.");
                return false;
            }

            try (PreparedStatement ps = conn.prepareStatement(SQL)) {
                ps.setInt(1, this.id);
                try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {
                        Date dt = rs.getDate("data");
                        this.data_tarefa = (dt != null ? dt.toLocalDate() : null);
                        this.descricao_tarefa = rs.getString("descricao");
                        this.observacao = rs.getString("observacao");

                        int idPrioridade = rs.getInt("fk_id_prioridade");
                        String descPrioridade = rs.getString("prioridade_descricao");
                        if (!rs.wasNull()) {
                            Prioridade p = new Prioridade();
                            p.setId(idPrioridade);
                            p.setDescricao(descPrioridade);
                            this.prioridade = p;
                        } else {
                            this.prioridade = null;
                        }

                        int idResp = rs.getInt("fk_id_responsavel");
                        String nomeResp = rs.getString("responsavel_nome");
                        if (!rs.wasNull()) {
                            Responsavel r = new Responsavel();
                            r.setId(idResp);
                            r.setNome(nomeResp);
                            this.responsavel = r;
                        } else {
                            this.responsavel = null;
                        }
                        return true;
                    }
                    return false;
                }
            }
        }
    }
}
