package seedu.address.player;

/**
 * The actual implemented player to be used by Logic component
 */
public class JxMusicPlayer implements Player {
    private PlayablePlaylist pp;
    @Override
    public void play() {
        // todo take in Playlist model as parameter, then construct PlayablePlaylist from it
        System.out.println("jxmusicplayer play");
        pp = new PlayablePlaylist();
        pp.play();
    }
}
