package com.tedyuen.customviewtest.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;

import com.tedyuen.customviewtest.R;

/**
 * Created by tedyuen on 16-8-25.
 */
public class ProportionImageView extends ImageView {

    private float proportion = 1f;//默认宽高比


    public ProportionImageView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ProportionImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initAttrs(attrs);
    }

    private void initAttrs(AttributeSet attrs) {
        if (attrs != null) {
            TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.ProportionImageView);
            proportion = a.getFloat(R.styleable.ProportionImageView_proportion,proportion);
        }
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int width = MeasureSpec.getSize(widthMeasureSpec);   //获取ViewGroup宽度
        setMeasuredDimension(width,(int)(width*proportion));
    }
}
