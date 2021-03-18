package br.ifba.saj.ads.pweb.app;

import org.junit.Test;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.SpelEvaluationException;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import br.ifba.saj.ads.pweb.app.model.Produto;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;

public class AppTest {
    public AppTest() {
    }

    @Test
    public void testProdutoModelId() {
        

        
        Produto produto = new Produto();

        ExpressionParser parser = new SpelExpressionParser();
        Expression exp;

        try {
            exp = parser.parseExpression("id");
            Integer id = 5;
            exp.setValue(produto,id);
            assertEquals(id, exp.getValue(produto));
        } catch (SpelEvaluationException e) {
            fail(e.getMessage());
        }

    }

    @Test
    public void testProdutoModelNome() {
        
        Produto produto = new Produto();

        ExpressionParser parser = new SpelExpressionParser();
        Expression exp;

        try {
            exp = parser.parseExpression("nome");
            String nome = "teste";
            exp.setValue(produto,nome);
            assertEquals(nome, exp.getValue(produto));
        } catch (SpelEvaluationException e) {
            fail(e.getMessage());
        }

    }
    @Test
    public void testProdutoModelValor() {
        
        Produto produto = new Produto();

        ExpressionParser parser = new SpelExpressionParser();
        Expression exp;

        try {
            exp = parser.parseExpression("valor");
            Float valor = 5.7f;
            exp.setValue(produto,valor);
            assertEquals(valor, exp.getValue(produto));
        } catch (SpelEvaluationException e) {
            fail(e.getMessage());
        }

    }

    @Test
    public void testProdutoModelQuantidade() {
        
        Produto produto = new Produto();

        ExpressionParser parser = new SpelExpressionParser();
        Expression exp;

        try {
            exp = parser.parseExpression("quantidade");
            Integer quantidade = 5;
            exp.setValue(produto,quantidade);
            assertEquals(quantidade, exp.getValue(produto));
        } catch (SpelEvaluationException e) {
            fail(e.getMessage());
        }

    }

    @Test
    public void abrirConexao() {
        try {
            Connection conexao = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/seJbtH8iSv",
                    "seJbtH8iSv", "S00lDxLCdK");
            conexao.close();
            assertTrue(true);

        } catch (Exception e) {
            e.printStackTrace();
            assertTrue(false);
        }

    }
}
