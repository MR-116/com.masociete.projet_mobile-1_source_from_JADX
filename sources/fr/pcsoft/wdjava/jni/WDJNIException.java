package fr.pcsoft.wdjava.jni;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.p035c.C0539d;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import java.io.Serializable;

public class WDJNIException extends C0539d implements Serializable {
    /* renamed from: z */
    private static final String[] f2234z = new String[]{m5045z(m5046z("'8b+BK1b CJ!u0_R4e3O[1f1Y[9n=XE<u6O")), m5045z(m5046z("s\u0011\u0015L:n\u0014Q"))};

    public WDJNIException(String str) {
        super(str);
    }

    public WDJNIException(String str, String str2) {
        super(str, str2);
    }

    public WDJNIException(String str, UnsatisfiedLinkError unsatisfiedLinkError) {
        r0 = new StringBuilder().append(C0745b.m3222b(f2234z[0], str, f2234z[1])).append(unsatisfiedLinkError.getMessage()).toString() != null ? "\n" + unsatisfiedLinkError.getMessage() : new StringBuilder().append("").append(unsatisfiedLinkError.getCause()).toString() != null ? "\n" + unsatisfiedLinkError.getCause() : "";
        super(r0);
    }

    /* renamed from: z */
    private static String m5045z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 4;
                    break;
                case 1:
                    i2 = 117;
                    break;
                case 2:
                    i2 = 39;
                    break;
                case 3:
                    i2 = C0607n.bx;
                    break;
                default:
                    i2 = 10;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m5046z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 10);
        }
        return toCharArray;
    }

    /* renamed from: g */
    public boolean mo3088g() {
        return true;
    }
}
