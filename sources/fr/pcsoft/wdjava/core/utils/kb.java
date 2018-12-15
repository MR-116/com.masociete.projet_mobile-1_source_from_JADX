package fr.pcsoft.wdjava.core.utils;

import android.content.ContentResolver;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.os.Vibrator;
import android.provider.Settings.System;
import android.telephony.TelephonyManager;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailability;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.application.C0653m;
import fr.pcsoft.wdjava.core.application.WDAppManager;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.p035c.C0664f;
import fr.pcsoft.wdjava.core.p042b.C0657a;
import fr.pcsoft.wdjava.file.C0901s;
import fr.pcsoft.wdjava.ui.dialogue.C1372f;
import fr.pcsoft.wdjava.ui.utils.C1511l;
import java.io.File;

public class kb {
    /* renamed from: a */
    public static final int f2108a = 1;
    /* renamed from: b */
    public static final int f2109b = 3;
    /* renamed from: c */
    public static final int f2110c = 2;
    /* renamed from: d */
    public static final int f2111d = 4;
    /* renamed from: z */
    private static final String[] f2112z = new String[]{m3989z(m3990z("Vng?]T")), m3989z(m3990z("B`e+D_f")), m3989z(m3990z("vU%\b\u0004\u000308")), m3989z(m3990z("rNG\u0014axY(\u000b\t\u00011k")), m3989z(m3990z("vU%\u0011\b\u000018")), m3989z(m3990z("dp-B\u00114")), m3989z(m3990z("Psk0^B.I*RYn{x\u0000\u00010(\u0011_Edz6TE!\\9S]d|wp\u000019\u0011e")), m3989z(m3990z("vU%\u0011\b\u00041=")), m3989z(m3990z("zhf<]T!N1CT")), m3989z(m3990z("\\n}6ETeW*^")), m3989z(m3990z("\\n}6ETe")), m3989z(m3990z("RnevV^no4T\u001f`f<C^hlv\\Pq{v|PqI;EXwa,H")), m3989z(m3990z("h~=PD!l=\u0011]nox_^o(*TRnf6D\u001f")), m3989z(m3990z("Pol*^Xe&+DAqg*E\u001fw<vGXdvgXd\bPVdz")), m3989z(m3990z("Ghj*PEnz")), m3989z(m3990z("Pol*^Xe&(TCla+BXnfvgxCZ\u0019et")), m3989z(m3990z("xbmxrCdi5\u0011b`f<FXb`")), m3989z(m3990z("vhf?TCcz=PU")), m3989z(m3990z("tbd9XC")), m3989z(m3990z("Doc6^Fo")), m3989z(m3990z("}nd4XAnx")), m3989z(m3990z("wsg!^")), m3989z(m3990z("{dd4H\u0011Cm9_")), m3989z(m3990z("zh|\u0013PE")), m3989z(m3990z("ynf=HRne:")), m3989z(m3990z("unf-E")), m3989z(m3990z("rtx;PZd")), m3989z(m3990z("mr#")), m3989z(m3990z("Pb|1GXuq")), m3989z(m3990z("\u001eqz7R\u001elm5X_gg")), m3989z(m3990z("Aig6T")), m3989z(m3990z("Pol*^Xe&(TCla+BXnfvct@L\u0007ayNF\u001dnbUI\ft")), m3989z(m3990z("Pol*^XeW1U")), m3989z(m3990z("Pol*^Xe&(TCla+BXnfvct@L\u0007tiUM\npMW\u000be~SI\u001ft")), m3989z(m3990z("Pol*^Xe&(TCla+BXnfvfcH\\\u001dntY\\\u001dc@D\u0007beNZ\u0019vt"))};

    /* renamed from: a */
    public static final long m3959a(int i) throws C0901s {
        File e = m3975e();
        if (e == null) {
            return 0;
        }
        try {
            if (!e.exists()) {
                return 0;
            }
            StatFs statFs = new StatFs(e.getPath());
            if (statFs == null) {
                return 0;
            }
            if (i != 4) {
                return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
            }
            try {
                return ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
            } catch (C0901s e2) {
                throw e2;
            }
        } catch (C0901s e22) {
            throw e22;
        }
    }

    /* renamed from: a */
    public static final String m3960a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(Build.BRAND).append("/").append(Build.PRODUCT).append("/").append(Build.DEVICE);
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static final void m3961a(int i, String str) {
        switch (i) {
            case 2:
                m3974d(str);
                return;
            case 3:
                m3972c(str);
                return;
            case 4:
                m3968b(str);
                return;
            default:
                m3962a(str);
                return;
        }
    }

    /* renamed from: a */
    public static final void m3962a(String str) {
        m3963a(str, 4);
    }

    /* renamed from: a */
    private static final void m3963a(String str, int i) {
        String nomApplication = WDProjet.getInstance().getNomApplication();
        if (str == null) {
            str = "";
        }
        switch (i) {
            case 2:
                break;
            case 3:
                Log.d(nomApplication, str);
                return;
            case 4:
                Log.i(nomApplication, str);
                return;
            case 5:
                Log.w(nomApplication, str);
                return;
            case 6:
                Log.e(nomApplication, str);
                return;
            case 7:
                Log.println(7, nomApplication, str);
                return;
            default:
                C0691a.m2856a(f2112z[12]);
                break;
        }
        Log.v(nomApplication, str);
    }

    /* renamed from: a */
    public static final void m3964a(long[] jArr) {
        if (WDAppManager.m2544C().checkCallingOrSelfPermission(f2112z[15]) == 0) {
            Vibrator vibrator = (Vibrator) WDAppManager.m2544C().getSystemService(f2112z[14]);
            if (vibrator == null) {
                return;
            }
            if (jArr.length == 1) {
                vibrator.vibrate(jArr[0]);
            } else {
                vibrator.vibrate(jArr, -1);
            }
        }
    }

    /* renamed from: a */
    public static final boolean m3965a(C0657a c0657a) {
        return m3986p() >= c0657a.getNumero();
    }

    /* renamed from: a */
    public static final boolean m3966a(jc jcVar) {
        switch (C0821y.f2180a[jcVar.ordinal()]) {
            case 1:
                return m3960a().equals(f2112z[6]);
            case 2:
                return Build.MODEL.equals(f2112z[8]);
            case 3:
                return Build.MODEL.equals(f2112z[4]);
            case 4:
                return Build.MODEL.equals(f2112z[3]);
            case 5:
                return Build.MODEL.equals(f2112z[7]) && Build.BRAND.equals(f2112z[1]);
            case 6:
                return Build.MODEL.equals(f2112z[5]) && Build.BRAND.equals(f2112z[0]);
            case 7:
                return Build.MODEL.equals(f2112z[2]) && Build.BRAND.equals(f2112z[1]);
            default:
                return false;
        }
    }

    /* renamed from: b */
    public static final void m3967b(int i) {
        m3964a(new long[]{(long) i});
    }

    /* renamed from: b */
    public static final void m3968b(String str) {
        m3963a(str, 6);
    }

    /* renamed from: b */
    public static final boolean m3969b() {
        try {
            Class.forName(f2112z[11]);
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    /* renamed from: c */
    public static final int m3970c() {
        return Process.myPid();
    }

    /* renamed from: c */
    public static final String m3971c(int i) {
        switch (i) {
            case 3:
                return f2112z[26];
            case 4:
                return f2112z[25];
            case 5:
            case 6:
            case 7:
                return f2112z[18];
            case 8:
                return f2112z[21];
            case 9:
            case 10:
                return f2112z[17];
            case 11:
            case 12:
            case 13:
                return f2112z[24];
            case 14:
            case 15:
                return f2112z[16];
            case 16:
            case 17:
            case 18:
                return f2112z[22];
            case 19:
            case 20:
                return f2112z[23];
            case 21:
            case 22:
                return f2112z[20];
            case 23:
                return "M";
            case 24:
            case 25:
                return "N";
            case 26:
            case 27:
                return "O";
            default:
                return f2112z[19];
        }
    }

    /* renamed from: c */
    public static final void m3972c(String str) {
        m3963a(str, 7);
    }

    /* renamed from: d */
    public static final String m3973d() {
        return m3971c(m3986p());
    }

    /* renamed from: d */
    public static final void m3974d(String str) {
        m3963a(str, 3);
    }

    /* renamed from: e */
    public static final File m3975e() throws C0901s {
        try {
            if (m3965a(C0657a.MARSHMALLOW)) {
                try {
                    WDAppManager.m2565a(f2112z[33], f2112z[34]);
                } catch (C0653m e) {
                    throw new C0901s((int) C0607n.sf, e.getMessage());
                }
            }
            return Environment.getExternalStorageDirectory();
        } catch (C0901s e2) {
            throw e2;
        }
    }

    /* renamed from: f */
    public static final boolean m3976f() {
        return WDAppManager.m2591r();
    }

    /* renamed from: g */
    public static final String m3977g() {
        ContentResolver L = WDAppManager.m2553L();
        if (L == null) {
            return "";
        }
        String string = System.getString(L, f2112z[32]);
        return string != null ? string : "";
    }

    /* renamed from: h */
    public static long m3978h() {
        long blockSizeLong;
        long blockCountLong;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        if (VERSION.SDK_INT >= 18) {
            blockSizeLong = statFs.getBlockSizeLong();
            blockCountLong = statFs.getBlockCountLong();
        } else {
            blockSizeLong = (long) statFs.getBlockSize();
            blockCountLong = (long) statFs.getBlockCount();
        }
        return blockCountLong * blockSizeLong;
    }

    /* renamed from: i */
    public static final void m3979i() throws C0664f {
        int isGooglePlayServicesAvailable = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(WDAppManager.m2544C());
        if (isGooglePlayServicesAvailable != 0) {
            String errorString = GoogleApiAvailability.getInstance().getErrorString(isGooglePlayServicesAvailable);
            try {
                if (GoogleApiAvailability.getInstance().isUserResolvableError(isGooglePlayServicesAvailable)) {
                    if (C1372f.m9828a().mo3753a(isGooglePlayServicesAvailable, errorString)) {
                        return;
                    }
                }
                throw new C0664f(errorString, isGooglePlayServicesAvailable);
            } catch (C0664f e) {
                throw e;
            } catch (C0664f e2) {
                throw e2;
            }
        }
    }

    /* renamed from: j */
    public static final boolean m3980j() {
        try {
            Class.forName(f2112z[13]);
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    /* renamed from: k */
    public static final boolean m3981k() {
        return C1511l.m10521b() >= 7.0d;
    }

    /* renamed from: l */
    public static final boolean m3982l() {
        return m3966a(jc.GALAXY_TAB3);
    }

    /* renamed from: m */
    public static long m3983m() {
        long blockSizeLong;
        long availableBlocksLong;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        if (VERSION.SDK_INT >= 18) {
            blockSizeLong = statFs.getBlockSizeLong();
            availableBlocksLong = statFs.getAvailableBlocksLong();
        } else {
            blockSizeLong = (long) statFs.getBlockSize();
            availableBlocksLong = (long) statFs.getAvailableBlocks();
        }
        return availableBlocksLong * blockSizeLong;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.annotation.TargetApi(16)
    /* renamed from: n */
    public static final long m3984n() {
        /*
        r0 = fr.pcsoft.wdjava.core.p042b.C0657a.JELLY_BEAN;
        r0 = m3965a(r0);
        if (r0 == 0) goto L_0x0023;
    L_0x0008:
        r0 = fr.pcsoft.wdjava.core.application.WDAppManager.m2544C();
        r1 = f2112z;
        r2 = 28;
        r1 = r1[r2];
        r0 = r0.getSystemService(r1);
        r0 = (android.app.ActivityManager) r0;
        r1 = new android.app.ActivityManager$MemoryInfo;
        r1.<init>();
        r0.getMemoryInfo(r1);
        r0 = r1.totalMem;
    L_0x0022:
        return r0;
    L_0x0023:
        r0 = f2112z;
        r1 = 29;
        r1 = r0[r1];
        r4 = 0;
        r0 = 0;
        r3 = new java.io.FileReader;	 Catch:{ IOException -> 0x007a, all -> 0x0081 }
        r3.<init>(r1);	 Catch:{ IOException -> 0x007a, all -> 0x0081 }
        r2 = new java.io.BufferedReader;	 Catch:{ IOException -> 0x007a, all -> 0x0081 }
        r1 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        r2.<init>(r3, r1);	 Catch:{ IOException -> 0x007a, all -> 0x0081 }
        r1 = r2.readLine();	 Catch:{ IOException -> 0x008a, all -> 0x0088 }
        r0 = f2112z;	 Catch:{ IOException -> 0x008a, all -> 0x0088 }
        r3 = 27;
        r0 = r0[r3];	 Catch:{ IOException -> 0x008a, all -> 0x0088 }
        r3 = r1.split(r0);	 Catch:{ IOException -> 0x008a, all -> 0x0088 }
        r6 = r3.length;	 Catch:{ IOException -> 0x008a, all -> 0x0088 }
        r0 = 0;
    L_0x0048:
        if (r0 >= r6) goto L_0x0065;
    L_0x004a:
        r7 = r3[r0];	 Catch:{ IOException -> 0x008a, all -> 0x0088 }
        r8 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x008a, all -> 0x0088 }
        r8.<init>();	 Catch:{ IOException -> 0x008a, all -> 0x0088 }
        r7 = r8.append(r7);	 Catch:{ IOException -> 0x008a, all -> 0x0088 }
        r8 = "\t";
        r7 = r7.append(r8);	 Catch:{ IOException -> 0x008a, all -> 0x0088 }
        r7 = r7.toString();	 Catch:{ IOException -> 0x008a, all -> 0x0088 }
        android.util.Log.i(r1, r7);	 Catch:{ IOException -> 0x008a, all -> 0x0088 }
        r0 = r0 + 1;
        goto L_0x0048;
    L_0x0065:
        r0 = 1;
        r0 = r3[r0];	 Catch:{ IOException -> 0x008a, all -> 0x0088 }
        r0 = java.lang.Integer.valueOf(r0);	 Catch:{ IOException -> 0x008a, all -> 0x0088 }
        r0 = r0.intValue();	 Catch:{ IOException -> 0x008a, all -> 0x0088 }
        r0 = r0 * 1024;
        r0 = (long) r0;
        r2.close();	 Catch:{ IOException -> 0x008d, all -> 0x0088 }
        fr.pcsoft.wdjava.core.utils.bb.m3844a(r2);
        goto L_0x0022;
    L_0x007a:
        r1 = move-exception;
        r2 = r0;
        r0 = r4;
    L_0x007d:
        fr.pcsoft.wdjava.core.utils.bb.m3844a(r2);
        goto L_0x0022;
    L_0x0081:
        r1 = move-exception;
        r2 = r0;
        r0 = r1;
    L_0x0084:
        fr.pcsoft.wdjava.core.utils.bb.m3844a(r2);
        throw r0;
    L_0x0088:
        r0 = move-exception;
        goto L_0x0084;
    L_0x008a:
        r0 = move-exception;
        r0 = r4;
        goto L_0x007d;
    L_0x008d:
        r3 = move-exception;
        goto L_0x007d;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.core.utils.kb.n():long");
    }

    @Deprecated
    /* renamed from: o */
    public static final int m3985o() {
        String externalStorageState = Environment.getExternalStorageState();
        return f2112z[10].equals(externalStorageState) ? 1 : f2112z[9].equals(externalStorageState) ? 2 : 0;
    }

    /* renamed from: p */
    public static final int m3986p() {
        return VERSION.SDK_INT;
    }

    /* renamed from: q */
    public static final String m3987q() {
        return VERSION.RELEASE;
    }

    /* renamed from: r */
    public static final String m3988r() throws C0664f {
        try {
            WDAppManager.m2565a(f2112z[31]);
            TelephonyManager telephonyManager = (TelephonyManager) WDAppManager.m2544C().getSystemService(f2112z[30]);
            if (telephonyManager != null) {
                return telephonyManager.getDeviceId();
            }
            try {
                return "";
            } catch (C0653m e) {
                throw e;
            }
        } catch (C0653m e2) {
            throw new C0664f(e2.getMessage());
        }
    }

    /* renamed from: z */
    private static String m3989z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 49;
                    break;
                case 1:
                    i2 = 1;
                    break;
                case 2:
                    i2 = 8;
                    break;
                case 3:
                    i2 = 88;
                    break;
                default:
                    i2 = 49;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m3990z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 49);
        }
        return toCharArray;
    }
}
