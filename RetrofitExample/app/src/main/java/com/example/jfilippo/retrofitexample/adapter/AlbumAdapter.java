package com.example.jfilippo.retrofitexample.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jfilippo.retrofitexample.model.Album;
import com.example.jfilippo.retrofitexample.R;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class AlbumAdapter extends BaseAdapter implements Filterable {

    Context context;
    LayoutInflater layoutInflater;

    List<Album> albumList;
    List<Album> albumListOriginal;

    public AlbumAdapter(Context cont, List<Album> albumL ) {
        super();
        this.context = cont;
        this.albumList = albumL;
    }

    @Override
    public int getCount() {
        return albumList.size();
    }

    @Override
    public Object getItem(int position) {
        return albumList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return albumList.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Album album = albumList.get(position);
        layoutInflater = LayoutInflater.from(context);

        View view = layoutInflater.inflate(R.layout.list_album_item, null);
        TextView titleTextView = (TextView) view.findViewById(R.id.titleTextView);
        titleTextView.setText(album.getTitle());

        final ImageView thumbImag = (ImageView) view.findViewById(R.id.ThumbImageView);
        final String thumbnailUrl = album.getThumbnailUrl();

        if(thumbnailUrl != null) {
            new Thread( () -> {
                try {
                    final Drawable drawable = Drawable.createFromStream((InputStream)
                            new URL(thumbnailUrl).getContent(), "src");
                    thumbImag.post(() -> thumbImag.setImageDrawable(drawable));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();
        }

        return view;
    }

    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence constraint) {
                final FilterResults finalReturn = new FilterResults();
                final List<Album> results = new ArrayList<>();

                if(albumListOriginal == null){
                    albumListOriginal = albumList;
                }

                if(constraint != null) {
                    if(albumListOriginal != null && albumListOriginal.size() > 0){
                        for (final Album album: albumListOriginal){
                            if(album.getTitle().toLowerCase().contains(constraint.toString())){
                                results.add(album);
                            }
                        }
                    }
                    finalReturn.values = results;
                }

                return finalReturn;
            }

            @Override
            protected void publishResults(CharSequence constraint, FilterResults results) {
                albumList = (List<Album>) results.values;
                notifyDataSetChanged();
            }
        };
    }
}
