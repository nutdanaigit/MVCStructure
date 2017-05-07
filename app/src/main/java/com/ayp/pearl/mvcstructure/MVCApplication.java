package com.ayp.pearl.mvcstructure;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.widget.Toast;

import com.ayp.pearl.mvcstructure.util.ScreenUtils;
import com.inthecheesefactory.thecheeselibrary.manager.Contextor;

/**
 * Created by Nutdanai on 11/19/2016.
 */

public class MVCApplication extends Application {
    private static final String TAG = "MVCApplication";
    @Override
    public void onCreate() {
        super.onCreate();
        //Initialize thing(s) here
        Contextor.getInstance().init(getApplicationContext());
        int screecWidth = ScreenUtils.getInstance().getScreenWidth();
        int screenHeight = ScreenUtils.getInstance().getScreenHeight();
        //Toast screenWidth & screenHeight
        Toast.makeText(this,"screenWidth: "+screecWidth +" screenHeight: "+ screenHeight,Toast.LENGTH_SHORT).show();

        //Separator by Android Version
        if(Build.VERSION.SDK_INT >= 21){
            //Run on android 21+
        }else{
            //Run on android 1-20
        }
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}
