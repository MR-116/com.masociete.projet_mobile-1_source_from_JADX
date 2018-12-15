package fr.pcsoft.wdjava.ui.champs;

import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.erreur.WDException;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.ui.C0489p;
import fr.pcsoft.wdjava.ui.champs.fenetre.C0508h;
import java.util.ArrayList;
import java.util.Iterator;

public class WDGroupe extends C0489p {
    /* renamed from: z */
    private static final String[] f3457z = new String[]{m8235z(m8236z("K*\"\u0012  % \u001d<++!\u0002-&!2\u0019\"*((")), m8235z(m8236z("K#?\u000268!")), m8235z(m8236z("K*\"\u00125)((\u00181")), m8235z(m8236z("K04\u001d&")), m8235z(m8236z("K (\u0000\"& (\u00125)((\u00181"))};
    /* renamed from: d */
    private ArrayList<C0489p> f3458d = new ArrayList();
    /* renamed from: e */
    private int f3459e = 0;
    /* renamed from: f */
    private int f3460f = 0;
    /* renamed from: g */
    private String f3461g = "";
    /* renamed from: h */
    private int f3462h = 0;
    /* renamed from: i */
    private int f3463i = 0;
    /* renamed from: j */
    private boolean f3464j = true;

    /* renamed from: z */
    private static String m8235z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 104;
                    break;
                case 1:
                    i2 = 100;
                    break;
                case 2:
                    i2 = 109;
                    break;
                case 3:
                    i2 = 77;
                    break;
                default:
                    i2 = 99;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m8236z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 99);
        }
        return toCharArray;
    }

    public void ajouterChamp(C0489p c0489p) {
        this.f3458d.add(c0489p);
    }

    public WDEntier4 getCouleur() {
        return new WDEntier4(this.f3462h);
    }

    public WDEntier4 getCouleurFond() {
        return new WDEntier4(this.f3460f);
    }

    public WDEntier4 getEtat() {
        return new WDEntier4(this.f3459e);
    }

    public ArrayList getLstChamps() {
        return this.f3458d;
    }

    public WDBooleen getModifie() {
        boolean z;
        Iterator it = this.f3458d.iterator();
        while (it.hasNext()) {
            if (((C0489p) it.next()).getModifie().getBoolean()) {
                z = true;
                break;
            }
        }
        z = false;
        return new WDBooleen(z);
    }

    public String getName() {
        return this.f3461g;
    }

    public WDChaine getNomComplet() {
        try {
            if (!(this.f3458d == null || this.f3458d.isEmpty())) {
                C0508h fenetreMere = ((C0489p) this.f3458d.get(0)).getFenetreMere();
                if (fenetreMere != null) {
                    try {
                        return new WDChaine(fenetreMere.getNomFenetre() + "." + getName());
                    } catch (WDException e) {
                        throw e;
                    }
                }
            }
            return new WDChaine(getName());
        } catch (WDException e2) {
            throw e2;
        }
    }

    public String getNomType() {
        return C0745b.m3220a(f3457z[1], new String[0]);
    }

    public WDEntier4 getOccurrence() {
        return new WDEntier4(this.f3458d.size());
    }

    public WDObjet getOpacite() {
        return new WDEntier4(this.f3463i);
    }

    public WDObjet getValeur() {
        WDErreurManager.m2883a(C0745b.m3222b(f3457z[4], getNom().getString()) + "\n" + C0745b.m3222b(f3457z[3], getNom().getString(), getNomType()) + "\n" + C0745b.m3222b(f3457z[2], getNomType()));
        return null;
    }

    public WDBooleen getVisible() {
        return new WDBooleen(this.f3464j);
    }

    public void init(String str) {
        setNom(str);
        setType(58);
    }

    public void init(String str, C0508h c0508h) {
        init(str);
    }

    public boolean isEvaluable() {
        return false;
    }

    public void prendreFocus() throws WDException {
        WDErreurManager.m2883a(C0745b.m3222b(f3457z[0], getNom().getString(), getNomType()));
    }

    public void raz(boolean z) {
        Iterator it = this.f3458d.iterator();
        while (it.hasNext()) {
            C0489p c0489p = (C0489p) it.next();
            try {
                if (c0489p.isChamp()) {
                    ((gc) c0489p).raz(z);
                }
            } catch (WDException e) {
                throw e;
            }
        }
    }

    public void release() {
        try {
            super.release();
            if (this.f3458d != null) {
                this.f3458d.clear();
                this.f3458d = null;
            }
            this.f3461g = null;
        } catch (WDException e) {
            throw e;
        }
    }

    public void removeObjetAPCode(C0489p c0489p) {
        try {
            if (this.f3458d != null) {
                this.f3458d.remove(c0489p);
            }
        } catch (WDException e) {
            throw e;
        }
    }

    public void setCouleur(int i) {
        this.f3462h = i;
        Iterator it = this.f3458d.iterator();
        while (it.hasNext()) {
            ((C0489p) it.next()).setProp(EWDPropriete.PROP_COULEUR, i);
        }
    }

    public void setCouleurFond(int i) {
        this.f3460f = i;
        Iterator it = this.f3458d.iterator();
        while (it.hasNext()) {
            ((C0489p) it.next()).setProp(EWDPropriete.PROP_COULEURFOND, i);
        }
    }

    public void setEtat(int i) {
        this.f3459e = i;
        Iterator it = this.f3458d.iterator();
        while (it.hasNext()) {
            ((C0489p) it.next()).setProp(EWDPropriete.PROP_ETAT, i);
        }
    }

    public void setModifie(boolean z) {
        Iterator it = this.f3458d.iterator();
        while (it.hasNext()) {
            ((C0489p) it.next()).setProp(EWDPropriete.PROP_MODIFIE, z);
        }
    }

    public void setNom(String str) {
        this.f3461g = str;
    }

    public void setOpacite(int i) {
        if (i < 0) {
            i = 0;
        } else if (i > 100) {
            i = 100;
        }
        this.f3463i = i;
        Iterator it = this.f3458d.iterator();
        while (it.hasNext()) {
            C0489p c0489p = (C0489p) it.next();
            try {
                if (c0489p instanceof gc) {
                    c0489p.setProp(EWDPropriete.PROP_OPACITE, i);
                }
            } catch (WDException e) {
                throw e;
            }
        }
    }

    public void setValeur(WDObjet wDObjet) {
        Iterator it = this.f3458d.iterator();
        while (it.hasNext()) {
            ((C0489p) it.next()).setValeur(wDObjet);
        }
    }

    public void setVisible(boolean z) {
        this.f3464j = z;
        Iterator it = this.f3458d.iterator();
        while (it.hasNext()) {
            ((C0489p) it.next()).setProp(EWDPropriete.PROP_VISIBLE, z);
        }
    }
}
