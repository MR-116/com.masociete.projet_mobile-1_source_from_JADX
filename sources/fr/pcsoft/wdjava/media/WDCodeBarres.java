package fr.pcsoft.wdjava.media;

import android.webkit.URLUtil;
import fr.pcsoft.wdjava.api.WDAPISMS;
import fr.pcsoft.wdjava.contact.WDStructContact;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.poo.C0560r;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.geo.WDGeoPosition;

public class WDCodeBarres extends C0560r {
    /* renamed from: b */
    private static final String f2565b = m6827z(m6828z(":-_2n3r"));
    /* renamed from: d */
    private static final String f2566d = m6827z(m6828z("0-Si"));
    /* renamed from: e */
    private static final String f2567e = m6827z(m6828z(":%Oi"));
    /* renamed from: g */
    private static final String f2568g = m6827z(m6828z("\":P'sm"));
    /* renamed from: i */
    private static final String f2569i = m6827z(m6828z(":)N8y#r"));
    /* renamed from: j */
    private static final String f2570j = m6827z(m6828z(":%O'sm"));
    /* renamed from: k */
    private static final String f2571k = m6827z(m6828z("$%Oi"));
    /* renamed from: l */
    private static final String f2572l = m6827z(m6828z(" !Z:&"));
    /* renamed from: n */
    private static final String f2573n = m6827z(m6828z("$%O'sm"));
    /* renamed from: o */
    private static final String f2574o = m6827z(m6828z("#-Pi"));
    /* renamed from: p */
    private static final String f2575p = m6827z(m6828z(":)U?h8r"));
    /* renamed from: q */
    public static final EWDPropriete[] f2576q = new EWDPropriete[]{EWDPropriete.PROP_TYPECONTENU, EWDPropriete.PROP_TYPECODEBARRES, EWDPropriete.PROP_CONTENU, EWDPropriete.PROP_VALEURBRUTE};
    /* renamed from: z */
    private static final String[] f2577z;
    /* renamed from: c */
    private WDObjet f2578c = null;
    /* renamed from: f */
    private String f2579f = "";
    /* renamed from: h */
    private int f2580h = 23;
    /* renamed from: m */
    private int f2581m = 1;

    static {
        String[] strArr = new String[11];
        strArr[0] = m6827z(m6828z("t\u0018n\u001cL\u0005\u0001y\u0007Y\b\u0004y\u0010H\u0002\u001ay\fO\u0012\u001dp\u0016"));
        strArr[1] = m6827z(m6828z("t\u0006s\fJ\u0016\u0004y\u0006N"));
        strArr[2] = m6827z(m6828z("t\u000bs\u0017Y\b\n}\u0001N\u0012\u001b"));
        strArr[3] = m6827z(m6828z("\u0019\u0007r\u0016"));
        strArr[4] = m6827z(m6828z("\u0000\u0018}"));
        strArr[5] = m6827z(m6828z("ZB"));
        strArr[6] = m6827z(m6828z("\u0004r"));
        strArr[7] = m6827z(m6828z("\u0000\rl"));
        strArr[8] = m6827z(m6828z("9'L2o$"));
        strArr[9] = m6827z(m6828z("\u0007r"));
        strArr[10] = m6827z(m6828z("\u0003r"));
        f2577z = strArr;
    }

    public WDCodeBarres(int i, String str) {
        this.f2580h = i;
        this.f2579f = str;
        m6825c();
    }

    /* renamed from: a */
    private WDEntier4 m6820a() {
        return new WDEntier4(this.f2581m);
    }

    /* renamed from: a */
    private final String m6821a(String str, String str2) {
        return str.length() > str2.length() ? str.substring(str2.length()) : str;
    }

    /* renamed from: a */
    private void m6822a(int i) {
        this.f2581m = i;
    }

    /* renamed from: b */
    private WDEntier4 m6823b() {
        return new WDEntier4(this.f2580h);
    }

    /* renamed from: b */
    private void m6824b(int i) {
        this.f2580h = i;
    }

    /* renamed from: c */
    private final void m6825c() {
        String toLowerCase = this.f2579f.toLowerCase();
        if (toLowerCase.startsWith(f2568g)) {
            this.f2581m = 7;
            this.f2578c = new WDChaine(m6821a(this.f2579f, f2568g));
        } else if (URLUtil.isNetworkUrl(toLowerCase)) {
            this.f2581m = 7;
            this.f2578c = new WDChaine(this.f2579f);
        } else if (toLowerCase.startsWith(f2575p)) {
            this.f2581m = 4;
            this.f2578c = new WDChaine(m6821a(this.f2579f, f2575p));
        } else if (toLowerCase.startsWith(f2574o)) {
            this.f2581m = 2;
            this.f2578c = new WDChaine(m6821a(this.f2579f, f2574o));
        } else if (toLowerCase.startsWith(f2571k) || toLowerCase.startsWith(f2573n) || (toLowerCase.startsWith(f2567e) | toLowerCase.startsWith(f2570j)) != 0) {
            this.f2581m = 3;
            r3 = toLowerCase.substring(0, toLowerCase.indexOf(58) + 1);
            toLowerCase = "";
            String str = "";
            String[] a = C0808l.m4029a(m6821a(this.f2579f, r3), ":");
            if (a != null) {
                toLowerCase = a.length > 0 ? a[0] : "";
                str = a.length > 1 ? a[1] : "";
            }
            this.f2578c = new WDChaine(a[0] + f2577z[5] + str);
            WDAPISMS.smsRaz();
            WDAPISMS.Numero.setValeur(toLowerCase);
            WDAPISMS.Message.setValeur(str);
        } else if (toLowerCase.startsWith(f2566d)) {
            this.f2581m = 6;
            WDObjet wDGeoPosition = new WDGeoPosition();
            String[] j = C0808l.m4052j(m6821a(this.f2579f, f2566d));
            if (j != null) {
                if (j.length > 0) {
                    wDGeoPosition.m6474c(C0725i.m3084m(j[0]));
                }
                if (j.length > 1) {
                    wDGeoPosition.m6475d(C0725i.m3084m(j[1]));
                }
            }
            this.f2578c = wDGeoPosition;
        } else if (toLowerCase.startsWith(f2569i)) {
            this.f2581m = 8;
            this.f2578c = new WDChaine(URLUtil.decode(C0725i.m3082k(this.f2579f)));
        } else if (toLowerCase.startsWith(f2572l)) {
            this.f2581m = 9;
            String[] b = C0808l.m4040b(m6821a(this.f2579f, f2572l));
            if (b != null) {
                r3 = "";
                toLowerCase = "";
                String str2 = "";
                for (int i = 0; i < b.length; i++) {
                    if (b[i].startsWith(f2577z[6])) {
                        r3 = b[i].substring(2);
                    } else if (b[i].startsWith(f2577z[10])) {
                        str2 = b[i].substring(2);
                        if (str2.equalsIgnoreCase(f2577z[4])) {
                            str2 = f2577z[4];
                        } else if (str2.equalsIgnoreCase(f2577z[7])) {
                            str2 = f2577z[7];
                        } else if (str2.equalsIgnoreCase(f2577z[8])) {
                            str2 = f2577z[3];
                        }
                    }
                    if (b[i].startsWith(f2577z[9])) {
                        toLowerCase = b[i].substring(2);
                    }
                }
                StringBuffer stringBuffer = new StringBuffer(((str2.length() + r3.length()) + toLowerCase.length()) + 2);
                stringBuffer.append(r3).append(C0607n.Gc).append(str2).append(C0607n.Gc).append(toLowerCase);
                this.f2578c = new WDChaine(stringBuffer.toString());
            }
        } else if (toLowerCase.startsWith(f2565b)) {
            this.f2581m = 5;
            WDStructContact.m1844a(this.f2579f);
        } else {
            this.f2581m = 1;
            this.f2578c = new WDChaine(this.f2579f);
        }
    }

    /* renamed from: d */
    private WDChaine m6826d() {
        return new WDChaine(this.f2579f);
    }

    /* renamed from: z */
    private static String m6827z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 87;
                    break;
                case 1:
                    i2 = 72;
                    break;
                case 2:
                    i2 = 60;
                    break;
                case 3:
                    i2 = 83;
                    break;
                default:
                    i2 = 28;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m6828z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 28);
        }
        return toCharArray;
    }

    public WDObjet getContenu() {
        return this.f2578c != null ? this.f2578c : new WDChaine();
    }

    public String getNomType() {
        return C0745b.m3220a(f2577z[2], new String[0]);
    }

    public WDObjet getProp(EWDPropriete eWDPropriete) {
        switch (C0941c.f2586a[eWDPropriete.ordinal()]) {
            case 1:
                return m6823b();
            case 2:
                return m6820a();
            case 3:
                return m6826d();
            default:
                return super.getProp(eWDPropriete);
        }
    }

    public WDObjet getValeur() {
        WDErreurManager.m2883a(C0745b.m3222b(f2577z[1], getNomType()));
        return null;
    }

    public boolean isEvaluable() {
        return false;
    }

    /* renamed from: k */
    public EWDPropriete[] mo2439k() {
        return f2576q;
    }

    /* renamed from: l */
    protected int mo2440l() {
        return C0607n.hr;
    }

    public void razVariable() {
        this.f2580h = 23;
        this.f2581m = 1;
        this.f2579f = "";
        this.f2578c = null;
    }

    public void release() {
        this.f2578c = null;
        this.f2579f = null;
    }

    public void setContenu(WDObjet wDObjet) {
        this.f2578c = wDObjet;
    }

    public void setProp(EWDPropriete eWDPropriete, WDObjet wDObjet) {
        switch (C0941c.f2586a[eWDPropriete.ordinal()]) {
            case 1:
                m6824b(wDObjet.getInt());
                return;
            case 2:
                m6822a(wDObjet.getInt());
                return;
            case 3:
                WDErreurManager.m2883a(C0745b.m3222b(f2577z[0], eWDPropriete.getNom()));
                return;
            default:
                super.setProp(eWDPropriete, wDObjet);
                return;
        }
    }

    protected void setPropInt(EWDPropriete eWDPropriete, int i) {
        switch (C0941c.f2586a[eWDPropriete.ordinal()]) {
            case 1:
                m6824b(i);
                return;
            case 2:
                m6822a(i);
                return;
            default:
                super.setPropInt(eWDPropriete, i);
                return;
        }
    }

    public void setValeur(WDObjet wDObjet) {
        WDCodeBarres wDCodeBarres = (WDCodeBarres) wDObjet.checkType(WDCodeBarres.class);
        if (wDCodeBarres != null) {
            this.f2580h = wDCodeBarres.f2580h;
            this.f2581m = wDCodeBarres.f2581m;
            this.f2578c = wDCodeBarres.f2578c;
            this.f2579f = wDCodeBarres.f2579f;
            return;
        }
        super.setValeur(wDObjet);
    }
}
