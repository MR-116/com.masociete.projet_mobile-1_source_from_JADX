package fr.pcsoft.wdjava.ui.utils;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.TextView;
import fr.pcsoft.wdjava.core.utils.C0808l;

/* renamed from: fr.pcsoft.wdjava.ui.utils.x */
final class C1522x extends Dialog {
    /* renamed from: a */
    private TextView f4668a = null;
    /* renamed from: b */
    private ProgressBar f4669b = null;

    C1522x(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void m10573a(String str) {
        if (C0808l.m4053k(str)) {
            this.f4668a.setVisibility(8);
            this.f4668a.setText("");
            this.f4669b.setVisibility(0);
            return;
        }
        this.f4668a.setText(str);
        this.f4668a.setVisibility(0);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().requestFeature(1);
        View linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        this.f4669b = new ProgressBar(getContext());
        this.f4669b.setIndeterminate(true);
        linearLayout.addView(this.f4669b, new LayoutParams(-2, -2));
        this.f4668a = new TextView(getContext());
        float f = Resources.getSystem().getDisplayMetrics().density;
        this.f4668a.setPadding((int) Math.floor((double) (10.0f * f)), 0, 0, 0);
        this.f4668a.setGravity(17);
        linearLayout.addView(this.f4668a, new LayoutParams(-2, -1));
        int floor = (int) Math.floor((double) (f * 15.0f));
        linearLayout.setPadding(floor, floor, floor, floor);
        setCancelable(false);
        setContentView(linearLayout);
    }
}
