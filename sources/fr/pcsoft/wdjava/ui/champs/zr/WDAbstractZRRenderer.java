package fr.pcsoft.wdjava.ui.champs.zr;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.p032m.C0938m;
import fr.pcsoft.wdjava.ui.cadre.C1110m;
import fr.pcsoft.wdjava.ui.champs.gc;
import fr.pcsoft.wdjava.ui.champs.kb;
import fr.pcsoft.wdjava.ui.gesture.C1290a;
import fr.pcsoft.wdjava.ui.p064a.C1032b;
import fr.pcsoft.wdjava.ui.p064a.C1034d;
import java.util.Arrays;

public abstract class WDAbstractZRRenderer {
    /* renamed from: d */
    private static final String f3782d = m8960z(m8961z("I+p\u0018AN2Z\u0018Q"));
    /* renamed from: e */
    private static final int[] f3783e = new int[]{16842920};
    /* renamed from: a */
    public sb f3784a = null;
    /* renamed from: b */
    protected WDZoneRepetee f3785b = null;
    /* renamed from: c */
    protected Drawable f3786c = null;

    public abstract class AbstractRepetitionView extends RelativeLayout {
        /* renamed from: a */
        protected int f3781a = -1;

        public AbstractRepetitionView(Context context) {
            super(context);
            setBackgroundDrawable(null);
            mo3536a(context);
        }

        /* renamed from: a */
        protected abstract ViewGroup mo3533a(Context context, WDRuptureZR wDRuptureZR);

        /* renamed from: a */
        public abstract gc mo3534a(int i, int i2);

        /* renamed from: a */
        protected abstract void mo3535a();

        /* renamed from: a */
        public void mo3561a(int i) {
            hb hbVar = (hb) getChildAt((WDAbstractZRRenderer.this.f3785b.getNbLiaisonsRupture() * 2) - i);
            if (hbVar != null) {
                hbVar.m9151a(true);
            }
        }

        /* renamed from: a */
        public void mo3562a(int i, boolean z) {
            boolean z2 = true;
            hb hbVar = (hb) getChildAt(i);
            if (hbVar != null) {
                hbVar.m9151a(true);
                if (WDAbstractZRRenderer.this.f3785b.isAvecBtnEnrouleDeroule()) {
                    if (z) {
                        z2 = false;
                    }
                    hbVar.m9152b(z2);
                }
            }
        }

        /* renamed from: a */
        protected void mo3536a(Context context) {
            int i = 0;
            View b = mo3539b(context);
            if (WDAbstractZRRenderer.this.f3785b.isAvecRupture()) {
                int i2;
                int nbLiaisonsRupture = WDAbstractZRRenderer.this.f3785b.getNbLiaisonsRupture();
                LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams.addRule(3, nbLiaisonsRupture);
                b.setLayoutParams(layoutParams);
                b.setId(nbLiaisonsRupture + 1);
                addView(b);
                int i3 = 0;
                for (i2 = 0; i2 < nbLiaisonsRupture; i2++) {
                    WDRuptureZR c = WDAbstractZRRenderer.this.f3785b.getLiaisonRuptureAt(i2).m9182c();
                    View a = mo3533a(context, c);
                    a.setMinimumHeight(c.getHauteurRupture());
                    a.setVisibility(8);
                    LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                    if (i3 == 0) {
                        layoutParams2.addRule(10);
                    } else {
                        layoutParams2.addRule(3, i3);
                    }
                    a.setLayoutParams(layoutParams2);
                    a.setId(i3 + 1);
                    addView(a, i3);
                    i3++;
                }
                for (i2 = nbLiaisonsRupture - 1; i2 >= 0; i2--) {
                    WDRuptureZR b2 = WDAbstractZRRenderer.this.f3785b.getLiaisonRuptureAt(i2).m9180b();
                    View a2 = mo3533a(context, b2);
                    a2.setMinimumHeight(b2.getHauteurRupture());
                    a2.setVisibility(8);
                    layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                    int i4 = (nbLiaisonsRupture + i) + 1;
                    layoutParams.addRule(3, i4);
                    a2.setLayoutParams(layoutParams);
                    a2.setId(i4 + 1);
                    addView(a2);
                    i++;
                }
                return;
            }
            LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams3.addRule(12);
            b.setLayoutParams(layoutParams3);
            addView(b);
        }

        /* renamed from: a */
        public abstract void mo3537a(ec ecVar);

        /* renamed from: a */
        public boolean mo3538a(boolean z) {
            View c = mo3541c();
            int i = z ? 0 : 8;
            if (c.getVisibility() == i) {
                return false;
            }
            c.setVisibility(i);
            return true;
        }

        /* renamed from: b */
        protected final int m8950b(ec ecVar) {
            C1034d c1034d = (C1034d) ecVar.m9123k(3);
            return c1034d == null ? this.f3781a % 2 == 0 ? WDAbstractZRRenderer.this.f3785b.getEvenCellBackgroundColor() : WDAbstractZRRenderer.this.f3785b.getOddCellBackgroundColor() : c1034d.mo3315b();
        }

        /* renamed from: b */
        protected abstract ViewGroup mo3539b(Context context);

        /* renamed from: b */
        public abstract void mo3540b(int i);

        /* renamed from: b */
        protected final boolean m8953b() {
            kb selectionModel = WDAbstractZRRenderer.this.f3785b.getSelectionModel();
            switch (selectionModel.mo3496h()) {
                case 3:
                case 4:
                    return selectionModel.mo3485a(WDAbstractZRRenderer.this.f3785b.convertirIndiceModeleVersVue(this.f3781a));
                case 99:
                    return isPressed() || isSelected();
                default:
                    return false;
            }
        }

        /* renamed from: c */
        public ViewGroup mo3541c() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof C1301k) {
                    return (ViewGroup) childAt;
                }
            }
            return null;
        }

        /* renamed from: c */
        public void m8955c(int i) {
            hb hbVar = (hb) getChildAt((WDAbstractZRRenderer.this.f3785b.getNbLiaisonsRupture() * 2) - i);
            if (hbVar != null) {
                hbVar.m9151a(false);
            }
        }

        /* renamed from: d */
        public final int m8956d() {
            return this.f3781a;
        }

        /* renamed from: d */
        public void m8957d(int i) {
            hb hbVar = (hb) getChildAt(i);
            if (hbVar != null) {
                hbVar.m9151a(false);
            }
        }

        /* renamed from: e */
        protected final ec m8958e() {
            return this.f3781a >= 0 ? (ec) WDAbstractZRRenderer.this.f3785b.getDataModel().mo3593b(this.f3781a) : null;
        }

        /* renamed from: e */
        public void mo3542e(int i) {
            this.f3781a = i;
        }

        public boolean hasExplicitFocusable() {
            return false;
        }

        public boolean hasFocusable() {
            return false;
        }

        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int cellWidth = WDAbstractZRRenderer.this.f3785b.getCellWidth();
            if (cellWidth == -1) {
                cellWidth = getMeasuredWidth();
            }
            setMeasuredDimension(cellWidth, getMeasuredHeight());
        }
    }

    public WDAbstractZRRenderer(WDZoneRepetee wDZoneRepetee) {
        this.f3785b = wDZoneRepetee;
    }

    /* renamed from: z */
    private static String m8960z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 62;
                    break;
                case 1:
                    i2 = 70;
                    break;
                case 2:
                    i2 = 47;
                    break;
                case 3:
                    i2 = 106;
                    break;
                default:
                    i2 = 52;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m8961z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 52);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public abstract AbstractRepetitionView mo3543a(int i, View view);

    /* renamed from: a */
    protected abstract sb mo3544a(Context context, int[] iArr);

    /* renamed from: a */
    public void mo3545a() {
    }

    /* renamed from: a */
    public void mo3546a(int i) {
        if (this.f3784a != null) {
            this.f3784a.m9208a(false);
        }
    }

    /* renamed from: a */
    public void mo3547a(int i, int i2) {
        m8973b();
    }

    /* renamed from: a */
    public void mo3548a(int i, int i2, boolean z) {
    }

    /* renamed from: a */
    public final void m8968a(Canvas canvas, int i, int i2) {
        Paint paintHorizontalSeparator = this.f3785b.getPaintHorizontalSeparator();
        if (paintHorizontalSeparator != null) {
            int max = (int) Math.max(1.0f, paintHorizontalSeparator.getStrokeWidth() / 2.0f);
            float f = (float) (i2 - max);
            canvas.drawLine(0.0f, (float) (i2 - max), (float) i, f, paintHorizontalSeparator);
        }
    }

    /* renamed from: a */
    protected void m8969a(Canvas canvas, int i, int i2, boolean z, int i3, int i4) {
        int i5 = 0;
        C1290a gestureControler = this.f3785b.getGestureControler();
        int i6 = (gestureControler == null || !gestureControler.m9015a(i)) ? 0 : 1;
        if (i6 != 0) {
            z = false;
        }
        if (!z) {
            int i7;
            if (i2 == C1032b.f2968a || i2 == 0) {
                i7 = 1;
            } else {
                canvas.drawColor(i2);
                i7 = 0;
            }
            C1110m cellBackgroundBorder = this.f3785b.getCellBackgroundBorder();
            if (cellBackgroundBorder != null) {
                cellBackgroundBorder.mo3366a(canvas, 0, 0, i3, i4, null);
            } else {
                i5 = i7;
            }
            if (!(i5 == 0 || i6 == 0)) {
                int backgroundColor = this.f3785b.getBackgroundColor();
                if (backgroundColor != 0) {
                    canvas.drawColor(backgroundColor);
                }
            }
        } else if (z && this.f3786c != null) {
            if (this.f3785b.isEditingCell(i) && this.f3785b.getEditor().mo3605h() == 2) {
                canvas.drawColor(i2);
                Rect rect = new Rect();
                this.f3785b.getEditor().mo3601a(rect);
                this.f3786c.setBounds(rect);
            } else {
                this.f3786c.setBounds(0, 0, i3, i4);
            }
            this.f3786c.draw(canvas);
        }
        if (gestureControler != null && gestureControler.m9025h() == this.f3785b) {
            gestureControler.m9014a(canvas, i3, i4);
        }
    }

    /* renamed from: a */
    public final void m8970a(Drawable drawable) {
        this.f3786c = drawable;
    }

    /* renamed from: a */
    public void mo3549a(gc gcVar, EWDPropriete eWDPropriete, WDObjet wDObjet) {
    }

    /* renamed from: a */
    public void mo3550a(boolean z) {
    }

    /* renamed from: b */
    public final void m8973b() {
        if (this.f3784a != null) {
            C0938m.m6816c().post(new bc(this));
        }
    }

    /* renamed from: b */
    public void m8974b(int i) {
        if (this.f3784a != null) {
            this.f3784a.m9208a(false);
        }
    }

    /* renamed from: b */
    public void mo3551b(int i, int i2) {
        if (this.f3784a != null) {
            this.f3784a.m9208a(false);
        }
    }

    /* renamed from: b */
    protected void m8976b(Canvas canvas, int i, int i2) {
        Paint paintVerticalSeparator = this.f3785b.getPaintVerticalSeparator();
        if (this.f3785b.getNbColonneZR() > 1 && paintVerticalSeparator != null) {
            int max = (int) Math.max(1.0f, paintVerticalSeparator.getStrokeWidth() / 2.0f);
            canvas.drawLine((float) (i - max), 0.0f, (float) (i - max), (float) i2, paintVerticalSeparator);
        }
    }

    /* renamed from: c */
    public void mo3552c() {
    }

    /* renamed from: c */
    public void mo3553c(int i) {
        if (this.f3784a != null) {
            this.f3784a.m9208a(false);
        }
    }

    /* renamed from: c */
    protected void m8979c(Canvas canvas, int i, int i2) {
    }

    /* renamed from: d */
    public void mo3554d() {
        if (this.f3784a != null) {
            this.f3784a.m9208a(false);
        }
    }

    /* renamed from: d */
    public void mo3555d(int i) {
        if (this.f3784a != null) {
            this.f3784a.m9208a(false);
        }
    }

    /* renamed from: e */
    public void mo3556e(int i) {
        hb a = this.f3784a != null ? this.f3784a.m9204a(i, 1) : null;
        int i2 = 1;
        while (a != null) {
            hb a2;
            this.f3785b.getPosition(C0725i.m3069e(i));
            ec a3 = this.f3785b.getAdapter().m9133a(i);
            if (a3 != null) {
                a.m9152b(!a3.m9121i(this.f3784a.m9203a(a)));
            }
            if (this.f3784a != null) {
                i2++;
                a2 = this.f3784a.m9204a(i, i2);
            } else {
                a2 = null;
            }
            a = a2;
        }
    }

    /* renamed from: e */
    public final boolean m8983e() {
        return this.f3784a != null;
    }

    /* renamed from: f */
    public void mo3557f() {
        if (this.f3784a != null) {
            this.f3784a.m9208a(false);
        }
    }

    /* renamed from: g */
    public void mo3558g() {
        if (this.f3785b.isAvecRupture()) {
            int nbLiaisonsRupture = this.f3785b.getNbLiaisonsRupture();
            int[] iArr = new int[nbLiaisonsRupture];
            int i = 0;
            int i2 = 0;
            while (i < nbLiaisonsRupture) {
                int i3;
                WDRuptureZR c = this.f3785b.getLiaisonRuptureAt(i).m9182c();
                if (c == null || !c.isAlwayVisible()) {
                    i3 = i2;
                } else {
                    i3 = i2 + 1;
                    iArr[i2] = i;
                }
                i++;
                i2 = i3;
            }
            if (i2 > 0) {
                int[] copyOfRange = iArr.length != i2 ? Arrays.copyOfRange(iArr, 0, i2) : iArr;
                View compConteneur = this.f3785b.getCompConteneur();
                this.f3784a = mo3544a(compConteneur.getContext(), copyOfRange);
                ((ViewGroup) compConteneur).addView(this.f3784a);
                this.f3784a.mo3584a(this.f3784a.getContext());
            }
        }
    }

    /* renamed from: h */
    public void mo3559h() {
    }

    /* renamed from: i */
    public void mo3560i() {
        this.f3785b = null;
        this.f3786c = null;
        if (this.f3784a != null) {
            this.f3784a.m9205a();
            this.f3784a = null;
        }
    }
}
