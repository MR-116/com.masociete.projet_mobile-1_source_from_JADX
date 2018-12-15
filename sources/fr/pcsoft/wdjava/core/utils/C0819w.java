package fr.pcsoft.wdjava.core.utils;

import fr.pcsoft.wdjava.core.debug.C0691a;
import java.util.Arrays;

/* renamed from: fr.pcsoft.wdjava.core.utils.w */
public class C0819w implements Cloneable {
    /* renamed from: z */
    private static final String f2173z = C0819w.m4156z(C0819w.m4157z("W\b@-Dm\fR.R>\u0001UbTr\n^'E>\tUbC\u0007\\'VkK"));
    /* renamed from: a */
    int f2174a;
    /* renamed from: b */
    long[] f2175b;
    /* renamed from: c */
    int f2176c;
    /* renamed from: d */
    long f2177d;

    public C0819w(int i) {
        this(i, 0);
    }

    public C0819w(int i, long j) {
        this.f2176c = 0;
        this.f2174a = -1;
        this.f2177d = 0;
        this.f2175b = new long[Math.max(4, i)];
        this.f2177d = j;
        if (j != 0) {
            Arrays.fill(this.f2175b, 0, this.f2175b.length, j);
        }
    }

    /* renamed from: a */
    private final void m4155a(int i) {
        if (i == 0) {
            int c = m4163c();
            i = c + (c / 2);
        }
        if (i > this.f2175b.length) {
            Object obj = new long[i];
            System.arraycopy(this.f2175b, this.f2176c, obj, 0, m4163c());
            this.f2175b = obj;
        } else {
            System.arraycopy(this.f2175b, this.f2176c, this.f2175b, 0, m4163c());
        }
        try {
            this.f2174a -= this.f2176c;
            this.f2176c = 0;
            if (this.f2177d != 0) {
                Arrays.fill(this.f2175b, this.f2174a + 1, this.f2175b.length, this.f2177d);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }

    /* renamed from: z */
    private static String m4156z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 30;
                    break;
                case 1:
                    i2 = 101;
                    break;
                case 2:
                    i2 = 48;
                    break;
                case 3:
                    i2 = 66;
                    break;
                default:
                    i2 = 55;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m4157z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 55);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public long m4158a() {
        try {
            if (this.f2176c < this.f2174a) {
                this.f2175b[this.f2174a] = 0;
                long[] jArr = this.f2175b;
                int i = this.f2174a;
                this.f2174a = i - 1;
                return jArr[i];
            } else if (this.f2176c == this.f2174a) {
                long j = this.f2175b[this.f2174a];
                this.f2176c = 0;
                this.f2174a = -1;
                return j;
            } else {
                throw new ArrayIndexOutOfBoundsException();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }

    /* renamed from: a */
    public void m4159a(long j) {
        try {
            if (this.f2174a == this.f2175b.length - 1) {
                m4155a(0);
            }
            long[] jArr = this.f2175b;
            int i = this.f2174a + 1;
            this.f2174a = i;
            jArr[i] = j;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }

    /* renamed from: a */
    public final void m4160a(long j, int i) {
        if (i < 0) {
            try {
                throw new ArrayIndexOutOfBoundsException();
            } catch (ArrayIndexOutOfBoundsException e) {
                throw e;
            }
        }
        try {
            if (this.f2176c + i >= this.f2175b.length) {
                m4155a(Math.max(i + 1, this.f2175b.length + (this.f2175b.length / 2)));
                this.f2175b[i] = j;
                this.f2174a = i;
                return;
            }
            int i2 = this.f2176c + i;
            try {
                this.f2175b[i2] = j;
                if (i2 > this.f2174a) {
                    this.f2174a = i2;
                }
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw e2;
            }
        } catch (ArrayIndexOutOfBoundsException e22) {
            throw e22;
        }
    }

    /* renamed from: b */
    public long m4161b(int i) {
        if (i >= 0) {
            try {
                if (i < m4163c()) {
                    return this.f2175b[this.f2176c + i];
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                throw e;
            }
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* renamed from: b */
    public final long[] m4162b() {
        Object obj = new long[m4163c()];
        System.arraycopy(this.f2175b, this.f2176c, obj, 0, obj.length);
        return obj;
    }

    /* renamed from: c */
    public int m4163c() {
        return (this.f2174a - this.f2176c) + 1;
    }

    /* renamed from: d */
    public final long m4164d() {
        try {
            if (m4163c() == 0) {
                return 0;
            }
            long j = Long.MIN_VALUE;
            for (int i = this.f2176c; i <= this.f2174a; i++) {
                long j2 = this.f2175b[i];
                if (j2 > j) {
                    j = j2;
                }
            }
            return j;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }

    /* renamed from: e */
    public C0819w m4165e() {
        try {
            C0819w c0819w = (C0819w) clone();
            c0819w.f2175b = (long[]) this.f2175b.clone();
            return c0819w;
        } catch (Exception e) {
            C0691a.m2857a(f2173z, e);
            return this;
        }
    }

    /* renamed from: f */
    public long m4166f() {
        try {
            if (this.f2176c < this.f2174a) {
                this.f2175b[this.f2176c] = 0;
                long[] jArr = this.f2175b;
                int i = this.f2176c;
                this.f2176c = i + 1;
                return jArr[i];
            } else if (this.f2176c == this.f2174a) {
                long j = this.f2175b[this.f2176c];
                this.f2176c = 0;
                this.f2174a = -1;
                return j;
            } else {
                throw new ArrayIndexOutOfBoundsException();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }

    /* renamed from: g */
    public long m4167g() {
        try {
            if (this.f2176c <= this.f2174a) {
                return this.f2175b[this.f2174a];
            }
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }

    /* renamed from: h */
    public final long m4168h() {
        try {
            if (m4163c() == 0) {
                return 0;
            }
            long j = Long.MAX_VALUE;
            for (int i = this.f2176c; i <= this.f2174a; i++) {
                long j2 = this.f2175b[i];
                if (j2 < j) {
                    j = j2;
                }
            }
            return j;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }

    /* renamed from: i */
    public long m4169i() {
        try {
            if (this.f2176c <= this.f2174a) {
                return this.f2175b[this.f2176c];
            }
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }
}
