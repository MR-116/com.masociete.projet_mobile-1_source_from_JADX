package fr.pcsoft.wdjava.api;

import fr.pcsoft.wdjava.core.C0486m;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.C0728o;
import fr.pcsoft.wdjava.core.WDIndirection;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.context.C0677k;
import fr.pcsoft.wdjava.core.context.WDContexte;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.C0548s;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDBuffer;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDChaineA;
import fr.pcsoft.wdjava.core.types.WDChaineU;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.core.types.WDEntier8;
import fr.pcsoft.wdjava.core.utils.ec;
import fr.pcsoft.wdjava.file.C0889f;
import fr.pcsoft.wdjava.file.C0895m;
import fr.pcsoft.wdjava.file.C0897o;
import fr.pcsoft.wdjava.file.C0899q;
import fr.pcsoft.wdjava.file.C0901s;
import fr.pcsoft.wdjava.file.WDFileMsgBoxFactory;
import fr.pcsoft.wdjava.ui.champs.jauge.C1225d;
import fr.pcsoft.wdjava.ui.dialogue.C1372f;
import java.io.File;

public class WDAPIFichier_Commun {
    /* renamed from: z */
    private static final String[] f1152z = new String[]{m1619z(m1620z("\u000b#KyZm&LyCz")), m1619z(m1620z("m7J")), m1619z(m1620z("\u000b#G}B|7Q~C|")), m1619z(m1620z("\u000b#[tWz\"]cBm=Ly")), m1619z(m1620z("}1^\u0011'\u001e")), m1619z(m1620z("\u000b#G}\\g0LyI| @hS")), m1619z(m1620z("\u000b#\\uEy0]cSf:[sCz6")), m1619z(m1620z("\u000b#[sFa Gz_k-QyD")), m1619z(m1620z("\u000b#G}B|7Q~C|:TyU|0JyI{ MpS")), m1619z(m1620z("\u000b#G^m7[tS")), m1619z(m1620z("k\nuLc[\u0000jJs\bM2\u0012Qa#15<\u0006\"Qz\u001c")), m1619z(m1620z("\bM2\u0012\\x\"8\u00076\u0002KRlSo^8\u00168o,^\u001c-\bO6lXoL\u0011\u00168b5_\u0007<\u0006/HyQ\u0013O6{_n^2\u0012Ff\"\u0012")), m1619z(m1620z("b5]{6n\njQw\\E0\u00168b5_\u00076\u0002KRlSoL\u0011\u00168b5_\u0007<\u0006/HyQ\"")), m1619z(m1620z("x\njHwJ\t}\u001cXM\u0011oSdCE_NwX\rq_e\bM2\u0012Ff\"15<\u00065V{")), m1619z(m1620z("\u000b1WiE")), m1619z(m1620z("\u000b$[S{:QqFg6KuTd GYe5YnWa6Wr")), m1619z(m1620z("\u000b#[s[x$Jy")), m1619z(m1620z("\u000b#Gp_{1]cPa&PuSz")), m1619z(m1620z("\u000b#\\}Bm")), m1619z(m1620z("\u000b#K}C~ GhSp1]")), m1619z(m1620z("\u000b#G}\\g0LyIj0^zSz")), m1619z(m1620z("\u000b#JyFw6MlFz,Uy")), m1619z(m1620z("\u000b#GnSx:YhBz,ZiB")), m1619z(m1620z("\u000b#JyFw VcUg0Jo")), m1619z(m1620z("\u0005T")), m1619z(m1620z("\u000b#[nSm")), m1619z(m1620z("\u000b#JyFm7Ls_z GyNa6Ly")), m1619z(m1620z("\u000b#JyFw&Wl_m")), m1619z(m1620z("\u000b#TuB")), m1619z(m1620z("\u000b#]Da1Gp_o+]")), m1619z(m1620z("\u000b#JyF")), m1619z(m1620z("\u000b#JyFw @y")), m1619z(m1620z("\u000b#]Da1")), m1619z(m1620z("\u000b#^uU`,]nIm=QoBm")), m1619z(m1620z("\u000b#JyFw&JyS")), m1619z(m1620z("\u000b#PyCz ")), m1619z(m1620z("\u000b#[tWf\"]cBi,TpS")), m1619z(m1620z("\u000b#Wi@z Gz_k-QyDw1]qF")), m1619z(m1620z("\u000b#KiFx7QqS")), m1619z(m1620z("\u000b#TuBw)Q{Xm")), m1619z(m1620z("\u000b#GnSo7WiFm")), m1619z(m1620z("%oUYbI#qPs[E0\u00168m(^\u00076\u0002KOqP\u0001l2\u0012sE\u0003#\u00168_\b~1\u001ca\u0006wRs\bM2\u0012_k*#\u001c<\u0006,[k?!O6UuG^8\u00168A\u0006o1\u001ck\u0010jOs]\u0017k\u001c>\u0002K[iD\u0001l2\u0012u]\u0017")), m1619z(m1620z("x\u0004qRbj\u0017mO~\bM2\u0012Fk=15<\u0006\u0015{D\u001b\"$|StMEHTy\\\nkTyXE^SdE\u0004l\u001c>\u0002KHoR\u0001l2\u0012f[\u0001\u00156BZ\u0010}j[\fwR6\u0000O6hQiL")), m1619z(m1620z("!O6[Nh\u0012vFm\"8zyZ\byH6\u0000O6vFoL\u0011\u00168B\u0015\u0007<\u0006\u000fhYq%oSSrI\u000e8l~G\u0011w\u001cUlE0\u00168x&\\\u0015\u001f\u0002Kh_r%o")), m1619z(m1620z("\u0002KzQf\u0013O6Y{N^2\u0012aE\u0003#\u00168A\u0006w\u0007<\u0006\f{K-\u0002K{Id%oZUbE\u0004h\u001c>\u0002KZqF\u0001l2\u0012tE\u0015\u00156UG\bhIeM\u0017nY6\u0000O6{_nL")), m1619z(m1620z("\u0002KOqP\b^8\u00168a&W\u001c-\bO6uU^8\u00168k0J\u0015\u001f\u0002KrLq\u0013O6VfM\u0002#\u00168O\f~\u0007<\u0006\u0015{X-\u0002Kh_n\u0013O6LxO^2\u0012f[\u0001#\u00168\\\u0002y\u0007<\u0006\u0011qZ-\u0002KlUpN^")), m1619z(m1620z("!O6HqIh\u0012hwO\u0002}X6a\by[s\b#qPs\b#wN{I\u00118\u0014<\u00061Qz?!O6HNh\u0012lyZ\u0011y^zMEVYb_\njW6o\u0017yL~A\u0006k\u001c>\u0002KHrQ\u0001l2\u0012fF\u0002")), m1619z(m1620z("\bM2\u0012\\x\"8\u00076\u0002K_uP\b^8\u00168x&\\\u00076\u0002KHN\u0013E2\u0012Ff\"8\u00076\u0002KHoR\u0013E2\u0012Bo$8\u00076\u0002KLuP\b^8\u00168j(H\u001c-\bO6y[nE#")), m1619z(m1620z("\u000b#KyFi7YhS}7")), m1619z(m1620z("\u000b#JyFm7Ls_z GhSe5")), m1619z(m1620z("\u000b#\\yFd$[yIn,[t_m7")), m1619z(m1620z("\u000b#JyFw!]lZi&]")), m1619z(m1620z("\u000b#Gp_{1]cDm5]nBg,Jy")), m1619z(m1620z("\u000b#GxSk*MlS")), m1619z(m1620z("\u000b#JyFw6]pSk1]iD")), m1619z(m1620z("\u000b#^yDe ")), m1619z(m1620z("\u000b#Wi@z ")), m1619z(m1620z("\u000b#JyFw5YnSf1")), m1619z(m1620z("\u000b#^uU`,]nI| Ul")), m1619z(m1620z("\u000b#\\}Bm-]iDm")), m1619z(m1620z("\u000b#]dBz$QhIk-]q_f")), m1619z(m1620z("\u000b#HsEa1QsXf ")), m1619z(m1620z("\u000b#[tWz\"]cT}#^yD")), m1619z(m1620z("\u000b#K}C~ G~Cn#]n")), m1619z(m1620z("\u000b#[sX{1Ji_|:[tSe,V")), m1619z(m1620z("\u000b#L}_d)]")), m1619z(m1620z("\u000b#KyZm&LyCz:QqWo ")), m1619z(m1620z("\u000b#Vs[w#Q^a J")), m1619z(m1620z("\u000b#JyXg(Uy"))};

    /* renamed from: a */
    private static final C1225d m1618a(WDObjet wDObjet) {
        C1225d c1225d = wDObjet != null ? (C1225d) wDObjet.checkType(C1225d.class) : null;
        if (c1225d == null) {
            return c1225d;
        }
        WDObjet 2 = WDIndirection.get2(wDObjet.getString(), 4);
        return 2 != null ? (C1225d) 2.checkType(C1225d.class) : c1225d;
    }

    public static final WDObjet fAjouteBuffer(String str, WDObjet wDObjet) {
        WDObjet wDBooleen;
        WDContexte a = C0677k.m2775a(f1152z[20]);
        try {
            C0897o.m6250a(str, wDObjet.getDonneeBinaire());
            wDBooleen = new WDBooleen(true);
        } catch (Throwable e) {
            Throwable th = e;
            WDErreurManager.m2888b(th);
            wDBooleen = new WDBooleen(th.mo3220i());
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static final WDObjet fAjouteTexte(String str, WDObjet wDObjet) {
        WDObjet wDBooleen;
        WDContexte a = C0677k.m2775a(f1152z[5]);
        try {
            C0897o.m6250a(str, wDObjet.getDonneeBinaire());
            wDBooleen = new WDBooleen(true);
        } catch (Throwable e) {
            Throwable th = e;
            WDErreurManager.m2888b(th);
            wDBooleen = new WDBooleen(th.mo3220i());
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static WDChaine fAttribut(String str) {
        WDChaine wDChaine;
        WDContexte a = C0677k.m2775a(f1152z[2]);
        try {
            wDChaine = new WDChaine(C0897o.m6267c(str));
        } catch (C0901s e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDChaine = new WDChaine(f1152z[1]);
        } finally {
            a.m2735v();
        }
        return wDChaine;
    }

    public static WDBooleen fAttributLectureSeule(String str) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2775a(f1152z[8]);
        try {
            wDBooleen = new WDBooleen(C0897o.m6295o(str));
        } catch (C0901s e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static WDBooleen fChangeTaille(int i, long j) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2775a(f1152z[36]);
        try {
            C0899q.m6308a(i, j);
            wDBooleen = new WDBooleen(true);
        } catch (C0901s e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static WDBuffer fChargeBuffer(String str) {
        WDBuffer wDBuffer;
        WDContexte a = C0677k.m2775a(f1152z[62]);
        try {
            wDBuffer = new WDBuffer(C0897o.m6254a(str, null));
        } catch (C0901s e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBuffer = new WDBuffer();
        } finally {
            a.m2735v();
        }
        return wDBuffer;
    }

    public static WDChaine fChargeTexte(String str) {
        WDContexte a = C0677k.m2775a(f1152z[3]);
        WDChaine wDChaineU;
        try {
            C0728o c0728o = new C0728o();
            byte[] a2 = C0897o.m6254a(str, c0728o);
            if (a2 != null) {
                String c = c0728o.m3093a() != null ? ((C0895m) c0728o.m3093a()).m6228c() : ec.m3882f(255);
                if (c.toUpperCase().startsWith(f1152z[4])) {
                    wDChaineU = new WDChaineU(C0725i.m3035a(a2, c));
                    a.m2735v();
                } else {
                    wDChaineU = new WDChaineA(C0725i.m3035a(a2, c));
                    a.m2735v();
                }
                return wDChaineU;
            }
            wDChaineU = new WDChaine();
            a.m2735v();
            return wDChaineU;
        } catch (C0901s e) {
            throw e;
        } catch (C0901s e2) {
            try {
                WDErreurManager.m2879a(a, e2.getMessage(), e2.m1561f());
                wDChaineU = new WDChaine();
            } finally {
                a.m2735v();
            }
        }
    }

    public static final WDObjet fCherche(int i, WDObjet wDObjet) {
        return fCherche(i, wDObjet, 0);
    }

    public static final WDObjet fCherche(int i, WDObjet wDObjet, int i2) {
        WDObjet wDEntier4;
        WDContexte a = C0677k.m2775a(f1152z[9]);
        try {
            wDEntier4 = new WDEntier4(C0899q.m6304a(i, wDObjet.getDonneeBinaire(), i2));
        } catch (Throwable e) {
            WDErreurManager.m2888b(e);
            wDEntier4 = new WDEntier4(-1);
        } finally {
            a.m2735v();
        }
        return wDEntier4;
    }

    public static WDEntier4 fCompare(String str, String str2) {
        WDEntier4 wDEntier4;
        WDContexte a = C0677k.m2775a(f1152z[16]);
        try {
            int f = C0897o.m6280f(str, str2);
            switch (f) {
                case -2:
                    WDErreurManager.m2877a(a, C0745b.m3222b(f1152z[15], C0897o.m6290j(str2).toString()));
                    break;
                case -1:
                    WDErreurManager.m2877a(a, C0745b.m3222b(f1152z[15], C0897o.m6290j(str).toString()));
                    break;
            }
            wDEntier4 = new WDEntier4(f);
            a.m2735v();
        } catch (C0901s e) {
            throw e;
        } catch (C0901s e2) {
            try {
                WDErreurManager.m2879a(a, e2.getMessage(), e2.m1561f());
                wDEntier4 = new WDEntier4(-3);
            } finally {
                a.m2735v();
            }
        }
        return wDEntier4;
    }

    public static final WDChaine fConstruitChemin(String str, String str2) {
        return fConstruitChemin(str, str2, null);
    }

    public static final WDChaine fConstruitChemin(String str, String str2, String str3) {
        WDContexte a = C0677k.m2775a(f1152z[64]);
        try {
            WDChaine wDChaine = new WDChaine(C0897o.m6246a(str, str2, str3));
            return wDChaine;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen fCopieFichier(String str, String str2) {
        return fCopieFichier(str, str2, 0);
    }

    public static WDBooleen fCopieFichier(String str, String str2, int i) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2775a(f1152z[7]);
        try {
            C0889f.m6213a(str, str2, i, true, false);
            wDBooleen = new WDBooleen(true);
        } catch (C0901s e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static WDEntier4 fCree(String str) {
        WDEntier4 wDEntier4;
        WDContexte a = C0677k.m2775a(f1152z[25]);
        try {
            wDEntier4 = new WDEntier4(C0899q.m6301a(str));
        } catch (C0901s e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDEntier4 = new WDEntier4(-1);
        } finally {
            a.m2735v();
        }
        return wDEntier4;
    }

    public static WDChaine fDate(String str) {
        return fDate(str, "", 0);
    }

    public static WDChaine fDate(String str, String str2) {
        return fDate(str, str2, 0);
    }

    public static WDChaine fDate(String str, String str2, int i) {
        WDContexte a = C0677k.m2775a(f1152z[18]);
        try {
            WDChaine wDChaine = new WDChaine(C0897o.m6245a(str, str2, i));
            return wDChaine;
        } finally {
            a.m2735v();
        }
    }

    public static WDChaine fDateHeure(String str) {
        return fDateHeure(str, "", 0);
    }

    public static WDChaine fDateHeure(String str, String str2) {
        return fDateHeure(str, str2, 0);
    }

    public static WDChaine fDateHeure(String str, String str2, int i) {
        WDContexte a = C0677k.m2775a(f1152z[59]);
        try {
            WDChaine wDChaine = new WDChaine(C0897o.m6260b(str, str2, i));
            return wDChaine;
        } finally {
            a.m2735v();
        }
    }

    public static final WDEntier4 fDecoupe(String str, long j) {
        return fDecoupe(str, j, str, 0, null);
    }

    public static final WDEntier4 fDecoupe(String str, long j, String str2) {
        return fDecoupe(str, j, str2, 0, null);
    }

    public static final WDEntier4 fDecoupe(String str, long j, String str2, int i) {
        return fDecoupe(str, j, str2, i, null);
    }

    public static final WDEntier4 fDecoupe(String str, long j, String str2, int i, WDObjet wDObjet) {
        WDEntier4 wDEntier4;
        WDContexte a = C0677k.m2775a(f1152z[53]);
        try {
            wDEntier4 = new WDEntier4(C0897o.m6229a(str, j, str2, i, m1618a(wDObjet)));
        } catch (C0901s e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDEntier4 = new WDEntier4(0);
        } finally {
            a.m2735v();
        }
        return wDEntier4;
    }

    public static WDBooleen fDeplaceFichier(String str, String str2) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2775a(f1152z[50]);
        try {
            wDBooleen = new WDBooleen(C0897o.m6286g(str, str2));
        } catch (C0901s e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static WDChaine fDisqueEnCours() {
        WDContexte a = C0677k.m2775a(f1152z[6]);
        try {
            WDChaine wDChaine = new WDChaine(C0897o.m6272d());
            return wDChaine;
        } finally {
            a.m2735v();
        }
    }

    public static WDEntier4 fEcrit(int i, WDObjet wDObjet) {
        return fEcrit(i, wDObjet, -1);
    }

    public static WDEntier4 fEcrit(int i, WDObjet wDObjet, int i2) {
        WDEntier4 wDEntier4;
        WDContexte a = C0677k.m2775a(f1152z[32]);
        try {
            if (((WDChaine) wDObjet.checkType(WDChaine.class)) != null) {
                wDEntier4 = new WDEntier4(C0899q.m6300a(i, wDObjet.getDonneeBinaire(), i2, null));
            } else {
                wDEntier4 = new WDEntier4(C0899q.m6299a(i, wDObjet.getString(), i2));
                a.m2735v();
            }
        } catch (C0901s e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDEntier4 = new WDEntier4(-1);
        } finally {
            a.m2735v();
        }
        return wDEntier4;
    }

    public static WDEntier4 fEcrit(int i, String str) {
        return fEcrit(i, str, -1);
    }

    public static WDEntier4 fEcrit(int i, String str, int i2) {
        WDEntier4 wDEntier4;
        WDContexte a = C0677k.m2775a(f1152z[32]);
        try {
            wDEntier4 = new WDEntier4(C0899q.m6299a(i, str, i2));
        } catch (C0901s e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDEntier4 = new WDEntier4(-1);
        } finally {
            a.m2735v();
        }
        return wDEntier4;
    }

    public static WDBooleen fEcritLigne(int i, String str) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2775a(f1152z[29]);
        try {
            C0899q.m6309a(i, str);
            wDBooleen = new WDBooleen(true);
        } catch (C0901s e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static WDChaine fExtraitChemin(String str, int i) {
        WDContexte a = C0677k.m2775a(f1152z[60]);
        try {
            WDChaine wDChaine = new WDChaine(C0897o.m6259b(str, i));
            return wDChaine;
        } finally {
            a.m2735v();
        }
    }

    public static WDEntier4 fFerme(int i) {
        WDEntier4 wDEntier4;
        WDContexte a = C0677k.m2775a(f1152z[55]);
        try {
            wDEntier4 = new WDEntier4(C0899q.m6315d(i));
        } catch (C0901s e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDEntier4 = new WDEntier4(-1);
        } finally {
            a.m2735v();
        }
        return wDEntier4;
    }

    public static WDBooleen fFichierExiste(String str) {
        WDContexte a = C0677k.m2775a(f1152z[33]);
        try {
            WDBooleen wDBooleen = new WDBooleen(C0897o.m6289i(str));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static WDChaine fFichierTemp() {
        return fFichierTemp("", "");
    }

    public static WDChaine fFichierTemp(String str) {
        return fFichierTemp(str, "");
    }

    public static WDChaine fFichierTemp(String str, String str2) {
        WDContexte a = C0677k.m2775a(f1152z[58]);
        try {
            WDChaine wDChaine = new WDChaine(C0897o.m6268c(str, str2));
            return wDChaine;
        } finally {
            a.m2735v();
        }
    }

    public static WDChaine fFiltreImage() {
        return new WDChaine(C0745b.m3224c(f1152z[14], new String[0]) + f1152z[47] + f1152z[45] + f1152z[44] + f1152z[43] + f1152z[42] + f1152z[46] + f1152z[41]);
    }

    public static WDChaine fHeure(String str) {
        return fHeure(str, "", 0);
    }

    public static WDChaine fHeure(String str, String str2) {
        return fHeure(str, str2, 0);
    }

    public static WDChaine fHeure(String str, String str2, int i) {
        WDContexte a = C0677k.m2775a(f1152z[35]);
        try {
            WDChaine wDChaine = new WDChaine(C0897o.m6269c(str, str2, i));
            return wDChaine;
        } finally {
            a.m2735v();
        }
    }

    public static WDObjet fListeFichier(String str) {
        return fListeFichier(str, new WDEntier4(1), null, 0);
    }

    public static WDObjet fListeFichier(String str, C0486m c0486m) {
        return fListeFichier(str, c0486m, null, 1);
    }

    public static WDObjet fListeFichier(String str, C0486m c0486m, WDObjet wDObjet) {
        return fListeFichier(str, c0486m, wDObjet, 1);
    }

    public static WDObjet fListeFichier(String str, C0486m c0486m, WDObjet wDObjet, int i) {
        WDObjet wDEntier8;
        WDContexte a = C0677k.m2775a(f1152z[17]);
        if (c0486m != null) {
            try {
                if (!(c0486m instanceof WDObjet) || ((WDObjet) c0486m).checkType(C0548s.class) == null) {
                    wDEntier8 = new WDEntier8(C0897o.m6234a(str, c0486m, wDObjet, i));
                    return wDEntier8;
                }
            } finally {
                a.m2735v();
            }
        }
        wDEntier8 = new WDChaine(C0897o.m6282f(str, ((WDObjet) c0486m).getInt()));
        a.m2735v();
        return wDEntier8;
    }

    public static WDObjet fListeRepertoire(String str) {
        return fListeRepertoire(str, new WDEntier4(1), null, 0);
    }

    public static WDObjet fListeRepertoire(String str, C0486m c0486m) {
        return fListeRepertoire(str, c0486m, null, 1);
    }

    public static WDObjet fListeRepertoire(String str, C0486m c0486m, WDObjet wDObjet) {
        return fListeRepertoire(str, c0486m, wDObjet, 1);
    }

    public static WDObjet fListeRepertoire(String str, C0486m c0486m, WDObjet wDObjet, int i) {
        WDObjet wDEntier8;
        Object obj = null;
        WDContexte a = C0677k.m2775a(f1152z[52]);
        if (c0486m != null) {
            try {
                if (!(c0486m instanceof WDObjet) || ((WDObjet) c0486m).checkType(C0548s.class) == null) {
                    obj = 1;
                    wDEntier8 = new WDEntier8(C0897o.m6255b(str, c0486m, wDObjet, i));
                    a.m2735v();
                    return wDEntier8;
                }
            } catch (C0901s e) {
                throw e;
            } catch (C0901s e2) {
                try {
                    WDErreurManager.m2879a(a, e2.getMessage(), e2.m1561f());
                    if (obj != null) {
                        wDEntier8 = new WDEntier8(0);
                    } else {
                        wDEntier8 = new WDChaine();
                        a.m2735v();
                    }
                } finally {
                    a.m2735v();
                }
            }
        }
        wDEntier8 = new WDChaine(C0897o.m6243a(str, ((WDObjet) c0486m).getInt()));
        a.m2735v();
        return wDEntier8;
    }

    public static WDChaine fLit(int i, int i2) {
        WDChaine wDChaine;
        WDContexte a = C0677k.m2775a(f1152z[28]);
        try {
            wDChaine = new WDChaine(C0899q.m6312a(i, i2));
        } catch (C0901s e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDChaine = new WDChaine();
        } finally {
            a.m2735v();
        }
        return wDChaine;
    }

    public static WDChaine fLitLigne(int i) {
        WDChaine wDChaine;
        WDContexte a = C0677k.m2775a(f1152z[39]);
        try {
            wDChaine = new WDChaine(C0899q.m6314c(i));
        } catch (C0901s e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDChaine = new WDChaine();
        } finally {
            a.m2735v();
        }
        return wDChaine;
    }

    public static WDChaine fNomFichier(int i) {
        WDContexte a = C0677k.m2775a(f1152z[67]);
        try {
            WDChaine wDChaine = new WDChaine(C0899q.m6306a(i));
            return wDChaine;
        } finally {
            a.m2735v();
        }
    }

    public static WDEntier4 fOuvre(String str) {
        return fOuvre(str, 3);
    }

    public static WDEntier4 fOuvre(String str, int i) {
        WDEntier4 wDEntier4;
        WDContexte a = C0677k.m2775a(f1152z[56]);
        try {
            wDEntier4 = new WDEntier4(C0899q.m6302a(str, i));
        } catch (C0901s e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDEntier4 = new WDEntier4(-1);
        } finally {
            a.m2735v();
        }
        return wDEntier4;
    }

    public static WDEntier4 fOuvreFichierTemp() {
        return fOuvreFichierTemp(0, "", "");
    }

    public static WDEntier4 fOuvreFichierTemp(int i) {
        return fOuvreFichierTemp(i, "", "");
    }

    public static WDEntier4 fOuvreFichierTemp(int i, String str) {
        return fOuvreFichierTemp(i, str, "");
    }

    public static WDEntier4 fOuvreFichierTemp(int i, String str, String str2) {
        WDEntier4 wDEntier4;
        WDContexte a = C0677k.m2775a(f1152z[37]);
        try {
            wDEntier4 = new WDEntier4(C0899q.m6302a(C0897o.m6268c(str, str2), i + 512));
        } catch (C0901s e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDEntier4 = new WDEntier4(-1);
        } finally {
            a.m2735v();
        }
        return wDEntier4;
    }

    public static WDEntier4 fPositionne(int i, long j, int i2) {
        WDEntier4 wDEntier4;
        WDContexte a = C0677k.m2775a(f1152z[61]);
        try {
            wDEntier4 = new WDEntier4(C0899q.m6303a(i, i2, j));
        } catch (C0901s e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDEntier4 = new WDEntier4(-1);
        } finally {
            a.m2735v();
        }
        return wDEntier4;
    }

    public static final WDEntier4 fRegroupe(String str) {
        return fRegroupe(str, str, 0, null);
    }

    public static final WDEntier4 fRegroupe(String str, String str2) {
        return fRegroupe(str, str2, 0, null);
    }

    public static final WDEntier4 fRegroupe(String str, String str2, int i) {
        return fRegroupe(str, str2, i, null);
    }

    public static final WDEntier4 fRegroupe(String str, String str2, int i, WDObjet wDObjet) {
        WDEntier4 wDEntier4;
        WDContexte a = C0677k.m2775a(f1152z[40]);
        try {
            wDEntier4 = new WDEntier4(C0897o.m6230a(str, str2, i, m1618a(wDObjet)));
        } catch (C0901s e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDEntier4 = new WDEntier4(0);
        } finally {
            a.m2735v();
        }
        return wDEntier4;
    }

    public static WDBooleen fRenomme(String str, String str2) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2775a(f1152z[68]);
        try {
            wDBooleen = new WDBooleen(C0897o.m6286g(str, str2));
        } catch (C0901s e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static WDChaine fRep(String str) {
        return fRep(str, 39);
    }

    public static WDChaine fRep(String str, int i) {
        WDContexte a = C0677k.m2775a(f1152z[30]);
        try {
            WDChaine wDChaine = new WDChaine(C0897o.m6278e(str, i));
            return wDChaine;
        } finally {
            a.m2735v();
        }
    }

    public static WDChaine fRepAttribut(String str) {
        WDChaine wDChaine;
        WDContexte a = C0677k.m2775a(f1152z[22]);
        try {
            wDChaine = new WDChaine(C0897o.m6267c(str));
        } catch (C0901s e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDChaine = new WDChaine(f1152z[1]);
        } finally {
            a.m2735v();
        }
        return wDChaine;
    }

    public static WDBooleen fRepCopie(String str, String str2) {
        return fRepCopie(str, str2, 0);
    }

    public static WDBooleen fRepCopie(String str, String str2, int i) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2775a(f1152z[27]);
        try {
            C0889f.m6213a(str, str2, i, false, false);
            wDBooleen = new WDBooleen(true);
        } catch (C0901s e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static WDBooleen fRepCree(String str) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2775a(f1152z[34]);
        try {
            wDBooleen = new WDBooleen(C0897o.m6292l(str));
        } catch (C0901s e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static WDBooleen fRepDeplace(String str, String str2) {
        return fRepDeplace(str, str2, 0);
    }

    public static WDBooleen fRepDeplace(String str, String str2, int i) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2775a(f1152z[51]);
        try {
            C0889f.m6213a(str, str2, i, false, true);
            wDBooleen = new WDBooleen(true);
        } catch (C0901s e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static WDChaine fRepEnCours() {
        return new WDChaine(C0897o.m6240a());
    }

    public static WDChaine fRepEnCours(String str) {
        WDChaine wDChaine;
        WDContexte a = C0677k.m2775a(f1152z[23]);
        try {
            wDChaine = new WDChaine(C0897o.m6293m(str));
        } catch (C0901s e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDChaine = new WDChaine(f1152z[24]);
        } finally {
            a.m2735v();
        }
        return wDChaine;
    }

    public static WDChaine fRepExe() {
        WDContexte a = C0677k.m2775a(f1152z[31]);
        try {
            WDChaine wDChaine = new WDChaine(WDProjet.getInstance().getRepertoireExecution());
            return wDChaine;
        } finally {
            a.m2735v();
        }
    }

    public static WDChaine fRepParent(String str) {
        return fRepParent(str, 0);
    }

    public static WDChaine fRepParent(String str, int i) {
        boolean z = true;
        WDChaine wDChaine = 57;
        WDContexte a = C0677k.m2775a(f1152z[57]);
        try {
            if (i != 1) {
                z = false;
            }
            wDChaine = new WDChaine(C0897o.m6261b(str, z));
            return wDChaine;
        } finally {
            a.m2735v();
        }
    }

    public static WDChaine fRepSelecteur(String str, String str2) {
        return fRepSelecteur(str, str2, "", "");
    }

    public static WDChaine fRepSelecteur(String str, String str2, String str3) {
        return fRepSelecteur(str, str2, str3, "");
    }

    public static WDChaine fRepSelecteur(String str, String str2, String str3, String str4) {
        WDContexte a = C0677k.m2775a(f1152z[54]);
        try {
            WDChaine wDChaine = new WDChaine(C1372f.m9828a().mo3748a(new WDFileMsgBoxFactory(), str, str2, str3, str4));
            return wDChaine;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen fRepSupprime(String str) {
        return fRepSupprime(str, 0);
    }

    public static WDBooleen fRepSupprime(String str, int i) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2775a(f1152z[21]);
        try {
            wDBooleen = new WDBooleen(C0897o.m6270c(str, i));
        } catch (C0901s e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static WDEntier8 fRepTaille(String str) {
        return fRepTaille(str, 1);
    }

    public static WDEntier8 fRepTaille(String str, int i) {
        WDEntier8 wDEntier8;
        boolean z = true;
        WDContexte a = C0677k.m2775a(f1152z[37]);
        try {
            boolean z2 = (i & 1) == 1;
            if ((i & 4) != 4) {
                z = false;
            }
            wDEntier8 = new WDEntier8(C0897o.m6235a(str, z2, z));
        } catch (C0901s e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDEntier8 = new WDEntier8(-1);
        } finally {
            a.m2735v();
        }
        return wDEntier8;
    }

    public static WDBooleen fRepertoireExiste(String str) {
        WDContexte a = C0677k.m2775a(f1152z[26]);
        try {
            WDBooleen wDBooleen = new WDBooleen(C0897o.m6274d(str));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static WDChaine fRepertoireTemp() {
        WDChaine wDChaine;
        WDContexte a = C0677k.m2775a(f1152z[49]);
        try {
            wDChaine = new WDChaine(C0897o.m6265c());
        } catch (C0901s e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDChaine = new WDChaine();
        } finally {
            a.m2735v();
        }
        return wDChaine;
    }

    public static WDBooleen fSauveBuffer(String str, WDObjet wDObjet) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2775a(f1152z[63]);
        try {
            wDBooleen = new WDBooleen(C0899q.m6311a(wDObjet.getDonneeBinaire(), str, null));
        } catch (C0901s e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static WDBooleen fSauveTexte(String str, WDObjet wDObjet) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2775a(f1152z[19]);
        try {
            WDChaine wDChaine = (WDChaine) wDObjet.checkType(WDChaine.class);
            if (wDChaine != null) {
                byte[] bArr = null;
                if (wDChaine.getTypeVar() == 16) {
                    bArr = C0895m.f2397g.m6223b();
                }
                wDBooleen = new WDBooleen(C0899q.m6311a(wDObjet.getDonneeBinaire(), str, bArr));
            } else {
                wDBooleen = new WDBooleen(C0899q.m6310a(wDObjet.getString(), str));
                a.m2735v();
            }
        } catch (C0901s e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static WDChaine fSelecteur(String str, String str2, String str3, String str4) {
        return fSelecteur("", str, str2, str3, str4, 6);
    }

    public static WDChaine fSelecteur(String str, String str2, String str3, String str4, int i) {
        return fSelecteur("", str, str2, str3, str4, i);
    }

    public static WDChaine fSelecteur(String str, String str2, String str3, String str4, String str5) {
        return fSelecteur(str, str2, str3, str4, str5, 6);
    }

    public static WDChaine fSelecteur(String str, String str2, String str3, String str4, String str5, int i) {
        WDContexte a = C0677k.m2775a(f1152z[0]);
        try {
            WDChaine wDChaine = new WDChaine(C1372f.m9828a().mo3754b(new WDFileMsgBoxFactory(), str, str2, str3, str4, str5, i));
            return wDChaine;
        } finally {
            a.m2735v();
        }
    }

    public static WDChaine fSelecteurImage(String str, String str2, String str3) {
        return fSelecteurImage(str, str2, str3, C0745b.m3224c(f1152z[14], new String[0]) + f1152z[11] + f1152z[12] + f1152z[10] + f1152z[13]);
    }

    public static WDChaine fSelecteurImage(String str, String str2, String str3, String str4) {
        WDContexte a = C0677k.m2775a(f1152z[66]);
        try {
            WDChaine wDChaine = new WDChaine(C1372f.m9828a().mo3749a(new WDFileMsgBoxFactory(), str, str2, str3, str4, "", 6));
            return wDChaine;
        } finally {
            a.m2735v();
        }
    }

    public static final WDChaine fSep() {
        return new WDChaine(File.separator);
    }

    public static final WDChaine fSeparateur(String str) {
        return fSeparateur(str, new WDEntier4(0));
    }

    public static final WDChaine fSeparateur(String str, WDObjet wDObjet) {
        WDContexte a = C0677k.m2775a(f1152z[48]);
        try {
            WDChaine wDChaine;
            String str2 = "";
            if (wDObjet.getValeur().isNumerique()) {
                wDChaine = wDObjet.getInt();
                switch (wDChaine) {
                    case null:
                        str2 = File.separator;
                        break;
                    case 1:
                        str2 = "\\";
                        break;
                    case 2:
                        str2 = "/";
                        break;
                }
            }
            str2 = wDObjet.getString();
            wDChaine = new WDChaine(C0897o.m6279e(str, str2));
            return wDChaine;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen fSupprime(String str) {
        return fSupprime(str, 0);
    }

    public static WDBooleen fSupprime(String str, int i) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2775a(f1152z[38]);
        try {
            wDBooleen = new WDBooleen(C0897o.m6275d(str, i));
        } catch (C0901s e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static WDEntier8 fTaille(String str) {
        WDEntier8 wDEntier8;
        WDContexte a = C0677k.m2775a(f1152z[65]);
        try {
            wDEntier8 = new WDEntier8(C0897o.m6287h(str));
        } catch (C0901s e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDEntier8 = new WDEntier8(-1);
        } finally {
            a.m2735v();
        }
        return wDEntier8;
    }

    /* renamed from: z */
    private static String m1619z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 40;
                    break;
                case 1:
                    i2 = 101;
                    break;
                case 2:
                    i2 = 24;
                    break;
                case 3:
                    i2 = 60;
                    break;
                default:
                    i2 = 22;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1620z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 22);
        }
        return toCharArray;
    }
}
