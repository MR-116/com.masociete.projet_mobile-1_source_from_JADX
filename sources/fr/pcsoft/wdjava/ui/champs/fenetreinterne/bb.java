package fr.pcsoft.wdjava.ui.champs.fenetreinterne;

import android.database.DataSetObserver;

class bb extends DataSetObserver {
    final C1189p this$0;

    private bb(C1189p c1189p) {
        this.this$0 = c1189p;
    }

    bb(C1189p c1189p, db dbVar) {
        this(c1189p);
    }

    public void onChanged() {
        this.this$0.m8498l();
    }

    public void onInvalidated() {
        this.this$0.m8498l();
    }
}
