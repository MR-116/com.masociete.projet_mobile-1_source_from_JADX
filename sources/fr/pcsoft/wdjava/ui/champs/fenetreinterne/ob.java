package fr.pcsoft.wdjava.ui.champs.fenetreinterne;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import fr.pcsoft.wdjava.ui.activite.C1056i;
import java.util.ArrayList;

class ob extends PagerAdapter implements nb {
    /* renamed from: a */
    private ArrayList<pb> f3538a;
    final WDChampFenetreInterneExt this$0;

    private ob(WDChampFenetreInterneExt wDChampFenetreInterneExt) {
        this.this$0 = wDChampFenetreInterneExt;
        this.f3538a = new ArrayList(5);
    }

    ob(WDChampFenetreInterneExt wDChampFenetreInterneExt, C1180g c1180g) {
        this(wDChampFenetreInterneExt);
    }

    /* renamed from: a */
    public void mo3436a() {
    }

    /* renamed from: a */
    public final void mo3437a(int i, pb pbVar) {
        if (i >= 0 && i < getCount()) {
            this.f3538a.set(i, pbVar);
            mo3445e();
        }
    }

    /* renamed from: a */
    public final void mo3438a(pb pbVar) {
        this.f3538a.add(pbVar);
        pbVar.m8504a(this.f3538a.size() - 1);
        mo3445e();
    }

    /* renamed from: a */
    public void mo3439a(pb pbVar, int i) {
        if (i >= 0 && i <= getCount()) {
            this.f3538a.add(i, pbVar);
            mo3445e();
        }
    }

    /* renamed from: a */
    public final boolean mo3440a(int i) {
        if (i < 0 || i >= getCount()) {
            return false;
        }
        pb pbVar = (pb) this.f3538a.remove(i);
        mo3445e();
        return true;
    }

    /* renamed from: b */
    public pb mo3441b() {
        return mo3442b(this.this$0.Mc.getCurrentItem());
    }

    /* renamed from: b */
    public final pb mo3442b(int i) {
        return (i < 0 || i >= getCount()) ? null : (pb) this.f3538a.get(i);
    }

    /* renamed from: c */
    public void mo3443c() {
    }

    /* renamed from: d */
    public int mo3444d() {
        return this.f3538a != null ? this.f3538a.size() : 0;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (obj instanceof pb) {
            pb pbVar = (pb) obj;
            WDFenetreInterne a = pbVar.m8503a();
            if (a != null) {
                this.this$0.dechargerFenetreInterne(a);
                pbVar.m8505a(null);
            } else {
                View findViewWithTag = ((ViewGroup) this.this$0.Mc).findViewWithTag(pbVar);
                if (findViewWithTag != null) {
                    ((ViewGroup) this.this$0.Mc).removeView(findViewWithTag);
                    findViewWithTag.setTag(null);
                }
            }
            if (getItemPosition(pbVar) == -2) {
                pbVar.m8509e();
            }
            if (a != null && a == this.this$0.Ec) {
                pb b = mo3441b();
                if (b != null) {
                    this.this$0.onPageAffichee(b, false);
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo3445e() {
        if (this.this$0.isExecPCodeInit() || !this.this$0.isFenetreCree()) {
            notifyDataSetChanged();
        }
    }

    /* renamed from: f */
    public final void mo3446f() {
        this.f3538a.clear();
        mo3445e();
    }

    /* renamed from: g */
    public final void mo3447g() {
        if (this.f3538a != null) {
            int count = getCount();
            for (int i = 0; i < count; i++) {
                ((pb) this.f3538a.get(i)).m8509e();
            }
            this.f3538a.clear();
            this.f3538a = null;
        }
    }

    public int getCount() {
        return mo3444d();
    }

    public int getItemPosition(Object obj) {
        if (obj instanceof pb) {
            pb pbVar = (pb) obj;
            int indexOf = this.f3538a.indexOf(pbVar);
            if (indexOf < 0) {
                return -2;
            }
            if (indexOf != pbVar.m8506b()) {
                pbVar.m8504a(indexOf);
                return indexOf;
            }
        }
        return -1;
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        if (i < 0 || i >= getCount()) {
            return null;
        }
        pb pbVar = (pb) this.f3538a.get(i);
        if (pbVar.m8503a() == null) {
            WDFenetreInterne chargerFenetreInterne = this.this$0.chargerFenetreInterne(pbVar.m8508d(), pbVar.m8507c());
            if (chargerFenetreInterne == null) {
                viewGroup.addView(new LinearLayout(C1056i.m7562a()));
            } else {
                pbVar.m8505a(chargerFenetreInterne);
            }
        } else {
            this.this$0.installerFenetreInterne(pbVar.m8503a());
        }
        viewGroup.getChildAt(viewGroup.getChildCount() - 1).setTag(pbVar);
        if (this.this$0.Mc.getCurrentItem() >= 0 && this.this$0.Mc.getCurrentItem() != i) {
            return pbVar;
        }
        this.this$0.onPageAffichee(pbVar, false);
        return pbVar;
    }

    public boolean isViewFromObject(View view, Object obj) {
        return (obj instanceof pb) && view.getTag() == obj;
    }
}
