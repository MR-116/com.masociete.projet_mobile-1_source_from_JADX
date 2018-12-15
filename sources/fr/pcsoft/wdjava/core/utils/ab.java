package fr.pcsoft.wdjava.core.utils;

import fr.pcsoft.wdjava.core.debug.C0691a;
import java.util.Arrays;

public class ab implements Cloneable {
    /* renamed from: z */
    private static final String f2034z = m3823z(m3824z("\u0013\u0018F\tw)\u001cT\naz\u0011SFg6\u001aX\u0003vz\u0019SFp;\u0017Z\u0003e/["));
    /* renamed from: a */
    int f2035a;
    /* renamed from: b */
    float[] f2036b;
    /* renamed from: c */
    int f2037c;
    /* renamed from: d */
    float f2038d;

    public ab(int i) {
        this(i, 0.0f);
    }

    public ab(int i, float f) {
        this.f2037c = 0;
        this.f2035a = -1;
        this.f2038d = 0.0f;
        this.f2036b = new float[Math.max(4, i)];
        this.f2038d = f;
        if (this.f2038d != 0.0f) {
            Arrays.fill(this.f2036b, 0, this.f2036b.length, this.f2038d);
        }
    }

    /* renamed from: b */
    private final void m3822b(int i) {
        if (i == 0) {
            int b = m3829b();
            i = b + (b / 2);
        }
        if (i > this.f2036b.length) {
            Object obj = new float[i];
            System.arraycopy(this.f2036b, this.f2037c, obj, 0, m3829b());
            this.f2036b = obj;
        } else {
            System.arraycopy(this.f2036b, this.f2037c, this.f2036b, 0, m3829b());
        }
        try {
            this.f2035a -= this.f2037c;
            this.f2037c = 0;
            if (this.f2038d != 0.0f) {
                Arrays.fill(this.f2036b, this.f2035a + 1, this.f2036b.length, this.f2038d);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }

    /* renamed from: z */
    private static String m3823z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 90;
                    break;
                case 1:
                    i2 = 117;
                    break;
                case 2:
                    i2 = 54;
                    break;
                case 3:
                    i2 = 102;
                    break;
                default:
                    i2 = 4;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m3824z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 4);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public float m3825a() {
        try {
            if (this.f2037c <= this.f2035a) {
                return this.f2036b[this.f2037c];
            }
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }

    /* renamed from: a */
    public float m3826a(int i) {
        if (i >= 0) {
            try {
                if (i < m3829b()) {
                    return this.f2036b[this.f2037c + i];
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                throw e;
            }
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* renamed from: a */
    public void m3827a(float f) {
        try {
            if (this.f2035a == this.f2036b.length - 1) {
                m3822b(0);
            }
            float[] fArr = this.f2036b;
            int i = this.f2035a + 1;
            this.f2035a = i;
            fArr[i] = f;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }

    /* renamed from: a */
    public final void m3828a(float f, int i) {
        if (i < 0) {
            try {
                throw new ArrayIndexOutOfBoundsException();
            } catch (ArrayIndexOutOfBoundsException e) {
                throw e;
            }
        }
        try {
            if (this.f2037c + i >= this.f2036b.length) {
                m3822b(Math.max(i + 1, this.f2036b.length + (this.f2036b.length / 2)));
                this.f2036b[i] = f;
                this.f2035a = i;
                return;
            }
            int i2 = this.f2037c + i;
            try {
                this.f2036b[i2] = f;
                if (i2 > this.f2035a) {
                    this.f2035a = i2;
                }
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw e2;
            }
        } catch (ArrayIndexOutOfBoundsException e22) {
            throw e22;
        }
    }

    /* renamed from: b */
    public int m3829b() {
        return (this.f2035a - this.f2037c) + 1;
    }

    /* renamed from: c */
    public float m3830c() {
        try {
            if (this.f2037c < this.f2035a) {
                this.f2036b[this.f2037c] = 0.0f;
                float[] fArr = this.f2036b;
                int i = this.f2037c;
                this.f2037c = i + 1;
                return fArr[i];
            } else if (this.f2037c == this.f2035a) {
                float f = this.f2036b[this.f2037c];
                this.f2037c = 0;
                this.f2035a = -1;
                return f;
            } else {
                throw new ArrayIndexOutOfBoundsException();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }

    /* renamed from: d */
    public float m3831d() {
        try {
            if (this.f2037c < this.f2035a) {
                this.f2036b[this.f2035a] = 0.0f;
                float[] fArr = this.f2036b;
                int i = this.f2035a;
                this.f2035a = i - 1;
                return fArr[i];
            } else if (this.f2037c == this.f2035a) {
                float f = this.f2036b[this.f2035a];
                this.f2037c = 0;
                this.f2035a = -1;
                return f;
            } else {
                throw new ArrayIndexOutOfBoundsException();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }

    /* renamed from: e */
    public final float m3832e() {
        try {
            if (m3829b() == 0) {
                return 0.0f;
            }
            float f = Float.MIN_VALUE;
            for (int i = this.f2037c; i <= this.f2035a; i++) {
                float f2 = this.f2036b[i];
                if (f2 > f) {
                    f = f2;
                }
            }
            return f;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }

    /* renamed from: f */
    public ab m3833f() {
        try {
            ab abVar = (ab) clone();
            abVar.f2036b = (float[]) this.f2036b.clone();
            return abVar;
        } catch (Exception e) {
            C0691a.m2857a(f2034z, e);
            return this;
        }
    }

    /* renamed from: g */
    public final float m3834g() {
        try {
            if (m3829b() == 0) {
                return 0.0f;
            }
            float f = Float.MAX_VALUE;
            for (int i = this.f2037c; i <= this.f2035a; i++) {
                float f2 = this.f2036b[i];
                if (f2 < f) {
                    f = f2;
                }
            }
            return f;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }

    /* renamed from: h */
    public final float[] m3835h() {
        Object obj = new float[m3829b()];
        System.arraycopy(this.f2036b, this.f2037c, obj, 0, obj.length);
        return obj;
    }

    /* renamed from: i */
    public float m3836i() {
        try {
            if (this.f2037c <= this.f2035a) {
                return this.f2036b[this.f2035a];
            }
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }
}
