package fr.pcsoft.wdjava.core.p047f;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.utils.C0808l;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: fr.pcsoft.wdjava.core.f.b */
public class C0713b implements C0712l {
    /* renamed from: b */
    private String f1822b;
    /* renamed from: c */
    private boolean f1823c = true;
    /* renamed from: d */
    private LinkedList<C0722m> f1824d;

    public C0713b(String str) {
        this.f1822b = str;
    }

    /* renamed from: a */
    public WDObjet mo2597a() {
        return a;
    }

    /* renamed from: a */
    public C0722m m2962a(int i) {
        m2970e();
        return (this.f1824d == null || this.f1824d.size() <= i) ? null : (C0722m) this.f1824d.get(i);
    }

    /* renamed from: a */
    public void mo2598a(WDObjet wDObjet) {
        m2970e();
        Iterator it = this.f1824d.iterator();
        while (it.hasNext()) {
            ((C0722m) it.next()).m3006b(wDObjet);
        }
    }

    /* renamed from: a */
    public void mo2599a(boolean z) {
        this.f1823c = z;
    }

    /* renamed from: a */
    public boolean mo2600a(String str) {
        if (C0808l.m4053k(str)) {
            return true;
        }
        String a = C0808l.m4016a(str, 20, 0);
        String a2 = C0808l.m4016a(this.f1822b, 20, 0);
        if (a.charAt(0) != ':' && a2.startsWith(":")) {
            a = ':' + a;
        }
        if (a2.equals(a)) {
            return true;
        }
        if (a2.startsWith(a)) {
            char charAt = a2.charAt(a.length());
            if (charAt == '.' || charAt == ':') {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public void mo2601b() {
        this.f1822b = null;
        if (this.f1824d != null) {
            Iterator it = this.f1824d.iterator();
            while (it.hasNext()) {
                ((C0722m) it.next()).m3004a();
            }
            this.f1824d.clear();
            this.f1824d = null;
        }
    }

    /* renamed from: b */
    public void mo2602b(WDObjet wDObjet) {
        m2970e();
        Iterator it = this.f1824d.iterator();
        while (it.hasNext()) {
            ((C0722m) it.next()).m3007c(wDObjet);
        }
    }

    /* renamed from: c */
    public boolean mo2603c() {
        return this.f1823c;
    }

    /* renamed from: d */
    public String mo2604d() {
        return this.f1822b;
    }

    /* renamed from: e */
    public void m2970e() {
        boolean z = false;
        if (this.f1824d == null) {
            this.f1824d = new LinkedList();
            for (String c0722m : C0808l.m4055m(this.f1822b)) {
                this.f1824d.add(new C0722m(c0722m));
            }
            if (!this.f1824d.isEmpty()) {
                z = true;
            }
            mo2599a(z);
        }
    }
}
