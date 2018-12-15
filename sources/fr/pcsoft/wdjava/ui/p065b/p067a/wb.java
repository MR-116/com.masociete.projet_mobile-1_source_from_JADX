package fr.pcsoft.wdjava.ui.p065b.p067a;

import android.content.res.Resources.NotFoundException;
import android.graphics.Bitmap;
import android.graphics.Picture;
import android.graphics.RectF;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.application.WDAppManager;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.ressources.C0743a;
import fr.pcsoft.wdjava.file.C0897o;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/* renamed from: fr.pcsoft.wdjava.ui.b.a.wb */
public class wb implements yb {
    /* renamed from: b */
    public static final int f3238b = 1;
    /* renamed from: z */
    private static final String[] f3239z = new String[]{wb.m7843z(wb.m7844z("h \u001d$\u0017O7\r2Xi\u0013)w\u0016U+N#\nU0\u0018¾\u001d\u0014")), wb.m7843z(wb.m7844z("o+N3\u0017Y0\u00032\u0016Ne\u0000p\u0019\u001a5\u000f$X^ N'\u0019H \u0000#V")), wb.m7843z(wb.m7844z("|,\r?\u0011_7N\u0004.}e\u00079\u001dB,\u001d#\u0019T1@")), wb.m7843z(wb.m7844z("7\u001c2\rHe\n\"\n[+\u001aw\u0014[e\u001e6\nI,\u00000X^0N3\u0017Y0\u00032\u0016Ne=\u0001?\u0014")), wb.m7843z(wb.m7844z("i1\u001c\"\u001bN0\u001c2X^0N3\u0017Y0\u00032\u0016Ne=\u0001?\u001a,\u0000!\u0019V,\n2V\u001a\u0016\u000b\"\u0014\u001a0\u0000wV¬\u00032\u0016Ne\n2XN<\u001e2X\u00066\u00180F\u001a5\u000b\"\f\u001a¯\u001a%\u001d\u001a)\u000fw\n[&\u00079\u001d\u001a!\u001bw\u001cU&\u001b:\u001dT1")), wb.m7843z(wb.m7844z("v N3\u0017Y0\u00032\u0016Ne\u000fw\u001cÓ/w\rT N%\u0019Y,\u00002V")), wb.m7843z(wb.m7844z("i1\u001c\"\u001bN0\u001c2X^0N3\u0017Y0\u00032\u0016Ne=\u0001?\u001a,\u0000!\u0019V,\n2V\u001a\t\u000bw\b[7\u000b9\f\u001a!\u000bw\u0014\u001d¬\u0002¾\u0015_+\u001aw\u001c_3\u001c6\u0011Ne#\n_e\u001b9XY*\u0000#\u001dT \u001b%XU0N;\u001d\u001a!\u00014\rW \u0000#XV0\u0007z\u0015Ð(\u000by"))};
    /* renamed from: a */
    private String f3240a = null;
    /* renamed from: c */
    private String f3241c = null;
    /* renamed from: d */
    private bb f3242d = null;
    /* renamed from: e */
    private String f3243e = null;

    wb() {
    }

    /* renamed from: a */
    public static final Bitmap m7827a(int i, int i2, int i3) {
        wb b = wb.m7840b(i);
        if (b == null) {
            return null;
        }
        try {
            Bitmap b2 = wb.m7839b(b, i2, i3);
            return b2;
        } finally {
            b.mo3327a();
        }
    }

    /* renamed from: a */
    public static final Bitmap m7828a(InputStream inputStream, int i, int i2) {
        wb a = wb.m7837a(inputStream, 0);
        if (a == null) {
            return null;
        }
        try {
            Bitmap b = wb.m7839b(a, i, i2);
            return b;
        } finally {
            a.mo3327a();
        }
    }

    /* renamed from: a */
    public static final Bitmap m7829a(String str, int i, int i2) {
        wb c = wb.m7841c(str);
        if (c == null) {
            return null;
        }
        try {
            Bitmap b = wb.m7839b(c, i, i2);
            return b;
        } finally {
            c.mo3327a();
        }
    }

    /* renamed from: a */
    public static final Bitmap m7830a(byte[] bArr, int i, int i2) {
        wb a = wb.m7837a(new ByteArrayInputStream(bArr), 0);
        if (a == null) {
            return null;
        }
        try {
            Bitmap b = wb.m7839b(a, i, i2);
            return b;
        } finally {
            a.mo3327a();
        }
    }

    /* renamed from: a */
    public static final C1080t m7831a(int i) {
        wb b = wb.m7840b(i);
        if (b == null) {
            return null;
        }
        try {
            C1080t a = wb.m7832a(b);
            return a;
        } finally {
            b.mo3327a();
        }
    }

    /* renamed from: a */
    public static final C1080t m7832a(wb wbVar) {
        return wb.m7833a(wbVar, 0, 0);
    }

    /* renamed from: a */
    public static final C1080t m7833a(wb wbVar, int i, int i2) {
        if (wbVar != null) {
            Picture b = C1070i.m7680b(wbVar, i, i2);
            if (b != null) {
                try {
                    return new C1080t(b);
                } catch (NotFoundException e) {
                    throw e;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static final C1080t m7834a(InputStream inputStream) {
        wb a = wb.m7837a(inputStream, 0);
        if (a == null) {
            return null;
        }
        try {
            C1080t a2 = wb.m7832a(a);
            return a2;
        } finally {
            a.mo3327a();
        }
    }

    /* renamed from: a */
    public static final C1080t m7835a(byte[] bArr) {
        wb a = wb.m7837a(new ByteArrayInputStream(bArr), 0);
        if (a == null) {
            return null;
        }
        try {
            C1080t a2 = wb.m7832a(a);
            return a2;
        } finally {
            a.mo3327a();
        }
    }

    /* renamed from: a */
    public static final wb m7836a(File file) {
        try {
            return wb.m7837a(new BufferedInputStream(new FileInputStream(file)), 0);
        } catch (Exception e) {
            C0691a.m2857a(f3239z[2], e);
            return null;
        }
    }

    /* renamed from: a */
    public static final wb m7837a(InputStream inputStream, int i) {
        wb a;
        C1074n c1074n = new C1074n();
        try {
            a = c1074n.m7760a(inputStream, i);
        } catch (Exception e) {
            C0691a.m2857a(f3239z[3], e);
            a = null;
        } finally {
            c1074n.m7761a();
        }
        return a;
    }

    /* renamed from: a */
    private C1061z m7838a(C1062e c1062e, String str) {
        C1062e c1062e2 = c1062e == null ? this.f3242d : c1062e;
        C1061z c1061z = (C1061z) c1062e2;
        try {
            if (str.equals(c1061z.m7593j())) {
                return c1061z;
            }
            for (C1060y c1060y : c1062e2.mo3332d()) {
                try {
                    if (c1060y instanceof C1061z) {
                        c1061z = (C1061z) c1060y;
                        try {
                            if (str.equals(c1061z.m7593j())) {
                                return c1061z;
                            }
                            if (c1061z instanceof C1062e) {
                                c1061z = m7838a((C1062e) c1061z, str);
                                if (c1061z != null) {
                                    return c1061z;
                                }
                            } else {
                                continue;
                            }
                        } catch (NotFoundException e) {
                            throw e;
                        }
                    }
                } catch (NotFoundException e2) {
                    throw e2;
                }
            }
            return null;
        } catch (NotFoundException e22) {
            throw e22;
        }
    }

    /* renamed from: b */
    public static final Bitmap m7839b(wb wbVar, int i, int i2) {
        if (wbVar == null) {
            return null;
        }
        try {
            return C1070i.m7656a(wbVar, i, i2);
        } catch (NotFoundException e) {
            throw e;
        }
    }

    /* renamed from: b */
    public static final wb m7840b(int i) {
        try {
            return wb.m7837a(WDAppManager.m2569b().openRawResource(i), 0);
        } catch (Exception e) {
            C0691a.m2857a(f3239z[0], e);
            return null;
        }
    }

    /* renamed from: c */
    public static final wb m7841c(String str) {
        int j = C0743a.m3214j(str);
        if (j <= 0) {
            return wb.m7836a(C0897o.m6290j(str));
        }
        try {
            return wb.m7840b(j);
        } catch (NotFoundException e) {
            throw e;
        }
    }

    /* renamed from: f */
    public static final C1080t m7842f(String str) {
        int j = C0743a.m3214j(str);
        if (j > 0) {
            try {
                return wb.m7831a(j);
            } catch (NotFoundException e) {
                throw e;
            }
        }
        wb a = wb.m7836a(C0897o.m6290j(str));
        if (a == null) {
            return null;
        }
        try {
            C1080t a2 = wb.m7832a(a);
            return a2;
        } finally {
            a.mo3327a();
        }
    }

    /* renamed from: z */
    private static String m7843z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 58;
                    break;
                case 1:
                    i2 = 69;
                    break;
                case 2:
                    i2 = 110;
                    break;
                case 3:
                    i2 = 87;
                    break;
                default:
                    i2 = C0607n.co;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7844z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ C0607n.co);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public final RectF m7845a(float f) {
        if (this.f3242d != null) {
            C1063b c1063b = this.f3242d.f3076f;
            C1063b c1063b2 = this.f3242d.f3080j;
            RectF e = this.f3242d.m7616e();
            if (c1063b != null) {
                try {
                    float a;
                    float a2 = (c1063b.m7606b() != C1069h.percent || e == null) ? c1063b.m7604a(f) : (c1063b.m7607c() * e.width()) / 100.0f;
                    if (c1063b2 != null) {
                        try {
                            a = (c1063b2.m7606b() != C1069h.percent || e == null) ? c1063b2.m7604a(f) : (e.height() * c1063b2.m7607c()) / 100.0f;
                        } catch (NotFoundException e2) {
                            throw e2;
                        }
                    }
                    a = e != null ? (e.height() * a2) / e.width() : a2;
                    return new RectF(0.0f, 0.0f, a2, a);
                } catch (NotFoundException e22) {
                    throw e22;
                }
            } else if (e != null) {
                return e;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final C1059a m7846a(int i, int i2) {
        return new C1059a(this, i, i2);
    }

    /* renamed from: a */
    public void mo3327a() {
        try {
            if (this.f3242d != null) {
                this.f3242d.mo3327a();
                this.f3242d = null;
            }
            this.f3243e = null;
            this.f3240a = null;
            this.f3241c = null;
        } catch (NotFoundException e) {
            throw e;
        }
    }

    /* renamed from: a */
    public void mo3328a(C1062e c1062e) throws C1066d {
        throw new C1066d(f3239z[1]);
    }

    /* renamed from: a */
    final void m7849a(yb ybVar, C1061z c1061z) throws C1066d {
        if (ybVar == this) {
            try {
                if (c1061z instanceof bb) {
                    C0691a.m2860a(this.f3242d == null, f3239z[5]);
                    this.f3242d = (bb) c1061z;
                    return;
                }
                throw new C1066d(f3239z[4]);
            } catch (C1066d e) {
                throw e;
            } catch (C1066d e2) {
                throw e2;
            }
        } else if (ybVar instanceof C1062e) {
            C1062e c1062e = (C1062e) ybVar;
            c1062e.mo3331a(c1061z);
            c1061z.mo3328a(c1062e);
        } else {
            throw new C1066d(f3239z[6]);
        }
    }

    /* renamed from: a */
    public final void m7850a(String str) {
        this.f3240a = str;
    }

    /* renamed from: b */
    public final RectF m7851b(float f) {
        if (this.f3242d == null) {
            return new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        }
        RectF e = this.f3242d.m7616e();
        if (e != null) {
            return e;
        }
        e = m7845a(f);
        return e == null ? new RectF(0.0f, 0.0f, 512.0f, 512.0f) : e;
    }

    /* renamed from: b */
    public yb mo3329b() {
        return null;
    }

    /* renamed from: b */
    public final void m7853b(String str) {
        this.f3241c = str;
    }

    /* renamed from: c */
    public wb mo3330c() {
        return this;
    }

    /* renamed from: d */
    public final String m7855d() {
        try {
            return this.f3243e != null ? this.f3243e : "";
        } catch (NotFoundException e) {
            throw e;
        }
    }

    /* renamed from: d */
    public final void m7856d(String str) {
        this.f3243e = str;
    }

    /* renamed from: e */
    public final bb m7857e() {
        return this.f3242d;
    }

    /* renamed from: e */
    final C1060y m7858e(String str) {
        if (str == null) {
            return null;
        }
        try {
            return str.length() > 1 ? str.startsWith("#") ? m7838a(null, str.substring(1)) : null : null;
        } catch (NotFoundException e) {
            throw e;
        } catch (NotFoundException e2) {
            throw e2;
        }
    }

    /* renamed from: f */
    public final String m7859f() {
        return this.f3241c;
    }

    /* renamed from: g */
    public final String m7860g() {
        try {
            return this.f3240a != null ? this.f3240a : "";
        } catch (NotFoundException e) {
            throw e;
        }
    }
}
