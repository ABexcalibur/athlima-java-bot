package com.athlima.bots.embeds;

import org.javacord.api.entity.message.embed.EmbedBuilder;
import org.javacord.api.entity.user.User;

import java.awt.*;

public class MemberJoinEmbed {
    public EmbedBuilder makeEmbed(User user) {
        return new EmbedBuilder()
                .setTitle("Athlima Server")
                .setDescription("Welcome to the Athlima official Discord server "+user.getMentionTag())
                .setColor(Color.getHSBColor((float)Math.random()*360,(float)Math.random()*360, (float)Math.random()*360))
                .setAuthor("Athlima BOT", "http://google.com/", "https://cdn.discordapp.com/embed/avatars/2.png");
    }
}
