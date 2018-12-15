package p000a.p001a.p002a;

import java.util.EnumMap;
import java.util.Map;

/* renamed from: a.a.a.m */
public final class C0208m {
    /* renamed from: a */
    private Map<C0206k, Object> f776a;
    /* renamed from: b */
    private eb[] f777b;
    /* renamed from: c */
    private final int f778c;
    /* renamed from: d */
    private final C0217x f779d;
    /* renamed from: e */
    private final long f780e;
    /* renamed from: f */
    private final byte[] f781f;
    /* renamed from: g */
    private final String f782g;

    public C0208m(String str, byte[] bArr, int i, eb[] ebVarArr, C0217x c0217x, long j) {
        this.f782g = str;
        this.f781f = bArr;
        this.f778c = i;
        this.f777b = ebVarArr;
        this.f779d = c0217x;
        this.f776a = null;
        this.f780e = j;
    }

    public C0208m(String str, byte[] bArr, eb[] ebVarArr, C0217x c0217x) {
        this(str, bArr, ebVarArr, c0217x, System.currentTimeMillis());
    }

    public C0208m(String str, byte[] bArr, eb[] ebVarArr, C0217x c0217x, long j) {
        this(str, bArr, bArr == null ? 0 : bArr.length * 8, ebVarArr, c0217x, j);
    }

    /* renamed from: a */
    public long m1251a() {
        return this.f780e;
    }

    /* renamed from: a */
    public void m1252a(C0206k c0206k, Object obj) {
        if (this.f776a == null) {
            this.f776a = new EnumMap(C0206k.class);
        }
        this.f776a.put(c0206k, obj);
    }

    /* renamed from: a */
    public void m1253a(Map<C0206k, Object> map) {
        if (map == null) {
            return;
        }
        if (this.f776a == null) {
            this.f776a = map;
        } else {
            this.f776a.putAll(map);
        }
    }

    /* renamed from: a */
    public void m1254a(eb[] ebVarArr) {
        Object obj = this.f777b;
        if (obj == null) {
            this.f777b = ebVarArr;
        } else if (ebVarArr != null && ebVarArr.length > 0) {
            Object obj2 = new eb[(obj.length + ebVarArr.length)];
            System.arraycopy(obj, 0, obj2, 0, obj.length);
            System.arraycopy(ebVarArr, 0, obj2, obj.length, ebVarArr.length);
            this.f777b = obj2;
        }
    }

    /* renamed from: b */
    public int m1255b() {
        return this.f778c;
    }

    /* renamed from: c */
    public eb[] m1256c() {
        return this.f777b;
    }

    /* renamed from: d */
    public String m1257d() {
        return this.f782g;
    }

    /* renamed from: e */
    public Map<C0206k, Object> m1258e() {
        return this.f776a;
    }

    /* renamed from: f */
    public byte[] m1259f() {
        return this.f781f;
    }

    /* renamed from: g */
    public C0217x m1260g() {
        return this.f779d;
    }

    public String toString() {
        return this.f782g;
    }
}
