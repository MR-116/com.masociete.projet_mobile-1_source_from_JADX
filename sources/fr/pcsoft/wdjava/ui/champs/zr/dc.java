package fr.pcsoft.wdjava.ui.champs.zr;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.p058k.C0931b;
import fr.pcsoft.wdjava.ui.C0489p;

public class dc extends C0489p {
    /* renamed from: z */
    private static final String[] f3844z = new String[]{m9062z(m9063z("<x")), m9062z(m9063z("B\u0019\u0000Bo5\t\u000bF~$\u0004\fM"))};
    /* renamed from: d */
    private int f3845d = 0;
    final WDAttributZR this$0;

    public dc(WDAttributZR wDAttributZR, int i) {
        this.this$0 = wDAttributZR;
        this.f3845d = i;
    }

    /* renamed from: z */
    private static String m9062z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 97;
                    break;
                case 1:
                    i2 = 86;
                    break;
                case 2:
                    i2 = 66;
                    break;
                case 3:
                    i2 = 8;
                    break;
                default:
                    i2 = 42;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m9063z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 42);
        }
        return toCharArray;
    }

    public String getName() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.this$0.getName()).append(C0931b.f2543a).append(this.f3845d).append(f3844z[0]);
        return stringBuffer.toString();
    }

    public String getNomType() {
        return C0745b.m3220a(f3844z[1], new String[0]);
    }

    public WDObjet getValeur() {
        WDObjet b = ((ec) this.this$0.f973k.get(this.f3845d + 1)).m9107b(this.this$0.getIndiceAttribut());
        return b == null ? this.this$0.getValeurDefautAttribut() : b;
    }

    public void setValeur(WDObjet wDObjet) {
        this.this$0.m1483a((ec) this.this$0.f973k.get(this.f3845d + 1), wDObjet);
    }
}
