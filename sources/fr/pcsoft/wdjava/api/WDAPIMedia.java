package fr.pcsoft.wdjava.api;

import fr.pcsoft.wdjava.core.context.C0677k;
import fr.pcsoft.wdjava.core.context.WDContexte;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.p035c.C0539d;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.media.C0960v;
import fr.pcsoft.wdjava.media.C0962x;
import fr.pcsoft.wdjava.media.ib;

public class WDAPIMedia {
    /* renamed from: z */
    private static final String[] f1215z = new String[]{m1649z(m1650z("\u0014\u001fJhCr\u0006DpLt\u0006B`C")), m1649z(m1650z("\u0014\u0001Da"))};

    public static final WDBooleen magnetoAction(int i) {
        return magnetoAction(i, "");
    }

    public static final WDBooleen magnetoAction(int i, String str) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2776a(f1215z[0], 1);
        try {
            C0962x.m6935a(i, str);
            wDBooleen = new WDBooleen(true);
        } catch (C0539d e) {
            WDErreurManager.m2876a(a, e);
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static void son(String str) {
        son(str, 1);
    }

    public static void son(String str, int i) {
        boolean z = true;
        WDContexte a = C0677k.m2775a(f1215z[1]);
        try {
            C0960v c = C0960v.m6928c();
            boolean z2 = i == 0;
            if (i != 8) {
                z = false;
            }
            c.m6932a(str, z2, z);
        } catch (ib e) {
        } finally {
            a.m2735v();
        }
    }

    /* renamed from: z */
    private static String m1649z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 55;
                    break;
                case 1:
                    i2 = 82;
                    break;
                case 2:
                    i2 = 11;
                    break;
                case 3:
                    i2 = 47;
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
    private static char[] m1650z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 13);
        }
        return toCharArray;
    }
}
