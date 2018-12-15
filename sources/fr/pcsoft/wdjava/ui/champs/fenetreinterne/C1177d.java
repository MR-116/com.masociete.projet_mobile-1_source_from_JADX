package fr.pcsoft.wdjava.ui.champs.fenetreinterne;

import android.view.View;
import java.util.Comparator;

/* renamed from: fr.pcsoft.wdjava.ui.champs.fenetreinterne.d */
class C1177d implements Comparator<View> {
    C1177d() {
    }

    /* renamed from: a */
    public int m8408a(View view, View view2) {
        C1191s c1191s = (C1191s) view.getLayoutParams();
        C1191s c1191s2 = (C1191s) view2.getLayoutParams();
        return c1191s.f3604e != c1191s2.f3604e ? c1191s.f3604e ? 1 : -1 : c1191s.f3602c - c1191s2.f3602c;
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return m8408a((View) obj, (View) obj2);
    }
}
