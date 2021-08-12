package com.athlima.bots.embeds;

import org.javacord.api.entity.message.embed.*;

import java.awt.*;
import java.io.File;
import java.net.URL;
import java.time.Instant;
import java.util.List;
import java.util.Optional;

public class HelpEmbed {
    public EmbedBuilder makeEmbed(){
        try {
            return new EmbedBuilder()
                    .setTitle("Help")
                    .setDescription("List of Commands")
                    .setColor(Color.CYAN)
                    .setAuthor("Athlima BOT", "http://google.com/", "https://cdn.discordapp.com/embed/avatars/2.png")
                    .addField("Commands", getCommands());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new EmbedBuilder()
                .setTitle("Title")
                .setDescription("Description");
    }

    private String getCommands() {
        String str = "";
        File folder = new File("src/main/java/com/athlima/bots/listeners");
        File[] files = folder.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i].isFile()) {
                str += "ath " + files[i].getName().substring(0,files[i].getName().length()-5) +
                        "\n\n";
            } else if (files[i].isDirectory()) {
                System.out.println("Directory " + files[i].getName());
            }
        }
        return str;
    }
}
