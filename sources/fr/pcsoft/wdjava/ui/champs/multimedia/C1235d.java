package fr.pcsoft.wdjava.ui.champs.multimedia;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup.LayoutParams;
import android.widget.MediaController;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.VideoView;
import fr.pcsoft.wdjava.core.application.C0536n;
import fr.pcsoft.wdjava.ui.activite.C1056i;

/* renamed from: fr.pcsoft.wdjava.ui.champs.multimedia.d */
class C1235d extends RelativeLayout {
    /* renamed from: a */
    private ProgressBar f3670a = null;
    /* renamed from: b */
    private VideoView f3671b = null;
    /* renamed from: c */
    private MediaController f3672c = null;

    public C1235d(Context context) {
        super(context);
        this.f3671b = new VideoView(context);
        addView(this.f3671b);
        this.f3671b.setBackgroundColor(0);
    }

    static void access$300(C1235d c1235d) {
        c1235d.m8667d();
    }

    static void access$400(C1235d c1235d) {
        c1235d.m8666c();
    }

    /* renamed from: c */
    private final void m8666c() {
        if (this.f3670a != null) {
            removeView(this.f3670a);
            this.f3670a = null;
        }
    }

    /* renamed from: d */
    private final void m8667d() {
        if (this.f3670a == null) {
            this.f3670a = new ProgressBar(C1056i.m7562a(), null, 16842871);
            this.f3670a.setIndeterminate(true);
            LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            Drawable indeterminateDrawable = this.f3670a.getIndeterminateDrawable();
            if (indeterminateDrawable != null) {
                indeterminateDrawable.setAlpha(C0536n.f1006y);
            }
            addView(this.f3670a, layoutParams);
        }
    }

    /* renamed from: a */
    public final VideoView m8668a() {
        return this.f3671b;
    }

    /* renamed from: a */
    public void m8669a(C1234c c1234c) {
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        switch (C1237f.f3673a[c1234c.ordinal()]) {
            case 1:
                layoutParams.addRule(13);
                break;
            case 2:
                layoutParams.addRule(10, -1);
                layoutParams.addRule(12, -1);
                layoutParams.addRule(9, -1);
                layoutParams.addRule(11, -1);
                break;
        }
        this.f3671b.setLayoutParams(layoutParams);
        requestLayout();
    }

    /* renamed from: b */
    public final MediaController m8670b() {
        return this.f3672c;
    }

    /* renamed from: e */
    void m8671e() {
        this.f3672c = new MediaController(C1056i.m7562a());
        this.f3671b.setMediaController(this.f3672c);
    }
}
