package fr.pcsoft.wdjava.core.poo.p038a;

import android.content.ContentProviderOperation;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.poo.C0560r;
import java.util.ArrayList;

/* renamed from: fr.pcsoft.wdjava.core.poo.a.b */
public abstract class C0561b extends C0560r {
    /* renamed from: b */
    private ArrayList<ContentProviderOperation> f1271b = null;

    /* renamed from: a */
    protected abstract void mo2437a();

    /* renamed from: b */
    public ArrayList<ContentProviderOperation> m1805b() {
        if (this.f1271b == null) {
            this.f1271b = new ArrayList();
        }
        return this.f1271b;
    }

    /* renamed from: c */
    protected final void m1806c() {
        if (this.f1271b != null) {
            this.f1271b.clear();
            this.f1271b = null;
        }
    }

    public WDObjet getClone() {
        C0561b c0561b = (C0561b) super.getClone();
        if (this.f1271b != null) {
            c0561b.f1271b = new ArrayList(this.f1271b);
        }
        return c0561b;
    }

    public void razVariable() {
        m1806c();
    }

    public void release() {
        if (this.f1271b != null) {
            this.f1271b.clear();
            this.f1271b = null;
        }
    }
}
