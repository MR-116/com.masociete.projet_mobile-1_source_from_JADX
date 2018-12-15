package fr.pcsoft.wdjava.ui.dessin;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.debug.C0691a;

/* renamed from: fr.pcsoft.wdjava.ui.dessin.j */
class C1368j extends WDCouleurWL {
    /* renamed from: z */
    private static final String f4057z = C1368j.m9797z(C1368j.m9798z("\u0013J;!a?K:º`#\u00050&% L,6ipL:%d<L06"));
    /* renamed from: d */
    private int f4058d = -1;
    /* renamed from: e */
    private int f4059e = -1;
    final C1334i this$0;

    public C1368j(C1334i c1334i) {
        this.this$0 = c1334i;
    }

    public C1368j(C1334i c1334i, int i, int i2) {
        this.this$0 = c1334i;
        try {
            this.c = c1334i.getCouleurPixel(i, i2);
            this.f4059e = i;
            this.f4058d = i2;
        } catch (Exception e) {
            C0691a.m2857a(f4057z, e);
            this.c = 0;
        }
    }

    /* renamed from: z */
    private static String m9797z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 80;
                    break;
                case 1:
                    i2 = 37;
                    break;
                case 2:
                    i2 = 84;
                    break;
                case 3:
                    i2 = 83;
                    break;
                default:
                    i2 = 5;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m9798z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 5);
        }
        return toCharArray;
    }

    /* renamed from: d */
    protected void mo3739d(int i) {
        super.mo3739d(i);
        this.this$0.mo3679a(i, this.f4059e, this.f4058d);
    }

    public void setValeur(WDObjet wDObjet) {
        C1368j c1368j = (C1368j) wDObjet.checkType(C1368j.class);
        if (c1368j != null) {
            this.f4059e = c1368j.f4059e;
            this.f4058d = c1368j.f4058d;
        }
        super.setValeur(wDObjet);
    }
}
