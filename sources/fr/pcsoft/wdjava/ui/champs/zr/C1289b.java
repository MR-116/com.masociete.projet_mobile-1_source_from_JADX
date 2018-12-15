package fr.pcsoft.wdjava.ui.champs.zr;

/* renamed from: fr.pcsoft.wdjava.ui.champs.zr.b */
class C1289b implements Runnable {
    final WDZoneRepetee this$0;
    final boolean val$bVisible;

    C1289b(WDZoneRepetee wDZoneRepetee, boolean z) {
        this.this$0 = wDZoneRepetee;
        this.val$bVisible = z;
    }

    public void run() {
        this.this$0.setLoadingViewVisible(this.val$bVisible);
    }
}
