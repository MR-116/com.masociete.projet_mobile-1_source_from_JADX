package fr.pcsoft.wdjava.ui.utils;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;

/* renamed from: fr.pcsoft.wdjava.ui.utils.r */
class C1517r extends Handler {
    final C1505e this$0;

    C1517r(C1505e c1505e) {
        this.this$0 = c1505e;
    }

    public void handleMessage(Message message) {
        int i = 10;
        super.handleMessage(message);
        switch (C1505e.access$200(this.this$0)) {
            case (byte) 1:
                C1505e.access$318(this.this$0, ((double) (1.0f - C1505e.access$300(this.this$0))) * 0.2d);
                if (((double) C1505e.access$300(this.this$0)) > 0.9d) {
                    C1505e.access$302(this.this$0, 1.0f);
                    C1505e.access$000(this.this$0, (byte) 2);
                }
                C1505e.access$500(this.this$0).invalidate(((int) C1505e.access$400(this.this$0).left) - 5, ((int) C1505e.access$400(this.this$0).top) - 5, ((int) C1505e.access$400(this.this$0).right) + 5, ((int) C1505e.access$400(this.this$0).bottom) + 5);
                break;
            case (byte) 2:
                C1505e.access$000(this.this$0, (byte) 3);
                i = 0;
                break;
            case (byte) 3:
                C1505e.access$326(this.this$0, ((double) C1505e.access$300(this.this$0)) * 0.2d);
                if (((double) C1505e.access$300(this.this$0)) < 0.1d) {
                    C1505e.access$302(this.this$0, 0.0f);
                    C1505e.access$000(this.this$0, (byte) 0);
                }
                C1505e.access$500(this.this$0).invalidate(((int) C1505e.access$400(this.this$0).left) - 5, ((int) C1505e.access$400(this.this$0).top) - 5, ((int) C1505e.access$400(this.this$0).right) + 5, ((int) C1505e.access$400(this.this$0).bottom) + 5);
                break;
            default:
                i = 0;
                break;
        }
        if (i > 0) {
            removeMessages(1);
            sendEmptyMessageAtTime(1, ((long) i) + SystemClock.uptimeMillis());
        }
    }
}
