package fr.pcsoft.wdjava.core.p035c;

import java.io.PrintStream;
import java.io.PrintWriter;

/* renamed from: fr.pcsoft.wdjava.core.c.c */
public class C0662c extends Error {
    /* renamed from: z */
    private static final String[] f1646z = new String[]{C0662c.m2667z(C0662c.m2668z("1#@\u0019w2\"M\u0002l63")), C0662c.m2667z(C0662c.m2668z("1#U1O\u0007G2pp\b\u0013z\"K\u0013\u0017k9V\bG{%\u0019\u0000\u000bp$\u0019\u0002@z(\\\u0005\u0012k9V\b"))};

    /* renamed from: z */
    private static String m2667z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 102;
                    break;
                case 1:
                    i2 = 103;
                    break;
                case 2:
                    i2 = 31;
                    break;
                case 3:
                    i2 = 80;
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
    private static char[] m2668z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 57);
        }
        return toCharArray;
    }

    public String getMessage() {
        return f1646z[0];
    }

    public void printStackTrace() {
    }

    public void printStackTrace(PrintStream printStream) {
        printStream.println(f1646z[1]);
    }

    public void printStackTrace(PrintWriter printWriter) {
    }
}
