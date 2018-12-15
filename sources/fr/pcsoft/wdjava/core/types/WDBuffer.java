package fr.pcsoft.wdjava.core.types;

import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.allocation.C0611a;
import fr.pcsoft.wdjava.core.allocation.C0613b;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.utils.C0808l;
import java.io.InputStream;

public class WDBuffer extends WDChaine {
    public static final C0613b<WDBuffer> CREATOR = new C0783h();
    /* renamed from: z */
    private static final String[] f1547z = new String[]{m2431z(m2432z("\u0014gqC$rw")), m2431z(m2432z("\u0014vaW+vimV#clkK=upbC'ezmK6rw`L6howJ,")), m2431z(m2432z("\u0014wa@.")), m2431z(m2432z("\u0014fkK4rwwL-yzmH2xvwL {`"))};

    public WDBuffer(char c) {
        super(c);
    }

    public WDBuffer(double d) {
        super(d);
    }

    public WDBuffer(int i) {
        super(i);
    }

    public WDBuffer(long j) {
        super(j);
    }

    public WDBuffer(WDObjet wDObjet) {
        super(wDObjet);
    }

    public WDBuffer(InputStream inputStream) {
        super(inputStream);
    }

    public WDBuffer(String str) {
        super(str);
    }

    public WDBuffer(boolean z) {
        super(z);
    }

    public WDBuffer(byte[] bArr) {
        super(bArr);
    }

    /* renamed from: z */
    private static String m2431z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 55;
                    break;
                case 1:
                    i2 = 37;
                    break;
                case 2:
                    i2 = 36;
                    break;
                case 3:
                    i2 = 5;
                    break;
                default:
                    i2 = 98;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2432z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 98);
        }
        return toCharArray;
    }

    public WDObjet extraireChaine(int i) {
        byte[] donneeBinaire = getDonneeBinaire();
        int a = C0725i.m3011a(i);
        if (a < 0 || a >= donneeBinaire.length) {
            return mo2544a("");
        }
        return C0611a.m2299a(new byte[]{donneeBinaire[a]});
    }

    public WDObjet extraireChaine(int i, WDObjet wDObjet) {
        byte[] bArr;
        Object donneeBinaire = getDonneeBinaire();
        byte[] donneeBinaire2 = wDObjet.getDonneeBinaire();
        int a = C0725i.m3011a(i);
        if (a < 0) {
            bArr = donneeBinaire2.length > 0 ? new byte[]{donneeBinaire2[0]} : new byte[]{(byte) 0};
        } else if (a == 0) {
            a = donneeBinaire.length;
            Object obj = new byte[(a + 1)];
            System.arraycopy(donneeBinaire, 0, obj, 1, a);
            obj[0] = donneeBinaire2.length > 0 ? donneeBinaire2[0] : (byte) 0;
            r0 = obj;
        } else {
            int length = donneeBinaire.length;
            if (donneeBinaire2.length == 0) {
                if (a < length) {
                    bArr = new byte[(length - 1)];
                    System.arraycopy(donneeBinaire, 0, bArr, 0, length);
                }
            } else if (a >= length) {
                bArr = new byte[(length + 1)];
                System.arraycopy(donneeBinaire, 0, bArr, 0, length);
                bArr[length] = donneeBinaire2[0];
            } else {
                donneeBinaire[a] = donneeBinaire2[0];
            }
            r0 = donneeBinaire;
        }
        setValeur(bArr);
        return this;
    }

    public WDObjet extraireDebutChaine(int i) {
        return extraireSousChaine(1, i);
    }

    public WDObjet extraireDebutChaine(int i, WDObjet wDObjet) {
        return extraireSousChaine(1, i, wDObjet);
    }

    public WDObjet extraireFinChaine(int i) {
        return extraireSousChaine(i, Integer.MAX_VALUE);
    }

    public WDObjet extraireFinChaine(int i, WDObjet wDObjet) {
        return extraireSousChaine(i, Integer.MAX_VALUE, wDObjet);
    }

    public WDObjet extrairePartieChaine(int i, int i2) {
        return extraireSousChaine(i, (i + i2) - 1);
    }

    public WDObjet extrairePartieChaine(int i, int i2, WDObjet wDObjet) {
        return extraireSousChaine(i, (i + i2) - 1, wDObjet);
    }

    public WDObjet extraireSousChaine(int i, int i2) {
        Object donneeBinaire = getDonneeBinaire();
        int a = C0725i.m3011a(i);
        int a2 = C0725i.m3011a(i2);
        if (a < 0) {
            a = 0;
        }
        if (a2 >= donneeBinaire.length) {
            a2 = donneeBinaire.length - 1;
        }
        if (a > a2) {
            return C0611a.m2299a((byte[]) null);
        }
        byte[] bArr = new byte[((a2 - a) + 1)];
        System.arraycopy(donneeBinaire, a, bArr, 0, bArr.length);
        return C0611a.m2299a(bArr);
    }

    public WDObjet extraireSousChaine(int i, int i2, WDObjet wDObjet) {
        byte[] bArr;
        Object donneeBinaire = getDonneeBinaire();
        Object donneeBinaire2 = wDObjet.getDonneeBinaire();
        int a = C0725i.m3011a(i);
        int a2 = C0725i.m3011a(i2);
        if (a < 0) {
            a = 0;
        }
        if (a2 < 0) {
            a2 = donneeBinaire.length;
        } else if (a > a2) {
            a = a2;
        }
        if (a >= donneeBinaire.length) {
            bArr = new byte[(donneeBinaire.length + donneeBinaire2.length)];
            if (donneeBinaire.length > 0) {
                System.arraycopy(donneeBinaire, 0, bArr, 0, donneeBinaire.length);
            }
            if (donneeBinaire2.length > 0) {
                System.arraycopy(donneeBinaire2, 0, bArr, donneeBinaire.length, donneeBinaire2.length);
            }
        } else {
            if (a2 >= donneeBinaire.length) {
                a2 = donneeBinaire.length - 1;
            }
            int length = donneeBinaire2.length + (donneeBinaire.length - ((a2 - a) + 1));
            Object obj = new byte[length];
            if (length > 0) {
                if (a > 0) {
                    System.arraycopy(donneeBinaire, 0, obj, 0, a);
                }
                if (donneeBinaire2.length > 0) {
                    System.arraycopy(donneeBinaire2, 0, obj, a, donneeBinaire2.length);
                }
                if (a2 < donneeBinaire.length - 1) {
                    System.arraycopy(donneeBinaire, a2 + 1, obj, a + donneeBinaire2.length, (donneeBinaire.length - a2) - 1);
                }
            }
            Object obj2 = obj;
        }
        setValeur(bArr);
        return this;
    }

    public double getDouble() {
        WDErreurManager.m2883a(C0745b.m3222b(f1547z[3], getNomType(), C0745b.m3220a(f1547z[2], new String[0])));
        return 0.0d;
    }

    public Object getJSONValue() {
        WDErreurManager.m2883a(C0745b.m3222b(f1547z[1], new String[0]));
        return null;
    }

    public String getNomType() {
        return C0745b.m3220a(f1547z[0], new String[0]);
    }

    public int getTypeVar() {
        return 30;
    }

    public String getValeurXMLPourSerialisation() {
        return C0725i.m3061c(C0808l.m4045c(getDonneeBinaire()));
    }

    public void setValeur(WDObjet wDObjet) {
        this.a = wDObjet != null ? wDObjet.getDonneeBinaire() : null;
        this.b = "";
    }

    public void setValeurXMLDeserialisation(String str) {
        setValeur(C0808l.m4039b(C0725i.m3082k(str)));
    }
}
