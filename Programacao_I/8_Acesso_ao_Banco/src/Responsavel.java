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

    public boolean salvarResponsavel() throws SQLException {
        final String sql = "INSERT INTO tresponsavel (id, nome) VALUES (?, ?)";

        try (Connection conn = Postgres.conectar()) {
            if (conn == null) {
                System.out.println("Falha na conexão com o banco de dados.");
                return false;
            }

            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setInt(1, this.id);
                ps.setString(2, this.nome);

                int afetados = ps.executeUpdate();
                return afetados > 0;
            }
        }
    }
    public boolean alterarResponsavel() throws SQLException {
        final String sql = "UPDATE tresponsavel SET nome = ? WHERE id = ?";

        try (Connection conn = Postgres.conectar()) {
            if (conn == null) {
                System.out.println("Falha na conexão com o banco de dados.");
                return false;
            }

            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, this.nome);
                ps.setInt(2, this.id);
                int afetados = ps.executeUpdate();
                return afetados > 0;
            }
        }
    }
    public boolean excluirResponsavel() throws SQLException {
        final String sql = "DELETE FROM tresponsavel WHERE id = ?";

        try (Connection conn = Postgres.conectar()) {
            if (conn == null) {
                System.out.println("Falha na conexão com o banco de dados.");
                return false;
            }

            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setInt(1, this.id);
                int afetados = ps.executeUpdate();
                return afetados > 0;
            }
        }
    }
    public boolean pesquisarResponsavel() throws SQLException {
        final String sql = "SELECT nome FROM tresponsavel WHERE id = ?";

        try (Connection conn = Postgres.conectar()) {
            if (conn == null) {
                System.out.println("Falha na conexão com o banco de dados.");
                return false;
            }

            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setInt(1, this.id);
                try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {
                        this.nome = rs.getString("nome");
                        return true;
                    }
                    return false;
                }
            }
        }
    }
}
