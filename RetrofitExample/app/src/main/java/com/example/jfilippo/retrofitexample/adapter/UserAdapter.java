package com.example.jfilippo.retrofitexample.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

import com.example.jfilippo.retrofitexample.model.User;

import java.util.List;

public class UserAdapter extends BaseAdapter implements Filterable {

    Context context;
    LayoutInflater layoutInflater;

    List<User> userList;
    List<User> userListOriginal;

    public UserAdapter(Context cont, List<User> userL) {
        super();
        this.context = cont;
        this.userList = userL;

    }


    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }

    @Override
    public Filter getFilter() {
        return null;
    }
}
