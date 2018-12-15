package fr.pcsoft.wdjava.ui.utils;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: fr.pcsoft.wdjava.ui.utils.k */
public abstract class C1510k<T extends View> extends ViewPager {
    /* renamed from: a */
    private static final int f4625a = 3;
    /* renamed from: b */
    private List<T> f4626b = new ArrayList(3);

    public C1510k(Context context) {
        super(context);
        for (int i = 0; i < 3; i++) {
            this.f4626b.add(m10504a(context));
        }
        setAdapter(new bb(this));
        setOnPageChangeListener(new C1516q(this));
        setCurrentItem(m10503r(), false);
    }

    /* renamed from: r */
    private final int m10503r() {
        return 1;
    }

    /* renamed from: a */
    public abstract T m10504a(Context context);

    /* renamed from: a */
    public final void m10505a(boolean z) {
        setCurrentItem(m10503r() - 1, z);
    }

    /* renamed from: b */
    public final void m10506b(boolean z) {
        setCurrentItem(m10503r() + 1, z);
    }

    /* renamed from: k */
    public void m10507k() {
        if (this.f4626b != null) {
            this.f4626b.clear();
            this.f4626b = null;
        }
    }

    /* renamed from: l */
    public final T m10508l() {
        int r = m10503r();
        return (r < 0 || r >= this.f4626b.size()) ? null : (View) this.f4626b.get(r);
    }

    /* renamed from: m */
    public final T m10509m() {
        int r = m10503r() + 1;
        return (r < 0 || r >= this.f4626b.size()) ? null : (View) this.f4626b.get(r);
    }

    /* renamed from: n */
    public abstract void m10510n();

    /* renamed from: o */
    public abstract void m10511o();

    /* renamed from: p */
    public abstract void m10512p();

    /* renamed from: q */
    public final T m10513q() {
        int r = m10503r() - 1;
        return (r < 0 || r >= this.f4626b.size()) ? null : (View) this.f4626b.get(r);
    }
}
