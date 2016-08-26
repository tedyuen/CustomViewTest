package com.tedyuen.customviewtest.demo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.tedyuen.customviewtest.R;
import com.tedyuen.customviewtest.demo.fragment.CustomImgContainerFragment;

/**
 * Created by tedyuen on 16-8-26.
 */
public class CustomImgContainerActivity extends AppCompatActivity {

    public ViewPager mPager;
    public CustomFragmentPagerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_img_container);

        mPager = (ViewPager)findViewById(R.id.pager);
        mAdapter = new CustomFragmentPagerAdapter(getSupportFragmentManager());
        mPager.setOffscreenPageLimit(3);
        mPager.setAdapter(mAdapter);

    }


    private static class CustomFragmentPagerAdapter extends FragmentStatePagerAdapter{

        public CustomFragmentPagerAdapter(FragmentManager fm) {
            super(fm);
        }



        @Override
        public Fragment getItem(int position) {
            CustomImgContainerFragment fragment = new CustomImgContainerFragment();
            Bundle args = new Bundle();
            args.putInt("f_type",position);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public int getCount() {
            return 3;
        }
    }
}
