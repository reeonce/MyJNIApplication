package com.example.reeonce.myjniapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by zengbin on 9/5/16.
 * Copyright © 2016 GuangTian. All rights reserved.
 */
public class HelloJni extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView tv = new TextView(this);
        tv.setText( new GlWorld().getMessage() );
        setContentView(tv);
    }
}
