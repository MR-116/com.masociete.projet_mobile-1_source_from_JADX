package fr.pcsoft.wdjava.api;

import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDCallback;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.application.C0536n;
import fr.pcsoft.wdjava.core.application.WDAppManager;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.context.C0669a;
import fr.pcsoft.wdjava.core.context.C0677k;
import fr.pcsoft.wdjava.core.context.WDAppelContexte;
import fr.pcsoft.wdjava.core.context.WDContexte;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.erreur.WDException;
import fr.pcsoft.wdjava.core.p046e.C0693b;
import fr.pcsoft.wdjava.core.poo.C0733z;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.C0782g;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDDuree;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.core.types.WDMonetaire;
import fr.pcsoft.wdjava.core.types.WDProcedure;
import fr.pcsoft.wdjava.core.types.cb;
import fr.pcsoft.wdjava.core.types.collection.tableau.C0758k;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.core.utils.C0810n;
import fr.pcsoft.wdjava.core.utils.ec;
import fr.pcsoft.wdjava.database.hf.C0849z;
import fr.pcsoft.wdjava.p060p.C1013b;
import fr.pcsoft.wdjava.ui.dialogue.C1372f;
import fr.pcsoft.wdjava.ui.utils.C1515p;
import java.util.Locale;

public class WDAPIVM_Commun {
    /* renamed from: z */
    private static final String[] f1232z = new String[]{m1680z(m1681z("\u0013A\u001f}&~M\b}(j")), m1680z(m1681z("\u0013G\u0005}6tK\u001aj'cK\u0018a6\u0002")), m1680z(m1681z("\u0013F\u001eb,~Q\u001e`'")), m1680z(m1681z("\u0013L\u0016{ L")), m1680z(m1681z("\u0013A\u001fn'wG\bn%`J\u0016m,d")), m1680z(m1681z("\u0013A\u001f}&~M\by(|G\u0002}")), m1680z(m1681z("\u0013G\u0005},eP\bk,sN\u0012a*xG")), m1680z(m1681z("\u0013G\u000fj*eV\u0012p=bC\u001e{,}G\u0019{")), m1680z(m1681z("\u0013F\u0015h6yL\u0011`")), m1680z(m1681z("\u0013A\u001f}&~M\bk,rW\u0003")), m1680z(m1681z("\u0013G\u0005},eP\bf'vM")), m1680z(m1681z("\u0013G\u000fl,`V\u001e`'oF\u0012l%uL\u0014g,")), m1680z(m1681z("\u0013A\u0018k,oG\u0005},eP\b,bQ\u0018")), m1680z(m1681z("sJ\u0016}.u]\u0012};uW\u0005")), m1680z(m1681z("\u0013A\u001f}&~M\b(eQ\u0012")), m1680z(m1681z("\u0013D\u001ea6`P\u0018h;qO\u001aj")), m1680z(m1681z("\u0013A\u001f}&~M\b},`P\u0012a-")), m1680z(m1681z("\u0013A\u001fn$`")), m1680z(m1681z("\u0013A\u0018a?uP\u0004f&~]\u001eb9Q\u0004f+|G")), m1680z(m1681z("\u0013G\u0005},eP\b(cQ\u0016h,oR\u0016}(}")), m1680z(m1681z("\u0013A\u001fn$`]\u001ea*L\u0019z")), m1680z(m1681z("\u0013D\u001el!yG\u0005")), m1680z(m1681z("\u0013A\u0018k,oG\u0005},eP")), m1680z(m1681z(":/w")), m1680z(m1681z("\u001d\"")), m1680z(m1681z("\u0013A\u001bn:cG")), m1680z(m1681z("\u0013S\u0002j6c]\u0012|=oK\u001bp9qQ\u0004j")), m1680z(m1681z("\u0013O\u0012{!F\u0012")), m1680z(m1681z("\u00108w")), m1680z(m1681z("\u0013L\u001ey,qW\bj;bG\u0002}6vC\u0003n%u")), m1680z(m1681z("\u0013N\u001eh'u")), m1680z(m1681z("\u0010=w%")), m1680z(m1681z("\u0013A\u001f}&~M\bi ~")), m1680z(m1681z("\u0013R\u0005`*uF\u0002},oK\u0019l&~L\u0002j")), m1680z(m1681z("\u0013A\u001fj;sJ\u0012p9bM\u0014j-eP\u0012"))};

    public static final WDEntier4 changeAlphabet() {
        return new WDEntier4(ec.m3869a(WDProjet.getInstance().getCharset()));
    }

    public static final WDEntier4 changeAlphabet(int i) {
        return changeAlphabet(i, 0, 0, 0);
    }

    public static final WDEntier4 changeAlphabet(int i, int i2) {
        return changeAlphabet(i, i2, 0, 0);
    }

    public static final WDEntier4 changeAlphabet(int i, int i2, int i3) {
        return changeAlphabet(i, i2, i3, 0);
    }

    public static final WDEntier4 changeAlphabet(int i, int i2, int i3, int i4) {
        WDEntier4 wDEntier4;
        WDContexte a = C0677k.m2775a(f1232z[4]);
        try {
            int a2 = ec.m3869a(WDProjet.getInstance().getCharset());
            WDProjet.getInstance().setCharset(ec.m3882f(i));
            wDEntier4 = new WDEntier4(a2);
        } catch (C1013b e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDEntier4 = new WDEntier4(-1);
        } finally {
            a.m2735v();
        }
        return wDEntier4;
    }

    public static final WDObjet chargeErreur(String str) {
        WDObjet wDEntier4;
        WDContexte a = C0677k.m2775a(f1232z[13]);
        try {
            C0745b.m3225d(str);
            wDEntier4 = new WDEntier4(0);
        } catch (Throwable e) {
            Throwable th = e;
            WDErreurManager.m2888b(th);
            wDEntier4 = new WDEntier4(th.mo2326e());
        } finally {
            a.m2735v();
        }
        return wDEntier4;
    }

    public static final WDObjet chercheProcedure(String str) {
        return chercheProcedure(str, 10);
    }

    public static final WDObjet chercheProcedure(String str, int i) {
        WDContexte a = C0677k.m2775a(f1232z[34]);
        try {
            WDCallback a2 = WDCallback.m2244a(str, -1, false);
            if (a2 == null) {
                WDErreurManager.m2877a(a, C0745b.m3222b(f1232z[33], str));
            }
            WDObjet wDProcedure = new WDProcedure(a2);
            a.m2735v();
            return wDProcedure;
        } catch (WDException e) {
            throw e;
        } catch (Throwable th) {
            a.m2735v();
        }
    }

    public static void chronoDebut() {
        chronoDebut(1);
    }

    public static void chronoDebut(int i) {
        WDContexte a = C0677k.m2775a(f1232z[9]);
        try {
            ((C0669a) WDAppelContexte.m2679a(C0669a.class)).m2743b(i);
        } finally {
            a.m2735v();
        }
    }

    public static WDDuree chronoFin() {
        return chronoFin(1);
    }

    public static WDDuree chronoFin(int i) {
        WDContexte a = C0677k.m2775a(f1232z[32]);
        try {
            WDDuree wDDuree = new WDDuree(((C0669a) WDAppelContexte.m2679a(C0669a.class)).m2744c(i));
            return wDDuree;
        } finally {
            a.m2735v();
        }
    }

    public static WDDuree chronoPause() {
        return chronoPause(1);
    }

    public static WDDuree chronoPause(int i) {
        WDContexte a = C0677k.m2775a(f1232z[14]);
        try {
            WDDuree wDDuree = new WDDuree(((C0669a) WDAppelContexte.m2679a(C0669a.class)).m2744c(i));
            return wDDuree;
        } finally {
            a.m2735v();
        }
    }

    public static void chronoRAZ() {
        chronoRAZ(1);
    }

    public static void chronoRAZ(int i) {
        WDContexte a = C0677k.m2775a(f1232z[0]);
        try {
            ((C0669a) WDAppelContexte.m2679a(C0669a.class)).m2745d(i);
        } finally {
            a.m2735v();
        }
    }

    public static void chronoReprend() {
        chronoReprend(1);
    }

    public static void chronoReprend(int i) {
        WDContexte a = C0677k.m2775a(f1232z[16]);
        try {
            ((C0669a) WDAppelContexte.m2679a(C0669a.class)).m2747f(i);
        } finally {
            a.m2735v();
        }
    }

    public static WDDuree chronoValeur() {
        return chronoValeur(1);
    }

    public static WDDuree chronoValeur(int i) {
        WDContexte a = C0677k.m2775a(f1232z[5]);
        try {
            WDDuree wDDuree = new WDDuree(((C0669a) WDAppelContexte.m2679a(C0669a.class)).m2746e(i));
            return wDDuree;
        } finally {
            a.m2735v();
        }
    }

    public static WDObjet dbgInfo(int i) {
        return dbgInfo(i, 0);
    }

    public static WDObjet dbgInfo(int i, int i2) {
        WDObjet wDChaine;
        WDContexte a = C0677k.m2775a(f1232z[8]);
        switch (i) {
            case 1:
                wDChaine = new WDChaine(a.m2692a(i2, true));
                a.m2735v();
                break;
            case 2:
                wDChaine = new WDChaine(a.m2710b(i2));
                a.m2735v();
                break;
            case 4:
                wDChaine = new WDChaine(a.m2725k());
                a.m2735v();
                break;
            case 5:
                wDChaine = new WDChaine(C0725i.m3045b(i2));
                a.m2735v();
                break;
            case 16777216:
                if (i2 == 108) {
                    wDChaine = new WDBooleen(WDProjet.getInstance().isModeAnsi());
                    a.m2735v();
                    break;
                }
                break;
        }
        try {
            wDChaine = new WDChaine("");
            return wDChaine;
        } finally {
            a.m2735v();
        }
    }

    public static WDEntier4 dimension(WDObjet wDObjet) {
        try {
            if (wDObjet.isChamp()) {
                return new WDEntier4(4);
            }
            try {
                if (wDObjet.isTableau()) {
                    if (!((C0758k) wDObjet).mo2481f()) {
                        return new WDEntier4(0);
                    }
                }
                try {
                    if (!(wDObjet instanceof cb)) {
                        if (wDObjet.isNull()) {
                            return new WDEntier4(0);
                        }
                    }
                    try {
                        if (wDObjet instanceof C0849z) {
                            return new WDEntier4(((C0849z) wDObjet).mo3139d());
                        }
                        int i;
                        WDObjet valeur = wDObjet.getValeur();
                        int typeVar = valeur.getTypeVar();
                        switch (typeVar) {
                            case 34:
                                try {
                                    return valeur.getOccurrence();
                                } catch (WDException e) {
                                    throw e;
                                }
                            case 37:
                            case 111:
                                C0733z c0733z = (C0733z) valeur.checkType(C0733z.class);
                                if (c0733z == null) {
                                    i = 4;
                                    break;
                                }
                                i = c0733z.getSizeOf();
                                break;
                            case 62:
                                return valeur.getOccurrence();
                            default:
                                i = C0810n.m4088a(typeVar);
                                break;
                        }
                        return new WDEntier4(i);
                    } catch (WDException e2) {
                        throw e2;
                    }
                } catch (WDException e22) {
                    throw e22;
                } catch (WDException e222) {
                    throw e222;
                }
            } catch (WDException e2222) {
                throw e2222;
            } catch (WDException e22222) {
                throw e22222;
            }
        } catch (WDException e222222) {
            throw e222222;
        }
    }

    public static void dimension(WDObjet wDObjet, int[] iArr) {
        WDContexte a = C0677k.m2775a(f1232z[2]);
        try {
            if (!wDObjet.isTableau()) {
                WDErreurManager.m2883a(C0745b.m3222b(f1232z[1], new String[0]));
            }
            ((C0758k) wDObjet).mo2659a(iArr, 0);
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen enMode64bits() {
        return new WDBooleen(C0536n.f994E);
    }

    public static WDBooleen enModeAWP() {
        return new WDBooleen(false);
    }

    public static WDBooleen enModeAjax() {
        return new WDBooleen(false);
    }

    public static WDBooleen enModeAndroid() {
        return new WDBooleen(true);
    }

    public static WDBooleen enModeAppleWatch() {
        return new WDBooleen(false);
    }

    public static WDBooleen enModeComposant() {
        return new WDBooleen(false);
    }

    public static WDBooleen enModeEmulateurAppleWatch() {
        return new WDBooleen(false);
    }

    public static WDBooleen enModeEmulateurWindowsPhone() {
        return new WDBooleen(false);
    }

    public static WDBooleen enModeEmulateuriOS() {
        return new WDBooleen(false);
    }

    public static WDBooleen enModeEtatsEtRequetes() {
        return new WDBooleen(false);
    }

    public static WDBooleen enModeFabrique() {
        return new WDBooleen(false);
    }

    public static WDBooleen enModeJava() {
        return new WDBooleen(true);
    }

    public static WDBooleen enModeLinux() {
        return new WDBooleen(false);
    }

    public static WDBooleen enModeMCU() {
        return new WDBooleen(false);
    }

    public static WDBooleen enModePHP() {
        return new WDBooleen(false);
    }

    public static WDBooleen enModePocket() {
        return new WDBooleen(false);
    }

    public static WDBooleen enModeProcedureDifferee() {
        return new WDBooleen(false);
    }

    public static WDBooleen enModeProcedureStockee() {
        return new WDBooleen(false);
    }

    public static WDBooleen enModeService() {
        return new WDBooleen(false);
    }

    public static WDBooleen enModeSessionPrelancee() {
        return new WDBooleen(false);
    }

    public static WDBooleen enModeSimulateur() {
        return new WDBooleen(false);
    }

    public static WDBooleen enModeSimulateurAndroid() {
        return new WDBooleen(false);
    }

    public static WDBooleen enModeSimulateurAppleWatch() {
        return new WDBooleen(false);
    }

    public static WDBooleen enModeSimulateurPHP() {
        return new WDBooleen(false);
    }

    public static WDBooleen enModeSimulateurPocket() {
        return new WDBooleen(false);
    }

    public static WDBooleen enModeSimulateurUniversalWindowsApp() {
        return new WDBooleen(false);
    }

    public static WDBooleen enModeSimulateurWindowsPhone() {
        return new WDBooleen(false);
    }

    public static WDBooleen enModeSimulateurWindowsStoreApp() {
        return new WDBooleen(false);
    }

    public static WDBooleen enModeSimulateuriOS() {
        return new WDBooleen(false);
    }

    public static WDBooleen enModeTSE() {
        return new WDBooleen(false);
    }

    public static WDBooleen enModeTest() {
        return new WDBooleen(false);
    }

    public static WDBooleen enModeTestAutomatique() {
        return new WDBooleen(false);
    }

    public static WDBooleen enModeUniversalWindowsApp() {
        return new WDBooleen(false);
    }

    public static WDBooleen enModeWeb() {
        return new WDBooleen(false);
    }

    public static WDBooleen enModeWebService() {
        return new WDBooleen(false);
    }

    public static WDBooleen enModeWidget() {
        return new WDBooleen(WDAppManager.m2548G());
    }

    public static WDBooleen enModeWindows() {
        return new WDBooleen(WDProjet.f);
    }

    public static WDBooleen enModeWindowsMobile() {
        return new WDBooleen(false);
    }

    public static WDBooleen enModeWindowsPhone() {
        return new WDBooleen(false);
    }

    public static WDBooleen enModeWindowsStoreApp() {
        return new WDBooleen(false);
    }

    public static WDBooleen enModeiOS() {
        return new WDBooleen(false);
    }

    public static void erreurDeclenche(int i, String str) {
        WDContexte a = C0677k.m2775a(f1232z[6]);
        try {
            a.m2698a(new C0543a(a, str, i));
        } finally {
            a.m2735v();
        }
    }

    public static WDChaine erreurInfo() {
        return erreurInfo(1);
    }

    public static WDChaine erreurInfo(int i) {
        WDContexte a = C0677k.m2775a(f1232z[10]);
        try {
            WDChaine wDChaine = new WDChaine(WDErreurManager.m2871a(a, i));
            return wDChaine;
        } finally {
            a.m2735v();
        }
    }

    public static void exceptionDeclenche(int i) {
        exceptionDeclenche(i, "");
    }

    public static void exceptionDeclenche(int i, String str) {
        WDContexte a = C0677k.m2775a(f1232z[11]);
        if (i < 1 || i > 1000) {
            try {
                WDErreurManager.m2883a(C0745b.m3222b(f1232z[12], C0745b.m3221b(f1232z[11]), String.valueOf(1), String.valueOf(1000)));
            } catch (WDException e) {
                throw e;
            } catch (Throwable th) {
                a.m2735v();
            }
        }
        throw new WDException(str, i);
    }

    public static WDChaine exceptionInfo() {
        return exceptionInfo(1);
    }

    public static WDChaine exceptionInfo(int i) {
        StringBuffer stringBuffer = new StringBuffer("");
        WDException lastException = WDException.getLastException();
        Object valueOf;
        String message;
        switch (i) {
            case 0:
                if (lastException != null) {
                    try {
                        valueOf = Integer.valueOf(lastException.getCode());
                    } catch (WDException e) {
                        throw e;
                    }
                }
                valueOf = "0";
                stringBuffer.append(valueOf);
                break;
            case 1:
            case 2:
                if (lastException != null) {
                    try {
                        message = lastException.getMessage();
                    } catch (WDException e2) {
                        throw e2;
                    }
                }
                message = "";
                stringBuffer.append(message);
                break;
            case 4:
                if (lastException != null) {
                    try {
                        message = lastException.getMethodName();
                    } catch (WDException e22) {
                        throw e22;
                    }
                }
                message = "";
                stringBuffer.append(message);
                break;
            case 5:
                if (lastException != null) {
                    try {
                        message = lastException.getClassName();
                    } catch (WDException e222) {
                        throw e222;
                    }
                }
                message = "";
                stringBuffer.append(message);
                break;
            case 7:
                if (lastException != null) {
                    try {
                        valueOf = Integer.valueOf(lastException.getLine());
                    } catch (WDException e2222) {
                        throw e2222;
                    }
                }
                valueOf = "0";
                stringBuffer.append(valueOf);
                break;
            case 19:
                int code;
                String fileName;
                int line;
                String str = "";
                String str2 = "";
                String str3 = "";
                message = "";
                if (lastException != null) {
                    code = lastException.getCode();
                    fileName = lastException.getFileName();
                    str = lastException.getClassName();
                    str2 = lastException.getMethodName();
                    line = lastException.getLine();
                    message = lastException.getMessage();
                } else {
                    fileName = str;
                    code = 0;
                    str = str2;
                    str2 = str3;
                    line = 0;
                }
                stringBuffer.append(f1232z[24] + C0745b.m3224c(f1232z[22], new String[0]) + f1232z[28] + code + "\n");
                stringBuffer.append(f1232z[23] + C0745b.m3224c(f1232z[21], new String[0]) + f1232z[28] + fileName + "\n");
                stringBuffer.append(f1232z[23] + C0745b.m3224c(f1232z[29], new String[0]) + "\n");
                stringBuffer.append(f1232z[23] + C0745b.m3224c(f1232z[25], new String[0]) + f1232z[28] + str + "\n");
                stringBuffer.append(f1232z[23] + C0745b.m3224c(f1232z[27], new String[0]) + f1232z[28] + str2 + "\n");
                stringBuffer.append(f1232z[23] + C0745b.m3224c(f1232z[30], new String[0]) + f1232z[28] + line + "\n");
                stringBuffer.append(f1232z[23] + C0745b.m3224c(f1232z[26], new String[0]) + f1232z[31] + message + "\n");
                break;
            default:
                stringBuffer.append("");
                break;
        }
        return new WDChaine(stringBuffer.toString());
    }

    public static fr.pcsoft.wdjava.core.WDObjet executeTraitement(fr.pcsoft.wdjava.core.C0486m r9, int r10) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Exception block dominator not found, method:fr.pcsoft.wdjava.api.WDAPIVM_Commun.executeTraitement(fr.pcsoft.wdjava.core.m, int):fr.pcsoft.wdjava.core.WDObjet. bs: [B:5:0x0012, B:10:0x001e, B:45:0x0062]
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:86)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/70807318.run(Unknown Source)
*/
        /*
        r1 = f1232z;
        r2 = 7;
        r1 = r1[r2];
        r4 = fr.pcsoft.wdjava.core.context.C0677k.m2775a(r1);
        r1 = 10;
        if (r10 == r1) goto L_0x0011;
    L_0x000d:
        r1 = 9;
        if (r10 != r1) goto L_0x001c;
    L_0x0011:
        r1 = 0;
        r1 = new fr.pcsoft.wdjava.core.WDObjet[r1];	 Catch:{ all -> 0x002e }
        r1 = executeTraitement(r9, r10, r1);	 Catch:{ all -> 0x002e }
        r4.m2735v();
    L_0x001b:
        return r1;
    L_0x001c:
        r3 = fr.pcsoft.wdjava.core.WDObjet.NULL;	 Catch:{ all -> 0x002e }
        r1 = r9 instanceof fr.pcsoft.wdjava.core.WDObjet;	 Catch:{ WDException -> 0x002c }
        if (r1 == 0) goto L_0x0033;	 Catch:{ WDException -> 0x002c }
    L_0x0022:
        r9 = (fr.pcsoft.wdjava.core.WDObjet) r9;	 Catch:{ WDException -> 0x002c }
        r2 = r9;
    L_0x0025:
        if (r2 != 0) goto L_0x0035;
    L_0x0027:
        r4.m2735v();
        r1 = r3;
        goto L_0x001b;
    L_0x002c:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x002e }
    L_0x002e:
        r1 = move-exception;
        r4.m2735v();
        throw r1;
    L_0x0033:
        r2 = 0;
        goto L_0x0025;
    L_0x0035:
        r1 = r2.isObjetAPCode();	 Catch:{ all -> 0x002e }
        if (r1 == 0) goto L_0x0051;
    L_0x003b:
        r1 = r2.isChamp();	 Catch:{ WDException -> 0x0092 }
        if (r1 != 0) goto L_0x0051;
    L_0x0041:
        r1 = r2.isColonne();	 Catch:{ WDException -> 0x0094 }
        if (r1 != 0) goto L_0x0051;	 Catch:{ WDException -> 0x0094 }
    L_0x0047:
        r1 = r2.isOptionMenu();	 Catch:{ WDException -> 0x0094 }
        if (r1 != 0) goto L_0x0051;
    L_0x004d:
        r2 = r2.getValeur();	 Catch:{ all -> 0x002e }
    L_0x0051:
        r1 = r2.isChaine();	 Catch:{ all -> 0x002e }
        if (r1 == 0) goto L_0x0079;	 Catch:{ all -> 0x002e }
    L_0x0057:
        r1 = r2.getString();	 Catch:{ all -> 0x002e }
        r5 = 4;	 Catch:{ all -> 0x002e }
        r1 = fr.pcsoft.wdjava.core.WDIndirection.get2(r1, r5);	 Catch:{ all -> 0x002e }
        if (r1 != 0) goto L_0x0098;
    L_0x0062:
        r1 = f1232z;	 Catch:{ WDException -> 0x0096 }
        r5 = 20;	 Catch:{ WDException -> 0x0096 }
        r1 = r1[r5];	 Catch:{ WDException -> 0x0096 }
        r5 = 1;	 Catch:{ WDException -> 0x0096 }
        r5 = new java.lang.String[r5];	 Catch:{ WDException -> 0x0096 }
        r6 = 0;	 Catch:{ WDException -> 0x0096 }
        r7 = r2.getString();	 Catch:{ WDException -> 0x0096 }
        r5[r6] = r7;	 Catch:{ WDException -> 0x0096 }
        r1 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r1, r5);	 Catch:{ WDException -> 0x0096 }
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2883a(r1);	 Catch:{ WDException -> 0x0096 }
    L_0x0079:
        r1 = r2.isObjetAPCode();	 Catch:{ all -> 0x002e }
        if (r1 == 0) goto L_0x00a3;	 Catch:{ all -> 0x002e }
    L_0x007f:
        r0 = r2;	 Catch:{ all -> 0x002e }
        r0 = (fr.pcsoft.wdjava.ui.C0489p) r0;	 Catch:{ all -> 0x002e }
        r1 = r0;	 Catch:{ all -> 0x002e }
        r5 = 234; // 0xea float:3.28E-43 double:1.156E-321;	 Catch:{ all -> 0x002e }
        if (r10 != r5) goto L_0x009a;	 Catch:{ all -> 0x002e }
    L_0x0087:
        r1 = 0;	 Catch:{ all -> 0x002e }
        r1 = new fr.pcsoft.wdjava.core.WDObjet[r1];	 Catch:{ all -> 0x002e }
        r1 = executeTraitement(r2, r10, r1);	 Catch:{ all -> 0x002e }
        r4.m2735v();
        goto L_0x001b;
    L_0x0092:
        r1 = move-exception;
        throw r1;	 Catch:{ WDException -> 0x0094 }
    L_0x0094:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x002e }
    L_0x0096:
        r1 = move-exception;	 Catch:{ all -> 0x002e }
        throw r1;	 Catch:{ all -> 0x002e }
    L_0x0098:
        r2 = r1;	 Catch:{ all -> 0x002e }
        goto L_0x0079;	 Catch:{ all -> 0x002e }
    L_0x009a:
        r1.appelPCode(r10);	 Catch:{ all -> 0x002e }
    L_0x009d:
        r4.m2735v();
        r1 = r3;
        goto L_0x001b;
    L_0x00a3:
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x002e }
        r1.<init>();	 Catch:{ all -> 0x002e }
        r5 = f1232z;	 Catch:{ all -> 0x002e }
        r6 = 19;	 Catch:{ all -> 0x002e }
        r5 = r5[r6];	 Catch:{ all -> 0x002e }
        r6 = 1;	 Catch:{ all -> 0x002e }
        r6 = new java.lang.String[r6];	 Catch:{ all -> 0x002e }
        r7 = 0;	 Catch:{ all -> 0x002e }
        r8 = "1";	 Catch:{ all -> 0x002e }
        r6[r7] = r8;	 Catch:{ all -> 0x002e }
        r5 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r5, r6);	 Catch:{ all -> 0x002e }
        r1 = r1.append(r5);	 Catch:{ all -> 0x002e }
        r5 = "\n";	 Catch:{ all -> 0x002e }
        r1 = r1.append(r5);	 Catch:{ all -> 0x002e }
        r5 = f1232z;	 Catch:{ all -> 0x002e }
        r6 = 18;	 Catch:{ all -> 0x002e }
        r5 = r5[r6];	 Catch:{ all -> 0x002e }
        r6 = 2;	 Catch:{ all -> 0x002e }
        r6 = new java.lang.String[r6];	 Catch:{ all -> 0x002e }
        r7 = 0;	 Catch:{ all -> 0x002e }
        r2 = r2.getNomType();	 Catch:{ all -> 0x002e }
        r6[r7] = r2;	 Catch:{ all -> 0x002e }
        r2 = 1;	 Catch:{ all -> 0x002e }
        r7 = f1232z;	 Catch:{ all -> 0x002e }
        r8 = 17;	 Catch:{ all -> 0x002e }
        r7 = r7[r8];	 Catch:{ all -> 0x002e }
        r8 = 0;	 Catch:{ all -> 0x002e }
        r8 = new java.lang.String[r8];	 Catch:{ all -> 0x002e }
        r7 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3220a(r7, r8);	 Catch:{ all -> 0x002e }
        r6[r2] = r7;	 Catch:{ all -> 0x002e }
        r2 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r5, r6);	 Catch:{ all -> 0x002e }
        r1 = r1.append(r2);	 Catch:{ all -> 0x002e }
        r1 = r1.toString();	 Catch:{ all -> 0x002e }
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2883a(r1);	 Catch:{ all -> 0x002e }
        goto L_0x009d;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.api.WDAPIVM_Commun.executeTraitement(fr.pcsoft.wdjava.core.m, int):fr.pcsoft.wdjava.core.WDObjet");
    }

    public static fr.pcsoft.wdjava.core.WDObjet executeTraitement(fr.pcsoft.wdjava.core.C0486m r3, int r4, fr.pcsoft.wdjava.core.WDObjet[] r5) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Exception block dominator not found, method:fr.pcsoft.wdjava.api.WDAPIVM_Commun.executeTraitement(fr.pcsoft.wdjava.core.m, int, fr.pcsoft.wdjava.core.WDObjet[]):fr.pcsoft.wdjava.core.WDObjet. bs: [B:4:0x0011, B:10:0x001d, B:16:0x002e]
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:86)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/70807318.run(Unknown Source)
*/
        /*
        r0 = f1232z;
        r1 = 7;
        r0 = r0[r1];
        r1 = fr.pcsoft.wdjava.core.context.C0677k.m2775a(r0);
        r0 = 10;
        if (r4 == r0) goto L_0x0011;
    L_0x000d:
        r0 = 9;
        if (r4 != r0) goto L_0x0019;
    L_0x0011:
        r0 = fr.pcsoft.wdjava.core.WDCallback.m2252a(r3, r5);	 Catch:{ all -> 0x003b }
        r1.m2735v();
    L_0x0018:
        return r0;
    L_0x0019:
        r0 = 234; // 0xea float:3.28E-43 double:1.156E-321;
        if (r4 != r0) goto L_0x0044;
    L_0x001d:
        r0 = r3 instanceof fr.pcsoft.wdjava.core.WDObjet;	 Catch:{ WDException -> 0x0039 }
        if (r0 == 0) goto L_0x0040;	 Catch:{ WDException -> 0x0039 }
    L_0x0021:
        r3 = (fr.pcsoft.wdjava.core.WDObjet) r3;	 Catch:{ WDException -> 0x0039 }
        r0 = fr.pcsoft.wdjava.ui.champs.nb.class;	 Catch:{ WDException -> 0x0039 }
        r0 = r3.checkType(r0);	 Catch:{ WDException -> 0x0039 }
        r0 = (fr.pcsoft.wdjava.ui.champs.nb) r0;	 Catch:{ WDException -> 0x0039 }
    L_0x002b:
        if (r0 == 0) goto L_0x0033;
    L_0x002d:
        r2 = 0;
        r2 = new fr.pcsoft.wdjava.core.WDObjet[r2];	 Catch:{ WDException -> 0x0042 }
        r0.updateUI_WL(r2);	 Catch:{ WDException -> 0x0042 }
    L_0x0033:
        r0 = fr.pcsoft.wdjava.core.WDObjet.NULL;	 Catch:{ all -> 0x003b }
        r1.m2735v();
        goto L_0x0018;
    L_0x0039:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x003b }
    L_0x003b:
        r0 = move-exception;
        r1.m2735v();
        throw r0;
    L_0x0040:
        r0 = 0;
        goto L_0x002b;
    L_0x0042:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x003b }
    L_0x0044:
        r0 = executeTraitement(r3, r4);	 Catch:{ all -> 0x003b }
        r1.m2735v();
        goto L_0x0018;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.api.WDAPIVM_Commun.executeTraitement(fr.pcsoft.wdjava.core.m, int, fr.pcsoft.wdjava.core.WDObjet[]):fr.pcsoft.wdjava.core.WDObjet");
    }

    public static void finProgramme() {
        finProgramme(null);
    }

    public static void finProgramme(boolean z) {
        finProgramme(new WDObjet[]{new WDBooleen(z)});
    }

    public static void finProgramme(WDObjet[] wDObjetArr) {
        int i = 0;
        WDContexte a = C0677k.m2775a(f1232z[15]);
        try {
            boolean z;
            String str = "";
            if (wDObjetArr != null) {
                if (wDObjetArr.length > 0) {
                    int i2;
                    int length = wDObjetArr.length;
                    if (wDObjetArr[wDObjetArr.length - 1].isBooleen()) {
                        int i3 = length - 1;
                        z = wDObjetArr[wDObjetArr.length - 1].getBoolean();
                        i2 = i3;
                    } else {
                        i2 = length;
                        z = false;
                    }
                    if (i2 > 0) {
                        String[] strArr = new String[i2];
                        while (i < i2) {
                            strArr[i] = wDObjetArr[i].getString();
                            i++;
                        }
                        str = C0808l.m4024a(strArr, "\n");
                    }
                    if (str != null) {
                        if (!str.equals("")) {
                            C1372f.m9828a().m9832a(1, str, null, 0);
                        }
                    }
                    if (z) {
                        WDProjet.getInstance().terminerApplication();
                    } else {
                        WDProjet.getInstance().fermerProjet();
                    }
                    a.m2735v();
                }
            }
            z = false;
            if (str != null) {
                if (str.equals("")) {
                    C1372f.m9828a().m9832a(1, str, null, 0);
                }
            }
            if (z) {
                WDProjet.getInstance().terminerApplication();
            } else {
                WDProjet.getInstance().fermerProjet();
            }
            a.m2735v();
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        } catch (WDException e22) {
            throw e22;
        } catch (WDException e222) {
            throw e222;
        } catch (Throwable th) {
            a.m2735v();
        }
    }

    public static final WDEntier4 langueVersAlphabet(int i) {
        return langueVersAlphabet(i, 0);
    }

    public static final WDEntier4 langueVersAlphabet(int i, int i2) {
        return new WDEntier4(ec.m3874b(i));
    }

    public static WDEntier4 langueVersNation(int i) {
        return langueVersNation(i, 0);
    }

    public static WDEntier4 langueVersNation(int i, int i2) {
        return new WDEntier4(ec.m3879c(i, i2));
    }

    public static WDChaine langueVersNom(int i) {
        return langueVersNom(i, 0);
    }

    public static WDChaine langueVersNom(int i, int i2) {
        return new WDChaine(ec.m3876b(i, i2));
    }

    public static void multitache(WDObjet wDObjet) {
        C1515p.m10542a(C0725i.m3013a(wDObjet, C0782g.CENTISECOND));
    }

    public static WDEntier4 nation() {
        WDContexte a = C0677k.m2775a(f1232z[3]);
        try {
            WDEntier4 wDEntier4 = new WDEntier4(WDProjet.getInstance().getLangueCourante());
            return wDEntier4;
        } finally {
            a.m2735v();
        }
    }

    public static void nation(int i) {
        WDContexte a = C0677k.m2775a(f1232z[3]);
        try {
            WDProjet.getInstance().setLangueCourante(i);
        } finally {
            a.m2735v();
        }
    }

    public static WDEntier4 nationVersLangue(int i) {
        return new WDEntier4(ec.m3880d(i));
    }

    public static WDChaine nationVersNom(int i) {
        return new WDChaine(ec.m3876b(ec.m3880d(i), ec.m3868a(i)));
    }

    public static WDObjet nationVersSousLangue(int i) {
        return new WDEntier4(ec.m3868a(i));
    }

    public static WDChaine projetInfo() {
        return projetInfo(0);
    }

    public static WDChaine projetInfo(int i) {
        String str = "";
        if (i == 0) {
            str = WDProjet.getInstance().getNom();
        } else if (i == 2) {
            str = WDProjet.getInstance().getNomConfiguration();
        }
        return new WDChaine(str);
    }

    public static final WDObjet proprieteExiste(WDObjet wDObjet, String str) {
        return new WDBooleen(wDObjet.hasProperty(str));
    }

    public static final WDObjet sysNation() {
        return new WDEntier4(ec.m3875b(Locale.getDefault()));
    }

    public static WDEntier4 typeVar(WDObjet wDObjet) {
        return new WDEntier4(wDObjet.getTypeVar());
    }

    public static WDEntier4 typeVariable(WDObjet wDObjet) {
        WDObjet valeur = wDObjet.getValeur();
        try {
            if (!valeur.isChaine()) {
                if (!valeur.isVarTemps()) {
                    try {
                        if (valeur.isEntier()) {
                            return new WDEntier4(1);
                        }
                        try {
                            if (valeur.isReel()) {
                                return new WDEntier4(8);
                            }
                            try {
                                if (valeur.isBooleen()) {
                                    return new WDEntier4(17);
                                }
                                try {
                                    return valeur instanceof WDMonetaire ? new WDEntier4(18) : new WDEntier4(0);
                                } catch (WDException e) {
                                    throw e;
                                }
                            } catch (WDException e2) {
                                throw e2;
                            }
                        } catch (WDException e22) {
                            throw e22;
                        }
                    } catch (WDException e222) {
                        throw e222;
                    }
                }
            }
            return new WDEntier4(12);
        } catch (WDException e2222) {
            throw e2222;
        } catch (WDException e22222) {
            throw e22222;
        }
    }

    public static void variableRAZ(WDObjet wDObjet) {
        wDObjet.razVariable();
    }

    public static WDChaine versionWindev() {
        return new WDChaine(C0693b.m2867a());
    }

    /* renamed from: z */
    private static String m1680z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 48;
                    break;
                case 1:
                    i2 = 2;
                    break;
                case 2:
                    i2 = 87;
                    break;
                case 3:
                    i2 = 47;
                    break;
                default:
                    i2 = 105;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1681z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 105);
        }
        return toCharArray;
    }
}
