package fr.pcsoft.wdjava.ui.style;

import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.ui.p064a.C1034d;
import fr.pcsoft.wdjava.ui.p079e.C1397c;
import fr.pcsoft.wdjava.ui.p079e.C1398a;
import fr.pcsoft.wdjava.ui.p079e.C1399b;

/* renamed from: fr.pcsoft.wdjava.ui.style.a */
public abstract class C1495a implements C1494g {
    /* renamed from: z */
    private static final String[] f4525z = new String[]{C1495a.m10367z(C1495a.m10368z("%H5r~q\u0006bv~%Ugg}jTfþ-uG`7a`\u0006actiC2tbpTsyy+")), C1495a.m10367z(C1495a.m10368z("I\u0001{ykj\u0006vr-vRk{h%H¢"))};

    /* renamed from: a */
    private C1397c m10366a(boolean z) {
        C1397c c = m10377c();
        if (!z) {
            return c;
        }
        if (c != null) {
            return c.mo3765f() ? ((C1398a) c).m9923a((C1494g) this) : c;
        } else {
            C1494g b = mo3800b();
            return (b == null || !(b instanceof C1495a)) ? C1399b.m9944i() : ((C1495a) b).m10366a(z);
        }
    }

    /* renamed from: z */
    private static String m10367z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 5;
                    break;
                case 1:
                    i2 = 38;
                    break;
                case 2:
                    i2 = 18;
                    break;
                case 3:
                    i2 = 23;
                    break;
                default:
                    i2 = 13;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m10368z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 13);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public Object mo3797a(int i) {
        C0691a.m2856a(f4525z[1] + i + f4525z[0]);
        return null;
    }

    /* renamed from: a */
    public Object mo3798a(int i, Object obj) {
        Object a = mo3797a(i);
        return a != null ? a : obj;
    }

    /* renamed from: a */
    protected void m10371a(C1397c c1397c) {
    }

    /* renamed from: a */
    public final boolean mo3799a(int i, boolean z) {
        C1399b c1399b = (C1399b) mo3801b(4, true);
        if (c1399b == null) {
            return false;
        }
        int e = c1399b.mo3764e();
        mo3802b(4, c1399b.m9951a(z ? e | i : e & (i ^ -1)));
        return true;
    }

    /* renamed from: b */
    public C1494g mo3800b() {
        return null;
    }

    /* renamed from: b */
    public Object mo3801b(int i, boolean z) {
        C1034d a = mo3797a(i);
        C1494g b;
        if (a == null && z) {
            b = mo3800b();
            return b != null ? b.mo3801b(i, z) : i == 4 ? C1399b.m9944i() : null;
        } else if (z && i == 4 && ((C1397c) a).mo3765f()) {
            return ((C1398a) a).m9923a((C1494g) this);
        } else {
            if (!z || a != e) {
                return a;
            }
            b = mo3800b();
            return b != null ? b.mo3801b(i, true) : C1034d.m7495u();
        }
    }

    /* renamed from: b */
    public void mo3802b(int i, Object obj) {
        C0691a.m2856a(f4525z[1] + i + f4525z[0]);
    }

    /* renamed from: b */
    public final boolean mo3803b(int i) {
        C1399b c1399b = (C1399b) mo3801b(4, true);
        return c1399b != null ? (c1399b.mo3764e() & i) > 0 : false;
    }

    /* renamed from: c */
    protected C1397c m10377c() {
        return null;
    }
}
