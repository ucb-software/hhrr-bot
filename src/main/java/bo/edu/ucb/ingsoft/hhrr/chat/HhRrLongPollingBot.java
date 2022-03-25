package bo.edu.ucb.ingsoft.hhrr.chat;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class HhRrLongPollingBot extends TelegramLongPollingBot {

    @Override
    public String getBotUsername() {
        return "ucb_hr_2022_bot";
    }

    @Override
    public String getBotToken() {
        return "5178064699:AAHU55YGImwYD7tlrEarAxVsq12IDPKOSNA";
    }

    @Override
    public void onUpdateReceived(Update update) {
        System.out.println(update);
    }
}
