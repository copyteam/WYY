package com.example.jasmine.wuyiyun;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.util.Log;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.example.jasmine.wuyiyun.MainPagerAdapter;
//import com.tarena.tbook.R;
//
//import com.tarena.wyy.fragment.CartFragment;
//import com.tarena.wyy.fragment.MineFragment;
//import com.tarena.wyy.fragment.StoreFragment;

//import org.xutils.view.annotation.ViewInject;
//import org.xutils.x;

import java.util.ArrayList;

import java.util.ArrayList;

public class MainActivity extends FragmentActivity {
    private ViewPager mViewPager;
    private RadioGroup mRadioGroup;
    private RadioButton tabstore;
    private RadioButton tabcart;
    private RadioButton tabmime;
    private ArrayList<Fragment> fragments;
    private MainPagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setListener();
    }
    private void setListener(){
        mRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.radioStore:
                        tabstore.setTextColor(Color.WHITE);
                        mViewPager.setCurrentItem(0);
                        break;
                    case R.id.radioCart:
                        tabcart.setTextColor(Color.WHITE);
                        mViewPager.setCurrentItem(1);
                        break;
                    case R.id.radioMine:
                        tabmime.setTextColor(Color.WHITE);
                        mViewPager.setCurrentItem(2);
                        break;
                }
            }
        });
        mViewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {
                if(v!=0){
                    //当前是第3页
                    //设置第三个fragment header的透明度
                    MimeFragment fragment = (MimeFragment) fragments.get(2);
                    //fragment.slide(v);
                }
            }

            @Override
            public void onPageSelected(int i) {

            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });
    }
}
