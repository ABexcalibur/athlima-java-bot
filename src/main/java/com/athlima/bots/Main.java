package com.athlima.bots;

import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;

public class Main {
    public static final String prefix = "ath ";
    public static void main(String[] args) {
        DiscordApi api = new DiscordApiBuilder()
                .setAllIntents()
                .setToken(System.getenv("TOKEN"))
                .login().join();
        AddListeners addListeners = new AddListeners(api);
        System.out.println("Javacord is online!");
    }
}
