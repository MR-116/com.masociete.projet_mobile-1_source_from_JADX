package fr.pcsoft.wdjava.ui.champs.camera;

import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import fr.pcsoft.wdjava.media.C0957s;
import fr.pcsoft.wdjava.ui.champs.fenetre.WDFenetre;

/* renamed from: fr.pcsoft.wdjava.ui.champs.camera.b */
class C1137b implements Callback {
    /* renamed from: a */
    private boolean f3495a = false;
    final C1136a this$1;

    C1137b(C1136a c1136a) {
        this.this$1 = c1136a;
    }

    static boolean access$102(C1137b c1137b, boolean z) {
        c1137b.f3495a = z;
        return z;
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        if (!this.f3495a) {
            this.f3495a = true;
            WDFenetre wDFenetre = (WDFenetre) this.this$1.this$0.getFenetreMere();
            if (wDFenetre == null || !wDFenetre.isAncrageEnCours()) {
                this.this$1.this$0.demarrerFlux();
                this.f3495a = false;
                return;
            }
            ((WDFenetre) this.this$1.this$0.l).ajouterEcouteurAncrageFenetre(new C1140d(this));
        }
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C0957s.m6869c().m6900o();
    }
}
