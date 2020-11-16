
package Modeles;

public class GesSalaire {
   
    private int id;
    private int idCli;
    private double salaire;
    private double paiement;
    private double reste;
    private String dateModif;

    public GesSalaire(int idCli, double salaire, double paiement, double reste, String dateModif) {
        this.idCli = idCli;
        this.salaire = salaire;
        this.paiement = paiement;
        this.reste = reste;
        this.dateModif = dateModif;
        
    }
    
     public GesSalaire(int id,int idCli, double salaire, double paiement, double reste, String dateModif) {
        this.id = id; 
        this.idCli = idCli;
        this.salaire = salaire;
        this.paiement = paiement;
        this.reste = reste;
        this.dateModif = dateModif;
        
    }

    public GesSalaire() {
    }
    
    

    public void setIdCli(int idCli) {
        this.idCli = idCli;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public void setPaiement(double paiement) {
        this.paiement = paiement;
    }

    public void setReste(double reste) {
        this.reste = reste;
    }

    public void setDateModif(String dateModif) {
        this.dateModif = dateModif;
    }
    
    public int getIdCli() {
        return idCli;
    }

    public double getSalaire() {
        return salaire;
    }

    public double getPaiement() {
        return paiement;
    }

    public double getReste() {
        return reste;
    }

    public String getDateModif() {
        return dateModif;
    }
    
          
    
}
