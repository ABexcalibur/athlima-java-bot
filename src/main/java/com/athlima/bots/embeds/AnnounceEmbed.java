package com.athlima.bots.embeds;

import org.javacord.api.entity.message.embed.EmbedBuilder;

import java.awt.*;

public class AnnounceEmbed {
    public EmbedBuilder makeEmbed(String title, String[] bodyArr) {
        String body = arrayToString(bodyArr);
        return new EmbedBuilder()
                .setTitle(title)
                .setDescription(body)
                .setColor(Color.getHSBColor((float)Math.random()*360,(float)Math.random()*360, (float)Math.random()*360))
                .setAuthor("Athlima BOT", "http://google.com/", "https://cdn.discordapp.com/embed/avatars/2.png");
    }

    private String arrayToString(String[] bodyArr) {
        String ret = "";
        for (String s:bodyArr) {
            ret += s+" ";
        }
        return ret;
    }
}
