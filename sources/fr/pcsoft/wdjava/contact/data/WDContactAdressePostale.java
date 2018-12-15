package fr.pcsoft.wdjava.contact.data;

import android.content.ContentProviderOperation.Builder;
import android.database.Cursor;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.database.p048a.C0830a;

public class WDContactAdressePostale extends C0571k {
    /* renamed from: h */
    public static final EWDPropriete[] f1321h = new EWDPropriete[]{EWDPropriete.PROP_RUE, EWDPropriete.PROP_VILLE, EWDPropriete.PROP_CODEPOSTAL, EWDPropriete.PROP_REGION, EWDPropriete.PROP_PAYS, EWDPropriete.PROP_POSITION, EWDPropriete.PROP_TYPE, EWDPropriete.PROP_ETIQUETTE};
    /* renamed from: z */
    private static final String[] f1322z = new String[]{m1920z(m1921z("Pa\"\u001aGHk4[OB!%ATU`4\u001aORj+\u001bVI|2UJ\u000bn\"PTC|5kP\u0014")), m1920z(m1921z("Bn2U\u0011")), m1920z(m1921z("Bn2U\u0012")), m1920z(m1921z("Bn2U\u001f")), m1920z(m1921z("Bn2U\u0017\u0016")), m1920z(m1921z("Bn2U\u001e")), m1920z(m1921z("\u0005A\tkpgC\u0003at")), m1920z(m1921z("@}hDEU` @\bQk,UPG!!QI\bX\u0002sCI_)GORf)Z")), m1920z(m1921z("rv6Q\u0006aæ)dIUf2]IH/([H\u0006{4[SPæh")), m1920z(m1921z("\u0005N\u0002fcu\\\u0003"))};
    /* renamed from: f */
    private WDObjet f1323f;
    /* renamed from: g */
    private String f1324g;
    /* renamed from: i */
    private String f1325i;
    /* renamed from: j */
    private String f1326j;
    /* renamed from: k */
    private String f1327k;
    /* renamed from: l */
    private String f1328l;

    public WDContactAdressePostale() {
        this.f1326j = "";
        this.f1324g = "";
        this.f1327k = "";
        this.f1328l = "";
        this.f1325i = "";
        this.f1323f = null;
        this.e = 1;
    }

    public WDContactAdressePostale(Cursor cursor) {
        super(cursor);
        this.f1326j = "";
        this.f1324g = "";
        this.f1327k = "";
        this.f1328l = "";
        this.f1325i = "";
        this.f1323f = null;
        this.f1326j = C0830a.m4260b(cursor, f1322z[2]);
        this.f1324g = C0830a.m4260b(cursor, f1322z[1]);
        this.f1327k = C0830a.m4260b(cursor, f1322z[3]);
        this.f1328l = C0830a.m4260b(cursor, f1322z[5]);
        this.f1325i = C0830a.m4260b(cursor, f1322z[4]);
    }

    /* renamed from: a */
    private final void m1908a(WDObjet wDObjet) {
    }

    /* renamed from: b */
    private final void m1909b(String str) {
        this.f1324g = str;
    }

    /* renamed from: c */
    private final void m1910c(String str) {
        this.f1328l = str;
    }

    /* renamed from: d */
    private final void m1911d(String str) {
        this.f1327k = str;
    }

    /* renamed from: e */
    private final void m1912e(String str) {
        this.f1326j = str;
    }

    /* renamed from: f */
    private final void m1913f(String str) {
        this.f1325i = str;
    }

    /* renamed from: h */
    private final WDChaine m1914h() {
        return new WDChaine(this.f1328l);
    }

    /* renamed from: i */
    private final WDChaine m1915i() {
        return new WDChaine(this.f1326j);
    }

    /* renamed from: j */
    private final WDChaine m1916j() {
        return new WDChaine(this.f1325i);
    }

    /* renamed from: m */
    private final WDChaine m1917m() {
        return new WDChaine(this.f1327k);
    }

    /* renamed from: n */
    private final WDObjet m1918n() {
        try {
            if (this.f1323f == null) {
                this.f1323f = (WDObjet) Class.forName(f1322z[7]).newInstance();
            }
        } catch (Exception e) {
            C0691a.m2857a(f1322z[8], e);
            this.f1323f = WDObjet.NULL;
        }
        return this.f1323f;
    }

    /* renamed from: o */
    private final WDChaine m1919o() {
        return new WDChaine(this.f1324g);
    }

    /* renamed from: z */
    private static String m1920z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 38;
                    break;
                case 1:
                    i2 = 15;
                    break;
                case 2:
                    i2 = 70;
                    break;
                case 3:
                    i2 = 52;
                    break;
                default:
                    i2 = 38;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1921z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 38);
        }
        return toCharArray;
    }

    /* renamed from: a */
    protected int mo2462a(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
                return i;
            default:
                return 3;
        }
    }

    /* renamed from: a */
    public Builder mo2459a() {
        return super.mo2459a().withValue(f1322z[2], this.f1326j).withValue(f1322z[1], this.f1324g).withValue(f1322z[3], this.f1327k).withValue(f1322z[5], this.f1328l).withValue(f1322z[5], this.f1325i);
    }

    /* renamed from: a */
    public Builder mo2460a(long j) {
        return super.mo2460a(j).withValue(f1322z[2], this.f1326j).withValue(f1322z[1], this.f1324g).withValue(f1322z[3], this.f1327k).withValue(f1322z[5], this.f1328l).withValue(f1322z[5], this.f1325i);
    }

    /* renamed from: a */
    protected final void m1925a(WDContactAdressePostale wDContactAdressePostale) {
        super.m1896a((C0571k) wDContactAdressePostale);
        this.f1326j = wDContactAdressePostale.f1326j;
        this.f1324g = wDContactAdressePostale.f1324g;
        this.f1327k = wDContactAdressePostale.f1327k;
        this.f1328l = wDContactAdressePostale.f1328l;
        this.f1325i = wDContactAdressePostale.f1325i;
    }

    /* renamed from: f */
    protected String mo2463f() {
        return f1322z[0];
    }

    public String getNomType() {
        return C0745b.m3220a(f1322z[9], new String[0]);
    }

    public WDObjet getProp(EWDPropriete eWDPropriete) {
        switch (C0573b.f1356a[eWDPropriete.ordinal()]) {
            case 1:
                return m1915i();
            case 2:
                return m1919o();
            case 3:
                return m1917m();
            case 4:
                return m1914h();
            case 5:
                return m1916j();
            case 6:
                return m1918n();
            default:
                return super.getProp(eWDPropriete);
        }
    }

    public WDObjet getValeur() {
        WDErreurManager.m2883a(C0745b.m3222b(f1322z[6], getNomType()));
        return null;
    }

    /* renamed from: k */
    public EWDPropriete[] mo2439k() {
        return f1321h;
    }

    /* renamed from: l */
    protected int mo2440l() {
        return C0607n.sc;
    }

    public void razVariable() {
        super.razVariable();
        this.f1326j = "";
        this.f1324g = "";
        this.f1327k = "";
        this.f1328l = "";
        this.f1325i = "";
    }

    public void release() {
        super.release();
        this.f1326j = null;
        this.f1324g = null;
        this.f1327k = null;
        this.f1328l = null;
        this.f1325i = null;
    }

    public void setProp(EWDPropriete eWDPropriete, WDObjet wDObjet) {
        switch (C0573b.f1356a[eWDPropriete.ordinal()]) {
            case 1:
                m1912e(wDObjet.getString());
                return;
            case 2:
                m1909b(wDObjet.getString());
                return;
            case 3:
                m1911d(wDObjet.getString());
                return;
            case 4:
                m1910c(wDObjet.getString());
                return;
            case 5:
                m1913f(wDObjet.getString());
                return;
            case 6:
                m1908a(wDObjet);
                return;
            default:
                super.setProp(eWDPropriete, wDObjet);
                return;
        }
    }

    protected void setPropString(EWDPropriete eWDPropriete, String str) {
        switch (C0573b.f1356a[eWDPropriete.ordinal()]) {
            case 1:
                m1912e(str);
                return;
            case 2:
                m1909b(str);
                return;
            case 3:
                m1911d(str);
                return;
            case 4:
                m1910c(str);
                return;
            case 5:
                m1913f(str);
                return;
            default:
                super.setPropString(eWDPropriete, str);
                return;
        }
    }

    public void setValeur(WDObjet wDObjet) {
        WDContactAdressePostale wDContactAdressePostale = (WDContactAdressePostale) wDObjet.checkType(WDContactAdressePostale.class);
        if (wDContactAdressePostale != null) {
            m1925a(wDContactAdressePostale);
        } else {
            super.setValeur(wDObjet);
        }
    }
}
