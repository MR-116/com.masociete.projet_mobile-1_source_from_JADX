package fr.pcsoft.wdjava.ui.p073d.p075b.p076a;

/* renamed from: fr.pcsoft.wdjava.ui.d.b.a.h */
class C1329h implements Runnable {
    final C1325d this$0;

    C1329h(C1325d c1325d) {
        this.this$0 = c1325d;
    }

    public void run() {
        this.this$0.p = true;
        this.this$0.j.notifyDataSetChanged();
    }
}
