package fr.pcsoft.wdjava.ui.champs.image;

/* renamed from: fr.pcsoft.wdjava.ui.champs.image.g */
class C1214g implements Runnable {
    final WDChampImage this$0;
    final boolean val$bEffacementImgMemoire;

    C1214g(WDChampImage wDChampImage, boolean z) {
        this.this$0 = wDChampImage;
        this.val$bEffacementImgMemoire = z;
    }

    public void run() {
        if (!this.this$0.isReleased() && this.this$0.l.estOuverte() && this.this$0.Nc != null && this.this$0.updateImageMemoire(this.val$bEffacementImgMemoire)) {
            this.this$0.repeindreChamp();
        }
    }
}
