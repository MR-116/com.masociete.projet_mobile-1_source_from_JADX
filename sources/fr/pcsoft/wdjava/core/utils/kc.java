package fr.pcsoft.wdjava.core.utils;

import fr.pcsoft.wdjava.core.debug.C0691a;
import java.util.Arrays;

public class kc implements Cloneable {
    /* renamed from: z */
    private static final String f2113z = m3992z(m3993z("\u0003\u001bWm?9\u001fEn)j\u0012B\"/&\u0019Ig>j\u001aB\"8+\u0014Kg-?X"));
    /* renamed from: a */
    int f2114a;
    /* renamed from: b */
    int f2115b;
    /* renamed from: c */
    double[] f2116c;
    /* renamed from: d */
    double f2117d;

    public kc(int i) {
        this(i, 0.0d);
    }

    public kc(int i, double d) {
        this.f2114a = 0;
        this.f2115b = -1;
        this.f2117d = 0.0d;
        this.f2116c = new double[Math.max(4, i)];
        this.f2117d = d;
        if (this.f2117d != 0.0d) {
            Arrays.fill(this.f2116c, 0, this.f2116c.length, this.f2117d);
        }
    }

    /* renamed from: a */
    private final void m3991a(int i) {
        int j = m4006j();
        if (i == 0) {
            i = j + (j / 2);
        }
        if (i > this.f2116c.length) {
            Object obj = new double[i];
            System.arraycopy(this.f2116c, this.f2114a, obj, 0, j);
            this.f2116c = obj;
        } else {
            System.arraycopy(this.f2116c, this.f2114a, this.f2116c, 0, j);
        }
        try {
            this.f2115b -= this.f2114a;
            this.f2114a = 0;
            if (this.f2117d != 0.0d) {
                Arrays.fill(this.f2116c, this.f2115b + 1, this.f2116c.length, this.f2117d);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }

    /* renamed from: z */
    private static String m3992z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 74;
                    break;
                case 1:
                    i2 = 118;
                    break;
                case 2:
                    i2 = 39;
                    break;
                case 3:
                    i2 = 2;
                    break;
                default:
                    i2 = 76;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m3993z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 76);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public double m3994a() {
        try {
            if (this.f2114a < this.f2115b) {
                this.f2116c[this.f2114a] = 0.0d;
                double[] dArr = this.f2116c;
                int i = this.f2114a;
                this.f2114a = i + 1;
                return dArr[i];
            } else if (this.f2114a == this.f2115b) {
                double d = this.f2116c[this.f2114a];
                this.f2114a = 0;
                this.f2115b = -1;
                return d;
            } else {
                throw new ArrayIndexOutOfBoundsException();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }

    /* renamed from: a */
    public void m3995a(double d) {
        try {
            if (this.f2115b == this.f2116c.length - 1) {
                m3991a(0);
            }
            double[] dArr = this.f2116c;
            int i = this.f2115b + 1;
            this.f2115b = i;
            dArr[i] = d;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }

    /* renamed from: a */
    public final void m3996a(double d, int i) {
        if (i < 0) {
            try {
                throw new ArrayIndexOutOfBoundsException();
            } catch (ArrayIndexOutOfBoundsException e) {
                throw e;
            }
        }
        try {
            if (this.f2114a + i >= this.f2116c.length) {
                m3991a(Math.max(i + 1, this.f2116c.length + (this.f2116c.length / 2)));
                this.f2116c[i] = d;
                this.f2115b = i;
                return;
            }
            int i2 = this.f2114a + i;
            try {
                this.f2116c[i2] = d;
                if (i2 > this.f2115b) {
                    this.f2115b = i2;
                }
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw e2;
            }
        } catch (ArrayIndexOutOfBoundsException e22) {
            throw e22;
        }
    }

    /* renamed from: b */
    public final double m3997b() {
        try {
            if (m4006j() == 0) {
                return 0.0d;
            }
            double d = Double.MAX_VALUE;
            for (int i = this.f2114a; i <= this.f2115b; i++) {
                double d2 = this.f2116c[i];
                if (d2 < d) {
                    d = d2;
                }
            }
            return d;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }

    /* renamed from: b */
    public double m3998b(int i) {
        if (i >= 0) {
            try {
                if (i < m4006j()) {
                    return this.f2116c[this.f2114a + i];
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                throw e;
            }
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* renamed from: c */
    public kc m3999c() {
        try {
            kc kcVar = (kc) clone();
            kcVar.f2116c = (double[]) this.f2116c.clone();
            return kcVar;
        } catch (Exception e) {
            C0691a.m2857a(f2113z, e);
            return this;
        }
    }

    /* renamed from: d */
    public final double m4000d() {
        try {
            if (m4006j() == 0) {
                return 0.0d;
            }
            double d = Double.MIN_VALUE;
            for (int i = this.f2114a; i <= this.f2115b; i++) {
                double d2 = this.f2116c[i];
                if (d2 > d) {
                    d = d2;
                }
            }
            return d;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }

    /* renamed from: e */
    public double m4001e() {
        try {
            if (this.f2114a < this.f2115b) {
                this.f2116c[this.f2115b] = 0.0d;
                double[] dArr = this.f2116c;
                int i = this.f2115b;
                this.f2115b = i - 1;
                return dArr[i];
            } else if (this.f2114a == this.f2115b) {
                double d = this.f2116c[this.f2115b];
                this.f2114a = 0;
                this.f2115b = -1;
                return d;
            } else {
                throw new ArrayIndexOutOfBoundsException();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }

    /* renamed from: f */
    public void m4002f() {
        this.f2114a = 0;
        this.f2115b = -1;
    }

    /* renamed from: g */
    public double m4003g() {
        try {
            if (this.f2114a <= this.f2115b) {
                return this.f2116c[this.f2115b];
            }
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }

    /* renamed from: h */
    public final double[] m4004h() {
        Object obj = new double[m4006j()];
        System.arraycopy(this.f2116c, this.f2114a, obj, 0, obj.length);
        return obj;
    }

    /* renamed from: i */
    public double m4005i() {
        try {
            if (this.f2114a <= this.f2115b) {
                return this.f2116c[this.f2114a];
            }
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }

    /* renamed from: j */
    public int m4006j() {
        return (this.f2115b - this.f2114a) + 1;
    }
}
