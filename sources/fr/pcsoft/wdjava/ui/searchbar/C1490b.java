package fr.pcsoft.wdjava.ui.searchbar;

import android.content.Context;
import android.widget.SearchView;

/* renamed from: fr.pcsoft.wdjava.ui.searchbar.b */
class C1490b extends SearchView {
    final C1491c this$0;

    C1490b(C1491c c1491c, Context context) {
        this.this$0 = c1491c;
        super(context);
    }

    public void setQuery(CharSequence charSequence, boolean z) {
        boolean access$000 = this.this$0.f4501g;
        this.this$0.f4501g = true;
        try {
            super.setQuery(charSequence, z);
        } finally {
            this.this$0.f4501g = access$000;
        }
    }
}
