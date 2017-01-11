package corporation.unpitch.idlegame;

/**
 * Created by Maxime on 04/01/2017.
 *
 * Possède la liste des différentes recrues.
 */

public class Liste_Recrue {

    static Recrue developpeurJunior = new Recrue("Développeur Junior",500,"Produit 1 ligne de code par seconde",1);
    static Recrue developpeurExpert = new Recrue("Développeur Expert",4500,"Produit 10 lignes de code par seconde",10);
    static Recrue developpeurSenior = new Recrue("Développeur Senior",20000,"Produit 50 lignes de code par seconde",50);
    static Recrue chefProjet = new Recrue("Chef de Projet",25000,"Optimise les lignes de code produites par les développeurs : Auguemente fortement la vitesse de production",1);
    static Recrue comptable = new Recrue("Comptable",25000,"Augmente la rentabilité des projets",1);
    static Recrue adminReseau = new Recrue("Admin. Réseau", 125000, "Réduit la durée d'un piratage",1);
}
