package fr.pcsoft.wdjava.ui.dialogue;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.widget.CheckBox;
import fr.pcsoft.wdjava.core.application.WDAppManager;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.erreur.report.C0697b;
import fr.pcsoft.wdjava.core.erreur.report.C0706k;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.utils.C0808l;
import java.util.List;

/* renamed from: fr.pcsoft.wdjava.ui.dialogue.t */
class C1390t implements OnClickListener {
    /* renamed from: z */
    private static final String[] f4121z = new String[]{C1390t.m9909z(C1390t.m9910z(":IM<C2C\u0007'B/BG:\u0002>_]<Mubd\u000fe\u0017")), C1390t.m9909z(C1390t.m9910z("\u0004x\n\u0019a\u0004fy\u001es\u001fb\u0011i\u0016f`\u0002s\u0004")), C1390t.m9909z(C1390t.m9910z(":IM<C2C\u0007'B/BG:\u0002>_]<Musl\u0016x")), C1390t.m9909z(C1390t.m9910z("xul\u001ec\tsv\u001ae\u000ful")), C1390t.m9909z(C1390t.m9910z("xul\u001ec\tsv\u000bb\rh`\u0011i\u0016f`\u0002")), C1390t.m9909z(C1390t.m9910z(":IM<C2C\u0007'B/BG:\u0002>_]<Mut|\ff\u001ed}")), C1390t.m9909z(C1390t.m9910z(":IM<C2C\u0007'B/BG:\u0002:D]'C5\tz\u000bb\u001f")), C1390t.m9909z(C1390t.m9910z("\u0004x\n\u0019a\u0004tl\u0000h\u0004ul\u001ec\tsv\u0011")), C1390t.m9909z(C1390t.m9910z(":IM<C2C\u0007'B/BG:\u0002>_]<Mut}\u001ci\u001aj")), C1390t.m9909z(C1390t.m9910z("6BZ=M<B\u0006<J8\u0015\u0011|\u001e"))};
    final WDMsgBoxManagerImpl this$0;
    final CheckBox val$cbSendReport;
    final AlertDialog val$dlgbox;
    final C0697b val$errorReport;
    final String val$strAppDevEmail;
    final String val$strAppName;

    C1390t(WDMsgBoxManagerImpl wDMsgBoxManagerImpl, CheckBox checkBox, C0697b c0697b, String str, String str2, AlertDialog alertDialog) {
        this.this$0 = wDMsgBoxManagerImpl;
        this.val$cbSendReport = checkBox;
        this.val$errorReport = c0697b;
        this.val$strAppDevEmail = str;
        this.val$strAppName = str2;
        this.val$dlgbox = alertDialog;
    }

    /* renamed from: z */
    private static String m9909z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 91;
                    break;
                case 1:
                    i2 = 39;
                    break;
                case 2:
                    i2 = 41;
                    break;
                case 3:
                    i2 = 78;
                    break;
                default:
                    i2 = 44;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m9910z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 44);
        }
        return toCharArray;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (this.val$cbSendReport.isChecked()) {
            Intent intent = new Intent();
            intent.setAction(f4121z[6]);
            intent.setFlags(268435456);
            String a = this.val$errorReport.m2921a(C0706k.SCREENSHOT_PATH);
            if (!C0808l.m4053k(a)) {
                intent.putExtra(f4121z[8], Uri.parse(a));
            }
            intent.putExtra(f4121z[2], this.val$errorReport.toString());
            CharSequence c = C0745b.m3224c(f4121z[4], new String[0]);
            intent.setType(f4121z[9]);
            if (!C0808l.m4053k(this.val$strAppDevEmail)) {
                intent.putExtra(f4121z[0], new String[]{this.val$strAppDevEmail});
            }
            intent.putExtra(f4121z[5], C0745b.m3224c(f4121z[3], this.val$strAppName));
            List queryIntentActivities = WDAppManager.m2551J().queryIntentActivities(intent, 65536);
            if (!(queryIntentActivities == null || queryIntentActivities.isEmpty())) {
                this.val$dlgbox.getContext().startActivity(Intent.createChooser(intent, c));
            }
        }
        Editor edit = WDAppManager.m2546E().edit();
        edit.putBoolean(f4121z[7], this.val$cbSendReport.isChecked());
        edit.putString(f4121z[1], this.val$strAppDevEmail);
        edit.commit();
        dialogInterface.dismiss();
        WDProjet.getInstance().terminerApplication();
    }
}
