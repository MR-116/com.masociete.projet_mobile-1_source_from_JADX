package fr.pcsoft.wdjava.ui.utils;

import fr.pcsoft.wdjava.file.C0894l;

/* renamed from: fr.pcsoft.wdjava.ui.utils.v */
final class C1520v extends C0894l {
    /* renamed from: b */
    public static final C1520v f4658b = new C1520v(new byte[]{(byte) -1, (byte) -40}, C1520v.m10566z(C1520v.m10567z("^rI")), C1520v.m10566z(C1520v.m10567z("}OoS0;H~Q2")));
    /* renamed from: e */
    public static final C1520v f4659e = new C1520v(new byte[]{(byte) -119, (byte) 80, (byte) 78, (byte) 71, (byte) 13, (byte) 10, (byte) 26, (byte) 10}, C1520v.m10566z(C1520v.m10567z("DlI")), C1520v.m10566z(C1520v.m10567z("}OoS0;R`S")));
    /* renamed from: f */
    public static final C1520v f4660f = new C1520v(new byte[]{(byte) 71, (byte) 73, (byte) 70, (byte) 56, (byte) 55, (byte) 97}, C1520v.m10566z(C1520v.m10567z("SkH")), C1520v.m10566z(C1520v.m10567z("}OoS0;EgR")));
    /* renamed from: g */
    private static int f4661g = 0;
    /* renamed from: h */
    public static final C1520v f4662h = new C1520v(new byte[]{(byte) 71, (byte) 73, (byte) 70, (byte) 56, (byte) 57, (byte) 97}, C1520v.m10566z(C1520v.m10567z("SkH")), C1520v.m10566z(C1520v.m10567z("}OoS0;EgR")));
    /* renamed from: c */
    private String f4663c;
    /* renamed from: d */
    private String f4664d;

    private C1520v(byte[] bArr, String str, String str2) {
        super(bArr);
        f4661g = Math.max(f4661g, bArr.length);
        this.f4663c = str;
        this.f4664d = str2;
    }

    /* renamed from: d */
    public static final int m10565d() {
        return f4661g;
    }

    /* renamed from: z */
    private static String m10566z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 20;
                    break;
                case 1:
                    i2 = 34;
                    break;
                case 2:
                    i2 = 14;
                    break;
                case 3:
                    i2 = 52;
                    break;
                default:
                    i2 = 85;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m10567z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 85);
        }
        return toCharArray;
    }

    /* renamed from: c */
    public final String m10568c() {
        return this.f4664d;
    }

    public String toString() {
        return this.f4663c;
    }
}
