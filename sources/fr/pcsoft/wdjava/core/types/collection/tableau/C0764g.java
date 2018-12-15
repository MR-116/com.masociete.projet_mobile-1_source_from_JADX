package fr.pcsoft.wdjava.core.types.collection.tableau;

import java.util.Comparator;

/* renamed from: fr.pcsoft.wdjava.core.types.collection.tableau.g */
class C0764g implements Comparator {
    /* renamed from: a */
    private boolean f1995a = true;
    /* renamed from: b */
    private int f1996b = 0;

    public C0764g(int i, boolean z) {
        this.f1996b = i;
        this.f1995a = z;
    }

    public int compare(Object obj, Object obj2) {
        C0759o c0759o = (C0759o) obj;
        C0759o c0759o2 = (C0759o) obj2;
        return c0759o.get(this.f1996b).opEgal(c0759o2.get(this.f1996b)) ? 0 : c0759o.get(this.f1996b).opSup(c0759o2.get(this.f1996b)) ? !this.f1995a ? -1 : 1 : this.f1995a ? -1 : 1;
    }
}
