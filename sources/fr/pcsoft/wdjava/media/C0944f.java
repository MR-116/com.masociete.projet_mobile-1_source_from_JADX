package fr.pcsoft.wdjava.media;

import android.hardware.Camera;
import android.hardware.Camera.AutoFocusCallback;
import android.hardware.Camera.PictureCallback;

/* renamed from: fr.pcsoft.wdjava.media.f */
class C0944f implements AutoFocusCallback {
    final eb this$1;
    final PictureCallback val$callback;

    C0944f(eb ebVar, PictureCallback pictureCallback) {
        this.this$1 = ebVar;
        this.val$callback = pictureCallback;
    }

    public void onAutoFocus(boolean z, Camera camera) {
        this.this$1.this$0.f2659r.takePicture(null, null, this.val$callback);
    }
}
