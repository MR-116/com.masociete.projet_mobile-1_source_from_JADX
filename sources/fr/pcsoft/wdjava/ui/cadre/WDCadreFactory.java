package fr.pcsoft.wdjava.ui.cadre;

import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.ui.p064a.C1031a;
import fr.pcsoft.wdjava.ui.style.degrade.IWDDegrade;
import fr.pcsoft.wdjava.ui.utils.C1511l;

public class WDCadreFactory {
    /* renamed from: z */
    private static final String f3391z = m8066z(m8067z("\fx\u001f65<dO0t<s\ns{7oO4ü*èOi5"));

    /* renamed from: a */
    public static final C1110m m8064a(int i, int i2, int i3, int i4, int i5, int i6) {
        switch (i) {
            case 1:
                return new C1116f(i4);
            case 2:
                break;
            case 13:
                return new C1118h(i2, i4);
            case 15:
                return new C1119i(i2, i4);
            case 17:
            case 18:
                return new C1121k(i4);
            case 23:
                return new C1114d(i2, i4, i5, i6, false);
            case 25:
                return new C1120j(i2, i4);
            case 27:
            case 29:
                return new C1114d(i2, i4, i5, i6, true);
            case 31:
                return new C1115e(i2, i4);
            default:
                C0691a.m2856a(f3391z + i);
                break;
        }
        return new C1117g(i2, i4);
    }

    /* renamed from: a */
    public static final C1110m m8065a(int i, int i2, int i3, IWDDegrade iWDDegrade, int i4, int i5) {
        switch (i) {
            case 1:
                return new C1116f(iWDDegrade);
            case 2:
                break;
            case 15:
                return new C1119i(i2, iWDDegrade);
            case 17:
                return new C1117g(i2, iWDDegrade);
            case 18:
                return new C1118h(i2, iWDDegrade);
            case 23:
                return new C1114d(i2, iWDDegrade, i4, i5, false);
            case 25:
                return new C1120j(i2, iWDDegrade);
            case 27:
                return new C1114d(i2, iWDDegrade, i4, i5, true);
            case 31:
                return new C1115e(i2, iWDDegrade);
            default:
                C0691a.m2856a(f3391z + i);
                break;
        }
        return new C1117g(i2, iWDDegrade);
    }

    public static final C1110m creerCadre_GEN(int i, int i2, int i3, int i4, int i5, int i6) {
        return creerCadre_GEN(i, i2, i3, i4, i5, i6, 1, 1);
    }

    public static final C1110m creerCadre_GEN(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C1110m a = m8064a(i, C1031a.m7467k(i2), C1031a.m7467k(i3), C1031a.m7467k(i4), C1511l.m10532d((float) i5, 2), C1511l.m10532d((float) i6, 2));
        a.mo3381a(C1511l.m10532d((float) i7, 2));
        a.mo3384c(i8);
        return a;
    }

    public static final C1110m creerCadre_GEN(int i, int i2, int i3, IWDDegrade iWDDegrade, int i4, int i5) {
        return creerCadre_GEN(i, i2, i3, iWDDegrade, i4, i5, 1, 1);
    }

    public static final C1110m creerCadre_GEN(int i, int i2, int i3, IWDDegrade iWDDegrade, int i4, int i5, int i6, int i7) {
        C1110m a = m8065a(i, C1031a.m7467k(i2), C1031a.m7467k(i3), iWDDegrade, C1511l.m10532d((float) i4, 2), C1511l.m10532d((float) i5, 2));
        a.mo3381a(C1511l.m10532d((float) i6, 2));
        a.mo3384c(i7);
        return a;
    }

    public static C1110m creerCadre_GEN(int i, int[] iArr, int[] iArr2) {
        int k = C1031a.m7467k(i);
        iArr[0] = C1031a.m7467k(iArr[0]);
        iArr[3] = C1031a.m7467k(iArr[3]);
        iArr[6] = C1031a.m7467k(iArr[6]);
        iArr[9] = C1031a.m7467k(iArr[9]);
        iArr[1] = C1511l.m10532d((float) iArr[1], 2);
        iArr[4] = C1511l.m10532d((float) iArr[4], 2);
        iArr[7] = C1511l.m10532d((float) iArr[7], 2);
        iArr[10] = C1511l.m10532d((float) iArr[10], 2);
        iArr2[0] = C1511l.m10532d((float) iArr2[0], 2);
        iArr2[1] = C1511l.m10532d((float) iArr2[1], 2);
        iArr2[2] = C1511l.m10532d((float) iArr2[2], 2);
        iArr2[3] = C1511l.m10532d((float) iArr2[3], 2);
        iArr2[4] = C1511l.m10532d((float) iArr2[4], 2);
        iArr2[5] = C1511l.m10532d((float) iArr2[5], 2);
        iArr2[6] = C1511l.m10532d((float) iArr2[6], 2);
        iArr2[7] = C1511l.m10532d((float) iArr2[7], 2);
        if (iArr[0] != iArr[3] || iArr[0] != iArr[6] || iArr[0] != iArr[9] || iArr[2] != iArr[5] || iArr[2] != iArr[8] || iArr[2] != iArr[11] || iArr2[0] != iArr2[2] || iArr2[0] != iArr2[4] || iArr2[0] != iArr2[6] || iArr2[1] != iArr2[3] || iArr2[1] != iArr2[5] || iArr2[1] != iArr2[7]) {
            return new C1122l(k, iArr, iArr2);
        }
        C1110m a;
        if (iArr2[0] > 0 || iArr2[1] > 0) {
            a = m8064a(27, iArr[0], iArr[0], k, iArr2[0], iArr2[1]);
        } else {
            a = m8064a(2, iArr[0], iArr[0], k, iArr2[0], iArr2[1]);
        }
        a.mo3381a(iArr[1]);
        a.mo3384c(iArr[2]);
        return a;
    }

    public static C1110m creerCadre_GEN(IWDDegrade iWDDegrade, int[] iArr, int[] iArr2) {
        C1110m creerCadre_GEN = creerCadre_GEN(iWDDegrade.mo3809b(), iArr, iArr2);
        if (creerCadre_GEN instanceof C1112b) {
            ((C1112b) creerCadre_GEN).m8115a(iWDDegrade);
        } else if (creerCadre_GEN instanceof C1122l) {
            ((C1122l) creerCadre_GEN).m8214a(iWDDegrade);
        }
        return creerCadre_GEN;
    }

    public static C1110m creerCadre_GEN(String str, int[] iArr, int[] iArr2, int i, int i2, int i3) {
        return new C1113c(str, C1031a.m7467k(i), i3, C1511l.m10532d((float) i2, 2));
    }

    public static C1110m creerCadre_GEN(String str, int[] iArr, int[] iArr2, IWDDegrade iWDDegrade, int i, int i2) {
        return new C1113c(str, iWDDegrade, i2, C1511l.m10532d((float) i, 2));
    }

    /* renamed from: z */
    private static String m8066z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 88;
                    break;
                case 1:
                    i2 = 1;
                    break;
                case 2:
                    i2 = 111;
                    break;
                case 3:
                    i2 = 83;
                    break;
                default:
                    i2 = 21;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m8067z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 21);
        }
        return toCharArray;
    }
}
