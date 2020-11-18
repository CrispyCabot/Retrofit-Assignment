package chris.bridewell.retrofitassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class AlbumDetails extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AlbumDetailsAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album_details);

        Intent intent = getIntent();
        String songs = intent.getStringExtra(MainActivity.EXTRA_SONGS);
        String[] songList = songs.split("\\|", 0);
        for (int i=1; i<songList.length+1; i++)
            songList[i-1] = i + ". " +songList[i-1].trim();

        recyclerView = (RecyclerView) findViewById(R.id.detailsRecyclerView);
        adapter = new AlbumDetailsAdapter(songList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(AlbumDetails.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}