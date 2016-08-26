package com.tedyuen.customviewtest.demo.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tedyuen.customviewtest.R;

/**
 * Created by tedyuen on 16-8-26.
 */
public class CustomImgContainerFragment extends BaseFragment {

    private int fragmentType = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle args = getArguments();
        if (args != null ) {
            fragmentType = args.getInt("f_type");
        }
        System.out.println("fragmentType1: "+fragmentType);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        System.out.println("fragmentType2: "+fragmentType);

        View rootView = null;
        switch (fragmentType){
            case 0:
                rootView = inflater.inflate(R.layout.fragment_custom_img_container_1, container, false);
                break;
            case 1:
                rootView = inflater.inflate(R.layout.fragment_custom_img_container_2, container, false);
                break;
            case 2:
                rootView = inflater.inflate(R.layout.fragment_custom_img_container_3, container, false);
                break;
        }
        return rootView;
    }


    @Override
    protected int getLayoutResId() {
        return 0;
    }
}
