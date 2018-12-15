package fr.pcsoft.wdjava.ui.champs.zr;

class mb implements Runnable {
    final C1297h this$1;

    mb(C1297h c1297h) {
        this.this$1 = c1297h;
    }

    public void run() {
        C1297h.access$1502(this.this$1, null);
        if (!this.this$1.this$0.isReleased()) {
            this.this$1.notifyDataSetChanged();
        }
    }
}
