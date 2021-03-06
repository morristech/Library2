/*
 *  Copyright (c) 2015 Alticast Corp.
 *  All rights reserved. http://www.alticast.com/
 *
 *  This software is the confidential and proprietary information of
 *  Alticast Corp. ("Confidential Information"). You shall not
 *  disclose such Confidential Information and shall use it only in
 *  accordance with the terms of the license agreement you entered into
 *  with Alticast.
 */
package com.alticast.viettelottcommons.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

import com.alticast.viettelottcommons.R;
import com.alticast.viettelottcommons.util.Rs;


/**
 * <code>FontTextView</code>
 * 
 * @version $Revision: 1.1 $ $Author: mc.kim $ $Date: 2015/08/31 23:23:17 $
 * @author tklee
 * @since 2015. 8. 11.
 */
public class FontTextView extends TextView {

    /**
     * @param context
     * @param attrs
     */
    public FontTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        if (attrs != null) {
            TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.FontTextView);
            try {
                String string = typedArray.getString(R.styleable.FontTextView_fontTextView);
                setTypeface(Rs.getFont(string));
            } catch (Exception e) {
                e.printStackTrace();
            }
            typedArray.recycle();
        }        
    }
    
    /**
     * Sets the font.
     *
     * @param string the new font
     */
    public void setFont(String string) {
        setTypeface(Rs.getFont(string));
    }

}
