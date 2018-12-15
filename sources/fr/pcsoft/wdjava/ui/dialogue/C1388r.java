package fr.pcsoft.wdjava.ui.dialogue;

import android.content.Context;
import android.content.Intent;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.report.C0697b;
import fr.pcsoft.wdjava.core.erreur.report.C0706k;
import fr.pcsoft.wdjava.core.erreur.report.WDErrorReportActivity;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;

/* renamed from: fr.pcsoft.wdjava.ui.dialogue.r */
class C1388r extends ClickableSpan {
    /* renamed from: z */
    private static final String[] f4120z = new String[]{C1388r.m9907z(C1388r.m9908z("G&Mr6 W{t0&M")), C1388r.m9907z(C1388r.m9908z("!\u0006zJH\u0016TlZO\u0005\u001a|\u000fQ\u0005Tk@S\u0012\u0011z\\T\u000b\u001a(KHD\u0006i_M\u000b\u0006|\u000fYC\u0011z]X\u0011\u0006(NHD\u0012g]P\u0005\u0000(en+:")), C1388r.m9907z(C1388r.m9908z("0\u001d|CX")), C1388r.m9907z(C1388r.m9908z("!\u0019iFQ%\u0010l]X\u0017\u0007")), C1388r.m9907z(C1388r.m9908z("6\u0011x@O\u0010'k]X\u0001\u001a{GR\u0010")), C1388r.m9907z(C1388r.m9908z("6\u0011x@O\u00100i[\\0\f|")), C1388r.m9907z(C1388r.m9908z("6\u0011x@O\u00100i[\\.'Ga"))};
    final WDMsgBoxManagerImpl this$0;
    final Context val$context;
    final C0697b val$errorReport;

    C1388r(WDMsgBoxManagerImpl wDMsgBoxManagerImpl, C0697b c0697b, Context context) {
        this.this$0 = wDMsgBoxManagerImpl;
        this.val$errorReport = c0697b;
        this.val$context = context;
    }

    /* renamed from: z */
    private static String m9907z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 100;
                    break;
                case 1:
                    i2 = 116;
                    break;
                case 2:
                    i2 = 8;
                    break;
                case 3:
                    i2 = 47;
                    break;
                default:
                    i2 = 61;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m9908z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 61);
        }
        return toCharArray;
    }

    public void onClick(View view) {
        String str = "";
        try {
            str = this.val$errorReport.m2922b();
            WDProjet instance = WDProjet.getInstance();
            Intent intent = new Intent(this.val$context, WDErrorReportActivity.class);
            intent.putExtra(f4120z[6], str);
            intent.putExtra(f4120z[5], this.val$errorReport.toString());
            intent.putExtra(f4120z[4], this.val$errorReport.m2921a(C0706k.SCREENSHOT_PATH));
            intent.putExtra(f4120z[2], C0745b.m3224c(f4120z[0], instance.getNomApplication()));
            intent.putExtra(f4120z[3], instance.getAdresseEmail());
            intent.setFlags(276824064);
            this.val$context.startActivity(intent);
        } catch (Exception e) {
            C0691a.m2857a(f4120z[1], e);
        }
    }

    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
    }
}
