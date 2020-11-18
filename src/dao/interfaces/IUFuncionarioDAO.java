/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.interfaces;

import java.sql.ResultSet;
import java.util.ArrayList;
import models.Funcionario;

/**
 *
 * @author cadut
 */
public interface IUFuncionarioDAO {
    public void insert(Funcionario funcionario);
    public void edit(Funcionario funcionario);
    public void delete(int codigo);
    public ArrayList<Funcionario> select();
    public Funcionario selectCode(int codigo);
    public ResultSet selectTable();
}
