package fr.pcsoft.wdjava.ui.p065b.p067a;

import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.ui.p083l.C1449i;

/* renamed from: fr.pcsoft.wdjava.ui.b.a.g */
enum C1068g {
    claxx,
    color,
    cx,
    cy,
    dx,
    dy,
    fx,
    fy,
    d,
    display,
    fill,
    fill_opacity,
    font,
    font_family,
    font_size,
    font_weight,
    font_style,
    gradientTransform,
    gradientUnits,
    height,
    href,
    id,
    offset,
    opacity,
    pathLength,
    points,
    r,
    rx,
    ry,
    spreadMethod,
    stop_color,
    stop_opacity,
    stroke,
    stroke_dasharray,
    stroke_dashoffset,
    stroke_linecap,
    stroke_linejoin,
    stroke_miterlimit,
    stroke_opacity,
    stroke_width,
    style,
    text_anchor,
    transform,
    version,
    viewBox,
    width,
    x,
    y,
    x1,
    y1,
    x2,
    y2,
    visibility,
    UNSUPPORTED;
    
    /* renamed from: a */
    private static final C1068g[] f3104a = null;
    /* renamed from: z */
    private static final String[] f3109z = null;

    static {
        f3109z = new String[]{C1068g.m7642z(C1068g.m7643z("1a\u000e\u0001:\u0012`\u000eS\u0000&RZ\u001d<\u001e5\t\u0006#\u0000z\b\u0007ºP/Z")), C1068g.m7642z(C1068g.m7643z("\u0013y\u001b\u0000 "))};
        claxx = new C1068g(C1068g.m7642z(C1068g.m7643z("\u0013y\u001b\u000b+")), 0);
        color = new C1068g(C1068g.m7642z(C1068g.m7643z("\u0013z\u0016\u001c!")), 1);
        cx = new C1068g(C1068g.m7642z(C1068g.m7643z("\u0013m")), 2);
        cy = new C1068g(C1068g.m7642z(C1068g.m7643z("\u0013l")), 3);
        dx = new C1068g(C1068g.m7642z(C1068g.m7643z("\u0014m")), 4);
        dy = new C1068g(C1068g.m7642z(C1068g.m7643z("\u0014l")), 5);
        fx = new C1068g(C1068g.m7642z(C1068g.m7643z("\u0016m")), 6);
        fy = new C1068g(C1068g.m7642z(C1068g.m7643z("\u0016l")), 7);
        d = new C1068g("d", 8);
        display = new C1068g(C1068g.m7642z(C1068g.m7643z("\u0014|\t\u0003?\u0011l")), 9);
        fill = new C1068g(C1068g.m7642z(C1068g.m7643z("\u0016|\u0016\u001f")), 10);
        fill_opacity = new C1068g(C1068g.m7642z(C1068g.m7643z("\u0016|\u0016\u001f\f\u001fe\u001b\u0010:\u0004l")), 11);
        font = new C1068g(C1068g.m7642z(C1068g.m7643z("\u0016z\u0014\u0007")), 12);
        font_family = new C1068g(C1068g.m7642z(C1068g.m7643z("\u0016z\u0014\u0007\f\u0016t\u0017\u001a?\t")), 13);
        font_size = new C1068g(C1068g.m7642z(C1068g.m7643z("\u0016z\u0014\u0007\f\u0003|\u0000\u0016")), 14);
        font_weight = new C1068g(C1068g.m7642z(C1068g.m7643z("\u0016z\u0014\u0007\f\u0007p\u0013\u0014;\u0004")), 15);
        font_style = new C1068g(C1068g.m7642z(C1068g.m7643z("\u0016z\u0014\u0007\f\u0003a\u0003\u001f6")), 16);
        gradientTransform = new C1068g(C1068g.m7642z(C1068g.m7643z("\u0017g\u001b\u0017:\u0015{\u000e'!\u0011{\t\u0015<\u0002x")), 17);
        gradientUnits = new C1068g(C1068g.m7642z(C1068g.m7643z("\u0017g\u001b\u0017:\u0015{\u000e&=\u0019a\t")), 18);
        height = new C1068g(C1068g.m7642z(C1068g.m7643z("\u0018p\u0013\u0014;\u0004")), 19);
        href = new C1068g(C1068g.m7642z(C1068g.m7643z("\u0018g\u001f\u0015")), 20);
        id = new C1068g(C1068g.m7642z(C1068g.m7643z("\u0019q")), 21);
        offset = new C1068g(C1068g.m7642z(C1068g.m7643z("\u001fs\u001c\u00006\u0004")), 22);
        opacity = new C1068g(C1068g.m7642z(C1068g.m7643z("\u001fe\u001b\u0010:\u0004l")), 23);
        pathLength = new C1068g(C1068g.m7642z(C1068g.m7643z("\u0000t\u000e\u001b\u001f\u0015{\u001d\u0007;")), 24);
        points = new C1068g(C1068g.m7642z(C1068g.m7643z("\u0000z\u0013\u001d'\u0003")), 25);
        r = new C1068g("r", 26);
        rx = new C1068g(C1068g.m7642z(C1068g.m7643z("\u0002m")), 27);
        ry = new C1068g(C1068g.m7642z(C1068g.m7643z("\u0002l")), 28);
        spreadMethod = new C1068g(C1068g.m7642z(C1068g.m7643z("\u0003e\b\u00162\u0014X\u001f\u0007;\u001fq")), 29);
        stop_color = new C1068g(C1068g.m7642z(C1068g.m7643z("\u0003a\u0015\u0003\f\u0013z\u0016\u001c!")), 30);
        stop_opacity = new C1068g(C1068g.m7642z(C1068g.m7643z("\u0003a\u0015\u0003\f\u001fe\u001b\u0010:\u0004l")), 31);
        stroke = new C1068g(C1068g.m7642z(C1068g.m7643z("\u0003a\b\u001c8\u0015")), 32);
        stroke_dasharray = new C1068g(C1068g.m7642z(C1068g.m7643z("\u0003a\b\u001c8\u0015J\u001e\u0012 \u0018t\b\u00012\t")), 33);
        stroke_dashoffset = new C1068g(C1068g.m7642z(C1068g.m7643z("\u0003a\b\u001c8\u0015J\u001e\u0012 \u0018z\u001c\u0015 \u0015a")), 34);
        stroke_linecap = new C1068g(C1068g.m7642z(C1068g.m7643z("\u0003a\b\u001c8\u0015J\u0016\u001a=\u0015v\u001b\u0003")), 35);
        stroke_linejoin = new C1068g(C1068g.m7642z(C1068g.m7643z("\u0003a\b\u001c8\u0015J\u0016\u001a=\u0015\u0015\u001a=")), 36);
        stroke_miterlimit = new C1068g(C1068g.m7642z(C1068g.m7643z("\u0003a\b\u001c8\u0015J\u0017\u001a'\u0015g\u0016\u001a>\u0019a")), 37);
        stroke_opacity = new C1068g(C1068g.m7642z(C1068g.m7643z("\u0003a\b\u001c8\u0015J\u0015\u00032\u0013|\u000e\n")), 38);
        stroke_width = new C1068g(C1068g.m7642z(C1068g.m7643z("\u0003a\b\u001c8\u0015J\r\u001a7\u0004}")), 39);
        style = new C1068g(C1068g.m7642z(C1068g.m7643z("\u0003a\u0003\u001f6")), 40);
        text_anchor = new C1068g(C1068g.m7642z(C1068g.m7643z("\u0004p\u0002\u0007\f\u0011{\u0019\u001b<\u0002")), 41);
        transform = new C1068g(C1068g.m7642z(C1068g.m7643z("\u0004g\u001b\u001d \u0016z\b\u001e")), 42);
        version = new C1068g(C1068g.m7642z(C1068g.m7643z("\u0006p\b\u0000:\u001f{")), 43);
        viewBox = new C1068g(C1068g.m7642z(C1068g.m7643z("\u0006|\u001f\u0004\u0011\u001fm")), 44);
        width = new C1068g(C1068g.m7642z(C1068g.m7643z("\u0007|\u001e\u0007;")), 45);
        x = new C1068g("x", 46);
        y = new C1068g("y", 47);
        x1 = new C1068g(C1068g.m7642z(C1068g.m7643z("\b$")), 48);
        y1 = new C1068g(C1068g.m7642z(C1068g.m7643z("\t$")), 49);
        x2 = new C1068g(C1068g.m7642z(C1068g.m7643z("\b'")), 50);
        y2 = new C1068g(C1068g.m7642z(C1068g.m7643z("\t'")), 51);
        visibility = new C1068g(C1068g.m7642z(C1068g.m7643z("\u0006|\t\u001a1\u0019y\u0013\u0007*")), 52);
        UNSUPPORTED = new C1068g(C1068g.m7642z(C1068g.m7643z("%[)&\u0003 Z('\u00164")), 53);
        f3104a = new C1068g[]{claxx, color, cx, cy, dx, dy, fx, fy, d, display, fill, fill_opacity, font, font_family, font_size, font_weight, font_style, gradientTransform, gradientUnits, height, href, id, offset, opacity, pathLength, points, r, rx, ry, spreadMethod, stop_color, stop_opacity, stroke, stroke_dasharray, stroke_dashoffset, stroke_linecap, stroke_linejoin, stroke_miterlimit, stroke_opacity, stroke_width, style, text_anchor, transform, version, viewBox, width, x, y, x1, y1, x2, y2, visibility, UNSUPPORTED};
    }

    public static C1068g getAttributeByName(String str) {
        try {
            return C1068g.valueOf(str.replace('-', C1449i.hb));
        } catch (IllegalArgumentException e) {
            try {
                if (str.equals(f3109z[1])) {
                    return claxx;
                }
                C0691a.m2856a(f3109z[0] + str);
                return UNSUPPORTED;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
    }

    /* renamed from: z */
    private static String m7642z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 112;
                    break;
                case 1:
                    i2 = 21;
                    break;
                case 2:
                    i2 = 122;
                    break;
                case 3:
                    i2 = 115;
                    break;
                default:
                    i2 = 83;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7643z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 83);
        }
        return toCharArray;
    }
}
