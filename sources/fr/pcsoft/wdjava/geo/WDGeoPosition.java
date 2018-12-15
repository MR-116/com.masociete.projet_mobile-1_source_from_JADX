package fr.pcsoft.wdjava.geo;

import android.location.Location;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.poo.C0560r;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDDateHeure;
import fr.pcsoft.wdjava.core.types.WDReel;
import java.util.Date;

public class WDGeoPosition extends C0560r {
    /* renamed from: c */
    private static final double f2478c = 0.621371192d;
    /* renamed from: d */
    public static final EWDPropriete[] f2479d = new EWDPropriete[]{EWDPropriete.PROP_LATITUDE, EWDPropriete.PROP_LONGITUDE, EWDPropriete.PROP_ALTITUDE, EWDPropriete.PROP_ALTITUDEVALIDE, EWDPropriete.PROP_DIRECTION, EWDPropriete.PROP_DIRECTIONVALIDE, EWDPropriete.PROP_PRECISION, EWDPropriete.PROP_PRECISIONVALIDE, EWDPropriete.PROP_VITESSE, EWDPropriete.PROP_VITESSEVALIDE, EWDPropriete.PROP_DATEMESURE, EWDPropriete.PROP_POSITIONVALIDE};
    /* renamed from: z */
    private static final String[] f2480z = new String[]{m6468z(m6469z("\u001b\u000b\n,dy\t\u0000&`")), m6468z(m6469z("\u001b\u0015\u0017<bj\f\u0000'wg\t\u00000fm\u0017\u0000,a}\u0010\t6")), m6468z(m6469z("_56")), m6468z(m6469z("\u001b\u0002\u0000<bw\u0016\f'{w\u000b")), m6468z(m6469z("\bku_\u0002\u0016u"))};
    /* renamed from: b */
    private Location f2481b;
    /* renamed from: e */
    private boolean f2482e;

    public WDGeoPosition() {
        this(null);
    }

    public WDGeoPosition(double d, double d2) {
        this(null);
        this.f2481b.setLatitude(d);
        this.f2481b.setLongitude(d2);
        this.f2482e = true;
    }

    public WDGeoPosition(Location location) {
        this.f2481b = null;
        this.f2482e = false;
        if (location == null) {
            location = new Location(f2480z[2]);
        } else {
            this.f2482e = true;
        }
        this.f2481b = location;
    }

    /* renamed from: a */
    private final void m6456a(double d) {
        this.f2481b.setAltitude(d);
    }

    /* renamed from: b */
    private WDReel m6457b() {
        return new WDReel((double) this.f2481b.getSpeed());
    }

    /* renamed from: b */
    private void m6458b(double d) {
        this.f2481b.setSpeed((float) d);
    }

    /* renamed from: c */
    private WDBooleen m6459c() {
        return new WDBooleen(this.f2481b.hasBearing());
    }

    /* renamed from: e */
    private WDBooleen m6460e() {
        return new WDBooleen(this.f2481b.hasAltitude());
    }

    /* renamed from: e */
    private void m6461e(double d) {
        this.f2481b.setAccuracy((float) d);
    }

    /* renamed from: f */
    private WDReel m6462f() {
        return new WDReel((double) this.f2481b.getBearing());
    }

    /* renamed from: f */
    private void m6463f(double d) {
        this.f2481b.setBearing((float) d);
    }

    /* renamed from: g */
    private WDBooleen m6464g() {
        return new WDBooleen(this.f2481b.hasSpeed());
    }

    /* renamed from: i */
    private WDReel m6465i() {
        return new WDReel((double) this.f2481b.getAccuracy());
    }

    /* renamed from: j */
    private WDBooleen m6466j() {
        return new WDBooleen(this.f2481b.hasAccuracy());
    }

    /* renamed from: m */
    private WDBooleen m6467m() {
        return new WDBooleen(m6476d());
    }

    /* renamed from: z */
    private static String m6468z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 56;
                    break;
                case 1:
                    i2 = 69;
                    break;
                case 2:
                    i2 = 69;
                    break;
                case 3:
                    i2 = 115;
                    break;
                default:
                    i2 = 50;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m6469z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 50);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public double m6470a(WDGeoPosition wDGeoPosition) {
        return (double) this.f2481b.bearingTo(wDGeoPosition.f2481b);
    }

    /* renamed from: a */
    public double m6471a(WDGeoPosition wDGeoPosition, int i) {
        float distanceTo = this.f2481b.distanceTo(wDGeoPosition.f2481b);
        switch (i) {
            case 2:
                return ((double) distanceTo) / 1000.0d;
            case 3:
                return (((double) distanceTo) / 1000.0d) * f2478c;
            default:
                return (double) distanceTo;
        }
    }

    /* renamed from: a */
    public final String m6472a() {
        return this.f2481b != null ? this.f2481b.getLatitude() + "," + this.f2481b.getLongitude() : f2480z[4];
    }

    /* renamed from: a */
    public void m6473a(String str) {
        this.f2481b.setTime(new WDDateHeure(str).mo2496a());
    }

    /* renamed from: c */
    public void m6474c(double d) {
        this.f2481b.setLatitude(d);
        this.f2482e = true;
    }

    /* renamed from: d */
    public void m6475d(double d) {
        this.f2481b.setLongitude(d);
        this.f2482e = true;
    }

    /* renamed from: d */
    public final boolean m6476d() {
        return this.f2482e;
    }

    public WDObjet getAltitude() {
        return new WDReel(this.f2481b.getAltitude());
    }

    public WDObjet getClone() {
        WDGeoPosition wDGeoPosition = (WDGeoPosition) super.getClone();
        wDGeoPosition.f2481b = new Location(this.f2481b);
        return wDGeoPosition;
    }

    public String getNomType() {
        return C0745b.m3220a(f2480z[3], new String[0]);
    }

    public WDObjet getProp(EWDPropriete eWDPropriete) {
        switch (C0916e.f2502a[eWDPropriete.ordinal()]) {
            case 1:
                return m6482p();
            case 2:
                return m6477h();
            case 3:
                return m6462f();
            case 4:
                return m6465i();
            case 5:
                return m6457b();
            case 6:
                return m6481o();
            case 7:
                return m6460e();
            case 8:
                return m6459c();
            case 9:
                return m6466j();
            case 10:
                return m6464g();
            case 11:
                return m6467m();
            default:
                return super.getProp(eWDPropriete);
        }
    }

    public WDObjet getValeur() {
        WDErreurManager.m2883a(C0745b.m3222b(f2480z[0], getNomType()));
        return null;
    }

    /* renamed from: h */
    public WDReel m6477h() {
        return new WDReel(this.f2481b.getLongitude());
    }

    public boolean isEvaluable() {
        return false;
    }

    /* renamed from: k */
    public EWDPropriete[] mo2439k() {
        return f2479d;
    }

    /* renamed from: l */
    protected int mo2440l() {
        return C0607n.Gf;
    }

    /* renamed from: n */
    public Location m6480n() {
        return this.f2481b;
    }

    /* renamed from: o */
    public WDDateHeure m6481o() {
        return new WDDateHeure(C0725i.m3032a(new Date(this.f2481b.getTime())));
    }

    /* renamed from: p */
    public WDReel m6482p() {
        return new WDReel(this.f2481b.getLatitude());
    }

    public void razVariable() {
        if (this.f2481b != null) {
            this.f2481b.reset();
        }
        this.f2482e = false;
    }

    public void release() {
        this.f2481b = null;
    }

    public void setAltitude(int i) {
        m6456a((double) i);
    }

    public void setProp(EWDPropriete eWDPropriete, WDObjet wDObjet) {
        switch (C0916e.f2502a[eWDPropriete.ordinal()]) {
            case 1:
                m6474c(wDObjet.getDouble());
                return;
            case 2:
                m6475d(wDObjet.getDouble());
                return;
            case 3:
                m6463f(wDObjet.getDouble());
                return;
            case 4:
                m6461e(wDObjet.getDouble());
                return;
            case 5:
                m6458b(wDObjet.getDouble());
                return;
            case 6:
                m6473a(wDObjet.getString());
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                WDErreurManager.m2883a(C0745b.m3222b(f2480z[1], eWDPropriete.getNom()));
                return;
            default:
                super.setProp(eWDPropriete, wDObjet);
                return;
        }
    }

    protected void setPropDouble(EWDPropriete eWDPropriete, double d) {
        switch (C0916e.f2502a[eWDPropriete.ordinal()]) {
            case 1:
                m6474c(d);
                return;
            case 2:
                m6475d(d);
                return;
            case 3:
                m6463f(d);
                return;
            case 4:
                m6461e(d);
                return;
            case 5:
                m6458b(d);
                return;
            case 12:
                m6456a(d);
                return;
            default:
                super.setPropDouble(eWDPropriete, d);
                return;
        }
    }

    protected void setPropString(EWDPropriete eWDPropriete, String str) {
        switch (C0916e.f2502a[eWDPropriete.ordinal()]) {
            case 6:
                m6473a(str);
                return;
            default:
                super.setPropString(eWDPropriete, str);
                return;
        }
    }

    public void setValeur(WDObjet wDObjet) {
        WDGeoPosition wDGeoPosition = (WDGeoPosition) wDObjet.checkType(WDGeoPosition.class);
        if (wDGeoPosition != null) {
            if (this.f2481b == null) {
                this.f2481b = new Location(wDGeoPosition.f2481b);
            } else {
                this.f2481b.set(wDGeoPosition.f2481b);
            }
            this.f2482e = wDGeoPosition.f2482e;
            return;
        }
        super.setValeur(wDObjet);
    }
}
