import com.sun.xml.internal.ws.resources.SenderMessages;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

public class Bot extends TelegramLongPollingBot {

private String text, eingabe, umbr, botid;





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
            text = "Spieltagsübersicht";

        } else if (eingabe.equalsIgnoreCase("Kill"))
        {
            text = "Spiele würden gelöscht";

        } else if (eingabe.equalsIgnoreCase("1"))
        {
            text = "Spiel 1 ausgewählt";
        }
        else if (eingabe.equalsIgnoreCase("2"))
        {
            text = "Spiel 2 ausgewählt";
        }
        else if (eingabe.equalsIgnoreCase("3"))
        {
            text = "Spiel 3 ausgewählt";
        }
        else if (eingabe.equalsIgnoreCase("4"))
        {
            text = "Spiel 4 ausgewählt";
        }
        else if (eingabe.equalsIgnoreCase("5"))
        {
            text = "Spiel 5 ausgewählt";
        }
        else if (eingabe.equalsIgnoreCase("6"))
        {
            text = "Spiel 6 ausgewählt";
        }
        else if (eingabe.equalsIgnoreCase("7"))
        {
            text = "Spiel 7 ausgewählt";
        }
        else if (eingabe.equalsIgnoreCase("8"))
        {
            text = "Spiel 8 ausgewählt";
        }else if (eingabe.equalsIgnoreCase("9"))
        {
            text = "Spiel 9 ausgewählt";
        }else if (eingabe.equalsIgnoreCase("10"))
        {
            text = "Spiel 10 ausgewählt";
        }
        else if (eingabe.equalsIgnoreCase("11"))
        {
            text = "Spiel 11 ausgewählt";
        }
        else if (eingabe.equalsIgnoreCase("12"))
        {
            text = "Spiel 12 ausgewählt";
        }
        else if (eingabe.equalsIgnoreCase("13"))
        {
            text = "Spiel 13 ausgewählt";
        }
        else if (eingabe.equalsIgnoreCase("14"))
        {
            text = "Spiel 14 ausgewählt";
        }
        else if (eingabe.equalsIgnoreCase("15"))
        {
            text = "Spiel 15 ausgewählt";
        }
        else if (eingabe.equalsIgnoreCase("16"))
        {
            text = "Spiel 16 ausgewählt";
        }
        else if (eingabe.equalsIgnoreCase("17"))
        {
            text = "Spiel 17 ausgewählt";
        }
        else if (eingabe.equalsIgnoreCase("Redzone"))
        {
            text = "All Spiele ausgewählt ";
        }
        else if (eingabe.equalsIgnoreCase("Hallo"))
        {
            text = "Herzlich Willkommen zum NFL Liveticker Bot" + umbr + umbr + "Um alle Befehle zu sehen schick mir den START Befehl" ;
        }
        else if (eingabe.equalsIgnoreCase("start"))
        {
            text = "Hier eine Übersicht über alle Befehle:" + umbr + umbr + "GAMEDAY  - Spieltagsübersicht" + umbr + "REDZONE  - Alle Spiele werden ____________ getickert"+ umbr + "Spiel: 1 - 17- Jeweilige Partie wird  ____________ getickert"+ umbr +"STOP/KILL - Spiel auswahl wurde ____________ gelöscht " ;

        }else if (eingabe.equalsIgnoreCase("stop"))
        {
            text = "Spiele würden gelöscht";

        }





         else
        {
            text = "ungültige Eingabe";
        }

    }
}
