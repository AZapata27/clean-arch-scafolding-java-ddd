package com.example.application.shared;

import com.example.domain.shared.Event;

@FunctionalInterface
public interface EventHandler<E extends Event> {
    void handle(E event);
}
