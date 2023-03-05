import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class Eliminar {
	
    Conexion miConexion = new Conexion();
    // Obtener la conexión a la base de datos
    Connection conn = miConexion.conectar();
    
	
	public void eliminarTabla() {
        try {
            // Obtener la conexión a la base de datos
        String tabla1 = "prueba1";
        String tabla2 = "prueba2";

            // Crear una instancia de Statement
            Statement stmt = conn.createStatement();

            // Ejecutar la sentencia SQL para eliminar las tablas
            String sql = "DROP TABLE "+ tabla1;
            System.out.println("La tabla "+ tabla1 +" ha sido eliminada");
            String sql2 = "DROP TABLE " + tabla2;
            System.out.println("La tabla "+ tabla2 +" ha sido eliminada");
            //Pondriamos en primer lugar la tabla primera que necesitamos borrar(no
            //es muy eficiente pero paso de hacer comprobaciones)
            stmt.executeUpdate(sql);  
            stmt.executeUpdate(sql2);
           

            // Cerrar la instancia de Statement y la conexión a la base de datos
            stmt.close();
    

        } catch (SQLException e) {
            System.out.println("Error al eliminar la tabla: " + e.getMessage());
        }
	
	
	}
}
