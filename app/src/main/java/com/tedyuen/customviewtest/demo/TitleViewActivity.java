package com.tedyuen.customviewtest.demo;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.tedyuen.customviewtest.R;
import com.tedyuen.customviewtest.view.TitleView;

/**
 * Created by tedyuen on 16-8-25.
 */
public class TitleViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title_view);

        TitleView titleView = (TitleView)findViewById(R.id.title_view);
        titleView.setTitleText("this is a title");

    }
}
