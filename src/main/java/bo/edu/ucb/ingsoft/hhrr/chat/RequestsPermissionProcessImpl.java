package bo.edu.ucb.ingsoft.hhrr.chat;

import bo.edu.ucb.ingsoft.hhrr.chat.widgets.AbstractWidget;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class RequestsPermissionProcessImpl extends AbstractProcess {

    public RequestsPermissionProcessImpl() {
        this.setName("Solicitar permiso");
        this.setDefault(false);
        this.setExpires(false);
        this.setStartDate(System.currentTimeMillis()/1000);
        //this.setUserData(new HashMap<>());
        this.setStatus("STARTED");
    }


    // Retornar un Widget Solicitando Fecha Inicio
//    @Override
//    public AbstractWidget onInit() {
//        return null;
//    }

    @Override
    public void handle(Update update, TelegramLongPollingBot bot) {

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
