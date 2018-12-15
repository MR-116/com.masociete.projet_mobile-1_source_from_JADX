package fr.pcsoft.wdjava.ui.champs.zr;

import android.view.View;
import fr.pcsoft.wdjava.ui.champs.ib;

class bc implements Runnable {
    final WDAbstractZRRenderer this$0;

    bc(WDAbstractZRRenderer wDAbstractZRRenderer) {
        this.this$0 = wDAbstractZRRenderer;
    }

    public void run() {
        ib ibVar = (ib) this.this$0.f3784a.getLayoutParams();
        View listView = this.this$0.f3785b.getListView();
        int paddingLeft = listView.getPaddingLeft();
        ibVar.x = listView.getLeft() + paddingLeft;
        ibVar.y = listView.getTop() + listView.getPaddingTop();
        ibVar.width = (listView.getWidth() - paddingLeft) - listView.getPaddingRight();
        ibVar.height = -2;
        this.this$0.f3784a.requestLayout();
        this.this$0.f3784a.m9208a(true);
    }
}
