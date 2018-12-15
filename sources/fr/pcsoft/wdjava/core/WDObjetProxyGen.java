package fr.pcsoft.wdjava.core;

import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;

public class WDObjetProxyGen extends C0550t {
    /* renamed from: z */
    private static final String f1483z = m2267z(m2268z("OrK|S-fFkE\"kDq^)gFoH)a"));
    /* renamed from: a */
    private WDObjet f1484a;

    public WDObjetProxyGen(WDObjet wDObjet) {
        this.f1484a = wDObjet;
    }

    /* renamed from: z */
    private static String m2267z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 108;
                    break;
                case 1:
                    i2 = 36;
                    break;
                case 2:
                    i2 = 10;
                    break;
                case 3:
                    i2 = 46;
                    break;
                default:
                    i2 = 26;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2268z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 26);
        }
        return toCharArray;
    }

    public WDObjet getRefProxy() {
        if (this.f1484a == null) {
            WDErreurManager.m2883a(C0745b.m3222b(f1483z, new String[0]));
        }
        return this.f1484a;
    }

    public void release() {
    }

    public final void setRefProxy(WDObjet wDObjet) {
        this.f1484a = wDObjet;
    }
}
