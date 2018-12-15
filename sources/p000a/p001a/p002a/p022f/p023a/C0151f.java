package p000a.p001a.p002a.p022f.p023a;

/* renamed from: a.a.a.f.a.f */
final class C0151f {
    /* renamed from: a */
    private final byte[] f559a;
    /* renamed from: b */
    private int f560b = 0;

    C0151f(int i) {
        this.f559a = new byte[i];
    }

    /* renamed from: a */
    private void m897a(int i, boolean z) {
        this.f559a[i] = (byte) (z ? 1 : 0);
    }

    /* renamed from: a */
    void m898a(int i, byte b) {
        this.f559a[i] = b;
    }

    /* renamed from: a */
    void m899a(boolean z, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.f560b;
            this.f560b = i3 + 1;
            m897a(i3, z);
        }
    }

    /* renamed from: a */
    byte[] m900a(int i) {
        byte[] bArr = new byte[(this.f559a.length * i)];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            bArr[i2] = this.f559a[i2 / i];
        }
        return bArr;
    }
}
