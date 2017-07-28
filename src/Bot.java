import com.sun.xml.internal.ws.resources.SenderMessages;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

public class Bot extends TelegramLongPollingBot {

private String text, eingabe, umbr, botid;
private Befehle bef = new Befehle();





    @Override
    public void onUpdateReceived(Update update) {

       // System.out.println(update.getMessage().getFrom().getFirstName() + ": " + update.getMessage().getText());

         eingabe = update.getMessage().getText();
        // System.out.println(eingabe);
         nachrichtengenerator(eingabe);



        //send Message
        SendMessage sendMessage = new SendMessage().setChatId(update.getMessage().getChatId());

        sendMessage.setText(text);

        try
        {
          sendMessage(sendMessage);
        }
        catch (TelegramApiException e)
        {
            e.printStackTrace();
        }


    }


    @Override
    public String getBotUsername() {
        return null;
    }

    @Override
    public String getBotToken() {

    botid = "356914309:AAGI12RShZjRf9IyMgJpxBZNKpwCT0MlJP0";

            return botid;
    }

    private void nachrichtengenerator(String eingabe)
    { umbr = "\n";
        if (eingabe.equalsIgnoreCase("gameday"))
        {
            text = "Spieltagsübersicht: " + umbr + umbr + "New England Patriots VS Kansas City Chifes  - Gillette Stadium ";

        } else if (eingabe.equalsIgnoreCase("Kill"))
        {
           // text = "Spiele würden gelöscht";

            bef.texter(3);

        } else if (eingabe.equalsIgnoreCase("1"))
        {
            text = "Spiel 1 ausgewählt";
        }
        else if (eingabe.equalsIgnoreCase("2"))
        {
            text = "Spiel 2 ausgewählt";
        }

        else if (eingabe.equalsIgnoreCase("Redzone"))
        {
            text = "All Spiele ausgewählt ";
        }
        else if (eingabe.equalsIgnoreCase("Hallo"))
        {
            //text = "Herzlich Willkommen zum NFL Liveticker Bot" + umbr + umbr + "Um alle Befehle zu sehen schick mir den START Befehl" ;
          text =  bef.texter(1);
          System.out.println("Botklasse: "+ bef.texter(1));
        }
        else if (eingabe.equalsIgnoreCase("start"))
        {
            //text = "Hier eine Übersicht über alle Befehle:" + umbr + umbr + "GAMEDAY  - Spieltagsübersicht" + umbr + "REDZONE  - Alle Spiele werden ____________ getickert"+ umbr + "Spiel: 1 - 17- Jeweilige Partie wird  ____________ getickert"+ umbr +"STOP/KILL - Spiel auswahl wurde ____________ gelöscht " ;
            bef.texter(2);

        }else if (eingabe.equalsIgnoreCase("stop"))
        {
            text = "Spiele würden gelöscht";

        }
        else if (eingabe.equalsIgnoreCase("stopp"))
        {
            text = "Spiele würden gelöscht";

        }
/*
         else
        {
            text = "ungültige Eingabe";
        }

*/
    }
}
