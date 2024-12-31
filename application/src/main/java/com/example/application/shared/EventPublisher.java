package com.example.application.shared;

import com.example.domain.shared.Event;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@FunctionalInterface
public interface EventPublisher<E extends Event> {

    CompletableFuture<PublishResult> publish(List<E> events);
}
