package p000a.p001a.p002a.p019g;

import java.util.List;

/* renamed from: a.a.a.g.h */
public final class C0187h {
    /* renamed from: a */
    private final int f712a;
    /* renamed from: b */
    private final int f713b;
    /* renamed from: c */
    private final byte[] f714c;
    /* renamed from: d */
    private int f715d;
    /* renamed from: e */
    private final String f716e;
    /* renamed from: f */
    private Integer f717f;
    /* renamed from: g */
    private final List<byte[]> f718g;
    /* renamed from: h */
    private Object f719h;
    /* renamed from: i */
    private final String f720i;
    /* renamed from: j */
    private Integer f721j;

    public C0187h(byte[] bArr, String str, List<byte[]> list, String str2) {
        this(bArr, str, list, str2, -1, -1);
    }

    public C0187h(byte[] bArr, String str, List<byte[]> list, String str2, int i, int i2) {
        this.f714c = bArr;
        this.f715d = bArr == null ? 0 : bArr.length * 8;
        this.f716e = str;
        this.f718g = list;
        this.f720i = str2;
        this.f712a = i2;
        this.f713b = i;
    }

    /* renamed from: a */
    public Integer m1157a() {
        return this.f717f;
    }

    /* renamed from: a */
    public void m1158a(int i) {
        this.f715d = i;
    }

    /* renamed from: a */
    public void m1159a(Integer num) {
        this.f717f = num;
    }

    /* renamed from: a */
    public void m1160a(Object obj) {
        this.f719h = obj;
    }

    /* renamed from: b */
    public Object m1161b() {
        return this.f719h;
    }

    /* renamed from: b */
    public void m1162b(Integer num) {
        this.f721j = num;
    }

    /* renamed from: c */
    public int m1163c() {
        return this.f713b;
    }

    /* renamed from: d */
    public Integer m1164d() {
        return this.f721j;
    }

    /* renamed from: e */
    public List<byte[]> m1165e() {
        return this.f718g;
    }

    /* renamed from: f */
    public int m1166f() {
        return this.f715d;
    }

    /* renamed from: g */
    public byte[] m1167g() {
        return this.f714c;
    }

    /* renamed from: h */
    public String m1168h() {
        return this.f716e;
    }

    /* renamed from: i */
    public String m1169i() {
        return this.f720i;
    }

    /* renamed from: j */
    public boolean m1170j() {
        return this.f712a >= 0 && this.f713b >= 0;
    }

    /* renamed from: k */
    public int m1171k() {
        return this.f712a;
    }
}
