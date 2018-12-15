package fr.pcsoft.wdjava.contact;

import android.accounts.Account;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.poo.C0560r;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDChaine;

public class WDContactSource extends C0560r {
    /* renamed from: b */
    public static final EWDPropriete[] f1281b = new EWDPropriete[]{EWDPropriete.PROP_NOM, EWDPropriete.PROP_TYPE};
    /* renamed from: z */
    private static final String[] f1282z = new String[]{m1838z(m1839z("L[n~>.[uo9 Mss/")), m1838z(m1839z("LVno<.Tde8"))};
    /* renamed from: c */
    String f1283c = "";
    /* renamed from: d */
    String f1284d = "";

    WDContactSource(Account account) {
        this.f1284d = account.type;
        this.f1283c = account.name;
    }

    /* renamed from: z */
    private static String m1838z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 111;
                    break;
                case 1:
                    i2 = 24;
                    break;
                case 2:
                    i2 = 33;
                    break;
                case 3:
                    i2 = 48;
                    break;
                default:
                    i2 = 106;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1839z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 106);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public final void m1840a(String str) {
        this.f1284d = str;
    }

    public WDChaine getNom() {
        return new WDChaine(this.f1283c);
    }

    public String getNomType() {
        return C0745b.m3220a(f1282z[0], new String[0]);
    }

    public WDObjet getType() {
        return new WDChaine(this.f1284d);
    }

    public WDObjet getValeur() {
        WDErreurManager.m2883a(C0745b.m3222b(f1282z[1], getNomType()));
        return null;
    }

    public boolean isEvaluable() {
        return false;
    }

    /* renamed from: k */
    public EWDPropriete[] mo2439k() {
        return f1281b;
    }

    /* renamed from: l */
    protected int mo2440l() {
        return C0607n.Zu;
    }

    public void razVariable() {
        this.f1283c = "";
        this.f1284d = "";
    }

    public void release() {
        this.f1283c = null;
        this.f1284d = null;
    }

    public void setNom(String str) {
        this.f1283c = str;
    }

    public void setProp(EWDPropriete eWDPropriete, WDObjet wDObjet) {
        switch (C0599j.f1405a[eWDPropriete.ordinal()]) {
            case 1:
                m1840a(wDObjet.getString());
                return;
            case 2:
                setNom(wDObjet.getString());
                return;
            default:
                super.setProp(eWDPropriete, wDObjet);
                return;
        }
    }

    protected void setPropString(EWDPropriete eWDPropriete, String str) {
        switch (C0599j.f1405a[eWDPropriete.ordinal()]) {
            case 1:
                m1840a(str);
                return;
            case 2:
                setNom(str);
                return;
            default:
                super.setProp(eWDPropriete, str);
                return;
        }
    }

    public void setValeur(WDObjet wDObjet) {
        WDContactSource wDContactSource = (WDContactSource) wDObjet.checkType(WDContactSource.class);
        if (wDContactSource != null) {
            this.f1284d = wDContactSource.f1284d;
            this.f1283c = wDContactSource.f1283c;
            return;
        }
        super.setValeur(wDObjet);
    }
}
