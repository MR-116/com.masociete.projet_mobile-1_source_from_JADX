package fr.pcsoft.wdjava.ui.p081j;

import android.app.Activity;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.p042b.C0657a;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.core.utils.kb;
import fr.pcsoft.wdjava.ui.champs.fenetre.C0508h;
import fr.pcsoft.wdjava.ui.champs.fenetre.WDFenetre;

/* renamed from: fr.pcsoft.wdjava.ui.j.c */
public class C1437c {
    /* renamed from: a */
    public static final String f4263a = C1437c.m10099z(C1437c.m10100z("a^yc\u00173\u001d 5\u0017>\r;,\u001f4I}n\u001e?\u0005&/\u001f7\u0001="));
    /* renamed from: b */
    public static final String f4264b = C1437c.m10099z(C1437c.m10100z("a\\yc\u00173\u001d 5\u0017>\r;,\u001f4I{"));
    /* renamed from: c */
    public static final String f4265c = C1437c.m10099z(C1437c.m10100z("a^yc\u00173\u001d 5\u0017>\r;,\u001f4I}n\u001e?\u0005&'\u0017\"\u0002"));
    /* renamed from: z */
    private static final String[] f4266z;

    static {
        r0 = new String[4];
        r0[0] = C1437c.m10099z(C1437c.m10100z("sJ\u001a\u001a%\u0004,\u0004`U"));
        r0[1] = C1437c.m10099z(C1437c.m10100z("\u0018\u0006%,)\u001c\u0000.+\u0002\u000f'&\u0002\u0015$\u0000&-41\u001b"));
        r0[2] = C1437c.m10099z(C1437c.m10100z("\u0018\u0006%,)\u0014\b;()\u001e\u0006\b \u00029\u0006'\u0001\u0017\""));
        r0[3] = C1437c.m10099z(C1437c.m10100z("#\u001d0/\u0013"));
        f4266z = r0;
    }

    /* renamed from: a */
    public static final void m10095a(Activity activity, WDFenetre wDFenetre) {
        if (kb.m3965a(C0657a.HONEYCOMB)) {
            String toLowerCase = wDFenetre.getNomGabarit().toLowerCase();
            if (!C0808l.m4053k(toLowerCase) && !toLowerCase.startsWith(f4264b)) {
                int i = (kb.m3965a(C0657a.LOLLIPOP) && WDProjet.getInstance().isActiveThemeMaterialDesign()) ? 1 : 0;
                int identifier;
                if (wDFenetre.isThemeDark()) {
                    if (wDFenetre.isMaximisee()) {
                        identifier = !wDFenetre.isAvecActionBarExt() ? i != 0 ? C1435a.f4256d : activity.getResources().getIdentifier(f4266z[2], f4266z[3], activity.getPackageName()) : 0;
                        if (identifier == 0) {
                            i = i != 0 ? C1435a.f4257e : C1436b.f4262d;
                        }
                        i = identifier;
                    } else {
                        i = i != 0 ? C1435a.f4254b : C1436b.f4260b;
                    }
                } else if (wDFenetre.isMaximisee()) {
                    identifier = !wDFenetre.isAvecActionBarExt() ? i != 0 ? C1435a.f4258f : activity.getResources().getIdentifier(f4266z[1], f4266z[3], activity.getPackageName()) : 0;
                    if (identifier == 0) {
                        i = i != 0 ? C1435a.f4253a : C1436b.f4259a;
                    }
                    i = identifier;
                } else {
                    i = i != 0 ? C1435a.f4255c : C1436b.f4261c;
                }
                if (i > 0) {
                    activity.setTheme(i);
                    wDFenetre.setIdThemeActivity(i);
                }
            }
        }
    }

    /* renamed from: a */
    public static final boolean m10096a(int i) {
        return kb.m3965a(C0657a.LOLLIPOP) && (i == C1435a.f4253a || i == C1435a.f4255c || i == C1435a.f4258f || i == C1435a.f4257e || i == C1435a.f4254b || i == C1435a.f4256d);
    }

    /* renamed from: a */
    private static final boolean m10097a(C0508h c0508h) {
        String toLowerCase = c0508h.getNomGabarit().toLowerCase();
        return toLowerCase.startsWith(f4263a) || toLowerCase.startsWith(f4265c);
    }

    /* renamed from: a */
    public static final boolean m10098a(String str, C0508h c0508h) {
        return str.startsWith(f4266z[0]) ? C1437c.m10097a(c0508h) ? WDProjet.getInstance().isVersionCompatible(C0657a.HONEYCOMB.getNumero()) : true : false;
    }

    /* renamed from: z */
    private static String m10099z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 80;
                    break;
                case 1:
                    i2 = 105;
                    break;
                case 2:
                    i2 = 73;
                    break;
                case 3:
                    i2 = 67;
                    break;
                default:
                    i2 = 118;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m10100z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 118);
        }
        return toCharArray;
    }
}
