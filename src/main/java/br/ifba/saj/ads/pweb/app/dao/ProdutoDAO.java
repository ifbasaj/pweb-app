package br.ifba.saj.ads.pweb.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import br.ifba.saj.ads.pweb.app.model.Produto;

public class ProdutoDAO extends GenericDAO<Produto> {

    @Override
    public void incluir(Produto t) throws SQLException {
        String sql = "INSERT INTO `PRODUTO`( `NOME`, `VALOR`, `QUANTIDADE`) VALUES (?,?,?)";

        try (Connection conn = getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);) {

            stmt.setString(1, t.getNome());
            stmt.setFloat(2, t.getValor());
            stmt.setInt(3, t.getQuantidade());

            stmt.executeUpdate();

            try (ResultSet keys = stmt.getGeneratedKeys()) {
                if (keys.next()) {
                    t.setId(keys.getInt(1));
                }
            }
        }
    }

    @Override
    public void alterar(Produto t) throws SQLException {
        // TODO Auto-generated method stub

    }

    @Override
    public void excluir(Produto t) throws SQLException {
        // TODO Auto-generated method stub

    }

    @Override
    public List<Produto> listarTodos() throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Produto obter(Produto t) throws SQLException {
        Produto produto = null;
        String sql = "SELECT  ID, NOME, VALOR, QUANTIDADE FROM PRODUTO WHERE ID = ?";

        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(sql);) {

            stmt.setInt(1, t.getId());

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                produto = new Produto();
                produto.setId(rs.getInt("ID"));
                produto.setNome(rs.getString("NOME"));
                produto.setValor(rs.getFloat("VALOR"));
                produto.setQuantidade(rs.getInt("QUANTIDADE"));
            }
        }
        return produto;
    }

}
