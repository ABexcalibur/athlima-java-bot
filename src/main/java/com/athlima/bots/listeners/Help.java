package com.athlima.bots.listeners;

import com.athlima.bots.Main;
import com.athlima.bots.embeds.HelpEmbed;
import org.javacord.api.entity.message.embed.EmbedBuilder;
import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;

public class Help implements MessageCreateListener {
    @Override
    public void onMessageCreate(MessageCreateEvent event) {
        boolean bool = event.getMessageContent().equalsIgnoreCase(Main.prefix+"help") ||
                event.getMessageContent().equalsIgnoreCase(Main.prefix.trim()) ||
                event.getMessageContent().equalsIgnoreCase(Main.prefix+"commands") ||
                event.getMessageContent().equalsIgnoreCase(Main.prefix+"command");
        if (bool) {
            EmbedBuilder embed = new HelpEmbed().makeEmbed();
            event.getChannel().sendMessage(embed);
        }
    }
}
