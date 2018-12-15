package fr.pcsoft.wdjava.ui.champs.zr;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.LayoutParams;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.HeaderViewListAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ListAdapter;
import android.widget.ListView;
import fr.pcsoft.wdjava.api.WDAPIZoneRepetee;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.C0723g;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.application.WDAppManager;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.context.WDAppelContexte;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.erreur.WDException;
import fr.pcsoft.wdjava.core.p042b.C0657a;
import fr.pcsoft.wdjava.core.p047f.C0712l;
import fr.pcsoft.wdjava.core.p047f.C0713b;
import fr.pcsoft.wdjava.core.p047f.C0715d;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.core.types.cb;
import fr.pcsoft.wdjava.core.utils.C0806j;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.database.hf.ab;
import fr.pcsoft.wdjava.database.hf.bb;
import fr.pcsoft.wdjava.database.hf.p051b.C0836a;
import fr.pcsoft.wdjava.p032m.C0938m;
import fr.pcsoft.wdjava.p061q.p062a.C1014a;
import fr.pcsoft.wdjava.ui.C0489p;
import fr.pcsoft.wdjava.ui.actionbar.C0512g;
import fr.pcsoft.wdjava.ui.activite.C1056i;
import fr.pcsoft.wdjava.ui.cadre.C1110m;
import fr.pcsoft.wdjava.ui.cadre.C1113c;
import fr.pcsoft.wdjava.ui.champs.ad;
import fr.pcsoft.wdjava.ui.champs.fb;
import fr.pcsoft.wdjava.ui.champs.fc;
import fr.pcsoft.wdjava.ui.champs.fenetre.WDFenetre;
import fr.pcsoft.wdjava.ui.champs.fenetreinterne.WDFenetreInterne;
import fr.pcsoft.wdjava.ui.champs.fenetreinterne.hb;
import fr.pcsoft.wdjava.ui.champs.gc;
import fr.pcsoft.wdjava.ui.champs.image.C0520c;
import fr.pcsoft.wdjava.ui.champs.jb;
import fr.pcsoft.wdjava.ui.champs.wc;
import fr.pcsoft.wdjava.ui.champs.xb;
import fr.pcsoft.wdjava.ui.champs.zr.WDAbstractZRRenderer.AbstractRepetitionView;
import fr.pcsoft.wdjava.ui.gesture.C0527h;
import fr.pcsoft.wdjava.ui.gesture.C0528b;
import fr.pcsoft.wdjava.ui.gesture.C1171d;
import fr.pcsoft.wdjava.ui.gesture.C1290a;
import fr.pcsoft.wdjava.ui.p064a.C1031a;
import fr.pcsoft.wdjava.ui.p064a.C1034d;
import fr.pcsoft.wdjava.ui.p065b.C1093d;
import fr.pcsoft.wdjava.ui.p065b.C1099j;
import fr.pcsoft.wdjava.ui.p072i.C1431a;
import fr.pcsoft.wdjava.ui.p072i.C1434f;
import fr.pcsoft.wdjava.ui.p073d.p074a.C1319a;
import fr.pcsoft.wdjava.ui.p073d.p075b.C1320c;
import fr.pcsoft.wdjava.ui.p081j.C1437c;
import fr.pcsoft.wdjava.ui.pulltorefresh.C0514j;
import fr.pcsoft.wdjava.ui.pulltorefresh.C1156d;
import fr.pcsoft.wdjava.ui.pulltorefresh.C1157f;
import fr.pcsoft.wdjava.ui.pulltorefresh.C1488u;
import fr.pcsoft.wdjava.ui.style.C1498d;
import fr.pcsoft.wdjava.ui.utils.C1299d;
import fr.pcsoft.wdjava.ui.utils.C1503b;
import fr.pcsoft.wdjava.ui.utils.C1511l;
import fr.pcsoft.wdjava.ui.utils.C1515p;
import fr.pcsoft.wdjava.ui.utils.C1521w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

@C0723g(a = {WDAPIZoneRepetee.class})
public class WDZoneRepetee extends lc implements C0527h, C0528b, C0514j, C0512g {
    public static final String Hd = m1509z(m1510z("d\u0016!g\u001c\u0017\nx\u001bv\u001d\fr\u001a{$\u001fy\u0000~D"));
    private static final int Id = 40;
    private static final int Kd = 2;
    private static final String Od = m1509z(m1510z("u\tPg\n`\u0014\u0018cGd\u001f\u0014v\u001frU\u000b~Gp\u0013\u001fz\u0019`U\u0004eGT,:Q U2!V\u0003|\u000e\nR\u0005v\u0016-b\u0019c\u0017!@$"));
    private static final int Td = 3;
    private static final int Wd = 1;
    private static final int Zd = 0;
    private static final int ie = 2;
    private static final int le = 1;
    private static final int me = 500;
    private static final int re = 0;
    private static final String[] ve;
    private boolean Ad = false;
    protected int Bd = 0;
    protected int Cd = -16777216;
    private boolean Dd = true;
    protected LinkedList<WDFenetreInterne> Ed = null;
    protected C1315x Fd = null;
    private boolean Gd = false;
    protected String Jd = null;
    protected int Ld = -16777216;
    protected int Md = -16777216;
    private boolean Nd = false;
    protected Paint Pd = null;
    protected C1521w Qd = null;
    protected fb Rd = fb.DOUBLE_BUFFERING_WITH_CACHE;
    protected Paint Sd = null;
    private C1171d Ud = null;
    protected WDAbstractZRRenderer Vd = null;
    private boolean Xd = false;
    private C1298i Yd = null;
    protected int ae = 0;
    protected int be = 0;
    private String ce = null;
    private C1156d de = null;
    private ab ee = ab.DISABLED;
    protected AbsListView fe;
    protected int ge = 0;
    private boolean he = false;
    private Runnable je = null;
    private String ke = null;
    protected int ne = 0;
    private ArrayList<gc> oe = null;
    private View pe = null;
    private String qe = null;
    protected C1290a se = null;
    private int te = 500;
    protected int ue = 0;
    private C1498d xd = new C1498d();
    protected int yd = 0;
    private C1110m zd = null;

    static {
        r0 = new String[16];
        r0[0] = m1509z(m1510z("A\u001e\u001bo\fp\u000e\nr"));
        r0[1] = m1509z(m1510z("\"LN7\bp\u000f\u0017a\b}\u001f\fx\u0000w[J:\u0001|\u0017\u0011s\ba\u0010"));
        r0[2] = m1509z(m1510z("w\t\u001f`\bq\u0017\u001b"));
        r0[3] = m1509z(m1510z("\u0012\rc6`\u001e\u0012r\ng\u0014\fH\u0001|\u0017\u0011H\u0005z\u001c\u0016c"));
        r0[4] = m1509z(m1510z("\"LN7\bp\u000f\u0017a\b}\u001f\fx\u0000w[J:\u0001|\u0017\u0011{\u0000t\u0013\n"));
        r0[5] = m1509z(m1510z("\u0012\rc6`\u001e\u0012r\ng\u0014\fH\u0001|\u0017\u0011H\rr\t\u0015"));
        r0[6] = m1509z(m1510z("r\u0015\u001ae\u0006z\u001f"));
        r0[7] = m1509z(m1510z("_\u001a^a\u001cv[\u000ee\u0000}\u0018\u0017g\b\u001e^s\u001c3\u0018\u0016v\u0004c[\u001f7\rú\u00117g^t\u001bú\u001b"));
        r0[8] = m1509z(m1510z("0>,E6U40T=Z40H3A$=X'G>0B6E:,^(Q7;"));
        r0[9] = m1509z(m1510z("0>,E,F)!_/L>=_,P$7Y G$=_(^+![ V"));
        r0[10] = m1509z(m1510z("0-?[,F)!A(_2:R6P3?Z9LI"));
        r0[11] = m1509z(m1510z("020S P>!^'E:2^-V$=_(^+"));
        r0[12] = m1509z(m1510z("077D=V$(^-V"));
        r0[13] = m1509z(m1510z("_\u001a^a\b\u001e\u000beIz\u0015\nr\u001b}\u001e^y\f3\u0018\u0011e\u001bv\b\u000ex\u0007w[\u000ev\u001a3^b\u00073\u0012þ\u0004v\u0015\n7\fk\u0012\rc\b}\u000f^s\f3\u0017\u001f7\u0013aU"));
        r0[14] = m1509z(m1510z("0=1Y*G21Y'R77C,L51Y6@..G&A/;R6R8=R:L=7T!Z>,H-Z);T="));
        r0[15] = m1509z(m1510z("D?!V=G$?B=\\$"));
        ve = r0;
    }

    public WDZoneRepetee() {
        Context a = C1056i.m7562a();
        createUI(a);
        this.ud = creerModeleDonnees();
        setAdapter((ListAdapter) this.ud.mo3596c());
        if (isHorizontale()) {
            View horizontalScrollView = new HorizontalScrollView(a);
            horizontalScrollView.addView(this.fe);
            ((ViewGroup) getCompConteneur()).addView(horizontalScrollView);
            return;
        }
        ((ViewGroup) getCompConteneur()).addView(getCompPrincipal());
    }

    /* renamed from: a */
    private final Drawable m1501a(int i) {
        Resources b = WDAppManager.m2569b();
        if (i == 5) {
            return null;
        }
        try {
            boolean a;
            Drawable drawable;
            Drawable stateListDrawable;
            int identifier;
            if (this.Jd != null) {
                if (!this.Jd.equals("")) {
                    a = i == 99 ? C1437c.m10098a(this.Jd, getFenetreMere()) : false;
                    if (a) {
                        drawable = null;
                    } else {
                        drawable = C1093d.m7924a(this.Jd);
                        if (drawable == null) {
                            drawable = new ColorDrawable(getSelectedCellBackgroundColor());
                        }
                    }
                    if (i == 99) {
                        if (!(drawable == null || r1)) {
                            stateListDrawable = new StateListDrawable();
                            stateListDrawable.addState(new int[]{16842913}, drawable);
                            stateListDrawable.addState(new int[]{16842919}, drawable);
                            drawable = stateListDrawable;
                        }
                        try {
                            if (!isAvecRupture()) {
                                if (!(this.fe instanceof GridView)) {
                                    return drawable;
                                }
                            }
                            if (drawable == null) {
                                identifier = getFenetreMere().getNomGabarit().toLowerCase().startsWith(ve[4]) ? b.getIdentifier(ve[3], ve[2], ve[6]) : getFenetreMere().getNomGabarit().toLowerCase().startsWith(ve[1]) ? b.getIdentifier(ve[5], ve[2], ve[6]) : 0;
                                if (identifier > 0) {
                                    drawable = b.getDrawable(identifier);
                                }
                                if (drawable == null) {
                                    drawable = b.getDrawable(17301602);
                                }
                            }
                            if (drawable == null) {
                                try {
                                } catch (WDException e) {
                                    throw e;
                                }
                            }
                            return drawable == null ? null : new yb(drawable);
                        } catch (WDException e2) {
                            throw e2;
                        } catch (WDException e22) {
                            throw e22;
                        }
                    } else if (drawable != null) {
                        return drawable;
                    } else {
                        try {
                            if (drawable instanceof StateListDrawable) {
                                return drawable;
                            }
                            ((StateListDrawable) drawable).setState(new int[]{16842910, -16842919, -16842913, 16842908});
                            return drawable;
                        } catch (WDException e222) {
                            throw e222;
                        }
                    }
                }
            }
            drawable = new ShapeDrawable(new RectShape());
            ((ShapeDrawable) drawable).getPaint().setColor(getSelectedCellBackgroundColor());
            ((ShapeDrawable) drawable).getPaint().setStyle(Style.FILL);
            a = false;
            if (i == 99) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(new int[]{16842913}, drawable);
                stateListDrawable.addState(new int[]{16842919}, drawable);
                drawable = stateListDrawable;
                if (isAvecRupture()) {
                    if (this.fe instanceof GridView) {
                        return drawable;
                    }
                }
                if (drawable == null) {
                    if (getFenetreMere().getNomGabarit().toLowerCase().startsWith(ve[4])) {
                    }
                    if (identifier > 0) {
                        drawable = b.getDrawable(identifier);
                    }
                    if (drawable == null) {
                        drawable = b.getDrawable(17301602);
                    }
                }
                return drawable == null ? null : new yb(drawable);
            } else if (drawable != null) {
                return drawable;
            } else {
                if (drawable instanceof StateListDrawable) {
                    return drawable;
                }
                ((StateListDrawable) drawable).setState(new int[]{16842910, -16842919, -16842913, 16842908});
                return drawable;
            }
        } catch (WDException e2222) {
            throw e2222;
        } catch (WDException e22222) {
            throw e22222;
        }
    }

    /* renamed from: a */
    private final void m1502a(int i, boolean z) {
        if (isHorizontale()) {
            View childAt = this.fe.getChildAt(i);
            if (childAt != null) {
                HorizontalScrollView e = m1506e();
                e.scrollTo(childAt.getLeft(), e.getScrollY());
            }
        } else {
            if (z) {
                try {
                    if (isModeMultiColonne()) {
                        C1515p.m10541a();
                    }
                } catch (WDException e2) {
                    throw e2;
                }
            }
            this.fe.setSelection(i);
        }
        if (z) {
            try {
                C1515p.m10541a();
            } catch (WDException e22) {
                throw e22;
            }
        }
    }

    /* renamed from: a */
    private void m1503a(View view) {
        Object tag = view.getTag();
        try {
            if (tag instanceof fr.pcsoft.wdjava.ui.champs.fenetreinterne.fb) {
                view.setTag(null);
                ((WDFenetreInterne) tag).appelPCode(2);
                ((AbstractRepetitionView) view).removeView(((WDFenetreInterne) tag).getCompConteneur());
                ((WDFenetre) this.l).supprimerFenetreInterne((WDFenetreInterne) tag);
                if (this.Ed != null) {
                    this.Ed.remove(tag);
                }
            }
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    private final void m1504a(ab abVar) {
        try {
            if (this.ee != abVar) {
                try {
                    if (this.Yd != null) {
                        this.Yd.m9154a();
                    }
                    try {
                        if (this.ee.isLoadingState() || !abVar.isLoadingState()) {
                            try {
                                if (this.ee.isLoadingState()) {
                                    if (!abVar.isLoadingState()) {
                                        ((ListView) this.fe).removeFooterView(this.pe);
                                    }
                                }
                            } catch (WDException e) {
                                throw e;
                            } catch (WDException e2) {
                                throw e2;
                            }
                        }
                        LayoutParams layoutParams = (LayoutParams) this.pe.getLayoutParams();
                        this.pe.setLayoutParams(new LayoutParams(layoutParams.width, layoutParams.height));
                        ((ListView) this.fe).addFooterView(this.pe, null, false);
                        try {
                            this.ee = abVar;
                            if (abVar != ab.LOADING) {
                                return;
                            }
                            if (_getOccurrence() >= this.te) {
                                m1504a(ab.IDLE);
                            } else {
                                C0938m.m6814b(new nc(this));
                            }
                        } catch (WDException e22) {
                            throw e22;
                        } catch (WDException e222) {
                            throw e222;
                        }
                    } catch (WDException e2222) {
                        throw e2222;
                    }
                } catch (WDException e22222) {
                    throw e22222;
                }
            }
        } catch (WDException e222222) {
            throw e222222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private boolean m1505a(android.view.MotionEvent r9) {
        /*
        r8 = this;
        r3 = 0;
        r2 = 1;
        r0 = r8.se;	 Catch:{ WDException -> 0x0025 }
        if (r0 == 0) goto L_0x0010;
    L_0x0006:
        r0 = r8.se;	 Catch:{ WDException -> 0x0027 }
        r1 = r8.fe;	 Catch:{ WDException -> 0x0027 }
        r0 = r0.mo3434a(r1, r9);	 Catch:{ WDException -> 0x0027 }
        if (r0 != 0) goto L_0x001e;
    L_0x0010:
        r0 = r8.Ud;	 Catch:{ WDException -> 0x0029 }
        if (r0 == 0) goto L_0x002d;
    L_0x0014:
        r0 = r8.Ud;	 Catch:{ WDException -> 0x002b }
        r1 = r8.fe;	 Catch:{ WDException -> 0x002b }
        r0 = r0.mo3434a(r1, r9);	 Catch:{ WDException -> 0x002b }
        if (r0 == 0) goto L_0x002d;
    L_0x001e:
        r0 = r8.fe;	 Catch:{ WDException -> 0x002b }
        r8.onTouch(r0, r9);	 Catch:{ WDException -> 0x002b }
        r0 = r2;
    L_0x0024:
        return r0;
    L_0x0025:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x0027 }
    L_0x0027:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x0029 }
    L_0x0029:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x002b }
    L_0x002b:
        r0 = move-exception;
        throw r0;
    L_0x002d:
        r0 = r8._getEtat();	 Catch:{ WDException -> 0x0066 }
        r1 = 4;
        if (r0 == r1) goto L_0x00e0;
    L_0x0034:
        r0 = r8.isBloqueTouchEvent();	 Catch:{ WDException -> 0x0068 }
        if (r0 != 0) goto L_0x00e0;
    L_0x003a:
        r0 = r9.getAction();	 Catch:{ WDException -> 0x0068 }
        if (r0 != 0) goto L_0x00f7;
    L_0x0040:
        r0 = r9.getX();
        r1 = (int) r0;
        r0 = r9.getY();
        r4 = (int) r0;
        r0 = r8.fe;
        r5 = r0.pointToPosition(r1, r4);
        if (r5 < 0) goto L_0x00e0;
    L_0x0052:
        r0 = r8.fe;
        r6 = r8.fe;
        r6 = r6.getFirstVisiblePosition();
        r6 = r5 - r6;
        r0 = r0.getChildAt(r6);
        r6 = r0 instanceof fr.pcsoft.wdjava.ui.champs.zr.WDAbstractZRRenderer.AbstractRepetitionView;	 Catch:{ WDException -> 0x006a }
        if (r6 != 0) goto L_0x006c;
    L_0x0064:
        r0 = r3;
        goto L_0x0024;
    L_0x0066:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x0068 }
    L_0x0068:
        r0 = move-exception;
        throw r0;
    L_0x006a:
        r0 = move-exception;
        throw r0;
    L_0x006c:
        r0 = (fr.pcsoft.wdjava.ui.champs.zr.WDAbstractZRRenderer.AbstractRepetitionView) r0;
        r6 = r0.mo3541c();
        r7 = 2;
        r7 = new int[r7];
        r7[r3] = r1;
        r7[r2] = r4;
        r1 = r7[r3];
        r4 = r8.getHorizontalScrollPosition();
        r1 = r1 + r4;
        r7[r3] = r1;
        r1 = r8.fe;
        fr.pcsoft.wdjava.ui.utils.C1503b.m10427a(r1, r7, r6);
        r1 = r8.isAvecRupture();
        if (r1 == 0) goto L_0x00be;
    L_0x008d:
        r1 = r8.fe;
        r1 = r1.getSelector();
        if (r1 == 0) goto L_0x009e;
    L_0x0095:
        r4 = r1 instanceof fr.pcsoft.wdjava.ui.champs.zr.yb;	 Catch:{ WDException -> 0x00e3 }
        if (r4 == 0) goto L_0x009e;
    L_0x0099:
        r1 = (fr.pcsoft.wdjava.ui.champs.zr.yb) r1;	 Catch:{ WDException -> 0x00e3 }
        r1.m9275a(r0);	 Catch:{ WDException -> 0x00e3 }
    L_0x009e:
        r1 = r6.getVisibility();	 Catch:{ WDException -> 0x00e5 }
        r4 = 8;
        if (r1 == r4) goto L_0x00b4;
    L_0x00a6:
        r1 = 1;
        r1 = r7[r1];	 Catch:{ WDException -> 0x00e7 }
        if (r1 < 0) goto L_0x00b4;
    L_0x00ab:
        r1 = 1;
        r1 = r7[r1];	 Catch:{ WDException -> 0x00e9 }
        r4 = r6.getHeight();	 Catch:{ WDException -> 0x00e9 }
        if (r1 <= r4) goto L_0x00eb;
    L_0x00b4:
        r1 = r2;
    L_0x00b5:
        r8.Nd = r1;	 Catch:{ WDException -> 0x00ed }
        r1 = r8.Nd;	 Catch:{ WDException -> 0x00ed }
        if (r1 == 0) goto L_0x00be;
    L_0x00bb:
        r8.setValeurInterne(r5);	 Catch:{ WDException -> 0x00ed }
    L_0x00be:
        r1 = r8.isEditable();	 Catch:{ WDException -> 0x00ef }
        if (r1 == 0) goto L_0x00e0;
    L_0x00c4:
        r1 = r8.Nd;	 Catch:{ WDException -> 0x00f1 }
        if (r1 != 0) goto L_0x00e0;
    L_0x00c8:
        r1 = new fr.pcsoft.wdjava.ui.champs.zr.ac;	 Catch:{ WDException -> 0x00f3 }
        r1.<init>(r8, r0, r7, r5);	 Catch:{ WDException -> 0x00f3 }
        r8.je = r1;	 Catch:{ WDException -> 0x00f3 }
        r0 = r8.Fd;	 Catch:{ WDException -> 0x00f3 }
        if (r0 == 0) goto L_0x00e0;
    L_0x00d3:
        r0 = r8.Fd;	 Catch:{ WDException -> 0x00f5 }
        r0 = r0.mo3605h();	 Catch:{ WDException -> 0x00f5 }
        if (r0 != r2) goto L_0x00e0;
    L_0x00db:
        r0 = r8.je;	 Catch:{ WDException -> 0x00f5 }
        r0.run();	 Catch:{ WDException -> 0x00f5 }
    L_0x00e0:
        r0 = r3;
        goto L_0x0024;
    L_0x00e3:
        r0 = move-exception;
        throw r0;
    L_0x00e5:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x00e7 }
    L_0x00e7:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x00e9 }
    L_0x00e9:
        r0 = move-exception;
        throw r0;
    L_0x00eb:
        r1 = r3;
        goto L_0x00b5;
    L_0x00ed:
        r0 = move-exception;
        throw r0;
    L_0x00ef:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x00f1 }
    L_0x00f1:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x00f3 }
    L_0x00f3:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x00f5 }
    L_0x00f5:
        r0 = move-exception;
        throw r0;
    L_0x00f7:
        r0 = r9.getAction();	 Catch:{ WDException -> 0x010c }
        if (r0 != r2) goto L_0x00e0;
    L_0x00fd:
        r0 = r8.Nd;	 Catch:{ WDException -> 0x010a }
        if (r0 == 0) goto L_0x00e0;
    L_0x0101:
        r0 = new fr.pcsoft.wdjava.ui.champs.zr.zb;	 Catch:{ WDException -> 0x010a }
        r0.<init>(r8);	 Catch:{ WDException -> 0x010a }
        fr.pcsoft.wdjava.ui.utils.C1504c.m10454a(r0);	 Catch:{ WDException -> 0x010a }
        goto L_0x00e0;
    L_0x010a:
        r0 = move-exception;
        throw r0;
    L_0x010c:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x010a }
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.ui.champs.zr.WDZoneRepetee.a(android.view.MotionEvent):boolean");
    }

    /* renamed from: e */
    private final HorizontalScrollView m1506e() {
        return (HorizontalScrollView) this.fe.getParent();
    }

    /* renamed from: g */
    private void m1507g() {
        C1320c c1320c = (C1320c) getBindingManager(C1320c.class);
        if (c1320c != null) {
            int a;
            ad adVar = (ad) getItemCourant();
            if (adVar != null) {
                try {
                    a = adVar.mo3416a();
                } catch (WDException e) {
                    throw e;
                }
            }
            a = -1;
            if (a > 0) {
                try {
                    c1320c.mo3638a(a, true);
                } catch (WDException e2) {
                    throw e2;
                }
            }
        }
    }

    /* renamed from: h */
    private void m1508h() {
        try {
            if (this.se == null) {
                this.se = new C1291c(this, this.fe, getCellHeight());
            }
        } catch (WDException e) {
            throw e;
        }
    }

    /* renamed from: z */
    private static String m1509z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 19;
                    break;
                case 1:
                    i2 = 123;
                    break;
                case 2:
                    i2 = 126;
                    break;
                case 3:
                    i2 = 23;
                    break;
                default:
                    i2 = 105;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1510z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 105);
        }
        return toCharArray;
    }

    public int _getOccurrence() {
        try {
            return this.Zc != null ? this.Zc.mo3616b() != C0715d.DIRECT_ACCESS ? Math.max(this.Zc.mo3626f(), this.ud.mo3586a()) : this.Zc.mo3626f() : super._getOccurrence();
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        }
    }

    protected int _insererItem(ec ecVar, int i, boolean z, boolean z2) {
        int _insererItem = super._insererItem(ecVar, i, z, z2);
        if (_insererItem >= 0) {
            try {
                if (isMemoire()) {
                    if (_getOccurrence() == 1) {
                        this.Vc.mo3489c(0, 0);
                    }
                }
                try {
                    if (!(this.Zc == null || z2)) {
                        this.Vc.mo3489c(_insererItem, _insererItem);
                    }
                } catch (WDException e) {
                    throw e;
                } catch (WDException e2) {
                    throw e2;
                }
            } catch (WDException e22) {
                throw e22;
            } catch (WDException e222) {
                throw e222;
            }
        }
        return _insererItem;
    }

    public WDBooleen _tableRafraichissementVisible() {
        try {
            return new WDBooleen(this.de != null ? this.de.isRefreshing() : false);
        } catch (WDException e) {
            throw e;
        }
    }

    public void _tableRafraichissementVisible(boolean z) {
        try {
            if (this.de != null) {
                this.de.mo3428a(z);
            }
        } catch (WDException e) {
            throw e;
        }
    }

    /* renamed from: a */
    void m1511a(gc gcVar, ec ecVar, boolean z) {
    }

    public jb addBindingItem(int i) {
        boolean z = this.Wc;
        this.Wc = true;
        try {
            ec ecVar = (ec) createBindingItem();
            super._insererItem(ecVar, i, false, true);
            return ecVar;
        } finally {
            this.Wc = z;
        }
    }

    public int addFI(String str, WDObjet... wDObjetArr) {
        WDErreurManager.m2883a(C0745b.m3222b(ve[8], getName()));
        return -1;
    }

    public int adjustChildHeightChange(fc fcVar, int i) {
        return i;
    }

    public int adjustChildWidthChange(fc fcVar, int i) {
        return i;
    }

    public void affecterAttributVersPropChamp(ec ecVar, gc gcVar) {
        try {
            super.affecterAttributVersPropChamp(ecVar, gcVar);
            if (this.oe != null && !this.oe.isEmpty()) {
                Iterator it = this.oe.iterator();
                while (it.hasNext()) {
                    gc gcVar2 = (gc) it.next();
                    if (gcVar == null || gcVar == gcVar2) {
                        try {
                            gcVar2.updateLayout();
                        } catch (WDException e) {
                            throw e;
                        }
                    }
                }
            }
        } catch (WDException e2) {
            throw e2;
        }
    }

    public void ajouterAttributZR(WDAttributZR wDAttributZR) {
        super.ajouterAttributZR(wDAttributZR);
        EWDPropriete proprieteAssocie = wDAttributZR.getProprieteAssocie();
        if (proprieteAssocie != null) {
            try {
                if (!isPropNeedUpdateLayout(proprieteAssocie)) {
                    return;
                }
                if (this.Rd.isDoubleBufferedRendering()) {
                    try {
                        if (this.oe == null) {
                            this.oe = new ArrayList(5);
                        }
                        gc champAssocie = wDAttributZR.getChampAssocie();
                        if (champAssocie != null) {
                            try {
                                if (this.oe.indexOf(champAssocie) < 0) {
                                    this.oe.add(champAssocie);
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
            } catch (WDException e222) {
                throw e222;
            }
        }
    }

    public void ajouterChamp(String str, gc gcVar) {
        try {
            super.ajouterChamp(str, gcVar);
            if (this.Rd == fb.VIEWS_RECYCLING) {
                return;
            }
            if (gcVar.getTypeChamp() == 23) {
                this.Rd = fb.VIEWS_RECYCLING;
            }
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        }
    }

    public void ajouterSelection(int[] iArr) throws WDException {
        try {
            super.ajouterSelection(iArr);
            if (this.Vc != null && !this.Vc.mo3495g()) {
                int d = this.Vc.mo3490d();
                if (d >= 0) {
                    try {
                        if (d >= getFirstVisibleElement()) {
                            if (d <= getLastVisibleElement()) {
                                return;
                            }
                        }
                        m1502a(d, true);
                    } catch (WDException e) {
                        throw e;
                    } catch (WDException e2) {
                        throw e2;
                    }
                }
            }
        } catch (WDException e22) {
            throw e22;
        }
    }

    protected final void ancrerChampsRuptures(int i) {
        if (i != 0 && this.vd != null) {
            for (WDRuptureZR ancrerChamps : this.vd.values()) {
                ancrerChamps.ancrerChamps(i, 0);
            }
        }
    }

    protected void appliquerCouleur(int i) {
        this.xd.mo3802b(2, C1031a.m7469m(i));
    }

    protected void appliquerCouleurFond(int i) {
        C1034d m = C1031a.m7469m(i);
        try {
            this.xd.mo3802b(3, m);
            this.fe.setBackgroundColor(i);
            if (Color.alpha(m.mo3315b()) == 255) {
                this.fe.setCacheColorHint(m.mo3315b());
            } else {
                this.fe.setCacheColorHint(0);
            }
        } catch (WDException e) {
            throw e;
        }
    }

    protected void appliquerCouleurFondTransparent() {
        this.xd.mo3802b(3, C1034d.m7495u());
        this.fe.setCacheColorHint(0);
        this.fe.setBackgroundDrawable(null);
    }

    protected void appliquerTransparent() {
        this.xd.mo3802b(2, C1034d.m7495u());
    }

    protected void apresSuppressionParSwipe() {
        initialiserAction();
    }

    protected WDObjet avantSuppressionParSwipe() {
        initialiserAction();
        return null;
    }

    protected boolean basculerEnroulementRupture(int i, int i2) {
        boolean basculerEnroulementRupture = super.basculerEnroulementRupture(i, i2);
        if (basculerEnroulementRupture) {
            try {
                this.Vd.mo3556e(i2);
            } catch (WDException e) {
                throw e;
            }
        }
        return basculerEnroulementRupture;
    }

    public WDObjet[] buildBindingItemData() {
        WDObjet[] wDObjetArr = new WDObjet[getNbAttribut()];
        for (WDAttributZR wDAttributZR : this.nd.values()) {
            if (wDAttributZR != null) {
                C0712l liaisonDataBinding = wDAttributZR.getLiaisonDataBinding();
                if (liaisonDataBinding != null) {
                    try {
                        if (liaisonDataBinding.mo2603c()) {
                            wDObjetArr[wDAttributZR.getIndiceAttribut()] = this.Zc.mo3607a(liaisonDataBinding);
                        }
                    } catch (WDException e) {
                        throw e;
                    }
                }
                continue;
            }
        }
        return wDObjetArr;
    }

    public boolean canHandleHeightAnchoredToContentChildren() {
        try {
            return !isHorizontale();
        } catch (WDException e) {
            throw e;
        }
    }

    public boolean canHandleWidthAnchoredToContentChildren() {
        return isHorizontale();
    }

    protected boolean canScroll(int i, int i2) {
        try {
            if (super.canScroll(i, i2)) {
                return true;
            }
            if (isHorizontale()) {
                return C1503b.m10440a((wc) this, i);
            }
            try {
                return Math.abs(i) > Math.abs(i2) ? isSwipeEnabled() : C1503b.m10440a((wc) this, i2);
            } catch (WDException e) {
                throw e;
            }
        } catch (WDException e2) {
            throw e2;
        } catch (WDException e22) {
            throw e22;
        }
    }

    public final void cancelSwipe() {
        if (isSwipeEnabled()) {
            this.se.m9013a(this.se.m9029j(), true);
        }
    }

    protected WDObjet chargementElementSupp() {
        initialiserAction();
        return null;
    }

    public int chercherElementSurAttribut(WDAttributZR wDAttributZR, String str, int i, int i2) {
        C1320c c1320c = (C1320c) getBindingManager(C1320c.class);
        if (c1320c != null) {
            try {
                if (c1320c.mo3616b() == C0715d.DIRECT_ACCESS) {
                    if (wDAttributZR == null) {
                        WDErreurManager.m2883a(C0745b.m3222b(ve[14], getName()));
                    }
                    C0712l liaisonDataBinding = wDAttributZR.getLiaisonDataBinding();
                    try {
                        return liaisonDataBinding instanceof C0836a ? c1320c.mo3665a(((C0836a) liaisonDataBinding).mo3128g(), str, i, i2) : -1;
                    } catch (WDException e) {
                        throw e;
                    }
                }
            } catch (WDException e2) {
                throw e2;
            } catch (WDException e22) {
                throw e22;
            }
        }
        if (c1320c != null) {
            try {
                if (c1320c.mo3616b() == C0715d.MEMORY) {
                    c1320c.mo3627g();
                }
            } catch (WDException e222) {
                throw e222;
            }
        }
        return super.chercherElementSurAttribut(wDAttributZR, str, i, i2);
    }

    protected int convertirIndiceModeleVersVue(int i) {
        try {
            if (this.Zc != null) {
                if (this.Zc.mo3616b() == C0715d.DIRECT_ACCESS) {
                    return getFirstVisibleElement() + i;
                }
            }
            return super.convertirIndiceModeleVersVue(i);
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        }
    }

    public int convertirIndiceVueVersModele(int i) {
        try {
            if (this.Zc != null) {
                if (this.Zc.mo3616b() == C0715d.DIRECT_ACCESS) {
                    return i - getFirstVisibleElement();
                }
            }
            return super.convertirIndiceVueVersModele(i);
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        }
    }

    public jb createBindingItem() {
        WDObjet wDObjet = null;
        if (this.Zc == null) {
            return null;
        }
        WDObjet[] buildBindingItemData = buildBindingItemData();
        if (this.Zc instanceof C1320c) {
            return new fc(this, buildBindingItemData, (C1320c) this.Zc);
        }
        if (!(this.Zc instanceof C1319a)) {
            return null;
        }
        if (this.Xc != null) {
            wDObjet = this.Zc.mo3607a(this.Xc);
        }
        return new gc(this, buildBindingItemData, wDObjet);
    }

    protected C1315x createEditor() {
        try {
            return this.Rd.isDoubleBufferedRendering() ? new C1316y(this) : new C1317z(this);
        } catch (WDException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected fr.pcsoft.wdjava.ui.champs.zr.WDAbstractZRRenderer createRenderer() {
        /*
        r3 = this;
        r0 = r3.isSwipeEnabled();	 Catch:{ WDException -> 0x0029 }
        if (r0 != 0) goto L_0x000c;
    L_0x0006:
        r0 = r3.isAvecRupture();	 Catch:{ WDException -> 0x002b }
        if (r0 == 0) goto L_0x0010;
    L_0x000c:
        r0 = fr.pcsoft.wdjava.ui.champs.fb.VIEWS_RECYCLING;	 Catch:{ WDException -> 0x002b }
        r3.Rd = r0;	 Catch:{ WDException -> 0x002b }
    L_0x0010:
        r0 = r3.Rd;	 Catch:{ WDException -> 0x002d }
        r0 = r0.isDoubleBufferedRendering();	 Catch:{ WDException -> 0x002d }
        if (r0 == 0) goto L_0x0033;
    L_0x0018:
        r1 = new fr.pcsoft.wdjava.ui.champs.zr.e;	 Catch:{ WDException -> 0x002f }
        r0 = r3.Rd;	 Catch:{ WDException -> 0x002f }
        r2 = fr.pcsoft.wdjava.ui.champs.fb.DOUBLE_BUFFERING_WITH_CACHE;	 Catch:{ WDException -> 0x002f }
        if (r0 != r2) goto L_0x0031;
    L_0x0020:
        r0 = 1;
    L_0x0021:
        r1.<init>(r3, r0);
        r0 = r1;
    L_0x0025:
        r0.mo3558g();
        return r0;
    L_0x0029:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x002b }
    L_0x002b:
        r0 = move-exception;
        throw r0;
    L_0x002d:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x002f }
    L_0x002f:
        r0 = move-exception;
        throw r0;
    L_0x0031:
        r0 = 0;
        goto L_0x0021;
    L_0x0033:
        r0 = new fr.pcsoft.wdjava.ui.champs.zr.f;
        r0.<init>(r3);
        goto L_0x0025;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.ui.champs.zr.WDZoneRepetee.createRenderer():fr.pcsoft.wdjava.ui.champs.zr.WDAbstractZRRenderer");
    }

    protected void createUI(Context context) {
        try {
            try {
                C0691a.m2860a(this.fe == null, ve[7]);
                if (isModeMultiColonne()) {
                    this.fe = new C1288a(this, context);
                } else {
                    try {
                        if (isHorizontale()) {
                            this.fe = new gb(this, context);
                        } else {
                            this.fe = new C1300j(this, context);
                        }
                    } catch (WDException e) {
                        throw e;
                    }
                }
                try {
                    if (this.fe.getOnItemClickListener() == null) {
                        this.fe.setOnItemClickListener(this);
                    }
                    try {
                        if (this.fe.getOnItemLongClickListener() == null) {
                            this.fe.setOnItemLongClickListener(this);
                        }
                        this.fe.setCacheColorHint(0);
                    } catch (WDException e2) {
                        throw e2;
                    }
                } catch (WDException e22) {
                    throw e22;
                }
            } catch (WDException e222) {
                throw e222;
            }
        } catch (WDException e2222) {
            throw e2222;
        }
    }

    protected pb creerLiaisonRupture(WDRuptureZR wDRuptureZR, WDRuptureZR wDRuptureZR2, String str) {
        C1320c c1320c = (C1320c) getBindingManager(C1320c.class);
        if (c1320c != null) {
            try {
                if (c1320c.mo3616b() == C0715d.MEMORY && getAttributByName(str) == null) {
                    String str2 = "";
                    if (c1320c.mo3634n() != null) {
                        str2 = ((ab) c1320c.mo3634n()).mo2719a() + "." + str;
                        C0712l a = ((bb) WDAppelContexte.m2679a(bb.class)).mo3080a(str2);
                        WDAttributZR creerAttribut = creerAttribut(ve[15] + str2, null, null);
                        creerAttribut.setLiaisonDataBinding(a);
                        return new qb(this, wDRuptureZR, wDRuptureZR2, creerAttribut);
                    }
                }
            } catch (WDException e) {
                throw e;
            }
        }
        return super.creerLiaisonRupture(wDRuptureZR, wDRuptureZR2, str);
    }

    protected ub creerModeleDonnees() {
        return new C1312u(this);
    }

    protected final Paint creerPaintSeparateur(int i, boolean z) {
        Paint paint = new Paint();
        int i2 = C1511l.f4632f;
        if (z) {
            try {
                paint.setStyle(Style.STROKE);
                paint.setStrokeCap(Cap.BUTT);
                paint.setStrokeJoin(Join.MITER);
                paint.setStrokeMiter((float) i2);
                paint.setPathEffect(new DashPathEffect(new float[]{(float) i2, (float) i2}, 0.0f));
            } catch (WDException e) {
                throw e;
            }
        }
        paint.setStrokeWidth((float) i2);
        paint.setAntiAlias(false);
        paint.setDither(false);
        paint.setColor(i);
        return paint;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: d */
    int m1512d() {
        /*
        r2 = this;
        r0 = r2.isHorizontale();	 Catch:{ WDException -> 0x001b }
        if (r0 != 0) goto L_0x0021;
    L_0x0006:
        r0 = r2.ne;	 Catch:{ WDException -> 0x001d }
        if (r0 == 0) goto L_0x0014;
    L_0x000a:
        r0 = r2.ne;	 Catch:{ WDException -> 0x001f }
        r1 = r2.fe;	 Catch:{ WDException -> 0x001f }
        r1 = r1.getHeight();	 Catch:{ WDException -> 0x001f }
        if (r0 <= r1) goto L_0x0021;
    L_0x0014:
        r0 = r2.fe;	 Catch:{ WDException -> 0x001f }
        r0 = r0.getHeight();	 Catch:{ WDException -> 0x001f }
    L_0x001a:
        return r0;
    L_0x001b:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x001d }
    L_0x001d:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x001f }
    L_0x001f:
        r0 = move-exception;
        throw r0;
    L_0x0021:
        r0 = r2.isHorizontale();	 Catch:{ WDException -> 0x0040 }
        if (r0 == 0) goto L_0x0046;
    L_0x0027:
        r0 = r2.ne;	 Catch:{ WDException -> 0x0042 }
        if (r0 == 0) goto L_0x0037;
    L_0x002b:
        r0 = r2.ne;	 Catch:{ WDException -> 0x0044 }
        r1 = r2.m1506e();	 Catch:{ WDException -> 0x0044 }
        r1 = fr.pcsoft.wdjava.ui.utils.C1503b.m10442b(r1);	 Catch:{ WDException -> 0x0044 }
        if (r0 <= r1) goto L_0x0046;
    L_0x0037:
        r0 = r2.m1506e();	 Catch:{ WDException -> 0x0044 }
        r0 = fr.pcsoft.wdjava.ui.utils.C1503b.m10442b(r0);	 Catch:{ WDException -> 0x0044 }
        goto L_0x001a;
    L_0x0040:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x0042 }
    L_0x0042:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x0044 }
    L_0x0044:
        r0 = move-exception;
        throw r0;
    L_0x0046:
        r0 = r2.ne;
        goto L_0x001a;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.ui.champs.zr.WDZoneRepetee.d():int");
    }

    protected void declarerLiaisonRupture(WDRuptureZR wDRuptureZR, WDRuptureZR wDRuptureZR2, String str) {
        try {
            if (isModeMultiColonne()) {
                if (this.rd == (byte) 0) {
                    try {
                        if (this.pd != 1) {
                            return;
                        }
                    } catch (WDException e) {
                        throw e;
                    }
                } else {
                    return;
                }
            }
            try {
                if (!isHorizontale()) {
                    super.declarerLiaisonRupture(wDRuptureZR, wDRuptureZR2, str);
                }
            } catch (WDException e2) {
                throw e2;
            }
        } catch (WDException e22) {
            throw e22;
        } catch (WDException e222) {
            throw e222;
        }
    }

    public void deplacerLigne(int i, int i2, boolean z) {
        boolean a = this.Vc.mo3485a(i);
        if (a) {
            try {
                this.Vc.mo3491d(i, i);
            } catch (WDException e) {
                throw e;
            }
        }
        try {
            super.deplacerLigne(i, i2, z);
            if (a) {
                this.Vc.mo3487b(i2, i2);
            }
        } catch (WDException e2) {
            throw e2;
        }
    }

    public void deroulerTout() {
        try {
            if (this.Zc != null) {
                if (this.Zc.mo3616b() == C0715d.MEMORY) {
                    while (this.Zc.mo3626f() > this.ud.mo3586a()) {
                        try {
                            C0806j.m3953c();
                        } catch (WDException e) {
                            throw e;
                        }
                    }
                }
            }
            super.deroulerTout();
            this.Vd.mo3556e(-1);
        } catch (WDException e2) {
            throw e2;
        } catch (WDException e22) {
            throw e22;
        }
    }

    protected WDObjet dndDebutGlisser() {
        initialiserAction();
        return null;
    }

    protected WDObjet dndLacher() {
        initialiserAction();
        return null;
    }

    public void echangerLigne(int i, int i2, boolean z) {
        boolean a = this.Vc.mo3485a(i);
        boolean a2 = this.Vc.mo3485a(i2);
        if (a) {
            try {
                this.Vc.mo3491d(i, i);
            } catch (WDException e) {
                throw e;
            }
        }
        if (a2) {
            try {
                this.Vc.mo3491d(i2, i2);
            } catch (WDException e2) {
                throw e2;
            }
        }
        try {
            super.echangerLigne(i, i2, z);
            if (a) {
                this.Vc.mo3487b(i2, i2);
            }
            if (a2) {
                try {
                    this.Vc.mo3487b(i, i);
                } catch (WDException e22) {
                    throw e22;
                }
            }
        } catch (WDException e222) {
            throw e222;
        }
    }

    public void enroulerTout() {
        try {
            if (this.Zc != null) {
                if (this.Zc.mo3616b() == C0715d.MEMORY) {
                    while (this.Zc.mo3626f() > this.ud.mo3586a()) {
                        try {
                            C0806j.m3953c();
                        } catch (WDException e) {
                            throw e;
                        }
                    }
                }
            }
            super.enroulerTout();
            this.Vd.mo3556e(-1);
        } catch (WDException e2) {
            throw e2;
        } catch (WDException e22) {
            throw e22;
        }
    }

    protected void execPCodeAffichageLigne(ec ecVar) {
        int i = -1;
        C1320c c1320c = (C1320c) getBindingManager(C1320c.class);
        if (c1320c != null) {
            try {
                if (ecVar instanceof ad) {
                    i = c1320c.mo3652t();
                    c1320c.mo3638a(((ad) ecVar).mo3416a(), true);
                }
            } catch (WDException e) {
                throw e;
            }
        }
        try {
            appelPCode(21);
            if (c1320c != null && i >= 0) {
                c1320c.mo3638a(i, false);
            }
        } catch (WDException e2) {
            throw e2;
        } catch (WDException e22) {
            throw e22;
        }
    }

    protected void execPCodeApresSuppressionParSwipe() {
        m1507g();
        appelPCode(C0607n.ps);
    }

    protected WDObjet executerPCode(int i) {
        switch (i) {
            case 101:
                return dndDebutGlisser();
            case 102:
                return dndLacher();
            case 238:
                modifPositionAscenseur();
                return null;
            case C0607n.bh /*241*/:
                return chargementElementSupp();
            case C0607n.Fx /*1135*/:
                try {
                    return swipe();
                } catch (WDException e) {
                    throw e;
                }
            case C0607n.Hl /*1136*/:
                return avantSuppressionParSwipe();
            case C0607n.ps /*1137*/:
                apresSuppressionParSwipe();
                return null;
            case C0607n.Vh /*1141*/:
                return raffraichissementPTR();
            default:
                return super.executerPCode(i);
        }
    }

    /* renamed from: f */
    final String m1513f() {
        return this.qe;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected android.view.View findViewInterceptMoveMotionEvent() {
        /*
        r2 = this;
        r0 = r2.isHorizontale();	 Catch:{ WDException -> 0x000f }
        if (r0 == 0) goto L_0x0011;
    L_0x0006:
        r0 = r2.fe;	 Catch:{ WDException -> 0x000f }
        r0 = r0.getParent();	 Catch:{ WDException -> 0x000f }
        r0 = (android.view.View) r0;	 Catch:{ WDException -> 0x000f }
    L_0x000e:
        return r0;
    L_0x000f:
        r0 = move-exception;
        throw r0;
    L_0x0011:
        r0 = fr.pcsoft.wdjava.ui.champs.fenetreinterne.fb.class;
        r0 = r2.getChampParent(r0);
        r0 = (fr.pcsoft.wdjava.ui.champs.fenetreinterne.fb) r0;
        if (r0 != 0) goto L_0x0023;
    L_0x001b:
        r1 = fr.pcsoft.wdjava.ui.champs.onglet.C1246j.class;
        r1 = r2.getChampParent(r1);	 Catch:{ WDException -> 0x0032 }
        if (r1 == 0) goto L_0x0038;
    L_0x0023:
        if (r0 == 0) goto L_0x002d;
    L_0x0025:
        r0 = r0.getChampFenetreInterne();	 Catch:{ WDException -> 0x0036 }
        r0 = r0 instanceof fr.pcsoft.wdjava.ui.champs.slidingmenu.C0526d;	 Catch:{ WDException -> 0x0036 }
        if (r0 != 0) goto L_0x0038;
    L_0x002d:
        r0 = super.findViewInterceptMoveMotionEvent();	 Catch:{ WDException -> 0x0036 }
        goto L_0x000e;
    L_0x0032:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x0034 }
    L_0x0034:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x0036 }
    L_0x0036:
        r0 = move-exception;
        throw r0;
    L_0x0038:
        r0 = r2.fe;
        goto L_0x000e;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.ui.champs.zr.WDZoneRepetee.findViewInterceptMoveMotionEvent():android.view.View");
    }

    public WDObjet get(int i) {
        C1320c c1320c = (C1320c) getBindingManager(C1320c.class);
        if (c1320c == null) {
            return super.get(i);
        }
        try {
            if (c1320c.mo3616b() == C0715d.MEMORY) {
                if (i > getItemCount()) {
                    c1320c.mo3627g();
                }
            }
            return (ec) c1320c.mo3608a(C0725i.m3011a(i));
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        }
    }

    protected final C1297h getAdapter() {
        ListAdapter listAdapter = (ListAdapter) this.fe.getAdapter();
        if (listAdapter instanceof HeaderViewListAdapter) {
            listAdapter = ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        }
        return (C1297h) listAdapter;
    }

    public final int getBackgroundColor() {
        int color;
        Drawable background = this.fe.getBackground();
        if (background != null) {
            try {
                if (background instanceof ColorDrawable) {
                    color = ((ColorDrawable) background).getColor();
                    if (color == 0) {
                        return color;
                    }
                    try {
                        return this.kc == null ? this.kc.mo3387l() : color;
                    } catch (WDException e) {
                        throw e;
                    }
                }
            } catch (WDException e2) {
                throw e2;
            }
        }
        color = 0;
        if (color == 0) {
            return color;
        }
        if (this.kc == null) {
        }
    }

    public final int getBottomLastVisibleCell() {
        if (this.fe.getChildCount() > 0) {
            try {
                View childAt = this.fe.getChildAt(this.fe.getChildCount() - 1);
            } catch (WDException e) {
                throw e;
            }
        }
        childAt = null;
        if (childAt == null) {
            return 0;
        }
        try {
            return childAt.getBottom();
        } catch (WDException e2) {
            throw e2;
        }
    }

    public final C1110m getCellBackgroundBorder() {
        return this.zd;
    }

    public int getCellHeight() {
        try {
            return isHorizontale() ? C1503b.m10449c(m1506e()) : this.ge;
        } catch (WDException e) {
            throw e;
        }
    }

    protected int getCellWidth() {
        return -1;
    }

    public gc getChampAtPoint(int i, int i2, boolean z) {
        int rowAtPoint = getRowAtPoint(i, i2, z);
        if (rowAtPoint >= 0) {
            View childAt = this.fe.getChildAt(rowAtPoint - this.fe.getFirstVisiblePosition());
            if (childAt != null) {
                int i3;
                Iterator d;
                if (z) {
                    int[] iArr = new int[2];
                    this.fe.getLocationOnScreen(iArr);
                    i -= iArr[0];
                    i2 -= iArr[1];
                }
                Rect rect = new Rect();
                childAt.getHitRect(rect);
                int i4 = i - rect.left;
                int i5 = i2 - rect.top;
                if (this.Rd == fb.VIEWS_RECYCLING) {
                    childAt = ((AbstractRepetitionView) childAt).mo3541c();
                    childAt.getHitRect(rect);
                    i3 = i4 - rect.left;
                    i4 = i5 - rect.top;
                    d = ((C1309r) childAt).m9188d();
                } else {
                    i3 = i4;
                    i4 = i5;
                    d = this.sd.values().iterator();
                }
                while (d.hasNext()) {
                    gc gcVar = (gc) d.next();
                    try {
                        gcVar.getCompConteneur().getHitRect(rect);
                        if (rect.contains(i3, i4)) {
                            if (gcVar.getCompConteneur() == gcVar.getCompPrincipal()) {
                                return gcVar;
                            }
                            i3 -= rect.left;
                            i4 -= rect.top;
                            try {
                                gcVar.getCompPrincipal().getHitRect(rect);
                                if (rect.contains(i3, i4)) {
                                    return gcVar;
                                }
                            } catch (WDException e) {
                                throw e;
                            }
                        }
                        i3 = i3;
                        i4 = i4;
                    } catch (WDException e2) {
                        throw e2;
                    }
                }
            }
        }
        return null;
    }

    public View getCompPrincipal() {
        return getListView();
    }

    public final C1315x getEditor() {
        return this.Fd;
    }

    public int getElementHeight() {
        return getCellHeight();
    }

    public WDBooleen getEnSaisie() {
        return new WDBooleen(isEditable());
    }

    public final int getEvenCellBackgroundColor() {
        return this.yd;
    }

    public final int getEvenCellTextColor() {
        return this.Cd;
    }

    public C0489p getFils(String str) {
        C0489p fils = super.getFils(str);
        if (fils == null) {
            try {
                if (this.Ed != null) {
                    Iterator it = this.Ed.iterator();
                    while (it.hasNext()) {
                        fils = ((WDFenetreInterne) it.next()).getFils(str);
                        if (fils != null) {
                            break;
                        }
                    }
                }
            } catch (WDException e) {
                throw e;
            }
        }
        return fils;
    }

    public C0489p getFilsDirect(String str) {
        C0489p filsDirect = super.getFilsDirect(str);
        if (filsDirect == null) {
            try {
                if (this.Ed != null) {
                    Iterator it = this.Ed.iterator();
                    while (it.hasNext()) {
                        WDFenetreInterne wDFenetreInterne = (WDFenetreInterne) it.next();
                        if (C0808l.m4042c(wDFenetreInterne.getName(), str, 20) == 0) {
                            return wDFenetreInterne;
                        }
                    }
                }
            } catch (WDException e) {
                throw e;
            }
        }
        return filsDirect;
    }

    public int getFirstVisibleElement() {
        if (!isHorizontale()) {
            return this.fe.getFirstVisiblePosition();
        }
        return this.fe.pointToPosition(m1506e().getScrollX(), 0);
    }

    public final C1290a getGestureControler() {
        return this.se;
    }

    public WDEntier4 getHauteurLigne() {
        return new WDEntier4((double) C1511l.m10515a((float) getCellHeight(), 1, getDisplayUnit()));
    }

    public WDEntier4 getHauteurLigneMax() {
        return new WDEntier4((double) C1511l.m10515a((float) this.ne, 1, getDisplayUnit()));
    }

    public int getHorizontalScrollPosition() {
        return 0;
    }

    public WDObjet getImageFondLigne() {
        try {
            return this.zd instanceof C1113c ? new WDChaine(((C1113c) this.zd).m8141q()) : new WDChaine();
        } catch (WDException e) {
            throw e;
        }
    }

    public String getInfoChampXY(int i, int i2, boolean z) {
        gc champAtPoint = getChampAtPoint(i, i2, z);
        if (champAtPoint == null) {
            return "";
        }
        try {
            return champAtPoint.getName();
        } catch (WDException e) {
            throw e;
        }
    }

    public int getInfoLigneXY(int i, int i2, boolean z) {
        return C0725i.m3069e(getRowAtPoint(i, i2, z));
    }

    public int getItemCount() {
        try {
            if (this.Zc != null) {
                if (this.Zc.mo3616b() == C0715d.DIRECT_ACCESS) {
                    return getAdapter().m9140b();
                }
            }
            return this.ud.mo3586a();
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        }
    }

    protected int getLargeurColonneZR() {
        try {
            if (!isHorizontale()) {
                if (this.rd == (byte) 0) {
                    try {
                        return C1503b.m10442b(this.fe.getParent() != getCompConteneur() ? (View) this.fe.getParent() : this.fe) / Math.max(getNbColonneZR(), 1);
                    } catch (WDException e) {
                        throw e;
                    }
                }
            }
            return this.kd;
        } catch (WDException e2) {
            throw e2;
        } catch (WDException e22) {
            throw e22;
        }
    }

    public int getLastVisibleElement() {
        if (isHorizontale()) {
            HorizontalScrollView e = m1506e();
            int scrollX = e.getScrollX();
            return this.fe.pointToPosition((Math.min(e.getMeasuredWidth(), this.fe.getMeasuredWidth()) + scrollX) - 1, 0);
        }
        try {
            if (this.fe.getChildCount() != 0 || this.ud.mo3586a() > 0) {
            }
            return this.fe.getLastVisiblePosition();
        } catch (WDException e2) {
            throw e2;
        }
    }

    public AbsListView getListView() {
        return this.fe;
    }

    public int getMaxItemCountPerRow() {
        return getNbColonneZR();
    }

    public int getMaxVisibleRowCount() {
        double c = (double) C1503b.m10449c(this.fe);
        if (c == 0.0d) {
            c = (double) _getHauteur();
        }
        return (int) Math.ceil(c / ((double) getElementHeight()));
    }

    public int getMinCellHeight() {
        return getCellHeight();
    }

    public int getMinCellWidth() {
        return getLargeurColonneZR();
    }

    protected int getNbColonneZR() {
        try {
            if (isHorizontale()) {
                return getNbElement();
            }
            try {
                return this.rd == (byte) 1 ? Math.max(1, C1503b.m10442b(this.fe) / this.kd) : this.pd;
            } catch (WDException e) {
                throw e;
            }
        } catch (WDException e2) {
            throw e2;
        }
    }

    public int getNbElement() {
        return _getOccurrence();
    }

    public int getNbLigneAffichee() {
        return (getLastVisibleElement() - getFirstVisibleElement()) + 1;
    }

    public int getNbLigneVisible(boolean z) {
        int nbLigneAffichee = getNbLigneAffichee();
        if (z || nbLigneAffichee <= 1) {
            return nbLigneAffichee;
        }
        try {
            return this.fe.pointToPosition(0, this.fe.getHeight() - getCellHeight()) != this.fe.getLastVisiblePosition() ? nbLigneAffichee - 1 : nbLigneAffichee;
        } catch (WDException e) {
            throw e;
        }
    }

    protected int getNbTotalElement() {
        return _getOccurrence();
    }

    public final int getOddCellBackgroundColor() {
        return this.be;
    }

    public final int getOddCellTextColor() {
        return this.Ld;
    }

    public final Paint getPaintHorizontalSeparator() {
        return this.Pd;
    }

    public final Paint getPaintVerticalSeparator() {
        return this.Sd;
    }

    public void getPosition(int i) throws WDException {
        if (i == -1) {
            i = getIndiceElementCourant();
            if (i == -1) {
                return;
            }
        }
        try {
            if (isIndiceValide(i)) {
                int a = C0725i.m3011a(i);
                try {
                    if (this.Zc != null) {
                        if (this.Zc.mo3616b() == C0715d.DIRECT_ACCESS) {
                            this.Zc.mo3611a(a, false, true);
                            return;
                        }
                    }
                    m1502a(a, true);
                } catch (WDException e) {
                    throw e;
                } catch (WDException e2) {
                    throw e2;
                }
            }
        } catch (WDException e22) {
            throw e22;
        }
    }

    public final WDAbstractZRRenderer getRenderer() {
        return this.Vd;
    }

    public final fb getRenderingMode() {
        return this.Rd;
    }

    public final int getRowAtPoint(int i, int i2, boolean z) {
        if (z) {
            int[] iArr = new int[2];
            this.fe.getLocationOnScreen(iArr);
            i -= iArr[0];
            i2 -= iArr[1];
        }
        int pointToPosition = this.fe.pointToPosition(i, i2);
        return pointToPosition != -1 ? pointToPosition : -1;
    }

    public int getScrollPosition(boolean z) {
        if (z) {
            try {
                if (!isHorizontale()) {
                    int firstVisiblePosition = this.fe.getFirstVisiblePosition();
                    if (firstVisiblePosition < 0) {
                        return 0;
                    }
                    try {
                        return (int) (Math.round(((double) (firstVisiblePosition * this.ge)) / ((double) this.ge)) * ((long) this.ge));
                    } catch (WDException e) {
                        throw e;
                    }
                }
            } catch (WDException e2) {
                throw e2;
            }
        }
        return super.getScrollPosition(z);
    }

    public View getScrollableView() {
        try {
            return isHorizontale() ? (View) this.fe.getParent() : this.fe;
        } catch (WDException e) {
            throw e;
        }
    }

    public final int getSelectedCellBackgroundColor() {
        return this.Bd;
    }

    public final int getSelectedCellTextColor() {
        return this.Md;
    }

    public WDObjet getValeur() {
        try {
            if (this.Zc != null) {
                if (this.Zc.mo3628h() && !isValeurEnAjustement()) {
                    int indiceElementCourant = getIndiceElementCourant();
                    if (indiceElementCourant > 0) {
                        WDObjet wDObjet = (WDObjet) this.Zc.mo3608a(C0725i.m3011a(indiceElementCourant));
                        if (wDObjet != null) {
                            try {
                                return wDObjet.getValeurMemorisee();
                            } catch (WDException e) {
                                throw e;
                            }
                        }
                    }
                    return new WDChaine();
                }
            }
            return super.getValeur();
        } catch (WDException e2) {
            throw e2;
        } catch (WDException e22) {
            throw e22;
        }
    }

    public cb getValeurAffichee() {
        if (this.Zc == null) {
            return super.getValeurAffichee();
        }
        int indiceElementCourant = getIndiceElementCourant();
        if (indiceElementCourant > 0) {
            WDObjet wDObjet = (WDObjet) this.Zc.mo3608a(C0725i.m3011a(indiceElementCourant));
            if (wDObjet != null) {
                try {
                    return wDObjet.getValeurAffichee();
                } catch (WDException e) {
                    throw e;
                }
            }
        }
        return new WDChaine();
    }

    public WDObjet getValeurMemorisee() {
        if (this.Zc == null) {
            return super.getValeurMemorisee();
        }
        int indiceElementCourant = getIndiceElementCourant();
        if (indiceElementCourant > 0) {
            WDObjet wDObjet = (WDObjet) this.Zc.mo3608a(C0725i.m3011a(indiceElementCourant));
            if (wDObjet != null) {
                try {
                    return wDObjet.getValeurMemorisee();
                } catch (WDException e) {
                    throw e;
                }
            }
        }
        return new WDChaine();
    }

    /* renamed from: i */
    int m1514i() {
        return this.ue;
    }

    public void initLiaisonsBinding() {
        super.initLiaisonsBinding();
        C1320c c1320c = (C1320c) getBindingManager(C1320c.class);
        if (c1320c != null) {
            String o = C0808l.m4057o(c1320c.mo3651s().toLowerCase());
            for (WDAttributZR liaisonDataBinding : this.nd.values()) {
                C0712l liaisonDataBinding2 = liaisonDataBinding.getLiaisonDataBinding();
                if (liaisonDataBinding2 instanceof C0836a) {
                    try {
                        C0836a c0836a = (C0836a) liaisonDataBinding2;
                        if (!c0836a.mo3131j().equals(o)) {
                            c0836a.mo3123b(o);
                        }
                        liaisonDataBinding2.mo2599a(c0836a.mo3130i() != null);
                    } catch (WDException e) {
                        throw e;
                    } catch (WDException e2) {
                        liaisonDataBinding2.mo2599a(false);
                    }
                }
            }
        } else if (((C1319a) getBindingManager(C1319a.class)) != null) {
            for (WDAttributZR liaisonDataBinding3 : this.nd.values()) {
                C0712l liaisonDataBinding4 = liaisonDataBinding3.getLiaisonDataBinding();
                try {
                    if (liaisonDataBinding4 instanceof C0713b) {
                        ((C0713b) liaisonDataBinding4).m2970e();
                    }
                } catch (WDException e3) {
                    throw e3;
                }
            }
        }
    }

    public void insertFI(String str, int i, WDObjet... wDObjetArr) {
        WDErreurManager.m2883a(C0745b.m3222b(ve[8], getName()));
    }

    public void invalidateDrawCache() {
        try {
            if (this.Rd == fb.DOUBLE_BUFFERING_WITH_CACHE && (this.Vd instanceof C1294e)) {
                C1431a j = ((C1294e) this.Vd).m9086j();
                if (j != null) {
                    try {
                        j.m10069h();
                    } catch (WDException e) {
                        throw e;
                    }
                }
            }
        } catch (WDException e2) {
            throw e2;
        }
    }

    protected boolean isCanEditChamp(int i, gc gcVar) {
        try {
            return gcVar._getEtat() == 0;
        } catch (WDException e) {
            throw e;
        }
    }

    public boolean isChampFocusable() {
        try {
            if (this.Fd != null) {
                if (this.Fd.mo3605h() == 1) {
                    return true;
                }
            }
            return false;
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        }
    }

    public boolean isChangeSourcePositionOnSelection() {
        return this.Zc instanceof C1320c;
    }

    protected boolean isEditing() {
        try {
            if (this.Fd != null) {
                if (this.Fd.m9256e()) {
                    return true;
                }
            }
            return false;
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        }
    }

    public boolean isEditingCell(int i) {
        try {
            if (isEditing()) {
                if (this.Fd.m9261j() == i) {
                    return true;
                }
            }
            return false;
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        }
    }

    protected boolean isHorizontale() {
        return false;
    }

    protected boolean isInterceptTouchEventForScroll() {
        try {
            if (super.isInterceptTouchEventForScroll()) {
                return true;
            }
            if (_getEtat() != 4) {
                try {
                    if (C1503b.m10440a((wc) this, 1)) {
                        return true;
                    }
                    try {
                        if (C1503b.m10440a((wc) this, -1)) {
                            return true;
                        }
                        try {
                            if (isSwipeEnabled()) {
                                return true;
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
            return false;
        } catch (WDException e222) {
            throw e222;
        } catch (WDException e2222) {
            throw e2222;
        }
    }

    protected boolean isInvalidateCacheOnPressed() {
        return false;
    }

    protected boolean isInvalidateCacheOnSelectionChanged() {
        return false;
    }

    public final boolean isLoadingViewVisible() {
        return this.ee.isLoadingState();
    }

    protected boolean isModeMultiColonne() {
        return false;
    }

    protected boolean isSaisieEnCascadeAutorisee() {
        return false;
    }

    protected boolean isScrollerHorizontalVisible() {
        return false;
    }

    public boolean isSwipeEnabled() {
        try {
            if (this.se != null) {
                if (this.se.m9030k()) {
                    return true;
                }
            }
            return false;
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        }
    }

    public boolean isUpdateCacheOnDataSetChanged() {
        try {
            if (this.Zc != null) {
                if (this.Zc.mo3616b() == C0715d.DIRECT_ACCESS) {
                    return false;
                }
            }
            return true;
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        }
    }

    public boolean isVertical() {
        try {
            return !isHorizontale();
        } catch (WDException e) {
            throw e;
        }
    }

    /* renamed from: j */
    int m1515j() {
        return this.ae;
    }

    public void listeAffiche(int i) {
        try {
            if (this.Zc != null) {
                this.Zc.mo3617b(C0725i.m3011a(i));
            } else {
                super.listeAffiche(i);
            }
        } catch (WDException e) {
            throw e;
        }
    }

    public void listeAffiche(String str) {
        try {
            if (this.Zc != null) {
                this.Zc.mo3612a(str);
            } else {
                super.listeAffiche(str);
            }
        } catch (WDException e) {
            throw e;
        }
    }

    protected final WDFenetreInterne loadFenetreInterne(String str) {
        WDFenetre wDFenetre = (WDFenetre) getFenetreMere();
        Object load = hb.load(str, getFenetreMere(), null);
        if (load != null) {
            try {
                load.appliquerAncrage(0, 0, 0, 0, 0);
                wDFenetre.ajouterFenetreInterne(load);
                if (this.Ed == null) {
                    this.Ed = new LinkedList();
                }
                this.Ed.add(load);
            } catch (WDException e) {
                throw e;
            }
        }
        return load;
    }

    public boolean loadImage(C0520c c0520c, C1099j c1099j) {
        if (getRenderingMode() == fb.DOUBLE_BUFFERING_WITH_CACHE) {
            C1431a j = ((C1294e) this.Vd).m9086j();
            if (j != null) {
                C1434f i = j.m10070i();
                if (i != null) {
                    try {
                        if (i.m10087a(c0520c)) {
                            c0520c.setDrawable(i.m10088b(c0520c));
                        } else {
                            i.m10085a(c1099j, c0520c, new ob(this));
                        }
                    } catch (WDException e) {
                        throw e;
                    }
                }
                return true;
            }
        }
        return false;
    }

    protected void modifPositionAscenseur() {
        initialiserAction();
    }

    public void modifyFI(String str, int i, WDObjet... wDObjetArr) {
        WDErreurManager.m2883a(C0745b.m3222b(ve[8], getName()));
    }

    public void notifFinFocus(gc gcVar) {
        try {
            if (!isEditing()) {
                return;
            }
            if (gcVar.isSauverValeurEnFinEditionZR()) {
                this.Fd.mo3606i();
            }
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        }
    }

    public void notifModifChamp(gc gcVar) {
        try {
            if (isEditing()) {
                if (gcVar.isSauverValeurEnFinEditionZR()) {
                    try {
                        if (this.Fd.mo3605h() == 1) {
                            this.Fd.mo3606i();
                        }
                    } catch (WDException e) {
                        throw e;
                    }
                }
            }
            super.notifModifChamp(gcVar);
        } catch (WDException e2) {
            throw e2;
        } catch (WDException e22) {
            throw e22;
        }
    }

    public void notifModifValeurAttribut(WDAttributZR wDAttributZR, int i, WDObjet wDObjet) {
        gc champAssocie = wDAttributZR.getChampAssocie();
        if (champAssocie != null) {
            try {
                if (isEditingCell(i) && champAssocie == this.Fd.m9258g()) {
                    EWDPropriete proprieteAssocie = wDAttributZR.getProprieteAssocie();
                    if (proprieteAssocie != null) {
                        champAssocie = champAssocie.getCloneForEdition();
                        if (champAssocie != null) {
                            try {
                                champAssocie.setProp(proprieteAssocie, wDObjet);
                            } catch (WDException e) {
                                throw e;
                            }
                        }
                    }
                }
            } catch (WDException e2) {
                throw e2;
            }
        }
    }

    public void notifModificationModele(int i, int i2) {
        try {
            if (this.ud != null) {
                this.ud.mo3589a(i, i2);
            }
        } catch (WDException e) {
            throw e;
        }
    }

    public void notifyDataSetChanged() {
        getAdapter().notifyDataSetChanged();
    }

    public void onChampPropertyValueChanged(gc gcVar, EWDPropriete eWDPropriete, WDObjet wDObjet) {
        this.Vd.mo3549a(gcVar, eWDPropriete, wDObjet);
    }

    public boolean onDrag(int i) {
        int i2 = this.Yc;
        try {
            boolean z;
            setValeurInterne(i);
            WDObjet appelPCode = appelPCode(101);
            if (appelPCode != null) {
                try {
                    if (!appelPCode.isVoid()) {
                        if (!appelPCode.getBoolean()) {
                            z = false;
                            setValeurInterne(i2);
                            return z;
                        }
                    }
                } catch (WDException e) {
                    throw e;
                } catch (WDException e2) {
                    throw e2;
                }
            }
            z = true;
            setValeurInterne(i2);
            return z;
        } catch (Throwable th) {
            setValeurInterne(i2);
        }
    }

    public boolean onDrop(int i, int i2) {
        if (i == i2) {
            return true;
        }
        int i3 = this.Yc;
        try {
            setValeurInterne(i2);
            WDObjet appelPCode = appelPCode(102);
            if (appelPCode != null) {
                if (!(appelPCode.isVoid() || appelPCode.getBoolean())) {
                    if (i3 >= 0) {
                        try {
                            if (i3 < getNbElement()) {
                                setValeurInterne(i3);
                            }
                        } catch (WDException e) {
                            throw e;
                        }
                    }
                    return false;
                }
            }
            if (this.ud.mo3593b(i) != null) {
                deplacerLigne(i, i2, false);
            }
            if (i3 < 0) {
                return true;
            }
            try {
                if (i3 >= getNbElement()) {
                    return true;
                }
                setValeurInterne(i3);
                return true;
            } catch (WDException e2) {
                throw e2;
            }
        } catch (WDException e22) {
            throw e22;
        } catch (WDException e222) {
            throw e222;
        } catch (Throwable th) {
            if (i3 >= 0) {
                try {
                    if (i3 < getNbElement()) {
                        setValeurInterne(i3);
                    }
                } catch (WDException e2222) {
                    throw e2222;
                }
            }
        }
    }

    public final void onFinishLoading() {
        try {
            if (this.ee == ab.LOADING) {
                m1504a(ab.IDLE);
            }
        } catch (WDException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onItemClick(android.widget.AdapterView<?> r3, android.view.View r4, int r5, long r6) {
        /*
        r2 = this;
        r0 = 1;
        r1 = r2.se;	 Catch:{ WDException -> 0x000e }
        if (r1 == 0) goto L_0x0012;
    L_0x0005:
        r1 = r2.se;	 Catch:{ WDException -> 0x0010 }
        r1 = r1.m9015a(r5);	 Catch:{ WDException -> 0x0010 }
        if (r1 == 0) goto L_0x0012;
    L_0x000d:
        return;
    L_0x000e:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x0010 }
    L_0x0010:
        r0 = move-exception;
        throw r0;
    L_0x0012:
        r1 = r2.Fd;	 Catch:{ WDException -> 0x0029 }
        if (r1 == 0) goto L_0x002d;
    L_0x0016:
        r1 = r2.Fd;	 Catch:{ WDException -> 0x002b }
        r1 = r1.mo3605h();	 Catch:{ WDException -> 0x002b }
        if (r1 != r0) goto L_0x002d;
    L_0x001e:
        if (r0 == 0) goto L_0x0031;
    L_0x0020:
        r0 = r2.Fd;	 Catch:{ WDException -> 0x002f }
        r0.m9262k();	 Catch:{ WDException -> 0x002f }
    L_0x0025:
        super.onItemClick(r3, r4, r5, r6);
        goto L_0x000d;
    L_0x0029:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x002b }
    L_0x002b:
        r0 = move-exception;
        throw r0;
    L_0x002d:
        r0 = 0;
        goto L_0x001e;
    L_0x002f:
        r0 = move-exception;
        throw r0;
    L_0x0031:
        r0 = r2.je;	 Catch:{ WDException -> 0x003b }
        if (r0 == 0) goto L_0x0025;
    L_0x0035:
        r0 = r2.je;	 Catch:{ WDException -> 0x003b }
        r0.run();	 Catch:{ WDException -> 0x003b }
        goto L_0x0025;
    L_0x003b:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.ui.champs.zr.WDZoneRepetee.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
    }

    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
        try {
            if (this.se != null) {
                if (this.se.m9036r() == 2) {
                    try {
                        if (this.se.m9033o() > C1511l.f4643q) {
                            return true;
                        }
                    } catch (WDException e) {
                        throw e;
                    }
                }
            }
            return super.onItemLongClick(adapterView, view, i, j);
        } catch (WDException e2) {
            throw e2;
        } catch (WDException e22) {
            throw e22;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPostSwipe(int r3, int r4) {
        /*
        r2 = this;
        r0 = r2.se;	 Catch:{ WDException -> 0x002b }
        if (r0 == 0) goto L_0x002a;
    L_0x0004:
        r0 = 1;
        if (r4 != r0) goto L_0x000b;
    L_0x0007:
        r0 = r2.Gd;	 Catch:{ WDException -> 0x002f }
        if (r0 == 0) goto L_0x0012;
    L_0x000b:
        r0 = 2;
        if (r4 != r0) goto L_0x0017;
    L_0x000e:
        r0 = r2.Ad;	 Catch:{ WDException -> 0x0033 }
        if (r0 != 0) goto L_0x0017;
    L_0x0012:
        r0 = 1135; // 0x46f float:1.59E-42 double:5.61E-321;
        r2.appelPCode(r0);	 Catch:{ WDException -> 0x0033 }
    L_0x0017:
        r0 = r2.se;	 Catch:{ WDException -> 0x0035 }
        r0 = r0.m9028i();	 Catch:{ WDException -> 0x0035 }
        if (r0 == 0) goto L_0x002a;
    L_0x001f:
        r0 = fr.pcsoft.wdjava.core.C0725i.m3069e(r3);	 Catch:{ WDException -> 0x0035 }
        r1 = 0;
        r2.supprimerElementA(r0, r1);	 Catch:{ WDException -> 0x0035 }
        r2.execPCodeApresSuppressionParSwipe();	 Catch:{ WDException -> 0x0035 }
    L_0x002a:
        return;
    L_0x002b:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x002d }
    L_0x002d:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x002f }
    L_0x002f:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x0031 }
    L_0x0031:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x0033 }
    L_0x0033:
        r0 = move-exception;
        throw r0;
    L_0x0035:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.ui.champs.zr.WDZoneRepetee.onPostSwipe(int, int):void");
    }

    public boolean onPrepareSwipe(int i) {
        ec a = getAdapter().m9133a(i);
        if (a != null) {
            try {
                if (a.m9115f()) {
                    return true;
                }
            } catch (WDException e) {
                throw e;
            }
        }
        return false;
    }

    public void onRefresh() {
        WDObjet appelPCode = appelPCode(C0607n.Vh);
        if (appelPCode != null) {
            try {
                if (!appelPCode.isVoid()) {
                    if (!appelPCode.getBoolean()) {
                        return;
                    }
                }
            } catch (WDException e) {
                throw e;
            } catch (WDException e2) {
                throw e2;
            }
        }
        try {
            if (this.Zc != null) {
                this.Zc.mo3612a(ve[0]);
            }
        } catch (WDException e22) {
            throw e22;
        }
    }

    public void onSelectionChanged(xb xbVar) {
        try {
            super.onSelectionChanged(xbVar);
            if (this.fe.getChildCount() > 0) {
                redessinerCellules(xbVar.m8927a(), xbVar.m8928b(), isInvalidateCacheOnSelectionChanged());
            }
        } catch (WDException e) {
            throw e;
        }
    }

    protected boolean onSizeChanged(int i, int i2) {
        try {
            if (this.se != null) {
                this.se.m9018c();
            }
            if (isHorizontale()) {
                int i3 = i2 - this.Qd.f4667b;
                if (i3 == 0) {
                    return false;
                }
                try {
                    if (this.Rd.isDoubleBufferedRendering()) {
                        for (gc gcVar : this.sd.values()) {
                            if (gcVar != null) {
                                try {
                                    gcVar.ancrer(0, i3, 0, 0, 0);
                                } catch (WDException e) {
                                    throw e;
                                }
                            }
                        }
                    }
                    return true;
                } catch (WDException e2) {
                    throw e2;
                }
            }
            try {
                if (this.rd == (byte) 1) {
                    return false;
                }
                int nbColonneZR = (i - this.Qd.f4666a) / getNbColonneZR();
                if (nbColonneZR == 0) {
                    return false;
                }
                try {
                    if (this.Rd.isDoubleBufferedRendering()) {
                        for (gc gcVar2 : this.sd.values()) {
                            if (gcVar2 != null) {
                                try {
                                    gcVar2.ancrer(nbColonneZR, 0, 0, 0, 0);
                                } catch (WDException e22) {
                                    throw e22;
                                }
                            }
                        }
                    }
                    ancrerChampsRuptures(nbColonneZR);
                    return true;
                } catch (WDException e222) {
                    throw e222;
                }
            } catch (WDException e2222) {
                throw e2222;
            }
        } catch (WDException e22222) {
            throw e22222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onSwipe(int r4, int r5) {
        /*
        r3 = this;
        r1 = 1;
        r0 = r3.Yc;
        r0 = r3.se;	 Catch:{ all -> 0x0053 }
        if (r0 == 0) goto L_0x0065;
    L_0x0007:
        r3.setValeurInterne(r4);	 Catch:{ WDException -> 0x004b }
        r3.m1507g();	 Catch:{ WDException -> 0x004b }
        r0 = r3.se;	 Catch:{ WDException -> 0x004b }
        r0 = r0.m9028i();	 Catch:{ WDException -> 0x004b }
        if (r0 != 0) goto L_0x0022;
    L_0x0015:
        if (r5 != r1) goto L_0x001b;
    L_0x0017:
        r0 = r3.Gd;	 Catch:{ WDException -> 0x004f }
        if (r0 != 0) goto L_0x0022;
    L_0x001b:
        r0 = 2;
        if (r5 != r0) goto L_0x0065;
    L_0x001e:
        r0 = r3.Ad;	 Catch:{ WDException -> 0x0051 }
        if (r0 == 0) goto L_0x0065;
    L_0x0022:
        r0 = 1135; // 0x46f float:1.59E-42 double:5.61E-321;
        r0 = r3.appelPCode(r0);	 Catch:{ all -> 0x0053 }
        if (r0 == 0) goto L_0x0030;
    L_0x002a:
        r2 = r0.isVoid();	 Catch:{ WDException -> 0x0055 }
        if (r2 == 0) goto L_0x0057;
    L_0x0030:
        r0 = r1;
    L_0x0031:
        if (r0 == 0) goto L_0x004a;
    L_0x0033:
        r2 = r3.se;	 Catch:{ WDException -> 0x005c }
        r2 = r2.m9028i();	 Catch:{ WDException -> 0x005c }
        if (r2 == 0) goto L_0x004a;
    L_0x003b:
        r0 = 1136; // 0x470 float:1.592E-42 double:5.613E-321;
        r0 = r3.appelPCode(r0);	 Catch:{ all -> 0x0053 }
        if (r0 == 0) goto L_0x0049;
    L_0x0043:
        r2 = r0.isVoid();	 Catch:{ WDException -> 0x005e }
        if (r2 == 0) goto L_0x0060;
    L_0x0049:
        r0 = r1;
    L_0x004a:
        return r0;
    L_0x004b:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x004d }
    L_0x004d:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x004f }
    L_0x004f:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x0051 }
    L_0x0051:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0053 }
    L_0x0053:
        r0 = move-exception;
        throw r0;
    L_0x0055:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0053 }
    L_0x0057:
        r0 = r0.getBoolean();	 Catch:{ all -> 0x0053 }
        goto L_0x0031;
    L_0x005c:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0053 }
    L_0x005e:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0053 }
    L_0x0060:
        r1 = r0.getBoolean();	 Catch:{ all -> 0x0053 }
        goto L_0x0049;
    L_0x0065:
        r0 = r1;
        goto L_0x004a;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.ui.champs.zr.WDZoneRepetee.onSwipe(int, int):boolean");
    }

    public void onSwipeEnd(int i) {
        View childAt = this.fe.getChildAt(i - this.fe.getFirstVisiblePosition());
        if (childAt != null) {
            try {
                m1503a(childAt);
            } catch (WDException e) {
                throw e;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSwipeStart(int r9, int r10) {
        /*
        r8 = this;
        r7 = 2;
        r6 = 1;
        r0 = r8.fe;
        r1 = r8.fe;
        r1 = r1.getFirstVisiblePosition();
        r1 = r9 - r1;
        r1 = r0.getChildAt(r1);
        r0 = r1.getTag();	 Catch:{ WDException -> 0x0088 }
        if (r0 != 0) goto L_0x0087;
    L_0x0016:
        r0 = r1 instanceof fr.pcsoft.wdjava.ui.champs.zr.WDAbstractZRRenderer.AbstractRepetitionView;	 Catch:{ WDException -> 0x0088 }
        if (r0 == 0) goto L_0x0087;
    L_0x001a:
        r0 = r1;
        r0 = (fr.pcsoft.wdjava.ui.champs.zr.WDAbstractZRRenderer.AbstractRepetitionView) r0;
        r2 = r0.mo3541c();
        r0 = 0;
        if (r10 != r7) goto L_0x008c;
    L_0x0024:
        r3 = r8.ce;	 Catch:{ WDException -> 0x008a }
        r3 = fr.pcsoft.wdjava.core.utils.C0808l.m4053k(r3);	 Catch:{ WDException -> 0x008a }
        if (r3 != 0) goto L_0x008c;
    L_0x002c:
        r0 = r8.ce;
    L_0x002e:
        if (r0 == 0) goto L_0x0087;
    L_0x0030:
        r3 = r8.loadFenetreInterne(r0);
        if (r3 == 0) goto L_0x0087;
    L_0x0036:
        r0 = new fr.pcsoft.wdjava.core.WDObjet[r7];
        r4 = 0;
        r0[r4] = r8;
        r4 = new fr.pcsoft.wdjava.core.types.WDEntier4;
        r5 = fr.pcsoft.wdjava.core.C0725i.m3069e(r9);
        r4.<init>(r5);
        r0[r6] = r4;
        r3.execDeclarationGlobales(r0);
        r3.setAutoAnchoring(r6, r6);
        r0 = 14;
        r3.appelPCode(r0);
        r4 = new android.widget.RelativeLayout$LayoutParams;
        r0 = -1;
        r5 = r2.getHeight();
        r4.<init>(r0, r5);
        if (r10 != r7) goto L_0x0061;
    L_0x005d:
        r0 = r8.he;	 Catch:{ WDException -> 0x009b }
        if (r0 != 0) goto L_0x0067;
    L_0x0061:
        if (r10 != r6) goto L_0x0074;
    L_0x0063:
        r0 = r8.Xd;	 Catch:{ WDException -> 0x009f }
        if (r0 == 0) goto L_0x0074;
    L_0x0067:
        r0 = r3.getRequestedWidth();	 Catch:{ WDException -> 0x00a1 }
        r4.width = r0;	 Catch:{ WDException -> 0x00a1 }
        if (r10 != r7) goto L_0x0074;
    L_0x006f:
        r0 = 11;
        r4.addRule(r0);	 Catch:{ WDException -> 0x00a1 }
    L_0x0074:
        r0 = r1;
        r0 = (fr.pcsoft.wdjava.ui.champs.zr.WDAbstractZRRenderer.AbstractRepetitionView) r0;
        r5 = r3.getCompConteneur();
        r0.addView(r5, r4);
        r0 = r1;
        r0 = (fr.pcsoft.wdjava.ui.champs.zr.WDAbstractZRRenderer.AbstractRepetitionView) r0;
        r0.bringChildToFront(r2);
        r1.setTag(r3);
    L_0x0087:
        return;
    L_0x0088:
        r0 = move-exception;
        throw r0;
    L_0x008a:
        r0 = move-exception;
        throw r0;
    L_0x008c:
        if (r10 != r6) goto L_0x002e;
    L_0x008e:
        r3 = r8.ke;	 Catch:{ WDException -> 0x0099 }
        r3 = fr.pcsoft.wdjava.core.utils.C0808l.m4053k(r3);	 Catch:{ WDException -> 0x0099 }
        if (r3 != 0) goto L_0x002e;
    L_0x0096:
        r0 = r8.ke;
        goto L_0x002e;
    L_0x0099:
        r0 = move-exception;
        throw r0;
    L_0x009b:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x009d }
    L_0x009d:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x009f }
    L_0x009f:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x00a1 }
    L_0x00a1:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.ui.champs.zr.WDZoneRepetee.onSwipeStart(int, int):void");
    }

    public void onValueChanged() {
        super.onValueChanged();
        if (this.Yc >= 0) {
            try {
                ec ecVar = (ec) this.fe.getItemAtPosition(convertirIndiceVueVersModele(this.Yc));
                if (ecVar != null) {
                    affecterAttributVersPropChamp(ecVar, null);
                }
                if (this.Zc != null) {
                    int convertirIndiceVueVersModele = convertirIndiceVueVersModele(this.Yc);
                    this.Zc.mo3610a(convertirIndiceVueVersModele, convertirIndiceVueVersModele, true);
                }
            } catch (IndexOutOfBoundsException e) {
                throw e;
            } catch (Exception e2) {
                C0691a.m2857a(ve[13], e2);
            }
        }
    }

    protected void postInit() {
        try {
            super.postInit();
            if (this.Zc != null) {
                try {
                    this.Zc.mo3629i();
                } catch (WDException e) {
                    WDException wDException = e;
                    String str = "";
                    if (wDException.getSystemMessage() != null) {
                        str = wDException.getSystemMessage();
                    }
                    String[] strArr = new String[2];
                    strArr[0] = C0745b.m3222b(ve[9], getName(), wDException.getMessage());
                    strArr[1] = str;
                    WDErreurManager.m2886a(strArr);
                }
            }
        } catch (IndexOutOfBoundsException e2) {
            throw e2;
        }
    }

    protected WDObjet raffraichissementPTR() {
        initialiserAction();
        return null;
    }

    public void redessinerCellule(int i, boolean z) {
        this.Vd.mo3548a(i, i, z);
        int firstVisiblePosition = i - this.fe.getFirstVisiblePosition();
        if (firstVisiblePosition >= 0) {
            try {
                if (firstVisiblePosition < this.fe.getChildCount()) {
                    View childAt = this.fe.getChildAt(firstVisiblePosition);
                    try {
                        if (!(childAt instanceof AbstractRepetitionView)) {
                            return;
                        }
                        if (this.Rd.isDoubleBufferedRendering()) {
                            childAt.invalidate();
                        } else {
                            getAdapter().getView(i, childAt, this.fe);
                        }
                    } catch (WDException e) {
                        throw e;
                    } catch (WDException e2) {
                        throw e2;
                    }
                }
            } catch (WDException e22) {
                throw e22;
            }
        }
    }

    public void redessinerCellules(int i, int i2, boolean z) {
        if (i <= i2) {
            int i3 = i2;
            i2 = i;
            i = i3;
        }
        this.Vd.mo3548a(i2, i, z);
        int firstVisiblePosition = this.fe.getFirstVisiblePosition();
        int i4 = i2 - firstVisiblePosition;
        int i5 = i - firstVisiblePosition;
        int childCount = this.fe.getChildCount();
        if (childCount != 0 && i4 <= childCount - 1 && i5 >= 0) {
            i4 = Math.min(childCount - 1, Math.max(0, i4));
            i5 = Math.min(childCount - 1, Math.max(0, i5));
            if (this.Rd.isDoubleBufferedRendering()) {
                while (i4 <= i5) {
                    try {
                        this.fe.getChildAt(i4).invalidate();
                        i4++;
                    } catch (WDException e) {
                        throw e;
                    }
                }
                return;
            }
            while (i2 <= i) {
                View childAt = this.fe.getChildAt(i2 - firstVisiblePosition);
                if (childAt != null) {
                    try {
                        if (childAt instanceof AbstractRepetitionView) {
                            getAdapter().getView(i2, childAt, this.fe);
                        }
                    } catch (WDException e2) {
                        throw e2;
                    }
                }
                i2++;
            }
        }
    }

    public void release() {
        try {
            super.release();
            if (this.fe != null) {
                if (this.fe instanceof C1299d) {
                    ((C1299d) this.fe).m9159b();
                }
            }
            try {
                this.fe = null;
                if (this.xd != null) {
                    this.xd.mo3804a();
                    this.xd = null;
                }
                try {
                    this.Qd = null;
                    if (this.oe != null) {
                        this.oe.clear();
                        this.oe = null;
                    }
                    try {
                        if (this.se != null) {
                            this.se.mo3433a();
                            this.se = null;
                        }
                        try {
                            if (this.Ud != null) {
                                this.Ud.mo3433a();
                                this.Ud = null;
                            }
                            try {
                                this.je = null;
                                if (this.Vd != null) {
                                    this.Vd.mo3560i();
                                    this.Vd = null;
                                }
                                try {
                                    if (this.Fd != null) {
                                        this.Fd.m9257f();
                                        this.Fd = null;
                                    }
                                    try {
                                        if (this.Ed != null) {
                                            this.Ed.clear();
                                            this.Ed = null;
                                        }
                                        try {
                                            this.Pd = null;
                                            this.Sd = null;
                                            this.pe = null;
                                            if (this.Yd != null) {
                                                this.Yd.m9154a();
                                                this.Yd = null;
                                            }
                                            try {
                                                if (this.zd != null) {
                                                    this.zd.mo3386h();
                                                    this.zd = null;
                                                }
                                                try {
                                                    this.ke = null;
                                                    this.ce = null;
                                                    if (this.de != null) {
                                                        this.de.mo3425a();
                                                        this.de = null;
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
                                    } catch (WDException e222) {
                                        throw e222;
                                    }
                                } catch (WDException e2222) {
                                    throw e2222;
                                }
                            } catch (WDException e22222) {
                                throw e22222;
                            }
                        } catch (WDException e222222) {
                            throw e222222;
                        }
                    } catch (WDException e2222222) {
                        throw e2222222;
                    }
                } catch (WDException e22222222) {
                    throw e22222222;
                }
            } catch (WDException e222222222) {
                throw e222222222;
            }
        } catch (WDException e2222222222) {
            throw e2222222222;
        } catch (WDException e22222222222) {
            throw e22222222222;
        }
    }

    public void removeAllBindingItem() {
        super.supprimerTout();
    }

    public void removeBindingItemAt(int i) {
        boolean z = this.Wc;
        this.Wc = true;
        try {
            ((ec) getItemAt(i)).mo3393a(-1, false);
            this.ud.mo3588a(i);
        } finally {
            this.Wc = z;
        }
    }

    public void repeindreChamp() {
        try {
            if (this.Vd != null) {
                this.Vd.mo3552c();
            }
            super.repeindreChamp();
        } catch (WDException e) {
            throw e;
        }
    }

    protected final void setAdapter(ListAdapter listAdapter) {
        this.fe.setAdapter(listAdapter);
    }

    public void setAgencement(int i) {
        super.setAgencement(i);
        int childCount = this.fe.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.fe.getChildAt(i2);
            try {
                if (childAt instanceof AbstractRepetitionView) {
                    ((AbstractRepetitionView) childAt).mo3540b(i);
                }
                i2++;
            } catch (WDException e) {
                throw e;
            }
        }
    }

    protected void setCadreCelluleSelection(C1110m c1110m) {
        try {
            if (c1110m instanceof C1113c) {
                this.Jd = ((C1113c) c1110m).m8141q();
            }
        } catch (WDException e) {
            throw e;
        }
    }

    protected final void setCadreFondLigne(C1110m c1110m) {
        try {
            if (c1110m instanceof C1113c) {
                if (C0808l.m4053k(((C1113c) c1110m).m8141q())) {
                    return;
                }
            }
            this.zd = c1110m;
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        }
    }

    protected final void setChargementElementSupplementaire(String str, int i) {
        try {
            if (this.fe instanceof ListView) {
                this.te = i;
                if (C0808l.m4053k(str)) {
                    str = Od;
                }
                WDFenetreInterne loadFenetreInterne = loadFenetreInterne(str);
                if (loadFenetreInterne != null) {
                    try {
                        loadFenetreInterne.setAutoAnchoring(true, true);
                        this.pe = loadFenetreInterne.getCompConteneur();
                        this.pe.setLayoutParams(new LayoutParams(-1, loadFenetreInterne.getRequestedHeight()));
                        if (!WDProjet.getInstance().isVersionCompatible(C0657a.KIT_KAT.getNumero())) {
                            ListView listView = (ListView) this.fe;
                            listView.addFooterView(this.pe);
                            listView.setAdapter(listView.getAdapter());
                            listView.removeFooterView(this.pe);
                        }
                        m1504a(ab.IDLE);
                        WDFenetre wDFenetre = (WDFenetre) getFenetreMere();
                        wDFenetre.ajouterEcouteurFenetre(new mc(this, wDFenetre));
                    } catch (WDException e) {
                        throw e;
                    }
                }
            }
        } catch (WDException e2) {
            throw e2;
        }
    }

    protected void setCouleurCellule(int i, int i2, int i3, int i4) {
        setCouleur(i);
        this.Cd = -16777216;
        this.Ld = -16777216;
        this.yd = C1031a.m7467k(i);
        this.be = C1031a.m7467k(i2);
        this.Bd = C1031a.m7467k(i4);
        this.Md = C1031a.m7467k(i3);
    }

    protected final void setDeplacementParDnd(int i) {
        try {
            if (this.Zc != null) {
                if (this.Zc.mo3616b() == C0715d.DIRECT_ACCESS) {
                    return;
                }
            }
            try {
                if (!isModeMultiColonne()) {
                    try {
                        if (!isHorizontale() && i > 0) {
                            try {
                                int i2;
                                m1508h();
                                switch (i) {
                                    case 1:
                                        i2 = 2;
                                        break;
                                    default:
                                        i2 = 1;
                                        break;
                                }
                                this.se.m9012a(i2, (C0527h) this);
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
        } catch (WDException e222) {
            throw e222;
        } catch (WDException e2222) {
            throw e2222;
        }
    }

    public void setEnSaisie(boolean z) {
        if (z) {
            try {
                if (this.d == 1) {
                    setEtat(0);
                    return;
                }
                return;
            } catch (WDException e) {
                throw e;
            }
        }
        try {
            if (this.d == 0) {
                setEtat(1);
            }
        } catch (WDException e2) {
            throw e2;
        }
    }

    protected void setEnregistrementSortieLigne(boolean z) {
        this.Dd = z;
    }

    public void setEtat(int i) {
        try {
            super.setEtat(i);
            if (this.de != null) {
                ((View) this.de).setEnabled(this.fe.isEnabled());
            }
        } catch (WDException e) {
            throw e;
        }
    }

    public final void setFirstVisibleElement(int i) {
        m1502a(i, false);
    }

    public void setHauteurLigne(int i) {
        if (i >= 1) {
            try {
                if (!isHorizontale()) {
                    int d = C1511l.m10532d((float) i, getDisplayUnit());
                    try {
                        this.ge = d;
                        this.xd.mo3802b(10, new Integer(d));
                        if (isFenetreCree()) {
                            setAdapter((ListAdapter) this.fe.getAdapter());
                            updateSizes();
                            C1515p.m10541a();
                        }
                        try {
                            if (isChangementAgencementEnCours()) {
                                this.ue = this.ge;
                            }
                            try {
                                if (this.se != null) {
                                    this.se.m9024f(d);
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
            } catch (WDException e222) {
                throw e222;
            }
        }
    }

    public void setHauteurLigneMax(int i) {
        this.ne = Math.max(0, C1511l.m10532d((float) i, getDisplayUnit()));
        updateContenu();
    }

    public void setHideActionBarOnScrollGestureDetector(C1171d c1171d) {
        try {
            if (!isHorizontale()) {
                this.Ud = c1171d;
            }
        } catch (WDException e) {
            throw e;
        }
    }

    public void setImageFondLigne(String str) {
        try {
            if (this.zd instanceof C1113c) {
                ((C1113c) this.zd).m8129a(str);
            } else {
                try {
                    if (this.zd != null) {
                        this.zd.mo3386h();
                    }
                    this.zd = new C1113c(str, 0, 1, 0);
                } catch (WDException e) {
                    throw e;
                }
            }
            repeindreChamp();
        } catch (WDException e2) {
            throw e2;
        }
    }

    protected final void setImagePlusMoins(String str) {
        this.qe = str;
    }

    public void setLargeurColonne(int i) {
        try {
            super.setLargeurColonne(i);
            if (isHorizontale()) {
                ((GridView) this.fe).setStretchMode(0);
                ((GridView) this.fe).setColumnWidth(this.kd);
            } else {
                try {
                    if (this.rd == (byte) 1) {
                        if (this.fe instanceof GridView) {
                            ((GridView) this.fe).setNumColumns(-1);
                            ((GridView) this.fe).setStretchMode(0);
                            ((GridView) this.fe).setColumnWidth(this.kd);
                        }
                    }
                } catch (WDException e) {
                    throw e;
                } catch (WDException e2) {
                    throw e2;
                }
            }
            try {
                if (isFenetreCree()) {
                    updateSizes();
                    this.fe.invalidateViews();
                    C1515p.m10541a();
                }
            } catch (WDException e22) {
                throw e22;
            }
        } catch (WDException e222) {
            throw e222;
        }
    }

    public final void setLoadingViewVisible(boolean z) {
        try {
            if (C0938m.m6815b()) {
                try {
                    if (this.pe != null) {
                        ab abVar;
                        if (z) {
                            try {
                                abVar = ab.LOADING_MANUAL;
                            } catch (WDException e) {
                                throw e;
                            }
                        }
                        abVar = ab.IDLE;
                        m1504a(abVar);
                        return;
                    }
                    return;
                } catch (WDException e2) {
                    throw e2;
                }
            }
            C0938m.m6810a(new C1289b(this, z));
        } catch (WDException e22) {
            throw e22;
        }
    }

    protected void setModeAscenseur(int i, int i2) {
    }

    @TargetApi(21)
    public void setNestedScrollingEnabled(boolean z) {
        try {
            if (!isHorizontale()) {
                this.fe.setNestedScrollingEnabled(z);
            }
        } catch (WDException e) {
            throw e;
        }
    }

    public void setNombreColonne(int i) {
        try {
            if (!isHorizontale()) {
                try {
                    super.setNombreColonne(i);
                    if (!(this.fe instanceof GridView)) {
                        this.pd = 1;
                    } else if (this.rd == (byte) 0) {
                        ((GridView) this.fe).setNumColumns(this.pd);
                        ((GridView) this.fe).setStretchMode(2);
                    }
                } catch (WDException e) {
                    throw e;
                } catch (WDException e2) {
                    throw e2;
                }
            }
        } catch (WDException e22) {
            throw e22;
        }
    }

    protected final void setPullToRefresh(String str, int i) {
        try {
            if (!C0808l.m4053k(str)) {
                if (WDProjet.getInstance().getNomLogiqueFenetreInterne(str) != null) {
                    this.de = new cb(this, this.fe.getContext(), str);
                    ((C1157f) this.de).m8391b(true);
                    return;
                }
            }
            this.de = new C1488u(this.fe.getContext(), C1031a.m7467k(i));
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        }
    }

    public void setRectCompPrincipal(int i, int i2, int i3, int i4) {
        try {
            if (isHorizontale()) {
                C1503b.m10426a(m1506e(), C1511l.m10532d((float) i, 2), C1511l.m10532d((float) i2, 2), C1511l.m10532d((float) i3, 2), C1511l.m10532d((float) i4, 2));
            } else {
                super.setRectCompPrincipal(i, i2, i3, i4);
            }
        } catch (WDException e) {
            throw e;
        }
    }

    protected final void setRecyclageChamp(boolean z) {
        if (z) {
            try {
                if (!isHorizontale()) {
                    this.Rd = fb.VIEWS_RECYCLING;
                }
            } catch (WDException e) {
                throw e;
            }
        }
    }

    public int setScrollPosition(boolean z, int i) {
        if (z) {
            try {
                if (!isHorizontale()) {
                    this.fe.setSelection(i / this.ge);
                    return getScrollPosition(z);
                }
            } catch (WDException e) {
                throw e;
            }
        }
        return super.setScrollPosition(z, i);
    }

    protected void setScrollRapide(boolean z, WDAttributZR wDAttributZR) {
        try {
            if (this.Zc != null) {
                if (this.Zc.mo3616b() == C0715d.DIRECT_ACCESS) {
                    return;
                }
            }
            if (z && wDAttributZR != null) {
                try {
                    if (this.fe instanceof C1299d) {
                        ((C1299d) this.fe).m9158a(new C1302l(this, wDAttributZR));
                    }
                } catch (WDException e) {
                    throw e;
                }
            }
            this.fe.setFastScrollEnabled(z);
        } catch (WDException e2) {
            throw e2;
        } catch (WDException e22) {
            throw e22;
        }
    }

    protected void setStyleSeparateurHorizontaux(int i, int i2) {
        try {
            if (this.fe instanceof ListView) {
                ((ListView) this.fe).setDivider(null);
            }
            switch (i) {
                case 1:
                    try {
                        this.Pd = creerPaintSeparateur(C1031a.m7467k(i2), false);
                        return;
                    } catch (WDException e) {
                        throw e;
                    }
                case 3:
                    this.Pd = creerPaintSeparateur(C1031a.m7467k(i2), true);
                    return;
                default:
                    return;
            }
        } catch (WDException e2) {
            throw e2;
        }
    }

    protected void setStyleSeparateurVerticaux(boolean z, int i) {
        if (z) {
            try {
                if (!isModeMultiColonne()) {
                    if (!isHorizontale()) {
                        return;
                    }
                }
                this.Sd = creerPaintSeparateur(C1031a.m7467k(i), false);
            } catch (WDException e) {
                throw e;
            } catch (WDException e2) {
                throw e2;
            }
        }
    }

    protected final void setSwipe(int i) {
        setSwipe(i, null, true, false, null, true, false);
    }

    protected final void setSwipe(int i, String str, boolean z, boolean z2, String str2, boolean z3, boolean z4) {
        try {
            if (!isModeMultiColonne()) {
                if (!isHorizontale() && i > 0) {
                    if (i == 3) {
                        try {
                            if (C0808l.m4053k(str)) {
                                if (C0808l.m4053k(str2)) {
                                    return;
                                }
                            }
                        } catch (WDException e) {
                            throw e;
                        } catch (WDException e2) {
                            throw e2;
                        }
                    }
                    m1508h();
                    int i2 = 0;
                    switch (i) {
                        case 1:
                            break;
                        case 2:
                            i2 = 9;
                            break;
                        case 3:
                            try {
                                if (!C0808l.m4053k(str)) {
                                    i2 = 2;
                                    this.ke = str;
                                    this.Xd = z2;
                                    this.Gd = z;
                                }
                                try {
                                    if (!C0808l.m4053k(str2)) {
                                        i2 += 4;
                                        this.ce = str2;
                                        this.he = z4;
                                        this.Ad = z3;
                                        break;
                                    }
                                } catch (WDException e22) {
                                    throw e22;
                                }
                            } catch (WDException e222) {
                                throw e222;
                            }
                            break;
                    }
                    i2 = (((i2 + 2) + 4) + 16) + 32;
                    this.se.m9011a(i2, (C0528b) this);
                }
            }
        } catch (WDException e2222) {
            throw e2222;
        } catch (WDException e22222) {
            throw e22222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean setTailleChamp(int r8, int r9, int r10) {
        /*
        r7 = this;
        r1 = 0;
        r0 = r7.Yd;	 Catch:{ WDException -> 0x0068 }
        if (r0 == 0) goto L_0x00bb;
    L_0x0005:
        r0 = r7.ee;	 Catch:{ WDException -> 0x006a }
        r2 = fr.pcsoft.wdjava.ui.champs.zr.ab.IDLE;	 Catch:{ WDException -> 0x006a }
        if (r0 != r2) goto L_0x00bb;
    L_0x000b:
        r0 = r7.getBottomLastVisibleCell();	 Catch:{ WDException -> 0x006c }
        r2 = r7.fe;	 Catch:{ WDException -> 0x006c }
        r2 = r2.getHeight();	 Catch:{ WDException -> 0x006c }
        if (r0 < r2) goto L_0x006e;
    L_0x0017:
        r0 = 1;
    L_0x0018:
        r2 = r0;
    L_0x0019:
        r4 = super.setTailleChamp(r8, r9, r10);
        if (r4 == 0) goto L_0x0067;
    L_0x001f:
        r0 = r7.getCompPrincipal();
        r3 = r0.getParent();
        r5 = r7.getCompConteneur();
        if (r3 == r5) goto L_0x00b8;
    L_0x002d:
        r0 = r0.getParent();
        r0 = (android.view.View) r0;
        r3 = r0;
    L_0x0034:
        r0 = r3.getLayoutParams();
        r0 = (fr.pcsoft.wdjava.ui.champs.ib) r0;
        r5 = r0.x;
        r0 = r3.getLayoutParams();
        r0 = (fr.pcsoft.wdjava.ui.champs.ib) r0;
        r0 = r0.y;
        r5 = r5 * 2;
        r5 = java.lang.Math.max(r1, r5);
        r5 = r8 - r5;
        r0 = java.lang.Math.max(r1, r0);
        r0 = r9 - r0;
        fr.pcsoft.wdjava.ui.utils.C1503b.m10448b(r3, r5, r0);	 Catch:{ WDException -> 0x0070 }
        r1 = r7.Qd;	 Catch:{ WDException -> 0x0070 }
        if (r1 != 0) goto L_0x0072;
    L_0x0059:
        r1 = new fr.pcsoft.wdjava.ui.utils.w;	 Catch:{ WDException -> 0x0070 }
        r1.<init>(r5, r0);	 Catch:{ WDException -> 0x0070 }
        r7.Qd = r1;	 Catch:{ WDException -> 0x0070 }
    L_0x0060:
        if (r2 == 0) goto L_0x0067;
    L_0x0062:
        r0 = r7.Yd;	 Catch:{ WDException -> 0x00b6 }
        r0.m9155b();	 Catch:{ WDException -> 0x00b6 }
    L_0x0067:
        return r4;
    L_0x0068:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x006a }
    L_0x006a:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x006c }
    L_0x006c:
        r0 = move-exception;
        throw r0;
    L_0x006e:
        r0 = r1;
        goto L_0x0018;
    L_0x0070:
        r0 = move-exception;
        throw r0;
    L_0x0072:
        r1 = r7.onSizeChanged(r5, r0);	 Catch:{ WDException -> 0x00aa }
        if (r1 == 0) goto L_0x007b;
    L_0x0078:
        r7.updateSizes();	 Catch:{ WDException -> 0x00aa }
    L_0x007b:
        r1 = r7.Zc;	 Catch:{ WDException -> 0x00ac }
        if (r1 == 0) goto L_0x00a1;
    L_0x007f:
        r1 = r7.isFenetreCree();	 Catch:{ WDException -> 0x00ae }
        if (r1 == 0) goto L_0x00a1;
    L_0x0085:
        r1 = r7.Qd;	 Catch:{ WDException -> 0x00b0 }
        r1 = r1.f4666a;	 Catch:{ WDException -> 0x00b0 }
        if (r5 != r1) goto L_0x0091;
    L_0x008b:
        r1 = r7.Qd;	 Catch:{ WDException -> 0x00b2 }
        r1 = r1.f4667b;	 Catch:{ WDException -> 0x00b2 }
        if (r0 == r1) goto L_0x00a1;
    L_0x0091:
        r1 = r7 instanceof fr.pcsoft.wdjava.ui.champs.table.C1280o;	 Catch:{ WDException -> 0x00b4 }
        if (r1 == 0) goto L_0x009c;
    L_0x0095:
        r1 = r7.Bc;	 Catch:{ WDException -> 0x00b4 }
        r3 = 0;
        r6 = 0;
        r1.measure(r3, r6);	 Catch:{ WDException -> 0x00b4 }
    L_0x009c:
        r1 = r7.Zc;
        r1.mo3636x();
    L_0x00a1:
        r1 = r7.Qd;
        r1.f4666a = r5;
        r1 = r7.Qd;
        r1.f4667b = r0;
        goto L_0x0060;
    L_0x00aa:
        r0 = move-exception;
        throw r0;
    L_0x00ac:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x00ae }
    L_0x00ae:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x00b0 }
    L_0x00b0:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x00b2 }
    L_0x00b2:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x00b4 }
    L_0x00b4:
        r0 = move-exception;
        throw r0;
    L_0x00b6:
        r0 = move-exception;
        throw r0;
    L_0x00b8:
        r3 = r0;
        goto L_0x0034;
    L_0x00bb:
        r2 = r1;
        goto L_0x0019;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.ui.champs.zr.WDZoneRepetee.setTailleChamp(int, int, int):boolean");
    }

    public void setValeur(int i) {
        int a = C0725i.m3011a(i);
        try {
            if (this.Zc == null || this.Zc.mo3616b() != C0715d.DIRECT_ACCESS) {
                try {
                    if (this.Zc != null) {
                        if (this.Zc.mo3616b() == C0715d.MEMORY) {
                            try {
                                if (a >= getItemCount()) {
                                    this.Zc.mo3627g();
                                }
                            } catch (WDException e) {
                                throw e;
                            }
                        }
                    }
                    if (a >= 0) {
                        try {
                            if (a < getNbElement()) {
                                this.Vc.mo3489c(a, a);
                                m1502a(a, true);
                                return;
                            }
                        } catch (WDException e2) {
                            throw e2;
                        }
                    }
                    this.Vc.mo3486b();
                } catch (WDException e22) {
                    throw e22;
                } catch (WDException e222) {
                    throw e222;
                }
            } else {
                this.Ic = true;
                try {
                    this.Zc.mo3611a(a, true, true);
                    if (a >= 0) {
                        if (a < getNbElement()) {
                            this.Vc.mo3489c(a, a);
                            this.Ic = false;
                        }
                    }
                    this.Vc.mo3486b();
                    this.Ic = false;
                } catch (WDException e2222) {
                    throw e2222;
                } catch (Throwable th) {
                    this.Ic = false;
                }
            }
        } catch (WDException e22222) {
            throw e22222;
        }
    }

    public void setValeur(WDObjet wDObjet) {
        try {
            if (this.Zc != null) {
                if (this.Zc.mo3628h()) {
                    this.Zc.mo3615a(wDObjet);
                    return;
                }
            }
            setValeur(wDObjet.getInt());
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void supprimerElementA(int r10, boolean r11) throws fr.pcsoft.wdjava.core.erreur.WDException {
        /*
        r9 = this;
        r8 = -1;
        r6 = 2;
        r1 = 1;
        r4 = 0;
        if (r11 == 0) goto L_0x0033;
    L_0x0006:
        r2 = r9.fe;	 Catch:{ WDException -> 0x002f }
        r2 = r2 instanceof android.widget.AbsListView;	 Catch:{ WDException -> 0x002f }
        if (r2 == 0) goto L_0x0033;
    L_0x000c:
        r2 = r9.isHorizontale();	 Catch:{ WDException -> 0x0031 }
        if (r2 != 0) goto L_0x0033;
    L_0x0012:
        r2 = r9.isIndiceValide(r10);	 Catch:{ WDException -> 0x0031 }
        if (r2 == 0) goto L_0x0033;
    L_0x0018:
        r1 = fr.pcsoft.wdjava.core.C0725i.m3011a(r10);
        r2 = new fr.pcsoft.wdjava.ui.g.h;
        r3 = r9.fe;
        r2.<init>(r3, r1);
        r1 = new fr.pcsoft.wdjava.ui.champs.zr.d;
        r1.<init>(r9, r10);
        r2.addListener(r1);
        r2.start();
    L_0x002e:
        return;
    L_0x002f:
        r1 = move-exception;
        throw r1;	 Catch:{ WDException -> 0x0031 }
    L_0x0031:
        r1 = move-exception;
        throw r1;
    L_0x0033:
        r2 = r9.Zc;	 Catch:{ WDException -> 0x003f }
        if (r2 == 0) goto L_0x016f;
    L_0x0037:
        if (r10 != r8) goto L_0x0041;
    L_0x0039:
        r9.supprimerElementSelectionne(r11);	 Catch:{ WDException -> 0x003d }
        goto L_0x002e;
    L_0x003d:
        r1 = move-exception;
        throw r1;
    L_0x003f:
        r1 = move-exception;
        throw r1;	 Catch:{ WDException -> 0x003d }
    L_0x0041:
        r2 = r9.getNbElement();
        r3 = r10 + -1;
        if (r3 < 0) goto L_0x004d;
    L_0x0049:
        r3 = r10 + -1;
        if (r3 < r2) goto L_0x00b9;
    L_0x004d:
        r2 = r9.isVide();	 Catch:{ WDException -> 0x0088 }
        if (r2 == 0) goto L_0x008a;
    L_0x0053:
        r1 = 2;
        r1 = new java.lang.String[r1];	 Catch:{ WDException -> 0x0088 }
        r2 = 0;
        r3 = ve;	 Catch:{ WDException -> 0x0088 }
        r4 = 12;
        r3 = r3[r4];	 Catch:{ WDException -> 0x0088 }
        r4 = 0;
        r4 = new java.lang.String[r4];	 Catch:{ WDException -> 0x0088 }
        r3 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r3, r4);	 Catch:{ WDException -> 0x0088 }
        r1[r2] = r3;	 Catch:{ WDException -> 0x0088 }
        r2 = 1;
        r3 = ve;	 Catch:{ WDException -> 0x0088 }
        r4 = 11;
        r3 = r3[r4];	 Catch:{ WDException -> 0x0088 }
        r4 = 2;
        r4 = new java.lang.String[r4];	 Catch:{ WDException -> 0x0088 }
        r5 = 0;
        r6 = r9.getName();	 Catch:{ WDException -> 0x0088 }
        r4[r5] = r6;	 Catch:{ WDException -> 0x0088 }
        r5 = 1;
        r6 = java.lang.String.valueOf(r10);	 Catch:{ WDException -> 0x0088 }
        r4[r5] = r6;	 Catch:{ WDException -> 0x0088 }
        r3 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r3, r4);	 Catch:{ WDException -> 0x0088 }
        r1[r2] = r3;	 Catch:{ WDException -> 0x0088 }
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2886a(r1);	 Catch:{ WDException -> 0x0088 }
        goto L_0x002e;
    L_0x0088:
        r1 = move-exception;
        throw r1;
    L_0x008a:
        r2 = ve;
        r3 = 10;
        r2 = r2[r3];
        r3 = 4;
        r3 = new java.lang.String[r3];
        r5 = java.lang.String.valueOf(r10);
        r3[r4] = r5;
        r4 = r9.getName();
        r3[r1] = r4;
        r1 = java.lang.String.valueOf(r1);
        r3[r6] = r1;
        r1 = 3;
        r4 = r9.getNbElement();
        r4 = java.lang.String.valueOf(r4);
        r3[r1] = r4;
        r1 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r2, r3);
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2883a(r1);
        goto L_0x002e;
    L_0x00b9:
        r5 = r10 + -1;
        r2 = r9.Zc;	 Catch:{ WDException -> 0x0118 }
        r2 = r2.mo3616b();	 Catch:{ WDException -> 0x0118 }
        r3 = fr.pcsoft.wdjava.core.p047f.C0715d.DIRECT_ACCESS;	 Catch:{ WDException -> 0x0118 }
        if (r2 != r3) goto L_0x011a;
    L_0x00c5:
        r3 = r1;
    L_0x00c6:
        r7 = r9.getFirstVisibleElement();
        if (r3 == 0) goto L_0x00e0;
    L_0x00cc:
        r1 = r9.Zc;	 Catch:{ WDException -> 0x011c }
        r1 = r1.mo3623d(r5);	 Catch:{ WDException -> 0x011c }
        if (r1 == 0) goto L_0x0124;
    L_0x00d4:
        r1 = r9.se;	 Catch:{ WDException -> 0x011e }
        if (r1 == 0) goto L_0x00e0;
    L_0x00d8:
        r1 = r9.se;	 Catch:{ WDException -> 0x0120 }
        r1 = r1.m9031m();	 Catch:{ WDException -> 0x0120 }
        if (r1 != 0) goto L_0x0124;
    L_0x00e0:
        if (r3 == 0) goto L_0x0176;
    L_0x00e2:
        r1 = r5 - r7;
        r2 = r1;
    L_0x00e5:
        r1 = r9.Zc;
        r4 = r1.mo3625e(r2);
        r1 = r9.getModeleDonnees();	 Catch:{ WDException -> 0x0122 }
        r1 = (fr.pcsoft.wdjava.ui.champs.zr.C1311t) r1;	 Catch:{ WDException -> 0x0122 }
        r5 = 0;
        r1.mo3577a(r2, r5);	 Catch:{ WDException -> 0x0122 }
        if (r3 == 0) goto L_0x0174;
    L_0x00f7:
        r1 = r9.Zc;	 Catch:{ WDException -> 0x0122 }
        r1.mo3617b(r7);	 Catch:{ WDException -> 0x0122 }
        fr.pcsoft.wdjava.ui.utils.C1515p.m10541a();	 Catch:{ WDException -> 0x0122 }
        r5 = r2;
    L_0x0100:
        if (r4 == 0) goto L_0x002e;
    L_0x0102:
        r9.updateIndiceItem(r5);	 Catch:{ WDException -> 0x0116 }
        r1 = r9.Zc;	 Catch:{ WDException -> 0x0116 }
        r2 = 0;
        r1.mo3619b(r7, r2);	 Catch:{ WDException -> 0x0116 }
        if (r3 == 0) goto L_0x002e;
    L_0x010d:
        r1 = r9.convertirIndiceModeleVersVue(r5);	 Catch:{ WDException -> 0x0116 }
        r9.majSelectionApresSuppression(r1);	 Catch:{ WDException -> 0x0116 }
        goto L_0x002e;
    L_0x0116:
        r1 = move-exception;
        throw r1;
    L_0x0118:
        r1 = move-exception;
        throw r1;
    L_0x011a:
        r3 = r4;
        goto L_0x00c6;
    L_0x011c:
        r1 = move-exception;
        throw r1;	 Catch:{ WDException -> 0x011e }
    L_0x011e:
        r1 = move-exception;
        throw r1;	 Catch:{ WDException -> 0x0120 }
    L_0x0120:
        r1 = move-exception;
        throw r1;
    L_0x0122:
        r1 = move-exception;
        throw r1;
    L_0x0124:
        r1 = r9.isEditing();	 Catch:{ WDException -> 0x0150 }
        if (r1 == 0) goto L_0x012f;
    L_0x012a:
        r1 = r9.Fd;	 Catch:{ WDException -> 0x0150 }
        r1.m9262k();	 Catch:{ WDException -> 0x0150 }
    L_0x012f:
        r1 = r9.getItemAt(r4);
        r1 = (fr.pcsoft.wdjava.ui.champs.zr.ec) r1;
        r2 = r1;
        r6 = r4;
    L_0x0137:
        r1 = r2 instanceof fr.pcsoft.wdjava.ui.champs.ad;	 Catch:{ WDException -> 0x0152 }
        if (r1 == 0) goto L_0x0154;
    L_0x013b:
        r0 = r2;
        r0 = (fr.pcsoft.wdjava.ui.champs.ad) r0;	 Catch:{ WDException -> 0x0152 }
        r1 = r0;
        r1 = r1.mo3416a();	 Catch:{ WDException -> 0x0152 }
        if (r1 != r8) goto L_0x0154;
    L_0x0145:
        r2 = r6 + 1;
        r1 = r9.getItemAt(r2);
        r1 = (fr.pcsoft.wdjava.ui.champs.zr.ec) r1;
        r6 = r2;
        r2 = r1;
        goto L_0x0137;
    L_0x0150:
        r1 = move-exception;
        throw r1;
    L_0x0152:
        r1 = move-exception;
        throw r1;
    L_0x0154:
        r1 = r2 instanceof fr.pcsoft.wdjava.ui.champs.ad;
        if (r1 == 0) goto L_0x0100;
    L_0x0158:
        r1 = r7 + r6;
        r1 = r5 - r1;
        r2 = r9.Zc;
        r4 = r2.mo3614a(r6, r1);
        if (r4 == 0) goto L_0x0100;
    L_0x0164:
        r1 = r9.Zc;	 Catch:{ WDException -> 0x016d }
        r1.mo3617b(r7);	 Catch:{ WDException -> 0x016d }
        fr.pcsoft.wdjava.ui.utils.C1515p.m10541a();	 Catch:{ WDException -> 0x016d }
        goto L_0x0100;
    L_0x016d:
        r1 = move-exception;
        throw r1;
    L_0x016f:
        super.supprimerElementA(r10, r11);
        goto L_0x002e;
    L_0x0174:
        r5 = r2;
        goto L_0x0100;
    L_0x0176:
        r2 = r5;
        goto L_0x00e5;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.ui.champs.zr.WDZoneRepetee.supprimerElementA(int, boolean):void");
    }

    public void supprimerTout() {
        try {
            if (this.Zc == null) {
                super.supprimerTout();
            }
        } catch (WDException e) {
            throw e;
        }
    }

    protected WDObjet swipe() {
        initialiserAction();
        return null;
    }

    public void terminerInitialisation() {
        super.terminerInitialisation();
        if (isHorizontale()) {
            try {
                C1014a.m7327b().mo3294c((View) this.fe.getParent());
            } catch (WDException e) {
                throw e;
            }
        }
        ((WDFenetre) this.l).requestActionBarVisibilityControlOnScroll(this);
        this.Vd = createRenderer();
        this.Fd = createEditor();
        updateSizes();
        int h = this.Vc.mo3496h();
        Drawable a = m1501a(h);
        switch (h) {
            case 5:
            case 99:
                if (a == null) {
                    this.fe.setSelector(new ColorDrawable(0));
                    break;
                }
                try {
                    this.fe.setSelector(a);
                    break;
                } catch (WDException e2) {
                    throw e2;
                }
            default:
                this.Vd.m8970a(a);
                this.fe.setSelector(new ColorDrawable(0));
                break;
        }
        try {
            if (this.de != null) {
                ((View) this.de).setEnabled(this.fe.isEnabled());
                this.de.mo3426a(this.fe);
                this.de.mo3427a((C0514j) this);
            }
            try {
                if (isAvecRupture()) {
                    if (this.se != null) {
                        try {
                            if (this.se.m9025h() == this) {
                                this.se.m9020d();
                            }
                            try {
                                if (this.se.m9034p() == this) {
                                    this.se.m9023f();
                                }
                            } catch (WDException e22) {
                                throw e22;
                            }
                        } catch (WDException e222) {
                            throw e222;
                        }
                    }
                }
                try {
                    if (isChampFocusable()) {
                        this.fe.setFocusable(true);
                        this.fe.setFocusableInTouchMode(true);
                    } else {
                        this.fe.setFocusable(false);
                    }
                    this.ue = getCellHeight();
                    this.ae = getLargeurColonneZR();
                } catch (WDException e2222) {
                    throw e2222;
                }
            } catch (WDException e22222) {
                throw e22222;
            } catch (WDException e222222) {
                throw e222222;
            }
        } catch (WDException e2222222) {
            throw e2222222;
        }
    }

    public void updateContenu() {
        boolean z = true;
        try {
            if (this.Fd != null) {
                if (this.Fd.mo3605h() != 1) {
                    z = false;
                }
            }
            updateContenu(z);
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        }
    }

    public void updateContenu(boolean z) {
        try {
            if (!isFenetreCree()) {
                return;
            }
            if (!isDessinZREnCours()) {
                if (z) {
                    try {
                        if (isEditing()) {
                            this.Fd.m9262k();
                        }
                    } catch (WDException e) {
                        throw e;
                    }
                }
                try {
                    if (this.Vd != null) {
                        this.Vd.mo3552c();
                    }
                    this.fe.invalidateViews();
                } catch (WDException e2) {
                    throw e2;
                }
            }
        } catch (WDException e22) {
            throw e22;
        } catch (WDException e222) {
            throw e222;
        }
    }

    protected void updateSizes() {
        int largeurColonneZR = getLargeurColonneZR();
        int cellHeight = getCellHeight();
        this.Vd.mo3547a(largeurColonneZR, cellHeight);
        this.Fd.mo3599a(largeurColonneZR, cellHeight);
        this.fe.invalidateViews();
    }
}
