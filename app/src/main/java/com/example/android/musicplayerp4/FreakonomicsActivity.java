package com.example.android.musicplayerp4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FreakonomicsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.episode_list);

        //Create an ArrayList of podcast episodes
        ArrayList<Episode> episodes = new ArrayList<>();
        episodes.add(new Episode("How Stupid is Our Obsession with Lawns",
                "5/30/18",
                "30 min"));
        episodes.add(new Episode("Does Doing Good Give You License to be Bad?",
                "5/16/18",
                "37 min"));
        episodes.add(new Episode("5 Psychology Terms You're Probably Misusing",
                "5/9/18",
                "54 min"));
        episodes.add(new Episode("Evolution, Accelerated",
                "5/2/18",
                "40 min"));
        episodes.add(new Episode("The Invisible Paw",
                "4/4/18",
                "48 min"));
        episodes.add(new Episode("Everything You Always Wanted to Know About Money",
                "3/28/18",
                "47 min"));
        episodes.add(new Episode("The Stupidest Thing You Can Do with Your Money",
                "3/21/18",
                "49 min"));
        episodes.add(new Episode("How to Train Your Dragon Child",
                "3/14/18",
                "37 min"));
        episodes.add(new Episode("Does Early Education Come Way too Late?",
                "2/28/18",
                "46 min"));
        episodes.add(new Episode("Letting Go",
                "2/21/18",
                "45 min"));

        // Create a EpisodeAdapter, whose data source is a list of Episode.
        EpisodeAdapter adapter = new EpisodeAdapter(this, episodes);

        //Find the View ID called @episode_list in the episode_list XML file
        ListView listView = findViewById(R.id.episode_list);

        // Make the ListView use the EpisodeAdapter created above, so that the
        // ListView will display list items for each Episode in the list.
        listView.setAdapter(adapter);
    }
}
