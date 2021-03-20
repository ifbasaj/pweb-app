package br.ifba.saj.ads.pweb.app.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.SpelEvaluationException;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class ProdutoTest {
    public ProdutoTest() {
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
    public void testProdutoModelEquals() {
        
        ExpressionParser parser = new SpelExpressionParser();
        Expression exp;

        try {
            Produto produto1 = new Produto();
            Produto produto2 = new Produto();
            exp = parser.parseExpression("id");
            Integer id = 5;
            exp.setValue(produto1,id);
            exp.setValue(produto2,id);
            assertEquals(produto1, produto2);
        } catch (SpelEvaluationException e) {
            fail(e.getMessage());
        }

    }
}
