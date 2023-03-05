import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.Statement;

public class CreateTables {
	
	Conexion miConexion = new Conexion();
    // Obtener la conexión a la base de datos
    Connection conn = miConexion.conectar();
	
	public void executeQueryFromFile(String filePath) {
	    try {
	    	
	    	
	        // Leer el archivo SQL
	        BufferedReader reader = new BufferedReader(new FileReader(filePath));
	        String line = null;
	        StringBuilder stringBuilder = new StringBuilder();
	        String ls = System.getProperty("line.separator");
	        
	       

	        while ((line = reader.readLine()) != null) {
	            stringBuilder.append(line);
	            stringBuilder.append(ls);
	            
	         
	        }

	        // Ejecutar la consulta
	        String sql = stringBuilder.toString();
	        Statement stmt = conn.createStatement();
	        int rs = stmt.executeUpdate(sql);
	        
	        //Obtener el nombre del archivo 
	        File file = new File(filePath);
	        String fileName = file.getName();
	        
	        // Cerrar el lector de archivos
	        reader.close();
	        stmt.close();
	        System.out.println("La tabla con el nombre de archivo " + fileName+  " ha sido añadida exitosamente");

	    } catch (Exception e) {
	        System.out.println(e.getMessage());
	    }
	
		}
	}


