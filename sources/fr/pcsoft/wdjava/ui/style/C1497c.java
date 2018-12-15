package fr.pcsoft.wdjava.ui.style;

import fr.pcsoft.wdjava.ui.cadre.C1110m;
import fr.pcsoft.wdjava.ui.p064a.C1034d;
import fr.pcsoft.wdjava.ui.p079e.C1397c;

/* renamed from: fr.pcsoft.wdjava.ui.style.c */
public class C1497c extends C1496b {
    /* renamed from: A */
    private C1110m f4529A;
    /* renamed from: z */
    private boolean f4530z;

    public C1497c() {
        this.f4529A = null;
        this.f4530z = Boolean.FALSE.booleanValue();
        this.f4530z = Boolean.FALSE.booleanValue();
        this.f4529A = null;
    }

    public C1497c(C1110m c1110m, C1397c c1397c, C1034d c1034d, C1034d c1034d2) {
        super(c1397c, c1034d, c1034d2);
        this.f4529A = null;
        this.f4530z = Boolean.FALSE.booleanValue();
        if (c1110m.mo3376f()) {
            this.f4530z = Boolean.TRUE.booleanValue();
        }
        this.f4529A = c1110m;
    }

    /* renamed from: a */
    public Object mo3797a(int i) {
        switch (i) {
            case 1:
                return this.f4529A;
            case 5:
                return Boolean.valueOf(this.f4530z);
            default:
                return super.mo3797a(i);
        }
    }

    /* renamed from: a */
    public void mo3804a() {
        super.mo3804a();
        if (this.f4529A != null) {
            if (this.f4529A instanceof C1110m) {
                this.f4529A.mo3386h();
            }
            this.f4529A = null;
        }
    }

    /* renamed from: b */
    public Object mo3801b(int i, boolean z) {
        Object b = super.mo3801b(i, z);
        if (z && i == 1 && this.w == e && b != null) {
            C1034d c1034d = (C1034d) mo3801b(3, true);
            if (c1034d != null) {
                ((C1110m) b).mo3385d(c1034d.mo3315b());
            }
        }
        return b;
    }

    /* renamed from: b */
    public void mo3802b(int i, Object obj) {
        switch (i) {
            case 1:
                this.f4529A = (C1110m) obj;
                return;
            case 3:
                this.w = (C1034d) obj;
                if (this.w != null && this.f4529A != null) {
                    this.f4529A.mo3385d(this.w.mo3315b());
                    return;
                }
                return;
            case 5:
                this.f4530z = ((Boolean) obj).booleanValue();
                return;
            default:
                super.mo3802b(i, obj);
                return;
        }
    }
}
