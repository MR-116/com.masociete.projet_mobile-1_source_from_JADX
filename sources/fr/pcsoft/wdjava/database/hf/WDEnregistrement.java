package fr.pcsoft.wdjava.database.hf;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.poo.C0560r;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDChaine;

public class WDEnregistrement extends C0560r {
    /* renamed from: d */
    public static final EWDPropriete[] f2206d = new EWDPropriete[]{EWDPropriete.PROP_CONTENU, EWDPropriete.PROP_FICHIERASSOCIE};
    /* renamed from: e */
    public static final EWDPropriete[] f2207e = new EWDPropriete[]{EWDPropriete.PROP_VALEUR, EWDPropriete.PROP_NULL};
    /* renamed from: z */
    private static final String[] f2208z = new String[]{m4266z(m4267z("['\u000fP|97\u001eWm',\u0012O|*7\u001fPj)7\u0018]`7/\u0010Wm")), m4266z(m4267z("1\f>k@\u001dB9g\u0003\n\u0017?pJ\t\u00178\"J\u0016\u0014<nJ\u001c\u0007s")), m4266z(m4267z("['\u000fP|*7\u001fPj)7\u0018]j6'\u0005Kp,#\u0013Vf")), m4266z(m4267z("['\u000fP|+-\bP`==\u0019Mm6'\u0018Q|6-\u0013]j6+\tKb4+\u000eGf")), m4266z(m4267z("[2\u000fMs*+\u0018Vf'.\u0018Aw-0\u0018]p=7\u0011G")), m4266z(m4267z("[4\u001cPj9 \u0011G|=,\u000fGd11\tPf5'\u0013V|6-\u0013]j6+\tKb4+\u000eGf")), m4266z(m4267z("['\u0013Pf?+\u000eVq=/\u0018Lw"))};
    /* renamed from: b */
    private boolean f2209b;
    /* renamed from: c */
    private Object[] f2210c;
    /* renamed from: f */
    private db f2211f;

    public WDEnregistrement() {
        this.f2210c = null;
        this.f2211f = null;
        this.f2209b = false;
        this.f2209b = true;
    }

    public WDEnregistrement(db dbVar) {
        this.f2210c = null;
        this.f2211f = null;
        this.f2209b = false;
        this.f2211f = dbVar;
        this.f2209b = false;
        this.f2210c = this.f2211f.m3601D();
    }

    /* renamed from: b */
    private final String m4265b() {
        return this.f2211f != null ? this.f2211f.getNomSourceDonnees() : "";
    }

    /* renamed from: z */
    private static String m4266z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = C0607n.co;
                    break;
                case 1:
                    i2 = 98;
                    break;
                case 2:
                    i2 = 93;
                    break;
                case 3:
                    i2 = 2;
                    break;
                default:
                    i2 = 35;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m4267z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 35);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public final void m4268a(db dbVar) {
        if (dbVar == this.f2211f) {
            dbVar.ie = this.f2211f.m3667a(this.f2210c);
            return;
        }
        Object[] u = dbVar.m3733u();
        int i = 0;
        for (eb ebVar : this.f2211f.m3614S().values()) {
            int i2;
            eb ebVar2 = (eb) dbVar.mo2721b(ebVar.mo3137b());
            if (ebVar2 != null) {
                i++;
                if (!ebVar2.m5813P()) {
                    int k = ebVar2.m5854k();
                    if (k < 0 || k >= u.length) {
                        C0691a.m2856a(f2208z[1]);
                    } else {
                        u[ebVar2.m5854k()] = this.f2210c[ebVar.m5854k()];
                        i2 = i;
                        i = i2;
                    }
                }
            }
            i2 = i;
            i = i2;
        }
        if (i == 0) {
            WDErreurManager.m2883a(C0745b.m3222b(f2208z[0], this.f2211f.mo2719a(), dbVar.mo2719a()));
        }
    }

    /* renamed from: a */
    public final void m4269a(eb ebVar) {
        if (this.f2210c != null && this.f2211f != null) {
            if (ebVar == null) {
                this.f2210c = this.f2211f.m3601D();
                return;
            }
            eb ebVar2 = (eb) this.f2211f.mo2721b(ebVar.mo3137b());
            if (ebVar2 == null) {
                WDErreurManager.m2883a(C0745b.m3222b(f2208z[2], r1, m4265b()));
            }
            this.f2210c[ebVar2.m5854k()] = ebVar2.m5808J();
        }
    }

    /* renamed from: a */
    public final void m4270a(Object[] objArr, db dbVar) {
        if (this.f2209b) {
            this.f2211f = dbVar;
            this.f2210c = this.f2211f.m3667a(objArr);
        } else if (dbVar == this.f2211f) {
            this.f2210c = this.f2211f.m3667a(objArr);
        } else {
            int i = 0;
            for (eb ebVar : dbVar.m3614S().values()) {
                int i2;
                eb ebVar2 = (eb) this.f2211f.mo2721b(ebVar.mo3137b());
                if (ebVar2 != null) {
                    i++;
                    if (!ebVar2.m5813P()) {
                        int k = ebVar2.m5854k();
                        if (k < 0 || k >= objArr.length) {
                            C0691a.m2856a(f2208z[1]);
                        } else {
                            this.f2210c[ebVar2.m5854k()] = objArr[ebVar.m5854k()];
                            i2 = i;
                            i = i2;
                        }
                    }
                }
                i2 = i;
                i = i2;
            }
            if (i == 0) {
                WDErreurManager.m2883a(C0745b.m3222b(f2208z[0], this.f2211f.mo2719a(), dbVar.mo2719a()));
            }
        }
    }

    /* renamed from: a */
    public final Object[] m4271a() {
        return this.f2210c;
    }

    /* renamed from: c */
    public final db m4272c() {
        if (this.f2211f == null) {
            WDErreurManager.m2883a(C0745b.m3222b(f2208z[5], new String[0]));
        }
        return this.f2211f;
    }

    public WDObjet getClone() {
        return (WDEnregistrement) super.getClone();
    }

    public WDObjet getElement(String str) {
        eb ebVar = (eb) m4272c().mo2721b(str);
        if (ebVar == null) {
            WDErreurManager.m2883a(C0745b.m3222b(f2208z[2], str, m4265b()));
        }
        return new cb(this, ebVar);
    }

    public String getNomType() {
        return C0745b.m3220a(f2208z[6], new String[0]);
    }

    public WDObjet getProp(EWDPropriete eWDPropriete) {
        switch (fb.f2265a[eWDPropriete.ordinal()]) {
            case 1:
                return new WDChaine(m4265b());
            case 2:
                return new WDChaine(this.f2211f != null ? this.f2211f.m3643a(this.f2210c, C0607n.Gc) : "");
            default:
                return super.getProp(eWDPropriete);
        }
    }

    public WDObjet getValeur() {
        return this;
    }

    public boolean isEvaluable() {
        return false;
    }

    /* renamed from: k */
    public EWDPropriete[] mo2439k() {
        return f2206d;
    }

    /* renamed from: l */
    protected int mo2440l() {
        return C0607n.f1422F;
    }

    public void razVariable() {
        m4269a(null);
    }

    public void release() {
        this.f2211f = null;
    }

    public void setProp(EWDPropriete eWDPropriete, WDObjet wDObjet) {
        switch (fb.f2265a[eWDPropriete.ordinal()]) {
            case 1:
            case 2:
                WDErreurManager.m2883a(C0745b.m3222b(f2208z[4], eWDPropriete.getNom()));
                return;
            default:
                super.setProp(eWDPropriete, wDObjet);
                return;
        }
    }

    public void setValeur(WDObjet wDObjet) {
        WDEnregistrement wDEnregistrement = (WDEnregistrement) wDObjet.checkType(WDEnregistrement.class);
        if (wDEnregistrement != null) {
            m4270a(wDEnregistrement.m4271a(), wDEnregistrement.m4272c());
            return;
        }
        db dbVar = (db) wDObjet.checkType(db.class);
        if (dbVar == null) {
            WDErreurManager.m2883a(C0745b.m3222b(f2208z[3], wDObjet.getString()));
        }
        m4270a(dbVar.m3733u(), dbVar);
    }
}
