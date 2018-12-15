package fr.pcsoft.wdjava.core.poo.p038a;

import android.database.Cursor;
import fr.pcsoft.wdjava.core.C0486m;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.parcours.IWDParcours;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.core.types.collection.C0583e;
import fr.pcsoft.wdjava.core.utils.C0811o;
import fr.pcsoft.wdjava.core.utils.C0817u;
import fr.pcsoft.wdjava.core.utils.xb;
import fr.pcsoft.wdjava.database.p048a.C0830a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: fr.pcsoft.wdjava.core.poo.a.d */
public abstract class C0584d<T extends C0561b, E extends C0569c> extends C0583e {
    /* renamed from: z */
    private static final String[] f1365z = new String[]{C0584d.m2042z(C0584d.m2043z("G993&'5(#.&<26:;99!.(932")), C0584d.m2042z(C0584d.m2043z("G689,09890*?9(+-#'8")), C0584d.m2042z(C0584d.m2043z("G5%%0->3>,!/$8:7/2;*)59#")), C0584d.m2042z(C0584d.m2043z("G5%%0->3>,!/$8:7/2;*)59#0V"))};
    /* renamed from: a */
    protected ArrayList<E> f1366a = null;
    /* renamed from: b */
    private T f1367b = null;

    protected C0584d(T t) {
        this.f1367b = t;
        m2041b(mo2484a((C0561b) t));
    }

    /* renamed from: b */
    private final void m2041b(Cursor cursor) {
        if (cursor != null) {
            try {
                this.f1366a = new ArrayList(cursor.getCount());
                cursor.moveToFirst();
                while (!cursor.isAfterLast()) {
                    this.f1366a.add(mo2486a(cursor));
                    cursor.moveToNext();
                }
            } finally {
                C0830a.m4258a(cursor);
            }
        }
    }

    /* renamed from: z */
    private static String m2042z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 100;
                    break;
                case 1:
                    i2 = 112;
                    break;
                case 2:
                    i2 = 119;
                    break;
                case 3:
                    i2 = 119;
                    break;
                default:
                    i2 = 111;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2043z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 111);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public int mo2467a(int i, WDObjet[] wDObjetArr) {
        WDErreurManager.m2883a(C0745b.m3222b(f1365z[1], getNomType()));
        return 0;
    }

    /* renamed from: a */
    public int mo2468a(C0486m c0486m, int i, int i2, WDObjet[] wDObjetArr) {
        WDErreurManager.m2883a(C0745b.m3222b(f1365z[1], getNomType()));
        return 0;
    }

    /* renamed from: a */
    protected abstract Cursor mo2484a(T t);

    /* renamed from: a */
    public WDObjet mo2469a(long j) {
        return (j < 0 || j >= mo2483h()) ? null : (WDObjet) this.f1366a.get((int) j);
    }

    /* renamed from: a */
    public WDObjet mo2470a(String str, boolean z) {
        return get(C0725i.m3064d(str));
    }

    /* renamed from: a */
    public IWDParcours mo2471a(WDObjet wDObjet, WDObjet wDObjet2, WDObjet wDObjet3, WDObjet wDObjet4, boolean z, boolean z2) {
        return new C0730a(this, this, wDObjet, wDObjet2, wDObjet3, z, z2);
    }

    /* renamed from: a */
    protected abstract E mo2486a(Cursor cursor);

    /* renamed from: a */
    public void mo2472a(int i, int i2) {
        try {
            xb.m4186a(this.f1366a, C0725i.m3011a(i), C0725i.m3011a(i2));
        } catch (C0811o e) {
            WDErreurManager.m2883a(C0745b.m3222b(f1365z[0], "1", String.valueOf(mo2483h()), String.valueOf(e.m4106a())));
        }
    }

    /* renamed from: a */
    public void mo2473a(int i, C0486m c0486m) {
        WDErreurManager.m2883a(C0745b.m3222b(f1365z[1], getNomType()));
    }

    /* renamed from: a */
    public void mo2474a(WDObjet wDObjet, WDObjet wDObjet2) {
        C0569c c0569c = (C0569c) wDObjet.checkType(mo2482g());
        if (c0569c != null) {
            if (this.f1366a == null) {
                this.f1366a = new ArrayList();
            }
            this.f1366a.add((int) Math.max(0, Math.min((long) (wDObjet2.getInt() - 1), mo2483h())), (C0569c) c0569c.getClone());
            return;
        }
        WDErreurManager.m2883a(C0745b.m3222b(f1365z[1], wDObjet.getNomType()));
    }

    /* renamed from: b */
    public int mo2475b(WDObjet wDObjet) {
        mo2474a(wDObjet, new WDEntier4(mo2483h() + 1));
        return 0;
    }

    /* renamed from: b */
    public void mo2476b() {
        Collections.reverse(this.f1366a);
    }

    /* renamed from: b */
    public void mo2477b(int i, int i2) {
        try {
            xb.m4188b(this.f1366a, C0725i.m3011a(i), C0725i.m3011a(i2));
        } catch (C0811o e) {
            WDErreurManager.m2883a(C0745b.m3222b(f1365z[0], "1", String.valueOf(mo2483h()), String.valueOf(e.m4106a())));
        }
    }

    /* renamed from: c */
    public int mo2478c(WDObjet wDObjet) {
        int i = wDObjet.getInt() - 1;
        long h = mo2483h();
        if (i < 0) {
            WDErreurManager.m2883a(C0745b.m3222b(f1365z[2], new String[0]));
        }
        if (i < 0 && ((long) i) > h) {
            WDErreurManager.m2883a(C0745b.m3222b(f1365z[3], String.valueOf(i + 1), String.valueOf(h)));
        }
        C0569c c0569c = (C0569c) this.f1366a.remove(i);
        if (c0569c != null && c0569c.m1879b() >= 0) {
            this.f1367b.m1805b().add(c0569c.mo2461c().build());
        }
        return 1;
    }

    /* renamed from: c */
    public void mo2479c() {
        Collections.shuffle(this.f1366a, C0817u.f2167a);
    }

    /* renamed from: e */
    public void mo2480e() {
        if (this.f1366a != null) {
            for (int size = this.f1366a.size() - 1; size >= 0; size--) {
                C0569c c0569c = (C0569c) this.f1366a.remove(size);
                if (c0569c != null && c0569c.m1879b() >= 0) {
                    this.f1367b.m1805b().add(c0569c.mo2461c().build());
                }
            }
            this.f1366a = null;
        }
    }

    /* renamed from: f */
    public boolean mo2481f() {
        return true;
    }

    /* renamed from: g */
    public abstract Class<E> mo2482g();

    /* renamed from: h */
    public long mo2483h() {
        return this.f1366a != null ? (long) this.f1366a.size() : 0;
    }

    /* renamed from: i */
    public void m2063i() {
        if (this.f1366a != null) {
            this.f1366a.clear();
        }
    }

    /* renamed from: j */
    public final Iterator<E> m2064j() {
        return this.f1366a != null ? this.f1366a.iterator() : null;
    }

    public void razVariable() {
    }

    public void release() {
        if (this.f1366a != null) {
            Iterator it = this.f1366a.iterator();
            while (it.hasNext()) {
                ((C0569c) it.next()).release();
            }
            this.f1366a.clear();
            this.f1366a = null;
        }
    }
}
