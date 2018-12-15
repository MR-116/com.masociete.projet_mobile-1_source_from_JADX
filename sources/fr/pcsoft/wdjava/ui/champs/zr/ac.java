package fr.pcsoft.wdjava.ui.champs.zr;

import fr.pcsoft.wdjava.ui.C0489p;
import fr.pcsoft.wdjava.ui.champs.gc;
import fr.pcsoft.wdjava.ui.champs.image.C0520c;
import fr.pcsoft.wdjava.ui.champs.table.colonne.C1278a;
import fr.pcsoft.wdjava.ui.champs.zr.WDAbstractZRRenderer.AbstractRepetitionView;

class ac implements Runnable {
    final WDZoneRepetee this$0;
    final int val$nIndice;
    final int[] val$position;
    final AbstractRepetitionView val$repetitionView;

    ac(WDZoneRepetee wDZoneRepetee, AbstractRepetitionView abstractRepetitionView, int[] iArr, int i) {
        this.this$0 = wDZoneRepetee;
        this.val$repetitionView = abstractRepetitionView;
        this.val$position = iArr;
        this.val$nIndice = i;
    }

    public void run() {
        this.this$0.je = null;
        gc a = this.val$repetitionView.mo3534a(this.val$position[0], this.val$position[1]);
        if (a == null) {
            return;
        }
        if (!(a instanceof C0520c) || a.getTableColumn() == null) {
            this.this$0.Fd.m9251b(this.val$nIndice, this.val$repetitionView, a);
            return;
        }
        C1278a tableColumn = a.getTableColumn();
        if (tableColumn.isEditable()) {
            ((C0489p) tableColumn).appelPCode(18);
        }
    }
}
