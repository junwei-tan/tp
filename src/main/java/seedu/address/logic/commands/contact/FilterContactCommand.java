package seedu.address.logic.commands.contact;

import static java.util.Objects.requireNonNull;

import seedu.address.commons.core.Messages;
import seedu.address.logic.commands.Command;
import seedu.address.logic.commands.CommandResult;
import seedu.address.model.Model;
import seedu.address.model.person.PersonContainsKeywordsPredicate;

/**
 * Filters and lists all persons in address book whose tag contains any of the argument keywords.
 * Keyword matching is case-insensitive.
 */
public class FilterContactCommand extends Command {

    public static final String COMMAND_WORD = "filterC";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Filters all persons whose tags contain any of "
            + "the specified keywords (case-insensitive) and displays them as a list with index numbers.\n"
            + "Parameters: KEYWORD [MORE_KEYWORDS]...\n"
            + "Example: " + COMMAND_WORD + " cs2101 cs2103t";

    private final PersonContainsKeywordsPredicate predicate;

    public FilterContactCommand(PersonContainsKeywordsPredicate predicate) {
        this.predicate = predicate;
    }

    @Override
    public CommandResult execute(Model model) {
        requireNonNull(model);
        model.updateFilteredPersonList(predicate);
        return new CommandResult(
                String.format(Messages.MESSAGE_PERSONS_LISTED_OVERVIEW, model.getFilteredPersonList().size()));
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof FilterContactCommand // instanceof handles nulls
                && predicate.equals(((FilterContactCommand) other).predicate)); // state check
    }
}
