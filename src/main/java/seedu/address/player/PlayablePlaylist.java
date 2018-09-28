package seedu.address.player;

import java.util.Arrays;
import java.util.List;

/**
 * Playlist structure used by Player
 */
public class PlayablePlaylist implements Playable {
    private List<PlayableTrack> playlist;
    private int currentIndex;
    private PlayableTrack current;
    public PlayablePlaylist() { // todo: take in Playlist model as parameter
        // get list of tracks in Playlist parameter and construct PlayableTracks
        // set playlist with list of PlayableTrack
        playlist = Arrays.asList(new PlayableTrack());
    }
    @Override
    public void play() {
        System.out.println("playableplaylist play");
        if (current == null) {
            currentIndex = 0;
            current = playlist.get(currentIndex);
        }
        current.play();
    }
}
