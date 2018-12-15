package fr.pcsoft.wdjava.ui.champs.p034b;

import android.graphics.Point;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.p032m.C0938m;
import fr.pcsoft.wdjava.p061q.p062a.C1014a;
import fr.pcsoft.wdjava.ui.C0489p;
import fr.pcsoft.wdjava.ui.utils.C1511l;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: fr.pcsoft.wdjava.ui.champs.b.c */
public final class C1125c extends ArrayList<C1124a> {
    /* renamed from: z */
    private static final String f3483z = C1125c.m8246z(C1125c.m8247z("\u000bcPJ-kgZJ-|}^A5in^K&"));
    /* renamed from: a */
    private C0513b f3484a = null;
    /* renamed from: b */
    private int f3485b = -1;
    /* renamed from: c */
    private int f3486c = -1;

    public C1125c(C0513b c0513b) {
        this.f3484a = c0513b;
    }

    /* renamed from: a */
    private final int m8244a() {
        int i = 1;
        int size = size();
        if (size == 0) {
            return -1;
        }
        Point a;
        int agencementComparisonFlags = this.f3484a.getAgencementComparisonFlags();
        if ((agencementComparisonFlags & 2) == 2) {
            a = C1014a.m7327b().mo3295a(true);
        } else {
            Point point = new Point();
            this.f3484a.getDisplaySize(point);
            a = point;
        }
        C1124a c1124a = (C1124a) get(0);
        while (i < size) {
            c1124a = c1124a.m8240a((C1124a) get(i), a.x, a.y, agencementComparisonFlags);
            i++;
        }
        return indexOf(c1124a);
    }

    /* renamed from: a */
    public static final C1125c m8245a(C0489p c0489p) {
        while (c0489p != null) {
            Object obj = (C0513b) c0489p.getObjOrParentOfType(C0513b.class);
            if (obj == null) {
                break;
            }
            C1125c agencementManager = obj.getAgencementManager();
            if (agencementManager != null) {
                return agencementManager;
            }
            c0489p = c0489p == obj ? (C0489p) c0489p.getPere() : (C0489p) obj;
        }
        return null;
    }

    /* renamed from: z */
    private static String m8246z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 40;
                    break;
                case 1:
                    i2 = 34;
                    break;
                case 2:
                    i2 = 23;
                    break;
                case 3:
                    i2 = 15;
                    break;
                default:
                    i2 = 99;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m8247z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 99);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public final void m8248a(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int d = C1511l.m10532d((float) i2, this.f3484a.getDisplayUnit());
        int d2 = C1511l.m10532d((float) i3, this.f3484a.getDisplayUnit());
        int c = C1511l.m10528c();
        add(new C1124a(i, d, d2, i4 > 0 ? (int) Math.floor((((double) c) / ((double) i6)) * ((double) i4)) : i4, i5 > 0 ? (int) Math.floor(((double) i5) * (((double) c) / ((double) i6))) : i5, i7));
    }

    /* renamed from: a */
    public final boolean m8249a(int i) {
        if (i < 0 || i >= size()) {
            WDErreurManager.m2883a(C0745b.m3222b(f3483z, String.valueOf(C0725i.m3069e(this.f3486c)), this.f3484a.getName()));
        }
        if (this.f3486c == i) {
            return false;
        }
        C1124a c1124a = this.f3486c >= 0 ? (C1124a) get(this.f3486c) : null;
        this.f3486c = i;
        this.f3484a.onAgencementChanged(c1124a, (C1124a) get(this.f3486c), this.f3486c);
        return true;
    }

    /* renamed from: b */
    public final int m8250b() {
        return this.f3486c == -1 ? this.f3485b : this.f3486c;
    }

    /* renamed from: b */
    public final void m8251b(int i) {
        this.f3485b = i;
    }

    /* renamed from: c */
    public final void m8252c() {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((C1124a) it.next()).m8241a();
        }
        clear();
    }

    /* renamed from: d */
    public final void m8253d() {
        boolean z;
        int a = m8244a();
        if (this.f3486c < 0) {
            z = true;
            if (a == this.f3485b) {
                this.f3486c = a;
            } else {
                m8249a(a);
            }
        } else {
            z = m8249a(a);
        }
        if (z) {
            C0938m.m6814b(new C1126d(this));
        }
    }

    /* renamed from: e */
    public final C1124a m8254e() {
        return this.f3485b >= 0 ? (C1124a) get(this.f3485b) : null;
    }
}
