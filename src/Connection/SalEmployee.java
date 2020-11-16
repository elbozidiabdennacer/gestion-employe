
package Connection;

import Modeles.GesSalaire;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SalEmployee {
    Connection cnx;
    Statement st;
    PreparedStatement sr;
    ResultSet res;
    
    public ArrayList<GesSalaire> getListSal(int idcli){
    
        ArrayList<GesSalaire> listSal = new ArrayList<GesSalaire>();
        try {
              
              String query = "SELECT * FROM ges_salaire  WHERE idcli = "+idcli;
              
              cnx = ConnexionBd.Connecter();
              st = cnx.createStatement();
              res = st.executeQuery(query);
              GesSalaire gs;
              
              while(res.next()){
                  
                  gs = new GesSalaire(res.getInt(1),res.getInt(2),res.getDouble(3),res.getDouble(4),res.getDouble(5),res.getString(6));
                  listSal.add(gs);
                  
              }
        }catch (SQLException ex) {
              Logger.getLogger(TempsEmployee.class.getName()).log(Level.SEVERE, null, ex);
          }
        return listSal;
    }
    
    public void addSal(GesSalaire sal){
    
        try {
            String query =" INSERT INTO `ges_salaire`(`idcli`, `salaire`, `paiement`, `reste`, `date`) VALUES (?,?,?,?,?)";
            cnx = ConnexionBd.Connecter();
            sr=cnx.prepareStatement(query);
            
            
            sr.setInt(1,sal.getIdCli());
            sr.setDouble(2,sal.getSalaire());
            sr.setDouble(3,sal.getPaiement());
            sr.setDouble(4,sal.getReste());
            sr.setString(5,sal.getDateModif());
            
            sr.execute();
        } catch (SQLException ex) {
            Logger.getLogger(SalEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void suppSal(int idc,String dt){
    
        String query = "DELETE FROM ges_salaire idcli ="+idc+" date ="+dt;
        try {
            cnx = ConnexionBd.Connecter();
            st = cnx.createStatement();
            st.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(SalEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void vider(int idc){
    
        try {
            String query = "DELETE FROM ges_salaire idcli ="+idc;
            cnx = ConnexionBd.Connecter();
            st = cnx.createStatement();
            st.executeUpdate(query);
            
        } catch (SQLException ex) {
            Logger.getLogger(SalEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
