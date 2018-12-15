package fr.pcsoft.wdjava.ui.p073d.p075b.p076a;

import fr.pcsoft.wdjava.ui.champs.wc;
import fr.pcsoft.wdjava.ui.utils.C1515p;

/* renamed from: fr.pcsoft.wdjava.ui.d.b.a.f */
public class C1327f extends C1326e {
    /* renamed from: r */
    private C1328g f3964r = null;

    public C1327f(wc wcVar) {
        super(wcVar);
    }

    /* renamed from: Q */
    protected void mo3672Q() {
        if (this.f3964r != null && this.f3964r.m9493a()) {
            this.f3964r.m9495c();
        }
    }

    /* renamed from: S */
    protected void mo3673S() {
        if (this.f3964r != null) {
            if (this.f3964r.m9493a()) {
                this.f3964r.m9495c();
            }
            this.o = Math.max(20, mo3657E());
            this.f3964r.m9494b();
        }
    }

    /* renamed from: T */
    protected void mo3674T() {
        this.f3964r = new C1328g(this);
    }

    /* renamed from: a */
    public void mo3609a() {
        super.mo3609a();
        mo3672Q();
        this.f3964r = null;
    }

    /* renamed from: b */
    public void mo3617b(int i) {
        super.mo3617b(i);
        this.j.onValueChanged();
    }

    /* renamed from: g */
    public void mo3627g() {
        try {
            if (this.f3964r != null) {
                while (this.f3964r.m9493a()) {
                    try {
                        C1515p.m10541a();
                    } catch (Exception e) {
                        return;
                    }
                }
            }
        } catch (Exception e2) {
            throw e2;
        }
    }
}
