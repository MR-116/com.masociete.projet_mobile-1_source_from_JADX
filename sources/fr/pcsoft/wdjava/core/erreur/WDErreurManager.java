package fr.pcsoft.wdjava.core.erreur;

import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.context.C0671c;
import fr.pcsoft.wdjava.core.context.WDAppelContexte;
import fr.pcsoft.wdjava.core.context.WDContexte;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.p035c.C0539d;
import fr.pcsoft.wdjava.core.p035c.C0660a;
import fr.pcsoft.wdjava.core.p035c.C0667i;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.core.utils.kb;
import fr.pcsoft.wdjava.database.hf.bb;
import fr.pcsoft.wdjava.ui.C0489p;
import fr.pcsoft.wdjava.ui.champs.fenetre.C0508h;
import fr.pcsoft.wdjava.ui.dialogue.C1372f;
import java.io.FileOutputStream;
import java.lang.reflect.InvocationTargetException;

public class WDErreurManager {
    /* renamed from: a */
    private static final int f1756a = 410;
    /* renamed from: b */
    public static final int f1757b = m2870a(1);
    /* renamed from: z */
    private static final String[] f1758z = new String[]{m2889z(m2890z("oz")), m2889z(m2890z("#\u00058tKB\u001d>rV\u0003\u0017>!AE\u0015)s@\u0017\u0002{rU\u00132gL")), m2889z(m2890z("A5\tS`7\"\u0004F`,5\t@q+?\u0015^o#&\u001a")), m2889z(m2890z("5\u00195E@\u0014=4cL\u000e\u0015\u0016dV\u0011\u0011<dg\r\b")), m2889z(m2890z("A5\tS`7\"\u0004Hk65\tO`")), m2889z(m2890z("\\z")), m2889z(m2890z("BJQ")), m2889z(m2890z("A!\u000eDz1/\u001eRq=9\u0017^u##\bD")), m2889z(m2890z("A1\u000eBp,/\u0016Dv11\u001cDz1)\bU`/5")), m2889z(m2890z("BL")), m2889z(m2890z("BOQ")), m2889z(m2890z("h]{")), m2889z(m2890z("A>\u0012W`#%\u0004Dw05\u000eSz,?\u0015^c#$\u001aM`")), m2889z(m2890z("A4\u001eUd+<\u0004Dw05\u000eSz1)\bU`/5")), m2889z(m2890z("A1\u000bQ`./\fM")), m2889z(m2890z("BJ{")), m2889z(m2890z("A=\u001eRv#7\u001e^`0\"\u001eTw=#\u0002Rq'=\u001e")), m2889z(m2890z("A5\tS`7\"\u0004@u25\u0017^h'$\u0013Na'/\u001fHv61\u0015U`"))};

    /* renamed from: a */
    private static final int m2870a(int i) {
        return 4100000 + i;
    }

    /* renamed from: a */
    public static final String m2871a(WDContexte wDContexte, int i) {
        WDErreurNonFatale s = wDContexte.m2732s();
        if (s == null) {
            s = new WDErreurNonFatale("", "");
        }
        StringBuffer stringBuffer = new StringBuffer("");
        if (i == 19) {
            try {
                if (s.m2896d()) {
                    return ((bb) WDAppelContexte.getContexte(bb.class)).mo3084a(19);
                }
                try {
                    stringBuffer.append(f1758z[11]).append(C0745b.m3224c(f1758z[14], new String[0])).append(f1758z[9]).append(s.m2894b()).append(f1758z[5]);
                    stringBuffer.append(f1758z[11]).append(C0745b.m3224c(f1758z[12], new String[0])).append("\n");
                    if (s.m2895c().equals("")) {
                        stringBuffer.append(f1758z[11]).append(C0745b.m3224c(f1758z[8], new String[0])).append("\n");
                    } else {
                        stringBuffer.append(f1758z[11]).append(C0745b.m3224c(f1758z[16], new String[0])).append(f1758z[6]).append(s.m2895c()).append("\n");
                    }
                    stringBuffer.append(f1758z[11]).append(C0745b.m3224c(f1758z[7], new String[0])).append(f1758z[10]).append(s.getMessage()).append("\n");
                } catch (WDException e) {
                    throw e;
                }
            } catch (WDException e2) {
                throw e2;
            }
        } else if (i == 2) {
            try {
                stringBuffer.append(s.getMessage());
            } catch (WDException e22) {
                throw e22;
            }
        } else if (i == 17) {
            try {
                stringBuffer.append(s.m2895c());
            } catch (WDException e222) {
                throw e222;
            }
        } else if (i == 4) {
            try {
                stringBuffer.append(s.m2894b());
            } catch (WDException e2222) {
                throw e2222;
            }
        } else if (i == 0) {
            try {
                stringBuffer.append(s.m2897e());
            } catch (WDException e22222) {
                throw e22222;
            }
        } else if (i == 1) {
            String message = s.getMessage();
            if (message == null) {
                message = "";
            }
            try {
                stringBuffer.append(message);
                if (!s.m2895c().equals("")) {
                    stringBuffer.append("\n").append(C0745b.m3224c(f1758z[13], new String[0])).append(f1758z[15]);
                    stringBuffer.append(s.m2895c());
                }
            } catch (WDException e222222) {
                throw e222222;
            }
        } else if (i == 18) {
            try {
                stringBuffer.append(s.m2891a());
            } catch (WDException e2222222) {
                throw e2222222;
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static final String m2872a(StackTraceElement[] stackTraceElementArr) {
        int i = 0;
        StringBuilder stringBuilder = new StringBuilder();
        if (stackTraceElementArr != null) {
            try {
                if (stackTraceElementArr.length > 0) {
                    int length = stackTraceElementArr.length;
                    int i2 = 0;
                    while (i < length) {
                        StackTraceElement stackTraceElement = stackTraceElementArr[i];
                        if (i2 > 0) {
                            try {
                                stringBuilder.append(f1758z[0]);
                            } catch (WDException e) {
                                throw e;
                            }
                        }
                        stringBuilder.append(stackTraceElement.toString());
                        i2++;
                        i++;
                    }
                }
            } catch (WDException e2) {
                throw e2;
            }
        }
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public static final void m2873a(int i, String str, String... strArr) {
        try {
            C0691a.m2860a(strArr.length > 0, f1758z[1]);
            String a = C0808l.m4023a(strArr);
            kb.m3968b(a);
            throw new WDException(a, str, i);
        } catch (WDException e) {
            throw e;
        }
    }

    /* renamed from: a */
    public static final void m2874a(int i, String... strArr) {
        try {
            C0691a.m2860a(strArr.length > 0, f1758z[1]);
            String a = C0808l.m4023a(strArr);
            kb.m3968b(a);
            throw new WDException(a, i);
        } catch (WDException e) {
            throw e;
        }
    }

    /* renamed from: a */
    public static final void m2875a(C0539d c0539d) {
        kb.m3968b(c0539d.getMessage());
        throw new WDException(c0539d.getMessage(), c0539d.m1561f(), c0539d.mo2326e());
    }

    /* renamed from: a */
    public static void m2876a(WDContexte wDContexte, C0539d c0539d) {
        WDErreurNonFatale wDErreurNonFatale = new WDErreurNonFatale(c0539d.getMessage(), wDContexte.m2724j(), c0539d.m1561f(), c0539d.mo2326e(), c0539d.mo3219h());
        wDContexte.m2695a(wDErreurNonFatale);
        wDContexte.m2706a(wDErreurNonFatale, 0);
    }

    /* renamed from: a */
    public static void m2877a(WDContexte wDContexte, String str) {
        WDErreurNonFatale wDErreurNonFatale = new WDErreurNonFatale(str, wDContexte.m2724j());
        wDContexte.m2695a(wDErreurNonFatale);
        wDContexte.m2706a(wDErreurNonFatale, 0);
    }

    /* renamed from: a */
    public static void m2878a(WDContexte wDContexte, String str, int i) {
        WDErreurNonFatale wDErreurNonFatale = new WDErreurNonFatale(str, wDContexte.m2724j(), i);
        wDContexte.m2695a(wDErreurNonFatale);
        wDContexte.m2706a(wDErreurNonFatale, 0);
    }

    /* renamed from: a */
    public static void m2879a(WDContexte wDContexte, String str, String str2) {
        WDErreurNonFatale wDErreurNonFatale = new WDErreurNonFatale(str, wDContexte.m2724j(), str2);
        wDContexte.m2695a(wDErreurNonFatale);
        wDContexte.m2706a(wDErreurNonFatale, 0);
    }

    /* renamed from: a */
    public static void m2880a(WDContexte wDContexte, String str, String str2, int i) {
        WDErreurNonFatale wDErreurNonFatale = new WDErreurNonFatale(str, wDContexte.m2724j(), str2, i);
        wDContexte.m2695a(wDErreurNonFatale);
        wDContexte.m2706a(wDErreurNonFatale, 0);
    }

    /* renamed from: a */
    public static void m2881a(WDContexte wDContexte, String str, boolean z) {
        if (z) {
            try {
                if (!wDContexte.m2717c()) {
                    return;
                }
            } catch (WDException e) {
                throw e;
            }
        }
        WDErreurNonFatale wDErreurNonFatale = new WDErreurNonFatale(str, wDContexte.m2724j(), null, z);
        wDContexte.m2695a(wDErreurNonFatale);
        wDContexte.m2706a(wDErreurNonFatale, 0);
    }

    /* renamed from: a */
    public static void m2882a(Exception exception) {
        m2883a(C0745b.m3222b(f1758z[17], new String[0]) + "\n" + exception.getMessage());
    }

    /* renamed from: a */
    public static void m2883a(String str) {
        m2874a(0, str);
    }

    /* renamed from: a */
    public static final void m2884a(String str, String... strArr) {
        try {
            C0691a.m2860a(strArr.length > 0, f1758z[1]);
            String a = C0808l.m4023a(strArr);
            kb.m3968b(a);
            throw new WDException(a, str);
        } catch (WDException e) {
            throw e;
        }
    }

    /* renamed from: a */
    public static void m2885a(Throwable th) throws WDException {
        String b = C0745b.m3222b(f1758z[4], new String[0]);
        String message = th.getMessage();
        if (C0808l.m4053k(message)) {
            message = th.getClass().getName();
        }
        throw new WDException(b, message, "", 0, th.getStackTrace());
    }

    /* renamed from: a */
    public static final void m2886a(String... strArr) {
        m2874a(0, strArr);
    }

    /* renamed from: b */
    public static final void m2887b(WDContexte wDContexte, String str, int i) {
        WDErreurNonFatale wDErreurNonFatale = new WDErreurNonFatale(str, wDContexte.m2724j(), i);
        try {
            wDContexte.m2695a(wDErreurNonFatale);
            if (!wDContexte.m2706a(wDErreurNonFatale, 0)) {
                wDContexte.m2706a(wDErreurNonFatale, 1);
            }
        } catch (WDException e) {
            throw e;
        }
    }

    /* renamed from: b */
    public static final void m2888b(Throwable th) {
        try {
            if (!WDProjet.getInstance().hasCrashed()) {
                try {
                    if (th instanceof WDException) {
                        throw ((WDException) th);
                    } else if (th instanceof C0539d) {
                        C0539d c0539d = (C0539d) th;
                        try {
                            if (c0539d.mo3088g()) {
                                m2875a(c0539d);
                            } else {
                                m2876a(WDAppelContexte.getContexte(), c0539d);
                            }
                        } catch (WDException e) {
                            throw e;
                        }
                    } else if (th instanceof C0667i) {
                        WDContexte contexte = WDAppelContexte.getContexte();
                        if (contexte.m2738z() > 1) {
                            C0489p a;
                            C0671c l = contexte.m2726l();
                            if (l != null) {
                                try {
                                    a = l.m2763a();
                                } catch (WDException e2) {
                                    throw e2;
                                }
                            }
                            a = null;
                            Object a2 = ((C0667i) th).m2678a();
                            if (!(a == null || a == a2)) {
                                try {
                                    if (a.getFenetreMere() != a2) {
                                        if (!a.isReleased()) {
                                            return;
                                        }
                                    }
                                } catch (WDException e22) {
                                    throw e22;
                                } catch (WDException e222) {
                                    throw e222;
                                }
                            }
                            throw ((C0667i) th);
                        }
                    } else {
                        try {
                            if (th instanceof C0660a) {
                                ((C0660a) th).m2666b();
                                ((C0660a) th).m2665a();
                                return;
                            }
                            try {
                                if (th instanceof InvocationTargetException) {
                                    m2888b(((InvocationTargetException) th).getTargetException());
                                    return;
                                }
                                try {
                                    if (th.getCause() != null) {
                                        if (th.getCause() instanceof WDException) {
                                            throw ((WDException) th.getCause());
                                        }
                                    }
                                    try {
                                        if (th instanceof ThreadDeath) {
                                            throw ((ThreadDeath) th);
                                        }
                                        try {
                                            if (th instanceof ExceptionInInitializerError) {
                                                m2888b(((ExceptionInInitializerError) th).getException());
                                            } else {
                                                m2885a(th);
                                            }
                                        } catch (WDException e2222) {
                                            throw e2222;
                                        }
                                    } catch (WDException e22222) {
                                        throw e22222;
                                    }
                                } catch (WDException e222222) {
                                    throw e222222;
                                } catch (WDException e2222222) {
                                    throw e2222222;
                                }
                            } catch (WDException e22222222) {
                                throw e22222222;
                            }
                        } catch (WDException e222222222) {
                            throw e222222222;
                        }
                    }
                } catch (WDException e2222222222) {
                    throw e2222222222;
                }
            }
        } catch (WDException e22222222222) {
            throw e22222222222;
        }
    }

    public static void erreurGeneration(String str) {
        WDContexte contexte = WDAppelContexte.getContexte();
        String errorLogFilePath = WDProjet.getInstance().getErrorLogFilePath();
        if (C0808l.m4053k(errorLogFilePath)) {
            C0508h h = contexte.m2722h();
            if (h != null) {
                try {
                    if (h.getNomFenetre().equals(f1758z[3])) {
                        return;
                    }
                } catch (Exception e) {
                    throw e;
                }
            }
            try {
                if (C1372f.m9828a().m9832a(2, C0745b.m3224c(f1758z[2], str), new String[0], 1) == 0) {
                    WDProjet.getInstance().terminerApplication();
                    return;
                }
                return;
            } catch (Exception e2) {
                throw e2;
            }
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(errorLogFilePath);
            fileOutputStream.write(C0725i.m3082k(str));
            fileOutputStream.close();
            WDProjet.getInstance().terminerApplication();
        } catch (Exception e3) {
        }
    }

    /* renamed from: z */
    private static String m2889z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 98;
                    break;
                case 1:
                    i2 = 112;
                    break;
                case 2:
                    i2 = 91;
                    break;
                case 3:
                    i2 = 1;
                    break;
                default:
                    i2 = 37;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2890z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 37);
        }
        return toCharArray;
    }
}
