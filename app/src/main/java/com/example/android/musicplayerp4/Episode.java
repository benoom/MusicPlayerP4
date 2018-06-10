package com.example.android.musicplayerp4;

/*
    Episode class to store the episode's title, date of release and duration of the episode
 */
public class Episode {

    // The title of the episode
    private String mEpisodeTitle;

    //Date of release of the episode
    private String mEpisodeDate;

    //Duration of the episode
    private String mEpisodeDuration;

    /**Create a new Episode object
     *@param title is the title of the episode
     *@param date is the date of the release of the episode
     *@param duration is the duration of the episode
     */
    public Episode(String title, String date, String duration) {
        this.mEpisodeTitle = title;
        this.mEpisodeDate = date;
        this.mEpisodeDuration = duration;
    }

    // Get the title for the episode
    public String getEpidsodeTitle() {
        return this.mEpisodeTitle;
    }

    // Get the date for the episode
    public String getEpisodeDate() {
        return this.mEpisodeDate;
    }

    // Get the duration of the episode
    public String getEpisodeDuration() {
        return this.mEpisodeDuration;
    }
}
