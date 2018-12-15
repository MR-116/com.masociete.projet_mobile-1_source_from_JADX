package fr.pcsoft.wdjava.ui.pulltorefresh;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener;
import android.view.View;
import android.view.ViewGroup;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.p032m.C0938m;
import fr.pcsoft.wdjava.ui.utils.C1503b;
import java.lang.reflect.Field;

/* renamed from: fr.pcsoft.wdjava.ui.pulltorefresh.u */
public class C1488u extends SwipeRefreshLayout implements C1156d, OnRefreshListener {
    /* renamed from: z */
    private static final String[] f4483z = new String[]{C1488u.m10331z(C1488u.m10332z("&\"s[/.\u0002")), C1488u.m10331z(C1488u.m10332z("\u0002\u001bbF;8\u001fpE-k\u00125H+(vL:k\u0017g\t%.\u001bp[-k%e@8.$wO:.\u0005ze)2\u0019g\n%\u001f\u0017`N-?VbH:k\u001f|]:$\u0005bL+?\u001f}Gf"))};
    /* renamed from: b */
    private View f4484b = null;
    /* renamed from: c */
    private int f4485c = 0;
    /* renamed from: d */
    private C0514j f4486d = null;

    public C1488u(Context context, int i) {
        super(context);
        super.setOnRefreshListener(this);
        if (Color.alpha(i) > 0) {
            setColorSchemeColors(i);
        }
    }

    /* renamed from: z */
    private static String m10331z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 75;
                    break;
                case 1:
                    i2 = 118;
                    break;
                case 2:
                    i2 = 18;
                    break;
                case 3:
                    i2 = 41;
                    break;
                default:
                    i2 = 72;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m10332z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 72);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public void mo3425a() {
        this.f4484b = null;
    }

    /* renamed from: a */
    public void mo3426a(View view) {
        try {
            if (view != this.f4484b) {
                if (this.f4484b != null) {
                    removeView(this.f4484b);
                    try {
                        Field declaredField = SwipeRefreshLayout.class.getDeclaredField(f4483z[0]);
                        declaredField.setAccessible(true);
                        declaredField.set(this, null);
                    } catch (Exception e) {
                        C0691a.m2857a(f4483z[1], e);
                    }
                }
                this.f4484b = view;
                C1503b.m10429a((ViewGroup) this, view, generateDefaultLayoutParams());
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    public void mo3427a(C0514j c0514j) {
        this.f4486d = c0514j;
    }

    /* renamed from: a */
    public void mo3428a(boolean z) {
        if (!C0938m.m6815b()) {
            C0938m.m6810a(new C1473b(this, z));
        } else if (z) {
            this.f4485c++;
            setRefreshing(true);
        } else if (this.f4485c > 0) {
            this.f4485c--;
            if (this.f4485c == 0) {
                setRefreshing(false);
            }
        }
    }

    /* renamed from: b */
    public View mo3429b() {
        return this.f4484b;
    }

    public void onRefresh() {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f4486d != null) {
            this.f4486d.onRefresh();
        }
        currentTimeMillis = System.currentTimeMillis() - currentTimeMillis;
        if (currentTimeMillis < 500) {
            C0938m.m6816c().postDelayed(new C1475g(this), 500 - currentTimeMillis);
        }
    }
}
