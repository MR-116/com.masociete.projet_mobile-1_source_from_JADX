package fr.pcsoft.wdjava.contact;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import fr.pcsoft.wdjava.core.utils.ic;
import fr.pcsoft.wdjava.ui.activite.C1056i;

/* renamed from: fr.pcsoft.wdjava.contact.o */
final class C0604o extends ic {
    /* renamed from: z */
    private static final String[] f1412z = new String[]{C0604o.m2225z(C0604o.m2226z("Di\u0014R2Qt\\VU[L5PtSFcXnk\u001elDf\u0018vDym\u001fvZyv")), C0604o.m2225z(C0604o.m2226z("Cu^P>K\u0014K?V~TVCxNK>L5f\u0018v"))};
    final Activity val$activiteEnCours;
    final Uri val$contactUri;

    C0604o(Uri uri, Activity activity) {
        this.val$contactUri = uri;
        this.val$activiteEnCours = activity;
    }

    static void access$000(C0604o c0604o, Object obj) {
        c0604o.m1787a(obj);
    }

    /* renamed from: z */
    private static String m2225z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 34;
                    break;
                case 1:
                    i2 = 27;
                    break;
                case 2:
                    i2 = 58;
                    break;
                case 3:
                    i2 = 34;
                    break;
                default:
                    i2 = 81;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2226z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 81);
        }
        return toCharArray;
    }

    /* renamed from: c */
    protected void mo2434c() {
        Intent intent = new Intent(f1412z[1], this.val$contactUri);
        BroadcastReceiver c0564c = new C0564c(this);
        this.val$activiteEnCours.startActivityForResult(intent, C1056i.f3047i);
        this.val$activiteEnCours.registerReceiver(c0564c, new IntentFilter(f1412z[0]));
    }
}
