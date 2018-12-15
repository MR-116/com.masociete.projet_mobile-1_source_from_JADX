package p000a.p001a.p002a.p003a.p006c;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.p058k.C0931b;
import fr.pcsoft.wdjava.ui.p065b.p067a.qb;
import fr.pcsoft.wdjava.ui.p083l.C1449i;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p000a.p001a.p002a.C0212s;
import p000a.p001a.p002a.p019g.C0187h;
import p000a.p001a.p002a.p019g.C0193m;

/* renamed from: a.a.a.a.c.j */
final class C0027j {
    /* renamed from: a */
    private static final char[] f84a = new char[]{'`', qb.f3195j, 'B', qb.f3208x, 'D', 'E', 'F', 'G', qb.f3200p, 'I', 'J', 'K', qb.f3197l, qb.f3201q, 'N', 'O', 'P', qb.f3209y, 'R', qb.f3210z, qb.f3204t, 'U', qb.f3199n, 'W', 'X', 'Y', qb.f3192g, '{', '|', '}', '~', ''};
    /* renamed from: b */
    private static final char[] f85b = new char[]{'!', '\"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', '?', '@', C0931b.f2543a, '\\', C0931b.f2545c, '^', C1449i.hb};
    /* renamed from: c */
    private static final char[] f86c = f85b;
    /* renamed from: d */
    private static final char[] f87d = new char[]{'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', qb.f3206v, 'b', qb.f3191f, 'd', 'e', 'f', 'g', qb.f3193h, 'i', 'j', 'k', qb.f3207w, qb.f3198m, 'n', 'o', 'p', qb.f3205u, 'r', qb.f3194i, qb.f3202r, 'u', qb.f3203s, 'w', 'x', 'y', qb.f3196k};
    /* renamed from: e */
    private static final char[] f88e = new char[]{'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', qb.f3195j, 'B', qb.f3208x, 'D', 'E', 'F', 'G', qb.f3200p, 'I', 'J', 'K', qb.f3197l, qb.f3201q, 'N', 'O', 'P', qb.f3209y, 'R', qb.f3210z, qb.f3204t, 'U', qb.f3199n, 'W', 'X', 'Y', qb.f3192g};
    /* renamed from: z */
    private static final String[] f89z = new String[]{C0027j.m172z(C0027j.m173z("-U")), C0027j.m172z(C0027j.m173z("hx\u001b6V\u0006L")), C0027j.m172z(C0027j.m173z("hx\u001b6V\u0005L")), C0027j.m172z(C0027j.m173z("z\u0002j\u0010^\u0006hz\u0019")), C0027j.m172z(C0027j.m173z("c=D\\\u0000\\#H\b\u0002\\4V\b\b\\%\u0005[\u0013C!JZ\u0012\u0013#@Y\u0013Z#@LFV?FG\u0002Z?B\u0012F"))};

    private C0027j() {
    }

    /* renamed from: a */
    private static int m163a(int i, int i2) {
        int i3 = i - (((i2 * 149) % 255) + 1);
        return i3 >= 0 ? i3 : i3 + 256;
    }

    /* renamed from: a */
    private static C0023f m164a(C0193m c0193m, StringBuilder stringBuilder, StringBuilder stringBuilder2) throws C0212s {
        Object obj = null;
        do {
            int a = c0193m.m1201a(8);
            if (a == 0) {
                throw C0212s.m1267a();
            } else if (a <= 128) {
                stringBuilder.append((char) ((obj != null ? a + 128 : a) - 1));
                return C0023f.ASCII_ENCODE;
            } else if (a == C0607n.Wj) {
                try {
                    return C0023f.PAD_ENCODE;
                } catch (C0212s e) {
                    throw e;
                }
            } else if (a <= C0607n.Yw) {
                a += C0607n.jq;
                if (a < 10) {
                    try {
                        stringBuilder.append('0');
                    } catch (C0212s e2) {
                        throw e2;
                    }
                }
                stringBuilder.append(a);
            } else if (a == C0607n.no) {
                try {
                    return C0023f.C40_ENCODE;
                } catch (C0212s e22) {
                    throw e22;
                }
            } else if (a == 231) {
                try {
                    return C0023f.BASE256_ENCODE;
                } catch (C0212s e222) {
                    throw e222;
                }
            } else if (a == 232) {
                try {
                    stringBuilder.append('\u001d');
                } catch (C0212s e2222) {
                    throw e2222;
                }
            } else if (!(a == 233 || a == C0607n.Jn)) {
                if (a == 235) {
                    int i = 1;
                } else if (a == 236) {
                    try {
                        stringBuilder.append(f89z[1]);
                        stringBuilder2.insert(0, f89z[0]);
                    } catch (C0212s e22222) {
                        throw e22222;
                    }
                } else if (a == C0607n.yk) {
                    try {
                        stringBuilder.append(f89z[2]);
                        stringBuilder2.insert(0, f89z[0]);
                    } catch (C0212s e222222) {
                        throw e222222;
                    }
                } else if (a == 238) {
                    try {
                        return C0023f.ANSIX12_ENCODE;
                    } catch (C0212s e2222222) {
                        throw e2222222;
                    }
                } else if (a == C0607n.Au) {
                    try {
                        return C0023f.TEXT_ENCODE;
                    } catch (C0212s e22222222) {
                        throw e22222222;
                    }
                } else if (a == 240) {
                    try {
                        return C0023f.EDIFACT_ENCODE;
                    } catch (C0212s e222222222) {
                        throw e222222222;
                    }
                } else if (a != C0607n.bh && a >= 242) {
                    if (a == 254) {
                        try {
                            if (c0193m.m1202b() != 0) {
                            }
                        } catch (C0212s e2222222222) {
                            throw e2222222222;
                        }
                    }
                    throw C0212s.m1267a();
                }
            }
        } while (c0193m.m1202b() > 0);
        return C0023f.ASCII_ENCODE;
    }

    /* renamed from: a */
    static C0187h m165a(byte[] bArr) throws C0212s {
        C0193m c0193m = new C0193m(bArr);
        StringBuilder stringBuilder = new StringBuilder(100);
        StringBuilder stringBuilder2 = new StringBuilder(0);
        Collection arrayList = new ArrayList(1);
        C0023f c0023f = C0023f.ASCII_ENCODE;
        do {
            List list;
            if (c0023f == C0023f.ASCII_ENCODE) {
                c0023f = C0027j.m164a(c0193m, stringBuilder, stringBuilder2);
            } else {
                try {
                    switch (C0019b.f65a[c0023f.ordinal()]) {
                        case 1:
                            C0027j.m171d(c0193m, stringBuilder);
                            break;
                        case 2:
                            C0027j.m170c(c0193m, stringBuilder);
                            break;
                        case 3:
                            C0027j.m169b(c0193m, stringBuilder);
                            break;
                        case 4:
                            C0027j.m167a(c0193m, stringBuilder);
                            break;
                        case 5:
                            C0027j.m168a(c0193m, stringBuilder, arrayList);
                            break;
                        default:
                            throw C0212s.m1267a();
                    }
                    c0023f = C0023f.ASCII_ENCODE;
                } catch (C0212s e) {
                    throw e;
                }
            }
            try {
                if (c0023f != C0023f.PAD_ENCODE) {
                }
                if (stringBuilder2.length() > 0) {
                    stringBuilder.append(stringBuilder2);
                }
                try {
                    String stringBuilder3 = stringBuilder.toString();
                    if (arrayList.isEmpty()) {
                        Collection collection = arrayList;
                    } else {
                        list = null;
                    }
                    return new C0187h(bArr, stringBuilder3, list, null);
                } catch (C0212s e2) {
                    throw e2;
                }
            } catch (C0212s e22) {
                throw e22;
            }
        } while (c0193m.m1202b() > 0);
        try {
            if (stringBuilder2.length() > 0) {
                stringBuilder.append(stringBuilder2);
            }
            String stringBuilder32 = stringBuilder.toString();
            if (arrayList.isEmpty()) {
                Collection collection2 = arrayList;
            } else {
                list = null;
            }
            return new C0187h(bArr, stringBuilder32, list, null);
        } catch (C0212s e222) {
            throw e222;
        }
    }

    /* renamed from: a */
    private static void m166a(int i, int i2, int[] iArr) {
        int i3 = ((i << 8) + i2) - 1;
        int i4 = i3 / 1600;
        iArr[0] = i4;
        i3 -= i4 * 1600;
        i4 = i3 / 40;
        iArr[1] = i4;
        iArr[2] = i3 - (i4 * 40);
    }

    /* renamed from: a */
    private static void m167a(C0193m c0193m, StringBuilder stringBuilder) {
        while (c0193m.m1202b() > 16) {
            for (int i = 0; i < 4; i++) {
                int a = c0193m.m1201a(6);
                if (a == 31) {
                    a = 8 - c0193m.m1203c();
                    if (a != 8) {
                        try {
                            c0193m.m1201a(a);
                            return;
                        } catch (IllegalStateException e) {
                            throw e;
                        }
                    }
                    return;
                }
                if ((a & 32) == 0) {
                    a |= 64;
                }
                stringBuilder.append((char) a);
            }
            if (c0193m.m1202b() <= 0) {
                return;
            }
        }
    }

    /* renamed from: a */
    private static void m168a(C0193m c0193m, StringBuilder stringBuilder, Collection<byte[]> collection) throws C0212s {
        int b;
        int a = c0193m.m1200a() + 1;
        int i = a + 1;
        a = C0027j.m163a(c0193m.m1201a(8), a);
        if (a == 0) {
            b = c0193m.m1202b() / 8;
        } else if (a < C0607n.Ux) {
            b = a;
        } else {
            b = ((a - 249) * C0607n.Ux) + C0027j.m163a(c0193m.m1201a(8), i);
            i++;
        }
        if (b < 0) {
            try {
                throw C0212s.m1267a();
            } catch (UnsupportedEncodingException e) {
                throw e;
            }
        }
        Object obj = new byte[b];
        a = 0;
        while (a < b) {
            try {
                if (c0193m.m1202b() < 8) {
                    throw C0212s.m1267a();
                }
                int i2 = i + 1;
                obj[a] = (byte) C0027j.m163a(c0193m.m1201a(8), i);
                a++;
                i = i2;
            } catch (UnsupportedEncodingException e2) {
                throw e2;
            }
        }
        collection.add(obj);
        try {
            stringBuilder.append(new String(obj, f89z[3]));
        } catch (UnsupportedEncodingException e22) {
            throw new IllegalStateException(f89z[4] + e22);
        }
    }

    /* renamed from: b */
    private static void m169b(C0193m c0193m, StringBuilder stringBuilder) throws C0212s {
        int[] iArr = new int[3];
        while (c0193m.m1202b() != 8) {
            int a = c0193m.m1201a(8);
            if (a != 254) {
                C0027j.m166a(a, c0193m.m1201a(8), iArr);
                for (a = 0; a < 3; a++) {
                    int i = iArr[a];
                    if (i == 0) {
                        try {
                            stringBuilder.append('\r');
                        } catch (C0212s e) {
                            throw e;
                        }
                    } else if (i == 1) {
                        try {
                            stringBuilder.append('*');
                        } catch (C0212s e2) {
                            throw e2;
                        }
                    } else if (i == 2) {
                        try {
                            stringBuilder.append('>');
                        } catch (C0212s e22) {
                            throw e22;
                        }
                    } else if (i == 3) {
                        try {
                            stringBuilder.append(' ');
                        } catch (C0212s e222) {
                            throw e222;
                        }
                    } else if (i < 14) {
                        try {
                            stringBuilder.append((char) (i + 44));
                        } catch (C0212s e2222) {
                            throw e2222;
                        }
                    } else if (i < 40) {
                        try {
                            stringBuilder.append((char) (i + 51));
                        } catch (C0212s e22222) {
                            throw e22222;
                        }
                    } else {
                        throw C0212s.m1267a();
                    }
                }
                if (c0193m.m1202b() <= 0) {
                    return;
                }
            }
            return;
        }
    }

    /* renamed from: c */
    private static void m170c(C0193m c0193m, StringBuilder stringBuilder) throws C0212s {
        int[] iArr = new int[3];
        int i = 0;
        Object obj = null;
        while (c0193m.m1202b() != 8) {
            int a = c0193m.m1201a(8);
            if (a != 254) {
                C0027j.m166a(a, c0193m.m1201a(8), iArr);
                for (a = 0; a < 3; a++) {
                    int i2 = iArr[a];
                    char c;
                    switch (i) {
                        case 0:
                            if (i2 < 3) {
                                i = i2 + 1;
                                break;
                            } else if (i2 < f87d.length) {
                                char c2 = f87d[i2];
                                if (obj == null) {
                                    stringBuilder.append(c2);
                                    break;
                                }
                                stringBuilder.append((char) (c2 + 128));
                                obj = null;
                                break;
                            } else {
                                throw C0212s.m1267a();
                            }
                        case 1:
                            if (obj != null) {
                                stringBuilder.append((char) (i2 + 128));
                                obj = null;
                            } else {
                                stringBuilder.append((char) i2);
                            }
                            i = 0;
                            break;
                        case 2:
                            if (i2 < f86c.length) {
                                c = f86c[i2];
                                if (obj != null) {
                                    stringBuilder.append((char) (c + 128));
                                    obj = null;
                                } else {
                                    stringBuilder.append(c);
                                }
                            } else if (i2 == 27) {
                                try {
                                    stringBuilder.append('\u001d');
                                } catch (C0212s e) {
                                    throw e;
                                }
                            } else if (i2 == 30) {
                                obj = 1;
                            } else {
                                throw C0212s.m1267a();
                            }
                            i = 0;
                            break;
                        case 3:
                            if (i2 < f84a.length) {
                                c = f84a[i2];
                                if (obj != null) {
                                    stringBuilder.append((char) (c + 128));
                                    obj = null;
                                } else {
                                    stringBuilder.append(c);
                                }
                                i = 0;
                                break;
                            }
                            throw C0212s.m1267a();
                        default:
                            throw C0212s.m1267a();
                    }
                }
                if (c0193m.m1202b() <= 0) {
                    return;
                }
            }
            return;
        }
    }

    /* renamed from: d */
    private static void m171d(C0193m c0193m, StringBuilder stringBuilder) throws C0212s {
        int[] iArr = new int[3];
        int i = 0;
        Object obj = null;
        while (c0193m.m1202b() != 8) {
            int a = c0193m.m1201a(8);
            if (a != 254) {
                C0027j.m166a(a, c0193m.m1201a(8), iArr);
                for (a = 0; a < 3; a++) {
                    int i2 = iArr[a];
                    switch (i) {
                        case 0:
                            if (i2 < 3) {
                                i = i2 + 1;
                                break;
                            } else if (i2 < f88e.length) {
                                char c = f88e[i2];
                                if (obj == null) {
                                    stringBuilder.append(c);
                                    break;
                                }
                                stringBuilder.append((char) (c + 128));
                                obj = null;
                                break;
                            } else {
                                throw C0212s.m1267a();
                            }
                        case 1:
                            if (obj != null) {
                                stringBuilder.append((char) (i2 + 128));
                                obj = null;
                            } else {
                                stringBuilder.append((char) i2);
                            }
                            i = 0;
                            break;
                        case 2:
                            if (i2 < f85b.length) {
                                char c2 = f85b[i2];
                                if (obj != null) {
                                    stringBuilder.append((char) (c2 + 128));
                                    obj = null;
                                } else {
                                    stringBuilder.append(c2);
                                }
                            } else if (i2 == 27) {
                                try {
                                    stringBuilder.append('\u001d');
                                } catch (C0212s e) {
                                    throw e;
                                }
                            } else if (i2 == 30) {
                                obj = 1;
                            } else {
                                throw C0212s.m1267a();
                            }
                            i = 0;
                            break;
                        case 3:
                            if (obj != null) {
                                stringBuilder.append((char) (i2 + 224));
                                obj = null;
                            } else {
                                stringBuilder.append((char) (i2 + 96));
                            }
                            i = 0;
                            break;
                        default:
                            throw C0212s.m1267a();
                    }
                }
                if (c0193m.m1202b() <= 0) {
                    return;
                }
            }
            return;
        }
    }

    /* renamed from: z */
    private static String m172z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 51;
                    break;
                case 1:
                    i2 = 81;
                    break;
                case 2:
                    i2 = 37;
                    break;
                case 3:
                    i2 = 40;
                    break;
                default:
                    i2 = 102;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m173z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 102);
        }
        return toCharArray;
    }
}
