package fr.pcsoft.wdjava.net.http;

import fr.pcsoft.wdjava.core.C0486m;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.WDCallback;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.context.C0670b;
import fr.pcsoft.wdjava.core.context.WDAppelContexte;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.p035c.C0539d;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.collection.C0582d;
import fr.pcsoft.wdjava.file.C0897o;
import fr.pcsoft.wdjava.file.C0901s;
import fr.pcsoft.wdjava.jni.WDJNIException;
import fr.pcsoft.wdjava.jni.WDJNIHelper;
import fr.pcsoft.wdjava.jni.WDJaugeJNI;
import fr.pcsoft.wdjava.net.C1011t;
import fr.pcsoft.wdjava.net.oauth2.WDAuthToken;
import fr.pcsoft.wdjava.net.oauth2.WDOAuth2Manager;
import fr.pcsoft.wdjava.net.oauth2.WDOAuth2Manager.OAuth2Token;
import fr.pcsoft.wdjava.ui.C0489p;
import fr.pcsoft.wdjava.ui.champs.jauge.C1225d;
import fr.pcsoft.wdjava.ui.utils.C1502a;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.util.HashMap;
import java.util.Properties;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: fr.pcsoft.wdjava.net.http.o */
public class C0990o {
    /* renamed from: a */
    private static String f2814a = null;
    /* renamed from: b */
    private static HashMap<String, WDHTTPForm> f2815b = null;
    /* renamed from: c */
    private static final String f2816c = C0990o.m7221z(C0990o.m7222z("\tz\"\rg\u0011|9\u00050)a%\t"));
    /* renamed from: d */
    private static final String f2817d = C0990o.m7221z(C0990o.m7222z("\tz\"\rg\u0011|9\u000502k\""));
    /* renamed from: e */
    public static final int f2818e = 32;
    /* renamed from: f */
    private static boolean f2819f = WDJNIHelper.m6686c();
    /* renamed from: g */
    public static final String f2820g = C0990o.m7221z(C0990o.m7222z("\u0000~&\u0011 \u0002o\"\u0014&\u000f!.P>\u0016y{\u001b&\u0013c{\b;\rk8\u001e&\u0005k2"));
    /* renamed from: h */
    private static int f2821h = 10000;
    /* renamed from: i */
    public static final int f2822i = 4;
    /* renamed from: j */
    private static final String f2823j = C0990o.m7221z(C0990o.m7222z("\tz\"\rg\u0011|9\u000501a$\t"));
    /* renamed from: k */
    public static final int f2824k = 1;
    /* renamed from: l */
    public static final String f2825l = C0990o.m7221z(C0990o.m7222z("\u0000~&\u0011 \u0002o\"\u0014&\u000f!9\u001e=\u0004z{\u000e=\u0013k7\u0010"));
    /* renamed from: m */
    private static C0976a f2826m = null;
    /* renamed from: n */
    public static final int f2827n = 100139;
    /* renamed from: o */
    private static int f2828o = 200000;
    /* renamed from: p */
    public static final int f2829p = 100140;
    /* renamed from: q */
    public static final String f2830q = WDProjet.getInstance().getNomApplication();
    /* renamed from: r */
    private static cb f2831r = null;
    /* renamed from: s */
    public static final int f2832s = 100137;
    /* renamed from: t */
    private static String f2833t = null;
    /* renamed from: u */
    public static final int f2834u = 2;
    /* renamed from: v */
    private static HostnameVerifier f2835v = null;
    /* renamed from: z */
    private static final String[] f2836z;

    static {
        r0 = new String[28];
        r0[0] = C0990o.m7221z(C0990o.m7222z("\u0007o:\u000e,"));
        r0[1] = C0990o.m7221z(C0990o.m7222z("\u0015|#\u0018"));
        r0[2] = C0990o.m7221z(C0990o.m7222z("BZ\u0017?\u0005$O\u0003"));
        r0[3] = C0990o.m7221z(C0990o.m7222z("BM\u00192\u0002(K"));
        r0[4] = C0990o.m7221z(C0990o.m7222z("BM\u00193\u001f$\\\u00054\u0006/Q\u001f0\u0019.]\u00054\u000b-K"));
        r0[5] = C0990o.m7221z(C0990o.m7222z("$m>\u0018*Aj3]%\u0000.5\u000f \u0000z?\u0012'Ajq\b'\u0004.?\u0013:\u0015o8\u001e,Aj3]\u001a2B\u0005\u0012*\nk\";(\u0002z9\u000f0"));
        r0[6] = C0990o.m7221z(C0990o.m7222z("5B\u0005"));
        r0[7] = C0990o.m7221z(C0990o.m7222z("BH\u00193\n5G\u00193\u0016/A\u0018\"\u0000,^\u001a8\u0004$@\u00028\f"));
        r0[8] = C0990o.m7221z(C0990o.m7222z("BG\u001b-\u00062]\u001f?\u0005$Q\u001a2\n B\u001f.\f3Q\u00058\u001b7K\u0003/"));
        r0[9] = C0990o.m7221z(C0990o.m7222z("$|$\u0018<\u0013.2\b;\u0000`\"]%\u0000.$*\u0014~¿\u000f(\u0015g9\u0013i\u0005{v\u000f \u0012{:\t(\u0015.2\u0018i\rov\u000f,\u0010{¼\t,AF\u0002)\u0019"));
        r0[10] = C0990o.m7221z(C0990o.m7222z("B^\u00042\u000b-K\u001b8\u00162A\u00156\f5"));
        r0[11] = C0990o.m7221z(C0990o.m7222z("BH\u0019/\u00044B\u00174\u001b$Q\u001e)\u001d1Q\u001f3\f9G\u0005)\b/Z"));
        r0[12] = C0990o.m7221z(C0990o.m7222z("+o#\u001a,Aj3]9\u0013a1\u000f,\u0012}?\u0012'Aj3]%\u0000.$\u00188\u0014ä\"\u000f,AF\u0002)\u0019A`9\u0013i\u0015|9\b?kx"));
        r0[13] = C0990o.m7221z(C0990o.m7222z("\"a8\t,\u000fz{)0\u0011k"));
        r0[14] = C0990o.m7221z(C0990o.m7222z("\tz\"\r:[!y"));
        r0[15] = C0990o.m7221z(C0990o.m7222z("4}3\u000fd i3\u0013="));
        r0[16] = C0990o.m7221z(C0990o.m7222z("&K\u0002"));
        r0[17] = C0990o.m7221z(C0990o.m7222z("BO\u0012/\f2]\u0013\"\u001a$\\\u00008\u001c3Q\u001b<\u00070[\u00173\u001d$"));
        r0[18] = C0990o.m7221z(C0990o.m7222z("BK\u0004/\f4\\\t5\u001d5^\u0005"));
        r0[19] = C0990o.m7221z(C0990o.m7222z("BK\u0004/\f4\\\t/\f0[\u0013)\f>F\u0002)\u0019"));
        r0[20] = C0990o.m7221z(C0990o.m7222z("1A\u0005)"));
        r0[21] = C0990o.m7221z(C0990o.m7222z(" {\"\u0015&\u0013g,\u001c=\ba8"));
        r0[22] = C0990o.m7221z(C0990o.m7222z("\tz\"\rsN!"));
        r0[23] = C0990o.m7221z(C0990o.m7222z("1|9\u00050LO#\t!\u000e|?\u0007(\u0015g9\u0013"));
        r0[24] = C0990o.m7221z(C0990o.m7222z("BA\u0003+\f3Z\u0003/\f>G\u001b-\u00062]\u001f?\u0005$"));
        r0[25] = C0990o.m7221z(C0990o.m7222z("BH\u001f>\u0001(K\u0004\"\u0000/Z\u00042\u001c7O\u00141\f"));
        r0[26] = C0990o.m7221z(C0990o.m7222z("B^\u0017/\b,Q\u001f3\u001f B\u001f9\f>C\u0013)\u0001.J\u0013\"\u00015Z\u0006"));
        r0[27] = C0990o.m7221z(C0990o.m7222z("BH\u0019/\u00044B\u00174\u001b$Q\u001e)\u001d1Q\u00004\r$"));
        f2836z = r0;
    }

    /* renamed from: a */
    public static final int m7186a() {
        return f2828o;
    }

    /* renamed from: a */
    public static final long m7187a(String str, WDHTTPRequete wDHTTPRequete) throws C1011t, WDJNIException {
        try {
            if (f2819f) {
                return WDJNIHelper.m6644b(10, 310, str, wDHTTPRequete.getIdentifiantJNI());
            }
            C0990o.m7220i();
            return -1;
        } catch (C1011t e) {
            throw e;
        }
    }

    /* renamed from: a */
    public static final WDObjet m7188a(WDObjet wDObjet, boolean z) throws C0539d {
        if (f2819f) {
            WDHTTPRequete wDHTTPRequete = (WDHTTPRequete) wDObjet.checkType(WDHTTPRequete.class);
            if (wDHTTPRequete == null) {
                return new WDHTTPReponse(WDJNIHelper.m6677c(10, 420, wDObjet.getString()));
            }
            wDHTTPRequete.m7092f();
            WDObjet wDHTTPReponse = new WDHTTPReponse(WDJNIHelper.m6676c(10, 420, wDHTTPRequete.getIdentifiantJNI()));
            try {
                if (wDHTTPReponse.m7081d() == 401 && z) {
                    if (wDHTTPRequete.m7093g()) {
                        WDAuthToken e = wDHTTPRequete.m7091e();
                        if (e.m7255b()) {
                            OAuth2Token a = WDOAuth2Manager.m7300a(e.m7253a());
                            if (a != null) {
                                try {
                                    e.m7254a(a);
                                    return C0990o.m7188a(wDObjet, false);
                                } catch (C0539d e2) {
                                    throw e2;
                                }
                            }
                        }
                    }
                }
                return wDHTTPReponse;
            } catch (C0539d e22) {
                throw e22;
            } catch (C0539d e222) {
                throw e222;
            }
        }
        C0990o.m7220i();
        return null;
    }

    /* renamed from: a */
    public static final String m7189a(WDHTTPRequete wDHTTPRequete, String str, String str2) throws WDJNIException {
        try {
            if (f2819f) {
                return wDHTTPRequete != null ? WDJNIHelper.m6571a(10, 381, wDHTTPRequete.getIdentifiantJNI(), str, str2) : WDJNIHelper.m6572a(10, 381, str, str2);
            } else {
                C0990o.m7220i();
                return "";
            }
        } catch (WDJNIException e) {
            throw e;
        } catch (WDJNIException e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    public static final synchronized void m7190a(int i) throws WDJNIException {
        synchronized (C0990o.class) {
            try {
                if (f2819f) {
                    WDJNIHelper.m6731k(10, 138, i);
                }
                if (i != f2828o) {
                    if (f2831r != null) {
                        f2831r.release();
                        f2831r = null;
                    }
                    f2828o = Math.max(10, i);
                }
            } catch (WDJNIException e) {
                throw e;
            } catch (WDJNIException e2) {
                throw e2;
            } catch (WDJNIException e22) {
                throw e22;
            }
        }
        return;
    }

    /* renamed from: a */
    public static final void m7191a(int i, int i2) throws WDJNIException {
        try {
            if (f2819f) {
                WDJNIHelper.m6575a(10, 426, i, i2);
            } else {
                WDErreurManager.m2883a(C0745b.m3222b(f2836z[7], new String[0]));
            }
        } catch (WDJNIException e) {
            throw e;
        }
    }

    /* renamed from: a */
    public static final synchronized void m7192a(C0486m c0486m, int i) throws WDJNIException {
        String str = null;
        synchronized (C0990o.class) {
            try {
                if (!f2819f) {
                    try {
                        f2814a = null;
                        f2833t = null;
                        f2821h = Math.max(10, i);
                        C1225d c1225d = c0486m instanceof WDObjet ? (C1225d) ((WDObjet) c0486m).checkType(C1225d.class) : null;
                        if (c1225d != null) {
                            f2814a = ((C0489p) c1225d).getName();
                        } else {
                            String obj = c0486m.toString();
                            if (!obj.equals("")) {
                                str = obj;
                            }
                            f2833t = str;
                        }
                    } catch (WDJNIException e) {
                        throw e;
                    } catch (WDJNIException e2) {
                        throw e2;
                    } catch (WDJNIException e22) {
                        throw e22;
                    }
                } else if (c0486m instanceof C1225d) {
                    WDJNIHelper.m6584a(10, 166, WDJaugeJNI.create((WDObjet) c0486m), i);
                } else {
                    WDJNIHelper.m6583a(10, 166, WDCallback.m2239a(c0486m, -1, true), i);
                }
            } catch (WDJNIException e222) {
                throw e222;
            } catch (WDJNIException e2222) {
                throw e2222;
            }
        }
        return;
    }

    /* renamed from: a */
    public static final void m7193a(WDHTTPRequete wDHTTPRequete, String str, WDObjet wDObjet) throws WDJNIException {
        if (f2819f) {
            C0582d c0582d = (C0582d) wDObjet.checkType(C0582d.class);
            if (c0582d != null) {
                long[] jArr = new long[((int) c0582d.mo2483h())];
                for (int i = 0; i < jArr.length; i++) {
                    WDCookie wDCookie = (WDCookie) c0582d.mo2469a((long) i).checkType(WDCookie.class);
                    if (wDCookie != null) {
                        try {
                            jArr[i] = wDCookie.getIdentifiantJNI();
                        } catch (WDJNIException e) {
                            throw e;
                        }
                    }
                    WDErreurManager.m2883a(C0745b.m3222b(f2836z[4], wDObjet.getNomType(), C0745b.m3220a(f2836z[3], new String[0])));
                }
                if (wDHTTPRequete != null) {
                    try {
                        WDJNIHelper.m6582a(10, 379, wDHTTPRequete.getIdentifiantJNI(), str, jArr);
                        return;
                    } catch (WDJNIException e2) {
                        throw e2;
                    }
                }
                WDJNIHelper.m6590a(10, 379, str, jArr);
                return;
            }
            WDErreurManager.m2883a(C0745b.m3222b(f2836z[4], wDObjet.getNomType(), C0745b.m3220a(f2836z[2], new String[0])));
            return;
        }
        C0990o.m7220i();
    }

    /* renamed from: a */
    public static final void m7194a(WDHTTPRequete wDHTTPRequete, String str, String str2, String str3) throws WDJNIException {
        try {
            if (!f2819f) {
                C0990o.m7220i();
            } else if (wDHTTPRequete != null) {
                WDJNIHelper.m6580a(10, 382, wDHTTPRequete.getIdentifiantJNI(), str, str2, str3);
            } else {
                WDJNIHelper.m6586a(10, 382, str, str2, str3);
            }
        } catch (WDJNIException e) {
            throw e;
        } catch (WDJNIException e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    public static final void m7195a(WDHTTPRequete wDHTTPRequete, String str, boolean z) throws WDJNIException {
        try {
            if (!f2819f) {
                C0990o.m7220i();
            } else if (wDHTTPRequete != null) {
                WDJNIHelper.m6581a(10, 377, wDHTTPRequete.getIdentifiantJNI(), str, z);
            } else if (str != null) {
                try {
                    WDJNIHelper.m6589a(10, 377, str, z);
                } catch (WDJNIException e) {
                    throw e;
                }
            } else {
                WDJNIHelper.m6591a(10, 377, z);
            }
        } catch (WDJNIException e2) {
            throw e2;
        } catch (WDJNIException e22) {
            throw e22;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private static final void m7196a(fr.pcsoft.wdjava.net.http.C0983n r5) throws fr.pcsoft.wdjava.net.C1011t {
        /*
        r2 = 0;
        r0 = fr.pcsoft.wdjava.core.context.C0670b.class;
        r0 = fr.pcsoft.wdjava.core.context.WDAppelContexte.m2679a(r0);
        r0 = (fr.pcsoft.wdjava.core.context.C0670b) r0;
        r1 = r0.m2756c();
        r0.m2758e();
        r3 = r5.mo3271b();
        r4 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
        if (r3 < r4) goto L_0x005d;
    L_0x0018:
        r2 = 1;
    L_0x0019:
        if (r1 == 0) goto L_0x00ba;
    L_0x001b:
        r3 = r1.exists();	 Catch:{ SSLHandshakeException -> 0x0098 }
        if (r3 != 0) goto L_0x00ba;
    L_0x0021:
        r1 = 0;
        r3 = r1;
    L_0x0023:
        r1 = r5.mo3275f();	 Catch:{ SSLHandshakeException -> 0x00a6, IOException -> 0x00af }
        r0.m2751a(r1);	 Catch:{ SSLHandshakeException -> 0x00a6, IOException -> 0x00af }
        if (r2 == 0) goto L_0x009a;
    L_0x002c:
        r1 = r5.mo3276g();	 Catch:{ SSLHandshakeException -> 0x00a6, IOException -> 0x00af }
        r2 = r1;
    L_0x0031:
        if (r2 == 0) goto L_0x0055;
    L_0x0033:
        if (r3 == 0) goto L_0x00a0;
    L_0x0035:
        r1 = new java.io.BufferedOutputStream;	 Catch:{ SSLHandshakeException -> 0x00a6, IOException -> 0x00af }
        r4 = new java.io.FileOutputStream;	 Catch:{ SSLHandshakeException -> 0x00a6, IOException -> 0x00af }
        r4.<init>(r3);	 Catch:{ SSLHandshakeException -> 0x00a6, IOException -> 0x00af }
        r1.<init>(r4);	 Catch:{ SSLHandshakeException -> 0x00a6, IOException -> 0x00af }
    L_0x003f:
        r4 = r5.mo3274e();	 Catch:{ SSLHandshakeException -> 0x00ab, IOException -> 0x00af }
        fr.pcsoft.wdjava.net.http.C0990o.m7197a(r2, r1, r4);	 Catch:{ SSLHandshakeException -> 0x00ab, IOException -> 0x00af }
        if (r3 != 0) goto L_0x0055;
    L_0x0048:
        r2 = r1 instanceof java.io.ByteArrayOutputStream;	 Catch:{ SSLHandshakeException -> 0x00ad, IOException -> 0x00af }
        if (r2 == 0) goto L_0x0055;
    L_0x004c:
        r1 = (java.io.ByteArrayOutputStream) r1;	 Catch:{ SSLHandshakeException -> 0x00ad, IOException -> 0x00af }
        r1 = r1.toByteArray();	 Catch:{ SSLHandshakeException -> 0x00ad, IOException -> 0x00af }
        r0.m2753a(r1);	 Catch:{ SSLHandshakeException -> 0x00ad, IOException -> 0x00af }
    L_0x0055:
        r1 = r5.mo3272c();	 Catch:{ SSLHandshakeException -> 0x00a6, IOException -> 0x00af }
        r0.m2755b(r1);	 Catch:{ SSLHandshakeException -> 0x00a6, IOException -> 0x00af }
    L_0x005c:
        return;
    L_0x005d:
        if (r3 >= 0) goto L_0x0019;
    L_0x005f:
        r0 = new fr.pcsoft.wdjava.net.t;	 Catch:{ SSLHandshakeException -> 0x0096 }
        r1 = new java.lang.StringBuilder;	 Catch:{ SSLHandshakeException -> 0x0096 }
        r1.<init>();	 Catch:{ SSLHandshakeException -> 0x0096 }
        r2 = f2836z;	 Catch:{ SSLHandshakeException -> 0x0096 }
        r3 = 8;
        r2 = r2[r3];	 Catch:{ SSLHandshakeException -> 0x0096 }
        r3 = 0;
        r3 = new java.lang.String[r3];	 Catch:{ SSLHandshakeException -> 0x0096 }
        r2 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r2, r3);	 Catch:{ SSLHandshakeException -> 0x0096 }
        r1 = r1.append(r2);	 Catch:{ SSLHandshakeException -> 0x0096 }
        r2 = "\n";
        r1 = r1.append(r2);	 Catch:{ SSLHandshakeException -> 0x0096 }
        r2 = f2836z;	 Catch:{ SSLHandshakeException -> 0x0096 }
        r3 = 10;
        r2 = r2[r3];	 Catch:{ SSLHandshakeException -> 0x0096 }
        r3 = 0;
        r3 = new java.lang.String[r3];	 Catch:{ SSLHandshakeException -> 0x0096 }
        r2 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r2, r3);	 Catch:{ SSLHandshakeException -> 0x0096 }
        r1 = r1.append(r2);	 Catch:{ SSLHandshakeException -> 0x0096 }
        r1 = r1.toString();	 Catch:{ SSLHandshakeException -> 0x0096 }
        r0.<init>(r1);	 Catch:{ SSLHandshakeException -> 0x0096 }
        throw r0;	 Catch:{ SSLHandshakeException -> 0x0096 }
    L_0x0096:
        r0 = move-exception;
        throw r0;
    L_0x0098:
        r0 = move-exception;
        throw r0;
    L_0x009a:
        r1 = r5.mo3270a();	 Catch:{ SSLHandshakeException -> 0x00a6, IOException -> 0x00af }
        r2 = r1;
        goto L_0x0031;
    L_0x00a0:
        r1 = new java.io.ByteArrayOutputStream;	 Catch:{ SSLHandshakeException -> 0x00a6, IOException -> 0x00af }
        r1.<init>();	 Catch:{ SSLHandshakeException -> 0x00a6, IOException -> 0x00af }
        goto L_0x003f;
    L_0x00a6:
        r0 = move-exception;
        fr.pcsoft.wdjava.net.http.C0990o.m7202a(r0);
        goto L_0x005c;
    L_0x00ab:
        r0 = move-exception;
        throw r0;	 Catch:{ SSLHandshakeException -> 0x00ad, IOException -> 0x00af }
    L_0x00ad:
        r0 = move-exception;
        throw r0;	 Catch:{ SSLHandshakeException -> 0x00a6, IOException -> 0x00af }
    L_0x00af:
        r0 = move-exception;
        r1 = f2836z;
        r2 = 9;
        r1 = r1[r2];
        fr.pcsoft.wdjava.core.debug.C0691a.m2857a(r1, r0);
        goto L_0x005c;
    L_0x00ba:
        r3 = r1;
        goto L_0x0023;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.net.http.o.a(fr.pcsoft.wdjava.net.http.n):void");
    }

    /* renamed from: a */
    private static final void m7197a(InputStream inputStream, OutputStream outputStream, int i) throws IOException {
        WDCallback wDCallback;
        C1225d c1225d;
        if (f2814a != null) {
            try {
                wDCallback = null;
                c1225d = (C1225d) C1502a.m10417a(new WDChaine(f2814a), C1225d.class);
            } catch (Exception e) {
                C0691a.m2857a(f2836z[12], e);
                wDCallback = null;
                c1225d = null;
            }
        } else if (f2833t != null) {
            wDCallback = WDCallback.m2240a(f2833t, -1);
            c1225d = null;
        } else {
            wDCallback = null;
            c1225d = null;
        }
        try {
            int abs = Math.abs(i);
            int min = (c1225d == null && wDCallback == null) ? Math.min(abs, 8192) : f2821h;
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (true) {
                int read = inputStream.read(bArr, 0, min);
                if (read == -1) {
                    break;
                }
                outputStream.write(bArr, 0, read);
                i2 += read;
                if (c1225d != null) {
                    c1225d.setProgressValue(i2, 0, abs);
                } else if (wDCallback != null) {
                    read = wDCallback.m2260b();
                    WDObjet[] wDObjetArr = new WDObjet[read];
                    if (read > 0) {
                        wDObjetArr[0] = WDCallback.m2247a(abs);
                    }
                    if (read > 1) {
                        wDObjetArr[1] = WDCallback.m2247a(i2);
                    }
                    wDCallback.execute(wDObjetArr);
                } else {
                    continue;
                }
            }
            outputStream.flush();
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e2) {
                }
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e3) {
                }
            }
        } catch (Exception e4) {
            throw e4;
        } catch (Exception e42) {
            throw e42;
        } catch (Exception e422) {
            throw e422;
        } catch (Throwable th) {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e5) {
                }
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e6) {
                }
            }
        }
    }

    /* renamed from: a */
    public static final synchronized void m7198a(String str) throws WDJNIException {
        synchronized (C0990o.class) {
            try {
                if (f2819f) {
                    WDJNIHelper.m6709e(10, 305, C0897o.m6290j(str).getPath());
                } else {
                    try {
                        ((C0670b) WDAppelContexte.m2679a(C0670b.class)).m2750a(C0897o.m6239a(str, false));
                    } catch (C0539d e) {
                        WDErreurManager.m2875a(e);
                    }
                }
            } catch (C0901s e2) {
                throw e2;
            }
        }
        return;
    }

    /* renamed from: a */
    public static final synchronized void m7199a(String str, int i, String str2, String str3) throws WDJNIException {
        synchronized (C0990o.class) {
            try {
                Properties properties;
                if (f2819f) {
                    WDJNIHelper.m6651b(10, C0607n.Wj, str, i, str2, str3);
                }
                if (f2831r != null) {
                    f2831r.release();
                    f2831r = null;
                }
                if (str != null) {
                    if (!str.equals("")) {
                        if (f2826m == null) {
                            f2826m = new C0976a();
                        }
                        f2826m.f2774c = str;
                        f2826m.f2773b = i;
                        f2826m.f2772a = str2;
                        f2826m.f2775d = str3;
                        properties = System.getProperties();
                        properties.put(f2817d, f2836z[1]);
                        properties.put(f2816c, str);
                        properties.put(f2823j, "" + i);
                    }
                }
                properties = System.getProperties();
                properties.put(f2817d, f2836z[0]);
                properties.remove(f2816c);
                properties.remove(f2823j);
                f2826m = null;
            } catch (WDJNIException e) {
                throw e;
            } catch (WDJNIException e2) {
                throw e2;
            } catch (WDJNIException e22) {
                throw e22;
            } catch (WDJNIException e222) {
                throw e222;
            }
        }
        return;
    }

    /* renamed from: a */
    public static final void m7200a(String str, String str2, WDObjet wDObjet) throws WDJNIException {
        try {
            if (f2819f) {
                WDJNIHelper.m6588a(10, 309, str, str2, wDObjet.getDonneeBinaire());
                return;
            }
            WDHTTPForm d = C0990o.m7213d(str);
            if (d == null) {
                try {
                    WDErreurManager.m2883a(C0745b.m3222b(f2836z[11], str));
                } catch (WDJNIException e) {
                    throw e;
                }
            }
            d.addParam(str2, wDObjet);
        } catch (WDJNIException e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    public static final void m7201a(String str, String str2, String str3, String str4) throws WDJNIException {
        try {
            if (f2819f) {
                WDJNIHelper.m6587a(10, 311, str, str2, C0897o.m6290j(str3).getPath(), str4);
                return;
            }
            WDHTTPForm d = C0990o.m7213d(str);
            if (d == null) {
                try {
                    WDErreurManager.m2883a(C0745b.m3222b(f2836z[11], str));
                } catch (WDJNIException e) {
                    throw e;
                }
            }
            File j = C0897o.m6290j(str3);
            try {
                if (!j.exists()) {
                    String[] strArr = new String[2];
                    strArr[0] = C0745b.m3222b(f2836z[24], j.getPath());
                    strArr[1] = C0745b.m3222b(f2836z[25], new String[0]);
                    WDErreurManager.m2886a(strArr);
                }
                d.addFile(str2, j, str4);
            } catch (WDJNIException e2) {
                throw e2;
            }
        } catch (WDJNIException e22) {
            throw e22;
        }
    }

    /* renamed from: a */
    private static final void m7202a(SSLHandshakeException sSLHandshakeException) throws C1011t {
        Throwable cause = sSLHandshakeException.getCause();
        try {
            if (!(cause instanceof CertificateException)) {
                throw new C1011t(cause.getMessage());
            } else if (cause instanceof CertificateExpiredException) {
                throw new C1011t((int) f2829p, cause.getMessage());
            } else {
                throw new C1011t((int) f2832s, cause.getMessage());
            }
        } catch (C1011t e) {
            throw e;
        } catch (C1011t e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public static final boolean m7203a(java.lang.String r12, java.lang.String r13, int r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19) throws fr.pcsoft.wdjava.net.C1011t, fr.pcsoft.wdjava.jni.WDJNIException {
        /*
        r2 = f2819f;	 Catch:{ t -> 0x0019 }
        if (r2 == 0) goto L_0x001b;
    L_0x0004:
        r2 = 10;
        r3 = 310; // 0x136 float:4.34E-43 double:1.53E-321;
        r4 = r12;
        r5 = r13;
        r6 = r14;
        r7 = r13;
        r8 = r16;
        r9 = r17;
        r10 = r18;
        r11 = r19;
        r2 = fr.pcsoft.wdjava.jni.WDJNIHelper.m6630a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11);	 Catch:{ t -> 0x0019 }
    L_0x0018:
        return r2;
    L_0x0019:
        r2 = move-exception;
        throw r2;
    L_0x001b:
        r3 = fr.pcsoft.wdjava.net.http.C0990o.m7213d(r12);
        if (r3 != 0) goto L_0x0034;
    L_0x0021:
        r2 = f2836z;	 Catch:{ t -> 0x009d }
        r4 = 11;
        r2 = r2[r4];	 Catch:{ t -> 0x009d }
        r4 = 1;
        r4 = new java.lang.String[r4];	 Catch:{ t -> 0x009d }
        r5 = 0;
        r4[r5] = r12;	 Catch:{ t -> 0x009d }
        r2 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r2, r4);	 Catch:{ t -> 0x009d }
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2883a(r2);	 Catch:{ t -> 0x009d }
    L_0x0034:
        r2 = 1;
        if (r14 == r2) goto L_0x003a;
    L_0x0037:
        r2 = 4;
        if (r14 != r2) goto L_0x00a1;
    L_0x003a:
        r2 = r3.getNbFiles();	 Catch:{ t -> 0x009f }
        if (r2 <= 0) goto L_0x00a1;
    L_0x0040:
        r2 = f2836z;	 Catch:{ t -> 0x009f }
        r4 = 26;
        r2 = r2[r4];	 Catch:{ t -> 0x009f }
        r4 = 0;
        r4 = new java.lang.String[r4];	 Catch:{ t -> 0x009f }
        r2 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r2, r4);	 Catch:{ t -> 0x009f }
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2883a(r2);	 Catch:{ t -> 0x009f }
    L_0x0050:
        r2 = fr.pcsoft.wdjava.core.utils.C0808l.m4053k(r15);	 Catch:{ t -> 0x00cb }
        if (r2 != 0) goto L_0x005e;
    L_0x0056:
        r2 = f2830q;	 Catch:{ t -> 0x00cd }
        r2 = r15.equals(r2);	 Catch:{ t -> 0x00cd }
        if (r2 == 0) goto L_0x0064;
    L_0x005e:
        r2 = fr.pcsoft.wdjava.core.utils.C0808l.m4053k(r18);	 Catch:{ t -> 0x00cd }
        if (r2 != 0) goto L_0x00d5;
    L_0x0064:
        r2 = 0;
        r2 = fr.pcsoft.wdjava.net.http.cb.m7063a(r2);
        r4 = fr.pcsoft.wdjava.core.utils.C0808l.m4053k(r15);	 Catch:{ t -> 0x00cf }
        if (r4 != 0) goto L_0x007a;
    L_0x006f:
        r4 = f2830q;	 Catch:{ t -> 0x00d1 }
        r4 = r15.equals(r4);	 Catch:{ t -> 0x00d1 }
        if (r4 != 0) goto L_0x007a;
    L_0x0077:
        r2.m7071a(r15);	 Catch:{ t -> 0x00d1 }
    L_0x007a:
        r4 = fr.pcsoft.wdjava.core.utils.C0808l.m4053k(r18);	 Catch:{ t -> 0x00d3 }
        if (r4 != 0) goto L_0x0087;
    L_0x0080:
        r0 = r18;
        r1 = r19;
        r2.m7072a(r0, r1);	 Catch:{ t -> 0x00d3 }
    L_0x0087:
        r8 = 0;
        r4 = r13;
        r5 = r14;
        r6 = r16;
        r7 = r17;
        r3 = r2.m7069a(r3, r4, r5, r6, r7);	 Catch:{ all -> 0x00da }
        fr.pcsoft.wdjava.net.http.C0990o.m7196a(r3);	 Catch:{ all -> 0x00e4 }
        if (r3 == 0) goto L_0x009a;
    L_0x0097:
        r3.mo3273d();
    L_0x009a:
        r2 = 1;
        goto L_0x0018;
    L_0x009d:
        r2 = move-exception;
        throw r2;
    L_0x009f:
        r2 = move-exception;
        throw r2;
    L_0x00a1:
        r2 = 3;
        if (r14 == r2) goto L_0x00a7;
    L_0x00a4:
        r2 = 2;
        if (r14 != r2) goto L_0x0050;
    L_0x00a7:
        r2 = r3.getNbFiles();	 Catch:{ t -> 0x00c9 }
        if (r2 != 0) goto L_0x0050;
    L_0x00ad:
        r2 = r3.getNbParams();	 Catch:{ t -> 0x00c7 }
        if (r2 != 0) goto L_0x0050;
    L_0x00b3:
        r2 = f2836z;	 Catch:{ t -> 0x00c7 }
        r4 = 27;
        r2 = r2[r4];	 Catch:{ t -> 0x00c7 }
        r4 = 1;
        r4 = new java.lang.String[r4];	 Catch:{ t -> 0x00c7 }
        r5 = 0;
        r4[r5] = r12;	 Catch:{ t -> 0x00c7 }
        r2 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r2, r4);	 Catch:{ t -> 0x00c7 }
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2883a(r2);	 Catch:{ t -> 0x00c7 }
        goto L_0x0050;
    L_0x00c7:
        r2 = move-exception;
        throw r2;
    L_0x00c9:
        r2 = move-exception;
        throw r2;	 Catch:{ t -> 0x00c7 }
    L_0x00cb:
        r2 = move-exception;
        throw r2;	 Catch:{ t -> 0x00cd }
    L_0x00cd:
        r2 = move-exception;
        throw r2;
    L_0x00cf:
        r2 = move-exception;
        throw r2;	 Catch:{ t -> 0x00d1 }
    L_0x00d1:
        r2 = move-exception;
        throw r2;
    L_0x00d3:
        r2 = move-exception;
        throw r2;
    L_0x00d5:
        r2 = fr.pcsoft.wdjava.net.http.C0990o.m7211c();
        goto L_0x0087;
    L_0x00da:
        r2 = move-exception;
        r3 = r8;
    L_0x00dc:
        if (r3 == 0) goto L_0x00e1;
    L_0x00de:
        r3.mo3273d();	 Catch:{ t -> 0x00e2 }
    L_0x00e1:
        throw r2;
    L_0x00e2:
        r2 = move-exception;
        throw r2;
    L_0x00e4:
        r2 = move-exception;
        goto L_0x00dc;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.net.http.o.a(java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public static final boolean m7204a(java.lang.String r11, java.lang.String r12, java.lang.String r13, fr.pcsoft.wdjava.core.WDObjet r14, java.lang.String r15, java.lang.String r16, java.lang.String r17) throws fr.pcsoft.wdjava.net.C1011t, fr.pcsoft.wdjava.jni.WDJNIException {
        /*
        r1 = f2819f;	 Catch:{ MalformedURLException -> 0x001b }
        if (r1 == 0) goto L_0x0021;
    L_0x0004:
        r1 = 10;
        r2 = 61;
        if (r14 == 0) goto L_0x001f;
    L_0x000a:
        r6 = r14.getDonneeBinaire();	 Catch:{ MalformedURLException -> 0x001d }
    L_0x000e:
        r3 = r11;
        r4 = r12;
        r5 = r13;
        r7 = r15;
        r8 = r16;
        r9 = r17;
        r1 = fr.pcsoft.wdjava.jni.WDJNIHelper.m6635a(r1, r2, r3, r4, r5, r6, r7, r8, r9);
    L_0x001a:
        return r1;
    L_0x001b:
        r1 = move-exception;
        throw r1;	 Catch:{ MalformedURLException -> 0x001d }
    L_0x001d:
        r1 = move-exception;
        throw r1;
    L_0x001f:
        r6 = 0;
        goto L_0x000e;
    L_0x0021:
        if (r11 == 0) goto L_0x002b;
    L_0x0023:
        r1 = "";
        r1 = r11.equals(r1);	 Catch:{ MalformedURLException -> 0x003e }
        if (r1 == 0) goto L_0x0040;
    L_0x002b:
        r1 = new fr.pcsoft.wdjava.net.t;	 Catch:{ MalformedURLException -> 0x003e }
        r2 = f2836z;	 Catch:{ MalformedURLException -> 0x003e }
        r3 = 17;
        r2 = r2[r3];	 Catch:{ MalformedURLException -> 0x003e }
        r3 = 0;
        r3 = new java.lang.String[r3];	 Catch:{ MalformedURLException -> 0x003e }
        r2 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r2, r3);	 Catch:{ MalformedURLException -> 0x003e }
        r1.<init>(r2);	 Catch:{ MalformedURLException -> 0x003e }
        throw r1;	 Catch:{ MalformedURLException -> 0x003e }
    L_0x003e:
        r1 = move-exception;
        throw r1;
    L_0x0040:
        r1 = r11.toLowerCase();
        r2 = f2836z;	 Catch:{ MalformedURLException -> 0x0107 }
        r3 = 22;
        r2 = r2[r3];	 Catch:{ MalformedURLException -> 0x0107 }
        r2 = r1.startsWith(r2);	 Catch:{ MalformedURLException -> 0x0107 }
        if (r2 != 0) goto L_0x0109;
    L_0x0050:
        r2 = f2836z;	 Catch:{ MalformedURLException -> 0x0107 }
        r3 = 14;
        r2 = r2[r3];	 Catch:{ MalformedURLException -> 0x0107 }
        r2 = r1.startsWith(r2);	 Catch:{ MalformedURLException -> 0x0107 }
        if (r2 != 0) goto L_0x0109;
    L_0x005c:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = f2836z;
        r3 = 22;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r1 = r1.append(r11);
        r11 = r1.toString();
    L_0x0073:
        r2 = 0;
        r3 = 0;
        r1 = f2826m;	 Catch:{ MalformedURLException -> 0x013c, SSLHandshakeException -> 0x0187, IOException -> 0x0190 }
        if (r1 == 0) goto L_0x0178;
    L_0x0079:
        r1 = f2817d;	 Catch:{ MalformedURLException -> 0x0138, SSLHandshakeException -> 0x0187, IOException -> 0x0190 }
        r1 = java.lang.System.getProperty(r1);	 Catch:{ MalformedURLException -> 0x0138, SSLHandshakeException -> 0x0187, IOException -> 0x0190 }
        if (r1 == 0) goto L_0x0178;
    L_0x0081:
        r1 = f2817d;	 Catch:{ MalformedURLException -> 0x013a, SSLHandshakeException -> 0x0187, IOException -> 0x0190 }
        r1 = java.lang.System.getProperty(r1);	 Catch:{ MalformedURLException -> 0x013a, SSLHandshakeException -> 0x0187, IOException -> 0x0190 }
        r4 = f2836z;	 Catch:{ MalformedURLException -> 0x013a, SSLHandshakeException -> 0x0187, IOException -> 0x0190 }
        r5 = 1;
        r4 = r4[r5];	 Catch:{ MalformedURLException -> 0x013a, SSLHandshakeException -> 0x0187, IOException -> 0x0190 }
        r1 = r1.equals(r4);	 Catch:{ MalformedURLException -> 0x013a, SSLHandshakeException -> 0x0187, IOException -> 0x0190 }
        if (r1 == 0) goto L_0x0178;
    L_0x0092:
        r1 = 1;
        r5 = r1;
    L_0x0094:
        r1 = new java.net.URL;	 Catch:{ MalformedURLException -> 0x013c, SSLHandshakeException -> 0x0187, IOException -> 0x0190 }
        r1.<init>(r11);	 Catch:{ MalformedURLException -> 0x013c, SSLHandshakeException -> 0x0187, IOException -> 0x0190 }
        if (r5 == 0) goto L_0x017c;
    L_0x009b:
        r4 = new java.net.Proxy;	 Catch:{ MalformedURLException -> 0x013c, SSLHandshakeException -> 0x0187, IOException -> 0x0190 }
        r6 = java.net.Proxy.Type.HTTP;	 Catch:{ MalformedURLException -> 0x013c, SSLHandshakeException -> 0x0187, IOException -> 0x0190 }
        r7 = new java.net.InetSocketAddress;	 Catch:{ MalformedURLException -> 0x013c, SSLHandshakeException -> 0x0187, IOException -> 0x0190 }
        r8 = f2826m;	 Catch:{ MalformedURLException -> 0x013c, SSLHandshakeException -> 0x0187, IOException -> 0x0190 }
        r8 = r8.f2774c;	 Catch:{ MalformedURLException -> 0x013c, SSLHandshakeException -> 0x0187, IOException -> 0x0190 }
        r9 = f2826m;	 Catch:{ MalformedURLException -> 0x013c, SSLHandshakeException -> 0x0187, IOException -> 0x0190 }
        r9 = r9.f2773b;	 Catch:{ MalformedURLException -> 0x013c, SSLHandshakeException -> 0x0187, IOException -> 0x0190 }
        r7.<init>(r8, r9);	 Catch:{ MalformedURLException -> 0x013c, SSLHandshakeException -> 0x0187, IOException -> 0x0190 }
        r4.<init>(r6, r7);	 Catch:{ MalformedURLException -> 0x013c, SSLHandshakeException -> 0x0187, IOException -> 0x0190 }
        r1 = r1.openConnection(r4);	 Catch:{ MalformedURLException -> 0x013c, SSLHandshakeException -> 0x0187, IOException -> 0x0190 }
        r1 = (java.net.HttpURLConnection) r1;	 Catch:{ MalformedURLException -> 0x013c, SSLHandshakeException -> 0x0187, IOException -> 0x0190 }
        r3 = r1;
    L_0x00b6:
        r1 = r3 instanceof javax.net.ssl.HttpsURLConnection;	 Catch:{ MalformedURLException -> 0x013c, SSLHandshakeException -> 0x0187, IOException -> 0x0190 }
        if (r1 == 0) goto L_0x00cb;
    L_0x00ba:
        r4 = 1;
        r1 = fr.pcsoft.wdjava.core.context.C0670b.class;
        r1 = fr.pcsoft.wdjava.core.context.WDAppelContexte.m2679a(r1);	 Catch:{ MalformedURLException -> 0x013c, SSLHandshakeException -> 0x0187, IOException -> 0x03a7 }
        r1 = (fr.pcsoft.wdjava.core.context.C0670b) r1;	 Catch:{ MalformedURLException -> 0x013c, SSLHandshakeException -> 0x0187, IOException -> 0x03a7 }
        r0 = r3;
        r0 = (javax.net.ssl.HttpsURLConnection) r0;	 Catch:{ MalformedURLException -> 0x013c, SSLHandshakeException -> 0x0187, IOException -> 0x03a7 }
        r2 = r0;
        r1.m2752a(r2);	 Catch:{ MalformedURLException -> 0x013c, SSLHandshakeException -> 0x0187, IOException -> 0x03a7 }
        r2 = r4;
    L_0x00cb:
        r1 = f2828o;	 Catch:{ MalformedURLException -> 0x0185, SSLHandshakeException -> 0x0187, IOException -> 0x0190 }
        r3.setConnectTimeout(r1);	 Catch:{ MalformedURLException -> 0x0185, SSLHandshakeException -> 0x0187, IOException -> 0x0190 }
        if (r5 == 0) goto L_0x0101;
    L_0x00d2:
        r1 = f2826m;	 Catch:{ MalformedURLException -> 0x0185, SSLHandshakeException -> 0x0187, IOException -> 0x0190 }
        r1 = r1.f2774c;	 Catch:{ MalformedURLException -> 0x0185, SSLHandshakeException -> 0x0187, IOException -> 0x0190 }
        java.net.InetAddress.getByName(r1);	 Catch:{ MalformedURLException -> 0x0185, SSLHandshakeException -> 0x0187, IOException -> 0x0190 }
        r3.usingProxy();	 Catch:{ MalformedURLException -> 0x0185, SSLHandshakeException -> 0x0187, IOException -> 0x0190 }
        r1 = f2826m;	 Catch:{ MalformedURLException -> 0x0185, SSLHandshakeException -> 0x0187, IOException -> 0x0190 }
        r1 = r1.f2772a;	 Catch:{ MalformedURLException -> 0x0185, SSLHandshakeException -> 0x0187, IOException -> 0x0190 }
        r1 = fr.pcsoft.wdjava.core.utils.C0808l.m4053k(r1);	 Catch:{ MalformedURLException -> 0x0185, SSLHandshakeException -> 0x0187, IOException -> 0x0190 }
        if (r1 != 0) goto L_0x0101;
    L_0x00e6:
        r1 = f2826m;	 Catch:{ MalformedURLException -> 0x013c, SSLHandshakeException -> 0x0187, IOException -> 0x0190 }
        r1 = r1.f2772a;	 Catch:{ MalformedURLException -> 0x013c, SSLHandshakeException -> 0x0187, IOException -> 0x0190 }
        r4 = f2826m;	 Catch:{ MalformedURLException -> 0x013c, SSLHandshakeException -> 0x0187, IOException -> 0x0190 }
        r4 = r4.f2775d;	 Catch:{ MalformedURLException -> 0x013c, SSLHandshakeException -> 0x0187, IOException -> 0x0190 }
        r1 = fr.pcsoft.wdjava.net.C0974g.m7038a(r1, r4);	 Catch:{ MalformedURLException -> 0x013c, SSLHandshakeException -> 0x0187, IOException -> 0x0190 }
        r4 = fr.pcsoft.wdjava.core.utils.C0808l.m4053k(r1);	 Catch:{ MalformedURLException -> 0x018e, SSLHandshakeException -> 0x0187, IOException -> 0x0190 }
        if (r4 != 0) goto L_0x0101;
    L_0x00f8:
        r4 = f2836z;	 Catch:{ MalformedURLException -> 0x018e, SSLHandshakeException -> 0x0187, IOException -> 0x0190 }
        r5 = 23;
        r4 = r4[r5];	 Catch:{ MalformedURLException -> 0x018e, SSLHandshakeException -> 0x0187, IOException -> 0x0190 }
        r3.setRequestProperty(r4, r1);	 Catch:{ MalformedURLException -> 0x018e, SSLHandshakeException -> 0x0187, IOException -> 0x0190 }
    L_0x0101:
        r4 = r3;
    L_0x0102:
        if (r4 != 0) goto L_0x0222;
    L_0x0104:
        r1 = 0;
        goto L_0x001a;
    L_0x0107:
        r1 = move-exception;
        throw r1;
    L_0x0109:
        r2 = f2836z;	 Catch:{ MalformedURLException -> 0x0136 }
        r3 = 22;
        r2 = r2[r3];	 Catch:{ MalformedURLException -> 0x0136 }
        r2 = r1.equals(r2);	 Catch:{ MalformedURLException -> 0x0136 }
        if (r2 != 0) goto L_0x0121;
    L_0x0115:
        r2 = f2836z;	 Catch:{ MalformedURLException -> 0x0134 }
        r3 = 14;
        r2 = r2[r3];	 Catch:{ MalformedURLException -> 0x0134 }
        r1 = r1.equals(r2);	 Catch:{ MalformedURLException -> 0x0134 }
        if (r1 == 0) goto L_0x0073;
    L_0x0121:
        r1 = new fr.pcsoft.wdjava.net.t;	 Catch:{ MalformedURLException -> 0x0134 }
        r2 = f2836z;	 Catch:{ MalformedURLException -> 0x0134 }
        r3 = 17;
        r2 = r2[r3];	 Catch:{ MalformedURLException -> 0x0134 }
        r3 = 0;
        r3 = new java.lang.String[r3];	 Catch:{ MalformedURLException -> 0x0134 }
        r2 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r2, r3);	 Catch:{ MalformedURLException -> 0x0134 }
        r1.<init>(r2);	 Catch:{ MalformedURLException -> 0x0134 }
        throw r1;	 Catch:{ MalformedURLException -> 0x0134 }
    L_0x0134:
        r1 = move-exception;
        throw r1;
    L_0x0136:
        r1 = move-exception;
        throw r1;	 Catch:{ MalformedURLException -> 0x0134 }
    L_0x0138:
        r1 = move-exception;
        throw r1;	 Catch:{ MalformedURLException -> 0x013a, SSLHandshakeException -> 0x0187, IOException -> 0x0190 }
    L_0x013a:
        r1 = move-exception;
        throw r1;	 Catch:{ MalformedURLException -> 0x013c, SSLHandshakeException -> 0x0187, IOException -> 0x0190 }
    L_0x013c:
        r1 = move-exception;
        r2 = new fr.pcsoft.wdjava.net.t;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = f2836z;
        r5 = 8;
        r4 = r4[r5];
        r5 = 0;
        r5 = new java.lang.String[r5];
        r4 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r4, r5);
        r3 = r3.append(r4);
        r4 = "\n";
        r3 = r3.append(r4);
        r4 = f2836z;
        r5 = 10;
        r4 = r4[r5];
        r5 = 0;
        r5 = new java.lang.String[r5];
        r4 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r4, r5);
        r3 = r3.append(r4);
        r3 = r3.toString();
        r1 = r1.getMessage();
        r2.<init>(r3, r1);
        throw r2;
    L_0x0178:
        r1 = 0;
        r5 = r1;
        goto L_0x0094;
    L_0x017c:
        r1 = r1.openConnection();	 Catch:{ MalformedURLException -> 0x013c, SSLHandshakeException -> 0x0187, IOException -> 0x0190 }
        r1 = (java.net.HttpURLConnection) r1;	 Catch:{ MalformedURLException -> 0x013c, SSLHandshakeException -> 0x0187, IOException -> 0x0190 }
        r3 = r1;
        goto L_0x00b6;
    L_0x0185:
        r1 = move-exception;
        throw r1;	 Catch:{ MalformedURLException -> 0x013c, SSLHandshakeException -> 0x0187, IOException -> 0x0190 }
    L_0x0187:
        r1 = move-exception;
        fr.pcsoft.wdjava.net.http.C0990o.m7202a(r1);
        r4 = r3;
        goto L_0x0102;
    L_0x018e:
        r1 = move-exception;
        throw r1;	 Catch:{ MalformedURLException -> 0x013c, SSLHandshakeException -> 0x0187, IOException -> 0x0190 }
    L_0x0190:
        r1 = move-exception;
    L_0x0191:
        if (r2 == 0) goto L_0x01e7;
    L_0x0193:
        r2 = new fr.pcsoft.wdjava.net.t;	 Catch:{ MalformedURLException -> 0x01e5 }
        r3 = new java.lang.StringBuilder;	 Catch:{ MalformedURLException -> 0x01e5 }
        r3.<init>();	 Catch:{ MalformedURLException -> 0x01e5 }
        r4 = f2836z;	 Catch:{ MalformedURLException -> 0x01e5 }
        r5 = 8;
        r4 = r4[r5];	 Catch:{ MalformedURLException -> 0x01e5 }
        r5 = 0;
        r5 = new java.lang.String[r5];	 Catch:{ MalformedURLException -> 0x01e5 }
        r4 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r4, r5);	 Catch:{ MalformedURLException -> 0x01e5 }
        r3 = r3.append(r4);	 Catch:{ MalformedURLException -> 0x01e5 }
        r4 = "\n";
        r3 = r3.append(r4);	 Catch:{ MalformedURLException -> 0x01e5 }
        r4 = f2836z;	 Catch:{ MalformedURLException -> 0x01e5 }
        r5 = 10;
        r4 = r4[r5];	 Catch:{ MalformedURLException -> 0x01e5 }
        r5 = 0;
        r5 = new java.lang.String[r5];	 Catch:{ MalformedURLException -> 0x01e5 }
        r4 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r4, r5);	 Catch:{ MalformedURLException -> 0x01e5 }
        r3 = r3.append(r4);	 Catch:{ MalformedURLException -> 0x01e5 }
        r4 = "\n";
        r3 = r3.append(r4);	 Catch:{ MalformedURLException -> 0x01e5 }
        r4 = f2836z;	 Catch:{ MalformedURLException -> 0x01e5 }
        r5 = 18;
        r4 = r4[r5];	 Catch:{ MalformedURLException -> 0x01e5 }
        r5 = 0;
        r5 = new java.lang.String[r5];	 Catch:{ MalformedURLException -> 0x01e5 }
        r4 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r4, r5);	 Catch:{ MalformedURLException -> 0x01e5 }
        r3 = r3.append(r4);	 Catch:{ MalformedURLException -> 0x01e5 }
        r3 = r3.toString();	 Catch:{ MalformedURLException -> 0x01e5 }
        r1 = r1.getMessage();	 Catch:{ MalformedURLException -> 0x01e5 }
        r2.<init>(r3, r1);	 Catch:{ MalformedURLException -> 0x01e5 }
        throw r2;	 Catch:{ MalformedURLException -> 0x01e5 }
    L_0x01e5:
        r1 = move-exception;
        throw r1;
    L_0x01e7:
        r2 = new fr.pcsoft.wdjava.net.t;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = f2836z;
        r5 = 8;
        r4 = r4[r5];
        r5 = 0;
        r5 = new java.lang.String[r5];
        r4 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r4, r5);
        r3 = r3.append(r4);
        r4 = "\n";
        r3 = r3.append(r4);
        r4 = f2836z;
        r5 = 10;
        r4 = r4[r5];
        r5 = 0;
        r5 = new java.lang.String[r5];
        r4 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r4, r5);
        r3 = r3.append(r4);
        r3 = r3.toString();
        r1 = r1.getMessage();
        r2.<init>(r3, r1);
        throw r2;
    L_0x0222:
        r2 = 0;
        r3 = 0;
        r1 = 1;
        r4.setDoInput(r1);	 Catch:{ Exception -> 0x026c, all -> 0x0315 }
        r1 = 0;
        java.net.HttpURLConnection.setFollowRedirects(r1);	 Catch:{ Exception -> 0x026c, all -> 0x0315 }
        r1 = 0;
        r4.setInstanceFollowRedirects(r1);	 Catch:{ Exception -> 0x026c, all -> 0x0315 }
        r1 = fr.pcsoft.wdjava.core.utils.C0808l.m4053k(r12);	 Catch:{ Exception -> 0x026c, all -> 0x0315 }
        if (r1 == 0) goto L_0x0238;
    L_0x0236:
        r12 = f2830q;	 Catch:{ Exception -> 0x026c, all -> 0x0315 }
    L_0x0238:
        r1 = f2836z;	 Catch:{ Exception -> 0x026c, all -> 0x0315 }
        r5 = 15;
        r1 = r1[r5];	 Catch:{ Exception -> 0x026c, all -> 0x0315 }
        r4.setRequestProperty(r1, r12);	 Catch:{ Exception -> 0x026c, all -> 0x0315 }
        r1 = fr.pcsoft.wdjava.core.utils.C0808l.m4053k(r13);	 Catch:{ Exception -> 0x026c, all -> 0x0315 }
        if (r1 != 0) goto L_0x0296;
    L_0x0247:
        r5 = fr.pcsoft.wdjava.core.utils.C0808l.m4055m(r13);	 Catch:{ Exception -> 0x026c, all -> 0x0315 }
        r6 = r5.length;	 Catch:{ Exception -> 0x026c, all -> 0x0315 }
        r1 = 0;
    L_0x024d:
        if (r1 >= r6) goto L_0x0296;
    L_0x024f:
        r7 = r5[r1];	 Catch:{ Exception -> 0x026c, all -> 0x0315 }
        r8 = 58;
        r8 = r7.indexOf(r8);	 Catch:{ Exception -> 0x026c, all -> 0x0315 }
        if (r8 <= 0) goto L_0x0267;
    L_0x0259:
        r9 = 0;
        r9 = r7.substring(r9, r8);	 Catch:{ MalformedURLException -> 0x026a }
        r8 = r8 + 1;
        r7 = r7.substring(r8);	 Catch:{ MalformedURLException -> 0x026a }
        r4.addRequestProperty(r9, r7);	 Catch:{ MalformedURLException -> 0x026a }
    L_0x0267:
        r1 = r1 + 1;
        goto L_0x024d;
    L_0x026a:
        r1 = move-exception;
        throw r1;	 Catch:{ Exception -> 0x026c, all -> 0x0315 }
    L_0x026c:
        r1 = move-exception;
        r10 = r3;
        r3 = r2;
        r2 = r10;
    L_0x0270:
        r4 = new fr.pcsoft.wdjava.net.t;	 Catch:{ all -> 0x0287 }
        r5 = f2836z;	 Catch:{ all -> 0x0287 }
        r6 = 19;
        r5 = r5[r6];	 Catch:{ all -> 0x0287 }
        r6 = 0;
        r6 = new java.lang.String[r6];	 Catch:{ all -> 0x0287 }
        r5 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r5, r6);	 Catch:{ all -> 0x0287 }
        r1 = r1.getMessage();	 Catch:{ all -> 0x0287 }
        r4.<init>(r5, r1);	 Catch:{ all -> 0x0287 }
        throw r4;	 Catch:{ all -> 0x0287 }
    L_0x0287:
        r1 = move-exception;
        r10 = r2;
        r2 = r3;
        r3 = r10;
    L_0x028b:
        if (r2 == 0) goto L_0x0290;
    L_0x028d:
        r2.close();	 Catch:{ IOException -> 0x0399, t -> 0x0385 }
    L_0x0290:
        if (r3 == 0) goto L_0x0295;
    L_0x0292:
        r3.close();	 Catch:{ IOException -> 0x039c, t -> 0x0387 }
    L_0x0295:
        throw r1;
    L_0x0296:
        if (r16 == 0) goto L_0x02a2;
    L_0x0298:
        r1 = "";
        r0 = r16;
        r1 = r0.equals(r1);	 Catch:{ MalformedURLException -> 0x030f }
        if (r1 == 0) goto L_0x02ae;
    L_0x02a2:
        if (r17 == 0) goto L_0x02bb;
    L_0x02a4:
        r1 = "";
        r0 = r17;
        r1 = r0.equals(r1);	 Catch:{ MalformedURLException -> 0x0313 }
        if (r1 != 0) goto L_0x02bb;
    L_0x02ae:
        r1 = f2836z;	 Catch:{ MalformedURLException -> 0x0313 }
        r5 = 21;
        r1 = r1[r5];	 Catch:{ MalformedURLException -> 0x0313 }
        r5 = fr.pcsoft.wdjava.net.C0974g.m7038a(r16, r17);	 Catch:{ MalformedURLException -> 0x0313 }
        r4.setRequestProperty(r1, r5);	 Catch:{ MalformedURLException -> 0x0313 }
    L_0x02bb:
        if (r15 == 0) goto L_0x02c5;
    L_0x02bd:
        r1 = "";
        r1 = r15.equals(r1);	 Catch:{ MalformedURLException -> 0x0318 }
        if (r1 == 0) goto L_0x02c7;
    L_0x02c5:
        r15 = f2820g;	 Catch:{ Exception -> 0x026c, all -> 0x0315 }
    L_0x02c7:
        r1 = f2836z;	 Catch:{ MalformedURLException -> 0x031a }
        r5 = 13;
        r1 = r1[r5];	 Catch:{ MalformedURLException -> 0x031a }
        r4.setRequestProperty(r1, r15);	 Catch:{ MalformedURLException -> 0x031a }
        if (r14 == 0) goto L_0x0342;
    L_0x02d2:
        r1 = r14.isMemoBinaire();	 Catch:{ MalformedURLException -> 0x031a }
        if (r1 != 0) goto L_0x0342;
    L_0x02d8:
        r5 = r14.getString();	 Catch:{ Exception -> 0x026c, all -> 0x0315 }
        if (r5 == 0) goto L_0x02e6;
    L_0x02de:
        r1 = "";
        r1 = r5.equals(r1);	 Catch:{ MalformedURLException -> 0x031c }
        if (r1 == 0) goto L_0x031e;
    L_0x02e6:
        r1 = f2836z;	 Catch:{ MalformedURLException -> 0x031c }
        r5 = 16;
        r1 = r1[r5];	 Catch:{ MalformedURLException -> 0x031c }
        r4.setRequestMethod(r1);	 Catch:{ MalformedURLException -> 0x031c }
        r4.connect();	 Catch:{ MalformedURLException -> 0x031c }
        r1 = r2;
    L_0x02f3:
        r2 = r1;
    L_0x02f4:
        if (r2 == 0) goto L_0x02f9;
    L_0x02f6:
        r2.close();	 Catch:{ IOException -> 0x0393, t -> 0x0381 }
    L_0x02f9:
        if (r3 == 0) goto L_0x02fe;
    L_0x02fb:
        r3.close();	 Catch:{ IOException -> 0x0396, t -> 0x0383 }
    L_0x02fe:
        r3 = 0;
        r2 = new fr.pcsoft.wdjava.net.http.h;	 Catch:{ all -> 0x0389 }
        r2.<init>(r4);	 Catch:{ all -> 0x0389 }
        fr.pcsoft.wdjava.net.http.C0990o.m7196a(r2);	 Catch:{ all -> 0x039f }
        if (r2 == 0) goto L_0x030c;
    L_0x0309:
        r2.mo3273d();
    L_0x030c:
        r1 = 1;
        goto L_0x001a;
    L_0x030f:
        r1 = move-exception;
        throw r1;	 Catch:{ MalformedURLException -> 0x0311 }
    L_0x0311:
        r1 = move-exception;
        throw r1;	 Catch:{ MalformedURLException -> 0x0313 }
    L_0x0313:
        r1 = move-exception;
        throw r1;	 Catch:{ Exception -> 0x026c, all -> 0x0315 }
    L_0x0315:
        r1 = move-exception;
        goto L_0x028b;
    L_0x0318:
        r1 = move-exception;
        throw r1;	 Catch:{ Exception -> 0x026c, all -> 0x0315 }
    L_0x031a:
        r1 = move-exception;
        throw r1;	 Catch:{ Exception -> 0x026c, all -> 0x0315 }
    L_0x031c:
        r1 = move-exception;
        throw r1;	 Catch:{ Exception -> 0x026c, all -> 0x0315 }
    L_0x031e:
        r1 = 1;
        r4.setDoOutput(r1);	 Catch:{ Exception -> 0x026c, all -> 0x0315 }
        r1 = f2836z;	 Catch:{ Exception -> 0x026c, all -> 0x0315 }
        r6 = 20;
        r1 = r1[r6];	 Catch:{ Exception -> 0x026c, all -> 0x0315 }
        r4.setRequestMethod(r1);	 Catch:{ Exception -> 0x026c, all -> 0x0315 }
        r1 = new java.io.OutputStreamWriter;	 Catch:{ Exception -> 0x026c, all -> 0x0315 }
        r6 = r4.getOutputStream();	 Catch:{ Exception -> 0x026c, all -> 0x0315 }
        r1.<init>(r6);	 Catch:{ Exception -> 0x026c, all -> 0x0315 }
        r1.write(r5);	 Catch:{ Exception -> 0x033b, all -> 0x03a1 }
        r1.flush();	 Catch:{ Exception -> 0x033b, all -> 0x03a1 }
        goto L_0x02f3;
    L_0x033b:
        r2 = move-exception;
        r10 = r2;
        r2 = r3;
        r3 = r1;
        r1 = r10;
        goto L_0x0270;
    L_0x0342:
        if (r14 == 0) goto L_0x034b;
    L_0x0344:
        r1 = r14.getDonneeBinaire();	 Catch:{ MalformedURLException -> 0x0358 }
        r1 = r1.length;	 Catch:{ MalformedURLException -> 0x0358 }
        if (r1 != 0) goto L_0x035a;
    L_0x034b:
        r1 = f2836z;	 Catch:{ MalformedURLException -> 0x0358 }
        r5 = 16;
        r1 = r1[r5];	 Catch:{ MalformedURLException -> 0x0358 }
        r4.setRequestMethod(r1);	 Catch:{ MalformedURLException -> 0x0358 }
        r4.connect();	 Catch:{ MalformedURLException -> 0x0358 }
        goto L_0x02f4;
    L_0x0358:
        r1 = move-exception;
        throw r1;	 Catch:{ Exception -> 0x026c, all -> 0x0315 }
    L_0x035a:
        r1 = 1;
        r4.setDoOutput(r1);	 Catch:{ Exception -> 0x026c, all -> 0x0315 }
        r1 = f2836z;	 Catch:{ Exception -> 0x026c, all -> 0x0315 }
        r5 = 20;
        r1 = r1[r5];	 Catch:{ Exception -> 0x026c, all -> 0x0315 }
        r4.setRequestMethod(r1);	 Catch:{ Exception -> 0x026c, all -> 0x0315 }
        r3 = r4.getOutputStream();	 Catch:{ Exception -> 0x026c, all -> 0x0315 }
        if (r3 == 0) goto L_0x02f4;
    L_0x036d:
        r1 = r14.getDonneeBinaire();	 Catch:{ MalformedURLException -> 0x0379 }
        r3.write(r1);	 Catch:{ MalformedURLException -> 0x0379 }
        r3.flush();	 Catch:{ MalformedURLException -> 0x0379 }
        goto L_0x02f4;
    L_0x0379:
        r1 = move-exception;
        throw r1;	 Catch:{ Exception -> 0x037b, all -> 0x0315 }
    L_0x037b:
        r1 = move-exception;
        r10 = r3;
        r3 = r2;
        r2 = r10;
        goto L_0x0270;
    L_0x0381:
        r1 = move-exception;
        throw r1;
    L_0x0383:
        r1 = move-exception;
        throw r1;
    L_0x0385:
        r1 = move-exception;
        throw r1;
    L_0x0387:
        r1 = move-exception;
        throw r1;
    L_0x0389:
        r1 = move-exception;
        r2 = r3;
    L_0x038b:
        if (r2 == 0) goto L_0x0390;
    L_0x038d:
        r2.mo3273d();	 Catch:{ MalformedURLException -> 0x0391 }
    L_0x0390:
        throw r1;
    L_0x0391:
        r1 = move-exception;
        throw r1;
    L_0x0393:
        r1 = move-exception;
        goto L_0x02f9;
    L_0x0396:
        r1 = move-exception;
        goto L_0x02fe;
    L_0x0399:
        r2 = move-exception;
        goto L_0x0290;
    L_0x039c:
        r2 = move-exception;
        goto L_0x0295;
    L_0x039f:
        r1 = move-exception;
        goto L_0x038b;
    L_0x03a1:
        r2 = move-exception;
        r10 = r2;
        r2 = r1;
        r1 = r10;
        goto L_0x028b;
    L_0x03a7:
        r1 = move-exception;
        r2 = r4;
        goto L_0x0191;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.net.http.o.a(java.lang.String, java.lang.String, java.lang.String, fr.pcsoft.wdjava.core.WDObjet, java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: a */
    public static final long[] m7205a(WDHTTPReponse wDHTTPReponse) throws WDJNIException {
        try {
            if (f2819f) {
                return WDJNIHelper.m6637a(10, 378, wDHTTPReponse.getIdentifiantJNI());
            }
            C0990o.m7220i();
            return new long[0];
        } catch (WDJNIException e) {
            throw e;
        }
    }

    /* renamed from: a */
    public static final long[] m7206a(WDHTTPRequete wDHTTPRequete, String str) throws WDJNIException {
        try {
            if (f2819f) {
                return wDHTTPRequete != null ? WDJNIHelper.m6688c(10, 378, wDHTTPRequete.getIdentifiantJNI(), str) : WDJNIHelper.m6638a(10, 378, str);
            } else {
                C0990o.m7220i();
                return new long[0];
            }
        } catch (WDJNIException e) {
            throw e;
        } catch (WDJNIException e2) {
            throw e2;
        }
    }

    /* renamed from: b */
    public static final synchronized String m7207b() throws WDJNIException {
        String c;
        synchronized (C0990o.class) {
            try {
                if (f2819f) {
                    c = WDJNIHelper.m6679c(10, 62, 1);
                } else {
                    C0670b c0670b = (C0670b) WDAppelContexte.m2679a(C0670b.class);
                    c = c0670b != null ? c0670b.m2760g() : "";
                }
            } catch (WDJNIException e) {
                throw e;
            }
        }
        return c;
    }

    /* renamed from: b */
    public static final SSLSocketFactory m7208b(int i) {
        try {
            TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm()).init((KeyStore) null);
            TrustManager[] trustManagerArr = new TrustManager[]{new C0986i((X509TrustManager) r2.getTrustManagers()[0], i)};
            SSLContext instance = SSLContext.getInstance(f2836z[6]);
            instance.init(null, trustManagerArr, new SecureRandom());
            return instance.getSocketFactory();
        } catch (Exception e) {
            C0691a.m2857a(f2836z[5], e);
            return null;
        }
    }

    /* renamed from: b */
    public static final void m7209b(WDHTTPRequete wDHTTPRequete, String str) throws WDJNIException {
        try {
            if (!f2819f) {
                C0990o.m7220i();
            } else if (wDHTTPRequete != null) {
                if (str == null) {
                    try {
                        WDJNIHelper.m6650b(10, 380, wDHTTPRequete.getIdentifiantJNI());
                        return;
                    } catch (WDJNIException e) {
                        throw e;
                    }
                }
                WDJNIHelper.m6697d(10, 380, wDHTTPRequete.getIdentifiantJNI(), str);
            } else if (str == null) {
                try {
                    WDJNIHelper.m6648b(10, 380);
                } catch (WDJNIException e2) {
                    throw e2;
                }
            } else {
                WDJNIHelper.m6709e(10, 380, str);
            }
        } catch (WDJNIException e22) {
            throw e22;
        } catch (WDJNIException e222) {
            throw e222;
        }
    }

    /* renamed from: b */
    public static final synchronized void m7210b(String str) throws WDJNIException {
        synchronized (C0990o.class) {
            try {
                if (f2819f) {
                    WDJNIHelper.m6709e(10, 307, str);
                } else {
                    WDHTTPForm d = C0990o.m7213d(str);
                    if (d != null) {
                        d.release();
                        f2815b.remove(str.toLowerCase());
                    }
                }
            } catch (WDJNIException e) {
                throw e;
            } catch (WDJNIException e2) {
                throw e2;
            }
        }
        return;
    }

    /* renamed from: c */
    static final synchronized cb m7211c() {
        cb cbVar;
        synchronized (C0990o.class) {
            if (f2831r == null) {
                f2831r = cb.m7063a(true);
            }
            cbVar = f2831r;
        }
        return cbVar;
    }

    /* renamed from: c */
    public static final synchronized void m7212c(String str) throws WDJNIException {
        synchronized (C0990o.class) {
            try {
                if (f2819f) {
                    WDJNIHelper.m6709e(10, 308, str);
                } else {
                    WDHTTPForm d = C0990o.m7213d(str);
                    if (d == null) {
                        WDErreurManager.m2883a(C0745b.m3222b(f2836z[11], str));
                    }
                    d.reset();
                }
            } catch (WDJNIException e) {
                throw e;
            } catch (WDJNIException e2) {
                throw e2;
            }
        }
        return;
    }

    /* renamed from: d */
    private static final WDHTTPForm m7213d(String str) {
        return f2815b != null ? (WDHTTPForm) f2815b.get(str.toLowerCase()) : null;
    }

    /* renamed from: d */
    public static final synchronized byte[] m7214d() throws WDJNIException {
        byte[] b;
        synchronized (C0990o.class) {
            try {
                if (f2819f) {
                    b = WDJNIHelper.m6669b(10, 62, 2);
                } else {
                    C0670b c0670b = (C0670b) WDAppelContexte.m2679a(C0670b.class);
                    b = c0670b != null ? c0670b.m2759f() : null;
                }
            } catch (WDJNIException e) {
                throw e;
            }
        }
        return b;
    }

    /* renamed from: e */
    public static final synchronized void m7215e(String str) throws WDJNIException {
        synchronized (C0990o.class) {
            try {
                if (f2819f) {
                    WDJNIHelper.m6709e(10, 306, str);
                } else {
                    C0990o.m7210b(str);
                    WDHTTPForm wDHTTPForm = new WDHTTPForm();
                    if (f2815b == null) {
                        f2815b = new HashMap(4);
                    }
                    f2815b.put(str.toLowerCase(), wDHTTPForm);
                }
            } catch (WDJNIException e) {
                throw e;
            } catch (WDJNIException e2) {
                throw e2;
            }
        }
        return;
    }

    /* renamed from: e */
    public static final boolean m7216e() {
        return f2819f;
    }

    /* renamed from: f */
    static final C0976a m7217f() {
        return f2826m;
    }

    /* renamed from: g */
    public static final HostnameVerifier m7218g() {
        if (f2835v == null) {
            f2835v = new C0995t();
        }
        return f2835v;
    }

    /* renamed from: h */
    public static final synchronized WDObjet m7219h() throws WDJNIException {
        WDObjet h;
        synchronized (C0990o.class) {
            try {
                if (f2819f) {
                    h = WDJNIHelper.m6725h(10, 62, 5);
                } else {
                    C0990o.m7220i();
                    h = null;
                }
            } catch (WDJNIException e) {
                throw e;
            }
        }
        return h;
    }

    /* renamed from: i */
    private static final void m7220i() {
        WDJNIHelper.m6615a(true);
        WDErreurManager.m2883a(C0745b.m3222b(f2836z[7], new String[0]));
    }

    /* renamed from: z */
    private static String m7221z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 97;
                    break;
                case 1:
                    i2 = 14;
                    break;
                case 2:
                    i2 = 86;
                    break;
                case 3:
                    i2 = 125;
                    break;
                default:
                    i2 = 73;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7222z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 73);
        }
        return toCharArray;
    }
}
