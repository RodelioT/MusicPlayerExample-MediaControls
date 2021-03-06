package ca.google.musicplayerexample;

// Represents a Song object
public class Song {
    // Parameters for a song
    private long id;
    private String title;
    private String artist;
    // You can add more song metadata here if you wish

    // Constructor method
    public Song(long songID, String songTitle, String songArtist) {
        id=songID;
        title=songTitle;
        artist=songArtist;
    }

    // GET methods for the parameters
    public long getID(){return id;}
    public String getTitle(){return title;}
    public String getArtist(){return artist;}
}
