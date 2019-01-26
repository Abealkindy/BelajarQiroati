package com.rosinante.belajarqiroati.models;

import java.io.Serializable;

import lombok.Data;

/*
 * Created by Rosinante24 on 26/01/19.
 */
@Data
public class YoutubeVideosModel implements Serializable {
    private String videoUrls;

    public YoutubeVideosModel() {

    }

    public YoutubeVideosModel(String videoUrls) {
        this.videoUrls = videoUrls;
    }
}
