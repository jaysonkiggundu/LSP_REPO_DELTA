package org.howard.edu.lsp.midterm.question5;

/**
 * Represents a movie that implements the Streamable interface.
 * Provides common behaviors such as play, pause, stop, and specific behavior to rewind the movie.
 */
public class Movie implements Streamable {
    private String title;

    /**
     * Constructor to initialize the movie with a title.
     * 
     * @param title the title of the movie
     */
    public Movie(String title) {
        this.title = title;
    }

    /**
     * Plays the movie content.
     */
    @Override
    public void play() {
        System.out.println("Playing movie: " + title);
    }

    /**
     * Pauses the movie content.
     */
    @Override
    public void pause() {
        System.out.println("Paused movie: " + title);
    }

    /**
     * Stops the movie content.
     */
    @Override
    public void stop() {
        System.out.println("Stopped movie: " + title);
    }

    /**
     * Rewinds the movie by a given number of seconds.
     * 
     * @param seconds the number of seconds to rewind
     */
    public void rewind(int seconds) {
        System.out.println("Rewinding movie: " + title + " by " + seconds + " seconds");
    }
}
