package com.tonytangandroid.recycling.pager.adapter.demo;

import com.google.auto.value.AutoValue;


@AutoValue
public abstract class ImageBean {

    public static Builder builder() {
        return new AutoValue_ImageBean.Builder();
    }

    public abstract int width();

    public abstract int height();

    public abstract String path();

    @AutoValue.Builder
    public abstract static class Builder {

        public abstract Builder path(String path);

        public abstract Builder width(int width);

        public abstract Builder height(int height);

        public abstract ImageBean build();
    }
}