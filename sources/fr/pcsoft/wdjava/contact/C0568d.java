package fr.pcsoft.wdjava.contact;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.parcours.p039a.C0567c;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.collection.C0582d;

/* renamed from: fr.pcsoft.wdjava.contact.d */
class C0568d extends C0567c {
    /* renamed from: z */
    private static final String f1310z = C0568d.m1871z(C0568d.m1872z("S\r\u000e$51\u0019\u00033# \u001a\u001d53%\t\u001c)5>\r\u000e:54\u001e"));
    final C0603n this$0;

    C0568d(C0603n c0603n, C0582d c0582d, WDObjet wDObjet, WDObjet wDObjet2, WDObjet wDObjet3, boolean z, boolean z2) {
        this.this$0 = c0603n;
        super(c0582d, wDObjet, wDObjet2, wDObjet3, z, z2);
    }

    /* renamed from: z */
    private static String m1871z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 112;
                    break;
                case 1:
                    i2 = 91;
                    break;
                case 2:
                    i2 = 79;
                    break;
                case 3:
                    i2 = 118;
                    break;
                default:
                    i2 = C0607n.Hn;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1872z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ C0607n.Hn);
        }
        return toCharArray;
    }

    /* renamed from: d */
    protected void mo2449d() {
        super.mo2449d();
        if (this.h.getTypeVarExt() != this.this$0.mo2487d()) {
            WDErreurManager.m2883a(C0745b.m3222b(f1310z, this.h.getNomType(), C0725i.m3045b(this.this$0.mo2487d())));
        }
    }
}
