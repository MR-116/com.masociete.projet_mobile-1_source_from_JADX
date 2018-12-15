package fr.pcsoft.wdjava.ui.dessin.p077a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import fr.pcsoft.wdjava.core.application.WDAppManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.file.C0897o;
import fr.pcsoft.wdjava.ui.C1489s;
import fr.pcsoft.wdjava.ui.p064a.C1032b;
import fr.pcsoft.wdjava.ui.p065b.C1093d;
import fr.pcsoft.wdjava.ui.p065b.C1104o;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: fr.pcsoft.wdjava.ui.dessin.a.m */
public class C1348m implements C1336b {
    /* renamed from: z */
    private static final String[] f4014z = new String[]{C1348m.m9695z(C1348m.m9696z("\u0005u\u0012:!ca\u0012=3cy\u001a\"6ac\f&:vi\u0000<>dj\u0016")), C1348m.m9695z(C1348m.m9696z("LV4")), C1348m.m9695z(C1348m.m9696z("\u0005o\u001e?8uu\u001a-;cy\u0010=2ct\f)>en\u001a*%"))};
    /* renamed from: c */
    private Bitmap f4015c = null;
    /* renamed from: d */
    private C1032b f4016d = null;

    public C1348m(Bitmap bitmap) {
        this.f4015c = bitmap;
    }

    /* renamed from: a */
    private int m9690a(int i) {
        return (int) ((((float) this.f4015c.getDensity()) / 160.0f) * ((float) i));
    }

    /* renamed from: a */
    public static final C1348m m9691a(String str, int i, int i2) {
        C1104o c1104o = new C1104o();
        c1104o.m7987a(true);
        if (i > 0 && i2 > 0) {
            c1104o.m7984a(i, i2, true);
        }
        Bitmap a = C1093d.m7922a(str, c1104o, WDAppManager.m2569b());
        return a != null ? new C1348m(a) : null;
    }

    /* renamed from: a */
    public static final C1348m m9692a(byte[] bArr, int i, int i2) {
        C1104o c1104o = new C1104o();
        c1104o.m7987a(true);
        if (i > 0 && i2 > 0) {
            c1104o.m7984a(i, i2, true);
        }
        Bitmap b = C1093d.m7929b(bArr, c1104o);
        return b != null ? new C1348m(b) : null;
    }

    /* renamed from: a */
    private boolean m9693a(OutputStream outputStream, int i) {
        return this.f4015c.compress(CompressFormat.PNG, 0, outputStream);
    }

    /* renamed from: a */
    private boolean m9694a(OutputStream outputStream, int i, int i2) {
        Bitmap bitmap = this.f4015c;
        if (bitmap.hasAlpha()) {
            bitmap = Bitmap.createBitmap(this.f4015c.getWidth(), this.f4015c.getHeight(), Config.RGB_565);
            bitmap.setDensity(this.f4015c.getDensity());
            Canvas canvas = new Canvas(bitmap);
            if (this.f4016d != null) {
                canvas.drawColor(this.f4016d.mo3315b());
            }
            canvas.drawBitmap(this.f4015c, 0.0f, 0.0f, null);
        }
        return bitmap.compress(CompressFormat.JPEG, Math.min(100, Math.max(0, i)), outputStream);
    }

    /* renamed from: z */
    private static String m9695z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 38;
                    break;
                case 1:
                    i2 = 38;
                    break;
                case 2:
                    i2 = 83;
                    break;
                case 3:
                    i2 = 111;
                    break;
                default:
                    i2 = 119;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m9696z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 119);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public C1336b mo3717a(int i, int i2, int i3, int i4) {
        int a = m9690a(i);
        int a2 = m9690a(i2);
        int a3 = m9690a(i3);
        int a4 = m9690a(i4);
        int min = Math.min(a3, this.f4015c.getWidth() - a);
        a4 = Math.min(a4, this.f4015c.getHeight() - a2);
        return (min <= 0 || a4 <= 0) ? null : new C1348m(Bitmap.createBitmap(this.f4015c, a, a2, min, a4));
    }

    /* renamed from: a */
    public void mo3718a() {
        if (this.f4015c != null) {
            this.f4015c.recycle();
            this.f4015c = null;
        }
    }

    /* renamed from: a */
    public void mo3719a(C1032b c1032b) {
        this.f4016d = c1032b;
    }

    /* renamed from: a */
    public boolean mo3720a(int i, double d) {
        return m9709f().mo3702a(i, d);
    }

    /* renamed from: a */
    public boolean mo3721a(int i, int i2, int i3) {
        return m9709f().mo3703a(i, i2, i3);
    }

    /* renamed from: a */
    public boolean mo3722a(C1336b c1336b, int i) {
        return m9709f().mo3705a(c1336b, (double) i);
    }

    /* renamed from: a */
    public boolean mo3723a(String str, int i, int i2, String str2) throws C1489s {
        FileNotFoundException e;
        boolean z;
        Throwable th;
        boolean z2 = false;
        try {
            if (this.f4015c == null) {
                throw new C1489s(C0745b.m3222b(f4014z[0], str));
            }
            OutputStream outputStream = null;
            if (str == null) {
                try {
                    str = "";
                } catch (FileNotFoundException e2) {
                    e = e2;
                    z = false;
                    try {
                        throw new C1489s(C0745b.m3222b(f4014z[2], str), e.getMessage());
                    } catch (Throwable th2) {
                        th = th2;
                        z2 = z;
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException e3) {
                            } catch (C1489s e4) {
                                throw e4;
                            }
                        }
                        if (!z2) {
                            try {
                                new File(str).delete();
                            } catch (Exception e5) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (z2) {
                        new File(str).delete();
                    }
                    throw th;
                }
            }
            if (str.indexOf(46) == -1) {
                str = str + "." + str2;
            }
            File j = C0897o.m6290j(str);
            OutputStream fileOutputStream = new FileOutputStream(j);
            try {
                boolean a = str2.equals(f4014z[1]) ? m9694a(fileOutputStream, i, i2) : m9693a(fileOutputStream, i2);
                if (a) {
                    try {
                        C1093d.m7927a().m7975a(j.getPath(), 1, 0);
                    } catch (IOException e6) {
                        throw e6;
                    } catch (FileNotFoundException e7) {
                        e = e7;
                        OutputStream outputStream2 = fileOutputStream;
                        z = a;
                        outputStream = outputStream2;
                    } catch (Throwable th4) {
                        th = th4;
                        z2 = a;
                        outputStream = fileOutputStream;
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        if (z2) {
                            new File(str).delete();
                        }
                        throw th;
                    }
                }
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e8) {
                    } catch (C1489s e42) {
                        throw e42;
                    }
                }
                if (!a) {
                    try {
                        new File(str).delete();
                    } catch (Exception e9) {
                    }
                }
                return a;
            } catch (FileNotFoundException e10) {
                e = e10;
                outputStream = fileOutputStream;
                z = false;
                throw new C1489s(C0745b.m3222b(f4014z[2], str), e.getMessage());
            } catch (Throwable th5) {
                th = th5;
                outputStream = fileOutputStream;
                if (outputStream != null) {
                    outputStream.close();
                }
                if (z2) {
                    new File(str).delete();
                }
                throw th;
            }
        } catch (IOException e62) {
            throw e62;
        }
    }

    /* renamed from: a */
    public byte[] mo3724a(int i, int i2, String str) throws C1489s {
        OutputStream byteArrayOutputStream;
        Throwable th;
        byte[] bArr = null;
        try {
            if (this.f4015c == null) {
                throw new C1489s(C0745b.m3222b(f4014z[0], ""));
            }
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    if (str.equals(f4014z[1]) ? m9694a(byteArrayOutputStream, i, i2) : m9693a(byteArrayOutputStream, i2)) {
                        bArr = ((ByteArrayOutputStream) byteArrayOutputStream).toByteArray();
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (IOException e) {
                            } catch (C1489s e2) {
                                throw e2;
                            }
                        }
                    } else if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (IOException e3) {
                        } catch (C1489s e22) {
                            throw e22;
                        }
                    }
                    return bArr;
                } catch (Throwable th2) {
                    th = th2;
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (IOException e4) {
                        } catch (C1489s e222) {
                            throw e222;
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                Throwable th4 = th3;
                byteArrayOutputStream = null;
                th = th4;
                if (byteArrayOutputStream != null) {
                    byteArrayOutputStream.close();
                }
                throw th;
            }
        } catch (IOException e5) {
            throw e5;
        }
    }

    /* renamed from: b */
    public int mo3725b() {
        return this.f4015c.getHeight();
    }

    /* renamed from: c */
    public boolean mo3726c() {
        return this.f4015c != null ? this.f4015c.hasAlpha() : false;
    }

    /* renamed from: d */
    public int mo3727d() {
        return this.f4015c.getWidth();
    }

    /* renamed from: e */
    public final Object mo3728e() {
        return this.f4015c;
    }

    /* renamed from: f */
    public C1337c m9709f() {
        return new C1344h(C1353s.m9718a(this.f4015c), true);
    }
}
