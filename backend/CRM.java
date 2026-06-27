import java.util.ArrayList;

public class CRM {
    private ArrayList<Client> listeClients = new ArrayList<>();

    public void ajouterClient(Client nouveauClient) {
        this.listeClients.add(nouveauClient);
        System.out.println("Le Client " + nouveauClient.getNom() + " a ete ajoute avec succes.");
    }

    public void afficherClients() {
    for (int i = 0; i < this.listeClients.size(); i++) {
        Client c = this.listeClients.get(i); 
        System.out.println(c);
    }
}
}