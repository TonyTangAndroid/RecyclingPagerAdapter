package com.tonytangandroid.recycling.pager.adapter.demo;

import android.os.Bundle;

import java.util.Arrays;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(adapter());
    }

    private ImagePagerAdapter adapter() {
        return new ImagePagerAdapter(this, true, list());
    }

    private List<ImageBean> list() {
        return Arrays.asList(
                ImageBean.builder().height(400).width(400).path("https://upload.wikimedia.org/wikipedia/en/1/1b/Daredevil_season_1_poster.jpg").build(),
                ImageBean.builder().height(400).width(400).path("https://upload.wikimedia.org/wikipedia/en/5/5f/Daredevil_season_2_poster.jpg").build(),
                ImageBean.builder().height(400).width(400).path("https://upload.wikimedia.org/wikipedia/en/1/19/Daredevil_season_3_poster.jpg").build());
    }
}
