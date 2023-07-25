package ru.top.nodnok.message;

import java.time.LocalDateTime;

//сообщение содержащее строку
//класс для хранения и передачи данных (DTO) data transfer object
public class StringMessage implements InterfaceMessage{
    private String text; //текст сообщения
    private LocalDateTime textTime; //время создания сообщения

    public StringMessage() {
    }

    public StringMessage(String text) {
        this.text = text;
        textTime = LocalDateTime.now();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getTextTime() {
        return textTime;
    }

    @Override
    public String toString() {
        return "text= '" + text + '\'' + ", textTime= " + textTime ;
    }
}

