package site.zhangyun.tool;

import android.util.Log;

/**
 * 日志类
 * Created by zhangyun on 2016/10/11.
 */
public class LogUtils {

    public static void  e(String tag,String msg){
        if(Constant.DEBUG){
            Log.e(tag,msg);
        }
    }

    public static void v(String tag, String msg){
        if(Constant.DEBUG){
            Log.v(tag,msg);
        }
    }

    public static void d(String tag, String msg){
        if(Constant.DEBUG){
            Log.d(tag,msg);
        }
    }

    public static void i(String tag, String msg){
        if(Constant.DEBUG){
            Log.i(tag,msg);
        }
    }

    public static void w(String tag, String msg){
        if(Constant.DEBUG){
            Log.w(tag,msg);
        }
    }
}
