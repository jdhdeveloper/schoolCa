package com.kinggang.schoolca.view.activity;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Toast;

import com.kinggang.schoolca.R;

public class LoginActivity extends BaseActivity {

    private boolean isExit = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
//    @Override
//    public boolean onKeyDown(int keyCode, KeyEvent event) {
//        if (keyCode==KeyEvent.KEYCODE_BACK){
//            ToQuitTheApp();
//            return false;
//        }else{
//            return super.onKeyDown(keyCode, event);
//        }
//    }
//
//    //封装ToQuitTheApp方法
//    private void ToQuitTheApp() {
//        if (isExit) {
//            finish();
//            System.exit(0);
//        } else {
//            isExit = true;
//            Toast.makeText(LoginActivity.this, "再按一次退出APP", Toast.LENGTH_SHORT).show();
//            mHandler.sendEmptyMessageDelayed(0, 2000);// 3秒后发送消息
//        }
//    }
//    //创建Handler对象，用来处理消息
//    private Handler mHandler = new Handler() {
//
//        @Override
//        public void handleMessage(Message msg) {//处理消息
//            super.handleMessage(msg);
//            isExit = false;
//        }
//    };
}
