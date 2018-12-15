package fr.pcsoft.wdjava.core.types;

import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.p043d.C0688c;
import fr.pcsoft.wdjava.core.p043d.C0690f;
import fr.pcsoft.wdjava.core.p043d.p044a.C0679b;
import fr.pcsoft.wdjava.core.p043d.p044a.C0682d;
import fr.pcsoft.wdjava.core.p043d.p045b.C0684a;
import fr.pcsoft.wdjava.core.p043d.p045b.C0685b;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import java.io.IOException;
import java.util.LinkedHashMap;

public final class bb extends C0487y implements C0688c {
    /* renamed from: z */
    private static final String f1949z = m3297z(m3298z("H\u0010U?A*\b@2G)\fQ9"));
    /* renamed from: a */
    private LinkedHashMap<String, C0797z> f1950a = new C0791r(this);
    /* renamed from: b */
    public final EWDPropriete[] f1951b = new EWDPropriete[]{EWDPropriete.PROP_NOM, EWDPropriete.PROP_VALEUR, EWDPropriete.PROP_EXISTE, EWDPropriete.PROP_TYPE, EWDPropriete.PROP_OCCURRENCE, EWDPropriete.PROP_MEMBRE};

    static LinkedHashMap access$400(bb bbVar) {
        return bbVar.f1950a;
    }

    /* renamed from: z */
    private static String m3297z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 107;
                    break;
                case 1:
                    i2 = 70;
                    break;
                case 2:
                    i2 = 20;
                    break;
                case 3:
                    i2 = 109;
                    break;
                default:
                    i2 = 8;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m3298z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 8);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public final WDObjet m3299a(String str, WDObjet wDObjet) {
        WDObjet c0797z = new C0797z(this, str, null, null);
        this.f1950a.put(str, c0797z);
        return c0797z;
    }

    public void deserialize(C0682d c0682d) throws C0690f {
    }

    public void deserialize(C0685b c0685b) throws C0690f {
    }

    public WDObjet getElement(String str) {
        return getElement(str, true);
    }

    public WDObjet getElement(String str, boolean z) {
        C0797z c0797z = (C0797z) this.f1950a.get(str);
        if (c0797z != null) {
            return c0797z;
        }
        WDObjet c0797z2 = new C0797z(this, str, null, null);
        this.f1950a.put(str, c0797z2);
        return c0797z2;
    }

    public String getNomType() {
        return C0745b.m3220a(f1949z, new String[0]);
    }

    public int getTypeVar() {
        return 143;
    }

    public WDObjet getValeur() {
        return this;
    }

    public boolean isEvaluable() {
        return true;
    }

    public boolean isVariableInterne() {
        return true;
    }

    public void razVariable() {
        if (this.f1950a != null) {
            for (WDObjet release : this.f1950a.values()) {
                release.release();
            }
            this.f1950a.clear();
            this.f1950a = null;
        }
    }

    public void release() {
        razVariable();
    }

    public void serialize(C0679b c0679b) throws IOException {
    }

    public void serialize(C0684a c0684a) throws C0690f {
        if (!this.f1950a.isEmpty()) {
            c0684a.mo2590c();
            for (C0797z c0797z : this.f1950a.values()) {
                try {
                    if (C0797z.access$100(c0797z)) {
                        c0684a.mo2589a(C0797z.access$200(c0797z), C0797z.access$300(c0797z));
                    }
                } catch (C0690f e) {
                    throw e;
                }
            }
            c0684a.mo2592e();
        }
    }

    public void setValeur(WDObjet wDObjet) {
    }
}
