package fr.pcsoft.wdjava.contact;

import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDDate;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.core.types.collection.tableau.C0770p;
import fr.pcsoft.wdjava.core.utils.C0808l;

public class WDStructContact {
    public static WDChaine AdresseBureau = new WDChaine();
    public static WDChaine AdresseDomicile = new WDChaine();
    public static WDChaine Civilite = new WDChaine();
    public static WDChaine CodePostalBureau = new WDChaine();
    public static WDChaine CodePostalDomicile = new WDChaine();
    public static WDDate DateAnniversaire = new WDDate();
    public static WDDate DateFete = new WDDate();
    public static C0770p Email = new C0770p(1, new int[]{1}, 0, WDChaine.m2421c());
    public static WDBooleen EnDehors = new WDBooleen();
    public static WDChaine EtatBureau = new WDChaine();
    public static WDChaine EtatDomicile = new WDChaine();
    public static WDChaine FaxBureau = new WDChaine();
    public static WDChaine FaxDomicile = new WDChaine();
    public static WDChaine ID = new WDChaine();
    public static WDEntier4 NbEmail = new WDEntier4();
    public static WDChaine Nom = new WDChaine();
    public static WDChaine Notes = new WDChaine();
    public static WDChaine PageWeb = new WDChaine();
    public static WDChaine PaysBureau = new WDChaine();
    public static WDChaine PaysDomicile = new WDChaine();
    public static WDChaine Prenom = new WDChaine();
    public static WDChaine Prenom2 = new WDChaine();
    public static WDBooleen Prive = new WDBooleen();
    public static WDChaine Profession = new WDChaine();
    public static WDChaine Service = new WDChaine();
    public static WDChaine Societe = new WDChaine();
    public static WDChaine TelephoneBureau = new WDChaine();
    public static WDChaine TelephoneDomicile = new WDChaine();
    public static WDChaine TelephoneMobile = new WDChaine();
    public static WDChaine TelephoneMobileBureau = new WDChaine();
    public static WDChaine TelephonePager = new WDChaine();
    public static WDChaine VilleBureau = new WDChaine();
    public static WDChaine VilleDomicile = new WDChaine();
    /* renamed from: a */
    private static final String f1285a = m1845z(m1846z("9g"));
    /* renamed from: b */
    private static final String f1286b = m1845z(m1846z("\"\u000fT>"));
    /* renamed from: c */
    private static final String f1287c = m1845z(m1846z("2\u0010YMRM"));
    /* renamed from: d */
    private static final String f1288d = m1845z(m1846z(":\u0018[EL3g"));
    /* renamed from: e */
    private static final String f1289e = m1845z(m1846z("9\u0012LA$"));
    /* renamed from: f */
    private static final String f1290f = m1845z(m1846z("#\u0018T>"));
    /* renamed from: g */
    private static final String f1291g = m1845z(m1846z("6\u0019J>"));

    /* renamed from: a */
    public static final void m1843a() {
        AdresseBureau.setValeur("");
        AdresseDomicile.setValeur("");
        Civilite.setValeur("");
        CodePostalBureau.setValeur("");
        CodePostalDomicile.setValeur("");
        DateAnniversaire.setValeur("");
        DateFete.setValeur("");
        Email.mo2480e();
        NbEmail.setValeur(0);
        EtatBureau.setValeur("");
        EtatDomicile.setValeur("");
        FaxBureau.setValeur("");
        FaxDomicile.setValeur("");
        ID.setValeur("");
        Nom.setValeur("");
        Notes.setValeur("");
        PageWeb.setValeur("");
        PaysBureau.setValeur("");
        PaysDomicile.setValeur("");
        Prenom.setValeur("");
        Prenom2.setValeur("");
        Prive.setValeur(false);
        Profession.setValeur("");
        Service.setValeur("");
        Societe.setValeur("");
        TelephoneBureau.setValeur("");
        TelephoneDomicile.setValeur("");
        TelephoneMobile.setValeur("");
        TelephoneMobileBureau.setValeur("");
        TelephonePager.setValeur("");
        VilleBureau.setValeur("");
        VilleDomicile.setValeur("");
    }

    /* renamed from: a */
    public static final void m1844a(String str) {
        m1843a();
        if (str.trim().startsWith(f1288d)) {
            String[] b = C0808l.m4040b(str.substring(f1288d.length()));
            for (String trim : b) {
                String substring;
                String trim2 = trim.trim();
                String trim3 = "";
                int indexOf = trim2.indexOf(58);
                if (indexOf >= 0) {
                    String substring2 = trim2.substring(0, indexOf + 1);
                    substring = indexOf < trim2.length() + -1 ? trim2.substring(indexOf + 1) : "";
                    trim3 = substring2;
                } else {
                    substring = trim2;
                }
                if (trim3.compareToIgnoreCase(f1285a) == 0) {
                    int indexOf2 = substring.indexOf(44);
                    if (indexOf2 >= 0) {
                        Nom.setValeur(substring.substring(0, indexOf2));
                        Prenom.setValeur(substring.substring(indexOf2 + 1));
                    } else {
                        Nom.setValeur(substring);
                    }
                } else if (trim3.compareToIgnoreCase(f1290f) == 0) {
                    TelephoneDomicile.setValeur(substring);
                } else if (trim3.compareToIgnoreCase(f1287c) == 0) {
                    Email.get(1).setValeur(substring);
                } else if (trim3.compareToIgnoreCase(f1289e) == 0) {
                    Notes.setValeur(substring);
                } else if (trim3.compareToIgnoreCase(f1291g) == 0) {
                    AdresseDomicile.setValeur(substring);
                } else if (trim3.compareToIgnoreCase(f1286b) == 0) {
                    PageWeb.setValeur(substring);
                }
            }
        }
    }

    /* renamed from: z */
    private static String m1845z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 119;
                    break;
                case 1:
                    i2 = 93;
                    break;
                case 2:
                    i2 = 24;
                    break;
                case 3:
                    i2 = 4;
                    break;
                default:
                    i2 = 30;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1846z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 30);
        }
        return toCharArray;
    }
}
