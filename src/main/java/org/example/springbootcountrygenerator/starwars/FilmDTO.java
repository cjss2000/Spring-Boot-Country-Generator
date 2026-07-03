package org.example.springbootcountrygenerator.starwars;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FilmDTO {

    @JsonProperty("title")
    private String title;
    @JsonProperty("episode_id")
    private String episodeId;

    public FilmDTO(String title, String episodeId){
        this.title = title;
        this.episodeId = episodeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEpisodeId() {
        return episodeId;
    }

    public void setEpisodeId(String episodeId) {
        this.episodeId = episodeId;
    }






}
