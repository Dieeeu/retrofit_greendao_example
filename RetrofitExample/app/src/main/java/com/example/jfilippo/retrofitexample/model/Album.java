package com.example.jfilippo.retrofitexample.model;

import com.google.gson.annotations.Expose;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Index;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

@javax.annotation.Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
@Entity(
        nameInDb = "ALBUM",
        indexes = {
                @Index(value = "id", unique = true)
        })
public class Album {

    @Property(nameInDb = "ALBUM_ID")
    @Expose
    private Long albumId;

    @Id
    @Property(nameInDb = "ID")
    @Expose
    private Long id;

    @Property(nameInDb = "THUMBNAIL_URL")
    @Expose
    private String thumbnailUrl;

    @Property(nameInDb = "TITLE")
    @Expose
    private String title;

    @Property(nameInDb = "URL")
    @Expose
    private String url;

    @Generated(hash = 768728780)
    public Album(Long albumId, Long id, String thumbnailUrl, String title,
            String url) {
        this.albumId = albumId;
        this.id = id;
        this.thumbnailUrl = thumbnailUrl;
        this.title = title;
        this.url = url;
    }

    @Generated(hash = 1609191978)
    public Album() { }

    //region Getter & Setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Long albumId) {
        this.albumId = albumId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    //endregion

}
