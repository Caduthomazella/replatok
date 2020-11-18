/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.mysql;

import dao.interfaces.IUFuncionarioDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Funcionario;

/**
 *
 * @author cadut
 */
public class FuncionarioDAO implements IUFuncionarioDAO{
    
    private Connection conn;
    public FuncionarioDAO() {
       conn = ConnectionFactory.getConnection();
    }

    @Override
    public void insert(Funcionario funcionario) {
        try {
            String sql = "insert into funcionario(user, password, sector, document_cpf) values (?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, funcionario.getUser());
            stmt.setString(2, funcionario.getPassword());
            stmt.setString(3, funcionario.getSector());
            stmt.setString(4, funcionario.getDocument_cpf());
            stmt.execute();
            stmt.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void edit(Funcionario funcionario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Funcionario> select() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Funcionario selectCode(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet selectTable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
