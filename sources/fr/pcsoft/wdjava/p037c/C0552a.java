package fr.pcsoft.wdjava.p037c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: fr.pcsoft.wdjava.c.a */
class C0552a extends BroadcastReceiver {
    final C0557f this$0;

    C0552a(C0557f c0557f) {
        this.this$0 = c0557f;
    }

    public void onReceive(Context context, Intent intent) {
        try {
            C0557f.access$100(this.this$0, C0554c.m1768a(intent, this.this$0.val$nType));
        } catch (Exception e) {
            C0557f.access$200(this.this$0, e);
        } finally {
            context.unregisterReceiver(this);
            this.this$0.m1784a();
        }
    }
}
