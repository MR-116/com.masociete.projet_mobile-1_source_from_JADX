package fr.pcsoft.wdjava.geo.p056a;

import fr.pcsoft.wdjava.core.application.C0535j;
import fr.pcsoft.wdjava.core.debug.C0691a;

/* renamed from: fr.pcsoft.wdjava.geo.a.a */
final class C0910a implements C0535j {
    /* renamed from: z */
    private static final String f2483z = C0910a.m6483z(C0910a.m6484z("COD3Lt\u001dR#KgSBvUg\u001dZ?[c\\B?Vh\u001dR3J&OS%JiHD5\\u\u001dR3\u0019aÔY:Ve\\Z?JgI_9W&XXv_cO[3MsOSv]c\u001dF$VlXBx"));

    C0910a() {
    }

    /* renamed from: z */
    private static String m6483z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 6;
                    break;
                case 1:
                    i2 = 61;
                    break;
                case 2:
                    i2 = 54;
                    break;
                case 3:
                    i2 = 86;
                    break;
                default:
                    i2 = 57;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m6484z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 57);
        }
        return toCharArray;
    }

    public void onChangementTitre(String str) {
    }

    public void onCharsetChanged(String str) {
    }

    public void onFermetureProjet() {
        try {
            if (C0911b.f2484c != null) {
                C0911b.f2484c.m6500c();
            }
        } catch (Exception e) {
            C0691a.m2857a(f2483z, e);
        }
    }

    public void onLowMemory() {
    }
}
