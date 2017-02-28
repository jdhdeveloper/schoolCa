package com.kinggang.schoolca.view.activity;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JDH on 2017/2/28.
 * 活动管理器
 */

public class ActivityCollector {

    public static List<Activity> activities = new ArrayList<>();

    public static void addActivity(Activity activity){
        activities.add(activity);
    }

    public static void removeActivity(Activity activity){
        activities.remove(activity);
    }

    /**
     * 遍历List，把没有退出的activity都退出了
     */
    public static void finishAll(){
        for (Activity actity: activities){
            if (!actity.isFinishing()){
                actity.finish();
            }
        }
    }
}
