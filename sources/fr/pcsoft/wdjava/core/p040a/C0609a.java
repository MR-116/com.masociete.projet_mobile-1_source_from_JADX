package fr.pcsoft.wdjava.core.p040a;

import fr.pcsoft.wdjava.core.debug.C0691a;
import java.lang.ref.SoftReference;
import java.util.HashMap;

/* renamed from: fr.pcsoft.wdjava.core.a.a */
public class C0609a<C, V> implements C0608c<C, V> {
    /* renamed from: z */
    private static final String f1488z = C0609a.m2277z(C0609a.m2278z("##b\tT\u00110hJ[\u0015w{\u000bS\u0015\"JQ\u0005;aJV\u001e#h\u0018[\u0019#-\u000e^\u001e$-\u0006ZP4l\tW\u0015y"));
    /* renamed from: a */
    private final HashMap<C, SoftReference<V>> f1489a = new HashMap();

    /* renamed from: z */
    private static String m2277z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 112;
                    break;
                case 1:
                    i2 = 87;
                    break;
                case 2:
                    i2 = 13;
                    break;
                case 3:
                    i2 = 106;
                    break;
                default:
                    i2 = 63;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2278z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 63);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public V mo2492a(C c) {
        V v = null;
        if (c != null) {
            synchronized (this) {
                if (this.f1489a.containsKey(c)) {
                    v = ((SoftReference) this.f1489a.remove(c)).get();
                }
            }
        }
        return v;
    }

    /* renamed from: a */
    public V mo2493a(C c, V v) {
        V v2 = null;
        if (c == null || v == null) {
            C0691a.m2856a(f1488z);
        } else {
            synchronized (this) {
                if (this.f1489a.containsKey(c)) {
                    v2 = ((SoftReference) this.f1489a.get(c)).get();
                }
                this.f1489a.put(c, new SoftReference(v));
            }
        }
        return v2;
    }

    /* renamed from: a */
    public void mo2494a() {
        if (this.f1489a != null) {
            this.f1489a.clear();
        }
    }

    /* renamed from: b */
    public V mo2495b(C c) {
        V v = null;
        if (c != null) {
            synchronized (this) {
                if (this.f1489a.containsKey(c)) {
                    v = ((SoftReference) this.f1489a.get(c)).get();
                }
            }
        }
        return v;
    }
}
