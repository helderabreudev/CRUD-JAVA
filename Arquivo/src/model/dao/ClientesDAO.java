package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Clientes;
import model.bean.Produto;

public class ClientesDAO {
    public void create(Clientes c) {
        
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO clientes (codigo,nome,cpf,uf,cidade,cep,endereco) VALUES (?,?,?,?,?,?,?)");
            stmt.setInt(1,c.getCodigo());
            stmt.setString(2, c.getNome());
            stmt.setString(3, c.getCpf());
            stmt.setString(4, c.getUf());
            stmt.setString(5, c.getCidade());
            stmt.setInt(6, c.getCep());
            stmt.setString(7, c.getEndereco());
            
            stmt.executeUpdate();  
            
            JOptionPane.showMessageDialog(null, "salvo com sucesso");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        } 
    }
        
        public List<Clientes> read() {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Clientes> clientes = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM clientes");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Clientes cliente = new Clientes();

                cliente.setCodigo(rs.getInt("codigo"));
                cliente.setNome(rs.getString("nome"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setCidade(rs.getString("cidade"));
                cliente.setCep(rs.getInt("cep"));
                cliente.setEndereco(rs.getString("endereco"));
                cliente.setUf(rs.getString("uf"));
                clientes.add(cliente);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ClientesDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return clientes;

    }
    public List<Clientes> readForDesc(String desc) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Clientes> clientes = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM clientes WHERE descricao LIKE ?");
            stmt.setString(1, "%"+desc+"%");
            
            rs = stmt.executeQuery();

            while (rs.next()) {

                Clientes cliente = new Clientes();

                cliente.setCodigo(rs.getInt("codigo"));
                cliente.setNome(rs.getString("nome"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setCidade(rs.getString("cidade"));
                cliente.setCep(rs.getInt("cep"));
                cliente.setEndereco(rs.getString("endereco"));
                cliente.setUf(rs.getString("uf"));
                clientes.add(cliente);
                
                clientes.add(cliente);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ClientesDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return clientes;

    }
    public void update(Clientes c) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE clientes SET nome = ?,cpf = ?,uf = ?,cidade = ?, cep = ?, endereco = ? WHERE codigo = ?"); 
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getCpf());
            stmt.setString(3, c.getUf());
            stmt.setString(4, c.getCidade());
            stmt.setInt(5, c.getCep());
            stmt.setString(6, c.getEndereco());
            stmt.setInt(7, c.getCodigo());
            

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
     public void delete(Clientes c) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE  FROM clientes WHERE codigo = ?"); 
            stmt.setInt(1, c.getCodigo());       

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir" + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
        
        
         
    }
