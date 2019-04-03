package com.example.jfilippo.retrofitexample.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.jfilippo.retrofitexample.R;
import com.example.jfilippo.retrofitexample.RetrofitExampleApp;
import com.example.jfilippo.retrofitexample.model.DaoSession;

public class UserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        DaoSession daoSession = ((RetrofitExampleApp) getApplication()).getDaoSession();

        final ListView  userList = (ListView) findViewById(R.id.userListView);
    }
}
