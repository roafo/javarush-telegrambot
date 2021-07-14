package com.github.javarushcommunity.jrtb.command;

public enum CommandName {

    START("/start"),
    STOP("/stop"),
    CONTINUE("/continue"),
    HELP("/help"),
    NO("/")
    ;

    private final String commandName;

    CommandName(String commandName) {
        this.commandName = commandName;
    }

    public String getCommandName() {
        return commandName;
    }
}
