package fr.pcsoft.wdjava.core.types.collection;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.parcours.p039a.C0566b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: fr.pcsoft.wdjava.core.types.collection.b */
class C0755b extends C0566b {
    /* renamed from: p */
    private List<WDObjet> f1966p;
    final C0753g this$0;

    C0755b(C0753g c0753g, WDObjet wDObjet, WDObjet wDObjet2, WDObjet wDObjet3, WDObjet wDObjet4, boolean z, boolean z2) {
        this.this$0 = c0753g;
        super(wDObjet, wDObjet2, wDObjet3, wDObjet4, z, z2);
    }

    /* renamed from: b */
    public WDObjet mo2456b(int i) {
        int h = mo2458h();
        if (i < 0 || i >= h) {
            return null;
        }
        List list = this.f1966p;
        if (this.this$0.f1957e == C0757h.STACK) {
            i = (h - i) - 1;
        }
        return (WDObjet) list.get(i);
    }

    /* renamed from: e */
    protected void mo2450e() {
        super.mo2450e();
        if (this.this$0.f1957e == C0757h.LIST) {
            this.f1966p = this.this$0.f1955c;
            return;
        }
        this.this$0.f1959g.lock();
        try {
            this.f1966p = new ArrayList(this.this$0.f1955c);
        } finally {
            this.this$0.f1959g.unlock();
        }
    }

    public void finParcours() {
        super.finParcours();
        if (this.this$0.f1957e == C0757h.STACK || this.this$0.f1957e == C0757h.QUEUE) {
            this.f1966p.clear();
        }
    }

    public WDObjet getSource() {
        return this.this$0;
    }

    /* renamed from: h */
    public int mo2458h() {
        return this.f1966p.size();
    }

    public boolean testParcours() {
        if (this.this$0.f1957e != C0757h.LIST) {
            return super.testParcours();
        }
        this.this$0.f1959g.lock();
        try {
            boolean testParcours = super.testParcours();
            return testParcours;
        } finally {
            this.this$0.f1959g.unlock();
        }
    }
}
