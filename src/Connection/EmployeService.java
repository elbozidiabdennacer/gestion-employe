
package Connection;

import Modeles.IDao;
import Modeles.etudiant;
import java.io.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class EmployeService implements IDao {
      public static   ArrayList<Integer> id3 = new ArrayList<Integer>();
      Connection cnx;
      Statement st;
      PreparedStatement sr;
      ResultSet res;
      @Override
    public  void ajouter(int id,String nom,String prenom,double salaire,String sexe,String Email,String pathimg){
        try {
            InputStream imgg = new FileInputStream(new File(pathimg));
          
           // String query = "INSERT INTO employee VALUES ("+id+",'"+nom+"','"+prenom+"',"+salaire+",'"+sexe+"','"+Email+"',?)";
           // st = cnx.createStatement();
           // st.executeUpdate(query);
           String quer = "INSERT INTO employee (id,nom,prenom,salaire,sexe,Email,image) VALUES (?,?,?,?,?,?,?) ";
           
           cnx = ConnexionBd.Connecter();
           sr=cnx.prepareStatement(quer);
           
           sr.setInt(1,id);
           sr.setString(2,nom);
           sr.setString(3,prenom);
           sr.setDouble(4,salaire);
           sr.setString(5,sexe);
           sr.setString(6,Email);
           sr.setBlob(7,imgg);
           sr.execute();
            
            
        
        }catch (SQLException e){
         System.out.println(e.getMessage());
        } catch (FileNotFoundException ex) {
             Logger.getLogger(EmployeService.class.getName()).log(Level.SEVERE, null, ex);
         }
        
        
    
   
    
    }
    
      @Override
    public void modifier(int ids,String unom,String uprenom,double usalaire,String usexe,String uemail,String pathimg){
        
        try{
           
            String query = "UPDATE employee SET nom ='"+unom+"',prenom = '"+uprenom+"',salaire="+usalaire+",sexe='"+usexe+"',Email='"+uemail+"'  WHERE id="+ids ;
            cnx = ConnexionBd.Connecter();
            
            st = cnx.createStatement();
            st.executeUpdate(query);
            
            if (pathimg.equals("")){
               InputStream imgg = new FileInputStream(new File(pathimg));
               String query2 = "UPDATE employee SET image = ? WHERE id="+ids;
                sr = cnx.prepareStatement(query2);
                sr.setBlob(1,imgg);
                sr.execute();
               }
            
           
           }catch (SQLException e){
         System.out.println(e.getMessage());
        } catch (FileNotFoundException ex) {
             Logger.getLogger(EmployeService.class.getName()).log(Level.SEVERE, null, ex);
         }
        
        
 }
    
      @Override
    public void supprimer(int ids){
    
           try{
           
            String query = "DELETE FROM employee WHERE id="+ids  ;
            String query2 = "UPDATE employee SET id = id-1 WHERE id>"+ids;
            cnx = ConnexionBd.Connecter();
            
            st = cnx.createStatement();
            st.executeUpdate(query);
            st.executeUpdate(query2);
            
           
           }catch (SQLException e){
         System.out.println(e.getMessage());
        }
    }
    
     @Override
    public ArrayList rechercher(String nom){
        ArrayList<etudiant> lst = new ArrayList<etudiant>();
     try{
     String query = "SELECT * FROM employee  WHERE nom = '"+nom+"'" ;
     //ResultSet rst;
     
            cnx = ConnexionBd.Connecter();
            st = cnx.createStatement();
            res = st.executeQuery(query);
            etudiant ob;
            id3.clear();
         while(res.next()){
             
             ob = new etudiant( res.getInt("id"),res.getString("nom"),res.getString("prenom"),res.getDouble("salaire"),res.getString("sexe"),res.getString("Email"));
             id3.add(res.getInt("id"));
             lst.add(ob);
             
         }   
            
      
    
    
         }catch (SQLException e){
            System.out.println(e.getMessage());
           }

  
    return lst;
    
}
    
    public ResultSet getSlected(int ids) throws SQLException{
         
       
        
              
              ResultSet res2;
             String query = "SELECT * FROM employee  WHERE id =  "+ids;
             cnx = ConnexionBd.Connecter();
             st = cnx.createStatement();
             res2 = st.executeQuery(query);
             
             
         return res2;
    }
    
}