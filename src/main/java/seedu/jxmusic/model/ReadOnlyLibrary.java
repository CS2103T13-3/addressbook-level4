package seedu.jxmusic.model;

import javafx.collections.ObservableList;

/**
 * Unmodifiable view of an jxmusic book
 */
public interface ReadOnlyLibrary {

    /**
     * Returns an unmodifiable view of the playlists list.
     * This list will not contain any duplicate playlists.
     */
    ObservableList<Playlist> getPlaylistList();

}