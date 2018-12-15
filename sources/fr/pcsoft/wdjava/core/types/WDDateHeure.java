package fr.pcsoft.wdjava.core.types;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.allocation.C0613b;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.erreur.WDException;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.core.utils.hb;
import fr.pcsoft.wdjava.core.utils.wb;
import fr.pcsoft.wdjava.core.utils.zb;
import java.security.InvalidParameterException;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class WDDateHeure extends cb implements hb {
    /* renamed from: B */
    public static final byte f1518B = (byte) 17;
    public static final C0613b<WDDateHeure> CREATOR = new C0793u();
    /* renamed from: G */
    private static final String[] f1519G = new String[]{m2330z(m2332z("t ehk\u0016;|bw\b&{y|\u0005+|y|")), m2330z(m2332z("t+ty|\b'pxk\u0012")), m2330z(m2332z("t)`~|\u0016:jdw\u0001.yd}\u0012")), m2330z(m2332z("\u0010\"a")), m2330z(m2332z("bV")), m2330z(m2332z("t9ta|\u0002=jdw\u0001.yd}\u00120ev\u0007=|hm\u0012")), m2330z(m2332z("t-zw\u00120ev\u0007=|hm\u0012")), m2330z(m2332z("t\"|cl\u0003*")), m2330z(m2332z("t'pxk\u0012")), m2330z(m2332z("e\\")), m2330z(m2332z("t<pnv\u0019+p")), m2330z(m2332z("\f3qp")), m2330z(m2332z("g_")), m2330z(m2332z("3\u000eAHm>\u0002P")), m2330z(m2332z("\u0013.ahf\u001e!clu\u001e+p")), m2330z(m2332z("t%zxk")), m2330z(m2332z("d^")), m2330z(m2332z("t%zxk\b&{{x\u001b&qh")), m2330z(m2332z("t\"zdj\b&{{x\u001b&qh")), m2330z(m2332z("t*g|\u0002=jkv\u0005\"tyf\u0013.ah")), m2330z(m2332z("t.{c|\u00120|co\u0016#|i|")), m2330z(m2332z("t+ty|\b&{{x\u001b&qh")), m2330z(m2332z("t\"|au\u001e<pnv\u0019+p")), m2330z(m2332z("nV\f")), m2330z(m2332z("nV\f\u0014")), m2330z(m2332z("t.{c|\u0012")), m2330z(m2332z("t*gf\u0013.ahf\u001e!clu\u001e+prz\u0018!chk\u0004&zcf\u0002;v")), m2330z(m2332z("t\"zdj")), m2330z(m2332z("f]")), m2330z(m2332z("\u0003\u0016EH\u0019>\u0001VBT'\u000eAD[;\n\u0015]V\"\u001d\u0015AXw\fZ@I6\u001dTDJ8\u0001"))};
    /* renamed from: A */
    private byte f1520A = (byte) 0;
    /* renamed from: C */
    private int f1521C;
    /* renamed from: D */
    private int f1522D;
    /* renamed from: E */
    private String f1523E = null;
    /* renamed from: F */
    private int f1524F;
    /* renamed from: w */
    private int f1525w;
    /* renamed from: x */
    private int f1526x;
    /* renamed from: y */
    private int f1527y;
    /* renamed from: z */
    private int f1528z;

    public WDDateHeure() {
        m2329w();
    }

    public WDDateHeure(double d) {
        setValeur(d);
    }

    public WDDateHeure(WDObjet wDObjet) {
        setValeur(wDObjet);
    }

    public WDDateHeure(zb zbVar, wb wbVar) {
        this.f1528z = zbVar.m4199a();
        this.f1522D = zbVar.m4204c();
        this.f1527y = zbVar.m4207e();
        this.f1521C = wbVar.m4173b();
        this.f1526x = wbVar.m4175c();
        this.f1525w = wbVar.m4171a();
        this.f1524F = 0;
    }

    public WDDateHeure(String str) {
        setValeur(str);
    }

    public WDDateHeure(boolean z) {
        setValeur(z);
    }

    /* renamed from: a */
    private void m2313a(int i) {
        if (i < 0) {
            try {
                m2316c(Math.abs(i));
                return;
            } catch (InvalidParameterException e) {
                throw e;
            }
        }
        m2345a(false);
        int i2 = this.f1524F + i;
        if (i2 > C0607n.Qv) {
            try {
                m2331z();
                f.add(14, i);
                m2328v();
                return;
            } catch (InvalidParameterException e2) {
                throw e2;
            }
        }
        setMilliSeconde(i2);
    }

    /* renamed from: a */
    private void m2314a(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        f.clear();
        f.set(1, i);
        f.set(2, Math.max(0, i2 - 1));
        if (i3 > f.getActualMaximum(5)) {
            i3 = f.getActualMaximum(5);
        }
        f.set(5, Math.max(1, i3));
        f.set(11, i4);
        f.set(12, i5);
        f.set(13, i6);
        f.set(14, i7);
        m2344a(f);
    }

    /* renamed from: b */
    private void m2315b(int i) {
        if (i < 0) {
            try {
                m2323l(Math.abs(i));
                return;
            } catch (InvalidParameterException e) {
                throw e;
            }
        }
        m2345a(false);
        int i2 = this.f1528z - i;
        if (i2 < 1) {
            try {
                m2331z();
                f.add(1, -i);
                m2328v();
                return;
            } catch (InvalidParameterException e2) {
                throw e2;
            }
        }
        setAnnee(i2);
    }

    /* renamed from: c */
    private void m2316c(int i) {
        if (i < 0) {
            try {
                m2313a(Math.abs(i));
                return;
            } catch (InvalidParameterException e) {
                throw e;
            }
        }
        m2345a(false);
        int i2 = this.f1524F - i;
        if (i2 < 0) {
            try {
                m2331z();
                f.add(14, -i);
                m2328v();
                return;
            } catch (InvalidParameterException e2) {
                throw e2;
            }
        }
        setMilliSeconde(i2);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: d */
    private byte m2317d() {
        /*
        r7 = this;
        r2 = 3;
        r3 = 2;
        r1 = 4;
        r0 = 1;
        r4 = r7.f1523E;
        if (r4 == 0) goto L_0x0023;
    L_0x0008:
        r4 = r7.f1523E;
        r4 = r4.length();
        r5 = 8;
        r4 = java.lang.Math.min(r4, r5);
        r5 = 8;
        if (r4 < r5) goto L_0x0020;
    L_0x0018:
        r4 = r7.f1523E;	 Catch:{ InvalidParameterException -> 0x0021 }
        r4 = fr.pcsoft.wdjava.core.utils.C0808l.m4044c(r4);	 Catch:{ InvalidParameterException -> 0x0021 }
        if (r4 != 0) goto L_0x0023;
    L_0x0020:
        return r0;
    L_0x0021:
        r0 = move-exception;
        throw r0;
    L_0x0023:
        r4 = r7.f1528z;	 Catch:{ InvalidParameterException -> 0x002f }
        if (r4 < r0) goto L_0x002d;
    L_0x0027:
        r4 = r7.f1528z;	 Catch:{ InvalidParameterException -> 0x0031 }
        r5 = 9999; // 0x270f float:1.4012E-41 double:4.94E-320;
        if (r4 <= r5) goto L_0x0033;
    L_0x002d:
        r0 = r1;
        goto L_0x0020;
    L_0x002f:
        r0 = move-exception;
        throw r0;	 Catch:{ InvalidParameterException -> 0x0031 }
    L_0x0031:
        r0 = move-exception;
        throw r0;
    L_0x0033:
        r4 = r7.f1522D;	 Catch:{ InvalidParameterException -> 0x003f }
        if (r4 < r0) goto L_0x003d;
    L_0x0037:
        r4 = r7.f1522D;	 Catch:{ InvalidParameterException -> 0x0041 }
        r5 = 12;
        if (r4 <= r5) goto L_0x0043;
    L_0x003d:
        r0 = r3;
        goto L_0x0020;
    L_0x003f:
        r0 = move-exception;
        throw r0;	 Catch:{ InvalidParameterException -> 0x0041 }
    L_0x0041:
        r0 = move-exception;
        throw r0;
    L_0x0043:
        r4 = r7.f1527y;	 Catch:{ InvalidParameterException -> 0x0076 }
        if (r4 < r0) goto L_0x004d;
    L_0x0047:
        r0 = r7.f1527y;	 Catch:{ InvalidParameterException -> 0x0078 }
        r4 = 28;
        if (r0 <= r4) goto L_0x007e;
    L_0x004d:
        r0 = f;	 Catch:{ InvalidParameterException -> 0x007a }
        r0.clear();	 Catch:{ InvalidParameterException -> 0x007a }
        r0 = f;	 Catch:{ InvalidParameterException -> 0x007a }
        r4 = r7.f1528z;	 Catch:{ InvalidParameterException -> 0x007a }
        r5 = r7.f1522D;	 Catch:{ InvalidParameterException -> 0x007a }
        r5 = r5 + -1;
        r6 = 1;
        r0.set(r4, r5, r6);	 Catch:{ InvalidParameterException -> 0x007a }
        r0 = r7.f1527y;	 Catch:{ InvalidParameterException -> 0x007a }
        r4 = f;	 Catch:{ InvalidParameterException -> 0x007a }
        r5 = 5;
        r4 = r4.getActualMinimum(r5);	 Catch:{ InvalidParameterException -> 0x007a }
        if (r0 < r4) goto L_0x0074;
    L_0x0069:
        r0 = r7.f1527y;	 Catch:{ InvalidParameterException -> 0x007c }
        r4 = f;	 Catch:{ InvalidParameterException -> 0x007c }
        r5 = 5;
        r4 = r4.getActualMaximum(r5);	 Catch:{ InvalidParameterException -> 0x007c }
        if (r0 <= r4) goto L_0x007e;
    L_0x0074:
        r0 = r2;
        goto L_0x0020;
    L_0x0076:
        r0 = move-exception;
        throw r0;	 Catch:{ InvalidParameterException -> 0x0078 }
    L_0x0078:
        r0 = move-exception;
        throw r0;	 Catch:{ InvalidParameterException -> 0x007a }
    L_0x007a:
        r0 = move-exception;
        throw r0;	 Catch:{ InvalidParameterException -> 0x007c }
    L_0x007c:
        r0 = move-exception;
        throw r0;
    L_0x007e:
        r0 = r7.f1521C;	 Catch:{ InvalidParameterException -> 0x008a }
        if (r0 < 0) goto L_0x0088;
    L_0x0082:
        r0 = r7.f1521C;	 Catch:{ InvalidParameterException -> 0x008c }
        r4 = 23;
        if (r0 <= r4) goto L_0x008e;
    L_0x0088:
        r0 = r3;
        goto L_0x0020;
    L_0x008a:
        r0 = move-exception;
        throw r0;	 Catch:{ InvalidParameterException -> 0x008c }
    L_0x008c:
        r0 = move-exception;
        throw r0;
    L_0x008e:
        r0 = r7.f1526x;	 Catch:{ InvalidParameterException -> 0x009a }
        if (r0 < 0) goto L_0x0098;
    L_0x0092:
        r0 = r7.f1526x;	 Catch:{ InvalidParameterException -> 0x009c }
        r3 = 59;
        if (r0 <= r3) goto L_0x009e;
    L_0x0098:
        r0 = r2;
        goto L_0x0020;
    L_0x009a:
        r0 = move-exception;
        throw r0;	 Catch:{ InvalidParameterException -> 0x009c }
    L_0x009c:
        r0 = move-exception;
        throw r0;
    L_0x009e:
        r0 = r7.f1525w;	 Catch:{ InvalidParameterException -> 0x00ab }
        if (r0 < 0) goto L_0x00a8;
    L_0x00a2:
        r0 = r7.f1525w;	 Catch:{ InvalidParameterException -> 0x00ad }
        r2 = 59;
        if (r0 <= r2) goto L_0x00af;
    L_0x00a8:
        r0 = r1;
        goto L_0x0020;
    L_0x00ab:
        r0 = move-exception;
        throw r0;	 Catch:{ InvalidParameterException -> 0x00ad }
    L_0x00ad:
        r0 = move-exception;
        throw r0;
    L_0x00af:
        r0 = r7.f1524F;	 Catch:{ InvalidParameterException -> 0x00bc }
        if (r0 < 0) goto L_0x00b9;
    L_0x00b3:
        r0 = r7.f1524F;	 Catch:{ InvalidParameterException -> 0x00be }
        r2 = 999; // 0x3e7 float:1.4E-42 double:4.936E-321;
        if (r0 <= r2) goto L_0x00c0;
    L_0x00b9:
        r0 = r1;
        goto L_0x0020;
    L_0x00bc:
        r0 = move-exception;
        throw r0;	 Catch:{ InvalidParameterException -> 0x00be }
    L_0x00be:
        r0 = move-exception;
        throw r0;
    L_0x00c0:
        r0 = 0;
        r7.f1523E = r0;
        r0 = 0;
        goto L_0x0020;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.core.types.WDDateHeure.d():byte");
    }

    /* renamed from: d */
    private void m2318d(int i) {
        if (i < 0) {
            try {
                m2319f(Math.abs(i));
                return;
            } catch (InvalidParameterException e) {
                throw e;
            }
        }
        m2345a(false);
        int i2 = this.f1526x - i;
        if (i2 < 0) {
            try {
                m2331z();
                f.add(12, -i);
                m2328v();
                return;
            } catch (InvalidParameterException e2) {
                throw e2;
            }
        }
        setMinute(i2);
    }

    /* renamed from: f */
    private void m2319f(int i) {
        if (i < 0) {
            try {
                m2318d(Math.abs(i));
                return;
            } catch (InvalidParameterException e) {
                throw e;
            }
        }
        m2345a(false);
        int i2 = this.f1526x + i;
        if (i2 > 59) {
            try {
                m2331z();
                f.add(12, i);
                m2328v();
                return;
            } catch (InvalidParameterException e2) {
                throw e2;
            }
        }
        setMinute(i2);
    }

    /* renamed from: g */
    private void m2320g(int i) {
        if (i < 0) {
            try {
                m2324p(Math.abs(i));
                return;
            } catch (InvalidParameterException e) {
                throw e;
            }
        }
        m2345a(false);
        int i2 = this.f1525w + i;
        if (i2 > 59) {
            try {
                m2331z();
                f.add(13, i);
                m2328v();
                return;
            } catch (InvalidParameterException e2) {
                throw e2;
            }
        }
        setSeconde(i2);
    }

    /* renamed from: h */
    private void m2321h(int i) {
        if (i < 0) {
            try {
                m2327u(Math.abs(i));
                return;
            } catch (InvalidParameterException e) {
                throw e;
            }
        }
        m2345a(false);
        int i2 = this.f1522D + i;
        if (i2 > 12) {
            try {
                m2331z();
                f.add(2, i);
                m2328v();
                return;
            } catch (InvalidParameterException e2) {
                throw e2;
            }
        }
        setMois(i2);
    }

    /* renamed from: k */
    private int m2322k() {
        try {
            if (this.f1520A == (byte) 99) {
                this.f1520A = m2317d();
            }
            return this.f1520A;
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    /* renamed from: l */
    private void m2323l(int i) {
        if (i < 0) {
            try {
                m2315b(Math.abs(i));
                return;
            } catch (InvalidParameterException e) {
                throw e;
            }
        }
        m2345a(false);
        int i2 = this.f1528z + i;
        if (i2 > 9999) {
            try {
                m2331z();
                f.add(1, i);
                m2328v();
                return;
            } catch (InvalidParameterException e2) {
                throw e2;
            }
        }
        setAnnee(i2);
    }

    /* renamed from: p */
    private void m2324p(int i) {
        if (i < 0) {
            try {
                m2320g(Math.abs(i));
                return;
            } catch (InvalidParameterException e) {
                throw e;
            }
        }
        m2345a(false);
        int i2 = this.f1525w - i;
        if (i2 < 0) {
            try {
                m2331z();
                f.add(13, -i);
                m2328v();
                return;
            } catch (InvalidParameterException e2) {
                throw e2;
            }
        }
        setSeconde(i2);
    }

    /* renamed from: q */
    private void m2325q(int i) {
        if (i < 0) {
            try {
                m2375v(Math.abs(i));
                return;
            } catch (InvalidParameterException e) {
                throw e;
            }
        }
        m2345a(false);
        int i2 = this.f1527y - i;
        if (i2 < 1) {
            try {
                m2331z();
                f.add(6, -i);
                m2328v();
                return;
            } catch (InvalidParameterException e2) {
                throw e2;
            }
        }
        setJour(i2);
    }

    /* renamed from: t */
    private void m2326t(int i) {
        if (i < 0) {
            try {
                m2362m(Math.abs(i));
                return;
            } catch (InvalidParameterException e) {
                throw e;
            }
        }
        m2345a(false);
        int i2 = this.f1521C - i;
        if (i2 < 0) {
            try {
                m2331z();
                f.add(11, -i);
                m2328v();
                return;
            } catch (InvalidParameterException e2) {
                throw e2;
            }
        }
        m2366o(i2);
    }

    /* renamed from: u */
    private void m2327u(int i) {
        if (i < 0) {
            try {
                m2321h(Math.abs(i));
                return;
            } catch (InvalidParameterException e) {
                throw e;
            }
        }
        m2345a(false);
        int i2 = this.f1522D - i;
        if (i2 < 1) {
            try {
                m2331z();
                f.add(2, -i);
                m2328v();
                return;
            } catch (InvalidParameterException e2) {
                throw e2;
            }
        }
        setMois(i2);
    }

    /* renamed from: v */
    private void m2328v() {
        m2344a(f);
    }

    /* renamed from: w */
    private void m2329w() {
        try {
            if (hb.f2068a != null) {
                if (hb.f2069b != null) {
                    setValeur(hb.f2069b + hb.f2068a);
                    return;
                }
            }
            setValeur(C0725i.m3032a(new Date()));
        } catch (InvalidParameterException e) {
            throw e;
        } catch (InvalidParameterException e2) {
            throw e2;
        }
    }

    /* renamed from: z */
    private static String m2330z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 87;
                    break;
                case 1:
                    i2 = 111;
                    break;
                case 2:
                    i2 = 53;
                    break;
                case 3:
                    i2 = 45;
                    break;
                default:
                    i2 = 57;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private void m2331z() {
        f.clear();
        f.set(this.f1528z, this.f1522D - 1, this.f1527y);
        f.set(11, this.f1521C);
        f.set(12, this.f1526x);
        f.set(13, this.f1525w);
        f.set(14, this.f1524F);
    }

    /* renamed from: z */
    private static char[] m2332z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 57);
        }
        return toCharArray;
    }

    /* renamed from: A */
    public final int m2333A() {
        return this.f1522D;
    }

    /* renamed from: B */
    public final int m2334B() {
        return this.f1528z;
    }

    /* renamed from: C */
    public String m2335C() {
        return C0725i.m3024a(this.f1526x, 2);
    }

    /* renamed from: D */
    public final int m2336D() {
        return this.f1525w;
    }

    /* renamed from: E */
    public String m2337E() {
        try {
            if (this.f1528z < 1980) {
                WDErreurManager.m2883a(C0745b.m3222b(f1519G[26], new String[0]));
            }
            m2331z();
            return C0725i.m3032a(new Date(hb.m3899a(f.getTimeInMillis())));
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    /* renamed from: F */
    public String m2338F() {
        return C0725i.m3024a(this.f1524F, 3);
    }

    /* renamed from: G */
    public long m2339G() {
        try {
            if (m2322k() > 0) {
                WDErreurManager.m2883a(C0745b.m3222b(f1519G[14], new String[0]));
            }
            return ((((((long) C0725i.m3012a(this.f1528z, this.f1522D, this.f1527y)) * hb.f2079l) + (((long) this.f1521C) * 3600000)) + (((long) this.f1526x) * 60000)) + (((long) this.f1525w) * 1000)) + ((long) this.f1524F);
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    /* renamed from: a */
    public double mo2354a(WDObjet wDObjet) {
        WDDateHeure wDDateHeure = (WDDateHeure) wDObjet.checkType(WDDateHeure.class);
        if (wDDateHeure != null) {
            try {
                if (this.f1528z != wDDateHeure.f1528z) {
                    return (double) (this.f1528z - wDDateHeure.f1528z);
                }
                if (this.f1522D != wDDateHeure.f1522D) {
                    return (double) (this.f1522D - wDDateHeure.f1522D);
                }
                try {
                    if (this.f1527y != wDDateHeure.f1527y) {
                        return (double) (this.f1527y - wDDateHeure.f1527y);
                    }
                    try {
                        if (this.f1521C != wDDateHeure.f1521C) {
                            return (double) (this.f1521C - wDDateHeure.f1521C);
                        }
                        try {
                            if (this.f1526x != wDDateHeure.f1526x) {
                                return (double) (this.f1526x - wDDateHeure.f1526x);
                            }
                            try {
                                if (this.f1525w != wDDateHeure.f1525w) {
                                    return (double) (this.f1525w - wDDateHeure.f1525w);
                                }
                                try {
                                    if (this.f1524F != wDDateHeure.f1524F) {
                                        return (double) (this.f1524F - wDDateHeure.f1524F);
                                    }
                                } catch (InvalidParameterException e) {
                                    throw e;
                                }
                            } catch (InvalidParameterException e2) {
                                throw e2;
                            }
                        } catch (InvalidParameterException e22) {
                            throw e22;
                        }
                    } catch (InvalidParameterException e222) {
                        throw e222;
                    }
                } catch (InvalidParameterException e2222) {
                    throw e2222;
                }
            } catch (InvalidParameterException e22222) {
                throw e22222;
            } catch (InvalidParameterException e222222) {
                throw e222222;
            }
        }
        WDObjet valeur = wDObjet.getValeur();
        switch (valeur.getTypeVar()) {
            case 16:
            case 19:
            case 28:
            case 30:
                String string = getString();
                String string2 = valeur.getString();
                int min = Math.min(string.length(), string2.length());
                if (min != 0) {
                    return (double) string.substring(0, min).compareTo(string2.substring(0, min));
                }
                try {
                    return (double) (string.length() - string2.length());
                } catch (InvalidParameterException e2222222) {
                    throw e2222222;
                }
            case 24:
                return (double) m2348c().compareTo(valeur.getString());
            case 25:
                return (double) m2361m().compareTo(valeur.getString());
            case 26:
                int compareTo = m2348c().compareTo(((WDDateHeure) valeur).m2348c());
                if (compareTo != 0) {
                    return (double) compareTo;
                }
                try {
                    return (double) m2361m().compareTo(((WDDateHeure) valeur).m2361m());
                } catch (InvalidParameterException e22222222) {
                    throw e22222222;
                }
            default:
                throw new InvalidParameterException(f1519G[29]);
        }
    }

    /* renamed from: a */
    public long mo2496a() {
        return m2346b(null);
    }

    /* renamed from: a */
    public void m2342a(WDDate wDDate) {
        this.f1528z = wDDate.m2530q();
        this.f1522D = wDDate.m2529p();
        this.f1527y = wDDate.m2531r();
        this.f1520A = m2317d();
    }

    /* renamed from: a */
    public void m2343a(WDHeure wDHeure) {
        this.f1521C = wDHeure.m2473f();
        this.f1526x = wDHeure.m2484n();
        this.f1525w = wDHeure.m2477i();
        this.f1524F = wDHeure.m2488u();
        this.f1520A = m2317d();
    }

    /* renamed from: a */
    public final void m2344a(Calendar calendar) {
        this.f1528z = calendar.get(1);
        this.f1522D = calendar.get(2) + 1;
        this.f1527y = calendar.get(5);
        this.f1521C = calendar.get(11);
        this.f1526x = calendar.get(12);
        this.f1525w = calendar.get(13);
        this.f1524F = calendar.get(14);
        this.f1523E = null;
        this.f1520A = (byte) 0;
    }

    /* renamed from: a */
    public void m2345a(boolean z) throws WDException {
        try {
            if (m2322k() <= 0) {
                return;
            }
            if (z) {
                try {
                    switch (this.f1520A) {
                        case (byte) 1:
                            WDErreurManager.m2883a(C0745b.m3222b(f1519G[19], new String[0]));
                            return;
                        case (byte) 2:
                            WDErreurManager.m2883a(C0745b.m3222b(f1519G[18], new String[0]));
                            return;
                        case (byte) 3:
                            f.clear();
                            f.set(this.f1528z, this.f1522D - 1, 1);
                            WDErreurManager.m2883a(C0745b.m3222b(f1519G[17], String.valueOf(f.getActualMinimum(5)), String.valueOf(f.getActualMaximum(5))));
                            return;
                        case (byte) 4:
                            WDErreurManager.m2883a(C0745b.m3222b(f1519G[20], new String[0]));
                            return;
                        default:
                            return;
                    }
                } catch (WDException e) {
                    throw e;
                }
            }
            WDErreurManager.m2883a(C0745b.m3222b(f1519G[21], new String[0]));
        } catch (WDException e2) {
            throw e2;
        } catch (WDException e22) {
            throw e22;
        }
    }

    /* renamed from: b */
    public long m2346b(Calendar calendar) {
        Calendar calendar2 = calendar == null ? f : calendar;
        calendar2.clear();
        calendar2.set(this.f1528z, this.f1522D - 1, this.f1527y, this.f1521C, this.f1526x, this.f1525w);
        calendar2.set(14, this.f1524F);
        return calendar2.getTimeInMillis();
    }

    /* renamed from: b */
    public String m2347b(String str) {
        m2331z();
        TimeZone timeZone = TimeZone.getTimeZone(str);
        try {
            if (timeZone.getID().equals(f1519G[3])) {
                if (!str.equalsIgnoreCase(f1519G[3])) {
                    WDErreurManager.m2883a(C0745b.m3222b(f1519G[2], str));
                }
            }
            return C0725i.m3032a(new Date(hb.m3900a(f.getTimeInMillis(), timeZone)));
        } catch (InvalidParameterException e) {
            throw e;
        } catch (InvalidParameterException e2) {
            throw e2;
        }
    }

    /* renamed from: c */
    public String m2348c() {
        StringBuffer stringBuffer = new StringBuffer(8);
        stringBuffer.append(m2350e()).append(m2360l()).append(m2369r());
        return stringBuffer.toString();
    }

    /* renamed from: c */
    public String m2349c(String str) {
        m2331z();
        TimeZone timeZone = TimeZone.getTimeZone(str);
        try {
            if (timeZone.getID().equals(f1519G[3])) {
                if (!str.equalsIgnoreCase(f1519G[3])) {
                    WDErreurManager.m2883a(C0745b.m3222b(f1519G[2], str));
                }
            }
            return C0725i.m3032a(new Date(hb.m3913b(f.getTimeInMillis(), timeZone)));
        } catch (InvalidParameterException e) {
            throw e;
        } catch (InvalidParameterException e2) {
            throw e2;
        }
    }

    /* renamed from: e */
    public String m2350e() {
        return C0725i.m3024a(this.f1528z, 4);
    }

    /* renamed from: e */
    public void m2351e(int i) {
        this.f1527y = i;
        this.f1520A = (byte) 99;
    }

    /* renamed from: f */
    public Object m2352f() {
        try {
            return m2322k() > 0 ? "" : new StringBuffer(23).append(m2350e()).append("-").append(m2360l()).append("-").append(m2369r()).append("T").append(m2373t()).append(":").append(m2335C()).append(":").append(m2371s()).append(".").append(m2338F()).toString();
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    /* renamed from: g */
    public Object m2353g() {
        try {
            if (m2322k() > 0) {
                return "";
            }
            f.clear();
            f.set(this.f1528z, this.f1522D - 1, this.f1527y, this.f1521C, this.f1526x, this.f1525w);
            return new Timestamp(f.getTimeInMillis());
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public WDEntier4 getAnnee() {
        return new WDEntier4(m2334B());
    }

    public String getDate() {
        return m2348c();
    }

    public String getDateHeure() {
        return getString();
    }

    public String getHeure() {
        return m2361m();
    }

    public Object getJSONValue() {
        return C0725i.m3027a(this);
    }

    public WDEntier4 getJour() {
        return new WDEntier4(m2368q());
    }

    public WDEntier4 getMilliSeconde() {
        return new WDEntier4(this.f1524F);
    }

    public WDEntier4 getMinute() {
        return new WDEntier4(m2354h());
    }

    public WDEntier4 getMois() {
        return new WDEntier4(m2333A());
    }

    public String getNomType() {
        return C0745b.m3220a(f1519G[1], new String[0]);
    }

    public WDDate getPartieDate() {
        return new WDDate(m2348c());
    }

    public WDHeure getPartieHeure() {
        return new WDHeure(m2361m());
    }

    public WDEntier4 getSeconde() {
        return new WDEntier4(m2336D());
    }

    public String getString() {
        try {
            return this.f1523E != null ? this.f1523E : new StringBuffer(17).append(m2350e()).append(m2360l()).append(m2369r()).append(m2373t()).append(m2335C()).append(m2371s()).append(m2338F()).toString();
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public WDEntier4 getTHeure() {
        return new WDEntier4(m2374u());
    }

    public int getTypeVar() {
        return 26;
    }

    public String getTypeXMLPourSerialisation() {
        return f1519G[13];
    }

    public String getValeurXMLPourSerialisation() {
        return C0725i.m3027a(this);
    }

    /* renamed from: h */
    public final int m2354h() {
        return this.f1526x;
    }

    /* renamed from: i */
    public String m2355i() {
        try {
            if (this.f1528z < 1980) {
                WDErreurManager.m2883a(C0745b.m3222b(f1519G[26], new String[0]));
            }
            m2331z();
            return C0725i.m3032a(new Date(hb.m3912b(f.getTimeInMillis())));
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    /* renamed from: i */
    public void m2356i(int i) {
        this.f1522D = i;
        this.f1520A = (byte) 99;
    }

    public boolean isDateHeure() {
        return true;
    }

    public boolean isVarTemps() {
        return true;
    }

    /* renamed from: j */
    public int m2357j() {
        try {
            f.clear();
            f.set(this.f1528z, this.f1522D - 1, this.f1527y);
            switch (f.get(7)) {
                case 1:
                    return 7;
                case 2:
                    return 1;
                case 3:
                    return 2;
                case 4:
                    return 3;
                case 5:
                    return 4;
                case 6:
                    return 5;
                case 7:
                    return 6;
                default:
                    return 0;
            }
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    /* renamed from: j */
    public void m2358j(int i) {
        this.f1524F = i;
        this.f1520A = (byte) 99;
    }

    /* renamed from: k */
    public void m2359k(int i) {
        this.f1526x = i;
        this.f1520A = (byte) 99;
    }

    /* renamed from: l */
    public String m2360l() {
        return C0725i.m3024a(this.f1522D, 2);
    }

    /* renamed from: m */
    public String m2361m() {
        StringBuffer stringBuffer = new StringBuffer(9);
        stringBuffer.append(m2373t()).append(m2335C()).append(m2371s()).append(m2338F());
        return stringBuffer.toString();
    }

    /* renamed from: m */
    public void m2362m(int i) {
        if (i < 0) {
            try {
                m2326t(Math.abs(i));
                return;
            } catch (InvalidParameterException e) {
                throw e;
            }
        }
        m2345a(false);
        int i2 = this.f1521C + i;
        if (i2 > 23) {
            try {
                m2331z();
                f.add(11, i);
                m2328v();
                return;
            } catch (InvalidParameterException e2) {
                throw e2;
            }
        }
        m2366o(i2);
    }

    /* renamed from: n */
    public int m2363n() {
        f.clear();
        f.set(this.f1528z, this.f1522D - 1, this.f1527y);
        return f.get(3);
    }

    /* renamed from: n */
    public void m2364n(int i) {
        this.f1528z = i;
        this.f1520A = (byte) 99;
    }

    /* renamed from: o */
    public int m2365o() {
        try {
            if (m2322k() > 0) {
                WDErreurManager.m2883a(C0745b.m3222b(f1519G[14], new String[0]));
            }
            return C0725i.m3012a(this.f1528z, this.f1522D, this.f1527y);
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    /* renamed from: o */
    public void m2366o(int i) {
        if (i < 0 || i > 23) {
            try {
                WDErreurManager.m2883a(C0745b.m3222b(f1519G[5], "" + i, C0745b.m3219a(f1519G[8])) + "\n" + C0745b.m3222b(f1519G[6], C0745b.m3219a(f1519G[8]), "0", f1519G[9]));
                return;
            } catch (InvalidParameterException e) {
                throw e;
            }
        }
        try {
            if (m2322k() > 0) {
                m2314a(this.f1528z, this.f1522D, this.f1527y, i, this.f1526x, this.f1525w, this.f1524F);
                return;
            }
            this.f1521C = i;
        } catch (InvalidParameterException e2) {
            throw e2;
        }
    }

    public void opDecProp(EWDPropriete eWDPropriete, WDObjet wDObjet) {
        if (wDObjet != null) {
            try {
                int i = wDObjet.getInt();
            } catch (InvalidParameterException e) {
                throw e;
            }
        }
        i = 1;
        try {
            switch (C0787l.f2025a[eWDPropriete.ordinal()]) {
                case 1:
                    m2315b(i);
                    return;
                case 2:
                    m2327u(i);
                    return;
                case 3:
                    m2325q(i);
                    return;
                case 4:
                    m2326t(i);
                    return;
                case 5:
                    m2318d(i);
                    return;
                case 6:
                    m2324p(i);
                    return;
                case 7:
                    m2316c(i);
                    return;
                default:
                    super.opDecProp(eWDPropriete, wDObjet);
                    return;
            }
        } catch (InvalidParameterException e2) {
            throw e2;
        }
        throw e2;
    }

    public void opIncProp(EWDPropriete eWDPropriete, WDObjet wDObjet) {
        if (wDObjet != null) {
            try {
                int i = wDObjet.getInt();
            } catch (InvalidParameterException e) {
                throw e;
            }
        }
        i = 1;
        try {
            switch (C0787l.f2025a[eWDPropriete.ordinal()]) {
                case 1:
                    m2323l(i);
                    return;
                case 2:
                    m2321h(i);
                    return;
                case 3:
                    m2375v(i);
                    return;
                case 4:
                    m2362m(i);
                    return;
                case 5:
                    m2319f(i);
                    return;
                case 6:
                    m2320g(i);
                    return;
                case 7:
                    m2313a(i);
                    return;
                default:
                    super.opIncProp(eWDPropriete, wDObjet);
                    return;
            }
        } catch (InvalidParameterException e2) {
            throw e2;
        }
        throw e2;
    }

    public cb opMoins(WDObjet wDObjet) {
        WDObjet valeur = wDObjet.getValeur();
        switch (valeur.getTypeVar()) {
            case 26:
                return new WDDuree(m2339G() - ((WDDateHeure) valeur).m2339G());
            case 27:
                try {
                    WDDateHeure wDDateHeure = (WDDateHeure) clone();
                    int i = ((WDDuree) valeur).getInt();
                    if (i > 0) {
                        wDDateHeure.m2316c(i);
                        return wDDateHeure;
                    } else if (i >= 0) {
                        return wDDateHeure;
                    } else {
                        wDDateHeure.m2313a(Math.abs(i));
                        return wDDateHeure;
                    }
                } catch (CloneNotSupportedException e) {
                    throw e;
                } catch (CloneNotSupportedException e2) {
                    throw e2;
                } catch (CloneNotSupportedException e3) {
                    return this;
                }
            default:
                WDErreurManager.m2883a(C0745b.m3222b(f1519G[0], "-", C0745b.m3220a(f1519G[1], new String[0]), valeur.getNomType()));
                return null;
        }
    }

    public cb opPlus(WDObjet wDObjet) {
        WDObjet valeur = wDObjet.getValeur();
        WDDuree wDDuree = (WDDuree) valeur.checkType(WDDuree.class);
        if (wDDuree == null) {
            return new WDChaine(getString() + valeur.getString());
        }
        try {
            WDDateHeure wDDateHeure = (WDDateHeure) clone();
            wDDateHeure.m2375v(wDDuree.m2408h());
            wDDateHeure.m2362m(wDDuree.m2404e());
            wDDateHeure.m2319f(wDDuree.m2409i());
            wDDateHeure.m2320g(wDDuree.m2402c());
            wDDateHeure.m2313a(wDDuree.m2406g());
            return wDDateHeure;
        } catch (CloneNotSupportedException e) {
            return this;
        }
    }

    public cb opPlus(String str) {
        return new WDChaine(getString() + str);
    }

    /* renamed from: p */
    public boolean m2367p() {
        try {
            return m2322k() == 0;
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    /* renamed from: q */
    public final int m2368q() {
        return this.f1527y;
    }

    /* renamed from: r */
    public String m2369r() {
        return C0725i.m3024a(this.f1527y, 2);
    }

    /* renamed from: r */
    public void m2370r(int i) {
        this.f1525w = i;
        this.f1520A = (byte) 99;
    }

    public void razVariable() {
        m2329w();
    }

    public void release() {
        this.f1523E = null;
    }

    /* renamed from: s */
    public String m2371s() {
        return C0725i.m3024a(this.f1525w, 2);
    }

    /* renamed from: s */
    public void m2372s(int i) {
        this.f1521C = i;
        this.f1520A = (byte) 99;
    }

    public void setAnnee(int i) {
        if (i < 1 || i > 9999) {
            try {
                WDErreurManager.m2883a(C0745b.m3222b(f1519G[5], "" + i, C0745b.m3219a(f1519G[25])) + "\n" + C0745b.m3222b(f1519G[6], C0745b.m3219a(f1519G[25]), "1", f1519G[24]));
                return;
            } catch (InvalidParameterException e) {
                throw e;
            }
        }
        try {
            if (m2322k() > 0) {
                m2314a(i, this.f1522D, this.f1527y, this.f1521C, this.f1526x, this.f1525w, this.f1524F);
                return;
            }
            try {
                if (this.f1522D == 2) {
                    if (this.f1527y == 29) {
                        m2314a(i, this.f1522D, this.f1527y, this.f1521C, this.f1526x, this.f1525w, this.f1524F);
                        return;
                    }
                }
                this.f1528z = i;
            } catch (InvalidParameterException e2) {
                throw e2;
            } catch (InvalidParameterException e22) {
                throw e22;
            }
        } catch (InvalidParameterException e222) {
            throw e222;
        }
    }

    public void setJSONValue(String str) {
        C0725i.m3018a(str, this);
    }

    public void setJour(int i) {
        if (i < 1 || i > 31) {
            try {
                WDErreurManager.m2883a(C0745b.m3222b(f1519G[5], "" + i, C0745b.m3219a(f1519G[15])) + "\n" + C0745b.m3222b(f1519G[6], C0745b.m3219a(f1519G[15]), "1", f1519G[16]));
                return;
            } catch (InvalidParameterException e) {
                throw e;
            }
        }
        try {
            if (m2322k() > 0) {
                m2314a(this.f1528z, this.f1522D, i, this.f1521C, this.f1526x, this.f1525w, this.f1524F);
            } else if (i > 28) {
                try {
                    m2314a(this.f1528z, this.f1522D, i, this.f1521C, this.f1526x, this.f1525w, this.f1524F);
                } catch (InvalidParameterException e2) {
                    throw e2;
                }
            } else {
                this.f1527y = i;
            }
        } catch (InvalidParameterException e22) {
            throw e22;
        }
    }

    public void setMilliSeconde(int i) {
        if (i < 0 || i > C0607n.Qv) {
            try {
                WDErreurManager.m2883a(C0745b.m3222b(f1519G[5], "" + i, C0745b.m3219a(f1519G[22])) + "\n" + C0745b.m3222b(f1519G[6], C0745b.m3219a(f1519G[22]), "0", f1519G[23]));
                return;
            } catch (InvalidParameterException e) {
                throw e;
            }
        }
        try {
            if (m2322k() > 0) {
                m2314a(this.f1528z, this.f1522D, this.f1527y, this.f1521C, this.f1526x, this.f1525w, i);
            } else {
                this.f1524F = i;
            }
        } catch (InvalidParameterException e2) {
            throw e2;
        }
    }

    public void setMinute(int i) {
        if (i < 0 || i > 59) {
            try {
                WDErreurManager.m2883a(C0745b.m3222b(f1519G[5], "" + i, C0745b.m3219a(f1519G[7])) + "\n" + C0745b.m3222b(f1519G[6], C0745b.m3219a(f1519G[7]), "0", f1519G[4]));
                return;
            } catch (InvalidParameterException e) {
                throw e;
            }
        }
        try {
            if (m2322k() > 0) {
                m2314a(this.f1528z, this.f1522D, this.f1527y, this.f1521C, i, this.f1525w, this.f1524F);
                return;
            }
            this.f1526x = i;
        } catch (InvalidParameterException e2) {
            throw e2;
        }
    }

    public void setMois(int i) {
        if (i < 1 || i > 12) {
            try {
                WDErreurManager.m2883a(C0745b.m3222b(f1519G[5], "" + i, C0745b.m3219a(f1519G[27])) + "\n" + C0745b.m3222b(f1519G[6], C0745b.m3219a(f1519G[27]), "1", f1519G[28]));
                return;
            } catch (InvalidParameterException e) {
                throw e;
            }
        }
        try {
            if (m2322k() > 0) {
                m2314a(this.f1528z, i, this.f1527y, this.f1521C, this.f1526x, this.f1525w, this.f1524F);
                return;
            }
            try {
                if (this.f1527y > 28) {
                    m2314a(this.f1528z, i, this.f1527y, this.f1521C, this.f1526x, this.f1525w, this.f1524F);
                    return;
                }
                this.f1522D = i;
            } catch (InvalidParameterException e2) {
                throw e2;
            }
        } catch (InvalidParameterException e22) {
            throw e22;
        }
    }

    public void setPartieDate(WDObjet wDObjet) {
        m2342a(wDObjet.isDate() ? (WDDate) wDObjet : new WDDate(wDObjet));
    }

    public void setPartieHeure(WDObjet wDObjet) {
        m2343a(wDObjet.isHeure() ? (WDHeure) wDObjet : new WDHeure(wDObjet));
    }

    public void setSeconde(int i) {
        if (i < 0 || i > 59) {
            try {
                WDErreurManager.m2883a(C0745b.m3222b(f1519G[5], "" + i, C0745b.m3219a(f1519G[10])) + "\n" + C0745b.m3222b(f1519G[6], C0745b.m3219a(f1519G[10]), "0", f1519G[4]));
                return;
            } catch (InvalidParameterException e) {
                throw e;
            }
        }
        try {
            if (m2322k() > 0) {
                m2314a(this.f1528z, this.f1522D, this.f1527y, this.f1521C, this.f1526x, i, this.f1524F);
                return;
            }
            this.f1525w = i;
        } catch (InvalidParameterException e2) {
            throw e2;
        }
    }

    public void setTHeure(int i) {
        m2366o(i);
    }

    public void setValeur(WDObjet wDObjet) {
        setValeur(wDObjet.getValeur().getDateHeure());
    }

    public void setValeur(String str) {
        String replaceAll = str.replaceAll(f1519G[11], "0");
        try {
            this.f1523E = replaceAll.substring(0, Math.min(17, replaceAll.length()));
            switch (replaceAll.length()) {
                case 0:
                case 1:
                case 2:
                case 3:
                    this.f1528z = 0;
                    this.f1522D = 0;
                    this.f1527y = 0;
                    this.f1521C = 0;
                    this.f1526x = 0;
                    this.f1525w = 0;
                    this.f1524F = 0;
                    break;
                case 4:
                case 5:
                    this.f1528z = C0725i.m3064d(replaceAll.substring(0, 4));
                    this.f1522D = 0;
                    this.f1527y = 0;
                    this.f1521C = 0;
                    this.f1526x = 0;
                    this.f1525w = 0;
                    this.f1524F = 0;
                    break;
                case 6:
                case 7:
                    this.f1528z = C0725i.m3064d(replaceAll.substring(0, 4));
                    this.f1522D = C0725i.m3064d(replaceAll.substring(4, 6));
                    this.f1527y = 0;
                    this.f1521C = 0;
                    this.f1526x = 0;
                    this.f1525w = 0;
                    this.f1524F = 0;
                    break;
                case 8:
                    this.f1528z = C0725i.m3064d(replaceAll.substring(0, 4));
                    this.f1522D = C0725i.m3064d(replaceAll.substring(4, 6));
                    this.f1527y = C0725i.m3064d(replaceAll.substring(6, 8));
                    this.f1521C = 0;
                    this.f1526x = 0;
                    this.f1525w = 0;
                    this.f1524F = 0;
                    break;
                case 9:
                    this.f1528z = C0725i.m3064d(replaceAll.substring(0, 4));
                    this.f1522D = C0725i.m3064d(replaceAll.substring(4, 6));
                    this.f1527y = C0725i.m3064d(replaceAll.substring(6, 8));
                    this.f1521C = C0725i.m3064d(replaceAll.substring(8, 9) + "0");
                    this.f1526x = 0;
                    this.f1525w = 0;
                    this.f1524F = 0;
                    break;
                case 10:
                    this.f1528z = C0725i.m3064d(replaceAll.substring(0, 4));
                    this.f1522D = C0725i.m3064d(replaceAll.substring(4, 6));
                    this.f1527y = C0725i.m3064d(replaceAll.substring(6, 8));
                    this.f1521C = C0725i.m3064d(replaceAll.substring(8, 10));
                    this.f1526x = 0;
                    this.f1525w = 0;
                    this.f1524F = 0;
                    break;
                case 11:
                    this.f1528z = C0725i.m3064d(replaceAll.substring(0, 4));
                    this.f1522D = C0725i.m3064d(replaceAll.substring(4, 6));
                    this.f1527y = C0725i.m3064d(replaceAll.substring(6, 8));
                    this.f1521C = C0725i.m3064d(replaceAll.substring(8, 10));
                    this.f1526x = C0725i.m3064d(replaceAll.substring(10, 11) + "0");
                    this.f1525w = 0;
                    this.f1524F = 0;
                    break;
                case 12:
                    this.f1528z = C0725i.m3064d(replaceAll.substring(0, 4));
                    this.f1522D = C0725i.m3064d(replaceAll.substring(4, 6));
                    this.f1527y = C0725i.m3064d(replaceAll.substring(6, 8));
                    this.f1521C = C0725i.m3064d(replaceAll.substring(8, 10));
                    this.f1526x = C0725i.m3064d(replaceAll.substring(10, 12));
                    this.f1525w = 0;
                    this.f1524F = 0;
                    break;
                case 13:
                    this.f1528z = C0725i.m3064d(replaceAll.substring(0, 4));
                    this.f1522D = C0725i.m3064d(replaceAll.substring(4, 6));
                    this.f1527y = C0725i.m3064d(replaceAll.substring(6, 8));
                    this.f1521C = C0725i.m3064d(replaceAll.substring(8, 10));
                    this.f1526x = C0725i.m3064d(replaceAll.substring(10, 12));
                    this.f1525w = C0725i.m3064d(replaceAll.substring(12, 13) + "0");
                    this.f1524F = 0;
                    break;
                case 14:
                    this.f1528z = C0725i.m3064d(replaceAll.substring(0, 4));
                    this.f1522D = C0725i.m3064d(replaceAll.substring(4, 6));
                    this.f1527y = C0725i.m3064d(replaceAll.substring(6, 8));
                    this.f1521C = C0725i.m3064d(replaceAll.substring(8, 10));
                    this.f1526x = C0725i.m3064d(replaceAll.substring(10, 12));
                    this.f1525w = C0725i.m3064d(replaceAll.substring(12, 14));
                    this.f1524F = 0;
                    break;
                case 15:
                    this.f1528z = C0725i.m3064d(replaceAll.substring(0, 4));
                    this.f1522D = C0725i.m3064d(replaceAll.substring(4, 6));
                    this.f1527y = C0725i.m3064d(replaceAll.substring(6, 8));
                    this.f1521C = C0725i.m3064d(replaceAll.substring(8, 10));
                    this.f1526x = C0725i.m3064d(replaceAll.substring(10, 12));
                    this.f1525w = C0725i.m3064d(replaceAll.substring(12, 14));
                    this.f1524F = C0725i.m3064d(replaceAll.substring(14, 15) + f1519G[12]);
                    break;
                case 16:
                    this.f1528z = C0725i.m3064d(replaceAll.substring(0, 4));
                    this.f1522D = C0725i.m3064d(replaceAll.substring(4, 6));
                    this.f1527y = C0725i.m3064d(replaceAll.substring(6, 8));
                    this.f1521C = C0725i.m3064d(replaceAll.substring(8, 10));
                    this.f1526x = C0725i.m3064d(replaceAll.substring(10, 12));
                    this.f1525w = C0725i.m3064d(replaceAll.substring(12, 14));
                    this.f1524F = C0725i.m3064d(replaceAll.substring(14, 16) + "0");
                    break;
                default:
                    this.f1528z = C0725i.m3064d(replaceAll.substring(0, 4));
                    this.f1522D = C0725i.m3064d(replaceAll.substring(4, 6));
                    this.f1527y = C0725i.m3064d(replaceAll.substring(6, 8));
                    this.f1521C = C0725i.m3064d(replaceAll.substring(8, 10));
                    this.f1526x = C0725i.m3064d(replaceAll.substring(10, 12));
                    this.f1525w = C0725i.m3064d(replaceAll.substring(12, 14));
                    this.f1524F = C0725i.m3064d(replaceAll.substring(14, 17));
                    break;
            }
            try {
                this.f1520A = m2317d();
                if (this.f1520A == (byte) 0) {
                    return;
                }
                if (this.f1523E.length() < 17) {
                    this.f1523E = C0808l.m4017a(this.f1523E, 17, "0");
                }
            } catch (InvalidParameterException e) {
                throw e;
            } catch (InvalidParameterException e2) {
                throw e2;
            }
        } catch (InvalidParameterException e22) {
            throw e22;
        }
    }

    public void setValeurXMLDeserialisation(String str) {
        C0725i.m3018a(str, this);
    }

    /* renamed from: t */
    public String m2373t() {
        return C0725i.m3024a(this.f1521C, 2);
    }

    /* renamed from: u */
    public final int m2374u() {
        return this.f1521C;
    }

    /* renamed from: v */
    public void m2375v(int i) {
        if (i < 0) {
            try {
                m2325q(Math.abs(i));
                return;
            } catch (InvalidParameterException e) {
                throw e;
            }
        }
        m2345a(false);
        int i2 = this.f1527y + i;
        if (i2 > 28) {
            try {
                m2331z();
                f.add(6, i);
                m2328v();
                return;
            } catch (InvalidParameterException e2) {
                throw e2;
            }
        }
        setJour(i2);
    }

    /* renamed from: x */
    public String m2376x() {
        return hb.m3934g(this.f1522D);
    }

    /* renamed from: y */
    public String m2377y() {
        f.clear();
        f.set(this.f1528z, this.f1522D - 1, this.f1527y);
        return hb.m3922c(hb.m3936i(f.get(7)));
    }
}
