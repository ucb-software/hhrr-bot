package bo.edu.ucb.ingsoft.hhrr.chat;

import bo.edu.ucb.ingsoft.hhrr.chat.widgets.Widget;

import java.util.HashMap;

public class MenuProcess extends Process{

    public MenuProcess() {
        this.setName("Menú principal");
        this.setDefault(true);
        this.setExpires(false);
        this.setStartDate(System.currentTimeMillis()/1000);
        this.setUserData(new HashMap<>());
        this.setStatus("STARTED");
    }

    // Retornar un Widget de tipo menu
    @Override
    public Widget onInit() {
        return null;
    }

    @Override
    public Process onError() {
        return null;
    }

    @Override
    public Process onSuccess() {
        return null;
    }

    @Override
    public Process onTimeout() {
        return null;
    }
}
