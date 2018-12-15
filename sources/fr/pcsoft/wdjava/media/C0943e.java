package fr.pcsoft.wdjava.media;

import android.media.MediaRecorder;
import android.media.MediaRecorder.OnErrorListener;
import android.view.SurfaceHolder;

/* renamed from: fr.pcsoft.wdjava.media.e */
class C0943e implements OnErrorListener {
    final C0957s this$0;
    final SurfaceHolder val$holder;

    C0943e(C0957s c0957s, SurfaceHolder surfaceHolder) {
        this.this$0 = c0957s;
        this.val$holder = surfaceHolder;
    }

    public void onError(MediaRecorder mediaRecorder, int i, int i2) {
        this.this$0.m6877a(mediaRecorder, this.val$holder);
    }
}
