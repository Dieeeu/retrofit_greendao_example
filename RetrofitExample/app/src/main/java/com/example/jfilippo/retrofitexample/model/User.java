package com.example.jfilippo.retrofitexample.model;


import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Index;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

@Entity(
        nameInDb = "USER",
        indexes = {
                @Index(value = "id", unique = true)
        })
public class User {

    @Id
    @Property(nameInDb = "ID")
    private Long id;

    @NotNull
    @Index(unique = true)
    @Property(nameInDb = "EMAIL")
    private String email;

    @Property(nameInDb = "NAME")
    private String name;

    @Property(nameInDb = "PASSWORD")
    private String password;


    @Generated(hash = 511772164)
    public User(Long id, @NotNull String email, String name, String password) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.password = password;
    }

    @Generated(hash = 586692638)
    public User() { }


    // region Getter n Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    // endregion
}
