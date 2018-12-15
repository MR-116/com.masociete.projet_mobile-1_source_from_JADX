package fr.pcsoft.wdjava.media;

import android.media.MediaPlayer;
import android.net.Uri;
import android.webkit.URLUtil;
import fr.pcsoft.wdjava.core.application.C0653m;
import fr.pcsoft.wdjava.core.application.WDAppManager;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.C0743a;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.file.C0897o;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: fr.pcsoft.wdjava.media.v */
public class C0960v {
    /* renamed from: b */
    private static C0960v f2686b = null;
    /* renamed from: z */
    private static final String[] f2687z = new String[]{C0960v.m6930z(C0960v.m6931z("\u001e)rnvt*irws*cdmi.uy")), C0960v.m6930z(C0960v.m6931z("\\\u0001__QT\u000b\u0015][O\u0002R^MT\u0000U\u0003ws;~px;")), C0960v.m6930z(C0960v.m6931z("h\u0001^\r[O\u001d^XL\u001d\u001c\u001cHMIOK_QY\u001aRY[\u001d\u000bN__S\u001b\u001bA_\u001d\u0003^NJH\u001d^\rZHOHBP\u001d\nU\rSR\u000b^\r\\Q\u0000JX_S\u001b\u0015"))};
    /* renamed from: a */
    private MediaPlayer f2688a = null;

    private C0960v() {
        WDProjet.getInstance().ajouterEcouteurProjet(new C0963y(this));
    }

    /* renamed from: a */
    public static final boolean m6926a() {
        return (f2686b == null || f2686b.m6927b() == null || !f2686b.m6927b().isPlaying()) ? false : true;
    }

    /* renamed from: b */
    private MediaPlayer m6927b() {
        return this.f2688a;
    }

    /* renamed from: c */
    public static C0960v m6928c() {
        if (f2686b == null) {
            f2686b = new C0960v();
        }
        return f2686b;
    }

    /* renamed from: e */
    private void m6929e() {
        if (this.f2688a != null) {
            this.f2688a.release();
            this.f2688a = null;
        }
    }

    /* renamed from: z */
    private static String m6930z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 61;
                    break;
                case 1:
                    i2 = 111;
                    break;
                case 2:
                    i2 = 59;
                    break;
                case 3:
                    i2 = 45;
                    break;
                default:
                    i2 = 62;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m6931z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 62);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public void m6932a(String str, boolean z, boolean z2) throws ib {
        try {
            if (this.f2688a != null) {
                m6933d();
                m6929e();
            }
            FileInputStream[] fileInputStreamArr = new FileInputStream[1];
            int j = C0743a.m3214j(str);
            if (j > 0) {
                try {
                    this.f2688a = MediaPlayer.create(WDAppManager.m2544C(), j);
                } catch (C0653m e) {
                    throw e;
                }
            }
            try {
                if (URLUtil.isNetworkUrl(str)) {
                    try {
                        WDAppManager.m2571b(f2687z[1]);
                    } catch (C0653m e2) {
                        WDErreurManager.m2883a(e2.getMessage());
                    }
                    this.f2688a = MediaPlayer.create(WDAppManager.m2544C(), Uri.parse(str));
                } else {
                    File j2 = C0897o.m6290j(str);
                    try {
                        if (j2.exists()) {
                            this.f2688a = new MediaPlayer();
                            try {
                                fileInputStreamArr[0] = new FileInputStream(j2);
                                this.f2688a.setDataSource(fileInputStreamArr[0].getFD());
                                this.f2688a.prepare();
                            } catch (Exception e3) {
                                throw new ib(e3.getMessage());
                            }
                        }
                        throw new ib(C0745b.m3222b(f2687z[0], str));
                    } catch (C0653m e22) {
                        throw e22;
                    }
                }
            } catch (ib e4) {
                throw e4;
            }
            try {
                if (this.f2688a == null) {
                    return;
                }
                if (z) {
                    try {
                        new hb(this).m1785a(0, "", 0);
                        m6929e();
                        if (fileInputStreamArr[0] != null) {
                            try {
                                fileInputStreamArr[0].close();
                                return;
                            } catch (IOException e5) {
                                return;
                            }
                        }
                        return;
                    } catch (Exception e32) {
                        C0691a.m2857a(f2687z[2], e32);
                        m6929e();
                        if (fileInputStreamArr[0] != null) {
                            try {
                                fileInputStreamArr[0].close();
                                return;
                            } catch (IOException e6) {
                                return;
                            }
                        }
                        return;
                    } catch (Throwable th) {
                        try {
                            m6929e();
                            if (fileInputStreamArr[0] != null) {
                                try {
                                    fileInputStreamArr[0].close();
                                } catch (IOException e7) {
                                }
                            }
                        } catch (ib e42) {
                            throw e42;
                        }
                    }
                }
                if (z2) {
                    try {
                        this.f2688a.setLooping(true);
                    } catch (C0653m e222) {
                        throw e222;
                    }
                }
                this.f2688a.setOnCompletionListener(new C0951m(this, fileInputStreamArr));
                this.f2688a.start();
            } catch (C0653m e2222) {
                throw e2222;
            }
        } catch (C0653m e22222) {
            throw e22222;
        }
    }

    /* renamed from: d */
    public final void m6933d() {
        if (this.f2688a != null && this.f2688a.isPlaying()) {
            this.f2688a.stop();
        }
    }
}
