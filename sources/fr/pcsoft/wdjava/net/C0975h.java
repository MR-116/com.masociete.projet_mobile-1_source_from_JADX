package fr.pcsoft.wdjava.net;

import android.text.Html;
import android.webkit.URLUtil;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.core.utils.db;

/* renamed from: fr.pcsoft.wdjava.net.h */
public class C0975h {
    /* renamed from: z */
    private static final String[] f2751z = new String[]{C0975h.m7047z(C0975h.m7048z("aIM\u001e [M_\u001d6\b@\u001a\u001e&^VT\u0003sDE\u001d\u00012OA\u001d\u00066J\n")), C0975h.m7047z(C0975h.m7048z("@PI\u0001i\u0007\u000b")), C0975h.m7047z(C0975h.m7048z("\u0014FOQ|\u0016")), C0975h.m7047z(C0975h.m7048z("\u000eHIJ")), C0975h.m7047z(C0975h.m7048z("\u000eA^\u0018!K\u001f")), C0975h.m7047z(C0975h.m7048z("\u000e@X\u0016h")), C0975h.m7047z(C0975h.m7048z("\u000eAH\u0003<\u0013")), C0975h.m7047z(C0975h.m7048z("\u000ePO\u00107M\u001f")), C0975h.m7047z(C0975h.m7048z("\u000eQZ\u00032^A\u0006")), C0975h.m7047z(C0975h.m7048z("\u000eG^\u00147AH\u0006")), C0975h.m7047z(C0975h.m7048z("\u000eUH\u001e'\u0013")), C0975h.m7047z(C0975h.m7048z("\u000e\u0007")), C0975h.m7047z(C0975h.m7048z("\u000eJ_\u0002#\u0013")), C0975h.m7047z(C0975h.m7048z("\u000eEP\u0001h")), C0975h.m7047z(C0975h.m7048z("\u000eAZ\u00032^A\u0006")), C0975h.m7047z(C0975h.m7048z("\u000eCIJ")), C0975h.m7047z(C0975h.m7048z("\u000eA\\\u0012&\\A\u0006")), C0975h.m7047z(C0975h.m7048z("\u000eEZ\u00032^A\u0006"))};

    /* renamed from: a */
    public static final String m7044a(String str) {
        return C0808l.m4018a(Html.fromHtml(str).toString(), String.valueOf('￼'), "");
    }

    /* renamed from: b */
    public static final void m7045b(String str) {
        if (!URLUtil.isValidUrl(str)) {
            str = f2751z[1] + str;
        }
        try {
            db.m3863b(str);
        } catch (Exception e) {
            C0691a.m2857a(f2751z[0], e);
        }
    }

    /* renamed from: c */
    public static final String m7046c(String str) {
        if (C0808l.m4053k(str)) {
            return str;
        }
        int length = str.length();
        StringBuilder stringBuilder = new StringBuilder(length);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt == ' ' && (i2 > 0 || (i + 1 < length && str.charAt(i + 1) == ' '))) {
                i2++;
                if (i2 % 2 == 1) {
                    stringBuilder.append(f2751z[12]);
                } else {
                    stringBuilder.append(' ');
                }
            } else if (str.charAt(i) != '\r' || i + 1 >= length || str.charAt(i + 1) != '\n') {
                switch (charAt) {
                    case '\n':
                    case '\u000b':
                    case '\r':
                        stringBuilder.append(f2751z[2]);
                        i2 = 0;
                        break;
                    case '\"':
                        stringBuilder.append(f2751z[10]);
                        i2 = 0;
                        break;
                    case '&':
                        stringBuilder.append(f2751z[13]);
                        i2 = 0;
                        break;
                    case '<':
                        stringBuilder.append(f2751z[3]);
                        i2 = 0;
                        break;
                    case '>':
                        stringBuilder.append(f2751z[15]);
                        i2 = 0;
                        break;
                    case C0607n.bx /*127*/:
                        stringBuilder.append(f2751z[7]);
                        i2 = 0;
                        break;
                    case C0607n.aw /*176*/:
                        stringBuilder.append(f2751z[5]);
                        i2 = 0;
                        break;
                    case 'à':
                        stringBuilder.append(f2751z[17]);
                        i2 = 0;
                        break;
                    case 'ç':
                        stringBuilder.append(f2751z[9]);
                        i2 = 0;
                        break;
                    case 'è':
                        stringBuilder.append(f2751z[14]);
                        i2 = 0;
                        break;
                    case 'é':
                        stringBuilder.append(f2751z[16]);
                        i2 = 0;
                        break;
                    case C0607n.Jn /*234*/:
                        stringBuilder.append(f2751z[4]);
                        i2 = 0;
                        break;
                    case 'ù':
                        stringBuilder.append(f2751z[8]);
                        i2 = 0;
                        break;
                    case '€':
                        stringBuilder.append(f2751z[6]);
                        i2 = 0;
                        break;
                    default:
                        if (charAt <= '') {
                            stringBuilder.append(charAt);
                            i2 = 0;
                            break;
                        }
                        stringBuilder.append(f2751z[11]).append(charAt).append(';');
                        i2 = 0;
                        break;
                }
            }
            i++;
        }
        return stringBuilder.toString();
    }

    /* renamed from: z */
    private static String m7047z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 40;
                    break;
                case 1:
                    i2 = 36;
                    break;
                case 2:
                    i2 = 61;
                    break;
                case 3:
                    i2 = 113;
                    break;
                default:
                    i2 = 83;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7048z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 83);
        }
        return toCharArray;
    }
}
