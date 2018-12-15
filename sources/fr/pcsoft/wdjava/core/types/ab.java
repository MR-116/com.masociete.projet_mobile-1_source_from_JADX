package fr.pcsoft.wdjava.core.types;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.types.collection.C0750f;
import java.util.LinkedList;
import java.util.List;

final class ab extends C0750f<C0797z> {
    /* renamed from: b */
    private List<C0797z> f1946b = new LinkedList(bb.access$400(this.f1947c).values());
    /* renamed from: c */
    private bb f1947c;
    /* renamed from: d */
    private List<C0797z> f1948d;

    ab(bb bbVar) {
        this.f1947c = bbVar;
    }

    static List access$500(ab abVar) {
        return abVar.f1946b;
    }

    static bb access$600(ab abVar) {
        return abVar.f1947c;
    }

    /* renamed from: d */
    public int mo2487d() {
        return 111;
    }

    /* renamed from: g */
    public Class mo2482g() {
        return C0797z.class;
    }

    /* renamed from: i */
    protected /* bridge */ /* synthetic */ WDObjet mo2623i() {
        return m3294l();
    }

    /* renamed from: j */
    public void mo2624j() {
        this.f1948d = new C0780e(this);
    }

    /* renamed from: k */
    public List<C0797z> mo2625k() {
        return this.f1948d;
    }

    /* renamed from: l */
    protected C0797z m3294l() {
        bb bbVar = this.f1947c;
        bbVar.getClass();
        return new C0797z(bbVar, null);
    }

    public void release() {
        if (this.f1948d != null) {
            this.f1948d.clear();
            this.f1948d = null;
        }
    }
}
