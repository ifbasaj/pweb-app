package br.ifba.saj.ads.pweb.app.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;
import org.unitils.reflectionassert.ReflectionAssert;

import br.ifba.saj.ads.pweb.app.model.Produto;

public class ProdutoDAOTest {

    private Produto produtoTeste = new Produto();
    private GenericDAO<Produto> dao = new ProdutoDAO();

    public ProdutoDAOTest() {
        produtoTeste.setNome("nome Produto Test");
        produtoTeste.setValor(500.4f);
        produtoTeste.setQuantidade(3);
    }

    @Test
    public void abrirConexao() {
        try {
            Connection conexao = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/seJbtH8iSv",
                    "seJbtH8iSv", "S00lDxLCdK");
            conexao.close();
            assertTrue(true);

        } catch (Exception e) {
            fail(e.getMessage());
        }

    }

    @Test
    public void incluirProduto() {

        try {

            GenericDAO<Produto> dao = new ProdutoDAO();
            dao.incluir(produtoTeste);
            assertNotNull(produtoTeste.getId());

            Produto produto2 = new Produto();
            produto2.setId(produtoTeste.getId());
            produto2 = dao.obter(produto2);
            assertEquals(produtoTeste, produto2);
            ReflectionAssert.assertReflectionEquals(produtoTeste, produto2);
            dao.excluir(produtoTeste);

        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void alterarProduto() {

        try {
            dao.incluir(produtoTeste);
            Produto produto2 = dao.obter(produtoTeste);
            produto2.setNome("Teste 2");
            dao.alterar(produto2);
            Produto produto3 = dao.obter(produtoTeste);
            assertEquals(produto2, produto3);
            ReflectionAssert.assertReflectionEquals(produto2, produto3);
            dao.excluir(produtoTeste);
        } catch (Exception e) {
            fail(e.getMessage());
        }

    }

    @Test
    public void excluirProduto() {

        try {
            dao.incluir(produtoTeste);
            Produto produto2 = dao.obter(produtoTeste);
            dao.excluir(produto2);
            Produto produto3 = dao.obter(produtoTeste);
            assertNull(produto3);
        } catch (Exception e) {
            fail(e.getMessage());
        }

    }
}
