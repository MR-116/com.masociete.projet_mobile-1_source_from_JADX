package fr.pcsoft.wdjava.contact;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.utils.ic;
import fr.pcsoft.wdjava.ui.activite.C1056i;

/* renamed from: fr.pcsoft.wdjava.contact.p */
final class C0605p extends ic {
    /* renamed from: z */
    private static final String[] f1413z = new String[]{C0605p.m2228z(C0605p.m2229z("@\u0006l9\u0010H\f&\"\u0011U\rf?Q@\u000b|\"\u0010OFA\u0005,d:\\")), C0605p.m2228z(C0605p.m2229z("G\u0001f\"\fI)k?\u0016W\u0001|20O;i=\u001ab\u0007e;\u0013D\u001cm/")), C0605p.m2228z(C0605p.m2229z("G\u001a&;\u001cR\u0007n?QV\fi%\u001bS\u0007a/Q`+\\\u00020o7[\u000e3d+\\\u0014<n&\\\n<u")), C0605p.m2228z(C0605p.m2229z("@\u0006l9\u0010H\f&\"\u0011U\rf?Q@\u000b|\"\u0010OFX\u0002<j"))};
    final Activity val$activiteEnCours;
    final boolean val$bCreation;
    final Uri val$providerUri;

    C0605p(boolean z, Uri uri, Activity activity) {
        this.val$bCreation = z;
        this.val$providerUri = uri;
        this.val$activiteEnCours = activity;
    }

    static void access$100(C0605p c0605p, Object obj) {
        c0605p.m1787a(obj);
    }

    /* renamed from: z */
    private static String m2228z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 33;
                    break;
                case 1:
                    i2 = 104;
                    break;
                case 2:
                    i2 = 8;
                    break;
                case 3:
                    i2 = 75;
                    break;
                default:
                    i2 = C0607n.bx;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2229z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ C0607n.bx);
        }
        return toCharArray;
    }

    /* renamed from: c */
    protected void mo2434c() {
        Intent intent = new Intent(this.val$bCreation ? f1413z[0] : f1413z[3], this.val$providerUri);
        intent.putExtra(f1413z[1], true);
        BroadcastReceiver c0563b = new C0563b(this);
        this.val$activiteEnCours.startActivityForResult(intent, C1056i.f3027M);
        this.val$activiteEnCours.registerReceiver(c0563b, new IntentFilter(f1413z[2]));
    }
}
