package fr.pcsoft.wdjava.core.erreur.report;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.utils.C0808l;
import java.util.EnumMap;

/* renamed from: fr.pcsoft.wdjava.core.erreur.report.a */
public abstract class C0696a extends EnumMap<C0706k, String> {
    /* renamed from: z */
    private static final String[] f1795z = new String[]{C0696a.m2918z(C0696a.m2919z("Do|\u0012\u0015+qj\r\u001e$ze\r\u001e")), C0696a.m2918z(C0696a.m2919z("Dk~\u0010\u00152|s\u0003\u0013$k\u001d\u00036be\u0016\u0015")), C0696a.m2918z(C0696a.m2919z("Dk~\u0010\u00152|s\u0016\u0002&gx\u0007\u001d\"`x")), C0696a.m2918z(C0696a.m2919z("m$")), C0696a.m2918z(C0696a.m2919z("j$")), C0696a.m2918z(C0696a.m2919z("G\u0013\u0011mZ")), C0696a.m2918z(C0696a.m2919z("Z\u0013\u0011mG"))};

    protected C0696a(Class<C0706k> cls) {
        super(cls);
    }

    /* renamed from: z */
    private static String m2918z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 103;
                    break;
                case 1:
                    i2 = 46;
                    break;
                case 2:
                    i2 = 44;
                    break;
                case 3:
                    i2 = 66;
                    break;
                default:
                    i2 = 80;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2919z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 80);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public final String m2920a() {
        StringBuilder stringBuilder = new StringBuilder();
        if (!C0808l.m4053k(m2921a(C0706k.ERROR_WL_PROCESS))) {
            stringBuilder.append(C0745b.m3224c(f1795z[2], m2921a(C0706k.ERROR_WL_PROCESS))).append(f1795z[3]);
        }
        if (!C0808l.m4053k(m2921a(C0706k.ERROR_WL_FUNCTION))) {
            stringBuilder.append(C0745b.m3222b(f1795z[0], m2921a(C0706k.ERROR_WL_FUNCTION))).append("\n");
        }
        String a = m2921a(C0706k.ERROR_CODE);
        if ((!C0808l.m4053k(a) ? C0725i.m3064d(a) : 0) == C0607n.yr) {
            stringBuilder.append(C0745b.m3222b(f1795z[1], new String[0])).append("\n");
        }
        stringBuilder.append(m2921a(C0706k.ERROR_MESSAGE));
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public final String m2921a(C0706k c0706k) {
        return (String) super.get(c0706k);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        C0702f c0702f = null;
        for (C0706k c0706k : C0706k.values()) {
            String str = (String) get(c0706k);
            if (!C0808l.m4053k(str)) {
                if (c0702f != c0706k.getCategory()) {
                    if (c0702f != null) {
                        stringBuilder.append(f1795z[4]);
                    }
                    c0702f = c0706k.getCategory();
                    stringBuilder.append(f1795z[6]).append(c0702f.getName()).append(f1795z[5]).append(f1795z[4]);
                }
                stringBuilder.append(c0706k.getName()).append("=").append(str).append(f1795z[4]);
            }
        }
        return stringBuilder.toString();
    }
}
