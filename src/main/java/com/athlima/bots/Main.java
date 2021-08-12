package com.athlima.bots;

import com.athlima.bots.commands.Ping;
import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;

public class Main {
    public static final String prefix = "ath ";
    public static void main(String[] args) {
        DiscordApi api = new DiscordApiBuilder()
                .setToken(System.getenv().get("TOKEN"))
                .login().join();
        api.addListener(new Ping());
        System.out.println("Bot is online!");
    }
}
