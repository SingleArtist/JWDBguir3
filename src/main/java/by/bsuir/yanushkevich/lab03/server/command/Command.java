package by.bsuir.yanushkevich.lab03.server.command;

import by.bsuir.yanushkevich.lab03.server.command.exception.CommandException;

public interface Command {
    String complete(Object caller, String request) throws CommandException;
}
