package com.example.publishers;

import com.example.domain.common.Event;

import java.util.concurrent.CompletableFuture;

public interface EventPublisher<E extends Event> {

    CompletableFuture<PublishResult> publish(E event);
}
