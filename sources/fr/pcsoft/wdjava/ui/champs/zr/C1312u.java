package fr.pcsoft.wdjava.ui.champs.zr;

import java.util.Comparator;

/* renamed from: fr.pcsoft.wdjava.ui.champs.zr.u */
class C1312u extends C1311t {
    /* renamed from: c */
    private C1297h f3921c = new C1297h(this.this$0);
    final WDZoneRepetee this$0;

    C1312u(WDZoneRepetee wDZoneRepetee) {
        this.this$0 = wDZoneRepetee;
    }

    /* renamed from: a */
    public int mo3586a() {
        return this.f3921c.getCount();
    }

    /* renamed from: a */
    public int mo3587a(Object obj) {
        return this.f3921c.m9132a((ec) obj);
    }

    /* renamed from: a */
    public void mo3588a(int i) {
        int convertirIndiceModeleVersVue = this.this$0.convertirIndiceModeleVersVue(i);
        if (this.this$0.isEditing() && (this.this$0.Fd.m9261j() >= convertirIndiceModeleVersVue || this.this$0.isHorizontale())) {
            this.this$0.Fd.m9262k();
        }
        this.f3921c.m9143c(this.f3921c.m9133a(i));
        this.this$0.Vd.mo3555d(convertirIndiceModeleVersVue);
        this.this$0.majSelectionApresSuppression(convertirIndiceModeleVersVue);
    }

    /* renamed from: a */
    public void mo3589a(int i, int i2) {
        this.f3921c.notifyDataSetChanged();
        this.this$0.Vd.mo3551b(i, i2);
    }

    /* renamed from: a */
    public void mo3590a(Object obj, int i) {
        int convertirIndiceModeleVersVue = this.this$0.convertirIndiceModeleVersVue(i);
        if (this.this$0.isEditing() && this.this$0.Fd.mo3605h() == 1 && (this.this$0.Fd.m9261j() >= convertirIndiceModeleVersVue || this.this$0.isHorizontale())) {
            this.this$0.Fd.m9262k();
        }
        this.f3921c.m9135a((ec) obj, i);
        this.this$0.Vd.mo3553c(convertirIndiceModeleVersVue);
        this.this$0.majSelectionApresInsertion(convertirIndiceModeleVersVue);
    }

    /* renamed from: a */
    public void mo3591a(Object obj, int i, boolean z) {
        if (!z) {
            this.f3921c.m9138a(false);
        }
        try {
            this.f3921c.m9135a((ec) obj, i);
            ec a = this.f3921c.m9133a(i + 1);
            if (a != null) {
                this.f3921c.m9143c(a);
            }
            this.this$0.Vd.mo3546a(this.this$0.convertirIndiceModeleVersVue(i));
        } finally {
            if (!z) {
                this.f3921c.m9138a(true);
            }
        }
    }

    /* renamed from: a */
    public void mo3592a(Comparator comparator) {
        this.f3921c.m9137a(comparator);
        this.this$0.Vd.mo3557f();
    }

    /* renamed from: b */
    public Object mo3593b(int i) {
        return this.f3921c.m9133a(i);
    }

    /* renamed from: b */
    public void mo3581b() {
        if (this.this$0.isEditing()) {
            this.this$0.Fd.m9262k();
        }
        super.mo3581b();
        this.f3921c.m9145d();
        this.this$0.Vd.mo3554d();
        this.this$0.Vc.mo3486b();
    }

    /* renamed from: b */
    public void mo3594b(int i, int i2) {
        if (i != i2) {
            this.f3921c.m9141b(i, i2);
        }
    }

    /* renamed from: b */
    public void mo3595b(Object obj) {
        mo3590a(obj, this.f3921c.getCount());
    }

    /* renamed from: c */
    public Object mo3596c() {
        return this.f3921c;
    }

    /* renamed from: c */
    public void mo3597c(int i, int i2) {
        this.f3921c.m9134a(i, i2);
    }

    /* renamed from: f */
    public void mo3598f() {
        if (this.f3921c != null) {
            this.f3921c.m9146e();
            this.f3921c = null;
        }
    }
}
