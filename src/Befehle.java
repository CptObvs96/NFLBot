public class Befehle {

    String text, umbr;


    public String texter (int id) {
        umbr = "\n";

        System.out.println("Befehlklasse: " +id);
       switch (id) {
           case 1:
               text = "Herzlich Willkommen zum NFL Liveticker Bot" + umbr + umbr + "Um alle Befehle zu sehen schick mir den START Befehl";
           case 2:
               text = "Hier eine Übersicht über alle Befehle:" + umbr + umbr + "GAMEDAY  - Spieltagsübersicht" + umbr + "REDZONE  - Alle Spiele werden ____________ getickert" + umbr + "Spiel: 1 - 17- Jeweilige Partie wird  ____________ getickert" + umbr + "STOP/KILL - Spiel auswahl wurde ____________ gelöscht ";
           case 3:
               text = "Spiele wurden gelöscht";
           case 4:
               ;
           case 5:
               ;
           case 6:
               ;
           case 7:
               ;
           case 8:
               ;
           case 9:
               ;
           case 10:
               ;
           case 11:
               ;
           case 12:
               ;
           case 13:
               ;
           case 14:
               ;
           case 15:
               ;
           case 16:
               ;
           case 17:
               ;
           case 18:
               ;
           case 19:
               ;
           case 20:
               ;
           case 21:
               ;

       }

        System.out.println("Befehlklasse: " + text);
        return text;
    }

}

