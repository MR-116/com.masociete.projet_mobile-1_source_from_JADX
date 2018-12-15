package fr.pcsoft.wdjava.ui.champs.multimedia;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;

/* renamed from: fr.pcsoft.wdjava.ui.champs.multimedia.g */
class C1238g implements OnPreparedListener {
    final WDChampMultimedia this$0;
    final boolean val$bLectureAuto;

    C1238g(WDChampMultimedia wDChampMultimedia, boolean z) {
        this.this$0 = wDChampMultimedia;
        this.val$bLectureAuto = z;
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        if (!this.this$0.isReleased()) {
            C1235d.access$400(this.this$0.Lc);
            this.this$0.m1517a(mediaPlayer, this.val$bLectureAuto);
        }
    }
}
