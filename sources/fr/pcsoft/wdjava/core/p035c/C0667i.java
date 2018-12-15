package fr.pcsoft.wdjava.core.p035c;

import fr.pcsoft.wdjava.ui.C0489p;
import java.io.PrintStream;
import java.io.PrintWriter;

/* renamed from: fr.pcsoft.wdjava.core.c.i */
public class C0667i extends Error {
    /* renamed from: z */
    private static final String[] f1652z = new String[]{C0667i.m2676z(C0667i.m2677z(":#7E'9\":^<=3")), C0667i.m2676z(C0667i.m2677z(":#\"m\u001f\fGE, \u0003\u0013\r~\u001b\u0018\u0017\u001ce\u0006\u0003G\fyI\u000b\u000b\u0007xI\t@\rt\f\u000e\u0012\u001ce\u0006\u0003"))};
    /* renamed from: a */
    private C0489p f1653a = null;

    public C0667i(C0489p c0489p) {
        this.f1653a = c0489p;
    }

    /* renamed from: z */
    private static String m2676z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 109;
                    break;
                case 1:
                    i2 = 103;
                    break;
                case 2:
                    i2 = 104;
                    break;
                case 3:
                    i2 = 12;
                    break;
                default:
                    i2 = 105;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2677z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 105);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public final C0489p m2678a() {
        return this.f1653a;
    }

    public String getMessage() {
        return f1652z[0];
    }

    public void printStackTrace() {
    }

    public void printStackTrace(PrintStream printStream) {
        printStream.println(f1652z[1]);
    }

    public void printStackTrace(PrintWriter printWriter) {
    }
}
