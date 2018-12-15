package fr.pcsoft.wdjava.ui.activite;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat.OnRequestPermissionsResultCallback;
import android.text.Spanned;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import fr.pcsoft.wdjava.core.application.WDAppManager;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.p042b.C0657a;
import fr.pcsoft.wdjava.ui.champs.fenetre.WDFenetre;
import fr.pcsoft.wdjava.ui.utils.C1515p;

public abstract class WDActivite extends Activity implements C0502g, OnRequestPermissionsResultCallback {
    /* renamed from: a */
    private WDFenetre f956a = null;
    /* renamed from: b */
    private boolean f957b = false;
    /* renamed from: c */
    private boolean f958c = false;

    public static class BlankActivity extends Activity implements OnRequestPermissionsResultCallback {
        /* renamed from: a */
        private static int f3004a = 0;
        /* renamed from: b */
        private static BlankActivity f3005b = null;

        /* renamed from: a */
        public static final synchronized void m7538a() {
            synchronized (BlankActivity.class) {
                if (f3005b != null) {
                    f3005b.finish();
                }
            }
        }

        /* renamed from: b */
        public static final synchronized Activity m7539b() {
            Activity activity;
            synchronized (BlankActivity.class) {
                if (f3005b == null) {
                    Intent intent = new Intent(WDAppManager.m2544C(), BlankActivity.class);
                    intent.setFlags(335544320);
                    WDAppManager.m2544C().startActivity(intent);
                    while (f3005b == null) {
                        C1515p.m10541a();
                    }
                }
                f3004a++;
                activity = f3005b;
            }
            return activity;
        }

        protected void onActivityResult(int i, int i2, Intent intent) {
            super.onActivityResult(i, i2, intent);
            WDAppManager.m2563a((Context) this, i, i2, intent);
        }

        protected void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            Window window = getWindow();
            window.requestFeature(1);
            window.setBackgroundDrawable(null);
            f3005b = this;
        }

        protected void onDestroy() {
            super.onDestroy();
            int i = f3004a - 1;
            f3004a = i;
            if (i == 0) {
                f3005b = null;
            }
        }

        public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
            WDAppManager.m2559a((Activity) this, i, strArr, iArr);
        }
    }

    /* renamed from: a */
    public void mo1757a() {
        super.onResume();
    }

    /* renamed from: a */
    public void mo1758a(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    /* renamed from: a */
    public void mo1759a(Intent intent) {
        super.onNewIntent(intent);
    }

    /* renamed from: a */
    public void mo1760a(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    /* renamed from: a */
    public void mo1761a(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    /* renamed from: a */
    public void mo1762a(boolean z) {
        this.f958c = z;
    }

    /* renamed from: a */
    public boolean mo1763a(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    /* renamed from: a */
    public boolean mo1764a(Menu menu) {
        return super.onPrepareOptionsMenu(menu);
    }

    /* renamed from: a */
    public boolean mo1765a(MenuItem menuItem) {
        return super.onOptionsItemSelected(menuItem);
    }

    /* renamed from: b */
    public WDFenetre mo1766b() {
        if (this.f956a == null) {
            this.f956a = getFenetre();
        }
        return this.f956a;
    }

    /* renamed from: b */
    public void mo1767b(Bundle bundle) {
        super.onCreate(bundle);
    }

    /* renamed from: b */
    public boolean mo1768b(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    /* renamed from: c */
    public final void mo1769c() {
        this.f957b = true;
        finish();
    }

    /* renamed from: d */
    public final boolean mo1770d() {
        return this.f957b;
    }

    /* renamed from: e */
    public void mo1771e() {
        super.onLowMemory();
    }

    /* renamed from: f */
    public void mo1772f() {
        super.onPause();
    }

    /* renamed from: g */
    public void mo1773g() {
        if (this.f956a != null) {
            if (!this.f956a.estOuverte()) {
                this.f956a.release();
            }
            this.f956a = null;
        }
    }

    protected abstract WDFenetre getFenetre();

    /* renamed from: h */
    public void mo1774h() {
        super.onRestart();
    }

    /* renamed from: i */
    public final Activity mo1775i() {
        return this;
    }

    /* renamed from: j */
    public void mo1776j() {
        super.onStart();
    }

    /* renamed from: k */
    public void mo1777k() {
        super.onDestroy();
    }

    /* renamed from: l */
    public boolean mo1778l() {
        return this.f958c;
    }

    /* renamed from: m */
    public void mo1779m() {
        super.onStop();
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        C1050b.m7541a(this, i, i2, intent);
    }

    public void onConfigurationChanged(Configuration configuration) {
        C1050b.m7543a((C0502g) this, configuration);
    }

    protected void onCreate(Bundle bundle) {
        C1050b.m7549b((C0502g) this, bundle);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return C1050b.m7550b((C0502g) this, menu);
    }

    protected void onDestroy() {
        C1050b.m7552d(this);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return C1050b.m7545a(this, i, keyEvent);
    }

    public void onLowMemory() {
        C1050b.m7555g(this);
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (!WDProjet.getInstance().isVersionCompatible(C0657a.KIT_KAT.getNumero())) {
            CharSequence titleCondensed = menuItem.getTitleCondensed();
            if (titleCondensed instanceof Spanned) {
                menuItem.setTitleCondensed(titleCondensed.toString());
            }
        }
        return super.onMenuItemSelected(i, menuItem);
    }

    protected void onNewIntent(Intent intent) {
        C1050b.m7542a((C0502g) this, intent);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return C1050b.m7547a((C0502g) this, menuItem);
    }

    protected void onPause() {
        C1050b.m7554f(this);
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        return C1050b.m7546a((C0502g) this, menu);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        WDAppManager.m2559a((Activity) this, i, strArr, iArr);
    }

    protected void onRestart() {
        C1050b.m7551c(this);
    }

    protected void onResume() {
        C1050b.m7540a(this);
    }

    protected void onSaveInstanceState(Bundle bundle) {
        C1050b.m7544a((C0502g) this, bundle);
    }

    protected void onStart() {
        C1050b.m7553e(this);
    }

    protected void onStop() {
        C1050b.m7548b(this);
    }

    public void openOptionsMenu() {
        if (this.f956a == null || this.f956a.isAvecActionBarExt()) {
            super.openOptionsMenu();
            return;
        }
        Configuration configuration = getResources().getConfiguration();
        if ((configuration.screenLayout & 15) > 3) {
            int i = configuration.screenLayout;
            configuration.screenLayout = 3;
            super.openOptionsMenu();
            configuration.screenLayout = i;
            return;
        }
        super.openOptionsMenu();
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
    }

    public void setTitleColor(int i) {
        super.setTitleColor(i);
    }
}
