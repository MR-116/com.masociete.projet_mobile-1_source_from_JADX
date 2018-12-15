package fr.pcsoft.wdjava.ui.champs;

class cd implements Runnable {
    final eb this$1;

    cd(eb ebVar) {
        this.this$1 = ebVar;
    }

    public void run() {
        this.this$1.this$0.appelPCode(11);
        this.this$1.this$0.appelPCode(15);
    }
}
