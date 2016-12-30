package corporation.unpitch.idlegame;

/**
 * Created by Un Pitch on 30/12/2016.
 */

public class Liste_Projets {

    public void facile1(){
        Projet facile1 = new Projet();
        facile1.setprojectId("facile1");
        facile1.setBranche("Jeux videos");
        facile1.setDescription("Réalisation d'un petit jeu de rôle où une princesse doit aller délivrer un chevalier enfermé dans un donjon .Le joueur devra réaliser quelques quêtes avant d'atteindre son but.");
        facile1.setDifficulte("Facile");
        facile1.setGainfinal("200$");
        facile1.setMethode_gain_final("OS");
        facile1.setNom("RPG1");
        facile1.setObjectif("400 lignes");
        facile1.setProjet_suivant("Petit FPS");
        facile1.setProjetSuivantID("facile2");
    }
    public void moyen1(){
        Projet moyen1 = new Projet();
        moyen1.setprojectId("moyen1");
        moyen1.setBranche("Jeux videos");
        moyen1.setDescription("Réalisez le très célèbre jeux démineur");
        moyen1.setDifficulte("Moyen");
        moyen1.setGainfinal("350$");
        moyen1.setMethode_gain_final("OS");
        moyen1.setNom("Démineur");
        moyen1.setObjectif("1000 lignes");
        moyen1.setProjet_suivant("Corridor");
        moyen1.setProjetSuivantID("moyen2");
    }
    public void difficile1(){
        Projet difficile1 = new Projet();
        difficile1.setprojectId("difficile1");
        difficile1.setBranche("Gestion");
        difficile1.setDescription("Réalisez une base de données permettant à notre client de gérer son stock d'aquarium et de poissons mutants tirant des lasers par les branchies.");
        difficile1.setDifficulte("Difficile");
        difficile1.setGainfinal("500$");
        difficile1.setMethode_gain_final("OS");
        difficile1.setNom("Gestion aquarium");
        difficile1.setObjectif("3000 lignes");
        difficile1.setProjet_suivant("Gestion mairie");
        difficile1.setProjetSuivantID("difficile2");
    }
}
