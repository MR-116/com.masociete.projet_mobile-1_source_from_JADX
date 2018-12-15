package fr.pcsoft.wdjava.ui.style;

import fr.pcsoft.wdjava.ui.cadre.C1110m;
import fr.pcsoft.wdjava.ui.p064a.C1034d;
import fr.pcsoft.wdjava.ui.p079e.C1397c;

/* renamed from: fr.pcsoft.wdjava.ui.style.f */
public class C1501f extends C1500e {
    /* renamed from: C */
    private boolean f4547C;
    /* renamed from: D */
    private C1034d f4548D;
    /* renamed from: E */
    private C1110m f4549E;

    public C1501f() {
        this.f4549E = null;
        this.f4547C = Boolean.FALSE.booleanValue();
        this.f4548D = null;
        this.f4547C = Boolean.FALSE.booleanValue();
        this.f4549E = null;
        this.f4548D = null;
    }

    public C1501f(C1110m c1110m, C1397c c1397c, C1034d c1034d, C1034d c1034d2, int i, int i2) {
        super(c1397c, c1034d, i, i2);
        this.f4549E = null;
        this.f4547C = Boolean.FALSE.booleanValue();
        this.f4548D = null;
        if (c1110m.mo3376f()) {
            this.f4547C = Boolean.TRUE.booleanValue();
        }
        this.f4549E = c1110m;
        this.f4548D = c1034d2;
    }

    /* renamed from: a */
    public Object mo3797a(int i) {
        switch (i) {
            case 1:
                return this.f4549E;
            case 3:
                return this.f4548D;
            case 5:
                return Boolean.valueOf(this.f4547C);
            default:
                return super.mo3797a(i);
        }
    }

    /* renamed from: a */
    public void mo3804a() {
        super.mo3804a();
        if (this.f4549E != null) {
            if (this.f4549E instanceof C1110m) {
                this.f4549E.mo3386h();
            }
            this.f4549E = null;
        }
        this.f4548D = null;
    }

    /* renamed from: b */
    public Object mo3801b(int i, boolean z) {
        Object b = super.mo3801b(i, z);
        if (i == 1 && z && this.f4548D == e && b != null) {
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
                this.f4549E = (C1110m) obj;
                return;
            case 3:
                this.f4548D = (C1034d) obj;
                if (this.f4548D != null && this.f4549E != null) {
                    this.f4549E.mo3385d(this.f4548D.mo3315b());
                    return;
                }
                return;
            case 5:
                this.f4547C = ((Boolean) obj).booleanValue();
                return;
            default:
                super.mo3802b(i, obj);
                return;
        }
    }
}
