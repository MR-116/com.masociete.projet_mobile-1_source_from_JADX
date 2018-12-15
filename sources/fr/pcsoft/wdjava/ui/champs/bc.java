package fr.pcsoft.wdjava.ui.champs;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.allocation.C0611a;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.erreur.WDException;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.core.types.cb;
import fr.pcsoft.wdjava.ui.C0489p;
import fr.pcsoft.wdjava.ui.p064a.C1031a;
import fr.pcsoft.wdjava.ui.p064a.C1032b;
import fr.pcsoft.wdjava.ui.p064a.C1034d;
import fr.pcsoft.wdjava.ui.p079e.C1397c;
import fr.pcsoft.wdjava.ui.p079e.C1399b;
import fr.pcsoft.wdjava.ui.p079e.C1400d;
import fr.pcsoft.wdjava.ui.p080h.C1426i;
import fr.pcsoft.wdjava.ui.style.C1494g;
import fr.pcsoft.wdjava.ui.style.C1498d;
import fr.pcsoft.wdjava.ui.utils.C1511l;

public class bc extends C0489p implements jb {
    /* renamed from: z */
    private static final String[] f3487z = new String[]{m8257z(m8258z("G>=KS!-8EN07")), m8257z(m8258z("G&-\\X")), m8257z(m8258z("G<;S^,39\\B'=8CS*7+X\\&>1")), m8257z(m8258z("G7 MI"))};
    /* renamed from: d */
    protected String f3488d = null;
    /* renamed from: e */
    protected int f3489e = -1;
    /* renamed from: f */
    private String f3490f;
    /* renamed from: g */
    private C1494g f3491g = null;
    final ic this$0;

    public bc(ic icVar, String str) {
        this.this$0 = icVar;
        this.f3490f = str;
    }

    public bc(ic icVar, String str, String str2) {
        this.this$0 = icVar;
        this.f3490f = str;
        this.f3488d = str2;
    }

    /* renamed from: z */
    private static String m8257z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 100;
                    break;
                case 1:
                    i2 = 114;
                    break;
                case 2:
                    i2 = 116;
                    break;
                case 3:
                    i2 = 12;
                    break;
                default:
                    i2 = 29;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m8258z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 29);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public String m8259a(boolean z) {
        if (!z) {
            return this.f3490f;
        }
        try {
            return C1426i.m10040b(this.f3490f);
        } catch (WDException e) {
            throw e;
        }
    }

    /* renamed from: a */
    public void m8260a(int i, Object obj) {
        try {
            if (this.f3491g == null) {
                this.f3491g = new C1498d();
            }
            this.f3491g.mo3802b(i, obj);
        } catch (WDException e) {
            throw e;
        }
    }

    /* renamed from: a */
    public void mo3393a(int i, boolean z) {
        this.f3489e = i;
    }

    /* renamed from: b */
    public int mo3394b() {
        return this.f3489e;
    }

    /* renamed from: b */
    public Object m8263b(int i) {
        try {
            return this.f3491g != null ? this.f3491g.mo3801b(i, false) : null;
        } catch (WDException e) {
            throw e;
        }
    }

    /* renamed from: c */
    public Object m8264c() {
        return null;
    }

    /* renamed from: d */
    public String m8265d() {
        try {
            return this.f3488d == null ? m8259a(true) : this.f3488d;
        } catch (WDException e) {
            throw e;
        }
    }

    /* renamed from: e */
    public final C1399b m8266e() {
        return (C1399b) m8263b(4);
    }

    /* renamed from: f */
    public int m8267f() {
        Integer num = (Integer) m8263b(10);
        return num == null ? -1 : num.intValue();
    }

    /* renamed from: g */
    public C1034d m8268g() {
        return (C1034d) m8263b(2);
    }

    public WDEntier4 getCouleur() {
        C1032b c1032b = (C1032b) m8263b(2);
        if (c1032b == null) {
            return this.this$0.getCouleur();
        }
        try {
            return new WDEntier4(c1032b.mo3317d());
        } catch (WDException e) {
            throw e;
        }
    }

    public WDEntier4 getCouleurFond() {
        C1032b c1032b = (C1032b) m8263b(3);
        if (c1032b == null) {
            return this.this$0.getCouleurFond();
        }
        try {
            return new WDEntier4(c1032b.mo3317d());
        } catch (WDException e) {
            throw e;
        }
    }

    public WDEntier4 getEtat() {
        erreurAppelPropriete(C0745b.m3219a(f3487z[3]));
        return null;
    }

    public WDEntier4 getHauteur() {
        Integer num = (Integer) m8263b(10);
        if (num != null) {
            return new WDEntier4((double) C1511l.m10515a((float) num.intValue(), 1, this.this$0.getDisplayUnit()));
        }
        try {
            return this.this$0.getHauteur();
        } catch (WDException e) {
            throw e;
        }
    }

    public String getName() {
        return this.this$0.getNom() + "[" + (this.f3489e + 1) + "]";
    }

    public String getNomType() {
        return C0745b.m3220a(f3487z[0], new String[0]);
    }

    public WDBooleen getPoliceBarree() {
        C1397c c1397c = (C1397c) m8263b(4);
        if (c1397c != null) {
            return new WDBooleen(c1397c.mo3767h());
        }
        try {
            return this.this$0.getPoliceBarree();
        } catch (WDException e) {
            throw e;
        }
    }

    public WDBooleen getPoliceGras() {
        C1397c c1397c = (C1397c) m8263b(4);
        if (c1397c != null) {
            return new WDBooleen(c1397c.mo3762c());
        }
        try {
            return this.this$0.getPoliceGras();
        } catch (WDException e) {
            throw e;
        }
    }

    public WDBooleen getPoliceItalique() {
        C1397c c1397c = (C1397c) m8263b(4);
        if (c1397c != null) {
            return new WDBooleen(c1397c.mo3761b());
        }
        try {
            return this.this$0.getPoliceItalique();
        } catch (WDException e) {
            throw e;
        }
    }

    public WDChaine getPoliceNom() {
        C1397c c1397c = (C1397c) m8263b(4);
        if (c1397c != null) {
            return new WDChaine(c1397c.mo3763d());
        }
        try {
            return this.this$0.getPoliceNom();
        } catch (WDException e) {
            throw e;
        }
    }

    public WDBooleen getPoliceSoulignee() {
        C1397c c1397c = (C1397c) m8263b(4);
        if (c1397c != null) {
            return new WDBooleen(c1397c.mo3766g());
        }
        try {
            return this.this$0.getPoliceSoulignee();
        } catch (WDException e) {
            throw e;
        }
    }

    public WDEntier4 getPoliceTaille() {
        C1397c c1397c = (C1397c) m8263b(4);
        if (c1397c != null) {
            return new WDEntier4(C1400d.m9964a((float) c1397c.mo3760a(), this.this$0));
        }
        try {
            return this.this$0.getPoliceTaille();
        } catch (WDException e) {
            throw e;
        }
    }

    public WDBooleen getSelectionnee() {
        return new WDBooleen(this.this$0.isPositionSelectionnee(this.f3489e + 1));
    }

    public WDEntier4 getType() {
        erreurAppelPropriete(C0745b.m3219a(f3487z[1]));
        return null;
    }

    public WDObjet getValeur() {
        try {
            if (this.this$0.getGLienActive()) {
                if (this.f3488d != null) {
                    return new WDChaine(this.f3488d);
                }
            }
            return new WDChaine(m8259a(true));
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        }
    }

    public cb getValeurAffichee() {
        return new WDChaine(m8259a(true));
    }

    public WDObjet getValeurMemorisee() {
        return C0611a.m2300a(m8265d());
    }

    /* renamed from: h */
    public C1034d m8269h() {
        return (C1034d) m8263b(3);
    }

    public void prendreFocus() throws WDException {
        WDErreurManager.m2883a(C0745b.m3222b(f3487z[2], getNom().getString(), getNomType()));
    }

    public void setCouleur(int i) {
        m8260a(2, C1031a.m7469m(i));
        this.this$0.repeindreChamp();
    }

    public void setCouleurFond(int i) {
        m8260a(3, C1031a.m7469m(i));
        this.this$0.repeindreChamp();
    }

    public void setEtat(int i) {
        erreurAppelPropriete(C0745b.m3219a(f3487z[3]));
    }

    public void setHauteur(int i) {
        if (i < 0) {
            i = 0;
        }
        m8260a(10, new Integer(C1511l.m10532d((float) i, this.this$0.getDisplayUnit())));
        this.this$0.updateUIChamp();
    }

    public void setPoliceBarree(boolean z) {
        C1397c c1397c = (C1397c) m8263b(4);
        if (c1397c == null) {
            c1397c = this.this$0.getPoliceChamp();
        }
        if (z != c1397c.mo3767h()) {
            int e = c1397c.mo3764e();
            m8260a(4, C1400d.m9965a(c1397c.mo3763d(), (float) c1397c.mo3760a(), z ? e | 8 : e & -9));
            this.this$0.repeindreChamp();
        }
    }

    public void setPoliceGras(boolean z) {
        C1397c c1397c = (C1397c) m8263b(4);
        if (c1397c == null) {
            c1397c = this.this$0.getPoliceChamp();
        }
        if (z != c1397c.mo3762c()) {
            int e = c1397c.mo3764e();
            m8260a(4, C1400d.m9965a(c1397c.mo3763d(), (float) c1397c.mo3760a(), z ? e | 1 : e & -2));
            this.this$0.repeindreChamp();
        }
    }

    public void setPoliceItalique(boolean z) {
        C1397c c1397c = (C1397c) m8263b(4);
        if (c1397c == null) {
            c1397c = this.this$0.getPoliceChamp();
        }
        if (z != c1397c.mo3761b()) {
            int e = c1397c.mo3764e();
            m8260a(4, C1400d.m9965a(c1397c.mo3763d(), (float) c1397c.mo3760a(), z ? e | 2 : e & -3));
            this.this$0.repeindreChamp();
        }
    }

    public void setPoliceNom(String str) {
        C1397c c1397c = (C1397c) m8263b(4);
        if (c1397c == null) {
            c1397c = this.this$0.getPoliceChamp();
        }
        if (!str.equalsIgnoreCase(c1397c.mo3763d())) {
            m8260a(4, C1400d.m9965a(str, (float) c1397c.mo3760a(), c1397c.mo3764e()));
            this.this$0.repeindreChamp();
        }
    }

    public void setPoliceSoulignee(boolean z) {
        C1397c c1397c = (C1397c) m8263b(4);
        if (c1397c == null) {
            c1397c = this.this$0.getPoliceChamp();
        }
        if (z != c1397c.mo3766g()) {
            int e = c1397c.mo3764e();
            m8260a(4, C1400d.m9965a(c1397c.mo3763d(), (float) c1397c.mo3760a(), z ? e | 4 : e & -5));
            this.this$0.repeindreChamp();
        }
    }

    public void setPoliceTaille(int i) {
        C1397c c1397c = (C1397c) m8263b(4);
        if (c1397c == null) {
            c1397c = this.this$0.getPoliceChamp();
        }
        float a = C1400d.m9963a(i, this.this$0);
        if (a != ((float) c1397c.mo3760a())) {
            m8260a(4, C1400d.m9965a(c1397c.mo3763d(), a, c1397c.mo3764e()));
            this.this$0.repeindreChamp();
        }
    }

    public void setSelectionnee(boolean z) {
        if (z) {
            try {
                this.this$0.ajouterSelection(new int[]{this.f3489e + 1});
                return;
            } catch (WDException e) {
                return;
            }
        }
        this.this$0.supprimerSelection(new int[]{this.f3489e + 1});
    }

    public void setType(int i) {
        erreurAppelPropriete(C0745b.m3219a(f3487z[1]));
    }

    public void setValeur(WDObjet wDObjet) {
        setValeur(wDObjet.getString());
    }

    public void setValeur(String str) {
        this.f3490f = str;
        this.this$0.notifModificationModele(this.f3489e, this.f3489e);
    }

    public void setValeurMemorisee(String str) {
        this.f3488d = str;
    }

    public String toString() {
        return m8259a(false);
    }
}
