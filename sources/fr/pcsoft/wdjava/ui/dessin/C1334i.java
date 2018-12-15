package fr.pcsoft.wdjava.ui.dessin;

import fr.pcsoft.wdjava.core.C0486m;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.parcours.IWDParcours;
import fr.pcsoft.wdjava.core.poo.C0560r;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.core.types.WDReel;
import fr.pcsoft.wdjava.core.types.collection.C0582d;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.ui.C1489s;
import fr.pcsoft.wdjava.ui.dessin.p077a.C1336b;
import fr.pcsoft.wdjava.ui.dessin.p077a.C1348m;
import fr.pcsoft.wdjava.ui.dessin.p077a.C1353s;
import fr.pcsoft.wdjava.ui.p064a.C1031a;
import fr.pcsoft.wdjava.ui.utils.C1508i;
import java.io.ByteArrayInputStream;

/* renamed from: fr.pcsoft.wdjava.ui.dessin.i */
public abstract class C1334i extends C0560r implements C0519e, C1333c, C0582d {
    /* renamed from: d */
    protected static final int f3970d = 1;
    /* renamed from: h */
    public static final EWDPropriete[] f3971h = new EWDPropriete[]{EWDPropriete.PROP_VALIDE, EWDPropriete.PROP_HAUTEUR, EWDPropriete.PROP_LARGEUR, EWDPropriete.PROP_BITPARPIXEL, EWDPropriete.PROP_AVECALPHA, EWDPropriete.PROP_IMAGE, EWDPropriete.PROP_COULEURREMPLISSAGE, EWDPropriete.PROP_PIXEL, EWDPropriete.PROP_ECHELLEDESSIN};
    /* renamed from: z */
    private static final String[] f3972z = new String[]{C1334i.m9535z(C1334i.m9536z("v#'")), C1334i.m9535z(C1334i.m9536z("%\b\u0012Y[E\u0005\u0001YCC\u0000\u0005EPY\t\tYAE\u0019\u001fXRA")), C1334i.m9535z(C1334i.m9536z("%\u001d\u0012DTT\u0004\u0005_AY\u0001\u0005HPS\u001f\u0005TWC\u0018\fN")), C1334i.m9535z(C1334i.m9536z("J(#qt(`oaum$bic#3bkh>`oa&!gbig*%+e&=!ypo?`oa&>/e$e%%fmhm!gkt>`zqcm,,mk,'n$c>4+ahm-âii$2n*")), C1334i.m9535z(C1334i.m9536z("U\u001b\u0007")), C1334i.m9535z(C1334i.m9536z("%\u0004\rJCC"))};
    /* renamed from: b */
    protected double f3973b = 1.0d;
    /* renamed from: c */
    private C1369k f3974c = null;
    /* renamed from: e */
    private int f3975e = 0;
    /* renamed from: f */
    private WDCouleurWL f3976f = null;
    /* renamed from: g */
    private String f3977g = null;
    /* renamed from: i */
    private int f3978i = 0;
    /* renamed from: j */
    protected C1367h f3979j = null;

    public C1334i(C1336b c1336b) {
        if (c1336b != null) {
            setImagePeintre(c1336b);
        }
    }

    /* renamed from: c */
    private final void m9522c(int i, int i2) {
        try {
            if (this.f3979j == null && !C0808l.m4053k(this.f3977g)) {
                try {
                    m9526j();
                } catch (C1489s e) {
                    WDErreurManager.m2874a(e.mo2326e(), e.getMessage());
                }
            }
            try {
                if (this.f3979j != null) {
                    if (i == this.f3979j.mo2339b()) {
                        try {
                            if (i2 == this.f3979j.mo2344c()) {
                                return;
                            }
                        } catch (C1489s e2) {
                            throw e2;
                        }
                    }
                    try {
                        C1367h c1367h = new C1367h(this, C1353s.m9717a(i, i2, (int) Math.round(160.0d * this.f3973b), this.f3976f != null ? this.f3976f.m9516c() : 0, true));
                        c1367h.m9793g().mo3713b(this.f3979j.m9794h().m9720a(false), 0.0d, 0.0d, (double) i, (double) i2);
                        m9552a(c1367h);
                        return;
                    } catch (C1489s e22) {
                        throw e22;
                    }
                }
                this.f3978i = i;
                this.f3975e = i2;
            } catch (C1489s e222) {
                throw e222;
            } catch (C1489s e2222) {
                throw e2222;
            }
        } catch (C1489s e22222) {
            throw e22222;
        }
    }

    /* renamed from: d */
    private final void m9523d(WDObjet wDObjet) throws C1489s {
        razVariable();
        C0519e c0519e = (C0519e) wDObjet.checkType(C0519e.class);
        C1336b imagePeintre;
        if (c0519e != null) {
            try {
                if (!c0519e.isAvecImageMemoire()) {
                    if (!C0808l.m4053k(c0519e.getCheminImage())) {
                        this.f3977g = c0519e.getCheminImage();
                        return;
                    }
                }
                imagePeintre = c0519e.getImagePeintre(3, true);
                if (imagePeintre != null) {
                    try {
                        setImagePeintre(imagePeintre);
                    } catch (C1489s e) {
                        throw e;
                    }
                }
            } catch (C1489s e2) {
                throw e2;
            } catch (C1489s e22) {
                throw e22;
            }
        } else if (wDObjet.isMemoBinaire()) {
            imagePeintre = C1348m.m9692a(wDObjet.getDonneeBinaire(), -1, -1);
            if (imagePeintre != null) {
                try {
                    setImagePeintre(imagePeintre);
                    return;
                } catch (C1489s e222) {
                    throw e222;
                }
            }
            try {
                if (C1508i.m10494b(new ByteArrayInputStream(wDObjet.getDonneeBinaire()), 1) != null) {
                    throw new C1489s(C0745b.m3222b(f3972z[1], new String[0]), 610003);
                }
                this.f3977g = wDObjet.getString();
            } catch (C1489s e2222) {
                throw e2222;
            }
        } else {
            this.f3977g = wDObjet.getString();
        }
    }

    /* renamed from: e */
    private final void m9524e(WDObjet wDObjet) throws C1489s {
        try {
            m9523d(wDObjet);
            if (this.f3979j == null) {
                m9526j();
            }
        } catch (C1489s e) {
            throw e;
        }
    }

    /* renamed from: f */
    private final void m9525f(WDObjet wDObjet) {
        WDCouleurWL wDCouleurWL = (WDCouleurWL) wDObjet.checkType(WDCouleurWL.class);
        if (wDCouleurWL != null) {
            this.f3976f = (WDCouleurWL) wDCouleurWL.getClone();
        } else {
            this.f3976f = new WDCouleurWL(wDObjet.getInt());
        }
    }

    /* renamed from: j */
    private final void m9526j() throws C1489s {
        C1353s a;
        int i = 0;
        if (C0808l.m4053k(this.f3977g)) {
            try {
                if (this.f3978i > 0) {
                    if (this.f3975e > 0) {
                        try {
                            if (this.f3976f != null) {
                                i = this.f3976f.m9516c();
                            }
                            a = C1353s.m9717a(this.f3978i, this.f3975e, (int) Math.round(160.0d * this.f3973b), i, true);
                        } catch (C1489s e) {
                            throw e;
                        }
                    }
                }
                a = null;
            } catch (C1489s e2) {
                throw e2;
            } catch (C1489s e22) {
                throw e22;
            }
        } else {
            a = C1353s.m9719a(this.f3977g);
            if (a == null) {
                String a2 = C1508i.m10484a(this.f3977g, 1);
                if (a2 != null) {
                    try {
                        if (a2.toUpperCase().startsWith(f3972z[4])) {
                            throw new C1489s(C0745b.m3222b(f3972z[1], new String[0]), 610003);
                        }
                    } catch (C1489s e222) {
                        throw e222;
                    }
                }
            }
            this.f3977g = null;
        }
        if (a != null) {
            try {
                this.f3979j = new C1367h(this, a);
                this.f3978i = 0;
                this.f3975e = 0;
            } catch (C1489s e2222) {
                throw e2222;
            }
        }
    }

    /* renamed from: m */
    private final int m9527m() {
        if (this.f3979j != null) {
            return this.f3979j.mo2339b();
        }
        if (this.f3978i > 0 && this.f3975e > 0) {
            return this.f3978i;
        }
        if (C0808l.m4053k(this.f3977g)) {
            return -1;
        }
        m9533t();
        return this.f3978i;
    }

    /* renamed from: n */
    private final WDCouleurWL m9528n() {
        if (this.f3976f == null) {
            this.f3976f = new WDCouleurWL();
        }
        return this.f3976f;
    }

    /* renamed from: o */
    private final C1369k m9529o() {
        if (this.f3979j == null) {
            try {
                m9526j();
            } catch (C1489s e) {
                WDErreurManager.m2874a(e.mo2326e(), e.getMessage());
            }
        }
        try {
            if (this.f3974c == null) {
                this.f3974c = new C1369k(this);
            }
            return this.f3974c;
        } catch (C1489s e2) {
            throw e2;
        }
    }

    /* renamed from: p */
    private final boolean m9530p() {
        return m9566s() ? this.f3979j.m9795i() : true;
    }

    /* renamed from: q */
    private final int m9531q() {
        return m9566s() ? this.f3979j.m9796j() : -1;
    }

    /* renamed from: r */
    private double m9532r() {
        return this.f3973b;
    }

    /* renamed from: t */
    private final void m9533t() {
        C0691a.m2860a(this.f3979j == null, f3972z[3]);
        if (!C0808l.m4053k(this.f3977g)) {
            String a = C1508i.m10484a(this.f3977g, 2);
            String[] a2 = a != null ? C0808l.m4028a(a) : null;
            if (a2 == null || a2.length <= 1) {
                this.f3977g = null;
                return;
            }
            this.f3978i = C0725i.m3064d(a2[1]);
            this.f3975e = C0725i.m3064d(a2[2]);
        }
    }

    /* renamed from: u */
    private final int m9534u() {
        if (this.f3979j != null) {
            return this.f3979j.mo2344c();
        }
        if (this.f3978i > 0 && this.f3975e > 0) {
            return this.f3975e;
        }
        if (C0808l.m4053k(this.f3977g)) {
            return -1;
        }
        m9533t();
        return this.f3975e;
    }

    /* renamed from: z */
    private static String m9535z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 6;
                    break;
                case 1:
                    i2 = 77;
                    break;
                case 2:
                    i2 = 64;
                    break;
                case 3:
                    i2 = 11;
                    break;
                default:
                    i2 = 4;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m9536z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 4);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public int mo2467a(int i, WDObjet[] wDObjetArr) {
        return m9529o().mo2467a(i, wDObjetArr);
    }

    /* renamed from: a */
    public int mo2468a(C0486m c0486m, int i, int i2, WDObjet[] wDObjetArr) {
        return m9529o().mo2468a(c0486m, i, i2, wDObjetArr);
    }

    /* renamed from: a */
    public int mo2464a(WDObjet... wDObjetArr) {
        return m9529o().mo2464a(wDObjetArr);
    }

    /* renamed from: a */
    public WDObjet mo2485a() {
        return m9529o().mo2485a();
    }

    /* renamed from: a */
    public WDObjet mo2469a(long j) {
        return m9529o().mo2469a(j);
    }

    /* renamed from: a */
    public WDObjet mo2470a(String str, boolean z) {
        return m9529o().mo2470a(str, z);
    }

    /* renamed from: a */
    public IWDParcours mo2471a(WDObjet wDObjet, WDObjet wDObjet2, WDObjet wDObjet3, WDObjet wDObjet4, boolean z, boolean z2) {
        return m9529o().mo2471a(wDObjet, wDObjet2, wDObjet3, wDObjet4, z, z2);
    }

    /* renamed from: a */
    protected void mo3678a(double d) {
        this.f3973b = d;
    }

    /* renamed from: a */
    public void mo2472a(int i, int i2) {
        m9529o().mo2472a(i, i2);
    }

    /* renamed from: a */
    public abstract void mo3679a(int i, int i2, int i3);

    @Deprecated
    /* renamed from: a */
    public void mo2473a(int i, C0486m c0486m) {
        m9529o().mo2473a(i, c0486m);
    }

    /* renamed from: a */
    public void mo2465a(WDObjet wDObjet) {
        m9529o().mo2465a(wDObjet);
    }

    /* renamed from: a */
    public void mo3680a(WDObjet wDObjet, int i, int i2, int i3) throws C1489s {
        m9524e(wDObjet);
    }

    /* renamed from: a */
    public void mo2474a(WDObjet wDObjet, WDObjet wDObjet2) {
        m9529o().mo2474a(wDObjet, wDObjet2);
    }

    /* renamed from: a */
    public void mo2466a(WDObjet wDObjet, WDObjet... wDObjetArr) {
        m9529o().mo2466a(wDObjet, wDObjetArr);
    }

    /* renamed from: a */
    protected final void m9552a(C1367h c1367h) {
        this.f3977g = null;
        this.f3975e = 0;
        this.f3978i = 0;
        if (this.f3979j != null) {
            this.f3979j.mo2348d();
        }
        this.f3979j = c1367h;
    }

    /* renamed from: b */
    public int mo2475b(WDObjet wDObjet) {
        return m9529o().mo2475b(wDObjet);
    }

    /* renamed from: b */
    public void mo2476b() {
        m9529o().mo2476b();
    }

    /* renamed from: b */
    public void mo2477b(int i, int i2) {
        m9529o().mo2477b(i, i2);
    }

    /* renamed from: c */
    public int mo2478c(WDObjet wDObjet) {
        return m9529o().mo2478c(wDObjet);
    }

    /* renamed from: c */
    public void mo2479c() {
        m9529o().mo2479c();
    }

    /* renamed from: d */
    public int mo2487d() {
        return m9529o().mo2487d();
    }

    /* renamed from: e */
    public void mo2480e() {
        m9529o().mo2480e();
    }

    /* renamed from: f */
    public boolean mo2481f() {
        return m9529o().mo2481f();
    }

    /* renamed from: g */
    public Class mo2482g() {
        return m9529o().mo2482g();
    }

    public WDObjet get(int i, int i2) {
        return m9529o().m9817c(i - 1, i2 - 1);
    }

    public WDObjet get(WDObjet wDObjet) {
        return super.get(wDObjet);
    }

    public String getCheminImage() {
        return this.f3977g;
    }

    public byte[] getDonneeBinaire() {
        C1336b i = mo3677i();
        if (i != null) {
            try {
                return i.mo3724a(100, 0, f3972z[0]);
            } catch (Exception e) {
                C0691a.m2857a("", e);
            }
        }
        return new byte[0];
    }

    public WDEntier4 getHauteur() {
        return new WDEntier4(m9534u());
    }

    public C0544g getImageMemoire(int i) {
        Object obj = 1;
        if ((i & 1) == 1) {
            obj = null;
        }
        if (this.f3979j == null || r0 != null) {
        }
        return m9566s() ? this.f3979j : null;
    }

    public C1336b getImagePeintre(int i, boolean z) {
        return m9566s() ? this.f3979j.m9794h().m9720a(z) : null;
    }

    public WDEntier4 getLargeur() {
        return new WDEntier4(m9527m());
    }

    public String getNomType() {
        return C0745b.m3219a(f3972z[5]);
    }

    public int getOpacitePixel(int i, int i2) throws C1489s {
        return C1031a.m7448a(getCouleurPixel(i, i2));
    }

    public WDObjet getProp(EWDPropriete eWDPropriete) {
        switch (C1365d.f4050a[eWDPropriete.ordinal()]) {
            case 1:
                return getLargeur();
            case 2:
                return getHauteur();
            case 3:
                return new WDBooleen(m9566s());
            case 4:
                return new WDBooleen(m9530p());
            case 5:
                return new WDEntier4(m9531q());
            case 6:
                return m9529o();
            case 7:
                return m9528n();
            case 8:
                return getValeur();
            case 9:
                return new WDReel(m9532r());
            default:
                return super.getProp(eWDPropriete);
        }
    }

    public WDObjet getValeur() {
        return this;
    }

    /* renamed from: h */
    public long mo2483h() {
        return m9529o().mo2483h();
    }

    /* renamed from: i */
    public C1336b mo3677i() {
        return getImagePeintre(0, false);
    }

    public boolean isAvecImageMemoire() {
        return this.f3979j != null;
    }

    public boolean isEvaluable() {
        return false;
    }

    /* renamed from: k */
    public EWDPropriete[] mo2439k() {
        return f3971h;
    }

    /* renamed from: l */
    protected int mo2440l() {
        return C0607n.Ek;
    }

    public void majAffichage() {
    }

    public void majAffichage(int i, int i2, int i3, int i4) {
    }

    public void razVariable() {
        this.f3977g = null;
        if (this.f3979j != null) {
            this.f3979j.mo2348d();
            this.f3979j = null;
        }
        this.f3978i = 0;
        this.f3975e = 0;
        this.f3976f = null;
        this.f3973b = 1.0d;
    }

    public void release() {
        this.f3977g = null;
        if (this.f3979j != null) {
            this.f3979j.mo2348d();
            this.f3979j = null;
        }
    }

    /* renamed from: s */
    public final boolean m9566s() {
        if (this.f3979j == null) {
            try {
                m9526j();
            } catch (C1489s e) {
                WDErreurManager.m2874a(e.mo2326e(), e.getMessage());
            }
        }
        try {
            return this.f3979j != null;
        } catch (C1489s e2) {
            throw e2;
        }
    }

    public void setHauteur(int i) {
        m9522c(Math.max(m9527m(), this.f3978i), i);
    }

    public void setLargeur(int i) {
        m9522c(i, Math.max(m9534u(), this.f3975e));
    }

    public void setProp(EWDPropriete eWDPropriete, double d) {
        switch (C1365d.f4050a[eWDPropriete.ordinal()]) {
            case 9:
                mo3678a(d);
                return;
            default:
                super.setProp(eWDPropriete, d);
                return;
        }
    }

    public void setProp(EWDPropriete eWDPropriete, int i) {
        switch (C1365d.f4050a[eWDPropriete.ordinal()]) {
            case 1:
                setLargeur(i);
                return;
            case 2:
                setHauteur(i);
                return;
            case 9:
                mo3678a((double) i);
                return;
            default:
                super.setProp(eWDPropriete, i);
                return;
        }
    }

    public void setProp(EWDPropriete eWDPropriete, WDObjet wDObjet) {
        switch (C1365d.f4050a[eWDPropriete.ordinal()]) {
            case 1:
                setLargeur(wDObjet.getInt());
                return;
            case 2:
                setHauteur(wDObjet.getInt());
                return;
            case 3:
            case 4:
            case 5:
            case 6:
                WDErreurManager.m2883a(C0745b.m3222b(f3972z[2], eWDPropriete.getNom()));
                return;
            case 7:
                m9525f(wDObjet);
                return;
            case 8:
                setValeur(wDObjet);
                return;
            case 9:
                mo3678a(wDObjet.getDouble());
                return;
            default:
                super.setProp(eWDPropriete, wDObjet);
                return;
        }
    }

    public void setValeur(WDObjet wDObjet) {
        try {
            m9523d(wDObjet);
        } catch (C1489s e) {
            WDErreurManager.m2874a(e.mo2326e(), e.getMessage());
        }
    }
}
