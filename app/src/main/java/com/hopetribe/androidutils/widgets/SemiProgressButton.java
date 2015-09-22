package com.hopetribe.androidutils.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

/**
 * Created by ericczhuang on 2015/9/22.
 */
public class SemiProgressButton extends Button{

    public SemiProgressButton(Context context) {
        this(context, null);
    }

    public SemiProgressButton(Context context, AttributeSet attrs) {
        this(context, attrs, com.android.internal.R.attr.buttonStyle);
    }

    public SemiProgressButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
  
}
