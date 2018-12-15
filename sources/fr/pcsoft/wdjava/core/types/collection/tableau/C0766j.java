package fr.pcsoft.wdjava.core.types.collection.tableau;

import java.util.Comparator;

/* renamed from: fr.pcsoft.wdjava.core.types.collection.tableau.j */
class C0766j implements Comparator {
    /* renamed from: a */
    private final int[] f2000a;
    /* renamed from: b */
    private int f2001b = 0;

    public C0766j(int[] iArr) {
        this.f2000a = iArr;
    }

    /* renamed from: a */
    public int m3541a(Object obj, Object obj2, int i, boolean z) {
        C0759o c0759o = (C0759o) obj;
        C0759o c0759o2 = (C0759o) obj2;
        if (!c0759o.get(i).opEgal(c0759o2.get(i))) {
            this.f2001b = 0;
            return c0759o.get(i).opSup(c0759o2.get(i)) ? !z ? -1 : 1 : z ? -1 : 1;
        } else if (this.f2001b < this.f2000a.length - 1) {
            this.f2001b++;
            int i2 = this.f2000a[this.f2001b];
            return m3541a(obj, obj2, Math.abs(i2), i2 >= 0);
        } else {
            this.f2001b = 0;
            return 0;
        }
    }

    public int compare(Object obj, Object obj2) {
        int i = this.f2000a[this.f2001b];
        return m3541a(obj, obj2, Math.abs(i), i >= 0);
    }
}
