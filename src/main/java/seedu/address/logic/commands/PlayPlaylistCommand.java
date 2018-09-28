package seedu.address.logic.commands;

import seedu.address.logic.CommandHistory;
import seedu.address.model.Model;
import seedu.address.player.JxMusicPlayer;

/**
 * Lists all persons in the address book to the user.
 */
public class PlayPlaylistCommand extends Command {

    // todo change to "play p/" when parser can use p/ for parameter
    public static final String COMMAND_WORD = "play";

    public static final String MESSAGE_SUCCESS = "Play a playlist";


    @Override
    public CommandResult execute(Model model, CommandHistory history) {
        new JxMusicPlayer().play();
        return new CommandResult(MESSAGE_SUCCESS);
    }
}
