package fr.pcsoft.wdjava.contact.data;

import android.content.ContentProviderOperation.Builder;
import android.database.Cursor;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.database.p048a.C0830a;

public class WDContactAdresseWeb extends C0571k {
    /* renamed from: f */
    public static final EWDPropriete[] f1332f = new EWDPropriete[]{EWDPropriete.PROP_TYPE, EWDPropriete.PROP_ETIQUETTE, EWDPropriete.PROP_ADRESSE};
    /* renamed from: z */
    private static final String[] f1333z = new String[]{m1942z(m1943z(" \u0019\u0011?LP\u000b\u00102^F\u001a")), m1942z(m1943z("g9!\f8")), m1942z(m1943z("u61Chm<'\u0002`gv6\u0018{p7'C`w=8B~f:&\u0004}f"))};
    /* renamed from: g */
    private String f1334g;

    public WDContactAdresseWeb() {
        this.f1334g = "";
        this.e = 4;
    }

    public WDContactAdresseWeb(Cursor cursor) {
        super(cursor);
        this.f1334g = "";
        this.f1334g = C0830a.m4260b(cursor, f1333z[1]);
    }

    /* renamed from: b */
    private final void m1940b(String str) {
        if (!this.f1334g.equals(str)) {
            this.f1334g = str;
            this.c = true;
        }
    }

    /* renamed from: h */
    private final String m1941h() {
        return this.f1334g;
    }

    /* renamed from: z */
    private static String m1942z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 3;
                    break;
                case 1:
                    i2 = 88;
                    break;
                case 2:
                    i2 = 85;
                    break;
                case 3:
                    i2 = 109;
                    break;
                default:
                    i2 = 9;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1943z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 9);
        }
        return toCharArray;
    }

    /* renamed from: a */
    protected int mo2462a(int i) {
        switch (i) {
            case 0:
            case 5:
            case 6:
                return i;
            case 1:
            case 2:
            case 3:
            case 4:
                return 4;
            default:
                return 7;
        }
    }

    /* renamed from: a */
    public Builder mo2459a() {
        return super.mo2459a().withValue(f1333z[1], this.f1334g);
    }

    /* renamed from: a */
    public Builder mo2460a(long j) {
        return super.mo2460a(j).withValue(f1333z[1], this.f1334g);
    }

    /* renamed from: a */
    protected final void m1947a(WDContactAdresseWeb wDContactAdresseWeb) {
        super.m1896a((C0571k) wDContactAdresseWeb);
        this.f1334g = wDContactAdresseWeb.f1334g;
    }

    /* renamed from: f */
    protected String mo2463f() {
        return f1333z[2];
    }

    public String getNomType() {
        return C0745b.m3220a(f1333z[0], new String[0]);
    }

    public WDObjet getProp(EWDPropriete eWDPropriete) {
        switch (C0574c.f1357a[eWDPropriete.ordinal()]) {
            case 1:
                return new WDChaine(m1941h());
            default:
                return super.getProp(eWDPropriete);
        }
    }

    public WDObjet getValeur() {
        return getProp(EWDPropriete.PROP_ADRESSE);
    }

    /* renamed from: k */
    public EWDPropriete[] mo2439k() {
        return f1332f;
    }

    /* renamed from: l */
    protected int mo2440l() {
        return C0607n.Mw;
    }

    public void razVariable() {
        super.razVariable();
        this.f1334g = "";
    }

    public void release() {
        super.release();
        this.f1334g = null;
    }

    public void setProp(EWDPropriete eWDPropriete, WDObjet wDObjet) {
        switch (C0574c.f1357a[eWDPropriete.ordinal()]) {
            case 1:
                m1940b(wDObjet.getString());
                return;
            default:
                super.setProp(eWDPropriete, wDObjet);
                return;
        }
    }

    public void setProp(EWDPropriete eWDPropriete, String str) {
        switch (C0574c.f1357a[eWDPropriete.ordinal()]) {
            case 1:
                m1940b(str);
                return;
            default:
                super.setProp(eWDPropriete, str);
                return;
        }
    }

    public void setValeur(WDObjet wDObjet) {
        WDContactAdresseWeb wDContactAdresseWeb = (WDContactAdresseWeb) wDObjet.checkType(WDContactAdresseWeb.class);
        if (wDContactAdresseWeb != null) {
            m1947a(wDContactAdresseWeb);
        } else {
            setProp(EWDPropriete.PROP_ADRESSE, wDObjet);
        }
    }
}
