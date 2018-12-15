package fr.pcsoft.wdjava.ui.menu;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.erreur.WDException;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.ui.C0489p;
import fr.pcsoft.wdjava.ui.C0490q;
import fr.pcsoft.wdjava.ui.champs.db;

/* renamed from: fr.pcsoft.wdjava.ui.menu.h */
public abstract class C0496h extends C0490q implements C0495i {
    /* renamed from: z */
    private static final String[] f859z = new String[]{C0496h.m1318z(C0496h.m1319z("\u00035z{}\u00162hwq\f,upj\u0007!xwj\u0007,\u000e")), C0496h.m1318z(C0496h.m1319z("a7ys\f7yah\u0003?ykl\u001d@")), C0496h.m1318z(C0496h.m1319z("a'en{")), C0496h.m1318z(C0496h.m1319z("a=sa}\n2qna\u0001<pqp\f6cj\u0000?y"))};
    /* renamed from: m */
    protected String f860m = "";
    /* renamed from: n */
    private int f861n = 0;
    /* renamed from: o */
    protected WDOptionMenu f862o = null;
    /* renamed from: p */
    protected C0497c f863p = null;
    /* renamed from: q */
    protected String f864q = null;
    /* renamed from: r */
    protected boolean f865r = false;

    public C0496h(boolean z) {
    }

    public C0496h(boolean z, boolean z2) {
    }

    /* renamed from: z */
    private static String m1318z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 66;
                    break;
                case 1:
                    i2 = 115;
                    break;
                case 2:
                    i2 = 60;
                    break;
                case 3:
                    i2 = 62;
                    break;
                default:
                    i2 = 62;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1319z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 62);
        }
        return toCharArray;
    }

    protected abstract int ajouterOptionMenu(WDOptionMenu wDOptionMenu);

    public WDObjet appelPCode(int i) {
        if (i == 18) {
            i = 32;
        }
        return super.appelPCode(i);
    }

    protected abstract void appliquerLibelle(String str, int i);

    public WDBooleen getCochee() {
        return new WDBooleen(this.f865r);
    }

    public C0497c getConteneurMenu() {
        return this.f863p;
    }

    public WDChaine getImage() {
        return new WDChaine(this.f860m);
    }

    public WDChaine getLibelle() {
        try {
            return this.f864q == null ? new WDChaine() : new WDChaine(this.f864q);
        } catch (WDException e) {
            throw e;
        }
    }

    public final C0494e getMenuParent() {
        try {
            return this.f862o != null ? this.f862o : getConteneurMenu();
        } catch (WDException e) {
            throw e;
        }
    }

    public WDChaine getNomComplet() {
        return new WDChaine(getFenetreMere().getNomFenetre() + "." + getNom().getString());
    }

    public final String getNomOptionMenu() {
        return getName();
    }

    public int getNumeroOptionMenu() {
        return this.f861n;
    }

    public final C0495i getOptionMenuParente() {
        return this.f862o;
    }

    public db getPere() {
        db pere = super.getPere();
        if (pere != null) {
            return pere;
        }
        try {
            return this.f863p instanceof C0489p ? ((C0489p) this.f863p).getPere() : pere;
        } catch (WDException e) {
            throw e;
        }
    }

    public WDObjet getValeur() {
        return new WDEntier4(getNumeroOptionMenu());
    }

    protected boolean isGroupable() {
        return true;
    }

    public boolean isOptionMenu() {
        return true;
    }

    public void prendreFocus() throws WDException {
        WDErreurManager.m2883a(C0745b.m3222b(f859z[3], getNom().getString(), getNomType()));
    }

    public void release() {
        super.release();
        this.f864q = null;
        this.f860m = null;
        this.f862o = null;
        this.f863p = null;
    }

    public void setCochee(boolean z) {
        this.f865r = z;
    }

    public void setConteneurMenu(C0497c c0497c) {
        this.f863p = c0497c;
    }

    public void setImage(String str) {
        if (str != null) {
            try {
                if (!str.equals("")) {
                    this.f860m = str;
                    return;
                }
            } catch (WDException e) {
                throw e;
            }
        }
        this.f860m = "";
    }

    public void setLibelle(String str) {
        int indexOf = str.indexOf(C0607n.Gc);
        if (indexOf != -1) {
            str = str.substring(0, indexOf);
        }
        this.f864q = str;
        StringBuffer stringBuffer = new StringBuffer();
        appliquerLibelle(stringBuffer.toString(), C0808l.m4009a(str, stringBuffer));
    }

    protected void setNumero(int i) {
        this.f861n = i;
    }

    protected final void setOptionMenuParente(WDOptionMenu wDOptionMenu) {
        this.f862o = wDOptionMenu;
    }

    public void setValeur(WDObjet wDObjet) {
        WDErreurManager.m2883a(C0745b.m3222b(f859z[1], getNomType()) + "\n" + C0745b.m3222b(f859z[2], getNom().getString(), getNomType()) + " " + C0745b.m3222b(f859z[0], new String[0]));
    }
}
