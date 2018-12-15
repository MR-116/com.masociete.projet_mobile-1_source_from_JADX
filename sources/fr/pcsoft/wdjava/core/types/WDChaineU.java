package fr.pcsoft.wdjava.core.types;

import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.allocation.C0613b;
import java.io.InputStream;

public class WDChaineU extends WDChaine {
    public static final C0613b<WDChaineU> CREATOR = new kb();
    /* renamed from: c */
    public static final String f1553c = m2442z(m2443z("93o\f-Z+l"));

    public WDChaineU(char c) {
        super(c);
    }

    public WDChaineU(double d) {
        super(d);
    }

    public WDChaineU(int i) {
        super(i);
    }

    public WDChaineU(long j) {
        super(j);
    }

    public WDChaineU(WDObjet wDObjet) {
        super(wDObjet);
    }

    public WDChaineU(InputStream inputStream) {
        super(inputStream);
    }

    public WDChaineU(String str) {
        super(str);
    }

    public WDChaineU(boolean z) {
        super(z);
    }

    public WDChaineU(byte[] bArr) {
        super(bArr);
    }

    /* renamed from: z */
    private static String m2442z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 108;
                    break;
                case 1:
                    i2 = 103;
                    break;
                case 2:
                    i2 = 41;
                    break;
                case 3:
                    i2 = 33;
                    break;
                default:
                    i2 = 28;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2443z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 28);
        }
        return toCharArray;
    }

    /* renamed from: a */
    protected WDChaine mo2544a(String str) {
        return new WDChaineU(str);
    }

    /* renamed from: a */
    protected WDChaine mo2545a(byte[] bArr) {
        return new WDChaineU(bArr);
    }

    /* renamed from: d */
    public String mo2547d() {
        return f1553c;
    }

    public int getTypeVar() {
        return 16;
    }

    public void setValeur(byte[] bArr) {
        setValeur(C0725i.m3035a(bArr, f1553c));
    }
}
