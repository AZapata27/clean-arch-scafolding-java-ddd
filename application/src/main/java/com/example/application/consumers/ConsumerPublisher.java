package com.example.application.consumers;

import com.example.application.shared.EventPublisher;
import com.example.domain.customers.ConsumerCreatedEvent;

public interface ConsumerPublisher extends EventPublisher<ConsumerCreatedEvent> {
}
