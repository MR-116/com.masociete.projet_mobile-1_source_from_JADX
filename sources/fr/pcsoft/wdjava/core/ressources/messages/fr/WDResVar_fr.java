package fr.pcsoft.wdjava.core.ressources.messages.fr;

import java.util.ListResourceBundle;

public class WDResVar_fr extends ListResourceBundle {
    /* renamed from: a */
    static final Object[][] f1930a;

    static {
        Object[][] objArr = new Object[5][];
        objArr[0] = new Object[]{m3239z(m3240z("C\u0001kL(,\u001bgY5!\u0007nH")), m3239z(m3240z("%)Gd\rN\u0005Ry\u0000\u0003,C"))};
        objArr[1] = new Object[]{m3239z(m3240z("C\u0001kL(,\u001bbH24\rhL5!\rtH")), m3239z(m3240z("%)Gd\rN\u0000C~\u0015\t*Gy\u0000\t6C"))};
        objArr[2] = new Object[]{m3239z(m3240z("C\u0001kL(,\u001bcU1%\u0000oY$5\u0016")), m3239z(m3240z("%)Gd\rN\u0001^}\u0004-Rh\u0014\u0012"))};
        objArr[3] = new Object[]{m3239z(m3240z("C\u0001kL(,\u001bhO>!\u0010rL\"(\u0001")), m3239z(m3240z("%)Gd\rN\nDL\u0015\u0014%Ee\u0004"))};
        objArr[4] = new Object[]{m3239z(m3240z("C\u0001kL(,\u001bhO>$\u0001uY(.\u0005rL(2\u0001")), m3239z(m3240z("%)Gd\rN\nDI\u0004\u00130Oc\u0000\u0014%O\u0004"))};
        f1930a = objArr;
    }

    /* renamed from: z */
    private static String m3239z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 96;
                    break;
                case 1:
                    i2 = 68;
                    break;
                case 2:
                    i2 = 38;
                    break;
                case 3:
                    i2 = 13;
                    break;
                default:
                    i2 = 97;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m3240z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 97);
        }
        return toCharArray;
    }

    public Object[][] getContents() {
        return f1930a;
    }
}
