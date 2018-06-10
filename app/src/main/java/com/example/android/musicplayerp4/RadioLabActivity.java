package com.example.android.musicplayerp4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class RadioLabActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.episode_list);

        // Create an ArrayList of podcast episodes
        ArrayList<Episode> episodes = new ArrayList<>();
        episodes.add(new Episode("Poison Control",
                "6/1/18",
                "35 min"));
        episodes.add(new Episode("Unraveling Bolero",
                "5/22/18",
                "27 min"));
        episodes.add(new Episode("More or Less Human",
                "5/17/18",
                "63 min"));
        episodes.add(new Episode("Finding Yourself",
                "5/2/18",
                "57 min"));
        episodes.add(new Episode("Dark Side of the Earth",
                "4/26/18",
                "27 min"));
        episodes.add(new Episode("Border Triology Part 3",
                "4/20/18",
                "35 min"));
        episodes.add(new Episode("Border Triology Part 2",
                "4/5/18",
                "52 min"));
        episodes.add(new Episode("Border Triology Part 1",
                "3/23/18",
                "48 min"));
        episodes.add(new Episode("Rippin the Rainbow an Even Newer One",
                "3/15/18",
                "33 min"));
        episodes.add(new Episode("Smarty Plants",
                "2/13/18",
                "34 min"));

        // Create a EpisodeAdapter, whose data source is a list of Episode.
        EpisodeAdapter adapter = new EpisodeAdapter(this, episodes);

        //Find the View ID called @episode_list in the episode_list XML file
        ListView listView = findViewById(R.id.episode_list);

        // Make the ListView use the EpisodeAdapter created above, so that the
        // ListView will display list items for each Episode in the list.
        listView.setAdapter(adapter);
    }
}
