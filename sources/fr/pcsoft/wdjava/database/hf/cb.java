package fr.pcsoft.wdjava.database.hf;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.poo.C0560r;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;

public final class cb extends C0560r {
    /* renamed from: z */
    private static final String[] f2263z = new String[]{m5772z(m5773z("D~JqL/}GuR+~MqL)nToL)tV|@2kHlA3~]")), m5772z(m5773z("DiMaA.jMfL\"uJfT.hLqV*~Vw"))};
    /* renamed from: b */
    private eb f2264b;
    final WDEnregistrement this$0;

    cb(WDEnregistrement wDEnregistrement, eb ebVar) {
        this.this$0 = wDEnregistrement;
        this.f2264b = ebVar;
    }

    /* renamed from: z */
    private static String m5772z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 103;
                    break;
                case 1:
                    i2 = 59;
                    break;
                case 2:
                    i2 = 24;
                    break;
                case 3:
                    i2 = 35;
                    break;
                default:
                    i2 = 19;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m5773z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 19);
        }
        return toCharArray;
    }

    /* renamed from: a */
    protected void mo2610a(EWDPropriete eWDPropriete, boolean z) {
        this.f2264b.setProp(eWDPropriete, z);
    }

    /* renamed from: a */
    protected void mo2611a(EWDPropriete eWDPropriete, byte[] bArr) {
        this.f2264b.setProp(eWDPropriete, bArr);
    }

    public WDObjet getClone() {
        return (cb) super.getClone();
    }

    public String getNomType() {
        return C0745b.m3220a(f2263z[1], new String[0]);
    }

    public WDObjet getProp(EWDPropriete eWDPropriete) {
        switch (fb.f2265a[eWDPropriete.ordinal()]) {
            case 3:
                return getValeur();
            case 4:
                return this.f2264b.getProp(EWDPropriete.PROP_NULL);
            default:
                return this.f2264b.getProp(eWDPropriete);
        }
    }

    public WDObjet getValeur() {
        return this.f2264b.m5832b(this.f2264b.m5833b(this.this$0.f2210c));
    }

    public boolean isEvaluable() {
        return true;
    }

    /* renamed from: k */
    public EWDPropriete[] mo2439k() {
        return WDEnregistrement.f2207e;
    }

    /* renamed from: l */
    protected int mo2440l() {
        return C0607n.ou;
    }

    public void razVariable() {
    }

    public void release() {
        this.f2264b = null;
    }

    public void setProp(EWDPropriete eWDPropriete, WDObjet wDObjet) {
        switch (fb.f2265a[eWDPropriete.ordinal()]) {
            case 3:
                setValeur(wDObjet);
                return;
            case 4:
                if (this.this$0.m4272c().m3722m()) {
                    setValeur(WDObjet.NULL);
                    return;
                }
                WDErreurManager.m2883a(C0745b.m3222b(f2263z[0], this.this$0.m4265b()));
                return;
            default:
                this.f2264b.setProp(eWDPropriete, wDObjet);
                return;
        }
    }

    protected void setPropDouble(EWDPropriete eWDPropriete, double d) {
        this.f2264b.setProp(eWDPropriete, d);
    }

    protected void setPropInt(EWDPropriete eWDPropriete, int i) {
        this.f2264b.setProp(eWDPropriete, i);
    }

    protected void setPropLong(EWDPropriete eWDPropriete, long j) {
        this.f2264b.setProp(eWDPropriete, j);
    }

    protected void setPropString(EWDPropriete eWDPropriete, String str) {
        this.f2264b.setProp(eWDPropriete, str);
    }

    public void setValeur(WDObjet wDObjet) {
        this.f2264b.m5829a(this.this$0.f2210c, wDObjet);
    }
}
