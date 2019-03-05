package com.jhj.selector;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v4.content.ContextCompat;

/**
 * View点击、选择背景样式
 * <p>
 * Created by jhj on 19-1-9.
 */
public class BackGroundSelector {

    /**
     * 设置View点击、未点击时的背景色
     *
     * @param pressedColor 点击时的背景色
     * @param normalColor  未点击时的背景色
     * @return StateListDrawable
     */
    public static StateListDrawable pressed(int pressedColor, int normalColor) {
        return pressed(
                background(pressedColor, 0),
                background(normalColor, 0)
        );
    }

    /**
     * 设置View点击、未点击时的背景色，可设置四角圆角半径
     *
     * @param pressedColor 点击时的背景色
     * @param normalColor  未点击时的背景色
     * @param radio        四角圆角半径
     * @return StateListDrawable
     */
    public static StateListDrawable pressed(int pressedColor, int normalColor, float radio) {
        return pressed(
                background(pressedColor, radio),
                background(normalColor, radio)
        );
    }

    /**
     * 设置View点击、未点击时的背景色，可设置四角圆角半径、边框以及边框颜色
     *
     * @param pressedColor 点击时的背景色
     * @param normalColor  未点击时的背景色
     * @param radio        四角圆角半径
     * @param frameWidth   边框的宽度
     * @param frameColor   边框的颜色
     * @return StateListDrawable
     */
    public static StateListDrawable pressed(int pressedColor, int normalColor, float radio, int frameWidth, int frameColor) {
        return pressed(
                background(pressedColor, radio, frameWidth, frameColor),
                background(normalColor, radio, frameWidth, frameColor)
        );
    }

    /**
     * 设置View点击、未点击时的背景色，可设置四角圆角半径（角度可不同）、边框、边框颜色，以及某一边的边框是否显示
     *
     * @param pressedColor      点击时的背景色
     * @param normalColor       未点击时的背景色
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
     * @return StateListDrawable
     */
    public static StateListDrawable pressed(int pressedColor, int normalColor, float topLeftRadio, float topRightRadio, float bottomRightRadio, float bottomLeftRadio,
                                            int frameWidth, int frameColor, boolean isShowLeftFrame, boolean isShowTopFrame, boolean isShowRightFrame, boolean isShowBottomFrame) {
        return pressed(
                background(pressedColor, topLeftRadio, topRightRadio, bottomRightRadio, bottomLeftRadio,
                        frameWidth, frameColor, isShowLeftFrame, isShowTopFrame, isShowRightFrame, isShowBottomFrame),
                background(normalColor, topLeftRadio, topRightRadio, bottomRightRadio, bottomLeftRadio,
                        frameWidth, frameColor, isShowLeftFrame, isShowTopFrame, isShowRightFrame, isShowBottomFrame));
    }


    /**
     * 设置 View 点击、未点击时的 Drawable
     *
     * @param press       点击时的 Drawable
     * @param normalColor 未点击时的 Drawable
     * @return StateListDrawable
     */
    public static StateListDrawable pressed(Drawable press, Drawable normalColor) {
        StateListDrawable drawable = new StateListDrawable();
        drawable.addState(new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled}, press);
        drawable.addState(new int[]{}, normalColor);
        return drawable;
    }

    /**
     * 设置View选中、未选中时的背景色
     *
     * @param selectedColor 选中时的背景色
     * @param normalColor   未选中时的背景色
     * @return StateListDrawable
     */
    public static StateListDrawable selected(int selectedColor, int normalColor) {
        return selected(
                background(selectedColor, 0),
                background(normalColor, 0)
        );
    }

    /**
     * 设置View选中、未选中时的背景色，可设置四角圆角半径
     *
     * @param selectedColor 选中时的背景色
     * @param normalColor   未选中时的背景色
     * @param radio         四角圆角半径
     * @return StateListDrawable
     */
    public static StateListDrawable selected(int selectedColor, int normalColor, float radio) {
        return selected(
                background(selectedColor, radio),
                background(normalColor, radio)
        );
    }

    /**
     * 设置View选中、未选中时的背景色，可设置四角圆角半径、边框以及边框颜色
     *
     * @param selectedColor 选中时的背景色
     * @param normalColor   未选中时的背景色
     * @param radio         四角圆角半径
     * @param frameWidth    边框的宽度
     * @param frameColor    边框的颜色
     * @return StateListDrawable
     */
    public static StateListDrawable selected(int selectedColor, int normalColor, float radio, int frameWidth, int frameColor) {
        return selected(
                background(selectedColor, radio, frameWidth, frameColor),
                background(normalColor, radio, frameWidth, frameColor)
        );
    }

    /**
     * 设置View选中、未选中时的背景色，可设置四角圆角半径（角度可不同）、边框、边框颜色，以及某一边的边框是否显示
     *
     * @param selectedColor     选中时的背景色
     * @param normalColor       未选中时的背景色
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
     * @return StateListDrawable
     */
    public static StateListDrawable selected(int selectedColor, int normalColor, float topLeftRadio, float topRightRadio, float bottomRightRadio, float bottomLeftRadio,
                                             int frameWidth, int frameColor, boolean isShowLeftFrame, boolean isShowTopFrame, boolean isShowRightFrame, boolean isShowBottomFrame) {
        return selected(
                background(selectedColor, topLeftRadio, topRightRadio, bottomRightRadio, bottomLeftRadio,
                        frameWidth, frameColor, isShowLeftFrame, isShowTopFrame, isShowRightFrame, isShowBottomFrame),
                background(normalColor, topLeftRadio, topRightRadio, bottomRightRadio, bottomLeftRadio,
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
        GradientDrawable backgroundDrawable = new GradientDrawable();
        backgroundDrawable.setShape(GradientDrawable.OVAL);
        backgroundDrawable.setColor(color);
        return backgroundDrawable;
    }


    /**
     * View 背景色，可设置四角圆角半径
     *
     * @param color 背景色
     * @param radio 四角圆角半径
     * @return Drawable
     */
    public static Drawable background(int color, float radio) {
        return background(color, radio, 0, 0);
    }

    /**
     * View 背景色，可设置四角圆角半径、边框以及边框颜色
     *
     * @param color      背景色
     * @param radio      四角圆角半径
     * @param frameWidth 边框的宽度
     * @param frameColor 边框的颜色
     * @return Drawable
     */
    public static Drawable background(int color, float radio, int frameWidth, int frameColor) {
        return background(color, radio, radio, radio, radio, frameWidth, frameColor, true, true, true, true);
    }

    /**
     * View 背景色，可设置四角圆角半径（角度可不同）、边框、边框颜色，以及某一边的边框是否显示
     *
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
    public static Drawable background(int color, final float topLeftRadio, float topRightRadio, float bottomRightRadio, float bottomLeftRadio, int frameWidth,
                                      int frameColor, boolean isShowLeftFrame, boolean isShowTopFrame, boolean isShowRightFrame, boolean isShowBottomFrame) {

        float[] radio = new float[]{topLeftRadio, topLeftRadio, topRightRadio, topRightRadio, bottomRightRadio, bottomRightRadio, bottomLeftRadio, bottomLeftRadio};

        //边框
        GradientDrawable frameDrawable = new GradientDrawable();
        frameDrawable.setShape(GradientDrawable.RECTANGLE);
        frameDrawable.setCornerRadii(radio);
        frameDrawable.setStroke(frameWidth, frameColor);

        //背景
        GradientDrawable backgroundDrawable = new GradientDrawable();
        backgroundDrawable.setShape(GradientDrawable.RECTANGLE);
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

    public static Drawable getTDrawable(Context context, int drawable) {
        return ContextCompat.getDrawable(context, drawable);
    }

    public static int getTColor(Context context, int color) {
        return ContextCompat.getColor(context, color);
    }
}
