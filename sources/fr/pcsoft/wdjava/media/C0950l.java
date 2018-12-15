package fr.pcsoft.wdjava.media;

import android.media.MediaRecorder;
import android.media.MediaRecorder.OnInfoListener;

/* renamed from: fr.pcsoft.wdjava.media.l */
class C0950l implements OnInfoListener {
    final C0962x this$0;

    C0950l(C0962x c0962x) {
        this.this$0 = c0962x;
    }

    public void onInfo(MediaRecorder mediaRecorder, int i, int i2) {
        if (i == 801 || i == 800) {
            this.this$0.m6934a();
        }
    }
}
