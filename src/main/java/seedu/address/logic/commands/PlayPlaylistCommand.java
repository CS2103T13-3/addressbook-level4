package seedu.address.logic.commands;

import seedu.address.logic.CommandHistory;
import seedu.address.model.Model;
import seedu.address.player.JxMusicPlayer;

import static java.util.Objects.requireNonNull;
import static seedu.address.model.Model.PREDICATE_SHOW_ALL_PERSONS;

/**
 * Lists all persons in the address book to the user.
 */
public class PlayPlaylistCommand extends Command {

    public static final String COMMAND_WORD = "play"; // todo change to "play p/" when parser can accept multiword command

    public static final String MESSAGE_SUCCESS = "Play a playlist";


    @Override
    public CommandResult execute(Model model, CommandHistory history) {
        new JxMusicPlayer().play();
        return new CommandResult(MESSAGE_SUCCESS);
    }
}
