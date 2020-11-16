package Connection;

import Modeles.GesTemps;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TempsEmployee {
    
      Connection cnx;
      Statement st;
      PreparedStatement sr;
      ResultSet res;
    
    public void addTemps (GesTemps gestemps){
    
          try {
              String query = "INSERT INTO `ges_temps`(`idcli`, `temps_entrer`, `temps_sortie`, `date`) VALUES (?,?,?,?)";
              
              cnx = ConnexionBd.Connecter();
              sr=cnx.prepareStatement(query);
              
              sr.setInt(1,gestemps.getIdCli());
              sr.setString(2,gestemps.getTempsEntry());
              sr.setString(3,gestemps.getTempsSortie());
              sr.setString(4,gestemps.getDate());
              
              sr.execute();
              
              } catch (SQLException ex) {
              Logger.getLogger(TempsEmployee.class.getName()).log(Level.SEVERE, null, ex);
                } 
    }
    
    public void deleteTemp(GesTemps gs){
    
          try {
              String query = "DELETE FROM ges_temps WHERE idcli ="+gs.getIdCli()+" and temps_entrer = '"+gs.getTempsEntry()+"' and temps_sortie = '"+gs.getTempsSortie()+"' and date = '"+gs.getDate()+"'";
              cnx = ConnexionBd.Connecter();
              st = cnx.createStatement();
              st.executeUpdate(query);
              
          } catch (SQLException ex) {
              Logger.getLogger(TempsEmployee.class.getName()).log(Level.SEVERE, null, ex);
              System.out.println(ex.getMessage());
          }
        
    }
    
    public void vider(int idc){
    
          try {
              String query = "DELETE FROM ges_temps WHERE idcli="+idc;
              cnx = ConnexionBd.Connecter();
              st = cnx.createStatement();
              st.executeUpdate(query);
              
          } catch (SQLException ex) {
              Logger.getLogger(TempsEmployee.class.getName()).log(Level.SEVERE, null, ex);
          }
    }
    
    
    public ArrayList<GesTemps> getTable(int idCli){
         
         ArrayList<GesTemps> lst = new ArrayList<GesTemps>();
          try {
              
              String query = "SELECT * FROM ges_temps  WHERE idcli = "+idCli;
              
              cnx = ConnexionBd.Connecter();
              st = cnx.createStatement();
              res = st.executeQuery(query);
              GesTemps gs;
              
              while(res.next()){
                  
                  gs = new GesTemps(res.getInt(1),res.getInt(2),res.getString(3),res.getString(4),res.getString(5));
                  lst.add(gs);
                  
              }
               
          } catch (SQLException ex) {
              Logger.getLogger(TempsEmployee.class.getName()).log(Level.SEVERE, null, ex);
          }
          return lst;
    }
    
}
