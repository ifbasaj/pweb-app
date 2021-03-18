package br.ifba.saj.ads.pweb.app;

import org.junit.Test;
import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;


public class AppTest
{
    public AppTest() {
    }

    @Test
    public void testApp()
    {
        assertTrue( true );
    }

    @Test
    public void testMore()
    {
        assertTrue( true );
    }

    @Test
    public void abrirConexao(){
        try {
            Connection	conexao	=	DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/seJbtH8iSv","seJbtH8iSv","S00lDxLCdK");
            conexao.close();
            assertTrue( true );
                
        } catch (Exception e) {
            e.printStackTrace();
            assertTrue( false );
        }

    }
}
