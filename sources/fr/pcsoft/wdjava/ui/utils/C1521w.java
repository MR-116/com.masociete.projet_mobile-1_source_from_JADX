package fr.pcsoft.wdjava.ui.utils;

/* renamed from: fr.pcsoft.wdjava.ui.utils.w */
public class C1521w {
    /* renamed from: z */
    private static final String f4665z = C1521w.m10569z(C1521w.m10570z("[\u0015\u000e"));
    /* renamed from: a */
    public int f4666a = 0;
    /* renamed from: b */
    public int f4667b = 0;

    public C1521w(int i, int i2) {
        this.f4666a = i;
        this.f4667b = i2;
    }

    /* renamed from: z */
    private static String m10569z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 123;
                    break;
                case 1:
                    i2 = 56;
                    break;
                case 2:
                    i2 = 46;
                    break;
                case 3:
                    i2 = 48;
                    break;
                default:
                    i2 = 51;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m10570z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 51);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public int m10571a() {
        return this.f4666a;
    }

    /* renamed from: b */
    public int m10572b() {
        return this.f4667b;
    }

    public String toString() {
        return this.f4666a + f4665z + this.f4667b;
    }
}
