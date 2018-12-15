package p000a.p001a.p002a.p027h.p030a.p031a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p000a.p001a.p002a.C0213t;
import p000a.p001a.p002a.C0214u;
import p000a.p001a.p002a.C0216w;
import p000a.p001a.p002a.eb;
import p000a.p001a.p002a.p007b.p009b.C0054c;
import p000a.p001a.p002a.p007b.p009b.C0059h;
import p000a.p001a.p002a.p007b.p009b.C0060i;
import p000a.p001a.p002a.p019g.C0194n;

/* renamed from: a.a.a.h.a.a.c */
final class C0197c extends C0054c {
    /* renamed from: i */
    private static final float f760i = 9.0f;
    /* renamed from: j */
    private static final float f761j = 180.0f;
    /* renamed from: k */
    private static final C0060i[] f762k = new C0060i[0];
    /* renamed from: l */
    private static final float f763l = 0.05f;
    /* renamed from: m */
    private static final float f764m = 0.5f;

    C0197c(C0194n c0194n) {
        super(c0194n);
    }

    C0197c(C0194n c0194n, C0214u c0214u) {
        super(c0194n, c0214u);
    }

    /* renamed from: g */
    private C0059h[][] m1228g() throws C0213t {
        List f = m288f();
        int size = f.size();
        if (size < 3) {
            try {
                throw C0213t.m1269a();
            } catch (C0213t e) {
                throw e;
            }
        } else if (size == 3) {
            try {
                C0059h[][] c0059hArr = new C0059h[1][];
                c0059hArr[0] = new C0059h[]{(C0059h) f.get(0), (C0059h) f.get(1), (C0059h) f.get(2)};
                return c0059hArr;
            } catch (C0213t e2) {
                throw e2;
            }
        } else {
            Collections.sort(f, new C0196b(null));
            List arrayList = new ArrayList();
            for (int i = 0; i < size - 2; i++) {
                C0059h c0059h = (C0059h) f.get(i);
                if (c0059h != null) {
                    for (int i2 = i + 1; i2 < size - 1; i2++) {
                        C0059h c0059h2 = (C0059h) f.get(i2);
                        if (c0059h2 != null) {
                            float c = (c0059h.m317c() - c0059h2.m317c()) / Math.min(c0059h.m317c(), c0059h2.m317c());
                            if (Math.abs(c0059h.m317c() - c0059h2.m317c()) > f764m && c >= f763l) {
                                break;
                            }
                            for (int i3 = i2 + 1; i3 < size; i3++) {
                                C0059h c0059h3 = (C0059h) f.get(i3);
                                if (c0059h3 != null) {
                                    float c2 = (c0059h2.m317c() - c0059h3.m317c()) / Math.min(c0059h2.m317c(), c0059h3.m317c());
                                    if (Math.abs(c0059h2.m317c() - c0059h3.m317c()) > f764m && c2 >= f763l) {
                                        break;
                                    }
                                    Object obj = new C0059h[]{c0059h, c0059h2, c0059h3};
                                    eb.m310a(obj);
                                    C0060i c0060i = new C0060i(obj);
                                    float a = eb.m308a(c0060i.m319a(), c0060i.m320b());
                                    float a2 = eb.m308a(c0060i.m321c(), c0060i.m320b());
                                    c = eb.m308a(c0060i.m319a(), c0060i.m321c());
                                    float c3 = (a + c) / (c0059h.m317c() * 2.0f);
                                    if (c3 <= f761j && c3 >= f760i && Math.abs((a - c) / Math.min(a, c)) < 0.1f) {
                                        c = (float) Math.sqrt((double) ((c * c) + (a * a)));
                                        if (Math.abs((a2 - c) / Math.min(a2, c)) < 0.1f) {
                                            arrayList.add(obj);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            try {
                if (!arrayList.isEmpty()) {
                    return (C0059h[][]) arrayList.toArray(new C0059h[arrayList.size()][]);
                }
                throw C0213t.m1269a();
            } catch (C0213t e22) {
                throw e22;
            }
        }
    }

    /* renamed from: b */
    public C0060i[] m1229b(Map<C0216w, ?> map) throws C0213t {
        Object obj;
        boolean z;
        C0194n b;
        int i;
        int a;
        int i2;
        int i3;
        int[] iArr;
        int i4;
        int i5;
        C0059h[][] g;
        List arrayList;
        if (map != null) {
            try {
                if (map.containsKey(C0216w.TRY_HARDER)) {
                    obj = 1;
                    if (map != null) {
                        try {
                            if (map.containsKey(C0216w.PURE_BARCODE)) {
                                z = true;
                                b = m287b();
                                i = b.m1226i();
                                a = b.m1208a();
                                i2 = (int) ((((float) i) / 228.0f) * 3.0f);
                                i3 = (i2 >= 3 || obj != null) ? 3 : i2;
                                iArr = new int[5];
                                i4 = i3 - 1;
                                while (i4 < i) {
                                    iArr[0] = 0;
                                    iArr[1] = 0;
                                    iArr[2] = 0;
                                    iArr[3] = 0;
                                    iArr[4] = 0;
                                    i2 = 0;
                                    i5 = 0;
                                    while (i5 < a) {
                                        try {
                                            if (!b.m1221d(i5, i4)) {
                                                if ((i2 & 1) == 1) {
                                                    i2++;
                                                }
                                                iArr[i2] = iArr[i2] + 1;
                                            } else if ((i2 & 1) != 0) {
                                                iArr[i2] = iArr[i2] + 1;
                                            } else if (i2 != 4) {
                                                try {
                                                    if (C0054c.m278a(iArr) || !m286a(iArr, i4, i5, z)) {
                                                        iArr[0] = iArr[2];
                                                        iArr[1] = iArr[3];
                                                        iArr[2] = iArr[4];
                                                        iArr[3] = 1;
                                                        iArr[4] = 0;
                                                        i2 = 3;
                                                    } else {
                                                        i2 = 0;
                                                        iArr[0] = 0;
                                                        iArr[1] = 0;
                                                        iArr[2] = 0;
                                                        iArr[3] = 0;
                                                        iArr[4] = 0;
                                                    }
                                                } catch (C0213t e) {
                                                    throw e;
                                                }
                                            } else {
                                                i2++;
                                                iArr[i2] = iArr[i2] + 1;
                                            }
                                            i5++;
                                        } catch (C0213t e2) {
                                            throw e2;
                                        } catch (C0213t e22) {
                                            throw e22;
                                        }
                                    }
                                    try {
                                        if (!C0054c.m278a(iArr)) {
                                            m286a(iArr, i4, a, z);
                                        }
                                        i4 += i3;
                                    } catch (C0213t e222) {
                                        throw e222;
                                    }
                                }
                                g = m1228g();
                                arrayList = new ArrayList();
                                for (eb[] ebVarArr : g) {
                                    eb.m310a(ebVarArr);
                                    arrayList.add(new C0060i(ebVarArr));
                                }
                                return arrayList.isEmpty() ? f762k : (C0060i[]) arrayList.toArray(new C0060i[arrayList.size()]);
                            }
                        } catch (C0213t e2222) {
                            throw e2222;
                        }
                    }
                    z = false;
                    b = m287b();
                    i = b.m1226i();
                    a = b.m1208a();
                    i2 = (int) ((((float) i) / 228.0f) * 3.0f);
                    if (i2 >= 3) {
                    }
                    iArr = new int[5];
                    i4 = i3 - 1;
                    while (i4 < i) {
                        iArr[0] = 0;
                        iArr[1] = 0;
                        iArr[2] = 0;
                        iArr[3] = 0;
                        iArr[4] = 0;
                        i2 = 0;
                        i5 = 0;
                        while (i5 < a) {
                            if (!b.m1221d(i5, i4)) {
                                if ((i2 & 1) == 1) {
                                    i2++;
                                }
                                iArr[i2] = iArr[i2] + 1;
                            } else if ((i2 & 1) != 0) {
                                iArr[i2] = iArr[i2] + 1;
                            } else if (i2 != 4) {
                                i2++;
                                iArr[i2] = iArr[i2] + 1;
                            } else {
                                if (C0054c.m278a(iArr)) {
                                }
                                iArr[0] = iArr[2];
                                iArr[1] = iArr[3];
                                iArr[2] = iArr[4];
                                iArr[3] = 1;
                                iArr[4] = 0;
                                i2 = 3;
                            }
                            i5++;
                        }
                        if (!C0054c.m278a(iArr)) {
                            m286a(iArr, i4, a, z);
                        }
                        i4 += i3;
                    }
                    g = m1228g();
                    arrayList = new ArrayList();
                    for (eb[] ebVarArr2 : g) {
                        eb.m310a(ebVarArr2);
                        arrayList.add(new C0060i(ebVarArr2));
                    }
                    if (arrayList.isEmpty()) {
                    }
                }
            } catch (C0213t e22222) {
                throw e22222;
            }
        }
        obj = null;
        if (map != null) {
            if (map.containsKey(C0216w.PURE_BARCODE)) {
                z = true;
                b = m287b();
                i = b.m1226i();
                a = b.m1208a();
                i2 = (int) ((((float) i) / 228.0f) * 3.0f);
                if (i2 >= 3) {
                }
                iArr = new int[5];
                i4 = i3 - 1;
                while (i4 < i) {
                    iArr[0] = 0;
                    iArr[1] = 0;
                    iArr[2] = 0;
                    iArr[3] = 0;
                    iArr[4] = 0;
                    i2 = 0;
                    i5 = 0;
                    while (i5 < a) {
                        if (!b.m1221d(i5, i4)) {
                            if ((i2 & 1) == 1) {
                                i2++;
                            }
                            iArr[i2] = iArr[i2] + 1;
                        } else if ((i2 & 1) != 0) {
                            iArr[i2] = iArr[i2] + 1;
                        } else if (i2 != 4) {
                            if (C0054c.m278a(iArr)) {
                            }
                            iArr[0] = iArr[2];
                            iArr[1] = iArr[3];
                            iArr[2] = iArr[4];
                            iArr[3] = 1;
                            iArr[4] = 0;
                            i2 = 3;
                        } else {
                            i2++;
                            iArr[i2] = iArr[i2] + 1;
                        }
                        i5++;
                    }
                    if (!C0054c.m278a(iArr)) {
                        m286a(iArr, i4, a, z);
                    }
                    i4 += i3;
                }
                g = m1228g();
                arrayList = new ArrayList();
                for (eb[] ebVarArr22 : g) {
                    eb.m310a(ebVarArr22);
                    arrayList.add(new C0060i(ebVarArr22));
                }
                if (arrayList.isEmpty()) {
                }
            }
        }
        z = false;
        b = m287b();
        i = b.m1226i();
        a = b.m1208a();
        i2 = (int) ((((float) i) / 228.0f) * 3.0f);
        if (i2 >= 3) {
        }
        iArr = new int[5];
        i4 = i3 - 1;
        while (i4 < i) {
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            iArr[3] = 0;
            iArr[4] = 0;
            i2 = 0;
            i5 = 0;
            while (i5 < a) {
                if (!b.m1221d(i5, i4)) {
                    if ((i2 & 1) == 1) {
                        i2++;
                    }
                    iArr[i2] = iArr[i2] + 1;
                } else if ((i2 & 1) != 0) {
                    iArr[i2] = iArr[i2] + 1;
                } else if (i2 != 4) {
                    i2++;
                    iArr[i2] = iArr[i2] + 1;
                } else {
                    if (C0054c.m278a(iArr)) {
                    }
                    iArr[0] = iArr[2];
                    iArr[1] = iArr[3];
                    iArr[2] = iArr[4];
                    iArr[3] = 1;
                    iArr[4] = 0;
                    i2 = 3;
                }
                i5++;
            }
            if (!C0054c.m278a(iArr)) {
                m286a(iArr, i4, a, z);
            }
            i4 += i3;
        }
        g = m1228g();
        arrayList = new ArrayList();
        for (eb[] ebVarArr222 : g) {
            eb.m310a(ebVarArr222);
            arrayList.add(new C0060i(ebVarArr222));
        }
        try {
            if (arrayList.isEmpty()) {
            }
        } catch (C0213t e222222) {
            throw e222222;
        }
    }
}
