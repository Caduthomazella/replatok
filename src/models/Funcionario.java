/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author cadut
 */
public class Funcionario {

    private String user, password, sector, document_cpf;

    public Funcionario() {}

    public Funcionario(String user, String password, String sector, String document_cpf) {
        this.user = user;
        this.password = password;
        this.sector = sector;
        this.document_cpf = document_cpf;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getDocument_cpf() {
        return document_cpf;
    }

    public void setDocument_cpf(String document_cpf) {
        this.document_cpf = document_cpf;
    }

}
