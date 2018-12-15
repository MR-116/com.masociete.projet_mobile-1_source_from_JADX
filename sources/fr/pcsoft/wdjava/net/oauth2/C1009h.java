package fr.pcsoft.wdjava.net.oauth2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import fr.pcsoft.wdjava.core.utils.ic;
import fr.pcsoft.wdjava.net.oauth2.WDOAuth2Manager.OAuth2Parameters;
import fr.pcsoft.wdjava.net.oauth2.WDOAuth2Manager.OAuth2Token;
import fr.pcsoft.wdjava.net.oauth2.WDOAuth2Manager.OAuthActivity;
import fr.pcsoft.wdjava.ui.activite.C1056i;

/* renamed from: fr.pcsoft.wdjava.net.oauth2.h */
final class C1009h extends ic<OAuth2Token> {
    /* renamed from: z */
    private static final String[] f2910z = new String[]{C1009h.m7321z(C1009h.m7322z("Q7t|oK?a|oY<")), C1009h.m7321z(C1009h.m7322z("r\u001d\u000e^Mg\u0000FZ\u0000c\u000bA@Jf\u0000IJ\u0000U,tgaZ0lai]!aoA;h\u001c"))};
    final OAuth2Parameters val$parameters;

    C1009h(OAuth2Parameters oAuth2Parameters) {
        this.val$parameters = oAuth2Parameters;
    }

    /* renamed from: z */
    private static String m7321z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 20;
                    break;
                case 1:
                    i2 = 111;
                    break;
                case 2:
                    i2 = 32;
                    break;
                case 3:
                    i2 = 46;
                    break;
                default:
                    i2 = 46;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7322z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 46);
        }
        return toCharArray;
    }

    /* renamed from: c */
    protected void mo2434c() {
        BroadcastReceiver c1002a = new C1002a(this);
        Context a = C1056i.m7562a();
        a.registerReceiver(c1002a, new IntentFilter(f2910z[1]));
        Intent intent = new Intent(a, OAuthActivity.class);
        intent.putExtra(f2910z[0], this.val$parameters);
        a.startActivityForResult(intent, C1056i.f3016B);
    }
}
