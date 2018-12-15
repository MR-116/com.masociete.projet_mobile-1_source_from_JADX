package fr.pcsoft.wdjava.ui.champs.groupeoptions;

import android.graphics.Canvas;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v4.view.ViewCompat;
import android.text.method.HideReturnsTransformationMethod;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.CompoundButton;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.p042b.C0657a;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.core.utils.kb;
import fr.pcsoft.wdjava.p032m.C0938m;
import fr.pcsoft.wdjava.ui.C0489p;
import fr.pcsoft.wdjava.ui.p064a.C1031a;
import fr.pcsoft.wdjava.ui.p069g.C1409j;
import fr.pcsoft.wdjava.ui.p079e.C1399b;
import fr.pcsoft.wdjava.ui.p080h.C1424g;
import fr.pcsoft.wdjava.ui.utils.C1503b;
import fr.pcsoft.wdjava.ui.utils.C1511l;
import java.lang.reflect.Field;

/* renamed from: fr.pcsoft.wdjava.ui.champs.groupeoptions.n */
public abstract class C0500n extends C0489p implements AnimationListener {
    /* renamed from: z */
    private static final String[] f899z = new String[]{C0500n.m1333z(C0500n.m1334z("\u0003ky\u001c\\9ok\u001fJjblS]£e|\u0003Æ8c{SC+&\u0012C/s{SK?&d\u0016B(tlSl%ky\u001cZ$bK\u0006[>igPB\bs}\u0007@$B{\u0012X+de\u0016\u000f:g{SF$r{\u001c\\:cj\u0007F%h'")), C0500n.m1333z(C0500n.m1334z("\u0003ky\u001c\\9ok\u001fJjblSB%b`\u0015F/t)\u001f\b#kh\u0014JjblSC+&j\u001cL\"c)\u0017Jjj.\u001c_>of\u001d\u000f:g{SF$r{\u001c\\:cj\u0007F%h'")), C0500n.m1333z(C0500n.m1334z("'D|\u0007[%hM\u0001N=gk\u001fJ")), C0500n.m1333z(C0500n.m1334z("iHF>")), C0500n.m1333z(C0500n.m1334z("iV[<\u0018OL'j\u0015JL0{\u001fTL,|\u000fSE6"))};
    /* renamed from: d */
    private String f900d = "";
    /* renamed from: e */
    private int f901e = -1;
    /* renamed from: f */
    private String f902f = null;
    /* renamed from: g */
    protected Drawable f903g = null;
    /* renamed from: h */
    private int f904h = 0;
    /* renamed from: i */
    protected C1205m f905i = null;
    /* renamed from: j */
    protected CompoundButton f906j = creerOption();
    /* renamed from: k */
    private String f907k = "";
    /* renamed from: l */
    private int f908l = -1;
    /* renamed from: m */
    protected C0501o f909m;
    /* renamed from: n */
    protected boolean f910n = false;

    public C0500n() {
        this.f906j.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
    }

    /* renamed from: a */
    private final boolean m1332a(boolean z) {
        try {
            if (this.f905i != null) {
                this.f905i.m8537a();
            }
            C1409j b = z ? this.f909m.m1350b() : this.f909m.m1351c();
            if (b != null) {
                try {
                    if (b.mo3772c() != 0) {
                        if (b.mo3770a() > 0) {
                            this.f905i = new C1205m(this, this.f906j.getContext());
                            this.f905i.m8539b().m8528a(b.mo3770a());
                            return true;
                        }
                    }
                } catch (SecurityException e) {
                    throw e;
                } catch (SecurityException e2) {
                    throw e2;
                }
            }
            return false;
        } catch (SecurityException e22) {
            throw e22;
        }
    }

    /* renamed from: z */
    private static String m1333z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 74;
                    break;
                case 1:
                    i2 = 6;
                    break;
                case 2:
                    i2 = 9;
                    break;
                case 3:
                    i2 = 115;
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
    private static char[] m1334z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 47);
        }
        return toCharArray;
    }

    public String _getValeurRenvoyee() {
        try {
            return this.f902f == null ? "" : this.f902f;
        } catch (SecurityException e) {
            throw e;
        }
    }

    /* renamed from: a */
    void m1335a(Drawable drawable) {
        if (drawable == null) {
            try {
                drawable = (Drawable) getButtonDrawableField().get(this.f906j);
            } catch (Exception e) {
                C0691a.m2857a(f899z[0], e);
            }
        }
        if (drawable != null) {
            try {
                if (this.f909m.isCocheADroite()) {
                    this.f906j.setButtonDrawable(new StateListDrawable());
                    this.f906j.setCompoundDrawablesWithIntrinsicBounds(null, null, drawable, null);
                    this.f906j.setPadding(C1511l.f4641o, 0, 0, 0);
                } else {
                    try {
                        if (this.f909m.isUseCustomImageForOptions()) {
                            this.f906j.setButtonDrawable(drawable);
                        }
                    } catch (Exception e2) {
                        throw e2;
                    }
                }
            } catch (Exception e22) {
                throw e22;
            }
        }
        this.f903g = drawable;
    }

    /* renamed from: a */
    final void m1336a(C0501o c0501o) {
        try {
            this.f909m = c0501o;
            if (!this.f909m.isLibelleMultiligne()) {
                this.f906j.setHorizontallyScrolling(true);
                this.f906j.setMaxLines(1);
            }
        } catch (SecurityException e) {
            throw e;
        }
    }

    protected abstract CompoundButton creerOption();

    public void degriserOption() {
        try {
            if (!this.f906j.isEnabled()) {
                C1503b.m10433a(this.f906j, true);
            }
        } catch (SecurityException e) {
            throw e;
        }
    }

    public final boolean dispatchKeyEventEx(CompoundButton compoundButton, KeyEvent keyEvent) {
        try {
            if (this.f909m != null) {
                if (this.f909m._getEtat() == 1) {
                    return false;
                }
            }
            return ((C1198q) compoundButton).mo3465a(keyEvent);
        } catch (SecurityException e) {
            throw e;
        } catch (SecurityException e2) {
            throw e2;
        }
    }

    public final boolean dispatchTouchEventEx(CompoundButton compoundButton, MotionEvent motionEvent) {
        try {
            if (this.f909m != null) {
                if (this.f909m._getEtat() == 1) {
                    return false;
                }
            }
            return ((C1198q) compoundButton).mo3466a(motionEvent);
        } catch (SecurityException e) {
            throw e;
        } catch (SecurityException e2) {
            throw e2;
        }
    }

    protected final Field getButtonDrawableField() throws SecurityException, NoSuchFieldException {
        Field declaredField = CompoundButton.class.getDeclaredField(f899z[2]);
        declaredField.setAccessible(true);
        return declaredField;
    }

    public CompoundButton getComposant() {
        return this.f906j;
    }

    public WDEntier4 getCouleur() {
        return new WDEntier4(C1031a.m7461e(this.f906j.getTextColors().getDefaultColor()));
    }

    public WDEntier4 getCouleurFond() {
        return new WDEntier4(this.f901e);
    }

    public WDEntier4 getEtat() {
        return new WDEntier4(this.f904h);
    }

    public final int getHauteurOption() {
        return this.f908l;
    }

    public WDChaine getLibelle() {
        return new WDChaine(this.f907k);
    }

    public String getName() {
        return this.f900d;
    }

    public String getNomType() {
        return "";
    }

    public WDObjet getValeur() {
        return new WDBooleen(this.f906j.isChecked());
    }

    public WDObjet getValeurRenvoyee() {
        return new WDChaine(_getValeurRenvoyee());
    }

    public WDBooleen getVisible() {
        return new WDBooleen(this.f906j.isShown());
    }

    public void griserOption() {
        try {
            if (this.f906j.isEnabled()) {
                C1503b.m10433a(this.f906j, false);
            }
        } catch (SecurityException e) {
            throw e;
        }
    }

    public void initialiserObjet() {
        super.initialiserObjet();
        this.f906j.setOnFocusChangeListener(this.f909m.getEcouteurFocusOption());
    }

    public boolean isSelectionnee() {
        return this.f906j.isChecked();
    }

    public void onAnimationEnd(Animation animation) {
        if (this.f905i != null) {
            C1205m c1205m = this.f905i;
            this.f905i = null;
            C0938m.m6816c().post(new C1200i(this, c1205m));
        }
        this.f910n = false;
        this.f906j.invalidate();
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
        this.f910n = true;
        this.f906j.invalidate();
    }

    public final void onDrawEx(CompoundButton compoundButton, Canvas canvas) {
        try {
            if (this.f905i != null) {
                if (this.f905i.isShowing()) {
                    Drawable c1206p;
                    if (this.f910n) {
                        c1206p = new C1206p(this, 0);
                        c1206p.setBounds(this.f905i.m8541e().getBounds());
                    } else {
                        c1206p = this.f905i.m8541e();
                    }
                    try {
                        if (this.f909m.isCocheADroite()) {
                            Drawable drawable = compoundButton.getCompoundDrawables()[2];
                            compoundButton.setCompoundDrawablesWithIntrinsicBounds(null, null, c1206p, null);
                            ((C1198q) compoundButton).mo3463a(canvas);
                            compoundButton.setCompoundDrawablesWithIntrinsicBounds(null, null, drawable, null);
                            return;
                        }
                        Field buttonDrawableField = getButtonDrawableField();
                        Object obj = buttonDrawableField.get(this.f906j);
                        buttonDrawableField.set(this.f906j, c1206p);
                        ((C1198q) compoundButton).mo3463a(canvas);
                        buttonDrawableField.set(this.f906j, obj);
                        return;
                    } catch (Exception e) {
                        C0691a.m2857a(f899z[1], e);
                        ((C1198q) compoundButton).mo3463a(canvas);
                        return;
                    }
                }
            }
            ((C1198q) compoundButton).mo3463a(canvas);
        } catch (Exception e2) {
            throw e2;
        } catch (Exception e22) {
            throw e22;
        }
    }

    public void release() {
        try {
            super.release();
            this.f900d = null;
            this.f906j = null;
            this.f907k = null;
            this.f909m = null;
            this.f902f = null;
            if (this.f905i != null) {
                this.f905i.m8537a();
                this.f905i = null;
            }
        } catch (SecurityException e) {
            throw e;
        }
    }

    public final void setCheckedEx(CompoundButton compoundButton, boolean z) {
        try {
            if (this.f909m != null) {
                if (this.f909m.m1352d()) {
                    try {
                        if (compoundButton.isChecked() != z) {
                            try {
                                if (compoundButton.isPressed()) {
                                    try {
                                        if (this.f903g != null) {
                                            try {
                                                if (this.f903g instanceof StateListDrawable) {
                                                    try {
                                                        if (!this.f909m.Cc) {
                                                            try {
                                                                if (!(kb.m3965a(C0657a.LOLLIPOP) && (this.f903g instanceof AnimatedStateListDrawable))) {
                                                                    compoundButton.setPressed(false);
                                                                    Drawable current = this.f903g.getCurrent();
                                                                    try {
                                                                        ((C1198q) compoundButton).mo3464a(z);
                                                                        if (!ViewCompat.isAttachedToWindow(this.f906j)) {
                                                                            return;
                                                                        }
                                                                        if (m1332a(z)) {
                                                                            this.f905i.m8538a(current, this.f903g.getCurrent(), z);
                                                                            return;
                                                                        }
                                                                        return;
                                                                    } catch (SecurityException e) {
                                                                        throw e;
                                                                    } catch (SecurityException e2) {
                                                                        throw e2;
                                                                    }
                                                                }
                                                            } catch (SecurityException e22) {
                                                                throw e22;
                                                            }
                                                        }
                                                    } catch (SecurityException e222) {
                                                        throw e222;
                                                    }
                                                }
                                            } catch (SecurityException e2222) {
                                                throw e2222;
                                            }
                                        }
                                    } catch (SecurityException e22222) {
                                        throw e22222;
                                    }
                                }
                            } catch (SecurityException e222222) {
                                throw e222222;
                            }
                        }
                    } catch (SecurityException e2222222) {
                        throw e2222222;
                    }
                }
            }
            ((C1198q) compoundButton).mo3464a(z);
        } catch (SecurityException e22222222) {
            throw e22222222;
        } catch (SecurityException e222222222) {
            throw e222222222;
        }
    }

    public void setCouleur(int i) {
        if (i != -1) {
            int k = C1031a.m7467k(i);
            C1503b.m10432a(this.f906j, k, k);
            return;
        }
        C1503b.m10432a(this.f906j, 0, 0);
    }

    public void setCouleurFond(int i) {
        if (i == -1 || i == -16777216) {
            this.f906j.setBackgroundColor(0);
            this.f901e = -1;
            return;
        }
        try {
            this.f906j.setBackgroundColor(C1031a.m7467k(i));
            this.f901e = i;
        } catch (SecurityException e) {
            throw e;
        }
    }

    public void setEtat(int i) {
        if (i == 2) {
            try {
                this.f904h = i;
                this.f906j.setVisibility(4);
                return;
            } catch (SecurityException e) {
                throw e;
            }
        }
        switch (i) {
            case 0:
            case 1:
                try {
                    degriserOption();
                    break;
                } catch (SecurityException e2) {
                    throw e2;
                }
            case 4:
                griserOption();
                break;
            default:
                return;
        }
        this.f904h = i;
        this.f906j.setVisibility(0);
    }

    protected void setHauteurOption(int i) {
        this.f908l = C1511l.m10532d((float) i, 2);
    }

    public void setLibelle(String str) {
        this.f907k = str;
        StringBuffer stringBuffer = new StringBuffer();
        try {
            C0808l.m4009a(str, stringBuffer);
            C1424g.m10031a(this.f906j, stringBuffer.toString());
            if (isFenetreCree()) {
                this.f909m.positionnerOptions(null);
            }
        } catch (SecurityException e) {
            throw e;
        }
    }

    public void setNom(String str) {
        try {
            if (isFenetreCree()) {
                WDErreurManager.m2883a(C0745b.m3222b(f899z[4], C0745b.m3219a(f899z[3])));
                return;
            }
            this.f900d = str;
        } catch (SecurityException e) {
            throw e;
        }
    }

    protected void setStyleLibelleOption(int i, C1399b c1399b) {
        c1399b.m9954a(this.f906j);
        this.f906j.setTextColor(C1031a.m7467k(i));
    }

    public void setValeur(WDObjet wDObjet) {
        setValeur(wDObjet.getBoolean());
    }

    public void setValeur(boolean z) {
        boolean z2 = this.f909m.Cc;
        this.f909m.Cc = true;
        try {
            this.f906j.setChecked(z);
        } finally {
            this.f909m.Cc = z2;
        }
    }

    public void setValeurRenvoyee(WDObjet wDObjet) {
        this.f902f = wDObjet.getString();
    }

    public void setVisible(boolean z) {
        try {
            this.f906j.setVisibility(z ? 0 : 4);
        } catch (SecurityException e) {
            throw e;
        }
    }
}
