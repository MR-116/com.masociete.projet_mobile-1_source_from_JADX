package fr.pcsoft.wdjava.ui.p080h;

/* renamed from: fr.pcsoft.wdjava.ui.h.h */
public enum C1425h {
    BOLD,
    ITALIC,
    UNDERLINE,
    BACKGROUND,
    FOREGROUND,
    FONT_SIZE,
    FONT_NAME,
    IMAGE,
    LINK;
    
    /* renamed from: a */
    private static final C1425h[] f4203a = null;

    static {
        BOLD = new C1425h(C1425h.m10032z(C1425h.m10033z("\u001a]S\u001f")), 0);
        ITALIC = new C1425h(C1425h.m10032z(C1425h.m10033z("\u0011F^\u0017o\u001b")), 1);
        UNDERLINE = new C1425h(C1425h.m10032z(C1425h.m10033z("\r\\[\u001et\u0014[Q\u001e")), 2);
        BACKGROUND = new C1425h(C1425h.m10032z(C1425h.m10033z("\u001aS\\\u0010a\n]J\u0015b")), 3);
        FOREGROUND = new C1425h(C1425h.m10032z(C1425h.m10033z("\u001e]M\u001ea\n]J\u0015b")), 4);
        FONT_SIZE = new C1425h(C1425h.m10032z(C1425h.m10033z("\u001e]Q\u000fy\u000b[E\u001e")), 5);
        FONT_NAME = new C1425h(C1425h.m10032z(C1425h.m10033z("\u001e]Q\u000fy\u0016SR\u001e")), 6);
        IMAGE = new C1425h(C1425h.m10032z(C1425h.m10033z("\u0011_^\u001cc")), 7);
        LINK = new C1425h(C1425h.m10032z(C1425h.m10033z("\u0014[Q\u0010")), 8);
        f4203a = new C1425h[]{BOLD, ITALIC, UNDERLINE, BACKGROUND, FOREGROUND, FONT_SIZE, FONT_NAME, IMAGE, LINK};
    }

    /* renamed from: z */
    private static String m10032z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 88;
                    break;
                case 1:
                    i2 = 18;
                    break;
                case 2:
                    i2 = 31;
                    break;
                case 3:
                    i2 = 91;
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
    private static char[] m10033z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 38);
        }
        return toCharArray;
    }
}
