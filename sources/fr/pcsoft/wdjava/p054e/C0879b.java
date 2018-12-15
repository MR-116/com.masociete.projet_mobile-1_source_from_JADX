package fr.pcsoft.wdjava.p054e;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: fr.pcsoft.wdjava.e.b */
class C0879b extends BroadcastReceiver {
    final C0881d this$0;

    C0879b(C0881d c0881d) {
        this.this$0 = c0881d;
    }

    public void onReceive(Context context, Intent intent) {
        C0881d.access$100(this.this$0, new Integer(getResultCode()));
        context.unregisterReceiver(this);
        this.this$0.m1784a();
    }
}
