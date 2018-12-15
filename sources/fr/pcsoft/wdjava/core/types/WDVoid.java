package fr.pcsoft.wdjava.core.types;

import fr.pcsoft.wdjava.core.C0550t;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;

public class WDVoid extends C0550t {
    /* renamed from: z */
    private static final String[] f1942z = new String[]{m3263z(m3264z("\u0004R8}&")), m3263z(m3264z("\u0004H2w6rV2k4fH2a0xR8}&")), m3263z(m3264z("\u0004B8z!sM8z=tE9g=uA#{7u")), m3263z(m3264z("\u0004E1r'dP6`+hJ(},sA%p+sA"))};
    /* renamed from: a */
    private String f1943a = "";

    public WDVoid(String str) {
        this.f1943a = str;
    }

    /* renamed from: z */
    private static String m3263z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 39;
                    break;
                case 1:
                    i2 = 4;
                    break;
                case 2:
                    i2 = 119;
                    break;
                case 3:
                    i2 = 52;
                    break;
                default:
                    i2 = 98;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m3264z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 98);
        }
        return toCharArray;
    }

    public String getNomType() {
        return C0745b.m3220a(f1942z[0], new String[0]);
    }

    public WDObjet getRefProxy() {
        if (this.f1943a == null || this.f1943a.equals("")) {
            WDErreurManager.m2883a(C0745b.m3222b(f1942z[1], new String[0]));
        } else {
            WDErreurManager.m2883a(C0745b.m3222b(f1942z[2], this.f1943a));
        }
        return null;
    }

    public int getTypeVar() {
        return 0;
    }

    public boolean isVoid() {
        return true;
    }

    public void release() {
        this.f1943a = null;
    }

    public void setValeur(WDObjet wDObjet) {
        WDErreurManager.m2883a(C0745b.m3222b(f1942z[3], new String[0]));
    }
}
