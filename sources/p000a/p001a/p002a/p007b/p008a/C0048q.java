package p000a.p001a.p002a.p007b.p008a;

/* renamed from: a.a.a.b.a.q */
public enum C0048q {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);
    
    /* renamed from: a */
    private final int f126a;
    /* renamed from: c */
    private final int[] f127c;

    private C0048q(int[] iArr, int i) {
        this.f127c = iArr;
        this.f126a = i;
    }

    public static C0048q forBits(int i) {
        switch (i) {
            case 0:
                try {
                    return TERMINATOR;
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            case 1:
                return NUMERIC;
            case 2:
                return ALPHANUMERIC;
            case 3:
                return STRUCTURED_APPEND;
            case 4:
                return BYTE;
            case 5:
                return FNC1_FIRST_POSITION;
            case 7:
                return ECI;
            case 8:
                return KANJI;
            case 9:
                return FNC1_SECOND_POSITION;
            case 13:
                return HANZI;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: z */
    private static String m250z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 49;
                    break;
                case 1:
                    i2 = 68;
                    break;
                case 2:
                    i2 = 26;
                    break;
                case 3:
                    i2 = 58;
                    break;
                default:
                    i2 = 15;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m251z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 15);
        }
        return toCharArray;
    }

    public int getBits() {
        return this.f126a;
    }

    public int getCharacterCountBits(C0049r c0049r) {
        int b = c0049r.m258b();
        b = b <= 9 ? 0 : b <= 26 ? 1 : 2;
        return this.f127c[b];
    }
}
