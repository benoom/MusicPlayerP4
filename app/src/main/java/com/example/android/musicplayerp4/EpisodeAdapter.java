package com.example.android.musicplayerp4;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class EpisodeAdapter extends ArrayAdapter<Episode> {

    public EpisodeAdapter(Activity context, ArrayList<Episode> words) { super(context, 0, words); }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.episode_list_item, parent, false);
        }

        // Get the current episode object at the given position
        Episode currentEpisode = getItem(position);


        // Find the TextView in the episode_list_item.xml layout with the ID episode_title
        // get the episode title from the currentEpisode object and
        // Set this text to episodeTitle
        TextView episodeTitle = listItemView.findViewById(R.id.episode_title);
        episodeTitle.setText(currentEpisode.getEpidsodeTitle());

        // Find the TextView in the episode_list_item.xml layout with the ID episode_date
        // get the episode date from the currentEpisode object and
        // Set this text to episodeDate
        TextView episodeDate = listItemView.findViewById(R.id.episode_date);
        episodeDate.setText(currentEpisode.getEpisodeDate());

        // Find the TextView in the episode_list_item.xml layout with the ID episode_duration
        // get the episode title from the currentEpisode object and
        // Set this text to episodeDuration
        TextView episodeDuration = listItemView.findViewById(R.id.episode_duration);
        episodeDuration.setText(currentEpisode.getEpisodeDuration());

        // Return the view
        return listItemView;
    }
}


