public class Befehle {

    String text, umbr;


    public String texter (int id) {
        umbr = "\n"; int comID;

        comID = id;
        switch (comID) {
           case 1: //Hallo
               text = "Herzlich Willkommen zum NFL Liveticker Bot" + umbr + umbr + "Um alle Befehle zu sehen schick mir den START Befehl";  break;
           case 2: //Start
               text = "Hier eine Übersicht über alle Befehle:" + umbr + umbr + "GAMEDAY  - Spieltagsübersicht" +
                       umbr + "REDZONE  - Alle Spiele werden ____________ getickert" + umbr + "Spiel: 1 - 17- Jeweilige Partie wird  ____________ getickert" +
                       umbr + "STOP/KILL - Spiel auswahl wurde ____________ gelöscht "; break;
           case 3: //Kill
               text = "Spiele wurden gelöscht"; break;
           case 4: //Gameday
               text = "Spieltagsübersicht: " + umbr + umbr + "New England Patriots VS Kansas City Chifes  - Gillette Stadium "; break;
           case 5: // Redzone
               text = "Alle Spiele wurden ausgewählt"; break;
           case 6:  //Spiel 1
               text = "Spiel 1 ausgewählt"; break;
           case 7: // Spiel 22´
               text = "Spiel 1 ausgewählt"; break;
           case 8: // Stopp
               text = "Spiele wurden gelöscht"; break;
         /*case 9:
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
           case 21:*/
          default: text = "Ungültige Eingabe"; break;


       }
         return text;


}

}

