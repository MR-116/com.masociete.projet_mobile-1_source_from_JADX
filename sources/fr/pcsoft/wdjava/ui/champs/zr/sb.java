package fr.pcsoft.wdjava.ui.champs.zr;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import fr.pcsoft.wdjava.p032m.C0938m;
import java.util.Arrays;

public abstract class sb extends LinearLayout {
    /* renamed from: c */
    private static final int f3912c = 2;
    /* renamed from: d */
    private static final int f3913d = 1;
    /* renamed from: g */
    private static final int f3914g = 0;
    /* renamed from: a */
    private Runnable f3915a = null;
    /* renamed from: b */
    protected int[] f3916b = new int[2];
    /* renamed from: e */
    protected int[] f3917e = null;
    /* renamed from: f */
    private int f3918f = 0;
    final WDAbstractZRRenderer this$0;

    public sb(WDAbstractZRRenderer wDAbstractZRRenderer, Context context, int[] iArr) {
        this.this$0 = wDAbstractZRRenderer;
        super(context);
        setOrientation(1);
        this.f3916b = iArr;
        setChildrenDrawingOrderEnabled(true);
    }

    static int access$200(sb sbVar) {
        return sbVar.f3918f;
    }

    static int access$202(sb sbVar, int i) {
        sbVar.f3918f = i;
        return i;
    }

    /* renamed from: a */
    public int m9203a(hb hbVar) {
        return this.f3916b[indexOfChild(hbVar)];
    }

    /* renamed from: a */
    public hb m9204a(int i, int i2) {
        int childCount = getChildCount();
        if (i2 > childCount) {
            return null;
        }
        int i3 = 0;
        int i4 = i2;
        while (i3 < childCount) {
            int i5;
            View childAt = getChildAt(i3);
            if (!(childAt instanceof hb) || ((hb) childAt).mo3564a() != i) {
                i5 = i4;
            } else if (i4 <= 1) {
                return (hb) childAt;
            } else {
                i5 = i4 - 1;
            }
            i3++;
            i4 = i5;
        }
        return null;
    }

    /* renamed from: a */
    public void m9205a() {
        this.f3916b = null;
        this.f3917e = null;
        if (this.f3915a != null) {
            C0938m.m6816c().removeCallbacks(this.f3915a);
            this.f3915a = null;
        }
    }

    /* renamed from: a */
    public abstract void mo3584a(Context context);

    /* renamed from: a */
    protected abstract void mo3585a(ec ecVar, hb hbVar, int i);

    /* renamed from: a */
    public final void m9208a(boolean z) {
        int i = 2;
        if (this.f3915a == null) {
            this.f3915a = new vb(this);
        }
        Handler c = C0938m.m6816c();
        if (this.f3918f != 0) {
            c.removeCallbacks(this.f3915a);
            if (this.f3918f == 2) {
                z = true;
            }
        }
        if (!z) {
            i = 1;
        }
        this.f3918f = i;
        c.post(this.f3915a);
    }

    /* renamed from: b */
    public final void m9209b(boolean z) {
        AbsListView listView = this.this$0.f3785b.getListView();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        ec a = firstVisiblePosition >= 0 ? this.this$0.f3785b.getAdapter().m9133a(firstVisiblePosition) : null;
        if (a != null) {
            Object obj = null;
            int length = this.f3916b.length;
            int i = 0;
            while (i < length) {
                int i2 = this.f3916b[i];
                pb liaisonRuptureAt = this.this$0.f3785b.getLiaisonRuptureAt(i2);
                if (liaisonRuptureAt.m9182c() != null) {
                    if (this.f3917e == null) {
                        this.f3917e = new int[this.f3916b.length];
                        Arrays.fill(this.f3917e, -1);
                    }
                    hb hbVar = (hb) getChildAt(i);
                    if (obj != null) {
                        hbVar.setVisibility(4);
                    } else {
                        ec a2;
                        int i3;
                        if (hbVar.getVisibility() != 0) {
                            hbVar.setVisibility(0);
                        }
                        int j = a.m9122j(i2);
                        if (j < 0) {
                            j = this.this$0.f3785b.getIndiceHautRupture(liaisonRuptureAt, firstVisiblePosition);
                        }
                        ec ecVar = null;
                        int i4 = 1;
                        View childAt = listView.getChildAt(1);
                        while (childAt != null && childAt.getHeight() <= 0) {
                            int i5 = i4 + 1;
                            i4 = i5;
                            childAt = listView.getChildAt(i5);
                        }
                        if (childAt != null) {
                            int positionForView = this.this$0.f3785b.getListView().getPositionForView(childAt);
                            a2 = this.this$0.f3785b.getAdapter().m9133a(positionForView);
                            if (a2 != null && a2.m9122j(i2) == positionForView) {
                                ec ecVar2;
                                if (childAt == null || childAt.getTop() <= hbVar.getTop() || childAt.getTop() >= hbVar.getBottom()) {
                                    if (childAt.getTop() <= hbVar.getTop()) {
                                        ecVar = a2;
                                    } else if (childAt.getTop() >= hbVar.getBottom()) {
                                        ecVar = a;
                                    }
                                    ecVar2 = ecVar;
                                    i3 = 0;
                                    a2 = ecVar2;
                                    if (j >= 0 && (z || j != this.f3917e[i])) {
                                        if (a2 == null) {
                                            a2 = a;
                                        }
                                        this.f3917e[i] = j;
                                    }
                                    if (a2 != null) {
                                        mo3585a(a2, hbVar, i2);
                                    }
                                    obj = (i3 == 0 || !hbVar.m9153b()) ? 1 : null;
                                    hbVar.setTranslationY((float) i3);
                                } else {
                                    i4 = childAt.getTop() - hbVar.getBottom();
                                    if (Math.abs(i4) > hbVar.getHeight()) {
                                        i4 = hbVar.getHeight() * -1;
                                    }
                                    if (i4 > 0) {
                                        i4 = 0;
                                    }
                                    if (hbVar.getTranslationY() == 0.0f) {
                                        ecVar = a;
                                    }
                                    ecVar2 = ecVar;
                                    i3 = i4;
                                    a2 = ecVar2;
                                    if (a2 == null) {
                                        a2 = a;
                                    }
                                    this.f3917e[i] = j;
                                    if (a2 != null) {
                                        mo3585a(a2, hbVar, i2);
                                    }
                                    if (i3 == 0) {
                                    }
                                    hbVar.setTranslationY((float) i3);
                                }
                            }
                        }
                        a2 = null;
                        i3 = 0;
                        if (a2 == null) {
                            a2 = a;
                        }
                        this.f3917e[i] = j;
                        if (a2 != null) {
                            mo3585a(a2, hbVar, i2);
                        }
                        if (i3 == 0) {
                        }
                        hbVar.setTranslationY((float) i3);
                    }
                }
                i++;
            }
        }
    }

    protected int getChildDrawingOrder(int i, int i2) {
        return (i - i2) - 1;
    }
}
