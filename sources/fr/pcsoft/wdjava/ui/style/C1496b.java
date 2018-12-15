package fr.pcsoft.wdjava.ui.style;

import fr.pcsoft.wdjava.ui.p064a.C1034d;
import fr.pcsoft.wdjava.ui.p079e.C1397c;

/* renamed from: fr.pcsoft.wdjava.ui.style.b */
public class C1496b extends C1495a {
    /* renamed from: w */
    protected C1034d f4526w;
    /* renamed from: x */
    private C1034d f4527x;
    /* renamed from: y */
    private C1397c f4528y;

    public C1496b() {
        this.f4528y = null;
        this.f4527x = null;
        this.f4526w = null;
        this.f4528y = null;
        this.f4527x = null;
        this.f4526w = null;
    }

    public C1496b(C1397c c1397c, C1034d c1034d, C1034d c1034d2) {
        this.f4528y = null;
        this.f4527x = null;
        this.f4526w = null;
        this.f4528y = c1397c;
        this.f4527x = c1034d;
        this.f4526w = c1034d2;
    }

    /* renamed from: a */
    public Object mo3797a(int i) {
        switch (i) {
            case 2:
                return this.f4527x;
            case 3:
                return this.f4526w;
            case 4:
                return this.f4528y;
            default:
                return super.mo3797a(i);
        }
    }

    /* renamed from: a */
    public void mo3804a() {
        this.f4528y = null;
        this.f4527x = null;
        this.f4526w = null;
    }

    /* renamed from: b */
    public void mo3802b(int i, Object obj) {
        switch (i) {
            case 2:
                this.f4527x = (C1034d) obj;
                return;
            case 3:
                this.f4526w = (C1034d) obj;
                return;
            case 4:
                this.f4528y = (C1397c) obj;
                return;
            default:
                super.mo3802b(i, obj);
                return;
        }
    }
}
