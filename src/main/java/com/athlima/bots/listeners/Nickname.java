package com.athlima.bots.listeners;

import com.athlima.bots.Main;
import org.javacord.api.entity.user.User;
import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;

import java.util.Locale;
import java.util.Optional;

public class Nickname implements MessageCreateListener {
    @Override
    public void onMessageCreate(MessageCreateEvent event) {
        if (event.getMessageContent().toLowerCase().startsWith(Main.prefix+"nickname")) {
            Optional<User> u = event.getMessageAuthor().asUser();
            String newNick = event.getMessageContent().substring((Main.prefix+"nickname").length());
            u.ifPresent(user -> user.updateNickname(event.getServer().get(), newNick, "Requested by the user"));
            event.getChannel().sendMessage(event.getMessageAuthor().asUser().get().getMentionTag()+", Your nickname has been successfully changed");
        }
    }
}
