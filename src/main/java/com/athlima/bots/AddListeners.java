package com.athlima.bots;

import com.athlima.bots.listeners.Announce;
import com.athlima.bots.listeners.Help;
import com.athlima.bots.listeners.Nickname;
import com.athlima.bots.listeners.Ping;
import com.athlima.bots.members.MemberJoin;
import org.javacord.api.DiscordApi;

public class AddListeners {
    public AddListeners(DiscordApi api){
        api.addListener(new Ping());
        api.addListener(new Help());
        api.addListener(new Nickname());
        api.addListener(new Announce());
        api.addListener(new MemberJoin());
    }
}
