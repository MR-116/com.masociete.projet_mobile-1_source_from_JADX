package fr.pcsoft.wdjava.media;

import android.os.Handler;
import android.os.Looper;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import p000a.p001a.p002a.C0215v;
import p000a.p001a.p002a.C0216w;
import p000a.p001a.p002a.C0217x;

/* renamed from: fr.pcsoft.wdjava.media.i */
final class C0947i extends Thread {
    /* renamed from: a */
    private final C0215v f2603a;
    /* renamed from: b */
    private boolean f2604b;
    /* renamed from: c */
    private Handler f2605c;
    /* renamed from: d */
    private final CountDownLatch f2606d;
    final db this$0;

    private C0947i(db dbVar) {
        this.this$0 = dbVar;
        this.f2604b = true;
        this.f2606d = new CountDownLatch(1);
        this.f2603a = new C0215v();
        Map enumMap = new EnumMap(C0216w.class);
        if (dbVar.f2595e > 0) {
            Collection noneOf = EnumSet.noneOf(C0217x.class);
            switch (dbVar.f2595e) {
                case 1:
                    noneOf.addAll(EnumSet.of(C0217x.UPC_A));
                    break;
                case 2:
                    noneOf.addAll(EnumSet.of(C0217x.UPC_E));
                    break;
                case 3:
                    noneOf.addAll(EnumSet.of(C0217x.EAN_13));
                    break;
                case 4:
                    noneOf.addAll(EnumSet.of(C0217x.EAN_8));
                    break;
                case 5:
                    noneOf.addAll(EnumSet.of(C0217x.CODE_128));
                    break;
                case 6:
                    noneOf.addAll(EnumSet.of(C0217x.CODE_39));
                    break;
                case 10:
                    noneOf.addAll(EnumSet.of(C0217x.CODE_93));
                    break;
                case 15:
                    noneOf.addAll(EnumSet.of(C0217x.ITF));
                    break;
                case 17:
                    noneOf.addAll(EnumSet.of(C0217x.CODABAR));
                    break;
                case 21:
                    noneOf.addAll(EnumSet.of(C0217x.DATA_MATRIX));
                    break;
                case 22:
                    noneOf.addAll(EnumSet.of(C0217x.PDF_417));
                    break;
                case 23:
                    noneOf.addAll(EnumSet.of(C0217x.QR_CODE));
                    break;
                case 25:
                    noneOf.addAll(EnumSet.of(C0217x.AZTEC));
                    break;
            }
            enumMap.put(C0216w.POSSIBLE_FORMATS, noneOf);
        }
        this.f2603a.m1274a(enumMap);
    }

    C0947i(db dbVar, C0953o c0953o) {
        this(dbVar);
    }

    /* renamed from: a */
    private Handler m6855a() {
        try {
            this.f2606d.await();
        } catch (InterruptedException e) {
        }
        return this.f2605c;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private void m6856a(fr.pcsoft.wdjava.media.C0939a r11) {
        /*
        r10 = this;
        r9 = 0;
        r8 = 0;
        if (r11 == 0) goto L_0x00d3;
    L_0x0004:
        r0 = r11.m6831a();	 Catch:{ q -> 0x005e }
        if (r0 == 0) goto L_0x00d3;
    L_0x000a:
        r7 = r11.f2584c;
        r3 = r11.f2583b;
        r0 = r7.left;	 Catch:{ q -> 0x0060 }
        r1 = r7.width();	 Catch:{ q -> 0x0060 }
        r0 = r0 + r1;
        r1 = r3.m10571a();	 Catch:{ q -> 0x0060 }
        if (r0 > r1) goto L_0x0028;
    L_0x001b:
        r0 = r7.top;	 Catch:{ q -> 0x0062 }
        r1 = r7.height();	 Catch:{ q -> 0x0062 }
        r0 = r0 + r1;
        r1 = r3.m10572b();	 Catch:{ q -> 0x0062 }
        if (r0 <= r1) goto L_0x0035;
    L_0x0028:
        r0 = 0;
        r1 = 0;
        r2 = r3.m10571a();	 Catch:{ q -> 0x0062 }
        r4 = r3.m10572b();	 Catch:{ q -> 0x0062 }
        r7.set(r0, r1, r2, r4);	 Catch:{ q -> 0x0062 }
    L_0x0035:
        r0 = r11.f2585d;
        if (r0 == 0) goto L_0x00a2;
    L_0x0039:
        r0 = r11.f2582a;
        r0 = r0.length;
        r1 = new byte[r0];
        r0 = r8;
    L_0x003f:
        r2 = r3.f4667b;
        if (r0 >= r2) goto L_0x0069;
    L_0x0043:
        r2 = r8;
    L_0x0044:
        r4 = r3.f4666a;	 Catch:{ q -> 0x0064 }
        if (r2 >= r4) goto L_0x0066;
    L_0x0048:
        r4 = r3.f4667b;	 Catch:{ q -> 0x0064 }
        r4 = r4 * r2;
        r5 = r3.f4667b;	 Catch:{ q -> 0x0064 }
        r4 = r4 + r5;
        r4 = r4 - r0;
        r4 = r4 + -1;
        r5 = r11.f2582a;	 Catch:{ q -> 0x0064 }
        r6 = r3.f4666a;	 Catch:{ q -> 0x0064 }
        r6 = r6 * r0;
        r6 = r6 + r2;
        r5 = r5[r6];	 Catch:{ q -> 0x0064 }
        r1[r4] = r5;	 Catch:{ q -> 0x0064 }
        r2 = r2 + 1;
        goto L_0x0044;
    L_0x005e:
        r0 = move-exception;
        throw r0;
    L_0x0060:
        r0 = move-exception;
        throw r0;	 Catch:{ q -> 0x0062 }
    L_0x0062:
        r0 = move-exception;
        throw r0;
    L_0x0064:
        r0 = move-exception;
        throw r0;
    L_0x0066:
        r0 = r0 + 1;
        goto L_0x003f;
    L_0x0069:
        r0 = new a.a.a.ab;
        r2 = r3.f4667b;
        r3 = r3.f4666a;
        r4 = r7.top;
        r5 = r7.left;
        r6 = r7.height();
        r7 = r7.width();
        r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8);
    L_0x007e:
        if (r0 == 0) goto L_0x00d1;
    L_0x0080:
        r1 = new a.a.a.db;
        r2 = new a.a.a.g.j;
        r2.<init>(r0);
        r1.<init>(r2);
        r0 = r10.f2603a;	 Catch:{ q -> 0x00ba, all -> 0x00c2 }
        r0 = r0.m1272a(r1);	 Catch:{ q -> 0x00ba, all -> 0x00c2 }
        r1 = r10.f2603a;
        r1.mo9a();
    L_0x0095:
        if (r0 == 0) goto L_0x00c9;
    L_0x0097:
        r1 = r10.this$0;
        r2 = 3;
        r0 = android.os.Message.obtain(r1, r2, r0);
    L_0x009e:
        r0.sendToTarget();
        return;
    L_0x00a2:
        r0 = new a.a.a.ab;
        r1 = r11.f2582a;
        r2 = r3.f4666a;
        r3 = r3.f4667b;
        r4 = r7.left;
        r5 = r7.top;
        r6 = r7.width();
        r7 = r7.height();
        r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8);
        goto L_0x007e;
    L_0x00ba:
        r0 = move-exception;
        r0 = r10.f2603a;
        r0.mo9a();
        r0 = r9;
        goto L_0x0095;
    L_0x00c2:
        r0 = move-exception;
        r1 = r10.f2603a;
        r1.mo9a();
        throw r0;
    L_0x00c9:
        r0 = r10.this$0;
        r1 = 4;
        r0 = android.os.Message.obtain(r0, r1);
        goto L_0x009e;
    L_0x00d1:
        r0 = r9;
        goto L_0x0095;
    L_0x00d3:
        r0 = r9;
        goto L_0x007e;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.media.i.a(fr.pcsoft.wdjava.media.a):void");
    }

    static Handler access$000(C0947i c0947i) {
        return c0947i.m6855a();
    }

    static boolean access$300(C0947i c0947i) {
        return c0947i.f2604b;
    }

    static boolean access$302(C0947i c0947i, boolean z) {
        c0947i.f2604b = z;
        return z;
    }

    static void access$400(C0947i c0947i, C0939a c0939a) {
        c0947i.m6856a(c0939a);
    }

    public void run() {
        Looper.prepare();
        this.f2605c = new C0945g(this);
        this.f2606d.countDown();
        Looper.loop();
    }
}
