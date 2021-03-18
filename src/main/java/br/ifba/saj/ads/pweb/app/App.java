/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package br.ifba.saj.ads.pweb.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App 
{
    public static void main( String[] args ) throws SQLException
    {
        System.out.println( "Hello Remote World!" );
        Connection	conexao	=	DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/seJbtH8iSv","seJbtH8iSv","S00lDxLCdK");
        System.out.println("Conectado!");
        conexao.close();
    }
}
