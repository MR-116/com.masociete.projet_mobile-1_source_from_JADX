package fr.pcsoft.wdjava.core.p035c;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.context.WDAppelContexte;
import fr.pcsoft.wdjava.ui.C0489p;
import fr.pcsoft.wdjava.ui.utils.C1504c;
import java.io.PrintStream;
import java.io.PrintWriter;

/* renamed from: fr.pcsoft.wdjava.core.c.a */
public class C0660a extends Error {
    /* renamed from: z */
    private static final String[] f1644z = new String[]{C0660a.m2663z(C0660a.m2664z("o; \u0006el:-\u001d~h+")), C0660a.m2663z(C0660a.m2664z("o;5.]Y_RobV\u000b\u001a=YM\u000f\u000b&DV_\u001b:\u000b^\u0013\u0010;\u000b\\X\u001a7N[\n\u000b&DV"))};
    /* renamed from: a */
    private C0489p f1645a = null;

    public C0660a(C0489p c0489p) {
        this.f1645a = c0489p;
    }

    /* renamed from: z */
    private static String m2663z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 56;
                    break;
                case 1:
                    i2 = C0607n.bx;
                    break;
                case 2:
                    i2 = C0607n.bx;
                    break;
                case 3:
                    i2 = 79;
                    break;
                default:
                    i2 = 43;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2664z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 43);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public void m2665a() {
        this.f1645a = null;
    }

    /* renamed from: b */
    public void m2666b() {
        if (this.f1645a == null) {
            return;
        }
        if (WDAppelContexte.getContexte().m2714b(16, this.f1645a) || WDAppelContexte.getContexte().m2714b(16, this.f1645a)) {
            C1504c.m10454a(new C0661b(this, this.f1645a));
        } else {
            this.f1645a.prendreFocus();
        }
    }

    public String getMessage() {
        return f1644z[0];
    }

    public void printStackTrace() {
    }

    public void printStackTrace(PrintStream printStream) {
        printStream.println(f1644z[1]);
    }

    public void printStackTrace(PrintWriter printWriter) {
    }
}
