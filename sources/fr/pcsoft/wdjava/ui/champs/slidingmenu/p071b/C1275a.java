package fr.pcsoft.wdjava.ui.champs.slidingmenu.p071b;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.DrawerLayout.LayoutParams;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toolbar;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.ressources.C0743a;
import fr.pcsoft.wdjava.p061q.p062a.C1014a;
import fr.pcsoft.wdjava.ui.actionbar.C0491d;
import fr.pcsoft.wdjava.ui.activite.C0492a;
import fr.pcsoft.wdjava.ui.champs.fenetre.WDFenetre;
import fr.pcsoft.wdjava.ui.champs.gc;
import fr.pcsoft.wdjava.ui.champs.slidingmenu.C0526d;
import fr.pcsoft.wdjava.ui.champs.slidingmenu.C1269c;
import fr.pcsoft.wdjava.ui.utils.C1511l;

/* renamed from: fr.pcsoft.wdjava.ui.champs.slidingmenu.b.a */
public class C1275a extends DrawerLayout implements C1269c, C0492a {
    /* renamed from: b */
    private static final String f3765b = C1275a.m8906z(C1275a.m8907z("W\"\u0007.ZI+13QM*6(iI!<4UA;7/"));
    /* renamed from: h */
    private static final String f3766h = C1275a.m8906z(C1275a.m8907z("W\"\u0007.ZI+13QM*6(iS'99YW"));
    /* renamed from: z */
    private static final String[] f3767z;
    /* renamed from: a */
    private boolean f3768a = true;
    /* renamed from: c */
    private C0526d f3769c = null;
    /* renamed from: d */
    private boolean f3770d = false;
    /* renamed from: e */
    private boolean f3771e = false;
    /* renamed from: f */
    private boolean f3772f = true;
    /* renamed from: g */
    private boolean f3773g = false;
    /* renamed from: i */
    private C0526d f3774i = null;
    /* renamed from: j */
    private ActionBarDrawerToggle f3775j;

    static {
        String[] strArr = new String[2];
        strArr[0] = C1275a.m8906z(C1275a.m8907z("u!x.ZI+13Q\u0000\"=3C\u0000(9(UH*x<\u0016D¦2½\u0016É;±}WS<7>_Éa"));
        strArr[1] = C1275a.m8906z(C1275a.m8907z("u!x.ZI+13Q\u0000\"=3C\u0000+*2_T*x<\u0016D¦2½\u0016É;±}WS<7>_Éa"));
        f3767z = strArr;
    }

    public C1275a(WDFenetre wDFenetre) {
        super(wDFenetre.getActivite());
        this.f3775j = new C1276b(this, wDFenetre.getActivite(), this, C0743a.m3206c(f3765b), 0, 0, wDFenetre);
        setDrawerListener(this.f3775j);
        wDFenetre.ajouterEcouteurActivite(this);
        wDFenetre.getActivite().setContentView(this);
    }

    /* renamed from: z */
    private static String m8906z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 32;
                    break;
                case 1:
                    i2 = 79;
                    break;
                case 2:
                    i2 = 88;
                    break;
                case 3:
                    i2 = 93;
                    break;
                default:
                    i2 = 54;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m8907z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 54);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public C0526d mo3509a(int i) {
        switch (i) {
            case 0:
                return this.f3769c;
            case 1:
                return this.f3774i;
            default:
                return null;
        }
    }

    /* renamed from: a */
    public final void mo3510a(Activity activity, View view, int i) {
        if (this.f3768a) {
            activity.setContentView(view);
            ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
            View childAt = viewGroup.getChildAt(0);
            viewGroup.removeView(childAt);
            addView(childAt, 0, new LayoutParams(-1, -1));
            viewGroup.addView(this);
            return;
        }
        addView(view, 0, new LayoutParams(-1, -1));
    }

    /* renamed from: a */
    public void mo3511a(WDFenetre wDFenetre) {
        Point a = C1014a.m7327b().mo3295a(false);
        int i = a.x;
        int i2 = a.y;
        if (!wDFenetre.isSystemBarTransparent()) {
            i2 -= wDFenetre.getHauteurBarreSysteme();
        }
        if (!(this.f3768a || wDFenetre.getModeActionBar() == 2)) {
            i2 -= wDFenetre.getHauteurBarreDeTitre();
        }
        if (this.f3769c != null) {
            this.f3769c.onLayout(i, i2);
        }
        if (this.f3774i != null) {
            this.f3774i.onLayout(i, i2);
        }
    }

    /* renamed from: a */
    public final void mo3512a(C0526d c0526d) {
        switch (c0526d.getPosition()) {
            case 0:
                openDrawer(3);
                return;
            case 1:
                openDrawer(5);
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public boolean mo3513a() {
        return false;
    }

    /* renamed from: b */
    public void mo3514b() {
        this.f3775j = null;
        if (this.f3769c != null) {
            this.f3769c.release();
            this.f3769c = null;
        }
        if (this.f3774i != null) {
            this.f3774i.release();
            this.f3774i = null;
        }
    }

    /* renamed from: b */
    public final void mo3515b(C0526d c0526d) {
        int i;
        boolean z = true;
        switch (c0526d.getPosition()) {
            case 1:
                C0691a.m2860a(this.f3769c == null, f3767z[1]);
                this.f3774i = c0526d;
                i = 5;
                break;
            default:
                C0691a.m2860a(this.f3769c == null, f3767z[0]);
                this.f3769c = c0526d;
                i = 3;
                break;
        }
        WDFenetre wDFenetre = (WDFenetre) ((gc) c0526d).getFenetreMere();
        ViewGroup.LayoutParams layoutParams = new LayoutParams(0, -1, i);
        addView((View) c0526d.getUIComp(), layoutParams);
        if (this.f3768a && !wDFenetre.isSystemBarTransparent()) {
            layoutParams.topMargin = wDFenetre.getHauteurBarreSysteme();
        }
        setDrawerLockMode(c0526d.isDisplayedWithGesture() ? 0 : 1, i);
        if (i == 3) {
            setDrawerShadow(C0743a.m3206c(f3766h), i);
        }
        if (this.f3769c == c0526d) {
            C0491d actionBar = wDFenetre.getActionBar();
            if (actionBar != null) {
                i = actionBar.getActionHome();
                if (i != 3) {
                    z = false;
                }
                this.f3771e = z;
                if (wDFenetre.isMaterialDesign() && (actionBar.getView() instanceof Toolbar) && (i == 0 || i == 2)) {
                    Drawable navigationIcon = ((Toolbar) actionBar.getView()).getNavigationIcon();
                    actionBar.setDisplayHomeAsUpEnabled(false);
                    this.f3775j.setDrawerIndicatorEnabled(false);
                    if (navigationIcon != null) {
                        ((Toolbar) actionBar.getView()).setNavigationIcon(navigationIcon);
                    }
                } else {
                    actionBar.setDisplayHomeAsUpEnabled(this.f3771e);
                    this.f3775j.setDrawerIndicatorEnabled(this.f3771e);
                }
            }
        }
        this.f3775j.syncState();
    }

    /* renamed from: c */
    public void mo3516c() {
        if (this.f3774i == null) {
            return;
        }
        if (isDrawerOpen(5)) {
            closeDrawer(5);
        } else {
            openDrawer(5);
        }
    }

    /* renamed from: c */
    public final void mo3517c(C0526d c0526d) {
        switch (c0526d.getPosition()) {
            case 0:
                closeDrawer(3);
                return;
            case 1:
                closeDrawer(5);
                return;
            default:
                return;
        }
    }

    /* renamed from: d */
    public void mo3518d() {
        if (this.f3769c == null) {
            return;
        }
        if (isDrawerOpen(3)) {
            closeDrawer(3);
        } else {
            openDrawer(3);
        }
    }

    /* renamed from: d */
    public boolean mo3519d(C0526d c0526d) {
        switch (c0526d.getPosition()) {
            case 0:
                return isDrawerOpen(3);
            case 1:
                return isDrawerOpen(5);
            default:
                return false;
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f3773g || C1014a.m7327b().mo3278a(motionEvent) <= 1) {
            return super.dispatchTouchEvent(motionEvent);
        }
        requestDisallowInterceptTouchEvent(false);
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        requestDisallowInterceptTouchEvent(true);
        return dispatchTouchEvent;
    }

    public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
    }

    public void onConfigurationChanged(Activity activity, Configuration configuration) {
        if (this.f3775j != null) {
            this.f3775j.onConfigurationChanged(configuration);
        }
    }

    public void onCreate(Activity activity, Bundle bundle) {
    }

    public void onDestroy(Activity activity) {
    }

    public void onFinish(Activity activity) {
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.f3772f = true;
            int rawX = (int) motionEvent.getRawX();
            int d = C1511l.m10532d(20.0f, 2);
            if (this.f3769c != null && rawX < d) {
                this.f3772f = false;
            } else if (this.f3774i != null && rawX > C1014a.m7327b().mo3295a(false).x - d) {
                this.f3772f = false;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        this.f3770d = super.onKeyDown(i, keyEvent);
        return this.f3770d;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        if (!this.f3770d) {
            return false;
        }
        this.f3770d = false;
        return super.onKeyUp(i, keyEvent);
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
        if (this.f3771e) {
            this.f3775j.onOptionsItemSelected(menuItem);
        }
    }

    public void onStart(Activity activity) {
    }

    public void onStop(Activity activity) {
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (this.f3772f) {
            this.f3773g = z;
            super.requestDisallowInterceptTouchEvent(z);
        }
    }
}
