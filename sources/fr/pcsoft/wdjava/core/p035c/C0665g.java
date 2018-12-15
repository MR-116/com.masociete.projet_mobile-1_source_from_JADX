package fr.pcsoft.wdjava.core.p035c;

import fr.pcsoft.wdjava.core.p042b.C0657a;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.utils.C0808l;

/* renamed from: fr.pcsoft.wdjava.core.c.g */
public class C0665g extends C0539d {
    /* renamed from: z */
    private static final String f1650z = C0665g.m2673z(C0665g.m2674z("\tBJUuc[AXodW@Jvk@FEjoKNIbx[FC"));
    /* renamed from: b */
    private C0657a f1651b;

    public C0665g(C0657a c0657a) {
        this("", c0657a);
    }

    public C0665g(String str, C0657a c0657a) {
        if (C0808l.m4053k(str)) {
            str = C0745b.m3222b(f1650z, new String[0]);
        }
        super(str);
        this.f1651b = c0657a;
    }

    /* renamed from: z */
    private static String m2673z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 42;
                    break;
                case 1:
                    i2 = 20;
                    break;
                case 2:
                    i2 = 15;
                    break;
                case 3:
                    i2 = 7;
                    break;
                default:
                    i2 = 38;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2674z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 38);
        }
        return toCharArray;
    }

    /* renamed from: k */
    public final C0657a m2675k() {
        return this.f1651b;
    }
}
