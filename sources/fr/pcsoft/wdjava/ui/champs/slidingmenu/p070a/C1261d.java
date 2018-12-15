package fr.pcsoft.wdjava.ui.champs.slidingmenu.p070a;

import fr.pcsoft.wdjava.core.p035c.C0665g;
import fr.pcsoft.wdjava.p061q.p062a.C1014a;

/* renamed from: fr.pcsoft.wdjava.ui.champs.slidingmenu.a.d */
class C1261d implements Runnable {
    final C1270l this$0;
    final int val$layerType;

    C1261d(C1270l c1270l, int i) {
        this.this$0 = c1270l;
        this.val$layerType = i;
    }

    public void run() {
        try {
            C1014a.m7327b().mo3290a(this.this$0.m8900u(), this.val$layerType, null);
            C1014a.m7327b().mo3290a(this.this$0.m8877i(), this.val$layerType, null);
            if (this.this$0.m8897s() != null) {
                C1014a.m7327b().mo3290a(this.this$0.m8897s(), this.val$layerType, null);
            }
        } catch (C0665g e) {
        }
    }
}
