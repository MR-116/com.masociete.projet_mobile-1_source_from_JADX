package fr.pcsoft.wdjava.ui.actionbar;

import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import fr.pcsoft.wdjava.ui.C0488r;
import fr.pcsoft.wdjava.ui.menu.C0495i;

/* renamed from: fr.pcsoft.wdjava.ui.actionbar.d */
public interface C0491d extends C0488r {
    /* renamed from: a */
    public static final int f820a = 4;
    /* renamed from: b */
    public static final int f821b = 0;
    /* renamed from: c */
    public static final int f822c = 3;
    /* renamed from: d */
    public static final int f823d = 2;
    /* renamed from: e */
    public static final int f824e = 1;

    void enableHideOnContentScroll();

    int getActionHome();

    int getBackgroundColor();

    int getHauteurBarre();

    int getHideOffset();

    String getName();

    View getView();

    void hide();

    boolean isActionBarDefaut();

    boolean isSearchBarVisible();

    boolean isSearchHistoryEnabled();

    boolean isShown();

    void onCreateMenu(Menu menu);

    void onInitOptionMenu(C0495i c0495i, MenuItem menuItem, int i);

    void onItemVisibilityChanged(C0495i c0495i, MenuItem menuItem, int i, boolean z);

    void setActionBarListener(C0511c c0511c);

    void setDisplayHomeAsUpEnabled(boolean z);

    boolean setHideOffset(int i);

    void setSearchBarVisible(boolean z, String str);

    void show();

    void transformDrawable(Drawable drawable);
}
