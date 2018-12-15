package p000a.p001a.p002a.p015d.p018c;

import fr.pcsoft.wdjava.core.C0607n;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import p000a.p001a.p002a.p019g.C0185f;

/* renamed from: a.a.a.d.c.g */
public final class C0136g {
    /* renamed from: b */
    static final int f460b = 3;
    /* renamed from: c */
    static final int f461c = 4;
    /* renamed from: d */
    static final String[] f462d = new String[]{C0136g.m798z(C0136g.m799z("R\u0011\\+\u001b")), C0136g.m798z(C0136g.m799z("K\u000e[+\u001b")), C0136g.m798z(C0136g.m799z("C\bK'\u001d")), C0136g.m798z(C0136g.m799z("J\bT+\r")), C0136g.m798z(C0136g.m799z("W\u0014B-\u001d"))};
    /* renamed from: e */
    static final int f463e = 0;
    /* renamed from: f */
    static final int[][] f464f = new int[][]{new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};
    /* renamed from: g */
    static final int f465g = 1;
    /* renamed from: h */
    static final int[][] f466h = ((int[][]) Array.newInstance(Integer.TYPE, new int[]{6, 6}));
    /* renamed from: i */
    static final int f467i = 2;
    /* renamed from: j */
    private static final int[][] f468j = ((int[][]) Array.newInstance(Integer.TYPE, new int[]{5, 256}));
    /* renamed from: a */
    private final byte[] f469a;

    static {
        int i;
        f468j[0][32] = 1;
        for (i = 65; i <= 90; i++) {
            f468j[0][i] = (i - 65) + 2;
        }
        f468j[1][32] = 1;
        for (i = 97; i <= 122; i++) {
            f468j[1][i] = (i - 97) + 2;
        }
        f468j[2][32] = 1;
        for (i = 48; i <= 57; i++) {
            f468j[2][i] = (i - 48) + 2;
        }
        f468j[2][44] = 12;
        f468j[2][46] = 13;
        int[] iArr = new int[]{0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, C0607n.Hn, 126, C0607n.bx};
        for (i = 0; i < iArr.length; i++) {
            f468j[3][iArr[i]] = i;
        }
        iArr = new int[]{0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125};
        for (i = 0; i < iArr.length; i++) {
            if (iArr[i] > 0) {
                f468j[4][iArr[i]] = i;
            }
        }
        for (int[] fill : f466h) {
            Arrays.fill(fill, -1);
        }
        f466h[0][4] = 0;
        f466h[1][4] = 0;
        f466h[1][0] = 28;
        f466h[3][4] = 0;
        f466h[2][4] = 0;
        f466h[2][0] = 15;
    }

    public C0136g(byte[] bArr) {
        this.f469a = bArr;
    }

    /* renamed from: a */
    private static Collection<C0137h> m793a(Iterable<C0137h> iterable) {
        Collection linkedList = new LinkedList();
        for (C0137h c0137h : iterable) {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                C0137h c0137h2 = (C0137h) it.next();
                if (c0137h2.m807a(c0137h)) {
                    Object obj = null;
                    break;
                } else if (c0137h.m807a(c0137h2)) {
                    it.remove();
                }
            }
            int i = 1;
            if (obj != null) {
                linkedList.add(c0137h);
            }
        }
        return linkedList;
    }

    /* renamed from: a */
    private Collection<C0137h> m794a(Iterable<C0137h> iterable, int i) {
        Collection linkedList = new LinkedList();
        for (C0137h a : iterable) {
            m797a(a, i, linkedList);
        }
        return C0136g.m793a(linkedList);
    }

    /* renamed from: a */
    private static Collection<C0137h> m795a(Iterable<C0137h> iterable, int i, int i2) {
        Iterable linkedList = new LinkedList();
        for (C0137h a : iterable) {
            C0136g.m796a(a, i, i2, linkedList);
        }
        return C0136g.m793a(linkedList);
    }

    /* renamed from: a */
    private static void m796a(C0137h c0137h, int i, int i2, Collection<C0137h> collection) {
        C0137h b = c0137h.m809b(i);
        collection.add(b.m805a(4, i2));
        if (c0137h.m803a() != 4) {
            collection.add(b.m810b(4, i2));
        }
        if (i2 == 3 || i2 == 4) {
            collection.add(b.m805a(2, 16 - i2).m805a(2, 1));
        }
        if (c0137h.m812d() > 0) {
            collection.add(c0137h.m804a(i).m804a(i + 1));
        }
    }

    /* renamed from: a */
    private void m797a(C0137h c0137h, int i, Collection<C0137h> collection) {
        char c = (char) (this.f469a[i] & 255);
        Object obj = f468j[c0137h.m803a()][c] > 0 ? 1 : null;
        C0137h c0137h2 = null;
        int i2 = 0;
        while (i2 <= 4) {
            int i3 = f468j[i2][c];
            if (i3 > 0) {
                if (c0137h2 == null) {
                    c0137h2 = c0137h.m809b(i);
                }
                if (obj == null || i2 == c0137h.m803a() || i2 == 2) {
                    collection.add(c0137h2.m805a(i2, i3));
                }
                if (obj == null && f466h[c0137h.m803a()][i2] >= 0) {
                    collection.add(c0137h2.m810b(i2, i3));
                }
            }
            i2++;
        }
        if (c0137h.m812d() > 0 || f468j[c0137h.m803a()][c] == 0) {
            collection.add(c0137h.m804a(i));
        }
    }

    /* renamed from: z */
    private static String m798z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 7;
                    break;
                case 1:
                    i2 = 65;
                    break;
                case 2:
                    i2 = 12;
                    break;
                case 3:
                    i2 = 110;
                    break;
                default:
                    i2 = 73;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m799z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 73);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public C0185f m800a() {
        Iterable singletonList = Collections.singletonList(C0137h.f470d);
        int i = 0;
        while (i < this.f469a.length) {
            int i2;
            byte b = i + 1 < this.f469a.length ? this.f469a[i + 1] : (byte) 0;
            switch (this.f469a[i]) {
                case (byte) 13:
                    if (b != (byte) 10) {
                        i2 = 0;
                        break;
                    }
                    i2 = 2;
                    break;
                case (byte) 44:
                    if (b != (byte) 32) {
                        i2 = 0;
                        break;
                    }
                    i2 = 4;
                    break;
                case (byte) 46:
                    if (b != (byte) 32) {
                        i2 = 0;
                        break;
                    }
                    i2 = 3;
                    break;
                case (byte) 58:
                    if (b != (byte) 32) {
                        i2 = 0;
                        break;
                    }
                    i2 = 5;
                    break;
                default:
                    i2 = 0;
                    break;
            }
            if (i2 > 0) {
                singletonList = C0136g.m795a(singletonList, i, i2);
                i++;
            } else {
                singletonList = m794a(singletonList, i);
            }
            i++;
        }
        return ((C0137h) Collections.min(singletonList, new C0132c(this))).m806a(this.f469a);
    }
}
