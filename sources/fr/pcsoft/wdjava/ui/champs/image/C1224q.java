package fr.pcsoft.wdjava.ui.champs.image;

/* renamed from: fr.pcsoft.wdjava.ui.champs.image.q */
class C1224q implements Runnable {
    final WDChampImage this$0;

    C1224q(WDChampImage wDChampImage) {
        this.this$0 = wDChampImage;
    }

    public void run() {
        if (!this.this$0.isReleased() && (this.this$0.Ec & 64) == 64) {
            this.this$0.m1461m();
        }
    }
}
