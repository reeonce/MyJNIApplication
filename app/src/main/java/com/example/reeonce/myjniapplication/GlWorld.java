package com.example.reeonce.myjniapplication;

/**
 * Created by zengbin on 9/6/16.
 * Copyright © 2016 GuangTian. All rights reserved.
 */
public class GlWorld {
    static {
        System.loadLibrary("gl_world");
    }

    public GlWorld() {

    }

    public native String getMessage();
}
