package fr.pcsoft.wdjava.core.erreur.report;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import java.io.File;

/* renamed from: fr.pcsoft.wdjava.core.erreur.report.m */
class C0708m implements OnItemClickListener {
    /* renamed from: z */
    private static final String[] f1818z = new String[]{C0708m.m2945z(C0708m.m2946z("3'$\n\u001eu`")), C0708m.m2945z(C0708m.m2946z(";$!\u001f\u00143.k\u0004\u0015./+\u0019U;)1\u0004\u00144d\u0013$>\r"))};
    final WDErrorReportActivity this$0;
    final C0704i val$adapter;

    C0708m(WDErrorReportActivity wDErrorReportActivity, C0704i c0704i) {
        this.this$0 = wDErrorReportActivity;
        this.val$adapter = c0704i;
    }

    /* renamed from: z */
    private static String m2945z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 90;
                    break;
                case 1:
                    i2 = 74;
                    break;
                case 2:
                    i2 = 69;
                    break;
                case 3:
                    i2 = 109;
                    break;
                default:
                    i2 = 123;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2946z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 123);
        }
        return toCharArray;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        C0698g c0698g = (C0698g) this.val$adapter.getItem(i);
        if (c0698g instanceof C0709n) {
            Intent intent = new Intent(f1818z[1]);
            intent.setDataAndType(Uri.fromFile(new File(((C0709n) c0698g).f1819a)), f1818z[0]);
            this.this$0.startActivity(intent);
        }
    }
}
