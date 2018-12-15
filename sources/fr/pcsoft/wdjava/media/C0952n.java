package fr.pcsoft.wdjava.media;

import android.media.MediaRecorder;
import android.media.MediaRecorder.OnErrorListener;

/* renamed from: fr.pcsoft.wdjava.media.n */
class C0952n implements OnErrorListener {
    final C0962x this$0;

    C0952n(C0962x c0962x) {
        this.this$0 = c0962x;
    }

    public void onError(MediaRecorder mediaRecorder, int i, int i2) {
        this.this$0.m6934a();
    }
}
