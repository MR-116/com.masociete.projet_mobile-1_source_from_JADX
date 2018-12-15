package fr.pcsoft.wdjava.ui.champs.camera;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import fr.pcsoft.wdjava.api.WDAPICamera;
import fr.pcsoft.wdjava.core.C0506k;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.C0723g;
import fr.pcsoft.wdjava.core.WDCallback;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.application.C0653m;
import fr.pcsoft.wdjava.core.application.WDAppManager;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.media.C0957s;
import fr.pcsoft.wdjava.media.C0959u;
import fr.pcsoft.wdjava.media.WDCodeBarres;
import fr.pcsoft.wdjava.media.bb;
import fr.pcsoft.wdjava.media.db;
import fr.pcsoft.wdjava.media.ib;
import fr.pcsoft.wdjava.ui.activite.C1056i;
import fr.pcsoft.wdjava.ui.champs.fenetre.C0508h;
import fr.pcsoft.wdjava.ui.champs.gc;
import fr.pcsoft.wdjava.ui.champs.hc;
import fr.pcsoft.wdjava.ui.utils.C1503b;
import p000a.p001a.p002a.C0208m;

@C0723g(a = {WDAPICamera.class})
public class WDChampCamera extends hc implements bb, C0506k {
    private static final int Cc = 3;
    private static final int Dc = 1;
    private static final int Fc = 0;
    private static final int Kc = 2;
    private static final String[] Pc = new String[]{m8302z(m8303z("$6s\u0011iI6s\u0003~F>s\tzXA")), m8302z(m8303z("F4p\u0019kS3b\u0015gI-\u0012|B r\u0015|B-\u0004")), m8302z(m8303z("$&o\fm")), m8302z(m8303z("$<y\u0003~F>s\tz")), m8302z(m8303z("$6s\u0011iI6s\u0003~F>s\tzX@")), m8302z(m8303z("$7d\u000ewW:y\bgX7b\u0003~N6s\u0013wN<b\u0019zC;b")), m8302z(m8303z("f\u001cR.Gn\u0016\u0018,Mu\u001f_/[n\u001dXrzB1y\u000elX3c\u0018aH")), m8302z(m8303z("f\u001cR.Gn\u0016\u0018,Mu\u001f_/[n\u001dXrkF?s\u000ei")), m8302z(m8303z("$6s\u001fgC3q\u0019wD=r\u0019wE3d\u000emT-\u0012|B r\u0015|")), m8302z(m8303z("$1~\u001deW-u\u001deB w"))};
    private db Ec = null;
    private C1141e Gc = null;
    private Rect Hc = null;
    private WDCallback Ic = null;
    private C1136a Jc = null;
    private boolean Lc = false;
    private boolean Mc = false;
    private int Nc = 0;
    private float Oc = 60.0f;

    public WDChampCamera() {
        try {
            WDAppManager.m2565a(Pc[7]);
        } catch (C0653m e) {
        }
        this.Jc = new C1136a(this, C1056i.m7562a());
        ((ViewGroup) getCompConteneur()).addView(this.Jc);
    }

    /* renamed from: z */
    private static String m8302z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 7;
                    break;
                case 1:
                    i2 = 114;
                    break;
                case 2:
                    i2 = 54;
                    break;
                case 3:
                    i2 = 92;
                    break;
                default:
                    i2 = 40;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m8303z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 40);
        }
        return toCharArray;
    }

    public void activerEcouteurClic() {
        super.activerEcouteurClic();
        this.Jc.setOnClickListener(new C1138c(this));
    }

    protected void appliquerCouleur(int i) {
    }

    protected void appliquerCouleurFond(int i) {
    }

    protected void appliquerCouleurFondTransparent() {
    }

    protected void appliquerTransparent() {
    }

    public void appliquerVisibilite(boolean z) {
        if (!z && getCompConteneur().getVisibility() == 0) {
            this.Lc = C0957s.m6869c().m6901p();
            C0957s.m6869c().m6900o();
        } else if (z && getCompConteneur().getVisibility() != 0 && this.Lc) {
            demarrerFlux();
        }
        super.appliquerVisibilite(z);
    }

    public void arreterFlux(boolean z, boolean z2) {
        this.Lc = false;
        if (z2) {
            C0957s.m6869c().m6877a(null, z ? null : this.Jc.getHolder());
        }
        if (z) {
            C0957s.m6869c().mo3235d();
        }
    }

    public void capturerFlux(String str, int i, int i2, int i3, boolean z) throws ib {
        try {
            if (this.Ec != null) {
                WDErreurManager.m2883a(C0745b.m3222b(Pc[5], new String[0]));
            }
            if (i == 2) {
                try {
                    C0957s.m6869c().m6879a(this.Jc.getHolder(), str);
                    return;
                } catch (C0653m e) {
                    throw e;
                }
            }
            try {
                WDAppManager.m2565a(Pc[6]);
                C0957s.m6869c().m6880a(this.Jc.getHolder(), str, i2, i3, z);
            } catch (C0653m e2) {
                throw new ib(e2.getMessage(), (int) C0607n.rc);
            }
        } catch (C0653m e22) {
            throw e22;
        }
    }

    public void decodageCodeBarres() {
        initialiserAction();
    }

    public void demarrerFlux() {
        this.Lc = false;
        this.Hc = null;
        C0957s.m6869c().m6878a(this.Jc.getHolder());
        if (this.Ec != null && this.Mc) {
            this.Ec.m6836a();
            this.Jc.m8307c();
        }
    }

    public final void disableBarCodeDecoding() {
        if (this.Ec != null) {
            this.Mc = false;
            if (this.Gc != null) {
                this.Gc.setVisibility(8);
            }
            this.Ec.m6841d();
        }
    }

    public final void enableBarCodeDecoding(int i) {
        if (this.Nc == 0) {
            WDErreurManager.m2883a(C0745b.m3222b(Pc[8], getName()));
        } else if (this.Ec != null) {
            this.Mc = true;
            if (this.Gc != null) {
                this.Gc.setVisibility(0);
            }
            if (i >= 0) {
                this.Ec.m6837a(i);
            } else {
                this.Ec.m6836a();
            }
            this.Jc.m8307c();
        }
    }

    protected WDObjet executerPCode(int i) {
        switch (i) {
            case C0607n.yk /*237*/:
                decodageCodeBarres();
                return null;
            default:
                return super.executerPCode(i);
        }
    }

    public View getCompPrincipal() {
        View view = (ViewGroup) this.Jc.getParent();
        return view != getCompConteneur() ? view : this.Jc;
    }

    public Rect getDecodeFrameRect() {
        if (this.Hc == null) {
            int width = this.Jc.getWidth();
            int height = this.Jc.getHeight();
            int ceil = (int) Math.ceil(((double) (((float) width) * this.Oc)) / 100.0d);
            int ceil2 = (int) Math.ceil(((double) (((float) height) * this.Oc)) / 100.0d);
            width = (width - ceil) / 2;
            height = (height - ceil2) / 2;
            this.Hc = new Rect(width, height, ceil + width, ceil2 + height);
        }
        return this.Hc;
    }

    public int getEtatAffichageFlux() {
        return C0957s.m6869c().m6892f() ? 1 : C0957s.m6869c().m6901p() ? 2 : 4;
    }

    public String getNomType() {
        return C0745b.m3220a(Pc[9], new String[0]);
    }

    public WDObjet getValeur() {
        WDErreurManager.m2883a(C0745b.m3222b(Pc[4], getNomType()) + "\n" + C0745b.m3222b(Pc[3], getNomType()));
        return null;
    }

    public boolean isChampCamera() {
        return true;
    }

    public boolean isChampFocusable() {
        return false;
    }

    public boolean isEvaluable() {
        return false;
    }

    public void onBarcodeDecoded(C0208m c0208m) {
        if (c0208m != null) {
            WDCodeBarres wDCodeBarres = new WDCodeBarres(C0959u.m6918a(c0208m.m1260g().toString()), c0208m.m1257d());
            appelPCode(C0607n.yk);
            if (this.Ic != null) {
                WDObjet appelPCodeAvecParametres = appelPCodeAvecParametres(C0607n.yk, this.Ic, wDCodeBarres);
                if (appelPCodeAvecParametres == null || appelPCodeAvecParametres.isVoid() || !appelPCodeAvecParametres.getBoolean()) {
                    this.Jc.m8307c();
                } else if (this.Ec != null) {
                    disableBarCodeDecoding();
                }
            }
        }
    }

    public void onDecodingFailed() {
        if (this.Ec != null) {
            this.Jc.m8307c();
        }
    }

    public void release() {
        super.release();
        if (this.Jc != null) {
            this.Jc.m8308d();
            this.Jc = null;
        }
        if (this.Ic != null) {
            this.Ic.m2261c();
            this.Ic = null;
        }
        if (this.Ec != null) {
            this.Ec.m6840c();
            this.Ec = null;
        }
        this.Gc = null;
        this.Hc = null;
    }

    protected void setCallbackPCodeDecodage(String str) {
        if (this.Ic == null) {
            this.Ic = WDCallback.m2240a(str, -1);
        }
    }

    public void setFenetre(C0508h c0508h) {
        super.setFenetre(c0508h);
        C1503b.m10435a((gc) this);
    }

    protected final void setParamDecodageCodeBarres(int i, int i2, int i3) {
        if (i != 0) {
            this.Mc = true;
            this.Ec = new db(i2);
            this.Ec.m6838a((bb) this);
            C0957s.m6869c().m6882a(true);
            this.Oc = (float) Math.max(15, Math.min(100, i3));
            this.Nc = i;
            if (this.Nc != 1 && i3 < 100) {
                Context context = this.Jc.getContext();
                this.Gc = new C1141e(this, context);
                ViewGroup viewGroup = (ViewGroup) getCompConteneur();
                View frameLayout = new FrameLayout(context);
                LayoutParams layoutParams = this.Jc.getLayoutParams();
                if (layoutParams == null || !(layoutParams instanceof fr.pcsoft.wdjava.ui.champs.ib)) {
                    C1503b.m10448b(frameLayout, C1503b.m10442b(this.Jc), C1503b.m10449c(this.Jc));
                } else {
                    C1503b.m10426a(frameLayout, ((fr.pcsoft.wdjava.ui.champs.ib) layoutParams).x, ((fr.pcsoft.wdjava.ui.champs.ib) layoutParams).y, layoutParams.width, layoutParams.height);
                }
                LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                viewGroup.removeView(this.Jc);
                frameLayout.addView(this.Jc, layoutParams2);
                frameLayout.addView(this.Gc, layoutParams2);
                viewGroup.addView(frameLayout);
            }
        }
    }

    public boolean setTailleChamp(int i, int i2, int i3) {
        boolean tailleChamp = super.setTailleChamp(i, i2, i3);
        if (tailleChamp) {
            if ((i3 & 1) > 0) {
                View compPrincipal = getCompPrincipal();
                this.Bc.removeView(compPrincipal);
                this.Bc.addView(compPrincipal);
            }
            this.Hc = null;
        }
        return tailleChamp;
    }

    public void setValeur(WDObjet wDObjet) {
        WDErreurManager.m2883a(C0745b.m3222b(Pc[0], getNomType()) + "\n" + C0745b.m3222b(Pc[2], getName(), getNomType()) + " " + C0745b.m3222b(Pc[1], new String[0]));
    }

    public void terminerInitialisation() {
        super.terminerInitialisation();
        this.Jc.m8309e();
    }
}
