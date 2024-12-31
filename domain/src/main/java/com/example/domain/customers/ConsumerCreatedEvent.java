package com.example.domain.customers;

import com.example.domain.shared.Event;

public record ConsumerCreatedEvent(Consumer consumer) implements Event {
}
