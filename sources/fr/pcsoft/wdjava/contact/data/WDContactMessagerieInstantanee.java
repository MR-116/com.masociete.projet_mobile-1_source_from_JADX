package fr.pcsoft.wdjava.contact.data;

import android.content.ContentProviderOperation.Builder;
import android.database.Cursor;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.database.p048a.C0830a;

public class WDContactMessagerieInstantanee extends C0571k {
    /* renamed from: g */
    public static final EWDPropriete[] f1345g = new EWDPropriete[]{EWDPropriete.PROP_TYPE, EWDPropriete.PROP_ETIQUETTE, EWDPropriete.PROP_ADRESSE, EWDPropriete.PROP_PROTOCOLE};
    /* renamed from: z */
    private static final String[] f1346z = new String[]{m1985z(m1986z(".\u0010i_\nL\u001ai^\u0010H\u0002eB\nY\u001cbX\u0018C\u0018i")), m1985z(m1986z("i<Xml")), m1985z(m1986z("i<Xmh")), m1985z(m1986z("{3H\"8c9^c0isOy+~2^\"0y8A#0`"))};
    /* renamed from: f */
    private int f1347f;
    /* renamed from: h */
    private String f1348h;

    public WDContactMessagerieInstantanee() {
        this.f1348h = "";
        this.f1347f = 5;
        this.e = 1;
    }

    public WDContactMessagerieInstantanee(Cursor cursor) {
        super(cursor);
        this.f1348h = "";
        this.f1347f = 5;
        this.f1348h = C0830a.m4260b(cursor, f1346z[2]);
        this.f1347f = m1991c(C0830a.m4262d(cursor, f1346z[1]));
    }

    /* renamed from: b */
    private final void m1981b(int i) {
        if (this.f1347f != i) {
            this.f1347f = m1991c(i);
            this.c = true;
        }
    }

    /* renamed from: b */
    private final void m1982b(String str) {
        if (!this.f1348h.equals(str)) {
            this.f1348h = str;
            this.c = true;
        }
    }

    /* renamed from: h */
    private final String m1983h() {
        return this.f1348h;
    }

    /* renamed from: i */
    private final int m1984i() {
        return this.f1347f;
    }

    /* renamed from: z */
    private static String m1985z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 13;
                    break;
                case 1:
                    i2 = 93;
                    break;
                case 2:
                    i2 = 44;
                    break;
                case 3:
                    i2 = 12;
                    break;
                default:
                    i2 = 89;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1986z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 89);
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
        return super.mo2459a().withValue(f1346z[2], this.f1348h).withValue(f1346z[1], Integer.valueOf(this.f1347f));
    }

    /* renamed from: a */
    public Builder mo2460a(long j) {
        return super.mo2460a(j).withValue(f1346z[2], this.f1348h).withValue(f1346z[1], Integer.valueOf(this.f1347f));
    }

    /* renamed from: a */
    protected final void m1990a(WDContactMessagerieInstantanee wDContactMessagerieInstantanee) {
        super.m1896a((C0571k) wDContactMessagerieInstantanee);
        this.f1348h = wDContactMessagerieInstantanee.f1348h;
        this.f1347f = wDContactMessagerieInstantanee.f1347f;
    }

    /* renamed from: c */
    protected final int m1991c(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
                return i;
            default:
                return -1;
        }
    }

    /* renamed from: f */
    protected String mo2463f() {
        return f1346z[3];
    }

    public String getNomType() {
        return C0745b.m3220a(f1346z[0], new String[0]);
    }

    public WDObjet getProp(EWDPropriete eWDPropriete) {
        switch (C0575d.f1358a[eWDPropriete.ordinal()]) {
            case 1:
                return new WDChaine(m1983h());
            case 2:
                return new WDChaine(m1984i());
            default:
                return super.getProp(eWDPropriete);
        }
    }

    public WDObjet getValeur() {
        return getProp(EWDPropriete.PROP_ADRESSE);
    }

    /* renamed from: k */
    public EWDPropriete[] mo2439k() {
        return f1345g;
    }

    /* renamed from: l */
    protected int mo2440l() {
        return C0607n.bn;
    }

    public void razVariable() {
        super.razVariable();
        this.f1348h = "";
        this.f1347f = 5;
    }

    public void release() {
        super.release();
        this.f1348h = null;
    }

    public void setProp(EWDPropriete eWDPropriete, int i) {
        switch (C0575d.f1358a[eWDPropriete.ordinal()]) {
            case 2:
                m1981b(i);
                return;
            default:
                super.setProp(eWDPropriete, i);
                return;
        }
    }

    public void setProp(EWDPropriete eWDPropriete, WDObjet wDObjet) {
        switch (C0575d.f1358a[eWDPropriete.ordinal()]) {
            case 1:
                m1982b(wDObjet.getString());
                return;
            case 2:
                m1981b(wDObjet.getInt());
                return;
            default:
                super.setProp(eWDPropriete, wDObjet);
                return;
        }
    }

    public void setProp(EWDPropriete eWDPropriete, String str) {
        switch (C0575d.f1358a[eWDPropriete.ordinal()]) {
            case 1:
                m1982b(str);
                return;
            default:
                super.setProp(eWDPropriete, str);
                return;
        }
    }

    public void setValeur(WDObjet wDObjet) {
        WDContactMessagerieInstantanee wDContactMessagerieInstantanee = (WDContactMessagerieInstantanee) wDObjet.checkType(WDContactMessagerieInstantanee.class);
        if (wDContactMessagerieInstantanee != null) {
            m1990a(wDContactMessagerieInstantanee);
        } else {
            setProp(EWDPropriete.PROP_ADRESSE, wDObjet);
        }
    }
}
