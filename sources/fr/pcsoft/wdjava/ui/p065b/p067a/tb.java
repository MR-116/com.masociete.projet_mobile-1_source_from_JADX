package fr.pcsoft.wdjava.ui.p065b.p067a;

import fr.pcsoft.wdjava.core.debug.C0691a;

/* renamed from: fr.pcsoft.wdjava.ui.b.a.tb */
final class tb extends mb {
    /* renamed from: z */
    private static final String[] f3218z = new String[]{tb.m7789z(tb.m7790z("XUW\u0014a{TWFfvO\u0003\u0015}iQL\u0014|ð\u0001\u0019F")), tb.m7789z(tb.m7790z("K@Z\tf9OÊ\u0001imHEFawUF\u0014lpU\r")), tb.m7789z(tb.m7790z("Q@V\u0012mlS\u0003\bá~@W\u000f~|\u0001J\b||SG\u000f||\u000f")), tb.m7789z(tb.m7790z("U@Q\u0001mlS\u0003\bá~@W\u000f~|\u0001J\b||SG\u000f||\u000f"))};
    /* renamed from: f */
    C1063b f3219f;
    /* renamed from: g */
    C1063b f3220g;
    /* renamed from: h */
    C1063b f3221h;
    /* renamed from: i */
    C1063b f3222i;
    /* renamed from: j */
    C1063b f3223j;
    /* renamed from: k */
    C1063b f3224k;

    tb() {
    }

    /* renamed from: z */
    private static String m7789z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 25;
                    break;
                case 1:
                    i2 = 33;
                    break;
                case 2:
                    i2 = 35;
                    break;
                case 3:
                    i2 = 102;
                    break;
                default:
                    i2 = 8;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7790z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 8);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public void mo3327a() {
        super.mo3327a();
        if (this.f3223j != null) {
            this.f3223j.m7605a();
            this.f3223j = null;
        }
        if (this.f3220g != null) {
            this.f3220g.m7605a();
            this.f3220g = null;
        }
        if (this.f3219f != null) {
            this.f3219f.m7605a();
            this.f3219f = null;
        }
        if (this.f3222i != null) {
            this.f3222i.m7605a();
            this.f3222i = null;
        }
        if (this.f3224k != null) {
            this.f3224k.m7605a();
            this.f3224k = null;
        }
        if (this.f3221h != null) {
            this.f3221h.m7605a();
            this.f3221h = null;
        }
    }

    /* renamed from: a */
    public void mo3334a(C1068g c1068g, C1063b c1063b) throws C1066d {
        try {
            switch (C1075o.f3177b[c1068g.ordinal()]) {
                case 1:
                    this.f3223j = c1063b;
                    return;
                case 2:
                    this.f3220g = c1063b;
                    return;
                case 5:
                    try {
                        this.f3219f = c1063b;
                        if (c1063b.m7607c() < 0.0f) {
                            throw new C1066d(f3218z[3]);
                        }
                        return;
                    } catch (C1066d e) {
                        throw e;
                    }
                case 6:
                    try {
                        this.f3222i = c1063b;
                        if (c1063b.m7607c() < 0.0f) {
                            throw new C1066d(f3218z[2]);
                        }
                        return;
                    } catch (C1066d e2) {
                        throw e2;
                    }
                case 7:
                    try {
                        this.f3224k = c1063b;
                        if (c1063b.m7607c() < 0.0f) {
                            throw new C1066d(f3218z[1]);
                        }
                        return;
                    } catch (C1066d e22) {
                        throw e22;
                    }
                case 8:
                    try {
                        this.f3221h = c1063b;
                        if (c1063b.m7607c() < 0.0f) {
                            throw new C1066d(f3218z[1]);
                        }
                        return;
                    } catch (C1066d e222) {
                        throw e222;
                    }
                default:
                    C0691a.m2856a(f3218z[0] + c1068g.name());
                    return;
            }
        } catch (C1066d e2222) {
            throw e2222;
        }
        throw e2222;
    }
}
