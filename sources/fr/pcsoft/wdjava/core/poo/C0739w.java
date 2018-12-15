package fr.pcsoft.wdjava.core.poo;

import fr.pcsoft.wdjava.core.C0550t;
import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.WDObjet;

/* renamed from: fr.pcsoft.wdjava.core.poo.w */
class C0739w extends C0550t {
    final C0560r this$0;
    final EWDPropriete val$propriete;

    C0739w(C0560r c0560r, EWDPropriete eWDPropriete) {
        this.this$0 = c0560r;
        this.val$propriete = eWDPropriete;
    }

    public WDObjet getRefProxy() {
        return this.this$0.getProp(this.val$propriete);
    }

    public void release() {
    }

    public void setValeur(double d) {
        this.this$0.setProp(this.val$propriete, d);
    }

    public void setValeur(int i) {
        this.this$0.setProp(this.val$propriete, i);
    }

    public void setValeur(long j) {
        this.this$0.setProp(this.val$propriete, j);
    }

    public void setValeur(WDObjet wDObjet) {
        this.this$0.setProp(this.val$propriete, wDObjet);
    }

    public void setValeur(String str) {
        this.this$0.setProp(this.val$propriete, str);
    }

    public void setValeur(boolean z) {
        this.this$0.setProp(this.val$propriete, z);
    }
}
