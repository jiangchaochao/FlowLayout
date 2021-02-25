package com.jiangc.flowlayout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class FlowLayout extends ViewGroup {
    public FlowLayout(Context context) {
        super(context);
    }

    public FlowLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public FlowLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public FlowLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }




    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

        // 测量所有child
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i ++ )
        {
            View childView = getChildAt(i);
            
        }
        // 将计算后的宽和高设置到自己
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {

    }
}
