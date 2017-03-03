package com.kinggang.schoolca.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by JDH on 2017/3/3.
 * 工具类
 */

public class Utils {

    private static Toast toast;

    public static void showToast(Context context, String content){
         if (toast == null){
             toast = Toast.makeText(context,content,Toast.LENGTH_SHORT);
           }else{
           toast.setText(content);
         }
        toast.show();
    }
}
