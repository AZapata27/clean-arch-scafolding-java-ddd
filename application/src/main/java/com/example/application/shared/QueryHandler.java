package com.example.application.shared;

import com.example.domain.shared.Query;

@FunctionalInterface
public interface QueryHandler<Q extends Query<R>, R> {
    R handle(Q query);
}
