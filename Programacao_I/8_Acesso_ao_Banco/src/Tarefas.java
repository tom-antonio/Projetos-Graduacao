import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
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

    public boolean salvarTarefas() {
        // Assumindo tabela 'ttarefas' com colunas compatíveis com os campos abaixo
        final String SQL = "INSERT INTO tlista (id, data, descricao, observacao, fk_id_prioridade, fk_id_responsavel) VALUES (?, ?, ?, ?, ?, ?)";

        if (this.prioridade == null || this.responsavel == null) {
            System.out.println("Prioridade e Responsável devem ser informados.");
            return false;
        }

        try (Connection conn = Postgres.conectar();
             PreparedStatement ps = (conn != null) ? conn.prepareStatement(SQL) : null) {

            if (conn == null || ps == null) {
                System.out.println("Falha na conexão com o banco de dados.");
                return false;
            }

            ps.setInt(1, this.id);
            ps.setDate(2, (this.data_tarefa != null ? Date.valueOf(this.data_tarefa) : null));
            ps.setString(3, this.descricao_tarefa);
            ps.setString(4, this.observacao);
            ps.setInt(5, this.prioridade.getId());
            ps.setInt(6, this.responsavel.getId());

            int afetados = ps.executeUpdate();
            return afetados > 0;

        } catch (SQLException e) {
            System.out.println("Erro ao inserir Tarefa: " + e.getMessage());
            return false;
        }
    }
    public void alterarTarefas() {
        System.out.println("Alterando prioridade: ID=" + this.id + ", Descrição=" + this.descricao_tarefa);
    }
    public void excluirTarefas() {
        System.out.println("Excluindo prioridade: ID=" + this.id + ", Descrição=" + this.descricao_tarefa);
    }
    public void pesquisarTarefas() {
        System.out.println("Pesquisando prioridade: ID=" + this.id + ", Descrição=" + this.descricao_tarefa);
    }
    

}
