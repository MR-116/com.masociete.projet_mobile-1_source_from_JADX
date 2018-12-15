package fr.pcsoft.wdjava.ui.champs.zr;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.ui.C0489p;
import fr.pcsoft.wdjava.ui.C0490q;
import fr.pcsoft.wdjava.ui.cadre.C1110m;
import fr.pcsoft.wdjava.ui.champs.C0546j;
import fr.pcsoft.wdjava.ui.champs.db;
import fr.pcsoft.wdjava.ui.champs.gc;
import fr.pcsoft.wdjava.ui.champs.nb;
import fr.pcsoft.wdjava.ui.champs.table.C1280o;
import fr.pcsoft.wdjava.ui.utils.C1511l;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class WDRuptureZR extends C0490q implements db {
    /* renamed from: z */
    private static final String[] f3787z = new String[]{m8988z(m8989z(" +\b\u000fB}!\u0002\u000b")), m8988z(m8989z(" c1\u0007\rVc!")), m8988z(m8989z(" e=\u0007\u001c")), m8988z(m8989z("Bw\"\u0012\u001aWp0\u001e\u0016Mn-\u0019\rFc \u001e\rFnV")), m8988z(m8989z(" u!\u001a\u0018Mu!\b\u000fB}!\u0002\u000b\\\u0002"))};
    /* renamed from: m */
    private boolean f3788m = false;
    /* renamed from: n */
    private int f3789n = 0;
    /* renamed from: o */
    private boolean f3790o = false;
    /* renamed from: p */
    private WDZoneRepetee f3791p = null;
    /* renamed from: q */
    protected HashMap<String, gc> f3792q = new LinkedHashMap();
    /* renamed from: r */
    private String f3793r = "";
    /* renamed from: s */
    private C1110m f3794s = null;

    /* renamed from: z */
    private static String m8988z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 3;
                    break;
                case 1:
                    i2 = 49;
                    break;
                case 2:
                    i2 = 100;
                    break;
                case 3:
                    i2 = 87;
                    break;
                default:
                    i2 = 89;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m8989z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 89);
        }
        return toCharArray;
    }

    public void ajouterChamp(String str, gc gcVar) {
        this.f3792q.put(str.toLowerCase(), gcVar);
        gcVar.setPere(this);
        gcVar.fixeValeurDefautAttributZR();
        gcVar.majPlan(gcVar.getFirstPlan());
        gcVar.addFlag(32);
        this.f3791p.creerAttributAuto(gcVar);
    }

    public final void ancrerChamps(int i, int i2) {
        for (gc ancrer : this.f3792q.values()) {
            ancrer.ancrer(i, i2, 0, 0, 0);
        }
    }

    public C1110m getCadre() {
        return this.f3794s;
    }

    public final Iterator<gc> getChampIterator() {
        return this.f3792q != null ? this.f3792q.values().iterator() : null;
    }

    public WDBooleen getEnroule() {
        return new WDBooleen(false);
    }

    public C0489p getFils(String str) {
        C0489p filsDirect = getFilsDirect(str);
        if (filsDirect == null) {
            String toLowerCase = str.toLowerCase();
            for (gc fils : this.f3792q.values()) {
                filsDirect = fils.getFils(toLowerCase);
                if (filsDirect != null) {
                    break;
                }
            }
        }
        return filsDirect;
    }

    public C0489p getFilsDirect(String str) {
        return (C0489p) this.f3792q.get(str.toLowerCase());
    }

    public WDEntier4 getHauteur() {
        return new WDEntier4((double) C1511l.m10515a((float) getHauteurRupture(), 1, this.f3791p.getDisplayUnit()));
    }

    public final int getHauteurRupture() {
        return this.f3789n;
    }

    public Iterator getLstFils() {
        return this.f3792q.values().iterator();
    }

    public String getName() {
        return this.f3793r;
    }

    public String getNomType() {
        return C0745b.m3220a(f3787z[1], new String[0]);
    }

    public WDObjet getValeur() {
        WDErreurManager.m2883a(C0745b.m3222b(f3787z[0], getNomType()));
        return null;
    }

    public WDBooleen getVisible() {
        return new WDBooleen(isRuptureVisible());
    }

    public final WDZoneRepetee getZoneRepetee() {
        return this.f3791p;
    }

    public void init() {
        super.init();
        for (gc appelPCode : this.f3792q.values()) {
            appelPCode.appelPCode(14);
        }
    }

    public final boolean isAlwayVisible() {
        return this.f3788m;
    }

    public boolean isEvaluable() {
        return false;
    }

    protected boolean isGroupable() {
        return false;
    }

    public final boolean isRuptureVisible() {
        return this.f3790o;
    }

    public void majPlan(int i) {
        super.majPlan(i);
        for (gc majPlan : this.f3792q.values()) {
            majPlan.majPlan(i);
        }
    }

    public void parcourirChamp(C0546j c0546j, boolean z) {
        for (nb nbVar : this.f3792q.values()) {
            c0546j.mo2352a(nbVar);
            if (z) {
                nbVar.parcourirChamp(c0546j, z);
            }
        }
    }

    public void parcourirObjetAPCode(C0546j c0546j, boolean z) {
        for (C0489p c0489p : this.f3792q.values()) {
            c0546j.mo2353a(c0489p);
            if (z) {
                c0489p.parcourirObjetAPCode(c0546j, z);
            }
        }
    }

    public void release() {
        super.release();
        this.f3793r = null;
        this.f3791p = null;
        if (this.f3792q != null) {
            for (gc gcVar : this.f3792q.values()) {
                if (gcVar != null) {
                    gcVar.release();
                }
            }
            this.f3792q.clear();
            this.f3792q = null;
        }
        if (this.f3794s != null) {
            this.f3794s.mo3386h();
            this.f3794s = null;
        }
    }

    public void removeObjAPCode(C0489p c0489p) {
        if (this.f3792q != null) {
            this.f3792q.remove(c0489p.getName().toLowerCase());
        }
    }

    protected void setCadreExterieur(C1110m c1110m) {
        this.f3794s = c1110m;
    }

    public void setEnroule(boolean z) {
    }

    public void setHauteur(int i) {
        boolean isFenetreCree = isFenetreCree();
        if (!isFenetreCree && this.f3791p.getDisplayUnitWL() == 1) {
            i *= 2;
        }
        this.f3789n = C1511l.m10532d((float) i, this.f3791p.getDisplayUnit());
        if (isFenetreCree) {
            this.f3791p.updateSizes();
        }
    }

    public void setNom(String str) {
        this.f3793r = str;
    }

    protected final void setTable(C1280o c1280o) {
        this.f3791p = (WDZoneRepetee) c1280o;
        setFenetre(this.f3791p.getFenetreMere());
    }

    protected final void setToujoursVisible(boolean z) {
        this.f3788m = z;
    }

    public void setValeur(WDObjet wDObjet) {
        WDErreurManager.m2883a(C0745b.m3222b(f3787z[4], getNomType()) + "\n" + C0745b.m3222b(f3787z[2], getName(), getNomType()) + " " + C0745b.m3222b(f3787z[3], new String[0]));
    }

    public void setVisible(boolean z) {
        this.f3790o = z;
        this.f3791p.updateContenu(true);
    }

    public void setVisibleInitial(boolean z) {
        if (isFenetreCree()) {
            super.setVisibleInitial(z);
        } else {
            setVisible(z);
        }
    }

    protected final void setZoneRepetee(lc lcVar) {
        this.f3791p = (WDZoneRepetee) lcVar;
        setFenetre(this.f3791p.getFenetreMere());
    }
}
