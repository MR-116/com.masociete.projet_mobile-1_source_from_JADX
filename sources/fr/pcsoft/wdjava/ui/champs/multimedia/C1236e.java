package fr.pcsoft.wdjava.ui.champs.multimedia;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;

/* renamed from: fr.pcsoft.wdjava.ui.champs.multimedia.e */
class C1236e implements OnErrorListener {
    final WDChampMultimedia this$0;

    C1236e(WDChampMultimedia wDChampMultimedia) {
        this.this$0 = wDChampMultimedia;
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        if (!this.this$0.isReleased()) {
            C1235d.access$400(this.this$0.Lc);
        }
        return true;
    }
}
