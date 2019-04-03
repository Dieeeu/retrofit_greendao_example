package com.example.jfilippo.retrofitexample.interfaces;

import com.example.jfilippo.retrofitexample.model.Album;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface AlbumAPI {

    @GET("photos")
    Call<List<Album>> getPhotos();

    @GET("photos/{id}")
    Call<List<Album>> groupList(@Path("id") int groupId, @QueryMap Map<String, String> options);

    @POST("photos/new")
    Call<Album> createAlbum(@Body Album album);



    static AlbumAPI buildClient() {
        return new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .addConverterFactory(JacksonConverterFactory.create())
                .build().create(AlbumAPI.class);
    }
}
