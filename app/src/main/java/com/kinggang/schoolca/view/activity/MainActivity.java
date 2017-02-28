package com.kinggang.schoolca.view.activity;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Toast;

import com.kinggang.schoolca.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //判断是否登录，若已经登录则跳到首页；若没有登录则跳转到登录页面
        Intent intent = new Intent();
        intent.setClass(this,LoginActivity.class);
        startActivity(intent);
        finish();
    }


}
