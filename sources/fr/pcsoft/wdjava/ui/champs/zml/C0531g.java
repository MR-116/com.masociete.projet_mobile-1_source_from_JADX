package fr.pcsoft.wdjava.ui.champs.zml;

import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.ui.C0489p;
import fr.pcsoft.wdjava.ui.activite.C1056i;
import fr.pcsoft.wdjava.ui.champs.C0530v;
import fr.pcsoft.wdjava.ui.champs.bouton.C0529a;
import fr.pcsoft.wdjava.ui.champs.fc;
import fr.pcsoft.wdjava.ui.champs.gc;
import fr.pcsoft.wdjava.ui.champs.image.C0520c;
import fr.pcsoft.wdjava.ui.utils.C1503b;
import fr.pcsoft.wdjava.ui.utils.C1511l;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: fr.pcsoft.wdjava.ui.champs.zml.g */
public abstract class C0531g extends C0489p implements C0530v {
    /* renamed from: d */
    private static final int f974d = -1;
    /* renamed from: e */
    private static final int f975e = 1;
    /* renamed from: f */
    private static final int f976f = 0;
    /* renamed from: z */
    private static final String[] f977z = new String[]{C0531g.m1532z(C0531g.m1533z("\u0019h\u00101m\fo\u0002=a\u0016q\u001f:z\u001d|\u0012=z\u001dqd")), C0531g.m1532z(C0531g.m1533z("{j\u00139o\u0016j\u0013+x\u0019b\u0013!|\u0007\u001d")), C0531g.m1532z(C0531g.m1533z("{z\u000f$k")), C0531g.m1532z(C0531g.m1533z("{~\u0004;~\ng\u0013 k\u0007b\u00137z\r|\u0013+}\u001d{\u001a1")), C0531g.m1532z(C0531g.m1533z("{`\u0019+x\u0019b\u0013!|")), C0531g.m1532z(C0531g.m1533z("{j\u00139o\u0016j\u0013+x\u0019b\u0013!|\u0007\u001c")), C0531g.m1532z(C0531g.m1533z("{b\u001f3`\u001dq\f9b"))};
    /* renamed from: g */
    private C1286d f978g = null;
    /* renamed from: h */
    protected LinkedList<gc> f979h = null;
    /* renamed from: i */
    private boolean f980i = false;
    /* renamed from: j */
    private int f981j = -1;
    /* renamed from: k */
    protected int f982k = 0;
    final WDZoneMultiligne this$0;

    public C0531g(WDZoneMultiligne wDZoneMultiligne) {
        this.this$0 = wDZoneMultiligne;
    }

    /* renamed from: a */
    private final void m1530a() {
        if (this.f979h != null) {
            Iterator it = this.f979h.iterator();
            while (it.hasNext()) {
                this.this$0.Ec.m8359b(construireNomChampPourConteneur((gc) it.next()));
            }
        }
    }

    /* renamed from: a */
    private void m1531a(int i) {
        if (this.f978g != null) {
            int c = i - this.f978g.m8939c();
            if (c != 0) {
                this.f978g.setMinimumHeight(i);
                if (this.f979h != null) {
                    Iterator it = this.f979h.iterator();
                    while (it.hasNext()) {
                        ((gc) it.next()).ancrer(0, c, 0, 0, 0);
                    }
                }
                if (this.this$0.isFenetreCree() && this.f978g.getVisibility() == 0) {
                    this.this$0.m1537a(c);
                }
            }
        }
    }

    static void access$700(C0531g c0531g) {
        c0531g.m1530a();
    }

    /* renamed from: z */
    private static String m1532z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 88;
                    break;
                case 1:
                    i2 = 46;
                    break;
                case 2:
                    i2 = 86;
                    break;
                case 3:
                    i2 = 116;
                    break;
                default:
                    i2 = 46;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1533z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 46);
        }
        return toCharArray;
    }

    /* renamed from: a */
    gc m1534a(String str) {
        if (this.f979h != null) {
            String o = C0808l.m4057o(str.toLowerCase());
            Iterator it = this.f979h.iterator();
            while (it.hasNext()) {
                gc gcVar = (gc) it.next();
                String name = gcVar.getName();
                if (name.length() == o.length() && o.equals(C0808l.m4057o(name.toLowerCase()))) {
                    return gcVar;
                }
            }
        }
        return null;
    }

    protected final void ajouterChamp(gc gcVar) {
        if (this.f979h == null) {
            this.f979h = new LinkedList();
        }
        gcVar.addChampListener(this);
        gcVar.setPere(this.this$0);
        this.f979h.add(gcVar);
        if (this.f978g != null) {
            this.f978g.addView(gcVar.getCompConteneur());
        }
    }

    public abstract String construireNomChampPourConteneur(gc gcVar);

    public WDObjet getElement(String str) {
        WDObjet a = m1534a(str);
        return a != null ? a : super.getElement(str);
    }

    public WDEntier4 getHauteur() {
        return new WDEntier4((double) C1511l.m10515a(this.f978g != null ? (float) this.f978g.m8939c() : 0.0f, 1, this.this$0.getDisplayUnit()));
    }

    public WDEntier4 getHauteurInitiale() {
        return new WDEntier4((double) C1511l.m10515a((float) this.f982k, 1, this.this$0.getDisplayUnit()));
    }

    public String getName() {
        return "";
    }

    public String getNomType() {
        return C0745b.m3220a(f977z[6], new String[0]);
    }

    public final C1286d getUI() {
        return this.f978g;
    }

    public WDObjet getValeur() {
        String[] strArr = new String[2];
        strArr[0] = C0745b.m3222b(f977z[5], getNomType());
        strArr[1] = C0745b.m3222b(f977z[4], getNomType());
        WDErreurManager.m2886a(strArr);
        return null;
    }

    public WDBooleen getVisible() {
        return new WDBooleen(isVisible());
    }

    public WDBooleen getVisibleInitial() {
        return new WDBooleen(this.f980i);
    }

    public void initialiserObjet() {
        super.initialiserObjet();
        if (this.this$0.Oc != this) {
            this.f978g = new C1286d(this.this$0, C1056i.m7562a());
        }
    }

    public abstract boolean isDynamique();

    public boolean isEvaluable() {
        return false;
    }

    public boolean isSelectionAutorisee() {
        switch (this.f981j) {
            case -1:
                if (this.f979h != null) {
                    Iterator it = this.f979h.iterator();
                    while (it.hasNext()) {
                        gc gcVar = (gc) it.next();
                        if (gcVar.checkType(C0529a.class) == null && gcVar.checkType(C0520c.class) == null && gcVar.isChampEditableDansZR()) {
                            return false;
                        }
                    }
                }
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }

    public final boolean isVisible() {
        return this.f978g != null && this.f978g.getVisibility() == 0;
    }

    public void onModification(fc fcVar) {
    }

    public void onPositionChanged(fc fcVar, int i, int i2, int i3) {
    }

    public boolean onPreferredSizeChanged(fc fcVar, int i, int i2) {
        if (i2 == 0) {
            return false;
        }
        int a = C1503b.m10422a(this.f979h, true);
        if (a != 0) {
            a += this.f982k;
            if (a < this.f982k) {
                a = this.f982k;
            }
            m1531a(a);
        }
        return true;
    }

    public void onSizeChanged(fc fcVar, int i, int i2, int i3) {
    }

    public void onVisibilityChanged(fc fcVar, boolean z) {
    }

    public void release() {
        super.release();
        if (this.f978g != null) {
            this.f978g.setOnTouchListener(null);
            this.f978g = null;
        }
        if (this.f979h != null) {
            this.f979h.clear();
            this.f979h = null;
        }
    }

    public void setHauteur(int i) {
        m1531a(C1511l.m10532d((float) i, this.this$0.getDisplayUnit()));
    }

    public void setHauteurInitiale(int i) {
        if (isFenetreCree()) {
            WDErreurManager.m2883a(C0745b.m3222b(f977z[3], EWDPropriete.PROP_HAUTEURINITIALE.getNom()));
        }
        this.f982k = C1511l.m10532d((float) i, this.this$0.getDisplayUnit());
        setHauteur(i);
    }

    protected final void setModeSelection(int i) {
        this.f981j = i;
    }

    public void setValeur(WDObjet wDObjet) {
        String[] strArr = new String[2];
        strArr[0] = C0745b.m3222b(f977z[1], getNomType());
        strArr[1] = C0745b.m3222b(f977z[2], getName(), getNomType()) + " " + C0745b.m3222b(f977z[0], new String[0]);
        WDErreurManager.m2886a(strArr);
    }

    public void setVisible(boolean z) {
        if (this.f978g != null) {
            boolean isVisible = isVisible();
            this.f978g.setVisibility(z ? 0 : 8);
            if (z != isVisible) {
                this.this$0.m1537a((z ? 1 : -1) * this.f978g.m8939c());
            }
        }
    }

    public void setVisibleInitial(boolean z) {
        if (isFenetreCree()) {
            WDErreurManager.m2883a(C0745b.m3222b(f977z[3], EWDPropriete.PROP_VISIBLEINITIAL.getNom()));
        }
        this.f980i = z;
        setVisible(z);
    }
}
