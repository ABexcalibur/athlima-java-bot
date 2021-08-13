package com.athlima.bots;

import com.athlima.bots.listeners.Announce;
import com.athlima.bots.listeners.Help;
import com.athlima.bots.listeners.Nickname;
import com.athlima.bots.listeners.Ping;
import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;
import org.javacord.api.util.event.ListenerManager;

import java.util.ListIterator;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

public class Main {
    public static final String prefix = "ath ";
    public static void main(String[] args) {
        DiscordApi api = new DiscordApiBuilder()
                .setAllIntents()
                .setToken(System.getenv("TOKEN"))
                .login().join();
        AddListeners addListeners = new AddListeners(api);
        System.out.println("Bot is online!");
    }
}
