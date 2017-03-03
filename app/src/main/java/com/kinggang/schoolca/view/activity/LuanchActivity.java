package com.kinggang.schoolca.view.activity;

import android.os.Bundle;
import android.webkit.WebView;

import com.kinggang.schoolca.R;

/**
 * app启动页面
 * @author JDH
 * 1.加载静态html页面作为启动页
 * 2.检测服务器是否有下一版的启动页，若有则下载到本地，若没有则不操作
 * 3.启动页倒计时3秒后自动关闭，可以设置点击跳过
 */
public class LuanchActivity extends BaseActivity {

    private WebView mWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luanch);

        mWebView = (WebView) findViewById(R.id.webview_launch);

    }


}
