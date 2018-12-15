package fr.pcsoft.wdjava.database.hf;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.allocation.C0611a;
import fr.pcsoft.wdjava.core.allocation.C0613b;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.core.types.database.C0775c;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.database.hf.p049c.C0832f;
import fr.pcsoft.wdjava.database.hf.p049c.C0841b;
import fr.pcsoft.wdjava.database.hf.p050a.C0834a;
import fr.pcsoft.wdjava.database.hf.p053f.C0852c;
import fr.pcsoft.wdjava.database.hf.p053f.C0854e;
import fr.pcsoft.wdjava.jni.WDJNIException;
import java.util.Iterator;
import java.util.LinkedList;

public class WDHF_Connexion extends C0775c implements C0542t {
    public static final C0613b<WDHF_Connexion> CREATOR = new hb();
    public static final byte Td = (byte) 2;
    public static final byte Ud = (byte) 0;
    public static final byte be = (byte) 1;
    private static final char fe = '=';
    public static final byte ie = (byte) -1;
    public static final byte je = (byte) 3;
    private static final String[] ke = new String[]{m4939z(m4940z("\n\u0006@N@v\u001bW]Jd\u0002XJLk\u001e\\ADo\u0014\\]Qh\u0006PQK")), m4939z(m4940z("~;wZ`_\u0011uw`G&J{w_7llMo")), m4939z(m4940z("\n\u0017KL@|\u0000FVCv\u0006@N@v\u0010XM@")), m4939z(m4940z("~;wZ`_\u0018xhdc\u0016[]Zz\u0003UwqL")), m4939z(m4940z("~;wZ`_\u001a_)")), m4939z(m4940z("~;wz`_\u0001HRl]7")), m4939z(m4940z("~;wZ`_\u0001HRl]7F_kM vwa")), m4939z(m4940z("\n\u0011VPKl\nPQK")), m4939z(m4940z("\n\u0011VPKl\nPQKv\u0001VKVv\u0017U[Hl\u001cM")), m4939z(m4940z("\n\u0017ZV@j\rK[F|\u0002\\LD}\u001bVPZy\u0000VNZj\u001dWP@q\u001bVP")), m4939z(m4940z("\n\u001e\\]Q|\u0000\\AU{\u001dKNLl\u0006\\AFf\u001cW[]`\u001dW")), m4939z(m4940z("\n\u0013Z]@z\rILJy\u0000P[Ql\rZQKg\u0017AWJg")), m4939z(m4940z("\n\u0017KL@|\u0000FVCv\u0006@N@v\u0010XM@v\u001cVPZz\u0007INJ{\u0006\\")), m4939z(m4940z("\n\u0017KL@|\u0000FVCv\u0011VPKl\nPQKv\u0010XM@")), m4939z(m4940z("\n\u001aFZ@j\u0000PJZj\u001dWP@q\u001bVP")), m4939z(m4940z("\n\u0016KWSl\u0000FTAk\u0011FPJg\rJN@j\u001b_W@")), m4939z(m4940z("\n\u001aFQP\u0000\\AFf\u001cW[]`\u001dW")), m4939z(m4940z("{\u0013IWAl")), m4939z(m4940z("h\u0007ZKK")), m4939z(m4940z("j\u0000@NQh\u0015\\")), m4939z(m4940z("{\u0011,A4\u001f")), m4939z(m4940z("\n\u0015\\MQ`\u001dWPD`\u0000\\ADj\u0011\\MZz\u0003UWQl\rPPQ{\u001dLHDk\u001e\\")), m4939z(m4940z("`?iqvZ;{r`\t6|>fE=w{w\t>x>fF<w{}@=w>fF'kk]77")), m4939z(m4940z("\n\u0011VPV}\u0013WJ@v\u001bW]J{\u0000\\]Ql")), m4939z(m4940z("j\u0000@NQh\u0015\\#"))};
    private String Rd = "";
    private int Sd = 6;
    private String Vd = "";
    private LinkedList<C0777g> Wd = null;
    private int Xd = 3;
    private boolean Yd = false;
    private String Zd = "";
    private boolean ae = false;
    private String ce = "";
    private String de = "";
    private String ee = "";
    private long ge = -1;
    protected C0833j he;

    public WDHF_Connexion(String str) {
        this.ee = str;
        m4944a(16);
        this.Yd = true;
        WDHF_Contexte.getInstance().m4996a(this);
    }

    public WDHF_Connexion(String str, int i) {
        this.ee = str;
        m4944a(i);
    }

    public WDHF_Connexion(String str, String str2) {
        this.ee = str;
        m4950b(str2);
    }

    /* renamed from: g */
    private void m4938g() {
        if (m4962j()) {
            m4969q();
        }
        this.Yd = true;
    }

    /* renamed from: z */
    private static String m4939z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 41;
                    break;
                case 1:
                    i2 = 82;
                    break;
                case 2:
                    i2 = 25;
                    break;
                case 3:
                    i2 = 30;
                    break;
                default:
                    i2 = 5;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m4940z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 5);
        }
        return toCharArray;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public long m4941a() {
        /*
        r11 = this;
        r0 = r11.ge;
        r2 = -1;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 != 0) goto L_0x0041;
    L_0x0008:
        r1 = 0;
        r0 = fr.pcsoft.wdjava.database.hf.WDHF_Contexte.getInstance();	 Catch:{ b -> 0x0046, WDJNIException -> 0x004b }
        r0 = r0.m5043x();	 Catch:{ b -> 0x0046, WDJNIException -> 0x004b }
        r1 = r11.Yd;	 Catch:{ b -> 0x0046, WDJNIException -> 0x0050 }
        if (r1 == 0) goto L_0x0031;
    L_0x0015:
        r1 = r11.ee;	 Catch:{ b -> 0x0046, WDJNIException -> 0x0050 }
        r2 = r11.Vd;	 Catch:{ b -> 0x0046, WDJNIException -> 0x0050 }
        r3 = r11.Zd;	 Catch:{ b -> 0x0046, WDJNIException -> 0x0050 }
        r4 = r11.ce;	 Catch:{ b -> 0x0046, WDJNIException -> 0x0050 }
        r5 = r11.Rd;	 Catch:{ b -> 0x0046, WDJNIException -> 0x0050 }
        r6 = r11.m4954d();	 Catch:{ b -> 0x0046, WDJNIException -> 0x0050 }
        r7 = r11.Xd;	 Catch:{ b -> 0x0046, WDJNIException -> 0x0050 }
        r8 = r11.de;	 Catch:{ b -> 0x0046, WDJNIException -> 0x0050 }
        r9 = 0;
        r1 = r0.mo2854a(r1, r2, r3, r4, r5, r6, r7, r8, r9);	 Catch:{ b -> 0x0046, WDJNIException -> 0x0050 }
        if (r1 != 0) goto L_0x0031;
    L_0x002e:
        fr.pcsoft.wdjava.database.hf.WDHF_Manager.m5074a(r0);	 Catch:{ b -> 0x0044, WDJNIException -> 0x0050 }
    L_0x0031:
        r1 = fr.pcsoft.wdjava.database.hf.WDHF_Contexte.getInstance();	 Catch:{ b -> 0x0046, WDJNIException -> 0x0050 }
        r1 = r1.m5043x();	 Catch:{ b -> 0x0046, WDJNIException -> 0x0050 }
        r2 = r11.ee;	 Catch:{ b -> 0x0046, WDJNIException -> 0x0050 }
        r2 = r1.mo2985j(r2);	 Catch:{ b -> 0x0046, WDJNIException -> 0x0050 }
        r11.ge = r2;	 Catch:{ b -> 0x0046, WDJNIException -> 0x0050 }
    L_0x0041:
        r0 = r11.ge;
        return r0;
    L_0x0044:
        r1 = move-exception;
        throw r1;	 Catch:{ b -> 0x0046, WDJNIException -> 0x0050 }
    L_0x0046:
        r0 = move-exception;
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2882a(r0);
        goto L_0x0041;
    L_0x004b:
        r0 = move-exception;
    L_0x004c:
        fr.pcsoft.wdjava.database.hf.WDHF_Manager.m5075a(r0, r1);
        goto L_0x0041;
    L_0x0050:
        r1 = move-exception;
        r10 = r1;
        r1 = r0;
        r0 = r10;
        goto L_0x004c;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.database.hf.WDHF_Connexion.a():long");
    }

    /* renamed from: a */
    public WDObjet m4942a(C0832f c0832f) {
        try {
            WDHF_Connexion wDHF_Connexion = (WDHF_Connexion) clone();
            try {
                if (this.he != null) {
                    wDHF_Connexion.he = this.he.m5327r();
                }
                try {
                    if (wDHF_Connexion.ge == -1 || c0832f == null) {
                        wDHF_Connexion.ge = -1;
                        return wDHF_Connexion;
                    }
                    try {
                        wDHF_Connexion.ge = c0832f.mo2985j(this.ee);
                        return wDHF_Connexion;
                    } catch (Exception e) {
                        WDErreurManager.m2882a(e);
                        return wDHF_Connexion;
                    } catch (WDJNIException e2) {
                        WDHF_Manager.m5075a(e2, c0832f);
                        return wDHF_Connexion;
                    }
                } catch (CloneNotSupportedException e3) {
                    throw e3;
                }
            } catch (CloneNotSupportedException e32) {
                throw e32;
            }
        } catch (Exception e4) {
            C0691a.m2857a(ke[22], e4);
            return null;
        }
    }

    /* renamed from: a */
    public C0833j m4943a(boolean z) {
        if (this.he == null && z) {
            switch (this.Sd) {
                default:
                    WDErreurManager.m2883a(C0745b.m3222b(ke[12], m4948b()));
                    break;
            }
        }
        return this.he;
    }

    /* renamed from: a */
    protected void m4944a(int i) {
        try {
            if (this.he != null) {
                this.he.mo3119q();
                this.he = null;
            }
            try {
                this.Sd = i;
                switch (i) {
                    case 3:
                        this.he = new C0854e();
                        return;
                    case 6:
                        this.he = new C0852c();
                        return;
                    case 11:
                    case 16:
                        this.he = new C0858k();
                        return;
                    case 17:
                        try {
                            this.he = new C0834a();
                            return;
                        } catch (Exception e) {
                            WDErreurManager.m2883a(C0745b.m3222b(ke[21], new String[0]));
                            return;
                        }
                    default:
                        return;
                }
            } catch (Exception e2) {
                throw e2;
            }
            throw e2;
        } catch (Exception e22) {
            throw e22;
        }
    }

    /* renamed from: a */
    public final void m4945a(C0777g c0777g) {
        if (this.Wd != null) {
            this.Wd.remove(c0777g);
        }
    }

    /* renamed from: a */
    public final void m4946a(String str) {
        this.Zd = str;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public boolean m4947a(boolean r9, java.lang.String r10) {
        /*
        r8 = this;
        r1 = 0;
        r0 = r8.m4953c();
        if (r0 == 0) goto L_0x002e;
    L_0x0007:
        r2 = 0;
        r0 = fr.pcsoft.wdjava.database.hf.WDHF_Contexte.getInstance();	 Catch:{ b -> 0x00cd, WDJNIException -> 0x00c7 }
        r2 = r0.m5043x();	 Catch:{ b -> 0x00cd, WDJNIException -> 0x00c7 }
        r4 = r8.m4941a();	 Catch:{ b -> 0x00cd, WDJNIException -> 0x00c7 }
        r0 = r2.mo2936e(r4);	 Catch:{ b -> 0x00cd, WDJNIException -> 0x00c7 }
        if (r0 != 0) goto L_0x0025;
    L_0x001a:
        fr.pcsoft.wdjava.database.hf.WDHF_Manager.m5074a(r2);	 Catch:{ b -> 0x001e, WDJNIException -> 0x0029 }
    L_0x001d:
        return r0;
    L_0x001e:
        r1 = move-exception;
        throw r1;	 Catch:{ b -> 0x0020, WDJNIException -> 0x0029 }
    L_0x0020:
        r1 = move-exception;
    L_0x0021:
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2882a(r1);
        goto L_0x001d;
    L_0x0025:
        r1 = 0;
        r8.Yd = r1;	 Catch:{ b -> 0x0020, WDJNIException -> 0x0029 }
        goto L_0x001d;
    L_0x0029:
        r1 = move-exception;
    L_0x002a:
        fr.pcsoft.wdjava.database.hf.WDHF_Manager.m5075a(r1, r2);
        goto L_0x001d;
    L_0x002e:
        r3 = "";
        r0 = r8.Sd;	 Catch:{ b -> 0x004f }
        r1 = 17;
        if (r0 == r1) goto L_0x003e;
    L_0x0036:
        if (r10 == 0) goto L_0x0051;
    L_0x0038:
        r3 = r10;
    L_0x0039:
        r0 = r8.Sd;	 Catch:{ b -> 0x00c3 }
        switch(r0) {
            case 3: goto L_0x0054;
            case 6: goto L_0x0054;
            case 100: goto L_0x0054;
            default: goto L_0x003e;
        };
    L_0x003e:
        r0 = r8.m4967o();
        r1 = r8.ce;
        r2 = r8.Vd;
        r4 = r8.Rd;
        r5 = r8.de;
        r0 = r0.mo3098a(r1, r2, r3, r4, r5);
        goto L_0x001d;
    L_0x004f:
        r0 = move-exception;
        throw r0;
    L_0x0051:
        r3 = r8.Zd;
        goto L_0x0039;
    L_0x0054:
        r0 = r8.de;	 Catch:{ b -> 0x00c5 }
        if (r0 == 0) goto L_0x0062;
    L_0x0058:
        r0 = r8.de;	 Catch:{ b -> 0x00c1 }
        r1 = "";
        r0 = r0.equals(r1);	 Catch:{ b -> 0x00c1 }
        if (r0 == 0) goto L_0x003e;
    L_0x0062:
        r0 = new java.lang.StringBuilder;	 Catch:{ b -> 0x00c1 }
        r0.<init>();	 Catch:{ b -> 0x00c1 }
        r1 = ke;	 Catch:{ b -> 0x00c1 }
        r2 = 13;
        r1 = r1[r2];	 Catch:{ b -> 0x00c1 }
        r2 = 2;
        r2 = new java.lang.String[r2];	 Catch:{ b -> 0x00c1 }
        r4 = 0;
        r5 = r8.ce;	 Catch:{ b -> 0x00c1 }
        r2[r4] = r5;	 Catch:{ b -> 0x00c1 }
        r4 = 1;
        r5 = r8.Rd;	 Catch:{ b -> 0x00c1 }
        r2[r4] = r5;	 Catch:{ b -> 0x00c1 }
        r1 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r1, r2);	 Catch:{ b -> 0x00c1 }
        r0 = r0.append(r1);	 Catch:{ b -> 0x00c1 }
        r1 = "\n";
        r0 = r0.append(r1);	 Catch:{ b -> 0x00c1 }
        r1 = ke;	 Catch:{ b -> 0x00c1 }
        r2 = 15;
        r1 = r1[r2];	 Catch:{ b -> 0x00c1 }
        r2 = 3;
        r2 = new java.lang.String[r2];	 Catch:{ b -> 0x00c1 }
        r4 = 0;
        r5 = r8.ee;	 Catch:{ b -> 0x00c1 }
        r2[r4] = r5;	 Catch:{ b -> 0x00c1 }
        r4 = 1;
        r5 = ke;	 Catch:{ b -> 0x00c1 }
        r6 = 14;
        r5 = r5[r6];	 Catch:{ b -> 0x00c1 }
        r5 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3221b(r5);	 Catch:{ b -> 0x00c1 }
        r2[r4] = r5;	 Catch:{ b -> 0x00c1 }
        r4 = 2;
        r5 = ke;	 Catch:{ b -> 0x00c1 }
        r6 = 16;
        r5 = r5[r6];	 Catch:{ b -> 0x00c1 }
        r5 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3221b(r5);	 Catch:{ b -> 0x00c1 }
        r2[r4] = r5;	 Catch:{ b -> 0x00c1 }
        r1 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r1, r2);	 Catch:{ b -> 0x00c1 }
        r0 = r0.append(r1);	 Catch:{ b -> 0x00c1 }
        r0 = r0.toString();	 Catch:{ b -> 0x00c1 }
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2883a(r0);	 Catch:{ b -> 0x00c1 }
        goto L_0x003e;
    L_0x00c1:
        r0 = move-exception;
        throw r0;
    L_0x00c3:
        r0 = move-exception;
        throw r0;	 Catch:{ b -> 0x00c5 }
    L_0x00c5:
        r0 = move-exception;
        throw r0;	 Catch:{ b -> 0x00c1 }
    L_0x00c7:
        r0 = move-exception;
        r7 = r0;
        r0 = r1;
        r1 = r7;
        goto L_0x002a;
    L_0x00cd:
        r0 = move-exception;
        r7 = r0;
        r0 = r1;
        r1 = r7;
        goto L_0x0021;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.database.hf.WDHF_Connexion.a(boolean, java.lang.String):boolean");
    }

    /* renamed from: b */
    public final String m4948b() {
        return this.ee;
    }

    /* renamed from: b */
    public final void m4949b(C0777g c0777g) {
        if (this.Wd == null) {
            this.Wd = new LinkedList();
        }
        this.Wd.add(c0777g);
    }

    /* renamed from: b */
    public final void m4950b(String str) {
        if (this.he != null) {
            this.he.mo3119q();
            this.he = null;
        }
        if (str.equalsIgnoreCase(ke[6]) || str.equalsIgnoreCase(ke[5]) || str.equalsIgnoreCase(ke[3])) {
            this.he = new C0834a();
            this.Sd = 17;
        } else if (str.equalsIgnoreCase(ke[1])) {
            this.he = new C0858k();
            this.Sd = 11;
        } else if (str.equalsIgnoreCase(ke[4])) {
            this.he = new C0858k();
            this.Sd = 16;
        } else {
            WDErreurManager.m2883a(C0745b.m3222b(ke[2], new String[0]));
        }
    }

    /* renamed from: b */
    public final void m4951b(boolean z) {
        this.ae = z;
    }

    /* renamed from: c */
    public final void m4952c(String str) {
        this.Rd = str;
    }

    /* renamed from: c */
    public boolean m4953c() {
        return this.Sd == 11 || this.Sd == 16;
    }

    /* renamed from: d */
    public final String m4954d() {
        if (m4953c()) {
            return this.Sd == 16 ? ke[4] : ke[1];
        } else {
            C0833j a = m4943a(false);
            return a != null ? a.mo3120s() : "";
        }
    }

    /* renamed from: d */
    public final void m4955d(String str) {
        this.ce = str;
    }

    /* renamed from: e */
    public WDChaine mo3069e() {
        return getServeur();
    }

    /* renamed from: e */
    public final void m4957e(String str) {
        this.Vd = str;
    }

    /* renamed from: f */
    public final String m4958f() {
        return this.de;
    }

    /* renamed from: f */
    public final void m4959f(String str) {
        this.de = str;
    }

    public WDEntier4 getAcces() {
        return new WDEntier4(this.Xd);
    }

    public WDChaine getBaseDeDonnees() {
        return new WDChaine(this.Rd);
    }

    public WDObjet getCryptage() {
        for (String str : C0808l.m4040b(this.de)) {
            String str2;
            int indexOf = str2.indexOf(61);
            if (indexOf > 0 && str2.substring(0, indexOf).trim().equalsIgnoreCase(ke[19])) {
                str2 = str2.substring(indexOf + 1).trim();
                if (str2.equalsIgnoreCase(ke[18])) {
                    return C0611a.m2308b(30);
                }
                if (str2.equalsIgnoreCase(ke[17])) {
                    return C0611a.m2308b(31);
                }
                if (str2.equalsIgnoreCase(ke[20])) {
                    return C0611a.m2308b(33);
                }
            }
        }
        return C0611a.m2308b(30);
    }

    public WDObjet getElement(String str) {
        return getElement(str, true);
    }

    public WDObjet getElement(String str, boolean z) {
        if (z) {
            WDErreurManager.m2883a(C0745b.m3222b(ke[8], new String[0]));
        }
        return null;
    }

    public WDChaine getInfosEtendues() {
        return new WDChaine(getInfosEtendues());
    }

    public WDChaine getLibelle() {
        return new WDChaine(this.ee);
    }

    public String getMessageAccesPropieteInterdite(String str) {
        return C0745b.m3222b(ke[11], str, this.ee);
    }

    public String getMessageLecturePropieteInterdite(String str) {
        return C0745b.m3222b(ke[10], str, this.ee);
    }

    public WDObjet getMotDePasse() {
        WDErreurManager.m2883a(C0745b.m3222b(ke[9], m4948b()));
        return null;
    }

    public WDChaine getNom() {
        return new WDChaine(this.ee);
    }

    public String getNomType() {
        return C0745b.m3220a(ke[7], new String[0]);
    }

    public WDChaine getProvider() {
        return new WDChaine(m4954d());
    }

    public WDChaine getServeur() {
        return new WDChaine(m4961i());
    }

    public /* bridge */ /* synthetic */ WDObjet getSource() {
        return mo3069e();
    }

    public int getTypeVar() {
        return 70;
    }

    public WDChaine getUtilisateur() {
        return new WDChaine(m4960h());
    }

    public WDObjet getValeur() {
        return new WDChaine(this.ee);
    }

    /* renamed from: h */
    public final String m4960h() {
        return this.Vd;
    }

    /* renamed from: i */
    public final String m4961i() {
        return this.ce;
    }

    public boolean isConnexion() {
        return true;
    }

    /* renamed from: j */
    public boolean m4962j() {
        if (m4953c()) {
            return this.ge != -1;
        } else {
            C0833j a = m4943a(false);
            return a != null ? a.mo3111g() : false;
        }
    }

    /* renamed from: k */
    public final String m4963k() {
        return this.Zd;
    }

    /* renamed from: l */
    public final boolean m4964l() {
        return this.ae;
    }

    /* renamed from: m */
    public final String m4965m() {
        return m4958f();
    }

    /* renamed from: n */
    public final String m4966n() {
        return this.Rd;
    }

    /* renamed from: o */
    public C0833j m4967o() {
        return m4943a(true);
    }

    /* renamed from: p */
    public final int m4968p() {
        return this.Sd;
    }

    /* renamed from: q */
    public boolean m4969q() {
        if (!m4953c()) {
            return m4967o().mo3113j();
        }
        boolean z = false;
        C0832f c0832f = null;
        try {
            if (this.ge == -1) {
                return z;
            }
            c0832f = WDHF_Contexte.getInstance().m5043x();
            z = c0832f.mo3068z(m4941a());
            if (!z) {
                WDHF_Manager.m5074a(c0832f);
            }
            c0832f.mo3021o(this.ge);
            this.ge = -1;
            return z;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            WDHF_Manager.m5075a(e2, c0832f);
            return z;
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return z;
        }
    }

    public void release() {
        super.release();
        if (this.ge != -1) {
            C0832f x = WDHF_Contexte.getInstance().m5043x();
            try {
                x.mo3021o(this.ge);
                this.ge = -1;
            } catch (Exception e) {
                WDErreurManager.m2882a(e);
            } catch (WDJNIException e2) {
                WDHF_Manager.m5075a(e2, x);
            }
        }
        try {
            this.ee = null;
            this.ce = null;
            this.Vd = null;
            this.Zd = null;
            this.Rd = null;
            if (this.he != null) {
                this.he.mo3118p();
                this.he = null;
            }
            try {
                this.de = null;
                if (this.Wd != null) {
                    this.Wd.clear();
                    this.Wd = null;
                }
            } catch (C0841b e3) {
                throw e3;
            }
        } catch (C0841b e32) {
            throw e32;
        }
    }

    public void setAcces(int i) {
        m4938g();
        this.Xd = i;
    }

    public void setBaseDeDonnees(String str) {
        m4938g();
        m4952c(str);
    }

    public void setCryptage(int i) {
        m4938g();
        String str = ke[24];
        switch (i) {
            case 30:
                str = str + ke[18];
                break;
            case 31:
                str = str + ke[17];
                break;
            case 33:
                str = str + ke[20];
                break;
            default:
                WDErreurManager.m2883a(C0745b.m3222b(ke[23], new String[0]));
                break;
        }
        if (C0808l.m4053k(this.de)) {
            this.de = str;
            return;
        }
        StringBuilder stringBuilder;
        String[] b = C0808l.m4040b(this.de);
        int i2 = 0;
        while (i2 < r4) {
            String str2 = b[i2];
            int indexOf = str2.indexOf(61);
            if (indexOf <= 0 || !str2.substring(0, indexOf).trim().equalsIgnoreCase(ke[19])) {
                i2++;
            } else {
                b[i2] = str;
                stringBuilder = new StringBuilder();
                for (String append : b) {
                    if (stringBuilder.length() > 0) {
                        stringBuilder.append(';');
                    }
                    stringBuilder.append(append);
                }
                this.de = stringBuilder.toString();
            }
        }
        stringBuilder = new StringBuilder();
        while (r0 < r4) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append(';');
            }
            stringBuilder.append(append);
        }
        this.de = stringBuilder.toString();
    }

    public void setInfosEtendues(String str) {
        m4938g();
        m4959f(str);
    }

    public void setMotDePasse(WDObjet wDObjet) {
        m4938g();
        m4946a(wDObjet.getString());
    }

    public void setProvider(String str) {
        m4938g();
        m4950b(str);
        if (this.Wd != null) {
            Iterator it = this.Wd.iterator();
            while (it.hasNext()) {
                ((C0777g) it.next()).mo2720a(this);
            }
        }
    }

    public void setServeur(String str) {
        m4938g();
        m4955d(str);
    }

    public void setSource(String str) {
        setServeur(str);
    }

    public void setUtilisateur(String str) {
        m4938g();
        m4957e(str);
    }

    public void setValeur(WDObjet wDObjet) {
        WDHF_Connexion wDHF_Connexion = (WDHF_Connexion) wDObjet.checkType(WDHF_Connexion.class);
        if (wDHF_Connexion != null) {
            this.ee = wDHF_Connexion.ee;
            this.ce = wDHF_Connexion.ce;
            this.Vd = wDHF_Connexion.Vd;
            this.Zd = wDHF_Connexion.Zd;
            this.Rd = wDHF_Connexion.Rd;
            this.Sd = wDHF_Connexion.Sd;
            this.he = wDHF_Connexion.he;
            this.ae = wDHF_Connexion.ae;
            this.Xd = wDHF_Connexion.Xd;
            this.de = wDHF_Connexion.de;
            this.ge = wDHF_Connexion.ge;
            this.Yd = wDHF_Connexion.Yd;
            return;
        }
        WDErreurManager.m2883a(C0745b.m3222b(ke[0], new String[0]));
    }
}
