package fr.pcsoft.wdjava.contact.data;

import android.content.ContentProviderOperation.Builder;
import android.database.Cursor;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.database.p048a.C0830a;

public class WDContactEvenement extends C0571k {
    /* renamed from: g */
    public static final EWDPropriete[] f1342g = new EWDPropriete[]{EWDPropriete.PROP_TYPE, EWDPropriete.PROP_ETIQUETTE, EWDPropriete.PROP_DATEBRUTE};
    /* renamed from: z */
    private static final String[] f1343z = new String[]{m1970z(m1971z("\u0002\u001b=|vd\u0013.wl")), m1970z(m1971z("E?\u001fX\t")), m1970z(m1971z("W0\u000f\u0017YO:\u0019VQEp\bLJR1\u0019\u0017QU;\u0006\u0016[N0\u001fX[U\u0001\u000eO]O*"))};
    /* renamed from: f */
    private String f1344f;

    public WDContactEvenement() {
        this.f1344f = "";
        this.e = 3;
    }

    public WDContactEvenement(Cursor cursor) {
        super(cursor);
        this.f1344f = "";
        this.f1344f = C0830a.m4260b(cursor, f1343z[1]);
    }

    /* renamed from: z */
    private static String m1970z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 33;
                    break;
                case 1:
                    i2 = 94;
                    break;
                case 2:
                    i2 = 107;
                    break;
                case 3:
                    i2 = 57;
                    break;
                default:
                    i2 = 56;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1971z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 56);
        }
        return toCharArray;
    }

    /* renamed from: a */
    protected int mo2462a(int i) {
        switch (i) {
            case 0:
            case 1:
            case 3:
                return i;
            default:
                return 2;
        }
    }

    /* renamed from: a */
    public Builder mo2459a() {
        return super.mo2459a().withValue(f1343z[1], this.f1344f);
    }

    /* renamed from: a */
    public Builder mo2460a(long j) {
        return super.mo2460a(j).withValue(f1343z[1], this.f1344f);
    }

    /* renamed from: a */
    protected final void m1975a(WDContactEvenement wDContactEvenement) {
        super.m1896a((C0571k) wDContactEvenement);
        this.f1344f = wDContactEvenement.f1344f;
    }

    /* renamed from: b */
    public void m1976b(String str) {
        if (!this.f1344f.equals(str)) {
            this.f1344f = str;
            this.c = true;
        }
    }

    /* renamed from: f */
    protected String mo2463f() {
        return f1343z[2];
    }

    public String getNomType() {
        return C0745b.m3220a(f1343z[0], new String[0]);
    }

    public WDObjet getProp(EWDPropriete eWDPropriete) {
        switch (C0577f.f1360a[eWDPropriete.ordinal()]) {
            case 1:
                return new WDChaine(m1978h());
            default:
                return super.getProp(eWDPropriete);
        }
    }

    public WDObjet getValeur() {
        return getProp(EWDPropriete.PROP_DATEBRUTE);
    }

    /* renamed from: h */
    public final String m1978h() {
        return this.f1344f;
    }

    /* renamed from: k */
    public EWDPropriete[] mo2439k() {
        return f1342g;
    }

    /* renamed from: l */
    protected int mo2440l() {
        return C0607n.So;
    }

    public void razVariable() {
        super.razVariable();
        this.f1344f = "";
    }

    public void release() {
        super.release();
        this.f1344f = null;
    }

    public void setProp(EWDPropriete eWDPropriete, WDObjet wDObjet) {
        switch (C0577f.f1360a[eWDPropriete.ordinal()]) {
            case 1:
                m1976b(wDObjet.getString());
                return;
            default:
                super.setProp(eWDPropriete, wDObjet);
                return;
        }
    }

    public void setProp(EWDPropriete eWDPropriete, String str) {
        switch (C0577f.f1360a[eWDPropriete.ordinal()]) {
            case 1:
                m1976b(str);
                return;
            default:
                super.setProp(eWDPropriete, str);
                return;
        }
    }

    public void setValeur(WDObjet wDObjet) {
        WDContactEvenement wDContactEvenement = (WDContactEvenement) wDObjet.checkType(WDContactEvenement.class);
        if (wDContactEvenement != null) {
            m1975a(wDContactEvenement);
        } else {
            setProp(EWDPropriete.PROP_DATEBRUTE, wDObjet);
        }
    }
}
