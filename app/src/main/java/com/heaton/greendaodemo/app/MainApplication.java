package com.heaton.greendaodemo.app;

import android.app.Application;
import android.content.Context;

import com.heaton.greendaodemo.dao.DaoMaster;
import com.heaton.greendaodemo.dao.DaoSession;

import org.greenrobot.greendao.database.Database;

/**
 * Created by zhanggonglin on 2018/11/7.
 */

public class MainApplication extends Application {

    public static MainApplication mainApplication;

    @Override
    public void onCreate() {
        super.onCreate();
        mainApplication = MainApplication.this;
    }
}
