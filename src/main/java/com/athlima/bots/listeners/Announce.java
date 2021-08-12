package com.athlima.bots.listeners;

import com.athlima.bots.Main;
import com.athlima.bots.embeds.AnnounceEmbed;
import org.javacord.api.entity.channel.TextChannel;
import org.javacord.api.entity.message.embed.EmbedBuilder;
import org.javacord.api.entity.permission.Role;
import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class Announce implements MessageCreateListener {
    @Override
    public void onMessageCreate(MessageCreateEvent event) {
        if (event.getMessageContent().toLowerCase().startsWith(Main.prefix+"announce")) {
            String[] message = event.getMessageContent().substring((Main.prefix+"announce ").length()).split(" ");
            List<Role> roles = event.getMessageAuthor().asUser().get().getRoles(event.getServer().get());
            Role role = event.getServer().get().getRoleById("875419697074561094").get();
            if (roles.contains(role)) {
                String title=message[0];
                EmbedBuilder embedBuilder = new AnnounceEmbed().makeEmbed(title, Arrays.copyOfRange(message, 1, message.length));
                event.getServer().get().getTextChannelById("875420422651387924").get().sendMessage(embedBuilder);
            } else {
                event.getChannel().sendMessage("You don't have the role " +
                        role.getName() +
                        " to announce");
            }
        }
    }
}
