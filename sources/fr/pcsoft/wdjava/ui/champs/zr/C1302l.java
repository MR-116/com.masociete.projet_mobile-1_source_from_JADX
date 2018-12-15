package fr.pcsoft.wdjava.ui.champs.zr;

import android.widget.BaseAdapter;
import fr.pcsoft.wdjava.ui.utils.C1244f;

/* renamed from: fr.pcsoft.wdjava.ui.champs.zr.l */
class C1302l extends C1244f {
    /* renamed from: d */
    private WDAttributZR f3898d;
    final WDZoneRepetee this$0;

    public C1302l(WDZoneRepetee wDZoneRepetee, WDAttributZR wDAttributZR) {
        this.this$0 = wDZoneRepetee;
        this.f3898d = wDAttributZR;
        ((BaseAdapter) wDZoneRepetee.ud.mo3596c()).registerDataSetObserver(this);
    }

    /* renamed from: a */
    public int mo3503a() {
        return this.this$0.ud.mo3586a();
    }

    /* renamed from: a */
    public String mo3504a(int i) {
        return (i < 0 || i >= mo3503a()) ? "" : ((ec) this.this$0.ud.mo3593b(i)).m9107b(this.f3898d.getIndiceAttribut()).getString();
    }

    /* renamed from: b */
    public final void mo3505b() {
        super.mo3505b();
        if (this.this$0.ud != null) {
            ((BaseAdapter) this.this$0.ud.mo3596c()).unregisterDataSetObserver(this);
        }
        this.f3898d = null;
    }
}
