package fr.pcsoft.wdjava.ui.champs.image;

import android.graphics.PointF;

/* renamed from: fr.pcsoft.wdjava.ui.champs.image.n */
class C1222n implements Runnable {
    /* renamed from: a */
    float f3647a = 0.0f;
    /* renamed from: b */
    float f3648b = 0.0f;
    final C1216i this$0;
    final float val$fDeplacementX;
    final float val$fDeplacementY;
    final long val$lDepartAnimation;
    final int val$nDureeAnimation;

    C1222n(C1216i c1216i, int i, long j, float f, float f2) {
        this.this$0 = c1216i;
        this.val$nDureeAnimation = i;
        this.val$lDepartAnimation = j;
        this.val$fDeplacementX = f;
        this.val$fDeplacementY = f2;
    }

    public void run() {
        long min = Math.min((long) this.val$nDureeAnimation, System.currentTimeMillis() - this.val$lDepartAnimation);
        float access$000 = this.this$0.m8550a((float) min, 0.0f, this.val$fDeplacementX, (float) this.val$nDureeAnimation);
        float access$0002 = this.this$0.m8550a((float) min, 0.0f, this.val$fDeplacementY, (float) this.val$nDureeAnimation);
        this.this$0.m8564a(access$000 - this.f3648b, access$0002 - this.f3647a);
        this.f3648b = access$000;
        this.f3647a = access$0002;
        if (min < ((long) this.val$nDureeAnimation)) {
            this.this$0.m8580d().post(this);
            return;
        }
        PointF access$100 = this.this$0.m8552a();
        if (access$100.x != 0.0f || access$100.y != 0.0f) {
            this.this$0.m8564a(access$100.x, access$100.y);
        }
    }
}
