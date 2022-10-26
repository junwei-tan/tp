package seedu.address.commons.core;

import java.util.List;

import seedu.address.logic.commands.ClearCommand;
import seedu.address.logic.commands.ExitCommand;
import seedu.address.logic.commands.HelpCommand;
import seedu.address.logic.commands.RedoCommand;
import seedu.address.logic.commands.UndoCommand;
import seedu.address.logic.commands.contact.AddContactCommand;
import seedu.address.logic.commands.contact.DeleteContactCommand;
import seedu.address.logic.commands.contact.EditContactCommand;
import seedu.address.logic.commands.contact.FilterContactCommand;
import seedu.address.logic.commands.contact.FindContactCommand;
import seedu.address.logic.commands.contact.ListContactCommand;
import seedu.address.logic.commands.tag.AddTagCommand;
import seedu.address.logic.commands.tag.DeleteTagCommand;
import seedu.address.logic.commands.tag.ListTagCommand;
import seedu.address.logic.commands.task.*;


/**
 * Class containing summary of YellowBook's commands.
 */
public class Commands {
    public static List<String> getAllCommands() {
        return List.of(AddContactCommand.MESSAGE_EXAMPLE, // Contact-related
                DeleteContactCommand.MESSAGE_EXAMPLE,
                EditContactCommand.MESSAGE_EXAMPLE,
                FilterContactCommand.MESSAGE_EXAMPLE,
                FindContactCommand.MESSAGE_EXAMPLE,
                ListContactCommand.MESSAGE_EXAMPLE,
                AddTaskCommand.MESSAGE_EXAMPLE, // Task-related
                DeleteTaskCommand.MESSAGE_EXAMPLE,
                EditTaskCommand.MESSAGE_EXAMPLE,
                FilterTaskCommand.MESSAGE_EXAMPLE,
                FindTaskCommand.MESSAGE_EXAMPLE,
                ListTaskCommand.MESSAGE_EXAMPLE,
                MarkTaskCommand.MESSAGE_EXAMPLE,
                ReminderCommand.MESSAGE_EXAMPLE,
                SortByDeadlineCommand.MESSAGE_EXAMPLE,
                SortByIdCommand.MESSAGE_EXAMPLE,
                TaskProgressCommand.MESSAGE_EXAMPLE,
                UnmarkTaskCommand.MESSAGE_EXAMPLE,
                AddTagCommand.MESSAGE_EXAMPLE, // Tag-related
                DeleteTagCommand.MESSAGE_EXAMPLE,
                ListTagCommand.MESSAGE_EXAMPLE,
                ClearCommand.MESSAGE_EXAMPLE, // General
                ExitCommand.MESSAGE_EXAMPLE,
                HelpCommand.MESSAGE_EXAMPLE,
                RedoCommand.MESSAGE_EXAMPLE,
                UndoCommand.MESSAGE_EXAMPLE);
    }
}
