package fr.pcsoft.wdjava.ui.p065b.p067a;

import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.utils.C0808l;

/* renamed from: fr.pcsoft.wdjava.ui.b.a.u */
final class C1081u {
    /* renamed from: a */
    protected int f3225a = 0;
    /* renamed from: b */
    private String f3226b;
    /* renamed from: c */
    private int f3227c = 0;

    public C1081u(String str) {
        m7797b(str);
    }

    /* renamed from: a */
    public final String m7793a(char c) {
        if (m7798b()) {
            return null;
        }
        char charAt = this.f3226b.charAt(this.f3225a);
        if (C0808l.m4043c((int) charAt) || charAt == c) {
            return null;
        }
        int i = this.f3225a;
        int r = m7815r();
        while (r != -1 && r != c && !C0808l.m4043c(r)) {
            r = m7815r();
        }
        return this.f3226b.substring(i, this.f3225a);
    }

    /* renamed from: a */
    public final boolean m7794a() {
        if (m7798b()) {
            return false;
        }
        char charAt = this.f3226b.charAt(this.f3225a);
        if (charAt != '0' && charAt != '1') {
            return false;
        }
        this.f3225a++;
        return charAt == '1';
    }

    /* renamed from: a */
    public final boolean m7795a(int i) {
        return (i >= 97 && i <= 122) || (i >= 65 && i <= 90);
    }

    /* renamed from: a */
    public final boolean m7796a(String str) {
        int length = str.length();
        if (this.f3225a > this.f3226b.length() - length || !this.f3226b.substring(this.f3225a, this.f3225a + length).equals(str)) {
            return false;
        }
        this.f3225a = length + this.f3225a;
        return true;
    }

    /* renamed from: b */
    public final void m7797b(String str) {
        this.f3226b = str.trim();
        this.f3227c = str.length();
        this.f3225a = 0;
    }

    /* renamed from: b */
    public final boolean m7798b() {
        return this.f3225a >= this.f3227c;
    }

    /* renamed from: b */
    public final boolean m7799b(char c) {
        if (m7798b() || this.f3226b.charAt(this.f3225a) != c) {
            return false;
        }
        this.f3225a++;
        return true;
    }

    /* renamed from: c */
    public final boolean m7800c() {
        return m7798b() ? false : m7795a(this.f3226b.charAt(this.f3225a));
    }

    /* renamed from: d */
    public final int m7801d() {
        if (m7798b()) {
            return this.f3225a;
        }
        int i = this.f3225a;
        int i2 = this.f3225a;
        int charAt = this.f3226b.charAt(this.f3225a);
        if (charAt == 45 || charAt == 43) {
            charAt = m7815r();
        }
        if (Character.isDigit(charAt)) {
            i2 = this.f3225a + 1;
            charAt = m7815r();
            while (Character.isDigit(charAt)) {
                i2 = this.f3225a + 1;
                charAt = m7815r();
            }
        }
        this.f3225a = i;
        if (i2 == this.f3225a) {
            return Integer.MIN_VALUE;
        }
        this.f3225a = i2;
        return C0725i.m3064d(this.f3226b.substring(this.f3225a, i2));
    }

    /* renamed from: e */
    public final float m7802e() {
        if (m7798b()) {
            return (float) this.f3225a;
        }
        int i = this.f3225a;
        int i2 = this.f3225a;
        int charAt = this.f3226b.charAt(this.f3225a);
        if (charAt == 45 || charAt == 43) {
            charAt = m7815r();
        }
        if (Character.isDigit(charAt)) {
            i2 = this.f3225a + 1;
            charAt = m7815r();
            while (Character.isDigit(charAt)) {
                i2 = this.f3225a + 1;
                charAt = m7815r();
            }
        }
        if (charAt == 46) {
            i2 = this.f3225a + 1;
            charAt = m7815r();
            while (Character.isDigit(charAt)) {
                i2 = this.f3225a + 1;
                charAt = m7815r();
            }
        }
        if (charAt == 101 || charAt == 69) {
            charAt = m7815r();
            if (charAt == 45 || charAt == 43) {
                charAt = m7815r();
            }
            if (Character.isDigit(charAt)) {
                i2 = this.f3225a + 1;
                charAt = m7815r();
                while (Character.isDigit(charAt)) {
                    i2 = this.f3225a + 1;
                    charAt = m7815r();
                }
            }
        }
        this.f3225a = i;
        if (i2 == this.f3225a) {
            return Float.NaN;
        }
        String substring = this.f3226b.substring(this.f3225a, i2);
        this.f3225a = i2;
        return (float) C0725i.m3084m(substring);
    }

    /* renamed from: f */
    public final C1063b m7803f() {
        float e = m7802e();
        if (Float.isNaN(e)) {
            return null;
        }
        C1069h k = m7808k();
        return k != null ? new C1063b(e, k) : new C1063b(e);
    }

    /* renamed from: g */
    public final void m7804g() {
        while (!m7798b() && C0808l.m4043c(this.f3226b.charAt(this.f3225a))) {
            this.f3225a++;
        }
    }

    /* renamed from: h */
    public final int m7805h() {
        if (m7798b()) {
            return -1;
        }
        String str = this.f3226b;
        int i = this.f3225a;
        this.f3225a = i + 1;
        return str.charAt(i);
    }

    /* renamed from: i */
    public String m7806i() {
        if (m7798b()) {
            return null;
        }
        int i = this.f3225a;
        this.f3225a = this.f3227c;
        return this.f3226b.substring(i);
    }

    /* renamed from: j */
    public String m7807j() {
        if (m7798b()) {
            return null;
        }
        int i = this.f3225a;
        char charAt = this.f3226b.charAt(this.f3225a);
        if (charAt != '\'' && charAt != '\"') {
            return null;
        }
        char r = m7815r();
        while (r != '￿' && r != charAt) {
            r = m7815r();
        }
        if (r == '￿') {
            this.f3225a = i;
            return null;
        }
        this.f3225a++;
        return this.f3226b.substring(i + 1, this.f3225a - 1);
    }

    /* renamed from: k */
    public final C1069h m7808k() {
        if (m7798b()) {
            return null;
        }
        if (this.f3226b.charAt(this.f3225a) == '%') {
            this.f3225a++;
            return C1069h.percent;
        } else if (this.f3225a + 2 > this.f3227c) {
            return null;
        } else {
            String substring = this.f3226b.substring(this.f3225a, this.f3225a + 2);
            this.f3225a += 2;
            return C1069h.getUnitFromName(substring);
        }
    }

    /* renamed from: l */
    public final boolean m7809l() {
        return this.f3226b != null;
    }

    /* renamed from: m */
    public final void m7810m() {
        this.f3226b = null;
        this.f3227c = 0;
        this.f3225a = 0;
    }

    /* renamed from: n */
    public final String m7811n() {
        if (m7798b()) {
            return null;
        }
        int i = this.f3225a;
        int charAt = this.f3226b.charAt(this.f3225a);
        while (m7795a(charAt)) {
            charAt = m7815r();
        }
        int i2 = this.f3225a;
        while (C0808l.m4043c(charAt)) {
            charAt = m7815r();
        }
        if (charAt == 40) {
            this.f3225a++;
            return this.f3226b.substring(i, i2);
        }
        this.f3225a = i;
        return null;
    }

    /* renamed from: o */
    public final float m7812o() {
        int i = this.f3225a;
        m7814q();
        float e = m7802e();
        if (!Float.isNaN(e)) {
            return e;
        }
        this.f3225a = i;
        return Float.NaN;
    }

    /* renamed from: p */
    public final String m7813p() {
        int i = this.f3225a;
        while (!m7798b() && !C0808l.m4043c(this.f3226b.charAt(this.f3225a))) {
            this.f3225a++;
        }
        String substring = this.f3226b.substring(i, this.f3225a);
        this.f3225a = i;
        return substring;
    }

    /* renamed from: q */
    public final boolean m7814q() {
        m7804g();
        if (!m7799b(',')) {
            return false;
        }
        m7804g();
        return true;
    }

    /* renamed from: r */
    protected int m7815r() {
        if (!m7798b()) {
            this.f3225a++;
            if (!m7798b()) {
                return this.f3226b.charAt(this.f3225a);
            }
        }
        return -1;
    }
}
