package fr.pcsoft.wdjava.core.types.collection.tableau;

import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.parcours.p039a.C0567c;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.collection.C0582d;

/* renamed from: fr.pcsoft.wdjava.core.types.collection.tableau.d */
class C0762d extends C0567c {
    /* renamed from: z */
    private static final String[] f1994z = new String[]{C0762d.m3533z(C0762d.m3534z("\u0019elC2lalN={r}^8hsaE,xl{P8")), C0762d.m3533z(C0762d.m3534z("\u0019tS!akN)cn\\$ku{N#unaP!vokT"))};
    final C0759o this$0;

    C0762d(C0759o c0759o, C0582d c0582d, WDObjet wDObjet, WDObjet wDObjet2, WDObjet wDObjet3, boolean z, boolean z2) {
        this.this$0 = c0759o;
        super(c0582d, wDObjet, wDObjet2, wDObjet3, z, z2);
    }

    /* renamed from: z */
    private static String m3533z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 58;
                    break;
                case 1:
                    i2 = 32;
                    break;
                case 2:
                    i2 = 62;
                    break;
                case 3:
                    i2 = 17;
                    break;
                default:
                    i2 = 109;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m3534z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 109);
        }
        return toCharArray;
    }

    /* renamed from: d */
    protected void mo2449d() {
        super.mo2449d();
        if (this.this$0.mo2487d() != this.h.getTypeVar()) {
            WDErreurManager.m2883a(C0745b.m3222b(f1994z[0], C0725i.m3045b(this.this$0.mo2487d())));
        }
    }

    /* renamed from: e */
    protected void mo2450e() {
        super.mo2450e();
        if (!this.this$0.mo2481f()) {
            WDErreurManager.m2883a(C0745b.m3222b(f1994z[1], new String[0]));
        }
    }
}
