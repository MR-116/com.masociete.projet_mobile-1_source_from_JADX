package p000a.p001a.p002a.p003a.p006c;

/* renamed from: a.a.a.a.c.f */
enum C0023f {
    PAD_ENCODE,
    ASCII_ENCODE,
    C40_ENCODE,
    TEXT_ENCODE,
    ANSIX12_ENCODE,
    EDIFACT_ENCODE,
    BASE256_ENCODE;
    
    /* renamed from: a */
    private static final C0023f[] f77a = null;

    static {
        PAD_ENCODE = new C0023f(C0023f.m147z(C0023f.m148z("V\u0011mg\fH\u0013f|\f")), 0);
        ASCII_ENCODE = new C0023f(C0023f.m147z(C0023f.m148z("G\u0003jq\u0000Y\u0015g{\u0006B\u0015")), 1);
        C40_ENCODE = new C0023f(C0023f.m147z(C0023f.m148z("Ed\u0019g\fH\u0013f|\f")), 2);
        TEXT_ENCODE = new C0023f(C0023f.m147z(C0023f.m148z("R\u0015ql\u0016C\u001ejw\rC")), 3);
        ANSIX12_ENCODE = new C0023f(C0023f.m147z(C0023f.m148z("G\u001ezq\u00117bv}\u0007E\u001fm}")), 4);
        EDIFACT_ENCODE = new C0023f(C0023f.m147z(C0023f.m148z("C\u0014`~\bE\u0004v}\u0007E\u001fm}")), 5);
        BASE256_ENCODE = new C0023f(C0023f.m147z(C0023f.m148z("D\u0011z}{3fv}\u0007E\u001fm}")), 6);
        f77a = new C0023f[]{PAD_ENCODE, ASCII_ENCODE, C40_ENCODE, TEXT_ENCODE, ANSIX12_ENCODE, EDIFACT_ENCODE, BASE256_ENCODE};
    }

    /* renamed from: z */
    private static String m147z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 6;
                    break;
                case 1:
                    i2 = 80;
                    break;
                case 2:
                    i2 = 41;
                    break;
                case 3:
                    i2 = 56;
                    break;
                default:
                    i2 = 73;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m148z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 73);
        }
        return toCharArray;
    }
}
