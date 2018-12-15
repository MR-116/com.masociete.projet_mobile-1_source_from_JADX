package fr.pcsoft.wdjava.ui.p073d.p075b.p076a;

import fr.pcsoft.wdjava.core.utils.tb;

/* renamed from: fr.pcsoft.wdjava.ui.d.b.a.i */
class C1330i extends tb {
    final C1322a this$0;

    public C1330i(C1322a c1322a, int i) {
        this.this$0 = c1322a;
        super(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: c */
    public void mo3675c() {
        /*
        r9 = this;
        r0 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r1 = r9.this$0;
        r1 = r1.f;
        r0 = java.lang.Math.max(r0, r1);
        r0 = (double) r0;
        r2 = 4609434218613702656; // 0x3ff8000000000000 float:0.0 double:1.5;
        r0 = r0 * r2;
        r6 = (long) r0;
        r0 = r9.this$0;	 Catch:{ b -> 0x007c, WDJNIException -> 0x0085 }
        r0 = r0.d;	 Catch:{ b -> 0x007c, WDJNIException -> 0x0085 }
        r1 = r0.mo2753v();	 Catch:{ b -> 0x007c, WDJNIException -> 0x0085 }
        r0 = r9.this$0;	 Catch:{ b -> 0x007c, WDJNIException -> 0x0085 }
        r0 = r0.d;	 Catch:{ b -> 0x007c, WDJNIException -> 0x0085 }
        r2 = r0.m3717k();	 Catch:{ b -> 0x007c, WDJNIException -> 0x0085 }
        r0 = r9.this$0;	 Catch:{ b -> 0x007c, WDJNIException -> 0x0085 }
        r0 = r0.e;	 Catch:{ b -> 0x007c, WDJNIException -> 0x0085 }
        r4 = r0.m5852i();	 Catch:{ b -> 0x007c, WDJNIException -> 0x0085 }
        r8 = 0;
        r0 = r1.mo2781a(r2, r4, r6, r8);	 Catch:{ b -> 0x007c, WDJNIException -> 0x0085 }
        r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1));
        if (r2 >= 0) goto L_0x003d;
    L_0x0038:
        r2 = r9.this$0;	 Catch:{ b -> 0x007a, WDJNIException -> 0x0085 }
        r2.m9384N();	 Catch:{ b -> 0x007a, WDJNIException -> 0x0085 }
    L_0x003d:
        r2 = r9.this$0;	 Catch:{ b -> 0x0081, WDJNIException -> 0x0085 }
        fr.pcsoft.wdjava.ui.p073d.p075b.p076a.C1322a.access$1114(r2, r0);	 Catch:{ b -> 0x0081, WDJNIException -> 0x0085 }
        r0 = r9.this$0;	 Catch:{ b -> 0x0081, WDJNIException -> 0x0085 }
        r1 = r9.this$0;	 Catch:{ b -> 0x0081, WDJNIException -> 0x0085 }
        r1 = r1.m9391J();	 Catch:{ b -> 0x0081, WDJNIException -> 0x0085 }
        r0.mo3664f(r1);	 Catch:{ b -> 0x0081, WDJNIException -> 0x0085 }
        r0 = r9.this$0;	 Catch:{ b -> 0x0081, WDJNIException -> 0x0085 }
        r0 = r0.f;	 Catch:{ b -> 0x0081, WDJNIException -> 0x0085 }
        r1 = r9.this$0;	 Catch:{ b -> 0x0081, WDJNIException -> 0x0085 }
        r1 = r1.f3952j;	 Catch:{ b -> 0x0081, WDJNIException -> 0x0085 }
        r1 = r1.getRowCount();	 Catch:{ b -> 0x0081, WDJNIException -> 0x0085 }
        if (r0 <= r1) goto L_0x0079;
    L_0x005d:
        r0 = r9.this$0;	 Catch:{ b -> 0x0083, WDJNIException -> 0x0085 }
        r0 = r0.f3952j;	 Catch:{ b -> 0x0083, WDJNIException -> 0x0085 }
        r0 = r0.getItemCount();	 Catch:{ b -> 0x0083, WDJNIException -> 0x0085 }
        r1 = r9.this$0;	 Catch:{ b -> 0x0083, WDJNIException -> 0x0085 }
        r2 = 0;
        r1 = r1.mo3668d(r2);	 Catch:{ b -> 0x0083, WDJNIException -> 0x0085 }
        if (r0 >= r1) goto L_0x0079;
    L_0x006e:
        r0 = r9.this$0;	 Catch:{ b -> 0x0083, WDJNIException -> 0x0085 }
        r1 = r9.this$0;	 Catch:{ b -> 0x0083, WDJNIException -> 0x0085 }
        r1 = r1.mo3660K();	 Catch:{ b -> 0x0083, WDJNIException -> 0x0085 }
        r0.mo3617b(r1);	 Catch:{ b -> 0x0083, WDJNIException -> 0x0085 }
    L_0x0079:
        return;
    L_0x007a:
        r0 = move-exception;
        throw r0;	 Catch:{ b -> 0x007c, WDJNIException -> 0x0085 }
    L_0x007c:
        r0 = move-exception;
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2882a(r0);
        goto L_0x0079;
    L_0x0081:
        r0 = move-exception;
        throw r0;	 Catch:{ b -> 0x0083, WDJNIException -> 0x0085 }
    L_0x0083:
        r0 = move-exception;
        throw r0;	 Catch:{ b -> 0x007c, WDJNIException -> 0x0085 }
    L_0x0085:
        r0 = move-exception;
        r1 = r9.this$0;
        r1 = r1.d;
        r1 = r1.mo2753v();
        fr.pcsoft.wdjava.database.hf.WDHF_Manager.m5075a(r0, r1);
        goto L_0x0079;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.ui.d.b.a.i.c():void");
    }
}
