package fr.pcsoft.wdjava.media;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: fr.pcsoft.wdjava.media.m */
class C0951m implements OnCompletionListener {
    final C0960v this$0;
    final FileInputStream[] val$source;

    C0951m(C0960v c0960v, FileInputStream[] fileInputStreamArr) {
        this.this$0 = c0960v;
        this.val$source = fileInputStreamArr;
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        this.this$0.m6929e();
        if (this.val$source[0] != null) {
            try {
                this.val$source[0].close();
            } catch (IOException e) {
            }
        }
    }
}
