package p000a.p001a.p002a.p019g;

import fr.pcsoft.wdjava.core.C0607n;
import java.nio.charset.Charset;
import java.util.Map;
import p000a.p001a.p002a.C0216w;

/* renamed from: a.a.a.g.k */
public final class C0191k {
    /* renamed from: a */
    private static final boolean f735a;
    /* renamed from: b */
    private static String f736b = f741g;
    /* renamed from: c */
    private static final String f737c = C0191k.m1191z(C0191k.m1192z("\u00197+^|\f"));
    /* renamed from: d */
    private static final String f738d = C0191k.m1191z(C0191k.m1192z("\t6.9"));
    /* renamed from: e */
    public static final String f739e = C0191k.m1191z(C0191k.m1192z("\u001b Z2\u0007n"));
    /* renamed from: f */
    private static final String f740f = C0191k.m1191z(C0191k.m1192z("\u00151'9\u000ei[70"));
    /* renamed from: g */
    private static final String f741g = Charset.defaultCharset().name();
    /* renamed from: h */
    public static final String f742h = C0191k.m1191z(C0191k.m1192z("\u000f(!R"));

    static {
        boolean z = f742h.equalsIgnoreCase(f741g) || f737c.equalsIgnoreCase(f741g);
        f735a = z;
    }

    private C0191k() {
    }

    /* renamed from: a */
    public static String m1189a(byte[] bArr, Map<C0216w, ?> map) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Object obj;
        Object obj2;
        if (map != null) {
            if (map.containsKey(C0216w.CHARACTER_SET)) {
                return map.get(C0216w.CHARACTER_SET).toString();
            }
        }
        int length = bArr.length;
        int i7 = 0;
        int i8 = 0;
        if (bArr.length <= 3 || bArr[0] != (byte) -17 || bArr[1] != (byte) -69 || bArr[2] == (byte) -65) {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
            obj = 1;
            obj2 = 1;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
            obj = 1;
            obj2 = 1;
        }
        while (i < length && (obj2 != null || obj != null)) {
            Object obj3;
            int i9;
            Object obj4;
            int i10;
            int i11;
            int i12 = bArr[i] & 255;
            if (obj2 != null) {
                if (i12 > C0607n.bx && i12 < 160) {
                    obj3 = null;
                    i9 = i8;
                    if (obj != null) {
                        i8 = i4;
                        i4 = i5;
                        i5 = i6;
                        obj4 = obj;
                        i10 = i7;
                        i7 = i3;
                        i3 = i10;
                    } else if (i6 > 0) {
                        if (i12 != 128) {
                        }
                        i10 = i7;
                        i7 = i3;
                        i3 = i10;
                        i11 = i4;
                        i4 = i5;
                        i5 = i6;
                        obj4 = null;
                        i8 = i11;
                    } else {
                        if (i12 >= 64) {
                        }
                        i10 = i7;
                        i7 = i3;
                        i3 = i10;
                        i11 = i4;
                        i4 = i5;
                        i5 = i6;
                        obj4 = null;
                        i8 = i11;
                    }
                    i++;
                    obj = obj4;
                    i6 = i5;
                    i5 = i4;
                    i4 = i8;
                    i8 = i9;
                    obj2 = obj3;
                    i10 = i7;
                    i7 = i3;
                    i3 = i10;
                } else if (i12 > 159 && (i12 < 192 || i12 == 215 || i12 == 247)) {
                    obj3 = obj2;
                    i9 = i8 + 1;
                    if (obj != null) {
                        i8 = i4;
                        i4 = i5;
                        i5 = i6;
                        obj4 = obj;
                        i10 = i7;
                        i7 = i3;
                        i3 = i10;
                    } else if (i6 > 0) {
                        if (i12 >= 64 || i12 == C0607n.bx || i12 > 252) {
                            i10 = i7;
                            i7 = i3;
                            i3 = i10;
                            i11 = i4;
                            i4 = i5;
                            i5 = i6;
                            obj4 = null;
                            i8 = i11;
                        } else {
                            i8 = i6 - 1;
                            obj4 = obj;
                            i10 = i3;
                            i3 = i7;
                            i7 = i10;
                            i11 = i5;
                            i5 = i8;
                            i8 = i4;
                            i4 = i11;
                        }
                    } else if (i12 != 128 || i12 == 160 || i12 > C0607n.Au) {
                        i10 = i7;
                        i7 = i3;
                        i3 = i10;
                        i11 = i4;
                        i4 = i5;
                        i5 = i6;
                        obj4 = null;
                        i8 = i11;
                    } else if (i12 > 160 && i12 < 224) {
                        i5++;
                        i3 = i4 + 1;
                        if (i3 > i7) {
                            i7 = 0;
                            i4 = i5;
                            i8 = i3;
                            i5 = i6;
                            obj4 = obj;
                        } else {
                            i4 = i5;
                            i5 = i6;
                            obj4 = obj;
                            i10 = i7;
                            i7 = 0;
                            i8 = i3;
                            i3 = i10;
                        }
                    } else if (i12 > C0607n.bx) {
                        i4 = i6 + 1;
                        i8 = 0;
                        i3++;
                        if (i3 > i2) {
                            i2 = i3;
                            obj4 = obj;
                            i10 = i3;
                            i3 = i7;
                            i7 = i10;
                            i11 = i4;
                            i4 = i5;
                            i5 = i11;
                        } else {
                            obj4 = obj;
                            i10 = i3;
                            i3 = i7;
                            i7 = i10;
                            i11 = i4;
                            i4 = i5;
                            i5 = i11;
                        }
                    } else {
                        i8 = 0;
                        i4 = i5;
                        i5 = i6;
                        obj4 = obj;
                        i3 = i7;
                        i7 = 0;
                    }
                    i++;
                    obj = obj4;
                    i6 = i5;
                    i5 = i4;
                    i4 = i8;
                    i8 = i9;
                    obj2 = obj3;
                    i10 = i7;
                    i7 = i3;
                    i3 = i10;
                }
            }
            obj3 = obj2;
            i9 = i8;
            if (obj != null) {
                i8 = i4;
                i4 = i5;
                i5 = i6;
                obj4 = obj;
                i10 = i7;
                i7 = i3;
                i3 = i10;
            } else if (i6 > 0) {
                if (i12 >= 64) {
                }
                i10 = i7;
                i7 = i3;
                i3 = i10;
                i11 = i4;
                i4 = i5;
                i5 = i6;
                obj4 = null;
                i8 = i11;
            } else {
                if (i12 != 128) {
                }
                i10 = i7;
                i7 = i3;
                i3 = i10;
                i11 = i4;
                i4 = i5;
                i5 = i6;
                obj4 = null;
                i8 = i11;
            }
            i++;
            obj = obj4;
            i6 = i5;
            i5 = i4;
            i4 = i8;
            i8 = i9;
            obj2 = obj3;
            i10 = i7;
            i7 = i3;
            i3 = i10;
        }
        if (obj != null && i6 > 0) {
            obj = null;
        }
        return (obj == null || (!f735a && i7 < 3 && i2 < 3)) ? (obj2 == null || obj == null) ? obj2 != null ? f740f : obj != null ? f742h : f736b : (!(i7 == 2 && i5 == 2) && i8 * 10 < length) ? f740f : f742h : f742h;
    }

    /* renamed from: a */
    public static final void m1190a(String str) {
        f736b = str;
    }

    /* renamed from: z */
    private static String m1191z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 92;
                    break;
                case 1:
                    i2 = 98;
                    break;
                case 2:
                    i2 = 104;
                    break;
                case 3:
                    i2 = 1;
                    break;
                default:
                    i2 = 54;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1192z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 54);
        }
        return toCharArray;
    }
}
