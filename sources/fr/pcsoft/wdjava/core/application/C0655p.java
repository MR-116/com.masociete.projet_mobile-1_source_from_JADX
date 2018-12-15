package fr.pcsoft.wdjava.core.application;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.provider.Settings.System;
import android.support.v4.app.ActivityCompat;
import fr.pcsoft.wdjava.core.utils.ic;
import fr.pcsoft.wdjava.ui.activite.C1056i;

/* renamed from: fr.pcsoft.wdjava.core.application.p */
final class C0655p extends ic {
    /* renamed from: z */
    private static final String[] f1640z = new String[]{C0655p.m2654z(C0655p.m2655z("d\u001b1r\u0000s\u001fh")), C0655p.m2654z(C0655p.m2655z("u\u00146k\u000e}\u001e|i\u0004f\u0017;j\u0012}\u0015<76F3\u0006\\>G?\u0006M(Z=\u0001")), C0655p.m2654z(C0655p.m2655z("r\b|i\u0002g\u00154mOc\u001e3w\u0005f\u0015;}OU9\u0006P.Z%\u0005K(@?\rJ$@.\u001bW&G")), C0655p.m2654z(C0655p.m2655z("u\u00146k\u000e}\u001e|j\u0004`\u000e;w\u0006gT3z\u0015}\u0015<7,U4\u0013^$K-\u0000P5Q%\u0001\\5@3\u001c^2")), C0655p.m2654z(C0655p.m2655z("r\b|i\u0002g\u00154mOc\u001e3w\u0005f\u0015;}OU9\u0006P.Z%\u0000\\0A?\u0001M>D?\u0000T(G)\u001bV/"))};
    final Activity val$finalActivity;
    final int val$nRequestCode;
    final String[] val$permissions;

    C0655p(String[] strArr, Activity activity, int i) {
        this.val$permissions = strArr;
        this.val$finalActivity = activity;
        this.val$nRequestCode = i;
    }

    static void access$000(C0655p c0655p, Exception exception) {
        c0655p.m1786a(exception);
    }

    /* renamed from: z */
    private static String m2654z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 20;
                    break;
                case 1:
                    i2 = 122;
                    break;
                case 2:
                    i2 = 82;
                    break;
                case 3:
                    i2 = 25;
                    break;
                default:
                    i2 = 97;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2655z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 97);
        }
        return toCharArray;
    }

    /* renamed from: c */
    protected void mo2434c() {
        if (this.val$permissions.length != 1 || !this.val$permissions[0].equals(f1640z[1])) {
            BroadcastReceiver c0649g = new C0649g(this);
            ActivityCompat.requestPermissions(this.val$finalActivity, this.val$permissions, this.val$nRequestCode);
            this.val$finalActivity.registerReceiver(c0649g, new IntentFilter(f1640z[4]));
        } else if (System.canWrite(this.val$finalActivity)) {
            m1790b(null);
        } else {
            this.val$finalActivity.registerReceiver(new C0640c(this), new IntentFilter(f1640z[2]));
            Intent intent = new Intent(f1640z[3]);
            intent.setData(Uri.parse(f1640z[0] + this.val$finalActivity.getPackageName()));
            this.val$finalActivity.startActivityForResult(intent, C1056i.f3046h);
        }
    }
}
