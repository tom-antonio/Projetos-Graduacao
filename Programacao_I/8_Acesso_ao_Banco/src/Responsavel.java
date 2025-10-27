import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Responsavel {
    private int id;
    private String nome;

    public Responsavel() {
    }

    public Responsavel(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Lista todos os responsáveis cadastrados no banco
    public static List<Responsavel> listarTodas() {
        String sql = "SELECT id, nome FROM tresponsavel ORDER BY nome";
        List<Responsavel> lista = new ArrayList<>();

        try (Connection conn = Postgres.conectar();
             PreparedStatement ps = (conn != null) ? conn.prepareStatement(sql) : null) {

            if (conn == null || ps == null) {
                System.out.println("Falha na conexão com o banco de dados.");
                return lista;
            }

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String nome = rs.getString("nome");
                    lista.add(new Responsavel(id, nome));
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar Responsáveis: " + e.getMessage());
        }
        return lista;
    }

    @Override
    public String toString() {
        return nome;
    }

    public boolean salvarResponsavel() {
        String sql = "INSERT INTO tresponsavel (id, nome) VALUES (?, ?)";

        try (Connection conn = Postgres.conectar();
             PreparedStatement ps = (conn != null) ? conn.prepareStatement(sql) : null) {

            if (conn == null || ps == null) {
                System.out.println("Falha na conexão com o banco de dados.");
                return false;
            }

            ps.setInt(1, this.id);
            ps.setString(2, this.nome);

            int afetados = ps.executeUpdate();
            return afetados > 0;

        } catch (SQLException e) {
            System.out.println("Erro ao inserir Responsável: " + e.getMessage());
            return false;
        }
    }
    public void alterarResponsavel() {
        System.out.println("Alterando responsavel: ID=" + this.id + ", Descrição=" + this.nome);
    }
    public void excluirResponsavel() {
        System.out.println("Excluindo responsavel: ID=" + this.id + ", Descrição=" + this.nome);
    }
    public void pesquisarResponsavel() {
        System.out.println("Pesquisando responsavel: ID=" + this.id + ", Descrição=" + this.nome);
    }
}
