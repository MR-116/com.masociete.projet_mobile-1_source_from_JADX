package fr.pcsoft.wdjava.core.erreur;

import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.report.C0697b;
import fr.pcsoft.wdjava.core.erreur.report.C0705j;
import fr.pcsoft.wdjava.core.p035c.C0660a;
import fr.pcsoft.wdjava.core.p035c.C0667i;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.core.utils.kb;
import fr.pcsoft.wdjava.jni.WDJNIException;
import fr.pcsoft.wdjava.tlm.WDTelemetrie;
import fr.pcsoft.wdjava.ui.dialogue.C1372f;
import java.io.FileOutputStream;
import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: fr.pcsoft.wdjava.core.erreur.c */
public class C0695c implements UncaughtExceptionHandler {
    /* renamed from: b */
    private static C0695c f1783b = null;
    /* renamed from: z */
    private static final String[] f1784z = new String[]{C0695c.m2913z(C0695c.m2914z("zm\u0004U\u0004B#\fW\u0004E+\u0019R\u0002Xj\t^MZ+MX\u0001W9\b\u001b:r\u001f\u0003X\fC-\u0005O(N)\bK\u0019_%\u0003s\fX.\u0001^\u001f\u0016+MÒ\u0019ßj\tÒ\u0007ÖjO\u0016/\u000b]\bU>\u0018Ò\b\u0018")), C0695c.m2913z(C0695c.m2914z("'\u001dT\u001eE#\u000fW\b\u0016.J^\u0003D/\nR\u001eB8\bIMZm\bI\u001fS?\u001f\u001b\u001dY?\u001f\u001b\u0001Wj\u0019Ò\u0001ß'O\u001f_/C"))};
    /* renamed from: a */
    private UncaughtExceptionHandler f1785a = Thread.getDefaultUncaughtExceptionHandler();

    private C0695c() {
    }

    /* renamed from: a */
    public static final C0695c m2911a() {
        return f1783b;
    }

    /* renamed from: b */
    public static final void m2912b() {
        boolean z = false;
        try {
            if (f1783b == null) {
                z = true;
            }
            try {
                C0691a.m2860a(z, f1784z[0]);
                if (f1783b == null) {
                    f1783b = new C0695c();
                    Thread.setDefaultUncaughtExceptionHandler(f1783b);
                }
            } catch (WDException e) {
                throw e;
            }
        } catch (WDException e2) {
            throw e2;
        }
    }

    /* renamed from: z */
    private static String m2913z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 54;
                    break;
                case 1:
                    i2 = 74;
                    break;
                case 2:
                    i2 = 109;
                    break;
                case 3:
                    i2 = 59;
                    break;
                default:
                    i2 = 109;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2914z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 109);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public final void m2915a(Throwable th, Thread thread) {
        WDProjet.getInstance().onCrashed();
        Throwable cause = th.getCause();
        Throwable th2 = th;
        while (cause != null && cause != th2) {
            th2 = cause;
            cause = cause.getCause();
        }
        if (thread == null) {
            thread = Thread.currentThread();
        }
        try {
            if (!(th2 instanceof C0667i) && !(th2 instanceof C0660a)) {
                if ((th2 instanceof WDException) && WDTelemetrie.m7399e().mo3313h()) {
                    WDException wDException = (WDException) th2;
                    try {
                        WDTelemetrie.m7399e().m7405a(wDException.getCode(), wDException.getMessage(), wDException.getSystemMessage(), wDException.getWLStackTrace(), WDErreurManager.m2872a(wDException.getStackTrace()), "", wDException.getWLProcessName(), "", 0, 0);
                    } catch (Exception e) {
                        C0691a.m2857a(f1784z[1], e);
                    }
                }
                C0697b e2 = new C0705j().m2936a(System.currentTimeMillis()).m2939b().m2935a().m2940c().m2941d().m2938a(th2).m2937a(thread).m2942e();
                String c0697b = e2.toString();
                kb.m3968b(c0697b);
                String errorLogFilePath = WDProjet.getInstance().getErrorLogFilePath();
                if (C0808l.m4053k(errorLogFilePath)) {
                    C1372f.m9828a().mo3750a(e2);
                    return;
                }
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(errorLogFilePath);
                    fileOutputStream.write(C0725i.m3082k(c0697b));
                    fileOutputStream.close();
                    WDProjet.getInstance().terminerApplication();
                } catch (Exception e3) {
                }
            }
        } catch (WDJNIException e4) {
            throw e4;
        } catch (Throwable cause2) {
            try {
                if (this.f1785a != null) {
                    this.f1785a.uncaughtException(thread, cause2);
                } else {
                    cause2.printStackTrace();
                }
            } catch (WDJNIException e42) {
                throw e42;
            }
        }
    }

    public void uncaughtException(Thread thread, Throwable th) {
        m2915a(th, thread);
    }
}
