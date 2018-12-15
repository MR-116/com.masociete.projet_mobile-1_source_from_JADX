package p000a.p001a.p002a;

import java.util.List;

/* renamed from: a.a.a.w */
public enum C0216w {
    OTHER(Object.class),
    PURE_BARCODE(Void.class),
    POSSIBLE_FORMATS(List.class),
    TRY_HARDER(Void.class),
    CHARACTER_SET(String.class),
    ALLOWED_LENGTHS(int[].class),
    ASSUME_CODE_39_CHECK_DIGIT(Void.class),
    ASSUME_GS1(Void.class),
    RETURN_CODABAR_START_END(Void.class),
    NEED_RESULT_POINT_CALLBACK(C0214u.class),
    ALLOWED_EAN_EXTENSIONS(int[].class);
    
    /* renamed from: b */
    private final Class<?> f793b;

    private C0216w(Class<?> cls) {
        this.f793b = cls;
    }

    /* renamed from: z */
    private static String m1277z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 125;
                    break;
                case 1:
                    i2 = 89;
                    break;
                case 2:
                    i2 = 33;
                    break;
                case 3:
                    i2 = 40;
                    break;
                default:
                    i2 = 67;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1278z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 67);
        }
        return toCharArray;
    }

    public Class<?> getValueType() {
        return this.f793b;
    }
}
