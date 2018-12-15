package fr.pcsoft.wdjava.p037c;

import fr.pcsoft.wdjava.core.utils.ic;

/* renamed from: fr.pcsoft.wdjava.c.f */
final class C0557f extends ic {
    final int val$nType;

    C0557f(int i) {
        this.val$nType = i;
    }

    static void access$100(C0557f c0557f, Object obj) {
        c0557f.m1787a(obj);
    }

    static void access$200(C0557f c0557f, Exception exception) {
        c0557f.m1786a(exception);
    }

    /* renamed from: c */
    protected void mo2434c() {
        try {
            C0554c.m1773a(this.val$nType, new C0552a(this));
        } catch (Exception e) {
            m1786a(e);
        }
    }
}
