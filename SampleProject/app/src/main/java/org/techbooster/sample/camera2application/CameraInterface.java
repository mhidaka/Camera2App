package org.techbooster.sample.camera2application;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.util.Size;
import android.view.Surface;

/**
 * Created by mhidaka on 2015/11/09.
 */
public interface CameraInterface {
    SurfaceTexture getSurfaceTextureFromTextureView();
    Size getPreviewSize();
    Handler getBackgroundHandler();
    Surface getImageRenderSurface();
    int getRotation();
}
