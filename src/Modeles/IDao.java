
package Modeles;

import java.util.ArrayList;
import java.sql.*;

public interface IDao {
    
    
    public void ajouter(int id,String nom,String prenom,double salaire,String sexe,String Email,String pathimg);
    public void modifier(int ids,String unom,String uprenom,double usalaire,String usexe,String uemail,String pathimg);
    public void supprimer(int id);
    public ArrayList rechercher(String nom);
    
}
