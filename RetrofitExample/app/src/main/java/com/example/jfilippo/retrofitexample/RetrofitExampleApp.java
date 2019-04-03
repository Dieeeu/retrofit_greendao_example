package com.example.jfilippo.retrofitexample;

import android.app.Application;

import com.example.jfilippo.retrofitexample.model.DaoMaster;
import com.example.jfilippo.retrofitexample.model.DaoSession;

import org.greenrobot.greendao.database.Database;

public class RetrofitExampleApp extends Application {

    private DaoSession daoSession;

    @Override
    public void onCreate() {
        super.onCreate();

        // prepara o green-dao
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, "master-db");
        Database db = helper.getWritableDb();
        daoSession = new DaoMaster(db).newSession();
    }

    public DaoSession getDaoSession() {
        return daoSession;
    }

}
