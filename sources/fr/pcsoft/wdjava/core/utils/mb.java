package fr.pcsoft.wdjava.core.utils;

import android.os.Handler;
import android.os.Message;

final class mb implements Runnable {
    final Handler val$handler;
    final int val$nIdMessage;

    mb(Handler handler, int i) {
        this.val$handler = handler;
        this.val$nIdMessage = i;
    }

    public void run() {
        Message.obtain(this.val$handler, this.val$nIdMessage).sendToTarget();
    }
}
