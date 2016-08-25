package com.tedyuen.customviewtest;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.tedyuen.customviewtest.demo.CountViewActivity;
import com.tedyuen.customviewtest.demo.MyListViewActivity;
import com.tedyuen.customviewtest.demo.TitleViewActivity;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        Button countView = (Button)view.findViewById(R.id.btn_count_view);
        countView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),CountViewActivity.class));
            }
        });

        Button titleView = (Button)view.findViewById(R.id.btn_titie_view);
        titleView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),TitleViewActivity.class));
            }
        });

        Button myListView = (Button)view.findViewById(R.id.btn_my_list_view);
        myListView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),MyListViewActivity.class));
            }
        });



        return view;
    }


}
