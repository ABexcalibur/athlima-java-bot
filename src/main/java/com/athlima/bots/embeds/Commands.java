package com.athlima.bots.embeds;

import java.util.HashMap;
import java.util.Map;

public class Commands {
    public static Map<String, String> commands;
    static {
        commands = new HashMap<>();
        commands.put("Help", "Get the list of all the commands in the JavaCord instance of the Athlima BOT");
        commands.put("Nickname", "Edit the nickname of the provoking user");
        commands.put("Ping", "Returns the BOT ping and the message Ping of the JavaCord instance of the Athlima Bot");
        commands.put("Announce", "Used for making Announcement Embeds in server.(Only for Core-Committee");
    }
}
