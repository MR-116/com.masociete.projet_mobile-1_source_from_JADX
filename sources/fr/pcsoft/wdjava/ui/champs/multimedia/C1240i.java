package fr.pcsoft.wdjava.ui.champs.multimedia;

import fr.pcsoft.wdjava.ui.champs.fenetre.C1139c;
import fr.pcsoft.wdjava.ui.champs.fenetre.WDFenetre;

/* renamed from: fr.pcsoft.wdjava.ui.champs.multimedia.i */
class C1240i implements C1139c {
    final WDChampMultimedia this$0;

    C1240i(WDChampMultimedia wDChampMultimedia) {
        this.this$0 = wDChampMultimedia;
    }

    /* renamed from: a */
    public void mo3415a(WDFenetre wDFenetre) {
        int i = -1;
        if (this.this$0.Lc.m8668a().isPlaying()) {
            i = this.this$0.Lc.m8668a().getCurrentPosition();
        }
        this.this$0.Bc.removeView(this.this$0.Lc);
        this.this$0.Bc.addView(this.this$0.Lc);
        if (i >= 0) {
            this.this$0.Lc.m8668a().seekTo(i);
            this.this$0.Lc.m8668a().start();
        }
    }
}
