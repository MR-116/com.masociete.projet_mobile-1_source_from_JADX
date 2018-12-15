package fr.pcsoft.wdjava.ui.champs.multimedia;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;

/* renamed from: fr.pcsoft.wdjava.ui.champs.multimedia.j */
class C1241j implements OnPreparedListener {
    final C1242k this$1;

    C1241j(C1242k c1242k) {
        this.this$1 = c1242k;
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        this.this$1.this$0.m1517a(mediaPlayer, this.this$1.val$bLectureAuto);
        this.this$1.m1784a();
    }
}
