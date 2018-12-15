package fr.pcsoft.wdjava.ui.dialogue;

import fr.pcsoft.wdjava.core.debug.C0691a;

public class WDMsgBoxJNI {
    /* renamed from: a */
    private static final int f4065a = 1;
    /* renamed from: b */
    private static final int f4066b = 4;
    /* renamed from: c */
    private static final int f4067c = 6;
    /* renamed from: d */
    private static final int f4068d = 6;
    /* renamed from: e */
    private static final int f4069e = 2;
    /* renamed from: f */
    private static final int f4070f = 3;
    /* renamed from: g */
    private static final int f4071g = 10;
    /* renamed from: h */
    private static final int f4072h = 0;
    /* renamed from: i */
    private static final int f4073i = 3;
    /* renamed from: j */
    private static final int f4074j = 7;
    /* renamed from: k */
    private static final int f4075k = 11;
    /* renamed from: l */
    private static final int f4076l = 4;
    /* renamed from: m */
    private static final int f4077m = 5;
    /* renamed from: n */
    private static final int f4078n = 2;
    /* renamed from: o */
    private static final int f4079o = 5;
    /* renamed from: p */
    private static final int f4080p = 1;
    /* renamed from: z */
    private static final String[] f4081z = new String[]{m9826z(m9827z("|5")), m9826z(m9827z("f#L9\u0005V?\u001c1@A)];@P5D|K]4\u001c.@Q5R2P\u001c")), m9826z(m9827z("q5R(L\\/Y")), m9826z(m9827z("s8S.Q")), m9826z(m9827z("f(E|DU;U2")), m9826z(m9827z("k?O")), m9826z(m9827z("{=R3WW")), m9826z(m9827z("q;R?@^")), m9826z(m9827z("`?H.\\"))};

    public static final int afficherMsgBox(String str, String str2, long j) {
        switch ((int) (15 & j)) {
            case 0:
                C1372f.m9828a().mo3751a(str);
                return 1;
            case 1:
                return C1372f.m9828a().mo3756b(str, 0) ? 1 : 2;
            case 2:
                return C1372f.m9828a().mo3743a(str, null, new String[]{f4081z[3], f4081z[8], f4081z[6]}, new int[]{3, 4, 5}, 0, 2, 1, "", 0, 0);
            case 3:
                return C1372f.m9828a().mo3743a(str, null, new String[]{f4081z[5], f4081z[0], f4081z[7]}, new int[]{6, 7, 2}, 0, 2, 1, "", 0, 0);
            case 4:
                return C1372f.m9828a().mo3759d(str, 0) == 1 ? 6 : 7;
            case 5:
                return C1372f.m9828a().mo3743a(str, null, new String[]{f4081z[8], f4081z[7]}, new int[]{4, 2}, 0, 1, 1, "", 0, 0);
            case 6:
                return C1372f.m9828a().mo3743a(str, null, new String[]{f4081z[7], f4081z[4], f4081z[2]}, new int[]{2, 10, 11}, 2, 0, 1, "", 0, 0);
            default:
                C0691a.m2856a(f4081z[1]);
                return -1;
        }
    }

    /* renamed from: z */
    private static String m9826z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 50;
                    break;
                case 1:
                    i2 = 90;
                    break;
                case 2:
                    i2 = 60;
                    break;
                case 3:
                    i2 = 92;
                    break;
                default:
                    i2 = 37;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m9827z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 37);
        }
        return toCharArray;
    }
}
