package fr.pcsoft.wdjava.core.types;

import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.core.utils.C0810n;
import fr.pcsoft.wdjava.file.C0895m;
import fr.pcsoft.wdjava.file.C0897o;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.math.BigDecimal;

public class WDChaine extends cb implements Serializable {
    /* renamed from: z */
    private static final String[] f1544z = new String[]{m2422z(m2423z("\u00119D\u001c6r!G")), m2422z(m2423z("g)WcB\u0001")), m2422z(m2423z("g.MQ\u0001?QxH\n2K|W\u000b>QxE\b(")), m2422z(m2423z("o'JyJ\t>Q}K\b")), m2422z(m2423z("g.JpN\n(")), m2422z(m2423z("g(PcX\u0017(PxF\b$QpS\r\"LnD\f,KB")), m2422z(m2423z("7\u0019pXi#")), m2422z(m2423z("g G|H\u001b/KF\r?G"))};
    /* renamed from: a */
    protected byte[] f1545a;
    /* renamed from: b */
    protected String f1546b;

    public WDChaine() {
        this.f1546b = "";
        this.f1546b = "";
    }

    public WDChaine(char c) {
        this.f1546b = "";
        this.f1546b = String.valueOf(c);
    }

    public WDChaine(double d) {
        this.f1546b = "";
        this.f1546b = C0725i.m3023a(d, 15);
    }

    public WDChaine(int i) {
        this.f1546b = "";
        this.f1546b = String.valueOf(i);
    }

    public WDChaine(long j) {
        this.f1546b = "";
        this.f1546b = String.valueOf(j);
    }

    public WDChaine(WDObjet wDObjet) {
        this.f1546b = "";
        setValeur(wDObjet);
    }

    public WDChaine(InputStream inputStream) {
        this.f1546b = "";
        m2419a(inputStream);
    }

    public WDChaine(String str) {
        this.f1546b = "";
        if (str != null) {
            this.f1546b = str;
        }
    }

    public WDChaine(boolean z) {
        this.f1546b = "";
        this.f1546b = String.valueOf(z);
    }

    public WDChaine(byte[] bArr) {
        this.f1546b = "";
        this.f1545a = bArr;
    }

    /* renamed from: a */
    public static int m2417a(byte[] bArr, byte[] bArr2, boolean z) {
        if (bArr.length < bArr2.length) {
            return -1;
        }
        if (bArr.length > bArr2.length) {
            return 1;
        }
        int i;
        if (z) {
            i = 0;
            while (i < bArr.length) {
                char c = (char) bArr[i];
                char c2 = (char) bArr2[i];
                if (c != c2) {
                    return c < c2 ? -1 : 1;
                } else {
                    i++;
                }
            }
            return 0;
        }
        i = 0;
        while (i < bArr.length) {
            byte b = bArr[i];
            byte b2 = bArr2[i];
            if (b != b2) {
                return b < b2 ? -1 : 1;
            } else {
                i++;
            }
        }
        return 0;
    }

    /* renamed from: a */
    private void m2418a() {
        this.f1546b = "";
        if (this.f1545a != null) {
            C0895m b = C0897o.m6257b(this.f1545a);
            if (b != null) {
                this.f1546b = C0725i.m3035a(this.f1545a, b.m6228c());
            }
            this.f1546b = C0725i.m3035a(this.f1545a, mo2547d());
        }
    }

    /* renamed from: a */
    private boolean m2419a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th;
        boolean z = false;
        if (inputStream != null) {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = inputStream.read(bArr, 0, 4096);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                    this.f1545a = byteArrayOutputStream.toByteArray();
                    z = true;
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (IOException e) {
                        }
                    }
                    inputStream.close();
                } catch (IOException e2) {
                    throw e2;
                } catch (IOException e3) {
                }
            } catch (IOException e4) {
                byteArrayOutputStream = null;
                try {
                    this.f1545a = null;
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (IOException e5) {
                        }
                    }
                    inputStream.close();
                    return z;
                } catch (Throwable th2) {
                    th = th2;
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (IOException e6) {
                            throw th;
                        }
                    }
                    inputStream.close();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                byteArrayOutputStream = null;
                if (byteArrayOutputStream != null) {
                    byteArrayOutputStream.close();
                }
                inputStream.close();
                throw th;
            }
        }
        return z;
    }

    /* renamed from: a */
    public static byte[] m2420a(byte[] bArr, byte[] bArr2) {
        Object obj = new byte[(bArr.length + bArr2.length)];
        System.arraycopy(bArr, 0, obj, 0, bArr.length);
        System.arraycopy(bArr2, 0, obj, bArr.length, bArr2.length);
        return obj;
    }

    /* renamed from: c */
    public static final int m2421c() {
        return WDProjet.getInstance().isModeAnsi() ? 19 : 16;
    }

    /* renamed from: z */
    private static String m2422z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 68;
                    break;
                case 1:
                    i2 = 109;
                    break;
                case 2:
                    i2 = 2;
                    break;
                case 3:
                    i2 = 49;
                    break;
                default:
                    i2 = 7;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2423z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 7);
        }
        return toCharArray;
    }

    /* renamed from: a */
    protected double mo2354a(WDObjet wDObjet) {
        if ((isMemoBinaire() || wDObjet.isMemoBinaire()) && isUnicode() == wDObjet.isUnicode()) {
            return (double) m2417a(getDonneeBinaire(), wDObjet.isChaine() ? wDObjet.getDonneeBinaire() : C0725i.m3082k(wDObjet.getString()), true);
        }
        WDObjet valeur = wDObjet.getValeur();
        return valeur.isDateHeure() ? ((WDDateHeure) valeur).mo2354a((WDObjet) this) * -1.0d : (double) getString().compareTo(valeur.getString());
    }

    /* renamed from: a */
    protected void mo2546a(byte[] bArr, String str) {
        this.f1545a = bArr;
        this.f1546b = "";
    }

    /* renamed from: d */
    public String mo2547d() {
        return m2421c() == 19 ? WDProjet.getInstance().getCharset() : f1544z[0];
    }

    /* renamed from: e */
    public long m2427e() {
        return C0725i.m3055c(getString());
    }

    public WDObjet extraireChaine(int i, WDObjet wDObjet) {
        String string = wDObjet.getString();
        String string2 = getString();
        if (i >= 1 && i <= string2.length()) {
            int i2 = i - 1;
            setValeur(string2.substring(0, i2) + string + string2.substring(i2 + 1, string2.length()));
            return this;
        } else if (i != string2.length() + 1) {
            return new WDChaine("");
        } else {
            setValeur(string2 + wDObjet.getString());
            return this;
        }
    }

    public WDObjet extraireDebutChaine(int i, WDObjet wDObjet) {
        String string = wDObjet.getString();
        String string2 = getString();
        if (i < 1) {
            setValeur(string);
        } else {
            if (i >= string2.length()) {
                i = string2.length();
            }
            setValeur(string + string2.substring(i, string2.length()));
        }
        return this;
    }

    public WDObjet extraireFinChaine(int i, WDObjet wDObjet) {
        String string = wDObjet.getString();
        String string2 = getString();
        if (i < 1 || i > string2.length()) {
            setValeur(string);
        } else {
            setValeur(string2.substring(0, i - 1) + string);
        }
        return this;
    }

    public WDObjet extrairePartieChaine(int i, int i2, WDObjet wDObjet) {
        return extraireSousChaine(i, (i + i2) - 1, wDObjet);
    }

    public WDObjet extraireSousChaine(int i, int i2, WDObjet wDObjet) {
        String string = wDObjet.getString();
        String string2 = getString();
        if (i < 1 || i > string2.length() || i2 < i || i2 < 1) {
            setValeur(string);
        } else {
            int i3 = i - 1;
            if (i2 > string2.length()) {
                i2 = string2.length();
            }
            setValeur(string2.substring(0, i3) + string + string2.substring(i2, string2.length()));
        }
        return this;
    }

    /* renamed from: f */
    public double m2428f() {
        return C0725i.m3084m(getString());
    }

    /* renamed from: g */
    public int m2429g() {
        return C0725i.m3064d(getString());
    }

    public BigDecimal getBigDecimal() {
        return C0725i.m3080i(getString());
    }

    public boolean getBoolean() {
        return C0725i.m3072e(getString());
    }

    public byte getByte() {
        return (byte) getInt();
    }

    public char getCharAt(int i) {
        return isMemoBinaire() ? (char) this.f1545a[i] : this.f1546b.charAt(i);
    }

    public WDObjet getClone() {
        WDChaine wDChaine = (WDChaine) super.getClone();
        if (this.f1545a != null) {
            wDChaine.f1545a = (byte[]) this.f1545a.clone();
        }
        return wDChaine;
    }

    public BigDecimal getCurrency() {
        return getBigDecimal();
    }

    public String getDate() {
        return getString();
    }

    public String getDateHeure() {
        return getString();
    }

    public byte[] getDonneeBinaire() {
        return this.f1545a != null ? this.f1545a : this.f1546b != null ? C0725i.m3039a(this.f1546b, mo2547d()) : new byte[0];
    }

    public double getDouble() {
        return m2428f();
    }

    public long getDuree() {
        String string = getString();
        int length = string.length();
        if (string.indexOf(45) == 0) {
            length--;
        }
        if (length >= f1544z[3].length() - 1) {
            return C0725i.m3044b(getString(), f1544z[3]).getDuree();
        }
        WDErreurManager.m2883a(C0745b.m3222b(f1544z[2], C0745b.m3220a(f1544z[4], new String[0]), C0745b.m3220a(f1544z[1], new String[0])));
        return 0;
    }

    public String getHeure() {
        return getString();
    }

    public int getInt() {
        return m2429g();
    }

    public Object getJSONValue() {
        return getString();
    }

    public long getLong() {
        return m2427e();
    }

    public int getNbCaractere() {
        return isMemoBinaire() ? this.f1545a.length : this.f1546b.length();
    }

    public String getNomType() {
        return this.f1545a != null ? C0745b.m3220a(f1544z[7], new String[0]) : C0745b.m3220a(f1544z[4], new String[0]);
    }

    public WDProcedure getProcedure() {
        return new WDProcedure(this.f1546b);
    }

    public short getShort() {
        return (short) getInt();
    }

    public String getString() {
        if (this.f1545a == null) {
            return this.f1546b;
        }
        if (this.f1546b.equals("")) {
            m2418a();
        }
        return this.f1546b;
    }

    public int getTypeVar() {
        return m2421c();
    }

    public String getTypeXMLPourSerialisation() {
        return f1544z[6];
    }

    public String getValeurXMLPourSerialisation() {
        String string = getString();
        int length = string.length();
        for (int i = 0; i < length; i++) {
            switch (string.charAt(i)) {
                case '\u0000':
                case '\u0001':
                case '\u0002':
                case '\u0003':
                case '\u0004':
                case '\u0005':
                case '\u0006':
                case '\u0007':
                case '\b':
                case '\u000b':
                case '\f':
                case '\u000e':
                case '\u000f':
                case '\u0010':
                case '\u0011':
                case '\u0012':
                case '\u0013':
                case '\u0014':
                case '\u0015':
                case '\u0016':
                case '\u0017':
                case '\u0018':
                case '\u0019':
                case '\u001a':
                case '\u001b':
                case '\u001c':
                case '\u001d':
                case '\u001e':
                case '\u001f':
                    WDErreurManager.m2883a(C0745b.m3222b(f1544z[5], String.valueOf(r4)));
                    break;
                default:
                    break;
            }
        }
        return C0808l.m4050h(string);
    }

    /* renamed from: h */
    public long m2430h() {
        return this.f1545a != null ? 0 + C0810n.m4090a(this.f1545a) : this.f1546b != null ? 0 + C0810n.m4089a(this.f1546b) : 0;
    }

    public boolean isChaine() {
        return true;
    }

    public boolean isMemoBinaire() {
        return this.f1545a != null;
    }

    public boolean isNull() {
        return false;
    }

    public cb opPlus(double d) {
        return isMemoBinaire() ? mo2545a(m2420a(getDonneeBinaire(), C0725i.m3038a(d))) : mo2544a(this.f1546b + d);
    }

    public cb opPlus(int i) {
        return isMemoBinaire() ? mo2545a(m2420a(getDonneeBinaire(), C0725i.m3063c(i))) : mo2544a(this.f1546b + i);
    }

    public cb opPlus(long j) {
        return isMemoBinaire() ? mo2545a(m2420a(getDonneeBinaire(), C0725i.m3054b(j))) : mo2544a(this.f1546b + j);
    }

    public cb opPlus(WDObjet wDObjet) {
        if (wDObjet.isChaineOptionnelle()) {
            String string = getString();
            return (string.equals("") || string.endsWith(((WDChaineOptionnelle) wDObjet).m3257k())) ? mo2544a(string + ((WDChaineOptionnelle) wDObjet).m3256j()) : new WDChaineOptionnelle(string + wDObjet.getString(), ((WDChaineOptionnelle) wDObjet).m3258l() + string.length(), ((WDChaineOptionnelle) wDObjet).m3255i());
        } else {
            if (!(isUnicode() || wDObjet.isUnicode())) {
                if (isMemoBinaire()) {
                    byte[] donneeBinaire = wDObjet.isChaine() ? wDObjet.getDonneeBinaire() : C0725i.m3082k(wDObjet.getString());
                    if (donneeBinaire != null) {
                        return mo2545a(m2420a(this.f1545a, donneeBinaire));
                    }
                }
                if (wDObjet.isMemoBinaire()) {
                    return mo2545a(m2420a(getDonneeBinaire(), wDObjet.getDonneeBinaire()));
                }
            }
            return mo2544a(getString() + wDObjet.getValeur().getString());
        }
    }

    public cb opPlus(String str) {
        return isMemoBinaire() ? mo2545a(m2420a(getDonneeBinaire(), C0725i.m3039a(str, mo2547d()))) : mo2544a(this.f1546b + str);
    }

    public cb opPlus(boolean z) {
        if (isMemoBinaire()) {
            return mo2545a(m2420a(getDonneeBinaire(), C0725i.m3040a(z)));
        }
        return mo2544a(this.f1546b + (z ? "1" : "0"));
    }

    public void razVariable() {
        this.f1546b = "";
        this.f1545a = null;
    }

    public void release() {
        this.f1546b = null;
        this.f1545a = null;
    }

    public void setValeur(int i) {
        this.f1546b = String.valueOf(i);
        this.f1545a = null;
    }

    public void setValeur(WDObjet wDObjet) {
        if (wDObjet == null) {
            wDObjet = new WDChaine("");
        }
        WDObjet valeur = wDObjet.getValeur();
        if (valeur.isMemoBinaire()) {
            WDChaine wDChaine = (WDChaine) valeur.checkType(WDChaine.class);
            Object obj = (wDChaine == null || wDChaine.checkType(WDBuffer.class) == null) ? null : 1;
            if (wDChaine != null && wDChaine.isUnicode() != isUnicode() && obj == null) {
                this.f1546b = C0725i.m3035a(valeur.getDonneeBinaire(), wDChaine.mo2547d());
                this.f1545a = null;
                return;
            } else if (obj != null) {
                setValeur(valeur.getDonneeBinaire());
                return;
            } else {
                mo2546a(valeur.getDonneeBinaire(), wDChaine != null ? wDChaine.mo2547d() : null);
                return;
            }
        }
        this.f1546b = valeur.getValeur().getString();
        this.f1545a = null;
    }

    public void setValeur(String str) {
        if (str == null) {
            str = "";
        }
        this.f1546b = str;
        this.f1545a = null;
    }

    public void setValeur(byte[] bArr) {
        this.f1545a = bArr;
        this.f1546b = "";
    }

    public void setValeurXMLDeserialisation(String str) {
        setValeur(C0808l.m4056n(str));
    }
}
