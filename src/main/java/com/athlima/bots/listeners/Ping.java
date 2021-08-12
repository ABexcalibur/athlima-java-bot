package com.athlima.bots.listeners;

import com.athlima.bots.Main;
import org.javacord.api.entity.message.Message;
import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;

import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Ping implements MessageCreateListener{
    public void onMessageCreate(MessageCreateEvent event) {
        if(event.getMessageContent().equalsIgnoreCase(Main.prefix + "ping")) {
            Long start = System.currentTimeMillis();
            CompletableFuture<Duration> durationCompletableFuture = event.getApi().measureRestLatency();
            try {
                Duration duration = durationCompletableFuture.get();
                CompletableFuture<Message> messageCompletableFuture = event.getChannel().sendMessage(duration.toMillis()+"ms");
                Long end = System.currentTimeMillis();
                Message message = messageCompletableFuture.get();
                message.edit("Ping:" +
                        duration.toMillis() +
                        "ms" +
                        "\n" +
                        "Message Ping:" +
                        (end-start) +
                        "ms");
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
    }
}
