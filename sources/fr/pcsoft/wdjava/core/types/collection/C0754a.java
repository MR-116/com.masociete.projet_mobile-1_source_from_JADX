package fr.pcsoft.wdjava.core.types.collection;

import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.parcours.p039a.C0567c;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;

/* renamed from: fr.pcsoft.wdjava.core.types.collection.a */
class C0754a extends C0567c {
    /* renamed from: z */
    private static final String f1965z = C0754a.m3375z(C0754a.m3376z(".l%y\u0018Lx(n\u000e]{6h\u001eXh7t\u0018Cl%g\u0018I"));
    final C0750f this$0;

    C0754a(C0750f c0750f, C0582d c0582d, WDObjet wDObjet, WDObjet wDObjet2, WDObjet wDObjet3, boolean z, boolean z2) {
        this.this$0 = c0750f;
        super(c0582d, wDObjet, wDObjet2, wDObjet3, z, z2);
    }

    /* renamed from: z */
    private static String m3375z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 13;
                    break;
                case 1:
                    i2 = 58;
                    break;
                case 2:
                    i2 = 100;
                    break;
                case 3:
                    i2 = 43;
                    break;
                default:
                    i2 = 81;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m3376z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 81);
        }
        return toCharArray;
    }

    /* renamed from: d */
    protected void mo2449d() {
        super.mo2449d();
        if (this.h.checkType(this.this$0.mo2482g()) == null) {
            WDErreurManager.m2883a(C0745b.m3222b(f1965z, this.h.getNomType(), C0725i.m3045b(this.this$0.mo2487d())));
        }
    }
}
