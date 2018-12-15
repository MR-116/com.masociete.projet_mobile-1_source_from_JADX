package fr.pcsoft.wdjava.ui.dessin;

import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.parcours.p039a.C0567c;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.collection.C0582d;

/* renamed from: fr.pcsoft.wdjava.ui.dessin.f */
class C1366f extends C0567c {
    /* renamed from: z */
    private static final String f4051z = C1366f.m9759z(C1366f.m9760z("\u001b([r2y<Ve$h?Hc4m,I2v([l2|;"));
    final C1369k this$1;

    C1366f(C1369k c1369k, C0582d c0582d, WDObjet wDObjet, WDObjet wDObjet2, WDObjet wDObjet3, boolean z, boolean z2) {
        this.this$1 = c1369k;
        super(c0582d, wDObjet, wDObjet2, wDObjet3, z, z2);
    }

    /* renamed from: z */
    private static String m9759z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 56;
                    break;
                case 1:
                    i2 = 126;
                    break;
                case 2:
                    i2 = 26;
                    break;
                case 3:
                    i2 = 32;
                    break;
                default:
                    i2 = 123;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m9760z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 123);
        }
        return toCharArray;
    }

    /* renamed from: d */
    protected void mo2449d() {
        super.mo2449d();
        if (this.h.getTypeVarExt() != this.this$1.mo2487d()) {
            WDErreurManager.m2883a(C0745b.m3222b(f4051z, this.h.getNomType(), C0725i.m3045b(this.this$1.mo2487d())));
        }
    }
}
