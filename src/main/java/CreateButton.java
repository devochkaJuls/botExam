import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class CreateButton {

    public ReplyKeyboardMarkup setButtons(String buttonsName){
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(createButtons(buttonsName));
        return replyKeyboardMarkup;
    }


    private List<KeyboardRow> createButtons(String buttonsName){
        List<KeyboardRow> keyboardRowList = new ArrayList<>();
        KeyboardRow keyboardRow1 = new KeyboardRow();
        keyboardRow1.add(new KeyboardButton("Генерировать клиента"));
        keyboardRowList.add(keyboardRow1);
        return keyboardRowList;
    }

    public InlineKeyboardMarkup setInlineButton(List<List<InlineKeyboardButton>> inlineKeyboardButtonsList){
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        inlineKeyboardMarkup.setKeyboard(createInlineKeyboardButtons("buttonInline"));
        return inlineKeyboardMarkup;
    }

    private List<List<InlineKeyboardButton>> createInlineKeyboardButtons(String buttonName){
        List<List<InlineKeyboardButton>> listListInlineButton = new ArrayList<>();
        List<InlineKeyboardButton> inlineButtonList = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton = new InlineKeyboardButton();
        inlineKeyboardButton.setText(buttonName);
        inlineKeyboardButton.setCallbackData(buttonName);
        inlineButtonList.add(inlineKeyboardButton);
        listListInlineButton.add(inlineButtonList);
        return listListInlineButton;
    }
}
