package fr.pcsoft.wdjava.contact;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import fr.pcsoft.wdjava.core.C0607n;

/* renamed from: fr.pcsoft.wdjava.contact.c */
class C0564c extends BroadcastReceiver {
    /* renamed from: z */
    private static final String f1293z = C0564c.m1849z(C0564c.m1850z("\u00135\u0005.Z\u0000=\u0005?P\u00107\u000f?J\u0005;\u000e$C\r,\u0003"));
    final C0604o this$0;

    C0564c(C0604o c0604o) {
        this.this$0 = c0604o;
    }

    /* renamed from: z */
    private static String m1849z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 68;
                    break;
                case 1:
                    i2 = C0607n.co;
                    break;
                case 2:
                    i2 = 90;
                    break;
                case 3:
                    i2 = 109;
                    break;
                default:
                    i2 = 21;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1850z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 21);
        }
        return toCharArray;
    }

    public void onReceive(Context context, Intent intent) {
        try {
            C0604o.access$000(this.this$0, intent.getIntExtra(f1293z, 0) == -1 ? Boolean.TRUE : Boolean.FALSE);
        } finally {
            this.this$0.val$activiteEnCours.unregisterReceiver(this);
            this.this$0.m1784a();
        }
    }
}
