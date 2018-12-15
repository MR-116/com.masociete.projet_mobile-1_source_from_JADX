package fr.pcsoft.wdjava.ui.champs.fenetreinterne;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;

/* renamed from: fr.pcsoft.wdjava.ui.champs.fenetreinterne.s */
public class C1191s extends LayoutParams {
    /* renamed from: a */
    public int f3600a;
    /* renamed from: b */
    float f3601b = 0.0f;
    /* renamed from: c */
    int f3602c;
    /* renamed from: d */
    boolean f3603d;
    /* renamed from: e */
    public boolean f3604e;
    /* renamed from: f */
    int f3605f;

    public C1191s() {
        super(-1, -1);
    }

    public C1191s(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1189p.f3548l);
        this.f3600a = obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
    }
}
