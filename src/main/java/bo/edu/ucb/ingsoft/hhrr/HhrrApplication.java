package bo.edu.ucb.ingsoft.hhrr;

import bo.edu.ucb.ingsoft.hhrr.chat.HhRrLongPollingBot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

@SpringBootApplication
public class HhrrApplication {

	public static void main(String[] args) {
		SpringApplication.run(HhrrApplication.class, args);
		try {
			TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
			telegramBotsApi.registerBot(new HhRrLongPollingBot());
		} catch (TelegramApiException e) {
			e.printStackTrace();
		}
	}

}
