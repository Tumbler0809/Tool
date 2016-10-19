package site.zhangyun.tool;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.Window;

import java.util.LinkedList;

/**
 * test
 * Activity的子类
 * Created by zhangyun on 2015/7/6.
 * Email:2488234525@qq.com
 */
public class BaseActivity extends FragmentActivity implements View.OnClickListener{
    public static LinkedList<Activity> mlist=new LinkedList<Activity>();

    /**
     * Activity生命周期开始的地方,在这里将其添加进LinkedList中储存
     * @param savedInstanceState activity消失之前所保存的状态信息，先前被关闭现在又活动了恢复时所用的数据
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        mlist.add(this);
    }

    /**
     * Activity生命周期结束的地方,在这里将其从LinkedList中移除
     */
    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        mlist.remove(this);
    }

    /***
     *用于程序结束退出，当然代码中每个activity都要继承该BaseActivity
     */
    public static void finish_all() {
        for (Activity mactivity : mlist) {
            mactivity.finish();
        }
        mlist.clear();
    }

    /**
     * 子类重写此方法减少代码量
     * @param v 被点击的view
     */
    @Override
    public void onClick(View v) {

    }
    @Override
    public void finish() {
        // TODO Auto-generated method stub
        super.finish();
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }

    @Override
    public void startActivity(Intent intent) {
        // TODO Auto-generated method stub
        super.startActivity(intent);
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }
}
