package fr.pcsoft.wdjava.file;

/* renamed from: fr.pcsoft.wdjava.file.l */
public class C0894l {
    /* renamed from: a */
    private final byte[] f2392a;

    protected C0894l(byte[] bArr) {
        this.f2392a = bArr;
    }

    /* renamed from: a */
    public final int m6221a() {
        return this.f2392a.length;
    }

    /* renamed from: a */
    public final boolean m6222a(byte[] bArr) {
        if (bArr == null || bArr.length < this.f2392a.length) {
            return false;
        }
        int length = this.f2392a.length;
        for (int i = 0; i < length; i++) {
            if (this.f2392a[i] != bArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public final byte[] m6223b() {
        Object obj = new byte[this.f2392a.length];
        System.arraycopy(this.f2392a, 0, obj, 0, this.f2392a.length);
        return obj;
    }
}
