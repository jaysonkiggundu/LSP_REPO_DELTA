/**
 * Interface to represent any type of streamable media content.
 * Provides common behaviors for all media types.
 */
public interface Streamable {
    /**
     * Plays the media content.
     */
    void play();

    /**
     * Pauses the media content.
     */
    void pause();

    /**
     * Stops the media content.
     */
    void stop();
}
