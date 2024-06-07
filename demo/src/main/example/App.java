package demo.src.main.example;
import example.DatabaseConnection.DatabaseConnection;
import java.sql.Connection;
import java.sql.SQLException;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try(Connection conn=conexion.getConnection()){
            if(conn !=null){
                System.out.println("Conexion exitosa a la base de datos");
            } else{
                System.out.println("Fallo la conexion a la base de datos");
            }
        } catch(SQLException e){
            e.getStackTrace();
        }

    }
}
