package fr.pcsoft.wdjava.ui.p065b.p067a;

import fr.pcsoft.wdjava.core.debug.C0691a;

/* renamed from: fr.pcsoft.wdjava.ui.b.a.pb */
final class pb extends mb {
    /* renamed from: z */
    private static final String f3183z = pb.m7770z(pb.m7771z("$Ia*\f\u0007Hax\u000b\nS5+\u0010\u0015Mz*\u0011\u001d/x"));
    /* renamed from: f */
    C1063b f3184f;
    /* renamed from: g */
    C1063b f3185g;
    /* renamed from: h */
    C1063b f3186h;
    /* renamed from: i */
    C1063b f3187i;

    pb() {
    }

    /* renamed from: z */
    private static String m7770z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 101;
                    break;
                case 1:
                    i2 = 61;
                    break;
                case 2:
                    i2 = 21;
                    break;
                case 3:
                    i2 = 88;
                    break;
                default:
                    i2 = 101;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7771z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 101);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public void mo3327a() {
        super.mo3327a();
        if (this.f3185g != null) {
            this.f3185g.m7605a();
            this.f3185g = null;
        }
        if (this.f3187i != null) {
            this.f3187i.m7605a();
            this.f3187i = null;
        }
        if (this.f3184f != null) {
            this.f3184f.m7605a();
            this.f3184f = null;
        }
        if (this.f3186h != null) {
            this.f3186h.m7605a();
            this.f3186h = null;
        }
    }

    /* renamed from: a */
    public void mo3334a(C1068g c1068g, C1063b c1063b) throws C1066d {
        try {
            switch (C1075o.f3177b[c1068g.ordinal()]) {
                case 12:
                    this.f3185g = c1063b;
                    return;
                case 13:
                    this.f3187i = c1063b;
                    return;
                case 14:
                    this.f3184f = c1063b;
                    return;
                case 15:
                    this.f3186h = c1063b;
                    return;
                default:
                    C0691a.m2856a(f3183z + c1068g.name());
                    return;
            }
        } catch (C1066d e) {
            throw e;
        }
        throw e;
    }
}
