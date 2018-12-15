package fr.pcsoft.wdjava.ui.champs;

import fr.pcsoft.wdjava.ui.utils.C1244f;

/* renamed from: fr.pcsoft.wdjava.ui.champs.o */
public class C1245o extends C1244f {
    final kc this$0;

    public C1245o(kc kcVar) {
        this.this$0 = kcVar;
        kcVar.cd.registerDataSetObserver(this);
    }

    /* renamed from: a */
    public int mo3503a() {
        return this.this$0.cd.getCount();
    }

    /* renamed from: a */
    public String mo3504a(int i) {
        return (i < 0 || i >= mo3503a()) ? "" : ((bc) this.this$0.cd.getItem(i)).m8259a(true);
    }

    /* renamed from: b */
    public final void mo3505b() {
        super.mo3505b();
        if (this.this$0.cd != null) {
            this.this$0.cd.unregisterDataSetObserver(this);
        }
    }
}
