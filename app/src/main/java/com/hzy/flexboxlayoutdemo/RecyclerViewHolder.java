package com.hzy.flexboxlayoutdemo;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by ziye_huang on 2018/10/23.
 */
public class RecyclerViewHolder extends RecyclerView.ViewHolder {
    public TextView mTextView;

    public RecyclerViewHolder(@NonNull View itemView) {
        super(itemView);
        mTextView = itemView.findViewById(R.id.tv);
    }
}
