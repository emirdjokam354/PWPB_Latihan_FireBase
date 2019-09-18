package com.example.latihan_firebase;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class TrackList  extends ArrayAdapter<Tracks> {
    private Activity context;
    List<Tracks> tracks;

    public TrackList(Activity context, List<Tracks> tracks){
        super(context, R.layout.layout_track_list, tracks);
        this.context = context;
        this.tracks = tracks;
    }
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View ListViewItem = inflater.inflate(R.layout.layout_track_list, null, true);

        TextView textViewName = (TextView) ListViewItem.findViewById(R.id.textViewName);
        TextView textViewRating = (TextView) ListViewItem.findViewById(R.id.textViewRating);

        Tracks track = tracks.get(position);
        textViewName.setText(track.getTrackName());
        textViewRating.setText (String.valueOf(track.getTrackRating()));

        return ListViewItem;
    }
}
