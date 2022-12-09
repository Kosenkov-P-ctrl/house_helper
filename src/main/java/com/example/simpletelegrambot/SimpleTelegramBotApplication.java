package com.example.simpletelegrambot;

import com.example.simpletelegrambot.config.BotConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class SimpleTelegramBotApplication {
    public static void main(String[] args){
        SpringApplication.run(SimpleTelegramBotApplication.class, args);
    }
}
