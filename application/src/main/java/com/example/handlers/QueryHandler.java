package com.example.handlers;

import com.example.domain.common.Query;

public interface QueryHandler<Q extends Query<R>, R> {
    R handle(Q query);
}
