package fr.pcsoft.wdjava.ui.champs.zr;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.GridView;
import fr.pcsoft.wdjava.core.p047f.C0715d;
import fr.pcsoft.wdjava.p032m.C0938m;
import fr.pcsoft.wdjava.ui.champs.zr.WDAbstractZRRenderer.AbstractRepetitionView;
import fr.pcsoft.wdjava.ui.utils.C1515p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: fr.pcsoft.wdjava.ui.champs.zr.h */
public class C1297h extends BaseAdapter implements Filterable, OnScrollListener {
    /* renamed from: a */
    private boolean f3881a = false;
    /* renamed from: b */
    private Runnable f3882b = null;
    /* renamed from: c */
    private boolean f3883c = true;
    /* renamed from: d */
    private int f3884d = 0;
    /* renamed from: e */
    private ArrayList<ec> f3885e;
    /* renamed from: f */
    private final Object f3886f = new Object();
    /* renamed from: g */
    private ArrayList<ec> f3887g = new ArrayList();
    /* renamed from: h */
    private int f3888h = 0;
    /* renamed from: i */
    private long f3889i = 0;
    /* renamed from: j */
    private int f3890j = -1;
    /* renamed from: k */
    private rb f3891k = null;
    final WDZoneRepetee this$0;

    public C1297h(WDZoneRepetee wDZoneRepetee) {
        this.this$0 = wDZoneRepetee;
        wDZoneRepetee.fe.setOnScrollListener(this);
    }

    static Runnable access$1502(C1297h c1297h, Runnable runnable) {
        c1297h.f3882b = runnable;
        return runnable;
    }

    static ArrayList access$2000(C1297h c1297h) {
        return c1297h.f3885e;
    }

    static ArrayList access$2002(C1297h c1297h, ArrayList arrayList) {
        c1297h.f3885e = arrayList;
        return arrayList;
    }

    static Object access$2100(C1297h c1297h) {
        return c1297h.f3886f;
    }

    static ArrayList access$2200(C1297h c1297h) {
        return c1297h.f3887g;
    }

    static ArrayList access$2202(C1297h c1297h, ArrayList arrayList) {
        c1297h.f3887g = arrayList;
        return arrayList;
    }

    static boolean access$2502(C1297h c1297h, boolean z) {
        c1297h.f3881a = z;
        return z;
    }

    /* renamed from: a */
    public int m9132a(ec ecVar) {
        return this.f3887g.indexOf(ecVar);
    }

    /* renamed from: a */
    public ec m9133a(int i) {
        return (i < 0 || i >= m9140b()) ? null : (ec) this.f3887g.get(i);
    }

    /* renamed from: a */
    public void m9134a(int i, int i2) {
        synchronized (this.f3886f) {
            List list;
            if (this.f3885e != null) {
                list = this.f3885e;
            } else {
                Object obj = this.f3887g;
            }
            ec ecVar = (ec) list.get(i);
            if (i < i2) {
                list.add(i2 + 1, ecVar);
                list.remove(i);
            } else {
                list.remove(i);
                list.add(i2, ecVar);
            }
        }
        if (this.f3883c) {
            notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public void m9135a(ec ecVar, int i) {
        synchronized (this.f3886f) {
            if (this.f3885e != null) {
                this.f3885e.add(i, ecVar);
            } else {
                this.f3887g.add(i, ecVar);
            }
        }
        if (this.f3883c) {
            notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public void m9136a(String str, WDAttributZR wDAttributZR, int i, boolean z) {
        if (this.f3891k == null) {
            this.f3891k = new rb(this);
        }
        rb.access$1702(this.f3891k, wDAttributZR);
        rb.access$1802(this.f3891k, z);
        rb.access$1902(this.f3891k, i);
        this.f3881a = true;
        this.f3891k.filter(str);
    }

    /* renamed from: a */
    public void m9137a(Comparator<ec> comparator) {
        int i = 0;
        synchronized (this.f3886f) {
            Collections.sort(this.f3887g, comparator);
            if (this.f3885e != null) {
                Collections.sort(this.f3885e, comparator);
            }
            if (this.this$0.isAvecRupture() && this.this$0.isPCodeAffichageLigne()) {
                int i2;
                ec ecVar;
                int size = this.f3887g.size();
                for (i2 = 0; i2 < size; i2++) {
                    ecVar = (ec) this.f3887g.get(i2);
                    if (ecVar != null) {
                        ecVar.m9108b(2, false);
                    }
                }
                if (this.f3885e != null) {
                    i2 = this.f3885e.size();
                    while (i < i2) {
                        ecVar = (ec) this.f3885e.get(i);
                        if (ecVar != null) {
                            ecVar.m9108b(2, false);
                        }
                        i++;
                    }
                }
            }
        }
        if (this.f3883c) {
            notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public void m9138a(boolean z) {
        this.f3883c = z;
    }

    /* renamed from: a */
    public final boolean m9139a() {
        return this.f3881a;
    }

    public boolean areAllItemsEnabled() {
        return !this.this$0.isAvecRupture();
    }

    /* renamed from: b */
    public final int m9140b() {
        return this.f3887g.size();
    }

    /* renamed from: b */
    public void m9141b(int i, int i2) {
        synchronized (this.f3886f) {
            if (this.f3885e != null) {
                Collections.swap(this.f3885e, i, i2);
            } else {
                Collections.swap(this.f3887g, i, i2);
            }
        }
        if (this.f3883c) {
            notifyDataSetChanged();
        }
    }

    /* renamed from: b */
    public void m9142b(ec ecVar) {
        synchronized (this.f3886f) {
            if (this.f3885e != null) {
                this.f3885e.add(ecVar);
            } else {
                this.f3887g.add(ecVar);
            }
        }
        if (this.f3883c) {
            notifyDataSetChanged();
        }
    }

    /* renamed from: c */
    public void m9143c(ec ecVar) {
        synchronized (this.f3886f) {
            this.f3887g.remove(ecVar);
            if (this.f3885e != null) {
                this.f3885e.remove(ecVar);
            }
            ecVar.release();
        }
        if (this.f3883c) {
            notifyDataSetChanged();
        }
    }

    /* renamed from: c */
    public final boolean m9144c() {
        return (this.f3891k == null || this.f3885e == null) ? false : true;
    }

    /* renamed from: d */
    public void m9145d() {
        synchronized (this.f3886f) {
            this.f3887g.clear();
            if (this.f3885e != null) {
                this.f3885e.clear();
            }
        }
        if (this.f3883c) {
            notifyDataSetChanged();
        }
    }

    /* renamed from: e */
    public void m9146e() {
        if (this.f3887g != null) {
            Iterator it = this.f3887g.iterator();
            while (it.hasNext()) {
                ((ec) it.next()).release();
            }
            this.f3887g.clear();
            this.f3887g = null;
        }
        if (this.f3885e != null) {
            this.f3885e.clear();
            this.f3885e = null;
        }
        if (this.f3891k != null) {
            this.f3891k.m9201a();
            this.f3891k = null;
        }
        this.f3882b = null;
    }

    public int getCount() {
        if (this.this$0.Zc != null && this.this$0.Zc.mo3616b() == C0715d.DIRECT_ACCESS) {
            return this.this$0.Zc.mo3626f();
        }
        int size = this.f3887g.size();
        if (this.this$0.isHorizontale() && this.this$0.fe.getChildCount() != size) {
            ((GridView) this.this$0.fe).setNumColumns(size);
        }
        return size;
    }

    public Filter getFilter() {
        return this.f3891k;
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        return m9133a(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (this.this$0.Zc != null && this.this$0.Zc.mo3616b() == C0715d.DIRECT_ACCESS) {
            i = this.this$0.convertirIndiceVueVersModele(i);
            if (i < 0 && this.f3882b == null) {
                this.f3882b = new mb(this);
                C0938m.m6816c().post(this.f3882b);
            }
        }
        this.this$0.jd = true;
        if (view != null) {
            try {
                View view2 = (AbstractRepetitionView) view;
                if (this.this$0.isSwipeEnabled() && this.this$0.se.m9015a(view2.m8956d()) && view2.m8956d() != i) {
                    this.this$0.m1503a(view2);
                }
            } catch (Throwable th) {
                this.this$0.jd = false;
            }
        }
        View a = this.this$0.Vd.mo3543a(i, view);
        ec a2 = m9133a(i);
        if (a2 != null) {
            this.this$0.setCellulePaintEnCours(i);
            a.mo3542e(i);
            if (this.this$0.isPCodeAffichageLigne() && !a2.m9116f(2)) {
                a2.m9108b(2, true);
                C1515p.f4650a = false;
                this.this$0.execPCodeAffichageLigne(a2);
                C1515p.f4650a = true;
            }
            if (this.this$0.isAvecRupture()) {
                int i2 = 0;
                int i3 = -1;
                int i4 = -1;
                int i5 = -1;
                boolean z = true;
                Iterator it = this.this$0.ed.iterator();
                while (it.hasNext()) {
                    pb pbVar = (pb) it.next();
                    boolean i6 = a2.m9121i(i2);
                    if (i6) {
                        z = false;
                        if (i5 == -1) {
                            i5 = i2;
                        }
                    }
                    if (i3 == -1 && pbVar.mo3572a(a2, i, false)) {
                        i3 = i2;
                    }
                    if (i4 == -1 && pbVar.mo3573b(a2, i, false)) {
                        i4 = i2;
                    }
                    if (i3 == -1) {
                        a.m8957d(i2);
                    } else if ((i6 || r6 != -1) && !(i6 && i2 == r6)) {
                        a.m8957d(i2);
                    } else {
                        a.mo3562a(i2, i6);
                        if (!a2.m9112d(i2)) {
                            a2.m9119h(i2).f3877c = i;
                            WDRuptureZR c = pbVar.m9182c();
                            if (c.isRuptureVisible()) {
                                c.appelPCode(21);
                                a2.m9114e(i2);
                            }
                        }
                    }
                    if (i4 == -1) {
                        a.m8955c(i2);
                    } else if (i6 || r6 != -1) {
                        a.m8955c(i2);
                    } else {
                        a.mo3561a(i2);
                        if (!a2.m9110c(i2)) {
                            a2.m9119h(i2).f3875a = i;
                            WDRuptureZR b = pbVar.m9180b();
                            if (b.isRuptureVisible()) {
                                b.appelPCode(21);
                                a2.m9118g(i2);
                            }
                        }
                    }
                    i2++;
                }
                a.mo3538a(z);
            }
            a.mo3535a();
            a.mo3537a(a2);
            a2.m9108b(4, true);
        }
        this.this$0.jd = false;
        return a;
    }

    public boolean isEnabled(int i) {
        if (this.this$0.Nd) {
            return false;
        }
        ec a = m9133a(this.this$0.convertirIndiceVueVersModele(i));
        return (a == null || a.m9109c() == 4) ? false : true;
    }

    public void notifyDataSetChanged() {
        if (this.this$0.se != null) {
            this.this$0.se.m9032n();
        }
        super.notifyDataSetChanged();
        this.f3883c = true;
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        if (this.this$0.Zc != null) {
            if (this.this$0.Zc.mo3616b() == C0715d.DIRECT_ACCESS && i != this.f3888h) {
                m9138a(false);
                try {
                    if (this.this$0.Zc.mo3635w()) {
                        this.this$0.Zc.mo3618b(i / this.this$0.getMaxItemCountPerRow(), this.f3888h / this.this$0.getMaxItemCountPerRow());
                    }
                    m9138a(true);
                    notifyDataSetChanged();
                } catch (Throwable th) {
                    m9138a(true);
                }
            }
        } else if (this.this$0.ee == ab.IDLE) {
            int i4 = (i + i2) - 1;
            if (i4 >= 0) {
                if (i4 < this.f3890j || this.f3890j >= i3) {
                    this.f3890j = -1;
                }
                if (i4 == i3 - 1 && this.f3884d != 0 && i4 > this.f3890j) {
                    if (this.f3889i == 0 || System.currentTimeMillis() - this.f3889i > 1000) {
                        this.f3889i = System.currentTimeMillis();
                        this.this$0.m1504a(ab.LOADING);
                    }
                    this.f3890j = i4;
                }
            }
        }
        if (this.this$0.Vd != null) {
            this.this$0.Vd.m8974b(i);
        }
        this.f3888h = i;
        this.this$0.appelPCode(238);
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        this.f3884d = i;
    }
}
