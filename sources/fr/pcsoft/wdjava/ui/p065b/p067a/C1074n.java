package fr.pcsoft.wdjava.ui.p065b.p067a;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.core.utils.bb;
import fr.pcsoft.wdjava.database.hf.C0542t;
import fr.pcsoft.wdjava.ui.dessin.p077a.C1343g;
import fr.pcsoft.wdjava.ui.dessin.p077a.C1359y;
import java.io.Closeable;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.DefaultHandler2;

/* renamed from: fr.pcsoft.wdjava.ui.b.a.n */
public class C1074n extends DefaultHandler2 {
    /* renamed from: a */
    private static final String f3152a = C1074n.m7758z(C1074n.m7759z("d3`5<#hc2q\"0'ki~ ;t?5~;=je)"));
    /* renamed from: b */
    private static final String f3153b = C1074n.m7758z(C1074n.m7759z("d3`5<#hc2q\"0'ki~ ;w6<w;6pk"));
    /* renamed from: f */
    private static final String f3154f = C1074n.m7758z(C1074n.m7759z("e)| te3"));
    /* renamed from: h */
    private static final String f3155h = C1074n.m7758z(C1074n.m7759z("h\"g&"));
    /* renamed from: j */
    private static final String f3156j = C1074n.m7758z(C1074n.m7759z("o2f7cb3W*jc5"));
    /* renamed from: l */
    private static final String f3157l = C1074n.m7758z(C1074n.m7759z("y5xm"));
    /* renamed from: m */
    private static final String f3158m = C1074n.m7758z(C1074n.m7759z("x.`)c"));
    /* renamed from: p */
    private static final int f3159p = Integer.MIN_VALUE;
    /* renamed from: q */
    private static final String f3160q = C1074n.m7758z(C1074n.m7759z("b(z "));
    /* renamed from: s */
    private static final String f3161s = C1074n.m7758z(C1074n.m7759z("~ vm"));
    /* renamed from: z */
    private static final String[] f3162z;
    /* renamed from: c */
    private wb f3163c = null;
    /* renamed from: d */
    private boolean f3164d = false;
    /* renamed from: e */
    private C1081u f3165e = null;
    /* renamed from: g */
    private String f3166g = null;
    /* renamed from: i */
    private StringBuilder f3167i = null;
    /* renamed from: k */
    private boolean f3168k = false;
    /* renamed from: n */
    private yb f3169n = null;
    /* renamed from: o */
    private boolean f3170o = false;
    /* renamed from: r */
    private int f3171r = 0;

    static {
        r0 = new String[99];
        r0[0] = C1074n.m7758z(C1074n.m7759z("\\(}+r,.z3g`.p (,\bf!ib)ý &a&z4sm)` ("));
        r0[1] = C1074n.m7758z(C1074n.m7759z("\\(}+r,.z3g`.p (,\u0006v6ee4g &a&z4sm)` ("));
        r0[2] = C1074n.m7758z(C1074n.m7759z("I+ý(cb34\u0016PKgz*h,4a5vc5`¬&6g"));
        r0[3] = C1074n.m7758z(C1074n.m7759z("~(a+b"));
        r0[4] = C1074n.m7758z(C1074n.m7759z("@.z em74,hz&x,big.e"));
        r0[5] = C1074n.m7758z(C1074n.m7759z("n2`1"));
        r0[6] = C1074n.m7758z(C1074n.m7759z("6a$ti"));
        r0[7] = C1074n.m7758z(C1074n.m7759z(",){+&2d5i~3ýk"));
        r0[8] = C1074n.m7758z(C1074n.m7759z("M3`7on2`e"));
        r0[9] = C1074n.m7758z(C1074n.m7759z("_3m)c,#qevc+}&c,.z3g`.p &6g"));
        r0[10] = C1074n.m7758z(C1074n.m7759z("b(f(g`"));
        r0[11] = C1074n.m7758z(C1074n.m7759z("c%x,wy\""));
        r0[12] = C1074n.m7758z(C1074n.m7759z("e3u)oo"));
        r0[13] = C1074n.m7758z(C1074n.m7759z("x&v)c!5{2+k5{0v"));
        r0[14] = C1074n.m7758z(C1074n.m7759z("x&v)c!${)sa)"));
        r0[15] = C1074n.m7758z(C1074n.m7759z("a&f.c~"));
        r0[16] = C1074n.m7758z(C1074n.m7759z("x&v)c!${)sa)9\"tc2d"));
        r0[17] = C1074n.m7758z(C1074n.m7759z("`.g1+e3q("));
        r0[18] = C1074n.m7758z(C1074n.m7759z("o(y5go3"));
        r0[19] = C1074n.m7758z(C1074n.m7759z("n+{&m"));
        r0[20] = C1074n.m7758z(C1074n.m7759z("x&v)c"));
        r0[21] = C1074n.m7758z(C1074n.m7759z("Z&x s~g}+pm+}!c,7{0t,+3$rx5}'se34gbe4d)gue4&"));
        r0[22] = C1074n.m7758z(C1074n.m7759z("x&v)c!$q)j"));
        r0[23] = C1074n.m7758z(C1074n.m7759z("x&v)c!5{2"));
        r0[24] = C1074n.m7758z(C1074n.m7759z("e)x,hij`$d`\""));
        r0[25] = C1074n.m7758z(C1074n.m7759z("~2zhob"));
        r0[26] = C1074n.m7758z(C1074n.m7759z("x&v)c!/q$bi59\"tc2d"));
        r0[27] = C1074n.m7758z(C1074n.m7759z("x&v)c!$u5re(z"));
        r0[28] = C1074n.m7758z(C1074n.m7759z("x&v)c!!{*ri59\"tc2d"));
        r0[29] = C1074n.m7758z(C1074n.m7759z("e)x,hi"));
        r0[30] = C1074n.m7758z(C1074n.m7759z("i)p"));
        r0[31] = C1074n.m7758z(C1074n.m7759z("a.p!ji"));
        r0[32] = C1074n.m7758z(C1074n.m7759z("M+}\"hi*q+r,#qeri?` &e)b$je#qe<,"));
        r0[33] = C1074n.m7758z(C1074n.m7759z("3u7r"));
        r0[34] = C1074n.m7758z(C1074n.m7759z("Z&x s~g}+pm+}!c,7{0t,+3$rx5}'se34gpe4}'jie4&"));
        r0[35] = C1074n.m7758z(C1074n.m7759z("d.p!cb"));
        r0[36] = C1074n.m7758z(C1074n.m7759z("o(x)g|4q"));
        r0[37] = C1074n.m7758z(C1074n.m7759z("z.g,d`\""));
        r0[38] = C1074n.m7758z(C1074n.m7759z("n(x!c~"));
        r0[39] = C1074n.m7758z(C1074n.m7759z("K5u,u\"4!c,7{)oo\"4,hz&x,big.e"));
        r0[40] = C1074n.m7758z(C1074n.m7759z("n(x!"));
        r0[41] = C1074n.m7758z(C1074n.m7759z("`.s-ri5"));
        r0[42] = C1074n.m7758z(C1074n.m7759z("Z&x s~gr)ix3u+rig}+pm+}!c,}4"));
        r0[43] = C1074n.m7758z(C1074n.m7759z("A\"g0tigz¬am3}3c,.z1c~#}1c\""));
        r0[44] = C1074n.m7758z(C1074n.m7759z("H&g-&m5f$,.z3g`.p &6g"));
        r0[45] = C1074n.m7758z(C1074n.m7759z("O(a)cy547ano=eob1u)oh\":"));
        r0[46] = C1074n.m7758z(C1074n.m7759z("O(a)cy54-ct&4,hz&x,big.e"));
        r0[47] = C1074n.m7758z(C1074n.m7759z("O(y5i&z1c,\u0015S\u0007&e)b$je#qk"));
        r0[48] = C1074n.m7758z(C1074n.m7759z("O(a)cy54,hz&x,bii"));
        r0[49] = C1074n.m7758z(C1074n.m7759z("#\u001b>k,3\u001b>j"));
        r0[50] = C1074n.m7758z(C1074n.m7759z("\\&f$kä3f &h\"4)g,%{=&e)b$je#qk&H.y h.{+&b®s$re1qk"));
        r0[51] = C1074n.m7758z(C1074n.m7759z("\\&f$kä3f &h\"4)g,%{=&e)b$je#qk&Z&x s~gy$h}2u+rii"));
        r0[52] = C1074n.m7758z(C1074n.m7759z("Z&x s~gpbij!g r,.z3g`.p ("));
        r0[53] = C1074n.m7758z(C1074n.m7759z("Z&x s~gpbij!g r,){+&7ý&oj.ý ("));
        r0[54] = C1074n.m7758z(C1074n.m7759z("x5u+u`&` "));
        r0[55] = C1074n.m7758z(C1074n.m7759z("E)w)ob&}6ibgb tx.w$jig}+pm+}!c\""));
        r0[56] = C1074n.m7758z(C1074n.m7759z("X5u+uj(f(gx.{+&e)b$je#qk"));
        r0[57] = C1074n.m7758z(C1074n.m7759z("$u)c"));
        r0[58] = C1074n.m7758z(C1074n.m7759z("a&`7ot"));
        r0[59] = C1074n.m7758z(C1074n.m7759z("~(`$ri"));
        r0[60] = C1074n.m7758z(C1074n.m7759z("E)w)ob&}6ibg|*te={+rm+qeob1u)oh\":"));
        r0[61] = C1074n.m7758z(C1074n.m7759z("_$u)c,.z3g`.p ("));
        r0[62] = C1074n.m7758z(C1074n.m7759z(",q2_"));
        r0[63] = C1074n.m7758z(C1074n.m7759z(",q2^"));
        r0[64] = C1074n.m7758z(C1074n.m7759z("A&`7oo\"4!c,3f$h!{7km3}*h,.z3g`.p ("));
        r0[65] = C1074n.m7758z(C1074n.m7759z("J(z&re(zebig`7gb4r*ta&`,ibgz*h,3f*sz®qk"));
        r0[66] = C1074n.m7758z(C1074n.m7759z("X5u+u`&`,ibg}+pm+}!c\""));
        r0[67] = C1074n.m7758z(C1074n.m7759z("^(`$re(zeob1u)oh\":"));
        r0[68] = C1074n.m7758z(C1074n.m7759z("@.g1c,#qeki4a7cgb,bii"));
        r0[69] = C1074n.m7758z(C1074n.m7759z("A\"g0tig}+pm+}!c\""));
        r0[70] = C1074n.m7758z(C1074n.m7759z("@.z lc.zeob1u)oh\"4&"));
        r0[71] = C1074n.m7758z(C1074n.m7759z("a.` t"));
        r0[72] = C1074n.m7758z(C1074n.m7759z("n\"b j"));
        r0[73] = C1074n.m7758z(C1074n.m7759z("Z&x s~gq+re¯f &e)b$je#qe<,"));
        r0[74] = C1074n.m7758z(C1074n.m7759z("_3m)c,#qe`c)`eob1u)oh\"4&"));
        r0[75] = C1074n.m7758z(C1074n.m7759z("*u)j!$u5u"));
        r0[76] = C1074n.m7758z(C1074n.m7759z("_3m)c,#qevc+}&c,.z3g`.p &6gb$ji2feje)qhni.s-r,*u+wy&z1c\""));
        r0[77] = C1074n.m7758z(C1074n.m7759z("p$u5re(z9oo(z9ki)a9ki4g$aijv*~p4y$j`jw$vx.{+z3u1sjv$tp"));
        r0[78] = C1074n.m7758z(C1074n.m7759z("\\&`-&e)b$je#qk&E+4!cz5u,r,${(ki)w t,7u7&y)qeec*y$hh\"4(iz\":"));
        r0[79] = C1074n.m7758z(C1074n.m7759z("\\&`-&e)b$je#qk"));
        r0[80] = C1074n.m7758z(C1074n.m7759z("O(y(gb#qevm3|eob1u)oh\":"));
        r0[81] = C1074n.m7758z(C1074n.m7759z(",)3 uxgd$u,2zegx3f,dy34!c,4`<jii"));
        r0[82] = C1074n.m7758z(C1074n.m7759z("@`u1r~.v0r,"));
        r0[83] = C1074n.m7758z(C1074n.m7759z("H(w0ki)`eUZ\u00004 ~e4`$hxi"));
        r0[84] = C1074n.m7758z(C1074n.m7759z("X>d &_\u0011Seob)u1cb#ae.)v=k"));
        r0[85] = C1074n.m7758z(C1074n.m7759z("t?9)g~ q"));
        r0[86] = C1074n.m7758z(C1074n.m7759z("*u)j"));
        r0[87] = C1074n.m7758z(C1074n.m7759z("X&})jigp &|(x,eig}+pm+}!c,}4"));
        r0[88] = C1074n.m7758z(C1074n.m7759z("tjg(g`+"));
        r0[89] = C1074n.m7758z(C1074n.m7759z("a\"p,sa"));
        r0[90] = C1074n.m7758z(C1074n.m7759z("tjx$tk\""));
        r0[91] = C1074n.m7758z(C1074n.m7759z("t?96km+x"));
        r0[92] = C1074n.m7758z(C1074n.m7759z("`&f\"c"));
        r0[93] = C1074n.m7758z(C1074n.m7759z("`&f\"c~"));
        r0[94] = C1074n.m7758z(C1074n.m7759z("*u)ji5"));
        r0[95] = C1074n.m7758z(C1074n.m7759z("A\"g0tig}+pm+}!c,}4"));
        r0[96] = C1074n.m7758z(C1074n.m7759z("A\"g0tigb,bii"));
        r0[97] = C1074n.m7758z(C1074n.m7759z("B(4!io2y hxi"));
        r0[98] = C1074n.m7758z(C1074n.m7759z("d3`5<#hl(j\"(f\")&ljv~(d tx.q6)`\"l,em+9-gb#x t"));
        f3162z = r0;
    }

    C1074n() {
    }

    /* renamed from: a */
    private final float m7729a(String str) throws C1066d {
        try {
            if (!C0808l.m4053k(str)) {
                try {
                    return Float.parseFloat(str);
                } catch (NumberFormatException e) {
                }
            }
            throw new C1066d(f3162z[42] + str);
        } catch (C1066d e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    private static final <T extends yb> T m7730a(Class<T> cls, yb ybVar) throws C1066d {
        try {
            if (cls.isInstance(ybVar)) {
                return ybVar;
            }
            throw new C1066d(C0808l.m4021a(f3162z[84], ybVar.getClass().getName()));
        } catch (C1066d e) {
            throw e;
        }
    }

    /* renamed from: a */
    private static void m7731a(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2, float f6, float f7, Path path) {
        if (f != f6 || f2 != f7) {
            if (f3 == 0.0f || f4 == 0.0f) {
                try {
                    path.lineTo(f6, f7);
                    return;
                } catch (NumberFormatException e) {
                    throw e;
                }
            }
            float f8;
            float f9;
            double d;
            float abs = Math.abs(f3);
            float abs2 = Math.abs(f4);
            float toRadians = (float) Math.toRadians(((double) f5) % 360.0d);
            double cos = Math.cos((double) toRadians);
            double sin = Math.sin((double) toRadians);
            double d2 = ((double) (f - f6)) / 2.0d;
            double d3 = ((double) (f2 - f7)) / 2.0d;
            double d4 = (sin * d3) + (cos * d2);
            double d5 = (d2 * (-sin)) + (d3 * cos);
            d3 = (double) (abs * abs);
            d2 = (double) (abs2 * abs2);
            double d6 = d4 * d4;
            double d7 = d5 * d5;
            double d8 = (d6 / d3) + (d7 / d2);
            if (d8 > 1.0d) {
                abs *= (float) Math.sqrt(d8);
                abs2 *= (float) Math.sqrt(d8);
                f8 = abs2;
                f9 = abs;
                d = (double) (abs * abs);
                d3 = (double) (abs2 * abs2);
            } else {
                f8 = abs2;
                f9 = abs;
                d = d3;
                d3 = d2;
            }
            d2 = z == z2 ? -1.0d : 1.0d;
            d3 = (((d * d3) - (d * d7)) - (d3 * d6)) / ((d3 * d6) + (d * d7));
            if (d3 < 0.0d) {
                d3 = 0.0d;
            }
            d2 *= Math.sqrt(d3);
            d3 = ((((double) f9) * d5) / ((double) f8)) * d2;
            d2 *= -((((double) f8) * d4) / ((double) f9));
            d = (((double) (f + f6)) / 2.0d) + ((cos * d3) - (sin * d2));
            cos = ((cos * d2) + (sin * d3)) + (((double) (f2 + f7)) / 2.0d);
            sin = (d4 - d3) / ((double) f9);
            d6 = (d5 - d2) / ((double) f8);
            d3 = ((-d4) - d3) / ((double) f9);
            d4 = ((-d5) - d2) / ((double) f8);
            d5 = Math.toDegrees((d6 < 0.0d ? -1.0d : 1.0d) * Math.acos(sin / Math.sqrt((sin * sin) + (d6 * d6))));
            d2 = Math.toDegrees(((sin * d4) - (d3 * d6) < 0.0d ? -1.0d : 1.0d) * Math.acos(((d6 * d4) + (sin * d3)) / Math.sqrt(((sin * sin) + (d6 * d6)) * ((d3 * d3) + (d4 * d4)))));
            if (!z2 && d2 > 0.0d) {
                d2 -= 360.0d;
            } else if (z2 && d2 < 0.0d) {
                d2 += 360.0d;
            }
            float[] a = C1074n.m7738a(d5 % 360.0d, d2 % 360.0d);
            Matrix matrix = new Matrix();
            matrix.postScale(f9, f8);
            matrix.postRotate(f5);
            matrix.postTranslate((float) d, (float) cos);
            matrix.mapPoints(a);
            a[a.length - 2] = f6;
            a[a.length - 1] = f7;
            int i = 0;
            while (i < a.length) {
                try {
                    path.cubicTo(a[i], a[i + 1], a[i + 2], a[i + 3], a[i + 4], a[i + 5]);
                    i += 6;
                } catch (NumberFormatException e2) {
                    throw e2;
                }
            }
        }
    }

    /* renamed from: a */
    private final void m7732a(C1068g c1068g, C1061z c1061z, String str) throws C1066d {
        try {
            if (C0808l.m4053k(str)) {
                throw new C1066d(f3162z[68]);
            }
            C1081u s = m7757s(str);
            try {
                s.m7804g();
                while (!s.m7798b()) {
                    C1063b f = s.m7803f();
                    if (f == null) {
                        throw new C1066d(f3162z[69]);
                    }
                    c1061z.mo3334a(c1068g, f);
                    s.m7814q();
                }
                s.m7810m();
            } catch (C1066d e) {
                throw e;
            } catch (Throwable th) {
                s.m7810m();
            }
        } catch (C1066d e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    private final void m7733a(C1084x c1084x, C1068g c1068g, String str) throws C1066d {
        try {
            if (!C0808l.m4053k(str)) {
                try {
                    if (!str.equals(f3154f)) {
                        try {
                            switch (vb.f3233b[c1068g.ordinal()]) {
                                case 2:
                                    c1084x.m7888d(m7751m(str));
                                    return;
                                case 3:
                                    c1084x.m7889e(m7729a(str));
                                    return;
                                case 4:
                                    c1084x.m7880b(m7751m(str));
                                    return;
                                case 5:
                                    c1084x.m7882c(m7729a(str));
                                    return;
                                case 6:
                                    c1084x.m7866a(m7744f(str));
                                    return;
                                case 7:
                                    c1084x.m7868a(m7755q(str));
                                    return;
                                case 8:
                                    c1084x.m7869a(m7747i(str));
                                    return;
                                case 9:
                                    c1084x.m7864a(m7729a(str));
                                    return;
                                case 10:
                                    c1084x.m7873a(m7741c(str));
                                    return;
                                case 11:
                                    c1084x.m7884c(m7744f(str));
                                    return;
                                case 12:
                                    c1084x.m7887d(m7729a(str));
                                    return;
                                case 13:
                                    c1084x.m7885c(str.equals(f3156j) ? C1064c.f3082b : m7751m(str));
                                    return;
                                case 14:
                                    m7734a(c1084x, str);
                                    return;
                                case 15:
                                    c1084x.m7870a(m7749k(str));
                                    return;
                                case 16:
                                    c1084x.m7879b(m7756r(str));
                                    return;
                                case 17:
                                    c1084x.m7878b(m7754p(str));
                                    return;
                                case 18:
                                    c1084x.m7865a(m7746h(str));
                                    return;
                                case 19:
                                    c1084x.m7883c(m7742d(str));
                                    return;
                                case 20:
                                    c1084x.m7881b(m7740b(str));
                                    return;
                                case 21:
                                    c1084x.m7872a(m7752n(str));
                                    return;
                                case 22:
                                    c1084x.m7867a(str.equals(f3156j) ? C1064c.f3082b : m7751m(str));
                                    return;
                                case 23:
                                    c1084x.m7877b(m7729a(str));
                                    return;
                                default:
                                    C0691a.m2856a(f3162z[82] + c1068g.name() + f3162z[81]);
                                    return;
                            }
                        } catch (C1066d e) {
                            throw e;
                        }
                        throw e;
                    }
                } catch (C1066d e2) {
                    throw e2;
                }
            }
        } catch (C1066d e22) {
            throw e22;
        }
    }

    /* renamed from: a */
    private final void m7734a(C1084x c1084x, String str) throws C1066d {
        try {
            if (f3162z[77].indexOf('|' + str + '|') == -1) {
                String a;
                C1081u s = m7757s(str);
                String str2 = null;
                int i = Integer.MIN_VALUE;
                while (true) {
                    try {
                        a = s.m7793a('/');
                        s.m7804g();
                        if (a != null) {
                            if (!a.equals(f3162z[10])) {
                                if (i == Integer.MIN_VALUE) {
                                    try {
                                        i = m7754p(a);
                                    } catch (C1066d e) {
                                    }
                                    if (i != Integer.MIN_VALUE) {
                                        continue;
                                    }
                                }
                                if (str2 == null) {
                                    if (!a.equals(f3162z[75])) {
                                        break;
                                    }
                                    str2 = a;
                                } else {
                                    break;
                                }
                            }
                        } else {
                            throw new C1066d(f3162z[74] + str);
                        }
                    } catch (C1066d e2) {
                        throw e2;
                    } catch (C1066d e22) {
                        throw e22;
                    } catch (C1066d e222) {
                        throw e222;
                    } catch (C1066d e2222) {
                        throw e2222;
                    } catch (Throwable th) {
                        s.m7810m();
                    }
                }
                C1063b r = m7756r(a);
                if (s.m7799b('/')) {
                    s.m7804g();
                    a = s.m7793a(' ');
                    if (a == null) {
                        throw new C1066d(f3162z[76]);
                    }
                    m7744f(a);
                    s.m7804g();
                }
                c1084x.m7871a(m7749k(s.m7806i()), i, r, Integer.MIN_VALUE);
                s.m7810m();
            }
        } catch (C1066d e22222) {
            throw e22222;
        }
    }

    /* renamed from: a */
    private final void m7735a(C1060y c1060y, Attributes attributes) throws C1066d {
        String str = null;
        int length = attributes.getLength();
        int i = 0;
        while (i < length) {
            String localName = attributes.getLocalName(i);
            C1068g attributeByName = C1068g.getAttributeByName(localName);
            String trim = attributes.getValue(i).trim();
            try {
                switch (vb.f3233b[attributeByName.ordinal()]) {
                    case 1:
                        ((C1061z) C1074n.m7730a(C1061z.class, (yb) c1060y)).m7589a(trim);
                        localName = str;
                        continue;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        m7733a(((C1061z) C1074n.m7730a(C1061z.class, (yb) c1060y)).m7592i(), attributeByName, trim);
                        localName = str;
                        continue;
                    case 24:
                        localName = trim;
                        continue;
                    case 25:
                        ((C1065m) C1074n.m7730a(C1065m.class, (yb) c1060y)).mo3336a(m7750l(trim));
                        localName = str;
                        continue;
                    case 26:
                        ((cb) C1074n.m7730a(cb.class, (yb) c1060y)).mo3336a(m7750l(trim));
                        localName = str;
                        continue;
                    case 27:
                        m7737a((C1061z) C1074n.m7730a(C1061z.class, (yb) c1060y), trim);
                        localName = str;
                        continue;
                    case 28:
                        try {
                            if (f3152a.equals(attributes.getURI(i))) {
                                ((C1061z) C1074n.m7730a(C1061z.class, (yb) c1060y)).mo3335a(attributeByName, trim);
                                localName = str;
                                break;
                            }
                            localName = str;
                            continue;
                        } catch (C1066d e) {
                            throw e;
                        }
                    case 29:
                        ((C1061z) C1074n.m7730a(C1061z.class, (yb) c1060y)).mo3339a(attributeByName, m7745g(trim));
                        localName = str;
                        continue;
                    case 30:
                        ((C1061z) C1074n.m7730a(C1061z.class, (yb) c1060y)).mo3339a(attributeByName, m7729a(trim));
                        localName = str;
                        continue;
                    case 31:
                    case 32:
                        ((C1061z) C1074n.m7730a(C1061z.class, (yb) c1060y)).mo3335a(attributeByName, trim);
                        localName = str;
                        continue;
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                        try {
                            if (!(c1060y instanceof jb)) {
                                ((C1061z) C1074n.m7730a(C1061z.class, (yb) c1060y)).mo3334a(attributeByName, m7744f(trim));
                                localName = str;
                                break;
                            }
                            m7732a(attributeByName, (C1061z) C1074n.m7730a(C1061z.class, (yb) c1060y), trim);
                            localName = str;
                            continue;
                        } catch (C1066d e2) {
                            throw e2;
                        }
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        ((C1061z) C1074n.m7730a(C1061z.class, (yb) c1060y)).mo3334a(attributeByName, m7744f(trim));
                        localName = str;
                        continue;
                    case 50:
                        ((C1061z) C1074n.m7730a(C1061z.class, (yb) c1060y)).mo3333a(attributeByName, m7748j(trim));
                        localName = str;
                        continue;
                    case 51:
                        ((C1061z) C1074n.m7730a(C1061z.class, (yb) c1060y)).mo3343a(attributeByName, m7753o(trim));
                        localName = str;
                        continue;
                    case 52:
                        ((C1061z) C1074n.m7730a(C1061z.class, (yb) c1060y)).mo3335a(attributeByName, trim);
                        localName = str;
                        continue;
                    case 53:
                    case 54:
                        C0691a.m2856a(f3162z[8] + localName + f3162z[7]);
                        break;
                }
                localName = str;
                i++;
                str = localName;
            } catch (C1066d e22) {
                throw e22;
            }
        }
        if (str != null) {
            try {
                m7739b(((C1061z) C1074n.m7730a(C1061z.class, (yb) c1060y)).m7592i(), str);
            } catch (C1066d e222) {
                throw e222;
            }
        }
    }

    /* renamed from: a */
    private void m7736a(yb ybVar, boolean z, boolean z2) {
        int i = 1;
        int i2 = 0;
        int i3;
        if (ybVar instanceof jb) {
            jb jbVar = (jb) ybVar;
            int l = jbVar.m7603l();
            i3 = 0;
            for (yb a : jbVar.mo3332d()) {
                m7736a(a, i3 == 0, i3 >= l + -1);
                i3++;
            }
        } else if (ybVar instanceof ub) {
            ub ubVar = (ub) ybVar;
            String d = ubVar.m7819d();
            try {
                if (!C0808l.m4053k(d)) {
                    i3 = d.length();
                    char[] toCharArray = d.toCharArray();
                    int i4 = 0;
                    while (i4 < i3) {
                        try {
                            if (toCharArray[i4] > ' ') {
                                break;
                            }
                            i4++;
                        } catch (NumberFormatException e) {
                            throw e;
                        }
                    }
                    i3 -= i4;
                    while (i3 > 0) {
                        try {
                            if (toCharArray[(i4 + i3) - 1] > ' ') {
                                break;
                            }
                            i3--;
                        } catch (NumberFormatException e2) {
                            throw e2;
                        }
                    }
                    if (i3 != 0) {
                        if (i4 <= 0 || z) {
                            i2 = i4;
                            i = i3;
                        } else {
                            i4--;
                            try {
                                toCharArray[i4] = ' ';
                                i2 = i4;
                                i = i3 + 1;
                            } catch (NumberFormatException e22) {
                                throw e22;
                            }
                        }
                        try {
                            if (i2 + i < d.length() && !z2) {
                                toCharArray[i2 + i] = ' ';
                                i++;
                            }
                        } catch (NumberFormatException e222) {
                            throw e222;
                        } catch (NumberFormatException e2222) {
                            throw e2222;
                        }
                    } else if (z || z2) {
                        i2 = i4;
                        i = i3;
                    } else {
                        toCharArray[0] = ' ';
                    }
                    ubVar.m7818b(new String(toCharArray, i2, i));
                }
            } catch (NumberFormatException e22222) {
                throw e22222;
            }
        }
    }

    /* renamed from: a */
    private final void m7737a(C1061z c1061z, String str) throws C1066d {
        C1081u s = m7757s(str);
        try {
            s.m7804g();
            while (!s.m7798b()) {
                float e = s.m7802e();
                if (Float.isNaN(e)) {
                    throw new C1066d(f3162z[1]);
                }
                s.m7814q();
                float e2 = s.m7802e();
                if (Float.isNaN(e2)) {
                    throw new C1066d(f3162z[0]);
                }
                s.m7814q();
                c1061z.mo3339a(C1068g.points, e);
                c1061z.mo3339a(C1068g.points, e2);
            }
            s.m7810m();
        } catch (C1066d e3) {
            throw e3;
        } catch (C1066d e32) {
            throw e32;
        } catch (Throwable th) {
            s.m7810m();
        }
    }

    /* renamed from: a */
    private static float[] m7738a(double d, double d2) {
        int ceil = (int) Math.ceil(Math.abs(d2) / 90.0d);
        double toRadians = Math.toRadians(d);
        float toRadians2 = (float) (Math.toRadians(d2) / ((double) ceil));
        double sin = (1.3333333333333333d * Math.sin(((double) toRadians2) / 2.0d)) / (1.0d + Math.cos(((double) toRadians2) / 2.0d));
        float[] fArr = new float[(ceil * 6)];
        int i = 0;
        for (int i2 = 0; i2 < ceil; i2++) {
            double d3 = ((double) (((float) i2) * toRadians2)) + toRadians;
            double cos = Math.cos(d3);
            double sin2 = Math.sin(d3);
            int i3 = i + 1;
            fArr[i] = (float) (cos - (sin * sin2));
            i = i3 + 1;
            fArr[i3] = (float) ((cos * sin) + sin2);
            d3 += (double) toRadians2;
            cos = Math.cos(d3);
            d3 = Math.sin(d3);
            i3 = i + 1;
            fArr[i] = (float) ((sin * d3) + cos);
            i = i3 + 1;
            fArr[i3] = (float) (d3 - (sin * cos));
            i3 = i + 1;
            fArr[i] = (float) cos;
            i = i3 + 1;
            fArr[i3] = (float) d3;
        }
        return fArr;
    }

    /* renamed from: b */
    private final void m7739b(C1084x c1084x, String str) throws C1066d {
        C1081u s = m7757s(str.replaceAll(f3162z[49], ""));
        while (true) {
            String a = s.m7793a(':');
            try {
                s.m7804g();
                if (!s.m7799b(':')) {
                    break;
                }
                s.m7804g();
                String a2 = s.m7793a(';');
                if (a2 == null) {
                    break;
                }
                s.m7804g();
                if (s.m7798b() || s.m7799b(';')) {
                    C1068g attributeByName = C1068g.getAttributeByName(a);
                    if (attributeByName != null) {
                        m7733a(c1084x, attributeByName, a2);
                    }
                    s.m7804g();
                }
            } catch (C1066d e) {
                throw e;
            } catch (C1066d e2) {
                throw e2;
            } catch (C1066d e22) {
                throw e22;
            } catch (Throwable th) {
                s.m7810m();
            }
        }
        s.m7810m();
    }

    /* renamed from: b */
    private final boolean m7740b(String str) throws C1066d {
        try {
            if (!str.equals(f3162z[29])) {
                if (!str.equals(f3162z[19])) {
                    try {
                        if (!str.equals(f3162z[17])) {
                            try {
                                if (!str.equals(f3162z[25])) {
                                    try {
                                        if (!str.equals(f3162z[18])) {
                                            try {
                                                if (!str.equals(f3162z[20])) {
                                                    try {
                                                        if (!str.equals(f3162z[15])) {
                                                            try {
                                                                if (!str.equals(f3162z[24])) {
                                                                    try {
                                                                        if (!str.equals(f3162z[13])) {
                                                                            try {
                                                                                if (!str.equals(f3162z[26])) {
                                                                                    try {
                                                                                        if (!str.equals(f3162z[28])) {
                                                                                            try {
                                                                                                if (!str.equals(f3162z[23])) {
                                                                                                    try {
                                                                                                        if (!str.equals(f3162z[16])) {
                                                                                                            try {
                                                                                                                if (!str.equals(f3162z[14])) {
                                                                                                                    try {
                                                                                                                        if (!str.equals(f3162z[22])) {
                                                                                                                            try {
                                                                                                                                if (!str.equals(f3162z[27])) {
                                                                                                                                    try {
                                                                                                                                        if (!str.equals(f3160q)) {
                                                                                                                                            throw new C1066d(f3162z[21] + str);
                                                                                                                                        }
                                                                                                                                    } catch (C1066d e) {
                                                                                                                                        throw e;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            } catch (C1066d e2) {
                                                                                                                                throw e2;
                                                                                                                            }
                                                                                                                        }
                                                                                                                    } catch (C1066d e22) {
                                                                                                                        throw e22;
                                                                                                                    }
                                                                                                                }
                                                                                                            } catch (C1066d e222) {
                                                                                                                throw e222;
                                                                                                            }
                                                                                                        }
                                                                                                    } catch (C1066d e2222) {
                                                                                                        throw e2222;
                                                                                                    }
                                                                                                }
                                                                                            } catch (C1066d e22222) {
                                                                                                throw e22222;
                                                                                            }
                                                                                        }
                                                                                    } catch (C1066d e222222) {
                                                                                        throw e222222;
                                                                                    }
                                                                                }
                                                                            } catch (C1066d e2222222) {
                                                                                throw e2222222;
                                                                            }
                                                                        }
                                                                    } catch (C1066d e22222222) {
                                                                        throw e22222222;
                                                                    }
                                                                }
                                                            } catch (C1066d e222222222) {
                                                                throw e222222222;
                                                            }
                                                        }
                                                    } catch (C1066d e2222222222) {
                                                        throw e2222222222;
                                                    }
                                                }
                                            } catch (C1066d e22222222222) {
                                                throw e22222222222;
                                            }
                                        }
                                    } catch (C1066d e222222222222) {
                                        throw e222222222222;
                                    }
                                }
                            } catch (C1066d e2222222222222) {
                                throw e2222222222222;
                            }
                        }
                    } catch (C1066d e22222222222222) {
                        throw e22222222222222;
                    }
                }
            }
            try {
                return !str.equals(f3160q);
            } catch (C1066d e222222222222222) {
                throw e222222222222222;
            }
        } catch (C1066d e2222222222222222) {
            throw e2222222222222222;
        } catch (C1066d e22222222222222222) {
            throw e22222222222222222;
        }
    }

    /* renamed from: c */
    private final C1063b[] m7741c(String str) throws C1066d {
        C1063b[] c1063bArr = null;
        try {
            if (!str.equals(f3160q)) {
                C1081u s = m7757s(str);
                try {
                    s.m7804g();
                    if (s.m7798b()) {
                        s.m7810m();
                    } else {
                        C1063b f = s.m7803f();
                        if (f == null) {
                            s.m7810m();
                        } else {
                            float c = f.m7607c();
                            if (c < 0.0f) {
                                throw new C1066d(f3162z[43]);
                            }
                            List linkedList = new LinkedList();
                            linkedList.add(f);
                            while (!s.m7798b()) {
                                s.m7814q();
                                f = s.m7803f();
                                if (f == null) {
                                    throw new C1066d(f3162z[44] + str);
                                }
                                float c2 = f.m7607c();
                                if (c2 < 0.0f) {
                                    throw new C1066d(f3162z[43]);
                                }
                                linkedList.add(f);
                                c += c2;
                            }
                            if (c == 0.0f) {
                                s.m7810m();
                            } else {
                                c1063bArr = (C1063b[]) linkedList.toArray(new C1063b[linkedList.size()]);
                                s.m7810m();
                            }
                        }
                    }
                } catch (C1066d e) {
                    throw e;
                } catch (C1066d e2) {
                    throw e2;
                } catch (C1066d e22) {
                    throw e22;
                } catch (Throwable th) {
                    s.m7810m();
                }
            }
            return c1063bArr;
        } catch (C1066d e222) {
            throw e222;
        }
    }

    /* renamed from: d */
    private final int m7742d(String str) throws C1066d {
        try {
            if (str.equals(f3162z[33])) {
                return 0;
            }
            try {
                if (str.equals(f3162z[31])) {
                    return 1;
                }
                try {
                    if (str.equals(f3162z[30])) {
                        return 2;
                    }
                    throw new C1066d(f3162z[32] + str);
                } catch (C1066d e) {
                    throw e;
                }
            } catch (C1066d e2) {
                throw e2;
            }
        } catch (C1066d e22) {
            throw e22;
        }
    }

    /* renamed from: e */
    private final int m7743e(String str) throws C1066d {
        try {
            if (!C0808l.m4053k(str)) {
                try {
                    return Integer.parseInt(str);
                } catch (NumberFormatException e) {
                }
            }
            throw new C1066d(f3162z[73] + str);
        } catch (C1066d e2) {
            throw e2;
        }
    }

    /* renamed from: f */
    private final C1063b m7744f(String str) throws C1066d {
        try {
            if (C0808l.m4053k(str)) {
                throw new C1066d(f3162z[96]);
            }
            C1081u s = m7757s(str);
            try {
                C1063b f = s.m7803f();
                if (f != null) {
                    return f;
                }
                throw new C1066d(f3162z[95] + str);
            } finally {
                s.m7810m();
            }
        } catch (C1066d e) {
            throw e;
        }
    }

    /* renamed from: g */
    private final float m7745g(String str) throws C1066d {
        try {
            if (C0808l.m4053k(str)) {
                throw new C1066d(f3162z[53]);
            }
            int length = str.length();
            try {
                int i = str.charAt(length + -1) == '%' ? 1 : 0;
                if (i != 0) {
                    str = str.substring(0, length - 1);
                }
                try {
                    float parseFloat = Float.parseFloat(str);
                    if (i != 0) {
                        parseFloat /= 100.0f;
                    }
                    return Math.max(Math.min(100.0f, parseFloat), 0.0f);
                } catch (NumberFormatException e) {
                    throw new C1066d(f3162z[52]);
                }
            } catch (NumberFormatException e2) {
                throw e2;
            }
        } catch (NumberFormatException e22) {
            throw e22;
        }
    }

    /* renamed from: h */
    private final int m7746h(String str) throws C1066d {
        try {
            if (str.equals(f3162z[10])) {
                return C1084x.f3269t;
            }
            try {
                if (str.equals(f3162z[40])) {
                    return C1084x.f3262h;
                }
                try {
                    if (str.equals(f3162z[38])) {
                        return 1;
                    }
                    try {
                        if (str.equals(f3162z[41])) {
                            return -1;
                        }
                        int d = C0725i.m3064d(str);
                        if (d >= 100 && d <= 900) {
                            try {
                                if (d % 100 == 0) {
                                    return d;
                                }
                            } catch (C1066d e) {
                                throw e;
                            }
                        }
                        throw new C1066d(f3162z[39] + str);
                    } catch (C1066d e2) {
                        throw e2;
                    }
                } catch (C1066d e22) {
                    throw e22;
                }
            } catch (C1066d e222) {
                throw e222;
            }
        } catch (C1066d e2222) {
            throw e2222;
        }
    }

    /* renamed from: i */
    private final C1359y m7747i(String str) throws C1066d {
        try {
            if (f3162z[71].equals(str)) {
                return C1359y.MITER;
            }
            try {
                if (f3162z[3].equals(str)) {
                    return C1359y.ROUND;
                }
                try {
                    if (f3162z[72].equals(str)) {
                        return C1359y.BEVEL;
                    }
                    throw new C1066d(f3162z[70] + str);
                } catch (C1066d e) {
                    throw e;
                }
            } catch (C1066d e2) {
                throw e2;
            }
        } catch (C1066d e22) {
            throw e22;
        }
    }

    /* renamed from: j */
    private final RectF m7748j(String str) throws C1066d {
        C1081u s = m7757s(str);
        try {
            s.m7804g();
            float e = s.m7802e();
            s.m7814q();
            float e2 = s.m7802e();
            s.m7814q();
            float e3 = s.m7802e();
            s.m7814q();
            float e4 = s.m7802e();
            try {
                if (!Float.isNaN(e)) {
                    if (!Float.isNaN(e2)) {
                        try {
                            if (!Float.isNaN(e3)) {
                                if (!Float.isNaN(e4)) {
                                    if (e3 < 0.0f || e4 < 0.0f) {
                                        throw new C1066d(f3162z[50]);
                                    }
                                    RectF rectF = new RectF(e, e2, e3 + e, e4 + e2);
                                    s.m7810m();
                                    return rectF;
                                }
                            }
                        } catch (C1066d e5) {
                            throw e5;
                        }
                    }
                }
                throw new C1066d(f3162z[51]);
            } catch (C1066d e52) {
                throw e52;
            } catch (C1066d e522) {
                throw e522;
            }
        } catch (C1066d e5222) {
            throw e5222;
        } catch (C1066d e52222) {
            throw e52222;
        } catch (Throwable th) {
            s.m7810m();
        }
    }

    /* renamed from: k */
    private final List<String> m7749k(String str) throws C1066d {
        C1081u s = m7757s(str);
        List<String> list = null;
        while (s.m7798b()) {
            Object j = s.m7807j();
            if (j == null) {
                j = s.m7793a(',');
            }
            if (j == null) {
                break;
            }
            if (list == null) {
                try {
                    list = new LinkedList();
                } catch (Throwable th) {
                    s.m7810m();
                }
            }
            list.add(j);
            s.m7814q();
        }
        s.m7810m();
        return list;
    }

    /* renamed from: l */
    private Matrix m7750l(String str) throws C1066d {
        Matrix matrix = new Matrix();
        C1081u s = m7757s(str);
        s.m7804g();
        while (!s.m7798b()) {
            String n = s.m7811n();
            if (n == null) {
                throw new C1066d(f3162z[65]);
            }
            float e;
            float e2;
            float e3;
            if (n.equals(f3162z[58])) {
                s.m7804g();
                e = s.m7802e();
                s.m7814q();
                e2 = s.m7802e();
                s.m7814q();
                e3 = s.m7802e();
                s.m7814q();
                float e4 = s.m7802e();
                s.m7814q();
                float e5 = s.m7802e();
                s.m7814q();
                float e6 = s.m7802e();
                try {
                    s.m7804g();
                    if (!Float.isNaN(e6)) {
                        if (s.m7799b(')')) {
                            Matrix matrix2 = new Matrix();
                            matrix2.setValues(new float[]{e, e3, e5, e2, e4, e6, 0.0f, 0.0f, 1.0f});
                            matrix.preConcat(matrix2);
                        }
                    }
                    throw new C1066d(f3162z[64]);
                } catch (C1066d e7) {
                    throw e7;
                } catch (C1066d e72) {
                    throw e72;
                } catch (C1066d e722) {
                    throw e722;
                } catch (C1066d e7222) {
                    throw e7222;
                } catch (C1066d e72222) {
                    throw e72222;
                } catch (C1066d e722222) {
                    throw e722222;
                } catch (C1066d e7222222) {
                    throw e7222222;
                } catch (C1066d e72222222) {
                    throw e72222222;
                } catch (C1066d e722222222) {
                    throw e722222222;
                } catch (C1066d e7222222222) {
                    throw e7222222222;
                } catch (C1066d e72222222222) {
                    throw e72222222222;
                } catch (C1066d e722222222222) {
                    throw e722222222222;
                } catch (C1066d e7222222222222) {
                    throw e7222222222222;
                } catch (C1066d e72222222222222) {
                    throw e72222222222222;
                } catch (C1066d e722222222222222) {
                    throw e722222222222222;
                } catch (C1066d e7222222222222222) {
                    throw e7222222222222222;
                } catch (C1066d e72222222222222222) {
                    throw e72222222222222222;
                } catch (C1066d e722222222222222222) {
                    throw e722222222222222222;
                } catch (Throwable th) {
                    s.m7810m();
                }
            } else if (n.equals(f3162z[54])) {
                s.m7804g();
                e2 = s.m7802e();
                e = s.m7812o();
                s.m7804g();
                if (!Float.isNaN(e2)) {
                    if (s.m7799b(')')) {
                        if (Float.isNaN(e)) {
                            e = 0.0f;
                        }
                        matrix.preTranslate(e2, e);
                    }
                }
                throw new C1066d(f3162z[66]);
            } else if (n.equals(f3162z[57])) {
                s.m7804g();
                e2 = s.m7802e();
                e = s.m7812o();
                s.m7804g();
                if (!Float.isNaN(e2)) {
                    if (s.m7799b(')')) {
                        if (Float.isNaN(e)) {
                            e = e2;
                        }
                        matrix.preScale(e2, e);
                    }
                }
                throw new C1066d(f3162z[61]);
            } else if (n.equals(f3162z[59])) {
                s.m7804g();
                e = s.m7802e();
                e2 = s.m7812o();
                e3 = s.m7812o();
                s.m7804g();
                if (!Float.isNaN(e)) {
                    if (s.m7799b(')')) {
                        if (Float.isNaN(e2)) {
                            matrix.preRotate(e);
                        } else if (Float.isNaN(e3)) {
                            throw new C1066d(f3162z[67]);
                        } else {
                            matrix.preRotate(e, e2, e3);
                        }
                    }
                }
                throw new C1066d(f3162z[67]);
            } else if (n.equals(f3162z[63])) {
                s.m7804g();
                e = s.m7802e();
                s.m7804g();
                if (!Float.isNaN(e)) {
                    if (s.m7799b(')')) {
                        matrix.preSkew((float) Math.tan(Math.toRadians((double) e)), 0.0f);
                    }
                }
                throw new C1066d(f3162z[60]);
            } else if (n.equals(f3162z[62])) {
                s.m7804g();
                e = s.m7802e();
                s.m7804g();
                if (!Float.isNaN(e)) {
                    if (s.m7799b(')')) {
                        matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians((double) e)));
                    }
                }
                throw new C1066d(f3162z[55]);
            } else if (n != null) {
                throw new C1066d(f3162z[56]);
            }
            s.m7804g();
        }
        s.m7810m();
        return matrix;
    }

    /* renamed from: m */
    private final C1064c m7751m(String str) throws C1066d {
        int indexOf;
        if (str.startsWith(f3157l)) {
            indexOf = str.indexOf(41);
            if (indexOf == -1) {
                try {
                    throw new C1066d("");
                } catch (NumberFormatException e) {
                    throw e;
                }
            }
            String trim = str.substring(f3157l.length(), indexOf).trim();
            C1064c c1064c = null;
            String substring = str.substring(indexOf + 1);
            if (substring.length() > 0) {
                c1064c = m7751m(substring);
            }
            return new C1073l(trim, c1064c);
        }
        try {
            if (str.equals(f3160q)) {
                return null;
            }
            try {
                if (str.equals(f3156j)) {
                    return C1064c.f3082b;
                }
                if (str.charAt(0) == '#') {
                    String substring2;
                    try {
                        substring2 = str.substring(1);
                        try {
                            indexOf = substring2.length();
                            if (indexOf == 6) {
                                return C1079s.m7786a(Integer.parseInt(substring2, 16));
                            }
                            if (indexOf == 3) {
                                indexOf = Integer.parseInt(substring2, 16);
                                return C1079s.m7786a((indexOf & 15) | ((((((indexOf & C0542t.f1182X) << 16) | ((indexOf & C0542t.f1182X) << 12)) | ((indexOf & 240) << 8)) | ((indexOf & 240) << 4)) | ((indexOf & 15) << 4)));
                            }
                            throw new C1066d(f3162z[46] + substring2);
                        } catch (NumberFormatException e2) {
                        }
                    } catch (NumberFormatException e3) {
                        substring2 = str;
                    }
                } else if (str.toLowerCase().startsWith(f3161s)) {
                    C1081u s = m7757s(str.substring(f3161s.length()));
                    try {
                        s.m7804g();
                        int i = 0;
                        for (indexOf = 2; indexOf >= 0; indexOf--) {
                            if (indexOf < 2) {
                                if (!s.m7814q()) {
                                    throw new C1066d(f3162z[45]);
                                }
                            }
                            int d = s.m7801d();
                            if (d == Integer.MIN_VALUE) {
                                throw new C1066d(f3162z[47]);
                            }
                            i |= (s.m7799b('%') ? (Math.max(0, Math.min(100, d)) * 255) / 100 : Math.max(0, Math.min(255, d))) << (indexOf * 8);
                        }
                        s.m7804g();
                        if (s.m7799b(')')) {
                            s.m7810m();
                            return C1079s.m7786a(i);
                        }
                        throw new C1066d(f3162z[47]);
                    } catch (NumberFormatException e4) {
                        throw e4;
                    } catch (NumberFormatException e42) {
                        throw e42;
                    } catch (NumberFormatException e422) {
                        throw e422;
                    } catch (Throwable th) {
                        s.m7810m();
                    }
                } else {
                    C1077q systemColorByName = C1077q.getSystemColorByName(str);
                    if (systemColorByName != null) {
                        try {
                            return C1079s.m7786a(systemColorByName.getColor());
                        } catch (NumberFormatException e4222) {
                            throw e4222;
                        }
                    }
                    throw new C1066d(f3162z[48]);
                }
            } catch (NumberFormatException e42222) {
                throw e42222;
            }
        } catch (NumberFormatException e422222) {
            throw e422222;
        }
    }

    /* renamed from: n */
    private final boolean m7752n(String str) throws C1066d {
        try {
            if (!str.equals(f3162z[37])) {
                if (!str.equals(f3162z[35])) {
                    try {
                        if (!str.equals(f3162z[36])) {
                            throw new C1066d(f3162z[34] + str);
                        }
                    } catch (C1066d e) {
                        throw e;
                    }
                }
            }
            return str.equals(f3162z[37]);
        } catch (C1066d e2) {
            throw e2;
        } catch (C1066d e22) {
            throw e22;
        }
    }

    /* renamed from: o */
    private final android.graphics.Path m7753o(java.lang.String r17) throws fr.pcsoft.wdjava.ui.p065b.p067a.C1066d {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Exception block dominator not found, method:fr.pcsoft.wdjava.ui.b.a.n.o(java.lang.String):android.graphics.Path. bs: [B:15:0x0024, B:124:0x01e1]
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:86)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/70807318.run(Unknown Source)
*/
        /*
        r16 = this;
        r0 = new android.graphics.Path;
        r0.<init>();
        r1 = fr.pcsoft.wdjava.core.utils.C0808l.m4053k(r17);	 Catch:{ d -> 0x000c }
        if (r1 == 0) goto L_0x000e;
    L_0x000b:
        return r0;
    L_0x000c:
        r0 = move-exception;
        throw r0;
    L_0x000e:
        r5 = 0;
        r6 = 0;
        r13 = 0;
        r12 = 0;
        r3 = 0;
        r4 = 0;
        r14 = r16.m7757s(r17);
        r11 = r14.m7805h();	 Catch:{ all -> 0x0032 }
        r1 = 77;
        if (r11 == r1) goto L_0x0255;
    L_0x0020:
        r1 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        if (r11 == r1) goto L_0x0255;
    L_0x0024:
        r0 = new fr.pcsoft.wdjava.ui.b.a.d;	 Catch:{ d -> 0x0030 }
        r1 = f3162z;	 Catch:{ d -> 0x0030 }
        r2 = 78;	 Catch:{ d -> 0x0030 }
        r1 = r1[r2];	 Catch:{ d -> 0x0030 }
        r0.<init>(r1);	 Catch:{ d -> 0x0030 }
        throw r0;	 Catch:{ d -> 0x0030 }
    L_0x0030:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0032 }
    L_0x0032:
        r0 = move-exception;
        r14.m7810m();
        throw r0;
    L_0x0037:
        r2 = r14.m7800c();	 Catch:{ all -> 0x0032 }
        if (r2 == 0) goto L_0x024a;	 Catch:{ all -> 0x0032 }
    L_0x003d:
        r11 = r14.m7805h();	 Catch:{ all -> 0x0032 }
        r2 = r6;	 Catch:{ all -> 0x0032 }
        r1 = r5;	 Catch:{ all -> 0x0032 }
    L_0x0043:
        r14.m7804g();	 Catch:{ all -> 0x0032 }
        switch(r11) {
            case 65: goto L_0x01e9;
            case 67: goto L_0x00ca;
            case 72: goto L_0x019f;
            case 76: goto L_0x009e;
            case 77: goto L_0x0056;
            case 81: goto L_0x0144;
            case 83: goto L_0x00ca;
            case 84: goto L_0x0144;
            case 86: goto L_0x01c4;
            case 90: goto L_0x013a;
            case 97: goto L_0x01e9;
            case 99: goto L_0x00ca;
            case 104: goto L_0x019f;
            case 108: goto L_0x009e;
            case 109: goto L_0x0056;
            case 113: goto L_0x0144;
            case 115: goto L_0x00ca;
            case 116: goto L_0x0144;
            case 118: goto L_0x01c4;
            case 122: goto L_0x013a;
            default: goto L_0x0049;
        };	 Catch:{ all -> 0x0032 }
    L_0x0049:
        r1 = f3162z;	 Catch:{ all -> 0x0032 }
        r2 = 80;	 Catch:{ all -> 0x0032 }
        r1 = r1[r2];	 Catch:{ all -> 0x0032 }
        fr.pcsoft.wdjava.core.debug.C0691a.m2856a(r1);	 Catch:{ all -> 0x0032 }
        r14.m7810m();
        goto L_0x000b;
    L_0x0056:
        r3 = r14.m7802e();	 Catch:{ all -> 0x0032 }
        r14.m7814q();	 Catch:{ all -> 0x0032 }
        r4 = r14.m7802e();	 Catch:{ all -> 0x0032 }
        r5 = java.lang.Float.isNaN(r4);	 Catch:{ all -> 0x0032 }
        if (r5 == 0) goto L_0x0074;	 Catch:{ all -> 0x0032 }
    L_0x0067:
        r1 = f3162z;	 Catch:{ all -> 0x0032 }
        r2 = 79;	 Catch:{ all -> 0x0032 }
        r1 = r1[r2];	 Catch:{ all -> 0x0032 }
        fr.pcsoft.wdjava.core.debug.C0691a.m2856a(r1);	 Catch:{ all -> 0x0032 }
        r14.m7810m();
        goto L_0x000b;
    L_0x0074:
        r5 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        if (r11 != r5) goto L_0x0080;
    L_0x0078:
        r5 = r0.isEmpty();	 Catch:{ all -> 0x0032 }
        if (r5 != 0) goto L_0x0080;	 Catch:{ all -> 0x0032 }
    L_0x007e:
        r3 = r3 + r1;	 Catch:{ all -> 0x0032 }
        r4 = r4 + r2;	 Catch:{ all -> 0x0032 }
    L_0x0080:
        r0.moveTo(r3, r4);	 Catch:{ all -> 0x0032 }
        r1 = 109; // 0x6d float:1.53E-43 double:5.4E-322;	 Catch:{ all -> 0x0032 }
        if (r11 != r1) goto L_0x009b;	 Catch:{ all -> 0x0032 }
    L_0x0087:
        r1 = 108; // 0x6c float:1.51E-43 double:5.34E-322;	 Catch:{ all -> 0x0032 }
    L_0x0089:
        r12 = r4;	 Catch:{ all -> 0x0032 }
        r13 = r3;	 Catch:{ all -> 0x0032 }
        r6 = r4;	 Catch:{ all -> 0x0032 }
        r5 = r3;	 Catch:{ all -> 0x0032 }
    L_0x008d:
        r14.m7814q();	 Catch:{ all -> 0x0032 }
        r2 = r14.m7798b();	 Catch:{ all -> 0x0032 }
        if (r2 == 0) goto L_0x0037;
    L_0x0096:
        r14.m7810m();
        goto L_0x000b;
    L_0x009b:
        r1 = 76;
        goto L_0x0089;
    L_0x009e:
        r3 = r14.m7802e();	 Catch:{ all -> 0x0032 }
        r14.m7814q();	 Catch:{ all -> 0x0032 }
        r4 = r14.m7802e();	 Catch:{ all -> 0x0032 }
        r5 = java.lang.Float.isNaN(r4);	 Catch:{ all -> 0x0032 }
        if (r5 == 0) goto L_0x00bd;	 Catch:{ all -> 0x0032 }
    L_0x00af:
        r1 = f3162z;	 Catch:{ all -> 0x0032 }
        r2 = 79;	 Catch:{ all -> 0x0032 }
        r1 = r1[r2];	 Catch:{ all -> 0x0032 }
        fr.pcsoft.wdjava.core.debug.C0691a.m2856a(r1);	 Catch:{ all -> 0x0032 }
        r14.m7810m();
        goto L_0x000b;
    L_0x00bd:
        r5 = 108; // 0x6c float:1.51E-43 double:5.34E-322;
        if (r11 != r5) goto L_0x00c3;
    L_0x00c1:
        r3 = r3 + r1;
        r4 = r4 + r2;
    L_0x00c3:
        r0.lineTo(r3, r4);	 Catch:{ all -> 0x0032 }
        r1 = r11;	 Catch:{ all -> 0x0032 }
        r6 = r4;	 Catch:{ all -> 0x0032 }
        r5 = r3;	 Catch:{ all -> 0x0032 }
        goto L_0x008d;	 Catch:{ all -> 0x0032 }
    L_0x00ca:
        r5 = 83;	 Catch:{ all -> 0x0032 }
        if (r11 == r5) goto L_0x00d2;	 Catch:{ all -> 0x0032 }
    L_0x00ce:
        r5 = 115; // 0x73 float:1.61E-43 double:5.7E-322;	 Catch:{ all -> 0x0032 }
        if (r11 != r5) goto L_0x010c;	 Catch:{ all -> 0x0032 }
    L_0x00d2:
        r5 = 1;	 Catch:{ all -> 0x0032 }
        r9 = r5;	 Catch:{ all -> 0x0032 }
    L_0x00d4:
        if (r9 == 0) goto L_0x010f;	 Catch:{ all -> 0x0032 }
    L_0x00d6:
        r5 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;	 Catch:{ all -> 0x0032 }
        r5 = r5 * r1;	 Catch:{ all -> 0x0032 }
        r5 = r5 - r3;	 Catch:{ all -> 0x0032 }
        r3 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;	 Catch:{ all -> 0x0032 }
        r3 = r3 * r2;	 Catch:{ all -> 0x0032 }
        r3 = r3 - r4;	 Catch:{ all -> 0x0032 }
        r4 = r5;	 Catch:{ all -> 0x0032 }
    L_0x00df:
        r8 = r14.m7802e();	 Catch:{ all -> 0x0032 }
        r14.m7814q();	 Catch:{ all -> 0x0032 }
        r7 = r14.m7802e();	 Catch:{ all -> 0x0032 }
        r14.m7814q();	 Catch:{ all -> 0x0032 }
        r5 = r14.m7802e();	 Catch:{ all -> 0x0032 }
        r14.m7814q();	 Catch:{ all -> 0x0032 }
        r6 = r14.m7802e();	 Catch:{ all -> 0x0032 }
        r10 = java.lang.Float.isNaN(r6);	 Catch:{ all -> 0x0032 }
        if (r10 == 0) goto L_0x011e;	 Catch:{ all -> 0x0032 }
    L_0x00fe:
        r1 = f3162z;	 Catch:{ all -> 0x0032 }
        r2 = 79;	 Catch:{ all -> 0x0032 }
        r1 = r1[r2];	 Catch:{ all -> 0x0032 }
        fr.pcsoft.wdjava.core.debug.C0691a.m2856a(r1);	 Catch:{ all -> 0x0032 }
        r14.m7810m();
        goto L_0x000b;
    L_0x010c:
        r5 = 0;
        r9 = r5;
        goto L_0x00d4;
    L_0x010f:
        r4 = r14.m7802e();	 Catch:{ all -> 0x0032 }
        r14.m7814q();	 Catch:{ all -> 0x0032 }
        r3 = r14.m7802e();	 Catch:{ all -> 0x0032 }
        r14.m7814q();	 Catch:{ all -> 0x0032 }
        goto L_0x00df;	 Catch:{ all -> 0x0032 }
    L_0x011e:
        r10 = 99;	 Catch:{ all -> 0x0032 }
        if (r11 == r10) goto L_0x0126;	 Catch:{ all -> 0x0032 }
    L_0x0122:
        r10 = 115; // 0x73 float:1.61E-43 double:5.7E-322;	 Catch:{ all -> 0x0032 }
        if (r11 != r10) goto L_0x024f;	 Catch:{ all -> 0x0032 }
    L_0x0126:
        r5 = r5 + r1;	 Catch:{ all -> 0x0032 }
        r6 = r6 + r2;	 Catch:{ all -> 0x0032 }
        if (r9 != 0) goto L_0x012c;	 Catch:{ all -> 0x0032 }
    L_0x012a:
        r4 = r4 + r1;	 Catch:{ all -> 0x0032 }
        r3 = r3 + r2;	 Catch:{ all -> 0x0032 }
    L_0x012c:
        r8 = r8 + r1;	 Catch:{ all -> 0x0032 }
        r1 = r7 + r2;	 Catch:{ all -> 0x0032 }
        r2 = r3;	 Catch:{ all -> 0x0032 }
        r3 = r8;	 Catch:{ all -> 0x0032 }
        r15 = r1;	 Catch:{ all -> 0x0032 }
        r1 = r4;	 Catch:{ all -> 0x0032 }
        r4 = r15;	 Catch:{ all -> 0x0032 }
    L_0x0134:
        r0.cubicTo(r1, r2, r3, r4, r5, r6);	 Catch:{ all -> 0x0032 }
        r1 = r11;	 Catch:{ all -> 0x0032 }
        goto L_0x008d;	 Catch:{ all -> 0x0032 }
    L_0x013a:
        r0.close();	 Catch:{ all -> 0x0032 }
        r1 = r11;	 Catch:{ all -> 0x0032 }
        r4 = r12;	 Catch:{ all -> 0x0032 }
        r3 = r13;	 Catch:{ all -> 0x0032 }
        r6 = r12;	 Catch:{ all -> 0x0032 }
        r5 = r13;	 Catch:{ all -> 0x0032 }
        goto L_0x008d;	 Catch:{ all -> 0x0032 }
    L_0x0144:
        r5 = 84;	 Catch:{ all -> 0x0032 }
        if (r11 == r5) goto L_0x014c;	 Catch:{ all -> 0x0032 }
    L_0x0148:
        r5 = 116; // 0x74 float:1.63E-43 double:5.73E-322;	 Catch:{ all -> 0x0032 }
        if (r11 != r5) goto L_0x0179;	 Catch:{ all -> 0x0032 }
    L_0x014c:
        r5 = 1;	 Catch:{ all -> 0x0032 }
        r7 = r5;	 Catch:{ all -> 0x0032 }
    L_0x014e:
        if (r7 == 0) goto L_0x017c;	 Catch:{ all -> 0x0032 }
    L_0x0150:
        r5 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;	 Catch:{ all -> 0x0032 }
        r5 = r5 * r1;	 Catch:{ all -> 0x0032 }
        r3 = r5 - r3;	 Catch:{ all -> 0x0032 }
        r5 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;	 Catch:{ all -> 0x0032 }
        r5 = r5 * r2;	 Catch:{ all -> 0x0032 }
        r4 = r5 - r4;	 Catch:{ all -> 0x0032 }
    L_0x015a:
        r5 = r14.m7802e();	 Catch:{ all -> 0x0032 }
        r14.m7814q();	 Catch:{ all -> 0x0032 }
        r6 = r14.m7802e();	 Catch:{ all -> 0x0032 }
        r8 = java.lang.Float.isNaN(r6);	 Catch:{ all -> 0x0032 }
        if (r8 == 0) goto L_0x018b;	 Catch:{ all -> 0x0032 }
    L_0x016b:
        r1 = f3162z;	 Catch:{ all -> 0x0032 }
        r2 = 79;	 Catch:{ all -> 0x0032 }
        r1 = r1[r2];	 Catch:{ all -> 0x0032 }
        fr.pcsoft.wdjava.core.debug.C0691a.m2856a(r1);	 Catch:{ all -> 0x0032 }
        r14.m7810m();
        goto L_0x000b;
    L_0x0179:
        r5 = 0;
        r7 = r5;
        goto L_0x014e;
    L_0x017c:
        r3 = r14.m7802e();	 Catch:{ all -> 0x0032 }
        r14.m7814q();	 Catch:{ all -> 0x0032 }
        r4 = r14.m7802e();	 Catch:{ all -> 0x0032 }
        r14.m7814q();	 Catch:{ all -> 0x0032 }
        goto L_0x015a;	 Catch:{ all -> 0x0032 }
    L_0x018b:
        r8 = 113; // 0x71 float:1.58E-43 double:5.6E-322;	 Catch:{ all -> 0x0032 }
        if (r11 == r8) goto L_0x0193;	 Catch:{ all -> 0x0032 }
    L_0x018f:
        r8 = 116; // 0x74 float:1.63E-43 double:5.73E-322;	 Catch:{ all -> 0x0032 }
        if (r11 != r8) goto L_0x0199;	 Catch:{ all -> 0x0032 }
    L_0x0193:
        r5 = r5 + r1;	 Catch:{ all -> 0x0032 }
        r6 = r6 + r2;	 Catch:{ all -> 0x0032 }
        if (r7 != 0) goto L_0x0199;	 Catch:{ all -> 0x0032 }
    L_0x0197:
        r3 = r3 + r1;	 Catch:{ all -> 0x0032 }
        r4 = r4 + r2;	 Catch:{ all -> 0x0032 }
    L_0x0199:
        r0.quadTo(r3, r4, r5, r6);	 Catch:{ all -> 0x0032 }
        r1 = r11;	 Catch:{ all -> 0x0032 }
        goto L_0x008d;	 Catch:{ all -> 0x0032 }
    L_0x019f:
        r3 = r14.m7802e();	 Catch:{ all -> 0x0032 }
        r5 = java.lang.Float.isNaN(r3);	 Catch:{ all -> 0x0032 }
        if (r5 == 0) goto L_0x01b7;	 Catch:{ all -> 0x0032 }
    L_0x01a9:
        r1 = f3162z;	 Catch:{ all -> 0x0032 }
        r2 = 79;	 Catch:{ all -> 0x0032 }
        r1 = r1[r2];	 Catch:{ all -> 0x0032 }
        fr.pcsoft.wdjava.core.debug.C0691a.m2856a(r1);	 Catch:{ all -> 0x0032 }
        r14.m7810m();
        goto L_0x000b;
    L_0x01b7:
        r5 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        if (r11 != r5) goto L_0x01bc;
    L_0x01bb:
        r3 = r3 + r1;
    L_0x01bc:
        r0.lineTo(r3, r2);	 Catch:{ all -> 0x0032 }
        r1 = r11;	 Catch:{ all -> 0x0032 }
        r6 = r2;	 Catch:{ all -> 0x0032 }
        r5 = r3;	 Catch:{ all -> 0x0032 }
        goto L_0x008d;	 Catch:{ all -> 0x0032 }
    L_0x01c4:
        r4 = r14.m7802e();	 Catch:{ all -> 0x0032 }
        r5 = java.lang.Float.isNaN(r4);	 Catch:{ all -> 0x0032 }
        if (r5 == 0) goto L_0x01dc;	 Catch:{ all -> 0x0032 }
    L_0x01ce:
        r1 = f3162z;	 Catch:{ all -> 0x0032 }
        r2 = 79;	 Catch:{ all -> 0x0032 }
        r1 = r1[r2];	 Catch:{ all -> 0x0032 }
        fr.pcsoft.wdjava.core.debug.C0691a.m2856a(r1);	 Catch:{ all -> 0x0032 }
        r14.m7810m();
        goto L_0x000b;
    L_0x01dc:
        r5 = 118; // 0x76 float:1.65E-43 double:5.83E-322;
        if (r11 != r5) goto L_0x01e1;
    L_0x01e0:
        r4 = r4 + r2;
    L_0x01e1:
        r0.lineTo(r1, r4);	 Catch:{ all -> 0x0032 }
        r6 = r4;	 Catch:{ all -> 0x0032 }
        r5 = r1;	 Catch:{ all -> 0x0032 }
        r1 = r11;	 Catch:{ all -> 0x0032 }
        goto L_0x008d;	 Catch:{ all -> 0x0032 }
    L_0x01e9:
        r3 = r14.m7802e();	 Catch:{ all -> 0x0032 }
        r14.m7814q();	 Catch:{ all -> 0x0032 }
        r4 = r14.m7802e();	 Catch:{ all -> 0x0032 }
        r14.m7814q();	 Catch:{ all -> 0x0032 }
        r5 = r14.m7802e();	 Catch:{ all -> 0x0032 }
        r14.m7814q();	 Catch:{ all -> 0x0032 }
        r6 = r14.m7794a();	 Catch:{ all -> 0x0032 }
        r14.m7814q();	 Catch:{ all -> 0x0032 }
        r7 = r14.m7794a();	 Catch:{ all -> 0x0032 }
        r14.m7814q();	 Catch:{ all -> 0x0032 }
        r8 = r14.m7802e();	 Catch:{ all -> 0x0032 }
        r14.m7814q();	 Catch:{ all -> 0x0032 }
        r9 = r14.m7802e();	 Catch:{ all -> 0x0032 }
        r10 = java.lang.Float.isNaN(r9);	 Catch:{ d -> 0x0235 }
        if (r10 != 0) goto L_0x0227;
    L_0x021d:
        r10 = 0;
        r10 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1));
        if (r10 < 0) goto L_0x0227;
    L_0x0222:
        r10 = 0;
        r10 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1));
        if (r10 >= 0) goto L_0x0239;
    L_0x0227:
        r1 = f3162z;	 Catch:{ all -> 0x0032 }
        r2 = 79;	 Catch:{ all -> 0x0032 }
        r1 = r1[r2];	 Catch:{ all -> 0x0032 }
        fr.pcsoft.wdjava.core.debug.C0691a.m2856a(r1);	 Catch:{ all -> 0x0032 }
        r14.m7810m();
        goto L_0x000b;
    L_0x0235:
        r0 = move-exception;
        throw r0;	 Catch:{ d -> 0x0237 }
    L_0x0237:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0032 }
    L_0x0239:
        r10 = 97;	 Catch:{ all -> 0x0032 }
        if (r11 != r10) goto L_0x023f;	 Catch:{ all -> 0x0032 }
    L_0x023d:
        r8 = r8 + r1;	 Catch:{ all -> 0x0032 }
        r9 = r9 + r2;	 Catch:{ all -> 0x0032 }
    L_0x023f:
        r10 = r0;	 Catch:{ all -> 0x0032 }
        fr.pcsoft.wdjava.ui.p065b.p067a.C1074n.m7731a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10);	 Catch:{ all -> 0x0032 }
        r1 = r11;
        r4 = r9;
        r3 = r8;
        r6 = r9;
        r5 = r8;
        goto L_0x008d;
    L_0x024a:
        r11 = r1;
        r2 = r6;
        r1 = r5;
        goto L_0x0043;
    L_0x024f:
        r2 = r3;
        r1 = r4;
        r4 = r7;
        r3 = r8;
        goto L_0x0134;
    L_0x0255:
        r2 = r6;
        r1 = r5;
        goto L_0x0043;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.ui.b.a.n.o(java.lang.String):android.graphics.Path");
    }

    /* renamed from: p */
    private final int m7754p(String str) throws C1066d {
        try {
            if (str.equals(f3162z[10])) {
                return 0;
            }
            try {
                if (str.equals(f3162z[12])) {
                    return 2;
                }
                try {
                    if (str.equals(f3162z[11])) {
                        return 2;
                    }
                    throw new C1066d(f3162z[9] + str);
                } catch (C1066d e) {
                    throw e;
                }
            } catch (C1066d e2) {
                throw e2;
            }
        } catch (C1066d e22) {
            throw e22;
        }
    }

    /* renamed from: q */
    private final C1343g m7755q(String str) throws C1066d {
        try {
            if (f3162z[5].equals(str)) {
                return C1343g.BUTT;
            }
            try {
                if (f3162z[3].equals(str)) {
                    return C1343g.ROUNDED;
                }
                try {
                    if (f3162z[6].equals(str)) {
                        return C1343g.SQUARE;
                    }
                    throw new C1066d(f3162z[4] + str);
                } catch (C1066d e) {
                    throw e;
                }
            } catch (C1066d e2) {
                throw e2;
            }
        } catch (C1066d e22) {
            throw e22;
        }
    }

    /* renamed from: r */
    private final C1063b m7756r(String str) throws C1066d {
        try {
            if (str.equals(f3162z[91])) {
                return new C1063b(0.694f, C1069h.pt);
            }
            try {
                if (str.equals(f3162z[88])) {
                    return new C1063b(0.833f, C1069h.pt);
                }
                try {
                    if (str.equals(f3162z[86])) {
                        return new C1063b(10.0f, C1069h.pt);
                    }
                    try {
                        if (str.equals(f3162z[89])) {
                            return new C1063b(12.0f, C1069h.pt);
                        }
                        try {
                            if (str.equals(f3162z[92])) {
                                return new C1063b(14.4f, C1069h.pt);
                            }
                            try {
                                if (str.equals(f3162z[90])) {
                                    return new C1063b(17.3f, C1069h.pt);
                                }
                                try {
                                    if (str.equals(f3162z[85])) {
                                        return new C1063b(20.7f, C1069h.pt);
                                    }
                                    try {
                                        if (str.equals(f3162z[94])) {
                                            return new C1063b(83.33f, C1069h.percent);
                                        }
                                        try {
                                            if (str.equals(f3162z[93])) {
                                                return new C1063b(120.0f, C1069h.percent);
                                            }
                                            C1063b f = m7744f(str);
                                            if (f != null) {
                                                return f;
                                            }
                                            throw new C1066d(f3162z[87] + str);
                                        } catch (C1066d e) {
                                            throw e;
                                        }
                                    } catch (C1066d e2) {
                                        throw e2;
                                    }
                                } catch (C1066d e22) {
                                    throw e22;
                                }
                            } catch (C1066d e222) {
                                throw e222;
                            }
                        } catch (C1066d e2222) {
                            throw e2222;
                        }
                    } catch (C1066d e22222) {
                        throw e22222;
                    }
                } catch (C1066d e222222) {
                    throw e222222;
                }
            } catch (C1066d e2222222) {
                throw e2222222;
            }
        } catch (C1066d e22222222) {
            throw e22222222;
        }
    }

    /* renamed from: s */
    private final C1081u m7757s(String str) {
        try {
            if (this.f3165e != null) {
                if (!this.f3165e.m7809l()) {
                    this.f3165e.m7797b(str);
                    return this.f3165e;
                }
            }
            this.f3165e = new C1081u(str);
            return this.f3165e;
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    /* renamed from: z */
    private static String m7758z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 12;
                    break;
                case 1:
                    i2 = 71;
                    break;
                case 2:
                    i2 = 20;
                    break;
                case 3:
                    i2 = 69;
                    break;
                default:
                    i2 = 6;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7759z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 6);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public final wb m7760a(InputStream inputStream, int i) throws C1066d {
        wb wbVar;
        try {
            this.f3170o = (i & 1) > 0;
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            xMLReader.setContentHandler(this);
            xMLReader.setProperty(f3162z[98], this);
            xMLReader.parse(new InputSource(inputStream));
            wbVar = this.f3163c;
            bb.m3844a((Closeable) inputStream);
        } catch (C1076p e) {
            if (this.f3163c != null) {
                wbVar = this.f3163c;
                bb.m3844a((Closeable) inputStream);
            } else {
                throw new C1066d(f3162z[97]);
            }
        } catch (Exception e2) {
            throw new C1066d(e2.getMessage());
        } catch (Throwable th) {
            bb.m3844a((Closeable) inputStream);
        }
        return wbVar;
    }

    /* renamed from: a */
    public void m7761a() {
        this.f3163c = null;
        this.f3169n = null;
        this.f3165e = null;
        this.f3166g = null;
        this.f3167i = null;
    }

    public void characters(char[] cArr, int i, int i2) throws SAXException {
        try {
            if (!this.f3168k) {
                try {
                    if (this.f3164d) {
                        if (this.f3167i == null) {
                            this.f3167i = new StringBuilder(i2);
                        }
                        this.f3167i.append(cArr, i, i2);
                    } else if (this.f3169n instanceof jb) {
                        jb jbVar = (jb) this.f3169n;
                        C1060y k = jbVar.m7602k();
                        try {
                            if (k instanceof ub) {
                                ((ub) k).m7817a(new String(cArr, i, i2));
                            } else {
                                jbVar.mo3331a(new ub(new String(cArr, i, i2)));
                            }
                        } catch (SAXException e) {
                            throw e;
                        }
                    }
                } catch (SAXException e2) {
                    throw e2;
                } catch (SAXException e22) {
                    throw e22;
                }
            }
        } catch (SAXException e222) {
            throw e222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void endElement(java.lang.String r5, java.lang.String r6, java.lang.String r7) throws org.xml.sax.SAXException {
        /*
        r4 = this;
        super.endElement(r5, r6, r7);	 Catch:{ SAXException -> 0x0015 }
        r0 = r4.f3168k;	 Catch:{ SAXException -> 0x0015 }
        if (r0 == 0) goto L_0x0019;
    L_0x0007:
        r0 = r4.f3171r;	 Catch:{ SAXException -> 0x0017 }
        r0 = r0 + -1;
        r4.f3171r = r0;	 Catch:{ SAXException -> 0x0017 }
        r0 = r4.f3171r;	 Catch:{ SAXException -> 0x0017 }
        if (r0 > 0) goto L_0x0014;
    L_0x0011:
        r0 = 0;
        r4.f3168k = r0;	 Catch:{ SAXException -> 0x0017 }
    L_0x0014:
        return;
    L_0x0015:
        r0 = move-exception;
        throw r0;	 Catch:{ SAXException -> 0x0017 }
    L_0x0017:
        r0 = move-exception;
        throw r0;
    L_0x0019:
        r0 = fr.pcsoft.wdjava.core.utils.C0808l.m4053k(r5);	 Catch:{ SAXException -> 0x005b }
        if (r0 != 0) goto L_0x0027;
    L_0x001f:
        r0 = f3153b;	 Catch:{ SAXException -> 0x005d }
        r0 = r5.equals(r0);	 Catch:{ SAXException -> 0x005d }
        if (r0 == 0) goto L_0x0014;
    L_0x0027:
        r0 = r4.f3164d;	 Catch:{ SAXException -> 0x005f }
        if (r0 == 0) goto L_0x0037;
    L_0x002b:
        r0 = r4.f3167i;	 Catch:{ SAXException -> 0x0061 }
        if (r0 == 0) goto L_0x0037;
    L_0x002f:
        r0 = f3158m;	 Catch:{ SAXException -> 0x0063 }
        r0 = r6.equals(r0);	 Catch:{ SAXException -> 0x0063 }
        if (r0 != 0) goto L_0x003f;
    L_0x0037:
        r0 = f3155h;	 Catch:{ SAXException -> 0x0065 }
        r0 = r6.equals(r0);	 Catch:{ SAXException -> 0x0065 }
        if (r0 == 0) goto L_0x0081;
    L_0x003f:
        r0 = 0;
        r4.f3164d = r0;	 Catch:{ SAXException -> 0x0067 }
        r0 = r4.f3166g;	 Catch:{ SAXException -> 0x0067 }
        r1 = f3158m;	 Catch:{ SAXException -> 0x0067 }
        r0 = r0.equals(r1);	 Catch:{ SAXException -> 0x0067 }
        if (r0 == 0) goto L_0x0069;
    L_0x004c:
        r0 = r4.f3163c;	 Catch:{ SAXException -> 0x0067 }
        r1 = r4.f3167i;	 Catch:{ SAXException -> 0x0067 }
        r1 = r1.toString();	 Catch:{ SAXException -> 0x0067 }
        r0.m7856d(r1);	 Catch:{ SAXException -> 0x0067 }
    L_0x0057:
        r0 = 0;
        r4.f3167i = r0;
        goto L_0x0014;
    L_0x005b:
        r0 = move-exception;
        throw r0;	 Catch:{ SAXException -> 0x005d }
    L_0x005d:
        r0 = move-exception;
        throw r0;
    L_0x005f:
        r0 = move-exception;
        throw r0;	 Catch:{ SAXException -> 0x0061 }
    L_0x0061:
        r0 = move-exception;
        throw r0;	 Catch:{ SAXException -> 0x0063 }
    L_0x0063:
        r0 = move-exception;
        throw r0;	 Catch:{ SAXException -> 0x0065 }
    L_0x0065:
        r0 = move-exception;
        throw r0;	 Catch:{ SAXException -> 0x0067 }
    L_0x0067:
        r0 = move-exception;
        throw r0;
    L_0x0069:
        r0 = r4.f3166g;	 Catch:{ SAXException -> 0x007f }
        r1 = f3155h;	 Catch:{ SAXException -> 0x007f }
        r0 = r0.equals(r1);	 Catch:{ SAXException -> 0x007f }
        if (r0 == 0) goto L_0x0057;
    L_0x0073:
        r0 = r4.f3163c;	 Catch:{ SAXException -> 0x007f }
        r1 = r4.f3167i;	 Catch:{ SAXException -> 0x007f }
        r1 = r1.toString();	 Catch:{ SAXException -> 0x007f }
        r0.m7850a(r1);	 Catch:{ SAXException -> 0x007f }
        goto L_0x0057;
    L_0x007f:
        r0 = move-exception;
        throw r0;
    L_0x0081:
        r0 = fr.pcsoft.wdjava.ui.p065b.p067a.C1083w.getElementByName(r6);
        r1 = fr.pcsoft.wdjava.ui.p065b.p067a.C1083w.text;	 Catch:{ SAXException -> 0x00b2 }
        if (r0 != r1) goto L_0x0090;
    L_0x0089:
        r1 = r4.f3169n;	 Catch:{ SAXException -> 0x00b2 }
        r2 = 0;
        r3 = 0;
        r4.m7736a(r1, r2, r3);	 Catch:{ SAXException -> 0x00b2 }
    L_0x0090:
        r0 = r0.isContainer();	 Catch:{ SAXException -> 0x00b4 }
        if (r0 == 0) goto L_0x009e;
    L_0x0096:
        r0 = r4.f3169n;	 Catch:{ SAXException -> 0x00b4 }
        r0 = r0.mo3329b();	 Catch:{ SAXException -> 0x00b4 }
        r4.f3169n = r0;	 Catch:{ SAXException -> 0x00b4 }
    L_0x009e:
        r0 = r4.f3170o;	 Catch:{ SAXException -> 0x00b6 }
        if (r0 == 0) goto L_0x0014;
    L_0x00a2:
        r0 = r4.f3163c;	 Catch:{ SAXException -> 0x00b0 }
        r0 = r0.m7857e();	 Catch:{ SAXException -> 0x00b0 }
        if (r0 == 0) goto L_0x0014;
    L_0x00aa:
        r0 = new fr.pcsoft.wdjava.ui.b.a.p;	 Catch:{ SAXException -> 0x00b0 }
        r0.<init>();	 Catch:{ SAXException -> 0x00b0 }
        throw r0;	 Catch:{ SAXException -> 0x00b0 }
    L_0x00b0:
        r0 = move-exception;
        throw r0;
    L_0x00b2:
        r0 = move-exception;
        throw r0;
    L_0x00b4:
        r0 = move-exception;
        throw r0;
    L_0x00b6:
        r0 = move-exception;
        throw r0;	 Catch:{ SAXException -> 0x00b0 }
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.ui.b.a.n.endElement(java.lang.String, java.lang.String, java.lang.String):void");
    }

    public void startDocument() throws SAXException {
        try {
            super.startDocument();
            C0691a.m2860a(this.f3163c == null, f3162z[83]);
            this.f3163c = new wb();
            this.f3169n = this.f3163c;
            this.f3164d = false;
            this.f3166g = null;
            this.f3167i = null;
            this.f3168k = false;
            this.f3171r = 0;
        } catch (SAXException e) {
            throw e;
        }
    }

    public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        try {
            super.startElement(str, str2, str3, attributes);
            if (this.f3168k) {
                this.f3171r++;
                return;
            }
            try {
                if (!C0808l.m4053k(str)) {
                    if (!str.equals(f3153b)) {
                        return;
                    }
                }
                try {
                    if (!str2.equals(f3158m)) {
                        if (!str2.equals(f3155h)) {
                            C1060y c1060y = null;
                            switch (vb.f3232a[C1083w.getElementByName(str2).ordinal()]) {
                                case 1:
                                    c1060y = new bb();
                                    break;
                                case 2:
                                case 3:
                                    c1060y = new fb();
                                    break;
                                case 4:
                                    c1060y = new gb();
                                    break;
                                case 5:
                                    c1060y = new qb();
                                    break;
                                case 6:
                                    c1060y = new tb();
                                    break;
                                case 7:
                                    c1060y = new nb();
                                    break;
                                case 8:
                                    c1060y = new ob();
                                    break;
                                case 9:
                                    c1060y = new pb();
                                    break;
                                case 10:
                                    c1060y = new rb();
                                    break;
                                case 11:
                                    c1060y = new sb();
                                    break;
                                case 12:
                                    c1060y = new kb();
                                    break;
                                case 13:
                                    c1060y = new lb();
                                    break;
                                case 14:
                                    c1060y = new db();
                                    break;
                                case 15:
                                    c1060y = new eb();
                                    break;
                                case 16:
                                    c1060y = new ib();
                                    break;
                                case 17:
                                    c1060y = new hb();
                                    break;
                                case 18:
                                    C0691a.m2856a(f3162z[2] + str2);
                                    this.f3168k = true;
                                    this.f3171r = 1;
                                    break;
                            }
                            if (c1060y != null) {
                                try {
                                    this.f3163c.m7849a(this.f3169n, (C1061z) c1060y);
                                    m7735a(c1060y, attributes);
                                    if (c1060y instanceof C1062e) {
                                        this.f3169n = (C1062e) c1060y;
                                        return;
                                    }
                                    return;
                                } catch (SAXException e) {
                                    throw e;
                                }
                            }
                            return;
                        }
                    }
                    this.f3164d = true;
                    this.f3166g = str2;
                } catch (SAXException e2) {
                    throw e2;
                } catch (SAXException e22) {
                    throw e22;
                }
            } catch (SAXException e222) {
                throw e222;
            } catch (SAXException e2222) {
                throw e2222;
            }
        } catch (SAXException e22222) {
            throw e22222;
        }
    }
}
