package fr.pcsoft.wdjava.media;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: fr.pcsoft.wdjava.media.g */
class C0945g extends Handler {
    final C0947i this$1;

    C0945g(C0947i c0947i) {
        this.this$1 = c0947i;
    }

    public void handleMessage(Message message) {
        if (C0947i.access$300(this.this$1)) {
            switch (message.what) {
                case 1:
                    C0947i.access$400(this.this$1, (C0939a) message.obj);
                    return;
                case 2:
                    C0947i.access$302(this.this$1, false);
                    Looper.myLooper().quit();
                    return;
                default:
                    return;
            }
        }
    }
}
