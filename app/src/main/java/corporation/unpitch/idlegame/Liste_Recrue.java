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
    static Recrue chefProjetJunior = new Recrue("Chef de Projet",25000,"Auguemente faiblement la vitesse de production des développeurs",1);
    static Recrue chefProjetExpert = new Recrue("Chef de Projet",25000,"Auguemente la vitesse de production des développeurs",1);
    static Recrue chefProjetSenior = new Recrue("Chef de Projet",25000,"Auguemente fortement la vitesse de production des développeurs",1);
    static Recrue comptableJunior = new Recrue("Comptable",25000,"Augmente légèrement la rentabilité des projets",1);
    static Recrue comptableExpert = new Recrue("Comptable",25000,"Augmente la rentabilité des projets",1);
    static Recrue comptableSenior = new Recrue("Comptable",25000,"Augmente énormément la rentabilité des projets",1);
    static Recrue adminReseauJunior = new Recrue("Admin. Réseau", 125000, "Mini réduction de la durée d'un piratage",1);
    static Recrue adminReseauExpert = new Recrue("Admin. Réseau", 125000, "Réduction de la durée d'un piratage",1);
    static Recrue adminReseauSenior = new Recrue("Admin. Réseau", 125000, "Réduit drastiquement la durée d'un piratage",1);
}
