package fr.pcsoft.wdjava.contact;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: fr.pcsoft.wdjava.contact.b */
class C0563b extends BroadcastReceiver {
    /* renamed from: z */
    private static final String[] f1292z = new String[]{C0563b.m1847z(C0563b.m1848z(";6g\b8(>g\u0019284m\u0019(-8l\u0002!%/a")), C0563b.m1847z(C0563b.m1848z("\u0005\u001fg(\u0018\u0002\u000fY(\u0003"))};
    final C0605p this$0;

    C0563b(C0605p c0605p) {
        this.this$0 = c0605p;
    }

    /* renamed from: z */
    private static String m1847z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 108;
                    break;
                case 1:
                    i2 = 123;
                    break;
                case 2:
                    i2 = 56;
                    break;
                case 3:
                    i2 = 75;
                    break;
                default:
                    i2 = 119;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1848z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 119);
        }
        return toCharArray;
    }

    public void onReceive(Context context, Intent intent) {
        try {
            if (intent.getIntExtra(f1292z[0], 0) == -1) {
                C0605p.access$100(this.this$0, Long.valueOf(intent.getLongExtra(f1292z[1], -1)));
            }
            this.this$0.val$activiteEnCours.unregisterReceiver(this);
            this.this$0.m1784a();
        } catch (Throwable th) {
            this.this$0.val$activiteEnCours.unregisterReceiver(this);
            this.this$0.m1784a();
        }
    }
}
