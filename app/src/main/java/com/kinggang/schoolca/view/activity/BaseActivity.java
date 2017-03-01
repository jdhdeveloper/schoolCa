package com.kinggang.schoolca.view.activity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.Toast;

/**
 * Created by JDH on 2017/2/28.
 * 基础activity类
 */

public class BaseActivity extends AppCompatActivity {

    private  boolean isExit = false;

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        Log.d("BaseActivity",getClass().getSimpleName());
        ActivityCollector.addActivity(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.removeActivity(this);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode==KeyEvent.KEYCODE_BACK){
            ToQuitTheApp();
            return false;
        }else{
            return super.onKeyDown(keyCode, event);
        }
    }

    //封装ToQuitTheApp方法
    private void ToQuitTheApp() {
        if (isExit) {
            finish();
            System.exit(0);
        } else {
            isExit = true;
            Toast.makeText(getApplicationContext(), "再按一次退出APP", Toast.LENGTH_SHORT).show();
            mHandler.sendEmptyMessageDelayed(0, 2000);// 3秒后发送消息
        }
    }
    //创建Handler对象，用来处理消息
    private  Handler mHandler = new Handler() {

        @Override
        public void handleMessage(Message msg) {//处理消息
            super.handleMessage(msg);
            isExit = false;
        }
    };
}
