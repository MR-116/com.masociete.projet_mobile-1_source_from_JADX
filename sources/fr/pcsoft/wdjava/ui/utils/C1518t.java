package fr.pcsoft.wdjava.ui.utils;

import fr.pcsoft.wdjava.core.debug.C0691a;

/* renamed from: fr.pcsoft.wdjava.ui.utils.t */
public final class C1518t implements Cloneable {
    /* renamed from: z */
    private static final String f4652z = C1518t.m10544z(C1518t.m10545z("Ux7{\u000eqqx|\u0002f{+f\u0006tx=;"));
    /* renamed from: a */
    private int f4653a = 0;
    /* renamed from: b */
    private int f4654b = 0;
    /* renamed from: c */
    private int f4655c = 0;
    /* renamed from: d */
    private int f4656d = 0;

    public C1518t(int i, int i2, int i3, int i4) {
        m10549a(i, i2, i3, i4);
    }

    public C1518t(C1518t c1518t) {
        m10551a(c1518t);
    }

    /* renamed from: a */
    public static final boolean m10543a(C1518t c1518t, C1518t c1518t2) {
        return c1518t.f4656d < c1518t2.f4653a && c1518t2.f4656d < c1518t.f4653a && c1518t.f4655c < c1518t2.f4654b && c1518t2.f4655c < c1518t.f4654b;
    }

    /* renamed from: z */
    private static String m10544z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 22;
                    break;
                case 1:
                    i2 = 20;
                    break;
                case 2:
                    i2 = 88;
                    break;
                case 3:
                    i2 = 21;
                    break;
                default:
                    i2 = 111;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m10545z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 111);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public final int m10546a() {
        return (this.f4655c + this.f4654b) >> 1;
    }

    /* renamed from: a */
    public final void m10547a(int i) {
        this.f4654b = i;
    }

    /* renamed from: a */
    public final void m10548a(int i, int i2) {
        this.f4653a = this.f4656d + i;
        this.f4654b = this.f4655c + i2;
    }

    /* renamed from: a */
    public final void m10549a(int i, int i2, int i3, int i4) {
        this.f4656d = i;
        this.f4655c = i2;
        this.f4653a = i3;
        this.f4654b = i4;
    }

    /* renamed from: a */
    public final void m10550a(int i, int i2, boolean z) {
        if (z) {
            this.f4653a += i - this.f4656d;
            this.f4654b += i2 - this.f4655c;
        }
        this.f4656d = i;
        this.f4655c = i2;
    }

    /* renamed from: a */
    public final void m10551a(C1518t c1518t) {
        this.f4656d = c1518t.f4656d;
        this.f4655c = c1518t.f4655c;
        this.f4653a = c1518t.f4653a;
        this.f4654b = c1518t.f4654b;
    }

    /* renamed from: a */
    public final boolean m10552a(float f, float f2) {
        return this.f4656d < this.f4653a && this.f4655c < this.f4654b && f >= ((float) this.f4656d) && f < ((float) this.f4653a) && f2 >= ((float) this.f4655c) && f2 < ((float) this.f4654b);
    }

    /* renamed from: b */
    public final int m10553b() {
        return this.f4653a - this.f4656d;
    }

    /* renamed from: b */
    public final void m10554b(int i) {
        this.f4656d = i;
    }

    /* renamed from: b */
    public final void m10555b(int i, int i2, int i3, int i4) {
        this.f4656d = i;
        this.f4655c = i2;
        this.f4653a = this.f4656d + i3;
        this.f4654b = this.f4655c + i4;
    }

    /* renamed from: c */
    public final int m10556c() {
        return this.f4654b;
    }

    /* renamed from: c */
    public final void m10557c(int i) {
        this.f4655c = i;
    }

    public /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        return m10558d();
    }

    /* renamed from: d */
    public C1518t m10558d() {
        try {
            return (C1518t) super.clone();
        } catch (Exception e) {
            C0691a.m2857a(f4652z, e);
            return this;
        }
    }

    /* renamed from: d */
    public final void m10559d(int i) {
        this.f4653a = i;
    }

    /* renamed from: e */
    public final int m10560e() {
        return this.f4654b - this.f4655c;
    }

    /* renamed from: f */
    public final int m10561f() {
        return this.f4653a;
    }

    /* renamed from: g */
    public final int m10562g() {
        return (this.f4656d + this.f4653a) >> 1;
    }

    /* renamed from: h */
    public final int m10563h() {
        return this.f4655c;
    }

    /* renamed from: i */
    public final int m10564i() {
        return this.f4656d;
    }
}
