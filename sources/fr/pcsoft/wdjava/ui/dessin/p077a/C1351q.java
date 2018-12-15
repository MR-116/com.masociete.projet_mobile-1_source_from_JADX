package fr.pcsoft.wdjava.ui.dessin.p077a;

import android.graphics.Bitmap;
import fr.pcsoft.wdjava.core.utils.C0819w;

/* renamed from: fr.pcsoft.wdjava.ui.dessin.a.q */
class C1351q extends C1349o {
    private C1351q() {
    }

    C1351q(C1345i c1345i) {
        this();
    }

    /* renamed from: a */
    public void mo3729a(Bitmap bitmap, int i, int i2, int i3, int i4) {
        int pixel = bitmap.getPixel(i, i2);
        if (pixel != i3) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            C0819w c0819w = new C0819w(1000);
            c0819w.m4159a((((long) i) << 32) | (((long) i2) & 4294967295L));
            while (c0819w.m4163c() > 0) {
                long f = c0819w.m4166f();
                int i5 = (int) (f >> 32);
                int i6 = (int) (f & 4294967295L);
                if (bitmap.getPixel(i5, i6) == pixel) {
                    int i7 = i5 + 1;
                    while (i5 > 0 && bitmap.getPixel(i5, i6) == pixel) {
                        bitmap.setPixel(i5, i6, i3);
                        if (i6 > 0) {
                            if (bitmap.getPixel(i5, i6 - 1) == pixel) {
                                c0819w.m4159a((((long) i5) << 32) | (((long) (i6 - 1)) & 4294967295L));
                            }
                        }
                        if (i6 < height - 1) {
                            if (bitmap.getPixel(i5, i6 + 1) == pixel) {
                                c0819w.m4159a((((long) i5) << 32) | (((long) (i6 + 1)) & 4294967295L));
                            }
                        }
                        i5--;
                    }
                    while (i7 < width - 1 && bitmap.getPixel(i7, i6) == pixel) {
                        bitmap.setPixel(i7, i6, i3);
                        if (i6 > 0) {
                            if (bitmap.getPixel(i7, i6 - 1) == pixel) {
                                c0819w.m4159a((((long) i7) << 32) | (((long) (i6 - 1)) & 4294967295L));
                            }
                        }
                        if (i6 < height - 1) {
                            if (bitmap.getPixel(i7, i6 + 1) == pixel) {
                                c0819w.m4159a((((long) i7) << 32) | (((long) (i6 + 1)) & 4294967295L));
                            }
                        }
                        i7++;
                    }
                }
            }
        }
    }
}
