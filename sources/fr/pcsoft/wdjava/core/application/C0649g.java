package fr.pcsoft.wdjava.core.application;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import fr.pcsoft.wdjava.core.debug.C0691a;

/* renamed from: fr.pcsoft.wdjava.core.application.g */
class C0649g extends BroadcastReceiver {
    /* renamed from: z */
    private static final String[] f1615z = new String[]{C0649g.m2642z(C0649g.m2643z("HL\nQvLP\u0000F`K^\u0016LwZ")), C0649g.m2642z(C0649g.m2643z("ZY\u0001Qr@Q\u0010Q~VR\u0006J|Q^\u0012QrQU\nQvLT\u0019W")), C0649g.m2642z(C0649g.m2643z("ZY\u0001Qr@Q\u0010Q~VR\u0006J|Q^\u0019J`K"))};
    final C0655p this$0;

    C0649g(C0655p c0655p) {
        this.this$0 = c0655p;
    }

    /* renamed from: z */
    private static String m2642z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 31;
                    break;
                case 1:
                    i2 = 1;
                    break;
                case 2:
                    i2 = 85;
                    break;
                case 3:
                    i2 = 3;
                    break;
                default:
                    i2 = 51;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2643z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 51);
        }
        return toCharArray;
    }

    public void onReceive(Context context, Intent intent) {
        boolean z = true;
        int i = 0;
        try {
            if (intent.getIntExtra(f1615z[0], 0) == this.this$0.val$nRequestCode) {
                String[] stringArrayExtra = intent.getStringArrayExtra(f1615z[2]);
                int[] intArrayExtra = intent.getIntArrayExtra(f1615z[1]);
                if (intArrayExtra == null || intArrayExtra == null || stringArrayExtra.length != intArrayExtra.length) {
                    z = false;
                }
                C0691a.m2859a(z);
                while (i < intArrayExtra.length) {
                    if (intArrayExtra[i] != 0) {
                        C0655p.access$000(this.this$0, new C0653m(stringArrayExtra[i]));
                        return;
                    }
                    i++;
                }
                this.this$0.val$finalActivity.unregisterReceiver(this);
                this.this$0.m1784a();
            }
        } finally {
            this.this$0.val$finalActivity.unregisterReceiver(this);
            this.this$0.m1784a();
        }
    }
}
