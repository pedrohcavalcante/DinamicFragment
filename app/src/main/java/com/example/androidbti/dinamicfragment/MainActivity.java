package com.example.androidbti.dinamicfragment;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.widget.FrameLayout;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LeftFragment lf = new LeftFragment();
        RightFragment rf = new RightFragment();

        FragmentManager fragmentManager = getFragmentManager();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragLeft, lf);
        fragmentTransaction.add(R.id.fragRight, rf);

        fragmentTransaction.commit();
    }
}
