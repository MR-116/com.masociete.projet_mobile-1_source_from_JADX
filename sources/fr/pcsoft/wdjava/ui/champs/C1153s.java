package fr.pcsoft.wdjava.ui.champs;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.context.C0671c;
import fr.pcsoft.wdjava.core.context.WDAppelContexte;
import fr.pcsoft.wdjava.core.context.WDContexte;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.ui.C0489p;
import fr.pcsoft.wdjava.ui.champs.fenetre.C0508h;
import fr.pcsoft.wdjava.ui.champs.fenetre.C0509v;
import fr.pcsoft.wdjava.ui.champs.fenetreinterne.fb;
import fr.pcsoft.wdjava.ui.champs.p068a.C1123a;
import fr.pcsoft.wdjava.ui.p064a.C1031a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: fr.pcsoft.wdjava.ui.champs.s */
public abstract class C1153s implements xc {
    /* renamed from: a */
    protected LinkedHashMap<String, C0489p> f3506a = new LinkedHashMap();
    /* renamed from: b */
    private int f3507b = C0607n.Kw;

    /* renamed from: a */
    public final int mo3420a() {
        return this.f3507b;
    }

    /* renamed from: a */
    public C0489p m8344a(String str, boolean z) {
        String toLowerCase = str.toLowerCase();
        C0489p c0489p = (C0489p) this.f3506a.get(C0808l.m4057o(toLowerCase));
        if (c0489p == null && z) {
            for (C0489p c0489p2 : this.f3506a.values()) {
                c0489p2 = c0489p2.getFils(toLowerCase);
                if (c0489p2 != null) {
                    break;
                }
            }
        }
        return c0489p2;
    }

    /* renamed from: a */
    public final void mo3421a(int i) {
        this.f3507b = i;
    }

    /* renamed from: a */
    public final void mo3422a(int i, int i2) {
        for (C0489p c0489p : this.f3506a.values()) {
            if (c0489p.isChamp()) {
                ((gc) c0489p).doParallax(i, i2);
            }
        }
    }

    /* renamed from: a */
    public void m8347a(int i, int i2, int i3) {
        int i4 = (i3 & 1) > 0 ? 1 : 0;
        gc e = mo3424e();
        if ((mo3424e().isFenetreCreeExt() || (e instanceof fb)) && i4 == 0) {
            mo3525a(i, i2, 0, 0, (i3 & 2) > 0 ? 15 : 0);
        }
    }

    /* renamed from: a */
    public void mo3525a(int i, int i2, int i3, int i4, int i5) {
        if (mo3424e().isAncrageActif()) {
            ArrayList arrayList = new ArrayList();
            for (WDObjet wDObjet : this.f3506a.values()) {
                if (wDObjet.isChamp()) {
                    gc gcVar = (gc) wDObjet;
                    if (gcVar.isSplitter()) {
                        arrayList.add(gcVar);
                    }
                    gcVar.ancrer(i, i2, i3, i4, i5);
                }
            }
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C1123a) it.next()).m8237a();
                }
            }
        }
    }

    /* renamed from: a */
    public void m8349a(C0508h c0508h) {
        ArrayList arrayList = new ArrayList(this.f3506a.values());
        Collections.sort(arrayList, new bb());
        for (int i = 0; i < arrayList.size(); i++) {
            C0489p c0489p = (C0489p) arrayList.get(i);
            if (c0489p.isChamp()) {
                gc gcVar = (gc) c0489p;
                if (gcVar.estNavigable(false)) {
                    ((C0509v) c0508h).ajouterChampNavigable(gcVar);
                    gcVar.setOrdreNavigation(((C0509v) c0508h).getNbChampNavigable() - 1);
                }
                gcVar.majOrdreNavigation(c0508h);
            }
        }
    }

    /* renamed from: a */
    public void m8350a(C0546j c0546j, boolean z) {
        for (C0489p c0489p : this.f3506a.values()) {
            if (c0489p.isChamp()) {
                if (!c0546j.mo2352a((nb) c0489p)) {
                    return;
                }
                if (z) {
                    ((gc) c0489p).parcourirChamp(c0546j, z);
                }
            }
        }
    }

    /* renamed from: a */
    public void m8351a(C0489p c0489p) {
        if (this.f3506a != null) {
            this.f3506a.remove(C0808l.m4057o(c0489p.getName().toLowerCase()));
        }
    }

    /* renamed from: a */
    public void m8352a(String str) {
        m8350a(new cb(this, str), false);
    }

    /* renamed from: a */
    public void m8353a(String str, C0489p c0489p) {
        c0489p.setPere((db) mo3424e());
        this.f3506a.put(C0808l.m4057o(str.toLowerCase()), c0489p);
        if (c0489p instanceof gc) {
            ((C0504y) mo3424e()).installerChamp((gc) c0489p);
        }
    }

    /* renamed from: a */
    public void m8354a(boolean z) {
        m8350a(new tb(this, z), false);
    }

    /* renamed from: b */
    public final int mo3423b() {
        if (this.f3507b == C0607n.Kw) {
            C0504y c0504y = (C0504y) mo3424e().getChampParent(C0504y.class);
            if (c0504y != null) {
                return c0504y.getConteneurManager().mo3423b();
            }
        }
        return C1031a.m7467k(this.f3507b);
    }

    /* renamed from: b */
    public void m8356b(int i) {
        m8350a(new C1277t(this, i), false);
    }

    /* renamed from: b */
    public void m8357b(int i, int i2, int i3) {
        int i4 = (i3 & 1) > 0 ? 1 : 0;
        gc e = mo3424e();
        if ((mo3424e().isFenetreCreeExt() || (e instanceof fb)) && i4 == 0) {
            mo3525a(0, 0, i, i2, 0);
        }
    }

    /* renamed from: b */
    public void m8358b(C0546j c0546j, boolean z) {
        for (C0489p c0489p : this.f3506a.values()) {
            if (!c0546j.mo2353a(c0489p)) {
                return;
            }
            if (z) {
                c0489p.parcourirObjetAPCode(c0546j, z);
            }
        }
    }

    /* renamed from: b */
    public void m8359b(String str) {
        C0489p c0489p = (C0489p) this.f3506a.remove(C0808l.m4057o(str.toLowerCase()));
        if (c0489p != null) {
            WDContexte contexte = WDAppelContexte.getContexte();
            if (contexte.m2728o() == c0489p) {
                C0671c a = contexte.m2691a(contexte.m2738z() - 1);
                if (a != null) {
                    a.m2765a(new ob(this, c0489p));
                    return;
                }
                return;
            }
            c0489p.release();
        }
    }

    /* renamed from: c */
    public Collection<C0489p> m8360c() {
        return this.f3506a.values();
    }

    /* renamed from: c */
    public void m8361c(String str) {
        m8350a(new vc(this, str), false);
    }

    /* renamed from: d */
    public void m8362d() {
        for (Object obj : this.f3506a.values().toArray()) {
            ((C0489p) obj).appelPCode(C0607n.Xu);
        }
    }

    /* renamed from: e */
    public abstract gc mo3424e();

    /* renamed from: f */
    public boolean m8364f() {
        m8358b(new mb(this), false);
        return true;
    }

    /* renamed from: g */
    public void m8365g() {
        gc e = mo3424e();
        C0509v c0509v = e.isFenetre() ? (C0509v) e : (C0509v) e.getFenetreMere();
        if (c0509v == null || !c0509v.estOuverteEtAffichee() || e.isFenetre() || (e instanceof fb) || e.getChampParent(fb.class) != null) {
            for (Object obj : this.f3506a.values().toArray()) {
                ((C0489p) obj).appelPCode(14);
            }
        }
    }

    /* renamed from: h */
    public void m8366h() {
        gc e = mo3424e();
        C0509v c0509v = e.isFenetre() ? (C0509v) e : (C0509v) e.getFenetreMere();
        if (c0509v == null || !c0509v.estOuverteEtAffichee() || (e instanceof fb) || e.getChampParent(fb.class) != null) {
            for (Object obj : this.f3506a.values().toArray()) {
                ((C0489p) obj).appelPCode(35);
            }
        }
    }

    /* renamed from: i */
    public void m8367i() {
        m8358b(new zc(this), false);
    }

    /* renamed from: j */
    public void m8368j() {
        if (this.f3506a != null) {
            for (C0489p release : this.f3506a.values()) {
                release.release();
            }
            this.f3506a.clear();
            this.f3506a = null;
        }
    }

    /* renamed from: k */
    public Iterator m8369k() {
        return this.f3506a != null ? this.f3506a.values().iterator() : null;
    }
}
