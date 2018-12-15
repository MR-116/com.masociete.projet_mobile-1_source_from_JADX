package fr.pcsoft.wdjava.ui.dessin;

import fr.pcsoft.wdjava.core.C0550t;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;

/* renamed from: fr.pcsoft.wdjava.ui.dessin.l */
class C1370l extends C0550t {
    /* renamed from: z */
    private static final String f4062z = C1370l.m9824z(C1370l.m9825z("M#LPR/%]G^15QW^1#RG@+(J"));
    /* renamed from: a */
    int f4063a = 0;
    final C1369k this$1;

    C1370l(C1369k c1369k) {
        this.this$1 = c1369k;
    }

    /* renamed from: z */
    private static String m9824z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 110;
                    break;
                case 1:
                    i2 = 102;
                    break;
                case 2:
                    i2 = 30;
                    break;
                case 3:
                    i2 = 2;
                    break;
                default:
                    i2 = 13;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m9825z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 13);
        }
        return toCharArray;
    }

    public WDObjet get(int i) {
        return this.this$1.m9817c(this.f4063a, i - 1);
    }

    public WDObjet getRefProxy() {
        WDErreurManager.m2883a(C0745b.m3222b(f4062z, new String[0]));
        return null;
    }

    public void release() {
    }
}
