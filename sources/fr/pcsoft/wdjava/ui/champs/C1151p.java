package fr.pcsoft.wdjava.ui.champs;

import android.content.Context;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsoluteLayout;

/* renamed from: fr.pcsoft.wdjava.ui.champs.p */
public class C1151p extends AbsoluteLayout {
    public C1151p(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final int m8336a() {
        return getSuggestedMinimumHeight();
    }

    /* renamed from: b */
    public final int m8337b() {
        return getSuggestedMinimumWidth();
    }

    protected LayoutParams generateDefaultLayoutParams() {
        return new ib(0, 0, 0, 0);
    }
}
