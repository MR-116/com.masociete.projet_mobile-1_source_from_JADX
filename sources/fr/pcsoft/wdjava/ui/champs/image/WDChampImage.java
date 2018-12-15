package fr.pcsoft.wdjava.ui.champs.image;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Region.Op;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.WDCallback;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.application.WDAppManager;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.p042b.C0657a;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.core.utils.kb;
import fr.pcsoft.wdjava.file.C0897o;
import fr.pcsoft.wdjava.p032m.C0938m;
import fr.pcsoft.wdjava.p061q.p062a.C1014a;
import fr.pcsoft.wdjava.ui.C1489s;
import fr.pcsoft.wdjava.ui.activite.C1056i;
import fr.pcsoft.wdjava.ui.cadre.C1110m;
import fr.pcsoft.wdjava.ui.cadre.C1115e;
import fr.pcsoft.wdjava.ui.champs.fb;
import fr.pcsoft.wdjava.ui.champs.fenetre.WDFenetre;
import fr.pcsoft.wdjava.ui.champs.table.colonne.C1278a;
import fr.pcsoft.wdjava.ui.champs.zr.bb;
import fr.pcsoft.wdjava.ui.dessin.p077a.C1336b;
import fr.pcsoft.wdjava.ui.dessin.p077a.C1348m;
import fr.pcsoft.wdjava.ui.dessin.p077a.C1353s;
import fr.pcsoft.wdjava.ui.gesture.C0522g;
import fr.pcsoft.wdjava.ui.gesture.WDGesture;
import fr.pcsoft.wdjava.ui.p064a.C1031a;
import fr.pcsoft.wdjava.ui.p065b.C1097h;
import fr.pcsoft.wdjava.ui.p065b.C1099j;
import fr.pcsoft.wdjava.ui.p065b.C1100k;
import fr.pcsoft.wdjava.ui.p065b.C1101l;
import fr.pcsoft.wdjava.ui.p065b.C1104o;
import fr.pcsoft.wdjava.ui.p065b.p066b.C1085a;
import fr.pcsoft.wdjava.ui.p065b.p067a.C1080t;
import fr.pcsoft.wdjava.ui.p069g.C1409j;
import fr.pcsoft.wdjava.ui.p069g.C1410k;
import fr.pcsoft.wdjava.ui.utils.C1503b;
import fr.pcsoft.wdjava.ui.utils.C1508i;
import fr.pcsoft.wdjava.ui.utils.C1511l;
import java.io.OutputStream;
import java.lang.reflect.Field;

public class WDChampImage extends C0521o implements C0522g {
    private static final String[] Bd = new String[]{m1465z(m1466z("M&%2C|g%0Yx+%:J7")), m1465z(m1466z("U\"l=Gx*<~Ft&+;\u000fw`)-[97--\u000fx4?1Lp®l¾\u000fl))~Uv))~]ð7¥*Æ|i")), m1465z(m1466z("X)%3Nm.#0\u000fw(\"~\\l7<1]m®)p")), m1465z(m1466z("P*<1\\j..2J9#)~Bv#%8F|5l2J9*)3Mk\"l\u0017Bx )\bF|0o3lk(<\n@I&(:Fw l.Nkg%0[k(<-Jz3%1A")), m1465z(m1466z("t\u0004>1_M(\u001c?K}.\"9")), m1465z(m1466z("P):;]j\"")), m1465z(m1466z("X+ ;]K\"81Zk")), m1465z(m1466z("]2>·J")), m1465z(m1466z("[(9=C|")), m1465z(m1466z("X$87@wg%0Yx+%:J"))};
    private static final int pd = 0;
    private static final int vd = 1;
    private static final int zd = 2;
    private C1409j Ad = null;
    private C1097h nd = null;
    protected C1216i od;
    private WDCallback qd = null;
    private long rd = -1;
    private Path sd = null;
    private WDCallback td = null;
    private C1220l ud = null;
    private WDCallback wd = null;
    private int xd = -1;
    private C1104o yd = m1459k();

    public WDChampImage() {
        m1462n();
    }

    public WDChampImage(C1278a c1278a) {
        super(c1278a);
        m1462n();
        this.od.mo3475a(C1212e.AUCUN);
    }

    /* renamed from: a */
    private final void m1453a(Drawable drawable) {
        try {
            Animation alphaAnimation;
            Animation animation;
            this.Ec |= 256;
            this.Ec &= -17;
            if (drawable instanceof C1080t) {
                if (((WDFenetre) this.l).isHardwareAccelerated()) {
                    try {
                        if ((this.Ec & 128) == 0) {
                            C1014a.m7327b().mo3294c(this.od);
                            this.Ec |= 128;
                            if (m1460l()) {
                                m1455b(drawable);
                                return;
                            }
                            try {
                                if (isImageAffichee()) {
                                    switch (this.Ad.mo3772c()) {
                                        case 21:
                                            alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                                            alphaAnimation.setInterpolator(new AccelerateInterpolator());
                                            alphaAnimation.setDuration((long) (this.Ad.mo3770a() / 2));
                                            animation = alphaAnimation;
                                            break;
                                        default:
                                            C0691a.m2856a(Bd[2]);
                                            break;
                                    }
                                }
                                animation = null;
                                if (drawable != null) {
                                    try {
                                        switch (this.Ad.mo3772c()) {
                                            case 21:
                                                alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                                                alphaAnimation.setInterpolator(new DecelerateInterpolator());
                                                alphaAnimation.setDuration((long) (this.Ad.mo3770a() / 2));
                                                break;
                                            default:
                                                C0691a.m2856a(Bd[2]);
                                                break;
                                        }
                                    } catch (IllegalArgumentException e) {
                                        throw e;
                                    }
                                }
                                alphaAnimation = null;
                                if (animation != null) {
                                    if (alphaAnimation != null) {
                                        animation.setAnimationListener(new C1213f(this, drawable, alphaAnimation));
                                    }
                                    this.od.startAnimation(animation);
                                } else if (alphaAnimation == null) {
                                    try {
                                        m1455b(drawable);
                                        this.od.startAnimation(alphaAnimation);
                                    } catch (IllegalArgumentException e2) {
                                        throw e2;
                                    }
                                } else {
                                    m1455b(drawable);
                                }
                            } catch (IllegalArgumentException e22) {
                                throw e22;
                            }
                        }
                    } catch (IllegalArgumentException e222) {
                        throw e222;
                    }
                }
            }
            try {
                if ((this.Ec & 128) > 0) {
                    C1014a.m7327b().mo3292b(this.od);
                    this.Ec &= -129;
                }
                if (m1460l()) {
                    m1455b(drawable);
                    return;
                }
                if (isImageAffichee()) {
                    switch (this.Ad.mo3772c()) {
                        case 21:
                            alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                            alphaAnimation.setInterpolator(new AccelerateInterpolator());
                            alphaAnimation.setDuration((long) (this.Ad.mo3770a() / 2));
                            animation = alphaAnimation;
                            break;
                        default:
                            C0691a.m2856a(Bd[2]);
                            break;
                    }
                }
                animation = null;
                if (drawable != null) {
                    switch (this.Ad.mo3772c()) {
                        case 21:
                            alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                            alphaAnimation.setInterpolator(new DecelerateInterpolator());
                            alphaAnimation.setDuration((long) (this.Ad.mo3770a() / 2));
                            break;
                        default:
                            C0691a.m2856a(Bd[2]);
                            break;
                    }
                }
                alphaAnimation = null;
                if (animation != null) {
                    if (alphaAnimation != null) {
                        animation.setAnimationListener(new C1213f(this, drawable, alphaAnimation));
                    }
                    this.od.startAnimation(animation);
                } else if (alphaAnimation == null) {
                    m1455b(drawable);
                } else {
                    m1455b(drawable);
                    this.od.startAnimation(alphaAnimation);
                }
            } catch (IllegalArgumentException e2222) {
                throw e2222;
            }
        } catch (IllegalArgumentException e22222) {
            throw e22222;
        } catch (IllegalArgumentException e222222) {
            throw e222222;
        }
    }

    /* renamed from: a */
    private final void m1454a(C1099j c1099j) {
        try {
            if ((this.N & 8) != 8) {
                try {
                    if (m1457i()) {
                        m1456b(c1099j);
                    } else {
                        m1453a(c1099j.m7968d());
                    }
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    /* renamed from: b */
    private final void m1455b(Drawable drawable) {
        try {
            this.od.setImageDrawable(drawable);
            if (drawable != null) {
                initParam(false);
                appliquerModeAffichage();
                if ((this.Ec & 64) == 64) {
                    try {
                        if (isFenetreCree()) {
                            m1461m();
                        } else {
                            C0938m.m6816c().post(new C1224q(this));
                        }
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
            }
            try {
                if (!updateImageMemoire(true)) {
                    return;
                }
                if (this.z == null) {
                    repeindreChamp();
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            } catch (IllegalArgumentException e22) {
                throw e22;
            }
        } catch (IllegalArgumentException e222) {
            throw e222;
        } catch (IllegalArgumentException e2222) {
            throw e2222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    private final void m1456b(fr.pcsoft.wdjava.ui.p065b.C1099j r5) {
        /*
        r4 = this;
        r1 = 1;
        r0 = r4.Ec;
        r0 = r0 | 16;
        r4.Ec = r0;
        r0 = r4.Ec;
        r0 = r0 & 8;
        r2 = 8;
        if (r0 != r2) goto L_0x0045;
    L_0x000f:
        r0 = fr.pcsoft.wdjava.ui.champs.zr.bb.class;
        r0 = r4.getChampParent(r0);
        r0 = (fr.pcsoft.wdjava.ui.champs.zr.bb) r0;
        if (r0 == 0) goto L_0x0021;
    L_0x0019:
        r2 = r0.getRenderingMode();	 Catch:{ IllegalArgumentException -> 0x003b }
        r3 = fr.pcsoft.wdjava.ui.champs.fb.VIEWS_RECYCLING;	 Catch:{ IllegalArgumentException -> 0x003b }
        if (r2 == r3) goto L_0x0045;
    L_0x0021:
        if (r0 == 0) goto L_0x003f;
    L_0x0023:
        r2 = Bd;	 Catch:{ IllegalArgumentException -> 0x0041 }
        r3 = 1;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x0041 }
        fr.pcsoft.wdjava.core.debug.C0691a.m2860a(r1, r2);	 Catch:{ IllegalArgumentException -> 0x0041 }
        if (r0 == 0) goto L_0x0033;
    L_0x002d:
        r0 = r0.loadImage(r4, r5);	 Catch:{ IllegalArgumentException -> 0x0043 }
        if (r0 != 0) goto L_0x003a;
    L_0x0033:
        r0 = r5.m7968d();	 Catch:{ IllegalArgumentException -> 0x0043 }
        r4.m1453a(r0);	 Catch:{ IllegalArgumentException -> 0x0043 }
    L_0x003a:
        return;
    L_0x003b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x003d }
    L_0x003d:
        r0 = move-exception;
        throw r0;
    L_0x003f:
        r1 = 0;
        goto L_0x0023;
    L_0x0041:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0043 }
    L_0x0043:
        r0 = move-exception;
        throw r0;
    L_0x0045:
        r0 = r4.nd;	 Catch:{ IllegalArgumentException -> 0x0063 }
        if (r0 == 0) goto L_0x0056;
    L_0x0049:
        r0 = r4.nd;	 Catch:{ IllegalArgumentException -> 0x0065 }
        r0 = r0.isCancelled();	 Catch:{ IllegalArgumentException -> 0x0065 }
        if (r0 != 0) goto L_0x0056;
    L_0x0051:
        r0 = r4.nd;	 Catch:{ IllegalArgumentException -> 0x0065 }
        r0.m7957f();	 Catch:{ IllegalArgumentException -> 0x0065 }
    L_0x0056:
        r0 = new fr.pcsoft.wdjava.ui.champs.image.h;
        r0.<init>(r4, r5);
        r4.nd = r0;
        r0 = r4.nd;
        r0.m7952a(r1);
        goto L_0x003a;
    L_0x0063:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0065 }
    L_0x0065:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.ui.champs.image.WDChampImage.b(fr.pcsoft.wdjava.ui.b.j):void");
    }

    /* renamed from: i */
    private final boolean m1457i() {
        try {
            return (this.Ec & 4) == 4;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* renamed from: j */
    private final void m1458j() {
        Drawable drawable = this.od.getDrawable();
        try {
            if (!(drawable instanceof Animatable)) {
                return;
            }
            if (((Animatable) drawable).isRunning()) {
                ((Animatable) drawable).stop();
            }
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    /* renamed from: k */
    private final C1104o m1459k() {
        C1104o c1104o = new C1104o();
        c1104o.m7985a(1, true);
        return c1104o;
    }

    /* renamed from: l */
    private final boolean m1460l() {
        try {
            if (this.Ad != null) {
                if ((this.Ec & 64) == 0) {
                    try {
                        if ((this.Ec & 4) == 0) {
                            try {
                                if ((this.N & 256) == 0) {
                                    return true;
                                }
                            } catch (IllegalArgumentException e) {
                                throw e;
                            }
                        }
                    } catch (IllegalArgumentException e2) {
                        throw e2;
                    }
                }
            }
            return false;
        } catch (IllegalArgumentException e22) {
            throw e22;
        } catch (IllegalArgumentException e222) {
            throw e222;
        }
    }

    /* renamed from: m */
    private final void m1461m() {
        Drawable drawable = this.od.getDrawable();
        try {
            if (!(drawable instanceof Animatable)) {
                return;
            }
            if (!((Animatable) drawable).isRunning()) {
                ((Animatable) drawable).start();
            }
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    /* renamed from: n */
    private final void m1462n() {
        try {
            this.od = createView();
            if (this.Zb == null) {
                ((ViewGroup) getCompConteneur()).addView(this.od);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* renamed from: o */
    private C1220l m1463o() {
        try {
            if (this.ud == null) {
                this.ud = new C1220l();
            }
            return this.ud;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: p */
    private final boolean m1464p() {
        /*
        r2 = this;
        r0 = r2.Ec;	 Catch:{ IllegalArgumentException -> 0x0018 }
        r0 = r0 & 8;
        r1 = 8;
        if (r0 == r1) goto L_0x0016;
    L_0x0008:
        r0 = r2.wc;	 Catch:{ IllegalArgumentException -> 0x001a }
        if (r0 == 0) goto L_0x001e;
    L_0x000c:
        r0 = r2.wc;	 Catch:{ IllegalArgumentException -> 0x001c }
        r0 = (fr.pcsoft.wdjava.ui.champs.image.WDChampImage) r0;	 Catch:{ IllegalArgumentException -> 0x001c }
        r0 = r0.m1464p();	 Catch:{ IllegalArgumentException -> 0x001c }
        if (r0 == 0) goto L_0x001e;
    L_0x0016:
        r0 = 1;
    L_0x0017:
        return r0;
    L_0x0018:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x001a }
    L_0x001a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x001c }
    L_0x001c:
        r0 = move-exception;
        throw r0;
    L_0x001e:
        r0 = 0;
        goto L_0x0017;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.ui.champs.image.WDChampImage.p():boolean");
    }

    /* renamed from: z */
    private static String m1465z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 25;
                    break;
                case 1:
                    i2 = 71;
                    break;
                case 2:
                    i2 = 76;
                    break;
                case 3:
                    i2 = 94;
                    break;
                default:
                    i2 = 47;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1466z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 47);
        }
        return toCharArray;
    }

    protected void activerEcouteurGeste() {
        try {
            this.od.mo3476b();
            if (this.od.m8587m() == null) {
                this.od.m8570a((C0522g) this);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    protected void activerEcouteurGesteMultitouch() {
        try {
            if (kb.m3986p() < C0657a.FROYO.getNumero()) {
                return;
            }
            if (this.od instanceof C1217j) {
                try {
                    ((C1217j) this.od).m8600u();
                    if (this.od.m8587m() == null) {
                        this.od.m8570a((C0522g) this);
                    }
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    protected void appliquerCadreExterieur(C1110m c1110m) {
        try {
            if ((this.N & 8) != 8) {
                try {
                    super.appliquerCadreExterieur(c1110m);
                    this.cb = C1031a.m7461e(c1110m.mo3387l());
                    if (c1110m != null) {
                        if (c1110m.mo3379k()) {
                            this.sd = new Path();
                        }
                    }
                    try {
                        if (c1110m instanceof C1115e) {
                            this.od.m8575b(true);
                        }
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                } catch (IllegalArgumentException e2) {
                    throw e2;
                } catch (IllegalArgumentException e22) {
                    throw e22;
                }
            }
        } catch (IllegalArgumentException e222) {
            throw e222;
        }
    }

    protected void appliquerCouleur(int i) {
        appliquerCouleurFond(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void appliquerModeAffichage() {
        /*
        r5 = this;
        r4 = -1;
        r0 = 0;
        r1 = r5.isImageAffichee();	 Catch:{ IllegalArgumentException -> 0x0009 }
        if (r1 != 0) goto L_0x000b;
    L_0x0008:
        return;
    L_0x0009:
        r0 = move-exception;
        throw r0;
    L_0x000b:
        r1 = r5.od;
        r1 = r1.getDrawable();
        r2 = r1 instanceof android.graphics.drawable.NinePatchDrawable;	 Catch:{ IllegalArgumentException -> 0x005b }
        if (r2 != 0) goto L_0x00d3;
    L_0x0015:
        super.appliquerModeAffichage();	 Catch:{ IllegalArgumentException -> 0x005d }
        r2 = r5.bd;	 Catch:{ IllegalArgumentException -> 0x005d }
        if (r2 == 0) goto L_0x0008;
    L_0x001c:
        if (r1 == 0) goto L_0x0008;
    L_0x001e:
        r2 = r5.bd;	 Catch:{ IllegalArgumentException -> 0x0061 }
        r3 = 77;
        if (r2 != r3) goto L_0x0096;
    L_0x0024:
        r2 = r5.od;	 Catch:{ IllegalArgumentException -> 0x0063 }
        r2 = r2.getScaleType();	 Catch:{ IllegalArgumentException -> 0x0063 }
        r3 = android.widget.ImageView.ScaleType.FIT_XY;	 Catch:{ IllegalArgumentException -> 0x0063 }
        if (r2 == r3) goto L_0x0035;
    L_0x002e:
        r2 = r5.od;	 Catch:{ IllegalArgumentException -> 0x0063 }
        r3 = android.widget.ImageView.ScaleType.FIT_XY;	 Catch:{ IllegalArgumentException -> 0x0063 }
        r2.setScaleType(r3);	 Catch:{ IllegalArgumentException -> 0x0063 }
    L_0x0035:
        r2 = r1 instanceof android.graphics.drawable.BitmapDrawable;
        if (r2 != 0) goto L_0x0065;
    L_0x0039:
        r2 = fr.pcsoft.wdjava.ui.utils.C1508i.m10479a(r1, r4, r4);
        if (r2 == 0) goto L_0x004f;
    L_0x003f:
        r0 = new android.graphics.drawable.BitmapDrawable;
        r3 = fr.pcsoft.wdjava.core.application.WDAppManager.m2569b();
        r0.<init>(r3, r2);
        r2 = android.graphics.Shader.TileMode.REPEAT;
        r3 = android.graphics.Shader.TileMode.REPEAT;
        r0.setTileModeXY(r2, r3);
    L_0x004f:
        if (r0 == 0) goto L_0x0008;
    L_0x0051:
        if (r0 == r1) goto L_0x0008;
    L_0x0053:
        r1 = r5.od;	 Catch:{ IllegalArgumentException -> 0x0059 }
        r1.setImageDrawable(r0);	 Catch:{ IllegalArgumentException -> 0x0059 }
        goto L_0x0008;
    L_0x0059:
        r0 = move-exception;
        throw r0;
    L_0x005b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x005d }
    L_0x005d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x005f }
    L_0x005f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0061 }
    L_0x0061:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0063 }
    L_0x0063:
        r0 = move-exception;
        throw r0;
    L_0x0065:
        r0 = r1;
        r0 = (android.graphics.drawable.BitmapDrawable) r0;
        r2 = r0.getTileModeX();	 Catch:{ IllegalArgumentException -> 0x0094 }
        r3 = android.graphics.Shader.TileMode.REPEAT;	 Catch:{ IllegalArgumentException -> 0x0094 }
        if (r2 != r3) goto L_0x0078;
    L_0x0070:
        r2 = r0.getTileModeY();	 Catch:{ IllegalArgumentException -> 0x0094 }
        r3 = android.graphics.Shader.TileMode.REPEAT;	 Catch:{ IllegalArgumentException -> 0x0094 }
        if (r2 == r3) goto L_0x004f;
    L_0x0078:
        r0 = r0.mutate();
        r0 = (android.graphics.drawable.BitmapDrawable) r0;
        r2 = new android.graphics.drawable.BitmapDrawable;
        r3 = fr.pcsoft.wdjava.core.application.WDAppManager.m2569b();
        r0 = r0.getBitmap();
        r2.<init>(r3, r0);
        r0 = android.graphics.Shader.TileMode.REPEAT;
        r3 = android.graphics.Shader.TileMode.REPEAT;
        r2.setTileModeXY(r0, r3);
        r0 = r2;
        goto L_0x004f;
    L_0x0094:
        r0 = move-exception;
        throw r0;
    L_0x0096:
        r2 = r1 instanceof android.graphics.drawable.BitmapDrawable;	 Catch:{ IllegalArgumentException -> 0x00c9 }
        if (r2 == 0) goto L_0x00cb;
    L_0x009a:
        r1 = (android.graphics.drawable.BitmapDrawable) r1;	 Catch:{ IllegalArgumentException -> 0x00c9 }
    L_0x009c:
        if (r1 == 0) goto L_0x00af;
    L_0x009e:
        r0 = r1.getTileModeX();	 Catch:{ IllegalArgumentException -> 0x00cd }
        if (r0 != 0) goto L_0x00aa;
    L_0x00a4:
        r0 = r1.getTileModeY();	 Catch:{ IllegalArgumentException -> 0x00cf }
        if (r0 == 0) goto L_0x00af;
    L_0x00aa:
        r0 = 0;
        r2 = 0;
        r1.setTileModeXY(r0, r2);	 Catch:{ IllegalArgumentException -> 0x00cf }
    L_0x00af:
        r0 = r5.od;	 Catch:{ IllegalArgumentException -> 0x00d1 }
        r0 = r0.getScaleType();	 Catch:{ IllegalArgumentException -> 0x00d1 }
        r1 = android.widget.ImageView.ScaleType.MATRIX;	 Catch:{ IllegalArgumentException -> 0x00d1 }
        if (r0 == r1) goto L_0x00c0;
    L_0x00b9:
        r0 = r5.od;	 Catch:{ IllegalArgumentException -> 0x00d1 }
        r1 = android.widget.ImageView.ScaleType.MATRIX;	 Catch:{ IllegalArgumentException -> 0x00d1 }
        r0.setScaleType(r1);	 Catch:{ IllegalArgumentException -> 0x00d1 }
    L_0x00c0:
        r0 = r5.od;
        r1 = r5.bd;
        r0.m8568a(r1);
        goto L_0x0008;
    L_0x00c9:
        r0 = move-exception;
        throw r0;
    L_0x00cb:
        r1 = r0;
        goto L_0x009c;
    L_0x00cd:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00cf }
    L_0x00cf:
        r0 = move-exception;
        throw r0;
    L_0x00d1:
        r0 = move-exception;
        throw r0;
    L_0x00d3:
        r0 = r5.od;	 Catch:{ IllegalArgumentException -> 0x00e6 }
        r0 = r0.getScaleType();	 Catch:{ IllegalArgumentException -> 0x00e6 }
        r1 = android.widget.ImageView.ScaleType.FIT_XY;	 Catch:{ IllegalArgumentException -> 0x00e6 }
        if (r0 == r1) goto L_0x0008;
    L_0x00dd:
        r0 = r5.od;	 Catch:{ IllegalArgumentException -> 0x00e6 }
        r1 = android.widget.ImageView.ScaleType.FIT_XY;	 Catch:{ IllegalArgumentException -> 0x00e6 }
        r0.setScaleType(r1);	 Catch:{ IllegalArgumentException -> 0x00e6 }
        goto L_0x0008;
    L_0x00e6:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.ui.champs.image.WDChampImage.appliquerModeAffichage():void");
    }

    protected void appliquerTransparent() {
        appliquerCouleurFondTransparent();
    }

    protected boolean canScroll(int i, int i2) {
        try {
            if (super.canScroll(i, i2)) {
                return true;
            }
            if (this.od.m8587m() != null) {
                return true;
            }
            int abs = Math.abs(i) - Math.abs(i2);
            if (abs < 0) {
                return this.od.canScrollVertically(i2);
            }
            try {
                return !this.od.canScrollHorizontally(i) ? abs != 0 ? false : this.od.canScrollVertically(i2) : true;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    public void convertirPositionDansImage(int[] iArr) {
        if (isImageAffichee()) {
            float[] fArr = new float[9];
            Matrix imageMatrix = this.od.getImageMatrix();
            if (imageMatrix != null) {
                try {
                    imageMatrix.getValues(fArr);
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            iArr[0] = (int) (((float) iArr[0]) - fArr[2]);
            iArr[1] = (int) (((float) iArr[1]) - fArr[5]);
            float t = this.od.m8592t();
            if (((double) t) != 1.0d) {
                try {
                    iArr[0] = (int) (((float) iArr[0]) / t);
                    iArr[1] = (int) (((float) iArr[1]) / t);
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            }
            Drawable drawable = this.od.getDrawable();
            if (drawable instanceof BitmapDrawable) {
                t = ((float) C1511l.m10528c()) / ((float) ((BitmapDrawable) drawable).getBitmap().getDensity());
                iArr[0] = (int) (((float) iArr[0]) / t);
                iArr[1] = (int) (((float) iArr[1]) / t);
                return;
            }
            return;
        }
        iArr[0] = -1;
        iArr[1] = -1;
    }

    protected C1216i createView() {
        return new C1218k(this, C1056i.m7562a());
    }

    protected C1353s creerCopieImage(int i, int i2, int i3, int i4, int i5) {
        Object obj = (i5 & 2) == 2 ? 1 : null;
        Object obj2 = (i5 & 4) == 4 ? 1 : null;
        int largeurCompDessin = getLargeurCompDessin();
        int hauteurCompDessin = getHauteurCompDessin();
        try {
            Object obj3;
            int i6;
            if (this.od.getWidth() == largeurCompDessin && this.od.getHeight() == hauteurCompDessin) {
                obj3 = obj2;
            } else {
                this.od.measure(1073741824 + largeurCompDessin, 1073741824 + hauteurCompDessin);
                this.od.layout(0, 0, largeurCompDessin, hauteurCompDessin);
                obj3 = 1;
            }
            Canvas canvas = new Canvas();
            if (obj != null) {
                try {
                    largeurCompDessin = _getLargeur();
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            if (obj != null) {
                try {
                    hauteurCompDessin = _getHauteur();
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            }
            if (largeurCompDessin <= 0 || hauteurCompDessin <= 0) {
                C0691a.m2856a(Bd[0]);
                largeurCompDessin = Math.max(1, largeurCompDessin);
                hauteurCompDessin = Math.max(1, hauteurCompDessin);
                i6 = largeurCompDessin;
            } else {
                i6 = largeurCompDessin;
            }
            Bitmap createBitmap = Bitmap.createBitmap(i6, hauteurCompDessin, Config.ARGB_8888);
            canvas.setBitmap(createBitmap);
            canvas.save();
            int i7;
            switch (i) {
                case 1:
                    canvas.scale(1.0f, -1.0f);
                    canvas.translate(0.0f, (float) (-hauteurCompDessin));
                    i7 = 1;
                    break;
                case 2:
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate((float) (-i6), 0.0f);
                    i7 = 1;
                    break;
                case 4:
                    canvas.rotate((float) i2, (float) (i6 / 2), (float) (hauteurCompDessin / 2));
                    i7 = 1;
                    break;
                case 8:
                    canvas.scale(((float) i2) / ((float) i6), ((float) i3) / ((float) hauteurCompDessin));
                    i7 = 1;
                    break;
                default:
                    Object obj4 = null;
                    break;
            }
            View decorView = ((WDFenetre) this.l).getActivite().getWindow().getDecorView();
            if (decorView.getWidth() == 0) {
                obj3 = 1;
            }
            if (obj3 == null && r6 == null) {
                try {
                    if (this.od.isShown() && !C1503b.m10438a(getCompConteneur())) {
                        try {
                            int[] iArr = new int[2];
                            try {
                                iArr[0] = obj != null ? 0 : this.od.getLeft();
                                iArr[1] = obj != null ? 0 : this.od.getTop();
                                C1503b.m10427a(getCompConteneur(), iArr, decorView);
                                canvas.translate((float) (-iArr[0]), (float) (-iArr[1]));
                                canvas.clipRect((float) iArr[0], (float) iArr[1], (float) (iArr[0] + i6), (float) (hauteurCompDessin + iArr[1]), Op.REPLACE);
                                decorView.draw(canvas);
                                canvas.restore();
                                return new C1353s(canvas, createBitmap);
                            } catch (IllegalArgumentException e22) {
                                throw e22;
                            }
                        } catch (IllegalArgumentException e222) {
                            throw e222;
                        }
                    }
                } catch (IllegalArgumentException e2222) {
                    throw e2222;
                }
            }
            View view = this.od;
            if (obj3 == null) {
                view = getCompConteneur();
                if (obj == null) {
                    try {
                        canvas.clipRect(this.od.getLeft(), this.od.getTop(), this.od.getRight(), this.od.getBottom());
                    } catch (IllegalArgumentException e22222) {
                        throw e22222;
                    }
                }
                canvas.clipRect(0, 0, view.getWidth(), view.getHeight());
            } else {
                canvas.clipRect(0, 0, view.getWidth(), view.getHeight());
            }
            view.draw(canvas);
            canvas.restore();
            return new C1353s(canvas, createBitmap);
        } catch (IllegalArgumentException e222222) {
            throw e222222;
        }
    }

    protected void deplacementAuDoigt() {
        initialiserAction();
    }

    protected WDObjet executerPCode(int i) {
        switch (i) {
            case C0607n.yt /*179*/:
                deplacementAuDoigt();
                return null;
            case 1111:
                super.executerPCode(1111);
                appelPCode(C0607n.yt);
                return null;
            case C0607n.gi /*1123*/:
                try {
                    scroll();
                    return null;
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            case C0607n.jt /*1124*/:
                fling();
                return null;
            case C0607n.ju /*1125*/:
                scale();
                return null;
            default:
                return super.executerPCode(i);
        }
    }

    protected void fling() {
        initialiserAction();
    }

    public WDBooleen getAnimation() {
        try {
            return new WDBooleen((this.Ec & 64) == 64);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public WDBooleen getAnimationInitiale() {
        try {
            return new WDBooleen((this.Ec & 32) == 32);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public Path getBorderClipPath() {
        return this.sd;
    }

    public View getCompPrincipal() {
        return this.od;
    }

    public int getCouleurPixel(int i, int i2) throws C1489s {
        try {
            return getImageMemoire(1).m9794h().m9725f().getPixel(C1511l.m10532d((float) i, getDisplayUnit()), C1511l.m10532d((float) i2, getDisplayUnit()));
        } catch (IllegalArgumentException e) {
            throw new C1489s("");
        }
    }

    protected int getHauteurCompDessin() {
        return (this.od.m8583g() - this.od.getPaddingTop()) - this.od.getPaddingBottom();
    }

    protected int getHauteurOriginaleImage() {
        Drawable drawable = this.od.getDrawable();
        if (drawable == null) {
            return 0;
        }
        try {
            return drawable.getIntrinsicHeight();
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public C1336b getImagePeintre(int i, boolean z) {
        if (i != 3) {
            return super.getImagePeintre(i, z);
        }
        try {
            if (this.Nc != null) {
                return this.Nc.m9794h().m9720a(z);
            }
            Drawable drawable = this.od.getDrawable();
            if (drawable != null) {
                Bitmap a;
                Bitmap a2 = C1508i.m10479a(drawable, -1, -1);
                if (z) {
                    try {
                        if ((drawable instanceof BitmapDrawable) && a2 != null) {
                            a = C1508i.m10476a(a2, -1, -1);
                            if (a != null) {
                                try {
                                    return new C1348m(a);
                                } catch (IllegalArgumentException e) {
                                    throw e;
                                }
                            }
                        }
                    } catch (IllegalArgumentException e2) {
                        throw e2;
                    }
                }
                a = a2;
                if (a != null) {
                    return new C1348m(a);
                }
            }
            return null;
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    protected int getLargeurCompDessin() {
        return (this.od.m8588n() - this.od.getPaddingLeft()) - this.od.getPaddingRight();
    }

    protected int getLargeurOriginaleImage() {
        Drawable drawable = this.od.getDrawable();
        if (drawable == null) {
            return 0;
        }
        try {
            return drawable.getIntrinsicWidth();
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public final int getMargin() {
        return this.od.getPaddingLeft();
    }

    public int getOpacitePixel(int i, int i2) throws C1489s {
        return C1031a.m7448a(getCouleurPixel(i, i2));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public fr.pcsoft.wdjava.ui.p065b.C1104o getOptions() {
        /*
        r6 = this;
        r2 = 1;
        r1 = 0;
        r0 = r6.yd;
        r3 = r0.m7991c();
        r0 = r6.md;
        r3.f3341c = r0;
        r0 = r6.Yc;
        r3.f3342d = r0;
        r0 = r6.bd;
        switch(r0) {
            case 0: goto L_0x0058;
            case 67: goto L_0x0058;
            case 77: goto L_0x0058;
            case 78: goto L_0x0058;
            default: goto L_0x0015;
        };
    L_0x0015:
        r0 = r6.od;	 Catch:{ IllegalArgumentException -> 0x005a }
        r0 = r0.m8585j();	 Catch:{ IllegalArgumentException -> 0x005a }
        r4 = fr.pcsoft.wdjava.ui.champs.image.C1212e.MULTITOUCH;	 Catch:{ IllegalArgumentException -> 0x005a }
        if (r0 != r4) goto L_0x0027;
    L_0x001f:
        r0 = fr.pcsoft.wdjava.ui.champs.zr.bb.class;
        r0 = r6.getChampParent(r0);	 Catch:{ IllegalArgumentException -> 0x005c }
        if (r0 == 0) goto L_0x005e;
    L_0x0027:
        r0 = r2;
    L_0x0028:
        if (r0 == 0) goto L_0x0043;
    L_0x002a:
        r4 = r6.isFenetreCree();	 Catch:{ IllegalArgumentException -> 0x0060 }
        if (r4 != 0) goto L_0x0043;
    L_0x0030:
        r4 = r6.Kb;	 Catch:{ IllegalArgumentException -> 0x0062 }
        r5 = 3;
        r4 = fr.pcsoft.wdjava.core.C0727l.m3092b(r4, r5);	 Catch:{ IllegalArgumentException -> 0x0062 }
        if (r4 != 0) goto L_0x0042;
    L_0x0039:
        r4 = r6.Kb;	 Catch:{ IllegalArgumentException -> 0x0062 }
        r5 = 1;
        r4 = fr.pcsoft.wdjava.core.C0727l.m3092b(r4, r5);	 Catch:{ IllegalArgumentException -> 0x0062 }
        if (r4 == 0) goto L_0x0043;
    L_0x0042:
        r0 = r1;
    L_0x0043:
        r4 = r6.od;	 Catch:{ IllegalArgumentException -> 0x0064 }
        r3.m7986a(r4, r0);	 Catch:{ IllegalArgumentException -> 0x0064 }
        r0 = r6.m1464p();	 Catch:{ IllegalArgumentException -> 0x0064 }
        if (r0 != 0) goto L_0x0054;
    L_0x004e:
        r0 = r6.isFenetreCree();	 Catch:{ IllegalArgumentException -> 0x0066 }
        if (r0 != 0) goto L_0x0055;
    L_0x0054:
        r1 = r2;
    L_0x0055:
        r3.f3340b = r1;
        return r3;
    L_0x0058:
        r0 = r1;
        goto L_0x0043;
    L_0x005a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x005c }
    L_0x005c:
        r0 = move-exception;
        throw r0;
    L_0x005e:
        r0 = r1;
        goto L_0x0028;
    L_0x0060:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0062 }
    L_0x0062:
        r0 = move-exception;
        throw r0;
    L_0x0064:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0066 }
    L_0x0066:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.ui.champs.image.WDChampImage.getOptions():fr.pcsoft.wdjava.ui.b.o");
    }

    public int getParamAnimationImage(String str) {
        try {
            if (str.equalsIgnoreCase(Bd[8])) {
                return this.yd.m7988a(4) ? 1 : 0;
            } else {
                try {
                    if (str.equalsIgnoreCase(Bd[7])) {
                        return this.yd.f3348l;
                    }
                    try {
                        if (str.equalsIgnoreCase(Bd[5])) {
                            return !this.yd.m7988a(2) ? 0 : 1;
                        } else {
                            try {
                                return str.equalsIgnoreCase(Bd[6]) ? !this.yd.m7988a(8) ? 0 : 1 : 0;
                            } catch (IllegalArgumentException e) {
                                throw e;
                            } catch (IllegalArgumentException e2) {
                                throw e2;
                            }
                        }
                    } catch (IllegalArgumentException e22) {
                        throw e22;
                    } catch (IllegalArgumentException e222) {
                        throw e222;
                    }
                } catch (IllegalArgumentException e2222) {
                    throw e2222;
                }
            }
        } catch (IllegalArgumentException e22222) {
            throw e22222;
        } catch (IllegalArgumentException e222222) {
            throw e222222;
        }
    }

    public WDObjet getRetraitGauche() {
        try {
            return this.Zb != null ? new WDEntier4((double) C1511l.m10515a((float) getMargin(), 1, getDisplayUnit())) : super.getRetraitGauche();
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public WDObjet getScrollAuDoigt() {
        return new WDBooleen(this.od.m8590p());
    }

    public View getScrollableView() {
        return this.od;
    }

    public WDEntier4 getZoom() {
        return new WDEntier4((double) (this.od.m8592t() * 100.0f));
    }

    public WDObjet getZoomAuDoigt() {
        try {
            return new WDBooleen(this.od.m8585j() == C1212e.MULTITOUCH);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public void handleScroll(MotionEvent motionEvent) {
        try {
            if (this.od.m8585j() == C1212e.MULTITOUCH) {
                if (motionEvent.getPointerCount() == 2) {
                    try {
                        if ((this.N & 16) == 0) {
                            requestDisallowInterceptTouchEvent(true);
                            this.N |= 16;
                            return;
                        }
                        return;
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
            }
            super.handleScroll(motionEvent);
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    public boolean isChampEditableDansZR() {
        try {
            if (!isClicable()) {
                if (this.Zb == null) {
                    return false;
                }
            }
            return true;
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public boolean isChampFocusable() {
        return false;
    }

    public boolean isImageAffichee() {
        try {
            return this.od.getDrawable() != null;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    protected boolean isInterceptTouchEventForScroll() {
        try {
            if (super.isInterceptTouchEventForScroll()) {
                return true;
            }
            if (_getEtat() == 0) {
                try {
                    if (canScroll(1, 1)) {
                        return true;
                    }
                    try {
                        if (canScroll(-1, -1)) {
                            return true;
                        }
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            }
            return false;
        } catch (IllegalArgumentException e22) {
            throw e22;
        } catch (IllegalArgumentException e222) {
            throw e222;
        }
    }

    public void onDoubleTap(int i, int i2) {
    }

    protected final boolean onDrawInternal(Canvas canvas) {
        try {
            if (this.Nc != null) {
                canvas.drawBitmap(this.Nc.m9794h().m9725f(), 0.0f, 0.0f, null);
                return true;
            }
            try {
                if (m1464p() && (this.Ec & 16) == 16) {
                    bb bbVar = (bb) getChampParent(bb.class);
                    if (bbVar != null) {
                        try {
                            if (bbVar.getRenderingMode() != fb.VIEWS_RECYCLING) {
                                m1463o().m8604a(canvas, this.od.getWidth(), this.od.getHeight());
                            }
                            return true;
                        } catch (IllegalArgumentException e) {
                            throw e;
                        }
                    }
                }
                return false;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    public void onFling(int i, int i2) {
        try {
            if (!isBloqueTouchEvent()) {
                C0938m.m6814b(new C1211d(this, i, i2));
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    protected void onImageChanged() {
        try {
            if (this.od.getAnimation() != null) {
                this.od.getAnimation().setAnimationListener(null);
                this.od.clearAnimation();
            }
            try {
                if (this.nd != null) {
                    this.nd.m7957f();
                    this.nd = null;
                }
                this.rd = -1;
                this.xd = -1;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public void onScale(float f, float f2, float f3, float f4) {
        try {
            if (!isBloqueTouchEvent()) {
                try {
                    WDGesture.Distance.setValeur((double) Math.abs(f));
                    appelPCode(C0607n.ju);
                    if (this.wd != null) {
                        appelPCodeAvecParametres(C0607n.ju, this.wd, new WDEntier4((double) f));
                    }
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public void onScroll(int i, int i2) {
        int i3 = 2;
        try {
            if (!isBloqueTouchEvent()) {
                try {
                    if (Math.abs(i) > Math.abs(i2)) {
                        WDEntier4 wDEntier4 = WDGesture.Direction;
                        if (i <= 0) {
                            i3 = 1;
                        }
                        wDEntier4.setValeur(i3);
                        WDGesture.Distance.setValeur(Math.abs(i));
                    } else {
                        try {
                            WDGesture.Direction.setValeur(i2 > 0 ? 11 : 12);
                            WDGesture.Distance.setValeur(Math.abs(i2));
                        } catch (IllegalArgumentException e) {
                            throw e;
                        }
                    }
                    try {
                        appelPCode(C0607n.gi);
                        if (this.td != null) {
                            appelPCodeAvecParametres(C0607n.gi, this.td, new WDEntier4(i), new WDEntier4(i2));
                        }
                    } catch (IllegalArgumentException e2) {
                        throw e2;
                    }
                } catch (IllegalArgumentException e22) {
                    throw e22;
                } catch (IllegalArgumentException e222) {
                    throw e222;
                }
            }
        } catch (IllegalArgumentException e2222) {
            throw e2222;
        }
    }

    public void release() {
        try {
            super.release();
            if (this.od != null) {
                onImageChanged();
                this.od.mo3478h();
                this.od = null;
            }
            try {
                if (this.qd != null) {
                    this.qd.m2261c();
                    this.qd = null;
                }
                try {
                    if (this.wd != null) {
                        this.wd.m2261c();
                        this.wd = null;
                    }
                    try {
                        if (this.td != null) {
                            this.td.m2261c();
                            this.td = null;
                        }
                        this.sd = null;
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            } catch (IllegalArgumentException e22) {
                throw e22;
            }
        } catch (IllegalArgumentException e222) {
            throw e222;
        }
    }

    protected boolean sauverEvtTouch(MotionEvent motionEvent) {
        try {
            if (!super.sauverEvtTouch(motionEvent)) {
                switch (motionEvent.getAction() & 255) {
                    case 5:
                    case 6:
                        this.tc = motionEvent;
                        return true;
                }
            }
            return false;
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public boolean sauverImage(OutputStream outputStream) {
        Drawable drawable = this.od.getDrawable();
        if (drawable != null) {
            Bitmap a = C1508i.m10479a(drawable, -1, -1);
            if (a != null) {
                try {
                    return a.compress(kb.m3986p() < C0657a.ECLAIR.getNumero() ? CompressFormat.JPEG : CompressFormat.PNG, 100, outputStream);
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
        }
        return false;
    }

    protected void scale() {
        initialiserAction();
    }

    protected void scroll() {
        initialiserAction();
    }

    public void setAnimation(boolean z) {
        try {
            if (z != ((this.Ec & 64) == 64)) {
                if (z) {
                    try {
                        this.Ec |= 64;
                        m1461m();
                        return;
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
                this.Ec &= -65;
                m1458j();
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public void setAnimationInitiale(boolean z) {
        if (z) {
            try {
                this.Ec |= 32;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        this.Ec &= -33;
        setAnimation(z);
    }

    protected void setCallbackPCodeFling(String str) {
        try {
            if (this.qd == null) {
                this.qd = WDCallback.m2240a(str, -1);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    protected void setCallbackPCodeScale(String str) {
        try {
            if (this.wd == null) {
                this.wd = WDCallback.m2240a(str, -1);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    protected void setCallbackPCodeScroll(String str) {
        try {
            if (this.td == null) {
                this.td = WDCallback.m2240a(str, -1);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    protected final void setChargementEnTacheDeFond(boolean z) {
        if (z) {
            try {
                this.Ec |= 4;
                return;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        this.Ec &= -5;
    }

    public void setCouleur(int i) {
        super.setCouleur(i);
        this.L = i;
    }

    public void setCouleurFond(int i) {
        super.setCouleurFond(i);
        this.cb = i;
    }

    public void setDrawable(Drawable drawable) {
        onImageChanged();
        this.hd = "";
        m1453a(drawable);
    }

    public void setImagePeintre(C1336b c1336b) {
        if (c1336b != null) {
            Bitmap bitmap = null;
            if (isImageAffichee()) {
                Drawable drawable = this.od.getDrawable();
                if (drawable instanceof BitmapDrawable) {
                    bitmap = ((BitmapDrawable) drawable).getBitmap();
                }
            }
            Bitmap bitmap2 = (Bitmap) c1336b.mo3728e();
            if (bitmap != bitmap2) {
                setDrawable(new BitmapDrawable(WDAppManager.m2569b(), bitmap2));
            }
        }
    }

    @TargetApi(16)
    public final void setMargin(int i) {
        try {
            this.od.setPadding(i, i, i, i);
            if (kb.m3965a(C0657a.JELLY_BEAN)) {
                this.od.setCropToPadding(true);
                return;
            }
            try {
                Field declaredField = ImageView.class.getDeclaredField(Bd[4]);
                declaredField.setAccessible(true);
                declaredField.set(this.od, Boolean.valueOf(true));
            } catch (Exception e) {
                C0691a.m2857a(Bd[3], e);
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    protected void setOrientationExif(boolean z) {
        try {
            super.setOrientationExif(z);
            this.yd.m7989b((this.Ec & 2) == 2);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    protected final void setParamAnimation(int i, int i2, boolean z, int i3, boolean z2, boolean z3) {
        this.yd.m7985a(2, z);
        this.yd.m7985a(4, z2);
        this.yd.f3348l = i3;
        this.yd.m7985a(8, z3);
        this.yd.f3345h = i;
        this.yd.f3349n = i2;
    }

    protected void setParamAnimationChamp(int i, int i2, int i3) {
        if (i == 24) {
            try {
                if (this.Ad != null) {
                    this.Ad.mo3771b();
                    this.Ad = null;
                }
                if (i2 != 0) {
                    if (i3 == 0) {
                        i3 = 600;
                    }
                    this.Ad = new C1410k(i2, i3);
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    public void setParamAnimationImage(String str, int i) {
        boolean z = false;
        boolean z2 = true;
        try {
            if (getParamAnimationImage(str) != i) {
                Drawable drawable = this.od.getDrawable();
                C1104o c1104o = this.yd;
                try {
                    if (str.equalsIgnoreCase(Bd[8])) {
                        try {
                            c1104o.m7985a(4, i != 0);
                            if (drawable instanceof C1085a) {
                                C1085a c1085a = (C1085a) drawable;
                                if (c1104o.m7988a(4)) {
                                    z2 = false;
                                }
                                c1085a.setOneShot(z2);
                                z2 = false;
                            }
                        } catch (IllegalArgumentException e) {
                            throw e;
                        } catch (IllegalArgumentException e2) {
                            throw e2;
                        }
                    } else if (str.equalsIgnoreCase(Bd[7])) {
                        c1104o.f3348l = i;
                    } else {
                        try {
                            if (str.equalsIgnoreCase(Bd[5])) {
                                try {
                                    c1104o.m7985a(2, i != 0);
                                    if (drawable instanceof C1085a) {
                                        ((C1085a) drawable).m7897a(c1104o.m7988a(2));
                                        z2 = false;
                                    }
                                } catch (IllegalArgumentException e22) {
                                    throw e22;
                                }
                            }
                            try {
                                if (str.equalsIgnoreCase(Bd[6])) {
                                    if (i != 0) {
                                        z = true;
                                    }
                                    c1104o.m7985a(8, z);
                                } else {
                                    z2 = false;
                                }
                            } catch (IllegalArgumentException e222) {
                                throw e222;
                            } catch (IllegalArgumentException e2222) {
                                throw e2222;
                            }
                        } catch (IllegalArgumentException e22222) {
                            throw e22222;
                        } catch (IllegalArgumentException e222222) {
                            throw e222222;
                        }
                    }
                    try {
                        this.yd = c1104o;
                        if ((drawable instanceof AnimationDrawable) && r3) {
                            m1453a(C1085a.m7890a((AnimationDrawable) drawable, c1104o.f3348l, c1104o.m7988a(8), c1104o.m7988a(2), c1104o.m7988a(4)));
                        }
                    } catch (IllegalArgumentException e2222222) {
                        throw e2222222;
                    } catch (IllegalArgumentException e22222222) {
                        throw e22222222;
                    }
                } catch (IllegalArgumentException e222222222) {
                    throw e222222222;
                } catch (IllegalArgumentException e2222222222) {
                    throw e2222222222;
                }
            }
        } catch (IllegalArgumentException e22222222222) {
            throw e22222222222;
        }
    }

    protected void setParamImage(int i, int i2, boolean z, int i3) {
        boolean z2 = true;
        boolean z3 = false;
        if ((this.N & 8) == 8) {
            z = false;
            i2 = 0;
        }
        switch (i2) {
            case 1:
                break;
            case 2:
                z3 = true;
                break;
            default:
                if (i2 != 0) {
                    z2 = false;
                }
                C0691a.m2860a(z2, Bd[9]);
                z2 = false;
                break;
        }
        try {
            this.od.m8571a(z2);
            if (z3) {
                this.od.mo3475a(C1212e.MULTITOUCH);
            } else {
                this.od.m8586l();
            }
            this.od.m8579c(z);
            this.od.m8574b(i3);
            setPositionImage(i);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public void setRetraitGauche(int i) {
        try {
            if (this.Zb != null) {
                setMargin(C1511l.m10532d((float) i, getDisplayUnit()));
            } else {
                super.setRetraitGauche(i);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public void setScrollAuDoigt(boolean z) {
        this.od.m8571a(z);
    }

    public void setSymetrie(int i) {
        this.Yc = i;
        Drawable drawable = this.od.getDrawable();
        if (drawable != null) {
            try {
                if (!(drawable instanceof BitmapDrawable)) {
                    return;
                }
                if (this.Yc != 0) {
                    this.od.setImageDrawable(new BitmapDrawable(WDAppManager.m2569b(), C1508i.m10474a(((BitmapDrawable) drawable).getBitmap(), this.Yc)));
                }
            } catch (IllegalArgumentException e) {
                throw e;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
    }

    public void setValeur(C1353s c1353s) {
        setDrawable(new BitmapDrawable(WDAppManager.m2569b(), c1353s.m9725f()));
    }

    public void setValeur(String str) {
        try {
            if (this.nd != null) {
                if (!this.nd.isCancelled()) {
                    try {
                        if (str.equals(this.nd.m7955d())) {
                            return;
                        }
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
            }
            boolean k = C0808l.m4053k(str);
            try {
                if (this.hd.equals(str)) {
                    if (isImageAffichee() && !k) {
                        try {
                            if (this.Nc == null) {
                                try {
                                    if (m1464p()) {
                                        try {
                                            if (!m1457i()) {
                                                return;
                                            }
                                        } catch (IllegalArgumentException e2) {
                                            throw e2;
                                        }
                                    }
                                } catch (IllegalArgumentException e22) {
                                    throw e22;
                                }
                            }
                        } catch (IllegalArgumentException e222) {
                            throw e222;
                        }
                    }
                }
                try {
                    onImageChanged();
                    if (k) {
                        this.hd = "";
                        m1453a(null);
                        return;
                    }
                    this.hd = str;
                    m1454a(new C1101l(this.hd, getOptions()));
                } catch (IllegalArgumentException e2222) {
                    throw e2222;
                }
            } catch (IllegalArgumentException e22222) {
                throw e22222;
            } catch (IllegalArgumentException e222222) {
                try {
                    throw e222222;
                } catch (IllegalArgumentException e2222222) {
                    throw e2222222;
                }
            }
        } catch (IllegalArgumentException e22222222) {
            throw e22222222;
        } catch (IllegalArgumentException e222222222) {
            throw e222222222;
        }
    }

    public void setValeur(byte[] bArr) {
        int length = bArr.length;
        long a = C0897o.m6238a(bArr);
        try {
            if (length == this.xd) {
                if (this.rd == a) {
                    return;
                }
            }
            onImageChanged();
            this.rd = a;
            this.xd = length;
            this.hd = "";
            if (length > 0) {
                m1454a(new C1100k(bArr, getOptions()));
            } else {
                m1453a(null);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public void setZoneClicage(boolean z) {
        try {
            super.setZoneClicage(z);
            if (isClicable()) {
                this.od.setOnClickListener(new C1221m(this));
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public void setZoom(int i) {
        try {
            if (this.od.m8582f()) {
                this.od.m8573b(((float) i) / 100.0f);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public void setZoomAuDoigt(boolean z) {
        if (z) {
            this.od.mo3475a(C1212e.MULTITOUCH);
            return;
        }
        try {
            this.od.m8586l();
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    protected void updateTailleChamp() {
        try {
            appliquerModeAffichage();
            if (this.Nc != null) {
                boolean z;
                if (this.od.getHeight() != 0) {
                    try {
                        if (this.od.getWidth() != 0) {
                            z = false;
                            C1503b.m10451e(this.od).post(new C1214g(this, z));
                        }
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
                z = true;
                C1503b.m10451e(this.od).post(new C1214g(this, z));
            }
            try {
                if (this.nd == null) {
                    return;
                }
                if (!this.nd.isCancelled()) {
                    this.nd.m7949a();
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            } catch (IllegalArgumentException e22) {
                throw e22;
            }
        } catch (IllegalArgumentException e222) {
            throw e222;
        } catch (IllegalArgumentException e2222) {
            throw e2222;
        }
    }
}
