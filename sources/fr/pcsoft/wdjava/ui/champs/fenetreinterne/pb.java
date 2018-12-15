package fr.pcsoft.wdjava.ui.champs.fenetreinterne;

import fr.pcsoft.wdjava.core.WDObjet;

public class pb {
    /* renamed from: a */
    private String f3591a;
    /* renamed from: b */
    private WDObjet[] f3592b;
    /* renamed from: c */
    private int f3593c = -1;
    /* renamed from: d */
    private WDFenetreInterne f3594d = null;

    pb(String str, WDObjet[] wDObjetArr) {
        this.f3591a = str;
        this.f3592b = wDObjetArr;
    }

    /* renamed from: a */
    public final WDFenetreInterne m8503a() {
        return this.f3594d;
    }

    /* renamed from: a */
    final void m8504a(int i) {
        this.f3593c = i;
    }

    /* renamed from: a */
    public final void m8505a(WDFenetreInterne wDFenetreInterne) {
        this.f3594d = wDFenetreInterne;
    }

    /* renamed from: b */
    public final int m8506b() {
        return this.f3593c;
    }

    /* renamed from: c */
    public final WDObjet[] m8507c() {
        if (this.f3592b == null) {
            return null;
        }
        int length = this.f3592b.length;
        Object obj = new WDObjet[length];
        System.arraycopy(this.f3592b, 0, obj, 0, length);
        return obj;
    }

    /* renamed from: d */
    public final String m8508d() {
        return this.f3591a;
    }

    /* renamed from: e */
    public void m8509e() {
        this.f3591a = null;
        this.f3592b = null;
        this.f3594d = null;
    }
}
