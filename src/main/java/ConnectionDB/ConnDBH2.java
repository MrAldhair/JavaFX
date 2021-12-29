package ConnectionDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnDBH2 {
    
    // Libreria de MySQL
    public static String driver = "org.h2.Driver";
    //Ruta de la bd
    public static String url = "jdbc:h2:tcp://localhost/~/test";
    // Nombre de usuario
    public static String userName = "sa";
    // Contrase�a
    public static String password = "";
    //

    // Metodo de conexion
    public static Connection connectionDbH2(){

        Connection conn = null;

        try {

            Class.forName(driver);
            conn = DriverManager.getConnection(url, userName, password);

        } catch (ClassNotFoundException | SQLException e) {

            System.out.println(e.toString());

            e.printStackTrace();

        }
        return conn;
    }

    public static void closeConnection(){
        //Connection conn = null;
        Connection conn = connectionDbH2();

        try{

            conn.close();

        }catch(SQLException e){

            e.printStackTrace();

        }
    }
    
}

