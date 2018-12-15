package fr.pcsoft.wdjava.media;

import android.media.MediaRecorder;
import android.media.MediaRecorder.OnInfoListener;
import android.view.SurfaceHolder;

/* renamed from: fr.pcsoft.wdjava.media.b */
class C0940b implements OnInfoListener {
    final C0957s this$0;
    final SurfaceHolder val$holder;

    C0940b(C0957s c0957s, SurfaceHolder surfaceHolder) {
        this.this$0 = c0957s;
        this.val$holder = surfaceHolder;
    }

    public void onInfo(MediaRecorder mediaRecorder, int i, int i2) {
        if (i == 801 || i == 800) {
            this.this$0.m6877a(mediaRecorder, this.val$holder);
        }
    }
}
