package fr.pcsoft.wdjava.ui.champs;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.erreur.WDException;
import fr.pcsoft.wdjava.core.p047f.C0713b;
import fr.pcsoft.wdjava.core.p047f.C0714c;
import fr.pcsoft.wdjava.core.p047f.C0715d;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.core.types.database.C0776b;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.p055g.C0908g;
import fr.pcsoft.wdjava.ui.p073d.C1318c;
import fr.pcsoft.wdjava.ui.p073d.p074a.C1319a;
import fr.pcsoft.wdjava.ui.p073d.p075b.C1320c;
import fr.pcsoft.wdjava.ui.p079e.C1399b;
import java.util.Arrays;

public abstract class jc extends ic implements OnItemClickListener, OnItemLongClickListener, gb {
    private static final String[] ad = new String[]{m1490z(m1491z("y]0e\u000b\u0019Q!h\f\fU2h\u0006\u001fK=i\u0003\u0017D")), m1490z(m1491z("yX7r\u0016\u001fK(h\u0006\u001f")), m1490z(m1491z("yB?m\u0007\u000fF!w\u0003\u0016]:d\u001d\u0019\\?l\u0012\u0005&")), m1490z(m1491z("yQ,s\u0007\u000fF!i\u0004\u0005Q=i\u0007\u0019K7o\u000b\u000eK=i\u0003\u0017D!m\u000b\u001f"))};
    protected kb Vc = new kb();
    protected boolean Wc = false;
    protected C0713b Xc = null;
    protected int Yc = -1;
    protected C1318c Zc;

    public jc() {
        createBindingManager();
        if (this.Vc != null) {
            this.Vc.m8631a((gb) this);
        }
    }

    /* renamed from: z */
    private static String m1490z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 90;
                    break;
                case 1:
                    i2 = 20;
                    break;
                case 2:
                    i2 = 126;
                    break;
                case 3:
                    i2 = 33;
                    break;
                default:
                    i2 = 66;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1491z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 66);
        }
        return toCharArray;
    }

    protected void activerEcouteurLongPress() {
    }

    public void ajouterSelection() {
        try {
            if (!isMultiselection()) {
                return;
            }
            if (!isVide()) {
                this.Vc.mo3487b(0, getNbElement() - 1);
            }
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        }
    }

    public void ajouterSelection(int[] iArr) throws WDException {
        int length = iArr.length;
        int i;
        if (isMultiselection()) {
            for (i = 0; i < length; i++) {
                int i2 = iArr[i];
                if (isIndiceValide(i2)) {
                    i2 = C0725i.m3011a(i2);
                    this.Vc.mo3487b(i2, i2);
                } else if (i != 0) {
                    try {
                        if (isVide()) {
                            WDErreurManager.m2883a(C0745b.m3222b(ad[1], new String[0]) + "\n" + C0745b.m3222b(ad[0], getName(), String.valueOf(i2)));
                        } else {
                            WDErreurManager.m2883a(C0745b.m3222b(ad[2], String.valueOf(i2), getName(), "1", String.valueOf(getNbElement())));
                        }
                    } catch (WDException e) {
                        throw e;
                    }
                } else {
                    continue;
                }
            }
            return;
        }
        i = iArr[0];
        if (isIndiceValide(i)) {
            i = C0725i.m3011a(i);
            this.Vc.mo3489c(i, i);
        }
    }

    protected void createBindingManager() {
    }

    public void finInit() {
        try {
            super.finInit();
            if (!isMemoire()) {
                if (!isVide()) {
                    try {
                        if (!isCombo()) {
                            try {
                                this.Vc.mo3489c(0, 0);
                                if (this.Vc.mo3485a(0)) {
                                    try {
                                        if (this.Vc.mo3496h() != 99) {
                                            appelPCode(33);
                                        }
                                    } catch (WDException e) {
                                        throw e;
                                    }
                                }
                            } catch (WDException e2) {
                                throw e2;
                            }
                        }
                    } catch (WDException e22) {
                        throw e22;
                    }
                }
            }
        } catch (WDException e222) {
            throw e222;
        } catch (WDException e2222) {
            throw e2222;
        }
    }

    protected final <T extends C0714c> T getBindingManager(Class<T> cls) {
        try {
            if (this.Zc != null) {
                if (cls.isInstance(this.Zc)) {
                    return this.Zc;
                }
            }
            return null;
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        }
    }

    public int getElementSelectionne() {
        return C0725i.m3069e(this.Vc.mo3490d());
    }

    public int getElementSelectionne(int i) {
        int a = C0725i.m3011a(i);
        int[] e = this.Vc.mo3493e();
        if (a >= 0) {
            try {
                if (a < e.length) {
                    return C0725i.m3069e(e[a]);
                }
            } catch (WDException e2) {
                throw e2;
            }
        }
        return -1;
    }

    public WDChaine getFichierParcouru() {
        try {
            return this.Zc != null ? new WDChaine(this.Zc.mo3630j()) : super.getFichierParcouru();
        } catch (WDException e) {
            throw e;
        }
    }

    public WDChaine getFiltre() {
        C1320c c1320c = (C1320c) getBindingManager(C1320c.class);
        if (c1320c == null) {
            return super.getFiltre();
        }
        try {
            return new WDChaine(c1320c.mo3650r());
        } catch (WDException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getIndiceElementCourant() {
        /*
        r2 = this;
        r0 = r2.isParcoursPourToutEnCours();
        if (r0 == 0) goto L_0x000d;
    L_0x0006:
        r0 = r2.getLigneParcoursPourTout();
        if (r0 <= 0) goto L_0x000d;
    L_0x000c:
        return r0;
    L_0x000d:
        r0 = r2.Yc;	 Catch:{ WDException -> 0x002b }
        if (r0 < 0) goto L_0x0019;
    L_0x0011:
        r0 = r2.Yc;	 Catch:{ WDException -> 0x002d }
        r1 = r2.getNbElement();	 Catch:{ WDException -> 0x002d }
        if (r0 < r1) goto L_0x0024;
    L_0x0019:
        r0 = r2.getElementSelectionne();	 Catch:{ WDException -> 0x002d }
        r0 = fr.pcsoft.wdjava.core.C0725i.m3011a(r0);	 Catch:{ WDException -> 0x002d }
        r2.setValeurInterne(r0);	 Catch:{ WDException -> 0x002d }
    L_0x0024:
        r0 = r2.Yc;
        r0 = fr.pcsoft.wdjava.core.C0725i.m3069e(r0);
        goto L_0x000c;
    L_0x002b:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x002d }
    L_0x002d:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.ui.champs.jc.getIndiceElementCourant():int");
    }

    public C0776b getMaSource() {
        if (this.Zc != null) {
            Object n = this.Zc.mo3634n();
            try {
                if (n instanceof C0776b) {
                    return (C0776b) n;
                }
            } catch (WDException e) {
                throw e;
            }
        }
        return super.getMaSource();
    }

    public WDBooleen getMultiselection() {
        return new WDBooleen(isMultiselection());
    }

    public int getNbElementSelectionne() {
        return this.Vc.mo3483a();
    }

    public int getNbLigneAffichee() {
        int nbLigneVisible = getNbLigneVisible(true);
        try {
            if (getNbElement() <= nbLigneVisible) {
                nbLigneVisible = getNbElement();
            }
            return nbLigneVisible;
        } catch (WDException e) {
            throw e;
        }
    }

    public int getPosition() {
        return Math.max(1, C0725i.m3069e(getFirstVisibleElement()));
    }

    public WDChaine getRubriqueAffichee() {
        C1320c c1320c = (C1320c) getBindingManager(C1320c.class);
        if (c1320c == null) {
            return super.getRubriqueAffichee();
        }
        try {
            return new WDChaine(c1320c.mo3653u());
        } catch (WDException e) {
            throw e;
        }
    }

    public WDChaine getRubriqueMemorisee() {
        C1320c c1320c = (C1320c) getBindingManager(C1320c.class);
        if (c1320c == null) {
            return super.getRubriqueMemorisee();
        }
        try {
            return new WDChaine(c1320c.mo3654v());
        } catch (WDException e) {
            throw e;
        }
    }

    public WDChaine getRubriqueParcourue() {
        C1320c c1320c = (C1320c) getBindingManager(C1320c.class);
        if (c1320c == null) {
            return super.getRubriqueParcourue();
        }
        try {
            return new WDChaine(c1320c.mo3648p());
        } catch (WDException e) {
            throw e;
        }
    }

    public kb getSelectionModel() {
        return this.Vc;
    }

    public WDEntier4 getTypeRemplissage() {
        try {
            if (this.Zc != null) {
                if (this.Zc instanceof C1320c) {
                    try {
                        return new WDEntier4(this.Zc.mo3616b() == C0715d.DIRECT_ACCESS ? 1 : 2);
                    } catch (WDException e) {
                        throw e;
                    }
                }
                try {
                    if (this.Zc instanceof C1320c) {
                        return new WDEntier4(3);
                    }
                } catch (WDException e2) {
                    throw e2;
                }
            }
            return super.getTypeRemplissage();
        } catch (WDException e22) {
            throw e22;
        } catch (WDException e222) {
            throw e222;
        }
    }

    public void initLiaisonsBinding() {
        try {
            super.initLiaisonsBinding();
            if (this.Xc != null) {
                this.Xc.m2970e();
            }
        } catch (WDException e) {
            throw e;
        }
    }

    public boolean isMemoire() {
        try {
            return this.Zc == null;
        } catch (WDException e) {
            throw e;
        }
    }

    protected boolean isMultiselection() {
        return this.Vc.mo3495g();
    }

    public boolean isPositionSelectionnee(int i) {
        return this.Vc.mo3485a(C0725i.m3011a(i));
    }

    protected final void majSelectionApresInsertion(int i) {
        try {
            if (!this.Wc) {
                if (this.Vc != null) {
                    this.Vc.mo3492e(i, 1);
                }
            }
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        }
    }

    protected final void majSelectionApresSuppression(int i) {
        try {
            if (!this.Wc) {
                if (this.Vc == null) {
                    return;
                }
                if (this.Vc.mo3495g()) {
                    this.Vc.mo3484a(i, i);
                    return;
                }
                boolean i2 = this.Vc.m8647i();
                this.Vc.m8636b(true);
                try {
                    boolean a = this.Vc.mo3485a(i);
                    this.Vc.mo3484a(i, i);
                    if (a) {
                        int nbElement = getNbElement();
                        if (i < nbElement) {
                            this.Vc.mo3489c(i, i);
                        } else if (nbElement > 0) {
                            nbElement--;
                            this.Vc.mo3489c(nbElement, nbElement);
                        }
                    }
                    this.Vc.m8636b(i2);
                } catch (WDException e) {
                    throw e;
                } catch (Throwable th) {
                    this.Vc.m8636b(i2);
                }
            }
        } catch (WDException e2) {
            throw e2;
        } catch (WDException e22) {
            throw e22;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onItemClick(int r4) {
        /*
        r3 = this;
        r1 = 0;
        r0 = 1;
        r2 = r3._getEtat();
        if (r2 == 0) goto L_0x000a;
    L_0x0008:
        if (r2 != r0) goto L_0x001e;
    L_0x000a:
        r2 = r3.Vc;	 Catch:{ WDException -> 0x002f }
        r2 = r2.mo3496h();	 Catch:{ WDException -> 0x002f }
        switch(r2) {
            case 3: goto L_0x0037;
            case 4: goto L_0x001f;
            case 5: goto L_0x0037;
            case 99: goto L_0x0045;
            default: goto L_0x0013;
        };
    L_0x0013:
        r0 = r1;
    L_0x0014:
        if (r0 == 0) goto L_0x001e;
    L_0x0016:
        r0 = new fr.pcsoft.wdjava.ui.champs.ac;	 Catch:{ WDException -> 0x0062 }
        r0.<init>(r3);	 Catch:{ WDException -> 0x0062 }
        fr.pcsoft.wdjava.p032m.C0938m.m6814b(r0);	 Catch:{ WDException -> 0x0062 }
    L_0x001e:
        return;
    L_0x001f:
        r1 = r3.Vc;	 Catch:{ WDException -> 0x002d }
        r1 = r1.mo3485a(r4);	 Catch:{ WDException -> 0x002d }
        if (r1 != 0) goto L_0x0031;
    L_0x0027:
        r1 = r3.Vc;	 Catch:{ WDException -> 0x002d }
        r1.mo3487b(r4, r4);	 Catch:{ WDException -> 0x002d }
        goto L_0x0014;
    L_0x002d:
        r0 = move-exception;
        throw r0;
    L_0x002f:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x002d }
    L_0x0031:
        r1 = r3.Vc;
        r1.mo3491d(r4, r4);
        goto L_0x0014;
    L_0x0037:
        r2 = r3.Vc;
        r2 = r2.mo3485a(r4);
        if (r2 != 0) goto L_0x0013;
    L_0x003f:
        r1 = r3.Vc;
        r1.mo3489c(r4, r4);
        goto L_0x0014;
    L_0x0045:
        r1 = r3.Vc;	 Catch:{ WDException -> 0x0053 }
        r1 = r1.mo3485a(r4);	 Catch:{ WDException -> 0x0053 }
        if (r1 != 0) goto L_0x0055;
    L_0x004d:
        r1 = r3.Vc;	 Catch:{ WDException -> 0x0053 }
        r1.mo3489c(r4, r4);	 Catch:{ WDException -> 0x0053 }
        goto L_0x0014;
    L_0x0053:
        r0 = move-exception;
        throw r0;
    L_0x0055:
        r1 = r3.Zc;	 Catch:{ WDException -> 0x0060 }
        if (r1 == 0) goto L_0x0014;
    L_0x0059:
        r1 = r3.Zc;	 Catch:{ WDException -> 0x0060 }
        r2 = 0;
        r1.mo3610a(r4, r4, r2);	 Catch:{ WDException -> 0x0060 }
        goto L_0x0014;
    L_0x0060:
        r0 = move-exception;
        throw r0;
    L_0x0062:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.ui.champs.jc.onItemClick(int):void");
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        try {
            if (!isBloqueTouchEvent()) {
                onItemClick(i);
            }
        } catch (WDException e) {
            throw e;
        }
    }

    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
        try {
            setValeurInterne(i);
            if (isBloqueTouchEvent()) {
                return true;
            }
            int _getEtat = _getEtat();
            if (_getEtat == 0 || _getEtat == 1) {
                try {
                    if (!this.Ic) {
                        appelPCode(C0607n.ip);
                    }
                } catch (WDException e) {
                    throw e;
                }
            }
            try {
                if (this.dc != null) {
                    if (this.mc) {
                        try {
                            if (this.dc.isModeActionBar()) {
                                return this.dc.afficherCommeUneActionBar(this);
                            }
                        } catch (WDException e2) {
                            throw e2;
                        }
                    }
                }
                return false;
            } catch (WDException e22) {
                throw e22;
            } catch (WDException e222) {
                throw e222;
            }
        } catch (WDException e2222) {
            throw e2222;
        }
    }

    public void onSelectionChanged(xb xbVar) {
        try {
            if (!xbVar.m8929c()) {
                try {
                    if (!this.Vc.mo3485a(this.Yc)) {
                        setValeurInterne(this.Vc.mo3490d());
                    }
                } catch (WDException e) {
                    throw e;
                }
            }
        } catch (WDException e2) {
            throw e2;
        }
    }

    public void onValueChanged() {
    }

    public void release() {
        try {
            super.release();
            if (this.Vc != null) {
                this.Vc.m8648j();
            }
            try {
                if (this.Zc != null) {
                    this.Zc.mo3609a();
                }
                try {
                    if (this.Xc != null) {
                        this.Xc.mo2601b();
                        this.Xc = null;
                    }
                } catch (WDException e) {
                    throw e;
                }
            } catch (WDException e2) {
                throw e2;
            }
        } catch (WDException e22) {
            throw e22;
        }
    }

    public void sauverValeur() {
        try {
            if (!isMultiselection()) {
                super.sauverValeur();
            } else if (this.e) {
                int[] e = this.Vc.mo3493e();
                String str = "";
                int i = 0;
                while (i < e.length) {
                    try {
                        if (i > 0) {
                            str = str + ",";
                        }
                        String str2 = str + e[i];
                        i++;
                        str = str2;
                    } catch (WDException e2) {
                        throw e2;
                    }
                }
                C0908g.m6432a().mo3195a((fc) this, str);
            }
        } catch (WDException e22) {
            throw e22;
        }
    }

    public void setFichierParcouru(String str) {
        try {
            if (this.Zc != null) {
                this.Zc.mo3620b(str);
            }
        } catch (WDException e) {
            throw e;
        }
    }

    public void setFiltre(WDObjet wDObjet) {
        C1320c c1320c = (C1320c) getBindingManager(C1320c.class);
        if (c1320c != null) {
            try {
                c1320c.mo3640a(wDObjet, isExecPCodeInit());
            } catch (WDException e) {
                throw e;
            }
        }
    }

    protected void setModeSelection(int i) {
        this.Vc.m8641e(i);
    }

    public void setMultiselection(boolean z) {
        int i = 4;
        int h = this.Vc.mo3496h();
        if (!(z && h == 3)) {
            i = (z || h != 4) ? h : 3;
        }
        this.Vc.m8641e(i);
    }

    public void setRubriqueAffichee(String str) {
        C1320c c1320c = (C1320c) getBindingManager(C1320c.class);
        if (c1320c != null) {
            try {
                c1320c.mo3642c(str);
            } catch (WDException e) {
                throw e;
            }
        }
    }

    public void setRubriqueMemorisee(String str) {
        try {
            if (this.Zc instanceof C1320c) {
                ((C1320c) this.Zc).mo3643d(str);
                return;
            }
            try {
                if (this.Zc instanceof C1319a) {
                    if (this.Xc != null) {
                        this.Xc.mo2601b();
                        this.Xc = null;
                    }
                    try {
                        if (C0808l.m4053k(str)) {
                            this.Xc = new C0713b(str);
                            this.Xc.m2970e();
                        }
                        try {
                            ((C1319a) this.Zc).m9308b(this.Xc != null);
                        } catch (WDException e) {
                            throw e;
                        }
                    } catch (WDException e2) {
                        throw e2;
                    }
                }
            } catch (WDException e22) {
                throw e22;
            } catch (WDException e222) {
                throw e222;
            }
        } catch (WDException e2222) {
            throw e2222;
        }
    }

    public void setRubriqueParcourue(String str) {
        C1320c c1320c = (C1320c) getBindingManager(C1320c.class);
        if (c1320c != null) {
            try {
                c1320c.mo3646g(str);
            } catch (WDException e) {
                throw e;
            }
        }
    }

    protected final void setSourceRemplissage(String str, String str2) {
        try {
            this.Zc = new C1319a(this, str);
            if (!C0808l.m4053k(str2)) {
                this.Xc = new C0713b(str2);
                ((C1319a) this.Zc).m9308b(true);
            }
        } catch (WDException e) {
            throw e;
        }
    }

    protected final void setSourceRemplissage(String str, String str2, String str3, String str4, boolean z, String str5) {
        setSourceRemplissage(str, str2, str3, str4, z, str5, false);
    }

    protected final void setSourceRemplissage(String str, String str2, String str3, String str4, boolean z, String str5, boolean z2) {
        C1320c c1320c = (C1320c) getBindingManager(C1320c.class);
        if (c1320c != null) {
            try {
                c1320c.mo3639a(str, new String[]{str2, str3, str4, ""}, str5, z);
                this.Zc.mo3613a(z2);
            } catch (WDException e) {
                WDErreurManager.m2883a(C0745b.m3222b(ad[3], getName(), e.getMessage()));
            }
        }
    }

    protected final void setSourceRemplissage(String str, String str2, String str3, boolean z, String str4, boolean z2) {
        setSourceRemplissage(str, str2, "", str3, z, str4, z2);
    }

    protected void setStyleSelection(int i, int i2, C1399b c1399b) {
    }

    public final void setValeurInterne(int i) {
        try {
            if (this.Yc != i) {
                this.Yc = i;
                onValueChanged();
            }
        } catch (WDException e) {
            throw e;
        }
    }

    public void supprimerElementSelectionne(boolean z) {
        if (this.Vc.mo3495g()) {
            int[] e = this.Vc.mo3493e();
            if (e.length > 0) {
                Arrays.sort(e);
                int length = e.length - 1;
                while (length >= 0) {
                    try {
                        supprimerElementA(C0725i.m3069e(length), e.length > 1 ? false : z);
                        length--;
                    } catch (WDException e2) {
                        throw e2;
                    }
                }
                return;
            }
            return;
        }
        int indiceElementCourant = getIndiceElementCourant();
        if (indiceElementCourant > 0) {
            try {
                supprimerElementA(indiceElementCourant, z);
            } catch (WDException e22) {
                throw e22;
            }
        }
    }

    public void supprimerSelection() {
        try {
            if (this.Vc != null) {
                this.Vc.mo3486b();
            }
        } catch (WDException e) {
            throw e;
        }
    }

    public void supprimerSelection(int[] iArr) throws WDException {
        for (int i : iArr) {
            int i2;
            if (isIndiceValide(i2)) {
                i2 = C0725i.m3011a(i2);
                this.Vc.mo3491d(i2, i2);
            } else if (i2 == 0) {
                try {
                    supprimerSelection();
                } catch (WDException e) {
                    throw e;
                }
            } else {
                try {
                    if (isVide()) {
                        String[] strArr = new String[2];
                        strArr[0] = C0745b.m3222b(ad[1], new String[0]);
                        strArr[1] = C0745b.m3222b(ad[0], getName(), String.valueOf(i2));
                        WDErreurManager.m2886a(strArr);
                    } else {
                        WDErreurManager.m2883a(C0745b.m3222b(ad[2], String.valueOf(i2), getName(), "1", String.valueOf(getNbElement())));
                    }
                } catch (WDException e2) {
                    throw e2;
                }
            }
        }
    }
}
