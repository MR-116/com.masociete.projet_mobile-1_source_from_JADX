package fr.pcsoft.wdjava.p037c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.WDCallback;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.WDException;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.utils.C0808l;

/* renamed from: fr.pcsoft.wdjava.c.e */
final class C0556e extends BroadcastReceiver {
    /* renamed from: z */
    private static final String f1258z = C0556e.m1780z(C0556e.m1781z("v/\ncZA}\u001cs]R3\f&CR}\u000bïCV>\fo@]}\u001c!Z]8XvG\\)\u0017&@F}\u001c!Z]8XpFW´\u0017("));
    final WDCallback val$callback;
    final int val$nType;

    C0556e(int i, WDCallback wDCallback) {
        this.val$nType = i;
        this.val$callback = wDCallback;
    }

    /* renamed from: z */
    private static String m1780z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 51;
                    break;
                case 1:
                    i2 = 93;
                    break;
                case 2:
                    i2 = C0607n.co;
                    break;
                case 3:
                    i2 = 6;
                    break;
                default:
                    i2 = 47;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1781z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 47);
        }
        return toCharArray;
    }

    public void onReceive(Context context, Intent intent) {
        try {
            if (!C0808l.m4053k(C0554c.m1768a(intent, this.val$nType))) {
                this.val$callback.execute(new WDChaine(r0));
            }
            context.unregisterReceiver(this);
        } catch (WDException e) {
            throw e;
        } catch (Exception e2) {
            C0691a.m2857a(f1258z, e2);
            context.unregisterReceiver(this);
        } catch (WDException e3) {
            try {
                throw e3;
            } catch (Throwable th) {
                context.unregisterReceiver(this);
            }
        }
    }
}
