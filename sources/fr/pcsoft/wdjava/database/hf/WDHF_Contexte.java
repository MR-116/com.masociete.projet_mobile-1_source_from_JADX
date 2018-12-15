package fr.pcsoft.wdjava.database.hf;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.context.WDAppelContexte;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.erreur.WDException;
import fr.pcsoft.wdjava.core.types.database.C0775c;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.database.hf.p049c.C0832f;
import fr.pcsoft.wdjava.database.hf.p049c.C0841b;
import fr.pcsoft.wdjava.database.hf.p051b.C0836a;
import fr.pcsoft.wdjava.database.hf.p051b.C0837b;
import fr.pcsoft.wdjava.database.hf.p051b.C0838c;
import fr.pcsoft.wdjava.database.hf.p051b.C0839d;
import fr.pcsoft.wdjava.database.hf.requete.C0778b;
import fr.pcsoft.wdjava.database.hf.requete.parsing.C0537e;
import fr.pcsoft.wdjava.jni.WDJNIException;
import fr.pcsoft.wdjava.p032m.C0933a;
import fr.pcsoft.wdjava.p032m.C0938m;
import fr.pcsoft.wdjava.task.C1027j;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class WDHF_Contexte implements bb, Cloneable {
    /* renamed from: j */
    private static WDHF_Contexte f2214j = null;
    /* renamed from: l */
    private static final LinkedList<WDHF_Contexte> f2215l = new LinkedList();
    /* renamed from: z */
    private static final String[] f2216z = new String[]{m4984z(m4985z("9\u0000n(l\u0003\u0016pm?\u0018\tn\">\u00190")), m4984z(m4985z("(\u000bl(9\u001fYz(l\u000e\u0015q#-\n\u001c>)k\u0018\u0017{m/\u0002\u0017j(4\u0019\u001c>\u0005\nC")), m4984z(m4985z("!^#-\u0001\u0000m(l\fYz¤&Y÷9¥M\u001av,>\n{c")), m4984z(m4985z("(\u000bl(9\u001fYz8>\f\u0017jm \fYz¤/\u0002\u0017p(4\u0004\u0016pc")), m4984z(m4985z("$\u0014n\"?\u001e\u0010|!)M\u001d{m \u0004\u001b÷?)\u001fYr(l\u000e\u0016p9)\u0015\r{m\u001e=50")), m4984z(m4985z("\u001f\u001cr(-\u001e\u001cL\u001d\u0000.\u0016p9)\u0015\r")), m4984z(m4985z("\u000b\u000b0=/\u001e\u0016x9b\u001a\u001dt,:\fWz,8\f\u001b>)C\u0011xc>\u001d\u00150\u001a\b?)R")), m4984z(m4985z("gs")), m4984z(m4985z("<\f{m?J\u001cm9a\u0004\u0015>=-\u001e\n÷ms")), m4984z(m4985z(":=,~|'\u0018h,b\u0007\u0018l")), m4984z(m4985z(",\tn( M.RmvMsX\"\"\u000e\rw\"\"ME;|r")), m4984z(m4985z("(\u000bl(9\u001fYz8l\u000b\u000b )\u001a\u0016l&l:=T,:\f")), m4984z(m4985z(".\u0016z(l\b\u000bl(9\u001fY$mi\\")), m4984z(m4985z(")\fs=l\t\u001c>!k\b\u000bl(9\u001fYz8l\u0000\u0016z8 \bY\"h}SW")), m4984z(m4985z("@Y")), m4984z(m4985z(",\u001aj$#\u0003Yp\"\"M\u001e÷?¥\bYn,>M\u0015{m/\u0002\u0017j(4\u0019\u001c>\u0005\nC"))};
    /* renamed from: a */
    private boolean f2217a = false;
    /* renamed from: b */
    private db f2218b = null;
    /* renamed from: c */
    private C0832f f2219c = null;
    /* renamed from: d */
    private boolean f2220d = false;
    /* renamed from: e */
    private boolean f2221e = false;
    /* renamed from: f */
    private int f2222f = 0;
    /* renamed from: g */
    private String f2223g = "";
    /* renamed from: h */
    private HashMap f2224h = new HashMap();
    /* renamed from: i */
    private C0860m f2225i;
    /* renamed from: k */
    private long f2226k = -1;
    /* renamed from: m */
    private int f2227m = 0;
    /* renamed from: n */
    private db f2228n = null;
    /* renamed from: o */
    private LinkedList<C0875w> f2229o = null;
    /* renamed from: p */
    private LinkedHashMap f2230p = new LinkedHashMap();
    /* renamed from: q */
    private int f2231q = 0;
    /* renamed from: r */
    private String f2232r = "";
    /* renamed from: s */
    private HashMap f2233s = new HashMap();

    private WDHF_Contexte() {
        m4981b(this);
    }

    /* renamed from: a */
    private WDHF_Contexte m4979a(boolean z) {
        double d = 10.0d;
        WDHF_Contexte wDHF_Contexte = (WDHF_Contexte) super.clone();
        try {
            String obj;
            if (this.f2219c != null) {
                try {
                    wDHF_Contexte.f2219c = this.f2219c.mo2864b(z);
                } catch (Exception e) {
                    WDErreurManager.m2882a(e);
                } catch (WDJNIException e2) {
                    WDHF_Manager.m5075a(e2, this.f2219c);
                }
            }
            wDHF_Contexte.f2230p = new LinkedHashMap((int) (this.f2230p != null ? ((double) this.f2230p.size()) / 0.75d : 10.0d), 0.75f);
            if (this.f2230p != null) {
                for (Object obj2 : this.f2230p.keySet()) {
                    obj = obj2.toString();
                    wDHF_Contexte.f2230p.put(obj, ((WDHF_Connexion) this.f2230p.get(obj)).m4942a(this.f2219c));
                }
            }
            if (this.f2224h != null) {
                d = ((double) this.f2224h.size()) / 0.75d;
            }
            wDHF_Contexte.f2224h = new HashMap((int) d, 0.75f);
            if (this.f2224h != null) {
                for (Object obj22 : this.f2224h.keySet()) {
                    obj = obj22.toString();
                    db dbVar = (db) this.f2224h.get(obj);
                    Object obj3 = dbVar.Zd != null ? 1 : null;
                    if (obj3 == null || !z) {
                        db dbVar2 = (db) dbVar.mo2746f(z);
                        if (obj3 != null) {
                            dbVar2.Zd = wDHF_Contexte.m5015e(dbVar.Zd.mo2719a());
                        }
                        wDHF_Contexte.f2224h.put(obj, dbVar2);
                    }
                }
            }
            if (z) {
                if (wDHF_Contexte.f2233s != null) {
                    wDHF_Contexte.f2233s = new HashMap((int) (((double) this.f2233s.size()) / 0.75d), 0.75f);
                }
                wDHF_Contexte.f2222f = 0;
                wDHF_Contexte.f2221e = false;
                wDHF_Contexte.f2225i = null;
                wDHF_Contexte.f2220d = false;
                wDHF_Contexte.f2218b = null;
                wDHF_Contexte.f2228n = null;
                wDHF_Contexte.f2231q = 0;
            } else {
                wDHF_Contexte.f2233s = new HashMap((int) (((double) this.f2233s.size()) / 0.75d), 0.75f);
                for (Object obj222 : this.f2233s.keySet()) {
                    String obj4 = obj222.toString();
                    wDHF_Contexte.f2233s.put(obj4, ((db) this.f2233s.get(obj4)).mo2746f(z));
                }
                if (this.f2225i != null) {
                    wDHF_Contexte.f2225i = this.f2225i.m6075g();
                }
                if (this.f2228n != null) {
                    wDHF_Contexte.f2228n = wDHF_Contexte.m5015e(this.f2228n.mo2719a());
                }
                if (this.f2218b != null) {
                    if (this.f2218b == this.f2228n) {
                        wDHF_Contexte.f2218b = wDHF_Contexte.f2228n;
                    } else {
                        wDHF_Contexte.f2218b = wDHF_Contexte.m5015e(this.f2228n.mo2719a());
                    }
                }
            }
            wDHF_Contexte.f2226k = -1;
            if (this.f2229o == null) {
                return wDHF_Contexte;
            }
            wDHF_Contexte.f2229o = (LinkedList) this.f2229o.clone();
            return wDHF_Contexte;
        } catch (C0841b e3) {
            throw e3;
        } catch (C0841b e32) {
            throw e32;
        } catch (C0841b e322) {
            throw e322;
        } catch (C0841b e3222) {
            throw e3222;
        } catch (C0841b e32222) {
            throw e32222;
        } catch (C0841b e322222) {
            throw e322222;
        } catch (C0841b e3222222) {
            throw e3222222;
        } catch (C0841b e32222222) {
            throw e32222222;
        } catch (C0841b e322222222) {
            throw e322222222;
        } catch (C0841b e3222222222) {
            throw e3222222222;
        } catch (WDException e4) {
            throw e4;
        } catch (Exception e5) {
            C0691a.m2863b(f2216z[1], e5);
            return this;
        }
    }

    /* renamed from: b */
    public static final WDHF_Contexte m4980b(long j) {
        Iterator it = f2215l.iterator();
        while (it.hasNext()) {
            WDHF_Contexte wDHF_Contexte = (WDHF_Contexte) it.next();
            try {
                if (wDHF_Contexte.m5022i() == j) {
                    return wDHF_Contexte;
                }
            } catch (WDException e) {
                throw e;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static final void m4981b(WDHF_Contexte wDHF_Contexte) {
        f2215l.add(wDHF_Contexte);
    }

    public static WDHF_Contexte creerContexteHF(boolean z) {
        Thread currentThread = Thread.currentThread();
        try {
            C0933a c0933a = currentThread instanceof C0933a ? (C0933a) currentThread : null;
            WDHF_Contexte wDHF_Contexte = null;
            for (C0933a c0933a2 = c0933a; c0933a2 != null && wDHF_Contexte == null; c0933a2 = c0933a2.m6795c()) {
                wDHF_Contexte = (WDHF_Contexte) c0933a2.m6796d();
            }
            if (wDHF_Contexte != null) {
                return wDHF_Contexte.m4979a(z);
            }
            try {
                if (f2214j == null) {
                    m4982g();
                }
                return f2214j.m4979a(z);
            } catch (WDException e) {
                throw e;
            }
        } catch (WDException e2) {
            throw e2;
        }
    }

    /* renamed from: g */
    private static final WDHF_Contexte m4982g() {
        f2214j = new WDHF_Contexte();
        WDHF_Manager.m5190d(f2214j);
        WDAppelContexte.m2681b().m2786a(f2214j);
        return f2214j;
    }

    public static WDHF_Contexte getInstance() {
        return getInstance(true);
    }

    public static WDHF_Contexte getInstance(boolean z) {
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof C0933a) {
            C0933a c0933a = (C0933a) currentThread;
            WDHF_Contexte wDHF_Contexte = (WDHF_Contexte) c0933a.m6796d();
            if (wDHF_Contexte != null || !z) {
                return wDHF_Contexte;
            }
            try {
                bb creerContexteHF = creerContexteHF(c0933a.m6797e() != null);
                if (creerContexteHF == null) {
                    return creerContexteHF;
                }
                try {
                    c0933a.m6791a(creerContexteHF);
                    return creerContexteHF;
                } catch (WDException e) {
                    throw e;
                }
            } catch (WDException e2) {
                throw e2;
            }
        }
        C1027j d = C0938m.m6817d();
        if (d != null) {
            try {
                return (WDHF_Contexte) d.m7398a();
            } catch (WDException e22) {
                throw e22;
            }
        }
        try {
            if (f2214j == null && z) {
                m4982g();
            }
            return f2214j;
        } catch (WDException e222) {
            throw e222;
        } catch (WDException e2222) {
            throw e2222;
        }
    }

    /* renamed from: u */
    private void m4983u() {
        m4997a(this);
        for (WDHF_Connexion wDHF_Connexion : this.f2230p.values()) {
            try {
                if (wDHF_Connexion.m4962j()) {
                    wDHF_Connexion.release();
                }
            } catch (WDException e) {
                throw e;
            } catch (Exception e2) {
                C0691a.m2857a(f2216z[3], e2);
            }
        }
        this.f2230p.clear();
        this.f2230p = null;
        if (this.f2224h != null) {
            for (db dbVar : this.f2224h.values()) {
                if (dbVar != null) {
                    try {
                        dbVar.release();
                    } catch (WDException e3) {
                        throw e3;
                    }
                }
            }
            this.f2224h.clear();
            this.f2224h = null;
        }
        if (this.f2233s != null) {
            for (C0778b c0778b : this.f2233s.values()) {
                if (c0778b != null) {
                    try {
                        c0778b.release();
                    } catch (WDException e32) {
                        throw e32;
                    }
                }
            }
            this.f2233s.clear();
            this.f2233s = null;
        }
        if (this.f2226k > 0) {
            try {
                Class.forName(f2216z[6]).getMethod(f2216z[5], new Class[]{Long.TYPE}).invoke(null, new Object[]{Long.valueOf(this.f2226k)});
            } catch (Exception e22) {
                C0691a.m2857a(f2216z[4], e22);
            }
            this.f2226k = -1;
        }
        try {
            if (this.f2219c != null) {
                try {
                    this.f2219c.mo3041s();
                    this.f2219c = null;
                } catch (Exception e222) {
                    WDErreurManager.m2882a(e222);
                } catch (WDJNIException e4) {
                    WDHF_Manager.m5075a(e4, this.f2219c);
                }
            }
            try {
                if (this.f2225i != null) {
                    this.f2225i.m6071c();
                    this.f2225i = null;
                }
                try {
                    this.f2223g = null;
                    this.f2218b = null;
                    this.f2228n = null;
                    this.f2232r = null;
                    if (this.f2229o != null) {
                        this.f2229o.clear();
                        this.f2229o = null;
                    }
                } catch (WDException e322) {
                    throw e322;
                }
            } catch (WDException e3222) {
                throw e3222;
            }
        } catch (WDException e32222) {
            throw e32222;
        }
    }

    /* renamed from: z */
    private static String m4984z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 109;
                    break;
                case 1:
                    i2 = 121;
                    break;
                case 2:
                    i2 = 30;
                    break;
                case 3:
                    i2 = 77;
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
    private static char[] m4985z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 76);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public C0775c mo3079a(String str, C0873u c0873u) {
        try {
            switch (gb.f2266a[c0873u.ordinal()]) {
                case 1:
                    return m5019g(str);
                case 2:
                    return m4991a(str, true);
                case 3:
                    return m5017f(str);
                case 4:
                    db s = m5039s();
                    if (s == null) {
                        return null;
                    }
                    try {
                        return s.m3714i(str);
                    } catch (WDException e) {
                        throw e;
                    }
                default:
                    C0691a.m2856a(f2216z[0]);
                    return null;
            }
        } catch (WDException e2) {
            throw e2;
        }
        throw e2;
    }

    /* renamed from: a */
    public C0836a mo3080a(String str) {
        if (str != null) {
            try {
                if (!str.equals("")) {
                    C0836a c0837b;
                    String[] split = str.split(C0607n.Gc);
                    switch (split.length) {
                        case 0:
                        case 1:
                            c0837b = new C0837b(str);
                            break;
                        case 2:
                            c0837b = new C0838c(split[0], split[1]);
                            break;
                        default:
                            c0837b = new C0839d(split[0], split[1], split[2]);
                            break;
                    }
                    if (c0837b == null) {
                        return c0837b;
                    }
                    try {
                        c0837b.m5403e(str);
                        return c0837b;
                    } catch (WDException e) {
                        throw e;
                    }
                }
            } catch (WDException e2) {
                throw e2;
            }
        }
        return null;
    }

    /* renamed from: a */
    public C0836a mo3081a(String str, String str2) {
        return new C0837b(str, str2);
    }

    /* renamed from: a */
    public C0836a mo3082a(String str, String str2, String str3, String str4, String str5) {
        return new C0838c(str, str2, str3, str4, str5);
    }

    /* renamed from: a */
    public C0836a mo3083a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        return new C0839d(str, str2, str3, str4, str5, str6, str7, str8);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final fr.pcsoft.wdjava.database.hf.db m4991a(java.lang.String r5, boolean r6) {
        /*
        r4 = this;
        r0 = "";
        r0 = r5.equals(r0);
        if (r0 == 0) goto L_0x0015;
    L_0x0008:
        r0 = r4.m5026k();
    L_0x000c:
        if (r6 == 0) goto L_0x0014;
    L_0x000e:
        if (r0 == 0) goto L_0x0014;
    L_0x0010:
        r1 = 0;
        r4.m4999a(r0, r1);	 Catch:{ WDException -> 0x0057 }
    L_0x0014:
        return r0;
    L_0x0015:
        r0 = r5.toLowerCase();
        r0 = fr.pcsoft.wdjava.core.utils.C0808l.m4057o(r0);
        r1 = r4.m5034o(r0);
        if (r1 != 0) goto L_0x0053;
    L_0x0023:
        r0 = r5.length();	 Catch:{ WDException -> 0x0055 }
        r2 = 2;
        if (r0 > r2) goto L_0x004b;
    L_0x002a:
        r0 = r4.f2224h;
        r0 = r0.values();
        r2 = r0.iterator();
    L_0x0034:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x004b;
    L_0x003a:
        r0 = r2.next();
        r0 = (fr.pcsoft.wdjava.database.hf.db) r0;
        r3 = r0.m3710h();
        r3 = r3.equalsIgnoreCase(r5);
        if (r3 == 0) goto L_0x0034;
    L_0x004a:
        r1 = r0;
    L_0x004b:
        if (r1 != 0) goto L_0x0053;
    L_0x004d:
        r0 = r4.m5017f(r5);
        if (r0 != 0) goto L_0x000c;
    L_0x0053:
        r0 = r1;
        goto L_0x000c;
    L_0x0055:
        r0 = move-exception;
        throw r0;
    L_0x0057:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.database.hf.WDHF_Contexte.a(java.lang.String, boolean):fr.pcsoft.wdjava.database.hf.db");
    }

    /* renamed from: a */
    public final String mo3084a(int i) {
        C0860m d = m5013d();
        if (d != null) {
            StringBuffer stringBuffer;
            switch (i) {
                case 19:
                case C0542t.Vc /*1089*/:
                    stringBuffer = new StringBuffer("");
                    stringBuffer.append(C0808l.m4021a(f2216z[13], f2216z[9])).append(f2216z[7]);
                    stringBuffer.append(C0808l.m4021a(f2216z[10], WDAppelContexte.getContexte().m2731r())).append(f2216z[7]);
                    stringBuffer.append(C0808l.m4021a(f2216z[12], String.valueOf(d.m6077i()))).append(f2216z[7]);
                    stringBuffer.append(f2216z[14]).append(f2216z[8]).append("\n").append(f2216z[11]).append(f2216z[7]);
                    stringBuffer.append(d.m6073e()).append(f2216z[7]).append(d.m6078j());
                    return stringBuffer.toString();
                case C0542t.mb /*1070*/:
                    stringBuffer = new StringBuffer("");
                    stringBuffer.append(C0808l.m4021a(f2216z[12], String.valueOf(d.m6077i()))).append(f2216z[7]);
                    stringBuffer.append(f2216z[11]).append(f2216z[7]).append(d.m6073e()).append(f2216z[7]).append(d.m6078j());
                    return stringBuffer.toString();
                case C0542t.f1195k /*1071*/:
                    return d.m6070b();
                case C0542t.f1205u /*1072*/:
                    return d.m6079k();
                case C0542t.Fc /*1073*/:
                    return m5025j();
                case C0542t.ib /*1083*/:
                    try {
                        return String.valueOf(d.m6072d());
                    } catch (C0841b e) {
                        throw e;
                    }
                case C0542t.f1169K /*1086*/:
                    return d.m6078j();
                case C0542t.Ib /*1090*/:
                    return d.m6069a();
                case C0542t.Jd /*1091*/:
                    return d.m6076h();
                default:
                    return "";
            }
        }
        if (m5041v()) {
            C0832f c0832f = null;
            try {
                c0832f = m5043x();
                return c0832f.mo2932e(i);
            } catch (Exception e2) {
                WDErreurManager.m2882a(e2);
            } catch (WDJNIException e3) {
                WDHF_Manager.m5075a(e3, c0832f);
            }
        }
        return "";
    }

    /* renamed from: a */
    public void mo2567a() {
        m4983u();
    }

    /* renamed from: a */
    public final void m4994a(int i, String str) {
        if (this.f2229o != null) {
            C0875w b;
            do {
                b = m5005b(i, str);
                if (b != null) {
                    this.f2229o.remove(b);
                }
                if (str != null) {
                    return;
                }
            } while (b != null);
        }
    }

    /* renamed from: a */
    public final void m4995a(long j) {
        this.f2226k = j;
    }

    /* renamed from: a */
    public void m4996a(WDHF_Connexion wDHF_Connexion) {
        this.f2230p.put(C0808l.m4057o(wDHF_Connexion.m4948b().toLowerCase()), wDHF_Connexion);
    }

    /* renamed from: a */
    public final void m4997a(WDHF_Contexte wDHF_Contexte) {
        f2215l.remove(wDHF_Contexte);
    }

    /* renamed from: a */
    public void m4998a(db dbVar) {
        this.f2224h.put(C0808l.m4057o(dbVar.mo2719a().toLowerCase()), dbVar);
    }

    /* renamed from: a */
    public void m4999a(db dbVar, boolean z) {
        try {
            this.f2228n = dbVar;
            if (z) {
                this.f2218b = dbVar;
            }
        } catch (WDException e) {
            throw e;
        }
    }

    /* renamed from: a */
    public void m5000a(C0860m c0860m) {
        try {
            if (this.f2225i != null) {
                this.f2225i.m6071c();
            }
            this.f2225i = c0860m;
            WDErreurManager.m2877a(WDAppelContexte.getContexte(), c0860m.m6073e());
        } catch (WDException e) {
            throw e;
        }
    }

    /* renamed from: a */
    public void m5001a(C0778b c0778b) {
        this.f2233s.put(C0808l.m4057o(c0778b.mo2719a().toLowerCase()), c0778b);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void m5002a(fr.pcsoft.wdjava.database.hf.C0875w r3) {
        /*
        r2 = this;
        r0 = r2.f2229o;
        if (r0 == 0) goto L_0x0035;
    L_0x0004:
        r0 = r3.m6166c();
        r1 = r3.m6164a();
        r0 = r2.m5005b(r0, r1);
        if (r0 == 0) goto L_0x0029;
    L_0x0012:
        r1 = r3.m6164a();	 Catch:{ WDException -> 0x002f }
        if (r1 == 0) goto L_0x0024;
    L_0x0018:
        r1 = r3.m6164a();	 Catch:{ WDException -> 0x0031 }
        if (r1 == 0) goto L_0x0029;
    L_0x001e:
        r1 = r0.m6164a();	 Catch:{ WDException -> 0x0033 }
        if (r1 == 0) goto L_0x0029;
    L_0x0024:
        r1 = r2.f2229o;	 Catch:{ WDException -> 0x0033 }
        r1.remove(r0);	 Catch:{ WDException -> 0x0033 }
    L_0x0029:
        r0 = r2.f2229o;
        r0.add(r3);
        return;
    L_0x002f:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x0031 }
    L_0x0031:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x0033 }
    L_0x0033:
        r0 = move-exception;
        throw r0;
    L_0x0035:
        r0 = new java.util.LinkedList;
        r0.<init>();
        r2.f2229o = r0;
        goto L_0x0029;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.database.hf.WDHF_Contexte.a(fr.pcsoft.wdjava.database.hf.w):void");
    }

    /* renamed from: a */
    public boolean mo3085a(int i, WDObjet wDObjet, WDObjet wDObjet2) {
        switch (i) {
            case 16:
                try {
                    return WDHF_Manager.m5145b(wDObjet, wDObjet2, true, 0);
                } catch (WDException e) {
                    throw e;
                }
            case 17:
                return WDHF_Manager.m5101a(wDObjet, wDObjet2, true, 0);
            case 18:
                return WDHF_Manager.m5194d(wDObjet, wDObjet2, true, 0);
            case 19:
                return WDHF_Manager.m5177c(wDObjet, wDObjet2, true, 0);
            default:
                C0691a.m2856a(f2216z[15]);
                return false;
        }
    }

    /* renamed from: b */
    public db m5004b(String str) {
        return (db) this.f2224h.get(str);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    public final fr.pcsoft.wdjava.database.hf.C0875w m5005b(int r6, java.lang.String r7) {
        /*
        r5 = this;
        r1 = 0;
        r0 = r5.f2229o;
        if (r0 == 0) goto L_0x004c;
    L_0x0005:
        r0 = r5.f2229o;
        r2 = r0.iterator();
    L_0x000b:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x004c;
    L_0x0011:
        r0 = r2.next();
        r0 = (fr.pcsoft.wdjava.database.hf.C0875w) r0;
        r3 = r0.m6166c();	 Catch:{ WDException -> 0x003a }
        if (r3 == r6) goto L_0x0025;
    L_0x001d:
        r3 = r0.m6166c();	 Catch:{ WDException -> 0x003c }
        r4 = 32;
        if (r3 != r4) goto L_0x004e;
    L_0x0025:
        if (r7 == 0) goto L_0x0039;
    L_0x0027:
        r3 = r0.m6164a();	 Catch:{ WDException -> 0x0040 }
        if (r3 == 0) goto L_0x0039;
    L_0x002d:
        r3 = r0.m6164a();	 Catch:{ WDException -> 0x0042 }
        r4 = 20;
        r3 = fr.pcsoft.wdjava.core.utils.C0808l.m4042c(r7, r3, r4);	 Catch:{ WDException -> 0x0042 }
        if (r3 != 0) goto L_0x0044;
    L_0x0039:
        return r0;
    L_0x003a:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x003c }
    L_0x003c:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x003e }
    L_0x003e:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x0040 }
    L_0x0040:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x0042 }
    L_0x0042:
        r0 = move-exception;
        throw r0;
    L_0x0044:
        r3 = r0.m6164a();
        if (r3 != 0) goto L_0x004e;
    L_0x004a:
        r1 = r0;
        goto L_0x000b;
    L_0x004c:
        r0 = r1;
        goto L_0x0039;
    L_0x004e:
        r0 = r1;
        goto L_0x004a;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.database.hf.WDHF_Contexte.b(int, java.lang.String):fr.pcsoft.wdjava.database.hf.w");
    }

    /* renamed from: b */
    public void mo3086b() {
        try {
            C0691a.m2860a(!mo3087c(), f2216z[2]);
            WDHF_Manager.m5190d(this);
        } catch (WDException e) {
            throw e;
        }
    }

    /* renamed from: b */
    public final void m5007b(int i) {
        this.f2227m = i;
    }

    /* renamed from: b */
    public void m5008b(db dbVar) {
        this.f2228n = dbVar;
    }

    /* renamed from: b */
    public void m5009b(boolean z) {
        this.f2221e = z;
    }

    /* renamed from: c */
    public final void m5010c(String str) {
        this.f2232r = str;
    }

    /* renamed from: c */
    public void m5011c(boolean z) {
        this.f2217a = z;
    }

    /* renamed from: c */
    public boolean mo3087c() {
        return this.f2217a;
    }

    /* renamed from: d */
    public C0860m m5013d() {
        return this.f2225i;
    }

    /* renamed from: d */
    public void m5014d(String str) {
        C0778b h = m5021h(str);
        if (h != null) {
            try {
                h.release();
            } catch (WDException e) {
                throw e;
            }
        }
        this.f2233s.remove(str);
    }

    /* renamed from: e */
    public db m5015e(String str) {
        String o = C0808l.m4057o(str.toLowerCase());
        db b = m5004b(o);
        return b == null ? m5021h(o) : b;
    }

    /* renamed from: e */
    public boolean m5016e() {
        try {
            return this.f2219c != null;
        } catch (WDException e) {
            throw e;
        }
    }

    /* renamed from: f */
    public C0778b m5017f(String str) {
        String o = C0808l.m4057o(str.toLowerCase());
        C0778b h = m5021h(o);
        return h == null ? m5028l(o) : h;
    }

    /* renamed from: f */
    public final void m5018f() {
        this.f2220d = true;
    }

    /* renamed from: g */
    public WDHF_Connexion m5019g(String str) {
        return (WDHF_Connexion) this.f2230p.get(C0808l.m4057o(str.toLowerCase()));
    }

    /* renamed from: h */
    public final long m5020h() {
        return this.f2226k;
    }

    /* renamed from: h */
    public C0778b m5021h(String str) {
        return (C0778b) this.f2233s.get(str);
    }

    /* renamed from: i */
    public final long m5022i() {
        try {
            return this.f2219c != null ? this.f2219c.mo3062x() : 0;
        } catch (WDException e) {
            throw e;
        }
    }

    /* renamed from: i */
    public void m5023i(String str) {
        db dbVar = (db) this.f2224h.remove(C0808l.m4057o(str.toLowerCase()));
        if (dbVar != null) {
            try {
                dbVar.release();
            } catch (WDException e) {
                throw e;
            }
        }
    }

    /* renamed from: j */
    public C0778b m5024j(String str) {
        return (C0778b) this.f2233s.get(C0808l.m4057o(str.toLowerCase()));
    }

    /* renamed from: j */
    public String m5025j() {
        return this.f2223g;
    }

    /* renamed from: k */
    public db m5026k() {
        return this.f2218b;
    }

    /* renamed from: k */
    public db m5027k(String str) {
        String toLowerCase = C0808l.m4057o(str).toLowerCase();
        db b = m5004b(toLowerCase);
        return b == null ? m5021h(toLowerCase) : b;
    }

    /* renamed from: l */
    public C0778b m5028l(String str) {
        C0537e requeteWDR = WDProjet.getInstance().getRequeteWDR(str);
        if (requeteWDR == null) {
            return null;
        }
        C0778b c0778b = new C0778b(requeteWDR);
        m5001a(c0778b);
        return c0778b;
    }

    /* renamed from: l */
    public Iterator m5029l() {
        return this.f2224h.values().iterator();
    }

    /* renamed from: m */
    public int m5030m() {
        int i = this.f2231q + 1;
        this.f2231q = i;
        return i;
    }

    /* renamed from: m */
    public db m5031m(String str) {
        db b = m5004b(str);
        return b == null ? m5021h(str) : b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: n */
    public fr.pcsoft.wdjava.database.hf.p049c.C0832f m5032n(java.lang.String r4) {
        /*
        r3 = this;
        r0 = r3.f2219c;	 Catch:{ b -> 0x003a }
        if (r0 == 0) goto L_0x0014;
    L_0x0004:
        r0 = "";
        r0 = r4.equals(r0);	 Catch:{ b -> 0x0038 }
        if (r0 != 0) goto L_0x0035;
    L_0x000c:
        r0 = r3.f2219c;	 Catch:{ b -> 0x0038 }
        r0 = r0.mo2994k();	 Catch:{ b -> 0x0038 }
        if (r0 != 0) goto L_0x0035;
    L_0x0014:
        r0 = fr.pcsoft.wdjava.core.application.WDProjet.getInstance();	 Catch:{ b -> 0x003a }
        r0 = r0.getNomAnalyseProjet();	 Catch:{ b -> 0x003a }
        r0 = fr.pcsoft.wdjava.database.hf.C0865r.m6088a(r0, r4);	 Catch:{ b -> 0x0049, WDJNIException -> 0x004e }
        r3.f2219c = r0;	 Catch:{ b -> 0x0049, WDJNIException -> 0x004e }
        r0 = fr.pcsoft.wdjava.core.application.WDProjet.getInstance();	 Catch:{ b -> 0x0049, WDJNIException -> 0x004e }
        r0 = r0.isModeGestionFichierMultiUtilisateur();	 Catch:{ b -> 0x0049, WDJNIException -> 0x004e }
        if (r0 == 0) goto L_0x003f;
    L_0x002c:
        r0 = r3.f2219c;	 Catch:{ b -> 0x0049, WDJNIException -> 0x004e }
        r1 = 1031; // 0x407 float:1.445E-42 double:5.094E-321;
        r2 = 1020; // 0x3fc float:1.43E-42 double:5.04E-321;
        r0.mo2771a(r1, r2);	 Catch:{ b -> 0x0049, WDJNIException -> 0x004e }
    L_0x0035:
        r0 = r3.f2219c;
        return r0;
    L_0x0038:
        r0 = move-exception;
        throw r0;	 Catch:{ b -> 0x003a }
    L_0x003a:
        r0 = move-exception;
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2882a(r0);
        goto L_0x0035;
    L_0x003f:
        r0 = r3.f2219c;	 Catch:{ b -> 0x0049, WDJNIException -> 0x004e }
        r1 = 1030; // 0x406 float:1.443E-42 double:5.09E-321;
        r2 = 1020; // 0x3fc float:1.43E-42 double:5.04E-321;
        r0.mo2771a(r1, r2);	 Catch:{ b -> 0x0049, WDJNIException -> 0x004e }
        goto L_0x0035;
    L_0x0049:
        r0 = move-exception;
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2882a(r0);	 Catch:{ b -> 0x003a }
        goto L_0x0035;
    L_0x004e:
        r0 = move-exception;
        r1 = r3.f2219c;	 Catch:{ b -> 0x003a }
        fr.pcsoft.wdjava.database.hf.WDHF_Manager.m5075a(r0, r1);	 Catch:{ b -> 0x003a }
        goto L_0x0035;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.database.hf.WDHF_Contexte.n(java.lang.String):fr.pcsoft.wdjava.database.hf.c.f");
    }

    /* renamed from: n */
    public void m5033n() {
        this.f2225i = null;
        this.f2221e = false;
        this.f2220d = false;
    }

    /* renamed from: o */
    public db m5034o(String str) {
        return (db) this.f2224h.get(C0808l.m4057o(str.toLowerCase()));
    }

    /* renamed from: o */
    public boolean m5035o() {
        return this.f2221e;
    }

    /* renamed from: p */
    public final int m5036p() {
        return this.f2227m;
    }

    /* renamed from: q */
    public Iterator m5037q() {
        return this.f2233s.values().iterator();
    }

    /* renamed from: r */
    public int m5038r() {
        try {
            return this.f2224h != null ? this.f2224h.size() : 0;
        } catch (WDException e) {
            throw e;
        }
    }

    /* renamed from: s */
    public db m5039s() {
        return this.f2228n;
    }

    /* renamed from: t */
    public final String m5040t() {
        return this.f2232r;
    }

    /* renamed from: v */
    public final boolean m5041v() {
        return this.f2220d;
    }

    /* renamed from: w */
    public Iterator m5042w() {
        return this.f2230p.values().iterator();
    }

    /* renamed from: x */
    public C0832f m5043x() {
        return m5032n("");
    }

    /* renamed from: y */
    public int m5044y() {
        return this.f2222f;
    }
}
