package fr.pcsoft.wdjava.ui.dessin;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.poo.C0560r;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.ui.p064a.C1031a;

public class WDCouleurWL extends C0560r {
    /* renamed from: b */
    public static final EWDPropriete[] f3967b = new EWDPropriete[]{EWDPropriete.PROP_ROUGE, EWDPropriete.PROP_VERT, EWDPropriete.PROP_BLEU, EWDPropriete.PROP_OPACITE, EWDPropriete.PROP_TEINTE, EWDPropriete.PROP_SATURATION, EWDPropriete.PROP_LUMINOSITE, EWDPropriete.PROP_COULEUR};
    /* renamed from: z */
    private static final String f3968z = m9514z(m9515z("&[#zj@M>"));
    /* renamed from: c */
    protected int f3969c;

    public WDCouleurWL() {
        this.f3969c = -16777216;
        this.f3969c = 0;
    }

    public WDCouleurWL(int i) {
        this.f3969c = -16777216;
        this.f3969c = C1031a.m7467k(i);
    }

    /* renamed from: a */
    private final int m9500a() {
        return (int) (((double) Math.round((float) C1031a.m7464h(this.f3969c)[1])) * 2.55d);
    }

    /* renamed from: a */
    private final void m9501a(int i) {
        int i2 = (this.f3969c >> 24) & 255;
        int[] h = C1031a.m7464h(this.f3969c);
        h[2] = Math.max(0, Math.min(100, (int) Math.round(((double) i) / 2.55d)));
        mo3739d((i2 << 24) | (C1031a.m7456b(h[0], h[2], h[1]) & 16777215));
    }

    /* renamed from: b */
    private final int m9502b() {
        return C1031a.m7468l(this.f3969c);
    }

    /* renamed from: b */
    private final void m9503b(int i) {
        int i2 = (this.f3969c >> 24) & 255;
        int[] h = C1031a.m7464h(this.f3969c);
        h[1] = Math.max(0, Math.min(100, (int) Math.round(((double) i) / 2.55d)));
        mo3739d((i2 << 24) | (C1031a.m7456b(h[0], h[2], h[1]) & 16777215));
    }

    /* renamed from: c */
    private final void m9504c(int i) {
        int i2 = (this.f3969c >> 24) & 255;
        int[] h = C1031a.m7464h(this.f3969c);
        h[0] = Math.max(0, Math.min(360, i));
        mo3739d((i2 << 24) | (C1031a.m7456b(h[0], h[2], h[1]) & 16777215));
    }

    /* renamed from: d */
    private final int m9505d() {
        return C1031a.m7463g(this.f3969c);
    }

    /* renamed from: e */
    private final int m9506e() {
        return C1031a.m7462f(this.f3969c);
    }

    /* renamed from: e */
    private final void m9507e(int i) {
        mo3739d(((((i & 255) << 24) | (C1031a.m7468l(this.f3969c) << 16)) | (C1031a.m7463g(this.f3969c) << 8)) | C1031a.m7462f(this.f3969c));
    }

    /* renamed from: f */
    private final int m9508f() {
        return C1031a.m7464h(this.f3969c)[0];
    }

    /* renamed from: f */
    private final void m9509f(int i) {
        mo3739d((((C1031a.m7448a(this.f3969c) << 24) | (C1031a.m7468l(this.f3969c) << 16)) | (C1031a.m7463g(this.f3969c) << 8)) | (i & 255));
    }

    /* renamed from: g */
    private final void m9510g(int i) {
        mo3739d((((C1031a.m7448a(this.f3969c) << 24) | (C1031a.m7468l(this.f3969c) << 16)) | ((i & 255) << 8)) | C1031a.m7462f(this.f3969c));
    }

    /* renamed from: h */
    private final int m9511h() {
        return C1031a.m7448a(this.f3969c);
    }

    /* renamed from: h */
    private final void m9512h(int i) {
        mo3739d((((C1031a.m7448a(this.f3969c) << 24) | ((i & 255) << 16)) | (C1031a.m7463g(this.f3969c) << 8)) | C1031a.m7462f(this.f3969c));
    }

    /* renamed from: i */
    private final int m9513i() {
        return (int) (((double) Math.round((float) C1031a.m7464h(this.f3969c)[2])) * 2.55d);
    }

    /* renamed from: z */
    private static String m9514z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 5;
                    break;
                case 1:
                    i2 = 24;
                    break;
                case 2:
                    i2 = 108;
                    break;
                case 3:
                    i2 = 47;
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
    private static char[] m9515z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 38);
        }
        return toCharArray;
    }

    /* renamed from: c */
    public final int m9516c() {
        return this.f3969c;
    }

    /* renamed from: d */
    protected void mo3739d(int i) {
        this.f3969c = i;
    }

    /* renamed from: g */
    public final int m9518g() {
        return C1031a.m7461e(this.f3969c);
    }

    public WDEntier4 getCouleur() {
        return new WDEntier4(C1031a.m7461e(this.f3969c));
    }

    public String getNomType() {
        return C0745b.m3219a(f3968z);
    }

    public WDObjet getProp(EWDPropriete eWDPropriete) {
        switch (C1371m.f4064a[eWDPropriete.ordinal()]) {
            case 1:
                return getCouleur();
            case 2:
                return new WDEntier4(m9502b());
            case 3:
                return new WDEntier4(m9505d());
            case 4:
                return new WDEntier4(m9506e());
            case 5:
                return new WDEntier4(m9511h());
            case 6:
                return new WDEntier4(m9508f());
            case 7:
                return new WDEntier4(m9500a());
            case 8:
                return new WDEntier4(m9513i());
            default:
                return super.getProp(eWDPropriete);
        }
    }

    public WDObjet getValeur() {
        return getCouleur();
    }

    public boolean isEvaluable() {
        return true;
    }

    /* renamed from: k */
    public EWDPropriete[] mo2439k() {
        return f3967b;
    }

    /* renamed from: l */
    protected int mo2440l() {
        return C0607n.dx;
    }

    public void razVariable() {
        mo3739d(-16777216);
    }

    public void release() {
    }

    public void setCouleur(int i) {
        mo3739d(C1031a.m7467k(i));
    }

    public void setProp(EWDPropriete eWDPropriete, int i) {
        switch (C1371m.f4064a[eWDPropriete.ordinal()]) {
            case 1:
                setCouleur(i);
                return;
            case 2:
                m9512h(i);
                return;
            case 3:
                m9510g(i);
                return;
            case 4:
                m9509f(i);
                return;
            case 5:
                m9507e(i);
                return;
            case 6:
                m9504c(i);
                return;
            case 7:
                m9503b(i);
                return;
            case 8:
                m9501a(i);
                return;
            default:
                super.setProp(eWDPropriete, i);
                return;
        }
    }

    public void setProp(EWDPropriete eWDPropriete, WDObjet wDObjet) {
        switch (C1371m.f4064a[eWDPropriete.ordinal()]) {
            case 1:
                setCouleur(wDObjet.getInt());
                return;
            case 2:
                m9512h(wDObjet.getInt());
                return;
            case 3:
                m9510g(wDObjet.getInt());
                return;
            case 4:
                m9509f(wDObjet.getInt());
                return;
            case 5:
                m9507e(wDObjet.getInt());
                return;
            case 6:
                m9504c(wDObjet.getInt());
                return;
            case 7:
                m9503b(wDObjet.getInt());
                return;
            case 8:
                m9501a(wDObjet.getInt());
                return;
            default:
                super.setProp(eWDPropriete, wDObjet);
                return;
        }
    }

    public void setValeur(WDObjet wDObjet) {
        WDCouleurWL wDCouleurWL = (WDCouleurWL) wDObjet.checkType(WDCouleurWL.class);
        if (wDCouleurWL != null) {
            mo3739d(wDCouleurWL.f3969c);
        } else {
            setCouleur(wDObjet.getInt());
        }
    }
}
