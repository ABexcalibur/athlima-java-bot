package com.athlima.bots;

import com.athlima.bots.listeners.Announce;
import com.athlima.bots.listeners.Help;
import com.athlima.bots.listeners.Nickname;
import com.athlima.bots.listeners.Ping;
import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;

public class Main {
    public static final String prefix = "ath ";
    public static void main(String[] args) {
        DiscordApi api = new DiscordApiBuilder()
                .setToken(System.getenv("TOKEN"))
                .login().join();
        api.addListener(new Ping());
        api.addListener(new Help());
        api.addListener(new Nickname());
        api.addListener(new Announce());
        System.out.println("Bot is online!");
    }
}
