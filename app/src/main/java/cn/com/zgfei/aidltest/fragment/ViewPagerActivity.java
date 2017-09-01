package cn.com.zgfei.aidltest.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import cn.com.zgfei.aidltest.R;


public class ViewPagerActivity extends AppCompatActivity {
    private LinearLayout layout;
    private Button button;

    private List<Fragment> list = new ArrayList<>();
    private boolean isFirst = true;

    public static void start(Context context) {
        Intent intent = new Intent(context, ViewPagerActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        initData();
        initView();
    }

    private void initData() {
        list.add(OneFragment.instance());
        list.add(TwoFragment.instance());
        list.add(ThreeFragment.instance());
    }

    private void initView() {
        layout = (LinearLayout) findViewById(R.id.ll_view_pager);
        button = (Button) findViewById(R.id.bt_add_or_hide);

        final FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        final Fragment instance = OneFragment.instance();
        final Fragment instance1 = TwoFragment.instance();
        transaction.add(R.id.ll_view_pager, instance).add(R.id.ll_view_pager, instance1).show(instance).commit();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transaction.hide(instance)/*.show(instance1)*/;
                Log.e("===11==", "=====");
                if (isFirst) {
                    isFirst = false;
                } else {
                    Log.e("===22==", "=====");
                }
            }
        });


        /*ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        viewPager.setOffscreenPageLimit(3);
        viewPager.setCurrentItem(0);

        MyPagerAdapter adapter = new MyPagerAdapter(getSupportFragmentManager(), list);
        viewPager.setAdapter(adapter);*/

    }
}
