package chris.bridewell.retrofitassignment;

import com.google.gson.annotations.SerializedName;

public class RetroPhoto {

    @SerializedName("imgAddress")
    private String imgAddress;
    @SerializedName("text")
    private String text;
    @SerializedName("songs")
    private String songs;

    public RetroPhoto(String imgAddress, String text, String songs) {
        this.imgAddress = imgAddress;
        this.text = text;
        this.songs = songs;
    }

    public String getImgAddress() {
        return this.imgAddress;
    }

    public void setImgAddress(String addr) {
        this.imgAddress = addr;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setSongs(String songs) {
        this.songs = songs;
    }

    public String getSongs() {
        return this.songs;
    }
}
