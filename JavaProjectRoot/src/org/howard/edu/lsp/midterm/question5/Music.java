/**
 * Represents a music track that implements the Streamable interface.
 * Provides common behaviors such as play, pause, stop, and specific behavior to add to a playlist.
 */
public class Music implements Streamable {
    private String title;

    /**
     * Constructor to initialize the music track with a title.
     * 
     * @param title the title of the music track
     */
    public Music(String title) {
        this.title = title;
    }

    /**
     * Plays the music content.
     */
    @Override
    public void play() {
        System.out.println("Playing music: " + title);
    }

    /**
     * Pauses the music content.
     */
    @Override
    public void pause() {
        System.out.println("Paused music: " + title);
    }

    /**
     * Stops the music content.
     */
    @Override
    public void stop() {
        System.out.println("Stopped music: " + title);
    }

    /**
     * Adds the music track to a playlist.
     * 
     * @param playlistName the name of the playlist to which the track is added
     */
    public void addToPlaylist(String playlistName) {
        System.out.println("Added " + title + " to " + playlistName + " playlist");
    }
}
