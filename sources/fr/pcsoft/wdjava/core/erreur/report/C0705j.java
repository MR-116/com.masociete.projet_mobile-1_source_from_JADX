package fr.pcsoft.wdjava.core.erreur.report;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Point;
import android.os.Build;
import android.view.View;
import fr.pcsoft.wdjava.core.application.C0638a;
import fr.pcsoft.wdjava.core.application.C0651k;
import fr.pcsoft.wdjava.core.application.WDAppManager;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.erreur.WDException;
import fr.pcsoft.wdjava.core.p046e.C0693b;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.core.utils.bb;
import fr.pcsoft.wdjava.core.utils.kb;
import fr.pcsoft.wdjava.p061q.p062a.C1014a;
import fr.pcsoft.wdjava.ui.activite.C1056i;
import fr.pcsoft.wdjava.ui.champs.fenetre.C0508h;
import fr.pcsoft.wdjava.ui.utils.C1511l;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;

/* renamed from: fr.pcsoft.wdjava.core.erreur.report.j */
public final class C0705j {
    /* renamed from: z */
    private static final String[] f1806z = new String[]{C0705j.m2933z(C0705j.m2934z("_\u0019e##e\u001dw 56\u0010pl3dp>pc\u001a5?>w\u0004f$?bTq)pz\u00155*5xa>58")), C0705j.m2933z(C0705j.m2934z("3E5du$]")), C0705j.m2933z(C0705j.m2934z("\u0010(")), C0705j.m2933z(C0705j.m2934z("P&")), C0705j.m2933z(C0705j.m2934z("q\u0006z9 X\u0015x)m")), C0705j.m2933z(C0705j.m2934z("z\u001bv-<s")), C0705j.m2933z(C0705j.m2934z("5&P\u001c\u001fD J\n\u001fD9T\u0018\u000fR5A\t\u000f^1@\u001e\u0015")), C0705j.m2933z(C0705j.m2934z("s\u0006g")), C0705j.m2933z(C0705j.m2934z("p\u001dy)j9[")), C0705j.m2933z(C0705j.m2934z("3Emib")), C0705j.m2933z(C0705j.m2934z("f\u0006|#\"\u0000lq")), C0705j.m2933z(C0705j.m2934z("8\u0004{+")), C0705j.m2933z(C0705j.m2934z("x\u0015x)m"))};
    /* renamed from: a */
    private Thread f1807a = null;
    /* renamed from: b */
    private Throwable f1808b = null;
    /* renamed from: c */
    private boolean f1809c = false;
    /* renamed from: d */
    private boolean f1810d = false;
    /* renamed from: e */
    private boolean f1811e = false;
    /* renamed from: f */
    private boolean f1812f = false;
    /* renamed from: g */
    private long f1813g = 0;

    /* renamed from: z */
    private static String m2933z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 22;
                    break;
                case 1:
                    i2 = 116;
                    break;
                case 2:
                    i2 = 21;
                    break;
                case 3:
                    i2 = 76;
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
    private static char[] m2934z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 80);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public final C0705j m2935a() {
        this.f1812f = true;
        return this;
    }

    /* renamed from: a */
    public final C0705j m2936a(long j) {
        this.f1813g = j;
        return this;
    }

    /* renamed from: a */
    public final C0705j m2937a(Thread thread) {
        this.f1807a = thread;
        return this;
    }

    /* renamed from: a */
    public final C0705j m2938a(Throwable th) {
        this.f1808b = th;
        return this;
    }

    /* renamed from: b */
    public final C0705j m2939b() {
        this.f1811e = true;
        return this;
    }

    /* renamed from: c */
    public final C0705j m2940c() {
        this.f1809c = true;
        return this;
    }

    /* renamed from: d */
    public final C0705j m2941d() {
        this.f1810d = true;
        return this;
    }

    /* renamed from: e */
    public final C0697b m2942e() {
        Exception e;
        Throwable th;
        C0697b c0697b = new C0697b();
        if (this.f1811e) {
            WDProjet instance = WDProjet.getInstance();
            c0697b.put(C0706k.APP_NAME, instance.getNomApplication());
            c0697b.put(C0706k.APP_VERSION, instance.getVersionApplication());
            c0697b.put(C0706k.APP_PACKAGE_NAME, instance.getPackageRacine());
            c0697b.put(C0706k.APP_START_DATETIME, new SimpleDateFormat(C0745b.m3224c(f1806z[6], new String[0])).format(Long.valueOf(WDAppManager.m2552K())));
            c0697b.put(C0706k.APP_FRAMEWORK_VERSION, C0808l.m4021a(f1806z[1], C0693b.m2867a(), C0651k.m2644a(C0638a.BUILD, f1806z[5], f1806z[3])));
        }
        try {
            if (this.f1812f) {
                c0697b.put(C0706k.DEVICE_MODEL, Build.MODEL);
                c0697b.put(C0706k.DEVICE_MANUFACTURER, Build.MANUFACTURER);
                c0697b.put(C0706k.DEVICE_BRAND, Build.BRAND);
            }
            if (this.f1809c) {
                c0697b.put(C0706k.ANDROID_VERSION_NUM, C0808l.m4021a(f1806z[1], kb.m3987q(), kb.m3973d()));
                c0697b.put(C0706k.ANDROID_API_LEVEL, String.valueOf(kb.m3986p()));
                c0697b.put(C0706k.TOTAL_MEMORY_SIZE, C0808l.m4012a((double) kb.m3978h(), 5182));
                c0697b.put(C0706k.AVAILABLE_MEM_SIZE, C0808l.m4012a((double) kb.m3983m(), 5182));
                c0697b.put(C0706k.DISPLAY_DENSITY, String.valueOf(C1511l.m10528c()));
                Point a = C1014a.m7327b().mo3295a(true);
                c0697b.put(C0706k.DISPLAY_RESOLUTION, C0808l.m4021a(f1806z[9], String.valueOf(a.x), String.valueOf(a.y)));
            }
            if (this.f1807a != null) {
                StringBuilder stringBuilder = new StringBuilder();
                try {
                    if (this.f1807a != null) {
                        stringBuilder.append(f1806z[2]).append(this.f1807a.getId()).append("\n");
                        stringBuilder.append(f1806z[12]).append(this.f1807a.getName()).append("\n");
                        stringBuilder.append(f1806z[10]).append(this.f1807a.getPriority()).append("\n");
                        if (this.f1807a.getThreadGroup() != null) {
                            stringBuilder.append(f1806z[4]).append(this.f1807a.getThreadGroup().getName());
                        }
                    }
                    c0697b.put(C0706k.ERROR_THREAD, stringBuilder.toString());
                } catch (Exception e2) {
                    throw e2;
                } catch (Exception e22) {
                    throw e22;
                }
            }
            if (this.f1813g > 0) {
                c0697b.put(C0706k.ERROR_DATETIME, new SimpleDateFormat(C0745b.m3224c(f1806z[6], new String[0])).format(Long.valueOf(this.f1813g)));
            }
            if (this.f1808b != null) {
                boolean z = this.f1808b instanceof WDException;
                c0697b.put(C0706k.ERROR_MESSAGE, this.f1808b.getMessage());
                c0697b.put(C0706k.ERROR_STACK_TRACE, WDErreurManager.m2872a(this.f1808b.getStackTrace()));
                if (z) {
                    WDException wDException = (WDException) this.f1808b;
                    c0697b.put(C0706k.ERROR_WL_STACK_TRACE, wDException.getWLStackTrace());
                    c0697b.put(C0706k.ERROR_SYSTEM_MESSAGE, wDException.getSystemMessage());
                    int code = wDException.getCode();
                    if (code != 0) {
                        try {
                            c0697b.put(C0706k.ERROR_CODE, String.valueOf(code));
                        } catch (Exception e222) {
                            throw e222;
                        }
                    }
                    String debugMessage = wDException.getDebugMessage();
                    try {
                        if (!C0808l.m4053k(debugMessage)) {
                            c0697b.put(C0706k.ERROR_DEBUG_MESSAGE, debugMessage);
                        }
                        c0697b.put(C0706k.ERROR_WL_FUNCTION, wDException.getWLFunction());
                        c0697b.put(C0706k.ERROR_WL_PROCESS, wDException.getWLProcessName());
                    } catch (Exception e2222) {
                        throw e2222;
                    }
                }
            }
            try {
                if (this.f1810d) {
                    if (!(this.f1808b instanceof OutOfMemoryError)) {
                        Activity activity;
                        if (this.f1808b instanceof WDException) {
                            C0508h fenetreEnCours = ((WDException) this.f1808b).getFenetreEnCours();
                            if (fenetreEnCours != null) {
                                try {
                                    if (fenetreEnCours.estOuverteEtAffichee()) {
                                        activity = (Activity) fenetreEnCours.getSupport();
                                    }
                                } catch (Exception e22222) {
                                    throw e22222;
                                }
                            }
                            activity = C1056i.m7562a();
                        } else {
                            activity = C1056i.m7562a();
                        }
                        if (activity != null) {
                            Closeable fileOutputStream;
                            try {
                                File file = new File(activity.getExternalCacheDir(), f1806z[7] + System.currentTimeMillis() + f1806z[11]);
                                fileOutputStream = new FileOutputStream(file);
                                View rootView;
                                boolean isDrawingCacheEnabled;
                                try {
                                    rootView = activity.getWindow().getDecorView().getRootView();
                                    isDrawingCacheEnabled = rootView.isDrawingCacheEnabled();
                                    rootView.setDrawingCacheEnabled(true);
                                    Bitmap createBitmap = Bitmap.createBitmap(rootView.getDrawingCache());
                                    rootView.setDrawingCacheEnabled(isDrawingCacheEnabled);
                                    createBitmap.compress(CompressFormat.PNG, 100, fileOutputStream);
                                    fileOutputStream.flush();
                                    c0697b.put(C0706k.SCREENSHOT_PATH, f1806z[8] + file.getPath());
                                    bb.m3844a(fileOutputStream);
                                } catch (Exception e3) {
                                    e22222 = e3;
                                    try {
                                        C0691a.m2857a(f1806z[0], e22222);
                                        bb.m3844a(fileOutputStream);
                                        return c0697b;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        bb.m3844a(fileOutputStream);
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    rootView.setDrawingCacheEnabled(isDrawingCacheEnabled);
                                }
                            } catch (Exception e4) {
                                e22222 = e4;
                                fileOutputStream = null;
                                C0691a.m2857a(f1806z[0], e22222);
                                bb.m3844a(fileOutputStream);
                                return c0697b;
                            } catch (Throwable th4) {
                                th = th4;
                                fileOutputStream = null;
                                bb.m3844a(fileOutputStream);
                                throw th;
                            }
                        }
                    }
                }
                return c0697b;
            } catch (Exception e222222) {
                throw e222222;
            } catch (Exception e2222222) {
                throw e2222222;
            }
        } catch (Exception e22222222) {
            throw e22222222;
        }
    }
}
