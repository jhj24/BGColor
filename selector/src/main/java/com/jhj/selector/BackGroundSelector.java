package com.jhj.selector;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Type;

/**
 * View 背景色以及点击、选择背景样式
 * <p>
 * Created by jhj on 19-1-9.
 */
public class BackGroundSelector {


    @IntDef({GradientDrawable.RECTANGLE, GradientDrawable.OVAL, GradientDrawable.LINE, GradientDrawable.RING})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Shape {
    }

    public static StateListDrawable pressed(int pressedColor, int normalColor) {
        return pressed(
                background(pressedColor, 0),
                background(normalColor, 0)
        );
    }

    public static StateListDrawable pressed(@Shape int type, int pressedColor, int normalColor) {
        return pressed(
                background(type, pressedColor, 0),
                background(type, normalColor, 0)
        );
    }

    public static StateListDrawable pressed(int pressedColor, int normalColor, float radio) {
        return pressed(
                background(pressedColor, radio),
                background(normalColor, radio)
        );
    }

    public static StateListDrawable pressed(@Shape int type, int pressedColor, int normalColor, float radio) {
        return pressed(
                background(type, pressedColor, radio),
                background(type, normalColor, radio)
        );
    }

    public static StateListDrawable pressed(int pressedColor, int normalColor, float radio, int frameWidth, int frameColor) {
        return pressed(
                background(pressedColor, radio, frameWidth, frameColor),
                background(normalColor, radio, frameWidth, frameColor)
        );
    }

    public static StateListDrawable pressed(@Shape int type, int pressedColor, int normalColor, float radio, int frameWidth, int frameColor) {
        return pressed(
                background(type, pressedColor, radio, frameWidth, frameColor),
                background(type, normalColor, radio, frameWidth, frameColor)
        );
    }

    public static StateListDrawable pressed(int pressedColor, int normalColor, float topLeftRadio, float topRightRadio, float bottomRightRadio, float bottomLeftRadio,
                                            int frameWidth, int frameColor, boolean isShowLeftFrame, boolean isShowTopFrame, boolean isShowRightFrame, boolean isShowBottomFrame) {
        return pressed(
                background(pressedColor, topLeftRadio, topRightRadio, bottomRightRadio, bottomLeftRadio,
                        frameWidth, frameColor, isShowLeftFrame, isShowTopFrame, isShowRightFrame, isShowBottomFrame),
                background(normalColor, topLeftRadio, topRightRadio, bottomRightRadio, bottomLeftRadio,
                        frameWidth, frameColor, isShowLeftFrame, isShowTopFrame, isShowRightFrame, isShowBottomFrame));
    }

    public static StateListDrawable pressed(@Shape int type, int pressedColor, int normalColor, float topLeftRadio, float topRightRadio, float bottomRightRadio, float bottomLeftRadio,
                                            int frameWidth, int frameColor, boolean isShowLeftFrame, boolean isShowTopFrame, boolean isShowRightFrame, boolean isShowBottomFrame) {
        return pressed(
                background(type, pressedColor, topLeftRadio, topRightRadio, bottomRightRadio, bottomLeftRadio,
                        frameWidth, frameColor, isShowLeftFrame, isShowTopFrame, isShowRightFrame, isShowBottomFrame),
                background(type, normalColor, topLeftRadio, topRightRadio, bottomRightRadio, bottomLeftRadio,
                        frameWidth, frameColor, isShowLeftFrame, isShowTopFrame, isShowRightFrame, isShowBottomFrame));
    }


    /**
     * 设置 View 点击、未点击时的 Drawable
     *
     * @param pressDrawable  点击时的 Drawable
     * @param normalDrawable 未点击时的 Drawable
     * @return StateListDrawable
     */
    public static StateListDrawable pressed(Drawable pressDrawable, Drawable normalDrawable) {
        StateListDrawable drawable = new StateListDrawable();
        drawable.addState(new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled}, pressDrawable);
        drawable.addState(new int[]{}, normalDrawable);
        return drawable;
    }

    public static StateListDrawable selected(int selectedColor, int normalColor) {
        return selected(
                background(selectedColor, 0),
                background(normalColor, 0)
        );
    }


    public static StateListDrawable selected(@Shape int type, int selectedColor, int normalColor) {
        return selected(
                background(type, selectedColor, 0),
                background(type, normalColor, 0)
        );
    }

    public static StateListDrawable selected(int selectedColor, int normalColor, float radio) {
        return selected(
                background(selectedColor, radio),
                background(normalColor, radio)
        );
    }

    public static StateListDrawable selected(@Shape int type, int selectedColor, int normalColor, float radio) {
        return selected(
                background(type, selectedColor, radio),
                background(type, normalColor, radio)
        );
    }

    public static StateListDrawable selected(int selectedColor, int normalColor, float radio, int frameWidth, int frameColor) {
        return selected(
                background(selectedColor, radio, frameWidth, frameColor),
                background(normalColor, radio, frameWidth, frameColor)
        );
    }

    public static StateListDrawable selected(@Shape int type, int selectedColor, int normalColor, float radio, int frameWidth, int frameColor) {
        return selected(
                background(type, selectedColor, radio, frameWidth, frameColor),
                background(type, normalColor, radio, frameWidth, frameColor)
        );
    }

    public static StateListDrawable selected(int selectedColor, int normalColor, float topLeftRadio, float topRightRadio, float bottomRightRadio, float bottomLeftRadio,
                                             int frameWidth, int frameColor, boolean isShowLeftFrame, boolean isShowTopFrame, boolean isShowRightFrame, boolean isShowBottomFrame) {
        return selected(
                background(selectedColor, topLeftRadio, topRightRadio, bottomRightRadio, bottomLeftRadio,
                        frameWidth, frameColor, isShowLeftFrame, isShowTopFrame, isShowRightFrame, isShowBottomFrame),
                background(normalColor, topLeftRadio, topRightRadio, bottomRightRadio, bottomLeftRadio,
                        frameWidth, frameColor, isShowLeftFrame, isShowTopFrame, isShowRightFrame, isShowBottomFrame));
    }


    public static StateListDrawable selected(@Shape int type, int selectedColor, int normalColor, float topLeftRadio, float topRightRadio, float bottomRightRadio, float bottomLeftRadio,
                                             int frameWidth, int frameColor, boolean isShowLeftFrame, boolean isShowTopFrame, boolean isShowRightFrame, boolean isShowBottomFrame) {
        return selected(
                background(type, selectedColor, topLeftRadio, topRightRadio, bottomRightRadio, bottomLeftRadio,
                        frameWidth, frameColor, isShowLeftFrame, isShowTopFrame, isShowRightFrame, isShowBottomFrame),
                background(type, normalColor, topLeftRadio, topRightRadio, bottomRightRadio, bottomLeftRadio,
                        frameWidth, frameColor, isShowLeftFrame, isShowTopFrame, isShowRightFrame, isShowBottomFrame));
    }

    /**
     * 设置View选中、未选中时的背景色
     *
     * @param selectedDrawable 选中时的 Drawable
     * @param normalDrawable   未选中时的 Drawable
     * @return StateListDrawable
     */
    public static StateListDrawable selected(Drawable selectedDrawable, Drawable normalDrawable) {
        StateListDrawable drawable = new StateListDrawable();
        drawable.addState(new int[]{android.R.attr.state_selected, android.R.attr.state_enabled}, selectedDrawable);
        drawable.addState(new int[]{}, normalDrawable);
        return drawable;
    }


    public static Drawable roundBackground(int color) {
        return background(GradientDrawable.OVAL, color, 0);
    }

    public static Drawable background(int color, float radio) {
        return background(GradientDrawable.RECTANGLE, color, radio);
    }

    public static Drawable background(@Shape int type, int color, float radio) {
        return background(type, color, radio, 0, 0);
    }

    public static Drawable background(int color, float radio, int frameWidth, int frameColor) {
        return background(GradientDrawable.RECTANGLE, color, radio, frameWidth, frameColor);
    }

    public static Drawable background(@Shape int type, int color, float radio, int frameWidth, int frameColor) {
        return background(type, color, radio, radio, radio, radio, frameWidth, frameColor, true, true, true, true);
    }


    public static Drawable background(int color, final float topLeftRadio, float topRightRadio, float bottomRightRadio, float bottomLeftRadio, int frameWidth,
                                      int frameColor, boolean isShowLeftFrame, boolean isShowTopFrame, boolean isShowRightFrame, boolean isShowBottomFrame) {
        return background(GradientDrawable.RECTANGLE, color, topLeftRadio, topRightRadio, bottomRightRadio, bottomLeftRadio, frameWidth,
                frameColor, isShowLeftFrame, isShowTopFrame, isShowRightFrame, isShowBottomFrame);

    }

    /**
     * View 背景色，可设置shape样式，四角圆角半径（角度可不同）、边框、边框颜色，以及某一边的边框是否显示
     *
     * @param type              shape样式
     * @param color             背景色
     * @param topLeftRadio      左上角圆角半径
     * @param topRightRadio     右上角圆角半径
     * @param bottomRightRadio  右下角圆角半径
     * @param bottomLeftRadio   左下角圆角半径
     * @param frameWidth        边框的宽度
     * @param frameColor        边距的颜色
     * @param isShowLeftFrame   是否显示左边框
     * @param isShowTopFrame    是否显示上边框
     * @param isShowRightFrame  是否显示右边框
     * @param isShowBottomFrame 是否显示下边框
     * @return Drawable
     */
    public static Drawable background(@Shape int type, int color, final float topLeftRadio, float topRightRadio, float bottomRightRadio, float bottomLeftRadio, int frameWidth,
                                      int frameColor, boolean isShowLeftFrame, boolean isShowTopFrame, boolean isShowRightFrame, boolean isShowBottomFrame) {

        float[] radio = new float[]{topLeftRadio, topLeftRadio, topRightRadio, topRightRadio, bottomRightRadio, bottomRightRadio, bottomLeftRadio, bottomLeftRadio};

        //边框
        GradientDrawable frameDrawable = new GradientDrawable();
        frameDrawable.setShape(type);
        frameDrawable.setCornerRadii(radio);
        frameDrawable.setStroke(frameWidth, frameColor);

        //背景
        GradientDrawable backgroundDrawable = new GradientDrawable();
        backgroundDrawable.setShape(type);
        backgroundDrawable.setCornerRadii(radio);
        backgroundDrawable.setColor(color);

        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{frameDrawable, backgroundDrawable});
        layerDrawable.setLayerInset(1,
                isShowLeftFrame ? frameWidth : 0,
                isShowTopFrame ? frameWidth : 0,
                isShowRightFrame ? frameWidth : 0,
                isShowBottomFrame ? frameWidth : 0);

        return layerDrawable;
    }
}
