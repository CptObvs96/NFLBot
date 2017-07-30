package paket_nflbot;

public class Teamdata
{
String pats = "New England Patriots";  int  patsId = 1;
String bills = "Buffelo Bills"; int  billsId = 2;
String jets = "New York Jets"; int  jetsId = 3;
String dolphins = "Miami Dolphins"; int   dolphinsId = 4;
String vikings = "Minnesota Vikings"; int  vikingsId = 5;
String packers ="Green Bay Packers"; int  packersId = 6;
String bears ="Chicago Bears"; int  bearsId = 7;
String lions = "Detroit Lions"; int  lionsId = 8;
String cowboys ="Dallas Cowboys"; int  cowboysId = 9;
String texans = "Houston Texans"; int  texansId = 10;
String bucs = "Tempa Bay Buccaneers"; int  bucsId = 11;
String chiefs = "Kansas City Chiefs"; int  chiefsId = 12;
String rams = "Los Angeles Rams"; int  ramsId = 13;
String chargers = "Los Angeles Chargers"; int  chargersId = 14;
String raiders = "Oakland Raiders";int  raidersId = 15;
String seahawks = "Seatle Seahawks"; int  seahawksId = 16;
String falcons = "Atlanta Falcons"; int  falconsId = 17;
String saints = "New Orleans Saints"; int  saintsId = 18;
String browns = "Cleveland Browns"; int  brownsId = 19;
String giants = "New York Giants"; int  giantsId = 20;
String broncos = "Denver Broncos"; int  broncosId = 21;
String cardinals = "Arizona Cardinals"; int  cardinalsId = 22;
String panthers = "Carolina Panthers"; int  panthersId = 23;
String redskins = "Washington Redskins"; int  redskinsId = 24;
String steelers = "Pittsburg Steelers"; int  steelersId = 25;
String sanfra ="San Francisco 49ers"; int  sanfraId = 26;
String eagles ="Philiadelphia Eagles"; int  eaglesId = 27;
String bengals ="Cinncinati Bengals"; int  bengalsId = 28;
String jags = "Jacksonville Jaguars"; int  jagsId = 29;
String colts = "Indianapolis Colts"; int  coltsId = 30;
String ravens = "Baltimore Ravens"; int  ravensId = 31;
String titans = "Tennesee Titans"; int  titansId = 32;


public String teamgetter(Integer id ) {
 String team;

     switch(id){
            case 1: team = getPats(); break;
            case 2: team = getBills(); break;
            case 3: team = getJets(); break;
            case 4: team = getDolphins(); break;
            case 5: team = getVikings(); break;
            case 6: team = getPackers(); break;
            case 7: team = getBears(); break;
            case 8: team = getLions(); break;
            case 9: team = getCowboys(); break;
            case 10: team = getTexans(); break;
            case 11: team = getBucs(); break;
            case 12: team = getChiefs(); break;
            case 13: team = getRams(); break;
            case 14: team = getChargers(); break;
            case 15: team = getRaiders(); break;
            case 16: team = getSeahawks(); break;
            case 17: team = getFalcons(); break;
            case 18: team = getSaints(); break;
            case 19: team = getBrowns(); break;
            case 20: team = getGiants(); break;
            case 21: team = getBroncos(); break;
            case 22: team = getCardinals(); break;
            case 23: team = getPanthers(); break;
            case 24: team = getRedskins(); break;
            case 25: team = getSteelers(); break;
            case 26: team = getSanfra(); break;
            case 27: team = getEagles(); break;
            case 28: team = getBengals(); break;
            case 29: team = getJags(); break;
            case 30: team = getColts(); break;
            case 31: team = getRavens(); break;
            case 32: team = getTitans(); break;
            default: team = "Bye WeeK"; break;
        }
           return team;
    }

  public String gameGenereator (int id1, int id2)
  { String partie, team1, team2;

  team1 = teamgetter(id1);
  team2 = teamgetter(id2);


    partie = team1 + " @ " + team2;

    return partie;
  }



    public String getPats() {
        return pats;
    }

    public String getBills() {
        return bills;
    }

    public String getJets() {
        return jets;
    }

    public String getDolphins() {
        return dolphins;
    }

    public String getVikings() {
        return vikings;
    }

    public String getPackers() {
        return packers;
    }

    public String getBears() {
        return bears;
    }

    public String getLions() {
        return lions;
    }

    public String getCowboys() {
        return cowboys;
    }

    public String getTexans() {
        return texans;
    }

    public String getBucs() {
        return bucs;
    }

    public String getChiefs() {
        return chiefs;
    }

    public String getRams() {
        return rams;
    }

    public String getChargers() {
        return chargers;
    }

    public String getRaiders() {
        return raiders;
    }

    public String getSeahawks() {
        return seahawks;
    }

    public String getFalcons() {
        return falcons;
    }

    public String getSaints() {
        return saints;
    }

    public String getBrowns() {
        return browns;
    }

    public String getGiants() {
        return giants;
    }

    public String getBroncos() {
        return broncos;
    }

    public String getCardinals() {
        return cardinals;
    }

    public String getPanthers() {
        return panthers;
    }

    public String getRedskins() {
        return redskins;
    }

    public String getSteelers() {
        return steelers;
    }

    public String getSanfra() {
        return sanfra;
    }

    public String getEagles() {
        return eagles;
    }

    public String getBengals() {
        return bengals;
    }

    public String getJags() {
        return jags;
    }

    public String getColts() {
        return colts;
    }

    public String getRavens() {
        return ravens;
    }

    public String getTitans() {
        return titans;
    }
}
