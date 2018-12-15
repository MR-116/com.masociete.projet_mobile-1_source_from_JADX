package fr.pcsoft.wdjava.core.utils;

import fr.pcsoft.wdjava.core.C0725i;

public class wb implements Comparable {
    /* renamed from: a */
    private int f2178a = 0;

    public wb(int i) {
        if (i < 1440) {
            this.f2178a = ((i / 60) & 255) | (((i % 60) & 255) << 8);
        } else if (i == 1440) {
            try {
                this.f2178a = 0;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } else {
            this.f2178a = 3881751;
        }
    }

    public wb(int i, int i2, int i3) {
        this.f2178a = ((i & 255) | ((i2 & 255) << 8)) | ((65535 & i3) << 16);
    }

    /* renamed from: a */
    public static final wb m4170a(String str) {
        int d;
        int i;
        if (str != null) {
            try {
                int length = str.length();
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        length = 0;
        if (length >= 6) {
            d = C0725i.m3064d(str.substring(0, 2));
            i = d;
            d = C0725i.m3064d(str.substring(2, 4));
            length = C0725i.m3064d(str.substring(4));
        } else if (length >= 4) {
            i = C0725i.m3064d(str.substring(0, 2));
            d = C0725i.m3064d(str.substring(2));
            length = 0;
        } else if (length < 2) {
            return null;
        } else {
            d = 0;
            i = C0725i.m3064d(str);
            length = 0;
        }
        if (i >= 0 && i <= 23 && d >= 0 && d <= 59 && length >= 0 && length <= 59) {
            return new wb(i, d, length);
        }
        try {
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    public final short m4171a() {
        return (short) (65535 & (this.f2178a >> 16));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public boolean m4172a(fr.pcsoft.wdjava.core.utils.wb r4) {
        /*
        r3 = this;
        r0 = r3.m4173b();
        r1 = r3.m4175c();
        r2 = r4.m4173b();	 Catch:{ IllegalArgumentException -> 0x002c }
        if (r0 > r2) goto L_0x002a;
    L_0x000e:
        r2 = r4.m4173b();	 Catch:{ IllegalArgumentException -> 0x002e }
        if (r0 != r2) goto L_0x0036;
    L_0x0014:
        r0 = r4.m4175c();	 Catch:{ IllegalArgumentException -> 0x0030 }
        if (r1 > r0) goto L_0x002a;
    L_0x001a:
        r0 = r4.m4175c();	 Catch:{ IllegalArgumentException -> 0x0032 }
        if (r1 != r0) goto L_0x0036;
    L_0x0020:
        r0 = r3.m4171a();	 Catch:{ IllegalArgumentException -> 0x0034 }
        r1 = r4.m4171a();	 Catch:{ IllegalArgumentException -> 0x0034 }
        if (r0 < r1) goto L_0x0036;
    L_0x002a:
        r0 = 1;
    L_0x002b:
        return r0;
    L_0x002c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x002e }
    L_0x002e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0030 }
    L_0x0030:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0032 }
    L_0x0032:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0034 }
    L_0x0034:
        r0 = move-exception;
        throw r0;
    L_0x0036:
        r0 = 0;
        goto L_0x002b;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.core.utils.wb.a(fr.pcsoft.wdjava.core.utils.wb):boolean");
    }

    /* renamed from: b */
    public final byte m4173b() {
        return (byte) (this.f2178a & 255);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    public boolean m4174b(fr.pcsoft.wdjava.core.utils.wb r4) {
        /*
        r3 = this;
        r0 = r3.m4173b();
        r1 = r3.m4175c();
        r2 = r4.m4173b();	 Catch:{ IllegalArgumentException -> 0x002c }
        if (r0 > r2) goto L_0x002a;
    L_0x000e:
        r2 = r4.m4173b();	 Catch:{ IllegalArgumentException -> 0x002e }
        if (r0 != r2) goto L_0x0036;
    L_0x0014:
        r0 = r4.m4175c();	 Catch:{ IllegalArgumentException -> 0x0030 }
        if (r1 > r0) goto L_0x002a;
    L_0x001a:
        r0 = r4.m4175c();	 Catch:{ IllegalArgumentException -> 0x0032 }
        if (r1 != r0) goto L_0x0036;
    L_0x0020:
        r0 = r3.m4171a();	 Catch:{ IllegalArgumentException -> 0x0034 }
        r1 = r4.m4171a();	 Catch:{ IllegalArgumentException -> 0x0034 }
        if (r0 <= r1) goto L_0x0036;
    L_0x002a:
        r0 = 1;
    L_0x002b:
        return r0;
    L_0x002c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x002e }
    L_0x002e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0030 }
    L_0x0030:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0032 }
    L_0x0032:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0034 }
    L_0x0034:
        r0 = move-exception;
        throw r0;
    L_0x0036:
        r0 = 0;
        goto L_0x002b;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.core.utils.wb.b(fr.pcsoft.wdjava.core.utils.wb):boolean");
    }

    /* renamed from: c */
    public final byte m4175c() {
        return (byte) ((this.f2178a >> 8) & 255);
    }

    /* renamed from: c */
    public boolean m4176c(wb wbVar) {
        if (wbVar == null) {
            return false;
        }
        try {
            if (m4171a() != wbVar.m4171a()) {
                return false;
            }
            if (m4175c() != wbVar.m4175c()) {
                return false;
            }
            try {
                return m4173b() == wbVar.m4173b();
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    public int compareTo(Object obj) {
        return compareTo((zb) obj);
    }

    /* renamed from: d */
    public final String m4177d() {
        return C0725i.m3024a(m4173b(), 2) + C0725i.m3024a(m4175c(), 2) + C0725i.m3024a(m4171a(), 2);
    }

    /* renamed from: d */
    public boolean m4178d(wb wbVar) {
        try {
            return !m4172a(wbVar);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* renamed from: e */
    public final int m4179e() {
        return (m4173b() * 60) + m4175c();
    }

    /* renamed from: e */
    public int m4180e(wb wbVar) {
        try {
            if (m4174b(wbVar)) {
                return 1;
            }
            try {
                return m4176c(wbVar) ? 0 : -1;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public boolean equals(Object obj) {
        try {
            return obj instanceof wb ? m4176c((wb) obj) : super.equals(obj);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* renamed from: f */
    public boolean m4181f(wb wbVar) {
        try {
            return !m4174b(wbVar);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* renamed from: g */
    public final int m4182g(wb wbVar) {
        return m4179e() - wbVar.m4179e();
    }

    public int hashCode() {
        return this.f2178a;
    }

    public String toString() {
        return m4173b() + ":" + m4175c() + ":" + m4171a();
    }
}
