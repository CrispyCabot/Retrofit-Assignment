package chris.bridewell.retrofitassignment;

import com.google.gson.annotations.SerializedName;

public class RetroPhoto {

    @SerializedName("imgAddress")
    private String imgAddress;
    @SerializedName("text")
    private String text;

    public RetroPhoto(String imgAddress, String text) {
        this.imgAddress = imgAddress;
        this.text = text;
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
}
