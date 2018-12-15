package p000a.p001a.p002a.p003a.p004a;

import android.support.v4.view.InputDeviceCompat;
import fr.pcsoft.wdjava.core.C0607n;

/* renamed from: a.a.a.a.a.h */
final class C0007h implements C0000a {
    /* renamed from: z */
    private static final String f44z = C0007h.m72z(C0007h.m73z("QWpl\u0019{W#s\u001drUwwXr]w?\u0011r\u0012u~\u0014uV#m\u0019rUflB<"));

    C0007h() {
    }

    /* renamed from: a */
    private static char m71a(char c, int i) {
        int i2 = (((i * 149) % 255) + 1) + c;
        return i2 <= 255 ? (char) i2 : (char) (i2 + InputDeviceCompat.SOURCE_ANY);
    }

    /* renamed from: z */
    private static String m72z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 28;
                    break;
                case 1:
                    i2 = 50;
                    break;
                case 2:
                    i2 = 3;
                    break;
                case 3:
                    i2 = 31;
                    break;
                default:
                    i2 = C0607n.co;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m73z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ C0607n.co);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public int mo3a() {
        return 5;
    }

    /* renamed from: a */
    public void mo4a(C0006g c0006g) {
        int a;
        int i = 1;
        int i2 = 0;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('\u0000');
        while (c0006g.m66i()) {
            stringBuilder.append(c0006g.m62e());
            c0006g.f35a++;
            a = C0001b.m4a(c0006g.m68k(), c0006g.f35a, mo3a());
            try {
                if (a != mo3a()) {
                    c0006g.m59b(a);
                    break;
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        a = stringBuilder.length() - 1;
        int h = (c0006g.m65h() + a) + 1;
        try {
            c0006g.m54a(h);
            if (c0006g.m67j().m37h() - h <= 0) {
                i = 0;
            }
            try {
                if (c0006g.m66i() || r0 != 0) {
                    if (a <= 249) {
                        try {
                            stringBuilder.setCharAt(0, (char) a);
                        } catch (IllegalStateException e2) {
                            throw e2;
                        }
                    } else if (a <= 1555) {
                        try {
                            stringBuilder.setCharAt(0, (char) ((a / C0607n.Ux) + 249));
                            stringBuilder.insert(1, (char) (a % C0607n.Ux));
                        } catch (IllegalStateException e22) {
                            throw e22;
                        }
                    } else {
                        throw new IllegalStateException(f44z + a);
                    }
                }
                i = stringBuilder.length();
                while (i2 < i) {
                    try {
                        c0006g.m53a(C0007h.m71a(stringBuilder.charAt(i2), c0006g.m65h() + 1));
                        i2++;
                    } catch (IllegalStateException e222) {
                        throw e222;
                    }
                }
            } catch (IllegalStateException e2222) {
                throw e2222;
            } catch (IllegalStateException e22222) {
                throw e22222;
            }
        } catch (IllegalStateException e222222) {
            throw e222222;
        }
    }
}
