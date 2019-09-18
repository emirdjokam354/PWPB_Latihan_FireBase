package com.example.latihan_firebase;

public class Tracks {
    private String trackId;
    private String trackName;
    private int trackRating;

    public Tracks(){

    }

    public Tracks(String trackId, String trackName, int trackRating) {
        this.trackId = trackId;
        this.trackName = trackName;
        this.trackRating = trackRating;
    }

    public String getTrackId() {
        return trackId;
    }

    public String getTrackName() {
        return trackName;
    }

    public int getTrackRating() {
        return trackRating;
    }
}




