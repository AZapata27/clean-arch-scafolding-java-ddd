package com.example.handlers;


import com.example.domain.common.Command;

import java.util.Optional;
import java.util.UUID;

public interface CommandHandler<C extends Command> {

    Optional<UUID> handle(C command);
}
