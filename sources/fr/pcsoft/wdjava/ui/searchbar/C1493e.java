package fr.pcsoft.wdjava.ui.searchbar;

/* renamed from: fr.pcsoft.wdjava.ui.searchbar.e */
class C1493e implements Runnable {
    final C1491c this$0;

    C1493e(C1491c c1491c) {
        this.this$0 = c1491c;
    }

    public void run() {
        if (this.this$0.m10354d() && this.this$0.f4499e != null && this.this$0.f4499e.getVisibility() == 0) {
            this.this$0.f4495a = false;
            if (!this.this$0.f4499e.hasFocus()) {
                this.this$0.f4499e.requestFocus();
            }
            if (this.this$0.f4500f != null) {
                this.this$0.f4500f.onSearchViewShown();
            }
        }
    }
}
