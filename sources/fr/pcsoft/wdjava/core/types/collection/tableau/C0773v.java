package fr.pcsoft.wdjava.core.types.collection.tableau;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.debug.C0691a;
import java.lang.reflect.Field;

/* renamed from: fr.pcsoft.wdjava.core.types.collection.tableau.v */
class C0773v implements C0761b {
    /* renamed from: z */
    private static final String f2015z = C0773v.m3554z(C0773v.m3555z("(-@wC\u0012)RtUA$\u0017yS\u0002©T}BA!E8]\u0004-RjUA0Qj\u0010\b.Dj_\u00120U{D\b/^6"));
    final C0759o this$0;
    final Field val$membreFinal;

    C0773v(C0759o c0759o, Field field) {
        this.this$0 = c0759o;
        this.val$membreFinal = field;
    }

    /* renamed from: z */
    private static String m3554z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 97;
                    break;
                case 1:
                    i2 = 64;
                    break;
                case 2:
                    i2 = 48;
                    break;
                case 3:
                    i2 = 24;
                    break;
                default:
                    i2 = 48;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m3555z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 48);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public WDObjet mo2671a(WDObjet wDObjet) {
        try {
            return (WDObjet) this.val$membreFinal.get(wDObjet);
        } catch (Exception e) {
            C0691a.m2857a(f2015z, e);
            return null;
        }
    }
}
