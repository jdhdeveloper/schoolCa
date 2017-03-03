package com.kinggang.schoolca.view.activity;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;

import com.kinggang.schoolca.R;

public class LoginActivity extends BaseActivity implements View.OnClickListener{

    private InputMethodManager manager = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //设置按钮点击监听事件
        findViewById(R.id.btn_login_quit).setOnClickListener(this);
        findViewById(R.id.btn_login).setOnClickListener(this);
        //实例化软键盘管理对象
        manager  = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        //点击空白处隐藏软件盘
        if(event.getAction() == MotionEvent.ACTION_DOWN){
            if(getCurrentFocus()!=null && getCurrentFocus().getWindowToken()!=null){
                manager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
            }
        }
        return super.onTouchEvent(event);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_login_quit:
                //退出登录界面
                Toast.makeText(this,"you clicked the quitBtn",Toast.LENGTH_SHORT).show();
                //finish();
                break;
            case R.id.btn_login:
                /**
                 * 1.加密用户名和密码
                 * 2.上传到服务器进行比对
                 * 3.接收服务器返回的值：1代表正确；2代表错误
                 * 4.正确则登录成功；错误则提示
                 */
                Toast.makeText(this,"you clicked the loginBtn",Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }
}
