package fr.pcsoft.wdjava.ui.champs.image;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.ui.gesture.WDGesture;

/* renamed from: fr.pcsoft.wdjava.ui.champs.image.d */
class C1211d implements Runnable {
    final WDChampImage this$0;
    final int val$nVitesseX;
    final int val$nVitesseY;

    C1211d(WDChampImage wDChampImage, int i, int i2) {
        this.this$0 = wDChampImage;
        this.val$nVitesseX = i;
        this.val$nVitesseY = i2;
    }

    public void run() {
        if (Math.abs(this.val$nVitesseX) > Math.abs(this.val$nVitesseY)) {
            WDGesture.Direction.setValeur(this.val$nVitesseX > 0 ? 1 : 2);
            WDGesture.Vitesse.setValeur(Math.abs(this.val$nVitesseX));
        } else {
            WDGesture.Direction.setValeur(this.val$nVitesseY > 0 ? 12 : 11);
            WDGesture.Vitesse.setValeur(Math.abs(this.val$nVitesseY));
        }
        this.this$0.appelPCode(C0607n.jt);
        if (this.this$0.qd != null) {
            this.this$0.appelPCodeAvecParametres(C0607n.jt, this.this$0.qd, new WDEntier4(this.val$nVitesseX), new WDEntier4(this.val$nVitesseY));
        }
    }
}
