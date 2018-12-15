package fr.pcsoft.wdjava.ui.searchbar;

import android.annotation.TargetApi;
import android.app.SearchManager;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.EditText;
import android.widget.SearchView;
import android.widget.SearchView.OnQueryTextListener;
import android.widget.SearchView.OnSuggestionListener;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.context.WDAppelContexte;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.p042b.C0657a;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.p032m.C0938m;
import fr.pcsoft.wdjava.ui.actionbar.WDActionBar;
import fr.pcsoft.wdjava.ui.activite.WDActivite;
import fr.pcsoft.wdjava.ui.champs.fenetre.C0508h;
import fr.pcsoft.wdjava.ui.utils.C1503b;
import java.lang.reflect.Field;

@TargetApi(14)
/* renamed from: fr.pcsoft.wdjava.ui.searchbar.c */
public class C1491c implements OnActionExpandListener, OnSuggestionListener, OnQueryTextListener, OnFocusChangeListener {
    /* renamed from: z */
    private static final String[] f4494z = new String[]{C1491c.m10346z(C1491c.m10347z("_\b,j\rD")), C1491c.m10346z(C1491c.m10347z("_\u0018*\u000b_\u0019\u0012l\u000bT\u0019\u0012)")), C1491c.m10346z(C1491c.m10347z("a\b z\u001cIM K\u000bM\u001f.p&E\u00039Q\rC\u0003mv\u0001BM9j\u0001Y\u001b¤8\u001eM\u001fmq\u0000X\u001f\"k\u001eI\u000e9q\u0001BM)y\u0000_M!yNO\u0001,k\u001dIM\u001e}\u000f^\u000e%N\u0007I\u001ac")), C1491c.m10346z(C1491c.m10347z("A>(y\u001cO\u0005\u0005q\u0000X$.w\u0000"))};
    /* renamed from: a */
    private boolean f4495a = false;
    /* renamed from: b */
    private String f4496b = "";
    /* renamed from: c */
    private boolean f4497c = false;
    /* renamed from: d */
    private MenuItem f4498d = null;
    /* renamed from: e */
    private SearchView f4499e = null;
    /* renamed from: f */
    private C0493a f4500f = null;
    /* renamed from: g */
    private boolean f4501g = false;

    public C1491c(Context context, Menu menu, WDActionBar wDActionBar) {
        this.f4499e = new C1490b(this, context);
        this.f4498d = menu.add(f4494z[0]);
        this.f4498d.setActionView(this.f4499e);
        if (WDProjet.getInstance().isVersionCompatible(C0657a.KIT_KAT.getNumero()) || menu.size() != 1) {
            this.f4498d.setVisible(false);
        } else {
            this.f4498d.setTitle("");
            this.f4498d.setIcon(null);
            this.f4498d.setEnabled(false);
        }
        this.f4498d.setShowAsAction(9);
        this.f4498d.setOnActionExpandListener(this);
        this.f4499e.setOnSuggestionListener(this);
        this.f4499e.setOnQueryTextListener(this);
        if (wDActionBar.isSearchHistoryEnabled()) {
            this.f4499e.setSearchableInfo(((SearchManager) context.getSystemService(f4494z[0])).getSearchableInfo(new ComponentName(context, WDSearchActivity.class)));
        }
        this.f4499e.setImeOptions(3);
        this.f4499e.setOnQueryTextFocusChangeListener(this);
        for (EditText textColor : C1503b.m10424a(this.f4499e, EditText.class, null)) {
            textColor.setTextColor(wDActionBar.getCouleurTitre());
        }
    }

    /* renamed from: z */
    private static String m10346z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 44;
                    break;
                case 1:
                    i2 = 109;
                    break;
                case 2:
                    i2 = 77;
                    break;
                case 3:
                    i2 = 24;
                    break;
                default:
                    i2 = 110;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m10347z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 110);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public final String m10348a() {
        return m10354d() ? this.f4499e.getQuery().toString() : this.f4496b;
    }

    /* renamed from: a */
    public final void m10349a(WDActionBar wDActionBar, String str) {
        if (!m10354d()) {
            if (C0808l.m4053k(str)) {
                this.f4499e.setQueryHint("");
            } else {
                int couleurTitre = wDActionBar.getCouleurTitre();
                couleurTitre = Color.argb(Color.alpha(couleurTitre) / 2, Color.red(couleurTitre), Color.green(couleurTitre), Color.blue(couleurTitre));
                CharSequence spannableString = new SpannableString(str);
                spannableString.setSpan(new ForegroundColorSpan(couleurTitre), 0, str.length(), 33);
                this.f4499e.setQueryHint(spannableString);
            }
            this.f4498d.setVisible(true);
            this.f4498d.expandActionView();
            C0938m.m6816c().post(new C1493e(this));
        }
    }

    /* renamed from: a */
    public void m10350a(C0493a c0493a) {
        this.f4500f = c0493a;
    }

    /* renamed from: a */
    public final void m10351a(String str) {
        this.f4499e.setQuery(str, false);
    }

    /* renamed from: b */
    public void m10352b() {
        this.f4498d = null;
        this.f4499e = null;
    }

    /* renamed from: c */
    public final Drawable m10353c() {
        try {
            Field declaredField = SearchView.class.getDeclaredField(f4494z[3]);
            declaredField.setAccessible(true);
            return (Drawable) declaredField.get(this.f4499e);
        } catch (Exception e) {
            C0691a.m2857a(f4494z[2], e);
            return null;
        }
    }

    /* renamed from: d */
    public final boolean m10354d() {
        return this.f4498d.isActionViewExpanded();
    }

    /* renamed from: e */
    public final void m10355e() {
        if (m10354d()) {
            this.f4495a = WDAppelContexte.getContexte().m2726l() != null;
            this.f4498d.collapseActionView();
        }
    }

    public void onFocusChange(View view, boolean z) {
        if (z) {
            Context context = view.getContext();
            if (context instanceof WDActivite) {
                C0508h b = ((WDActivite) context).mo1766b();
                if (b != null) {
                    b.setIndiceChampCourant(-1);
                }
            }
        }
    }

    public boolean onMenuItemActionCollapse(MenuItem menuItem) {
        if (!this.f4497c) {
            this.f4496b = "";
            if (this.f4500f != null) {
                this.f4500f.onSearchCancelled(this.f4495a);
            }
        }
        if (menuItem == this.f4498d) {
            menuItem.setVisible(false);
        }
        return true;
    }

    public boolean onMenuItemActionExpand(MenuItem menuItem) {
        this.f4499e.setQuery("", false);
        return true;
    }

    public boolean onQueryTextChange(String str) {
        if (!(this.f4500f == null || this.f4501g)) {
            this.f4500f.onQueryTextChangedFromUser();
        }
        return false;
    }

    public boolean onQueryTextSubmit(String str) {
        this.f4496b = str;
        if (this.f4500f != null) {
            this.f4500f.onQuerySubmit(str);
        }
        try {
            this.f4499e.clearFocus();
            return false;
        } finally {
            this.f4497c = false;
        }
    }

    public boolean onSuggestionClick(int i) {
        Cursor cursor = (Cursor) this.f4499e.getSuggestionsAdapter().getItem(i);
        if (cursor != null) {
            CharSequence string = cursor.getString(cursor.getColumnIndex(f4494z[1]));
            if (!C0808l.m4053k(string)) {
                this.f4499e.setQuery(string, true);
            }
        }
        return false;
    }

    public boolean onSuggestionSelect(int i) {
        return false;
    }
}
