package bo.edu.ucb.ingsoft.hhrr.chat;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.HashMap;
import java.util.Map;

public class HhRrLongPollingBot extends TelegramLongPollingBot {

    private Map<Long, AbstractProcess> usersSession;

    public HhRrLongPollingBot() {
        usersSession = new HashMap<>();
    }

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
        // Primero identifico al usuario por chat Id Long
        Long chatId = update.getMessage().getChatId();
        System.out.println("REcibiendo chatId: " + chatId);
        // Busco si ya existe Proceso en el map userSession
        AbstractProcess currentProcess = usersSession.get(chatId);

        if (currentProcess == null) { // Primera vez que se contacto con nostros.
            System.out.println("Creando proceso para el  chatId: " + chatId);
            // Debo crear el proceso por defecto
            currentProcess = new MenuProcessImpl();
            usersSession.put(chatId, currentProcess);
            AbstractProcess nextProcess = currentProcess.handle(update, this);
            if (!nextProcess.equals(currentProcess)) { // Si el siguiente proceso es diferente
                nextProcess.handle(update, this);
            }//
            usersSession.put(chatId, nextProcess);

        } else { // Ya existe un proceso
            System.out.println("Recuperar el proceso para el  chatId: " + chatId);
            currentProcess = usersSession.get(chatId);
            AbstractProcess nextProcess = currentProcess.handle(update, this);
            if (!nextProcess.equals(currentProcess)) { // Si el siguiente proceso es diferente
                nextProcess.handle(update, this);
            }//
            usersSession.put(chatId, nextProcess);
        }

    }
}
