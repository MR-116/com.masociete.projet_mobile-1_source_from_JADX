package fr.pcsoft.wdjava.ui.gesture;

/* renamed from: fr.pcsoft.wdjava.ui.gesture.c */
class C1412c implements Runnable {
    final C1290a this$0;
    final int val$nRowIndex;

    C1412c(C1290a c1290a, int i) {
        this.this$0 = c1290a;
        this.val$nRowIndex = i;
    }

    public void run() {
        if (this.this$0.mo3529e(this.val$nRowIndex) != null) {
            if (this.this$0.f3815K != null) {
                this.this$0.f3815K.onPostSwipe(this.val$nRowIndex, this.this$0.f3838y);
            }
            this.this$0.m9013a(this.val$nRowIndex, true);
        }
    }
}
