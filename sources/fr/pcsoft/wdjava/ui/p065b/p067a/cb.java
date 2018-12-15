package fr.pcsoft.wdjava.ui.p065b.p067a;

import android.graphics.Matrix;
import fr.pcsoft.wdjava.core.debug.C0691a;

/* renamed from: fr.pcsoft.wdjava.ui.b.a.cb */
abstract class cb extends ab implements C1065m {
    /* renamed from: z */
    private static final String[] f3083z = new String[]{cb.m7620z(cb.m7621z("}\u0017\u001d6\u0019YV\u0018=\u001aJ\u001a\u00187\t\u000b\u0006\u001e&\u001e\u000b\u001aV2\u0018_\u0004\u00181\u0019_V\u0002#\u001eN\u0017\u0015\u001e\t_\u001e\u001e7")), cb.m7620z(cb.m7621z("^\u0005\u0014!?[\u0017\u00126#E#\u00026")), cb.m7620z(cb.m7621z("j\u0002\u0005!\u0005I\u0003\u0005s\u0002D\u0018Q \u0019[\u0006\u001e!\u0018ÂVKs")), cb.m7620z(cb.m7621z("}\u0017\u001d6\u0019YV\u0018=\u001aJ\u001a\u00187\t\u000b\u0006\u001e&\u001e\u000b\u001aV2\u0018_\u0004\u00181\u0019_V\u0016!\rO\u001f\u0014=\u0018~\u0018\u0018'\u001f")), cb.m7620z(cb.m7621z("D\u0014\u001b6\u000f_4\u001e&\u0002O\u001f\u001f4.D\u000e")), cb.m7620z(cb.m7621z("c\u001f!\rY\u0015\u0019:\t\u000b\u0012\u0004s\bD\u0015\u0004>\tE\u0002Q:\u0002]\u0017\u001d:\bNX"))};
    /* renamed from: f */
    public C1072k f3084f;
    /* renamed from: g */
    public boolean f3085g = false;
    /* renamed from: h */
    public Matrix f3086h;
    /* renamed from: i */
    public String f3087i;

    cb() {
    }

    /* renamed from: z */
    private static String m7620z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 43;
                    break;
                case 1:
                    i2 = 118;
                    break;
                case 2:
                    i2 = 113;
                    break;
                case 3:
                    i2 = 83;
                    break;
                default:
                    i2 = 108;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7621z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 108);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public void mo3327a() {
        super.mo3327a();
        this.f3086h = null;
        this.f3084f = null;
        this.f3087i = null;
    }

    /* renamed from: a */
    public void mo3336a(Matrix matrix) {
        this.f3086h = matrix;
    }

    /* renamed from: a */
    public void mo3335a(C1068g c1068g, String str) throws C1066d {
        try {
            switch (C1075o.f3177b[c1068g.ordinal()]) {
                case 16:
                    if (str.equals(f3083z[4])) {
                        this.f3085g = false;
                        return;
                    }
                    try {
                        if (str.equals(f3083z[1])) {
                            this.f3085g = true;
                            return;
                        }
                        throw new C1066d(f3083z[3]);
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                case 17:
                    try {
                        this.f3084f = C1072k.valueOf(str);
                        return;
                    } catch (IllegalArgumentException e2) {
                        throw new C1066d(f3083z[0]);
                    }
                case 18:
                    this.f3087i = str;
                    return;
                default:
                    C0691a.m2856a(f3083z[2] + c1068g.name());
                    return;
            }
        } catch (IllegalArgumentException e3) {
            throw e3;
        } catch (IllegalArgumentException e32) {
            throw e32;
        }
        throw e32;
    }

    /* renamed from: a */
    public void mo3331a(C1060y c1060y) throws C1066d {
        try {
            if (c1060y instanceof ib) {
                super.mo3331a(c1060y);
                return;
            }
            throw new C1066d(f3083z[5]);
        } catch (C1066d e) {
            throw e;
        }
    }

    /* renamed from: e */
    public Matrix mo3337e() {
        return this.f3086h;
    }

    /* renamed from: m */
    public final String m7627m() {
        return this.f3087i;
    }
}
