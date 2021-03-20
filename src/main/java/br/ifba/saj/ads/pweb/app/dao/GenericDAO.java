package br.ifba.saj.ads.pweb.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public abstract class GenericDAO<T> {

    protected Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/seJbtH8iSv", "seJbtH8iSv", "S00lDxLCdK");
    }

    abstract void incluir(T t)  throws SQLException;

    abstract void alterar(T t) throws SQLException;

    abstract void excluir(T t) throws SQLException;

    abstract List<T> listarTodos() throws SQLException;

    abstract T obter(T t) throws SQLException;

}
