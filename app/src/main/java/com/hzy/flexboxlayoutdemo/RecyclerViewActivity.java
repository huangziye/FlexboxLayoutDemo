package com.hzy.flexboxlayoutdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.google.android.flexbox.AlignItems;
import com.google.android.flexbox.FlexDirection;
import com.google.android.flexbox.FlexWrap;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.flexbox.JustifyContent;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ziye_huang on 2018/10/23.
 */
public class RecyclerViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(this);
        flexboxLayoutManager.setFlexWrap(FlexWrap.WRAP);
        flexboxLayoutManager.setFlexDirection(FlexDirection.ROW);
        flexboxLayoutManager.setAlignItems(AlignItems.FLEX_START);
        flexboxLayoutManager.setJustifyContent(JustifyContent.FLEX_START);
        recyclerView.setLayoutManager(flexboxLayoutManager);

        //        List<String> data = Arrays.asList("肯定是九分", "但是发射点发射点和广泛大概", "的身份热热更好的法国队", "但是访问韩国国会", "恢复单身的法国上的", "微软大师傅大师傅", "阿凡达很多都是", "绯闻而事发当时", "和风格反对个撒大哥", "啊的风格风格", "会发到付上的", "和梵蒂冈诗歌风格", "而韩国粉红色", "史蒂芬", "和反对共和");
        //        recyclerView.setAdapter(new RecyclerAdapter(this, data));


        List<Integer> data = new ArrayList<>();
        data.add(R.drawable.img_1);
        data.add(R.drawable.img_2);
        data.add(R.drawable.img_3);
        data.add(R.drawable.github_mark_64px);
        data.add(R.drawable.img_4);
        data.add(R.drawable.img_5);
        data.add(R.drawable.github_mark_64px);
        data.add(R.drawable.img_6);
        data.add(R.drawable.img_7);
        data.add(R.drawable.img_8);
        data.add(R.drawable.github_mark_64px);
        data.add(R.drawable.img_9);
        data.add(R.drawable.img_10);
        data.add(R.drawable.github_mark_64px);
        data.add(R.drawable.img_11);
        data.add(R.drawable.github_mark_64px);
        data.add(R.drawable.img_12);
        data.add(R.drawable.img_13);
        data.add(R.drawable.img_14);
        data.add(R.drawable.img_15);
        data.add(R.drawable.github_mark_64px);
        data.add(R.drawable.img_16);
        data.add(R.drawable.img_17);
        data.add(R.drawable.img_18);
        data.add(R.drawable.github_mark_64px);
        data.add(R.drawable.img_19);
        data.add(R.drawable.img_20);
        data.add(R.drawable.img_21);
        data.add(R.drawable.img_22);
        data.add(R.drawable.img_23);
        data.add(R.drawable.img_24);
        data.add(R.drawable.img_25);
        data.add(R.drawable.img_26);
        data.add(R.drawable.img_27);
        data.add(R.drawable.img_28);
        recyclerView.setAdapter(new ImageAdapter(this, data));
    }
}
