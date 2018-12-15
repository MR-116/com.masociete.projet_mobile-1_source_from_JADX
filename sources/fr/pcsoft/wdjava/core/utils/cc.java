package fr.pcsoft.wdjava.core.utils;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import java.io.File;

final class cc implements OnClickListener {
    /* renamed from: z */
    private static final String[] f2046z = new String[]{m3854z(m3855z("Agf\u0011]\u0007 ")), m3854z(m3855z("^cc\u0013W\u0007 ")), m3854z(m3855z("\\o\u0002\u0017\u0002")), m3854z(m3855z("Ic\u001fW\u0007 "))};
    final File val$fichier;
    final Intent val$intent;

    cc(Intent intent, File file) {
        this.val$intent = intent;
        this.val$fichier = file;
    }

    /* renamed from: z */
    private static String m3854z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 40;
                    break;
                case 1:
                    i2 = 10;
                    break;
                case 2:
                    i2 = 7;
                    break;
                case 3:
                    i2 = 118;
                    break;
                default:
                    i2 = 56;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m3855z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 56);
        }
        return toCharArray;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        String str = "";
        switch (i) {
            case 0:
                str = f2046z[0];
                break;
            case 1:
                str = f2046z[1];
                break;
            case 2:
                str = f2046z[3];
                break;
            case 3:
                str = f2046z[2];
                break;
        }
        this.val$intent.setDataAndType(Uri.fromFile(this.val$fichier), str);
    }
}
