package fr.pcsoft.wdjava.ui.champs.zr;

import android.content.Context;
import fr.pcsoft.wdjava.ui.champs.C1151p;
import fr.pcsoft.wdjava.ui.champs.dc;
import fr.pcsoft.wdjava.ui.champs.gc;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: fr.pcsoft.wdjava.ui.champs.zr.q */
public abstract class C1308q extends C1151p {
    /* renamed from: a */
    protected LinkedList<gc> f3903a = new LinkedList();
    /* renamed from: b */
    protected boolean f3904b = false;
    final C1295f this$0;

    public C1308q(C1295f c1295f, Context context) {
        this.this$0 = c1295f;
        super(context);
        setBackgroundDrawable(null);
    }

    /* renamed from: a */
    public gc m9183a(gc gcVar) {
        Iterator it = this.f3903a.iterator();
        while (it.hasNext()) {
            gc gcVar2 = (gc) it.next();
            if (gcVar2.getChampSourceClone() == gcVar) {
                return gcVar2;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo3574a(ec ecVar, boolean z) {
        if (getVisibility() == 0) {
            if (!this.f3904b) {
                mo3576c();
            }
            Iterator it = this.f3903a.iterator();
            while (it.hasNext()) {
                gc gcVar = (gc) it.next();
                if (z) {
                    try {
                        gcVar.addFlag(256);
                    } catch (Throwable th) {
                        if (z) {
                            gcVar.removeFlag(256);
                        }
                    }
                }
                this.this$0.b.m1511a(gcVar, ecVar, z);
                gc champSourceClone = gcVar.getChampSourceClone();
                int nbAttributs = champSourceClone.getNbAttributs();
                for (int i = 0; i < nbAttributs; i++) {
                    dc attributAt = champSourceClone.getAttributAt(i);
                    attributAt.affecterValeurChampAssocie(gcVar, ecVar.m9107b(attributAt.getIndiceAttribut()));
                }
                if (z) {
                    gcVar.removeFlag(256);
                }
            }
        }
    }

    /* renamed from: a */
    protected final void m9185a(Iterator<gc> it) {
        if (!this.f3904b) {
            while (it.hasNext()) {
                gc cloneChampForZR = ((gc) it.next()).cloneChampForZR(false, true);
                this.this$0.b.initChampPourAffichageDansZR(cloneChampForZR);
                mo3575b(cloneChampForZR);
            }
            this.f3904b = true;
        }
    }

    /* renamed from: b */
    protected void mo3575b(gc gcVar) {
        addView(gcVar.getCompConteneur());
        this.f3903a.add(gcVar);
    }

    /* renamed from: c */
    protected abstract void mo3576c();

    /* renamed from: d */
    public final Iterator<gc> m9188d() {
        return this.f3903a != null ? this.f3903a.iterator() : null;
    }
}
