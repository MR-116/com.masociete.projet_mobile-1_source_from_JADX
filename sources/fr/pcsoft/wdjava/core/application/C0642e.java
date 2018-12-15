package fr.pcsoft.wdjava.core.application;

import android.widget.TextView;

/* renamed from: fr.pcsoft.wdjava.core.application.e */
class C0642e implements Runnable {
    final WDAbstractLanceur this$0;
    final String val$strNouveauTitre;

    C0642e(WDAbstractLanceur wDAbstractLanceur, String str) {
        this.this$0 = wDAbstractLanceur;
        this.val$strNouveauTitre = str;
    }

    public void run() {
        TextView textView = (TextView) this.this$0.findViewById(3);
        if (textView != null) {
            textView.setText(this.val$strNouveauTitre);
            WDProjet.getInstance().razTitreSuivant();
        }
    }
}
