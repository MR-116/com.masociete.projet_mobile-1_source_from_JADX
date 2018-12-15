package fr.pcsoft.wdjava.ui.champs.multimedia;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.media.ib;

/* renamed from: fr.pcsoft.wdjava.ui.champs.multimedia.h */
class C1239h implements OnErrorListener {
    /* renamed from: z */
    private static final String f3674z = C1239h.m8672z(C1239h.m8673z("A2\u0015LI!?\u0006LQ':\u0002PB=1\u000e]^+2\u0015A[7;\u0013W['3\u000e_"));
    final C1242k this$1;

    C1239h(C1242k c1242k) {
        this.this$1 = c1242k;
    }

    /* renamed from: z */
    private static String m8672z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 98;
                    break;
                case 1:
                    i2 = 119;
                    break;
                case 2:
                    i2 = 71;
                    break;
                case 3:
                    i2 = 30;
                    break;
                default:
                    i2 = 22;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m8673z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 22);
        }
        return toCharArray;
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        if (!this.this$1.m1793e()) {
            C1242k.access$600(this.this$1, new ib(C0745b.m3222b(f3674z, new String[0]), i));
            this.this$1.m1784a();
        }
        return true;
    }
}
