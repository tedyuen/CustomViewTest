package com.tedyuen.customviewtest.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.tedyuen.customviewtest.R;
import com.tedyuen.customviewtest.demo.adapter.MyAdapter;
import com.tedyuen.customviewtest.view.MyListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tedyuen on 16-8-25.
 */
public class MyListViewActivity extends AppCompatActivity {

    MyListView myListView;

    private MyAdapter adapter;

    private List<String> contentList = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_list_view);
        initList();
        myListView = (MyListView) findViewById(R.id.my_list_view);
        myListView.setOnDeleteListener(new MyListView.OnDeleteListener() {
            @Override
            public void onDelete(int index) {
                contentList.remove(index);
                adapter.notifyDataSetChanged();
            }
        });
        adapter = new MyAdapter(this, 0, contentList);
        myListView.setAdapter(adapter);
    }

    private void initList() {
        for(int i=1;i<=20;i++){
            contentList.add("Cont{ent Item "+i);
        }
    }
}
