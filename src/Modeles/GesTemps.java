
package Modeles;

public class GesTemps {
    
    private int id;

    private int idCli;
    private String tempsEntry;
    private String tempsSortie;
    private String date;

    public GesTemps(int id,int idCli, String tempsEntry, String tempsSortie,String date) {
        this.id = id;
        this.idCli = idCli;
        this.tempsEntry = tempsEntry;
        this.tempsSortie = tempsSortie;
        this.date = date;
        
    }
    
     public GesTemps(int idCli, String tempsEntry, String tempsSortie,String date) {
       
        this.idCli = idCli;
        this.tempsEntry = tempsEntry;
        this.tempsSortie = tempsSortie;
        this.date = date;
        
    }

    public GesTemps() {
    }

    
    public int getId() {
        return id;
    }

    
    public int getIdCli() {
        return idCli;
    }

    public String getTempsEntry() {
        return tempsEntry;
    }

    public String getTempsSortie() {
        return tempsSortie;
    }

    public String getDate() {
        return date;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public void setIdCli(int idCli) {
        this.idCli = idCli;
    }

    public void setTempsEntry(String tempsEntry) {
        this.tempsEntry = tempsEntry;
    }

    public void setTempsSortie(String tempsSortie) {
        this.tempsSortie = tempsSortie;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    
    
    
    
}
