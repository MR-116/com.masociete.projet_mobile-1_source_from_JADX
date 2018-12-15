package fr.pcsoft.wdjava.core.types.collection.tableau;

import fr.pcsoft.wdjava.core.WDObjet;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: fr.pcsoft.wdjava.core.types.collection.tableau.a */
public class C0760a implements Iterator<WDObjet> {
    /* renamed from: a */
    int f1991a = 0;
    /* renamed from: b */
    int f1992b = 0;
    /* renamed from: c */
    int f1993c = -1;
    final C0759o this$0;

    public C0760a(C0759o c0759o, int i) {
        this.this$0 = c0759o;
        this.f1992b = i;
        if (c0759o.f1986q != null) {
            try {
                if (c0759o.f1982j == 2) {
                    if (this.f1992b >= 0) {
                        try {
                            if (this.f1992b < c0759o.f1986q.length) {
                                return;
                            }
                        } catch (IllegalStateException e) {
                            throw e;
                        }
                    }
                }
            } catch (IllegalStateException e2) {
                throw e2;
            } catch (IllegalStateException e22) {
                throw e22;
            }
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public WDObjet m3531a() {
        try {
            int i = this.f1991a;
            WDObjet wDObjet = (WDObjet) this.this$0.f1986q[this.f1991a].f1977c.get(this.f1992b);
            this.f1993c = i;
            this.f1991a = i + 1;
            return wDObjet;
        } catch (IndexOutOfBoundsException e) {
            throw new NoSuchElementException();
        }
    }

    public boolean hasNext() {
        try {
            return this.f1991a < this.this$0.f1986q.length;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public /* bridge */ /* synthetic */ Object next() {
        return m3531a();
    }

    public void remove() {
        try {
            if (this.f1993c < 0) {
                throw new IllegalStateException();
            }
            try {
                this.this$0.f1986q[this.f1991a].f1977c.remove(this.f1993c);
                if (this.f1993c < this.f1991a) {
                    this.f1991a--;
                }
                this.f1993c = -1;
            } catch (IllegalStateException e) {
                throw e;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }
}
