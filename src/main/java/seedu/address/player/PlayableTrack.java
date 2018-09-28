package seedu.address.player;

import java.io.File;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

/**
 * Playlist structure used by Player
 */
public class PlayableTrack implements Playable {
    private static MediaPlayer mediaPlayer;
    // static cos otherwise java garbage collects mediaplayer in like 5 seconds
    // then the track only play for 5 seconds before it suddenly stop
    private String fileName;

    public PlayableTrack() { // todo take in Track model as parameter
        fileName = "library/scarborough fair.mp3";
        Media media = new Media(new File(fileName).toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setOnReady(() -> {
            System.out.println("ready");
        });
    }

    @Override
    public void play() {
        System.out.println("playabletrack play");
        mediaPlayer.play();
    }

    public void setOnEndOfMedia(Runnable runnable) {
        mediaPlayer.setOnEndOfMedia(runnable);
    }

    public MediaPlayer getMediaPlayer() {
        return mediaPlayer;
    }
}
