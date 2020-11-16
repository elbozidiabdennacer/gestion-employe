
package Modeles;

public class etudiant {
    private static int id = 0 ;
     private String  nom;
      private String  prenom;
       private double salaire ;
        private String  sexe;
         private String  Email;
         
  
  public etudiant(int id,String nom,String prenom,double salaire,String sexe,String Email){
       
      this.id = id;
      this.nom = nom;
      this.prenom = prenom;
      this.salaire = salaire;
      this.sexe = sexe;
      this.Email = Email;
      
  }       
    
  public etudiant(){
    id++;
    
  }
  public int getId(){
   return id;
  }
 
  public String getNom(){
  return nom;
  }
  public String getPrenom(){
  return prenom;
  }
  public String getEmail(){
  return Email;
  }
  public String getSexe(){
  return sexe;
  }
  
public double getSalaire(){
  return salaire;
  }  
    
}
