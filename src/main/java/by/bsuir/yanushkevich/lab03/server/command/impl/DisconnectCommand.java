package by.bsuir.yanushkevich.lab03.server.command.impl;

import by.bsuir.yanushkevich.lab03.server.command.Command;
import by.bsuir.yanushkevich.lab03.server.command.exception.CommandException;
import by.bsuir.yanushkevich.lab03.server.model.AuthType;
import by.bsuir.yanushkevich.lab03.server.service.ServiceFactory;

public class DisconnectCommand implements Command {
    public String complete(Object caller, String request) throws CommandException {
        ServiceFactory.getInstance().getAuthService().setAuthType(caller, AuthType.UNAUTH);
        return "Bye bye!";
    }
}
