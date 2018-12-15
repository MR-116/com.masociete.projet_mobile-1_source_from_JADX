package fr.pcsoft.wdjava.core.utils;

/* renamed from: fr.pcsoft.wdjava.core.utils.i */
final class C0805i extends C0801e {
    final int val$nFinalJourFerie;

    C0805i(String str, int i) {
        this.val$nFinalJourFerie = i;
        super(str);
    }

    /* renamed from: a */
    public boolean mo2757a(zb zbVar) {
        rb.access$100(zbVar.m4199a());
        return rb.access$200() != null ? zbVar.m4204c() == rb.access$200()[this.val$nFinalJourFerie][0] && zbVar.m4207e() == rb.access$200()[this.val$nFinalJourFerie][1] : false;
    }
}
