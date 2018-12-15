package fr.pcsoft.wdjava.ui.pulltorefresh;

/* renamed from: fr.pcsoft.wdjava.ui.pulltorefresh.b */
class C1473b implements Runnable {
    final C1488u this$0;
    final boolean val$bVisible;

    C1473b(C1488u c1488u, boolean z) {
        this.this$0 = c1488u;
        this.val$bVisible = z;
    }

    public void run() {
        if (this.this$0.f4484b != null) {
            this.this$0.mo3428a(this.val$bVisible);
        }
    }
}
