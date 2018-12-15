package fr.pcsoft.wdjava.core.poo.p038a;

import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.parcours.p039a.C0567c;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.collection.C0582d;

/* renamed from: fr.pcsoft.wdjava.core.poo.a.a */
class C0730a extends C0567c {
    /* renamed from: z */
    private static final String f1859z = C0730a.m3105z(C0730a.m3106z("B=.\u0005\u000f )#\u0012\u00191*=\u0014\t49<\b\u000f/=.\u001b\u000f%."));
    final C0584d this$0;

    C0730a(C0584d c0584d, C0582d c0582d, WDObjet wDObjet, WDObjet wDObjet2, WDObjet wDObjet3, boolean z, boolean z2) {
        this.this$0 = c0584d;
        super(c0582d, wDObjet, wDObjet2, wDObjet3, z, z2);
    }

    /* renamed from: z */
    private static String m3105z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 97;
                    break;
                case 1:
                    i2 = 107;
                    break;
                case 2:
                    i2 = 111;
                    break;
                case 3:
                    i2 = 87;
                    break;
                default:
                    i2 = 70;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m3106z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 70);
        }
        return toCharArray;
    }

    /* renamed from: d */
    protected void mo2449d() {
        super.mo2449d();
        if (this.h.getTypeVarExt() != this.this$0.mo2487d()) {
            WDErreurManager.m2883a(C0745b.m3222b(f1859z, this.h.getNomType(), C0725i.m3045b(this.this$0.mo2487d())));
        }
    }
}
