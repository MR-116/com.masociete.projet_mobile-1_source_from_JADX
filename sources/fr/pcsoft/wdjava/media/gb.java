package fr.pcsoft.wdjava.media;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.utils.ic;
import fr.pcsoft.wdjava.ui.dialogue.C1372f;

final class gb extends ic {
    /* renamed from: z */
    private static final String[] f2598z = new String[]{m6847z(m6848z("/\u001e[\u001c''\u0014\u0011\u0007&:\u0015Q\u001af-\u0011K\u000b/!\u0002F@\f\u000b6~;\u0004\u001a")), m6847z(m6848z("m2k \u0017\u00005`>\t\u001d/k+\u0004\u000b3w/\u001a\t5m")), m6847z(m6848z("m2k \u0017\u001a5s+\u000b\u00061m)\r\u001c")), m6847z(m6848z("/\u001e[\u001c''\u0014\u0011\u0007&:\u0015Q\u001af/\u0013K\u0007' ^i'\r\u0019")), m6847z(m6848z("m<v,\u0017\u0014(v \u000f\u0011>p \u0017\n9l>\u0007")), m6847z(m6848z("\u001d3~ \u0017\b?m#\t\u001a#")), m6847z(m6848z("m$z\"\r\r8~<\u000f\u000b=z \u001c\u0011<v,\u0017\u0014(v \u000f")), m6847z(m6848z("#\u0011M\u0005-:J\u0010A;+\u0011M\r q\u0001\u0002\u001e&/\u001dZT+!\u001d\u0011\t'!\u0017S\u000bf4\bV\u0000/`\u0013S\u0007- \u0004\u0011\u000f&*\u0002P\u0007,")), m6847z(m6848z("-\u001fR@/!\u001fX\u0002-`\nG\u0007&)^\\\u0002!+\u001eK@) \u0014M\u0001!*")), m6847z(m6848z("-\u001fR@/!\u001fX\u0002-`\nG\u0007&)^\\\u0002!+\u001eK@) \u0014M\u0001!*^l-\t\u0000"))};
    final Activity val$activiteEnCours;
    final String val$strFormats;

    gb(String str, Activity activity) {
        this.val$strFormats = str;
        this.val$activiteEnCours = activity;
    }

    static void access$000(gb gbVar, Object obj) {
        gbVar.m1787a(obj);
    }

    static void access$100(gb gbVar, Exception exception) {
        gbVar.m1786a(exception);
    }

    /* renamed from: z */
    private static String m6847z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 78;
                    break;
                case 1:
                    i2 = 112;
                    break;
                case 2:
                    i2 = 63;
                    break;
                case 3:
                    i2 = 110;
                    break;
                default:
                    i2 = 72;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m6848z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 72);
        }
        return toCharArray;
    }

    /* renamed from: c */
    protected void mo2434c() {
        Intent intent = new Intent(f2598z[9]);
        try {
            intent.addCategory(f2598z[0]);
            intent.setPackage(f2598z[8]);
            if (!this.val$strFormats.equals("")) {
                intent.putExtra(f2598z[5], this.val$strFormats.toString());
            }
            BroadcastReceiver c0948j = new C0948j(this);
            try {
                this.val$activiteEnCours.startActivityForResult(intent, 4099);
                this.val$activiteEnCours.registerReceiver(c0948j, new IntentFilter(f2598z[9]));
            } catch (ActivityNotFoundException e) {
                if (C1372f.m9828a().mo3743a(C0745b.m3224c(f2598z[6], new String[0]), null, new String[]{C0745b.m3224c(f2598z[2], new String[0]), C0745b.m3224c(f2598z[1], new String[0])}, new int[]{1, 0}, 0, 1, 1, "", 0, 0) == 1) {
                    this.val$activiteEnCours.startActivity(new Intent(f2598z[3], Uri.parse(f2598z[7])));
                }
                m1789b(new ib(C0745b.m3222b(f2598z[4], new String[0])));
            }
        } catch (ActivityNotFoundException e2) {
            throw e2;
        }
    }
}
