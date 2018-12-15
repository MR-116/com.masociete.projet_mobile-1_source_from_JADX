package fr.pcsoft.wdjava.ui.p065b.p067a;

import android.graphics.Matrix;
import fr.pcsoft.wdjava.core.debug.C0691a;

/* renamed from: fr.pcsoft.wdjava.ui.b.a.hb */
final class hb extends ab implements C1065m {
    /* renamed from: z */
    private static final String[] f3112z = new String[]{hb.m7646z(hb.m7647z("Al\u0013H\u001b|FRnl\u0012U\bl-\u000fR\nl\u0002U\nl#")), hb.m7646z(hb.m7647z("El\u0014[\u001b|FRnl\u0012U\bl-\u000fR\nl\u0002U\nl#")), hb.m7646z(hb.m7647z("Hy\u0012N\u0017kx\u0012\u001c\u0010fcFO\u000by}\tN\nà-\\\u001c"))};
    /* renamed from: f */
    private Matrix f3113f = null;
    /* renamed from: g */
    C1063b f3114g;
    /* renamed from: h */
    private String f3115h = null;
    /* renamed from: i */
    C1063b f3116i;
    /* renamed from: j */
    C1063b f3117j;
    /* renamed from: k */
    C1063b f3118k;

    hb() {
    }

    /* renamed from: z */
    private static String m7646z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 9;
                    break;
                case 1:
                    i2 = 13;
                    break;
                case 2:
                    i2 = 102;
                    break;
                case 3:
                    i2 = 60;
                    break;
                default:
                    i2 = 126;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7647z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 126);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public void mo3327a() {
        super.mo3327a();
        this.f3113f = null;
        this.f3115h = null;
        if (this.f3116i != null) {
            this.f3116i.m7605a();
            this.f3116i = null;
        }
        if (this.f3117j != null) {
            this.f3117j.m7605a();
            this.f3117j = null;
        }
        if (this.f3114g != null) {
            this.f3114g.m7605a();
            this.f3114g = null;
        }
        if (this.f3118k != null) {
            this.f3118k.m7605a();
            this.f3118k = null;
        }
    }

    /* renamed from: a */
    public void mo3336a(Matrix matrix) {
        this.f3113f = matrix;
    }

    /* renamed from: a */
    public void mo3334a(C1068g c1068g, C1063b c1063b) throws C1066d {
        try {
            switch (C1075o.f3177b[c1068g.ordinal()]) {
                case 1:
                    this.f3116i = c1063b;
                    return;
                case 2:
                    this.f3117j = c1063b;
                    return;
                case 5:
                    try {
                        this.f3114g = c1063b;
                        if (c1063b.m7607c() < 0.0f) {
                            throw new C1066d(f3112z[1]);
                        }
                        return;
                    } catch (C1066d e) {
                        throw e;
                    }
                case 6:
                    try {
                        this.f3118k = c1063b;
                        if (c1063b.m7607c() < 0.0f) {
                            throw new C1066d(f3112z[0]);
                        }
                        return;
                    } catch (C1066d e2) {
                        throw e2;
                    }
                default:
                    C0691a.m2856a(f3112z[2] + c1068g.name());
                    return;
            }
        } catch (C1066d e22) {
            throw e22;
        }
        throw e22;
    }

    /* renamed from: a */
    public void mo3335a(C1068g c1068g, String str) throws C1066d {
        try {
            if (c1068g == C1068g.href) {
                this.f3115h = str;
            } else {
                C0691a.m2856a(f3112z[2] + c1068g.name());
            }
        } catch (C1066d e) {
            throw e;
        }
    }

    /* renamed from: e */
    public Matrix mo3337e() {
        return this.f3113f;
    }

    /* renamed from: m */
    public final String m7653m() {
        return this.f3115h;
    }
}
