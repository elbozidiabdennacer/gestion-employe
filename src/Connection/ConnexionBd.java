
package Connection;
import java.sql.*;


public class ConnexionBd {
    
    public static Connection Connecter(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Ok");
            String url="jdbc:mysql://localhost:3306/gestion_employees";
            String user = "root";
            String password ="root";
            
            Connection cnx = DriverManager.getConnection(url,user,password);
            System.out.println("Connection bien établie");
            return cnx;
        }
       catch(ClassNotFoundException | SQLException e){
           e.printStackTrace();
       
           return null;
       }
    }
    
    
}
