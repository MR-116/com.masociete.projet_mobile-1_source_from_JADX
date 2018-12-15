package fr.pcsoft.wdjava.ui.dessin;

import android.graphics.Bitmap;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.ui.C1489s;
import fr.pcsoft.wdjava.ui.dessin.p077a.C1336b;
import fr.pcsoft.wdjava.ui.dessin.p077a.C1344h;
import fr.pcsoft.wdjava.ui.dessin.p077a.C1348m;
import fr.pcsoft.wdjava.ui.dessin.p077a.C1353s;
import fr.pcsoft.wdjava.ui.p065b.p067a.wb;
import fr.pcsoft.wdjava.ui.utils.C1508i;

public class WDImage extends C1334i {
    /* renamed from: z */
    private static final String[] f3980z = new String[]{m9567z(m9568z("\nF\u0010v\fjJ\u0001q\ne@\u0010|\u0000vF\u0010d\u0004eF\u001aw\u001a\u001b")), m9567z(m9568z("\nF\u0010v\fjJ\u0001~\fnA\u001bm\fgY\u001f~\fmJ"))};

    public WDImage(Bitmap bitmap) {
        this(bitmap != null ? new C1348m(bitmap) : null);
    }

    public WDImage(C1336b c1336b) {
        super(c1336b);
    }

    /* renamed from: z */
    private static String m9567z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 41;
                    break;
                case 1:
                    i2 = 15;
                    break;
                case 2:
                    i2 = 94;
                    break;
                case 3:
                    i2 = 50;
                    break;
                default:
                    i2 = 69;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m9568z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 69);
        }
        return toCharArray;
    }

    /* renamed from: a */
    protected void mo3678a(double d) {
        super.mo3678a(d);
        if (m9566s()) {
            ((C1344h) this.j.m9793g()).m9646a((float) this.b);
            this.j.m9794h().m9716b().setDensity((int) Math.round(160.0d * this.b));
        }
    }

    /* renamed from: a */
    public void mo3679a(int i, int i2, int i3) {
        Bitmap v = m9572v();
        int width = v != null ? v.getWidth() : 0;
        int height = v != null ? v.getHeight() : 0;
        if (i2 < 0 || i2 >= width) {
            WDErreurManager.m2883a(C0745b.m3222b(f3980z[1], String.valueOf(i2 + 1), String.valueOf(width)));
        }
        if (i3 < 0 || i3 >= height) {
            WDErreurManager.m2883a(C0745b.m3222b(f3980z[0], String.valueOf(i3 + 1), String.valueOf(height)));
        }
        v.setPixel(i2, i3, i);
    }

    /* renamed from: a */
    public void mo3680a(WDObjet wDObjet, int i, int i2, int i3) throws C1489s {
        if (i3 == 1) {
            Bitmap a = wDObjet.isMemoBinaire() ? wb.m7830a(wDObjet.getDonneeBinaire(), i, i2) : wb.m7829a(wDObjet.getString(), i, i2);
            if (a != null) {
                try {
                    razVariable();
                    this.j = new C1367h(this, C1353s.m9718a(a));
                    return;
                } catch (C1489s e) {
                    throw e;
                }
            }
        }
        super.mo3680a(wDObjet, i, i2, i3);
    }

    public boolean appliquerRedimensionnement(int i, int i2, int i3) {
        Bitmap v = m9572v();
        if (v == null) {
            return false;
        }
        m9552a(new C1367h(this, C1353s.m9718a(C1508i.m10477a(v, i, i2, i3, true))));
        return true;
    }

    public boolean appliquerRotation(double d, int i, int i2, int i3) {
        Bitmap v = m9572v();
        if (v == null) {
            return false;
        }
        m9552a(new C1367h(this, C1353s.m9718a(C1508i.m10473a(v, d, ((C1344h) this.j.m9793g()).m9641a((double) i), ((C1344h) this.j.m9793g()).m9641a((double) i2), i3))));
        return true;
    }

    public boolean appliquerSymetrieHorizontale() {
        Bitmap v = m9572v();
        if (v == null) {
            return false;
        }
        m9552a(new C1367h(this, C1353s.m9718a(C1508i.m10492b(v))));
        return true;
    }

    public boolean appliquerSymetrieVerticale() {
        Bitmap v = m9572v();
        if (v == null) {
            return false;
        }
        m9552a(new C1367h(this, C1353s.m9718a(C1508i.m10472a(v))));
        return true;
    }

    public int getCouleurPixel(int i, int i2) throws C1489s {
        Bitmap v = m9572v();
        if (v == null) {
            try {
                throw new C1489s("");
            } catch (Exception e) {
                throw e;
            }
        }
        try {
            return v.getPixel(i, i2);
        } catch (Exception e2) {
            throw new C1489s("");
        }
    }

    public void setImagePeintre(C1336b c1336b) {
        m9552a(new C1367h(this, C1353s.m9718a((Bitmap) c1336b.mo3728e())));
        this.b = (double) ((C1344h) this.j.m9793g()).m9671e();
    }

    /* renamed from: v */
    public Bitmap m9572v() {
        return m9566s() ? this.j.m9794h().m9725f() : null;
    }
}
