package fr.pcsoft.wdjava.core.types.collection.tableau;

import fr.pcsoft.wdjava.core.WDObjet;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: fr.pcsoft.wdjava.core.types.collection.tableau.l */
public class C0767l implements Iterator<WDObjet> {
    /* renamed from: a */
    int f2002a = 0;
    /* renamed from: b */
    int f2003b = -1;
    final C0759o this$0;

    public C0767l(C0759o c0759o) {
        this.this$0 = c0759o;
        if (c0759o.f1977c == null) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public WDObjet mo2672a() {
        try {
            int i = this.f2002a;
            WDObjet wDObjet = (WDObjet) this.this$0.f1977c.get(i);
            this.f2003b = i;
            this.f2002a = i + 1;
            return wDObjet;
        } catch (IndexOutOfBoundsException e) {
            throw new NoSuchElementException();
        }
    }

    public boolean hasNext() {
        try {
            return this.f2002a < this.this$0.f1977c.size();
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public /* bridge */ /* synthetic */ Object next() {
        return mo2672a();
    }

    public void remove() {
        try {
            if (this.f2003b < 0) {
                throw new IllegalStateException();
            }
            try {
                this.this$0.f1977c.remove(this.f2003b);
                if (this.f2003b < this.f2002a) {
                    this.f2002a--;
                }
                this.f2003b = -1;
            } catch (IllegalStateException e) {
                throw e;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }
}
