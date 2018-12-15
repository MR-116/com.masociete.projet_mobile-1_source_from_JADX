package fr.pcsoft.wdjava.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;

/* renamed from: fr.pcsoft.wdjava.media.j */
class C0948j extends BroadcastReceiver {
    /* renamed from: z */
    private static final String[] f2608z = new String[]{C0948j.m6858z(C0948j.m6859z("4\u000bW\u001aO5\rE\u0001\\3\u0017P\u001bB*\tB")), C0948j.m6858z(C0948j.m6859z("D\fS\u0017_#\tQ\u0011O$\u0007R\u0011O%\tD\u0006U8\tX\u001aE+\r")), C0948j.m6858z(C0948j.m6859z("0\u0005I\u0017_#\rI\u0006U3\u0007C\u0006O&\u000bB\u001dF.\u001cO")), C0948j.m6858z(C0948j.m6859z("4\u000bW\u001aO5\rE\u0001\\3"))};
    final gb this$0;

    C0948j(gb gbVar) {
        this.this$0 = gbVar;
    }

    /* renamed from: z */
    private static String m6858z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 103;
                    break;
                case 1:
                    i2 = 72;
                    break;
                case 2:
                    i2 = 22;
                    break;
                case 3:
                    i2 = 84;
                    break;
                default:
                    i2 = 16;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m6859z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 16);
        }
        return toCharArray;
    }

    public void onReceive(Context context, Intent intent) {
        try {
            if (intent.getIntExtra(f2608z[2], 0) == -1) {
                gb.access$000(this.this$0, new WDCodeBarres(C0959u.m6918a(intent.getStringExtra(f2608z[0])), intent.getStringExtra(f2608z[3])));
            } else {
                gb.access$100(this.this$0, new ib(C0745b.m3222b(f2608z[1], new String[0])));
            }
            this.this$0.val$activiteEnCours.unregisterReceiver(this);
            this.this$0.m1784a();
        } catch (Throwable th) {
            this.this$0.val$activiteEnCours.unregisterReceiver(this);
            this.this$0.m1784a();
        }
    }
}
