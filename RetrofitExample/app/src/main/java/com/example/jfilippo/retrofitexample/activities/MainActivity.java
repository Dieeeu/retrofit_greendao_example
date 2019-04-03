package com.example.jfilippo.retrofitexample.activities;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.jfilippo.retrofitexample.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.albumBtn:
                intent = new Intent(MainActivity.this, AlbumActivity.class);
                startActivity(intent);
                break;

            case R.id.button2:
                break;

            case R.id.userListBtn:
                break;

            default:
                break;
        }
    }
}
