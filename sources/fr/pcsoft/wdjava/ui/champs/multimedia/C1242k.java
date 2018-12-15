package fr.pcsoft.wdjava.ui.champs.multimedia;

import android.net.Uri;
import fr.pcsoft.wdjava.core.utils.ic;

/* renamed from: fr.pcsoft.wdjava.ui.champs.multimedia.k */
class C1242k extends ic {
    final WDChampMultimedia this$0;
    final boolean val$bLectureAuto;
    final Uri val$uri;

    C1242k(WDChampMultimedia wDChampMultimedia, boolean z, Uri uri) {
        this.this$0 = wDChampMultimedia;
        this.val$bLectureAuto = z;
        this.val$uri = uri;
    }

    static void access$600(C1242k c1242k, Exception exception) {
        c1242k.m1786a(exception);
    }

    /* renamed from: c */
    protected void mo2434c() {
        if (!this.this$0.isReleased()) {
            this.this$0.Lc.m8668a().setOnErrorListener(new C1239h(this));
            this.this$0.Lc.m8668a().setOnPreparedListener(new C1241j(this));
            this.this$0.Lc.m8668a().setVideoURI(this.val$uri);
        }
    }
}
