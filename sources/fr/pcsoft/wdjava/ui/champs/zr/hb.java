package fr.pcsoft.wdjava.ui.champs.zr;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView.ScaleType;
import android.widget.RelativeLayout;
import fr.pcsoft.wdjava.core.ressources.C0743a;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.ui.p065b.C1093d;
import fr.pcsoft.wdjava.ui.utils.C1511l;

public abstract class hb extends RelativeLayout implements OnClickListener {
    /* renamed from: z */
    private static final String f3892z = m9147z(m9148z("Dkn[KCrD[["));
    /* renamed from: a */
    private ImageButton f3893a = null;
    /* renamed from: b */
    protected WDRuptureZR f3894b = null;
    /* renamed from: c */
    private boolean f3895c = false;
    final WDAbstractZRRenderer this$0;

    public hb(WDAbstractZRRenderer wDAbstractZRRenderer, Context context, WDRuptureZR wDRuptureZR) {
        this.this$0 = wDAbstractZRRenderer;
        super(context);
        this.f3894b = wDRuptureZR;
        mo3566a(context);
    }

    static boolean access$000(hb hbVar) {
        return hbVar.f3895c;
    }

    /* renamed from: z */
    private static String m9147z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 51;
                    break;
                case 1:
                    i2 = 6;
                    break;
                case 2:
                    i2 = 49;
                    break;
                case 3:
                    i2 = 41;
                    break;
                default:
                    i2 = 62;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m9148z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 62);
        }
        return toCharArray;
    }

    /* renamed from: a */
    protected abstract int mo3564a();

    /* renamed from: a */
    protected void mo3566a(Context context) {
        if (this.this$0.f3785b.getLiaisonRupture(this.f3894b).m9182c() == this.f3894b && this.this$0.f3785b.isAvecBtnEnrouleDeroule()) {
            this.f3893a = new xb(this, context);
            this.f3893a.setOnClickListener(this);
            setOnClickListener(this);
            this.f3893a.setBackgroundDrawable(null);
            this.f3893a.setPadding(C1511l.f4645s, 0, 0, 0);
            this.f3893a.setScaleType(ScaleType.CENTER_INSIDE);
            String f = this.this$0.f3785b.m1513f();
            Drawable a = !C0808l.m4053k(f) ? C1093d.m7924a(f) : null;
            if (a == null) {
                a = C0743a.m3210f(f3892z);
            }
            this.f3893a.setImageDrawable(a != null ? a.mutate() : null);
            LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -1);
            layoutParams.addRule(9);
            layoutParams.addRule(10);
            layoutParams.addRule(15);
            addView(this.f3893a, layoutParams);
        }
    }

    /* renamed from: a */
    void m9151a(boolean z) {
        int i = 0;
        if (!this.f3894b.isRuptureVisible()) {
            z = false;
        }
        if (!z) {
            i = 8;
        }
        setVisibility(i);
    }

    /* renamed from: b */
    final void m9152b(boolean z) {
        if (z != this.f3895c) {
            this.f3895c = z;
            if (this.f3893a != null) {
                this.f3893a.refreshDrawableState();
            }
        }
    }

    /* renamed from: b */
    public final boolean m9153b() {
        return this.f3895c;
    }

    public void onClick(View view) {
        int a = mo3564a();
        if (this.f3894b != null && a >= 0) {
            WDZoneRepetee zoneRepetee = this.f3894b.getZoneRepetee();
            zoneRepetee.basculerEnroulementRupture(zoneRepetee.getIndiceLiaisonRupture(this.f3894b), a);
        }
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(getMeasuredWidth(), this.f3894b.getHauteurRupture());
    }
}
