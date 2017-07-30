package paket_nflbot;

import java.sql.*;

import javax.swing.JOptionPane;


public class DBZugriff
{  //Variablen f�r den Verbindungsaufbau

    private Connection dbVerbindung = null; //DB-Verbindungsobjekt
    private Statement stmtSQL = null; //Objekt f�r die SQl-Anweisng
//----------------------------------------------------------------------------------------------------

    // Methoden
    public boolean oeffneDB ()
    {  boolean mOK ;
        // Treiber einbinden
        try
        {	Class.forName("com.mysql.jdbc.Driver").newInstance();
            dbVerbindung = DriverManager.getConnection("jdbc:mysql://localhost/nflbot", "root", "");
            stmtSQL = dbVerbindung.createStatement();
            mOK = true;

        }
        catch (Exception e)
        {
            mOK = false;
        }
        return mOK;
    }
    //----------------------------------------------------------------------------------------------------
    public boolean schliesseDB()
    {boolean mOK;
        try
        {
            stmtSQL.close();
            dbVerbindung.close();
            mOK = true;
        }
        catch (Exception e)
        {
            mOK = false;
        }
        return mOK;
    }
    //----------------------------------------------------------------------------------------------------
    public boolean aendern(String pSQL)
    { boolean mOK;
        try
        {
            stmtSQL.executeUpdate(pSQL);
            mOK = true;
        }
        catch (Exception e)
        {
            mOK = false;
        }
        return mOK;
    }
    //----------------------------------------------------------------------------------------------------
    public ResultSet lesen(String pSQL)
    { ResultSet rs;


        try
        {  // ResultSet erstellen


            rs = stmtSQL.executeQuery(pSQL);

        }
        catch (Exception e)
        {
            rs = null;
            System.out.println("Fehler im SQL-Statement!!");
        }
        return rs; }
//----------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------

//--------------------------------------------Klassen-Ende--------------------------------------------
}
