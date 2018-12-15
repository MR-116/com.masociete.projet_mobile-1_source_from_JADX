package fr.pcsoft.wdjava.core.erreur;

import fr.pcsoft.wdjava.core.WDCallback;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.context.WDAppelContexte;
import fr.pcsoft.wdjava.core.context.WDContexte;
import fr.pcsoft.wdjava.core.p035c.C0660a;
import fr.pcsoft.wdjava.core.types.WDVoid;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.ui.champs.fenetre.C0508h;

public class WDException extends RuntimeException {
    /* renamed from: i */
    private static WDException f1766i = null;
    /* renamed from: z */
    private static final String f1767z = m2900z(m2901z("\u0000\u0012]"));
    /* renamed from: a */
    private String f1768a;
    /* renamed from: b */
    private String f1769b;
    /* renamed from: c */
    private String f1770c;
    /* renamed from: d */
    private int f1771d;
    /* renamed from: e */
    private String f1772e;
    /* renamed from: f */
    private String f1773f;
    /* renamed from: g */
    private String f1774g;
    /* renamed from: h */
    private String f1775h;
    /* renamed from: j */
    private C0508h f1776j;
    /* renamed from: k */
    private int f1777k;
    /* renamed from: l */
    private String f1778l;

    public WDException(String str) {
        this(str, "", "", 0, null);
    }

    public WDException(String str, int i) {
        this(str, "", "", i, null);
    }

    public WDException(String str, String str2) {
        this(str, str2, "", 0, null);
    }

    public WDException(String str, String str2, int i) {
        this(str, str2, "", i, null);
    }

    public WDException(String str, String str2, String str3) {
        this(str, str2, str3, 0, null);
    }

    public WDException(String str, String str2, String str3, int i) {
        this(str, str2, str3, i, null);
    }

    public WDException(String str, String str2, String str3, int i, StackTraceElement[] stackTraceElementArr) {
        super(str);
        this.f1775h = null;
        this.f1769b = str2;
        this.f1768a = str3;
        this.f1771d = i;
        WDContexte contexte = WDAppelContexte.getContexte();
        if (contexte != null) {
            try {
                this.f1770c = contexte.m2729p();
                if (C0808l.m4053k(this.f1768a)) {
                    this.f1768a = contexte.m2731r();
                }
                this.f1776j = contexte.m2722h();
                this.f1772e = contexte.m2725k();
            } catch (WDException e) {
                throw e;
            }
        }
        if (stackTraceElementArr != null) {
            try {
                setStackTrace(stackTraceElementArr);
            } catch (WDException e2) {
                throw e2;
            }
        }
        m2899a();
        f1766i = this;
    }

    /* renamed from: a */
    private void m2899a() {
        StackTraceElement[] stackTrace = getStackTrace();
        if (stackTrace != null) {
            try {
                if (stackTrace.length > 0) {
                    int length = stackTrace.length;
                    int i = 0;
                    while (i < length) {
                        StackTraceElement stackTraceElement = stackTrace[i];
                        String fileName = stackTraceElement.getFileName();
                        try {
                            if (!C0808l.m4053k(fileName)) {
                                if (fileName.startsWith(f1767z)) {
                                    this.f1774g = fileName;
                                    this.f1778l = stackTraceElement.getClassName();
                                    this.f1773f = stackTraceElement.getMethodName();
                                    this.f1777k = stackTraceElement.getLineNumber();
                                    return;
                                }
                            }
                            i++;
                        } catch (WDException e) {
                            throw e;
                        } catch (WDException e2) {
                            throw e2;
                        }
                    }
                }
            } catch (WDException e22) {
                throw e22;
            }
        }
    }

    public static final WDException getLastException() {
        return f1766i;
    }

    public static final void reset() {
        try {
            if (f1766i != null) {
                f1766i.release();
                f1766i = null;
            }
        } catch (WDException e) {
            throw e;
        }
    }

    /* renamed from: z */
    private static String m2900z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 71;
                    break;
                case 1:
                    i2 = 69;
                    break;
                case 2:
                    i2 = 25;
                    break;
                case 3:
                    i2 = 102;
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
    private static char[] m2901z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 44);
        }
        return toCharArray;
    }

    public void executerProcedureWL(String str) {
        WDCallback a = WDCallback.m2240a(str, 0);
        if (a != null) {
            WDObjet execute = a.execute(1, new WDObjet[0]);
            if (execute != null) {
                try {
                    if (!(execute instanceof WDVoid)) {
                        switch (execute.getInt()) {
                            case -2147483647:
                                throw this;
                            case -2147483645:
                                throw new C0660a(null);
                            default:
                                WDProjet.getInstance().terminerApplication();
                                return;
                        }
                        throw e;
                    }
                } catch (WDException e) {
                    throw e;
                } catch (WDException e2) {
                    throw e2;
                }
            }
            WDProjet.getInstance().terminerApplication();
        }
    }

    public String getClassName() {
        return this.f1778l;
    }

    public int getCode() {
        return this.f1771d;
    }

    public final String getDebugMessage() {
        return this.f1775h;
    }

    public final C0508h getFenetreEnCours() {
        return this.f1776j;
    }

    public String getFileName() {
        return this.f1774g;
    }

    public int getLine() {
        return this.f1777k;
    }

    public String getMethodName() {
        return this.f1773f;
    }

    public String getSystemMessage() {
        return this.f1769b;
    }

    public final String getWLFunction() {
        return this.f1768a;
    }

    public final String getWLProcessName() {
        return this.f1770c;
    }

    public final String getWLStackTrace() {
        return this.f1772e;
    }

    public final void release() {
        this.f1769b = null;
        this.f1768a = null;
        this.f1773f = null;
        this.f1778l = null;
        this.f1774g = null;
        this.f1776j = null;
        this.f1770c = null;
        this.f1772e = null;
    }
}
