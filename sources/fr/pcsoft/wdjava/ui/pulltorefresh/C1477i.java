package fr.pcsoft.wdjava.ui.pulltorefresh;

/* renamed from: fr.pcsoft.wdjava.ui.pulltorefresh.i */
class C1477i implements Runnable {
    final C1157f this$0;
    final boolean val$bVisible;

    C1477i(C1157f c1157f, boolean z) {
        this.this$0 = c1157f;
        this.val$bVisible = z;
    }

    public void run() {
        if (this.this$0.f3523o != null) {
            this.this$0.mo3428a(this.val$bVisible);
        }
    }
}
