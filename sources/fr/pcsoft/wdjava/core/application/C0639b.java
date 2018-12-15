package fr.pcsoft.wdjava.core.application;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import fr.pcsoft.wdjava.core.service.C0748b;

/* renamed from: fr.pcsoft.wdjava.core.application.b */
class C0639b implements ServiceConnection {
    final C0656q this$1;

    C0639b(C0656q c0656q) {
        this.this$1 = c0656q;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.this$1.this$0.f1039Q = ((C0748b) iBinder).m3254a();
        this.this$1.this$0.f1039Q.m3249a((ServiceConnection) this);
        this.this$1.m1784a();
    }

    public void onServiceDisconnected(ComponentName componentName) {
        if (this.this$1.this$0.f1039Q != null) {
            this.this$1.this$0.f1039Q.m3253c();
            this.this$1.this$0.f1039Q = null;
        }
    }
}
