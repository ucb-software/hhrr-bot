package bo.edu.ucb.ingsoft.hhrr.chat;

import bo.edu.ucb.ingsoft.hhrr.chat.widgets.Widget;

public class QueryPastRequestsProcess extends Process{

    public QueryPastRequestsProcess() {
        this.setName("Consultar solicitudes pasadas");
        this.setDefault(false);
        this.setExpires(false);
        this.setStartDate(System.currentTimeMillis()/1000);
        //this.setUserData(new HashMap<>());
        this.setStatus("STARTED");
    }

    // Retornar un Widget con la información de los permisos solicitados
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
