package com.kinggang.schoolca.application;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.Toast;

import com.kinggang.schoolca.cockroach.Cockroach;

/**
 * Created by Administrator on 2017/2/28.
 */

public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        install();
    }

    /**
     * 注册Cockroach,该框架避免程序出现未知异常时crash掉
     */
    private void install(){
        Cockroach.install(new Cockroach.ExceptionHandler() {

            // handlerException内部建议手动try{  你的异常处理逻辑  }catch(Throwable e){ } ，以防handlerException内部再次抛出异常，导致循环调用handlerException

            @Override
            public void handlerException(final Thread thread, final Throwable throwable) {
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            Log.d("Cockroach", thread + "\n" + throwable.toString());
                            throwable.printStackTrace();
                            Toast.makeText(getApplicationContext(), "Exception Happend\n" + thread + "\n" + throwable.toString(), Toast.LENGTH_SHORT).show();
                        } catch (Throwable e) {

                        }
                    }
                });
            }
        });
    }
}
