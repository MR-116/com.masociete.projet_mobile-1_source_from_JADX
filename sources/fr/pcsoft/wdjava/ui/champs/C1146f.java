package fr.pcsoft.wdjava.ui.champs;

import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;

/* renamed from: fr.pcsoft.wdjava.ui.champs.f */
class C1146f implements OnCreateContextMenuListener {
    final gc this$0;

    C1146f(gc gcVar) {
        this.this$0 = gcVar;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        this.this$0.creerMenuContextuel(contextMenu);
    }
}
