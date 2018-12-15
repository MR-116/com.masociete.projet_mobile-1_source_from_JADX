package fr.pcsoft.wdjava.ui.champs;

class qc implements Runnable {
    final gc this$0;

    qc(gc gcVar) {
        this.this$0 = gcVar;
    }

    public void run() {
        this.this$0.setAncrageActif(true);
        this.this$0.qc = null;
    }
}
