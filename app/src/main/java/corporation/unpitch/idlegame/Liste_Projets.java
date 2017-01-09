package corporation.unpitch.idlegame;

import android.os.Build;
import android.support.annotation.RequiresApi;

import java.util.Objects;

/**
 * Created by Un Pitch on 30/12/2016.
 */

public class Liste_Projets {

    static Projet JeuVideo1(){
        Projet JeuVideo1 = new Projet();
        JeuVideo1.setprojectId("JeuVideo1");
        JeuVideo1.setBranche("Jeux videos");
        JeuVideo1.setDescription("Réalisation d'un petit jeu de rôle dans un monde fantastique envahit par des monstres.");
        JeuVideo1.setGainfinal("250$");
        JeuVideo1.setMethode_gain_final("OS");
        JeuVideo1.setNom("Wyrm Quest");
        JeuVideo1.setObjectif(750);
        JeuVideo1.setProjet_suivant("Juan platforming");
        JeuVideo1.setProjetSuivantID("JeuVideo2");
        return JeuVideo1;
    }

    static Projet JeuVideo2(){
        Projet JeuVideo2 = new Projet();
        JeuVideo2.setprojectId("JeuVideo2");
        JeuVideo2.setBranche("Jeux videos");
        JeuVideo2.setDescription("Réalisation d'un petit jeu de plateforme, un maçon italien et barbu se baladant à travers différents mondes pour secourir une princesse.");
        JeuVideo2.setGainfinal("550$");
        JeuVideo2.setMethode_gain_final("OS");
        JeuVideo2.setNom("Juan platforming");
        JeuVideo2.setObjectif(1500);
        JeuVideo2.setProjet_suivant("Call of Global");
        JeuVideo2.setProjetSuivantID("JeuVideo3");
        return JeuVideo2;
    }

    static Projet JeuVideo3(){
        Projet JeuVideo3 = new Projet();
        JeuVideo3.setprojectId("JeuVideo3");
        JeuVideo3.setBranche("Jeux videos");
        JeuVideo3.setDescription("Réalisation d'un FPS (First Person Shooter), un jeu de guerre multijoueur joué par équipe de cinq contre cinq.");
        JeuVideo3.setGainfinal("1200$");
        JeuVideo3.setMethode_gain_final("OS");
        JeuVideo3.setNom("Call of Global");
        JeuVideo3.setObjectif(5000);
        JeuVideo3.setProjet_suivant("Pro football amelioration");
        JeuVideo3.setProjetSuivantID("JeuVideo4");
        return JeuVideo3;
    }

    static Projet JeuVideo4(){
        Projet JeuVideo4 = new Projet();
        JeuVideo4.setprojectId("JeuVideo4");
        JeuVideo4.setBranche("Jeux videos");
        JeuVideo4.setDescription("Réalisation d'un jeu de foot,jouable en solo et en multijoueur, regroupant les équipes du monde entier.");
        JeuVideo4.setGainfinal("1750$");
        JeuVideo4.setMethode_gain_final("OS");
        JeuVideo4.setNom("Pro football amelioration");
        JeuVideo4.setObjectif(8500);
        JeuVideo4.setProjet_suivant("World of Legends");
        JeuVideo4.setProjetSuivantID("JeuVideo5");
        return JeuVideo4;
    }

    static Projet JeuVideo5(){
        Projet JeuVideo5 = new Projet();
        JeuVideo5.setprojectId("JeuVideo5");
        JeuVideo5.setBranche("Jeux videos");
        JeuVideo5.setDescription("Réalisation d'un MOBA (Multiplayer Online Battle Arena), il relit deux univers bien connu.");
        JeuVideo5.setGainfinal("2300$");
        JeuVideo5.setMethode_gain_final("OS");
        JeuVideo5.setNom("World of Legends");
        JeuVideo5.setObjectif(12000);
        JeuVideo5.setProjet_suivant("");
        JeuVideo5.setProjetSuivantID("");
        return JeuVideo5;
    }
    static Projet SiteWeb1(){
        Projet SiteWeb1 = new Projet();
        SiteWeb1.setprojectId("SiteWeb1");
        SiteWeb1.setBranche("Sites Web");
        SiteWeb1.setDescription("Réalisation d'un site regroupant des cours et tutos sur l'informatique en général");
        SiteWeb1.setGainfinal("250$");
        SiteWeb1.setMethode_gain_final("OS");
        SiteWeb1.setNom("Le site du 1");
        SiteWeb1.setObjectif(750);
        SiteWeb1.setProjet_suivant("UltraUpload");
        SiteWeb1.setProjetSuivantID("SiteWeb2");
        return SiteWeb1;
    }

    static Projet SiteWeb2(){
        Projet SiteWeb2 = new Projet();
        SiteWeb2.setprojectId("SiteWeb2");
        SiteWeb2.setBranche("Sites Web");
        SiteWeb2.setDescription("Réalisation d'un site de téléchargement (légale) de films, series ou musiques.");
        SiteWeb2.setGainfinal("550$");
        SiteWeb2.setMethode_gain_final("OS");
        SiteWeb2.setNom("UltraUpload");
        SiteWeb2.setObjectif(1500);
        SiteWeb2.setProjet_suivant("6Fun");
        SiteWeb2.setProjetSuivantID("SiteWeb3");
        return SiteWeb2;
    }

    static Projet SiteWeb3(){
        Projet SiteWeb3 = new Projet();
        SiteWeb3.setprojectId("SiteWeb3");
        SiteWeb3.setBranche("Sites Web");
        SiteWeb3.setDescription("Réalisation d'un site regroupant toute sorte de données enregistrées par des utilisateurs, qui peuvent être conculter");
        SiteWeb3.setGainfinal("1200$");
        SiteWeb3.setMethode_gain_final("OS");
        SiteWeb3.setNom("6Fun");
        SiteWeb3.setObjectif(5000);
        SiteWeb3.setProjet_suivant("Onzzer");
        SiteWeb3.setProjetSuivantID("SiteWeb4");
        return SiteWeb3;
    }

    static Projet SiteWeb4(){
        Projet SiteWeb4 = new Projet();
        SiteWeb4.setprojectId("SiteWeb4");
        SiteWeb4.setBranche("Sites Web");
        SiteWeb4.setDescription("Réalisation d'un site d'écoute et de partage de musique en ligne");
        SiteWeb4.setGainfinal("1750$");
        SiteWeb4.setMethode_gain_final("OS");
        SiteWeb4.setNom("Onzzer");
        SiteWeb4.setObjectif(8500);
        SiteWeb4.setProjet_suivant("luffy garot");
        SiteWeb4.setProjetSuivantID("SiteWeb5");
        return SiteWeb4;
    }

    static Projet SiteWeb5(){
        Projet SiteWeb5 = new Projet();
        SiteWeb5.setprojectId("SiteWeb5");
        SiteWeb5.setBranche("Sites Web");
        SiteWeb5.setDescription("Réalisation d'un site d'information, un petit journal du quotidien");
        SiteWeb5.setGainfinal("2300$");
        SiteWeb5.setMethode_gain_final("OS");
        SiteWeb5.setNom("luffy garot");
        SiteWeb5.setObjectif(12000);
        SiteWeb5.setProjet_suivant("");
        SiteWeb5.setProjetSuivantID("");
        return SiteWeb5;
    }

    static Projet Logiciel1(){
        Projet Logiciel1 = new Projet();
        Logiciel1.setprojectId("Logiciel1");
        Logiciel1.setBranche("Logiciel");
        Logiciel1.setDescription("Réalisez un éditeur de texte revolutionnaire.");
        Logiciel1.setGainfinal("250$");
        Logiciel1.setMethode_gain_final("OS");
        Logiciel1.setNom("Letter Office");
        Logiciel1.setObjectif(750);
        Logiciel1.setProjet_suivant("GalaxyUML");
        Logiciel1.setProjetSuivantID("Logiciel2");
        return Logiciel1;
    }

    static Projet Logiciel2(){
        Projet Logiciel2 = new Projet();
        Logiciel2.setprojectId("Logiciel2");
        Logiciel2.setBranche("Logiciel");
        Logiciel2.setDescription("Réalisez un outil de conception de conception orientée objet.");
        Logiciel2.setGainfinal("550$");
        Logiciel2.setMethode_gain_final("OS");
        Logiciel2.setNom("GalaxyUML");
        Logiciel2.setObjectif(1500);
        Logiciel2.setProjet_suivant("Post it --");
        Logiciel2.setProjetSuivantID("Logiciel3");
        return Logiciel2;
    }

    static Projet Logiciel3(){
        Projet Logiciel3 = new Projet();
        Logiciel3.setprojectId("Logiciel3");
        Logiciel3.setBranche("Logiciel");
        Logiciel3.setDescription("Réalisez un outil qui fait à la fois éditeur de texte et prise de note");
        Logiciel3.setGainfinal("1200$");
        Logiciel3.setMethode_gain_final("OS");
        Logiciel3.setNom("Post it --");
        Logiciel3.setObjectif(5000);
        Logiciel3.setProjet_suivant("WindWolf");
        Logiciel3.setProjetSuivantID("Logiciel4");
        return Logiciel3;
    }

    static Projet Logiciel4(){
        Projet Logiciel4 = new Projet();
        Logiciel4.setprojectId("Logiciel4");
        Logiciel4.setBranche("Logiciel");
        Logiciel4.setDescription("Réalisez un navigateur internet encore jamais vu");
        Logiciel4.setGainfinal("1750$");
        Logiciel4.setMethode_gain_final("OS");
        Logiciel4.setNom("WindWolf");
        Logiciel4.setObjectif(8500);
        Logiciel4.setProjet_suivant("Skypiea");
        Logiciel4.setProjetSuivantID("Logiciel5");
        return Logiciel4;
    }

    static Projet Logiciel5(){
        Projet Logiciel5 = new Projet();
        Logiciel5.setprojectId("Logiciel5");
        Logiciel5.setBranche("Logiciel");
        Logiciel5.setDescription("Réalisez un logiciel de télé-conférence");
        Logiciel5.setGainfinal("2300$");
        Logiciel5.setMethode_gain_final("OS");
        Logiciel5.setNom("Skypiea");
        Logiciel5.setObjectif(12000);
        Logiciel5.setProjet_suivant("");
        Logiciel5.setProjetSuivantID("");
        return Logiciel5;
    }



    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    static Projet getProjet(String nom) {
        if (Objects.equals(nom, "Wyrm Quest")) {
            return JeuVideo1();
        }
        if (Objects.equals(nom, "Juan platforming")) {
            return JeuVideo2();
        }
        if (Objects.equals(nom, "Call of Global")) {
            return JeuVideo3();
        }
        if (Objects.equals(nom, "Pro football amelioration")) {
            return JeuVideo4();
        }
        if (Objects.equals(nom, "World of Legends")) {
            return JeuVideo5();
        }
        if (Objects.equals(nom, "Le site du 1")) {
            return SiteWeb1();
        }
        if (Objects.equals(nom, "UltraUpload")) {
            return SiteWeb2();
        }
        if (Objects.equals(nom, "6Fun")) {
            return SiteWeb3();
        }
        if (Objects.equals(nom, "Onzzer")) {
            return SiteWeb4();
        }
        if (Objects.equals(nom, "luffy garot")) {
            return SiteWeb5();
        }
        if (Objects.equals(nom, "Letter Office")) {
            return Logiciel1();
        }
        if (Objects.equals(nom, "GalaxyUML")) {
            return Logiciel2();
        }
        if (Objects.equals(nom, "Post it --")) {
            return Logiciel3();
        }
        if (Objects.equals(nom, "WindWolf")) {
            return Logiciel4();
        }
        if (Objects.equals(nom, "Skypiea")) {
            return Logiciel5();
        }
        else{
            return JeuVideo5();
        }
    }
}
