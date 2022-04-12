package bo.edu.ucb.ingsoft.hhrr;

import bo.edu.ucb.ingsoft.hhrr.chat.HhRrLongPollingBot;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import javax.sql.DataSource;

@SpringBootApplication
@MapperScan("bo.edu.ucb.ingsoft.hhrr.dao")
public class HhrrApplication {

	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		factoryBean.setDataSource(dataSource);
		return factoryBean.getObject();
	}

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(HhrrApplication.class, args);
		try {
			// Inicializamos libreria de bots
			TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
			// Registramos la implementación de nuestro BOT
			telegramBotsApi.registerBot(new HhRrLongPollingBot(context));
		} catch (TelegramApiException e) {
			e.printStackTrace();
		}
	}

}
