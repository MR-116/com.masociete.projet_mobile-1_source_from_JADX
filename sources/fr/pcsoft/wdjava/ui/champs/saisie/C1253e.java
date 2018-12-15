package fr.pcsoft.wdjava.ui.champs.saisie;

import fr.pcsoft.wdjava.ui.p082k.C1439b;

/* renamed from: fr.pcsoft.wdjava.ui.champs.saisie.e */
class C1253e implements Runnable {
    final C1254f this$1;
    final boolean val$bTransfererFocus;
    final String val$strValeurFormattee;

    C1253e(C1254f c1254f, String str, boolean z) {
        this.this$1 = c1254f;
        this.val$strValeurFormattee = str;
        this.val$bTransfererFocus = z;
    }

    public void run() {
        if (this.val$strValeurFormattee != null) {
            try {
                this.this$1.this$0.ad = true;
                if (this.this$1.this$0.Yc.getText().toString().equals(this.val$strValeurFormattee)) {
                    this.this$1.this$0.ad = false;
                    return;
                }
                this.this$1.this$0.Yc.setText(this.val$strValeurFormattee);
            } finally {
                this.this$1.this$0.ad = false;
            }
        }
        this.this$1.this$0.m1434k();
        if (!this.this$1.this$0.hd) {
            this.this$1.this$0.m1430g();
            if (this.val$bTransfererFocus) {
                C1439b.m10105d().m10107e();
            }
        }
    }
}
