package com.example.application.shared;


import com.example.domain.shared.Command;

import java.util.Optional;
import java.util.UUID;

@FunctionalInterface
public interface CommandHandler<C extends Command> {

    Optional<UUID> handle(C command);
}
