package com.github.javarushcommunity.jrtb.command;

import org.apache.commons.lang3.StringUtils;
import org.telegram.telegrambots.meta.api.objects.Update;

/**
* Command interface for handling telegram-bot commands.
*/
public interface Command {

   /**
    * Main method, which is executing command logic.
    *
    * @param update provided {@link Update} object with all the needed data for command.
    */
   void execute(Update update);

   void unExecute();
}