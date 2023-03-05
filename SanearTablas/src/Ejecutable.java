

public class Ejecutable {

	public static void main(String[] args) {
		//Eliminar tablas		
		Eliminar borrartablas = new Eliminar();
		borrartablas.eliminarTabla();
		
		//Añadir tablas
		CreateTables creartablas = new CreateTables();
		creartablas.executeQueryFromFile("C:/Users/JLAC/Desktop/Consultas/pruebas_prueba1.sql");
		creartablas.executeQueryFromFile("C:/Users/JLAC/Desktop/Consultas/pruebas_prueba2.sql");
	}

}
