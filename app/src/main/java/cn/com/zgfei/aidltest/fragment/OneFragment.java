package cn.com.zgfei.aidltest.fragment;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import cn.com.zgfei.aidltest.R;

public class OneFragment extends Fragment {


    public static Fragment instance() {
        return new OneFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one, container, false);
        initView(view);
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("==onResume==", "=====");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e("==onPause==", "=====");
    }

    private void initView(View view) {
        Log.e("====", "=====");
        Button id = (Button) view.findViewById(R.id.bt_one_fragment);
        id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("====", "=====");
                dialog1();
            }
        });
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        Log.e("==OneFragment===", "====" + isVisibleToUser);
    }

    private void dialog1(){
        AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());  //先得到构造器
        builder.setTitle("提示"); //设置标题
        builder.setMessage("是否确认退出?"); //设置内容
        builder.setIcon(R.mipmap.ic_launcher);//设置图标，图片id即可
        builder.setPositiveButton("确定", new DialogInterface.OnClickListener() { //设置确定按钮
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss(); //关闭dialog
            }
        });
        builder.setNegativeButton("取消", new DialogInterface.OnClickListener() { //设置取消按钮
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        builder.setNeutralButton("忽略", new DialogInterface.OnClickListener() {//设置忽略按钮
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        //参数都设置完成了，创建并显示出来
        builder.create().show();
    }
}
