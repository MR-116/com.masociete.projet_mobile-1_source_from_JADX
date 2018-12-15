package fr.pcsoft.wdjava.ui.champs;

import fr.pcsoft.wdjava.core.debug.C0691a;
import java.util.BitSet;

public class kb implements ub {
    /* renamed from: b */
    private static final int f3649b = -1;
    /* renamed from: f */
    private static final int f3650f = Integer.MAX_VALUE;
    /* renamed from: z */
    private static final String f3651z = m8626z(m8627z("r\u001a.C\u000e[\u0010jUÇS\u0010)RGP\u001bjHAQU9S^O\u001a8RÇ\u0011"));
    /* renamed from: a */
    protected int f3652a = 99;
    /* renamed from: c */
    private int f3653c = Integer.MAX_VALUE;
    /* renamed from: d */
    private int f3654d = -1;
    /* renamed from: e */
    private int f3655e = -1;
    /* renamed from: g */
    private int f3656g = -1;
    /* renamed from: h */
    private int f3657h = Integer.MAX_VALUE;
    /* renamed from: i */
    private BitSet f3658i = new BitSet(32);
    /* renamed from: j */
    private gb f3659j;
    /* renamed from: k */
    private int f3660k = Integer.MAX_VALUE;
    /* renamed from: l */
    private boolean f3661l = false;

    /* renamed from: a */
    private void m8622a(int i, int i2, int i3, int i4, boolean z) {
        int min = Math.min(i3, i);
        int max = Math.max(i4, i2);
        int i5 = min;
        while (i5 <= max) {
            Object obj = (i5 < i || i5 > i2) ? null : 1;
            Object obj2 = (i5 < i3 || i5 > i4) ? null : 1;
            if (!(obj2 == null || obj == null)) {
                if (z) {
                    obj = null;
                } else {
                    obj2 = null;
                }
            }
            if (obj2 != null) {
                m8624c(i5);
            } else if (obj != null) {
                m8625d(i5);
            }
            i5++;
        }
        m8649k();
    }

    /* renamed from: b */
    private final void m8623b(int i) {
        this.f3657h = Math.min(this.f3657h, i);
        this.f3655e = Math.max(this.f3655e, i);
    }

    /* renamed from: c */
    private final void m8624c(int i) {
        if (!this.f3658i.get(i)) {
            this.f3658i.set(i);
            m8623b(i);
            this.f3660k = Math.min(this.f3660k, i);
            this.f3654d = Math.max(this.f3654d, i);
        }
    }

    /* renamed from: d */
    private void m8625d(int i) {
        if (this.f3658i.get(i)) {
            this.f3658i.clear(i);
            m8623b(i);
            if (i == this.f3660k) {
                this.f3660k++;
                while (this.f3660k <= this.f3654d && !this.f3658i.get(this.f3660k)) {
                    this.f3660k++;
                }
            }
            if (i == this.f3654d) {
                this.f3654d--;
                while (this.f3660k <= this.f3654d && !this.f3658i.get(this.f3654d)) {
                    this.f3654d--;
                }
            }
            if (mo3494f()) {
                this.f3660k = Integer.MAX_VALUE;
                this.f3654d = -1;
            }
        }
    }

    /* renamed from: z */
    private static String m8626z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 63;
                    break;
                case 1:
                    i2 = 117;
                    break;
                case 2:
                    i2 = 74;
                    break;
                case 3:
                    i2 = 38;
                    break;
                default:
                    i2 = 46;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m8627z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 46);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public final int mo3483a() {
        int d = mo3490d();
        int c = mo3488c();
        int i = d;
        d = 0;
        for (int i2 = i; i2 <= c; i2++) {
            if (mo3485a(i2)) {
                d++;
            }
        }
        return d;
    }

    /* renamed from: a */
    public void mo3484a(int i, int i2) {
        int min = Math.min(i, i2);
        int max = Math.max(min, i2);
        for (int i3 = min; i3 <= this.f3654d; i3++) {
            if (this.f3658i.get(((max - min) + 1) + i3)) {
                m8624c(i3);
            } else {
                m8625d(i3);
            }
        }
        m8649k();
    }

    /* renamed from: a */
    protected void m8630a(int i, int i2, boolean z) {
        if (this.f3659j != null) {
            this.f3659j.onSelectionChanged(new xb(this, i, i2, z));
        }
    }

    /* renamed from: a */
    public final void m8631a(gb gbVar) {
        this.f3659j = gbVar;
    }

    /* renamed from: a */
    protected void m8632a(boolean z) {
        if (this.f3656g != -1) {
            int i = this.f3653c;
            int i2 = this.f3656g;
            this.f3653c = Integer.MAX_VALUE;
            this.f3656g = -1;
            m8630a(i, i2, z);
        }
    }

    /* renamed from: a */
    public final boolean mo3485a(int i) {
        return (i < this.f3660k || i > this.f3654d) ? false : this.f3658i.get(i);
    }

    /* renamed from: b */
    public void mo3486b() {
        mo3491d(this.f3660k, this.f3654d);
    }

    /* renamed from: b */
    public void mo3487b(int i, int i2) {
        if (i != -1 && i2 != -1) {
            if (!mo3495g()) {
                i = i2;
            }
            m8622a(Integer.MAX_VALUE, -1, Math.min(i, i2), Math.max(i, i2), true);
        }
    }

    /* renamed from: b */
    public void m8636b(boolean z) {
        if (z != this.f3661l) {
            this.f3661l = z;
            m8632a(z);
        }
    }

    /* renamed from: c */
    public final int mo3488c() {
        return this.f3654d;
    }

    /* renamed from: c */
    public void mo3489c(int i, int i2) {
        if (i != -1 && i2 != -1) {
            if (!mo3495g()) {
                i = i2;
            }
            m8622a(this.f3660k, this.f3654d, Math.min(i, i2), Math.max(i, i2), true);
        }
    }

    /* renamed from: d */
    public final int mo3490d() {
        return mo3494f() ? -1 : this.f3660k;
    }

    /* renamed from: d */
    public void mo3491d(int i, int i2) {
        if (i != -1 && i2 != -1) {
            int min = Math.min(i, i2);
            int max = Math.max(i, i2);
            if (!mo3495g() && min > this.f3660k && max < this.f3654d) {
                max = this.f3654d;
            }
            m8622a(min, max, Integer.MAX_VALUE, -1, false);
        }
    }

    /* renamed from: e */
    public final void m8641e(int i) {
        switch (this.f3652a) {
            case 3:
            case 5:
            case 99:
                if (mo3483a() > 1) {
                    int d = mo3490d();
                    mo3489c(d, d);
                    break;
                }
                break;
            case 4:
                break;
            default:
                C0691a.m2856a(f3651z);
                return;
        }
        this.f3652a = i;
    }

    /* renamed from: e */
    public void mo3492e(int i, int i2) {
        int i3;
        for (i3 = this.f3654d; i3 >= i; i3--) {
            if (this.f3658i.get(i3)) {
                m8624c(i3 + i2);
            } else {
                m8625d(i3 + i2);
            }
        }
        for (i3 = i; i3 <= (i + i2) - 1; i3++) {
            m8625d(i3);
        }
        m8649k();
    }

    /* renamed from: e */
    public final int[] mo3493e() {
        int d = mo3490d();
        int c = mo3488c();
        if (d == -1 || c == -1) {
            return new int[0];
        }
        Object obj = new int[((c - d) + 1)];
        int i = d;
        int i2 = 0;
        while (i <= c) {
            if (mo3485a(i)) {
                d = i2 + 1;
                obj[i2] = i;
            } else {
                d = i2;
            }
            i++;
            i2 = d;
        }
        if (i2 >= obj.length) {
            return obj;
        }
        Object obj2 = new int[i2];
        System.arraycopy(obj, 0, obj2, 0, i2);
        return obj2;
    }

    /* renamed from: f */
    public final boolean mo3494f() {
        return this.f3660k > this.f3654d;
    }

    /* renamed from: g */
    public final boolean mo3495g() {
        return this.f3652a == 4;
    }

    /* renamed from: h */
    public final int mo3496h() {
        return this.f3652a;
    }

    /* renamed from: i */
    public boolean m8647i() {
        return this.f3661l;
    }

    /* renamed from: j */
    public void m8648j() {
        this.f3658i = null;
        this.f3659j = null;
    }

    /* renamed from: k */
    protected final void m8649k() {
        if (this.f3655e != -1) {
            boolean i = m8647i();
            if (m8647i()) {
                this.f3653c = Math.min(this.f3653c, this.f3657h);
                this.f3656g = Math.max(this.f3656g, this.f3655e);
            }
            int i2 = this.f3657h;
            int i3 = this.f3655e;
            this.f3657h = Integer.MAX_VALUE;
            this.f3655e = -1;
            m8630a(i2, i3, i);
        }
    }

    /* renamed from: l */
    public final gb m8650l() {
        return this.f3659j;
    }
}
