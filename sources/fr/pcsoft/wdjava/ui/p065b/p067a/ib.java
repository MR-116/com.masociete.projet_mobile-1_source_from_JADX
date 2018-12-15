package fr.pcsoft.wdjava.ui.p065b.p067a;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.debug.C0691a;
import java.util.Collections;
import java.util.List;

/* renamed from: fr.pcsoft.wdjava.ui.b.a.ib */
final class ib extends ab {
    /* renamed from: z */
    private static final String f3130z = ib.m7692z(ib.m7693z("\u0007\bz\u001d$\tzOx)\u0012.\u001cc6\fa\u001db¯\\4O"));
    /* renamed from: f */
    public float f3131f = 0.0f;

    ib() {
    }

    /* renamed from: z */
    private static String m7692z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 70;
                    break;
                case 1:
                    i2 = C0607n.Hn;
                    break;
                case 2:
                    i2 = 14;
                    break;
                case 3:
                    i2 = 111;
                    break;
                default:
                    i2 = 22;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7693z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 22);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public void mo3339a(C1068g c1068g, float f) throws C1066d {
        try {
            if (c1068g == C1068g.offset) {
                this.f3131f = f;
            } else {
                C0691a.m2856a(f3130z + c1068g.name());
            }
        } catch (C1066d e) {
            throw e;
        }
    }

    /* renamed from: a */
    public void mo3331a(C1060y c1060y) throws C1066d {
    }

    /* renamed from: d */
    public List<C1060y> mo3332d() {
        return Collections.EMPTY_LIST;
    }
}
