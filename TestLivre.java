
public class TestLivre {
    public static void main(String[] args) {
        System.out.println("C'est le programme test");
        Livre l1 = new Livre("Joe Joejina", "Great Dumby"), l2 = new Livre("Grey Greyina", "Great Blinded");

        // Ne compile pas car l'attribut auteur est prive
        // System.out.println(l1.auteur);
        System.out.println(l2.getAuteur());

        // Definir le nbre de pages pour chaque livre et l'afficher
        l1.setNbPages(30);
        l2.setNbPages(40);
        System.out.println(l1.getNbPages());
        System.out.println(l2.getNbPages());

        // afficher le nombre total de des pages de deux livres
        System.out.println(l1.getNbPages() + l2.getNbPages());

        // Derniere question
        Livre Livre1 = new Livre(), Livre2 = new Livre("NomAuteur", "NomDeLivre"),
                Livre3 = new Livre("NomAuteur", "NomDeLivre", 300);
        Livre2.setNbPages(300);
        Livre1.setAuteur("NomAuteur");
        Livre1.setTitre("NomDeLivre");
        Livre1.setNbPages(300);

        System.out.println("Premier Livre " + Livre1);
        System.out.println("Deuxieme Livre " + Livre2);
        System.out.println("Troisieme Livre " + Livre3);

    }
}
