package fr.pcsoft.wdjava.ui.champs;

class tc implements Runnable {
    final eb this$1;

    tc(eb ebVar) {
        this.this$1 = ebVar;
    }

    public void run() {
        this.this$1.this$0.appelPCode(12);
        this.this$1.this$0.appelPCode(16);
    }
}
