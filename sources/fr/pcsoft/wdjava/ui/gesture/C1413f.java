package fr.pcsoft.wdjava.ui.gesture;

/* renamed from: fr.pcsoft.wdjava.ui.gesture.f */
class C1413f implements Runnable {
    final C1290a this$0;
    final long val$lTime;
    final int val$nRowIndex;

    C1413f(C1290a c1290a, int i, long j) {
        this.this$0 = c1290a;
        this.val$nRowIndex = i;
        this.val$lTime = j;
    }

    public void run() {
        if (this.this$0.mo3529e(this.val$nRowIndex) != null) {
            this.this$0.f3833s = false;
            WDGesture.Direction.setValeur(this.this$0.f3838y);
            boolean onSwipe = this.this$0.f3815K != null ? this.this$0.f3815K.onSwipe(this.val$nRowIndex, this.this$0.f3838y) : true;
            if ((this.this$0.f3817P & 1) != 0) {
                if (onSwipe) {
                    this.this$0.m9026h(this.val$nRowIndex);
                } else {
                    this.this$0.m9013a(this.val$nRowIndex, true);
                }
            } else if (this.this$0.f3833s) {
                this.this$0.m9013a(this.val$nRowIndex, false);
            } else if (this.this$0.m9006j(this.this$0.f3838y) || this.val$lTime < this.this$0.f3824f) {
                this.this$0.m9002d(this.val$nRowIndex);
            } else {
                this.this$0.f3831q = this.val$nRowIndex;
            }
        }
    }
}
