package fr.pcsoft.wdjava.p063r;

import android.widget.Toast;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.application.WDAppManager;
import fr.pcsoft.wdjava.core.utils.C0808l;

/* renamed from: fr.pcsoft.wdjava.r.b */
final class C1026b implements Runnable {
    /* renamed from: z */
    private static final String f2920z = C1026b.m7396z(C1026b.m7397z("\u0015u"));
    final int val$nCadrageHorizontal;
    final int val$nCadrageVertical;
    final int val$nDureeAffichage;
    final String val$strMessage;

    C1026b(String str, int i, int i2, int i3) {
        this.val$strMessage = str;
        this.val$nDureeAffichage = i;
        this.val$nCadrageVertical = i2;
        this.val$nCadrageHorizontal = i3;
    }

    /* renamed from: z */
    private static String m7396z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 24;
                    break;
                case 1:
                    i2 = C0607n.bx;
                    break;
                case 2:
                    i2 = 11;
                    break;
                case 3:
                    i2 = 49;
                    break;
                default:
                    i2 = C0607n.Hn;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7397z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ C0607n.Hn);
        }
        return toCharArray;
    }

    public void run() {
        int i = 1;
        int i2 = 0;
        Toast makeText = Toast.makeText(WDAppManager.m2544C(), C0808l.m4018a(this.val$strMessage, f2920z, "\n"), this.val$nDureeAffichage == 1 ? 1 : 0);
        int xOffset = makeText.getXOffset();
        int yOffset = makeText.getYOffset();
        int i3 = this.val$nCadrageVertical;
        i3 = this.val$nCadrageHorizontal;
        switch (this.val$nCadrageVertical) {
            case 0:
                i3 = 48;
                break;
            case 2:
                i3 = 80;
                break;
            default:
                i3 = 16;
                yOffset = 0;
                break;
        }
        switch (this.val$nCadrageHorizontal) {
            case 0:
                i = 3;
                i2 = xOffset;
                break;
            case 2:
                i = 5;
                i2 = xOffset;
                break;
        }
        makeText.setGravity((i3 & 112) | (i & 7), i2, yOffset);
        makeText.show();
    }
}
