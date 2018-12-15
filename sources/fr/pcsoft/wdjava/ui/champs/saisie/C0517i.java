package fr.pcsoft.wdjava.ui.champs.saisie;

import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.TextUtils.TruncateAt;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.ressources.C0743a;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.core.types.WDEntier8;
import fr.pcsoft.wdjava.core.types.WDMonetaire;
import fr.pcsoft.wdjava.core.types.WDReel;
import fr.pcsoft.wdjava.core.types.cb;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.core.utils.jc;
import fr.pcsoft.wdjava.core.utils.kb;
import fr.pcsoft.wdjava.crypto.C0828j;
import fr.pcsoft.wdjava.p055g.C0908g;
import fr.pcsoft.wdjava.p061q.p062a.C1014a;
import fr.pcsoft.wdjava.ui.C0489p;
import fr.pcsoft.wdjava.ui.C1471o;
import fr.pcsoft.wdjava.ui.activite.C1056i;
import fr.pcsoft.wdjava.ui.cadre.C1110m;
import fr.pcsoft.wdjava.ui.cadre.C1113c;
import fr.pcsoft.wdjava.ui.champs.fc;
import fr.pcsoft.wdjava.ui.champs.fenetre.WDFenetre;
import fr.pcsoft.wdjava.ui.champs.gc;
import fr.pcsoft.wdjava.ui.champs.hc;
import fr.pcsoft.wdjava.ui.champs.table.colonne.C1278a;
import fr.pcsoft.wdjava.ui.p064a.C1031a;
import fr.pcsoft.wdjava.ui.p065b.C1093d;
import fr.pcsoft.wdjava.ui.p079e.C1397c;
import fr.pcsoft.wdjava.ui.p079e.C1399b;
import fr.pcsoft.wdjava.ui.p080h.C1424g;
import fr.pcsoft.wdjava.ui.p081j.C1437c;
import fr.pcsoft.wdjava.ui.p083l.C1443c;
import fr.pcsoft.wdjava.ui.p083l.C1449i;
import fr.pcsoft.wdjava.ui.p083l.C1453n;
import fr.pcsoft.wdjava.ui.p083l.nb;
import fr.pcsoft.wdjava.ui.utils.C1503b;
import fr.pcsoft.wdjava.ui.utils.C1508i;
import fr.pcsoft.wdjava.ui.utils.C1511l;

/* renamed from: fr.pcsoft.wdjava.ui.champs.saisie.i */
public class C0517i extends hc implements C0516d {
    private static final String Mc = C0517i.m1435z(C0517i.m1436z("c/8#\bq#\u0015\u001f\u0010q:\u0013\u001f\u0006a6\u0013/\n"));
    private static final int Nc = 11;
    private static final int Pc = 1;
    private static final int Qc = 2;
    private static final int Tc = 0;
    private static final int Uc = 6;
    private static final int Vc = 0;
    private static final int Wc = 4;
    private static final int Xc = 9;
    private static final int bd = 1;
    private static final int cd = 5;
    private static final int ed = 3;
    private static final int fd = 3;
    private static final int gd = 7;
    private static final int id = 10;
    private static final int jd = 8;
    private static final int pd = 2;
    private static final String[] td;
    private boolean Cc = true;
    private int Dc = 0;
    protected int Ec = 0;
    protected String Fc = "";
    private boolean Gc = false;
    private int Hc = C1511l.f4632f;
    private boolean Ic = false;
    protected nb Jc = null;
    private boolean Kc = false;
    protected String Lc = "";
    private C1110m Oc = null;
    private String Rc = null;
    private String Sc = "";
    protected EditText Yc = null;
    protected boolean Zc = true;
    protected boolean ad = false;
    private int dd = 0;
    protected boolean hd = false;
    private boolean kd = false;
    private boolean ld = false;
    private int md = 0;
    protected boolean nd = true;
    protected boolean od = false;
    private Drawable qd = null;
    private boolean rd = true;
    protected nb sd = new C1453n();

    static {
        r0 = new String[9];
        r0[0] = C0517i.m1435z(C0517i.m1436z("7\u0003$\u0014-[\f8\u0012+A\u0016\""));
        r0[1] = C0517i.m1435z(C0517i.m1436z("7\u0003$\u0014-[\f8\n+]\f"));
        r0[2] = C0517i.m1435z(C0517i.m1436z("7\u0003$\u0014-[\f8\u0019%\\\r("));
        r0[3] = C0517i.m1435z(C0517i.m1436z("7\u0003$\u0014-[\f8\u00156S\u0007)\u0003!"));
        r0[4] = C0517i.m1435z(C0517i.m1436z("7\u0003$\u0014-[\f8\u0007+[\u0005+\u0005"));
        r0[5] = C0517i.m1435z(C0517i.m1436z("7\u0001/\u0001)D\u001d4\u0001-G\u000b\""));
        r0[6] = C0517i.m1435z(C0517i.m1436z("\\\n]\r)"));
        r0[7] = C0517i.m1435z(C0517i.m1436z("^\bH\r);\u0003&\u0001%"));
        r0[8] = C0517i.m1435z(C0517i.m1436z("-{^y]-{^y]"));
        td = r0;
    }

    public C0517i() {
        m1425b();
    }

    public C0517i(C1278a c1278a) {
        super(c1278a);
        m1425b();
    }

    /* renamed from: a */
    private void m1424a(boolean z) {
        if (z != this.kd) {
            this.kd = z;
            Drawable[] compoundDrawables = this.Yc.getCompoundDrawables();
            if (z) {
                if (this.qd == null) {
                    Drawable f = C0743a.m3210f(Mc);
                    if (f != null) {
                        f.mutate();
                        C1508i.m10488a(f, C1031a.m7465i(this.cb));
                        this.qd = f;
                    }
                }
                compoundDrawables[2] = this.qd;
            } else {
                compoundDrawables[2] = null;
            }
            this.Yc.setCompoundDrawablesWithIntrinsicBounds(compoundDrawables[0], compoundDrawables[1], compoundDrawables[2], compoundDrawables[3]);
        }
    }

    /* renamed from: b */
    private final void m1425b() {
        this.Yc = new C1251b(this, C1056i.m7562a());
        this.Yc.setGravity(51);
        if (this.Zb == null) {
            ((ViewGroup) getCompConteneur()).addView(this.Yc);
        }
        this.Yc.setFilters(new InputFilter[]{new C1254f(this)});
        this.Yc.addTextChangedListener(new C1257j(this));
        this.Yc.setIncludeFontPadding(C1471o.m10303a());
    }

    /* renamed from: c */
    private void m1426c() {
        if (this.Ec == 0) {
            this.Yc.setRawInputType(this.Yc.getInputType() & -524289);
        }
    }

    /* renamed from: d */
    private boolean m1427d() {
        return this.Yc.getText().length() == 0;
    }

    /* renamed from: e */
    private final boolean m1428e() {
        return this.rd && !((this.sd instanceof C1449i) && ((C1449i) this.sd).m10205j());
    }

    /* renamed from: f */
    private final void m1429f() {
        CharSequence f;
        switch (this.Ec) {
            case 1:
            case 4:
            case 7:
                f = ((C1443c) (this.Jc != null ? this.Jc : this.sd)).m10136f(getTexteAffiche());
                this.ad = true;
                this.Yc.setText(f);
                this.ad = false;
                return;
            case 2:
            case 3:
                f = ((C1449i) this.sd).m10183a((C1449i) (this.Jc != null ? this.Jc : null));
                this.ad = true;
                this.Yc.setText(f);
                this.ad = false;
                return;
            default:
                return;
        }
    }

    /* renamed from: g */
    private final void m1430g() {
        onModifChamp();
        appelPCode_TLM(17, 6);
        if (this.l != null) {
            ((C0489p) this.l).appelPCode(17);
        }
    }

    /* renamed from: h */
    private final void m1431h() {
        CharSequence h;
        switch (this.Ec) {
            case 0:
                h = ((C1453n) this.sd).m10251h();
                if (h != null) {
                    this.ad = true;
                    this.Yc.setText(h);
                    this.ad = false;
                    return;
                }
                return;
            case 1:
            case 4:
            case 7:
                h = ((C1443c) this.sd).m10131c(getTexteAffiche());
                this.ad = true;
                this.Yc.setText(h);
                this.ad = false;
                return;
            case 2:
            case 3:
                h = ((C1449i) this.sd).m10208o();
                this.ad = true;
                this.Yc.setText(h);
                this.ad = false;
                return;
            default:
                return;
        }
    }

    /* renamed from: i */
    private void m1432i() {
        boolean z = true;
        boolean z2 = false;
        if (!isChampSaisieMultiLigne() && this.Ec == 0 && _getEtat() == 0 && !m1427d()) {
            switch (this.Dc) {
                case 1:
                    z2 = this.Yc.hasFocus();
                    break;
                case 2:
                    if (this.Yc.hasFocus()) {
                        z = false;
                    }
                    z2 = z;
                    break;
                case 3:
                    z2 = true;
                    break;
            }
        }
        m1424a(z2);
    }

    /* renamed from: j */
    private void m1433j() {
        if (this.Ec == 0) {
            this.Yc.setRawInputType(this.Yc.getInputType() | 524288);
        }
    }

    /* renamed from: k */
    private void m1434k() {
        int length = getTexteAffiche().length();
        if (!this.hd || this.z != null) {
            if (this.Ec == 2 || this.Ec == 3 || (this.Ec == 0 && ((C1453n) this.sd).m10250g() != 0)) {
                int a = this.sd.mo3780a();
                int b = this.sd.mo3784b();
                if (a != -1) {
                    a = Math.min(a, length);
                    if (b != -1) {
                        this.Yc.setSelection(a, Math.min(b, length));
                        return;
                    }
                    this.Yc.setSelection(a, a);
                }
            }
        }
    }

    /* renamed from: z */
    private static String m1435z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 20;
                    break;
                case 1:
                    i2 = 66;
                    break;
                case 2:
                    i2 = 103;
                    break;
                case 3:
                    i2 = 64;
                    break;
                default:
                    i2 = 100;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1436z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 100);
        }
        return toCharArray;
    }

    protected void appliquerCadreInterne(C1110m c1110m) {
        this.Oc = c1110m;
        if (c1110m instanceof C1113c) {
            setCouleurFond(C1031a.m7461e(c1110m.mo3387l()));
            String q = ((C1113c) c1110m).m8141q();
            int s = ((C1113c) c1110m).m8143s();
            if (C1437c.m10098a(q, getFenetreMere())) {
                this.Hc = -1;
                if (kb.m3966a(jc.KINDLE_FIRE) && this.Yc.getBackground() != null) {
                    this.Yc.setPadding(s + 4, 0, s + 4, 0);
                    return;
                }
                return;
            }
            Drawable a = !q.equals("") ? C1093d.m7924a(q) : null;
            if (a != null) {
                this.Yc.setBackgroundDrawable(a);
                this.Hc += s;
                return;
            }
            this.Yc.setBackgroundDrawable(null);
            return;
        }
        this.Yc.setBackgroundDrawable(null);
        if (c1110m != null) {
            this.Hc += c1110m.mo3382b();
            this.L = C1031a.m7461e(c1110m.mo3387l());
        }
    }

    protected void appliquerCouleur(int i) {
        int k = C1031a.m7467k(i);
        C1503b.m10432a(this.Yc, k, k);
        if (this.qd != null) {
            C1508i.m10488a(this.qd, k);
        }
    }

    protected void appliquerCouleurFond(int i) {
        if (this.Oc != null) {
            this.Oc.mo3385d(C1031a.m7467k(i));
        }
        repeindreChamp();
    }

    protected void appliquerCouleurFondTransparent() {
        if (this.Oc != null) {
            this.Oc.mo3385d(0);
        }
        repeindreChamp();
    }

    protected void appliquerTransparent() {
        C1503b.m10432a(this.Yc, 0, 0);
    }

    public void appliquerVisibilite(boolean z) {
        boolean isShown = this.Yc.isShown();
        super.appliquerVisibilite(z);
        if (this.Yc.isFocused() && this.Yc.isShown() && !isShown && this.d == 0) {
            C1503b.m10445b();
        }
    }

    protected boolean canScroll(int i, int i2) {
        return !super.canScroll(i, i2) ? Math.abs(i) > Math.abs(i2) ? C1014a.m7327b().mo3296a(this.Yc, i) : C1014a.m7327b().mo3298b(this.Yc, i2) : true;
    }

    protected WDObjet clicBtnActionClavier() {
        initialiserAction();
        return null;
    }

    public gc cloneChampForZR(boolean z, boolean z2) {
        gc cloneChampForZR = super.cloneChampForZR(z, z2);
        if (cloneChampForZR != null && (cloneChampForZR instanceof C0517i)) {
            if (this.Zb == null) {
                ((C0517i) cloneChampForZR).ld = true;
            } else if (!z) {
                cloneChampForZR.setVerifieOrthographe(false);
                ((C0517i) cloneChampForZR).setEffacementAutomatique(false);
                ((C0517i) cloneChampForZR).setFinSaisieAutomatique(false);
                cloneChampForZR.getCompPrincipal().setFocusable(false);
                cloneChampForZR.getCompPrincipal().setClickable(false);
                if (isChampSaisieMultiLigne()) {
                    cloneChampForZR.setAncrage(2);
                    cloneChampForZR.setTauxAncrageHauteur(1000);
                    cloneChampForZR.setAncrageAuContenu(1);
                }
            }
            if (this.Ec == 0 && this.l != null && ((WDFenetre) this.l).getScrollableView() == null) {
                ((C0517i) cloneChampForZR).Yc.setImeOptions(this.Yc.getImeOptions() & -268435457);
            }
        }
        return cloneChampForZR;
    }

    public WDObjet convertStringToValue(String str) {
        if (this.Ec == 1) {
            if (((C1443c) this.sd).m10135e()) {
                return new WDReel(str);
            }
            long c = C0725i.m3055c(str);
            return c < 2147483647L ? new WDEntier4(c) : new WDEntier8(c);
        } else if (this.Ec == 4 || this.Ec == 7) {
            return new WDMonetaire(str);
        } else {
            if (isChampSaisieMultiLigne()) {
                str = C0808l.m4049g(str);
            }
            return new WDChaine(str);
        }
    }

    protected WDObjet executerPCode(int i) {
        switch (i) {
            case C0607n.wg /*1139*/:
                return clicBtnActionClavier();
            default:
                return super.executerPCode(i);
        }
    }

    public WDEntier4 getBoutonSuppression() {
        return new WDEntier4(this.Dc);
    }

    public WDEntier4 getCadrageHorizontal() {
        return new WDEntier4(C1503b.m10421a(this.Yc));
    }

    public View getCompPrincipal() {
        return this.Yc;
    }

    public WDEntier4 getCurseur() {
        return this.Yc != null ? new WDEntier4(this.Yc.getSelectionStart() + 1) : new WDEntier4(0);
    }

    public int getDebutSelection() {
        return this.Yc.getSelectionStart();
    }

    public WDEntier4 getEllipse() {
        TruncateAt ellipsize = this.Yc.getEllipsize();
        if (ellipsize != null) {
            if (ellipsize.equals(TruncateAt.MIDDLE)) {
                return new WDEntier4(16384);
            }
            if (ellipsize.equals(TruncateAt.END)) {
                return new WDEntier4(32768);
            }
        }
        return new WDEntier4(0);
    }

    public WDEntier4 getFinCurseur() {
        return this.Yc != null ? new WDEntier4(this.Yc.getSelectionEnd() + 1) : new WDEntier4(0);
    }

    public int getFinSelection() {
        return this.Yc.getSelectionEnd();
    }

    public WDChaine getFormatMemorise() {
        return new WDChaine(this.Sc);
    }

    public WDChaine getIndication() {
        return new WDChaine(this.Yc.getHint().toString());
    }

    public WDObjet getMasqueAffichage() {
        return new WDChaine(this.Jc != null ? this.Jc.toString() : "");
    }

    public WDObjet getMasqueSaisie() {
        return new WDChaine(this.Fc);
    }

    public WDObjet getMotDePasse() {
        return new WDBooleen(this.Yc.getInputType() == C0607n.Wj);
    }

    public WDBooleen getMultiligne() {
        return new WDBooleen(isChampSaisieMultiLigne());
    }

    public String getNomType() {
        return C0745b.m3220a(td[5], new String[0]);
    }

    public EWDPropriete getProprietePourAttributAuto() {
        return EWDPropriete.PROP_VALEUR;
    }

    public WDObjet getRetraitDroit() {
        return new WDEntier4();
    }

    public WDObjet getRetraitGauche() {
        return new WDEntier4((double) C1511l.m10515a((float) this.dd, 1, getDisplayUnit()));
    }

    public View getScrollableView() {
        return this.Yc;
    }

    public WDEntier4 getTaille() {
        return new WDEntier4(this.md);
    }

    public String getTexteAffiche() {
        return this.Yc.getText().toString();
    }

    public WDEntier4 getTypeSaisie() {
        return new WDEntier4(this.Ec);
    }

    public WDObjet getValeur() {
        return convertStringToValue(this.Lc);
    }

    public cb getValeurAffichee() {
        String obj = this.Yc.getText().toString();
        if (isChampSaisieMultiLigne()) {
            obj = C0808l.m4049g(obj);
        }
        return new WDChaine(obj);
    }

    public WDObjet getValeurInitiale() {
        return new WDChaine(this.Rc);
    }

    public WDObjet getVerifieOrthographe() {
        return new WDBooleen(this.Cc);
    }

    public boolean isAvecMasqueDeSaisie() {
        return (C0808l.m4053k(this.Fc) || this.Fc.equals("0")) ? false : true;
    }

    public boolean isChampEditableDansZR() {
        return true;
    }

    public boolean isChampFocusable() {
        return ((this.sd instanceof C1449i) && ((C1449i) this.sd).m10205j()) ? false : true;
    }

    public boolean isChampSaisieMultiLigne() {
        return false;
    }

    public boolean isFinSaisieAutomatique() {
        return this.Ic;
    }

    protected boolean isInterceptTouchEventForScroll() {
        return super.isInterceptTouchEventForScroll() || _getEtat() != 4;
    }

    public boolean isMiseABlancSiZero() {
        return this.Kc;
    }

    public boolean isSauverValeurEnFinEditionZR() {
        return _getEtat() == 0;
    }

    public void modifValeurInterne(String str) {
        this.Lc = str;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (super.onTouch(view, motionEvent)) {
            return true;
        }
        if (!this.kd || this.qd == null || (motionEvent.getAction() & 255) != 1 || motionEvent.getX() <= ((float) ((this.Yc.getWidth() - this.Yc.getPaddingRight()) - this.qd.getIntrinsicWidth()))) {
            return false;
        }
        if (m1427d()) {
            return true;
        }
        this.Yc.setText("");
        m1430g();
        return true;
    }

    public void raz(boolean z) {
        setValeur(getValeurInitiale());
    }

    public void release() {
        super.release();
        this.Yc = null;
        this.Rc = null;
        this.Lc = null;
        if (this.sd != null) {
            this.sd.mo3785c();
            this.sd = null;
        }
        if (this.Jc != null) {
            this.Jc.mo3785c();
            this.Jc = null;
        }
        if (this.Oc != null) {
            this.Oc.mo3386h();
            this.Oc = null;
        }
        this.Fc = null;
        this.Sc = null;
        this.qd = null;
    }

    public boolean restaurerValeur() {
        boolean z;
        if (this.e) {
            String b = C0908g.m6432a().mo3203b((fc) this);
            if (!(b == null || b.equals(""))) {
                if ((this.Yc.getInputType() & 128) == 128) {
                    b = C0725i.m3061c(C0828j.m4251a(C0725i.m3075f(b)));
                }
                setValeur(b);
                z = true;
                if (z) {
                    appelPCode(17);
                }
                return z;
            }
        }
        z = false;
        if (z) {
            appelPCode(17);
        }
        return z;
    }

    public void sauverValeur() {
        if (this.e) {
            String string = getValeur().getString();
            if ((this.Yc.getInputType() & 128) == 128) {
                string = C0725i.m3061c(C0828j.m4254b(C0725i.m3075f(string)));
            }
            C0908g.m6432a().mo3195a((fc) this, string);
        }
    }

    public void selectionnerTout() {
        this.Yc.selectAll();
    }

    public void setBoutonSuppression(int i) {
        if (this.Dc != i) {
            switch (i) {
                case 0:
                case 1:
                case 2:
                case 3:
                    this.Dc = i;
                    break;
                default:
                    this.Dc = 0;
                    break;
            }
            if (isFenetreCree()) {
                m1432i();
            }
        }
    }

    public void setCadrageHorizontal(int i) {
        C1503b.m10431a(this.Yc, i);
    }

    public final void setClavierEnSaisie(boolean z) {
        this.rd = z;
    }

    public void setCurseur(int i) {
        int i2 = i - 1;
        if (i2 < 0) {
            i2 = 0;
        } else if (i2 > this.Yc.getText().length()) {
            i2 = this.Yc.getText().length();
        }
        this.Yc.setSelection(i2);
    }

    public final void setDefilementHorizontal(boolean z) {
        this.Yc.setHorizontallyScrolling(!z);
    }

    public void setEffacementAutomatique(boolean z) {
        this.nd = z;
        this.Yc.setSelectAllOnFocus(z);
    }

    public void setEllipse(int i) {
        switch (i) {
            case 16384:
                this.Yc.setEllipsize(TruncateAt.MIDDLE);
                return;
            case 32768:
                this.Yc.setEllipsize(TruncateAt.END);
                return;
            default:
                this.Yc.setEllipsize(null);
                return;
        }
    }

    public void setEtat(int i) {
        boolean z = false;
        int _getEtat = _getEtat();
        super.setEtat(i);
        int _getEtat2 = _getEtat();
        if (_getEtat != _getEtat2) {
            C1503b.m10433a(this.Yc, _getEtat2 != 4);
            if (!(_getEtat2 == 1 || _getEtat2 == 4)) {
                z = true;
            }
            this.Yc.setClickable(z);
            this.Yc.setCursorVisible(z);
            this.Yc.setFocusable(z);
            if (z) {
                this.Yc.setFocusableInTouchMode(true);
            }
            if (isFenetreCree()) {
                m1432i();
            }
        }
    }

    public void setFinCurseur(int i) {
        int i2 = i - 1;
        if (i2 < 0) {
            i2 = 0;
        } else if (i2 > this.Yc.getText().length()) {
            i2 = this.Yc.getText().length();
        }
        if (i2 < this.Yc.getSelectionStart()) {
            i2 = this.Yc.getSelectionStart();
        }
        this.Yc.setSelection(this.Yc.getSelectionStart(), i2);
    }

    public void setFinSaisieAutomatique(boolean z) {
        this.Ic = z;
    }

    public void setFormatMemorise(String str) {
        if (this.sd != null && (this.sd instanceof C1449i)) {
            this.Sc = str;
            ((C1449i) this.sd).m10193d(str);
            if (this.Jc instanceof C1449i) {
                ((C1449i) this.Jc).m10193d(str);
            }
        }
    }

    public void setIndication(String str) {
        this.Yc.setHint(str);
    }

    public void setMasqueAffichage(fr.pcsoft.wdjava.core.WDObjet r3) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find block by offset: 0x0027 in list [B:24:0x0057]
	at jadx.core.utils.BlockUtils.getBlockByOffset(BlockUtils.java:43)
	at jadx.core.dex.instructions.IfNode.initBlocks(IfNode.java:60)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.initBlocksInIfNodes(BlockFinish.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.visit(BlockFinish.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/70807318.run(Unknown Source)
*/
        /*
        r2 = this;
        if (r3 == 0) goto L_0x000e;
    L_0x0002:
        r0 = r3.getString();	 Catch:{ all -> 0x0068 }
        r1 = "";	 Catch:{ all -> 0x0068 }
        r0 = r0.equals(r1);	 Catch:{ all -> 0x0068 }
        if (r0 == 0) goto L_0x0028;	 Catch:{ all -> 0x0068 }
    L_0x000e:
        r0 = r2.Jc;	 Catch:{ all -> 0x0068 }
        if (r0 == 0) goto L_0x0017;	 Catch:{ all -> 0x0068 }
    L_0x0012:
        r0 = r2.Jc;	 Catch:{ all -> 0x0068 }
        r0.mo3785c();	 Catch:{ all -> 0x0068 }
    L_0x0017:
        r0 = 0;	 Catch:{ all -> 0x0068 }
        r2.Jc = r0;	 Catch:{ all -> 0x0068 }
        r0 = r2.isFenetreCree();
        if (r0 == 0) goto L_0x0027;
    L_0x0020:
        r0 = r2.getValeur();
        r2.setValeur(r0);
    L_0x0027:
        return;
    L_0x0028:
        r0 = r2.Ec;	 Catch:{ all -> 0x0068 }
        switch(r0) {
            case 0: goto L_0x002d;
            case 1: goto L_0x005f;
            case 2: goto L_0x0080;
            case 3: goto L_0x0089;
            case 4: goto L_0x0077;
            default: goto L_0x002d;
        };	 Catch:{ all -> 0x0068 }
    L_0x002d:
        r0 = r2.Jc;	 Catch:{ all -> 0x0068 }
        if (r0 == 0) goto L_0x0051;	 Catch:{ all -> 0x0068 }
    L_0x0031:
        r0 = r2.Jc;	 Catch:{ all -> 0x0068 }
        r0 = r0 instanceof fr.pcsoft.wdjava.ui.p083l.C1449i;	 Catch:{ all -> 0x0068 }
        if (r0 == 0) goto L_0x0048;	 Catch:{ all -> 0x0068 }
    L_0x0037:
        r0 = r2.Sc;	 Catch:{ all -> 0x0068 }
        r0 = fr.pcsoft.wdjava.core.utils.C0808l.m4053k(r0);	 Catch:{ all -> 0x0068 }
        if (r0 != 0) goto L_0x0048;	 Catch:{ all -> 0x0068 }
    L_0x003f:
        r0 = r2.Jc;	 Catch:{ all -> 0x0068 }
        r0 = (fr.pcsoft.wdjava.ui.p083l.C1449i) r0;	 Catch:{ all -> 0x0068 }
        r1 = r2.Sc;	 Catch:{ all -> 0x0068 }
        r0.m10193d(r1);	 Catch:{ all -> 0x0068 }
    L_0x0048:
        r0 = r2.Jc;	 Catch:{ all -> 0x0068 }
        r1 = r3.getString();	 Catch:{ all -> 0x0068 }
        r0.mo3783a(r1);	 Catch:{ all -> 0x0068 }
    L_0x0051:
        r0 = r2.isFenetreCree();
        if (r0 == 0) goto L_0x0027;
    L_0x0057:
        r0 = r2.getValeur();
        r2.setValeur(r0);
        goto L_0x0027;
    L_0x005f:
        r0 = new fr.pcsoft.wdjava.ui.l.c;	 Catch:{ all -> 0x0068 }
        r1 = 0;	 Catch:{ all -> 0x0068 }
        r0.<init>(r2, r1);	 Catch:{ all -> 0x0068 }
        r2.Jc = r0;	 Catch:{ all -> 0x0068 }
        goto L_0x002d;
    L_0x0068:
        r0 = move-exception;
        r1 = r2.isFenetreCree();
        if (r1 == 0) goto L_0x0076;
    L_0x006f:
        r1 = r2.getValeur();
        r2.setValeur(r1);
    L_0x0076:
        throw r0;
    L_0x0077:
        r0 = new fr.pcsoft.wdjava.ui.l.c;	 Catch:{ all -> 0x0068 }
        r1 = 1;	 Catch:{ all -> 0x0068 }
        r0.<init>(r2, r1);	 Catch:{ all -> 0x0068 }
        r2.Jc = r0;	 Catch:{ all -> 0x0068 }
        goto L_0x002d;	 Catch:{ all -> 0x0068 }
    L_0x0080:
        r0 = new fr.pcsoft.wdjava.ui.l.i;	 Catch:{ all -> 0x0068 }
        r1 = 1;	 Catch:{ all -> 0x0068 }
        r0.<init>(r2, r1);	 Catch:{ all -> 0x0068 }
        r2.Jc = r0;	 Catch:{ all -> 0x0068 }
        goto L_0x002d;	 Catch:{ all -> 0x0068 }
    L_0x0089:
        r0 = new fr.pcsoft.wdjava.ui.l.i;	 Catch:{ all -> 0x0068 }
        r1 = 0;	 Catch:{ all -> 0x0068 }
        r0.<init>(r2, r1);	 Catch:{ all -> 0x0068 }
        r2.Jc = r0;	 Catch:{ all -> 0x0068 }
        goto L_0x002d;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.ui.champs.saisie.i.setMasqueAffichage(fr.pcsoft.wdjava.core.WDObjet):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setMasqueSaisie(fr.pcsoft.wdjava.core.WDObjet r7) {
        /*
        r6 = this;
        r3 = 131072; // 0x20000 float:1.83671E-40 double:6.47582E-319;
        r2 = 0;
        r4 = r7.getValeur();	 Catch:{ all -> 0x0068 }
        r0 = r4.getString();	 Catch:{ all -> 0x0068 }
        r6.Fc = r0;	 Catch:{ all -> 0x0068 }
        r1 = 1;
        r0 = r6.Ec;	 Catch:{ all -> 0x0068 }
        switch(r0) {
            case 0: goto L_0x0030;
            case 1: goto L_0x00cd;
            case 2: goto L_0x00fc;
            case 3: goto L_0x00fc;
            case 4: goto L_0x00cd;
            case 5: goto L_0x0013;
            case 6: goto L_0x0013;
            case 7: goto L_0x00cd;
            default: goto L_0x0013;
        };	 Catch:{ all -> 0x0068 }
    L_0x0013:
        r0 = r1;
    L_0x0014:
        r1 = r6.Yc;	 Catch:{ all -> 0x0068 }
        r1.setFocusable(r0);	 Catch:{ all -> 0x0068 }
        r0 = r6.isFenetreCree();
        if (r0 == 0) goto L_0x002f;
    L_0x001f:
        r0 = r6.getValeur();
        r6.setValeur(r0);
        r0 = r6.isAvecMasqueDeSaisie();
        if (r0 == 0) goto L_0x002f;
    L_0x002c:
        r6.m1433j();
    L_0x002f:
        return;
    L_0x0030:
        r5 = r4.getInt();	 Catch:{ all -> 0x0068 }
        r0 = r4.opEgal(r5);	 Catch:{ all -> 0x0068 }
        if (r0 == 0) goto L_0x00bf;
    L_0x003a:
        r0 = r6.sd;	 Catch:{ all -> 0x0068 }
        r0 = (fr.pcsoft.wdjava.ui.p083l.C1453n) r0;	 Catch:{ all -> 0x0068 }
        r0.m10241a(r5);	 Catch:{ all -> 0x0068 }
        r0 = r6.Ec;	 Catch:{ all -> 0x0068 }
        r4 = 11;
        if (r0 != r4) goto L_0x004b;
    L_0x0047:
        r0 = 13;
        r6.md = r0;	 Catch:{ all -> 0x0068 }
    L_0x004b:
        r0 = r6.Ec;	 Catch:{ all -> 0x0068 }
        r4 = 12;
        if (r0 != r4) goto L_0x0055;
    L_0x0051:
        r0 = 15;
        r6.md = r0;	 Catch:{ all -> 0x0068 }
    L_0x0055:
        switch(r5) {
            case 1: goto L_0x005a;
            case 2: goto L_0x0082;
            case 3: goto L_0x0058;
            case 4: goto L_0x0058;
            case 5: goto L_0x00a0;
            case 6: goto L_0x0058;
            case 7: goto L_0x0082;
            case 8: goto L_0x0082;
            case 9: goto L_0x0091;
            case 10: goto L_0x0098;
            case 11: goto L_0x00a0;
            case 12: goto L_0x00a0;
            case 13: goto L_0x0058;
            case 14: goto L_0x0082;
            case 15: goto L_0x00a7;
            case 16: goto L_0x0098;
            case 17: goto L_0x00b7;
            case 18: goto L_0x0082;
            case 19: goto L_0x0058;
            case 20: goto L_0x0082;
            case 21: goto L_0x0091;
            case 22: goto L_0x00af;
            case 23: goto L_0x0058;
            case 24: goto L_0x00a0;
            case 25: goto L_0x00a0;
            case 26: goto L_0x00a0;
            case 27: goto L_0x00b7;
            case 28: goto L_0x0058;
            case 29: goto L_0x00a0;
            case 30: goto L_0x0058;
            case 31: goto L_0x00a0;
            case 32: goto L_0x00a0;
            case 33: goto L_0x0058;
            case 34: goto L_0x00a0;
            case 35: goto L_0x00a0;
            case 36: goto L_0x00a0;
            case 37: goto L_0x00a0;
            case 38: goto L_0x00a0;
            case 39: goto L_0x0058;
            case 40: goto L_0x0058;
            case 41: goto L_0x00a0;
            case 42: goto L_0x0058;
            case 43: goto L_0x00a0;
            case 44: goto L_0x00a0;
            case 45: goto L_0x00a0;
            case 46: goto L_0x00a0;
            case 47: goto L_0x00a0;
            case 48: goto L_0x00a0;
            case 49: goto L_0x0058;
            case 50: goto L_0x00a0;
            case 51: goto L_0x00a0;
            case 52: goto L_0x00a0;
            case 53: goto L_0x0058;
            case 54: goto L_0x00a0;
            case 55: goto L_0x00a0;
            case 56: goto L_0x00a0;
            case 57: goto L_0x00a0;
            case 58: goto L_0x00a0;
            case 59: goto L_0x00a0;
            case 60: goto L_0x00a0;
            case 61: goto L_0x00a0;
            case 62: goto L_0x00b7;
            case 63: goto L_0x00b7;
            default: goto L_0x0058;
        };	 Catch:{ all -> 0x0068 }
    L_0x0058:
        r0 = r1;
        goto L_0x0014;
    L_0x005a:
        r0 = r6.Yc;	 Catch:{ all -> 0x0068 }
        r4 = r6.isChampSaisieMultiLigne();	 Catch:{ all -> 0x0068 }
        if (r4 == 0) goto L_0x0080;
    L_0x0062:
        r2 = r3 | 16385;
        r0.setRawInputType(r2);	 Catch:{ all -> 0x0068 }
        goto L_0x0058;
    L_0x0068:
        r0 = move-exception;
        r1 = r6.isFenetreCree();
        if (r1 == 0) goto L_0x007f;
    L_0x006f:
        r1 = r6.getValeur();
        r6.setValeur(r1);
        r1 = r6.isAvecMasqueDeSaisie();
        if (r1 == 0) goto L_0x007f;
    L_0x007c:
        r6.m1433j();
    L_0x007f:
        throw r0;
    L_0x0080:
        r3 = r2;
        goto L_0x0062;
    L_0x0082:
        r0 = r6.Yc;	 Catch:{ all -> 0x0068 }
        r4 = r6.isChampSaisieMultiLigne();	 Catch:{ all -> 0x0068 }
        if (r4 == 0) goto L_0x008b;
    L_0x008a:
        r2 = r3;
    L_0x008b:
        r2 = r2 | 4097;
        r0.setRawInputType(r2);	 Catch:{ all -> 0x0068 }
        goto L_0x0058;
    L_0x0091:
        r0 = r6.Yc;	 Catch:{ all -> 0x0068 }
        r2 = 3;
        r0.setRawInputType(r2);	 Catch:{ all -> 0x0068 }
        goto L_0x0058;
    L_0x0098:
        r0 = r6.Yc;	 Catch:{ all -> 0x0068 }
        r2 = 17;
        r0.setRawInputType(r2);	 Catch:{ all -> 0x0068 }
        goto L_0x0058;
    L_0x00a0:
        r0 = r6.Yc;	 Catch:{ all -> 0x0068 }
        r2 = 2;
        r0.setRawInputType(r2);	 Catch:{ all -> 0x0068 }
        goto L_0x0058;
    L_0x00a7:
        r0 = r6.Yc;	 Catch:{ all -> 0x0068 }
        r2 = 12290; // 0x3002 float:1.7222E-41 double:6.072E-320;
        r0.setRawInputType(r2);	 Catch:{ all -> 0x0068 }
        goto L_0x0058;
    L_0x00af:
        r0 = r6.Yc;	 Catch:{ all -> 0x0068 }
        r2 = 8194; // 0x2002 float:1.1482E-41 double:4.0484E-320;
        r0.setRawInputType(r2);	 Catch:{ all -> 0x0068 }
        goto L_0x0058;
    L_0x00b7:
        r0 = r6.Yc;	 Catch:{ all -> 0x0068 }
        r2 = 33;
        r0.setRawInputType(r2);	 Catch:{ all -> 0x0068 }
        goto L_0x0058;
    L_0x00bf:
        r0 = r6.sd;	 Catch:{ all -> 0x0068 }
        r0 = (fr.pcsoft.wdjava.ui.p083l.C1453n) r0;	 Catch:{ all -> 0x0068 }
        r2 = r4.getString();	 Catch:{ all -> 0x0068 }
        r0.mo3783a(r2);	 Catch:{ all -> 0x0068 }
        r0 = r1;
        goto L_0x0014;
    L_0x00cd:
        r0 = r6.sd;	 Catch:{ all -> 0x0068 }
        r3 = r4.getString();	 Catch:{ all -> 0x0068 }
        r0.mo3783a(r3);	 Catch:{ all -> 0x0068 }
        r3 = r6.Yc;	 Catch:{ all -> 0x0068 }
        r0 = r6.sd;	 Catch:{ all -> 0x0068 }
        r0 = (fr.pcsoft.wdjava.ui.p083l.C1443c) r0;	 Catch:{ all -> 0x0068 }
        r0 = r0.m10137f();	 Catch:{ all -> 0x0068 }
        if (r0 == 0) goto L_0x00fa;
    L_0x00e2:
        r0 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
    L_0x00e4:
        r4 = r0 | 2;
        r0 = r6.sd;	 Catch:{ all -> 0x0068 }
        r0 = (fr.pcsoft.wdjava.ui.p083l.C1443c) r0;	 Catch:{ all -> 0x0068 }
        r0 = r0.m10138g();	 Catch:{ all -> 0x0068 }
        if (r0 == 0) goto L_0x00f2;
    L_0x00f0:
        r2 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
    L_0x00f2:
        r0 = r4 | r2;
        r3.setRawInputType(r0);	 Catch:{ all -> 0x0068 }
        r0 = r1;
        goto L_0x0014;
    L_0x00fa:
        r0 = r2;
        goto L_0x00e4;
    L_0x00fc:
        r0 = r6.Yc;	 Catch:{ all -> 0x0068 }
        r3 = 4;
        r0.setRawInputType(r3);	 Catch:{ all -> 0x0068 }
        r0 = r6.sd;	 Catch:{ all -> 0x0068 }
        r3 = r4.getString();	 Catch:{ all -> 0x0068 }
        r0.mo3783a(r3);	 Catch:{ all -> 0x0068 }
        r0 = r6.sd;	 Catch:{ all -> 0x0068 }
        r0 = (fr.pcsoft.wdjava.ui.p083l.C1449i) r0;	 Catch:{ all -> 0x0068 }
        r0 = r0.m10205j();	 Catch:{ all -> 0x0068 }
        if (r0 == 0) goto L_0x0122;
    L_0x0115:
        r0 = r6.Yc;	 Catch:{ all -> 0x0068 }
        r1 = new fr.pcsoft.wdjava.ui.champs.saisie.c;	 Catch:{ all -> 0x0068 }
        r1.<init>(r6);	 Catch:{ all -> 0x0068 }
        r0.setOnClickListener(r1);	 Catch:{ all -> 0x0068 }
        r0 = r2;
        goto L_0x0014;
    L_0x0122:
        r0 = r6.Yc;	 Catch:{ all -> 0x0068 }
        r2 = 0;
        r0.setOnClickListener(r2);	 Catch:{ all -> 0x0068 }
        goto L_0x0013;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.ui.champs.saisie.i.setMasqueSaisie(fr.pcsoft.wdjava.core.WDObjet):void");
    }

    public final void setMiseABlancSiZero(boolean z) {
        this.Kc = z;
    }

    protected void setModeAscenseur(int i, int i2) {
    }

    public void setMotDePasse(WDObjet wDObjet) {
        setMotDePasse(wDObjet.getBoolean());
    }

    public void setMotDePasse(boolean z) {
        if (this.Ec != 0) {
            z = false;
        }
        this.Gc = z;
        if (this.Gc) {
            this.Yc.setInputType(C0607n.Wj);
        } else if (isFenetreCree()) {
            this.Yc.setInputType(1);
        }
    }

    protected final void setParamBtnActionClavier(int i, String str) {
        switch (i) {
            case 1:
                this.Yc.setImeOptions(2);
                break;
            case 2:
                this.Yc.setImeActionLabel(C0745b.m3224c(td[4], new String[0]), 0);
                break;
            case 3:
                this.Yc.setImeActionLabel(C0745b.m3224c(td[1], new String[0]), 0);
                break;
            case 4:
                this.Yc.setImeOptions(5);
                break;
            case 5:
                this.Yc.setImeActionLabel(C0745b.m3224c(td[0], new String[0]), 0);
                break;
            case 6:
                this.Yc.setImeOptions(3);
                break;
            case 7:
                this.Yc.setImeOptions(4);
                break;
            case 8:
                this.Yc.setImeActionLabel(C0745b.m3224c(td[2], new String[0]), 0);
                break;
            case 9:
                this.Yc.setImeOptions(6);
                break;
            case 10:
                this.Yc.setImeActionLabel(C0745b.m3224c(td[3], new String[0]), 0);
                break;
            case 11:
                this.Yc.setImeActionLabel(str, 0);
                break;
        }
        this.Yc.setOnEditorActionListener(new C1256h(this, i));
    }

    protected void setPersistant(boolean z) {
        this.e = z;
    }

    public void setRetraitDroit(int i) {
    }

    public void setRetraitGauche(int i) {
        this.dd = C1511l.m10532d((float) i, getDisplayUnit());
        if (isFenetreCree()) {
            this.Yc.setPadding(this.Hc + this.dd, this.Yc.getPaddingTop(), this.Yc.getPaddingRight(), this.Yc.getPaddingBottom());
        }
    }

    public void setSelectionEnAffichage(boolean z) {
        this.Zc = z;
    }

    protected void setStyleSaisie(int i, C1399b c1399b) {
        if (isChangementAgencementEnCours()) {
            c1399b.m9954a(this.Yc);
            return;
        }
        setCouleur(i);
        c1399b.m9954a(this.Yc);
    }

    protected void setStyleTexteIndication(int i, C1397c c1397c, int i2) {
        this.Yc.setHintTextColor(C1031a.m7467k(i));
    }

    public void setTaille(int i) {
        this.md = i;
    }

    public void setTypeSaisie(int i) {
        if (i >= 0 && this.Ec != i) {
            boolean isFenetreCree = isFenetreCree();
            if (isFenetreCree && this.sd != null) {
                this.sd.mo3785c();
            }
            this.Ec = i;
            switch (i) {
                case 0:
                    if (isFenetreCree) {
                        this.sd = new C1453n();
                        break;
                    }
                    break;
                case 1:
                    this.sd = new C1443c(this, false);
                    if (isFenetreCree) {
                        setMasqueSaisie(new WDChaine(td[8]));
                        break;
                    }
                    break;
                case 2:
                    this.sd = new C1449i(this, true);
                    if (isFenetreCree) {
                        setMasqueSaisie(new WDChaine(td[7]));
                        break;
                    }
                    break;
                case 3:
                    this.sd = new C1449i(this, false);
                    if (isFenetreCree) {
                        setMasqueSaisie(new WDChaine(td[6]));
                        break;
                    }
                    break;
                case 4:
                case 7:
                    this.sd = new C1443c(this, true);
                    if (isFenetreCree) {
                        setMasqueSaisie(new WDChaine(td[8]));
                        break;
                    }
                    break;
            }
            if (isFenetreCree) {
                m1432i();
            }
        }
        if (!isChampSaisieMultiLigne()) {
            this.Yc.setImeOptions(this.Yc.getImeOptions() | 268435456);
        }
    }

    public void setValeur(WDObjet wDObjet) {
        setValeur(wDObjet.getString());
    }

    public void setValeur(String str) {
        C1424g.m10031a(this.Yc, str);
        if (this.Yc.hasFocus()) {
            m1431h();
            if (this.nd) {
                this.Yc.setSelection(0, this.Yc.getText().length());
            } else {
                this.Yc.setSelection(this.Yc.getText().length());
            }
        }
    }

    public void setValeurInitiale(WDObjet wDObjet) {
        setValeurInitiale(wDObjet.getString());
    }

    public void setValeurInitiale(String str) {
        this.Rc = str;
        if (isFenetreCree()) {
            setValeur(str);
        }
    }

    public void setVerifieOrthographe(boolean z) {
        if (z != this.Cc) {
            this.Cc = z;
            if (isFenetreCree() && !isAvecMasqueDeSaisie()) {
                if (z) {
                    m1426c();
                } else {
                    m1433j();
                }
            }
        }
    }

    public void terminerInitialisation() {
        super.terminerInitialisation();
        if (this.Rc != null) {
            setValeur(this.Rc);
        }
        if (this.Zb != null) {
            this.Yc.setBackgroundDrawable(null);
            this.Hc = 0;
            this.Yc.setPadding(0, 0, 0, 0);
        } else if (this.Hc >= 0) {
            int i = this.Hc + this.dd;
            int i2 = this.Hc;
            int i3 = C1511l.f4644r;
            if (i2 >= i3) {
                i3 = i2;
            }
            this.Yc.setPadding(i, this.Hc, i3, this.Hc);
        }
        if (this.Gc) {
            this.Cc = false;
        }
        if (!this.Cc) {
            m1433j();
        }
    }

    public void viderChamp() {
        this.ad = true;
        this.Yc.setText("");
        this.ad = false;
    }
}
