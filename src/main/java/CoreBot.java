import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.generics.LongPollingBot;

public class CoreBot extends TelegramLongPollingBot {
    @Override
    public String getBotUsername() {
        return "@Viavia_juls_bot";
    }

    @Override
    public String getBotToken() {
        return "5019695715:AAEfLZbCF7dVsbk7xqc8HK2gaAb0GW_uR3Q";
    }

    @Override
    public void onUpdateReceived(Update update) {
        if(update.hasMessage() && update.getMessage().hasText()){
            switch (update.getMessage().getText()) {
                case "/start":
                    try {
                        SendMessage sm = new SendMessageMy().createMessage(update,"Привет! Я банковский бот.");
                        sm.setReplyMarkup(new CreateButton().setButtons("пустая кнопка"));
                        execute(sm);
                        SendMessage sm1 = new SendMessageMy().createMessage(update, "");
                        //sm1.setReplyMarkup();
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                    break;
                case "Генерировать клиента":
                    try {
                        execute(SendMessage.builder()
                                .chatId(update.getMessage().getChatId().toString())
                                .text(new Text().getText())
                                .build());

                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                    break;
            }
        }
    }
}
