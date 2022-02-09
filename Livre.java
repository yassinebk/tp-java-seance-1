
public class Livre {
    // Données membres
    private String titre, auteur;
    private int nbPages;

    // Constructeur 0-arguments
    public Livre() {

    }

    // Constructeur 2-arguments
    public Livre(String unAuteur, String unTitre) {
        auteur = unAuteur;
        titre = unTitre;
    }

    // Construct 3-arguments
    public Livre(String unAuteur, String unTitre, int nbPages) {
        auteur = unAuteur;
        titre = unTitre;
        this.nbPages = nbPages;
    }

    // Accesseur ou getteur

    public String getAuteur() {
        return auteur;
    }

    public int getNbPages() {
        return this.nbPages;
    }

    public String getTitre() {
        return this.titre;
    }

    // Modificateur ou setteur
    public void setNbPages(int newValue) {
        if (newValue < 0)
            System.out.println("Le nombre de page doit etre positif");
        else
            this.nbPages = newValue;
    }

    public void setAuteur(String newValue) {
        this.auteur = newValue;
    }

    public void setTitre(String newValue) {
        this.titre = newValue;
    }

    // Affiche toi
    public void afficheToi() {
        System.out
                .println("Auteur:  " + this.auteur + "  Livre:  " + this.titre + "  nombre des pages  " + this.nbPages);
    }

    // toString
    public String toString() {
        return "Auteur:  " + this.auteur + "  Livre:  " + this.titre + "  nombre des pages  " + this.nbPages;
    }

    public static void main(String[] args) {
        Livre l1 = new Livre("Joe Joejina", "Great Dumby"), l2 = new Livre("Grey Greyina", "Great Blinded");

        // Ne compile pas car l'attribut auteur est prive
        // System.out.println(l1.auteur);
        System.out.println(l1.getAuteur());

        // Definir le nbre de pages pour chaque livre et l'afficher
        l1.setNbPages(30);
        l2.setNbPages(40);
        System.out.println(l1.getNbPages());
        System.out.println(l2.getNbPages());

        // afficher le nombre total de des pages de deux livres
        System.out.println(l1.getNbPages() + l2.getNbPages());

        // utiliser affiche toi
        l1.afficheToi();
        l2.afficheToi();

        // system.out.println(livre) - avant de definir to string
        System.out.println(l1);
        // tpjava.Livre@1c72da34 - package.class.addressHashcode

        // apres definir toString
        System.out.println(l1);
        // System.out.println(l1.toString()) <- elle fait appel au Object.toString()
    }
}