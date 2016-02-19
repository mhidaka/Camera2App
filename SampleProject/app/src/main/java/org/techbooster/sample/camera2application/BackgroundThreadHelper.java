package org.techbooster.sample.camera2application;

import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;

/**
 * Created by mhidaka on 2015/11/09.
 */
class BackgroundThreadHelper {
    private static final String TAG = "BackgroundThreadHelper";

    private HandlerThread mThread = null;
    private Handler mHandler = null;

    public BackgroundThreadHelper() {
        return;
    }

    public void start() {
        mThread = new HandlerThread("CameraBackground");
        mThread.start();
        mHandler = new Handler(mThread.getLooper());
    }

    public Handler getHandler() {
        if (mHandler == null) {
            Log.e(TAG, "BackgroundThread Error mHandler null");
        }
        return mHandler;
    }

    public void stop() {
        mThread.quitSafely();
        try {
            mThread.join();
            mThread = null;
            mHandler = null;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
