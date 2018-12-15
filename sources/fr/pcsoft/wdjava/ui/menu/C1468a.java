package fr.pcsoft.wdjava.ui.menu;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import fr.pcsoft.wdjava.p032m.C0938m;

/* renamed from: fr.pcsoft.wdjava.ui.menu.a */
class C1468a implements OnMenuItemClickListener {
    final WDOptionMenu this$0;

    C1468a(WDOptionMenu wDOptionMenu) {
        this.this$0 = wDOptionMenu;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        if (this.this$0.d != 0) {
            return false;
        }
        C0938m.m6814b(new C1469f(this));
        return (this.this$0.p != null && (this.this$0.p instanceof C1467b) && ((C1467b) this.this$0.p).isModeActionBar()) ? false : true;
    }
}
