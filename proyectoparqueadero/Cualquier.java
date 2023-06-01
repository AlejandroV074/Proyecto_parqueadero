package proyectoparqueadero;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Cualquier {
    public static void main(String[] args) {
        try {
            // TODO add your handling code here:

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection("jdbc:sqlserver://systemengine-database.database.windows.net:1433;database=SystemEngine-database;user=systemengine-server@systemengine-database;password={63Z6OOi*};encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;","systemengine-server","63Z6OOi*");
            Statement stat = con.createStatement();
            Logger.getLogger(Cualquier.class.getName()).info("Closing database connection");
            Logger.getLogger(Cualquier.class.getName()).info("Insert data");

            String sql = "INSERT INTO [dbo].[Usuarios] (Cedula, Nombre, Apellidos, Telefono, Correo, Contrasenia) VALUES ('1', 'A', 'B', '0000', 'correo@gmail.com', '123456*')";
            stat.executeUpdate(sql);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Cualquier.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "El vehiculo no se encuentra en el parqueadero, por favor revise la placa ingresada");
            
            Logger.getLogger(Cualquier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
}
