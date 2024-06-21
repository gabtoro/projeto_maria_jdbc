package com.eleodoro.dao;

public class VencimentoDAO {

    package com.eleodoro.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.eleodoro.conexao.Conexao;
import com.eleodoro.modelo.Estoque;


public class EstoqueDao{

    private vencimento estoque;
    private final String SQLINCLUIR = "INSERT INTO TURMA VALUES (?, ?, ?)";
    private final String SQLALTERAR = "UPDATE TURMA SET CAPACIDADE = ?, HORARIO = ? WHERE ID = ?";
    private final String SQLEXCLUIR = "DELETE FROM TURMA WHERE ID = ?";
    private final String SQLCONSULTAR = "SELECT * FROM TURMA WHERE ID = ?";

    public EstoqueDao (Vencimento vencimento) {
        this.vencimento = vencimento;
    }

    public boolean incluir(){
         try {
            PreparedStatement ps = Conexao.getConexao () .prepareStatement(SQLINCLUIR);
            ps.setInt(1, vencimento.getataVencimento());
            ps.executeUpdate();
            return true;
         } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Não foi possivel incluir a capacidade");
            return false;
         }
    }

    public boolean alterar(){
        try {
           PreparedStatement ps = Conexao.getConexao () .prepareStatement(SQLALTERAR);
           ps.setInt(2, vencimento.getataVencimento());
           ps.executeUpdate();
           return true;
        } catch (SQLException e) {
           e.printStackTrace();
           System.out.println("Não foi possivel alterar a capacidade");
           return false;
        }
   }

   public boolean excluir(){
    try {
       PreparedStatement ps = Conexao.getConexao () .prepareStatement(SQLEXCLUIR);
       ps.setInt(1, vencimento.getataVencimento());
       ps.executeUpdate();
       return true;
    } catch (SQLException e) {
       e.printStackTrace();
       System.out.println("Não foi possivel excluir a capacidade");
       return false;
    }
}

public boolean consultar(){
    try {
       PreparedStatement ps = Conexao.getConexao () .prepareStatement(SQLCONSULTAR);
       ResultSet rs = ps.executeQuery();
       if (rs.next()) {
        vencimento.setCapacidade(rs.getInt(1));
       }
       ps.executeUpdate();
       return true;
    } catch (SQLException e) {
       e.printStackTrace();
       System.out.println("Não foi possivel consultar a capacidade");
       return false;
    }
}
}
    
}
