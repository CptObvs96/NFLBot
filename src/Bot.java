import com.sun.xml.internal.ws.resources.SenderMessages;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

public class Bot extends TelegramLongPollingBot {

private String text, eingabe;
    @Override
    public void onUpdateReceived(Update update) {

        System.out.println(update.getMessage().getFrom().getFirstName() + ": " + update.getMessage().getText());

         eingabe = update.getMessage().getText();
         System.out.println(eingabe);
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
        return "356914309:AAGI12RShZjRf9IyMgJpxBZNKpwCT0MlJP0";
    }

    private void nachrichtengenerator(String eingabe)
    {
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
            text = "Spiel 1 ausgewählt";
        }
        else if (eingabe.equalsIgnoreCase("3"))
        {
            text = "Spiel 1 ausgewählt";
        }
        else if (eingabe.equalsIgnoreCase("4"))
        {
            text = "Spiel 1 ausgewählt";
        }
        else if (eingabe.equalsIgnoreCase("5"))
        {
            text = "Spiel 1 ausgewählt";
        }
        else if (eingabe.equalsIgnoreCase("6"))
        {
            text = "Spiel 1 ausgewählt";
        }
        else if (eingabe.equalsIgnoreCase("6"))
        {
            text = "Spiel 1 ausgewählt";
        }
        else if (eingabe.equalsIgnoreCase("7"))
        {
            text = "Spiel 1 ausgewählt";
        }
        else if (eingabe.equalsIgnoreCase("7"))
        {
            text = "Spiel 1 ausgewählt";
        }else if (eingabe.equalsIgnoreCase("8"))
        {
            text = "Spiel 1 ausgewählt";
        }else if (eingabe.equalsIgnoreCase("9"))
        {
            text = "Spiel 1 ausgewählt";
        }else if (eingabe.equalsIgnoreCase("10"))
        {
            text = "Spiel 1 ausgewählt";
        }
        else if (eingabe.equalsIgnoreCase("11"))
        {
            text = "Spiel 1 ausgewählt";
        }
        else if (eingabe.equalsIgnoreCase("12"))
        {
            text = "Spiel 1 ausgewählt";
        }
        else if (eingabe.equalsIgnoreCase("13"))
        {
            text = "Spiel 1 ausgewählt";
        }
        else if (eingabe.equalsIgnoreCase("14"))
        {
            text = "Spiel 1 ausgewählt";
        }
        else if (eingabe.equalsIgnoreCase("15"))
        {
            text = "Spiel 1 ausgewählt";
        }
        else if (eingabe.equalsIgnoreCase("16"))
        {
            text = "Spiel 1 ausgewählt";
        }
        else if (eingabe.equalsIgnoreCase("17"))
        {
            text = "Spiel 1 ausgewählt";
        }
        else if (eingabe.equalsIgnoreCase("Redzone"))
        {
            text = "All Spiele ausgewählt ";
        }
         else
        {
            text = "ungültige Eingabe";
        }

    }
}
