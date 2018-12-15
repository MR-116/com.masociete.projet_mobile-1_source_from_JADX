package fr.pcsoft.wdjava.ui.champs.zr;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.application.C0535j;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.ui.activite.C1056i;
import fr.pcsoft.wdjava.ui.champs.dc;
import fr.pcsoft.wdjava.ui.champs.gc;
import fr.pcsoft.wdjava.ui.champs.image.C0520c;
import fr.pcsoft.wdjava.ui.champs.zr.WDAbstractZRRenderer.AbstractRepetitionView;
import fr.pcsoft.wdjava.ui.p064a.C1032b;
import fr.pcsoft.wdjava.ui.p072i.C1431a;
import fr.pcsoft.wdjava.ui.p072i.C1434f;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: fr.pcsoft.wdjava.ui.champs.zr.e */
public class C1294e extends WDAbstractZRRenderer implements C0535j {
    /* renamed from: i */
    private static final int f3846i = 5;
    /* renamed from: z */
    private static final String f3847z = C1294e.m9065z(C1294e.m9066z("\u0005]\bStdA\u001fCwdL\u000e\u0006@\u0016\b\u000fC:'G\u0019T7X\u0004H~dÈKJ{dK\u000eJv1D\u000e\b"));
    /* renamed from: f */
    private int f3848f = 5;
    /* renamed from: g */
    protected C1431a f3849g;
    /* renamed from: h */
    private HashMap<String, C1305o> f3850h = null;
    /* renamed from: j */
    protected C1307p f3851j = null;
    /* renamed from: k */
    protected int f3852k = C1032b.f2968a;

    public C1294e(WDZoneRepetee wDZoneRepetee, boolean z) {
        super(wDZoneRepetee);
        if (z) {
            this.f3849g = new C1431a();
            WDProjet.getInstance().ajouterEcouteurProjet(this);
        }
    }

    /* renamed from: k */
    private final void m9064k() {
        if (this.f3849g != null) {
            if (!this.b.isHorizontale() && this.f3848f >= 5) {
                this.f3848f = Math.max(5, this.b.getNbColonneZR());
            }
            int firstVisibleElement = this.b.getFirstVisibleElement();
            int lastVisibleElement = this.b.getLastVisibleElement();
            this.f3849g.m10061b(Math.max(0, firstVisibleElement - this.f3848f), lastVisibleElement + this.f3848f);
        }
    }

    /* renamed from: z */
    private static String m9065z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 68;
                    break;
                case 1:
                    i2 = 40;
                    break;
                case 2:
                    i2 = 107;
                    break;
                case 3:
                    i2 = 38;
                    break;
                default:
                    i2 = 26;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m9066z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 26);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public AbstractRepetitionView mo3543a(int i, View view) {
        if (view != null) {
            return (db) view;
        }
        boolean isAvecRupture = this.b.isAvecRupture();
        AbstractRepetitionView dbVar = new db(this, C1056i.m7562a());
        if (this.f3851j.getParent() == null) {
            this.f3851j.setVisibility(8);
            this.f3851j.setDescendantFocusability(393216);
            ((ViewGroup) this.b.getCompConteneur()).addView(this.f3851j);
            C1315x editor = this.b.getEditor();
            if (editor.mo3605h() == 1 && editor.mo3603b().getParent() == null) {
                dbVar.mo3541c().addView(editor.mo3603b(), new LayoutParams(-1, -1));
            }
            if (isAvecRupture) {
                Iterator ruptureIterator = this.b.getRuptureIterator();
                if (ruptureIterator != null) {
                    while (ruptureIterator.hasNext()) {
                        C1305o c1305o = (C1305o) this.f3850h.get(((WDRuptureZR) ruptureIterator.next()).getName());
                        if (c1305o != null && c1305o.getParent() == null) {
                            c1305o.setVisibility(8);
                            ((ViewGroup) this.b.getCompConteneur()).addView(c1305o);
                        }
                    }
                }
            }
        }
        dbVar.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
        return dbVar;
    }

    /* renamed from: a */
    protected sb mo3544a(Context context, int[] iArr) {
        return null;
    }

    /* renamed from: a */
    public void mo3545a() {
        super.mo3545a();
        C1315x editor = this.b.getEditor();
        if (this.f3849g != null && editor.m9258g().checkType(C0520c.class) == null) {
            C1434f b = this.f3849g.m10059b(editor.m9261j());
            if (b != null) {
                Rect rect = new Rect();
                editor.mo3601a(rect);
                b.m10083a(rect);
            }
        }
    }

    /* renamed from: a */
    public void mo3546a(int i) {
        super.mo3546a(i);
        if (this.f3849g != null && this.b.isUpdateCacheOnDataSetChanged()) {
            this.f3849g.m10063c(i);
        }
    }

    /* renamed from: a */
    public void mo3547a(int i, int i2) {
        super.mo3547a(i, i2);
        if (this.f3851j != null) {
            this.f3851j.measure(i + 1073741824, i2 + 1073741824);
            this.f3851j.layout(0, 0, i, i2);
        }
        if (this.b.isAvecRupture()) {
            Iterator ruptureIterator = this.b.getRuptureIterator();
            while (ruptureIterator.hasNext()) {
                WDRuptureZR wDRuptureZR = (WDRuptureZR) ruptureIterator.next();
                View view = (View) this.f3850h.get(wDRuptureZR.getName());
                if (view != null) {
                    view.measure(i + 1073741824, wDRuptureZR.getHauteurRupture() + 1073741824);
                    view.layout(0, 0, i, wDRuptureZR.getHauteurRupture());
                }
            }
        }
        if (this.f3849g != null) {
            this.f3849g.m10062c();
            m9064k();
        }
    }

    /* renamed from: a */
    public void mo3548a(int i, int i2, boolean z) {
        super.mo3548a(i, i2, z);
        if (z && this.f3849g != null) {
            this.f3849g.m10058a(i, i2);
        }
    }

    /* renamed from: a */
    public void mo3549a(gc gcVar, EWDPropriete eWDPropriete, WDObjet wDObjet) {
        super.mo3549a(gcVar, eWDPropriete, wDObjet);
        if (this.b.isPropNeedUpdateLayout(eWDPropriete)) {
            gcVar.updateLayout();
        }
        if (this.f3849g != null) {
            this.f3849g.m10069h();
        }
        this.b.updateContenu();
    }

    /* renamed from: a */
    protected void m9074a(ec ecVar, int i, AbstractRepetitionView abstractRepetitionView) {
        this.b.affecterAttributVersPropChamp(ecVar, null);
    }

    /* renamed from: a */
    public void mo3550a(boolean z) {
        super.mo3550a(z);
        C1315x editor = this.b.getEditor();
        gc g = editor.m9258g();
        gc cloneForEdition = g.getCloneForEdition();
        int j = editor.m9261j();
        if (cloneForEdition != null) {
            ec ecVar = (ec) this.b.getDataModel().mo3593b(this.b.convertirIndiceVueVersModele(j));
            if (ecVar == null) {
                C0691a.m2856a(f3847z);
                return;
            }
            if (this.f3849g != null && cloneForEdition.checkType(C0520c.class) == null) {
                C1434f b = this.f3849g.m10059b(j);
                if (b != null) {
                    Rect rect = new Rect();
                    editor.mo3601a(rect);
                    if (z) {
                        b.m10083a(rect);
                    } else {
                        b.m10092e();
                    }
                }
            }
            Iterator iterateurAttributs = g.getIterateurAttributs();
            if (iterateurAttributs != null) {
                while (iterateurAttributs.hasNext()) {
                    dc dcVar = (dc) iterateurAttributs.next();
                    dcVar.affecterValeurChampAssocie(cloneForEdition, ecVar.m9107b(dcVar.getIndiceAttribut()));
                }
            }
            if (!(cloneForEdition._getLargeur() == g._getLargeur() && cloneForEdition._getHauteur() == g._getHauteur())) {
                cloneForEdition.setTailleChamp(g._getLargeur(), g._getHauteur(), 0);
            }
            if (!(cloneForEdition._getX() == g._getX() && cloneForEdition._getY() == g._getY())) {
                cloneForEdition.setPositionChamp(g._getX(), g._getY(), 0);
            }
            cloneForEdition.appliquerVisibilite(true);
        }
    }

    /* renamed from: b */
    public void mo3551b(int i, int i2) {
        super.mo3551b(i, i2);
        if (this.f3849g != null && this.b.isUpdateCacheOnDataSetChanged()) {
            this.f3849g.m10058a(i, i2);
        }
    }

    /* renamed from: c */
    public void mo3552c() {
        super.mo3552c();
        if (this.f3849g != null) {
            this.f3849g.m10069h();
        }
    }

    /* renamed from: c */
    public void mo3553c(int i) {
        super.mo3553c(i);
        if (this.f3849g != null && this.b.isUpdateCacheOnDataSetChanged()) {
            this.f3849g.m10065d(i);
        }
    }

    /* renamed from: d */
    public void mo3554d() {
        super.mo3554d();
        if (this.f3849g != null && this.b.isUpdateCacheOnDataSetChanged()) {
            this.f3849g.m10062c();
        }
    }

    /* renamed from: d */
    public void mo3555d(int i) {
        super.mo3555d(i);
        if (this.f3849g != null && this.b.isUpdateCacheOnDataSetChanged()) {
            this.f3849g.m10057a(i);
        }
    }

    /* renamed from: e */
    public void mo3556e(int i) {
        super.mo3556e(i);
        if (this.f3849g == null) {
            return;
        }
        if (i >= 0) {
            this.f3849g.m10058a(i, i);
        } else {
            this.f3849g.m10069h();
        }
    }

    /* renamed from: f */
    public void mo3557f() {
        super.mo3557f();
        if (this.f3849g != null && this.b.isUpdateCacheOnDataSetChanged()) {
            this.f3849g.m10069h();
        }
    }

    /* renamed from: g */
    public void mo3558g() {
        super.mo3558g();
        this.f3851j = new C1307p(this, C1056i.m7562a());
        this.f3851j.m9172a(this.b.getChampIterator());
        if (this.b.isAvecRupture()) {
            this.f3850h = new HashMap();
            Iterator ruptureIterator = this.b.getRuptureIterator();
            while (ruptureIterator.hasNext()) {
                WDRuptureZR wDRuptureZR = (WDRuptureZR) ruptureIterator.next();
                C1305o c1305o = new C1305o(this, C1056i.m7562a());
                c1305o.m9172a(wDRuptureZR.getChampIterator());
                this.f3850h.put(wDRuptureZR.getName(), c1305o);
            }
        }
    }

    /* renamed from: h */
    public void mo3559h() {
        super.mo3559h();
        m9064k();
    }

    /* renamed from: i */
    public void mo3560i() {
        super.mo3560i();
        if (this.f3851j != null) {
            this.f3851j.m9174d();
            this.f3851j = null;
        }
        if (this.f3849g != null) {
            this.f3849g.m10064d();
            this.f3849g = null;
        }
        WDProjet.getInstance().supprimerEcouteurProjet(this);
    }

    /* renamed from: j */
    public final C1431a m9086j() {
        return this.f3849g;
    }

    /* renamed from: l */
    public final C1307p m9087l() {
        return this.f3851j;
    }

    public void onChangementTitre(String str) {
    }

    public void onCharsetChanged(String str) {
    }

    public void onFermetureProjet() {
    }

    public void onLowMemory() {
        if (this.f3849g == null) {
            return;
        }
        if (this.f3848f > 1) {
            this.f3848f /= 2;
            this.f3849g.m10060b();
            m9064k();
        } else if (this.f3849g.m10067f()) {
            this.f3849g.m10068g();
            m9064k();
        } else {
            if (this.f3849g != null) {
                this.f3849g.m10064d();
                this.f3849g = null;
            }
            this.b.repeindreChamp();
        }
    }
}
