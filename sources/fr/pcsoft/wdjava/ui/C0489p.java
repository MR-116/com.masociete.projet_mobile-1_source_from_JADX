package fr.pcsoft.wdjava.ui;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.erreur.WDException;
import fr.pcsoft.wdjava.core.poo.C0735q;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.C0487y;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.core.types.database.C0776b;
import fr.pcsoft.wdjava.ui.champs.C0546j;
import fr.pcsoft.wdjava.ui.champs.db;
import fr.pcsoft.wdjava.ui.champs.fenetre.C0508h;
import fr.pcsoft.wdjava.ui.champs.fenetreinterne.fb;
import java.util.ArrayList;

/* renamed from: fr.pcsoft.wdjava.ui.p */
public abstract class C0489p extends C0487y implements C0488r {
    /* renamed from: z */
    private static final String[] f806z = new String[]{C0489p.m1298z(C0489p.m1299z("x\u0016\b")), C0489p.m1298z(C0489p.m1299z("<049\u0017O,/7\u000fL,94\u001fR62,")), C0489p.m1298z(C0489p.m1299z("<#.7\nM:9,\u001f@?9;\u000eJ!9'\tZ&0=")), C0489p.m1298z(C0489p.m1299z("<'%(\u001f")), C0489p.m1298z(C0489p.m1299z("<2);\u000fQ6#+\u0015J!?=\u0005[<26\u001fZ "))};
    /* renamed from: a */
    private db f807a;
    /* renamed from: b */
    protected int f808b = 0;
    /* renamed from: c */
    protected boolean f809c = false;

    /* renamed from: z */
    private static String m1298z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 31;
                    break;
                case 1:
                    i2 = 115;
                    break;
                case 2:
                    i2 = C0607n.Hn;
                    break;
                case 3:
                    i2 = C0607n.co;
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
    private static char[] m1299z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 90);
        }
        return toCharArray;
    }

    public int _getNumTab() {
        return -1;
    }

    public WDObjet appelPCode(int i) {
        return null;
    }

    public void buildFullName(StringBuilder stringBuilder, boolean z) {
        try {
            if (stringBuilder.length() > 0) {
                stringBuilder.append(".");
            }
            stringBuilder.append(getName());
        } catch (WDException e) {
            throw e;
        }
    }

    public void copierEnfant(ArrayList arrayList) {
    }

    public void destroy() {
        parcourirObjetAPCode(new C1466m(this), false);
        release();
    }

    public WDObjet getClone() {
        return getValeur().getClone();
    }

    public WDObjet getElement(String str) {
        return getElement(str, true);
    }

    public WDObjet getElement(String str, boolean z) {
        if (z) {
            try {
                WDErreurManager.m2883a(C0745b.m3222b(f806z[1], new String[0]));
            } catch (WDException e) {
                throw e;
            }
        }
        return null;
    }

    public fb getFenetreInterne() {
        return null;
    }

    public <T extends C0508h> T getFenetreMere() {
        return null;
    }

    public C0489p getFils(String str) {
        return null;
    }

    public C0489p getFils(String str, int i) {
        return null;
    }

    public C0489p getFrere(String str) {
        db pere = getPere();
        return pere != null ? pere.getFilsDirect(str) : null;
    }

    public final String getFullName(boolean z) {
        StringBuilder stringBuilder = new StringBuilder();
        buildFullName(stringBuilder, z);
        return stringBuilder.toString();
    }

    public C0776b getMaSource() {
        WDErreurManager.m2883a(C0745b.m3222b(f806z[4], getName()));
        return null;
    }

    public C0489p getMonParent() {
        return (C0489p) getFenetreMere();
    }

    public abstract String getName();

    public WDChaine getNom() {
        return new WDChaine(getName());
    }

    public WDChaine getNomComplet() {
        return new WDChaine(getFullName(false));
    }

    public final <T> T getObjOrParentOfType(Class<T> cls) {
        try {
            return checkType(cls) != null ? this : getParentOfType(cls);
        } catch (WDException e) {
            throw e;
        }
    }

    public final <T> T getParentOfType(Class<T> cls) {
        for (C0489p c0489p = (C0489p) getPere(); c0489p != null; c0489p = (C0489p) c0489p.getPere()) {
            T checkType = c0489p.checkType(cls);
            if (checkType != null) {
                return checkType;
            }
        }
        return null;
    }

    public db getPere() {
        return this.f807a;
    }

    public int getSourisPosX() {
        return -1;
    }

    public int getSourisPosY() {
        return -1;
    }

    public WDEntier4 getType() {
        return new WDEntier4(this.f808b);
    }

    public int getTypeVar() {
        return getValeur().getTypeVar();
    }

    public boolean hasProperty(String str) {
        if (EWDPropriete.getPropByName(str) == null) {
            return false;
        }
        try {
            return C0735q.m3122a(getClass(), new StringBuilder().append(f806z[0]).append(str).toString(), 0) != null;
        } catch (WDException e) {
            throw e;
        }
    }

    public void initialiserObjet() {
    }

    public void initialiserSousObjets() {
    }

    public boolean isEvaluable() {
        try {
            return !isReleased();
        } catch (WDException e) {
            throw e;
        }
    }

    public boolean isFenetreCree() {
        return false;
    }

    public boolean isMemoBinaire() {
        WDObjet valeur = getValeur();
        if (valeur == null) {
            return false;
        }
        try {
            return valeur.isMemoBinaire();
        } catch (WDException e) {
            throw e;
        }
    }

    public boolean isNumerique() {
        return getValeur().isNumerique();
    }

    public boolean isObjetAPCode() {
        return true;
    }

    public final boolean isPere(C0489p c0489p) {
        C0489p pere = c0489p.getPere();
        if (this == pere) {
            return true;
        }
        if (pere != null) {
            try {
                if (pere instanceof C0489p) {
                    return isPere(pere);
                }
            } catch (WDException e) {
                throw e;
            }
        }
        return false;
    }

    public final boolean isReleased() {
        return this.f809c;
    }

    public void majPlan(int i) {
    }

    public void parcourirChamp(C0546j c0546j, boolean z) {
    }

    public void parcourirObjetAPCode(C0546j c0546j, boolean z) {
    }

    public void prendreFocus() throws WDException {
    }

    public void razVariable() {
    }

    public void release() {
        this.f809c = true;
        this.f807a = null;
    }

    public boolean restaurerValeur() {
        return false;
    }

    public void sauverValeur() {
    }

    public void setAgencement(int i) {
    }

    public void setFenetre(C0508h c0508h) {
    }

    public void setPere(db dbVar) {
        this.f807a = dbVar;
    }

    public void setType(int i) {
        try {
            if (isFenetreCree()) {
                WDErreurManager.m2883a(C0745b.m3222b(f806z[2], C0745b.m3219a(f806z[3])));
                return;
            }
            this.f808b = i;
        } catch (WDException e) {
            throw e;
        }
    }

    public void terminerInitialisation() {
    }
}
