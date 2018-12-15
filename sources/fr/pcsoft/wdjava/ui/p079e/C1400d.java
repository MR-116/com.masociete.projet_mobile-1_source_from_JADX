package fr.pcsoft.wdjava.ui.p079e;

import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.ui.champs.gc;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: fr.pcsoft.wdjava.ui.e.d */
public class C1400d {
    /* renamed from: a */
    public static final HashMap<Integer, WeakReference<C1399b>> f4141a = new HashMap(10);

    /* renamed from: a */
    public static final float m9963a(int i, gc gcVar) {
        float round = (float) Math.round(((float) i) * 1.3333334f);
        return ((gcVar == null || gcVar.getDisplayUnitWL() != 1) && (gcVar != null || WDProjet.getInstance().isUniteAffichageLogique())) ? round : round * 2.0f;
    }

    /* renamed from: a */
    public static final int m9964a(float f, gc gcVar) {
        float round = (float) Math.round(0.75f * f);
        if ((gcVar != null && gcVar.getDisplayUnitWL() == 1) || (gcVar == null && !WDProjet.getInstance().isUniteAffichageLogique())) {
            round /= 2.0f;
        }
        return (int) round;
    }

    /* renamed from: a */
    public static final C1399b m9965a(String str, float f, int i) {
        return C1400d.m9966a(str, Math.round(f), i);
    }

    /* renamed from: a */
    private static final C1399b m9966a(String str, int i, int i2) {
        int hashCode = (str.hashCode() ^ (i << 8)) ^ i2;
        WeakReference weakReference = (WeakReference) f4141a.get(Integer.valueOf(hashCode));
        if (weakReference != null) {
            C1399b c1399b = (C1399b) weakReference.get();
            if (c1399b != null) {
                return c1399b;
            }
        }
        C1399b c1399b2 = new C1399b(str, i2, i);
        f4141a.put(Integer.valueOf(hashCode), new WeakReference(c1399b2));
        if (f4141a.size() % 5 == 0) {
            Iterator it = f4141a.keySet().iterator();
            while (it.hasNext()) {
                if (((WeakReference) f4141a.get(Integer.valueOf(((Integer) it.next()).intValue()))).get() == null) {
                    it.remove();
                }
            }
        }
        return c1399b2;
    }

    /* renamed from: a */
    public static final C1397c m9967a(String str, float f, int i, int i2) {
        boolean z = true;
        if (i2 == 0) {
            return null;
        }
        if (i2 == 63) {
            return C1400d.m9965a(str, f, i);
        }
        double d = (double) f;
        boolean z2 = (i & 1) > 0;
        boolean z3 = (i & 2) > 0;
        boolean z4 = (i & 4) > 0;
        if ((i & 8) <= 0) {
            z = false;
        }
        return new C1398a(str, d, z2, z3, z4, z, i2);
    }
}
