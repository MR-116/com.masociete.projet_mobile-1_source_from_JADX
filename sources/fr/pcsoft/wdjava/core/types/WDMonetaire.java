package fr.pcsoft.wdjava.core.types;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.allocation.C0613b;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import java.math.BigDecimal;

public class WDMonetaire extends WDNumerique {
    public static final C0613b<WDMonetaire> CREATOR = new C0749a();
    /* renamed from: c */
    private static final int f1571c = 17;
    /* renamed from: d */
    private static final int f1572d = 6;
    /* renamed from: z */
    private static final String[] f1573z = new String[]{m2536z(m2537z("\u00145+2wc9-.w")), m2536z(m2537z("G\u001b\u0017FQB\n\u0016\u0019\\T\u0001"))};

    public WDMonetaire() {
        super(17, 6);
    }

    public WDMonetaire(double d) {
        this();
        setValeur(d);
    }

    public WDMonetaire(WDObjet wDObjet) {
        this();
        setValeur(wDObjet);
    }

    public WDMonetaire(String str) {
        this();
        setValeur(str);
    }

    public WDMonetaire(BigDecimal bigDecimal) {
        this();
        setValeur(bigDecimal);
    }

    /* renamed from: z */
    private static String m2536z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 55;
                    break;
                case 1:
                    i2 = C0607n.co;
                    break;
                case 2:
                    i2 = 100;
                    break;
                case 3:
                    i2 = C0607n.Hn;
                    break;
                default:
                    i2 = 50;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2537z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 50);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public WDNumerique mo2557a(BigDecimal bigDecimal) {
        return new WDMonetaire(bigDecimal);
    }

    /* renamed from: c */
    protected int mo2558c() {
        return 4;
    }

    public String getNomType() {
        return C0745b.m3220a(f1573z[0], new String[0]);
    }

    public int getTypeVar() {
        return 10;
    }

    public String getTypeXMLPourSerialisation() {
        return f1573z[1];
    }

    public void setValeur(WDObjet wDObjet) {
        setValeur(wDObjet.getCurrency());
    }
}
