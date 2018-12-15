package p000a.p001a.p002a.p007b.p008a;

import fr.pcsoft.wdjava.core.C0607n;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p000a.p001a.p002a.C0212s;
import p000a.p001a.p002a.C0216w;
import p000a.p001a.p002a.p019g.C0186g;
import p000a.p001a.p002a.p019g.C0187h;
import p000a.p001a.p002a.p019g.C0191k;
import p000a.p001a.p002a.p019g.C0193m;

/* renamed from: a.a.a.b.a.k */
final class C0042k {
    /* renamed from: a */
    private static final int f108a = 1;
    /* renamed from: b */
    private static final char[] f109b = C0042k.m237z(C0042k.m238z("\u0003+\u0016\u001dm\u0006,\u0013\u0016`rXgj\u001cu]lg\u0013xVi`\u0016cKv}\rfLsv\u0000i:\u0000\u000bs\u00187\n\u0001c")).toCharArray();
    /* renamed from: z */
    private static final String[] f110z = new String[]{C0042k.m237z(C0042k.m238z("`Pm}")), C0042k.m237z(C0042k.m238z("tX\u0016\u001dh\u0001"))};

    private C0042k() {
    }

    /* renamed from: a */
    private static char m229a(int i) throws C0212s {
        try {
            if (i < f109b.length) {
                return f109b[i];
            }
            throw C0212s.m1267a();
        } catch (C0212s e) {
            throw e;
        }
    }

    /* renamed from: a */
    private static int m230a(C0193m c0193m) throws C0212s {
        int a = c0193m.m1201a(8);
        if ((a & 128) == 0) {
            return a & C0607n.bx;
        }
        if ((a & 192) == 128) {
            return ((a & 63) << 8) | c0193m.m1201a(8);
        } else if ((a & 224) == 192) {
            return ((a & 31) << 16) | c0193m.m1201a(16);
        } else {
            throw C0212s.m1267a();
        }
    }

    /* renamed from: a */
    static C0187h m231a(byte[] bArr, C0049r c0049r, C0046o c0046o, Map<C0216w, ?> map) throws C0212s {
        int i;
        int i2;
        C0193m c0193m = new C0193m(bArr);
        StringBuilder stringBuilder = new StringBuilder(50);
        List arrayList = new ArrayList(1);
        C0186g c0186g = null;
        int i3 = -1;
        int i4 = -1;
        boolean z = false;
        while (true) {
            boolean z2;
            C0048q forBits = c0193m.m1202b() < 4 ? C0048q.TERMINATOR : C0048q.forBits(c0193m.m1201a(4));
            try {
                if (forBits == C0048q.TERMINATOR) {
                    z2 = z;
                    i = i4;
                    i2 = i3;
                } else if (forBits == C0048q.FNC1_FIRST_POSITION || forBits == C0048q.FNC1_SECOND_POSITION) {
                    z2 = true;
                    i = i4;
                    i2 = i3;
                } else if (forBits == C0048q.STRUCTURED_APPEND) {
                    if (c0193m.m1202b() < 16) {
                        throw C0212s.m1267a();
                    }
                    z2 = z;
                    i = c0193m.m1201a(8);
                    i2 = c0193m.m1201a(8);
                } else if (forBits == C0048q.ECI) {
                    c0186g = C0186g.getCharacterSetECIByValue(C0042k.m230a(c0193m));
                    if (c0186g == null) {
                        throw C0212s.m1267a();
                    }
                    z2 = z;
                    i = i4;
                    i2 = i3;
                } else if (forBits == C0048q.HANZI) {
                    r2 = c0193m.m1201a(4);
                    i = c0193m.m1201a(forBits.getCharacterCountBits(c0049r));
                    if (r2 == 1) {
                        C0042k.m236c(c0193m, stringBuilder, i);
                    }
                    z2 = z;
                    i = i4;
                    i2 = i3;
                } else {
                    r2 = c0193m.m1201a(forBits.getCharacterCountBits(c0049r));
                    if (forBits == C0048q.NUMERIC) {
                        C0042k.m235b(c0193m, stringBuilder, r2);
                        z2 = z;
                        i = i4;
                        i2 = i3;
                    } else if (forBits == C0048q.ALPHANUMERIC) {
                        C0042k.m234a(c0193m, stringBuilder, r2, z);
                        z2 = z;
                        i = i4;
                        i2 = i3;
                    } else if (forBits == C0048q.BYTE) {
                        C0042k.m233a(c0193m, stringBuilder, r2, c0186g, arrayList, map);
                        z2 = z;
                        i = i4;
                        i2 = i3;
                    } else if (forBits == C0048q.KANJI) {
                        C0042k.m232a(c0193m, stringBuilder, r2);
                        z2 = z;
                        i = i4;
                        i2 = i3;
                    } else {
                        throw C0212s.m1267a();
                    }
                }
            } catch (IllegalArgumentException e) {
                throw e;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
            try {
                if (forBits == C0048q.TERMINATOR) {
                    try {
                        break;
                    } catch (IllegalArgumentException e22) {
                        throw e22;
                    }
                }
                i3 = i2;
                i4 = i;
                z = z2;
            } catch (IllegalArgumentException e222) {
                throw e222;
            } catch (IllegalArgumentException e2222) {
                throw e2222;
            } catch (IllegalArgumentException e22222) {
                throw e22222;
            } catch (IllegalArgumentException e222222) {
                throw e222222;
            } catch (IllegalArgumentException e2222222) {
                throw e2222222;
            } catch (IllegalArgumentException e22222222) {
                throw e22222222;
            } catch (IllegalArgumentException e222222222) {
                throw e222222222;
            } catch (IllegalArgumentException e2222222222) {
                throw e2222222222;
            } catch (IllegalArgumentException e3) {
                throw C0212s.m1267a();
            }
        }
        return new C0187h(bArr, stringBuilder.toString(), arrayList.isEmpty() ? null : arrayList, c0046o == null ? null : c0046o.toString(), i, i2);
    }

    /* renamed from: a */
    private static void m232a(C0193m c0193m, StringBuilder stringBuilder, int i) throws C0212s {
        try {
            if (i * 13 > c0193m.m1202b()) {
                throw C0212s.m1267a();
            }
            byte[] bArr = new byte[(i * 2)];
            int i2 = 0;
            while (i > 0) {
                int a = c0193m.m1201a(13);
                a = (a % 192) | ((a / 192) << 8);
                a = a < 7936 ? a + 33088 : a + 49472;
                bArr[i2] = (byte) (a >> 8);
                bArr[i2 + 1] = (byte) a;
                i--;
                i2 += 2;
            }
            try {
                stringBuilder.append(new String(bArr, f110z[0]));
            } catch (UnsupportedEncodingException e) {
                throw C0212s.m1267a();
            }
        } catch (UnsupportedEncodingException e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    private static void m233a(C0193m c0193m, StringBuilder stringBuilder, int i, C0186g c0186g, Collection<byte[]> collection, Map<C0216w, ?> map) throws C0212s {
        try {
            if (i * 8 > c0193m.m1202b()) {
                throw C0212s.m1267a();
            }
            Object obj = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                try {
                    obj[i2] = (byte) c0193m.m1201a(8);
                    i2++;
                } catch (UnsupportedEncodingException e) {
                    throw e;
                }
            }
            try {
                stringBuilder.append(new String(obj, c0186g == null ? C0191k.m1189a(obj, map) : c0186g.name()));
                collection.add(obj);
            } catch (UnsupportedEncodingException e2) {
                throw C0212s.m1267a();
            }
        } catch (UnsupportedEncodingException e3) {
            throw e3;
        }
    }

    /* renamed from: a */
    private static void m234a(C0193m c0193m, StringBuilder stringBuilder, int i, boolean z) throws C0212s {
        int length = stringBuilder.length();
        while (i > 1) {
            try {
                if (c0193m.m1202b() < 11) {
                    throw C0212s.m1267a();
                }
                int a = c0193m.m1201a(11);
                stringBuilder.append(C0042k.m229a(a / 45));
                stringBuilder.append(C0042k.m229a(a % 45));
                i -= 2;
            } catch (C0212s e) {
                throw e;
            }
        }
        if (i == 1) {
            try {
                if (c0193m.m1202b() < 6) {
                    throw C0212s.m1267a();
                }
                stringBuilder.append(C0042k.m229a(c0193m.m1201a(6)));
            } catch (C0212s e2) {
                throw e2;
            }
        }
        if (z) {
            while (length < stringBuilder.length()) {
                try {
                    if (stringBuilder.charAt(length) == '%') {
                        try {
                            if (length < stringBuilder.length() - 1) {
                                try {
                                    if (stringBuilder.charAt(length + 1) == '%') {
                                        stringBuilder.deleteCharAt(length + 1);
                                    }
                                } catch (C0212s e22) {
                                    throw e22;
                                }
                            }
                            stringBuilder.setCharAt(length, '\u001d');
                        } catch (C0212s e222) {
                            throw e222;
                        }
                    }
                    length++;
                } catch (C0212s e2222) {
                    throw e2222;
                } catch (C0212s e22222) {
                    throw e22222;
                }
            }
        }
    }

    /* renamed from: b */
    private static void m235b(C0193m c0193m, StringBuilder stringBuilder, int i) throws C0212s {
        int a;
        while (i >= 3) {
            try {
                if (c0193m.m1202b() < 10) {
                    throw C0212s.m1267a();
                }
                a = c0193m.m1201a(10);
                if (a >= 1000) {
                    try {
                        throw C0212s.m1267a();
                    } catch (C0212s e) {
                        throw e;
                    }
                }
                stringBuilder.append(C0042k.m229a(a / 100));
                stringBuilder.append(C0042k.m229a((a / 10) % 10));
                stringBuilder.append(C0042k.m229a(a % 10));
                i -= 3;
            } catch (C0212s e2) {
                throw e2;
            }
        }
        if (i == 2) {
            try {
                if (c0193m.m1202b() < 7) {
                    throw C0212s.m1267a();
                }
                a = c0193m.m1201a(7);
                if (a >= 100) {
                    try {
                        throw C0212s.m1267a();
                    } catch (C0212s e22) {
                        throw e22;
                    }
                }
                stringBuilder.append(C0042k.m229a(a / 10));
                stringBuilder.append(C0042k.m229a(a % 10));
            } catch (C0212s e222) {
                throw e222;
            }
        } else if (i == 1) {
            try {
                if (c0193m.m1202b() < 4) {
                    throw C0212s.m1267a();
                }
                a = c0193m.m1201a(4);
                if (a >= 10) {
                    try {
                        throw C0212s.m1267a();
                    } catch (C0212s e2222) {
                        throw e2222;
                    }
                }
                stringBuilder.append(C0042k.m229a(a));
            } catch (C0212s e22222) {
                throw e22222;
            }
        }
    }

    /* renamed from: c */
    private static void m236c(C0193m c0193m, StringBuilder stringBuilder, int i) throws C0212s {
        try {
            if (i * 13 > c0193m.m1202b()) {
                throw C0212s.m1267a();
            }
            byte[] bArr = new byte[(i * 2)];
            int i2 = 0;
            while (i > 0) {
                int a = c0193m.m1201a(13);
                a = (a % 96) | ((a / 96) << 8);
                a = a < 959 ? a + 41377 : a + 42657;
                bArr[i2] = (byte) ((a >> 8) & 255);
                bArr[i2 + 1] = (byte) (a & 255);
                i--;
                i2 += 2;
            }
            try {
                stringBuilder.append(new String(bArr, f110z[1]));
            } catch (UnsupportedEncodingException e) {
                throw C0212s.m1267a();
            }
        } catch (UnsupportedEncodingException e2) {
            throw e2;
        }
    }

    /* renamed from: z */
    private static String m237z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 51;
                    break;
                case 1:
                    i2 = 26;
                    break;
                case 2:
                    i2 = 36;
                    break;
                case 3:
                    i2 = 46;
                    break;
                default:
                    i2 = 89;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m238z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 89);
        }
        return toCharArray;
    }
}
