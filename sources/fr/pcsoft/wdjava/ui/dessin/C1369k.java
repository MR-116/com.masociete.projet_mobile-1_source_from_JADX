package fr.pcsoft.wdjava.ui.dessin;

import fr.pcsoft.wdjava.core.C0486m;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.parcours.IWDParcours;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.collection.C0583e;

/* renamed from: fr.pcsoft.wdjava.ui.dessin.k */
class C1369k extends C0583e {
    /* renamed from: z */
    private static final String[] f4060z = new String[]{C1369k.m9800z(C1369k.m9801z("3Ra3\u0006D]a3\u001a^[`\"\u0001YG~2")), C1369k.m9800z(C1369k.m9801z("3]`9\fSQq>\n\\[`3\u0000O]`+\u0004\\]j8\u001a\"")), C1369k.m9800z(C1369k.m9801z("3]`9\fSQq1\fWZk\"\f^Bo1\fTQ"))};
    /* renamed from: a */
    private C1370l f4061a = null;
    final C1334i this$0;

    C1369k(C1334i c1334i) {
        this.this$0 = c1334i;
    }

    /* renamed from: z */
    private static String m9800z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 16;
                    break;
                case 1:
                    i2 = 20;
                    break;
                case 2:
                    i2 = 46;
                    break;
                case 3:
                    i2 = 125;
                    break;
                default:
                    i2 = 69;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m9801z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 69);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public int mo2467a(int i, WDObjet[] wDObjetArr) {
        WDErreurManager.m2883a(C0745b.m3222b(f4060z[0], getNomType()));
        return 0;
    }

    /* renamed from: a */
    public int mo2468a(C0486m c0486m, int i, int i2, WDObjet[] wDObjetArr) {
        WDErreurManager.m2883a(C0745b.m3222b(f4060z[0], getNomType()));
        return 0;
    }

    /* renamed from: a */
    public int mo2464a(WDObjet... wDObjetArr) {
        WDErreurManager.m2883a(C0745b.m3222b(f4060z[0], getNomType()));
        return 0;
    }

    /* renamed from: a */
    public WDObjet mo2485a() {
        return new C1368j(this.this$0);
    }

    /* renamed from: a */
    public WDObjet mo2469a(long j) {
        int access$000 = this.this$0.m9527m();
        int access$100 = this.this$0.m9534u();
        return j >= ((long) (access$100 * access$000)) ? null : m9817c((int) (j / ((long) access$100)), (int) (j % ((long) access$000)));
    }

    /* renamed from: a */
    public WDObjet mo2470a(String str, boolean z) {
        return mo2469a((long) C0725i.m3064d(str));
    }

    /* renamed from: a */
    public IWDParcours mo2471a(WDObjet wDObjet, WDObjet wDObjet2, WDObjet wDObjet3, WDObjet wDObjet4, boolean z, boolean z2) {
        return new C1366f(this, this, wDObjet, wDObjet2, wDObjet3, z, z2);
    }

    /* renamed from: a */
    public void mo2472a(int i, int i2) {
        WDErreurManager.m2883a(C0745b.m3222b(f4060z[0], getNomType()));
    }

    /* renamed from: a */
    public void mo2473a(int i, C0486m c0486m) {
        WDErreurManager.m2883a(C0745b.m3222b(f4060z[0], getNomType()));
    }

    /* renamed from: a */
    public void mo2474a(WDObjet wDObjet, WDObjet wDObjet2) {
        WDErreurManager.m2883a(C0745b.m3222b(f4060z[0], getNomType()));
    }

    /* renamed from: a */
    public void mo2466a(WDObjet wDObjet, WDObjet... wDObjetArr) {
        WDErreurManager.m2883a(C0745b.m3222b(f4060z[0], getNomType()));
    }

    /* renamed from: b */
    public int mo2475b(WDObjet wDObjet) {
        WDErreurManager.m2883a(C0745b.m3222b(f4060z[0], getNomType()));
        return 0;
    }

    /* renamed from: b */
    public void mo2476b() {
        WDErreurManager.m2883a(C0745b.m3222b(f4060z[0], getNomType()));
    }

    /* renamed from: b */
    public void mo2477b(int i, int i2) {
        WDErreurManager.m2883a(C0745b.m3222b(f4060z[0], getNomType()));
    }

    /* renamed from: c */
    public int mo2478c(WDObjet wDObjet) {
        WDErreurManager.m2883a(C0745b.m3222b(f4060z[0], getNomType()));
        return 0;
    }

    /* renamed from: c */
    public C1368j m9817c(int i, int i2) {
        int max = Math.max(0, this.this$0.m9527m());
        int max2 = Math.max(0, this.this$0.m9534u());
        if (i < 0 || i >= max) {
            WDErreurManager.m2883a(C0745b.m3222b(f4060z[2], String.valueOf(i + 1), String.valueOf(max)));
        }
        if (i2 < 0 || i2 >= max2) {
            WDErreurManager.m2883a(C0745b.m3222b(f4060z[1], String.valueOf(i2 + 1), String.valueOf(max2)));
        }
        return new C1368j(this.this$0, i, i2);
    }

    /* renamed from: c */
    public void mo2479c() {
        WDErreurManager.m2883a(C0745b.m3222b(f4060z[0], getNomType()));
    }

    /* renamed from: d */
    public int mo2487d() {
        return C0607n.dx;
    }

    /* renamed from: e */
    public void mo2480e() {
        WDErreurManager.m2883a(C0745b.m3222b(f4060z[0], getNomType()));
    }

    /* renamed from: f */
    public boolean mo2481f() {
        return true;
    }

    /* renamed from: g */
    public Class mo2482g() {
        return WDCouleurWL.class;
    }

    public WDObjet get(int i) {
        if (this.f4061a == null) {
            this.f4061a = new C1370l(this);
        }
        this.f4061a.f4063a = i - 1;
        return this.f4061a;
    }

    /* renamed from: h */
    public long mo2483h() {
        return (long) (Math.max(0, this.this$0.m9527m()) * Math.max(0, this.this$0.m9534u()));
    }

    public void razVariable() {
    }

    public void release() {
    }
}
