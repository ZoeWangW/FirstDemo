package com.zoe.firstdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends BaseActivity {
    @Override

    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("MainActivity","Task id is"+getTaskId());
        requestWindowFeature(Window.FEATURE_NO_TITLE);//隐藏标题,必须在setcontentview之前
        setContentView(R.layout.activity_main);//引入布局文件
        Button button1 = (Button) findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {//点击MainActivity启动SecondActivity
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });
    }
    protected void onRestart(){
        super.onRestart();
        Log.d("MainActivity","onRestart");
    }

}



