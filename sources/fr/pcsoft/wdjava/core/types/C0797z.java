package fr.pcsoft.wdjava.core.types;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.poo.C0560r;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.collection.C0582d;
import fr.pcsoft.wdjava.core.types.collection.tableau.WDTableauSimple;

/* renamed from: fr.pcsoft.wdjava.core.types.z */
final class C0797z extends C0560r {
    /* renamed from: z */
    private static final String[] f2030z = new String[]{C0797z.m3818z(C0797z.m3819z("m#P\r2\u001c+J\u00161\u001c'T\u000e$")), C0797z.m3818z(C0797z.m3819z("m>G\u000f \u001c'P\u00145\u0011\"P\u0003$\u001b<P\u001f#\u000b;Y\u0005")), C0797z.m3818z(C0797z.m3819z("m+G\u0012/\u0003+X\u0002\"\u000b1C\u0001\"\u0007/[\u0014/\u000b6\\\u0013$\u000f A"))};
    /* renamed from: b */
    private String f2031b;
    /* renamed from: c */
    private WDObjet f2032c;
    final bb this$0;

    private C0797z(bb bbVar) {
        this.this$0 = bbVar;
        this.f2032c = null;
    }

    C0797z(bb bbVar, C0781f c0781f) {
        this(bbVar);
    }

    private C0797z(bb bbVar, String str, WDObjet wDObjet) {
        this.this$0 = bbVar;
        this.f2032c = null;
        this.f2031b = str;
        this.f2032c = wDObjet;
    }

    C0797z(bb bbVar, String str, WDObjet wDObjet, C0781f c0781f) {
        this(bbVar, str, wDObjet);
    }

    /* renamed from: a */
    private final String m3814a() {
        return this.f2031b;
    }

    /* renamed from: a */
    private final void m3815a(String str) {
        if (!this.f2031b.equals(str)) {
            if (bb.access$400(this.this$0).containsKey(str)) {
                WDErreurManager.m2883a(C0745b.m3222b(f2030z[2], str));
            }
            bb.access$400(this.this$0).remove(this.f2031b);
            bb.access$400(this.this$0).put(str, this);
            this.f2031b = str;
        }
    }

    static boolean access$100(C0797z c0797z) {
        return c0797z.m3816b();
    }

    static String access$200(C0797z c0797z) {
        return c0797z.m3814a();
    }

    static WDObjet access$300(C0797z c0797z) {
        return c0797z.m3817c();
    }

    /* renamed from: b */
    private final boolean m3816b() {
        return this.f2032c != null;
    }

    /* renamed from: c */
    private final WDObjet m3817c() {
        return this.f2032c;
    }

    /* renamed from: z */
    private static String m3818z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 78;
                    break;
                case 1:
                    i2 = 110;
                    break;
                case 2:
                    i2 = 21;
                    break;
                case 3:
                    i2 = 64;
                    break;
                default:
                    i2 = 112;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m3819z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 112);
        }
        return toCharArray;
    }

    public WDObjet get(int i) {
        if (this.f2032c == null) {
            WDObjet wDTableauSimple = new WDTableauSimple(0, new int[]{0}, 0, 31);
            wDTableauSimple.m3431a(true);
            this.f2032c = wDTableauSimple;
        }
        return getValeur().get(i);
    }

    public WDObjet getElement(String str) {
        if (this.f2032c != null) {
            return getValeur().getElement(str);
        }
        this.f2032c = new bb();
        return this.f2032c.getElement(str);
    }

    public WDObjet getElement(String str, boolean z) {
        return getValeur().getElement(str, z);
    }

    public String getNomType() {
        return C0745b.m3220a(f2030z[0], new String[0]);
    }

    public WDObjet getProp(EWDPropriete eWDPropriete) {
        bb bbVar;
        switch (ib.f2024a[eWDPropriete.ordinal()]) {
            case 1:
                return new WDChaine(m3814a());
            case 2:
                return getValeur();
            case 3:
                return getValeur().getType();
            case 4:
                if (this.f2032c != null) {
                    C0582d c0582d = (C0582d) this.f2032c.checkType(C0582d.class);
                    if (c0582d != null) {
                        return ((WDObjet) c0582d).getProp(eWDPropriete);
                    }
                    bbVar = (bb) this.f2032c.checkType(bb.class);
                    if (bbVar != null) {
                        return new WDEntier4(bb.access$400(bbVar).size());
                    }
                }
                return new WDEntier4(0);
            case 5:
                return new WDBooleen(m3816b());
            case 6:
                if (this.f2032c != null) {
                    bbVar = (bb) this.f2032c.checkType(bb.class);
                    if (bbVar != null) {
                        return new ab(bbVar);
                    }
                }
                return new ab(new bb());
            default:
                return super.getProp(eWDPropriete);
        }
    }

    public WDObjet getValeur() {
        if (this.f2032c == null) {
            return WDObjet.NULL;
        }
        if (!(this.f2032c instanceof WDVariant)) {
            this.f2032c = new WDVariant(this.f2032c);
        }
        return this.f2032c;
    }

    public boolean isEvaluable() {
        return true;
    }

    /* renamed from: k */
    public EWDPropriete[] mo2439k() {
        return this.this$0.f1951b;
    }

    /* renamed from: l */
    protected int mo2440l() {
        return C0607n.xq;
    }

    public void razVariable() {
        if (this.f2032c != null) {
            this.f2032c = WDObjet.NULL;
        }
    }

    public void release() {
        this.f2031b = null;
        if (this.f2032c != null) {
            this.f2032c = null;
        }
    }

    public void setProp(EWDPropriete eWDPropriete, WDObjet wDObjet) {
        switch (ib.f2024a[eWDPropriete.ordinal()]) {
            case 1:
                m3815a(wDObjet.getString());
                return;
            case 2:
                setValeur(wDObjet);
                return;
            case 3:
            case 4:
            case 5:
            case 6:
                WDErreurManager.m2883a(C0745b.m3222b(f2030z[1], eWDPropriete.toString()));
                return;
            default:
                super.setProp(eWDPropriete, wDObjet);
                return;
        }
    }

    public void setProp(EWDPropriete eWDPropriete, String str) {
        switch (ib.f2024a[eWDPropriete.ordinal()]) {
            case 1:
                m3815a(str);
                return;
            case 2:
                setValeur(str);
                return;
            default:
                super.setProp(eWDPropriete, str);
                return;
        }
    }

    public void setValeur(WDObjet wDObjet) {
        WDObjet valeur = wDObjet instanceof WDVariant ? wDObjet.getValeur() : wDObjet;
        if (!(valeur == null || valeur.isVariableInterne())) {
            valeur = valeur.getClone();
        }
        this.f2032c = valeur;
    }
}
