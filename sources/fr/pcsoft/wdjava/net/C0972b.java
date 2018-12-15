package fr.pcsoft.wdjava.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import fr.pcsoft.wdjava.core.WDCallback;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.p042b.C0657a;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.core.utils.kb;

/* renamed from: fr.pcsoft.wdjava.net.b */
final class C0972b extends BroadcastReceiver {
    /* renamed from: z */
    private static final String[] f2720z = new String[]{C0972b.m7027z(C0972b.m7028z("^*\u0014\u0012Sn6D\u0014\u001cd=\u0001\u000f\u001ae=D\u001e\u001di<\n\u0019\u0006")), C0972b.m7027z(C0972b.m7028z("d6\u0010\u0000\u001cx80\u000e\u0003o")), C0972b.m7027z(C0972b.m7028z("d6\u0010\u0000\u001cx8-\u0019\u0015e"))};
    final WDCallback val$callback;

    C0972b(WDCallback wDCallback) {
        this.val$callback = wDCallback;
    }

    /* renamed from: z */
    private static String m7027z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 10;
                    break;
                case 1:
                    i2 = 83;
                    break;
                case 2:
                    i2 = 100;
                    break;
                case 3:
                    i2 = 119;
                    break;
                default:
                    i2 = 115;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7028z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 115);
        }
        return toCharArray;
    }

    public void onReceive(Context context, Intent intent) {
        NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra(f2720z[2]);
        boolean isConnected = networkInfo.isConnected();
        int type = isConnected ? kb.m3986p() <= C0657a.JELLY_BEAN_MR1.getNumero() ? networkInfo.getType() : intent.getIntExtra(f2720z[1], 0) : 0;
        if (isConnected) {
            switch (type) {
                case 0:
                case 2:
                case 3:
                case 4:
                case 5:
                    type = 2;
                    break;
                case 1:
                case 6:
                    type = 1;
                    break;
                case 9:
                    type = 4;
                    break;
                default:
                    C0691a.m2856a(f2720z[0]);
                    type = 3;
                    break;
            }
        }
        type = 3;
        this.val$callback.execute(new WDEntier4(type));
    }
}
