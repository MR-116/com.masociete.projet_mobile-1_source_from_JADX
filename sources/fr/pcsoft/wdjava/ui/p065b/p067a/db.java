package fr.pcsoft.wdjava.ui.p065b.p067a;

import fr.pcsoft.wdjava.core.debug.C0691a;

/* renamed from: fr.pcsoft.wdjava.ui.b.a.db */
final class db extends cb {
    /* renamed from: z */
    private static final String f3088z = db.m7628z(db.m7629z("Mh'W%ni'\u0005\"crsV9|l<W8å<i\u0005"));
    /* renamed from: j */
    public C1063b f3089j = null;
    /* renamed from: k */
    public C1063b f3090k = null;
    /* renamed from: l */
    public C1063b f3091l = null;
    /* renamed from: m */
    public C1063b f3092m = null;

    db() {
    }

    /* renamed from: z */
    private static String m7628z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 12;
                    break;
                case 1:
                    i2 = 28;
                    break;
                case 2:
                    i2 = 83;
                    break;
                case 3:
                    i2 = 37;
                    break;
                default:
                    i2 = 76;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7629z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 76);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public void mo3327a() {
        super.mo3327a();
        if (this.f3092m != null) {
            this.f3092m.m7605a();
            this.f3092m = null;
        }
        if (this.f3090k != null) {
            this.f3090k.m7605a();
            this.f3090k = null;
        }
        if (this.f3089j != null) {
            this.f3089j.m7605a();
            this.f3089j = null;
        }
        if (this.f3091l != null) {
            this.f3091l.m7605a();
            this.f3091l = null;
        }
    }

    /* renamed from: a */
    public void mo3334a(C1068g c1068g, C1063b c1063b) throws C1066d {
        try {
            switch (C1075o.f3177b[c1068g.ordinal()]) {
                case 12:
                    this.f3092m = c1063b;
                    return;
                case 13:
                    this.f3090k = c1063b;
                    return;
                case 14:
                    this.f3089j = c1063b;
                    return;
                case 15:
                    this.f3091l = c1063b;
                    return;
                default:
                    C0691a.m2856a(f3088z + c1068g.name());
                    return;
            }
        } catch (C1066d e) {
            throw e;
        }
        throw e;
    }
}
