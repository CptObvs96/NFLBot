import java.sql.*;


public class DBZugriff {
    //		Variablen f�r den Verbindungsaufbau
    private Connection conn = null;

    private Statement stmtSQL = null;    // Variable f�r den Treiber und	den Pfad zur DB
    boolean mSQLOK1;     //		Variablen f�r den Datenbankzugriff
    boolean mSQLOK2;
    String mSQL;


    public void oeffneDB() {
        //DriverManager
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            System.out.println("DriverManager geladen");
        } catch (Exception ex) {
            System.out.println("Driver: " + ex.getMessage());
            System.out.println("VendorError: " + ex.toString());
        }
        //Connection
        try {
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/nflbot.gameplan" +
                    "", "root", "");
            stmtSQL = conn.createStatement();

            System.out.println("Connection etabliert");
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }

    }

    private boolean aendern(String pSQL) {
        try {
            stmtSQL.executeUpdate(pSQL);
            mSQLOK1 = true;
        } catch (SQLException err) {
            System.err.println(err);
            mSQLOK1 = false;
        }
        return mSQLOK1;
    }

    public ResultSet lesen(String pSQL) {
        ResultSet rs;
        oeffneDB();

        try {
            rs = stmtSQL.executeQuery(pSQL);
            return rs;

        }
        catch (SQLException err) {
            System.err.println(err);
            rs = null;
            return rs;

        }

    }


    public void schliesseDB() {
        try {
            stmtSQL.close();
            conn.close();
        } catch (SQLException err) {
            System.err.println(err);
        }
    }
}