package fr.pcsoft.wdjava.core.application;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.provider.Settings.System;

/* renamed from: fr.pcsoft.wdjava.core.application.c */
class C0640c extends BroadcastReceiver {
    /* renamed from: z */
    private static final String f1606z = C0640c.m2613z(C0640c.m2614z("^\u0019_5;V\u0013\u001571M\u001aR4'V\u0018Ui\u0003m>o\u0002\u000bl2o\u0013\u001dq0h"));
    final C0655p this$0;

    C0640c(C0655p c0655p) {
        this.this$0 = c0655p;
    }

    /* renamed from: z */
    private static String m2613z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 63;
                    break;
                case 1:
                    i2 = 119;
                    break;
                case 2:
                    i2 = 59;
                    break;
                case 3:
                    i2 = 71;
                    break;
                default:
                    i2 = 84;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2614z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 84);
        }
        return toCharArray;
    }

    public void onReceive(Context context, Intent intent) {
        if (System.canWrite(this.this$0.val$finalActivity)) {
            this.this$0.m1790b(null);
        } else {
            this.this$0.m1789b(new C0653m(f1606z));
        }
    }
}
