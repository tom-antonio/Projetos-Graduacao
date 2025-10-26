import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Prioridade {
    private int id;
    private String descricao;

    public Prioridade() {
    }

    public Prioridade(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean salvarPrioridade() {
        String sql = "INSERT INTO tprioridade (id, descricao) VALUES (?, ?)";

        try (Connection conn = Postgres.conectar();
             PreparedStatement ps = (conn != null) ? conn.prepareStatement(sql) : null) {

            if (conn == null || ps == null) {
                System.out.println("Falha na conexão com o banco de dados.");
                return false;
            }

            ps.setInt(1, this.id);
            ps.setString(2, this.descricao);

            int afetados = ps.executeUpdate();
            return afetados > 0;

        } catch (SQLException e) {
            // Trate chaves duplicadas, violação de constraints, etc.
            System.out.println("Erro ao inserir Prioridade: " + e.getMessage());
            return false;
        }
    }
    public void alterarPrioridade() {
        System.out.println("Alterando prioridade: ID=" + this.id + ", Descrição=" + this.descricao);
    }
    public void excluirPrioridade() {
        System.out.println("Excluindo prioridade: ID=" + this.id + ", Descrição=" + this.descricao);
    }
    public void pesquisarPrioridade() {
        System.out.println("Pesquisando prioridade: ID=" + this.id + ", Descrição=" + this.descricao);
    }
    
}
