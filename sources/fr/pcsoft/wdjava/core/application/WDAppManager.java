package fr.pcsoft.wdjava.core.application;

import android.app.Activity;
import android.app.Application;
import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Parcelable;
import android.support.multidex.MultiDex;
import android.support.v4.content.ContextCompat;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.C0695c;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.p035c.C0539d;
import fr.pcsoft.wdjava.core.p042b.C0657a;
import fr.pcsoft.wdjava.core.utils.C0806j;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.core.utils.kb;
import fr.pcsoft.wdjava.file.C0897o;
import fr.pcsoft.wdjava.p061q.p062a.C1014a;
import fr.pcsoft.wdjava.ui.activite.C1056i;
import fr.pcsoft.wdjava.ui.champs.fenetre.C0508h;
import fr.pcsoft.wdjava.ui.dialogue.C1372f;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class WDAppManager extends Application {
    /* renamed from: a */
    private static File f1575a = null;
    /* renamed from: b */
    public static final String f1576b = m2600z(m2601z("(\u0017i\"L(\u001b\u000f;E(\u001b\u001e4S#\u0017\b0@4\u0007\u0004*R2\u001a\u001c<B2\u0017\u0005;^$\u001c\u000b'U\"\u0018\u0015*"));
    /* renamed from: c */
    private static final int f1577c = 16;
    /* renamed from: d */
    private static final int f1578d = 8;
    /* renamed from: e */
    private static AtomicInteger f1579e = null;
    /* renamed from: f */
    private static Boolean f1580f = null;
    /* renamed from: g */
    private static final int f1581g = 1024;
    /* renamed from: h */
    private static final int f1582h = 256;
    /* renamed from: i */
    private static final int f1583i = 4;
    /* renamed from: j */
    private static Intent f1584j = null;
    /* renamed from: k */
    private static final int f1585k = 64;
    /* renamed from: l */
    private static long f1586l = 0;
    /* renamed from: m */
    private static final int f1587m = 4;
    /* renamed from: n */
    private static final int f1588n = 128;
    /* renamed from: o */
    private static final int f1589o = 1;
    /* renamed from: p */
    private static C0648f f1590p = null;
    /* renamed from: q */
    private static final int f1591q = 2;
    /* renamed from: r */
    private static int f1592r = 0;
    /* renamed from: s */
    private static final int f1593s = 32;
    /* renamed from: t */
    private static Context f1594t = null;
    /* renamed from: u */
    private static File f1595u = null;
    /* renamed from: v */
    private static List<PendingIntent> f1596v = null;
    /* renamed from: w */
    private static final int f1597w = 512;
    /* renamed from: z */
    private static final String[] f1598z;

    static {
        r0 = new String[56];
        r0[0] = m2600z(m2601z("\u0007:%\u0016d\u0004;%\u0007"));
        r0[1] = m2600z(m2601z("2:8\u0010t\u0005h.\u0000s\u0016&>Um\u0016h&\u0010b\u0003=8\u0010!\u0013=j\u0013h\u0014 #\u0010sWg:\u0007n\u0014g)\u0005t\u001e&,\u001a"));
        r0[2] = m2600z(m2601z("\u0016:'"));
        r0[3] = m2600z(m2601z("\u0018;d\u0014s\u0014 "));
        r0[4] = m2600z(m2601z("X88\u001abX+:\u0000h\u0019.%"));
        r0[5] = m2600z(m2601z("\u0016&.\u0007n\u001e,d\u0005d\u0005%#\u0006r\u001e'$[@4\u000b\u000f&R(\u000e\u0003;D(\u0004\u00056@#\u0001\u0005;"));
        r0[6] = m2600z(m2601z("\u0016&.\u0007n\u001e,d\u0005d\u0005%#\u0006r\u001e'$[@4\u000b\u000f&R(\u000b\u00054S$\r\u00159N4\t\u001e<N9"));
        r0[7] = m2600z(m2601z("2+\"\u0010bW,/Um\u0016h8b\u00028£\u0007`\u0003!%\u001b!\u0013=j\u0007è\u0007-8\u0001n\u001e:/Ue\u0012h&R`\u00078&\u001cb\u0016<#\u001ao[h?\u0001h\u001b!9\u0014u\u001e'$Ue\u0012h)\u0010m\u0002!j\u0011dW$+UR3\u000b+\u0007eY"));
        r0[8] = m2600z(m2601z("\u0011:d\u0005b\u0004',\u0001/\u0000, \u0014w\u0016f=\u001ce\u0010->[`"));
        r0[9] = m2600z(m2601z(">%:\u001ar\u0004!(\u0019dW,/Us+?\u0005è\u0005-8Um\u0012;j\u001co\u0011'8\u0018`\u0003!%\u001brW,/Uq\u0016+!\u0014f\u0012h.\u0010!\u001bo+\u0005q\u001b!)\u0014u\u001e'$"));
        r0[10] = m2600z(m2601z("\u0016&.\u0007n\u001e,d\u0005d\u0005%#\u0006r\u001e'$[V%\u0001\u001e0^2\u0010\u001e0S9\t\u0006*R#\u0007\u00184F2"));
        r0[11] = m2600z(m2601z("Tk\u0015*C6\u001b\u000f*O6\u0005\u000f*^Tk"));
        r0[12] = m2600z(m2601z("\u0011:d\u0005b\u0004',\u0001/\u0000,+\u001be\u0005'#\u0011/6\u000b\u001e<N9\u0017\r0N#\u001a\u000b6J>\u0006\r*Q8\u001b\u0003!H8\u0006\u0015 Q3\t\u001e0E"));
        r0[13] = m2600z(m2601z(";-j%d\u0019,#\u001bf>&>\u0010o\u0003h+Uè\u0003¡j\u0014o\u0019=&/"));
        r0[14] = m2600z(m2601z("\u0011:d\u0005b\u0004',\u0001/\u0000, \u0014w\u0016f?\u001c/\u0016+>\u001cw\u001e</[V3\t)\u0001h\u0001!>\u0010%5$+\u001bj6+>\u001cw\u001e<3"));
        r0[15] = m2600z(m2601z(">%:\u001ar\u0004!(\u0019dW,m\u001at\u0001:#\u0007!\u001b)j7m\u0016&!4b\u0003!<\u001cu\u000eh:\u0014sW!$\u0001s\u0018;:\u0010b\u0003!%\u001b/"));
        r0[16] = m2600z(m2601z("\u0011:d\u0005b\u0004',\u0001/\u0000, \u0014w\u0016f)\u001as\u0012f)\u001ao\u0003-2\u0001/ \f\t\u001ao\u0003-2\u0001d"));
        r0[17] = m2600z(m2601z("\u0015'%\u0019"));
        r0[18] = m2600z(m2601z("2:8\u0010t\u0005h.\u0000s\u0016&>Um\u0012h&\u0014o\u0014-'\u0010o\u0003h.\u0000!\u0004-8\u0003h\u0014-j\u0011dW,£\u0001d\u0014<#\u001aoW,/\u0006!5-+\u0016n\u0019;j\u0014tW$+\u001bb\u0012%/\u001buW,/UmP):\u0005m\u001e++\u0001h\u0018&d"));
        r0[19] = m2600z(m2601z("\u0014'$\u0013h\u0010\u0017/\u001b`\u0015$/!s\u0016&9\u0019t\u0014-$\u0001E\u0012+%\u0007"));
        r0[20] = m2600z(m2601z("\u0011:d\u0005b\u0004',\u0001/\u0000, \u0014w\u0016f(\u0010`\u0014'$[V3\n/\u0014b\u0018&\u0007\u0014o\u0016//\u0007"));
        r0[21] = m2600z(m2601z("\r2"));
        r0[22] = m2600z(m2601z("\u0016&.\u0007n\u001e,"));
        r0[23] = m2600z(m2601z("\u0007:#\u0003`\u0003-\u0015\u0014q\u001e\u0017!\u0010x"));
        r0[24] = m2600z(m2601z("\u0000%8\u0005m"));
        r0[25] = m2600z(m2601z(">%:\u001ar\u0004!(\u0019dW,/Ub\u0005¡/\u0007!\u001b-j\u0007è\u0007-8\u0001n\u001e:/Ue\u0012;j\u0013h\u0014 #\u0010s\u0004h.\u0010!\u0014'$\u0013h\u0010;j\u0011dW$+US'\u0004j\u0011`\u0019;j\u0019dW:£\u0005d\u0005<%\u001cs\u0012h.\u0014u\u0016*+\u0006d[h%\u001b!\u0002<#\u0019h\u0004-j\u0019dW:£\u0005d\u0005<%\u001cs\u0012h)\u0014b\u001f-d"));
        r0[26] = m2600z(m2601z("\u0011:d\u0005b\u0004',\u0001/\u001a=&\u0001h\u0013-2"));
        r0[27] = m2600z(m2601z("\u0011:d\u0005b\u0004',\u0001/\u0000,+\u001be\u0005'#\u0011/6\u000b\u001e<N9\u0017\u00180P\"\r\u0019!^'\r\u00188H$\u001b\u0003:O"));
        r0[28] = m2600z(m2601z("2\u0010\u001e'@(\u0018\u000f'L>\u001b\u0019<N9\u0017\r'@9\u001c\u0015'D$\u001d\u0006!"));
        r0[29] = m2600z(m2601z(" \u0005\u0015'D$\u0019\u001f0R#\u0017\t:E2"));
        r0[30] = m2600z(m2601z("2\u0010\u001e'@(\u0018\u000f'L>\u001b\u0019<N9\u0017\u0006<R#"));
        r0[31] = m2600z(m2601z("2\u0010\u001e'@(\u0006\b*Q6\u001a\u000b8"));
        r0[32] = m2600z(m2601z("2\u0010\u001e'@(\u0018\u00180L>\r\u00180^1\r\u00040U%\r"));
        r0[33] = m2600z(m2601z("2\u0010\u001e'@(\u0018\u000b'@:\u0017\u0019!S>\u0006\r*\""));
        r0[34] = m2600z(m2601z("2\u0010\u001e'@(\u001d\u0018<^6\u0004\b L"));
        r0[35] = m2600z(m2601z("\u0011:d\u0005b\u0004',\u0001/\u0000,+\u001be\u0005'#\u0011/6\u000b\u001e<N9\u0017\u0019,O#\u0000\u000f&D(\u001e\u00056@;\r"));
        r0[36] = m2600z(m2601z("\u0016&.\u0007n\u001e,d\u0018d\u0013!+[`\u0014<#\u001aoY\u0001\u00074F2\u0017\t4Q#\u001d\u00180"));
        r0[37] = m2600z(m2601z("\u0011:d\u0005b\u0004',\u0001/\u0000,+\u001be\u0005'#\u0011/6\u000b\u001e<N9\u0017\u000f1H#\u0017\t:O#\t\t!"));
        r0[38] = m2600z(m2601z("\u0014''[f\u0018'-\u0019dY22\u001co\u0010f)\u0019h\u0012&>[`\u0019,8\u001ah\u0013f\u00196@9"));
        r0[39] = m2600z(m2601z("\u0011:d\u0005b\u0004',\u0001/\u0000,+\u001be\u0005'#\u0011/6\u000b\u001e<N9\u0017\u00190M2\u000b\u001e*B8\u0006\u001e4B#"));
        r0[40] = m2600z(m2601z("\u0011:d\u0005b\u0004',\u0001/\u0000,+\u001be\u0005'#\u0011/6\u000b\u001e<N9\u0017\r%R(\r\u0018'N%\u0017\u00180R8\u0004\u001f!H8\u0006"));
        r0[41] = m2600z(m2601z("\u0011:d\u0005b\u0004',\u0001/\u0000,+\u001be\u0005'#\u0011/6\u000b\u001e<N9\u0017\u0003;^6\u0018\u001a*Q\"\u001a\t=@$\r"));
        r0[42] = m2600z(m2601z("\u0011:d\u0005b\u0004',\u0001/\u0000,+\u001be\u0005'#\u0011/6\u000b\u001e<N9\u0017\u000b9C\"\u0005"));
        r0[43] = m2600z(m2601z("\u0011:d\u0005b\u0004',\u0001/\u0000,+\u001be\u0005'#\u0011/6\u000b\u001e<N9\u0017\u0006:F>\u0006\u0015:@\"\u001c\u0002G"));
        r0[44] = m2600z(m2601z("\u0011:d\u0005b\u0004',\u0001/\u0000,+\u001be\u0005'#\u0011/6\u000b\u001e<N9\u0017\u00043B(\u001c\u000b2"));
        r0[45] = m2600z(m2601z("\u001e,\u0015\u0016n\u0019<+\u0016u"));
        r0[46] = m2600z(m2601z("\u0011:d\u0005b\u0004',\u0001/\u0000,+\u001be\u0005'#\u0011/6\u000b\u001e<N9\u0017\t'D6\u001c\u000f*S3\u001e"));
        r0[47] = m2600z(m2601z("2\u0010\u001e'@(\u001d\u0018<^:\r\u000e<@"));
        r0[48] = m2600z(m2601z(" \u0005\u00156N3\r\u0015'D#\u0007\u001f'^6\u000b\u001e<W>\u001c\u0013"));
        r0[49] = m2600z(m2601z("\u0011:d\u0005b\u0004',\u0001/\u0000,+\u001be\u0005'#\u0011/6\u000b\u001e<N9\u0017\u001d'H#\r\u0015&D#\u001c\u0003;F$"));
        r0[50] = m2600z(m2601z("\u0016&.\u0007n\u001e,d\u0017m\u0002->\u001an\u0003 d\u0014e\u00168>\u0010sY))\u0001h\u0018&d'D&\u001d\u000f&U(\f\u0003&B8\u001e\u000f'@5\u0004\u000f"));
        r0[51] = m2600z(m2601z("\u0011:d\u0005b\u0004',\u0001/\u0000,+\u001be\u0005'#\u0011/6\u000b\u001e<N9\u0017\u00180B8\u0006\u00044H$\u001b\u000b;B2\u0017\u001c:B6\u0004\u000f"));
        r0[52] = m2600z(m2601z("\u0016&.\u0007n\u001e,d\u0018d\u0013!+[`\u0014<#\u001aoY\u001e\u00031D8\u0017\t4Q#\u001d\u00180"));
        r0[53] = m2600z(m2601z("2:8\u0010t\u0005h.\u0000s\u0016&>Um\u0016h8b\u00028£\u0007`\u0003!%\u001b!\u0013-j\u0019`W,+\u0001dW,m\u001co\u0004<+\u0019m\u0016<#\u001aoW,/UmP):\u0005m\u001e++\u0001h\u0018&d"));
        r0[54] = m2600z(m2601z("\u0011!8\u0006u>&9\u0001`\u001b$\u001e\u001cl\u0012"));
        r0[55] = m2600z(m2601z(">%:\u001ar\u0004!(\u0019dW,/Us+?\u0005è\u0005-8Um\u0012;j\u001co\u0011'8\u0018`\u0003!%\u001brW;?\u0007!\u001bo+\u0005q\u001b!)\u0014u\u001e'$"));
        f1598z = r0;
    }

    /* renamed from: A */
    public static final void m2542A() {
        f1592r |= 256;
    }

    /* renamed from: B */
    public static final long m2543B() {
        try {
            if (WDProjet.getInstance().isVersionCompatible(C0657a.GINGERBREAD.getNumero())) {
                return PackageInfo.class.getField(f1598z[54]).getLong(m2597x());
            }
            File file = new File(m2558a(false).sourceDir);
            return file.exists() ? file.lastModified() : 0;
        } catch (Exception e) {
            throw e;
        } catch (Exception e2) {
            C0691a.m2857a(f1598z[53], e2);
            return 0;
        }
    }

    /* renamed from: C */
    public static final Context m2544C() {
        return f1594t;
    }

    /* renamed from: D */
    public static final void m2545D() {
        if (!m2590q()) {
            f1592r |= 16;
            Intent launchIntentForPackage = m2551J().getLaunchIntentForPackage(f1594t.getPackageName());
            if (launchIntentForPackage != null) {
                launchIntentForPackage.setFlags(335544320);
                f1594t.startActivity(launchIntentForPackage);
            }
        }
    }

    /* renamed from: E */
    public static final SharedPreferences m2546E() {
        String str = "";
        PackageInfo x = m2597x();
        if (x != null) {
            str = x.packageName + "." + x.applicationInfo.name;
        }
        return m2557a(str);
    }

    /* renamed from: F */
    public static final AssetManager m2547F() {
        return f1594t.getAssets();
    }

    /* renamed from: G */
    public static final boolean m2548G() {
        return (f1592r & 4) > 0;
    }

    /* renamed from: H */
    public static final void m2549H() {
        f1592r |= 512;
    }

    /* renamed from: I */
    public static final void m2550I() {
        f1592r |= 2;
    }

    /* renamed from: J */
    public static final PackageManager m2551J() {
        return f1594t.getPackageManager();
    }

    /* renamed from: K */
    public static final long m2552K() {
        return f1586l;
    }

    /* renamed from: L */
    public static final ContentResolver m2553L() {
        return f1594t.getContentResolver();
    }

    /* renamed from: M */
    public static final void m2554M() {
        f1592r &= -513;
    }

    /* renamed from: N */
    public static final File m2555N() {
        File file = null;
        if (m2578e(f1598z[10])) {
            file = C1014a.m7327b().mo3282a(f1594t);
        }
        return file != null ? file : f1594t.getCacheDir();
    }

    /* renamed from: a */
    public static final int m2556a(String str, int i) {
        ApplicationInfo a = m2558a(true);
        return (a == null || a.metaData == null) ? i : a.metaData.getInt(str, i);
    }

    /* renamed from: a */
    public static final SharedPreferences m2557a(String str) {
        return f1594t.getSharedPreferences(str, 4);
    }

    /* renamed from: a */
    public static final ApplicationInfo m2558a(boolean z) {
        try {
            return m2551J().getApplicationInfo(f1594t.getPackageName(), z ? 128 : 0);
        } catch (Exception e) {
            C0691a.m2857a(f1598z[55], e);
            return null;
        }
    }

    /* renamed from: a */
    public static final void m2559a(Activity activity, int i, String[] strArr, int[] iArr) {
        Intent intent = new Intent(f1598z[27]);
        intent.putExtra(f1598z[29], i);
        intent.putExtra(f1598z[30], strArr);
        intent.putExtra(f1598z[28], iArr);
        activity.sendBroadcast(intent);
    }

    /* renamed from: a */
    public static final synchronized void m2560a(PendingIntent pendingIntent) {
        synchronized (WDAppManager.class) {
            f1592r |= 8;
            m2570b(pendingIntent);
        }
    }

    /* renamed from: a */
    public static final void m2561a(BroadcastReceiver broadcastReceiver) {
        f1594t.unregisterReceiver(broadcastReceiver);
    }

    /* renamed from: a */
    public static final void m2562a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, boolean z) {
        if (z) {
            f1594t.registerReceiver(broadcastReceiver, intentFilter, null, C0806j.m3954d());
        } else {
            f1594t.registerReceiver(broadcastReceiver, intentFilter);
        }
    }

    /* renamed from: a */
    public static final void m2563a(Context context, int i, int i2, Intent intent) {
        Parcelable parcelable = null;
        String str = "";
        switch (i) {
            case 4096:
                str = f1598z[50];
                break;
            case 4097:
            case 4098:
                str = i == 4097 ? f1598z[36] : f1598z[52];
                if (intent != null) {
                    parcelable = intent.getData();
                }
                if (parcelable != null) {
                    intent = new Intent();
                    intent.putExtra(f1598z[47], parcelable);
                    break;
                }
                break;
            case 4099:
                str = f1598z[38];
                break;
            case C1056i.f3047i /*4100*/:
                str = f1598z[37];
                break;
            case C1056i.f3027M /*4101*/:
                str = f1598z[39];
                if (intent != null) {
                    Uri data = intent.getData();
                    intent = new Intent(str);
                    if (data != null) {
                        intent.putExtra(f1598z[45], C0725i.m3055c(data.getLastPathSegment()));
                        break;
                    }
                }
                break;
            case C1056i.f3033S /*4102*/:
                str = f1598z[51];
                break;
            case C1056i.f3054p /*4103*/:
                str = f1598z[35];
                break;
            case C1056i.f3025K /*4104*/:
                str = f1598z[42];
                if (intent != null) {
                    parcelable = intent.getData();
                }
                if (parcelable != null) {
                    intent = new Intent();
                    intent.putExtra(f1598z[34], parcelable);
                    break;
                }
                break;
            case C1056i.f3034T /*4105*/:
                str = f1598z[44];
                break;
            case C1056i.f3017C /*4106*/:
                str = f1598z[46];
                break;
            case C1056i.f3049k /*4107*/:
                str = f1598z[41];
                context = m2544C();
                break;
            case C1056i.f3060v /*4108*/:
                str = f1598z[40];
                break;
            case C1056i.f3016B /*4109*/:
                str = f1598z[43];
                break;
            case C1056i.f3046h /*4110*/:
                str = f1598z[49];
                break;
        }
        if (!str.equals("")) {
            if (intent == null) {
                intent = new Intent(str);
            } else {
                intent.setAction(str);
            }
            intent.putExtra(f1598z[48], i2);
            context.sendBroadcast(intent);
        }
    }

    /* renamed from: a */
    public static final void m2564a(Intent intent) {
        f1584j = intent;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public static final void m2565a(java.lang.String... r6) throws fr.pcsoft.wdjava.core.application.C0653m {
        /*
        r2 = 1;
        r1 = 0;
        r3 = new java.util.LinkedList;
        r3.<init>();
        r0 = r1;
    L_0x0008:
        r4 = r6.length;
        if (r0 >= r4) goto L_0x001b;
    L_0x000b:
        r4 = r6[r0];
        r5 = m2578e(r4);	 Catch:{ Exception -> 0x0019 }
        if (r5 != 0) goto L_0x0016;
    L_0x0013:
        r3.add(r4);	 Catch:{ Exception -> 0x0019 }
    L_0x0016:
        r0 = r0 + 1;
        goto L_0x0008;
    L_0x0019:
        r0 = move-exception;
        throw r0;
    L_0x001b:
        r0 = r3.isEmpty();	 Catch:{ Exception -> 0x0022 }
        if (r0 == 0) goto L_0x0024;
    L_0x0021:
        return;
    L_0x0022:
        r0 = move-exception;
        throw r0;
    L_0x0024:
        r0 = fr.pcsoft.wdjava.core.p042b.C0657a.MARSHMALLOW;	 Catch:{ Exception -> 0x0043 }
        r0 = fr.pcsoft.wdjava.core.utils.kb.m3965a(r0);	 Catch:{ Exception -> 0x0043 }
        if (r0 == 0) goto L_0x0034;
    L_0x002c:
        r0 = m2577e();	 Catch:{ Exception -> 0x0041 }
        r4 = 23;
        if (r0 >= r4) goto L_0x0045;
    L_0x0034:
        r1 = new fr.pcsoft.wdjava.core.application.m;	 Catch:{ Exception -> 0x0041 }
        r0 = 0;
        r0 = r3.get(r0);	 Catch:{ Exception -> 0x0041 }
        r0 = (java.lang.String) r0;	 Catch:{ Exception -> 0x0041 }
        r1.<init>(r0);	 Catch:{ Exception -> 0x0041 }
        throw r1;	 Catch:{ Exception -> 0x0041 }
    L_0x0041:
        r0 = move-exception;
        throw r0;
    L_0x0043:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0041 }
    L_0x0045:
        r0 = fr.pcsoft.wdjava.ui.activite.C1056i.m7563a(r2);
        if (r0 == 0) goto L_0x0051;
    L_0x004b:
        r3 = r0.isFinishing();	 Catch:{ Exception -> 0x0090 }
        if (r3 == 0) goto L_0x006f;
    L_0x0051:
        r0 = f1598z;	 Catch:{ Exception -> 0x0092 }
        r1 = 14;
        r0 = r0[r1];	 Catch:{ Exception -> 0x0092 }
        r0 = java.lang.Class.forName(r0);	 Catch:{ Exception -> 0x0092 }
        r1 = "b";
        r3 = 0;
        r3 = new java.lang.Class[r3];	 Catch:{ Exception -> 0x0092 }
        r0 = r0.getDeclaredMethod(r1, r3);	 Catch:{ Exception -> 0x0092 }
        r1 = 0;
        r3 = 0;
        r3 = new java.lang.Object[r3];	 Catch:{ Exception -> 0x0092 }
        r0 = r0.invoke(r1, r3);	 Catch:{ Exception -> 0x0092 }
        r0 = (android.app.Activity) r0;	 Catch:{ Exception -> 0x0092 }
        r1 = r2;
    L_0x006f:
        r2 = f1579e;	 Catch:{ Exception -> 0x009d }
        if (r2 != 0) goto L_0x007a;
    L_0x0073:
        r2 = new java.util.concurrent.atomic.AtomicInteger;	 Catch:{ Exception -> 0x009d }
        r2.<init>();	 Catch:{ Exception -> 0x009d }
        f1579e = r2;	 Catch:{ Exception -> 0x009d }
    L_0x007a:
        r2 = f1579e;
        r2 = r2.incrementAndGet();
        r3 = new fr.pcsoft.wdjava.core.application.p;
        r3.<init>(r6, r0, r2);
        r3.m1795g();	 Catch:{ m -> 0x009f, Exception -> 0x00a1 }
    L_0x0088:
        if (r1 == 0) goto L_0x0021;
    L_0x008a:
        r0.finish();	 Catch:{ Exception -> 0x008e }
        goto L_0x0021;
    L_0x008e:
        r0 = move-exception;
        throw r0;
    L_0x0090:
        r0 = move-exception;
        throw r0;
    L_0x0092:
        r0 = move-exception;
        r1 = f1598z;
        r2 = 15;
        r1 = r1[r2];
        fr.pcsoft.wdjava.core.debug.C0691a.m2857a(r1, r0);
        goto L_0x0021;
    L_0x009d:
        r0 = move-exception;
        throw r0;
    L_0x009f:
        r0 = move-exception;
        throw r0;
    L_0x00a1:
        r2 = move-exception;
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2888b(r2);
        goto L_0x0088;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.core.application.WDAppManager.a(java.lang.String[]):void");
    }

    /* renamed from: a */
    public static final boolean m2566a() {
        return (f1592r & 1024) > 0;
    }

    /* renamed from: a */
    public static final boolean m2567a(C0508h c0508h, WDObjet... wDObjetArr) {
        int i = 0;
        Intent launchIntentForPackage = m2551J().getLaunchIntentForPackage(f1594t.getPackageName());
        if (launchIntentForPackage == null) {
            return false;
        }
        if (c0508h != null) {
            launchIntentForPackage.putExtra(f1598z[32], c0508h.getNomFenetre());
            int length = wDObjetArr.length;
            launchIntentForPackage.putExtra(f1598z[31], length);
            while (i < length) {
                launchIntentForPackage.putExtra(f1598z[33] + String.valueOf(i), wDObjetArr[i].getString());
                i++;
            }
        }
        launchIntentForPackage.setFlags(268435456);
        f1594t.startActivity(launchIntentForPackage);
        return true;
    }

    /* renamed from: a */
    public static final boolean m2568a(File file) {
        return f1595u != null && file.getPath().startsWith(f1595u.getPath());
    }

    /* renamed from: b */
    public static final Resources m2569b() {
        return f1594t.getResources();
    }

    /* renamed from: b */
    public static final void m2570b(PendingIntent pendingIntent) {
        if (f1596v == null) {
            f1596v = new LinkedList();
        }
        f1596v.add(pendingIntent);
    }

    /* renamed from: b */
    public static final void m2571b(String str) throws C0653m {
        try {
            if (!m2578e(str)) {
                if (str.equals(f1598z[5])) {
                    m2571b(f1598z[6]);
                    return;
                }
                throw new C0653m(str);
            }
        } catch (C0653m e) {
            throw e;
        } catch (C0653m e2) {
            throw e2;
        }
    }

    /* renamed from: b */
    public static final void m2572b(boolean z) {
        if (z) {
            f1592r |= 1;
        } else {
            f1592r &= -2;
        }
    }

    /* renamed from: c */
    public static final File m2573c() {
        return f1594t.getCacheDir();
    }

    /* renamed from: c */
    public static final boolean m2574c(String str) {
        ApplicationInfo a = m2558a(true);
        return (a == null || a.metaData == null) ? false : a.metaData.getBoolean(str);
    }

    /* renamed from: d */
    public static final String m2575d(String str) {
        ApplicationInfo a = m2558a(true);
        return (a == null || a.metaData == null) ? null : a.metaData.getString(str);
    }

    /* renamed from: d */
    public static final void m2576d() {
        f1592r |= 32;
    }

    /* renamed from: e */
    public static final int m2577e() {
        ApplicationInfo a = m2558a(false);
        return a != null ? a.targetSdkVersion : 0;
    }

    /* renamed from: e */
    public static final boolean m2578e(String str) {
        return ContextCompat.checkSelfPermission(f1594t, str) == 0;
    }

    /* renamed from: f */
    public static final synchronized boolean m2579f() {
        boolean z;
        synchronized (WDAppManager.class) {
            z = (f1592r & 8) > 0;
        }
        return z;
    }

    /* renamed from: g */
    public static final boolean m2580g() {
        return (f1592r & 512) > 0;
    }

    /* renamed from: h */
    public static final File m2581h() {
        String str = f1598z[11];
        return new File(C0897o.m6277e(C0808l.m4018a(m2544C().getDatabasePath(str).getPath(), str, "")));
    }

    /* renamed from: i */
    public static final File m2582i() {
        return f1595u;
    }

    /* renamed from: j */
    public static final boolean m2583j() {
        return (f1592r & 8) > 0 || (f1592r & 32) > 0 || (f1592r & 128) > 0 || (f1592r & 256) > 0;
    }

    /* renamed from: k */
    public static final boolean m2584k() {
        return (f1592r & 128) > 0;
    }

    /* renamed from: l */
    public static final boolean m2585l() {
        return (f1592r & 32) > 0;
    }

    /* renamed from: m */
    public static final void m2586m() {
        f1592r |= 4;
        C1372f.f4098i = f1598z[8];
    }

    /* renamed from: n */
    public static final boolean m2587n() {
        return (f1592r & 2) > 0;
    }

    /* renamed from: o */
    public static final synchronized C0648f m2588o() {
        C0648f c0648f;
        synchronized (WDAppManager.class) {
            if (f1590p == null) {
                f1590p = new C0648f(f1594t);
            }
            c0648f = f1590p;
        }
        return c0648f;
    }

    /* renamed from: p */
    public static final boolean m2589p() {
        return (f1592r & 1) > 0;
    }

    /* renamed from: q */
    public static final boolean m2590q() {
        if (WDProjet.isCree()) {
            f1592r &= -17;
        }
        return (f1592r & 16) == 16;
    }

    /* renamed from: r */
    public static final boolean m2591r() {
        Exception e;
        Throwable th;
        try {
            if (f1580f == null) {
                if (C0651k.m2644a(C0638a.SYSTEM, f1598z[3], f1598z[2]).toLowerCase().startsWith(f1598z[2])) {
                    f1580f = Boolean.TRUE;
                } else {
                    f1580f = Boolean.FALSE;
                    File file = new File(f1598z[4]);
                    if (file.exists()) {
                        BufferedReader bufferedReader;
                        try {
                            bufferedReader = new BufferedReader(new FileReader(file));
                            while (true) {
                                try {
                                    String readLine = bufferedReader.readLine();
                                    if (readLine == null) {
                                        break;
                                    }
                                    readLine = readLine.toLowerCase();
                                    if (readLine.startsWith(f1598z[0]) && readLine.contains(f1598z[2])) {
                                        break;
                                    }
                                } catch (IOException e2) {
                                    e = e2;
                                }
                            }
                            f1580f = Boolean.TRUE;
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException e3) {
                                }
                            }
                        } catch (IOException e4) {
                            e = e4;
                            bufferedReader = null;
                            try {
                                C0691a.m2857a(f1598z[1], e);
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (IOException e5) {
                                    }
                                }
                                return f1580f.booleanValue();
                            } catch (Throwable th2) {
                                th = th2;
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (IOException e6) {
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            bufferedReader = null;
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            throw th;
                        }
                    }
                }
            }
            return f1580f.booleanValue();
        } catch (IOException e7) {
            throw e7;
        } catch (IOException e72) {
            throw e72;
        }
    }

    /* renamed from: s */
    public static final boolean m2592s() {
        return (f1592r & 64) > 0;
    }

    /* renamed from: t */
    public static final Intent m2593t() {
        try {
            Intent intent = f1584j;
            return intent;
        } finally {
            f1584j = null;
        }
    }

    /* renamed from: u */
    public static final File m2594u() {
        if (f1575a == null) {
            C0691a.m2856a(f1598z[7]);
            try {
                return kb.m3975e();
            } catch (C0539d e) {
                WDErreurManager.m2875a(e);
            }
        }
        return f1575a;
    }

    /* renamed from: v */
    public static final void m2595v() {
        f1592r |= 128;
    }

    /* renamed from: w */
    public static final int m2596w() {
        PackageInfo x = m2597x();
        return x != null ? x.versionCode : 0;
    }

    /* renamed from: x */
    public static final PackageInfo m2597x() {
        try {
            return m2551J().getPackageInfo(f1594t.getPackageName(), 0);
        } catch (Exception e) {
            C0691a.m2857a(f1598z[9], e);
            return null;
        }
    }

    /* renamed from: y */
    public static final synchronized void m2598y() {
        synchronized (WDAppManager.class) {
            if (f1596v != null) {
                for (PendingIntent send : f1596v) {
                    try {
                        send.send();
                    } catch (CanceledException e) {
                        throw e;
                    } catch (CanceledException e2) {
                        throw e2;
                    } catch (Exception e3) {
                        C0691a.m2857a(f1598z[13], e3);
                    }
                }
                f1596v.clear();
                f1596v = null;
            }
            if (m2585l()) {
                f1594t.sendBroadcast(new Intent(f1598z[12]));
            }
            if (m2583j()) {
                m2549H();
            }
        }
    }

    /* renamed from: z */
    public static final File m2599z() {
        File file = null;
        File h = m2581h();
        if (h != null) {
            file = new File(h, f1598z[24]);
            file.mkdirs();
        }
        if (file != null && file.exists()) {
            return file;
        }
        C0691a.m2856a(f1598z[25]);
        return f1594t.getCacheDir();
    }

    /* renamed from: z */
    private static String m2600z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 119;
                    break;
                case 1:
                    i2 = 72;
                    break;
                case 2:
                    i2 = 74;
                    break;
                case 3:
                    i2 = 117;
                    break;
                default:
                    i2 = 1;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2601z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 1);
        }
        return toCharArray;
    }

    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        f1594t = context;
        if (m2574c(f1598z[26])) {
            MultiDex.install(this);
        }
    }

    public void onCreate() {
        try {
            super.onCreate();
            f1586l = System.currentTimeMillis();
            C0695c.m2912b();
            f1594t = getApplicationContext();
            f1575a = f1594t.getFilesDir();
            if (f1575a != null) {
                f1595u = f1575a.getParentFile();
            }
            f1592r = 1;
            if (kb.m3986p() >= C0657a.KIT_KAT.getNumero()) {
                Resources b = m2569b();
                int identifier = getResources().getIdentifier(f1598z[19], f1598z[17], f1598z[22]);
                if (identifier > 0) {
                    try {
                        if (b.getBoolean(identifier)) {
                            f1592r |= 64;
                        }
                    } catch (Exception e) {
                        throw e;
                    }
                }
            }
            String a = C0651k.m2644a(C0638a.APP, f1598z[23], "");
            if (!C0808l.m4053k(a)) {
                f1592r |= 1024;
                try {
                    Field declaredField = Class.forName(f1598z[16]).getDeclaredField(f1598z[21]);
                    declaredField.setAccessible(true);
                    declaredField.set(null, a);
                } catch (Exception e2) {
                    C0691a.m2857a("", e2);
                }
            }
            SharedPreferences E = m2546E();
            if (E != null) {
                try {
                    if (E.getBoolean(f1576b, false)) {
                        try {
                            Class.forName(f1598z[20]).getMethod("a", new Class[]{Boolean.TYPE}).invoke(null, new Object[]{Boolean.TRUE});
                        } catch (Exception e22) {
                            try {
                                if ((e22 instanceof ClassNotFoundException) || (e22 instanceof NoSuchMethodException)) {
                                    Editor edit = E.edit();
                                    edit.putBoolean(f1576b, false);
                                    edit.commit();
                                }
                                C0691a.m2857a(f1598z[18], e22);
                            } catch (Exception e222) {
                                throw e222;
                            }
                        }
                    }
                } catch (Exception e2222) {
                    throw e2222;
                }
            }
        } catch (Exception e22222) {
            throw e22222;
        }
    }
}
