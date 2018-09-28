package seedu.address.player;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;

public class JxMusicPlayer implements Player {
    private PlayablePlaylist pp;
//    private static MediaPlayer mp;
    @Override
    public void play() {
        // todo take in Playlist model as parameter, then construct PlayablePlaylist from it
        System.out.println("jxmusicplayer play");
        pp = new PlayablePlaylist();
//        mp = pp.getMp();
        pp.play();
//        String fileName = "library/scarborough.mp3";
//        Media media = new Media(new File(fileName).toURI().toString());
//        mp = new MediaPlayer(media);
//        mp.setOnReady(() -> {
//            System.out.println("ready");
//            mp.play();
//        });
    }
}
