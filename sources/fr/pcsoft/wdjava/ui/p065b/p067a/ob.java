package fr.pcsoft.wdjava.ui.p065b.p067a;

import fr.pcsoft.wdjava.core.debug.C0691a;

/* renamed from: fr.pcsoft.wdjava.ui.b.a.ob */
final class ob extends mb {
    /* renamed from: z */
    private static final String[] f3178z = new String[]{ob.m7766z(ob.m7767z("\u0014\\SHQ7]S\u001aV:F\u0007IM%XHHL¼\b\u001d\u001a")), ob.m7766z(ob.m7767z("\u0007I^UVuFÎ]Y!AA\u001aQ;\\BH\\<\\\t"))};
    /* renamed from: f */
    C1063b f3179f;
    /* renamed from: g */
    C1063b f3180g;
    /* renamed from: h */
    C1063b f3181h;
    /* renamed from: i */
    C1063b f3182i;

    ob() {
    }

    /* renamed from: z */
    private static String m7766z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 85;
                    break;
                case 1:
                    i2 = 40;
                    break;
                case 2:
                    i2 = 39;
                    break;
                case 3:
                    i2 = 58;
                    break;
                default:
                    i2 = 56;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7767z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 56);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public void mo3327a() {
        super.mo3327a();
        if (this.f3182i != null) {
            this.f3182i.m7605a();
            this.f3182i = null;
        }
        if (this.f3179f != null) {
            this.f3179f.m7605a();
            this.f3179f = null;
        }
        if (this.f3180g != null) {
            this.f3180g.m7605a();
            this.f3180g = null;
        }
        if (this.f3181h != null) {
            this.f3181h.m7605a();
            this.f3181h = null;
        }
    }

    /* renamed from: a */
    public void mo3334a(C1068g c1068g, C1063b c1063b) throws C1066d {
        try {
            switch (C1075o.f3177b[c1068g.ordinal()]) {
                case 7:
                    try {
                        this.f3180g = c1063b;
                        if (c1063b.m7607c() < 0.0f) {
                            throw new C1066d(f3178z[1]);
                        }
                        return;
                    } catch (C1066d e) {
                        throw e;
                    }
                case 8:
                    try {
                        this.f3181h = c1063b;
                        if (c1063b.m7607c() < 0.0f) {
                            throw new C1066d(f3178z[1]);
                        }
                        return;
                    } catch (C1066d e2) {
                        throw e2;
                    }
                case 9:
                    this.f3182i = c1063b;
                    return;
                case 10:
                    this.f3179f = c1063b;
                    return;
                default:
                    C0691a.m2856a(f3178z[0] + c1068g.name());
                    return;
            }
        } catch (C1066d e22) {
            throw e22;
        }
        throw e22;
    }
}
