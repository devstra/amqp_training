package fr.lernejo.chat;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ChatMessageRepository {
    private static final List<String> messages = new ArrayList<>();

    void addChatMessage(String message) {
        messages.add(message);
    }

    List<String> getLastTenMessages() {
        try {
            return messages.subList(messages.size() - 10,
                messages.size());
        } catch (IndexOutOfBoundsException ex) {
            return messages;
        }
    }
}
