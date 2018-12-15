package p000a.p001a.p002a.p011c.p012a.p013a.p014a;

import p000a.p001a.p002a.C0212s;
import p000a.p001a.p002a.C0213t;
import p000a.p001a.p002a.p019g.C0185f;

/* renamed from: a.a.a.c.a.a.a.j */
public abstract class C0079j {
    /* renamed from: z */
    private static final String[] f231z = new String[]{C0079j.m471z(C0079j.m472z("J\u0006")), C0079j.m471z(C0079j.m472z("H\u0007k")), C0079j.m471z(C0079j.m472z("H\u0004k")), C0079j.m471z(C0079j.m472z("J\u0004")), C0079j.m471z(C0079j.m472z("\u000e[0+[\f[{!Q\u0018Z? FA\u0015")), C0079j.m471z(C0079j.m472z("J\u0000")), C0079j.m471z(C0079j.m472z("J\u0002"))};
    /* renamed from: a */
    private final C0077h f232a;
    /* renamed from: b */
    private final C0185f f233b;

    C0079j(C0185f c0185f) {
        this.f233b = c0185f;
        this.f232a = new C0077h(c0185f);
    }

    /* renamed from: a */
    public static C0079j m470a(C0185f c0185f) {
        try {
            if (c0185f.m1149c(1)) {
                return new C0083n(c0185f);
            }
            try {
                if (!c0185f.m1149c(2)) {
                    return new C0089t(c0185f);
                }
                switch (C0077h.m449a(c0185f, 1, 4)) {
                    case 4:
                        try {
                            return new C0087r(c0185f);
                        } catch (IllegalStateException e) {
                            throw e;
                        }
                    case 5:
                        return new C0088s(c0185f);
                    default:
                        switch (C0077h.m449a(c0185f, 1, 5)) {
                            case 12:
                                try {
                                    return new C0081l(c0185f);
                                } catch (IllegalStateException e2) {
                                    throw e2;
                                }
                            case 13:
                                return new C0082m(c0185f);
                            default:
                                switch (C0077h.m449a(c0185f, 1, 7)) {
                                    case 56:
                                        try {
                                            return new C0085p(c0185f, f231z[2], f231z[3]);
                                        } catch (IllegalStateException e22) {
                                            throw e22;
                                        }
                                    case 57:
                                        return new C0085p(c0185f, f231z[1], f231z[3]);
                                    case 58:
                                        return new C0085p(c0185f, f231z[2], f231z[0]);
                                    case 59:
                                        return new C0085p(c0185f, f231z[1], f231z[0]);
                                    case 60:
                                        return new C0085p(c0185f, f231z[2], f231z[5]);
                                    case 61:
                                        return new C0085p(c0185f, f231z[1], f231z[5]);
                                    case 62:
                                        return new C0085p(c0185f, f231z[2], f231z[6]);
                                    case 63:
                                        return new C0085p(c0185f, f231z[1], f231z[6]);
                                    default:
                                        throw new IllegalStateException(f231z[4] + c0185f);
                                }
                        }
                }
            } catch (IllegalStateException e222) {
                throw e222;
            }
        } catch (IllegalStateException e2222) {
            throw e2222;
        }
    }

    /* renamed from: z */
    private static String m471z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 123;
                    break;
                case 1:
                    i2 = 53;
                    break;
                case 2:
                    i2 = 91;
                    break;
                case 3:
                    i2 = 69;
                    break;
                default:
                    i2 = 52;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m472z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 52);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public abstract String mo17a() throws C0213t, C0212s;

    /* renamed from: b */
    protected final C0185f m474b() {
        return this.f233b;
    }

    /* renamed from: c */
    protected final C0077h m475c() {
        return this.f232a;
    }
}
