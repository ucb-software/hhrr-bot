package bo.edu.ucb.ingsoft.hhrr;

import bo.edu.ucb.ingsoft.hhrr.chat.HhRrLongPollingBot;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Chat;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.List;
//import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest

/**
 * Pruebas integrales de la aplicación
 */
class HhrrApplicationTests {

	@Test
	void sayHello() {
		HhRrLongPollingBot bot = new HhRrLongPollingBot(true);
		// Invoco al bot con un mensaje
		bot.onUpdateReceived(createUpdate("Hello"));
		// Reviso cuantos mensaje me retorna.
		List<BotApiMethod> messages =  bot.getTestMessages();
		assertEquals(1, messages.size(), "El chat devolvió mas de un mensaje." );
		// Obtener el mensaje
		SendMessage sendMessage = (SendMessage) messages.get(0);
		assertTrue(sendMessage.getText().contains("MENU PRINCIPAL"),"Se obtuvo un proceso diferetena a menu principal");
		// Limpiamos los mensajes
		bot.getTestMessages().clear();


		// Ya recibi menu principal envio opción 1
		bot.onUpdateReceived(createUpdate("1"));
		assertEquals(1, messages.size(), "El chat devolvió mas de un mensaje." );
		sendMessage = (SendMessage) messages.get(0);
		assertTrue(sendMessage.getText().contains("has solicitado"), "Se obtuvo un proceso diferetena solicitudes pasadas");
		bot.getTestMessages().clear();


		// Vuelvo a enviar hello
		bot.onUpdateReceived(createUpdate("hello"));
		assertEquals(1, messages.size(), "El chat devolvió mas de un mensaje." );
		sendMessage = (SendMessage) messages.get(0);
		assertTrue(sendMessage.getText().contains("MENU PRINCIPAL"), "Se obtuvo un proceso diferetena a Menu Principal");
	}

	private Update createUpdate(String text) {
		Update update = new Update();
		Message message = new Message();
		message.setText(text);
		Chat chat = new Chat();
		chat.setId(123456789L);
		message.setChat(chat);
		update.setMessage(message);
		return update;
	}

}
