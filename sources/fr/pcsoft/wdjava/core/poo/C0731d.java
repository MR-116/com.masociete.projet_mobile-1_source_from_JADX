package fr.pcsoft.wdjava.core.poo;

import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.parcours.p039a.C0567c;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.collection.C0582d;

/* renamed from: fr.pcsoft.wdjava.core.poo.d */
class C0731d extends C0567c {
    /* renamed from: z */
    private static final String f1860z = C0731d.m3108z(C0731d.m3109z("\u0014A\u0018!VvU\u00156@gV\u000b0PbE\n,VyA\u0018?VsR"));
    final C0738u this$1;

    C0731d(C0738u c0738u, C0582d c0582d, WDObjet wDObjet, WDObjet wDObjet2, WDObjet wDObjet3, boolean z, boolean z2) {
        this.this$1 = c0738u;
        super(c0582d, wDObjet, wDObjet2, wDObjet3, z, z2);
    }

    /* renamed from: z */
    private static String m3108z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 55;
                    break;
                case 1:
                    i2 = 23;
                    break;
                case 2:
                    i2 = 89;
                    break;
                case 3:
                    i2 = 115;
                    break;
                default:
                    i2 = 31;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m3109z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 31);
        }
        return toCharArray;
    }

    /* renamed from: d */
    protected void mo2449d() {
        super.mo2449d();
        if (this.h.checkType(this.this$1.mo2482g()) == null) {
            WDErreurManager.m2883a(C0745b.m3222b(f1860z, this.h.getNomType(), C0725i.m3045b(this.this$1.mo2487d())));
        }
    }
}
