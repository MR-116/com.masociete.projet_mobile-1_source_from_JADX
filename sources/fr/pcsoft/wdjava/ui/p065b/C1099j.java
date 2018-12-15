package fr.pcsoft.wdjava.ui.p065b;

import android.graphics.drawable.Drawable;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.utils.fb;

/* renamed from: fr.pcsoft.wdjava.ui.b.j */
public abstract class C1099j extends fb<Drawable> {
    /* renamed from: z */
    private static final String f3328z = C1099j.m7964z(C1099j.m7965z("\u0010FE@.'\u0014SP)4ZC\u000570\u0014TM:'SRH>;@\u0017A>uX\u0010L64SR\u000b"));
    /* renamed from: c */
    protected C1104o f3329c = C1093d.m7932b();

    /* renamed from: z */
    private static String m7964z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 85;
                    break;
                case 1:
                    i2 = 52;
                    break;
                case 2:
                    i2 = 55;
                    break;
                case 3:
                    i2 = 37;
                    break;
                default:
                    i2 = 91;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7965z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 91);
        }
        return toCharArray;
    }

    /* renamed from: b */
    protected void mo3346b() {
        C1104o.access$002(this.f3329c, true);
        super.mo3346b();
    }

    /* renamed from: c */
    public abstract String mo3347c();

    /* renamed from: d */
    public final Drawable m7968d() {
        try {
            run();
            return (Drawable) m3088a();
        } catch (Exception e) {
            C0691a.m2857a(f3328z, e);
            return null;
        }
    }
}
