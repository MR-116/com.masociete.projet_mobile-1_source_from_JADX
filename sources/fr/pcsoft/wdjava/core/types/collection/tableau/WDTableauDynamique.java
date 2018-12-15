package fr.pcsoft.wdjava.core.types.collection.tableau;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.allocation.IWDAllocateur;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;

public class WDTableauDynamique extends WDTableauSimple {
    /* renamed from: z */
    private static final String[] f1988z = new String[]{m3495z(m3496z("^%_;C<1R,U3<P6C3:J K1:M,O")), m3495z(m3496z("^'_+F82K6F41[;O"))};
    /* renamed from: r */
    private boolean f1989r = false;

    /* renamed from: z */
    private static String m3495z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 125;
                    break;
                case 1:
                    i2 = 115;
                    break;
                case 2:
                    i2 = 30;
                    break;
                case 3:
                    i2 = 105;
                    break;
                default:
                    i2 = 10;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m3496z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 10);
        }
        return toCharArray;
    }

    /* renamed from: a */
    protected void mo2669a(int i, int[] iArr, int i2, int i3, IWDAllocateur iWDAllocateur) {
        super.mo2669a(i, iArr, i2, i3, iWDAllocateur);
        this.f1989r = false;
    }

    /* renamed from: a */
    public synchronized void mo2654a(C0758k c0758k) {
        c0758k = (C0759o) c0758k;
        if (this.o == 0) {
            this.o = c0758k.mo2487d();
            this.m = c0758k.mo2645q();
        }
        if (this.o == c0758k.mo2487d()) {
            mo2669a(c0758k.mo2640l(), c0758k.m3456v(), 0, this.o, this.m);
        }
        super.mo2654a(c0758k);
    }

    public WDObjet get(int i) {
        WDObjet wDObjet = null;
        if (this.f1989r) {
            WDErreurManager.m2883a(C0745b.m3222b(f1988z[1], new String[0]));
        } else if (mo2481f()) {
            wDObjet = super.get(i);
            if (wDObjet == null) {
                this.f1989r = true;
                WDErreurManager.m2883a(C0745b.m3222b(f1988z[1], new String[0]));
            }
        } else {
            WDErreurManager.m2883a(C0745b.m3222b(f1988z[0], new String[0]));
        }
        return wDObjet;
    }

    public WDObjet getValeur() {
        if (mo2481f()) {
            return super.getValeur();
        }
        WDErreurManager.m2883a(C0745b.m3222b(f1988z[0], new String[0]));
        return null;
    }

    /* renamed from: j */
    public boolean mo2667j() {
        return mo2481f();
    }

    public void liberer() {
        if (mo2481f()) {
            mo2668s();
        }
        this.l &= -2;
        this.f1989r = true;
    }
}
