import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

    // Exibe a descrição ao usar o objeto em JComboBox, logs, etc.
    @Override
    public String toString() {
        return descricao;
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

    // Lista todas as prioridades cadastradas no banco
    public static List<Prioridade> listarTodas() {
        String sql = "SELECT id, descricao FROM tprioridade ORDER BY descricao";
        List<Prioridade> lista = new ArrayList<>();

        try (Connection conn = Postgres.conectar();
             PreparedStatement ps = (conn != null) ? conn.prepareStatement(sql) : null) {

            if (conn == null || ps == null) {
                System.out.println("Falha na conexão com o banco de dados.");
                return lista;
            }

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String descricao = rs.getString("descricao");
                    lista.add(new Prioridade(id, descricao));
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar Prioridades: " + e.getMessage());
        }

        return lista;
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
