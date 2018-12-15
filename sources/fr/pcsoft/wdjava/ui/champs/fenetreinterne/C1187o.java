package fr.pcsoft.wdjava.ui.champs.fenetreinterne;

/* renamed from: fr.pcsoft.wdjava.ui.champs.fenetreinterne.o */
class C1187o implements Runnable {
    final WDChampFenetreInterneExt this$0;

    C1187o(WDChampFenetreInterneExt wDChampFenetreInterneExt) {
        this.this$0 = wDChampFenetreInterneExt;
    }

    public void run() {
        pb b = this.this$0.Gc.mo3441b();
        if (b != null && b.m8503a() != this.this$0.Ec) {
            this.this$0.onPageAffichee(b, true);
        }
    }
}
