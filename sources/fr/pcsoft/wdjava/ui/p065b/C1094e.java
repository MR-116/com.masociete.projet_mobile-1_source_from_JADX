package fr.pcsoft.wdjava.ui.p065b;

/* renamed from: fr.pcsoft.wdjava.ui.b.e */
public class C1094e {
    /* renamed from: a */
    public static final int f3316a = 0;
    /* renamed from: b */
    public static final int f3317b = 40;
    /* renamed from: c */
    public static final int f3318c = 24;
    /* renamed from: d */
    public static final int f3319d = 32;
    /* renamed from: e */
    public static final int f3320e = 8;
    /* renamed from: f */
    public static final int f3321f = 16;

    /* renamed from: a */
    public static byte m7936a(long j, int i) {
        return (byte) ((int) (255 & (j >> i)));
    }

    /* renamed from: a */
    public static int m7937a(int i) {
        return ((i & 65535) & 10) == 10 ? 10 : ((i & 65535) & 9) != 9 ? ((i & 65535) & 8) == 8 ? 8 : ((i & 65535) & 7) == 7 ? 7 : ((i & 65535) & 6) == 6 ? 72 : ((i & 65535) & 5) == 5 ? 5 : ((i & 65535) & 4) == 4 ? 77 : ((i & 65535) & 3) == 3 ? 69 : ((i & 65535) & 2) == 2 ? 67 : 78 : 9;
    }

    /* renamed from: a */
    public static int m7938a(int i, int i2) {
        int i3;
        switch (i) {
            case 5:
                i3 = 5;
                break;
            case 7:
                i3 = 7;
                break;
            case 8:
                i3 = 8;
                break;
            case 9:
                i3 = 9;
                break;
            case 10:
                i3 = 10;
                break;
            case 67:
                i3 = 2;
                break;
            case 69:
                i3 = 3;
                break;
            case 72:
                i3 = 6;
                break;
            case 77:
                i3 = 4;
                break;
            default:
                i3 = 1;
                break;
        }
        switch (i2) {
            case 1:
                return i3 | 262144;
            case 2:
                return i3 | 524288;
            case 3:
                return i3 | 65536;
            case 4:
                return (i3 | 65536) | 262144;
            case 5:
                return (i3 | 65536) | 524288;
            case 6:
                return i3 | 131072;
            case 7:
                return (i3 | 131072) | 262144;
            case 8:
                return (i3 | 131072) | 524288;
            default:
                return i3;
        }
    }

    /* renamed from: a */
    public static final long m7939a() {
        return 1100820250625L;
    }

    /* renamed from: a */
    public static final long m7940a(long j, int i, byte b) {
        return (((255 << i) ^ -1) & j) | (((long) (b & 255)) << i);
    }

    /* renamed from: a */
    public static String m7941a(String str) {
        return str;
    }

    /* renamed from: b */
    public static int m7942b(int i) {
        int i2 = ((i & 983040) & 65536) == 65536 ? 1 : ((i & 983040) & 131072) == 131072 ? 2 : 0;
        if (((i & 983040) & 262144) == 262144) {
            switch (i2) {
                case 0:
                    return 1;
                case 2:
                    return 7;
                default:
                    return 4;
            }
        } else if (((i & 983040) & 524288) == 524288) {
            switch (i2) {
                case 0:
                    return 2;
                case 2:
                    return 8;
                default:
                    return 5;
            }
        } else {
            switch (i2) {
                case 0:
                    return 0;
                case 2:
                    return 6;
                default:
                    return 3;
            }
        }
    }
}
