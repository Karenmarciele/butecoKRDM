package com.mycompany.butecolgbti;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Vendas implements Operacoes {

    @Override
    public void adicionarCliente(Connection con, Cliente c) throws SQLException {
        
        String sql = "insert into Cliente(nome, idade, identidade, telefone) values(?, ?, ?, ?)";
        PreparedStatement clientec = con.prepareStatement(sql);
        
        clientec.setString(1, c.getNome());
        clientec.setInt(2, c.getIdade());
        clientec.setInt(3, c.getIdentidade());
        clientec.setInt(4, c.getTelefone());
        clientec.executeUpdate();
    }

    @Override
    public void deletarCliente(Connection con, Cliente c) throws SQLException {
        
        String sql = "delete from Cliente where identidade = ?";
        PreparedStatement clientec = con.prepareStatement(sql);
        
        clientec.setString(1, c.getNome());
        clientec.setInt(2, c.getIdade());
        clientec.setInt(3, c.getIdentidade());
        clientec.setInt(4, c.getTelefone());
        clientec.executeUpdate();
    }

    @Override
    public void adicionarFuncionario(Connection con, Funcionario f) throws SQLException {
        
        String sql = "insert into Funcionario(nome, salario, idade, funcao, curriculo) values(?, ?, ?, ?, ?)";
        PreparedStatement funcionariof = con.prepareStatement(sql);
        
        funcionariof.setString(1, f.getNome());
        funcionariof.setDouble(2, f.getSalario());
        funcionariof.setInt(3, f.getIdade());
        funcionariof.setString(4, f.getFuncao());
        funcionariof.setString(5, f.getCurriculo());
        funcionariof.executeUpdate();
    }

    @Override
    public void deletarFuncionario(Connection con, Funcionario f) throws SQLException {
        
        String sql = "delete from Funcionario where Curriculo = ?";
        PreparedStatement funcionariof = con.prepareStatement(sql);
        
        funcionariof.setString(1, f.getNome());
        funcionariof.setDouble(2, f.getSalario());
        funcionariof.setInt(3, f.getIdade());
        funcionariof.setString(4, f.getFuncao());
        funcionariof.setString(5, f.getCurriculo());
        funcionariof.executeUpdate();
    }

    @Override
    public void adicionarAlimentos(Connection con, Alimentos a) throws SQLException {
        String sql = "insert into Alimentos(comidas, bebidas, nome, preco) values(?, ?, ?, ?)";
        PreparedStatement Alimentosa = con.prepareStatement(sql);
        
        Alimentosa.setString(1, a.getComidas());
        Alimentosa.setString(2, a.getBebidas());
        Alimentosa.setString(3, a.getNome());
        Alimentosa.setDouble(4, a.getPreco());
         
         
    }


    @Override
    public void adicionarAtracao(Connection con, Atracao at) throws SQLException {
        
        String sql = "insert into Atracao(telefone, avaliacao, caches, horario, nome, preco) values(?, ?, ?, ?, ?, ?)";
        PreparedStatement atracaoat = con.prepareStatement(sql);
        
        atracaoat.setInt (1,  at.getTelefone());
        atracaoat.setFloat(2, at.getAvaliacao());
        atracaoat.setDouble(3, at.getCaches());
        atracaoat.setString(4, at.getHorario());
        atracaoat.setString(3, at.getNome());
       atracaoat.setDouble(4, at.getPreco());
         
        atracaoat.executeUpdate();
    }

    @Override
    public void deletarAtracao(Connection con, Atracao at) throws SQLException {
        String sql = "delete from Atracao where telefone = ?";
        PreparedStatement atracaoat = con.prepareStatement(sql);
        
        atracaoat.setInt(1, at.getTelefone());
        atracaoat.setFloat(2, at.getAvaliacao());
        atracaoat.setDouble(3, at.getCaches());
        atracaoat.setString(4, at.getHorario());
        atracaoat.executeUpdate();
    }


    
}
