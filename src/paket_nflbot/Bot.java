package paket_nflbot;
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
    { umbr = "\n"; int comandId = 0;

        if (eingabe.equalsIgnoreCase("Hallo"))
        {           comandId = 1;
        } else if (eingabe.equalsIgnoreCase("Start"))
        {           comandId = 2;
        } else if (eingabe.equalsIgnoreCase("kill"))
        {           comandId = 3;
        }else if (eingabe.equalsIgnoreCase("gameday"))
        {           comandId = 4;
        }else if (eingabe.equalsIgnoreCase("Redzone"))
        {           comandId = 5;
        }else if (eingabe.equalsIgnoreCase("1"))
        {           comandId = 6;
        }else if (eingabe.equalsIgnoreCase("2"))
        {           comandId = 7;
        }else if (eingabe.equalsIgnoreCase("stop"))
        {           comandId = 8;
        }else if (eingabe.equalsIgnoreCase("stopp"))
        {           comandId = 8;
        }else if (eingabe.equalsIgnoreCase("Week 1"))
        {           comandId = 9;
            bef.setWeek(eingabe.substring(5));
        }else if (eingabe.equalsIgnoreCase("Week 2"))
        {           comandId = 9;
            bef.setWeek(eingabe.substring(5));
        }else if (eingabe.equalsIgnoreCase("Week 3"))
        {           comandId = 9;
            bef.setWeek(eingabe.substring(5));
        }else if (eingabe.equalsIgnoreCase("Week 4"))
        {           comandId = 9;
            bef.setWeek(eingabe.substring(5));
        }else if (eingabe.equalsIgnoreCase("Week 5"))
        {           comandId = 9;
            bef.setWeek(eingabe.substring(5));
        }else if (eingabe.equalsIgnoreCase("Week 6"))
        {           comandId = 9;
            bef.setWeek(eingabe.substring(5));
        }else if (eingabe.equalsIgnoreCase("Week 7"))
        {           comandId = 9;
            bef.setWeek(eingabe.substring(5));
        }else if (eingabe.equalsIgnoreCase("Week 8"))
        {           comandId = 9;
            bef.setWeek(eingabe.substring(5));
        }else if (eingabe.equalsIgnoreCase("Week 9"))
        {           comandId = 9;
            bef.setWeek(eingabe.substring(5));
        }else if (eingabe.equalsIgnoreCase("Week 10"))
        {           comandId = 9;
            bef.setWeek(eingabe.substring(5));
        }else if (eingabe.equalsIgnoreCase("Week 11"))
        {           comandId = 9;
            bef.setWeek(eingabe.substring(5));
        }else if (eingabe.equalsIgnoreCase("Week 12"))
        {           comandId = 9;
            bef.setWeek(eingabe.substring(5));
        }else if (eingabe.equalsIgnoreCase("Week 13"))
        {           comandId = 9;
            bef.setWeek(eingabe.substring(5));
        }else if (eingabe.equalsIgnoreCase("Week 14"))
        {           comandId = 9;
            bef.setWeek(eingabe.substring(5));
        }else if (eingabe.equalsIgnoreCase("Week 15"))
        {           comandId = 9;
            bef.setWeek(eingabe.substring(5));
        }else if (eingabe.equalsIgnoreCase("Week 16"))
        {           comandId = 9;
            bef.setWeek(eingabe.substring(5));
        }else if (eingabe.equalsIgnoreCase("Week 17"))
        {           comandId = 9;
            bef.setWeek(eingabe.substring(5));
        }else if (eingabe.equalsIgnoreCase("Week1"))
        {           comandId = 9;
            bef.setWeek(eingabe.substring(4));
        }else if (eingabe.equalsIgnoreCase("Week2"))
        {           comandId = 9;
            bef.setWeek(eingabe.substring(4));
        }else if (eingabe.equalsIgnoreCase("Week3"))
        {           comandId = 9;
            bef.setWeek(eingabe.substring(4));
        }else if (eingabe.equalsIgnoreCase("Week4"))
        {           comandId = 9;
            bef.setWeek(eingabe.substring(4));
        }else if (eingabe.equalsIgnoreCase("Week5"))
        {           comandId = 9;
            bef.setWeek(eingabe.substring(4));
        }else if (eingabe.equalsIgnoreCase("Week6"))
        {           comandId = 9;
            bef.setWeek(eingabe.substring(4));
        }else if (eingabe.equalsIgnoreCase("Week7"))
        {           comandId = 9;
            bef.setWeek(eingabe.substring(4));
        }else if (eingabe.equalsIgnoreCase("Week8"))
        {           comandId = 9;
            bef.setWeek(eingabe.substring(4));
        }else if (eingabe.equalsIgnoreCase("Week9"))
        {           comandId = 9;
            bef.setWeek(eingabe.substring(4));
        }else if (eingabe.equalsIgnoreCase("Week10"))
        {           comandId = 9;
            bef.setWeek(eingabe.substring(4));
        }else if (eingabe.equalsIgnoreCase("Week11"))
        {           comandId = 9;
            bef.setWeek(eingabe.substring(4));
        }else if (eingabe.equalsIgnoreCase("Week12"))
        {           comandId = 9;
            bef.setWeek(eingabe.substring(4));
        }else if (eingabe.equalsIgnoreCase("Week13"))
        {           comandId = 9;
            bef.setWeek(eingabe.substring(4));
        }else if (eingabe.equalsIgnoreCase("Week14"))
        {           comandId = 9;
            bef.setWeek(eingabe.substring(4));
        }else if (eingabe.equalsIgnoreCase("Week15"))
        {           comandId = 9;
            bef.setWeek(eingabe.substring(4));
        }else if (eingabe.equalsIgnoreCase("Week16"))
        {           comandId = 9;
            bef.setWeek(eingabe.substring(4));
        }else if (eingabe.equalsIgnoreCase("Week17"))
        {           comandId = 9;
            bef.setWeek(eingabe.substring(4));
        }else if (eingabe.equalsIgnoreCase("Spiel 1"))
        {           comandId = 10;
            bef.setSpiel(eingabe.substring(6));
        }else if (eingabe.equalsIgnoreCase("Spiel 2"))
        {           comandId = 10;
            bef.setSpiel(eingabe.substring(6));
        }else if (eingabe.equalsIgnoreCase("Spiel 3"))
        {           comandId = 10;
            bef.setSpiel(eingabe.substring(6));
        }else if (eingabe.equalsIgnoreCase("Spiel 4"))
        {           comandId = 10;
            bef.setSpiel(eingabe.substring(6));
        }else if (eingabe.equalsIgnoreCase("Spiel 5"))
        {           comandId = 10;
            bef.setSpiel(eingabe.substring(6));
        }else if (eingabe.equalsIgnoreCase("Spiel 6"))
        {           comandId = 10;
            bef.setSpiel(eingabe.substring(6));
        }else if (eingabe.equalsIgnoreCase("Spiel 7"))
        {           comandId = 10;
            bef.setSpiel(eingabe.substring(6));
        }else if (eingabe.equalsIgnoreCase("Spiel 8"))
        {           comandId = 10;
            bef.setSpiel(eingabe.substring(6));
        }else if (eingabe.equalsIgnoreCase("Spiel 9"))
        {           comandId = 10;
            bef.setSpiel(eingabe.substring(6));
        }else if (eingabe.equalsIgnoreCase("Spiel 10"))
        {           comandId = 10;
            bef.setSpiel(eingabe.substring(6));
        }else if (eingabe.equalsIgnoreCase("Spiel 11"))
        {           comandId = 10;
            bef.setSpiel(eingabe.substring(6));
        }else if (eingabe.equalsIgnoreCase("Spiel 12"))
        {           comandId = 10;
            bef.setSpiel(eingabe.substring(6));
        }else if (eingabe.equalsIgnoreCase("Spiel 13"))
        {           comandId = 10;
            bef.setSpiel(eingabe.substring(6));
        }else if (eingabe.equalsIgnoreCase("Spiel 14"))
        {           comandId = 10;
            bef.setSpiel(eingabe.substring(6));
        }else if (eingabe.equalsIgnoreCase("Spiel 15"))
        {           comandId = 10;
            bef.setSpiel(eingabe.substring(6));
        }else if (eingabe.equalsIgnoreCase("Spiel 16"))
        {           comandId = 10;
            bef.setSpiel(eingabe.substring(6));
        }else if (eingabe.equalsIgnoreCase("Spiel 17"))
        {           comandId = 10;
            bef.setSpiel(eingabe.substring(6));
        }else if (eingabe.equalsIgnoreCase("Spiel1"))
        {           comandId = 10;
            bef.setSpiel(eingabe.substring(5));
        }else if (eingabe.equalsIgnoreCase("Spiel2"))
        {           comandId = 10;
            bef.setSpiel(eingabe.substring(5));
        }else if (eingabe.equalsIgnoreCase("Spiel3"))
        {           comandId = 10;
            bef.setSpiel(eingabe.substring(5));
        }else if (eingabe.equalsIgnoreCase("Spiel4"))
        {           comandId = 10;
            bef.setSpiel(eingabe.substring(5));
        }else if (eingabe.equalsIgnoreCase("Spiel5"))
        {           comandId = 10;
            bef.setSpiel(eingabe.substring(5));
        }else if (eingabe.equalsIgnoreCase("Spiel6"))
        {           comandId = 10;
            bef.setSpiel(eingabe.substring(5));
        }else if (eingabe.equalsIgnoreCase("Spiel7"))
        {           comandId = 10;
            bef.setSpiel(eingabe.substring(5));
        }else if (eingabe.equalsIgnoreCase("Spiel8"))
        {           comandId = 10;
            bef.setSpiel(eingabe.substring(5));
        }else if (eingabe.equalsIgnoreCase("Spiel9"))
        {           comandId = 10;
            bef.setSpiel(eingabe.substring(5));
        }else if (eingabe.equalsIgnoreCase("Spiel10"))
        {           comandId = 10;
            bef.setSpiel(eingabe.substring(5));
        }else if (eingabe.equalsIgnoreCase("Spiel11"))
        {           comandId = 10;
            bef.setSpiel(eingabe.substring(5));
        }else if (eingabe.equalsIgnoreCase("Spiel12"))
        {           comandId = 10;
            bef.setSpiel(eingabe.substring(5));
        }else if (eingabe.equalsIgnoreCase("Spiel13"))
        {           comandId = 10;
            bef.setSpiel(eingabe.substring(5));
        }else if (eingabe.equalsIgnoreCase("Spiel14"))
        {           comandId = 10;
            bef.setSpiel(eingabe.substring(5));
        }else if (eingabe.equalsIgnoreCase("Spiel15"))
        {           comandId = 10;
            bef.setSpiel(eingabe.substring(5));
        }else if (eingabe.equalsIgnoreCase("Spiel16"))
        {           comandId = 10;
            bef.setSpiel(eingabe.substring(5));
        }else if (eingabe.equalsIgnoreCase("Spiel17"))
        {           comandId = 10;
            bef.setSpiel(eingabe.substring(5));
        }



//---------------------------------------------------------------------------------------------------------------------------------------------------------------
        else
        {text = "ungültige Eingabe";
        }
      text = bef.texter(comandId);

    }
}
