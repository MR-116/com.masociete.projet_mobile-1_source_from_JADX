package fr.pcsoft.wdjava.core.types;

import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.allocation.C0613b;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;

public class WDEntier1 extends fb {
    public static final C0613b<WDEntier1> CREATOR = new C0790q();
    /* renamed from: z */
    private static final String[] f1540z = new String[]{m2411z(m2412z("Rp/\u0001\u0007Rp/\u0001\u0007Rp/\u0001\u0007Rp")), m2411z(m2412z("A\bZde'\u001fVa#\fVur")), m2411z(m2412z("\u000b.k")), m2411z(m2412z("A\u0005Qe~'\u0012@\u0000"))};
    /* renamed from: a */
    private byte f1541a;

    public WDEntier1() {
        this.f1541a = (byte) 0;
    }

    public WDEntier1(byte b) {
        this.f1541a = b;
    }

    public WDEntier1(double d) {
        setValeur(d);
    }

    public WDEntier1(int i) {
        this.f1541a = (byte) i;
    }

    public WDEntier1(long j) {
        this.f1541a = (byte) ((int) j);
    }

    public WDEntier1(WDObjet wDObjet) {
        setValeur(wDObjet);
    }

    public WDEntier1(String str) {
        setValeur(str);
    }

    public WDEntier1(boolean z) {
        setValeur(z);
    }

    /* renamed from: z */
    private static String m2411z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 98;
                    break;
                case 1:
                    i2 = 64;
                    break;
                case 2:
                    i2 = 31;
                    break;
                case 3:
                    i2 = 49;
                    break;
                default:
                    i2 = 55;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2412z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 55);
        }
        return toCharArray;
    }

    public byte getByte() {
        return this.f1541a;
    }

    public final String getDate() {
        return C0725i.m3070e(C0725i.m3067d(this.f1541a));
    }

    public final String getDateHeure() {
        return this.f1541a == (byte) 0 ? f1540z[0] : super.getDateHeure();
    }

    public final byte[] getDonneeBinaire() {
        return new byte[]{this.f1541a};
    }

    public final double getDouble() {
        return (double) this.f1541a;
    }

    public final String getHeure() {
        if (this.f1541a < (byte) 0) {
            WDErreurManager.m2883a(C0745b.m3222b(f1540z[1], new String[0]));
        }
        return C0725i.m3051b(C0725i.m3037a((long) this.f1541a, false));
    }

    public final int getInt() {
        return this.f1541a;
    }

    public Object getJSONValue() {
        return Byte.valueOf(this.f1541a);
    }

    public final long getLong() {
        return (long) this.f1541a;
    }

    public String getNomType() {
        return C0745b.m3220a(f1540z[3], new String[0]);
    }

    public short getShort() {
        return (short) this.f1541a;
    }

    public final String getString() {
        return String.valueOf(this.f1541a);
    }

    public int getTypeVar() {
        return 6;
    }

    public String getTypeXMLPourSerialisation() {
        return f1540z[2];
    }

    public cb opDec() {
        this.f1541a = (byte) (this.f1541a - 1);
        return this;
    }

    public cb opInc() {
        this.f1541a = (byte) (this.f1541a + 1);
        return this;
    }

    public cb opMoinsUnaire() {
        return new WDEntier1(-this.f1541a);
    }

    public void razVariable() {
        this.f1541a = (byte) 0;
    }

    public void setValeur(byte b) {
        this.f1541a = b;
    }

    public void setValeur(double d) {
        this.f1541a = (byte) ((int) d);
    }

    public void setValeur(int i) {
        this.f1541a = (byte) i;
    }

    public void setValeur(long j) {
        this.f1541a = (byte) ((int) j);
    }

    public void setValeur(WDObjet wDObjet) {
        this.f1541a = wDObjet.getByte();
    }

    public void setValeur(String str) {
        setValeur(C0725i.m3064d(str));
    }

    public void setValeur(short s) {
        this.f1541a = (byte) s;
    }

    public void setValeur(boolean z) {
        if (z) {
            this.f1541a = (byte) 1;
        } else {
            this.f1541a = (byte) 0;
        }
    }
}
