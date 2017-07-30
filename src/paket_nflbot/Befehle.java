package paket_nflbot;

import org.telegram.telegrambots.api.methods.send.SendMessage;

import java.sql.*;

public class Befehle

{

    String text;
    String umbr;
    String week;



    String spiel;
    int i = 1, gweek, phalter =0;

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
               text =  "Platzhalter"; break;
           case 7: // Spiel 2
               text = "Platzhalter"; break;
           case 8: // Stopp
               text = "Spiele wurden gelöscht"; break;
           case 9:
               text = gameWeekGenerator(Integer.parseInt(getWeek())); break;
           case 10:
               text = gamedatengenerator(Integer.parseInt(getSpiel())); break;
           case 11:
               ; break;
           case 12:
               ; break;
           case 13:
               ; break;
           case 14:
               ; break;
           case 15:
               ; break;
           case 16:
               ; break;
           case 17:
               ; break;
           case 18:
               ; break;
           case 19:
               ; break;
           case 20:
               ; break;
           case 21:
               ; break;

          default: text = "Ungültige Eingabe"; break;


       }
         return text;


}

public String gameWeekGenerator(int week) {
    String gameWeek = "Folgende Spiele sind in Week "+ week +":"+ umbr + umbr;
    gweek = week;
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

public String gamedatengenerator (int spiel)
{  String gameday = "Spiel "+ spiel +" wurde ausgewählt. "+ umbr + umbr ;
  int hometeam; String weekspielid;

    dbZugriff.oeffneDB();


  if (spiel < 10)
  { weekspielid = week+"0"+spiel;

  }
  else
  { weekspielid = week+spiel;
  }
    try {

        String abfrage = "SELECT * FROM nflbot.spiele where weekspielid = '"+weekspielid.toString()+"';" ;

        ResultSet rs = dbZugriff.lesen(abfrage);

        rs.next();
        String aspiel =  tdata.gameGenereator(rs.getInt("away"),rs.getInt("home")) ;
        gameday = gameday + aspiel + umbr +umbr ;

        hometeam = rs.getInt("home");

        String abfrage2 = "SELECT * FROM nflbot.stadiumdata where teamid = '"+hometeam+"';";

        ResultSet rsa = dbZugriff.lesen(abfrage2);
        rsa.next();

        String stadiumdata = rsa.getString("name")+ umbr + rsa.getString("stadt") + " ," + rsa.getString("staat");
        gameday = gameday + stadiumdata;
    }
    catch (SQLException e) {
        e.printStackTrace();
    }


    dbZugriff.schliesseDB();

    return gameday;
}







//----------------------------------------------------------------------------------------------------------------


public String getWeek() {
        return week;
}

public void setWeek(String week) {
        this.week = week;
}

public String getSpiel() {
        return spiel;
    }

public void setSpiel(String spiel) {
        this.spiel = spiel;
    }

}

