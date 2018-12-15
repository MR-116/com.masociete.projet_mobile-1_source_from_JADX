package fr.pcsoft.wdjava.contact.data;

import android.content.ContentProviderOperation.Builder;
import android.database.Cursor;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.database.p048a.C0830a;

public class WDContactAdresseEmail extends C0571k {
    /* renamed from: g */
    public static final EWDPropriete[] f1318g = new EWDPropriete[]{EWDPropriete.PROP_TYPE, EWDPropriete.PROP_ETIQUETTE, EWDPropriete.PROP_ADRESSE};
    /* renamed from: z */
    private static final String[] f1319z = new String[]{m1899z(m1900z("<\u0007_Hh")), m1899z(m1900z(".\bO\u000786\u0002YF0<HH\\++\tY\u00070,\u0003F\u0006<5\u0007BE\u0006.T")), m1899z(m1900z("{'o{\u001c\u000b5nv\u001c\u0015'be"))};
    /* renamed from: f */
    private String f1320f;

    public WDContactAdresseEmail() {
        this.f1320f = "";
        this.e = 1;
    }

    public WDContactAdresseEmail(Cursor cursor) {
        super(cursor);
        this.f1320f = "";
        this.f1320f = C0830a.m4260b(cursor, f1319z[0]);
    }

    /* renamed from: b */
    private final void m1897b(String str) {
        if (!this.f1320f.equals(str)) {
            this.f1320f = str;
            this.c = true;
        }
    }

    /* renamed from: h */
    private final String m1898h() {
        return this.f1320f;
    }

    /* renamed from: z */
    private static String m1899z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 88;
                    break;
                case 1:
                    i2 = 102;
                    break;
                case 2:
                    i2 = 43;
                    break;
                case 3:
                    i2 = 41;
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
    private static char[] m1900z(String str) {
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
            case 4:
                return i;
            default:
                return 3;
        }
    }

    /* renamed from: a */
    public Builder mo2459a() {
        return super.mo2459a().withValue(f1319z[0], this.f1320f);
    }

    /* renamed from: a */
    public Builder mo2460a(long j) {
        return super.mo2460a(j).withValue(f1319z[0], this.f1320f);
    }

    /* renamed from: a */
    protected final void m1904a(WDContactAdresseEmail wDContactAdresseEmail) {
        super.m1896a((C0571k) wDContactAdresseEmail);
        this.f1320f = wDContactAdresseEmail.f1320f;
    }

    /* renamed from: f */
    protected String mo2463f() {
        return f1319z[1];
    }

    public String getNomType() {
        return C0745b.m3220a(f1319z[2], new String[0]);
    }

    public WDObjet getProp(EWDPropriete eWDPropriete) {
        switch (C0579h.f1362a[eWDPropriete.ordinal()]) {
            case 1:
                return new WDChaine(m1898h());
            default:
                return super.getProp(eWDPropriete);
        }
    }

    public WDObjet getValeur() {
        return getProp(EWDPropriete.PROP_ADRESSE);
    }

    /* renamed from: k */
    public EWDPropriete[] mo2439k() {
        return f1318g;
    }

    /* renamed from: l */
    protected int mo2440l() {
        return C0607n.Jx;
    }

    public void razVariable() {
        super.razVariable();
        this.f1320f = "";
    }

    public void release() {
        super.release();
        this.f1320f = null;
    }

    public void setProp(EWDPropriete eWDPropriete, WDObjet wDObjet) {
        switch (C0579h.f1362a[eWDPropriete.ordinal()]) {
            case 1:
                m1897b(wDObjet.getString());
                return;
            default:
                super.setProp(eWDPropriete, wDObjet);
                return;
        }
    }

    public void setProp(EWDPropriete eWDPropriete, String str) {
        switch (C0579h.f1362a[eWDPropriete.ordinal()]) {
            case 1:
                m1897b(str);
                return;
            default:
                super.setProp(eWDPropriete, str);
                return;
        }
    }

    public void setValeur(WDObjet wDObjet) {
        WDContactAdresseEmail wDContactAdresseEmail = (WDContactAdresseEmail) wDObjet.checkType(WDContactAdresseEmail.class);
        if (wDContactAdresseEmail != null) {
            m1904a(wDContactAdresseEmail);
        } else {
            setProp(EWDPropriete.PROP_ADRESSE, wDObjet);
        }
    }
}
