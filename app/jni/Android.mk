LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE    := gl_world
LOCAL_SRC_FILES := gl_world.c

include $(BUILD_SHARED_LIBRARY)