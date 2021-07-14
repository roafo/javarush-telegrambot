package com.github.javarushcommunity.jrtb.command;

import org.junit.jupiter.api.DisplayName;

import static com.github.javarushcommunity.jrtb.command.CommandName.STOP;
import static com.github.javarushcommunity.jrtb.command.StopCommand.STOP_MESSAGE;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Unit-level testing for StopCommand")
class StopCommandTest extends AbstractCommandTest {
    @Override
    String getCommandName() {
        return STOP.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return STOP_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new StopCommand(sendBotMessageService);
    }
}