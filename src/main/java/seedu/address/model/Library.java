package seedu.address.model;

import java.util.List;

import seedu.address.commons.util.CollectionUtil;

/**
 * Represents the library in JxMusic
 */
public class Library {
    // tracks are mp3 files in /library folder
    // so it can change if new file added into folder when program is running
    private List<Track> tracks;
    // playlists are from library.json file
    private List<Playlist> playlists;

    public Library(List<Track> tracks, List<Playlist> playlists) {
        CollectionUtil.requireAllNonNull(tracks, playlists);
        this.tracks = tracks;
        this.playlists = playlists;
    }

}
