package com.eleodoro.conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {


    private static String url = "jdbc:mysql://localhost:3306/loja";
    private String user = "root";
    private String password = "";

    private static Connection conn;

    public static Connection getConexao() {

        try {

            if (conn == null) { 
                conn = DriverManager.getConnection(url, user, password);
                System.out.println("Conexao com o banco de dados criada com sucesso.");
                return conn;

        } else {
               System.out.println("Conexao com o banco de dados estavel.");
               return conn;
            
        }   

        } catch (SQLException e) { 
            e.printStackTrace();
            System.out.println("Erro na conexao com o banco de dados.");
            return null;
        }


    }  



}
