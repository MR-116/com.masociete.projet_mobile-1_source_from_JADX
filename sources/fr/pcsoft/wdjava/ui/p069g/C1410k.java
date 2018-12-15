package fr.pcsoft.wdjava.ui.p069g;

/* renamed from: fr.pcsoft.wdjava.ui.g.k */
public class C1410k implements C1409j {
    /* renamed from: g */
    private int f4190g = 0;
    /* renamed from: h */
    private int f4191h = C1409j.f4188e;

    public C1410k(int i, int i2) {
        if (i2 == 0) {
            i2 = C1409j.f4188e;
        }
        this.f4191h = C1410k.m9999a(i2);
        this.f4190g = i;
    }

    /* renamed from: a */
    public static final int m9999a(int i) {
        return i == 0 ? i : i < 20 ? 20 : i > C1409j.f4184a ? C1409j.f4184a : i;
    }

    /* renamed from: a */
    public int mo3770a() {
        return this.f4191h;
    }

    /* renamed from: b */
    public void mo3771b() {
    }

    /* renamed from: c */
    public int mo3772c() {
        return this.f4190g;
    }
}
