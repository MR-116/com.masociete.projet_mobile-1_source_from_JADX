package fr.pcsoft.wdjava.ui.champs.fenetreinterne;

class lb implements C0525y {
    final gb this$0;
    final String val$strNomFenetre;

    lb(gb gbVar, String str) {
        this.this$0 = gbVar;
        this.val$strNomFenetre = str;
    }

    public void onFinInit(fb fbVar) {
    }

    public void onLoad(fb fbVar) {
        fbVar.removeListener(this);
        if (this.this$0.Ec == null) {
            this.this$0.setFenetreInterne(this.val$strNomFenetre, null);
        }
    }

    public void onRelease(fb fbVar) {
    }
}
