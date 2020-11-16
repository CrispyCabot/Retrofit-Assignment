package chris.bridewell.retrofitassignment;

import android.widget.ImageView;

import java.util.ArrayList;

public class Post {
    private String text;
    private ImageView img;

    public Post() {
        text = "Empty";
  //      img.setImageResource(R.drawable.default_img); //A basic image
    }

    public Post(String text, int imgId) {
        this.text = text;
        this.img.setImageResource(imgId);
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setImageAddress(int imgId) {
        this.img.setImageResource(imgId);
    }

    public String getText() {
        return this.text;
    }

    public ImageView getImageAddress() {
        return this.img;
    }

    public static ArrayList<Post> createSamples(int amt) {
        ArrayList<Post> posts = new ArrayList<Post>();
        for (int i=0; i<amt; i++) {
            posts.add(new Post());
        }
        return posts;
    }
}
