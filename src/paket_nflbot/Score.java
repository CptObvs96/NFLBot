package paket_nflbot;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Score {

    boolean checksum = false;
    private NflDotComLiveScoresParser parser;
    DBZugriff dbZugriff = new DBZugriff();


    public void scoresetter ()
    { if (checksum = true)
        {
            while(checksum = true)
            {
                URL url = null;
                try {
                    url = new URL("http://www.nfl.com/liveupdate/scorestrip/scorestrip.json");
                }
                catch (MalformedURLException mue) {
                    throw new RuntimeException("couldn't parse url: "+ url, mue);
                }

                List<Game> games = this.parser.parse(url);

                try {
                    wait(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                long time = System.currentTimeMillis();
                timeSetter(time);
            }

        }
        else
        {

        }


    }
  public void timeSetter (long ptime)
   {
    dbZugriff.oeffneDB();


    String timestamper ="Insert into Timestamp '"+ ptime +"';";
    dbZugriff.aendern(timestamper);
    String timestamperId = "Select timestampId from timestamp where timestamp = '" +ptime+'"';
    ResultSet rs = dbZugriff.lesen(timestamperId);

       try {
           rs.next();
       } catch (SQLException e) {
           e.printStackTrace();
       }

       try {
           int timestampid = rs.getInt("timestamp");
       } catch (SQLException e) {
           e.printStackTrace();
       }


       dbZugriff.schliesseDB();
   }

}
