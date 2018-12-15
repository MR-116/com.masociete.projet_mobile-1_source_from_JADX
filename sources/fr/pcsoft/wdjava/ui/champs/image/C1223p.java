package fr.pcsoft.wdjava.ui.champs.image;

/* renamed from: fr.pcsoft.wdjava.ui.champs.image.p */
class C1223p implements Runnable {
    final C1216i this$0;
    final float val$fOldEchelle;
    final float val$fPasIncrement;
    final float val$fX;
    final float val$fY;
    final long val$lDepartAnimation;
    final int val$nDureeAnimation;

    C1223p(C1216i c1216i, int i, long j, float f, float f2, float f3, float f4) {
        this.this$0 = c1216i;
        this.val$nDureeAnimation = i;
        this.val$lDepartAnimation = j;
        this.val$fOldEchelle = f;
        this.val$fPasIncrement = f2;
        this.val$fX = f3;
        this.val$fY = f4;
    }

    public void run() {
        long min = Math.min((long) this.val$nDureeAnimation, System.currentTimeMillis() - this.val$lDepartAnimation);
        this.this$0.m8565a(this.val$fOldEchelle + (this.val$fPasIncrement * ((float) min)), this.val$fX, this.val$fY);
        if (min < ((long) this.val$nDureeAnimation)) {
            this.this$0.m8580d().post(this);
        }
    }
}
