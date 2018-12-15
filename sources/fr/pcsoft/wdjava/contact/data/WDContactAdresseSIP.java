package fr.pcsoft.wdjava.contact.data;

import android.content.ContentProviderOperation.Builder;
import android.database.Cursor;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.database.p048a.C0830a;

public class WDContactAdresseSIP extends C0571k {
    /* renamed from: f */
    public static final EWDPropriete[] f1329f = new EWDPropriete[]{EWDPropriete.PROP_TYPE, EWDPropriete.PROP_ETIQUETTE, EWDPropriete.PROP_ADRESSE};
    /* renamed from: z */
    private static final String[] f1330z = new String[]{m1931z(m1932z("}b\u000eBj")), m1931z(m1932z(":B>q\u001eJP?|\bPS")), m1931z(m1932z("om\u001e\r:wg\bL2}-\u0019V)jl\b\r2mf\u0017\f(ps%B?}q\u001fP("))};
    /* renamed from: g */
    private String f1331g;

    public WDContactAdresseSIP() {
        this.f1331g = "";
        this.e = 1;
    }

    public WDContactAdresseSIP(Cursor cursor) {
        super(cursor);
        this.f1331g = "";
        this.f1331g = C0830a.m4260b(cursor, f1330z[0]);
    }

    /* renamed from: b */
    private final void m1929b(String str) {
        if (!this.f1331g.equals(str)) {
            this.f1331g = str;
            this.c = true;
        }
    }

    /* renamed from: h */
    private final String m1930h() {
        return this.f1331g;
    }

    /* renamed from: z */
    private static String m1931z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 25;
                    break;
                case 1:
                    i2 = 3;
                    break;
                case 2:
                    i2 = 122;
                    break;
                case 3:
                    i2 = 35;
                    break;
                default:
                    i2 = 91;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1932z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 91);
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
        return super.mo2459a().withValue(f1330z[0], this.f1331g);
    }

    /* renamed from: a */
    public Builder mo2460a(long j) {
        return super.mo2460a(j).withValue(f1330z[0], this.f1331g);
    }

    /* renamed from: a */
    protected final void m1936a(WDContactAdresseSIP wDContactAdresseSIP) {
        super.m1896a((C0571k) wDContactAdresseSIP);
        this.f1331g = wDContactAdresseSIP.f1331g;
    }

    /* renamed from: f */
    protected String mo2463f() {
        return f1330z[2];
    }

    public String getNomType() {
        return C0745b.m3220a(f1330z[1], new String[0]);
    }

    public WDObjet getProp(EWDPropriete eWDPropriete) {
        switch (C0578g.f1361a[eWDPropriete.ordinal()]) {
            case 1:
                return new WDChaine(m1930h());
            default:
                return super.getProp(eWDPropriete);
        }
    }

    public WDObjet getValeur() {
        return getProp(EWDPropriete.PROP_ADRESSE);
    }

    /* renamed from: k */
    public EWDPropriete[] mo2439k() {
        return f1329f;
    }

    /* renamed from: l */
    protected int mo2440l() {
        return C0607n.yo;
    }

    public void razVariable() {
        super.razVariable();
        this.f1331g = "";
    }

    public void release() {
        super.release();
        this.f1331g = null;
    }

    public void setProp(EWDPropriete eWDPropriete, WDObjet wDObjet) {
        switch (C0578g.f1361a[eWDPropriete.ordinal()]) {
            case 1:
                m1929b(wDObjet.getString());
                return;
            default:
                super.setProp(eWDPropriete, wDObjet);
                return;
        }
    }

    public void setProp(EWDPropriete eWDPropriete, String str) {
        switch (C0578g.f1361a[eWDPropriete.ordinal()]) {
            case 1:
                m1929b(str);
                return;
            default:
                super.setProp(eWDPropriete, str);
                return;
        }
    }

    public void setValeur(WDObjet wDObjet) {
        WDContactAdresseSIP wDContactAdresseSIP = (WDContactAdresseSIP) wDObjet.checkType(WDContactAdresseSIP.class);
        if (wDContactAdresseSIP != null) {
            m1936a(wDContactAdresseSIP);
        } else {
            setProp(EWDPropriete.PROP_ADRESSE, wDObjet);
        }
    }
}
