package fr.pcsoft.wdjava.contact.data;

import android.content.ContentProviderOperation.Builder;
import android.database.Cursor;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.database.p048a.C0830a;

public class WDContactTelephone extends C0571k {
    /* renamed from: g */
    public static final EWDPropriete[] f1352g = new EWDPropriete[]{EWDPropriete.PROP_TYPE, EWDPropriete.PROP_ETIQUETTE, EWDPropriete.PROP_NUMERO};
    /* renamed from: z */
    private static final String[] f1353z = new String[]{m2005z(m2006z("\u0007NE\u0017x")), m2005z(m2006z("@{t:\f3g~8\f")), m2005z(m2006z("\u0015AUX(\rKC\u0019 \u0007\u0001R\u0003;\u0010@CX \u0017J\\Y9\u000b@_\u0013\u0016\u0015\u001d"))};
    /* renamed from: f */
    private String f1354f;

    public WDContactTelephone() {
        this.f1354f = "";
        this.e = 1;
    }

    public WDContactTelephone(Cursor cursor) {
        super(cursor);
        this.f1354f = "";
        this.f1354f = C0830a.m4260b(cursor, f1353z[0]);
    }

    /* renamed from: b */
    private final void m2003b(String str) {
        if (!this.f1354f.equals(str)) {
            this.f1354f = str;
            this.c = true;
        }
    }

    /* renamed from: h */
    private final String m2004h() {
        return this.f1354f;
    }

    /* renamed from: z */
    private static String m2005z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 99;
                    break;
                case 1:
                    i2 = 47;
                    break;
                case 2:
                    i2 = 49;
                    break;
                case 3:
                    i2 = 118;
                    break;
                default:
                    i2 = 73;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2006z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 73);
        }
        return toCharArray;
    }

    /* renamed from: a */
    protected int mo2462a(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 9:
            case 17:
                return i;
            default:
                return 7;
        }
    }

    /* renamed from: a */
    public Builder mo2459a() {
        return super.mo2459a().withValue(f1353z[0], this.f1354f);
    }

    /* renamed from: a */
    public Builder mo2460a(long j) {
        return super.mo2460a(j).withValue(f1353z[0], this.f1354f);
    }

    /* renamed from: a */
    protected final void m2010a(WDContactTelephone wDContactTelephone) {
        super.m1896a((C0571k) wDContactTelephone);
        this.f1354f = wDContactTelephone.f1354f;
    }

    /* renamed from: f */
    protected String mo2463f() {
        return f1353z[2];
    }

    public String getNomType() {
        return C0745b.m3220a(f1353z[1], new String[0]);
    }

    public WDObjet getProp(EWDPropriete eWDPropriete) {
        switch (C0572a.f1355a[eWDPropriete.ordinal()]) {
            case 1:
                return new WDChaine(m2004h());
            default:
                return super.getProp(eWDPropriete);
        }
    }

    public WDObjet getValeur() {
        return getProp(EWDPropriete.PROP_NUMERO);
    }

    /* renamed from: k */
    public EWDPropriete[] mo2439k() {
        return f1352g;
    }

    /* renamed from: l */
    protected int mo2440l() {
        return C0607n.Nc;
    }

    public void razVariable() {
        super.razVariable();
        this.f1354f = "";
    }

    public void release() {
        super.release();
        this.f1354f = null;
    }

    public void setProp(EWDPropriete eWDPropriete, WDObjet wDObjet) {
        switch (C0572a.f1355a[eWDPropriete.ordinal()]) {
            case 1:
                m2003b(wDObjet.getString());
                return;
            default:
                super.setProp(eWDPropriete, wDObjet);
                return;
        }
    }

    public void setProp(EWDPropriete eWDPropriete, String str) {
        switch (C0572a.f1355a[eWDPropriete.ordinal()]) {
            case 1:
                m2003b(str);
                return;
            default:
                super.setProp(eWDPropriete, str);
                return;
        }
    }

    public void setValeur(WDObjet wDObjet) {
        WDContactTelephone wDContactTelephone = (WDContactTelephone) wDObjet.checkType(WDContactTelephone.class);
        if (wDContactTelephone != null) {
            m2010a(wDContactTelephone);
        } else {
            setProp(EWDPropriete.PROP_NUMERO, wDObjet);
        }
    }
}
