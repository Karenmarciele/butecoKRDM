package com.mycompany.butecolgbti;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PrincipalButeco {
    public static void main(String[] args) throws SQLException{
        
        Connection con = null;
 
        while (con == null){
            try{
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Buteco", "root", "root");


            Cliente c  = new Cliente("Joao", 19, 42679787, 346456);
            Cliente c1 = new Cliente("Dudinha", 16, 134567, 53547);
            Cliente c2 = new Cliente("Raissinha", 17, 985567, 7569);
            Cliente c3 = new Cliente("Karenzinha", 17, 547597, 75959);
            Cliente c4 = new Cliente("Muliro", 16, 2395547, 9722114);
            Vendas v = new Vendas();

            v.adicionarCliente(con, c);
            v.adicionarCliente(con, c1);
            v.adicionarCliente(con, c2);
            v.adicionarCliente(con, c3);
            v.adicionarCliente(con, c4);



            }catch(SQLException ex){

                ex.getStackTrace();


            }finally{
                if(con!=null){
                    con.close();
                }
        
                
        try{
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Buteco", "root", "root");


            Funcionario f  = new Funcionario("Joao", 19980, 42, "Garçom", "Bonito, responsável e gente boa");
            Funcionario f1  = new Funcionario("Raissinha", 59980, 17, "Dona", "Inteligente, rica, responsável e gente boa");
            Funcionario f2  = new Funcionario("Dudinha", 23980, 16, "Sócia", "Gatinha");
            Funcionario f3  = new Funcionario("Karenzinha", 68980, 17, "Sócia", "Responsavel, linda e xuxu");
            Funcionario f4  = new Funcionario("Murilinho", 15687, 16, "Sócio", "Jogador");
            Vendas v = new Vendas();

            v.adicionarFuncionario(con, f);
            v.adicionarFuncionario(con, f1);
            v.adicionarFuncionario(con, f2);
            v.adicionarFuncionario(con, f3);
            v.adicionarFuncionario(con, f4);



            }catch(SQLException ex){

                ex.getStackTrace();


            }finally{
                if(con!=null){
                    con.close();
                }        
                
        try{
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Buteco", "root", "root");


            Alimentos a   = new Alimentos ("Cuscuz",  "Água", "cuscuz",  30);
            Alimentos a1  = new Alimentos ("Frango",  "Água", "Frango",  90);
            Alimentos a2  = new Alimentos ("massa",   "Água",  "massa",  70);
            Alimentos a3  = new Alimentos ("salada",  "Água", "salada",  40);
            Alimentos a4  = new Alimentos ("carne",   "Água", " carne",  20);
            Vendas v = new Vendas();

            v.adicionarAlimentos(con, a);
            v.adicionarAlimentos(con, a1);
            v.adicionarAlimentos(con, a2);
            v.adicionarAlimentos(con, a3);
            v.adicionarAlimentos(con, a4);



            }catch(SQLException ex){

                ex.getStackTrace();


            }finally{
                if(con!=null){
                    con.close();
                }            
                
        }
                
        }        
        
        }        
        try{
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Buteco", "root", "root");


            Atracao at   = new  Atracao (46463, 10, 1000, "Noite", "Fabin",  3758);
            Atracao at1  = new  Atracao (45466, 2, 2345,  "Tarde", "Naldinho", 476);
            Atracao at2  = new  Atracao (35567, 3,7364,   "Tarde"  ,"Ana", 45);
            Atracao at3  = new  Atracao (45466, 2, 2345,  "Tarde", "Naldinho", 476);
            Atracao at4  = new  Atracao (45466, 2, 2345,  "Tarde", "Naldinho", 476);
            Vendas v = new Vendas();

            v.adicionarAtracao(con, at);
            v.adicionarAtracao(con, at1);
            v.adicionarAtracao(con, at2);
            v.adicionarAtracao(con, at3);
            v.adicionarAtracao(con, at4);



            }catch(SQLException ex){

                ex.getStackTrace();


            }finally{
                if(con!=null){
                    con.close();
                }            
                
        }
        }
    }
    }
}
