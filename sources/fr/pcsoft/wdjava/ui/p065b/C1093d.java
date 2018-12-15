package fr.pcsoft.wdjava.ui.p065b;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.RectF;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.webkit.URLUtil;
import fr.pcsoft.wdjava.core.application.WDAppManager;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.p042b.C0657a;
import fr.pcsoft.wdjava.core.ressources.C0743a;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.file.C0897o;
import fr.pcsoft.wdjava.ui.p065b.p066b.C1085a;
import fr.pcsoft.wdjava.ui.p065b.p066b.C1089d;
import fr.pcsoft.wdjava.ui.p065b.p067a.C1084x;
import fr.pcsoft.wdjava.ui.p065b.p067a.wb;
import fr.pcsoft.wdjava.ui.utils.C1511l;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.CRC32;

/* renamed from: fr.pcsoft.wdjava.ui.b.d */
public class C1093d {
    /* renamed from: a */
    private static C1102m<Bitmap> f3313a = null;
    /* renamed from: b */
    private static final C1104o f3314b = new C1104o();
    /* renamed from: z */
    private static final String[] f3315z = new String[]{C1093d.m7934z(C1093d.m7935z("\\{W\u0016YqIrS\u001avDp\u0016H}HqXTm\u0005")), C1093d.m7934z(C1093d.m7935z("XOn_\u000b.\u001b")), C1093d.m7934z(C1093d.m7935z("XOn_\b,\u001b")), C1093d.m7934z(C1093d.m7935z("XOn_\t*\u001b")), C1093d.m7934z(C1093d.m7935z("XOn_\t`")), C1093d.m7934z(C1093d.m7935z("XOn_\u000e`")), C1093d.m7934z(C1093d.m7935z("XOn_\b`")), C1093d.m7934z(C1093d.m7935z("XOn_")), C1093d.m7934z(C1093d.m7935z("XOn_\f,\u001b")), C1093d.m7934z(C1093d.m7935z("XOn_\u000b`")), C1093d.m7934z(C1093d.m7935z("XOn_\u000e \u001b")), C1093d.m7934z(C1093d.m7935z("XOn_\u000bG\u001ef")), C1093d.m7934z(C1093d.m7935z(";{[dwQxMuVtLskMbMs")), C1093d.m7934z(C1093d.m7935z("yEzDUqO0F_jFwEIqDp\u0018sV[dt]")), C1093d.m7934z(C1093d.m7935z("]HvSY8Ok\u0016YpJlQ_uNpB\u001a|N>Z\u001dqFQ_8")), C1093d.m7934z(C1093d.m7935z("6XhQ"))};

    /* renamed from: a */
    public static final Bitmap m7921a(Resources resources, int i, C1104o c1104o) {
        Bitmap decodeResource;
        c1104o.inInputShareable = true;
        c1104o.inPurgeable = true;
        if (C1104o.access$300(c1104o)) {
            c1104o.inJustDecodeBounds = true;
            BitmapFactory.decodeResource(resources, i, c1104o);
            c1104o.m7992d();
            c1104o.inJustDecodeBounds = false;
            decodeResource = BitmapFactory.decodeResource(resources, i, c1104o);
        } else {
            decodeResource = BitmapFactory.decodeResource(resources, i, c1104o);
        }
        return c1104o.m7982a(decodeResource);
    }

    /* renamed from: a */
    public static final Bitmap m7922a(String str, C1104o c1104o, Resources resources) {
        Exception exception;
        Bitmap bitmap = null;
        try {
            if (C0808l.m4053k(str)) {
                return null;
            }
            C1104o c1104o2;
            if (c1104o == null) {
                try {
                    c1104o2 = new C1104o();
                } catch (Exception e) {
                    exception = e;
                    c1104o2 = c1104o;
                    C0691a.m2857a(f3315z[14] + str, exception);
                    return c1104o2.m7982a(bitmap);
                }
            }
            c1104o2 = c1104o;
            try {
                Bitmap bitmap2;
                boolean equalsIgnoreCase = C0897o.m6259b(str, 8).equalsIgnoreCase(f3315z[15]);
                if (resources != null) {
                    int j = C0743a.m3214j(str);
                    if (j > 0) {
                        if (equalsIgnoreCase) {
                            bitmap = wb.m7827a(j, C1104o.access$100(c1104o2), C1104o.access$200(c1104o2));
                            if (bitmap != null) {
                                return bitmap;
                            }
                            bitmap2 = bitmap;
                        } else {
                            bitmap2 = null;
                        }
                        try {
                            return C1093d.m7921a(resources, j, c1104o2);
                        } catch (Exception e2) {
                            Exception exception2 = e2;
                            bitmap = bitmap2;
                            exception = exception2;
                        }
                    }
                }
                if (URLUtil.isNetworkUrl(str)) {
                    return C1093d.m7933c(str, c1104o2);
                }
                File file;
                if (equalsIgnoreCase) {
                    bitmap2 = wb.m7829a(str, C1104o.access$100(c1104o2), C1104o.access$200(c1104o2));
                    if (bitmap2 != null) {
                        return bitmap2;
                    }
                }
                bitmap2 = null;
                File a = C1093d.m7928a(str, C1511l.m10528c());
                if (a == null) {
                    a = C0897o.m6290j(str);
                    try {
                        if (!a.exists()) {
                            return null;
                        }
                        if (c1104o2.inDensity == 0) {
                            c1104o2.inDensity = 160;
                            file = a;
                            str = file.getPath();
                            if (C1104o.access$300(c1104o2)) {
                                bitmap = BitmapFactory.decodeFile(str, c1104o2);
                            } else {
                                c1104o2.inJustDecodeBounds = true;
                                BitmapFactory.decodeFile(str, c1104o2);
                                c1104o2.m7992d();
                                c1104o2.inJustDecodeBounds = false;
                                bitmap = BitmapFactory.decodeFile(str, c1104o2);
                            }
                            return c1104o2.m7982a(bitmap);
                        }
                    } catch (Exception e22) {
                        throw e22;
                    } catch (Exception e222) {
                        throw e222;
                    }
                }
                file = a;
                str = file.getPath();
                if (C1104o.access$300(c1104o2)) {
                    bitmap = BitmapFactory.decodeFile(str, c1104o2);
                } else {
                    c1104o2.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(str, c1104o2);
                    c1104o2.m7992d();
                    c1104o2.inJustDecodeBounds = false;
                    bitmap = BitmapFactory.decodeFile(str, c1104o2);
                }
                return c1104o2.m7982a(bitmap);
            } catch (Exception e3) {
                exception = e3;
                C0691a.m2857a(f3315z[14] + str, exception);
                return c1104o2.m7982a(bitmap);
            }
        } catch (Exception e2222) {
            throw e2222;
        }
    }

    /* renamed from: a */
    private static Drawable m7923a(Bitmap bitmap, C1104o c1104o) {
        return (c1104o.f3349n > 1 || c1104o.f3345h > 1) ? C1093d.m7930b(bitmap, c1104o) : c1104o.f3344g ? new C1089d(bitmap) : new BitmapDrawable(WDAppManager.m2569b(), bitmap);
    }

    /* renamed from: a */
    public static Drawable m7924a(String str) {
        return C1093d.m7925a(str, C1093d.m7932b());
    }

    /* renamed from: a */
    public static Drawable m7925a(String str, C1104o c1104o) {
        try {
            if (C0808l.m4053k(str)) {
                return null;
            }
            Bitmap bitmap;
            String str2;
            if (c1104o == null) {
                c1104o = C1093d.m7932b();
            }
            if (c1104o.f3340b) {
                String str3 = C1104o.access$000(c1104o) ? str + "|" + c1104o.inSampleSize : str;
                C1102m a = C1093d.m7927a();
                bitmap = (Bitmap) a.m7977c(str3, c1104o.f3341c, c1104o.f3342d);
                if (bitmap != null) {
                    try {
                        if (!bitmap.isRecycled()) {
                            return C1093d.m7923a(bitmap, c1104o);
                        }
                        a.m7975a(str3, c1104o.f3341c, c1104o.f3342d);
                    } catch (Exception e) {
                        throw e;
                    }
                }
                str2 = str3;
            } else {
                str2 = null;
            }
            try {
                if (c1104o.f3343f) {
                    c1104o.f3352r = C1098i.m7959a(str);
                }
                try {
                    Drawable b;
                    Bitmap bitmap2;
                    if (C0897o.m6259b(str, 8).equalsIgnoreCase(f3315z[15])) {
                        b = C1093d.m7931b(str, c1104o);
                        if (b != null) {
                            return b;
                        }
                    }
                    int j = C0743a.m3214j(str);
                    if (j > 0) {
                        Resources b2 = WDAppManager.m2569b();
                        if (str.indexOf(63) >= 0) {
                            b = b2.getDrawable(j);
                            if (b != null) {
                                return (c1104o.m7988a(1) && (b instanceof AnimationDrawable)) ? C1085a.m7890a((AnimationDrawable) b, c1104o.f3348l, c1104o.m7988a(8), c1104o.m7988a(2), c1104o.m7988a(4)) : b;
                            } else {
                                bitmap2 = null;
                            }
                        } else {
                            bitmap2 = C1093d.m7921a(b2, j, c1104o);
                        }
                        if (bitmap2 == null) {
                            b = wb.m7831a(j);
                            if (b != null) {
                                return b;
                            }
                        }
                        bitmap = bitmap2;
                    } else {
                        bitmap = null;
                    }
                    bitmap2 = bitmap == null ? C1093d.m7922a(str, c1104o, null) : bitmap;
                    if (bitmap2 != null) {
                        b = C1093d.m7923a(bitmap2, c1104o);
                        if (!c1104o.f3340b) {
                            return b;
                        }
                        C1093d.m7927a().m7976a(str2, bitmap2, c1104o.f3341c, c1104o.f3342d);
                        return b;
                    }
                    b = C1093d.m7931b(str, c1104o);
                    if (b != null) {
                        return b;
                    }
                    return null;
                } catch (Exception e2) {
                    throw e2;
                } catch (Exception e22) {
                    throw e22;
                } catch (Exception e222) {
                    C0691a.m2857a(f3315z[14] + str, e222);
                }
            } catch (Exception e2222) {
                throw e2222;
            }
        } catch (Exception e22222) {
            throw e22222;
        }
    }

    /* renamed from: a */
    public static final Drawable m7926a(byte[] bArr, C1104o c1104o) {
        String stringBuilder;
        Bitmap bitmap;
        if (c1104o.f3343f) {
            c1104o.f3352r = C1098i.m7960a(bArr);
        }
        if (c1104o.f3340b) {
            CRC32 crc32 = new CRC32();
            crc32.update(bArr);
            StringBuilder append = new StringBuilder(bArr.length).append('|').append(crc32.getValue());
            if (C1104o.access$000(c1104o)) {
                append.append('|');
                append.append(c1104o.inSampleSize);
            }
            stringBuilder = append.toString();
            C1102m a = C1093d.m7927a();
            bitmap = (Bitmap) a.m7977c(stringBuilder, c1104o.f3341c, c1104o.f3342d);
            if (bitmap != null && bitmap.isRecycled()) {
                a.m7975a(stringBuilder, c1104o.f3341c, c1104o.f3342d);
                bitmap = null;
            }
        } else {
            stringBuilder = null;
            bitmap = null;
        }
        if (bitmap == null) {
            bitmap = C1093d.m7929b(bArr, c1104o);
            if (!(bitmap == null || !c1104o.f3340b || stringBuilder == null)) {
                C1093d.m7927a().m7976a(stringBuilder, bitmap, c1104o.f3341c, c1104o.f3342d);
            }
        }
        if (bitmap != null) {
            return C1093d.m7923a(bitmap, c1104o);
        }
        Drawable a2 = wb.m7835a(bArr);
        return a2 == null ? null : a2;
    }

    /* renamed from: a */
    public static final C1102m<Bitmap> m7927a() {
        if (f3313a == null) {
            f3313a = new C1103n();
        }
        return f3313a;
    }

    /* renamed from: a */
    private static File m7928a(String str, int i) {
        int indexOf = str.indexOf(f3315z[7]);
        if (indexOf > 0) {
            int indexOf2 = str.indexOf(46, indexOf);
            if (indexOf2 > 0) {
                String toLowerCase = str.substring(indexOf, indexOf2).toLowerCase();
                int i2 = (toLowerCase.equals(f3315z[1]) || toLowerCase.equals(f3315z[2]) || toLowerCase.equals(f3315z[3]) || toLowerCase.equals(f3315z[10]) || toLowerCase.equals(f3315z[8])) ? 1 : 0;
                int i3 = (toLowerCase.equals(f3315z[9]) || toLowerCase.equals(f3315z[11]) || toLowerCase.equals(f3315z[6]) || toLowerCase.equals(f3315z[4]) || toLowerCase.equals(f3315z[5])) ? 1 : 0;
                if (!(i2 == 0 && i3 == 0)) {
                    StringBuilder stringBuilder = new StringBuilder(str);
                    stringBuilder.delete(indexOf, indexOf2);
                    while (true) {
                        File j;
                        switch (i) {
                            case 160:
                                stringBuilder.insert(indexOf, i2 != 0 ? f3315z[1] : f3315z[9]);
                                File j2 = C0897o.m6290j(stringBuilder.toString());
                                return !j2.exists() ? null : j2;
                            case 213:
                            case 240:
                                toLowerCase = i2 != 0 ? f3315z[2] : f3315z[11];
                                stringBuilder.insert(indexOf, toLowerCase);
                                j = C0897o.m6290j(stringBuilder.toString());
                                if (!j.exists()) {
                                    stringBuilder.delete(indexOf, toLowerCase.length() + indexOf);
                                    i = 160;
                                    break;
                                }
                                return j;
                            case 280:
                            case 320:
                                toLowerCase = i2 != 0 ? f3315z[3] : f3315z[6];
                                stringBuilder.insert(indexOf, toLowerCase);
                                j = C0897o.m6290j(stringBuilder.toString());
                                if (!j.exists()) {
                                    stringBuilder.delete(indexOf, toLowerCase.length() + indexOf);
                                    i = 240;
                                    break;
                                }
                                return j;
                            case C1084x.f3269t /*400*/:
                            case 420:
                            case 480:
                                toLowerCase = i2 != 0 ? f3315z[10] : f3315z[4];
                                stringBuilder.insert(indexOf, toLowerCase);
                                j = C0897o.m6290j(stringBuilder.toString());
                                if (!j.exists()) {
                                    stringBuilder.delete(indexOf, toLowerCase.length() + indexOf);
                                    i = 320;
                                    break;
                                }
                                return j;
                            case 560:
                            case 640:
                                toLowerCase = i2 != 0 ? f3315z[8] : f3315z[5];
                                stringBuilder.insert(indexOf, toLowerCase);
                                j = C0897o.m6290j(stringBuilder.toString());
                                if (!j.exists()) {
                                    stringBuilder.delete(indexOf, toLowerCase.length() + indexOf);
                                    i = 480;
                                    break;
                                }
                                return j;
                            default:
                                C0691a.m2856a(f3315z[0]);
                                return null;
                        }
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public static final Bitmap m7929b(byte[] bArr, C1104o c1104o) {
        Options b;
        Bitmap decodeByteArray;
        if (c1104o == null) {
            b = C1093d.m7932b();
        }
        b.inInputShareable = true;
        b.inPurgeable = true;
        if (b.inDensity == 0) {
            b.inDensity = 160;
        }
        if (C1104o.access$300(b)) {
            b.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, b);
            b.m7992d();
            b.inJustDecodeBounds = false;
            decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, b);
        } else {
            decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, b);
        }
        return b.m7982a(decodeByteArray);
    }

    /* renamed from: b */
    private static AnimationDrawable m7930b(Bitmap bitmap, C1104o c1104o) {
        Drawable[] drawableArr = new Drawable[(c1104o.f3349n * c1104o.f3345h)];
        int width = bitmap.getWidth() / c1104o.f3345h;
        int height = bitmap.getHeight() / c1104o.f3349n;
        for (int i = 0; i < c1104o.f3349n; i++) {
            for (int i2 = 0; i2 < c1104o.f3345h; i2++) {
                drawableArr[(c1104o.f3345h * i) + i2] = new BitmapDrawable(WDAppManager.m2569b(), Bitmap.createBitmap(bitmap, i2 * width, i * height, width, height));
            }
        }
        return new C1085a(drawableArr, c1104o.f3348l, c1104o.m7988a(8), c1104o.m7988a(2), c1104o.m7988a(4));
    }

    /* renamed from: b */
    private static Drawable m7931b(String str, C1104o c1104o) {
        wb c = wb.m7841c(str);
        if (c == null) {
            return null;
        }
        if (c1104o.f3349n <= 1 && c1104o.f3345h <= 1) {
            return c1104o.m7988a(16) ? c.m7846a(C1104o.access$100(c1104o), C1104o.access$200(c1104o)) : wb.m7832a(c);
        } else {
            int width;
            int height;
            RectF b = c.m7851b((float) C1511l.m10528c());
            if (C1104o.access$100(c1104o) <= 0 || C1104o.access$200(c1104o) <= 0) {
                width = (int) b.width();
                height = (int) b.height();
            } else {
                double min = Math.min(((double) C1104o.access$100(c1104o)) / ((double) (b.width() / ((float) c1104o.f3345h))), ((double) C1104o.access$200(c1104o)) / ((double) (b.height() / ((float) c1104o.f3349n))));
                width = (int) Math.round(((double) b.width()) * min);
                height = (int) Math.round(min * ((double) b.height()));
            }
            return C1093d.m7930b(wb.m7839b(c, width, height), c1104o);
        }
    }

    /* renamed from: b */
    public static final C1104o m7932b() {
        return f3314b.m7991c();
    }

    /* renamed from: c */
    public static final Bitmap m7933c(String str, C1104o c1104o) throws IOException {
        HttpURLConnection httpURLConnection;
        Throwable th;
        try {
            if (WDAppManager.m2544C().checkCallingOrSelfPermission(f3315z[13]) != 0) {
                throw new IOException(C0745b.m3222b(f3315z[12], f3315z[13]));
            }
            BufferedInputStream bufferedInputStream = null;
            try {
                c1104o.inPurgeable = true;
                if (c1104o.inDensity == 0) {
                    c1104o.inDensity = 160;
                }
                try {
                    HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(str).openConnection();
                    try {
                        Bitmap decodeStream;
                        httpURLConnection2.setDoInput(true);
                        httpURLConnection2.connect();
                        if (C1104o.access$300(c1104o)) {
                            InputStream c1092c = !WDProjet.getInstance().isVersionCompatible(C0657a.KIT_KAT.getNumero()) ? new C1092c(httpURLConnection2.getInputStream()) : new BufferedInputStream(httpURLConnection2.getInputStream());
                            if (c1092c.markSupported()) {
                                c1092c.mark(131072);
                            }
                            c1104o.inJustDecodeBounds = true;
                            BitmapFactory.decodeStream(c1092c, null, c1104o);
                            c1104o.m7992d();
                            c1104o.inJustDecodeBounds = false;
                            if (c1092c.markSupported()) {
                                c1092c.reset();
                            }
                            decodeStream = BitmapFactory.decodeStream(c1092c, null, c1104o);
                        } else {
                            decodeStream = BitmapFactory.decodeStream(new BufferedInputStream(httpURLConnection2.getInputStream()), null, c1104o);
                        }
                        decodeStream = c1104o.m7982a(decodeStream);
                        if (null != null) {
                            try {
                                bufferedInputStream.close();
                            } catch (IOException e) {
                            }
                        }
                        if (httpURLConnection2 != null) {
                            try {
                                httpURLConnection2.disconnect();
                            } catch (IOException e2) {
                                throw e2;
                            }
                        }
                        return decodeStream;
                    } catch (IOException e3) {
                        throw e3;
                    } catch (IOException e32) {
                        throw e32;
                    } catch (IOException e322) {
                        throw e322;
                    } catch (Throwable th2) {
                        Throwable th3 = th2;
                        httpURLConnection = httpURLConnection2;
                        th = th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    httpURLConnection = null;
                    if (null != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (IOException e4) {
                        }
                    }
                    if (httpURLConnection != null) {
                        try {
                            httpURLConnection.disconnect();
                        } catch (IOException e22) {
                            throw e22;
                        }
                    }
                    throw th;
                }
            } catch (IOException e222) {
                throw e222;
            }
        } catch (IOException e2222) {
            throw e2222;
        }
    }

    /* renamed from: z */
    private static String m7934z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 24;
                    break;
                case 1:
                    i2 = 43;
                    break;
                case 2:
                    i2 = 30;
                    break;
                case 3:
                    i2 = 54;
                    break;
                default:
                    i2 = 58;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7935z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 58);
        }
        return toCharArray;
    }
}
