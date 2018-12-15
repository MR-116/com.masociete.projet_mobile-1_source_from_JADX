package fr.pcsoft.wdjava.ui.champs;

import fr.pcsoft.wdjava.core.C0727l;
import fr.pcsoft.wdjava.ui.C0489p;

/* renamed from: fr.pcsoft.wdjava.ui.champs.c */
class C1135c implements C0546j {
    final gc this$0;
    final int val$nHeight;
    final int val$nHeightDiff;
    final int val$nLocalX;
    final int val$nLocalY;
    final int val$nWidth;
    final int val$nWidthDiff;

    C1135c(gc gcVar, int i, int i2, int i3, int i4, int i5, int i6) {
        this.this$0 = gcVar;
        this.val$nHeightDiff = i;
        this.val$nLocalY = i2;
        this.val$nHeight = i3;
        this.val$nWidthDiff = i4;
        this.val$nLocalX = i5;
        this.val$nWidth = i6;
    }

    /* renamed from: a */
    public boolean mo2352a(nb nbVar) {
        gc gcVar = (gc) nbVar;
        if (gcVar != this.this$0 && this.this$0.checkCommonPlans(gcVar)) {
            if (!(this.val$nHeightDiff == 0 || gcVar._getLocalY() < this.val$nLocalY + this.val$nHeight || C0727l.m3092b(gcVar.Kb, 0))) {
                gcVar.setPositionChamp(gcVar._getX(), gcVar._getY() + this.val$nHeightDiff, 0);
            }
            if (!(this.val$nWidthDiff == 0 || gcVar._getLocalX() < this.val$nLocalX + this.val$nWidth || C0727l.m3092b(gcVar.Kb, 2))) {
                gcVar.setPositionChamp(gcVar._getX() + this.val$nWidthDiff, gcVar._getY(), 0);
            }
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo2353a(C0489p c0489p) {
        return true;
    }
}
