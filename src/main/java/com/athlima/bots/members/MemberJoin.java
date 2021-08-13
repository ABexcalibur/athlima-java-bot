package com.athlima.bots.members;

import com.athlima.bots.embeds.MemberJoinEmbed;
import org.javacord.api.entity.user.User;
import org.javacord.api.event.server.member.ServerMemberJoinEvent;
import org.javacord.api.listener.server.member.ServerMemberJoinListener;

public class MemberJoin implements ServerMemberJoinListener {
    @Override
    public void onServerMemberJoin(ServerMemberJoinEvent event) {
        User user = event.getUser();
        event.getApi().getServerVoiceChannelById(875672247510110209L).get().createUpdater()
                .setName("Members: "+event.getApi().getServerById(875358993395093524L).get().getMemberCount())
                .update().join();
        if (user.isBot()) return;
        event.getServer().getTextChannelById(875682096046305290l).get().sendMessage(new MemberJoinEmbed().makeEmbed(user));
    }
}
