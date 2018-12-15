package fr.pcsoft.wdjava.ui.p065b.p067a;

import android.graphics.RectF;
import fr.pcsoft.wdjava.core.debug.C0691a;
import java.util.List;

/* renamed from: fr.pcsoft.wdjava.ui.b.a.bb */
public final class bb extends ab {
    /* renamed from: z */
    private static final String[] f3075z = new String[]{bb.m7608z(bb.m7609z("\\-J]u,J\u000frr7\u001e\\im)Q]hôy\u0004\u000f")), bb.m7608z(bb.m7609z("\\-J]u,J\u000fjx+MFssyRZ<n,L\u000fisy×Cõp<P[<n/Y\u000fmh0\u001eA;x*J\u000fl|*\u001eC}=+_Lus<\u001eKi==QLip<P[2")), bb.m7608z(bb.m7609z("Q~×Cõp<P[<s~__l|+JFys-\u001eÏ<|,]Zr==QLip<P[2")), bb.m7608z(bb.m7609z("Q8LHyh+\u001eAõz8JFjxyWAhx+ZFhxw")), bb.m7608z(bb.m7609z("U8K[yh+\u001eAõz8JFjxyWAhx+ZFhxw"))};
    /* renamed from: f */
    C1063b f3076f = null;
    /* renamed from: g */
    C1063b f3077g = null;
    /* renamed from: h */
    private RectF f3078h;
    /* renamed from: i */
    C1063b f3079i = null;
    /* renamed from: j */
    C1063b f3080j = null;

    /* renamed from: z */
    private static String m7608z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 29;
                    break;
                case 1:
                    i2 = 89;
                    break;
                case 2:
                    i2 = 62;
                    break;
                case 3:
                    i2 = 47;
                    break;
                default:
                    i2 = 28;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7609z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 28);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public void mo3327a() {
        super.mo3327a();
        this.f3078h = null;
        if (this.f3077g != null) {
            this.f3077g.m7605a();
            this.f3077g = null;
        }
        if (this.f3079i != null) {
            this.f3079i.m7605a();
            this.f3079i = null;
        }
        if (this.f3076f != null) {
            this.f3076f.m7605a();
            this.f3076f = null;
        }
        if (this.f3080j != null) {
            this.f3080j.m7605a();
            this.f3080j = null;
        }
    }

    /* renamed from: a */
    public void mo3333a(C1068g c1068g, RectF rectF) throws C1066d {
        try {
            if (c1068g == C1068g.viewBox) {
                this.f3078h = rectF;
            } else {
                C0691a.m2856a(f3075z[0] + c1068g.name());
            }
        } catch (C1066d e) {
            throw e;
        }
    }

    /* renamed from: a */
    public void mo3334a(C1068g c1068g, C1063b c1063b) throws C1066d {
        try {
            switch (C1075o.f3177b[c1068g.ordinal()]) {
                case 1:
                    this.f3077g = c1063b;
                    return;
                case 2:
                    this.f3079i = c1063b;
                    return;
                case 5:
                    try {
                        this.f3076f = c1063b;
                        if (c1063b.m7607c() < 0.0f) {
                            throw new C1066d(f3075z[3]);
                        }
                        return;
                    } catch (C1066d e) {
                        throw e;
                    }
                case 6:
                    try {
                        this.f3080j = c1063b;
                        if (c1063b.m7607c() < 0.0f) {
                            throw new C1066d(f3075z[4]);
                        }
                        return;
                    } catch (C1066d e2) {
                        throw e2;
                    }
                default:
                    C0691a.m2856a(f3075z[0] + c1068g.name());
                    return;
            }
        } catch (C1066d e22) {
            throw e22;
        }
        throw e22;
    }

    /* renamed from: a */
    public void mo3335a(C1068g c1068g, String str) throws C1066d {
        if (c1068g == C1068g.version) {
            wb c = mo3330c();
            if (c != null) {
                try {
                    if (c.m7857e() == this) {
                        c.m7853b(str);
                        return;
                    } else {
                        C0691a.m2856a(f3075z[1]);
                        return;
                    }
                } catch (C1066d e) {
                    throw e;
                }
            }
            C0691a.m2856a(f3075z[2]);
            return;
        }
        C0691a.m2856a(f3075z[0] + c1068g.name());
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo3331a(C1060y c1060y) throws C1066d {
        super.mo3331a(c1060y);
    }

    /* renamed from: d */
    public /* bridge */ /* synthetic */ List mo3332d() {
        return super.mo3332d();
    }

    /* renamed from: e */
    public final RectF m7616e() {
        return this.f3078h;
    }
}
