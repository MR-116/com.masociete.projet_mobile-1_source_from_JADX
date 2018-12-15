package fr.pcsoft.wdjava.ui.p065b.p067a;

/* renamed from: fr.pcsoft.wdjava.ui.b.a.w */
enum C1083w {
    svg(true),
    g(true),
    a(true),
    defs(true),
    path,
    rect,
    circle,
    ellipse,
    line,
    polyline,
    polygon,
    text(true),
    tspan(true),
    linearGradient(true),
    radialGradient(true),
    stop(true),
    image(true),
    UNSUPPORTED;
    
    /* renamed from: b */
    private static final C1083w[] f3235b = null;
    /* renamed from: c */
    private boolean f3237c;

    static {
        svg = new C1083w(C1083w.m7825z(C1083w.m7826z("dj\u0006")), 0, true);
        g = new C1083w("g", 1, true);
        a = new C1083w("a", 2, true);
        defs = new C1083w(C1083w.m7825z(C1083w.m7826z("sy\u0007V")), 3, true);
        path = new C1083w(C1083w.m7825z(C1083w.m7826z("g}\u0015M")), 4);
        rect = new C1083w(C1083w.m7825z(C1083w.m7826z("ey\u0002Q")), 5);
        circle = new C1083w(C1083w.m7825z(C1083w.m7826z("tu\u0013FCr")), 6);
        ellipse = new C1083w(C1083w.m7825z(C1083w.m7826z("rp\rL_dy")), 7);
        line = new C1083w(C1083w.m7825z(C1083w.m7826z("{u\u000f@")), 8);
        polyline = new C1083w(C1083w.m7825z(C1083w.m7826z("gs\r\\C~r\u0004")), 9);
        polygon = new C1083w(C1083w.m7825z(C1083w.m7826z("gs\r\\Hxr")), 10);
        text = new C1083w(C1083w.m7825z(C1083w.m7826z("cy\u0019Q")), 11, true);
        tspan = new C1083w(C1083w.m7825z(C1083w.m7826z("co\u0011DA")), 12, true);
        linearGradient = new C1083w(C1083w.m7825z(C1083w.m7826z("{u\u000f@Ne[\u0013DK~y\u000fQ")), 13, true);
        radialGradient = new C1083w(C1083w.m7825z(C1083w.m7826z("e}\u0005LN{[\u0013DK~y\u000fQ")), 14, true);
        stop = new C1083w(C1083w.m7825z(C1083w.m7826z("dh\u000eU")), 15, true);
        image = new C1083w(C1083w.m7825z(C1083w.m7826z("~q\u0000BJ")), 16, true);
        UNSUPPORTED = new C1083w(C1083w.m7825z(C1083w.m7826z("BR2pGS3qjS")), 17);
        f3235b = new C1083w[]{svg, g, a, defs, path, rect, circle, ellipse, line, polyline, polygon, text, tspan, linearGradient, radialGradient, stop, image, UNSUPPORTED};
    }

    private C1083w(boolean z) {
        this.f3237c = false;
        this.f3237c = z;
    }

    public static final C1083w getElementByName(String str) {
        try {
            return C1083w.valueOf(str);
        } catch (IllegalArgumentException e) {
            return UNSUPPORTED;
        }
    }

    /* renamed from: z */
    private static String m7825z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 23;
                    break;
                case 1:
                    i2 = 28;
                    break;
                case 2:
                    i2 = 97;
                    break;
                case 3:
                    i2 = 37;
                    break;
                default:
                    i2 = 47;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7826z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 47);
        }
        return toCharArray;
    }

    public final boolean isContainer() {
        return this.f3237c;
    }
}
