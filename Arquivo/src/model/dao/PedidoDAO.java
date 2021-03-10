
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.bean.Pedido;


public class PedidoDAO {
     public void create(Pedido pe) {
        
        Connection con = ConnectionFactory.getConnection();    
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO pedido (numero,prazo,cod_cliente,cod_vendedor) VALUES (?,?,?,?)");
            stmt.setInt(1,pe.getNumero());
            stmt.setString(2, pe.getPrazo());
            stmt.setInt(3, pe.getCod_cliente());
            stmt.setInt(4, pe.getCod_vendedor());       
            
            stmt.executeUpdate();            
            JOptionPane.showMessageDialog(null, "salvo com sucesso");
        } catch (SQLException ex) {
          System.out.println(ex);
        } finally {
          ConnectionFactory.closeConnection(con, stmt);
        }
        
    }            
}
    

