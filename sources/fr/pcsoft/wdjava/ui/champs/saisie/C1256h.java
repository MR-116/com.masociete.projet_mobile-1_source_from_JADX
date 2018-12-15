package fr.pcsoft.wdjava.ui.champs.saisie;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.p032m.C0938m;

/* renamed from: fr.pcsoft.wdjava.ui.champs.saisie.h */
class C1256h implements OnEditorActionListener {
    final C0517i this$0;
    final int val$nAction;

    C1256h(C0517i c0517i, int i) {
        this.this$0 = c0517i;
        this.val$nAction = i;
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        boolean z = true;
        if (keyEvent == null || keyEvent.getAction() == 1) {
            if (keyEvent != null) {
                C0938m.m6814b(new C1250a(this));
                return false;
            }
            WDObjet appelPCode = this.this$0.appelPCode(C0607n.wg);
            boolean z2 = (appelPCode == null || appelPCode.isVoid()) ? true : appelPCode.getBoolean();
            if ((this.val$nAction == 4 || this.val$nAction == 9 || this.val$nAction == 0) && z2) {
                return false;
            }
        }
        if (this.val$nAction == 0) {
            z = false;
        }
        return z;
    }
}
