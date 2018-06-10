package com.example.android.musicplayerp4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class TedRadioHourActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.episode_list);

        //Create an ArrayList of podcast episodes
        ArrayList<Episode> episodes = new ArrayList<>();
        episodes.add(new Episode("Becoming Wise",
                "5/31/18",
                "53 min"));
        episodes.add(new Episode("Attention Please",
                "5/24/18",
                "52 min"));
        episodes.add(new Episode("Inspire to Action",
                "5/17/18",
                "52 min"));
        episodes.add(new Episode("The Fountain of Youth",
                "5/10/18",
                "53 min"));
        episodes.add(new Episode("The Act of Listening",
                "5/3/18",
                "53 min"));
        episodes.add(new Episode("Comfort Zone",
                "4/26/18",
                "51 min"));
        episodes.add(new Episode("The Meaning of Work",
                "4/19/18",
                "53 min"));
        episodes.add(new Episode("Everything is Connected",
                "4/12/18",
                "53 min"));
        episodes.add(new Episode("In Search of",
                "3/22/18",
                "53 min"));
        episodes.add(new Episode("Trust and Consequences",
                "3/29/18",
                "53 min"));

        // Create a EpisodeAdapter, whose data source is a list of Episode.
        EpisodeAdapter adapter = new EpisodeAdapter(this, episodes);

        //Find the View ID called @episode_list in the episode_list XML file
        ListView listView = findViewById(R.id.episode_list);

        // Make the ListView use the EpisodeAdapter created above, so that the
        // ListView will display list items for each Episode in the list.
        listView.setAdapter(adapter);
    }
}
