package p000a.p001a.p002a;

import java.util.Map;
import p000a.p001a.p002a.p003a.C0028d;
import p000a.p001a.p002a.p007b.C0068d;
import p000a.p001a.p002a.p011c.C0102c;
import p000a.p001a.p002a.p011c.C0103d;
import p000a.p001a.p002a.p011c.C0104e;
import p000a.p001a.p002a.p011c.C0105f;
import p000a.p001a.p002a.p011c.C0106g;
import p000a.p001a.p002a.p011c.C0108i;
import p000a.p001a.p002a.p011c.C0109j;
import p000a.p001a.p002a.p011c.C0110k;
import p000a.p001a.p002a.p011c.C0123y;
import p000a.p001a.p002a.p015d.C0138d;
import p000a.p001a.p002a.p019g.C0194n;
import p000a.p001a.p002a.p022f.C0174g;

/* renamed from: a.a.a.j */
public final class C0205j implements cb {
    /* renamed from: z */
    private static final String f773z = C0205j.m1245z(C0205j.m1246z("\u0003\u0004M\u0010b.\u0004\t\u0010~m\n\u001b\u0014e!\n\u000f\u0019im\r\u0002\u0007,+\u0004\u001f\u0018m9K"));

    /* renamed from: z */
    private static String m1245z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 77;
                    break;
                case 1:
                    i2 = 107;
                    break;
                case 2:
                    i2 = 109;
                    break;
                case 3:
                    i2 = 117;
                    break;
                default:
                    i2 = 12;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1246z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 12);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public C0194n mo7a(String str, C0217x c0217x, int i, int i2) throws fb {
        return mo8a(str, c0217x, i, i2, null);
    }

    /* renamed from: a */
    public C0194n mo8a(String str, C0217x c0217x, int i, int i2, Map<C0204i, ?> map) throws fb {
        cb c0109j;
        switch (C0207l.f775a[c0217x.ordinal()]) {
            case 1:
                c0109j = new C0109j();
                break;
            case 2:
                c0109j = new C0110k();
                break;
            case 3:
                c0109j = new C0108i();
                break;
            case 4:
                c0109j = new C0123y();
                break;
            case 5:
                c0109j = new C0068d();
                break;
            case 6:
                c0109j = new C0104e();
                break;
            case 7:
                c0109j = new C0105f();
                break;
            case 8:
                c0109j = new C0103d();
                break;
            case 9:
                c0109j = new C0106g();
                break;
            case 10:
                c0109j = new C0174g();
                break;
            case 11:
                c0109j = new C0102c();
                break;
            case 12:
                c0109j = new C0028d();
                break;
            case 13:
                c0109j = new C0138d();
                break;
            default:
                throw new IllegalArgumentException(f773z + c0217x);
        }
        return c0109j.mo8a(str, c0217x, i, i2, map);
    }
}
