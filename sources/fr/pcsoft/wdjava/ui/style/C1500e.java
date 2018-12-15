package fr.pcsoft.wdjava.ui.style;

import fr.pcsoft.wdjava.ui.p064a.C1034d;
import fr.pcsoft.wdjava.ui.p079e.C1397c;

/* renamed from: fr.pcsoft.wdjava.ui.style.e */
public class C1500e extends C1495a {
    /* renamed from: x */
    public static final Integer f4541x = new Integer(1);
    /* renamed from: y */
    public static final Integer f4542y = new Integer(0);
    /* renamed from: A */
    private C1034d f4543A = null;
    /* renamed from: B */
    private C1397c f4544B = null;
    /* renamed from: w */
    private Integer f4545w = f4541x;
    /* renamed from: z */
    private Integer f4546z = f4542y;

    public C1500e(C1397c c1397c, C1034d c1034d) {
        this.f4544B = c1397c;
        this.f4543A = c1034d;
    }

    public C1500e(C1397c c1397c, C1034d c1034d, int i) {
        this.f4544B = c1397c;
        this.f4543A = c1034d;
        if (i != this.f4546z.intValue()) {
            this.f4546z = new Integer(i);
        }
    }

    public C1500e(C1397c c1397c, C1034d c1034d, int i, int i2) {
        this.f4544B = c1397c;
        this.f4543A = c1034d;
        if (i != this.f4546z.intValue()) {
            this.f4546z = new Integer(i);
        }
        if (i2 != this.f4545w.intValue()) {
            this.f4545w = new Integer(i);
        }
    }

    /* renamed from: a */
    public Object mo3797a(int i) {
        switch (i) {
            case 2:
                return this.f4543A;
            case 4:
                return this.f4544B;
            case 6:
                return this.f4546z;
            case 7:
                return this.f4545w;
            default:
                return null;
        }
    }

    /* renamed from: a */
    public void mo3804a() {
        this.f4544B = null;
        this.f4543A = null;
        this.f4546z = null;
    }

    /* renamed from: b */
    public void mo3802b(int i, Object obj) {
        switch (i) {
            case 2:
                this.f4543A = (C1034d) obj;
                return;
            case 4:
                this.f4544B = (C1397c) obj;
                return;
            case 6:
                this.f4546z = (Integer) obj;
                return;
            case 7:
                this.f4545w = (Integer) obj;
                return;
            default:
                return;
        }
    }
}
