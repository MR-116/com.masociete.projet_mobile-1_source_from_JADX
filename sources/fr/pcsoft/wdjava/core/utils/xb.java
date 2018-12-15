package fr.pcsoft.wdjava.core.utils;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.types.collection.C0582d;
import java.util.Collections;
import java.util.List;

public class xb {
    /* renamed from: a */
    public static final void m4186a(List list, int i, int i2) throws C0811o {
        if (i != i2) {
            if (i >= 0) {
                try {
                    if (i < list.size()) {
                        if (i2 >= 0) {
                            try {
                                if (i2 < list.size()) {
                                    list.add(i2, list.remove(i));
                                    return;
                                }
                            } catch (C0811o e) {
                                throw e;
                            }
                        }
                        throw new C0811o(i2);
                    }
                } catch (C0811o e2) {
                    throw e2;
                }
            }
            throw new C0811o(i);
        }
    }

    /* renamed from: a */
    public static final WDObjet[] m4187a(C0582d c0582d) {
        int h = (int) c0582d.mo2483h();
        WDObjet[] wDObjetArr = new WDObjet[h];
        for (int i = 0; i < h; i++) {
            wDObjetArr[i] = c0582d.mo2469a((long) i);
        }
        return wDObjetArr;
    }

    /* renamed from: b */
    public static final void m4188b(List list, int i, int i2) throws C0811o {
        if (i != i2) {
            if (i >= 0) {
                try {
                    if (i < list.size()) {
                        if (i2 >= 0) {
                            try {
                                if (i2 < list.size()) {
                                    Collections.swap(list, i, i2);
                                    return;
                                }
                            } catch (C0811o e) {
                                throw e;
                            }
                        }
                        throw new C0811o(i2);
                    }
                } catch (C0811o e2) {
                    throw e2;
                }
            }
            throw new C0811o(i);
        }
    }

    /* renamed from: b */
    public static final String[] m4189b(C0582d c0582d) {
        int h = (int) c0582d.mo2483h();
        String[] strArr = new String[h];
        for (int i = 0; i < h; i++) {
            strArr[i] = c0582d.mo2469a((long) i).getString();
        }
        return strArr;
    }
}
