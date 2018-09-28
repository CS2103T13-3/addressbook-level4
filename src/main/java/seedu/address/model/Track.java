package seedu.address.model;

import java.io.File;

import seedu.address.commons.util.CollectionUtil;

/**
 * Represents a track in JxMusic
 */
public class Track {
    // storage scans library folder for mp3 files and create track
    // storage saves playlist's list of track by using the track's file name
    // if storage finds this inconvenient, can change to String instead
    private final File file;

    public Track(File file) throws Exception {
        CollectionUtil.requireAllNonNull(file);
        if (isValidMp3(file)) {
            this.file = file;
        } else {
            // todo throw a better exception
            throw new Exception("invalid mp3");
        }
    }

    public File getFile() {
        return file;
    }

    public String getFileName() {
        return file.getName();
    }

    private boolean isValidMp3(File file) {
        // todo implement method to check if mp3 file is valid so that it's playable with javafx media
        return true;
    }
}
