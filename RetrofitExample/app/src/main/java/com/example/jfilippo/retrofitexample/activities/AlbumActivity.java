package com.example.jfilippo.retrofitexample.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.jfilippo.retrofitexample.R;
import com.example.jfilippo.retrofitexample.RetrofitExampleApp;
import com.example.jfilippo.retrofitexample.adapter.AlbumAdapter;
import com.example.jfilippo.retrofitexample.interfaces.AlbumAPI;
import com.example.jfilippo.retrofitexample.model.Album;
import com.example.jfilippo.retrofitexample.model.DaoSession;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AlbumActivity extends AppCompatActivity {

    private AlbumAPI client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);

        // TODO: use GREENDAO to don't need anymore the api if that doesn't have changed 
//        DaoSession daoSession = ((RetrofitExampleApp) getApplication()).getDaoSession();

        final ListView albumList = (ListView) findViewById(R.id.albumListView);

        client = AlbumAPI.buildClient();
        Call<List<Album>> call = client.getPhotos();
        call.enqueue(new Callback<List<Album>>() {
            @Override
            public void onResponse(Call<List<Album>> call, Response<List<Album>> response) {
                List<Album> albums = response.body();
                AlbumAdapter adapter = new AlbumAdapter(AlbumActivity.this, albums);
                albumList.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<Album>> call, Throwable t) { }
        });
    }

}
