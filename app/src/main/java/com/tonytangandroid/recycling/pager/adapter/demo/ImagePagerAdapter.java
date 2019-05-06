package com.tonytangandroid.recycling.pager.adapter.demo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.tonytangandroid.recycling.pager.adapter.RecyclingPagerAdapter;

import java.util.List;


public class ImagePagerAdapter extends RecyclingPagerAdapter {

    private final LayoutInflater inflater;
    private Context context;
    private List<ImageBean> imageBeanList;
    private boolean isInfiniteLoop;

    public ImagePagerAdapter(Context context, boolean isInfiniteLoop, List<ImageBean> imageBeanList) {
        this.context = context;
        this.imageBeanList = imageBeanList;
        this.isInfiniteLoop = isInfiniteLoop;
        inflater = LayoutInflater.from(context);
    }


    @Override
    public int getCount() {
        return isInfiniteLoop ? Integer.MAX_VALUE : imageBeanList.size();
    }

    private int getPosition(int position) {
        return isInfiniteLoop ? position % imageBeanList.size() : position;
    }


    @Override
    public View getView(int position, View view, ViewGroup container) {
        ViewHolder holder;
        if (view != null) {
            holder = (ViewHolder) view.getTag();
        } else {
            view = inflater.inflate(R.layout.item_image_view, container, false);
            holder = new ViewHolder(view);
            view.setTag(holder);
        }
        ImageBean imageBean = imageBeanList.get(getPosition(position));
        Glide.with(context).load(imageBean.path()).into(holder.imageView);
        return view;
    }


    private static class ViewHolder {
        final ImageView imageView;

        public ViewHolder(View view) {
            imageView = view.findViewById(R.id.image_view);
        }
    }
}
