package fr.pcsoft.wdjava.ui.actionbar;

/* renamed from: fr.pcsoft.wdjava.ui.actionbar.p */
class C1049p implements Runnable {
    final WDActionBar this$0;
    final boolean val$bVisible;
    final String val$strIndication;

    C1049p(WDActionBar wDActionBar, boolean z, String str) {
        this.this$0 = wDActionBar;
        this.val$bVisible = z;
        this.val$strIndication = str;
    }

    public void run() {
        this.this$0.setSearchBarVisible(this.val$bVisible, this.val$strIndication);
    }
}
