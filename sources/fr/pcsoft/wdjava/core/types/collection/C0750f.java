package fr.pcsoft.wdjava.core.types.collection;

import fr.pcsoft.wdjava.core.C0486m;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.parcours.IWDParcours;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.core.utils.C0811o;
import fr.pcsoft.wdjava.core.utils.C0817u;
import fr.pcsoft.wdjava.core.utils.xb;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: fr.pcsoft.wdjava.core.types.collection.f */
public abstract class C0750f<T extends WDObjet> extends C0583e implements Iterable<T> {
    /* renamed from: z */
    private static final String[] f1944z = new String[]{C0750f.m3267z(C0750f.m3268z("z\u0006q9[\u001a\n`)S\u001b\u0003z<G\u0006\u0006q+S\u0015\u0006{8")), C0750f.m3267z(C0750f.m3268z("z\nm/M\u0010\u0001{4Q\u001c\u0010l2G\n\u0010z1W\u0014\nq)")), C0750f.m3267z(C0750f.m3268z("z\nm/M\u0010\u0001{4Q\u001c\u0010l2G\n\u0010z1W\u0014\nq)Mk")), C0750f.m3267z(C0750f.m3268z("z\tp3Q\r\u0006p3M\u0017\u0000q\"V\u0010\u001co2"))};
    /* renamed from: a */
    public boolean f1945a;

    public C0750f() {
        this(true);
        mo2624j();
    }

    public C0750f(boolean z) {
        this.f1945a = false;
        this.f1945a = z;
    }

    /* renamed from: z */
    private static String m3267z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 89;
                    break;
                case 1:
                    i2 = 79;
                    break;
                case 2:
                    i2 = 63;
                    break;
                case 3:
                    i2 = 125;
                    break;
                default:
                    i2 = 18;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m3268z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 18);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public int mo2467a(int i, WDObjet[] wDObjetArr) {
        WDErreurManager.m2883a(C0745b.m3222b(f1944z[3], getNomType()));
        return 0;
    }

    /* renamed from: a */
    public int mo2468a(C0486m c0486m, int i, int i2, WDObjet[] wDObjetArr) {
        WDErreurManager.m2883a(C0745b.m3222b(f1944z[3], getNomType()));
        return 0;
    }

    /* renamed from: a */
    public WDObjet mo2485a() {
        return mo2623i();
    }

    /* renamed from: a */
    public T mo2469a(long j) {
        return (j < 0 || j >= mo2483h()) ? null : (WDObjet) mo2625k().get((int) j);
    }

    /* renamed from: a */
    public WDObjet mo2470a(String str, boolean z) {
        return get(C0725i.m3064d(str));
    }

    /* renamed from: a */
    public IWDParcours mo2471a(WDObjet wDObjet, WDObjet wDObjet2, WDObjet wDObjet3, WDObjet wDObjet4, boolean z, boolean z2) {
        return new C0754a(this, this, wDObjet, wDObjet2, wDObjet3, z, z2);
    }

    /* renamed from: a */
    public void mo2472a(int i, int i2) {
        try {
            xb.m4186a(mo2625k(), C0725i.m3011a(i), C0725i.m3011a(i2));
        } catch (C0811o e) {
            WDErreurManager.m2883a(C0745b.m3222b(f1944z[0], "1", String.valueOf(mo2483h()), String.valueOf(e.m4106a())));
        }
    }

    /* renamed from: a */
    public void mo2473a(int i, C0486m c0486m) {
        WDErreurManager.m2883a(C0745b.m3222b(f1944z[3], getNomType()));
    }

    /* renamed from: a */
    public void mo2474a(WDObjet wDObjet, WDObjet wDObjet2) {
        WDObjet wDObjet3 = (WDObjet) wDObjet.checkType(mo2482g());
        if (wDObjet3 != null) {
            if (mo2625k() == null) {
                mo2624j();
            }
            mo2625k().add((int) Math.max(0, Math.min((long) (wDObjet2.getInt() - 1), mo2483h())), wDObjet3.getClone());
            return;
        }
        WDErreurManager.m2883a(C0745b.m3222b(f1944z[3], wDObjet.getNomType()));
    }

    /* renamed from: b */
    public int mo2475b(WDObjet wDObjet) {
        mo2474a(wDObjet, new WDEntier4(mo2483h() + 1));
        return 0;
    }

    /* renamed from: b */
    public void mo2476b() {
        Collections.reverse(mo2625k());
    }

    /* renamed from: b */
    public void mo2477b(int i, int i2) {
        try {
            xb.m4188b(mo2625k(), C0725i.m3011a(i), C0725i.m3011a(i2));
        } catch (C0811o e) {
            WDErreurManager.m2883a(C0745b.m3222b(f1944z[0], "1", String.valueOf(mo2483h()), String.valueOf(e.m4106a())));
        }
    }

    /* renamed from: c */
    public int mo2478c(WDObjet wDObjet) {
        int i = wDObjet.getInt() - 1;
        long h = mo2483h();
        if (i < 0) {
            WDErreurManager.m2883a(C0745b.m3222b(f1944z[1], new String[0]));
        }
        if (i < 0 && ((long) i) > h) {
            WDErreurManager.m2883a(C0745b.m3222b(f1944z[2], String.valueOf(i + 1), String.valueOf(h)));
        }
        mo2625k().remove(i);
        return 1;
    }

    /* renamed from: c */
    public void mo2479c() {
        Collections.shuffle(mo2625k(), C0817u.f2167a);
    }

    /* renamed from: e */
    public void mo2480e() {
        List k = mo2625k();
        if (k != null) {
            k.clear();
        }
    }

    /* renamed from: f */
    public boolean mo2481f() {
        return true;
    }

    public WDObjet get(int i) {
        if (i < 0) {
            WDErreurManager.m2883a(C0745b.m3222b(f1944z[1], new String[0]));
        }
        long h = mo2483h();
        if (((long) i) > h) {
            if (((long) i) == 1 + h && this.f1945a) {
                mo2475b(mo2623i());
            } else {
                WDErreurManager.m2883a(C0745b.m3222b(f1944z[2], String.valueOf(i), String.valueOf(h)));
            }
        }
        return mo2469a((long) C0725i.m3011a(i));
    }

    public WDObjet getClone() {
        C0750f c0750f = (C0750f) super.getClone();
        List<WDObjet> k = mo2625k();
        if (k != null) {
            c0750f.mo2624j();
            for (WDObjet clone : k) {
                c0750f.mo2475b(clone.getClone());
            }
        }
        return c0750f;
    }

    /* renamed from: h */
    public long mo2483h() {
        return mo2625k() != null ? (long) mo2625k().size() : 0;
    }

    /* renamed from: i */
    protected abstract T mo2623i();

    public Iterator<T> iterator() {
        return mo2625k() != null ? mo2625k().iterator() : null;
    }

    /* renamed from: j */
    public abstract void mo2624j();

    /* renamed from: k */
    public abstract List<T> mo2625k();

    public void razVariable() {
    }
}
