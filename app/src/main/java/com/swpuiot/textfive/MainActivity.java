package com.swpuiot.textfive;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        // 第一步 确定子项布局
        // 第二步 书写Adapter
        // 第三步 初始化Listview
        ListView listView = (ListView) findViewById(R.id.image_list);
        listView.setAdapter(new MyAdapter(this));
        // 第四步 设置点击事件

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // position
            }
        });



    }
}
