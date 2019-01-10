package com.jhj.selector;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.support.annotation.NonNull;

/**
 * View点击、选择背景样式
 * <p>
 * Created by jhj on 19-1-9.
 */
public class BGSelector {

    public static StateListDrawable pressed(int press, int normal) {
        return pressed(
                background(press, 0),
                background(normal, 0)
        );
    }

    public static StateListDrawable pressed(int press, int normal, float radio) {
        return pressed(
                background(press, radio),
                background(normal, radio)
        );
    }

    public static StateListDrawable pressed(int press, int normal, float radio, int lineWidth, int lineColor) {
        return pressed(
                background(press, radio, lineWidth, lineColor),
                background(normal, radio, lineWidth, lineColor)
        );
    }

    public static StateListDrawable pressed(int press, int normal, float topLeftRadio, float topRightRadio, float bottomRightRadio, float bottomLeftRadio,
                                            int lineWidth, int lineColor, boolean isShowLeft, boolean isShowTop, boolean isShowRight, boolean isShowBottom) {
        return pressed(
                background(press, topLeftRadio, topRightRadio, bottomRightRadio, bottomLeftRadio,
                        lineWidth, lineColor, isShowLeft, isShowTop, isShowRight, isShowBottom),
                background(normal, topLeftRadio, topRightRadio, bottomRightRadio, bottomLeftRadio,
                        lineWidth, lineColor, isShowLeft, isShowTop, isShowRight, isShowBottom));
    }


    public static StateListDrawable pressed(Drawable select, Drawable normal) {
        StateListDrawable drawable = new StateListDrawable();
        drawable.addState(new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled}, select);
        drawable.addState(new int[]{}, normal);
        return drawable;
    }

    public static StateListDrawable selected(int select, int normal) {
        return selected(
                background(select, 0),
                background(normal, 0)
        );
    }

    public static StateListDrawable selected(int select, int normal, float radio) {
        return selected(
                background(select, radio),
                background(normal, radio)
        );
    }

    public static StateListDrawable selected(int select, int normal, float radio, int lineWidth, int lineColor) {
        return selected(
                background(select, radio, lineWidth, lineColor),
                background(normal, radio, lineWidth, lineColor)
        );
    }

    public static StateListDrawable selected(int select, int normal, float topLeftRadio, float topRightRadio, float bottomRightRadio, float bottomLeftRadio,
                                             int lineWidth, int lineColor, boolean isShowLeft, boolean isShowTop, boolean isShowRight, boolean isShowBottom) {
        return selected(
                background(select, topLeftRadio, topRightRadio, bottomRightRadio, bottomLeftRadio,
                        lineWidth, lineColor, isShowLeft, isShowTop, isShowRight, isShowBottom),
                background(normal, topLeftRadio, topRightRadio, bottomRightRadio, bottomLeftRadio,
                        lineWidth, lineColor, isShowLeft, isShowTop, isShowRight, isShowBottom));
    }

    public static StateListDrawable selected(Drawable select, Drawable normal) {
        StateListDrawable drawable = new StateListDrawable();
        drawable.addState(new int[]{android.R.attr.state_selected, android.R.attr.state_enabled}, select);
        drawable.addState(new int[]{}, normal);
        return drawable;
    }


    public static Drawable background(int color, float radio) {
        return background(color, radio, 0, 0);
    }

    public static Drawable background(int color, float radio, int lineWidth, int lineColor) {
        return background(color, radio, radio, radio, radio, lineWidth, lineColor, true, true, true, true);
    }

    public static Drawable background(int color, final float topLeftRadio, float topRightRadio, float bottomRightRadio, float bottomLeftRadio, int lineWidth,
                                      int lineColor, boolean isShowLeftLine, boolean isShowTopLine, boolean isShowRightLine, boolean isShowBottomLine) {

        float[] radio = new float[]{topLeftRadio, topLeftRadio, topRightRadio, topRightRadio, bottomRightRadio, bottomRightRadio, bottomLeftRadio, bottomLeftRadio};

        //边框
        GradientDrawable frameDrawable = new GradientDrawable();
        frameDrawable.setShape(GradientDrawable.RECTANGLE);
        frameDrawable.setCornerRadii(radio);
        frameDrawable.setStroke(lineWidth, lineColor);

        //背景
        GradientDrawable backgroundDrawable = new GradientDrawable();
        backgroundDrawable.setShape(GradientDrawable.RECTANGLE);
        backgroundDrawable.setCornerRadii(radio);
        backgroundDrawable.setColor(color);

        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{frameDrawable, backgroundDrawable});
        layerDrawable.setLayerInset(1,
                isShowLeftLine ? lineWidth : 0,
                isShowTopLine ? lineWidth : 0,
                isShowRightLine ? lineWidth : 0,
                isShowBottomLine ? lineWidth : 0);

        return layerDrawable;
    }
}
