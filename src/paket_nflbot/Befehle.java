package paket_nflbot;

import java.sql.*;

public class Befehle

{

    String text, umbr, week;
    int i = 1;

    Teamdata tdata = new Teamdata();

    DBZugriff dbZugriff = new DBZugriff();


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
               text = "Bitte Gameweek auswählen: " + umbr + umbr
                       + "Week 1 " + umbr
                       + "Week 2 " + umbr
                       + "Week 3 " + umbr
                       + "Week 4 " + umbr
                       + "Week 5 " + umbr
                       + "Week 6 " + umbr
                       + "Week 7 " + umbr
                       + "Week 8 " + umbr
                       + "Week 9 " + umbr
                       + "Week 10 " + umbr
                       + "Week 10 " + umbr
                       + "Week 12 " + umbr
                       + "Week 13 " + umbr
                       + "Week 14 " + umbr
                       + "Week 15 " + umbr
                       + "Week 16 " + umbr
                       + "Week 17 " ; break;
           case 5: // Redzone
               text = "Alle Spiele wurden ausgewählt"; break;
           case 6:  //Spiel 1
               text =  "Spiel 2 ausgewählt"; break;
           case 7: // Spiel 2
               text = "Spiel 2 ausgewählt"; break;
           case 8: // Stopp
               text = "Spiele wurden gelöscht"; break;
           case 9:
               text = gameWeekGenerator(Integer.parseInt(getWeek())); break;
             //  text = "test"; break;

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

          default: text = "Ungültige Eingabe"; break;


       }
         return text;


}

public String gameWeekGenerator(int week) {
    String gameWeek = "Folgende Spiele sind in Week "+ week +":"+ umbr + umbr;

    try {
    dbZugriff.oeffneDB();
    String abfrage = "SELECT * FROM nflbot.spiele where week = '"+week+"';";

    ResultSet rs = dbZugriff.lesen(abfrage);

        while (rs.next())

       // for (  i= 1; i <=17; i++)
        { String spiel = "Spiel " + i + ": "+umbr + tdata.gameGenereator(rs.getInt("away"),rs.getInt("home")) + umbr;
          i++;
         gameWeek = gameWeek + spiel + umbr;

        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    dbZugriff.schliesseDB();
    i = 1;
    return gameWeek;

}
//----------------------------------------------------------------------------------------------------------------
/*public String gamedatengenerator ()
{   dbZugriff.oeffneDB();
    String abfrage = "SELECT teamID, Gegner"+1+ " FROM nflbot.gameplan;";
    ResultSet rs = dbZugriff.lesen(abfrage);

    while(rs.next())
    {
    }





    dbZugriff.schliesseDB();
    String game =  tdata.gameGenereator(1,3);

        return game;
}
*/
public String getWeek() {
        return week;
}

public void setWeek(String week) {
        this.week = week;
}

}

