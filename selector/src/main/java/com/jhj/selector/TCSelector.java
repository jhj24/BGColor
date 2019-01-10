package com.jhj.selector;

import android.content.res.ColorStateList;

/**
 * 文字颜色
 * <p>
 * Created by jhj on 19-1-10.
 */
public class TCSelector {

    public static ColorStateList pressed(int pressed, int normal) {
        int[][] states = new int[2][];
        states[0] = new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled};
        states[1] = new int[]{};
        int[] colors = new int[]{pressed, normal};
        return new ColorStateList(states, colors);
    }

    public static ColorStateList selected(int selected, int normal) {
        int[][] states = new int[2][];
        states[0] = new int[]{android.R.attr.state_selected, android.R.attr.state_enabled};
        states[1] = new int[]{};
        int[] colors = new int[]{selected, normal};
        return new ColorStateList(states, colors);
    }

}
