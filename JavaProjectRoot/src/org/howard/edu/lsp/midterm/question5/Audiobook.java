package org.howard.edu.lsp.midterm.question5;

/**
 * Represents an audiobook that implements the Streamable interface.
 * Provides common behaviors such as play, pause, stop, and specific behavior to set playback speed.
 */
public class Audiobook implements Streamable {
    private String title;

    /**
     * Constructor to initialize the audiobook with a title.
     * 
     * @param title the title of the audiobook
     */
    public Audiobook(String title) {
        this.title = title;
    }

    /**
     * Plays the audiobook content.
     */
    @Override
    public void play() {
        System.out.println("Playing audiobook: " + title);
    }

    /**
     * Pauses the audiobook content.
     */
    @Override
    public void pause() {
        System.out.println("Paused audiobook: " + title);
    }

    /**
     * Stops the audiobook content.
     */
    @Override
    public void stop() {
        System.out.println("Stopped audiobook: " + title);
    }

    /**
     * Sets the playback speed for the audiobook.
     * 
     * @param speed the speed at which the audiobook is played
     */
    public void setPlaybackSpeed(double speed) {
        System.out.println("Setting playback speed of audiobook: " + title + " " + speed + "x");
    }
}
