package fr.pcsoft.wdjava.core.p047f;

import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.WDIndirection;
import fr.pcsoft.wdjava.core.WDObjet;
import java.lang.ref.WeakReference;
import java.text.ParseException;
import java.util.LinkedList;

/* renamed from: fr.pcsoft.wdjava.core.f.e */
final class C0716e {
    /* renamed from: z */
    private static final String[] f1826z = new String[]{C0716e.m2994z(C0716e.m2995z("\u0007\u0010\u0000\u0002,3\u001d\u0017K#>\u001fR\u001f?>\u0004\u0004(")), C0716e.m2994z(C0716e.m2995z("\u001d\u0010R\u001b?>\u0001\u0000\u0002¤%R")), C0716e.m2994z(C0716e.m2995z("\u0010\u0012\u0011>q\u0018\u001c\u000f$2R\u0002#'\u0010\u001e\u0002)4_")), C0716e.m2994z(C0716e.m2995z("\u0012\u0003\u001d\b%4\u0005R\r(#\u001c\u0013\u00059q\u001f\u001d\u0005m%\u0003\u001d\u001e;¸")), C0716e.m2994z(C0716e.m2995z("\u0014\u001d\u0006(?\u0005R\u001d$5\u0014\\")), C0716e.m2994z(C0716e.m2995z("q\u001fU\u000e58\u0002\u0006\u000em!\u0010\u0001E")), C0716e.m2994z(C0716e.m2995z("\u001dV\u0007¤<\u0014\u001c\u001fm")), C0716e.m2994z(C0716e.m2995z("q\u001fU\u000e58\u0002\u0006\u000em!\u0010\u0001"))};
    /* renamed from: a */
    private boolean f1827a;
    /* renamed from: b */
    private WDObjet f1828b;
    final C0722m this$0;

    private C0716e(C0722m c0722m) {
        this.this$0 = c0722m;
        this.f1828b = null;
        this.f1827a = false;
    }

    C0716e(C0722m c0722m, C0719h c0719h) {
        this(c0722m);
    }

    /* renamed from: b */
    private boolean m2992b(String str) {
        if (this.this$0.f1832a != null) {
            Object obj;
            if (this.f1827a) {
                EWDPropriete propByName = EWDPropriete.getPropByName(str);
                if (propByName == null) {
                    return false;
                }
                C0721k c0721k = new C0721k(propByName);
                this.f1827a = false;
                obj = c0721k;
            } else {
                obj = new C0711a(str);
            }
            try {
                if (this.this$0.f1833b == null) {
                    this.this$0.f1833b = new LinkedList();
                }
                this.this$0.f1833b.add(obj);
                return true;
            } catch (NumberFormatException e) {
                throw e;
            }
        }
        try {
            if (this.f1827a) {
                return false;
            }
            WDObjet 2;
            if (this.f1828b == null) {
                2 = WDIndirection.get2(str, 5);
                if (2 == null) {
                    try {
                        this.f1828b = WDIndirection.get2(str, 4);
                        if (this.f1828b == null) {
                            return false;
                        }
                    } catch (NumberFormatException e2) {
                        throw e2;
                    }
                }
            }
            2 = WDIndirection.rechercherVariableDans(str, this.f1828b, 5);
            if (2 == null) {
                try {
                    this.f1828b = WDIndirection.rechercherVariableDans(str, this.f1828b, 4);
                    if (this.f1828b == null) {
                        return false;
                    }
                } catch (NumberFormatException e22) {
                    throw e22;
                }
            }
            WDObjet wDObjet = 2;
            if (wDObjet != null) {
                try {
                    this.this$0.f1832a = new WeakReference(wDObjet);
                } catch (NumberFormatException e222) {
                    throw e222;
                }
            }
            return true;
        } catch (NumberFormatException e2222) {
            throw e2222;
        }
    }

    /* renamed from: c */
    private boolean m2993c(String str) throws ParseException {
        try {
            C0720i c0720i = new C0720i(Integer.parseInt(str));
            if (this.this$0.f1833b == null) {
                this.this$0.f1833b = new LinkedList();
            }
            this.this$0.f1833b.add(c0720i);
            return true;
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            return false;
        }
    }

    /* renamed from: z */
    private static String m2994z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 81;
                    break;
                case 1:
                    i2 = 113;
                    break;
                case 2:
                    i2 = 114;
                    break;
                case 3:
                    i2 = 107;
                    break;
                default:
                    i2 = 77;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2995z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 77);
        }
        return toCharArray;
    }

    /* renamed from: a */
    final void m2996a(String str) throws ParseException {
        StringBuilder stringBuilder = new StringBuilder();
        String trim = str.trim();
        int length = trim.length();
        int i = 0;
        while (i < length) {
            char charAt = trim.charAt(i);
            switch (charAt) {
                case '\t':
                    String stringBuilder2 = stringBuilder.toString();
                    try {
                        if (m2992b(stringBuilder2)) {
                            stringBuilder.setLength(0);
                            stringBuilder2 = trim.substring(i + 1);
                            try {
                                this.this$0.f1834c = EWDPropriete.getPropByName(stringBuilder2);
                                if (this.this$0.f1834c == null) {
                                    throw new ParseException(f1826z[1] + stringBuilder2 + f1826z[5], i);
                                }
                                return;
                            } catch (ParseException e) {
                                throw e;
                            }
                        }
                        throw new ParseException(f1826z[6] + stringBuilder2 + f1826z[5], 0);
                    } catch (ParseException e2) {
                        throw e2;
                    }
                case '.':
                case ':':
                    if (charAt == ':') {
                        if (i == 0) {
                            continue;
                        }
                    } else if (charAt == '.' && i < length - 1) {
                        try {
                            if (trim.charAt(i + 1) == '.') {
                                if (!this.f1827a) {
                                    this.f1827a = true;
                                    i++;
                                    break;
                                }
                            }
                        } catch (ParseException e22) {
                            throw e22;
                        } catch (ParseException e222) {
                            throw e222;
                        }
                    }
                    String stringBuilder3 = stringBuilder.toString();
                    try {
                        if (stringBuilder3.equals("")) {
                            throw new ParseException(f1826z[4], i);
                        }
                        try {
                            if (m2992b(stringBuilder3)) {
                                stringBuilder.setLength(0);
                                break;
                            }
                            if (charAt == '.') {
                                try {
                                    if (this.this$0.f1832a == null) {
                                        stringBuilder.append('.');
                                        break;
                                    }
                                } catch (ParseException e2222) {
                                    throw e2222;
                                }
                            }
                            throw new ParseException(f1826z[6] + stringBuilder3 + f1826z[5], 0);
                        } catch (ParseException e22222) {
                            throw e22222;
                        }
                    } catch (ParseException e222222) {
                        throw e222222;
                    }
                case '[':
                    int indexOf = trim.indexOf(93, i + 1);
                    if (indexOf < 0) {
                        try {
                            throw new ParseException(f1826z[3], i);
                        } catch (ParseException e2222222) {
                            throw e2222222;
                        }
                    }
                    try {
                        if (m2993c(trim.substring(i + 1, indexOf))) {
                            i = indexOf;
                            break;
                        }
                        throw new ParseException(f1826z[2], i);
                    } catch (ParseException e22222222) {
                        throw e22222222;
                    }
                default:
                    stringBuilder.append(charAt);
                    break;
            }
            i++;
        }
        String stringBuilder4 = stringBuilder.toString();
        try {
            if (!stringBuilder4.equals("")) {
                if (!m2992b(stringBuilder4)) {
                    throw new ParseException(f1826z[6] + stringBuilder4 + f1826z[7], trim.length());
                }
            }
            try {
                if (this.this$0.f1832a == null) {
                    throw new ParseException(f1826z[0], trim.length());
                }
            } catch (ParseException e222222222) {
                throw e222222222;
            }
        } catch (ParseException e2222222222) {
            throw e2222222222;
        } catch (ParseException e22222222222) {
            throw e22222222222;
        }
    }
}
