/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrocliente;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author lousa
 */
public class BD {

    private static BD instancia = new BD();
    private final String DB_URL = "jdbc:mysql://localhost:3306/sistemajava";
    private final String DB_DRV = "com.mysql.jdbc.Driver";
    private final String DB_USER = "root";
    private final String DB_PASSWD = "senai";

    private BD() {

    }

    public static BD getInstancia() {
        return instancia;
    }

    public int executarDMLSQL(String sql) {
        Connection connection = null;
        Statement statement = null;
        int linhasAfetadas = -1;
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
            statement = connection.createStatement();
            linhasAfetadas = statement.executeUpdate(sql);
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                statement.close();
                connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            return linhasAfetadas;
        }
    }

    public boolean inserirCliente(Cliente c) {
        String sql = String.format("INSERT INTO clientes (nome, cpf,"
                + "endereco, telefone) VALUES ("
                + "'%s' , '%s', '%s', '%s') ", c.getNome(), c.getCpf(),
                c.getEndereco(), c.getTelefone());
        System.out.println(sql);
        int linhasAfetadas = executarDMLSQL(sql);
        if (linhasAfetadas > 0) {
            System.out.println("Cliente adicionado! Linhas afetadas:" + linhasAfetadas);
            return true;
        } else {
            System.out.println("Erro! Linhas afetadas: " + linhasAfetadas);
            return false;
        }
    }

    public ResultSet executarSelectSQL(String sql) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                System.out.printf("%s %s %s %s \n",
                        resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        } finally {
            try {
                resultSet.close();
                statement.close();
                connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
                return null;
            }
            return resultSet;
        }
    }

    public ResultSet buscarCliente(String atributo, String termo) {
        String sql = String.format("SELECT nome, cpf, endereco, telefone "
                + "FROM clientes WHERE %s LIKE '%s'", atributo, termo);
        System.out.println(sql);
        return executarSelectSQL(sql);

    }
}
