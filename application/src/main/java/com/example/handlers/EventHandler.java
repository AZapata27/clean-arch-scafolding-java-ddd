package com.example.handlers;

import com.example.domain.customers.model.events.Event;

public interface EventHandler<E extends Event> {
    void handle(E event);
}
