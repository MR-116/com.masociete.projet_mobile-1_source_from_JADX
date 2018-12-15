package fr.pcsoft.wdjava.media;

import android.hardware.Camera.Parameters;
import android.hardware.Camera.PictureCallback;
import fr.pcsoft.wdjava.core.utils.ic;

class eb extends ic {
    final C0957s this$0;
    final Parameters val$parametres;
    final String val$strCheminFichier;

    eb(C0957s c0957s, String str, Parameters parameters) {
        this.this$0 = c0957s;
        this.val$strCheminFichier = str;
        this.val$parametres = parameters;
    }

    static void access$100(eb ebVar, Exception exception) {
        ebVar.m1786a(exception);
    }

    /* renamed from: c */
    public void mo2434c() {
        PictureCallback abVar = new ab(this);
        if (this.this$0.m6868b(this.val$parametres)) {
            this.this$0.f2659r.autoFocus(new C0944f(this, abVar));
        } else {
            this.this$0.f2659r.takePicture(null, null, abVar);
        }
    }
}
