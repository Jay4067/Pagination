package com.learning.pagiation.Models;

import com.google.gson.annotations.SerializedName;

public class Wallpaper {

    @SerializedName("src")
    public  ImageDimensions src;

    public Wallpaper(ImageDimensions src) {
        this.src = src;
    }

    public ImageDimensions getSrc() {
        return src;
    }

    public void setSrc(ImageDimensions src) {
        this.src = src;
    }


    private class ImageDimensions {

        @SerializedName("medium")
        private String medium;

        @SerializedName("large")
        private String large;

        public ImageDimensions(String medium, String large) {
            this.medium = medium;
            this.large = large;
        }

        public String getMedium() {
            return medium;
        }

        public void setMedium(String medium) {
            this.medium = medium;
        }

        public String getLarge() {
            return large;
        }

        public void setLarge(String large) {
            this.large = large;
        }
    }
}
