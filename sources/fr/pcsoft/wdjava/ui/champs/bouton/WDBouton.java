package fr.pcsoft.wdjava.ui.champs.bouton;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import android.graphics.drawable.StateListDrawable;
import android.text.method.HideReturnsTransformationMethod;
import android.view.View;
import android.widget.Button;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.file.C0897o;
import fr.pcsoft.wdjava.ui.C1471o;
import fr.pcsoft.wdjava.ui.activite.C1056i;
import fr.pcsoft.wdjava.ui.cadre.C1110m;
import fr.pcsoft.wdjava.ui.cadre.C1114d;
import fr.pcsoft.wdjava.ui.cadre.C1115e;
import fr.pcsoft.wdjava.ui.champs.fenetre.C0509v;
import fr.pcsoft.wdjava.ui.champs.gc;
import fr.pcsoft.wdjava.ui.p064a.C1031a;
import fr.pcsoft.wdjava.ui.p065b.C1093d;
import fr.pcsoft.wdjava.ui.p065b.C1094e;
import fr.pcsoft.wdjava.ui.p065b.C1104o;
import fr.pcsoft.wdjava.ui.p065b.p066b.C1085a;
import fr.pcsoft.wdjava.ui.p065b.p067a.wb;
import fr.pcsoft.wdjava.ui.p079e.C1399b;
import fr.pcsoft.wdjava.ui.p080h.C1424g;
import fr.pcsoft.wdjava.ui.utils.C1503b;
import fr.pcsoft.wdjava.ui.utils.C1511l;

public class WDBouton extends gc implements C0529a {
    private static final int Ec = C1511l.f4641o;
    private static final int Hc = 11;
    private static final int Rc = 11;
    private static final int Uc = C1511l.f4645s;
    private static final String[] Yc = new String[]{m1527z(m1528z("k\u0019Q=")), m1527z(m1528z("\b\u0005C?N!MÎ.\u00077\u000fJ?\u00001JN4\u0018$\u0006N>\u000bk")), m1527z(m1528z("f(h\u000f:\n$"))};
    private static final int xc = 11;
    private static final int zc = 7;
    private int[] Ac;
    private String Bc;
    private String Cc;
    private int Dc;
    private int[] Fc;
    private boolean Gc;
    private Drawable Ic;
    private int[] Jc;
    private Button Kc;
    private boolean Lc;
    private C1110m Mc;
    private int Nc;
    private int Oc;
    private long Pc;
    private Rect Qc;
    private boolean Sc;
    private long Tc;
    private boolean Vc;
    private String Wc;
    private String Xc;
    private Path yc;

    @TargetApi(21)
    public WDBouton() {
        this.Kc = null;
        this.Xc = "";
        this.Cc = "";
        this.Wc = "";
        this.Pc = C1094e.m7939a();
        this.Bc = "";
        this.Tc = C1094e.m7939a();
        this.Ic = null;
        this.Mc = null;
        this.Lc = false;
        this.Sc = false;
        this.Nc = 0;
        this.Vc = false;
        this.Dc = 0;
        this.Qc = null;
        this.yc = null;
        this.Oc = -1;
        this.Jc = null;
        this.Ac = null;
        this.Fc = null;
        this.Gc = false;
        this.Kc = new C1127b(this, C1056i.m7562a());
        this.Kc.setGravity(0);
        this.Kc.setOnClickListener(new C1128c(this));
        this.Kc.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        C1094e.m7940a(this.Pc, 16, (byte) 4);
        this.Kc.setIncludeFontPadding(C1471o.m10303a());
    }

    /* renamed from: a */
    private final Drawable m1522a(Drawable drawable) {
        Drawable[] drawableArr;
        if (drawable instanceof StateListDrawable) {
            Drawable[] children = ((DrawableContainerState) ((DrawableContainer) drawable).getConstantState()).getChildren();
            int[] iArr = null;
            switch (this.Fc.length) {
                case 2:
                    iArr = new int[]{this.Fc[1], this.Fc[0]};
                    break;
                case 3:
                    iArr = new int[]{this.Fc[2], this.Fc[1], this.Fc[0]};
                    break;
                case 4:
                case 5:
                    iArr = new int[]{this.Fc[2], this.Fc[1], this.Fc[3], this.Fc[0]};
                    break;
            }
            if (iArr != null) {
                this.Fc = iArr;
            }
            drawableArr = children;
        } else {
            drawableArr = new Drawable[]{drawable};
        }
        int i = 0;
        int i2 = 0;
        while (i < drawableArr.length) {
            int i3;
            if (!(drawableArr[i] instanceof AnimationDrawable)) {
                i3 = i2;
            } else if (i < this.Fc.length) {
                Drawable drawable2 = drawableArr[i];
                drawableArr[i] = C1085a.m7890a((AnimationDrawable) drawableArr[i], -1, (this.Fc[i] & 8) > 0, (this.Fc[i] & 2) > 0, (this.Fc[i] & 4) > 0);
                drawableArr[i].setBounds(drawable2.getBounds());
                drawableArr[i].setCallback(drawable2.getCallback());
                i3 = 1;
            } else {
                i2 = 1;
                if (drawableArr.length == 1) {
                    drawable = drawableArr[0];
                }
                if (i2 != 0) {
                    drawable.setCallback(new C1134h(this));
                }
                return drawable;
            }
            i++;
            i2 = i3;
        }
        if (drawableArr.length == 1) {
            drawable = drawableArr[0];
        }
        if (i2 != 0) {
            drawable.setCallback(new C1134h(this));
        }
        return drawable;
    }

    /* renamed from: a */
    private void m1523a() {
        int i;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        if (this.S && !C0808l.m4053k(this.Xc)) {
            byte a = this.Ic != null ? C1094e.m7936a(this.Pc, 16) : (byte) -1;
            switch (this.Kc.getGravity() & 112) {
                case 16:
                    i2 = a == (byte) 1 ? Uc : 0;
                    if (a != (byte) 7) {
                        i3 = 0;
                        break;
                    } else {
                        i3 = Uc;
                        break;
                    }
                case 48:
                    i2 = 0;
                    if (a != (byte) 7) {
                        i3 = 0;
                        break;
                    } else {
                        i3 = Uc;
                        break;
                    }
                case 80:
                    i2 = a == (byte) 1 ? Uc : 0;
                    i3 = 0;
                    break;
            }
            int i6;
            switch (this.Kc.getGravity() & 7) {
                case 1:
                    i6 = a == (byte) 3 ? Uc : 0;
                    i5 = a == (byte) 5 ? Uc : 0;
                    i = i6;
                    break;
                case 3:
                    i6 = Uc;
                    i5 = a == (byte) 5 ? Uc : 0;
                    i = i6;
                    break;
                case 5:
                    i = a == (byte) 3 ? Uc : 0;
                    i5 = Uc;
                    break;
                default:
                    i = 0;
                    i5 = 0;
                    break;
            }
            i3 += this.Nc;
            i4 = i5;
            i5 = i;
        }
        if (m1526d()) {
            i = this.Kc.getWidth();
            int height = this.Kc.getHeight();
            int i7 = i / 2;
            int i8 = height / 2;
            int ceil = (int) Math.ceil((2.0d * ((double) Math.min(i / 2, height / 2))) * (Math.sqrt(2.0d) / 2.0d));
            i5 = Math.max(i5, i7 - (ceil / 2));
            i2 = Math.max(i2, i8 - (ceil / 2));
            i4 = Math.max(i4, i - (i7 + (ceil / 2)));
            i3 = Math.max(i3, height - ((ceil / 2) + i8));
        }
        if (i2 != this.Kc.getPaddingTop() || i3 != this.Kc.getPaddingBottom() || i5 != this.Kc.getPaddingLeft() || i4 != this.Kc.getPaddingRight()) {
            this.Kc.setPadding(i5, i2, i4, i3);
        }
    }

    /* renamed from: b */
    private void m1524b() {
        Drawable drawable;
        C1104o c1104o;
        byte a;
        byte a2;
        if (!C0808l.m4053k(this.Wc) && C0897o.m6259b(this.Wc, 8).equalsIgnoreCase(Yc[0]) && this.Wc.indexOf(63) < 0) {
            wb c = wb.m7841c(this.Wc);
            if (c != null) {
                byte a3 = C1094e.m7936a(this.Pc, 32);
                int i = 1;
                if (this.Jc != null) {
                    C0691a.m2859a(a3 == this.Jc.length);
                    for (int i2 : this.Jc) {
                        if (i2 > i) {
                            i = i2;
                        }
                    }
                }
                int b = C1503b.m10442b(this.Kc) - (Uc * 2);
                int i22 = C1503b.m10449c(this.Kc) - (Uc * 2);
                RectF b2 = c.m7851b((float) C1511l.m10528c());
                double min = Math.min(((double) b) / ((double) (b2.width() / ((float) a3))), ((double) i22) / ((double) (b2.height() / ((float) i))));
                b = (int) Math.round(((double) b2.width()) * min);
                i22 = (int) Math.round(min * ((double) b2.height()));
                Bitmap b3 = wb.m7839b(c, b, i22);
                int i3 = b / a3;
                int i4 = i22 / i;
                Resources resources = this.Kc.getResources();
                Drawable[] drawableArr = new Drawable[a3];
                byte b4 = (byte) 0;
                while (b4 < a3) {
                    AnimationDrawable animationDrawable;
                    int i5 = this.Jc != null ? this.Jc[b4] : 1;
                    if (i5 > 1) {
                        int i6 = this.Ac[b4] / (i5 - 1);
                        animationDrawable = new AnimationDrawable();
                        for (i22 = 0; i22 < i5; i22++) {
                            animationDrawable.addFrame(new BitmapDrawable(resources, Bitmap.createBitmap(b3, i3 * b4, i22 * i4, i3, i4)), i6);
                        }
                    } else {
                        animationDrawable = a3 > (byte) 1 ? new BitmapDrawable(resources, Bitmap.createBitmap(b3, i3 * b4, 0, i3, i4)) : new BitmapDrawable(resources, b3);
                    }
                    drawableArr[b4] = animationDrawable;
                    b4++;
                }
                if (a3 > (byte) 1) {
                    Drawable stateListDrawable = new StateListDrawable();
                    switch (a3) {
                        case (byte) 2:
                            ((StateListDrawable) stateListDrawable).addState(new int[]{16842919}, drawableArr[1]);
                            ((StateListDrawable) stateListDrawable).addState(new int[0], drawableArr[0]);
                            drawable = stateListDrawable;
                            break;
                        case (byte) 3:
                            ((StateListDrawable) stateListDrawable).addState(new int[]{-16842910}, drawableArr[2]);
                            ((StateListDrawable) stateListDrawable).addState(new int[]{16842919}, drawableArr[1]);
                            ((StateListDrawable) stateListDrawable).addState(new int[0], drawableArr[0]);
                            drawable = stateListDrawable;
                            break;
                        default:
                            ((StateListDrawable) stateListDrawable).addState(new int[]{-16842910}, drawableArr[2]);
                            ((StateListDrawable) stateListDrawable).addState(new int[]{16842919}, drawableArr[1]);
                            ((StateListDrawable) stateListDrawable).addState(new int[]{16842908}, drawableArr[3]);
                            ((StateListDrawable) stateListDrawable).addState(new int[0], drawableArr[0]);
                            drawable = stateListDrawable;
                            break;
                    }
                }
                drawable = drawableArr[0];
                if (drawable == null && !C0808l.m4053k(this.Wc)) {
                    c1104o = new C1104o();
                    a = C1094e.m7936a(this.Pc, 8);
                    a2 = C1094e.m7936a(this.Pc, 0);
                    if (!(a2 == (byte) 1 && a == (byte) 0)) {
                        c1104o.f3341c = a2;
                        c1104o.f3342d = a;
                    }
                    drawable = C1093d.m7925a(this.Wc, c1104o);
                }
                if (drawable != null) {
                    drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                    if ((drawable instanceof BitmapDrawable) && C1094e.m7936a(this.Pc, 32) > (byte) 1) {
                        drawable = new C1133g(this, ((BitmapDrawable) drawable).getBitmap());
                    }
                    if (this.Jc != null) {
                        drawable = m1522a(drawable);
                    }
                    if (drawable.isStateful()) {
                        drawable.setState(this.Kc.getDrawableState());
                    }
                }
                this.Ic = drawable;
                if (isFenetreCree()) {
                    m1523a();
                    this.Kc.invalidate();
                }
            }
        }
        drawable = null;
        c1104o = new C1104o();
        a = C1094e.m7936a(this.Pc, 8);
        a2 = C1094e.m7936a(this.Pc, 0);
        c1104o.f3341c = a2;
        c1104o.f3342d = a;
        drawable = C1093d.m7925a(this.Wc, c1104o);
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            drawable = new C1133g(this, ((BitmapDrawable) drawable).getBitmap());
            if (this.Jc != null) {
                drawable = m1522a(drawable);
            }
            if (drawable.isStateful()) {
                drawable.setState(this.Kc.getDrawableState());
            }
        }
        this.Ic = drawable;
        if (isFenetreCree()) {
            m1523a();
            this.Kc.invalidate();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: c */
    private final void m1525c() {
        /*
        r7 = this;
        r1 = 0;
        r4 = 0;
        r6 = 1;
        r7.Nc = r4;
        r0 = r7.Bc;
        r2 = r7.getFenetreMere();
        r0 = fr.pcsoft.wdjava.ui.p081j.C1437c.m10098a(r0, r2);
        if (r0 == 0) goto L_0x004b;
    L_0x0011:
        r0 = r7.isFenetreCree();
        if (r0 == 0) goto L_0x002f;
    L_0x0017:
        r1 = r7.Kc;
        r0 = r7.l;
        r0 = (fr.pcsoft.wdjava.ui.champs.fenetre.WDFenetre) r0;
        r0 = r0.getActivite();
        r0 = r0.getResources();
        r2 = 17301508; // 0x1080004 float:2.4979266E-38 double:8.5480807E-317;
        r0 = r0.getDrawable(r2);
        r1.setBackgroundDrawable(r0);
    L_0x002f:
        r0 = r7.Kc;
        r0 = r0.getPaddingTop();
        r1 = r7.Kc;
        r1 = r1.getPaddingBottom();
        if (r1 <= r0) goto L_0x0041;
    L_0x003d:
        r0 = r1 - r0;
        r7.Nc = r0;
    L_0x0041:
        r0 = r7.isFenetreCree();
        if (r0 == 0) goto L_0x004a;
    L_0x0047:
        r7.m1523a();
    L_0x004a:
        return;
    L_0x004b:
        r0 = r7.Bc;
        r2 = "";
        r0 = r0.equals(r2);
        if (r0 != 0) goto L_0x00d8;
    L_0x0055:
        r0 = new fr.pcsoft.wdjava.ui.b.o;
        r0.<init>();
        r0.f3344g = r6;
        r2 = r7.Tc;
        r2 = fr.pcsoft.wdjava.ui.p065b.C1094e.m7936a(r2, r4);
        r0.f3341c = r2;
        r2 = r7.Tc;
        r4 = 8;
        r2 = fr.pcsoft.wdjava.ui.p065b.C1094e.m7936a(r2, r4);
        r0.f3342d = r2;
        r2 = r7.Bc;
        r0 = fr.pcsoft.wdjava.ui.p065b.C1093d.m7925a(r2, r0);
    L_0x0074:
        if (r0 == 0) goto L_0x00cf;
    L_0x0076:
        r1 = r0 instanceof android.graphics.drawable.BitmapDrawable;
        if (r1 == 0) goto L_0x00ac;
    L_0x007a:
        r2 = r7.Tc;
        r1 = 32;
        r3 = fr.pcsoft.wdjava.ui.p065b.C1094e.m7936a(r2, r1);
        if (r3 > r6) goto L_0x0088;
    L_0x0084:
        r1 = r7.Dc;
        if (r1 == 0) goto L_0x00c2;
    L_0x0088:
        r1 = r7.Dc;
        switch(r1) {
            case 0: goto L_0x0094;
            case 1: goto L_0x00b2;
            case 2: goto L_0x00b2;
            case 3: goto L_0x00ba;
            default: goto L_0x008d;
        };
    L_0x008d:
        r1 = Yc;
        r1 = r1[r6];
        fr.pcsoft.wdjava.core.debug.C0691a.m2856a(r1);
    L_0x0094:
        r2 = new fr.pcsoft.wdjava.ui.b.b.h;
        r4 = r7.Tc;
        r2.<init>(r4);
    L_0x009b:
        if (r3 <= r6) goto L_0x00d6;
    L_0x009d:
        r1 = new fr.pcsoft.wdjava.ui.b.b.f;
        r1.<init>(r3, r2);
    L_0x00a2:
        r0 = (android.graphics.drawable.BitmapDrawable) r0;
        r0 = r0.getBitmap();
        r0 = r1.mo3344a(r0);
    L_0x00ac:
        r1 = r7.Kc;
        r1.setBackgroundDrawable(r0);
        goto L_0x0041;
    L_0x00b2:
        r2 = new fr.pcsoft.wdjava.ui.b.b.c;
        r1 = r7.Dc;
        r2.<init>(r1);
        goto L_0x009b;
    L_0x00ba:
        r2 = new fr.pcsoft.wdjava.ui.b.b.c;
        r1 = r7.Qc;
        r2.<init>(r1);
        goto L_0x009b;
    L_0x00c2:
        r1 = r0 instanceof fr.pcsoft.wdjava.ui.p065b.p066b.C1089d;
        if (r1 == 0) goto L_0x00ac;
    L_0x00c6:
        r1 = r0;
        r1 = (fr.pcsoft.wdjava.ui.p065b.p066b.C1089d) r1;
        r2 = r7.Tc;
        r1.m7916a(r2);
        goto L_0x00ac;
    L_0x00cf:
        r0 = r7.Kc;
        r0.setBackgroundDrawable(r1);
        goto L_0x0041;
    L_0x00d6:
        r1 = r2;
        goto L_0x00a2;
    L_0x00d8:
        r0 = r1;
        goto L_0x0074;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.ui.champs.bouton.WDBouton.c():void");
    }

    /* renamed from: d */
    private boolean m1526d() {
        return this.kc instanceof C1115e;
    }

    /* renamed from: z */
    private static String m1527z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 69;
                    break;
                case 1:
                    i2 = 106;
                    break;
                case 2:
                    i2 = 39;
                    break;
                case 3:
                    i2 = 90;
                    break;
                default:
                    i2 = 110;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1528z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 110);
        }
        return toCharArray;
    }

    protected void appliquerCouleur(int i) {
        int k = C1031a.m7467k(i);
        C1503b.m10432a(this.Kc, k, k);
    }

    protected void appliquerTransparent() {
        C1503b.m10432a(this.Kc, 0, 0);
    }

    protected int calculerEtatInterne(int i) {
        int calculerEtatInterne = super.calculerEtatInterne(i);
        return (this.Lc && this.Kc.isEnabled() && this.Sc) ? 2 : calculerEtatInterne;
    }

    public View getCompConteneur() {
        return this.Kc;
    }

    public View getCompPrincipal() {
        return this.Kc;
    }

    public WDBooleen getEnfonce() {
        boolean z = this.Lc && this.Sc;
        return new WDBooleen(z);
    }

    public WDBooleen getFocusAuClic() {
        return new WDBooleen(this.Vc);
    }

    public WDChaine getImage() {
        return new WDChaine(C1094e.m7941a(this.Wc));
    }

    public WDEntier4 getImageEtat() {
        return new WDEntier4(C1094e.m7936a(this.Pc, 32));
    }

    public WDChaine getImageFond() {
        return new WDChaine(C1094e.m7941a(this.Bc));
    }

    public WDEntier4 getImageFondEtat() {
        return new WDEntier4(C1094e.m7936a(this.Tc, 32));
    }

    public WDChaine getLibelle() {
        return new WDChaine(this.Xc);
    }

    public String getNomType() {
        return C0745b.m3220a(Yc[2], new String[0]);
    }

    public WDObjet getValeur() {
        return getLibelle();
    }

    public WDObjet getValeurInitiale() {
        return new WDChaine(this.Cc);
    }

    public boolean isBouton() {
        return true;
    }

    public boolean isChampEditableDansZR() {
        return true;
    }

    public boolean isChampFocusable() {
        return true;
    }

    public boolean isOnOff() {
        return this.Lc;
    }

    public void release() {
        super.release();
        this.Kc = null;
        this.Xc = null;
        this.Cc = null;
        this.Wc = null;
        this.Bc = null;
        this.Ic = null;
        this.yc = null;
    }

    protected final void setBoutonOnOff(boolean z) {
        this.Lc = z;
    }

    protected void setCadreEnfonce(C1110m c1110m) {
        this.Mc = c1110m;
        if (this.Mc instanceof C1114d) {
            ((C1114d) this.Mc).m8145a(false);
        }
        if (c1110m.mo3379k() && this.yc == null) {
            this.yc = new Path();
        }
    }

    protected void setCadreExterieur(C1110m c1110m) {
        super.setCadreExterieur(c1110m);
        if (this.kc instanceof C1114d) {
            ((C1114d) this.kc).m8145a(false);
        }
        if (c1110m.mo3379k() && this.yc == null) {
            this.yc = new Path();
        }
    }

    protected void setCadreRepos(C1110m c1110m) {
        setCadreExterieur(c1110m);
    }

    protected void setCadreSurvol(C1110m c1110m) {
    }

    public void setDelai(int i) {
    }

    public void setEnfonce(boolean z) {
        if (this.Lc && this.Sc != z) {
            this.Sc = z;
            this.Kc.setPressed(z);
            this.Kc.refreshDrawableState();
        }
    }

    public void setEtat(int i) {
        super.setEtat(i);
        this.d = i;
        switch (i) {
            case 0:
            case 1:
                C1503b.m10433a(this.Kc, true);
                return;
            case 4:
                C1503b.m10433a(this.Kc, false);
                return;
            default:
                return;
        }
    }

    public void setFocusAuClic(boolean z) {
        this.Vc = z;
    }

    public void setImage(String str) {
        setImage(str, C1094e.m7936a(this.Pc, 8), C1094e.m7936a(this.Pc, 0));
    }

    protected void setImage(String str, int i, int i2) {
        this.Wc = str;
        this.Pc = C1094e.m7940a(this.Pc, 0, (byte) i2);
        this.Pc = C1094e.m7940a(this.Pc, 8, (byte) i);
        m1524b();
    }

    protected void setImage(String str, int i, int i2, int i3, int[] iArr, int[] iArr2, int[] iArr3) {
        this.Pc = C1094e.m7940a(this.Pc, 32, (byte) i3);
        this.Ac = iArr2;
        this.Jc = iArr;
        this.Fc = iArr3;
        setImage(str, i, i2);
    }

    public void setImageEtat(int i) {
        if (this.Ic == null || !(this.Ic instanceof StateListDrawable)) {
            byte a = C1094e.m7936a(this.Pc, 32);
            if (i > 0) {
                this.Pc = C1094e.m7940a(this.Pc, 32, (byte) Math.min(i, 5));
                if (this.Ic != null && a != i) {
                    repeindreChamp();
                }
            }
        }
    }

    public void setImageFond(String str) {
        setImageFond(str, C1094e.m7938a(C1094e.m7936a(this.Tc, 24), C1094e.m7936a(this.Tc, 16)), C1094e.m7936a(this.Tc, 8), C1094e.m7936a(this.Tc, 0), C1094e.m7936a(this.Tc, 40));
    }

    protected void setImageFond(String str, int i, int i2, int i3) {
        setImageFond(str, i, i2, i3, 1);
    }

    protected void setImageFond(String str, int i, int i2, int i3, int i4) {
        this.Bc = str;
        this.Tc = C1094e.m7940a(this.Tc, 0, (byte) i3);
        this.Tc = C1094e.m7940a(this.Tc, 8, (byte) i2);
        this.Tc = C1094e.m7940a(this.Tc, 16, (byte) C1094e.m7942b(i));
        this.Tc = C1094e.m7940a(this.Tc, 24, (byte) C1094e.m7937a(i));
        this.Tc = C1094e.m7940a(this.Tc, 40, (byte) i4);
        m1525c();
    }

    protected void setImageFond9Images() {
        this.Dc = 2;
    }

    protected void setImageFond9Images(boolean z) {
        if (z) {
            setImageFond9Images();
        }
    }

    protected void setImageFond9Images(int[] iArr, int i, int i2, int i3, int i4) {
        this.Dc = 3;
        this.Qc = new Rect(i, i3, i2, i4);
    }

    public void setImageFondEtat(int i) {
        if (C1094e.m7936a(this.Tc, 32) != i) {
            this.Tc = C1094e.m7940a(this.Tc, 32, (byte) Math.min(i, 5));
            if (isFenetreCree() && !C0808l.m4053k(this.Bc)) {
                m1525c();
            }
        }
    }

    protected void setImageFondTroisImage() {
        this.Dc = 1;
    }

    protected void setImageFondTroisImage(boolean z) {
        if (z) {
            setImageFondTroisImage();
        }
    }

    public void setLibelle(String str) {
        this.Xc = str;
        if (this.S) {
            StringBuffer stringBuffer = new StringBuffer();
            C0808l.m4009a(str, stringBuffer);
            str = stringBuffer.toString();
        }
        if (this.S) {
            C1424g.m10031a(this.Kc, str);
        } else {
            C1424g.m10031a(this.Kc, "");
        }
    }

    protected void setLibelleHAlign(int i) {
        switch (i) {
            case 0:
                this.Kc.setGravity((this.Kc.getGravity() & 112) | 3);
                this.Pc = C1094e.m7940a(this.Pc, 16, (byte) 5);
                return;
            case 1:
                this.Kc.setGravity((this.Kc.getGravity() & 112) | 1);
                return;
            case 2:
                this.Kc.setGravity((this.Kc.getGravity() & 112) | 5);
                this.Pc = C1094e.m7940a(this.Pc, 16, (byte) 3);
                return;
            case 4:
                this.Kc.setGravity((this.Kc.getGravity() & 112) | 1);
                this.Pc = C1094e.m7940a(this.Pc, 16, (byte) 3);
                return;
            case 5:
                this.Kc.setGravity((this.Kc.getGravity() & 112) | 1);
                this.Pc = C1094e.m7940a(this.Pc, 16, (byte) 5);
                return;
            case 6:
                this.Kc.setGravity((this.Kc.getGravity() & 112) | 3);
                this.Pc = C1094e.m7940a(this.Pc, 16, (byte) 3);
                return;
            case 7:
                this.Kc.setGravity((this.Kc.getGravity() & 112) | 5);
                this.Pc = C1094e.m7940a(this.Pc, 16, (byte) 5);
                return;
            case 8:
                this.Kc.setGravity((this.Kc.getGravity() & 112) | 1);
                this.Pc = C1094e.m7940a(this.Pc, 16, (byte) 4);
                this.Gc = true;
                return;
            default:
                return;
        }
    }

    protected void setLibelleVAlign(int i) {
        switch (i) {
            case 0:
                this.Kc.setGravity((this.Kc.getGravity() & 7) | 48);
                this.Pc = C1094e.m7940a(this.Pc, 16, (byte) 7);
                return;
            case 1:
                this.Kc.setGravity((this.Kc.getGravity() & 7) | 16);
                return;
            case 2:
                this.Kc.setGravity((this.Kc.getGravity() & 7) | 80);
                this.Pc = C1094e.m7940a(this.Pc, 16, (byte) 1);
                return;
            default:
                return;
        }
    }

    protected void setPresenceLibelle(boolean z) {
        super.setPresenceLibelle(z);
        if (!z) {
            this.Kc.setText("");
        }
    }

    protected void setStyleLibelleEnfonce(int i, C1399b c1399b, int i2, int i3) {
        C1503b.m10432a(this.Kc, C1031a.m7467k(this.cb), C1031a.m7467k(i));
    }

    protected void setStyleLibelleRepos(int i, C1399b c1399b, int i2, int i3) {
        if (isChangementAgencementEnCours()) {
            c1399b.m9954a(this.Kc);
        } else {
            this.cb = i;
            c1399b.m9954a(this.Kc);
        }
        if (i2 != 0) {
            C1503b.m10447b(this.Kc, i2, C1031a.m7467k(i3));
        }
    }

    protected void setStyleLibelleSurvol(int i, C1399b c1399b, int i2, int i3) {
    }

    protected void setTypeActionPredefinie(int i) {
    }

    protected void setTypeBouton(int i) {
        switch (i) {
            case 2:
                this.Kc.setFocusableInTouchMode(false);
                return;
            case 3:
                this.Kc.setFocusableInTouchMode(false);
                ((C0509v) this.l).setBoutonAbandon(this);
                return;
            default:
                return;
        }
    }

    public void setValeur(WDObjet wDObjet) {
        setValeur(wDObjet.getString());
    }

    public void setValeur(String str) {
        setLibelle(str);
    }

    public void setValeurInitiale(WDObjet wDObjet) {
        setValeurInitiale(wDObjet.getString());
    }

    public void setValeurInitiale(String str) {
        this.Cc = str;
        setLibelle(this.Cc);
    }

    @TargetApi(21)
    public void terminerInitialisation() {
        super.terminerInitialisation();
        m1523a();
    }
}
