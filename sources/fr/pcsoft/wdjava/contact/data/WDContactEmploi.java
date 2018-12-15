package fr.pcsoft.wdjava.contact.data;

import android.content.ContentProviderOperation.Builder;
import android.database.Cursor;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.database.p048a.C0830a;

public class WDContactEmploi extends C0571k {
    /* renamed from: i */
    public static final EWDPropriete[] f1335i = new EWDPropriete[]{EWDPropriete.PROP_TYPE, EWDPropriete.PROP_ETIQUETTE, EWDPropriete.PROP_SOCIETE, EWDPropriete.PROP_SERVICE, EWDPropriete.PROP_DESCRIPTION, EWDPropriete.PROP_ADRESSE, EWDPropriete.PROP_POSTE};
    /* renamed from: z */
    private static final String[] f1336z = new String[]{m1961z(m1962z("br\u001eX\u001c\u000e~")), m1961z(m1962z("7Y7&1/S!g9%\u00190}\"2X!&95R>'?3P2f9;V'a?/")), m1961z(m1962z("%V'id")), m1961z(m1962z("%V'ie")), m1961z(m1962z("%V'ii")), m1961z(m1962z("%V'if")), m1961z(m1962z("%V'ia"))};
    /* renamed from: f */
    private String f1337f;
    /* renamed from: g */
    private String f1338g;
    /* renamed from: h */
    private String f1339h;
    /* renamed from: j */
    private String f1340j;
    /* renamed from: k */
    private String f1341k;

    public WDContactEmploi() {
        this.f1340j = "";
        this.f1341k = "";
        this.f1339h = "";
        this.f1338g = "";
        this.f1337f = "";
        this.e = 1;
    }

    public WDContactEmploi(Cursor cursor) {
        super(cursor);
        this.f1340j = "";
        this.f1341k = "";
        this.f1339h = "";
        this.f1338g = "";
        this.f1337f = "";
        this.f1340j = C0830a.m4260b(cursor, f1336z[6]);
        this.f1341k = C0830a.m4260b(cursor, f1336z[3]);
        this.f1339h = C0830a.m4260b(cursor, f1336z[5]);
        this.f1338g = C0830a.m4260b(cursor, f1336z[6]);
        this.f1337f = C0830a.m4260b(cursor, f1336z[2]);
    }

    /* renamed from: b */
    private final void m1951b(String str) {
        if (!this.f1339h.equals(str)) {
            this.f1339h = str;
            this.c = true;
        }
    }

    /* renamed from: c */
    private final void m1952c(String str) {
        if (!this.f1338g.equals(str)) {
            this.f1338g = str;
            this.c = true;
        }
    }

    /* renamed from: d */
    private final void m1953d(String str) {
        if (!this.f1340j.equals(str)) {
            this.f1340j = str;
            this.c = true;
        }
    }

    /* renamed from: e */
    private final void m1954e(String str) {
        if (!this.f1337f.equals(str)) {
            this.f1337f = str;
            this.c = true;
        }
    }

    /* renamed from: f */
    private final void m1955f(String str) {
        if (!this.f1341k.equals(str)) {
            this.f1341k = str;
            this.c = true;
        }
    }

    /* renamed from: h */
    private final String m1956h() {
        return this.f1337f;
    }

    /* renamed from: i */
    private final String m1957i() {
        return this.f1341k;
    }

    /* renamed from: j */
    private final String m1958j() {
        return this.f1339h;
    }

    /* renamed from: m */
    private final String m1959m() {
        return this.f1338g;
    }

    /* renamed from: n */
    private final String m1960n() {
        return this.f1340j;
    }

    /* renamed from: z */
    private static String m1961z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 65;
                    break;
                case 1:
                    i2 = 55;
                    break;
                case 2:
                    i2 = 83;
                    break;
                case 3:
                    i2 = 8;
                    break;
                default:
                    i2 = 80;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1962z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 80);
        }
        return toCharArray;
    }

    /* renamed from: a */
    protected int mo2462a(int i) {
        switch (i) {
            case 0:
            case 1:
                return i;
            default:
                return 2;
        }
    }

    /* renamed from: a */
    public Builder mo2459a() {
        return super.mo2459a().withValue(f1336z[6], this.f1340j).withValue(f1336z[5], this.f1339h).withValue(f1336z[2], this.f1337f).withValue(f1336z[4], this.f1338g).withValue(f1336z[3], this.f1341k);
    }

    /* renamed from: a */
    public Builder mo2460a(long j) {
        return super.mo2460a(j).withValue(f1336z[6], this.f1340j).withValue(f1336z[5], this.f1339h).withValue(f1336z[2], this.f1337f).withValue(f1336z[4], this.f1338g).withValue(f1336z[3], this.f1341k);
    }

    /* renamed from: a */
    protected final void m1966a(WDContactEmploi wDContactEmploi) {
        super.m1896a((C0571k) wDContactEmploi);
        this.f1340j = wDContactEmploi.f1340j;
        this.f1341k = wDContactEmploi.f1341k;
        this.f1339h = wDContactEmploi.f1339h;
        this.f1338g = wDContactEmploi.f1338g;
        this.f1337f = wDContactEmploi.f1337f;
    }

    /* renamed from: f */
    protected String mo2463f() {
        return f1336z[1];
    }

    public String getNomType() {
        return C0745b.m3220a(f1336z[0], new String[0]);
    }

    public WDObjet getProp(EWDPropriete eWDPropriete) {
        switch (C0580i.f1363a[eWDPropriete.ordinal()]) {
            case 1:
                return new WDChaine(m1960n());
            case 2:
                return new WDChaine(m1958j());
            case 3:
                return new WDChaine(m1957i());
            case 4:
                return new WDChaine(m1956h());
            case 5:
                return new WDChaine(m1959m());
            default:
                return super.getProp(eWDPropriete);
        }
    }

    /* renamed from: k */
    public EWDPropriete[] mo2439k() {
        return f1335i;
    }

    /* renamed from: l */
    protected int mo2440l() {
        return C0607n.Hx;
    }

    public void razVariable() {
        super.razVariable();
        this.f1340j = "";
        this.f1341k = "";
        this.f1339h = "";
        this.f1338g = "";
        this.f1337f = "";
    }

    public void release() {
        super.release();
        this.f1340j = null;
    }

    public void setProp(EWDPropriete eWDPropriete, WDObjet wDObjet) {
        switch (C0580i.f1363a[eWDPropriete.ordinal()]) {
            case 1:
                m1953d(wDObjet.getString());
                return;
            case 2:
                m1951b(wDObjet.getString());
                return;
            case 3:
                m1955f(wDObjet.getString());
                return;
            case 4:
                m1954e(wDObjet.getString());
                return;
            case 5:
                m1952c(wDObjet.getString());
                return;
            default:
                super.setProp(eWDPropriete, wDObjet);
                return;
        }
    }

    public void setProp(EWDPropriete eWDPropriete, String str) {
        switch (C0580i.f1363a[eWDPropriete.ordinal()]) {
            case 1:
                m1953d(str);
                return;
            case 2:
                m1951b(str);
                return;
            case 3:
                m1955f(str);
                return;
            case 4:
                m1954e(str);
                return;
            case 5:
                m1952c(str);
                return;
            default:
                super.setProp(eWDPropriete, str);
                return;
        }
    }

    public void setValeur(WDObjet wDObjet) {
        WDContactEmploi wDContactEmploi = (WDContactEmploi) wDObjet.checkType(WDContactEmploi.class);
        if (wDContactEmploi != null) {
            m1966a(wDContactEmploi);
        } else {
            super.setValeur(wDObjet);
        }
    }
}
