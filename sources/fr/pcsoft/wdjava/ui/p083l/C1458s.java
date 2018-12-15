package fr.pcsoft.wdjava.ui.p083l;

import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDDateHeure;
import fr.pcsoft.wdjava.core.types.WDDuree;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.core.utils.hb;
import java.util.Date;

/* renamed from: fr.pcsoft.wdjava.ui.l.s */
public class C1458s {
    /* renamed from: B */
    private static final int f4422B = 9;
    /* renamed from: C */
    private static final int f4423C = 17;
    /* renamed from: E */
    private static final int f4424E = 22;
    /* renamed from: G */
    private static final int f4425G = 3;
    /* renamed from: H */
    private static final int f4426H = 6;
    /* renamed from: I */
    private static final int f4427I = 0;
    /* renamed from: J */
    private static final int f4428J = 7;
    /* renamed from: K */
    private static final int f4429K = 14;
    /* renamed from: M */
    private static final int f4430M = 4;
    /* renamed from: N */
    private static final String f4431N = C1458s.m10281z(C1458s.m10282z("fmB"));
    /* renamed from: O */
    private static final String f4432O = C1458s.m10281z(C1458s.m10282z("f{T"));
    /* renamed from: P */
    private static final int f4433P = 12;
    /* renamed from: Q */
    private static final int f4434Q = 19;
    /* renamed from: S */
    private static final int f4435S = 21;
    /* renamed from: T */
    private static final String[] f4436T;
    /* renamed from: c */
    private static final int f4437c = 2;
    /* renamed from: e */
    private static final int f4438e = 16;
    /* renamed from: f */
    private static final int f4439f = 18;
    /* renamed from: g */
    private static final int f4440g = 13;
    /* renamed from: h */
    private static final String f4441h = C1458s.m10281z(C1458s.m10282z("fr]"));
    /* renamed from: j */
    private static final int f4442j = 1;
    /* renamed from: k */
    private static final String f4443k = C1458s.m10281z(C1458s.m10282z("fWx"));
    /* renamed from: l */
    private static final int f4444l = 8;
    /* renamed from: m */
    private static final int f4445m = 23;
    /* renamed from: n */
    private static final int f4446n = 11;
    /* renamed from: o */
    private static final String f4447o = C1458s.m10281z(C1458s.m10282z("fp_"));
    /* renamed from: p */
    private static final String f4448p = C1458s.m10281z(C1458s.m10282z("fiF"));
    /* renamed from: r */
    private static final int f4449r = 5;
    /* renamed from: s */
    private static final int f4450s = 20;
    /* renamed from: t */
    private static final int f4451t = 10;
    /* renamed from: w */
    private static final String f4452w = C1458s.m10281z(C1458s.m10282z("fcL"));
    /* renamed from: x */
    private static final String f4453x = C1458s.m10281z(C1458s.m10282z("f~Q"));
    /* renamed from: y */
    private static final int f4454y = 15;
    /* renamed from: z */
    private static final String f4455z = C1458s.m10281z(C1458s.m10282z("fwX"));
    /* renamed from: A */
    private long f4456A = 0;
    /* renamed from: D */
    private int f4457D = 0;
    /* renamed from: F */
    private WDDuree f4458F = null;
    /* renamed from: L */
    private long f4459L = 0;
    /* renamed from: R */
    private int f4460R = 0;
    /* renamed from: a */
    private int f4461a = 0;
    /* renamed from: b */
    private int f4462b = 0;
    /* renamed from: d */
    private boolean f4463d = false;
    /* renamed from: i */
    private boolean f4464i = true;
    /* renamed from: q */
    private WDDateHeure f4465q = null;
    /* renamed from: u */
    private WDDateHeure f4466u = null;
    /* renamed from: v */
    private long f4467v = 0;

    static {
        r0 = new String[10];
        r0[0] = C1458s.m10281z(C1458s.m10282z("\u001fp]\n\"yiF\u000e#"));
        r0[1] = C1458s.m10281z(C1458s.m10282z("\u001cI<"));
        r0[2] = C1458s.m10281z(C1458s.m10282z("\u0011\t"));
        r0[3] = C1458s.m10281z(C1458s.m10282z("\u0011\r"));
        r0[4] = C1458s.m10281z(C1458s.m10282z("\u0011\u000e"));
        r0[5] = C1458s.m10281z(C1458s.m10282z("\u0011\f"));
        r0[6] = C1458s.m10281z(C1458s.m10282z("\u0011\u000b"));
        r0[7] = C1458s.m10281z(C1458s.m10282z("\u0011\b"));
        r0[8] = C1458s.m10281z(C1458s.m10282z("\u0011\u000f"));
        r0[9] = C1458s.m10281z(C1458s.m10282z("\u0017wT\u0011>aJ\u0006:fP\u001d=qvT\u0016&bJ"));
        f4436T = r0;
    }

    /* renamed from: a */
    private final void m10270a() {
        m10272b();
        this.f4459L = (long) (Math.abs(this.f4458F.m2409i()) + (((Math.abs(this.f4458F.m2408h()) * 24) + Math.abs(this.f4458F.m2404e())) * 60));
        this.f4456A = (long) Math.abs(this.f4458F.m2402c());
    }

    /* renamed from: b */
    private final String m10271b(String str) {
        boolean z = true;
        String a;
        if (str.indexOf(f4432O) >= 0 || str.indexOf(f4452w) >= 0) {
            a = C0808l.m4018a(C0808l.m4018a(str, f4432O, f4436T[6]), f4452w, f4436T[6]);
            if (a.indexOf(f4455z) >= 0) {
                a = C0808l.m4018a(a, f4455z, f4436T[7]);
                m10280j();
            }
            if (this.f4461a < 2) {
                z = false;
            }
            this.f4464i = z;
            return a;
        } else if (str.indexOf(f4455z) >= 0) {
            a = C0808l.m4018a(str, f4455z, f4436T[7]);
            if (a.indexOf(f4431N) >= 0) {
                a = C0808l.m4018a(a, f4431N, f4436T[2]);
                m10273c();
            }
            if (this.f4457D < 2) {
                z = false;
            }
            this.f4464i = z;
            return a;
        } else if (str.indexOf(f4431N) >= 0) {
            a = C0808l.m4018a(str, f4431N, f4436T[2]);
            if (a.indexOf(f4447o) >= 0 || a.indexOf(f4453x) >= 0) {
                a = C0808l.m4018a(C0808l.m4018a(a, f4447o, f4436T[4]), f4453x, f4436T[4]);
                m10276f();
            }
            if (this.f4460R < 2) {
                z = false;
            }
            this.f4464i = z;
            return a;
        } else if (str.indexOf(f4447o) >= 0 || str.indexOf(f4453x) >= 0) {
            a = C0808l.m4018a(C0808l.m4018a(str, f4447o, f4436T[4]), f4453x, f4436T[4]);
            if (a.indexOf(f4441h) >= 0) {
                a = C0808l.m4018a(a, f4441h, f4436T[8]);
            }
            m10275e();
            if (this.f4462b < 2) {
                z = false;
            }
            this.f4464i = z;
            return a;
        } else if (str.indexOf(f4441h) >= 0) {
            a = C0808l.m4018a(str, f4441h, f4436T[8]);
            if (a.indexOf(f4443k) >= 0) {
                a = C0808l.m4018a(a, f4443k, f4436T[5]);
            }
            m10277g();
            if (this.f4467v < 2) {
                z = false;
            }
            this.f4464i = z;
            return a;
        } else if (str.indexOf(f4443k) >= 0) {
            a = C0808l.m4018a(str, f4443k, f4436T[5]);
            if (a.indexOf(f4448p) >= 0) {
                a = C0808l.m4018a(a, f4448p, f4436T[3]);
            }
            m10270a();
            if (this.f4459L < 2) {
                z = false;
            }
            this.f4464i = z;
            return a;
        } else {
            if (str.indexOf(f4448p) >= 0) {
                str = C0808l.m4018a(str, f4448p, f4436T[3]);
            }
            m10270a();
            if (this.f4456A < 2) {
                z = false;
            }
            this.f4464i = z;
            return str;
        }
    }

    /* renamed from: b */
    private final void m10272b() {
        this.f4461a = 0;
        this.f4457D = 0;
        this.f4460R = 0;
        this.f4462b = 0;
        this.f4467v = 0;
        this.f4459L = 0;
        this.f4456A = 0;
    }

    /* renamed from: c */
    private final void m10273c() {
        m10272b();
        int h = m10278h();
        this.f4460R = h / 7;
        this.f4462b = h - (this.f4460R * 7);
    }

    /* renamed from: d */
    private final String m10274d() {
        int i = 1;
        if (this.f4462b == 1) {
            i = this.f4463d ? 7 : 15;
        } else if (this.f4456A == 0) {
            i = 11;
        } else if (this.f4456A < 60) {
            i = this.f4463d ? 10 : 12;
        } else if (this.f4459L < 60) {
            i = this.f4463d ? 9 : 13;
        } else if (this.f4467v < 24) {
            i = this.f4463d ? 8 : 14;
        } else if (this.f4462b > 1 && this.f4460R == 0) {
            i = this.f4463d ? 6 : 16;
        } else if (this.f4460R == 1) {
            i = this.f4463d ? 5 : 17;
        } else if (this.f4460R > 1 && this.f4457D == 0) {
            i = this.f4463d ? 4 : 18;
        } else if (this.f4457D == 1) {
            i = this.f4463d ? 3 : 19;
        } else if (this.f4457D > 1 && this.f4461a == 0) {
            i = this.f4463d ? 2 : 20;
        } else if (this.f4461a != 1) {
            i = this.f4463d ? 0 : 22;
        } else if (!this.f4463d) {
            i = 21;
        }
        return m10283a(i);
    }

    /* renamed from: e */
    private final void m10275e() {
        int i = this.f4462b;
        m10272b();
        this.f4462b = i;
        this.f4467v = (long) Math.abs(this.f4458F.m2404e());
    }

    /* renamed from: f */
    private final void m10276f() {
        int i = this.f4462b;
        m10272b();
        this.f4460R = i / 7;
        this.f4462b = i - (this.f4460R * 7);
    }

    /* renamed from: g */
    private final void m10277g() {
        m10272b();
        this.f4467v = (long) (Math.abs(this.f4458F.m2404e()) + (Math.abs(this.f4458F.m2408h()) * 24));
        this.f4459L = (long) Math.abs(this.f4458F.m2409i());
    }

    /* renamed from: h */
    private final int m10278h() {
        int abs = Math.abs((this.f4466u.m2333A() + (this.f4466u.m2334B() * 12)) - (this.f4465q.m2333A() + (this.f4465q.m2334B() * 12)));
        if (abs == 0) {
            this.f4457D = abs;
            return Math.abs(this.f4466u.m2368q() - this.f4465q.m2368q());
        }
        abs--;
        if (this.f4463d) {
            if (this.f4466u.m2368q() > this.f4465q.m2368q()) {
                this.f4457D = abs;
                return Math.abs(this.f4465q.m2368q() - hb.m3901a(this.f4465q.m2334B(), this.f4465q.m2333A()).m2531r()) + this.f4466u.m2368q();
            } else if (this.f4465q.m2368q() == this.f4466u.m2368q()) {
                this.f4457D = abs + 1;
                return 0;
            } else {
                this.f4457D = abs + 1;
                return Math.abs(this.f4465q.m2368q() - this.f4466u.m2368q());
            }
        } else if (this.f4466u.m2368q() < this.f4465q.m2368q()) {
            this.f4457D = abs;
            return Math.abs(this.f4466u.m2368q() - hb.m3901a(this.f4466u.m2334B(), this.f4466u.m2333A()).m2531r()) + this.f4465q.m2368q();
        } else if (this.f4466u.m2368q() == this.f4465q.m2368q()) {
            this.f4457D = abs + 1;
            return 0;
        } else {
            this.f4457D = abs + 1;
            return Math.abs(this.f4465q.m2368q() - this.f4466u.m2368q());
        }
    }

    /* renamed from: i */
    private final int m10279i() {
        int i = this.f4461a;
        m10272b();
        if (i == 0) {
            this.f4461a = 0;
            return m10278h();
        } else if (this.f4463d) {
            if ((this.f4465q.m2333A() != this.f4466u.m2333A() || this.f4465q.m2368q() > this.f4466u.m2368q()) && this.f4465q.m2333A() >= this.f4466u.m2333A()) {
                this.f4461a = i - 1;
                if (this.f4461a == 0) {
                    return m10278h();
                }
                this.f4457D = ((12 - this.f4465q.m2333A()) + 1) + Math.abs(1 - this.f4466u.m2333A());
                return 0;
            }
            this.f4461a = i;
            this.f4457D = Math.abs(this.f4465q.m2333A() - this.f4466u.m2333A());
            return 0;
        } else if ((this.f4465q.m2333A() != this.f4466u.m2333A() || this.f4465q.m2368q() < this.f4466u.m2368q()) && this.f4465q.m2333A() <= this.f4466u.m2333A()) {
            this.f4461a = i - 1;
            if (this.f4461a == 0) {
                return m10278h();
            }
            this.f4457D = this.f4465q.m2333A() + Math.abs(this.f4466u.m2333A() - 12);
            return 0;
        } else {
            this.f4461a = i;
            this.f4457D = Math.abs(this.f4465q.m2333A() - this.f4466u.m2333A());
            return 0;
        }
    }

    /* renamed from: j */
    private final void m10280j() {
        m10272b();
        int i = m10279i();
        if (this.f4461a == 0) {
            this.f4460R = i / 7;
            this.f4462b = i - (this.f4460R * 7);
        }
    }

    /* renamed from: z */
    private static String m10281z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 52;
                    break;
                case 1:
                    i2 = 58;
                    break;
                case 2:
                    i2 = 21;
                    break;
                case 3:
                    i2 = 66;
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
    private static char[] m10282z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 111);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public String m10283a(int i) {
        String formatMasqueDureeRelative = WDProjet.getInstance().getFormatMasqueDureeRelative(i);
        return formatMasqueDureeRelative == null ? C0745b.m3224c(f4436T[9] + i, new String[0]) : formatMasqueDureeRelative;
    }

    /* renamed from: a */
    public final String m10284a(String str) {
        if (this.f4465q == null) {
            this.f4465q = new WDDateHeure(str);
        } else {
            this.f4465q.setValeur(str);
        }
        if (!this.f4465q.m2367p()) {
            return str;
        }
        if (this.f4466u == null) {
            this.f4466u = new WDDateHeure();
        } else {
            this.f4466u.setValeur(C0725i.m3032a(new Date()));
        }
        this.f4463d = this.f4466u.mo2354a(this.f4465q) > 0.0d;
        this.f4461a = Math.abs(this.f4466u.m2334B() - this.f4465q.m2334B());
        int o = this.f4465q.m2365o();
        int o2 = this.f4466u.m2365o();
        this.f4462b = Math.abs(o - o2);
        if (this.f4462b == 0 && str.length() <= 8) {
            return m10283a(23);
        }
        this.f4457D = Math.abs((this.f4466u.m2333A() + (this.f4466u.m2334B() * 12)) - (this.f4465q.m2333A() + (this.f4465q.m2334B() * 12)));
        int j = this.f4465q.m2357j();
        int j2 = this.f4466u.m2357j();
        if (j != 1) {
            o = (o - j) + 1;
        }
        if (j2 != 1) {
            o2 = (o2 - j2) + 1;
        }
        this.f4460R = Math.abs(o - o2) / 7;
        this.f4458F = C0725i.m3044b(hb.m3905a(this.f4465q, this.f4466u), f4436T[0]);
        this.f4456A = Math.abs(this.f4458F.getDuree()) / 1000;
        this.f4459L = this.f4456A / 60;
        this.f4467v = this.f4459L / 60;
        String d = m10274d();
        if (C0808l.m4053k(d)) {
            return str;
        }
        String b = m10271b(d);
        if (b.indexOf(f4436T[1]) > 0) {
            d = C0808l.m4018a(b, f4436T[1], this.f4464i ? "s" : "");
        } else {
            d = b;
        }
        return C0808l.m4021a(d, String.valueOf(this.f4461a), String.valueOf(this.f4457D), String.valueOf(this.f4460R), String.valueOf(this.f4462b), String.valueOf(this.f4467v), String.valueOf(this.f4459L), String.valueOf(this.f4456A));
    }
}
