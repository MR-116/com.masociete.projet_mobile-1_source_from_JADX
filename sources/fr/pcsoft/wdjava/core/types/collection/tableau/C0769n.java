package fr.pcsoft.wdjava.core.types.collection.tableau;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.poo.C0558c;
import java.util.Comparator;

/* renamed from: fr.pcsoft.wdjava.core.types.collection.tableau.n */
class C0769n implements Comparator<WDObjet> {
    /* renamed from: a */
    private int f2006a;
    /* renamed from: b */
    private final boolean[] f2007b;
    /* renamed from: c */
    private boolean f2008c = this.f2007b[0];
    /* renamed from: d */
    private C0761b f2009d;
    /* renamed from: e */
    private final C0761b[] f2010e;

    public C0769n(C0761b[] c0761bArr, boolean[] zArr) {
        this.f2010e = c0761bArr;
        this.f2007b = zArr;
        this.f2009d = c0761bArr[0];
    }

    /* renamed from: a */
    public int m3546a(WDObjet wDObjet, WDObjet wDObjet2) {
        WDObjet a = this.f2009d.mo2671a((WDObjet) wDObjet.checkType(C0558c.class));
        WDObjet a2 = this.f2009d.mo2671a((WDObjet) wDObjet2.checkType(C0558c.class));
        if (!a.opEgal(a2)) {
            return a.opSup(a2) ? this.f2008c ? 1 : -1 : this.f2008c ? -1 : 1;
        } else {
            if (this.f2006a >= this.f2010e.length - 1) {
                return 0;
            }
            int i = this.f2006a;
            try {
                this.f2006a++;
                this.f2009d = this.f2010e[this.f2006a];
                while (this.f2009d == null && this.f2006a < this.f2010e.length - 1) {
                    this.f2006a++;
                    this.f2009d = this.f2010e[this.f2006a];
                }
                this.f2008c = this.f2007b[this.f2006a];
                int a3 = m3546a(wDObjet, wDObjet2);
                return a3;
            } finally {
                this.f2006a = i;
                this.f2009d = this.f2010e[this.f2006a];
                this.f2008c = this.f2007b[this.f2006a];
            }
        }
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return m3546a((WDObjet) obj, (WDObjet) obj2);
    }
}
