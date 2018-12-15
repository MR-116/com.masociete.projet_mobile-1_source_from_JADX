package fr.pcsoft.wdjava.ui.p065b.p067a;

import fr.pcsoft.wdjava.core.debug.C0691a;

/* renamed from: fr.pcsoft.wdjava.ui.b.a.nb */
final class nb extends mb {
    /* renamed from: z */
    private static final String[] f3172z = new String[]{nb.m7762z(nb.m7763z("eo8j\u0002\u0017`¨b\rCg'%\u0005Yz$w\b^zo")), nb.m7762z(nb.m7763z("vz5w\u0005U{5%\u0002X`av\u0019G~.w\u0018Þ.{%"))};
    /* renamed from: f */
    C1063b f3173f;
    /* renamed from: g */
    C1063b f3174g;
    /* renamed from: h */
    C1063b f3175h;

    nb() {
    }

    /* renamed from: z */
    private static String m7762z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 55;
                    break;
                case 1:
                    i2 = 14;
                    break;
                case 2:
                    i2 = 65;
                    break;
                case 3:
                    i2 = 5;
                    break;
                default:
                    i2 = 108;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7763z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 108);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public void mo3327a() {
        super.mo3327a();
        if (this.f3173f != null) {
            this.f3173f.m7605a();
            this.f3173f = null;
        }
        if (this.f3174g != null) {
            this.f3174g.m7605a();
            this.f3174g = null;
        }
        if (this.f3175h != null) {
            this.f3175h.m7605a();
            this.f3175h = null;
        }
    }

    /* renamed from: a */
    public void mo3334a(C1068g c1068g, C1063b c1063b) throws C1066d {
        try {
            switch (C1075o.f3177b[c1068g.ordinal()]) {
                case 9:
                    this.f3173f = c1063b;
                    return;
                case 10:
                    this.f3174g = c1063b;
                    return;
                case 11:
                    try {
                        this.f3175h = c1063b;
                        if (c1063b.m7607c() < 0.0f) {
                            throw new C1066d(f3172z[0]);
                        }
                        return;
                    } catch (C1066d e) {
                        throw e;
                    }
                default:
                    C0691a.m2856a(f3172z[1] + c1068g.name());
                    return;
            }
        } catch (C1066d e2) {
            throw e2;
        }
        throw e2;
    }
}
