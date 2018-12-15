package fr.pcsoft.wdjava.ui.pulltorefresh;

/* renamed from: fr.pcsoft.wdjava.ui.pulltorefresh.g */
class C1475g implements Runnable {
    final C1488u this$0;

    C1475g(C1488u c1488u) {
        this.this$0 = c1488u;
    }

    public void run() {
        if (this.this$0.isRefreshing() && this.this$0.f4484b != null && this.this$0.f4485c == 0) {
            this.this$0.setRefreshing(false);
        }
    }
}
