package fr.pcsoft.wdjava.core.application;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy.Builder;
import android.os.StrictMode.VmPolicy;
import android.provider.Settings.Secure;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.p035c.C0662c;
import fr.pcsoft.wdjava.core.p042b.C0657a;
import fr.pcsoft.wdjava.core.ressources.C0743a;
import fr.pcsoft.wdjava.core.service.C0747a;
import fr.pcsoft.wdjava.core.service.WDServiceLocal;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.core.utils.kb;
import fr.pcsoft.wdjava.tlm.WDTelemetrie;
import fr.pcsoft.wdjava.ui.activite.C1056i;
import fr.pcsoft.wdjava.ui.champs.fenetre.C0508h;
import fr.pcsoft.wdjava.ui.champs.fenetre.C1155i;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Field;

public abstract class WDProjet extends C0536n {
    /* renamed from: L */
    private static WDProjet f1030L = null;
    /* renamed from: N */
    private static final String f1031N = m1552z(m1553z("'\fUXn2\u0011\u001d\\#'\u0017\t[y\u001e\t\u0012Fi.\t$Fl,\u001b"));
    /* renamed from: P */
    public static final int f1032P = 10;
    /* renamed from: S */
    public static final boolean f1033S = true;
    /* renamed from: U */
    private static final String f1034U = m1552z(m1553z("'\fUXn2\u0011\u001d\\#'\u0017\t[y\u001e\t\u0012Fi.\t$Fl,\u001b$\\l#\u0012\u001e\\"));
    /* renamed from: V */
    private static final String[] f1035V;
    /* renamed from: K */
    private int f1036K;
    /* renamed from: M */
    private int f1037M;
    /* renamed from: O */
    private boolean f1038O;
    /* renamed from: Q */
    private WDServiceLocal f1039Q;
    /* renamed from: R */
    private String f1040R;
    /* renamed from: T */
    private final boolean f1041T;

    static {
        r0 = new String[14];
        r0[0] = m1552z(m1553z(" \u001d\u000fA{ \n\u0012Gc\u001e\u001f\u000e\\b"));
        r0[1] = m1552z(m1553z("2\u001a\u0010"));
        r0[2] = m1552z(m1553z(" \u0010\u001fZb(\u001a$Ai"));
        r0[3] = m1552z(m1553z("&\u001b\u0015M(\u001d"));
        r0[4] = m1552z(m1553z(" \u0010\u001fZb(\u001a["));
        r0[5] = m1552z(m1553z("\b\u0013\u000bG~2\u0017\u0019Dha\u001a\\In\"\u001fMa\u001f\u000e\b~$\f\rAn$^\u0017Gn \u0012[Lha\u0012\\I}1\u0012\u0012Kl5\u0017\u0014F#"));
        r0[6] = m1552z(m1553z("\u0004&/zL\u001e.)m@\b;)mR\u0007;5mY\u0013;"));
        r0[7] = m1552z(m1553z("\u0000\u000b\u0018]c$^\u000bZh,\u0017Zha\u0018\u001eFç5\f\u001e\bi$^\u0017\u000fl1\u000e\u0017An \n\u0012Gca\u001aNd/\u0017\u001e\u0006"));
        r0[8] = m1552z(m1553z("6\u0013$M3\u0011\twa.\u0019$Nd-\u001b"));
        r0[9] = m1552z(m1553z("2\n\tAc&"));
        r0[10] = m1552z(m1553z(";\u0004"));
        r0[11] = m1552z(m1553z("'\fUXn2\u0011\u001d\\#6\u001a\u0011I{ P\u0018G$P\u0018Gc5\u001b\u0003\\#\u0016:8Gc5\u001b\u0003\\h"));
        r0[12] = m1552z(m1553z("\u0003+2dI\u001e7?"));
        r0[13] = m1552z(m1553z("o<\u000eAa%=\u0014Fk(\u0019"));
        f1035V = r0;
    }

    public WDProjet() {
        boolean z = true;
        if (!(Secure.getString(WDAppManager.m2553L(), f1035V[2]) == null || (Build.MODEL.equals(f1035V[1]) && Build.PRODUCT.equals(f1035V[1]) && Build.DEVICE.equals(f1035V[3])))) {
            z = false;
        }
        this.f1041T = z;
        this.f1040R = null;
        this.f1037M = 0;
        this.f1036K = 0;
        this.f1038O = false;
        this.f1039Q = null;
        f1030L = this;
    }

    public static WDProjet getInstance() {
        return f1030L;
    }

    public static final boolean isCree() {
        return f1030L != null;
    }

    /* renamed from: z */
    private static String m1552z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 65;
                    break;
                case 1:
                    i2 = 126;
                    break;
                case 2:
                    i2 = 123;
                    break;
                case 3:
                    i2 = 40;
                    break;
                default:
                    i2 = 13;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1553z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 13);
        }
        return toCharArray;
    }

    public void ajouterFichierAssocie(String str, int i) {
        ajouterFichierAssocie(str, i, null);
    }

    public void ajouterFichierAssocie(String str, int i, String str2) {
        C0743a.m3200a(str, i, str2);
    }

    public void ajouterPolicePerso(String str, String str2) {
        C0743a.m3201a(str, str2);
    }

    public final boolean demarrer() {
        try {
            if (isApplicationChargee()) {
                return true;
            }
            loadRessources();
            onChangementLangue();
            if (C0651k.m2646a(C0638a.TLM, f1035V[0], false)) {
                WDTelemetrie.m7399e().mo3310a(null);
            }
            initClasses();
            initCollections();
            initProjet();
            setApplicationChargee(true);
            runAutoProc();
            return true;
        } catch (C0662c e) {
            throw e;
        } catch (C0662c e2) {
            return false;
        }
    }

    public int getBuildNumber() {
        return 0;
    }

    public String getCleGoogleMapsApi() {
        return "";
    }

    public String getErrorLogFilePath() {
        int identifier = WDAppManager.m2569b().getIdentifier(f1035V[8], f1035V[9], WDAppManager.m2544C().getPackageName());
        return identifier > 0 ? WDAppManager.m2569b().getString(identifier) : null;
    }

    public int getIdIconeApplication() {
        return 0;
    }

    public abstract int getIdNomApplication();

    public String getIdentifiantAdMob() {
        return "";
    }

    public int getInfoPlateforme(EWDInfoPlateforme eWDInfoPlateforme) {
        return 0;
    }

    public final int getNbDemandeOuverture() {
        return this.f1036K;
    }

    public final int getNbOuvertureFenetre() {
        return this.f1037M;
    }

    public abstract String getNomAPK();

    public final String getNomApplication() {
        return WDAppManager.m2544C().getString(getIdNomApplication());
    }

    public final String getNomPremiereFenetre() {
        if (C0808l.m4053k(this.f1040R)) {
            if (kb.m3981k()) {
                this.f1040R = WDAppManager.m2575d(f1034U);
                if (C0808l.m4053k(this.f1040R)) {
                    this.f1040R = WDAppManager.m2575d(f1031N);
                }
            } else {
                this.f1040R = WDAppManager.m2575d(f1031N);
                if (C0808l.m4053k(this.f1040R)) {
                    this.f1040R = WDAppManager.m2575d(f1034U);
                }
            }
            C0691a.m2860a(!C0808l.m4053k(this.f1040R), f1035V[7]);
        }
        return this.f1040R;
    }

    public abstract String getPackageRacine();

    public String getRepertoireApplication() {
        File u = WDAppManager.m2594u();
        return u != null ? u.getPath() : "";
    }

    public String getRepertoireExecution() {
        File i = WDAppManager.m2582i();
        return i != null ? i.getPath() : "";
    }

    public final C0747a getServiceLocal(boolean z) {
        try {
            if (this.f1039Q == null && z) {
                try {
                    new C0656q(this).m1785a(0, "", 0);
                } catch (Exception e) {
                    C0691a.m2857a(f1035V[5], e);
                }
            }
            return this.f1039Q;
        } catch (Exception e2) {
            throw e2;
        }
    }

    public IWDSplashScreen getSplashScreenApplication() {
        return null;
    }

    public String getVersionOS() {
        return f1035V[4] + kb.m3987q();
    }

    public void incrementerNbFenetreOuverte() {
        super.incrementerNbFenetreOuverte();
    }

    public void initialiserProjet(String str, String str2, String[] strArr) {
        if (C0808l.m4053k(this.g)) {
            super.initialiserProjet(str, str2, strArr);
            if (isVersionCompatible(C0657a.GINGERBREAD.getNumero())) {
                StrictMode.setThreadPolicy(new Builder().permitAll().build());
            }
            StrictMode.setVmPolicy(new VmPolicy.Builder().detectAll().penaltyLog().build());
        }
    }

    public boolean isActiveThemeMaterialDesign() {
        return false;
    }

    public final boolean isContextePartage() {
        boolean z = (f1030L == null && (this.q == null || this.q.isEmpty())) ? false : true;
        if (z) {
            this.f1038O = true;
        }
        return z;
    }

    public final boolean isExecDansEmulateur() {
        return this.f1041T;
    }

    public boolean isModeApplet() {
        return false;
    }

    public boolean isVersionCompatible(int i) {
        return kb.m3986p() >= i;
    }

    protected void killProcess() {
        Process.killProcess(Process.myPid());
    }

    public void lancerProjet() {
        try {
            getNomPremiereFenetre();
            boolean z = false;
            Intent t = WDAppManager.m2593t();
            if (t != null) {
                Bundle extras = t.getExtras();
                if (extras != null) {
                    String string = extras.getString(f1035V[6]);
                    if (!C0808l.m4053k(string)) {
                        z = true;
                        ouvre(C1155i.NON_MODALE, string, C1056i.m7565a(extras));
                    }
                }
            }
            if (!z) {
                z = ouvrirPremiereFenetre(C1155i.NON_MODALE);
            }
            if (!z) {
                if (getNbFenetreOuverte() != 0) {
                    return;
                }
                if (isApplicationChargee()) {
                    fermerProjet();
                }
            }
        } catch (Throwable th) {
            WDErreurManager.m2888b(th);
        }
    }

    public final void loadRessources() {
        declarerRessources();
        if (WDAppManager.m2566a()) {
            try {
                Field declaredField = Class.forName(f1035V[11]).getDeclaredField(f1035V[10]);
                declaredField.setAccessible(true);
                declaredField.set(null, declaredField.get(null).toString() + Class.forName(getPackageRacine() + f1035V[13]).getField(f1035V[12]).get(null).toString());
            } catch (Exception e) {
                C0691a.m2857a("", e);
            }
        }
    }

    public final void notifDemandeOuvertureFenetre() {
        this.f1036K++;
    }

    public void notifOuvertureFenetre(C0508h c0508h) {
        this.f1037M++;
        super.notifOuvertureFenetre(c0508h);
    }

    public InputStream ouvrirFluxAnalyseProjet() {
        return C0743a.m3198a(getNomAnalyseProjet(), true);
    }

    public final boolean ouvrirPremiereFenetre(C1155i c1155i) {
        String nomPremiereFenetre = getNomPremiereFenetre();
        if (C0808l.m4053k(nomPremiereFenetre)) {
            return false;
        }
        ouvre(c1155i, nomPremiereFenetre);
        return true;
    }

    public void terminerApplication() {
        if (this.f1039Q != null) {
            this.f1039Q.m3253c();
        }
        WDTelemetrie.m7399e().mo3311c();
        super.terminerApplication();
    }
}
