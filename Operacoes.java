package com.mycompany.butecolgbti;
import java.sql.Connection;
import java.sql.SQLException;

public interface Operacoes {
    
    public void adicionarCliente(Connection con, Cliente c) throws SQLException;
    public void deletarCliente(Connection con, Cliente c) throws SQLException;
    public void adicionarFuncionario(Connection con, Funcionario f) throws SQLException;
    public void deletarFuncionario(Connection con, Funcionario f) throws SQLException;
    public void adicionarAlimentos(Connection con, Alimentos a) throws SQLException;
    public void adicionarAtracao(Connection con, Atracao at) throws SQLException;
    public void deletarAtracao(Connection con, Atracao at) throws SQLException;
    
}
