package fr.pcsoft.wdjava.core.types.collection.tableau;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.debug.C0691a;

/* renamed from: fr.pcsoft.wdjava.core.types.collection.tableau.m */
public final class C0768m extends C0767l {
    /* renamed from: z */
    private static final String f2004z = C0768m.m3543z(C0768m.m3544z("@I\u001f.ä`Å\u0001kcx_Ljx,X\rlaiM\u0019.ci\f\u001facx\f\u001co~,H\t}-o@\r}~i_Lax,H\t}-He\"A#"));
    /* renamed from: c */
    C0761b f2005c;
    final C0759o this$0;

    public C0768m(C0759o c0759o, String str) {
        this.this$0 = c0759o;
        super(c0759o);
        C0691a.m2860a(c0759o.f1984m != null, f2004z);
        this.f2005c = c0759o.m3421a(c0759o.f1984m.getClasseWD(), str);
    }

    /* renamed from: z */
    private static String m3543z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 12;
                    break;
                case 1:
                    i2 = 44;
                    break;
                case 2:
                    i2 = 108;
                    break;
                case 3:
                    i2 = 14;
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
    private static char[] m3544z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 13);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public WDObjet mo2672a() {
        return this.f2005c.mo2671a(super.mo2672a());
    }

    public /* bridge */ /* synthetic */ Object next() {
        return mo2672a();
    }
}
