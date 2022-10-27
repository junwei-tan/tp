package seedu.address.logic.commands;

import java.util.stream.Collectors;

import seedu.address.commons.core.Commands;
import seedu.address.model.Model;

/**
 * Format full help instructions for all add commands for display.
 */
public class HelpCommand extends Command {

    public static final String COMMAND_WORD = "help";

    public static final String MESSAGE_EXAMPLE = COMMAND_WORD;

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Shows program usage instructions.\n"
            + "Example: " + COMMAND_WORD;

    private static final String USER_GUIDE_URL =
            "https://ay2223s1-cs2103t-f11-4.github.io/tp/UserGuide.html#quick-start";

    public static final String SHOWING_HELP_MESSAGE = "User Guide: "
            + USER_GUIDE_URL + "\n\n"
            + "Sample Commands: \n"
            + Commands.getAllCommands().stream().map(command -> command + "\n").collect(Collectors.joining());

    @Override
    public CommandResult execute(Model model) {
        return new CommandResult(SHOWING_HELP_MESSAGE, false, false);
    }
}
