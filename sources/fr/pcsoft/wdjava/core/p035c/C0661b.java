package fr.pcsoft.wdjava.core.p035c;

import fr.pcsoft.wdjava.ui.C0489p;

/* renamed from: fr.pcsoft.wdjava.core.c.b */
class C0661b implements Runnable {
    final C0660a this$0;
    final C0489p val$obj;

    C0661b(C0660a c0660a, C0489p c0489p) {
        this.this$0 = c0660a;
        this.val$obj = c0489p;
    }

    public void run() {
        this.val$obj.prendreFocus();
    }
}
