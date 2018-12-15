package fr.pcsoft.wdjava.net.http;

import java.nio.charset.Charset;

final class db {
    /* renamed from: a */
    public static final String f2783a = m7123z(m7124z("\u001b\u000eaA"));
    /* renamed from: b */
    public static final String f2784b = m7123z(m7124z("`\u0003fA-M\u0018%q!P\u001cgF!W\u0005g["));
    /* renamed from: c */
    public static final String f2785c = m7123z(m7124z("`\u0003fA-M\u0018%a:B\u0002{S-QAM[+L\ba[/"));
    /* renamed from: d */
    public static final Charset f2786d = Charset.forName(m7123z(m7124z("J\u001fg\rp\u0016U%\u0004")));
    /* renamed from: e */
    public static final String f2787e = m7123z(m7124z("`\u0003fA-M\u0018%a1S\t"));
    /* renamed from: f */
    public static final String f2788f = m7123z(m7124z("A\u0005fT:Z"));

    private db() {
    }

    /* renamed from: z */
    private static String m7123z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 35;
                    break;
                case 1:
                    i2 = 108;
                    break;
                case 2:
                    i2 = 8;
                    break;
                case 3:
                    i2 = 53;
                    break;
                default:
                    i2 = 72;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7124z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 72);
        }
        return toCharArray;
    }
}
