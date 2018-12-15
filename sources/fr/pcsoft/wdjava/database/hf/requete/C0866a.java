package fr.pcsoft.wdjava.database.hf.requete;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.database.C0775c;

/* renamed from: fr.pcsoft.wdjava.database.hf.requete.a */
public class C0866a extends C0775c implements Cloneable {
    /* renamed from: z */
    private static final String[] f2287z = new String[]{C0866a.m6091z(C0866a.m6092z("i\u0012wz|S\u0016eyj\u0000\u001bb5lL\u0010ip}\u0000\u0013b5A\rfxçT\rb5kE_up~Usp/C\u0010rgnN\u000b)")), C0866a.m6091z(C0866a.m6092z("\u0003/UZ_r6BAJ6IAJr;NAJ")), C0866a.m6091z(C0866a.m6092z("\u0003-RW]i.RPPs0RFPe3BXJn+"))};
    /* renamed from: b */
    private C0778b f2288b = null;
    /* renamed from: c */
    private String f2289c = "";
    /* renamed from: d */
    private WDObjet f2290d = null;

    public C0866a(String str, C0778b c0778b) {
        this.f2289c = str;
        this.f2288b = c0778b;
    }

    /* renamed from: z */
    private static String m6091z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 32;
                    break;
                case 1:
                    i2 = C0607n.bx;
                    break;
                case 2:
                    i2 = 7;
                    break;
                case 3:
                    i2 = 21;
                    break;
                default:
                    i2 = 15;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m6092z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 15);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public WDObjet m6093a(C0778b c0778b) {
        WDObjet wDObjet = null;
        try {
            C0866a c0866a = (C0866a) clone();
            try {
                c0866a.f2288b = c0778b;
                if (this.f2290d != null) {
                    wDObjet = this.f2290d.getClone();
                }
                c0866a.f2290d = wDObjet;
                return c0866a;
            } catch (CloneNotSupportedException e) {
                throw e;
            }
        } catch (Exception e2) {
            C0691a.m2857a(f2287z[0], e2);
            return null;
        }
    }

    /* renamed from: a */
    public String m6094a() {
        return this.f2289c;
    }

    /* renamed from: b */
    public boolean m6095b() {
        return this.f2290d != null;
    }

    public WDObjet getElement(String str) {
        return getElement(str, true);
    }

    public WDObjet getElement(String str, boolean z) {
        if (z) {
            WDErreurManager.m2883a(C0745b.m3222b(f2287z[2], new String[0]));
        }
        return null;
    }

    public String getMessageAccesPropieteInterdite(String str) {
        return C0745b.m3222b(f2287z[1], new String[0]);
    }

    public String getMessageLecturePropieteInterdite(String str) {
        return C0745b.m3222b(f2287z[1], new String[0]);
    }

    public WDObjet getValeur() {
        return this.f2290d == null ? new WDChaine() : this.f2290d;
    }

    public void release() {
        super.release();
        this.f2289c = null;
        this.f2290d = null;
        this.f2288b = null;
    }

    public void setValeur(WDObjet wDObjet) {
        this.f2290d = wDObjet.getClone();
        this.f2288b.sb();
    }
}
