package fr.pcsoft.wdjava.geo;

import android.location.Address;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.poo.C0560r;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDEntier4;

public class WDAdresse extends C0560r implements C0909c {
    /* renamed from: b */
    public static final EWDPropriete[] f2468b = new EWDPropriete[]{EWDPropriete.PROP_RUE, EWDPropriete.PROP_VILLE, EWDPropriete.PROP_CODEPOSTAL, EWDPropriete.PROP_REGION, EWDPropriete.PROP_PAYS, EWDPropriete.PROP_POSITION, EWDPropriete.PROP_TYPE, EWDPropriete.PROP_ETIQUETTE};
    /* renamed from: z */
    private static final String[] f2469z = new String[]{m6451z(m6452z("s$ >H\u0011&*4L")), m6451z(m6452z("s++3[\u00039*")), m6451z(m6452z("|J")), m6451z(m6452z("s-*.N\u001f9&5W\u001f$")), m6451z(m6452z("s) /H\u00158<(Q\u001e5&,N\u001f9<(\\\u001c/"))};
    /* renamed from: c */
    private String f2470c;
    /* renamed from: d */
    private String f2471d;
    /* renamed from: e */
    private String f2472e;
    /* renamed from: f */
    private String f2473f;
    /* renamed from: g */
    private int f2474g;
    /* renamed from: h */
    private String f2475h;
    /* renamed from: i */
    private WDGeoPosition f2476i;
    /* renamed from: j */
    private String f2477j;

    public WDAdresse() {
        this.f2475h = "";
        this.f2471d = "";
        this.f2470c = "";
        this.f2472e = "";
        this.f2473f = "";
        this.f2476i = null;
        this.f2474g = 1;
        this.f2477j = "";
        this.f2476i = new WDGeoPosition();
    }

    public WDAdresse(Address address) {
        this.f2475h = "";
        this.f2471d = "";
        this.f2470c = "";
        this.f2472e = "";
        this.f2473f = "";
        this.f2476i = null;
        this.f2474g = 1;
        this.f2477j = "";
        this.f2475h = address.getThoroughfare();
        this.f2471d = address.getLocality();
        this.f2470c = address.getPostalCode();
        this.f2472e = address.getAdminArea();
        this.f2473f = address.getCountryName();
        this.f2476i = new WDGeoPosition(address.getLatitude(), address.getLongitude());
    }

    /* renamed from: a */
    private final WDChaine m6437a() {
        return new WDChaine(this.f2473f);
    }

    /* renamed from: a */
    private final void m6438a(WDObjet wDObjet) {
        WDGeoPosition wDGeoPosition = (WDGeoPosition) wDObjet.checkType(WDGeoPosition.class);
        if (wDGeoPosition != null) {
            this.f2476i.setValeur(wDGeoPosition);
            return;
        }
        WDErreurManager.m2883a(C0745b.m3222b(f2469z[4], wDObjet.getValeur().getNomType(), C0745b.m3220a(f2469z[3], new String[0])));
    }

    /* renamed from: a */
    private final void m6439a(String str) {
        this.f2477j = str;
    }

    /* renamed from: b */
    private final WDChaine m6440b() {
        return new WDChaine(this.f2472e);
    }

    /* renamed from: b */
    private final void m6441b(String str) {
        this.f2473f = str;
    }

    /* renamed from: c */
    private final String m6442c() {
        return this.f2477j;
    }

    /* renamed from: c */
    private final void m6443c(String str) {
        this.f2472e = str;
    }

    /* renamed from: d */
    private final WDObjet m6444d() {
        return this.f2476i != null ? this.f2476i : WDObjet.NULL;
    }

    /* renamed from: d */
    private final void m6445d(String str) {
        this.f2475h = str;
    }

    /* renamed from: e */
    private final WDChaine m6446e() {
        return new WDChaine(this.f2471d);
    }

    /* renamed from: e */
    private final void m6447e(String str) {
        this.f2471d = str;
    }

    /* renamed from: f */
    private final WDChaine m6448f() {
        return new WDChaine(this.f2470c);
    }

    /* renamed from: f */
    private final void m6449f(String str) {
        this.f2470c = str;
    }

    /* renamed from: g */
    private final WDChaine m6450g() {
        return new WDChaine(this.f2475h);
    }

    /* renamed from: z */
    private static String m6451z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 80;
                    break;
                case 1:
                    i2 = 106;
                    break;
                case 2:
                    i2 = 111;
                    break;
                case 3:
                    i2 = 97;
                    break;
                default:
                    i2 = 30;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m6452z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 30);
        }
        return toCharArray;
    }

    public WDObjet getClone() {
        WDAdresse wDAdresse = (WDAdresse) super.getClone();
        wDAdresse.f2476i = (WDGeoPosition) this.f2476i.getClone();
        return wDAdresse;
    }

    public String getNomType() {
        return C0745b.m3220a(f2469z[1], new String[0]);
    }

    public WDObjet getProp(EWDPropriete eWDPropriete) {
        switch (C0917h.f2503a[eWDPropriete.ordinal()]) {
            case 1:
                return m6450g();
            case 2:
                return m6446e();
            case 3:
                return m6448f();
            case 4:
                return m6440b();
            case 5:
                return m6437a();
            case 6:
                return m6444d();
            case 7:
                return new WDChaine(m6442c());
            case 8:
                return new WDChaine(getType());
            default:
                return super.getProp(eWDPropriete);
        }
    }

    public WDObjet getType() {
        return new WDEntier4(this.f2474g);
    }

    public WDObjet getValeur() {
        WDErreurManager.m2883a(C0745b.m3222b(f2469z[0], getNomType()));
        return null;
    }

    /* renamed from: h */
    public final String m6453h() {
        StringBuilder stringBuilder = new StringBuilder();
        if (!this.f2475h.equals("")) {
            stringBuilder.append(this.f2475h);
        }
        if (!this.f2471d.equals("")) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append(f2469z[2]);
            }
            stringBuilder.append(this.f2471d);
        }
        if (!this.f2470c.equals("")) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append(f2469z[2]);
            }
            stringBuilder.append(this.f2470c);
        }
        if (!this.f2472e.equals("")) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append(f2469z[2]);
            }
            stringBuilder.append(this.f2472e);
        }
        if (!this.f2473f.equals("")) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append(f2469z[2]);
            }
            stringBuilder.append(this.f2473f);
        }
        return stringBuilder.toString();
    }

    public boolean isEvaluable() {
        return false;
    }

    /* renamed from: k */
    public EWDPropriete[] mo2439k() {
        return f2468b;
    }

    /* renamed from: l */
    protected int mo2440l() {
        return C0607n.sc;
    }

    public void razVariable() {
        this.f2475h = "";
        this.f2471d = "";
        this.f2470c = "";
        this.f2472e = "";
        this.f2473f = "";
        if (this.f2476i != null) {
            this.f2476i.razVariable();
        }
    }

    public void release() {
        this.f2475h = null;
        this.f2471d = null;
        this.f2470c = null;
        this.f2472e = null;
        this.f2473f = null;
        if (this.f2476i != null) {
            this.f2476i.release();
            this.f2476i = null;
        }
    }

    public void setProp(EWDPropriete eWDPropriete, WDObjet wDObjet) {
        switch (C0917h.f2503a[eWDPropriete.ordinal()]) {
            case 1:
                m6445d(wDObjet.getString());
                return;
            case 2:
                m6447e(wDObjet.getString());
                return;
            case 3:
                m6449f(wDObjet.getString());
                return;
            case 4:
                m6443c(wDObjet.getString());
                return;
            case 5:
                m6441b(wDObjet.getString());
                return;
            case 6:
                m6438a(wDObjet);
                return;
            case 7:
                m6439a(wDObjet.getString());
                return;
            case 8:
                setType(wDObjet.getInt());
                return;
            default:
                super.setProp(eWDPropriete, wDObjet);
                return;
        }
    }

    protected void setPropInt(EWDPropriete eWDPropriete, int i) {
        switch (C0917h.f2503a[eWDPropriete.ordinal()]) {
            case 8:
                setType(i);
                return;
            default:
                super.setPropInt(eWDPropriete, i);
                return;
        }
    }

    protected void setPropString(EWDPropriete eWDPropriete, String str) {
        switch (C0917h.f2503a[eWDPropriete.ordinal()]) {
            case 1:
                m6445d(str);
                return;
            case 2:
                m6447e(str);
                return;
            case 3:
                m6449f(str);
                return;
            case 4:
                m6443c(str);
                return;
            case 5:
                m6441b(str);
                return;
            case 7:
                m6439a(str);
                return;
            default:
                super.setPropString(eWDPropriete, str);
                return;
        }
    }

    public void setType(int i) {
        this.f2474g = i;
    }

    public void setValeur(WDObjet wDObjet) {
        WDAdresse wDAdresse = (WDAdresse) wDObjet.checkType(WDAdresse.class);
        if (wDAdresse != null) {
            this.f2475h = wDAdresse.f2475h;
            this.f2471d = wDAdresse.f2471d;
            this.f2470c = wDAdresse.f2470c;
            this.f2472e = wDAdresse.f2472e;
            this.f2473f = wDAdresse.f2473f;
            this.f2476i.setValeur(wDAdresse.f2476i);
            return;
        }
        super.setValeur(wDObjet);
    }
}
