package fr.pcsoft.wdjava.ui.p065b;

import android.graphics.Bitmap;
import android.media.ExifInterface;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.ressources.C0743a;
import fr.pcsoft.wdjava.core.utils.bb;
import fr.pcsoft.wdjava.file.C0897o;
import fr.pcsoft.wdjava.ui.utils.C1508i;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: fr.pcsoft.wdjava.ui.b.i */
public class C1098i {
    /* renamed from: z */
    private static final String[] f3327z = new String[]{C1098i.m7962z(C1098i.m7963z("rF\u00183")), C1098i.m7962z(C1098i.m7963z("\u0015_\u0005,y/[\u0017/o|V\u0010cxµQ\u00003ã.W\u0007cf{]\u0007*o2F\u00147c3\\U\u0006R\u0015tU'o|^R*g=U\u0010m")), C1098i.m7962z(C1098i.m7963z("\u0013@\u001c&d(S\u0001*e2")), C1098i.m7962z(C1098i.m7963z("6B\u0012")), C1098i.m7962z(C1098i.m7963z("6B\u0010$"))};

    /* renamed from: a */
    private static final int m7958a(InputStream inputStream) throws IOException {
        File d = C0897o.m6271d("", f3327z[0]);
        try {
            bb.m3845a(inputStream, d);
            int a = C1098i.m7959a(d.getPath());
            if (d != null) {
                try {
                    if (d.exists()) {
                        d.delete();
                    }
                } catch (IOException e) {
                    throw e;
                }
            }
            return a;
        } catch (Throwable th) {
            if (d != null) {
                try {
                    if (d.exists()) {
                        d.delete();
                    }
                } catch (IOException e2) {
                    throw e2;
                }
            }
        }
    }

    /* renamed from: a */
    public static final int m7959a(String str) {
        try {
            InputStream b = C0743a.m3205b(str);
            if (b != null) {
                return C1098i.m7958a(new BufferedInputStream(b));
            }
            String a = C1508i.m10484a(str, 1);
            return a != null ? (a.equalsIgnoreCase(f3327z[3]) || a.equalsIgnoreCase(f3327z[4])) ? new ExifInterface(C0897o.m6290j(str).getPath()).getAttributeInt(f3327z[2], 0) : 0 : 0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            C0691a.m2857a(f3327z[1], e2);
            return 0;
        }
    }

    /* renamed from: a */
    public static final int m7960a(byte[] bArr) {
        try {
            return C1098i.m7958a(new BufferedInputStream(new ByteArrayInputStream(bArr)));
        } catch (Exception e) {
            C0691a.m2857a(f3327z[1], e);
            return 0;
        }
    }

    /* renamed from: a */
    public static final Bitmap m7961a(Bitmap bitmap, int i) {
        switch (i) {
            case 2:
                return C1508i.m10472a(bitmap);
            case 3:
                return C1508i.m10473a(bitmap, 180.0d, 0, 0, 0);
            case 4:
                return C1508i.m10492b(bitmap);
            case 5:
                return C1508i.m10475a(bitmap, 1, 270.0d);
            case 6:
                return C1508i.m10473a(bitmap, 90.0d, 0, 0, 0);
            case 7:
                return C1508i.m10475a(bitmap, 1, 90.0d);
            case 8:
                return C1508i.m10473a(bitmap, 270.0d, 0, 0, 0);
            default:
                return bitmap;
        }
    }

    /* renamed from: z */
    private static String m7962z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 92;
                    break;
                case 1:
                    i2 = 50;
                    break;
                case 2:
                    i2 = 117;
                    break;
                case 3:
                    i2 = 67;
                    break;
                default:
                    i2 = 10;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7963z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 10);
        }
        return toCharArray;
    }
}
