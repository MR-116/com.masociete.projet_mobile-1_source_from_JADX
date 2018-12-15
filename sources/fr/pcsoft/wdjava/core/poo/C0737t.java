package fr.pcsoft.wdjava.core.poo;

import fr.pcsoft.wdjava.core.C0486m;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.parcours.IWDParcours;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.C0487y;
import fr.pcsoft.wdjava.core.types.collection.C0582d;

/* renamed from: fr.pcsoft.wdjava.core.poo.t */
public abstract class C0737t extends C0487y implements C0582d {
    /* renamed from: z */
    private static final String[] f1872z = new String[]{C0737t.m3146z(C0737t.m3147z("\u000e1\bdAy>\bd]c8\tuFd$\u0017e")), C0737t.m3146z(C0737t.m3147z("\u000e2\u0015x]l4\u0004oQr$\bQr2\u000boOh9\u0013")), C0737t.m3146z(C0737t.m3147z("\u000e6\u0001lGn#\u0006~Kb9\u0018cO}8\u0014yKo;\u0002"))};
    final C0736s this$0;

    protected C0737t(C0736s c0736s) {
        this.this$0 = c0736s;
    }

    /* renamed from: z */
    private static String m3146z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 45;
                    break;
                case 1:
                    i2 = 119;
                    break;
                case 2:
                    i2 = 71;
                    break;
                case 3:
                    i2 = 42;
                    break;
                default:
                    i2 = 2;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m3147z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 2);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public int mo2467a(int i, WDObjet[] wDObjetArr) {
        WDErreurManager.m2883a(C0745b.m3222b(f1872z[0], getNomType()));
        return 0;
    }

    /* renamed from: a */
    public int mo2468a(C0486m c0486m, int i, int i2, WDObjet[] wDObjetArr) {
        WDErreurManager.m2883a(C0745b.m3222b(f1872z[0], getNomType()));
        return 0;
    }

    /* renamed from: a */
    public int mo2464a(WDObjet... wDObjetArr) {
        WDErreurManager.m2883a(C0745b.m3222b(f1872z[0], getNomType()));
        return 0;
    }

    /* renamed from: a */
    public WDObjet mo2469a(long j) {
        WDErreurManager.m2883a(C0745b.m3222b(f1872z[1], new String[0]));
        return null;
    }

    /* renamed from: a */
    public WDObjet mo2470a(String str, boolean z) {
        if (z) {
            WDErreurManager.m2883a(C0745b.m3222b(f1872z[1], new String[0]));
        }
        return null;
    }

    /* renamed from: a */
    public IWDParcours mo2471a(WDObjet wDObjet, WDObjet wDObjet2, WDObjet wDObjet3, WDObjet wDObjet4, boolean z, boolean z2) {
        return new C0732n(this, (C0736s) wDObjet.checkType(C0736s.class), wDObjet4 != null ? wDObjet4.getInt() : 0, z);
    }

    /* renamed from: a */
    public void mo2472a(int i, int i2) {
        WDErreurManager.m2883a(C0745b.m3222b(f1872z[0], getNomType()));
    }

    /* renamed from: a */
    public void mo2473a(int i, C0486m c0486m) {
        WDErreurManager.m2883a(C0745b.m3222b(f1872z[0], getNomType()));
    }

    /* renamed from: a */
    public void mo2465a(WDObjet wDObjet) {
        WDErreurManager.m2883a(C0745b.m3222b(f1872z[0], getNomType()));
    }

    /* renamed from: a */
    public void mo2474a(WDObjet wDObjet, WDObjet wDObjet2) {
        WDErreurManager.m2883a(C0745b.m3222b(f1872z[0], getNomType()));
    }

    /* renamed from: a */
    public void mo2466a(WDObjet wDObjet, WDObjet... wDObjetArr) {
        WDErreurManager.m2883a(C0745b.m3222b(f1872z[0], getNomType()));
    }

    /* renamed from: b */
    public int mo2475b(WDObjet wDObjet) {
        WDErreurManager.m2883a(C0745b.m3222b(f1872z[0], getNomType()));
        return 0;
    }

    /* renamed from: b */
    public void mo2476b() {
        WDErreurManager.m2883a(C0745b.m3222b(f1872z[0], getNomType()));
    }

    /* renamed from: b */
    public void mo2477b(int i, int i2) {
        WDErreurManager.m2883a(C0745b.m3222b(f1872z[0], getNomType()));
    }

    /* renamed from: c */
    public int mo2478c(WDObjet wDObjet) {
        WDErreurManager.m2883a(C0745b.m3222b(f1872z[0], getNomType()));
        return 0;
    }

    /* renamed from: c */
    public void mo2479c() {
        WDErreurManager.m2883a(C0745b.m3222b(f1872z[0], getNomType()));
    }

    /* renamed from: e */
    public void mo2480e() {
        WDErreurManager.m2883a(C0745b.m3222b(f1872z[0], getNomType()));
    }

    /* renamed from: f */
    public boolean mo2481f() {
        return true;
    }

    public int getTypeVar() {
        return 109;
    }

    public WDObjet getValeur() {
        return this;
    }

    /* renamed from: h */
    public long mo2483h() {
        return 0;
    }

    /* renamed from: i */
    protected abstract int m3167i();

    public boolean isEvaluable() {
        return false;
    }

    public void razVariable() {
    }

    public void release() {
    }

    public void setValeur(WDObjet wDObjet) {
        WDErreurManager.m2883a(C0745b.m3222b(f1872z[2], new String[0]));
    }
}
