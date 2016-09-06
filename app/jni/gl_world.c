//
// Created by Reeonce on 9/6/16.
//

#include "include/gl_world.h"

JNIEXPORT jstring JNICALL Java_com_example_reeonce_myjniapplication_GlWorld_getMessage(JNIEnv *env,
                                                                                       jobject thisObj) {
    return (*env)->NewStringUTF(env, "Hello from native code!");
}