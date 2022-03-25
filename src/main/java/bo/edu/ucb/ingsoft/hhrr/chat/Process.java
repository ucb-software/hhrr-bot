package bo.edu.ucb.ingsoft.hhrr.chat;

import bo.edu.ucb.ingsoft.hhrr.chat.widgets.Widget;

import java.util.Map;

public abstract class Process {
    // Nombre del proceso, ej: Menu Principal
    private String name;
    // Proceso por defecto cuando se inicio o existe un error
    private boolean isDefault;

    // Atributo me dice si el proceso expira
    private boolean expires;

    // Cantidad de segundos para que expira
    private long timeout;

    // La fecha de inicio seran la cantidad de segundos desde 1970
    // Se lo puede obtener con System.getCurretnMillis()/1000
    private long startDate;

    private Map<String, Object> userData;

    // Posibles valores: STARTED, FINISH, ERROR, AWAITING_USER_RESPONSE
    private String status;

    // Método que se invoca al iniciar el proceso
    public abstract Widget onInit();

    // A que proceso se debe ir en caso de error.
    public abstract Process onError();

    // A que proceso se debe ir en caso de terminar satisfactoriamente.
    public abstract Process onSuccess();

    // En caso de que el proce de timeout
    public abstract Process onTimeout();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDefault() {
        return isDefault;
    }

    public void setDefault(boolean aDefault) {
        isDefault = aDefault;
    }

    public boolean isExpires() {
        return expires;
    }

    public void setExpires(boolean expires) {
        this.expires = expires;
    }

    public long getTimeout() {
        return timeout;
    }

    public void setTimeout(long timeout) {
        this.timeout = timeout;
    }

    public long getStartDate() {
        return startDate;
    }

    public void setStartDate(long startDate) {
        this.startDate = startDate;
    }

    public Map<String, Object> getUserData() {
        return userData;
    }

    public void setUserData(Map<String, Object> userData) {
        this.userData = userData;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
