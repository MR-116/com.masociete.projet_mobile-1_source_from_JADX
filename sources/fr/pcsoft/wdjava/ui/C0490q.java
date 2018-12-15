package fr.pcsoft.wdjava.ui;

import fr.pcsoft.wdjava.core.C0505p;
import fr.pcsoft.wdjava.core.C0506k;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.WDCallback;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.context.WDAppelContexte;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.jni.WDJNIException;
import fr.pcsoft.wdjava.p055g.C0907e;
import fr.pcsoft.wdjava.tlm.C1028a;
import fr.pcsoft.wdjava.tlm.C1029b;
import fr.pcsoft.wdjava.tlm.WDTelemetrie;
import fr.pcsoft.wdjava.ui.champs.WDGroupe;
import fr.pcsoft.wdjava.ui.champs.fenetre.C0508h;
import fr.pcsoft.wdjava.ui.champs.fenetre.C0509v;
import fr.pcsoft.wdjava.ui.champs.fenetre.WDFenetre;
import fr.pcsoft.wdjava.ui.champs.fenetreinterne.fb;
import fr.pcsoft.wdjava.ui.champs.zr.bb;
import fr.pcsoft.wdjava.ui.utils.C1515p;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: fr.pcsoft.wdjava.ui.q */
public abstract class C0490q extends C0489p {
    /* renamed from: h */
    protected static long f810h = 0;
    /* renamed from: j */
    protected static final int f811j = 10;
    /* renamed from: z */
    private static final String[] f812z = new String[]{C0490q.m1300z(C0490q.m1301z("H!Bg")), C0490q.m1300z(C0490q.m1301z("H?_e\n9&H~\u001f4#Hi\u000e>=Hu\t.:Ao")), C0490q.m1300z(C0490q.m1301z(".\u001dO/\u0019Oi_(\n\u0001y\n6L\ncX?\f\u0006~^(\u000e\u0002hD.K\u000bh\n6\nOi_(\n-N}\u000e\u0017äI/\u001f\u0006bDz\u000f\u001a-Z9\u0004\u000bh\u0004")), C0490q.m1300z(C0490q.m1301z("'HbH0\u000e\u001b-D}\nO}K)K\u000bh\n\u000b>&I\u0004")), C0490q.m1300z(C0490q.m1301z("H?_e\n9&H~\u001f4&Co\u0002\"<Yk\u0014?*Ry\u000f90Nb\u001b&?"))};
    /* renamed from: d */
    protected int f813d = 0;
    /* renamed from: e */
    protected boolean f814e = false;
    /* renamed from: f */
    protected fb f815f = null;
    /* renamed from: g */
    protected LinkedList<WDGroupe> f816g;
    /* renamed from: i */
    private C0907e f817i = null;
    /* renamed from: k */
    protected String f818k = "";
    /* renamed from: l */
    protected C0508h f819l;

    /* renamed from: z */
    private static String m1300z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 107;
                    break;
                case 1:
                    i2 = 111;
                    break;
                case 2:
                    i2 = 13;
                    break;
                case 3:
                    i2 = 42;
                    break;
                default:
                    i2 = 90;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1301z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 90);
        }
        return toCharArray;
    }

    public void activerEcouteurModification() {
    }

    public void activerEcouteurSelection() {
    }

    public void affectationProprieteValeur() {
        initialiserAction();
    }

    public void affichageLigne() {
        initialiserAction();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public fr.pcsoft.wdjava.core.WDObjet appelPCode(int r7) {
        /*
        r6 = this;
        r1 = 0;
        r0 = fr.pcsoft.wdjava.core.context.WDAppelContexte.getContexte();
        r2 = r6.isReleased();	 Catch:{ Throwable -> 0x0013 }
        if (r2 != 0) goto L_0x0011;
    L_0x000b:
        r2 = r0.m2733t();	 Catch:{ Throwable -> 0x0015 }
        if (r2 != 0) goto L_0x0017;
    L_0x0011:
        r0 = r1;
    L_0x0012:
        return r0;
    L_0x0013:
        r0 = move-exception;
        throw r0;	 Catch:{ Throwable -> 0x0015 }
    L_0x0015:
        r0 = move-exception;
        throw r0;
    L_0x0017:
        r2 = f810h;
        r4 = 1;
        r2 = r2 + r4;
        f810h = r2;
        r0.m2715c(r7, r6);
        r0 = fr.pcsoft.wdjava.ui.utils.C1504c.m10458b();	 Catch:{ all -> 0x0048 }
        if (r0 != 0) goto L_0x0027;
    L_0x0027:
        r0 = r6.executerPCode(r7);	 Catch:{ Throwable -> 0x0033 }
        r1 = fr.pcsoft.wdjava.core.context.WDAppelContexte.getContexte();
        r1.m2736x();
        goto L_0x0012;
    L_0x0033:
        r0 = move-exception;
        r2 = r0 instanceof fr.pcsoft.wdjava.core.p035c.C0660a;	 Catch:{ Throwable -> 0x0051 }
        if (r2 == 0) goto L_0x0057;
    L_0x0038:
        r2 = 2;
        if (r7 == r2) goto L_0x003f;
    L_0x003b:
        r2 = 1138; // 0x472 float:1.595E-42 double:5.62E-321;
        if (r7 != r2) goto L_0x0057;
    L_0x003f:
        r2 = r6 instanceof fr.pcsoft.wdjava.ui.champs.fenetre.C0508h;	 Catch:{ Throwable -> 0x0046 }
        if (r2 == 0) goto L_0x0057;
    L_0x0043:
        r0 = (fr.pcsoft.wdjava.core.p035c.C0660a) r0;	 Catch:{ Throwable -> 0x0046 }
        throw r0;	 Catch:{ Throwable -> 0x0046 }
    L_0x0046:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0048 }
    L_0x0048:
        r0 = move-exception;
        r1 = fr.pcsoft.wdjava.core.context.WDAppelContexte.getContexte();
        r1.m2736x();
        throw r0;
    L_0x0051:
        r0 = move-exception;
        throw r0;	 Catch:{ Throwable -> 0x0053 }
    L_0x0053:
        r0 = move-exception;
        throw r0;	 Catch:{ Throwable -> 0x0055 }
    L_0x0055:
        r0 = move-exception;
        throw r0;	 Catch:{ Throwable -> 0x0046 }
    L_0x0057:
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2888b(r0);	 Catch:{ all -> 0x0048 }
        r0 = fr.pcsoft.wdjava.core.context.WDAppelContexte.getContexte();
        r0.m2736x();
        r0 = r1;
        goto L_0x0012;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.ui.q.appelPCode(int):fr.pcsoft.wdjava.core.WDObjet");
    }

    protected final WDObjet appelPCodeAvecParametres(int i, WDCallback wDCallback, WDObjet... wDObjetArr) {
        WDAppelContexte.getContexte().m2715c(i, this);
        try {
            WDObjet execute = wDCallback.execute(wDObjetArr);
            return execute;
        } finally {
            WDAppelContexte.getContexte().m2736x();
        }
    }

    public WDObjet appelPCode_TLM(int i, int i2) {
        try {
            if (!WDTelemetrie.m7399e().mo3313h()) {
                return appelPCode(i);
            }
            C1028a c1028a = new C1028a();
            C1029b monitor = ((WDFenetre) getFenetreMere()).getMonitor();
            c1028a.mo3307a(monitor);
            WDObjet appelPCode = appelPCode(i);
            long d = c1028a.m7429d();
            try {
                if (d >= ((long) WDTelemetrie.m7399e().mo3312g()) && monitor != null) {
                    String fullName = getFullName(true);
                    try {
                        long e = this.f817i != null ? this.f817i.m6431e() : 0;
                        C0691a.m2860a(e != 0, f812z[3]);
                        if (i2 > 0) {
                            try {
                                WDTelemetrie.m7399e().m7415b(monitor.m7441i(), this.b, e, fullName, i2, d);
                            } catch (Exception e2) {
                                C0691a.m2857a(f812z[2], e2);
                            }
                        }
                        WDTelemetrie.m7399e().m7406a(monitor.m7441i(), this.b, e, fullName, i, d);
                    } catch (WDJNIException e3) {
                        throw e3;
                    }
                }
                c1028a.mo3309f();
                return appelPCode;
            } catch (WDJNIException e32) {
                throw e32;
            }
        } catch (WDJNIException e322) {
            throw e322;
        }
    }

    protected void appuiLong() {
        initialiserAction();
    }

    public void appuiSurBoutonDroit() {
        initialiserAction();
    }

    public void appuiSurBoutonGauche() {
        initialiserAction();
    }

    public void appuiSurBoutonMilieu() {
        initialiserAction();
    }

    public void buildFullName(StringBuilder stringBuilder, boolean z) {
        WDObjet wDObjet = (WDObjet) getPere();
        while (wDObjet != null) {
            if (wDObjet.checkType(C0505p.class) != null || wDObjet.checkType(bb.class) != null) {
                ((C0489p) wDObjet).buildFullName(stringBuilder, z);
                break;
            }
            wDObjet = (WDObjet) ((C0489p) wDObjet).getPere();
        }
        super.buildFullName(stringBuilder, z);
    }

    public void changementTaille() {
        initialiserAction();
    }

    public void changementTailleFenetre() {
        initialiserAction();
    }

    public void clicSurBoutonDroit() {
        initialiserAction();
    }

    public void clicSurBoutonGauche() {
        initialiserAction();
    }

    public void decrementationSpin() {
        initialiserAction();
    }

    public void deplacement() {
        initialiserAction();
    }

    public void destroy() {
        if (this.f816g != null) {
            Iterator it = this.f816g.iterator();
            while (it.hasNext()) {
                ((WDGroupe) it.next()).removeObjetAPCode(this);
            }
        }
        super.destroy();
    }

    public void doubleClicSurBoutonDroit() {
        initialiserAction();
    }

    public void doubleClicSurBoutonGauche() {
        initialiserAction();
    }

    public void enrouleDeroule() {
        initialiserAction();
    }

    public void entreeChamp() {
        initialiserAction();
    }

    public void entreeSaisieLigne() {
        initialiserAction();
    }

    protected WDObjet executerPCode(int i) {
        switch (i) {
            case 2:
                fermetureFenetre();
                break;
            case 3:
                deplacement();
                break;
            case 5:
                changementTaille();
                break;
            case 11:
                priseDeFocus();
                break;
            case 12:
                if (!isFenetre()) {
                    C0509v c0509v = (C0509v) getFenetreMere();
                    if (c0509v != null) {
                        c0509v.setChampPrecedent(getName());
                    }
                    perteDeFocus();
                    break;
                }
                boolean z = C1515p.f4650a;
                C1515p.f4650a = false;
                try {
                    perteDeFocus();
                    break;
                } finally {
                    C1515p.f4650a = z;
                }
            case 13:
                changementTailleFenetre();
                break;
            case 14:
            case 34:
                init();
                break;
            case 15:
                entreeChamp();
                break;
            case 16:
                sortieChamp();
                break;
            case 17:
                modification();
                break;
            case 18:
                clicSurBoutonGauche();
                break;
            case 19:
                entreeSaisieLigne();
                break;
            case 20:
                sortieSaisieLigne();
                break;
            case 21:
                affichageLigne();
                break;
            case 26:
                incrementationSpin();
                break;
            case 27:
                decrementationSpin();
                break;
            case 30:
                clicSurBoutonDroit();
                break;
            case 31:
                doubleClicSurBoutonGauche();
                break;
            case 32:
                selectionOptionMenu();
                break;
            case 33:
                selectionLigne();
                break;
            case 35:
                finInit();
                break;
            case 36:
                enrouleDeroule();
                break;
            case 116:
                ouverturePopup();
                break;
            case 117:
                fermeturePopup();
                break;
            case C0607n.ex /*1101*/:
                doubleClicSurBoutonDroit();
                break;
            case C0607n.Do /*1102*/:
                appuiSurBoutonGauche();
                break;
            case C0607n.vo /*1103*/:
                appuiSurBoutonMilieu();
                break;
            case C0607n.mo /*1104*/:
                appuiSurBoutonDroit();
                break;
            case C0607n.zx /*1105*/:
                relacheBoutonGauche();
                break;
            case C0607n.ie /*1106*/:
                relacheBoutonMilieu();
                break;
            case C0607n.ms /*1107*/:
                relacheBoutonDroit();
                break;
            case 1108:
                toucheEnfoncee();
                break;
            case C0607n.ik /*1109*/:
                toucheRelachee();
                break;
            case C0607n.Jp /*1110*/:
                toucheAppuyee();
                break;
            case 1111:
                survolSouris();
                break;
            case C0607n.rv /*1112*/:
                rouletteSouris();
                break;
            case C0607n.Bt /*1114*/:
                affectationProprieteValeur();
                break;
            case C0607n.Tf /*1115*/:
                recuperationProprieteValeur();
                break;
            case C0607n.Xu /*1118*/:
                postInit();
                break;
            case C0607n.ip /*1122*/:
                appuiLong();
                break;
        }
        return null;
    }

    public void fermetureFenetre() {
        initialiserAction();
    }

    public void fermeturePopup() {
        initialiserAction();
    }

    public void finExecProcLocale() {
        WDAppelContexte.getContexte().m2736x();
    }

    public void finInit() {
        initialiserAction();
    }

    public void focusObtenu() {
    }

    public String getChecksum() {
        return this.f817i != null ? this.f817i.m6427b() : "0";
    }

    public fb getFenetreInterne() {
        return this.f815f;
    }

    public final <T extends C0508h> T getFenetreMere() {
        return this.f819l;
    }

    public WDChaine getGroupe() {
        if (!isGroupable()) {
            return super.getGroupe();
        }
        if (this.f816g == null) {
            return new WDChaine("");
        }
        StringBuilder stringBuilder = new StringBuilder();
        Iterator it = this.f816g.iterator();
        while (it.hasNext()) {
            WDGroupe wDGroupe = (WDGroupe) it.next();
            if (stringBuilder.length() > 0) {
                stringBuilder.append(',');
            }
            stringBuilder.append(wDGroupe.getName());
        }
        return new WDChaine(stringBuilder.toString());
    }

    public String getMessageMauvaisePropriete(String str) {
        return C0745b.m3222b(f812z[4], str, getNom().getString(), getNomType());
    }

    public String getName() {
        return this.f818k;
    }

    public String getNomNoeudPersistance() {
        return this.f817i != null ? this.f817i.m6423a() : "";
    }

    public long getQUID() {
        return this.f817i != null ? this.f817i.m6431e() : 0;
    }

    public int getTypeSupportPersistance() {
        return this.f817i != null ? this.f817i.m6430d() : 0;
    }

    public void incrementationSpin() {
        initialiserAction();
    }

    public void init() {
        initialiserAction();
    }

    public void initExecProcLocale(String str) {
        C0489p o;
        if (isFenetre()) {
            o = WDAppelContexte.getContexte().m2728o();
            if (!(o == null || o.getFenetreMere() != this || o.isFenetre())) {
                WDAppelContexte.getContexte().m2702a(str, o);
                return;
            }
        } else if (this instanceof C0506k) {
            o = WDAppelContexte.getContexte().m2728o();
            if (o != null && isPere(o)) {
                WDAppelContexte.getContexte().m2702a(str, o);
                return;
            }
        }
        WDAppelContexte.getContexte().m2702a(str, (C0489p) this);
    }

    public void initialiserAction() {
    }

    public boolean isFenetreCree() {
        C0508h fenetreMere;
        if (this.f815f != null) {
            fenetreMere = ((C0490q) this.f815f).getFenetreMere();
            if (fenetreMere == null) {
                fenetreMere = this.f815f.getChampFenetreInterne() != null ? this.f815f.getChampFenetreInterne().getFenetreMere() : null;
            }
        } else {
            fenetreMere = getFenetreMere();
        }
        return fenetreMere != null && fenetreMere.isFenetreCree();
    }

    public boolean isFenetreCreeExt() {
        C0508h fenetreMere;
        if (this.f815f != null) {
            C0489p champFenetreInterne = this.f815f.getChampFenetreInterne();
            fenetreMere = champFenetreInterne != null ? champFenetreInterne.getFenetreMere() : null;
        } else {
            fenetreMere = getFenetreMere();
        }
        return fenetreMere != null && ((WDFenetre) fenetreMere).isFenetreCreeExt();
    }

    protected abstract boolean isGroupable();

    public boolean isPersistant() {
        return false;
    }

    public void majOrdreNavigation(C0508h c0508h) {
    }

    public void modification() {
        initialiserAction();
    }

    public void ouverturePopup() {
        initialiserAction();
    }

    public void perteDeFocus() {
        initialiserAction();
    }

    protected void postInit() {
    }

    public void priseDeFocus() {
        initialiserAction();
        focusObtenu();
    }

    public void recuperationProprieteValeur() {
        initialiserAction();
    }

    public void relacheBoutonDroit() {
        initialiserAction();
    }

    public void relacheBoutonGauche() {
        initialiserAction();
    }

    public void relacheBoutonMilieu() {
        initialiserAction();
    }

    public void release() {
        super.release();
        this.f819l = null;
        this.f815f = null;
        if (this.f816g != null) {
            this.f816g.clear();
            this.f816g = null;
        }
        if (this.f817i != null) {
            this.f817i.m6429c();
            this.f817i = null;
        }
    }

    public boolean restaurerValeur() {
        return false;
    }

    public void rouletteSouris() {
        initialiserAction();
    }

    public void sauverValeur() {
    }

    public void selectionLigne() {
        initialiserAction();
    }

    public void selectionOptionMenu() {
        initialiserAction();
    }

    protected void setChecksum(String str) {
        if (this.f817i == null) {
            this.f817i = new C0907e();
        }
        this.f817i.m6428b(str);
    }

    public void setFenetre(C0508h c0508h) {
        this.f819l = c0508h;
    }

    public void setFenetreInterne(fb fbVar) {
        this.f815f = fbVar;
        setFenetre(((C0490q) fbVar).getFenetreMere());
    }

    public void setGroupe(WDObjet wDObjet) {
        if (isGroupable()) {
            if (isFenetreCree()) {
                WDErreurManager.m2883a(C0745b.m3222b(f812z[1], EWDPropriete.PROP_GROUPE.getNom()));
            }
            WDGroupe wDGroupe = (WDGroupe) wDObjet.checkType(WDGroupe.class);
            if (wDGroupe != null) {
                if (this.f816g == null) {
                    this.f816g = new LinkedList();
                }
                this.f816g.add(wDGroupe);
                wDGroupe.ajouterChamp(this);
                return;
            }
            return;
        }
        super.setGroupe(wDObjet);
    }

    public void setNom(String str) {
        if (isFenetreCree()) {
            WDErreurManager.m2883a(C0745b.m3222b(f812z[1], C0745b.m3219a(f812z[0])));
            return;
        }
        this.f818k = str;
    }

    public void setNomNoeudPersistance(String str, int i) {
        if (this.f817i == null) {
            this.f817i = new C0907e();
        }
        this.f817i.m6426a(str);
        this.f817i.m6424a(i);
    }

    protected void setPersistant(boolean z) {
    }

    protected void setQuid(long j) {
        if (this.f817i == null) {
            this.f817i = new C0907e();
        }
        this.f817i.m6425a(j);
    }

    public void sortieChamp() {
        initialiserAction();
    }

    public void sortieSaisieLigne() {
        initialiserAction();
    }

    protected C1028a startMonitoring() {
        C1029b c1029b = null;
        if (!WDTelemetrie.m7399e().mo3313h()) {
            return null;
        }
        C1028a c1028a = new C1028a();
        WDFenetre wDFenetre = (WDFenetre) getFenetreMere();
        if (wDFenetre != null) {
            c1029b = wDFenetre.getMonitor();
        }
        if (c1029b != null) {
            c1029b.m7438b(c1028a);
        }
        return c1028a;
    }

    public void survolSouris() {
        initialiserAction();
    }

    public void toucheAppuyee() {
        initialiserAction();
    }

    public void toucheEnfoncee() {
        initialiserAction();
    }

    public void toucheRelachee() {
        initialiserAction();
    }
}
