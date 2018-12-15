package fr.pcsoft.wdjava.api;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.allocation.C0611a;
import fr.pcsoft.wdjava.core.context.C0677k;
import fr.pcsoft.wdjava.core.context.WDContexte;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDDate;
import fr.pcsoft.wdjava.core.types.WDDateHeure;
import fr.pcsoft.wdjava.core.types.WDDuree;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.core.utils.hb;
import fr.pcsoft.wdjava.core.utils.rb;
import fr.pcsoft.wdjava.ui.p083l.C1458s;

public class WDAPIDate_Commun {
    /* renamed from: z */
    private static final String[] f1137z = new String[]{m1592z(m1593z(" <y\u0003R\\0}\u0002EF'k\u000eD")), m1592z(m1593z(" <y\u0003RK=m\u0005RO7{\u0016[F.}\u0005DV,{")), m1592z(m1593z(" 2w\u0002E\\>}\u0005^F'k\u0002GS*q\u001aR\\,w\u0002C")), m1592z(m1593z(" (j\u0012ZJ=j\b]L-j\bSF't\u0016HP=u\u0016^M=")), m1592z(m1593z(" 0}\u0002EF'|\u001eQE=j\u0012Y@=")), m1592z(m1593z(" 0}\u0002EF'n\u0012EP'{\u001fVJ6}")), m1592z(m1593z(" =v\u0003^F*g\u0001RQ+g\u001aXJ+g\u0012Y\\4}\u0003CQ=")), m1592z(m1593z("(2p\u001fZN+k\u001b[O")), m1592z(m1593z(" ;p\u0016^M=g\u0001RQ+g\u0013BQ=}")), m1592z(m1593z("(2p\u001fZN+k\u001b[")), m1592z(m1593z("K0\u0002\u001aZ9+kmT@")), m1592z(m1593z(" <y\u0003R\\<q\u0011QF*}\u0019TF")), m1592z(m1593z(" =v\u0003^F*g\u0001RQ+g\u0019BN=j\u0018HG=g\u0004RN9q\u0019R")), m1592z(m1593z(" <y\u0003R\\.}\u0005D\\;p\u0016^M=")), m1592z(m1593z(" 9\u0012")), m1592z(m1593z(" <y\u0003R\\.y\u001b^G=")), m1592z(m1593z(" <y\u0003R\\0}\u0002EF'~\u0002DF9m\bAF*k\b[L;y\u001bR")), m1592z(m1593z(" <y\u0003R\\.}\u0005D\\6m\u001aRQ7g\u0013R\\+}\u001aVJ6}")), m1592z(m1593z(" <y\u0003RK=m\u0005RS9j\u0013RE9m\u0003")), m1592z(m1593z(" <y\u0003R\\0}\u0002EF'n\u0016[J<}")), m1592z(m1593z(" 0}\u0002EF'n\u0016[J<}")), m1592z(m1593z("V\u000b]\u0013vw\u001dj2{b\fQ!rG\rJ6cj\u0017V\u001avp\u0013")), m1592z(m1593z(" 6m\u001aRQ7g\u0013R\\+}\u001aVJ6}")), m1592z(m1593z(" ;p\u0016^M=g\u0001RQ+g\u001fRV*}")), m1592z(m1593z("?1k\u0018/5H\ti")), m1592z(m1593z(" +}\u001aVJ6}\bAF*k\bSB,}")), m1592z(m1593z(" <}\u0005YJ=j\b]L-j\bSV'u\u0018^P")), m1592z(m1593z(" <y\u0003RK=m\u0005RV,{\u0001RQ+t\u0018TB4}")), m1592z(m1593z(" 2w\u0002E\\>}\u0005^F'y\u001dXV,}")), m1592z(m1593z(" <y\u0003R\\<m\b]L-j")), m1592z(m1593z(" =v\u0003^F*g\u0001RQ+g\u0013VW=")), m1592z(m1593z("I2\u0017\u001aZ,9y\u0016V")), m1592z(m1593z(" (j\u0012ZJ=j\b]L-j\bSV'u\u0018^P")), m1592z(m1593z(" (j\u0012ZJ=j\b]L-j\bSF't\bVM6}\u0012")), m1592z(m1593z(" (y\u0006BF")), m1592z(m1593z(" 0}\u0002EF'n\u0012EP'}\u0019CJ=j")), m1592z(m1593z(" <y\u0003R\\.}\u0005D\\=v\u0003^F*")), m1592z(m1593z(" =v\u0003^F*g\u0001RQ+g\u001dXV*")), m1592z(m1593z(" <y\u0003R\\.}\u0005D\\5w\u001eD\\=v\b[F,l\u0005R")), m1592z(m1593z(" 2w\u0002E\\>}\u0005^F")), m1592z(m1593z(" <y\u0003R\\.}\u0005D\\2w\u0002E")), m1592z(m1593z(" <m\u0005RF'n\u0012EP'{\u001fVJ6}")), m1592z(m1593z(" <y\u0003R\\.}\u0005D\\2w\u0002E\\=v\b[F,l\u0005R")), m1592z(m1593z(" <}\u0005YJ=j\b]L-j\bSF't\u0016HP=u\u0016^M=")), m1592z(m1593z(" 0}\u0002EF'k\u000eD")), m1592z(m1593z(" <y\u0003R\\0}\u0002EF't\u0018TB4}\bAF*k\bQV+}\u0016B")), m1592z(m1593z(" =v\u0003^F*g\u0001RQ+g\u001dXV*g\u0012Y\\4}\u0003CQ=")), m1592z(m1593z(" (y\u0005VN'|\u0016CF'p\u0012BQ=g\u0019RD9l\u001eQ")), m1592z(m1593z(" =v\u0003^F*g\u0001RQ+g\u001fRV*}")), m1592z(m1593z(" <y\u0003RK=m\u0005RG1~\u0011RQ=v\u0014R"))};

    public static WDChaine DateHeureFuseauVersLocale(WDObjet wDObjet, String str) {
        WDContexte a = C0677k.m2775a(f1137z[16]);
        try {
            WDChaine a2 = C0611a.m2300a(C0725i.m3017a(wDObjet, true, true).m2347b(str));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static WDChaine DateHeureLocaleVersFuseau(WDObjet wDObjet, String str) {
        WDContexte a = C0677k.m2775a(f1137z[45]);
        try {
            WDChaine a2 = C0611a.m2300a(C0725i.m3017a(wDObjet, true, true).m2349c(str));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static WDChaine DateHeureLocaleVersUTC(WDObjet wDObjet) {
        WDContexte a = C0677k.m2775a(f1137z[1]);
        try {
            WDChaine a2 = C0611a.m2300a(C0725i.m3017a(wDObjet, true, true).m2355i());
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static WDChaine DateHeureUTCVersLocale(WDObjet wDObjet) {
        WDContexte a = C0677k.m2775a(f1137z[27]);
        try {
            WDChaine a2 = C0611a.m2300a(C0725i.m3017a(wDObjet, true, true).m2337E());
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static WDChaine age(WDObjet wDObjet) {
        return age(wDObjet, new WDDate());
    }

    public static WDChaine age(WDObjet wDObjet, WDObjet wDObjet2) {
        WDContexte a = C0677k.m2775a(f1137z[14]);
        try {
            WDChaine wDChaine = new WDChaine(hb.m3917b(C0725i.m3043b(wDObjet, false, false), C0725i.m3043b(wDObjet2, false, false)));
            return wDChaine;
        } finally {
            a.m2735v();
        }
    }

    public static WDEntier4 anneeEnCours() {
        return new WDEntier4(hb.m3928e());
    }

    public static WDChaine chaineVersDate(String str) {
        return chaineVersDate(str, f1137z[31]);
    }

    public static WDChaine chaineVersDate(String str, String str2) {
        WDContexte a = C0677k.m2775a(f1137z[13]);
        try {
            WDChaine a2 = C0611a.m2300a(C0725i.m3059c(str, str2));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static WDDuree chaineVersDuree(String str, WDObjet wDObjet) {
        WDContexte a = C0677k.m2775a(f1137z[8]);
        try {
            String str2 = "";
            str2 = wDObjet.isNumerique() ? wDObjet.getInt() == 0 ? f1137z[7] : f1137z[9] : wDObjet.getString();
            WDDuree b = C0725i.m3044b(str, str2);
            return b;
        } finally {
            a.m2735v();
        }
    }

    public static WDChaine chaineVersHeure(String str) {
        return chaineVersHeure(str, f1137z[10]);
    }

    public static WDChaine chaineVersHeure(String str, String str2) {
        WDContexte a = C0677k.m2775a(f1137z[23]);
        try {
            WDChaine wDChaine = new WDChaine(C0725i.m3065d(str, str2));
            return wDChaine;
        } finally {
            a.m2735v();
        }
    }

    public static WDEntier4 dateDifference(WDObjet wDObjet, WDObjet wDObjet2) {
        WDContexte a = C0677k.m2775a(f1137z[11]);
        try {
            WDEntier4 wDEntier4 = new WDEntier4(hb.m3897a(C0725i.m3043b(wDObjet, true, false), C0725i.m3043b(wDObjet2, true, false)));
            return wDEntier4;
        } finally {
            a.m2735v();
        }
    }

    public static WDChaine dateDuJour() {
        WDContexte a = C0677k.m2775a(f1137z[29]);
        try {
            WDChaine a2 = C0611a.m2300a(hb.m3927d());
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static void dateDuJour(String str) {
    }

    public static WDBooleen dateEstValide(WDObjet wDObjet) {
        return dateValide(wDObjet);
    }

    public static WDChaine dateHeureDifference(WDObjet wDObjet, WDObjet wDObjet2) {
        WDContexte a = C0677k.m2775a(f1137z[49]);
        try {
            WDChaine wDChaine = new WDChaine(hb.m3905a(C0725i.m3017a(wDObjet, true, true), C0725i.m3017a(wDObjet2, true, true)));
            return wDChaine;
        } finally {
            a.m2735v();
        }
    }

    public static void dateHeureParDefaut() {
        dateHeureParDefaut(null, null);
    }

    public static void dateHeureParDefaut(String str, String str2) {
        WDContexte a = C0677k.m2775a(f1137z[18]);
        try {
            hb.f2069b = str;
            hb.f2068a = str2;
            if (hb.f2068a != null) {
                hb.f2068a = C0808l.m4017a(hb.f2068a, 9, "0");
            }
            a.m2735v();
        } catch (Throwable th) {
            a.m2735v();
        }
    }

    public static WDObjet dateHeureSys() {
        WDContexte a = C0677k.m2775a(f1137z[0]);
        try {
            WDObjet a2 = C0611a.m2295a(26, hb.m3916b());
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static WDChaine dateSys() {
        return dateDuJour();
    }

    public static void dateSys(String str) {
        dateDuJour(str);
    }

    public static WDBooleen dateValide(WDObjet wDObjet) {
        WDContexte a = C0677k.m2775a(f1137z[15]);
        try {
            WDObjet valeur = wDObjet.getValeur();
            WDBooleen wDBooleen;
            if (!valeur.isChaine() || valeur.getNbCaractere() == 8) {
                wDBooleen = new WDBooleen(hb.m3911a(C0725i.m3043b(valeur, false, false)));
                a.m2735v();
                return wDBooleen;
            }
            wDBooleen = new WDBooleen(false);
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static WDChaine dateVersChaine(WDObjet wDObjet) {
        WDContexte a = C0677k.m2775a(f1137z[13]);
        try {
            WDChaine wDChaine;
            if (wDObjet.getString().equals("")) {
                wDChaine = new WDChaine();
            } else {
                wDChaine = new WDChaine(C0725i.m3046b(C0725i.m3043b(wDObjet, true, true)));
                a.m2735v();
            }
            return wDChaine;
        } finally {
            a.m2735v();
        }
    }

    public static WDChaine dateVersChaine(WDObjet wDObjet, String str) {
        WDContexte a = C0677k.m2775a(f1137z[13]);
        try {
            WDChaine a2;
            if (str.equals(f1137z[21])) {
                a2 = C0611a.m2300a(new C1458s().m10284a(wDObjet.getString()));
                return a2;
            }
            if (wDObjet.checkType(fr.pcsoft.wdjava.core.types.hb.class) == null) {
                String string = wDObjet.getString();
                if (string.equals("")) {
                    a2 = new WDChaine();
                    a.m2735v();
                    return a2;
                } else if (string.length() > 8) {
                    wDObjet = C0725i.m3017a(wDObjet, true, true);
                }
            }
            WDDateHeure wDDateHeure = (WDDateHeure) wDObjet.checkType(WDDateHeure.class);
            if (wDDateHeure != null) {
                WDChaine wDChaine = new WDChaine(hb.m3906a(wDDateHeure, str));
                a.m2735v();
                return wDChaine;
            }
            a2 = new WDChaine(hb.m3904a(C0725i.m3043b(wDObjet, true, true), str));
            a.m2735v();
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static WDEntier4 dateVersEntier(WDObjet wDObjet) {
        return dateVersEntier(wDObjet, false);
    }

    public static WDEntier4 dateVersEntier(WDObjet wDObjet, boolean z) {
        WDContexte a = C0677k.m2775a(f1137z[36]);
        WDEntier4 wDEntier4 = true;
        try {
            wDEntier4 = new WDEntier4(C0725i.m3014a(C0725i.m3043b(wDObjet, true, true), z));
            return wDEntier4;
        } finally {
            a.m2735v();
        }
    }

    public static WDEntier4 dateVersJour(WDObjet wDObjet) {
        WDContexte a = C0677k.m2775a(f1137z[40]);
        WDEntier4 wDEntier4 = true;
        try {
            wDEntier4 = new WDEntier4(C0725i.m3043b(wDObjet, true, true).m2521g());
            return wDEntier4;
        } finally {
            a.m2735v();
        }
    }

    public static WDChaine dateVersJourEnLettre(WDObjet wDObjet) {
        WDContexte a = C0677k.m2775a(f1137z[42]);
        WDChaine wDChaine = true;
        try {
            wDChaine = new WDChaine(C0725i.m3043b(wDObjet, true, true).m2532s());
            return wDChaine;
        } finally {
            a.m2735v();
        }
    }

    public static WDChaine dateVersMoisEnLettre(WDObjet wDObjet) {
        WDContexte a = C0677k.m2775a(f1137z[38]);
        WDChaine wDChaine = false;
        try {
            wDChaine = new WDChaine(C0725i.m3043b(wDObjet, false, false).m2522h());
            return wDChaine;
        } finally {
            a.m2735v();
        }
    }

    public static WDEntier4 dateVersNumeroDeSemaine(WDObjet wDObjet) {
        WDContexte a = C0677k.m2775a(f1137z[17]);
        WDEntier4 wDEntier4 = true;
        try {
            wDEntier4 = new WDEntier4(C0725i.m3043b(wDObjet, true, true).m2523i());
            return wDEntier4;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen dateheureValide(WDObjet wDObjet) {
        WDContexte a = C0677k.m2775a(f1137z[19]);
        try {
            WDBooleen wDBooleen;
            if (!wDObjet.isChaine() || C0808l.m4044c(wDObjet.getString().trim())) {
                wDBooleen = new WDBooleen(C0725i.m3017a(wDObjet, false, false).m2367p());
                a.m2735v();
                return wDBooleen;
            }
            wDBooleen = new WDBooleen(false);
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static WDObjet dernierJourDeLaSemaine(WDObjet wDObjet) {
        WDContexte a = C0677k.m2775a(f1137z[43]);
        try {
            WDObjet f = hb.m3932f(C0725i.m3043b(wDObjet, true, true));
            return f;
        } finally {
            a.m2735v();
        }
    }

    public static WDObjet dernierJourDuMois() {
        return dernierJourDuMois(dateSys());
    }

    public static WDObjet dernierJourDuMois(int i, int i2) {
        WDContexte a = C0677k.m2775a(f1137z[26]);
        try {
            WDObjet a2 = hb.m3901a(i, i2);
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static WDObjet dernierJourDuMois(WDObjet wDObjet) {
        WDContexte a = C0677k.m2775a(f1137z[26]);
        try {
            WDObjet e = hb.m3929e(C0725i.m3043b(wDObjet, true, true));
            return e;
        } finally {
            a.m2735v();
        }
    }

    public static WDChaine dureeVersChaine(WDObjet wDObjet, WDObjet wDObjet2) {
        WDContexte a = C0677k.m2775a(f1137z[41]);
        try {
            String string;
            WDChaine wDChaine;
            WDDuree a2 = C0725i.m3019a(wDObjet);
            String str = "";
            if (!wDObjet2.isNumerique()) {
                string = wDObjet2.getString();
            } else if (wDObjet2.getInt() == 0) {
                wDChaine = new WDChaine(wDObjet.getString());
                return wDChaine;
            } else {
                string = f1137z[9];
            }
            wDChaine = new WDChaine(hb.m3907a(a2, string));
            a.m2735v();
            return wDChaine;
        } finally {
            a.m2735v();
        }
    }

    public static WDChaine entierVersDate(int i) {
        return entierVersDate(i, "");
    }

    public static WDChaine entierVersDate(int i, String str) {
        WDContexte a = C0677k.m2775a(f1137z[30]);
        try {
            WDChaine wDChaine = new WDChaine(C0725i.m3025a(i, str));
            return wDChaine;
        } finally {
            a.m2735v();
        }
    }

    public static WDChaine entierVersHeure(int i) {
        WDContexte a = C0677k.m2775a(f1137z[48]);
        if (i < 0) {
            try {
                WDErreurManager.m2883a(C0745b.m3222b(f1137z[47], new String[0]));
            } catch (Throwable th) {
                a.m2735v();
            }
        }
        WDChaine wDChaine = new WDChaine(C0725i.m3051b(C0725i.m3037a((long) i, false)));
        a.m2735v();
        return wDChaine;
    }

    public static WDEntier4 entierVersJour(int i) {
        WDContexte a = C0677k.m2775a(f1137z[37]);
        try {
            WDEntier4 wDEntier4 = new WDEntier4(new WDDate(i).m2521g());
            return wDEntier4;
        } finally {
            a.m2735v();
        }
    }

    public static WDChaine entierVersJourEnLettre(int i) {
        WDContexte a = C0677k.m2775a(f1137z[46]);
        try {
            WDChaine wDChaine = new WDChaine(new WDDate(i).m2532s());
            return wDChaine;
        } finally {
            a.m2735v();
        }
    }

    public static WDChaine entierVersMoisEnLettre(int i) {
        WDContexte a = C0677k.m2775a(f1137z[6]);
        try {
            WDChaine wDChaine = new WDChaine(new WDDate(i).m2522h());
            return wDChaine;
        } finally {
            a.m2735v();
        }
    }

    public static WDEntier4 entierVersNumeroDeSemaine(int i) {
        WDContexte a = C0677k.m2775a(f1137z[12]);
        try {
            WDEntier4 wDEntier4 = new WDEntier4(new WDDate(i).m2523i());
            return wDEntier4;
        } finally {
            a.m2735v();
        }
    }

    public static WDEntier4 heureDifference(WDObjet wDObjet, WDObjet wDObjet2) {
        WDContexte a = C0677k.m2775a(f1137z[4]);
        try {
            WDEntier4 wDEntier4 = new WDEntier4(hb.m3898a(C0725i.m3020a(wDObjet, true), C0725i.m3020a(wDObjet2, true)));
            return wDEntier4;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen heureEstValide(WDObjet wDObjet) {
        return heureValide(wDObjet);
    }

    public static WDChaine heureSys() {
        WDContexte a = C0677k.m2775a(f1137z[44]);
        try {
            WDChaine a2 = C0611a.m2300a(hb.m3933f());
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen heureValide(WDObjet wDObjet) {
        WDContexte a = C0677k.m2775a(f1137z[20]);
        try {
            WDBooleen wDBooleen = new WDBooleen(C0725i.m3020a(wDObjet, false).m2480k());
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static WDChaine heureVersChaine(WDObjet wDObjet) {
        WDContexte a = C0677k.m2775a(f1137z[5]);
        try {
            WDChaine wDChaine = new WDChaine(C0725i.m3057c(C0725i.m3020a(wDObjet, true)));
            return wDChaine;
        } finally {
            a.m2735v();
        }
    }

    public static WDChaine heureVersChaine(WDObjet wDObjet, String str) {
        WDContexte a = C0677k.m2775a(f1137z[5]);
        try {
            WDChaine wDChaine = new WDChaine(hb.m3908a(C0725i.m3020a(wDObjet, true), str));
            return wDChaine;
        } finally {
            a.m2735v();
        }
    }

    public static WDEntier4 heureVersEntier(WDObjet wDObjet) {
        WDContexte a = C0677k.m2775a(f1137z[35]);
        try {
            WDEntier4 wDEntier4 = new WDEntier4(C0725i.m3020a(wDObjet, true).getInt());
            return wDEntier4;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen jourFerie(WDObjet wDObjet) {
        WDContexte a = C0677k.m2775a(f1137z[39]);
        try {
            WDBooleen wDBooleen = new WDBooleen(rb.m4125a(C0725i.m3043b(wDObjet, false, false), true));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static void jourFerieAjoute(String str) {
        WDContexte a = C0677k.m2775a(f1137z[28]);
        try {
            for (String a2 : C0808l.m4055m(str)) {
                rb.m4124a(a2);
            }
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet jourFerieListe() {
        return new WDChaine(rb.m4127b());
    }

    public static void jourFerieSupprimeTout() {
        WDContexte a = C0677k.m2775a(f1137z[2]);
        try {
            rb.m4122a();
        } finally {
            a.m2735v();
        }
    }

    public static WDChaine maintenant() {
        return heureSys();
    }

    public static WDEntier4 moisEnCours() {
        return new WDEntier4(hb.m3896a());
    }

    public static final WDChaine numeroDeJourVersLettre(int i) {
        return new WDChaine(hb.m3922c(i));
    }

    public static final WDChaine numeroDeMoisVersLettre(int i) {
        return new WDChaine(hb.m3934g(i));
    }

    public static WDEntier4 numeroDeSemaine(WDObjet wDObjet) {
        WDContexte a = C0677k.m2775a(f1137z[22]);
        WDEntier4 wDEntier4 = false;
        try {
            wDEntier4 = new WDEntier4(C0725i.m3043b(wDObjet, false, false).m2523i());
            return wDEntier4;
        } finally {
            a.m2735v();
        }
    }

    public static WDChaine paques(WDObjet wDObjet) {
        WDContexte a = C0677k.m2775a(f1137z[34]);
        try {
            WDChaine a2 = C0611a.m2300a(hb.m3935h(wDObjet.isNumerique() ? wDObjet.getInt() : C0725i.m3043b(wDObjet, false, false).m2530q()));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static WDObjet premierJourDeLAnnee() {
        return premierJourDeLAnnee(dateSys());
    }

    public static WDObjet premierJourDeLAnnee(int i) {
        WDContexte a = C0677k.m2775a(f1137z[33]);
        try {
            WDObjet l = hb.m3939l(i);
            return l;
        } finally {
            a.m2735v();
        }
    }

    public static WDObjet premierJourDeLAnnee(WDObjet wDObjet) {
        WDContexte a = C0677k.m2775a(f1137z[33]);
        try {
            WDObjet d = hb.m3926d(C0725i.m3043b(wDObjet, true, true));
            return d;
        } finally {
            a.m2735v();
        }
    }

    public static WDObjet premierJourDeLaSemaine(WDObjet wDObjet) {
        WDContexte a = C0677k.m2775a(f1137z[3]);
        try {
            WDObjet b = hb.m3915b(C0725i.m3043b(wDObjet, true, true));
            return b;
        } finally {
            a.m2735v();
        }
    }

    public static WDObjet premierJourDuMois() {
        return premierJourDuMois(dateSys());
    }

    public static WDObjet premierJourDuMois(int i, int i2) {
        WDContexte a = C0677k.m2775a(f1137z[32]);
        try {
            WDObjet b = hb.m3914b(i, i2);
            return b;
        } finally {
            a.m2735v();
        }
    }

    public static WDObjet premierJourDuMois(WDObjet wDObjet) {
        WDContexte a = C0677k.m2775a(f1137z[32]);
        try {
            WDObjet c = hb.m3921c(C0725i.m3043b(wDObjet, true, true));
            return c;
        } finally {
            a.m2735v();
        }
    }

    public static final WDDate semaineVersDate(int i, int i2) {
        return semaineVersDate(i, i2, null);
    }

    public static final WDDate semaineVersDate(int i, int i2, String str) {
        boolean z;
        WDDate a;
        WDContexte a2 = C0677k.m2775a(f1137z[25]);
        if (str != null) {
            try {
                if (str.equals(f1137z[24])) {
                    z = true;
                    a = hb.m3902a(i, i2, z);
                    a2.m2735v();
                    return a;
                }
            } catch (Throwable th) {
                a2.m2735v();
            }
        }
        z = false;
        a = hb.m3902a(i, i2, z);
        a2.m2735v();
        return a;
    }

    /* renamed from: z */
    private static String m1592z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 3;
                    break;
                case 1:
                    i2 = C0607n.co;
                    break;
                case 2:
                    i2 = 56;
                    break;
                case 3:
                    i2 = 87;
                    break;
                default:
                    i2 = 23;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1593z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 23);
        }
        return toCharArray;
    }
}
