package bo.edu.ucb.ingsoft.hhrr.chat;

import bo.edu.ucb.ingsoft.hhrr.chat.widgets.AbstractWidget;
import bo.edu.ucb.ingsoft.hhrr.chat.widgets.MenuWidgetImpl;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MenuProcessImpl extends AbstractProcess {

    public MenuProcessImpl() {
        this.setName("Menú principal");
        this.setDefault(true);
        this.setExpires(false);
        this.setStartDate(System.currentTimeMillis()/1000);
        this.setUserData(new HashMap<>());
        this.setStatus("STARTED");
    }

    // Retornar un Widget de tipo menu
//    @Override
//    public AbstractWidget onInit() {
//        MenuWidgetImpl menuWidget = new MenuWidgetImpl(messages);
//        return menuWidget;
//    }


    @Override
    public void handle(Update update, TelegramLongPollingBot bot) {

        Long chatId = update.getMessage().getChatId();

        StringBuffer sb = new StringBuffer();
        sb.append("MENU PRINCIPAL - BOT RRHH\r\n");
        sb.append("1. Consultar permisos solicitados\r\n");
        sb.append("2. Solicitar vacación\r\n");
        sb.append("Elija una opción:\r\n");

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId.toString());
        sendMessage.setText(sb.toString());
        try {
            bot.execute(sendMessage);
        } catch (Exception ex) {
            // relanzamos la excepción
            throw new RuntimeException(ex);
        }
    }

    @Override
    public AbstractProcess onError() {
        return null;
    }

    @Override
    public AbstractProcess onSuccess() {
        return null;
    }

    @Override
    public AbstractProcess onTimeout() {
        return null;
    }
}
