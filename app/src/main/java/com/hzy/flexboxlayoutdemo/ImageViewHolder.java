package com.hzy.flexboxlayoutdemo;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by ziye_huang on 2018/10/23.
 */
public class ImageViewHolder extends RecyclerView.ViewHolder {

    public ImageView mImageView;

    public ImageViewHolder(@NonNull View itemView) {
        super(itemView);
        mImageView = itemView.findViewById(R.id.iv);
    }
}
