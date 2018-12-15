package fr.pcsoft.wdjava.net.oauth2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import fr.pcsoft.wdjava.net.oauth2.WDOAuth2Manager.OAuth2Token;

/* renamed from: fr.pcsoft.wdjava.net.oauth2.a */
class C1002a extends BroadcastReceiver {
    /* renamed from: z */
    private static final String[] f2905z = new String[]{C1002a.m7308z(C1002a.m7309z("}>EMgb8ECj")), C1002a.m7308z(C1002a.m7309z("oj5TC|b5EIlh?ESyd>^Zqs3")), C1002a.m7308z(C1002a.m7309z("}>EMgs%\\Iv"))};
    final C1009h this$0;

    C1002a(C1009h c1009h) {
        this.this$0 = c1009h;
    }

    /* renamed from: z */
    private static String m7308z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 56;
                    break;
                case 1:
                    i2 = 39;
                    break;
                case 2:
                    i2 = 106;
                    break;
                case 3:
                    i2 = 23;
                    break;
                default:
                    i2 = 12;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7309z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 12);
        }
        return toCharArray;
    }

    public void onReceive(Context context, Intent intent) {
        try {
            if (intent.getIntExtra(f2905z[1], 0) == -1) {
                this.this$0.m1790b((Object) (OAuth2Token) intent.getParcelableExtra(f2905z[2]));
            } else {
                this.this$0.m1789b(new C1010i(intent.getStringExtra(f2905z[0])));
            }
            context.unregisterReceiver(this);
        } catch (Throwable th) {
            context.unregisterReceiver(this);
        }
    }
}
