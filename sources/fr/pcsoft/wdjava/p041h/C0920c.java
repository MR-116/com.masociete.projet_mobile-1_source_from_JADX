package fr.pcsoft.wdjava.p041h;

import fr.pcsoft.wdjava.core.WDCallback;
import fr.pcsoft.wdjava.p032m.C0938m;
import fr.pcsoft.wdjava.ui.champs.fenetre.C0509v;

/* renamed from: fr.pcsoft.wdjava.h.c */
public class C0920c extends C0919b implements Runnable {
    /* renamed from: i */
    private int f2513i = 0;
    /* renamed from: j */
    private boolean f2514j = false;
    /* renamed from: k */
    private int f2515k = 0;

    public C0920c(int i, int i2, WDCallback wDCallback, C0509v c0509v, int i3) {
        super(i, i2, wDCallback, c0509v, i3);
        this.f2513i = i2;
        this.f2515k = i2;
    }

    /* renamed from: a */
    public void mo3211a(int i) {
        this.f2515k = i;
    }

    /* renamed from: b */
    public void mo3212b() {
        super.mo3212b();
    }

    /* renamed from: c */
    public void mo3213c() {
        this.f2514j = false;
        if (this.g != null) {
            this.g.mo2560a(this.d);
        }
    }

    /* renamed from: d */
    public void mo3214d() {
        this.f2514j = true;
        if (this.g != null) {
            this.g.mo2562b(this.d);
        }
        if (this.f2515k > 0) {
            C0938m.m6816c().postDelayed(this, (long) this.f2513i);
        } else {
            run();
        }
    }

    public void run() {
        if (this.f2514j) {
            m6533a(this.f);
        }
        if (this.f2514j) {
            C0938m.m6816c().postDelayed(this, (long) this.f2513i);
        } else {
            this.c = null;
        }
    }
}
