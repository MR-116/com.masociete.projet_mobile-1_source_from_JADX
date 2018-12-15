package fr.pcsoft.wdjava.core.types;

import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.allocation.C0613b;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class WDEntier2 extends fb {
    public static final C0613b<WDEntier2> CREATOR = new C0784i();
    /* renamed from: z */
    private static final String[] f1548z = new String[]{m2433z(m2434z(">7M'zX \\A")), m2433z(m2434z("t\u001cw")), m2433z(m2434z(">:F&aX-J=e\\>J7v")), m2433z(m2434z("-B3C\u0003-B3C\u0003-B3C\u0003-B"))};
    /* renamed from: a */
    private short f1549a;

    public WDEntier2() {
        this.f1549a = (short) 0;
    }

    public WDEntier2(double d) {
        setValeur(d);
    }

    public WDEntier2(int i) {
        this.f1549a = (short) i;
    }

    public WDEntier2(long j) {
        this.f1549a = (short) ((int) j);
    }

    public WDEntier2(WDObjet wDObjet) {
        setValeur(wDObjet);
    }

    public WDEntier2(String str) {
        setValeur(str);
    }

    public WDEntier2(short s) {
        this.f1549a = s;
    }

    public WDEntier2(boolean z) {
        setValeur(z);
    }

    /* renamed from: z */
    private static String m2433z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 29;
                    break;
                case 1:
                    i2 = 114;
                    break;
                case 2:
                    i2 = 3;
                    break;
                case 3:
                    i2 = 115;
                    break;
                default:
                    i2 = 51;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2434z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 51);
        }
        return toCharArray;
    }

    public byte getByte() {
        return (byte) this.f1549a;
    }

    public final String getDate() {
        return C0725i.m3070e(C0725i.m3067d(this.f1549a));
    }

    public final String getDateHeure() {
        return this.f1549a == (short) 0 ? f1548z[3] : super.getDateHeure();
    }

    public final byte[] getDonneeBinaire() {
        byte[] bArr = new byte[2];
        ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).putShort(this.f1549a);
        return bArr;
    }

    public final double getDouble() {
        return (double) this.f1549a;
    }

    public final String getHeure() {
        if (this.f1549a < (short) 0) {
            WDErreurManager.m2883a(C0745b.m3222b(f1548z[2], new String[0]));
        }
        return C0725i.m3051b(C0725i.m3037a((long) this.f1549a, false));
    }

    public final int getInt() {
        return this.f1549a;
    }

    public Object getJSONValue() {
        return Short.valueOf(this.f1549a);
    }

    public final long getLong() {
        return (long) this.f1549a;
    }

    public String getNomType() {
        return C0745b.m3220a(f1548z[0], new String[0]);
    }

    public short getShort() {
        return this.f1549a;
    }

    public final String getString() {
        return String.valueOf(this.f1549a);
    }

    public int getTypeVar() {
        return 7;
    }

    public String getTypeXMLPourSerialisation() {
        return f1548z[1];
    }

    public cb opDec() {
        this.f1549a = (short) (this.f1549a - 1);
        return this;
    }

    public cb opInc() {
        this.f1549a = (short) (this.f1549a + 1);
        return this;
    }

    public cb opMoinsUnaire() {
        return new WDEntier2(-this.f1549a);
    }

    public void razVariable() {
        this.f1549a = (short) 0;
    }

    public void setValeur(byte b) {
        this.f1549a = (short) b;
    }

    public void setValeur(double d) {
        this.f1549a = (short) ((int) d);
    }

    public void setValeur(int i) {
        this.f1549a = (short) i;
    }

    public void setValeur(long j) {
        this.f1549a = (short) ((int) j);
    }

    public void setValeur(WDObjet wDObjet) {
        this.f1549a = wDObjet.getShort();
    }

    public void setValeur(String str) {
        setValeur(C0725i.m3064d(str));
    }

    public void setValeur(short s) {
        this.f1549a = s;
    }

    public void setValeur(boolean z) {
        if (z) {
            this.f1549a = (short) 1;
        } else {
            this.f1549a = (short) 0;
        }
    }
}
