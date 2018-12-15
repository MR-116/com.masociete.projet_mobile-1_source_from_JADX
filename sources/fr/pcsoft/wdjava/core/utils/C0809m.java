package fr.pcsoft.wdjava.core.utils;

import fr.pcsoft.wdjava.core.debug.C0691a;
import java.util.Arrays;

/* renamed from: fr.pcsoft.wdjava.core.utils.m */
public class C0809m implements Cloneable {
    /* renamed from: z */
    private static final String f2119z = C0809m.m4073z(C0809m.m4074z("\\)Rzdf-@yr5 G5ty+Lpe5(G5ct&Npv`j"));
    /* renamed from: a */
    int f2120a;
    /* renamed from: b */
    int f2121b;
    /* renamed from: c */
    int[] f2122c;
    /* renamed from: d */
    int f2123d;

    public C0809m(int i) {
        this(i, 0);
    }

    public C0809m(int i, int i2) {
        this.f2123d = 0;
        this.f2120a = -1;
        this.f2121b = 0;
        this.f2122c = new int[Math.max(4, i)];
        this.f2121b = i2;
        if (this.f2121b != 0) {
            Arrays.fill(this.f2122c, 0, this.f2122c.length, this.f2121b);
        }
    }

    /* renamed from: b */
    private final void m4072b(int i) {
        if (i == 0) {
            int i2 = m4086i();
            i = i2 + (i2 / 2);
        }
        if (i > this.f2122c.length) {
            Object obj = new int[i];
            System.arraycopy(this.f2122c, this.f2123d, obj, 0, m4086i());
            this.f2122c = obj;
        } else {
            System.arraycopy(this.f2122c, this.f2123d, this.f2122c, 0, m4086i());
        }
        try {
            this.f2120a -= this.f2123d;
            this.f2123d = 0;
            if (this.f2121b != 0) {
                Arrays.fill(this.f2122c, this.f2120a + 1, this.f2122c.length, this.f2121b);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }

    /* renamed from: z */
    private static String m4073z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 21;
                    break;
                case 1:
                    i2 = 68;
                    break;
                case 2:
                    i2 = 34;
                    break;
                case 3:
                    i2 = 21;
                    break;
                default:
                    i2 = 23;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m4074z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 23);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public final int m4075a() {
        try {
            if (m4086i() == 0) {
                return 0;
            }
            int i = Integer.MIN_VALUE;
            for (int i2 = this.f2123d; i2 <= this.f2120a; i2++) {
                int i3 = this.f2122c[i2];
                if (i3 > i) {
                    i = i3;
                }
            }
            return i;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }

    /* renamed from: a */
    public void m4076a(int i) {
        try {
            if (this.f2120a == this.f2122c.length - 1) {
                m4072b(0);
            }
            int[] iArr = this.f2122c;
            int i2 = this.f2120a + 1;
            this.f2120a = i2;
            iArr[i2] = i;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }

    /* renamed from: a */
    public final void m4077a(int i, int i2) {
        if (i2 < 0) {
            try {
                throw new ArrayIndexOutOfBoundsException();
            } catch (ArrayIndexOutOfBoundsException e) {
                throw e;
            }
        }
        try {
            if (this.f2123d + i2 >= this.f2122c.length) {
                m4072b(Math.max(i2 + 1, this.f2122c.length + (this.f2122c.length / 2)));
                this.f2122c[i2] = i;
                this.f2120a = i2;
                return;
            }
            int i3 = this.f2123d + i2;
            try {
                this.f2122c[i3] = i;
                if (i3 > this.f2120a) {
                    this.f2120a = i3;
                }
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw e2;
            }
        } catch (ArrayIndexOutOfBoundsException e22) {
            throw e22;
        }
    }

    /* renamed from: b */
    public int m4078b() {
        try {
            if (this.f2123d <= this.f2120a) {
                return this.f2122c[this.f2120a];
            }
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }

    /* renamed from: c */
    public int m4079c() {
        try {
            if (this.f2123d < this.f2120a) {
                this.f2122c[this.f2123d] = 0;
                int[] iArr = this.f2122c;
                int i = this.f2123d;
                this.f2123d = i + 1;
                return iArr[i];
            } else if (this.f2123d == this.f2120a) {
                int i2 = this.f2122c[this.f2123d];
                this.f2123d = 0;
                this.f2120a = -1;
                return i2;
            } else {
                throw new ArrayIndexOutOfBoundsException();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }

    /* renamed from: c */
    public int m4080c(int i) {
        if (i >= 0) {
            try {
                if (i < m4086i()) {
                    return this.f2122c[this.f2123d + i];
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                throw e;
            }
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* renamed from: d */
    public final int[] m4081d() {
        Object obj = new int[m4086i()];
        System.arraycopy(this.f2122c, this.f2123d, obj, 0, obj.length);
        return obj;
    }

    /* renamed from: e */
    public int m4082e() {
        try {
            if (this.f2123d <= this.f2120a) {
                return this.f2122c[this.f2123d];
            }
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }

    /* renamed from: f */
    public void m4083f() {
        this.f2123d = 0;
        this.f2120a = -1;
    }

    /* renamed from: g */
    public int m4084g() {
        try {
            if (this.f2123d < this.f2120a) {
                this.f2122c[this.f2120a] = 0;
                int[] iArr = this.f2122c;
                int i = this.f2120a;
                this.f2120a = i - 1;
                return iArr[i];
            } else if (this.f2123d == this.f2120a) {
                int i2 = this.f2122c[this.f2120a];
                this.f2123d = 0;
                this.f2120a = -1;
                return i2;
            } else {
                throw new ArrayIndexOutOfBoundsException();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }

    /* renamed from: h */
    public final int m4085h() {
        try {
            if (m4086i() == 0) {
                return 0;
            }
            int i = Integer.MAX_VALUE;
            for (int i2 = this.f2123d; i2 <= this.f2120a; i2++) {
                int i3 = this.f2122c[i2];
                if (i3 < i) {
                    i = i3;
                }
            }
            return i;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }

    /* renamed from: i */
    public int m4086i() {
        return (this.f2120a - this.f2123d) + 1;
    }

    /* renamed from: j */
    public C0809m m4087j() {
        try {
            C0809m c0809m = (C0809m) clone();
            c0809m.f2122c = (int[]) this.f2122c.clone();
            return c0809m;
        } catch (Exception e) {
            C0691a.m2857a(f2119z, e);
            return this;
        }
    }
}
