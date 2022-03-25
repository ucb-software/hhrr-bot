package bo.edu.ucb.ingsoft.hhrr.chat;

import bo.edu.ucb.ingsoft.hhrr.chat.widgets.Widget;

public class RequestsPermissionProcess extends Process{

    public RequestsPermissionProcess() {
        this.setName("Solicitar permiso");
        this.setDefault(false);
        this.setExpires(false);
        this.setStartDate(System.currentTimeMillis()/1000);
        //this.setUserData(new HashMap<>());
        this.setStatus("STARTED");
    }

    // Retornar un Widget Solicitando Fecha Inicio
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
