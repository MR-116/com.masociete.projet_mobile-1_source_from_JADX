package fr.pcsoft.wdjava.ui.champs.zml;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import fr.pcsoft.wdjava.api.WDAPIZoneMultiligne;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.C0723g;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.ui.C0489p;
import fr.pcsoft.wdjava.ui.activite.C0492a;
import fr.pcsoft.wdjava.ui.activite.C1056i;
import fr.pcsoft.wdjava.ui.cadre.C1110m;
import fr.pcsoft.wdjava.ui.cadre.C1113c;
import fr.pcsoft.wdjava.ui.cadre.WDCadreFactory;
import fr.pcsoft.wdjava.ui.champs.C0504y;
import fr.pcsoft.wdjava.ui.champs.C0546j;
import fr.pcsoft.wdjava.ui.champs.C1153s;
import fr.pcsoft.wdjava.ui.champs.fenetre.C0508h;
import fr.pcsoft.wdjava.ui.champs.fenetre.WDFenetre;
import fr.pcsoft.wdjava.ui.champs.gc;
import fr.pcsoft.wdjava.ui.champs.hc;
import fr.pcsoft.wdjava.ui.champs.modelechamp.C1231a;
import fr.pcsoft.wdjava.ui.champs.nb;
import fr.pcsoft.wdjava.ui.champs.xc;
import fr.pcsoft.wdjava.ui.p064a.C1031a;
import fr.pcsoft.wdjava.ui.utils.C1511l;
import java.util.ArrayList;
import java.util.Iterator;

@C0723g(a = {WDAPIZoneMultiligne.class})
public class WDZoneMultiligne extends hc implements C0532f, C0504y, OnTouchListener, C0492a {
    private static final int Ic = 300;
    private static final int Mc = -1;
    private static long Pc = 0;
    private static final String[] Rc = new String[]{m1541z(m1542z("\u001e\u0010e\u0001\u001bh\u0014{\u001b\u001fq\u000f`\b\u0001~\u000ee\u0000\u000e")), m1541z(m1542z("\u001e\u0003v\u001f\u0001p\u0007|\u0012\u0012t\u0001j\b\u0001y\u001fj\f\u0013t\u0017q\b\u0001g\u000bh")), m1541z(m1542z("\u001e\u000bk\t\u001bq\u0003{\u0001\u0017z\ba\u0012\u001ad\be\u0000\u0017l\u0013a\u0012\u0017s\u0003|\u0004\ri\u0007j\u0019")), m1541z(m1542z("\u001e\u000fj\t\u0017~\u0003{\u0004\u0010k\u0007h\u0004\u001ax")), m1541z(m1542z("\u001e\nm\u001e\nx\u0019r\u0004\u001ax")), m1541z(m1542z("\u001e\u000fj\t\u0017~\u0003{\u0004\u0010k\u0007h\u0004\u001ax\u0019g\u0005\u001fp\u0016")), m1541z(m1542z("\u001e\u001ck\u0003\u001bb\u000bq\u0001\nt\nm\n\u0010x"))};
    private LinearLayout Cc = null;
    private C1110m Dc;
    protected C1153s Ec = null;
    private C1110m Fc = null;
    private int Gc = 1;
    private int Hc = -1;
    private Rect Jc = null;
    private Paint Kc = new Paint();
    private Path Lc = null;
    private ArrayList<C0531g> Nc = null;
    private LigneZMLDynamique Oc = null;
    private int Qc = 0;

    public class LigneZMLStatique extends C0531g {
        public LigneZMLStatique() {
            super(WDZoneMultiligne.this);
        }

        public String construireNomChampPourConteneur(gc gcVar) {
            return gcVar.getName();
        }

        public final boolean isDynamique() {
            return false;
        }
    }

    public class LigneZMLDynamique extends C0531g {
        /* renamed from: l */
        long f3780l = WDZoneMultiligne.access$1008();

        public LigneZMLDynamique() {
            super(WDZoneMultiligne.this);
        }

        /* renamed from: b */
        private final void m8934b() {
            if (this.h != null) {
                Iterator it = this.h.iterator();
                while (it.hasNext()) {
                    gc gcVar = (gc) it.next();
                    if (gcVar instanceof C1231a) {
                        ((C1231a) gcVar).executerDeclarationGlobales();
                    }
                }
                it = this.h.iterator();
                while (it.hasNext()) {
                    ((gc) it.next()).appelPCode(14);
                }
            }
        }

        /* renamed from: c */
        private final void m8935c() {
            if (this.h != null) {
                Iterator it = this.h.iterator();
                while (it.hasNext()) {
                    ((gc) it.next()).appelPCode(C0607n.Xu);
                }
            }
        }

        /* renamed from: d */
        private final void m8936d() {
            if (this.h != null) {
                Iterator it = this.h.iterator();
                while (it.hasNext()) {
                    ((gc) it.next()).appelPCode(35);
                }
            }
        }

        public String construireNomChampPourConteneur(gc gcVar) {
            return gcVar.getName() + "#" + this.f3780l;
        }

        public final boolean isDynamique() {
            return true;
        }
    }

    public WDZoneMultiligne() {
        this.Kc.setAntiAlias(false);
        this.Kc.setDither(false);
        this.Kc.setColor(-6182994);
        this.Dc = null;
        this.Ec = new C1287e(this);
        this.Cc = new C1284b(this, C1056i.m7562a());
        this.Cc.setOrientation(1);
        ((ViewGroup) getCompConteneur()).addView(this.Cc);
        this.Fc = WDCadreFactory.m8064a(27, -6182994, 0, -526345, 10, 10);
        this.N |= 1;
    }

    /* renamed from: a */
    private final int m1535a(int i, boolean z) {
        if (m1540d() || (z && getNbLignesDynamiques() == 0)) {
            String[] strArr = new String[2];
            strArr[0] = C0745b.m3222b(Rc[4], new String[0]);
            strArr[1] = C0745b.m3222b(Rc[5], getName(), String.valueOf(i));
            WDErreurManager.m2886a(strArr);
        }
        int indicePremiereLigneDynamique = z ? getIndicePremiereLigneDynamique() + 1 : 1;
        int nbLignesDynamiques = z ? (getNbLignesDynamiques() + indicePremiereLigneDynamique) - 1 : m1538b();
        if (i < indicePremiereLigneDynamique || i > nbLignesDynamiques) {
            String[] strArr2 = new String[2];
            strArr2[0] = C0745b.m3222b(Rc[3], String.valueOf(i));
            strArr2[1] = C0745b.m3222b(Rc[0], getName(), String.valueOf(indicePremiereLigneDynamique), String.valueOf(nbLignesDynamiques));
            WDErreurManager.m2886a(strArr2);
        }
        return C0725i.m3011a(i);
    }

    /* renamed from: a */
    private final int m1536a(C0531g c0531g, int i) {
        int b = m1538b();
        int max = Math.max(0, Math.min(i, b));
        if (this.l != null && this.l.isHardwareAccelerated() && max == b && b > 0) {
            this.Cc.getChildAt(b - 1).invalidate();
        }
        c0531g.setPere(this);
        boolean isDynamique = c0531g.isDynamique();
        if (c0531g.f979h != null) {
            Iterator it = c0531g.f979h.iterator();
            while (it.hasNext()) {
                gc gcVar = (gc) it.next();
                ajouter(c0531g.construireNomChampPourConteneur(gcVar), gcVar);
            }
        }
        if (this.Nc == null) {
            this.Nc = new ArrayList();
        }
        this.Nc.add(max, c0531g);
        C1286d ui = c0531g.getUI();
        this.Cc.addView(c0531g.getUI(), max, new LayoutParams(-1, -2));
        ui.setOnTouchListener(this);
        if (!isDynamique) {
            this.Qc++;
        } else if (m1538b() > 1) {
            m1537a(c0531g.f982k);
        }
        if (this.Hc >= max) {
            this.Hc++;
        }
        return max;
    }

    /* renamed from: a */
    private final void m1537a(int i) {
        gc gcVar = null;
        C0489p c0489p = (C0489p) getPere();
        while (c0489p != null) {
            gc gcVar2 = (gc) c0489p.checkType(gc.class);
            if (gcVar2 != null) {
                gcVar = gcVar2;
                break;
            } else {
                c0489p = (C0489p) c0489p.getPere();
                gcVar = gcVar2;
            }
        }
        int[] iArr = new int[]{_getLocalY() + (_getHauteur() + i)};
        if (gcVar != null) {
            if (gcVar instanceof C0504y) {
                ((C0504y) gcVar).parcourirChamp(new C1285c(this, (View) getCompConteneur().getParent(), i, iArr), false);
            }
            gcVar.adapterHauteurPourZML(this, iArr[0] + C1511l.m10532d(16.0f, 2));
        }
        setTailleChamp(_getLargeur(), r3, 0);
    }

    static /* synthetic */ long access$1008() {
        long j = Pc;
        Pc = 1 + j;
        return j;
    }

    /* renamed from: b */
    private final int m1538b() {
        return this.Nc != null ? this.Nc.size() : 0;
    }

    /* renamed from: c */
    private final int m1539c() {
        return this.Hc == -1 ? -1 : this.Hc + 1;
    }

    /* renamed from: d */
    private final boolean m1540d() {
        return this.Nc != null ? this.Nc.isEmpty() : true;
    }

    /* renamed from: z */
    private static String m1541z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 61;
                    break;
                case 1:
                    i2 = 70;
                    break;
                case 2:
                    i2 = 36;
                    break;
                case 3:
                    i2 = 77;
                    break;
                default:
                    i2 = 94;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1542z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 94);
        }
        return toCharArray;
    }

    public void ajouter(String str, C0489p c0489p) {
        this.Ec.m8353a(str, c0489p);
    }

    protected final void ajouterLigne(C0531g c0531g) {
        m1536a(c0531g, m1538b());
    }

    public final int ajouterLigneDynamique() {
        int nbLignesDynamiques = getNbLignesDynamiques();
        return insererLigneDynamique(nbLignesDynamiques > 0 ? nbLignesDynamiques + this.Gc : this.Gc);
    }

    public void appliquerAncrage(int i, int i2, int i3, int i4, int i5) {
        this.Ec.mo3525a(i, 0, 0, 0, i5);
    }

    protected void appliquerCadreInterne(C1110m c1110m) {
        this.Fc = c1110m;
    }

    protected void appliquerCouleur(int i) {
    }

    protected void appliquerCouleurFond(int i) {
        if (this.Fc != null) {
            this.Fc.mo3385d(C1031a.m7467k(i));
            repeindreChamp();
        }
    }

    protected void appliquerCouleurFondTransparent() {
        if (this.Fc != null) {
            this.Fc.mo3385d(0);
            repeindreChamp();
        }
    }

    protected void appliquerTransparent() {
    }

    public boolean canHandleHeightAnchoredToContentChildren() {
        return true;
    }

    protected LigneZMLDynamique creerLigneDynamique() {
        return null;
    }

    public boolean estNavigable(boolean z) {
        return false;
    }

    public void finInit() {
        this.Ec.m8366h();
        if (this.Oc != null) {
            this.Oc.m8936d();
        }
        super.finInit();
    }

    public WDObjet get(int i) {
        return (WDObjet) this.Nc.get(m1535a(i, false));
    }

    public View getCompPrincipal() {
        return this.Cc;
    }

    public xc getConteneurManager() {
        return this.Ec;
    }

    public WDObjet getElement(String str) {
        WDObjet filsDirect = getFilsDirect(str);
        if (filsDirect != null) {
            return filsDirect;
        }
        if (this.Oc != null) {
            filsDirect = this.Oc.m1534a(str);
            if (filsDirect != null) {
                return filsDirect;
            }
        }
        return super.getElement(str);
    }

    public C0489p getFils(String str) {
        return this.Ec.m8344a(str, true);
    }

    public C0489p getFilsDirect(String str) {
        return this.Ec.m8344a(str, false);
    }

    public final int getIndicePremiereLigneDynamique() {
        if (this.Nc != null) {
            Iterator it = this.Nc.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (((C0531g) it.next()).isDynamique()) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    public Iterator getLstFils() {
        return this.Ec.m8369k();
    }

    public final int getNbLignesDynamiques() {
        return m1538b() - getNbLignesStatiques();
    }

    public final int getNbLignesStatiques() {
        return this.Qc;
    }

    public String getNomType() {
        return C0745b.m3220a(Rc[6], new String[0]);
    }

    public WDEntier4 getOccurrence() {
        return new WDEntier4(m1538b());
    }

    public WDObjet getValeur() {
        return new WDEntier4(m1539c());
    }

    public final int insererLigneDynamique(int i) {
        int i2 = this.Gc;
        int nbLignesDynamiques = getNbLignesDynamiques();
        nbLignesDynamiques = nbLignesDynamiques > 0 ? nbLignesDynamiques + this.Gc : this.Gc;
        if (i < i2) {
            String[] strArr = new String[2];
            strArr[0] = C0745b.m3222b(Rc[3], String.valueOf(i));
            strArr[1] = C0745b.m3222b(Rc[0], getName(), String.valueOf(i2), String.valueOf(nbLignesDynamiques));
            WDErreurManager.m2886a(strArr);
        }
        int a = C0725i.m3011a(i);
        if (getNbLignesDynamiques() >= 300) {
            WDErreurManager.m2883a(C0745b.m3222b(Rc[1], getName(), String.valueOf(300)));
        }
        boolean isFenetreCree = this.l.isFenetreCree();
        try {
            this.l.setFenetreCree(false);
            C0531g creerLigneDynamique = creerLigneDynamique();
            if (creerLigneDynamique == null) {
                WDErreurManager.m2883a(C0745b.m3222b(Rc[2], getName()));
            }
            creerLigneDynamique.initialiserObjet();
            i2 = _getLargeur() - _getLargeurInitiale();
            if (!(i2 == 0 || creerLigneDynamique.h == null || creerLigneDynamique.h.isEmpty())) {
                Iterator it = creerLigneDynamique.h.iterator();
                while (it.hasNext()) {
                    ((gc) it.next()).ancrer(i2, 0, 0, 0, 0);
                }
            }
            this.l.setFenetreCree(isFenetreCree);
            nbLignesDynamiques = m1536a(creerLigneDynamique, a);
            creerLigneDynamique.m8934b();
            creerLigneDynamique.m8935c();
            creerLigneDynamique.m8936d();
            return nbLignesDynamiques + 1;
        } catch (Throwable th) {
            this.l.setFenetreCree(isFenetreCree);
        }
    }

    public void installerChamp(nb nbVar) {
    }

    public boolean isChampFocusable() {
        return false;
    }

    public boolean isConteneur() {
        return true;
    }

    public void majOrdreNavigation(C0508h c0508h) {
        this.Ec.m8349a(c0508h);
    }

    public void majPlan(int i) {
        super.majPlan(i);
        this.Ec.m8356b(i);
    }

    public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
    }

    public void onConfigurationChanged(Activity activity, Configuration configuration) {
    }

    public void onCreate(Activity activity, Bundle bundle) {
        if (this.Oc != null) {
            int i = this.Oc.k;
            if (i != 0 && getNbLignesStatiques() > 0) {
                m1537a(-i);
            }
        }
    }

    public void onDestroy(Activity activity) {
    }

    public void onFinish(Activity activity) {
    }

    public void onLowMemory(Activity activity) {
    }

    public void onNewIntent(Activity activity, Intent intent) {
    }

    public void onPause(Activity activity) {
    }

    public void onResume(Activity activity) {
    }

    public void onSaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onSelectOption(Activity activity, MenuItem menuItem) {
    }

    public void onStart(Activity activity) {
    }

    public void onStop(Activity activity) {
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!(view instanceof C1286d) || this.d != 0) {
            return super.onTouch(view, motionEvent);
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            if (((C0531g) this.Nc.get(this.Cc.indexOfChild(view))).isSelectionAutorisee()) {
                if (this.Jc == null) {
                    this.Jc = new Rect();
                }
                view.getHitRect(this.Jc);
                view.setSelected(true);
            }
            super.onTouch(view, motionEvent);
            return true;
        }
        boolean z = this.Jc != null && this.Jc.contains(view.getLeft() + ((int) motionEvent.getX()), view.getTop() + ((int) motionEvent.getY()));
        if (action == 1 && z) {
            view.playSoundEffect(0);
            view.post(new C1283a(this));
        }
        if (!(action == 2 && z)) {
            this.Jc = null;
            view.setSelected(false);
        }
        return super.onTouch(view, motionEvent);
    }

    public void parcourirChamp(C0546j c0546j, boolean z) {
        this.Ec.m8350a(c0546j, z);
    }

    public void parcourirObjetAPCode(C0546j c0546j, boolean z) {
        this.Ec.m8358b(c0546j, z);
    }

    protected void postInit() {
        this.Ec.m8365g();
        if (this.Oc != null) {
            this.Oc.m8934b();
        }
        this.Ec.m8362d();
        if (this.Oc != null) {
            this.Oc.m8935c();
        }
        super.postInit();
    }

    public void raz(boolean z) {
    }

    public void release() {
        super.release();
        this.Cc = null;
        if (this.Ec != null) {
            this.Ec.m8368j();
            this.Ec = null;
        }
        if (this.Nc != null) {
            Iterator it = this.Nc.iterator();
            while (it.hasNext()) {
                ((C0531g) it.next()).release();
            }
            this.Nc.clear();
            this.Nc = null;
        }
        if (this.Oc != null) {
            this.Oc.release();
            this.Oc = null;
        }
        this.Lc = null;
        this.Jc = null;
    }

    public void removeObjAPCode(C0489p c0489p) {
        this.Ec.m8351a(c0489p);
    }

    public void screenToSource(String str) {
        super.screenToSource(str);
        this.Ec.m8352a(str);
    }

    protected final void setCouleurSeparateur(int i) {
        this.Kc.setColor(C1031a.m7467k(i));
    }

    public void setEtat(int i) {
        super.setEtat(i);
        switch (i) {
            case 0:
                this.Cc.setEnabled(true);
                break;
            case 1:
            case 4:
                this.Cc.setEnabled(false);
                break;
            default:
                return;
        }
        this.d = i;
    }

    public void setFenetre(C0508h c0508h) {
        super.setFenetre(c0508h);
        ((WDFenetre) this.l).ajouterEcouteurActivite(this);
    }

    protected final void setIndiceModeleLigneDynamique(int i) {
        this.Gc = i;
    }

    protected final void setStyleSelection(C1110m c1110m) {
        this.Dc = c1110m;
        if (c1110m != null && !(c1110m instanceof C1113c) && C1031a.m7448a(c1110m.mo3387l()) == 0) {
            this.N &= -2;
        }
    }

    public boolean setTailleChamp(int i, int i2, int i3) {
        this.Ec.m8347a((i3 & 2) > 0 ? i - this.U : i - _getLargeur(), 0, i3);
        return super.setTailleChamp(i, i2, i3);
    }

    protected void setTauxAncrage(int i, int i2, int i3, int i4) {
        super.setTauxAncrage(i, i2, i3, i4);
        this.ob = 0;
    }

    public void setValeur(int i) {
        if (i <= 0 || i > m1538b()) {
            this.Hc = -1;
        } else {
            this.Hc = i - 1;
        }
    }

    public void setValeur(WDObjet wDObjet) {
        setValeur(wDObjet.getInt());
    }

    public void sourceToScreen(String str) {
        super.sourceToScreen(str);
        this.Ec.m8361c(str);
    }

    public final void supprimerLigneDynamique(int i) {
        if (i == -1) {
            if (this.Hc != -1) {
                i = m1539c();
            } else {
                return;
            }
        }
        int a = m1535a(i, true);
        C0531g c0531g = (C0531g) this.Nc.get(a);
        View ui = c0531g.getUI();
        if (m1538b() == 1) {
            m1537a(-(ui.m8939c() - this.Oc.k));
        } else {
            m1537a(-ui.m8939c());
        }
        this.Cc.removeView(ui);
        this.Nc.remove(a);
        C0531g.access$700(c0531g);
        c0531g.release();
        if (this.Hc > a) {
            this.Hc--;
        } else if (this.Hc == a) {
            this.Hc = -1;
        }
    }

    public final void supprimerLignesDynamiques() {
        if (!m1540d() && getNbLignesDynamiques() != 0) {
            int indicePremiereLigneDynamique = getIndicePremiereLigneDynamique() + 1;
            for (int nbLignesDynamiques = (getNbLignesDynamiques() + indicePremiereLigneDynamique) - 1; nbLignesDynamiques >= indicePremiereLigneDynamique; nbLignesDynamiques--) {
                supprimerLigneDynamique(nbLignesDynamiques);
            }
        }
    }

    public void terminerInitialisation() {
        super.terminerInitialisation();
        this.Oc = creerLigneDynamique();
        if (this.Oc != null) {
            this.Oc.initialiserObjet();
        }
    }
}
