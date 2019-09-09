package com.ru8anraj.twoinone.modal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Movie {
    private String title;
    private int popularity;
    @JsonProperty("vote_count")
    private int voteCount;
    private boolean adult;

    public Movie() {

    }

    public Movie(String title, int popularity, int voteCount, boolean adult) {
        this.title = title;
        this.popularity = popularity;
        this.voteCount = voteCount;
        this.adult = adult;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    public int getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(int voteCount) {
        this.voteCount = voteCount;
    }

    public boolean isAdult() {
        return adult;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", popularity=" + popularity +
                ", voteCount=" + voteCount +
                ", adult=" + adult +
                '}';
    }
}
