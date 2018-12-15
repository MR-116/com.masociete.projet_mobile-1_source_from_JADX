package fr.pcsoft.wdjava.core.utils;

/* renamed from: fr.pcsoft.wdjava.core.utils.n */
public class C0810n {
    /* renamed from: a */
    public static final int f2124a = 16;
    /* renamed from: b */
    public static final int f2125b = 8;
    /* renamed from: c */
    public static final int f2126c = 12;
    /* renamed from: d */
    public static final int f2127d = 4;
    /* renamed from: e */
    public static final int f2128e = 24;
    /* renamed from: f */
    public static final int f2129f = 16;
    /* renamed from: g */
    public static final int f2130g = 16;
    /* renamed from: h */
    public static final int f2131h = 16;
    /* renamed from: i */
    public static final int f2132i = 56;
    /* renamed from: j */
    public static final int f2133j = 24;
    /* renamed from: k */
    public static final int f2134k = 16;
    /* renamed from: l */
    public static final int f2135l = 24;
    /* renamed from: m */
    public static final int f2136m = 72;
    /* renamed from: n */
    public static final int f2137n = 16;

    /* renamed from: a */
    public static int m4088a(int i) {
        switch (i) {
            case 1:
            case 4:
            case 8:
            case 16:
            case 19:
            case 28:
            case 30:
            case 36:
            case 37:
            case 111:
                return 4;
            case 2:
            case 6:
                return 1;
            case 3:
            case 7:
                return 2;
            case 5:
            case 9:
            case 14:
                return 8;
            case 10:
                return 10;
            case 12:
                return 8;
            case 13:
                return 10;
            case 17:
            case 81:
                return 1;
            case 24:
                return 9;
            case 25:
                return 10;
            case 26:
                return 8;
            case 27:
                return 8;
            default:
                return 0;
        }
    }

    /* renamed from: a */
    public static long m4089a(String str) {
        return str == null ? 0 : (long) ((str.length() * 2) + 38);
    }

    /* renamed from: a */
    public static long m4090a(byte[] bArr) {
        return (long) (bArr.length + 14);
    }
}
