package p000a.p001a.p002a.p011c;

import fr.pcsoft.wdjava.core.C0607n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import p000a.p001a.p002a.C0204i;
import p000a.p001a.p002a.C0217x;
import p000a.p001a.p002a.fb;
import p000a.p001a.p002a.p019g.C0194n;

/* renamed from: a.a.a.c.d */
public final class C0103d extends C0101b {
    /* renamed from: a */
    private static final int f320a = 99;
    /* renamed from: b */
    private static final int f321b = 100;
    /* renamed from: c */
    private static final int f322c = 102;
    /* renamed from: d */
    private static final char f323d = 'ò';
    /* renamed from: e */
    private static final int f324e = 100;
    /* renamed from: f */
    private static final char f325f = 'ñ';
    /* renamed from: g */
    private static final char f326g = 'ó';
    /* renamed from: h */
    private static final int f327h = 96;
    /* renamed from: i */
    private static final int f328i = 106;
    /* renamed from: j */
    private static final int f329j = 105;
    /* renamed from: k */
    private static final int f330k = 104;
    /* renamed from: l */
    private static final char f331l = 'ô';
    /* renamed from: m */
    private static final int f332m = 97;
    /* renamed from: z */
    private static final String[] f333z = new String[]{C0103d.m603z(C0103d.m604z("u>Bc2X%_7;S?Kc?\u0016\"Dx\"Z5\fu2\u00163Ic S4B7f\u00160Bsw\u000ea\ft?W#Mt#S#_;wT$X70Y%\f")), C0103d.m603z(C0103d.m604z("t0H74^0^v4B4^7>XqEy'C%\u00167")), C0103d.m603z(C0103d.m604z("u0B78X=U72X2Cs2\u0016\u0012cS\u0012i`\u001e/{\u00163YcwQ>X7"))};

    /* renamed from: a */
    private static int m601a(CharSequence charSequence, int i, int i2) {
        cb a = C0103d.m602a(charSequence, i);
        try {
            if (a != cb.UNCODABLE) {
                if (a != cb.ONE_DIGIT) {
                    if (i2 == 99) {
                        return i2;
                    }
                    if (i2 == 100) {
                        try {
                            if (a == cb.FNC_1) {
                                return i2;
                            }
                            a = C0103d.m602a(charSequence, i + 2);
                            try {
                                if (a == cb.UNCODABLE) {
                                    return i2;
                                }
                                if (a == cb.ONE_DIGIT) {
                                    return i2;
                                }
                                if (a == cb.FNC_1) {
                                    try {
                                        return C0103d.m602a(charSequence, i + 3) == cb.TWO_DIGITS ? 99 : 100;
                                    } catch (IllegalArgumentException e) {
                                        throw e;
                                    }
                                }
                                cb a2;
                                int i3 = i + 4;
                                while (true) {
                                    a2 = C0103d.m602a(charSequence, i3);
                                    try {
                                        if (a2 == cb.TWO_DIGITS) {
                                            i3 += 2;
                                        } else {
                                            try {
                                                break;
                                            } catch (IllegalArgumentException e2) {
                                                throw e2;
                                            }
                                        }
                                    } catch (IllegalArgumentException e22) {
                                        throw e22;
                                    }
                                }
                                return a2 == cb.ONE_DIGIT ? 100 : 99;
                            } catch (IllegalArgumentException e222) {
                                throw e222;
                            } catch (IllegalArgumentException e2222) {
                                throw e2222;
                            }
                        } catch (IllegalArgumentException e22222) {
                            throw e22222;
                        }
                    }
                    if (a == cb.FNC_1) {
                        a = C0103d.m602a(charSequence, i + 1);
                    }
                    try {
                        return a == cb.TWO_DIGITS ? 99 : 100;
                    } catch (IllegalArgumentException e222222) {
                        throw e222222;
                    }
                }
            }
            return 100;
        } catch (IllegalArgumentException e2222222) {
            throw e2222222;
        } catch (IllegalArgumentException e22222222) {
            throw e22222222;
        }
    }

    /* renamed from: a */
    private static cb m602a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        if (i >= length) {
            try {
                return cb.UNCODABLE;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        char charAt = charSequence.charAt(i);
        if (charAt == f325f) {
            try {
                return cb.FNC_1;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } else if (charAt < '0' || charAt > '9') {
            try {
                return cb.UNCODABLE;
            } catch (IllegalArgumentException e22) {
                throw e22;
            }
        } else if (i + 1 >= length) {
            try {
                return cb.ONE_DIGIT;
            } catch (IllegalArgumentException e222) {
                throw e222;
            }
        } else {
            char charAt2 = charSequence.charAt(i + 1);
            if (charAt2 >= '0' && charAt2 <= '9') {
                return cb.TWO_DIGITS;
            }
            try {
                return cb.ONE_DIGIT;
            } catch (IllegalArgumentException e2222) {
                throw e2222;
            }
        }
    }

    /* renamed from: z */
    private static String m603z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 54;
                    break;
                case 1:
                    i2 = 81;
                    break;
                case 2:
                    i2 = 44;
                    break;
                case 3:
                    i2 = 23;
                    break;
                default:
                    i2 = 87;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m604z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 87);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public C0194n mo8a(String str, C0217x c0217x, int i, int i2, Map<C0204i, ?> map) throws fb {
        try {
            if (c0217x == C0217x.CODE_128) {
                return super.mo8a(str, c0217x, i, i2, map);
            }
            throw new IllegalArgumentException(f333z[2] + c0217x);
        } catch (fb e) {
            throw e;
        }
    }

    /* renamed from: a */
    public boolean[] mo21a(String str) {
        int i = 0;
        int length = str.length();
        if (length < 1 || length > 80) {
            try {
                throw new IllegalArgumentException(f333z[0] + length);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        int i2;
        for (i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt < ' ' || charAt > '~') {
                switch (charAt) {
                    case C0607n.bh /*241*/:
                    case 'ò':
                    case C0607n.Xn /*243*/:
                    case C0607n.uw /*244*/:
                        break;
                    default:
                        throw new IllegalArgumentException(f333z[1] + charAt);
                }
            }
        }
        Collection<int[]> arrayList = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        int i5 = 1;
        int i6 = 0;
        while (i3 < length) {
            int a = C0103d.m601a(str, i3, i4);
            if (a == i4) {
                try {
                    switch (str.charAt(i3)) {
                        case C0607n.bh /*241*/:
                            i2 = 102;
                            break;
                        case 'ò':
                            i2 = 97;
                            break;
                        case C0607n.Xn /*243*/:
                            i2 = 96;
                            break;
                        case C0607n.uw /*244*/:
                            i2 = 100;
                            break;
                        default:
                            if (i4 != 100) {
                                i2 = Integer.parseInt(str.substring(i3, i3 + 2));
                                i3++;
                                break;
                            }
                            i2 = str.charAt(i3) - 32;
                            break;
                    }
                    i3++;
                    a = i4;
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            }
            i2 = i4 == 0 ? a == 100 ? 104 : 105 : a;
            arrayList.add(C0112n.f364h[i2]);
            i4 = i6 + (i2 * i5);
            i5 = i3 != 0 ? i5 + 1 : i5;
            i6 = i4;
            i4 = a;
        }
        arrayList.add(C0112n.f364h[i6 % 103]);
        arrayList.add(C0112n.f364h[106]);
        int i7 = 0;
        for (int[] iArr : arrayList) {
            i3 = 0;
            while (i3 < iArr.length) {
                a = iArr[i3] + i7;
                i3++;
                i7 = a;
            }
        }
        boolean[] zArr = new boolean[i7];
        for (int[] iArr2 : arrayList) {
            i += C0101b.m587a(zArr, i, iArr2, true);
        }
        return zArr;
    }
}
