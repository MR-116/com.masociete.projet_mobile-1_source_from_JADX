package fr.pcsoft.wdjava.ui.p065b.p067a;

import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.utils.ab;

/* renamed from: fr.pcsoft.wdjava.ui.b.a.rb */
class rb extends mb {
    /* renamed from: z */
    private static final String f3215z = rb.m7782z(rb.m7783z("\u0014\nsn\u001f7\u000bs<\u0018:\u0010'o\u0003%\u000ehn\u0002¼^=<"));
    /* renamed from: f */
    ab f3216f = new ab(8);

    rb() {
    }

    /* renamed from: z */
    private static String m7782z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 85;
                    break;
                case 1:
                    i2 = 126;
                    break;
                case 2:
                    i2 = 7;
                    break;
                case 3:
                    i2 = 28;
                    break;
                default:
                    i2 = 118;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7783z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 118);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public void mo3327a() {
        super.mo3327a();
        this.f3216f = null;
    }

    /* renamed from: a */
    public void mo3339a(C1068g c1068g, float f) throws C1066d {
        try {
            if (c1068g == C1068g.points) {
                this.f3216f.m3827a(f);
            } else {
                C0691a.m2856a(f3215z + c1068g.name());
            }
        } catch (C1066d e) {
            throw e;
        }
    }
}
