package fr.pcsoft.wdjava.core.types;

import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.allocation.C0613b;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class WDEntier8 extends fb {
    public static final C0613b<WDEntier8> CREATOR = new C0794v();
    /* renamed from: z */
    private static final String[] f1551z = new String[]{m2440z(m2441z("\u001f\u001f\u0010J")), m2440z(m2441z("P50yd6\"!\u001f"))};
    /* renamed from: a */
    private long f1552a;

    public WDEntier8() {
        this.f1552a = 0;
    }

    public WDEntier8(double d) {
        setValeur(d);
    }

    public WDEntier8(int i) {
        this.f1552a = (long) i;
    }

    public WDEntier8(long j) {
        this.f1552a = j;
    }

    public WDEntier8(WDObjet wDObjet) {
        setValeur(wDObjet);
    }

    public WDEntier8(String str) {
        setValeur(str);
    }

    public WDEntier8(boolean z) {
        setValeur(z);
    }

    /* renamed from: z */
    private static String m2440z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 115;
                    break;
                case 1:
                    i2 = 112;
                    break;
                case 2:
                    i2 = 126;
                    break;
                case 3:
                    i2 = 45;
                    break;
                default:
                    i2 = 45;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2441z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 45);
        }
        return toCharArray;
    }

    public byte getByte() {
        return (byte) ((int) this.f1552a);
    }

    public byte[] getDonneeBinaire() {
        byte[] bArr = new byte[8];
        ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).putLong(this.f1552a);
        return bArr;
    }

    public double getDouble() {
        return (double) this.f1552a;
    }

    public int getInt() {
        return (int) this.f1552a;
    }

    public Object getJSONValue() {
        return Long.valueOf(this.f1552a);
    }

    public long getLong() {
        return this.f1552a;
    }

    public String getNomType() {
        return C0745b.m3220a(f1551z[1], new String[0]);
    }

    public short getShort() {
        return (short) ((int) this.f1552a);
    }

    public String getString() {
        return Long.toString(this.f1552a);
    }

    public int getTypeVar() {
        return 9;
    }

    public String getTypeXMLPourSerialisation() {
        return f1551z[0];
    }

    public cb opDec() {
        this.f1552a--;
        return this;
    }

    public cb opDecalageBinaireDroite(int i) {
        return new WDEntier8(this.f1552a >> i);
    }

    public cb opDecalageBinaireGauche(int i) {
        return new WDEntier8(this.f1552a << i);
    }

    public cb opEtBinaire(double d) {
        return new WDEntier8(this.f1552a & ((long) d));
    }

    public cb opEtBinaire(int i) {
        return new WDEntier8(this.f1552a & ((long) i));
    }

    public cb opEtBinaire(long j) {
        return new WDEntier8(((long) getInt()) & j);
    }

    public cb opEtBinaire(WDObjet wDObjet) {
        return new WDEntier8(this.f1552a & wDObjet.getLong());
    }

    public cb opEtBinaire(String str) {
        return new WDEntier8(this.f1552a & C0725i.m3055c(str));
    }

    public cb opEtBinaire(boolean z) {
        return new WDEntier8(this.f1552a & ((long) (z ? 1 : 0)));
    }

    public cb opInc() {
        this.f1552a++;
        return this;
    }

    public cb opMoinsUnaire() {
        return new WDEntier4(-this.f1552a);
    }

    public cb opNonBinaire() {
        return new WDEntier8(this.f1552a ^ -1);
    }

    public cb opOuBinaire(double d) {
        return new WDEntier4(getLong() | ((long) d));
    }

    public cb opOuBinaire(int i) {
        return new WDEntier8(getLong() | ((long) i));
    }

    public cb opOuBinaire(long j) {
        return new WDEntier8(this.f1552a | j);
    }

    public cb opOuBinaire(WDObjet wDObjet) {
        return new WDEntier8(this.f1552a | wDObjet.getLong());
    }

    public cb opOuBinaire(String str) {
        return new WDEntier8(this.f1552a | C0725i.m3055c(str));
    }

    public cb opOuBinaire(boolean z) {
        return new WDEntier8(this.f1552a | ((long) (z ? 1 : 0)));
    }

    public cb opOuExclusifBinaire(double d) {
        return new WDEntier8(this.f1552a ^ ((long) d));
    }

    public cb opOuExclusifBinaire(int i) {
        return new WDEntier8(this.f1552a ^ ((long) i));
    }

    public cb opOuExclusifBinaire(long j) {
        return new WDEntier8(this.f1552a ^ j);
    }

    public cb opOuExclusifBinaire(WDObjet wDObjet) {
        return new WDEntier8(this.f1552a ^ wDObjet.getLong());
    }

    public cb opOuExclusifBinaire(String str) {
        return new WDEntier8(this.f1552a ^ C0725i.m3055c(str));
    }

    public cb opOuExclusifBinaire(boolean z) {
        return new WDEntier8(this.f1552a ^ ((long) (z ? 1 : 0)));
    }

    public void razVariable() {
        this.f1552a = 0;
    }

    public void setValeur(byte b) {
        this.f1552a = (long) b;
    }

    public void setValeur(double d) {
        this.f1552a = (long) d;
    }

    public void setValeur(int i) {
        this.f1552a = (long) i;
    }

    public void setValeur(long j) {
        this.f1552a = j;
    }

    public void setValeur(WDObjet wDObjet) {
        this.f1552a = wDObjet.getValeur().getLong();
    }

    public void setValeur(String str) {
        setValeur(C0725i.m3055c(str));
    }

    public void setValeur(short s) {
        this.f1552a = (long) s;
    }

    public void setValeur(boolean z) {
        if (z) {
            this.f1552a = 1;
        } else {
            this.f1552a = 0;
        }
    }
}
