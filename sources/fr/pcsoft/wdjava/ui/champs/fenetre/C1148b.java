package fr.pcsoft.wdjava.ui.champs.fenetre;

import fr.pcsoft.wdjava.ui.utils.C1521w;

/* renamed from: fr.pcsoft.wdjava.ui.champs.fenetre.b */
class C1148b implements Runnable {
    final WDFenetre this$0;
    final boolean val$bFenetreCree;
    final int val$nFlags;
    final int val$nHauteur;
    final int val$nLargeur;

    C1148b(WDFenetre wDFenetre, int i, int i2, int i3, boolean z) {
        this.this$0 = wDFenetre;
        this.val$nLargeur = i;
        this.val$nHauteur = i2;
        this.val$nFlags = i3;
        this.val$bFenetreCree = z;
    }

    public void run() {
        if (this.this$0.Td == null) {
            this.this$0.Td = new C1521w(this.val$nLargeur, this.val$nHauteur);
        }
        if (!this.this$0.isMaximisee()) {
            int _getHauteurMax;
            int i = this.val$nLargeur;
            int i2 = this.val$nHauteur;
            if ((this.val$nFlags & 2) == 0) {
                int _getLargeurMin = this.this$0._getLargeurMin();
                int _getHauteurMin = this.this$0._getHauteurMin();
                int _getLargeurMax = this.this$0._getLargeurMax();
                _getHauteurMax = this.this$0._getHauteurMax();
                if (i < _getLargeurMin) {
                    i = _getLargeurMin;
                }
                if (i > _getLargeurMax) {
                    i = _getLargeurMax;
                }
                if (i2 < _getHauteurMin) {
                    i2 = _getHauteurMin;
                }
                if (i2 > _getHauteurMax) {
                    i2 = i;
                    this.this$0.m1411a(i2, _getHauteurMax);
                }
            }
            _getHauteurMax = i2;
            i2 = i;
            this.this$0.m1411a(i2, _getHauteurMax);
        } else if (this.val$bFenetreCree || this.this$0.isChangementAgencementEnCours()) {
            this.this$0.m1420i();
            this.this$0.Ud.requestLayout();
        }
    }
}
