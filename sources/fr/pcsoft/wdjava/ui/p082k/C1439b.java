package fr.pcsoft.wdjava.ui.p082k;

import fr.pcsoft.wdjava.ui.champs.fenetre.C0509v;
import fr.pcsoft.wdjava.ui.champs.gc;

/* renamed from: fr.pcsoft.wdjava.ui.k.b */
public class C1439b extends C1438a {
    /* renamed from: c */
    protected static C1439b f4269c = null;

    private C1439b() {
    }

    /* renamed from: d */
    public static final C1439b m10105d() {
        if (f4269c == null) {
            f4269c = new C1439b();
        }
        return f4269c;
    }

    /* renamed from: c */
    public boolean m10106c() {
        if (this.a) {
            C0509v a = m10101a();
            if (a != null) {
                gc champNavigablePrecedent = a.getChampNavigablePrecedent();
                if (champNavigablePrecedent != null) {
                    champNavigablePrecedent.prendreFocus();
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: e */
    public boolean m10107e() {
        if (this.a) {
            C0509v a = m10101a();
            if (a != null) {
                gc champNavigableSuivant = a.getChampNavigableSuivant();
                if (champNavigableSuivant != null) {
                    champNavigableSuivant.prendreFocus();
                    return true;
                }
            }
        }
        return false;
    }
}
