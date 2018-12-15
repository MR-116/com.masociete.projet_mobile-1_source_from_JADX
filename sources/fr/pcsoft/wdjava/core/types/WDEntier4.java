package fr.pcsoft.wdjava.core.types;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.allocation.C0613b;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class WDEntier4 extends fb {
    public static final C0613b<WDEntier4> CREATOR = new jb();
    /* renamed from: z */
    private static final String[] f1249z = new String[]{m1762z(m1763z("oa1*,\tv")), m1762z(m1763z("|\u0014ONU|\u0014ONU|\u0014ONU|\u0014")), m1762z(m1763z("%J\u000b")), m1762z(m1763z("ol:+7\t{603\rh6: "))};
    /* renamed from: a */
    private int f1250a;

    public WDEntier4() {
        this.f1250a = 0;
    }

    public WDEntier4(double d) {
        setValeur(d);
    }

    public WDEntier4(int i) {
        this.f1250a = i;
    }

    public WDEntier4(long j) {
        this.f1250a = (int) j;
    }

    public WDEntier4(WDObjet wDObjet) {
        setValeur(wDObjet);
    }

    public WDEntier4(String str) {
        setValeur(str);
    }

    public WDEntier4(boolean z) {
        setValeur(z);
    }

    /* renamed from: z */
    private static String m1762z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 76;
                    break;
                case 1:
                    i2 = 36;
                    break;
                case 2:
                    i2 = C0607n.bx;
                    break;
                case 3:
                    i2 = 126;
                    break;
                default:
                    i2 = 101;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1763z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 101);
        }
        return toCharArray;
    }

    public byte getByte() {
        return (byte) this.f1250a;
    }

    public final String getDate() {
        return C0725i.m3070e(C0725i.m3067d(this.f1250a));
    }

    public final String getDateHeure() {
        return this.f1250a == 0 ? f1249z[1] : super.getDateHeure();
    }

    public final byte[] getDonneeBinaire() {
        byte[] bArr = new byte[4];
        ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).putInt(this.f1250a);
        return bArr;
    }

    public final double getDouble() {
        return (double) this.f1250a;
    }

    public final String getHeure() {
        if (this.f1250a < 0) {
            WDErreurManager.m2883a(C0745b.m3222b(f1249z[3], new String[0]));
        }
        return C0725i.m3051b(C0725i.m3037a((long) this.f1250a, false));
    }

    public final int getInt() {
        return this.f1250a;
    }

    public Object getJSONValue() {
        return Integer.valueOf(this.f1250a);
    }

    public final long getLong() {
        return (long) this.f1250a;
    }

    public String getNomType() {
        return C0745b.m3220a(f1249z[0], new String[0]);
    }

    public short getShort() {
        return (short) this.f1250a;
    }

    public final String getString() {
        return String.valueOf(this.f1250a);
    }

    public int getTypeVar() {
        return 8;
    }

    public String getTypeXMLPourSerialisation() {
        return f1249z[2];
    }

    public cb opDec() {
        this.f1250a--;
        return this;
    }

    public cb opInc() {
        this.f1250a++;
        return this;
    }

    public cb opMoinsUnaire() {
        return new WDEntier4(-this.f1250a);
    }

    public void razVariable() {
        this.f1250a = 0;
    }

    public void setValeur(byte b) {
        this.f1250a = b;
    }

    public void setValeur(double d) {
        this.f1250a = (int) d;
    }

    public void setValeur(int i) {
        this.f1250a = i;
    }

    public void setValeur(long j) {
        this.f1250a = (int) j;
    }

    public void setValeur(WDObjet wDObjet) {
        this.f1250a = wDObjet.getValeur().getInt();
    }

    public void setValeur(String str) {
        setValeur(C0725i.m3064d(str));
    }

    public void setValeur(short s) {
        this.f1250a = s;
    }

    public void setValeur(boolean z) {
        if (z) {
            this.f1250a = 1;
        } else {
            this.f1250a = 0;
        }
    }
}
