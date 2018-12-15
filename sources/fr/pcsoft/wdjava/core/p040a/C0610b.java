package fr.pcsoft.wdjava.core.p040a;

import fr.pcsoft.wdjava.core.debug.C0691a;
import java.util.LinkedHashMap;

/* renamed from: fr.pcsoft.wdjava.core.a.b */
public class C0610b<C, V> implements C0608c<C, V> {
    /* renamed from: z */
    private static final String[] f1490z = new String[]{C0610b.m2284z(C0610b.m2285z("J*1 \no'}1Kk*i=\u0006g'tt\u000fskr5\bn.1:\u000e&/~=\u001f&;p'Kì?c1Kh>}8\u000e")), C0610b.m2284z(C0610b.m2285z("U?~7\u0000g,tt\u000fckg5\u0007c>ct\u0005s'}t\u0002h?t&\u000fo?10\nh818\u000e&(p7\u0003ce")), C0610b.m2284z(C0610b.m2285z("C?p Ko%g5\u0007o/tt\u000fskr5\bn.?"))};
    /* renamed from: a */
    private int f1491a = 0;
    /* renamed from: b */
    private final LinkedHashMap<C, V> f1492b;
    /* renamed from: c */
    private int f1493c = 0;

    public C0610b(int i) {
        C0691a.m2860a(i > 0, f1490z[0]);
        this.f1491a = i;
        this.f1492b = new LinkedHashMap(0, 0.75f, true);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    private void m2283b() {
        /*
        r3 = this;
    L_0x0000:
        monitor-enter(r3);
        r0 = r3.f1493c;	 Catch:{ all -> 0x0033 }
        if (r0 < 0) goto L_0x0011;
    L_0x0005:
        r0 = r3.f1492b;	 Catch:{ all -> 0x0033 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x0033 }
        if (r0 == 0) goto L_0x0023;
    L_0x000d:
        r0 = r3.f1493c;	 Catch:{ all -> 0x0033 }
        if (r0 == 0) goto L_0x0023;
    L_0x0011:
        r0 = f1490z;	 Catch:{ all -> 0x0033 }
        r1 = 2;
        r0 = r0[r1];	 Catch:{ all -> 0x0033 }
        fr.pcsoft.wdjava.core.debug.C0691a.m2856a(r0);	 Catch:{ all -> 0x0033 }
        r0 = 0;
        r3.f1493c = r0;	 Catch:{ all -> 0x0033 }
        r0 = r3.f1492b;	 Catch:{ all -> 0x0033 }
        r0.clear();	 Catch:{ all -> 0x0033 }
        monitor-exit(r3);	 Catch:{ all -> 0x0033 }
    L_0x0022:
        return;
    L_0x0023:
        r0 = r3.f1493c;	 Catch:{ all -> 0x0033 }
        r1 = r3.f1491a;	 Catch:{ all -> 0x0033 }
        if (r0 <= r1) goto L_0x0031;
    L_0x0029:
        r0 = r3.f1492b;	 Catch:{ all -> 0x0033 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x0033 }
        if (r0 == 0) goto L_0x0036;
    L_0x0031:
        monitor-exit(r3);	 Catch:{ all -> 0x0033 }
        goto L_0x0022;
    L_0x0033:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0033 }
        throw r0;
    L_0x0036:
        r0 = r3.f1492b;	 Catch:{ all -> 0x0033 }
        r0 = r0.entrySet();	 Catch:{ all -> 0x0033 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0033 }
        r0 = r0.next();	 Catch:{ all -> 0x0033 }
        r0 = (java.util.Map.Entry) r0;	 Catch:{ all -> 0x0033 }
        r1 = r0.getKey();	 Catch:{ all -> 0x0033 }
        r0 = r0.getValue();	 Catch:{ all -> 0x0033 }
        r2 = r3.f1492b;	 Catch:{ all -> 0x0033 }
        r2.remove(r1);	 Catch:{ all -> 0x0033 }
        r2 = r3.f1493c;	 Catch:{ all -> 0x0033 }
        r1 = r3.mo3345b(r1, r0);	 Catch:{ all -> 0x0033 }
        r1 = r2 - r1;
        r3.f1493c = r1;	 Catch:{ all -> 0x0033 }
        monitor-exit(r3);	 Catch:{ all -> 0x0033 }
        r3.m2291c(r0);
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.core.a.b.b():void");
    }

    /* renamed from: z */
    private static String m2284z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 6;
                    break;
                case 1:
                    i2 = 75;
                    break;
                case 2:
                    i2 = 17;
                    break;
                case 3:
                    i2 = 84;
                    break;
                default:
                    i2 = 107;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2285z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 107);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public V mo2492a(C c) {
        if (c == null) {
            return null;
        }
        synchronized (this) {
            V remove = this.f1492b.remove(c);
            if (remove != null) {
                this.f1493c -= mo3345b(c, remove);
            }
        }
        if (remove == null) {
            return remove;
        }
        m2291c(remove);
        return remove;
    }

    /* renamed from: a */
    public V mo2493a(C c, V v) {
        if (c == null || v == null) {
            C0691a.m2856a(f1490z[1]);
            return null;
        }
        V put;
        synchronized (this) {
            this.f1493c += Math.abs(mo3345b(c, v));
            put = this.f1492b.put(c, v);
            if (put != null) {
                this.f1493c -= Math.abs(mo3345b(c, put));
            }
        }
        if (put != null) {
            m2291c(put);
        }
        m2283b();
        return put;
    }

    /* renamed from: a */
    public void mo2494a() {
        if (this.f1492b != null) {
            this.f1492b.clear();
        }
        this.f1493c = 0;
    }

    /* renamed from: b */
    protected int mo3345b(C c, V v) {
        return 1;
    }

    /* renamed from: b */
    public V mo2495b(C c) {
        if (c == null) {
            return null;
        }
        V v;
        synchronized (this) {
            v = this.f1492b.get(c);
        }
        return v;
    }

    /* renamed from: c */
    protected void m2291c(V v) {
    }
}
