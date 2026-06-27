public class Client {
    private String nom;
    private String entreprise;
    private String email;
    private String statut;
    

    public Client(String nom, String entreprise, String email, String statut) {
        this.nom = nom;
        this.entreprise = entreprise;
        this.email = email;
        this.statut = statut; 
    }

    //Getters
    public String getNom() {
        return nom;
    }

    public String getEntreprise() {
        return entreprise;
    }

    public String getEmail() {
        return email;
    }

    public String getStatut(){
        return statut;
    }

    
    @Override 
    public String toString() {
        return "Client{"+
                "Nom='" + nom + "', Entreprise='" + entreprise +  "', email='" + email + "', Statut='" + statut +"'}";
    }
}