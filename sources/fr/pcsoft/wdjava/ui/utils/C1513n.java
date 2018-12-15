package fr.pcsoft.wdjava.ui.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.utils.fb;
import fr.pcsoft.wdjava.ui.C1489s;
import fr.pcsoft.wdjava.ui.dessin.p077a.C1348m;

/* renamed from: fr.pcsoft.wdjava.ui.utils.n */
final class C1513n extends fb<Void> {
    /* renamed from: z */
    private static final String[] f4649z = new String[]{C1513n.m10538z(C1513n.m10539z("?mI^\u0018cm\u001cIJb/\fH\u001e1x\u001bT\u000eda\u001d^Ju}\u001bZ\u0004e(\u0005ZJbi\u001cM\u000fvi\u001b_\u000f1l\f\u001b\u00066a\u0004Z\rt(\rZ\u0004b(\u0005^Jwa\nS\u0003tzI^\u0012em\u001bU\u000f?")), C1513n.m10538z(C1513n.m10539z("\u0000ao"))};
    final int val$nAngleRotation;
    final String val$strCheminImage;

    C1513n(String str, int i) {
        this.val$strCheminImage = str;
        this.val$nAngleRotation = i;
    }

    /* renamed from: z */
    private static String m10538z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 106;
                    break;
                case 1:
                    i2 = 17;
                    break;
                case 2:
                    i2 = 8;
                    break;
                case 3:
                    i2 = 105;
                    break;
                default:
                    i2 = 59;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m10539z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 59);
        }
        return toCharArray;
    }

    /* renamed from: c */
    public Void m10540c() throws Exception {
        Bitmap decodeFile = BitmapFactory.decodeFile(this.val$strCheminImage);
        if (decodeFile != null) {
            Bitmap a = C1508i.m10473a(decodeFile, (double) this.val$nAngleRotation, Integer.MIN_VALUE, Integer.MIN_VALUE, 1);
            if (a != decodeFile) {
                try {
                    new C1348m(a).mo3723a(this.val$strCheminImage, 100, 0, f4649z[1]);
                } catch (Exception e) {
                    C0691a.m2857a(f4649z[0], e);
                } catch (Throwable th) {
                    if (decodeFile != null) {
                        try {
                            decodeFile.recycle();
                        } catch (C1489s e2) {
                            throw e2;
                        }
                    }
                    if (a != null) {
                        try {
                            a.recycle();
                        } catch (C1489s e22) {
                            throw e22;
                        }
                    }
                }
            }
            if (decodeFile != null) {
                try {
                    decodeFile.recycle();
                } catch (C1489s e222) {
                    throw e222;
                }
            }
            if (a != null) {
                try {
                    a.recycle();
                } catch (C1489s e2222) {
                    throw e2222;
                }
            }
        }
        return null;
    }

    public /* bridge */ /* synthetic */ Object call() throws Exception {
        return m10540c();
    }
}
