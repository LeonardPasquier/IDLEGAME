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
        JeuVideo1.setGainfinal(250);
        JeuVideo1.setMethode_gain_final("OS");
        JeuVideo1.setNom("Wyrm Quest");
        JeuVideo1.setObjectif(750);
        JeuVideo1.setProjet_suivant("New Hyper Juan Bros");
        JeuVideo1.setProjetSuivantID("JeuVideo2");
        return JeuVideo1;
    }

    static Projet JeuVideo2(){
        Projet JeuVideo2 = new Projet();
        JeuVideo2.setprojectId("JeuVideo2");
        JeuVideo2.setBranche("Jeux videos");
        JeuVideo2.setDescription("Réalisation d'un petit jeu de plateforme, un maçon italien et barbu se baladant à travers différents mondes pour secourir une princesse.");
        JeuVideo2.setGainfinal(550);
        JeuVideo2.setMethode_gain_final("OS");
        JeuVideo2.setNom("New Hyper Juan Bros");
        JeuVideo2.setObjectif(1500);
        JeuVideo2.setProjet_suivant("Call of Global");
        JeuVideo2.setProjetSuivantID("JeuVideo3");
        return JeuVideo2;
    }

    static Projet JeuVideo3(){
        Projet JeuVideo3 = new Projet();
        JeuVideo3.setprojectId("JeuVideo3");
        JeuVideo3.setBranche("Jeux videos");
        JeuVideo3.setDescription("Réalisation d'un FPS, un jeu de guerre multijoueur joué par équipe de cinq contre cinq.");
        JeuVideo3.setGainfinal(1200);
        JeuVideo3.setMethode_gain_final("OS");
        JeuVideo3.setNom("Call of Global");
        JeuVideo3.setObjectif(5000);
        JeuVideo3.setProjet_suivant("Pro Football Amelioration");
        JeuVideo3.setProjetSuivantID("JeuVideo4");
        return JeuVideo3;
    }

    static Projet JeuVideo4(){
        Projet JeuVideo4 = new Projet();
        JeuVideo4.setprojectId("JeuVideo4");
        JeuVideo4.setBranche("Jeux videos");
        JeuVideo4.setDescription("Réalisation d'un jeu de foot, jouable en solo et en multijoueur, regroupant les équipes du monde entier.");
        JeuVideo4.setGainfinal(1750);
        JeuVideo4.setMethode_gain_final("OS");
        JeuVideo4.setNom("Pro Football Amelioration");
        JeuVideo4.setObjectif(8500);
        JeuVideo4.setProjet_suivant("World of Legends");
        JeuVideo4.setProjetSuivantID("JeuVideo5");
        return JeuVideo4;
    }

    static Projet JeuVideo5(){
        Projet JeuVideo5 = new Projet();
        JeuVideo5.setprojectId("JeuVideo5");
        JeuVideo5.setBranche("Jeux videos");
        JeuVideo5.setDescription("Réalisation d'un jeu d'arène multijoueur qui relit deux univers bien connus.");
        JeuVideo5.setGainfinal(2300);
        JeuVideo5.setMethode_gain_final("OS");
        JeuVideo5.setNom("World of Legends");
        JeuVideo5.setObjectif(12000);
        JeuVideo5.setProjet_suivant("The Stat-Hamburger");
        JeuVideo5.setProjetSuivantID("JeuVideo6");
        return JeuVideo5;
    }
    static Projet JeuVideo6(){
        Projet JeuVideo6 = new Projet();
        JeuVideo6.setprojectId("JeuVideo6");
        JeuVideo6.setBranche("Jeux videos");
        JeuVideo6.setDescription("Réalisation d'un jeu de cuisine où vous Stathamez les hamburgers.");
        JeuVideo6.setGainfinal(3000);
        JeuVideo6.setMethode_gain_final("OS");
        JeuVideo6.setNom("The Stat-Hamburger");
        JeuVideo6.setObjectif(18000);
        JeuVideo6.setProjet_suivant("The First of Us");
        JeuVideo6.setProjetSuivantID("JeuVideo7");
        return JeuVideo6;
    }
    static Projet JeuVideo7(){
        Projet JeuVideo7 = new Projet();
        JeuVideo7.setprojectId("JeuVideo7");
        JeuVideo7.setBranche("Jeux videos");
        JeuVideo7.setDescription("Réalisation d'un jeu d'aventure où vous incarnez une vieille dans un monde pré-apocalyptique.");
        JeuVideo7.setGainfinal(3400);
        JeuVideo7.setMethode_gain_final("OS");
        JeuVideo7.setNom("The First of Us");
        JeuVideo7.setObjectif(23000);
        JeuVideo7.setProjet_suivant("ChickenMon");
        JeuVideo7.setProjetSuivantID("JeuVideo8");
        return JeuVideo7;
    }
    static Projet JeuVideo8(){
        Projet JeuVideo8 = new Projet();
        JeuVideo8.setprojectId("JeuVideo8");
        JeuVideo8.setBranche("Jeux videos");
        JeuVideo8.setDescription("Réalisation d'un jeu à la recherche de Chicken afin de vaincre les maîtres d'arènes. Gotta catch them'all!");
        JeuVideo8.setGainfinal(3750);
        JeuVideo8.setMethode_gain_final("OS");
        JeuVideo8.setNom("ChickenMon");
        JeuVideo8.setObjectif(27000);
        JeuVideo8.setProjet_suivant("Petit F Toto");
        JeuVideo8.setProjetSuivantID("JeuVideo9");
        return JeuVideo8;
    }
    static Projet JeuVideo9(){
        Projet JeuVideo9 = new Projet();
        JeuVideo9.setprojectId("JeuVideo9");
        JeuVideo9.setBranche("Jeux videos");
        JeuVideo9.setDescription("Réalisation d'un jeu OpenWorld intedit aux moins de 18 ans. Vraiment.");
        JeuVideo9.setGainfinal(4000);
        JeuVideo9.setMethode_gain_final("OS");
        JeuVideo9.setNom("Petit F Toto");
        JeuVideo9.setObjectif(30000);
        JeuVideo9.setProjet_suivant("Le jeu Ultime");
        JeuVideo9.setProjetSuivantID("JeuVideo10");
        return JeuVideo9;
    }
    static Projet JeuVideo10(){
        Projet JeuVideo10 = new Projet();
        JeuVideo10.setprojectId("JeuVideo10");
        JeuVideo10.setBranche("Jeux videos");
        JeuVideo10.setDescription("Réalisation d'un jeu à incrémentation automatique, qui plaît au monde entier.");
        JeuVideo10.setGainfinal(4500);
        JeuVideo10.setMethode_gain_final("OS");
        JeuVideo10.setNom("IdleGame");
        JeuVideo10.setObjectif(42666);
        JeuVideo10.setProjet_suivant("Le jeu Ultime");
        JeuVideo10.setProjetSuivantID("JeuVideo10");
        return JeuVideo10;
    }
    static Projet SiteWeb1(){
        Projet SiteWeb1 = new Projet();
        SiteWeb1.setprojectId("SiteWeb1");
        SiteWeb1.setBranche("Sites Web");
        SiteWeb1.setDescription("Réalisation d'un site regroupant des cours et tutos sur l'informatique en général.");
        SiteWeb1.setGainfinal(250);
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
        SiteWeb2.setDescription("Réalisation d'un site de téléchargement légal de films, series et musiques.");
        SiteWeb2.setGainfinal(550);
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
        SiteWeb3.setDescription("Réalisation d'un site regroupant toute sorte de données enregistrées par des utilisateurs, qui peuvent être consultées");
        SiteWeb3.setGainfinal(1200);
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
        SiteWeb4.setGainfinal(1750);
        SiteWeb4.setMethode_gain_final("OS");
        SiteWeb4.setNom("Onzzer");
        SiteWeb4.setObjectif(8500);
        SiteWeb4.setProjet_suivant("Luffy Garot");
        SiteWeb4.setProjetSuivantID("SiteWeb5");
        return SiteWeb4;
    }

    static Projet SiteWeb5(){
        Projet SiteWeb5 = new Projet();
        SiteWeb5.setprojectId("SiteWeb5");
        SiteWeb5.setBranche("Sites Web");
        SiteWeb5.setDescription("Réalisation d'un site d'information, un petit journal du quotidien");
        SiteWeb5.setGainfinal(2300);
        SiteWeb5.setMethode_gain_final("OS");
        SiteWeb5.setNom("Luffy Garot");
        SiteWeb5.setObjectif(12000);
        SiteWeb5.setProjet_suivant("SportBête");
        SiteWeb5.setProjetSuivantID("SiteWeb6");
        return SiteWeb5;
    }
    static Projet SiteWeb6(){
        Projet SiteWeb6 = new Projet();
        SiteWeb6.setprojectId("SiteWeb6");
        SiteWeb6.setBranche("Sites Web");
        SiteWeb6.setDescription("Réalisation d'un site de paris sportifs en ligne");
        SiteWeb6.setGainfinal(3000);
        SiteWeb6.setMethode_gain_final("OS");
        SiteWeb6.setNom("SportBete");
        SiteWeb6.setObjectif(18000);
        SiteWeb6.setProjet_suivant("Salut c'est Julien");
        SiteWeb6.setProjetSuivantID("SiteWeb7");
        return SiteWeb6;
    }
    static Projet SiteWeb7(){
        Projet SiteWeb7 = new Projet();
        SiteWeb7.setprojectId("SiteWeb7");
        SiteWeb7.setBranche("Sites Web");
        SiteWeb7.setDescription("Réalisation d'un forum et d'un site de tutos en lignes");
        SiteWeb7.setGainfinal(3400);
        SiteWeb7.setMethode_gain_final("OS");
        SiteWeb7.setNom("Salut c'est Julien");
        SiteWeb7.setObjectif(23000);
        SiteWeb7.setProjet_suivant("Koi de 9 Docteur?");
        SiteWeb7.setProjetSuivantID("SiteWeb8");
        return SiteWeb7;
    }
    static Projet SiteWeb8(){
        Projet SiteWeb8 = new Projet();
        SiteWeb8.setprojectId("SiteWeb8");
        SiteWeb8.setBranche("Sites Web");
        SiteWeb8.setDescription("Réalisation d'un site de médecine en ligne");
        SiteWeb8.setGainfinal(3750);
        SiteWeb8.setMethode_gain_final("OS");
        SiteWeb8.setNom("Koi de 9 Docteur");
        SiteWeb8.setObjectif(27000);
        SiteWeb8.setProjet_suivant("Vous allez rêver");
        SiteWeb8.setProjetSuivantID("SiteWeb9");
        return SiteWeb8;
    }
    static Projet SiteWeb9(){
        Projet SiteWeb9 = new Projet();
        SiteWeb9.setprojectId("SiteWeb9");
        SiteWeb9.setBranche("Sites Web");
        SiteWeb9.setDescription("Réalisation d'un site de rêve.");
        SiteWeb9.setGainfinal(4500);
        SiteWeb9.setMethode_gain_final("OS");
        SiteWeb9.setNom("L'Inception");
        SiteWeb9.setObjectif(42666);
        SiteWeb9.setProjet_suivant("Vous allez rêver");
        SiteWeb9.setProjetSuivantID("SiteWeb9");
        return SiteWeb9;
    }

    static Projet Logiciel1(){
        Projet Logiciel1 = new Projet();
        Logiciel1.setprojectId("Logiciel1");
        Logiciel1.setBranche("Logiciel");
        Logiciel1.setDescription("Réalisez un éditeur de texte révolutionnaire.");
        Logiciel1.setGainfinal(250);
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
        Logiciel2.setDescription("Réalisez un outil de conception orientée objet.");
        Logiciel2.setGainfinal(550);
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
        Logiciel3.setDescription("Réalisez un outil qui fait à la fois éditeur de texte et prise de note.");
        Logiciel3.setGainfinal(1200);
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
        Logiciel4.setDescription("Réalisez un navigateur internet encore jamais vu, aussi rapide que le vent.");
        Logiciel4.setGainfinal(1750);
        Logiciel4.setMethode_gain_final("OS");
        Logiciel4.setNom("WindWolf");
        Logiciel4.setObjectif(8500);
        Logiciel4.setProjet_suivant("Skypea");
        Logiciel4.setProjetSuivantID("Logiciel5");
        return Logiciel4;
    }

    static Projet Logiciel5(){
        Projet Logiciel5 = new Projet();
        Logiciel5.setprojectId("Logiciel5");
        Logiciel5.setBranche("Logiciel");
        Logiciel5.setDescription("Réalisez un logiciel de télé-conférence.");
        Logiciel5.setGainfinal(2300);
        Logiciel5.setMethode_gain_final("OS");
        Logiciel5.setNom("Skypea");
        Logiciel5.setObjectif(12000);
        Logiciel5.setProjet_suivant("VasYCherche");
        Logiciel5.setProjetSuivantID("Logiciel6");
        return Logiciel5;
    }
    static Projet Logiciel6(){
        Projet Logiciel6 = new Projet();
        Logiciel6.setprojectId("Logiciel6");
        Logiciel6.setBranche("Logiciel");
        Logiciel6.setDescription("Réalisez un moteur de recherche.");
        Logiciel6.setGainfinal(3000);
        Logiciel6.setMethode_gain_final("OS");
        Logiciel6.setNom("VasYCherche");
        Logiciel6.setObjectif(18000);
        Logiciel6.setProjet_suivant("YouveGotMail");
        Logiciel6.setProjetSuivantID("Logiciel7");
        return Logiciel6;
    }
    static Projet Logiciel7(){
        Projet Logiciel7 = new Projet();
        Logiciel7.setprojectId("Logiciel6");
        Logiciel7.setBranche("Logiciel");
        Logiciel7.setDescription("Réalisez un moteur de recherche.");
        Logiciel7.setGainfinal(3400);
        Logiciel7.setMethode_gain_final("OS");
        Logiciel7.setNom("YouveGotMail");
        Logiciel7.setObjectif(23000);
        Logiciel7.setProjet_suivant("KFSAT MobTrack");
        Logiciel7.setProjetSuivantID("Logiciel8");
        return Logiciel7;
    }
    static Projet Logiciel8(){
        Projet Logiciel8 = new Projet();
        Logiciel8.setprojectId("Logiciel8");
        Logiciel8.setBranche("Logiciel");
        Logiciel8.setDescription("Réalisez une application mobile de tracking GPS.");
        Logiciel8.setGainfinal(3750);
        Logiciel8.setMethode_gain_final("OS");
        Logiciel8.setNom("KFSAT MobTrack");
        Logiciel8.setObjectif(27000);
        Logiciel8.setProjet_suivant("MyTunes");
        Logiciel8.setProjetSuivantID("Logiciel9");
        return Logiciel8;
    }
    static Projet Logiciel9(){
        Projet Logiciel9 = new Projet();
        Logiciel9.setprojectId("Logiciel9");
        Logiciel9.setBranche("Logiciel");
        Logiciel9.setDescription("Réalisez un gestionnaire de comptes bancaires.");
        Logiciel9.setGainfinal(4000);
        Logiciel9.setMethode_gain_final("OS");
        Logiciel9.setNom("MyTunes");
        Logiciel9.setObjectif(30000);
        Logiciel9.setProjet_suivant("Le réveil");
        Logiciel9.setProjetSuivantID("Logiciel10");
        return Logiciel9;
    }
    static Projet Logiciel10(){
        Projet Logiciel10 = new Projet();
        Logiciel10.setprojectId("Logiciel9");
        Logiciel10.setBranche("Logiciel");
        Logiciel10.setDescription("Réalisez d'un logiciel qui emballe le chocolat.");
        Logiciel10.setGainfinal(4500);
        Logiciel10.setMethode_gain_final("OS");
        Logiciel10.setNom("Le jour de la Marmotte");
        Logiciel10.setObjectif(42666);
        Logiciel10.setProjet_suivant("Le réveil");
        Logiciel10.setProjetSuivantID("Logiciel10");
        return Logiciel10;
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    static Projet getProjet(String nom) {
        if (Objects.equals(nom, "Wyrm Quest")) {
            return JeuVideo1();
        }
        if (Objects.equals(nom, "New Hyper Juan Bros")) {
            return JeuVideo2();
        }
        if (Objects.equals(nom, "Call of Global")) {
            return JeuVideo3();
        }
        if (Objects.equals(nom, "Pro Football Amelioration")) {
            return JeuVideo4();
        }
        if (Objects.equals(nom, "World of Legends")) {
            return JeuVideo5();
        }
        if (Objects.equals(nom, "The Stat-Hamburger")) {
            return JeuVideo6();
        }
        if (Objects.equals(nom, "The First of Us")) {
            return JeuVideo7();
        }
        if (Objects.equals(nom, "ChickenMon")) {
            return JeuVideo8();
        }
        if (Objects.equals(nom, "IdleGame")) {
            return JeuVideo9();
        }
        if (Objects.equals(nom, "World of Legends")) {
            return JeuVideo10();
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
        if (Objects.equals(nom, "Luffy Garot")) {
            return SiteWeb5();
        }
        if (Objects.equals(nom, "SportBête")) {
            return SiteWeb6();
        }
        if (Objects.equals(nom, "Salut c'est Julien")) {
            return SiteWeb7();
        }
        if (Objects.equals(nom, "Koi de 9 Docteur?")) {
            return SiteWeb8();
        }
        if (Objects.equals(nom, "L'Inception")) {
            return SiteWeb9();
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
        if (Objects.equals(nom, "Skypea")) {
            return Logiciel5();
        }
        if (Objects.equals(nom, "VasYCherche")) {
            return Logiciel6();
        }
        if (Objects.equals(nom, "YouvegotMail")) {
            return Logiciel7();
        }
        if (Objects.equals(nom, "KFSAT MobTrack")) {
            return Logiciel8();
        }
        if (Objects.equals(nom, "MyTunes")) {
            return Logiciel9();
        }
        if (Objects.equals(nom, "Le Jour de la Marmotte")) {
            return Logiciel10();
        }
        else{
            return JeuVideo10();
        }
    }
}
