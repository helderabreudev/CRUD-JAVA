
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
import model.bean.Vendedor;

public class VendedorDAO {
     public void create(Vendedor v) {
        
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO vendedor(codigo,nome,sal) VALUES (?,?,?)");
            stmt.setInt(1,v.getCodigo());
            stmt.setString(2, v.getNome());
            stmt.setDouble(3, v.getSal());
            
            stmt.executeUpdate();          
            JOptionPane.showMessageDialog(null, "salvo com sucesso");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

         
    }
     public List<Vendedor> read() {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Vendedor> vendedores = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM vendedor");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Vendedor vendedor = new Vendedor();

                vendedor.setCodigo(rs.getInt("codigo"));
                vendedor.setNome(rs.getString("nome"));
                vendedor.setSal(rs.getDouble("sal"));
                vendedores.add(vendedor);
            }

        } catch (SQLException ex) {
            Logger.getLogger(VendedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return vendedores;

    }
    public List<Vendedor> readForDesc(String desc) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Vendedor> vendedores = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM vendedor WHERE Codigo LIKE ?");
            stmt.setString(1, "%"+desc+"%");
            
            rs = stmt.executeQuery();

            while (rs.next()) {

                Vendedor vendedor = new Vendedor();

                vendedor.setCodigo(rs.getInt("codigo"));
                vendedor.setNome(rs.getString("nome"));
                vendedor.setSal(rs.getDouble("sal"));
                vendedores.add(vendedor);
            }

        } catch (SQLException ex) {
            Logger.getLogger(VendedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return vendedores;

    }
    
    public void update(Vendedor v) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE vendedor SET codigo = ? ,nome = ?,sal = ? WHERE codigo = ?");
            stmt.setInt(1, v.getCodigo());
            stmt.setString(2, v.getNome());
            stmt.setDouble(3, v.getSal());
            stmt.setInt(4, v.getCodigo());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    public void delete(Vendedor v) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM vendedor WHERE codigo = ?");
            stmt.setInt(1, v.getCodigo());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
}
