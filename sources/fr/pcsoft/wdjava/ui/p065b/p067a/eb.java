package fr.pcsoft.wdjava.ui.p065b.p067a;

import fr.pcsoft.wdjava.core.debug.C0691a;

/* renamed from: fr.pcsoft.wdjava.ui.b.a.eb */
final class eb extends cb {
    /* renamed from: z */
    private static final String[] f3093z = new String[]{eb.m7632z(eb.m7633z("SG;\u001eV!H«\u0016YuO$QQoR'\u0003\\hRl")), eb.m7632z(eb.m7633z("@R6\u0003QcS6QVnHb\u0002MqV-\u0003Lè\u0006xQ"))};
    /* renamed from: j */
    public C1063b f3094j = null;
    /* renamed from: k */
    public C1063b f3095k = null;
    /* renamed from: l */
    public C1063b f3096l = null;
    /* renamed from: m */
    public C1063b f3097m = null;
    /* renamed from: n */
    public C1063b f3098n = null;

    eb() {
    }

    /* renamed from: z */
    private static String m7632z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 1;
                    break;
                case 1:
                    i2 = 38;
                    break;
                case 2:
                    i2 = 66;
                    break;
                case 3:
                    i2 = 113;
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
    private static char[] m7633z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 56);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public void mo3327a() {
        super.mo3327a();
        if (this.f3096l != null) {
            this.f3096l.m7605a();
            this.f3096l = null;
        }
        if (this.f3098n != null) {
            this.f3098n.m7605a();
            this.f3098n = null;
        }
        if (this.f3095k != null) {
            this.f3095k.m7605a();
            this.f3095k = null;
        }
        if (this.f3094j != null) {
            this.f3094j.m7605a();
            this.f3094j = null;
        }
        if (this.f3097m != null) {
            this.f3097m.m7605a();
            this.f3097m = null;
        }
    }

    /* renamed from: a */
    public void mo3334a(C1068g c1068g, C1063b c1063b) throws C1066d {
        try {
            switch (C1075o.f3177b[c1068g.ordinal()]) {
                case 9:
                    this.f3096l = c1063b;
                    return;
                case 10:
                    this.f3098n = c1063b;
                    return;
                case 11:
                    try {
                        if (c1063b.m7607c() < 0.0f) {
                            throw new C1066d(f3093z[0]);
                        }
                        this.f3095k = c1063b;
                        return;
                    } catch (C1066d e) {
                        throw e;
                    }
                case 19:
                    this.f3094j = c1063b;
                    return;
                case 20:
                    this.f3097m = c1063b;
                    return;
                default:
                    C0691a.m2856a(f3093z[1] + c1068g.name());
                    return;
            }
        } catch (C1066d e2) {
            throw e2;
        }
        throw e2;
    }
}
