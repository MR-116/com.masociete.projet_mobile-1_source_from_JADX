package fr.pcsoft.wdjava.net;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import fr.pcsoft.wdjava.core.C0486m;
import fr.pcsoft.wdjava.core.WDCallback;
import fr.pcsoft.wdjava.core.application.C0653m;
import fr.pcsoft.wdjava.core.application.WDAppManager;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.utils.C0808l;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Collections;

/* renamed from: fr.pcsoft.wdjava.net.d */
public class C0973d {
    /* renamed from: a */
    private static final int f2721a = 1;
    /* renamed from: b */
    private static final int f2722b = 2;
    /* renamed from: c */
    private static final int f2723c = 6;
    /* renamed from: d */
    private static final int f2724d = 1;
    /* renamed from: e */
    private static final int f2725e = 2;
    /* renamed from: f */
    private static final String f2726f = C0973d.m7033z(C0973d.m7034z("\ruv\u0004\n\u0011{V\n\u0015\u0006"));
    /* renamed from: g */
    private static final int f2727g = 4;
    /* renamed from: h */
    public static final int f2728h = 2;
    /* renamed from: i */
    private static final int f2729i = 5;
    /* renamed from: j */
    private static final int f2730j = 3;
    /* renamed from: k */
    private static final int f2731k = 0;
    /* renamed from: l */
    private static final int f2732l = 4;
    /* renamed from: m */
    private static BroadcastReceiver f2733m = null;
    /* renamed from: n */
    private static final int f2734n = 9;
    /* renamed from: o */
    private static final int f2735o = 3;
    /* renamed from: p */
    public static final int f2736p = 1;
    /* renamed from: z */
    private static final String[] f2737z;

    static {
        r0 = new String[5];
        r0[0] = C0973d.m7033z(C0973d.m7034z("n\u001a"));
        r0[1] = C0973d.m7033z(C0973d.m7034z("\u0002~f\u0001\n\nt,\u0003\u0000\u0011}k\u0000\u0016\nl]$ SG 6<^G'2,BI,67QV6"));
        r0[2] = C0973d.m7033z(C0973d.m7034z("\u0000l\u001d\u0000\u0000dk\u0005\f\u0017i"));
        r0[3] = C0973d.m7033z(C0973d.m7034z("F 0+_"));
        r0[4] = C0973d.m7033z(C0973d.m7034z("\u0002~f\u0001\n\nt,\u001d\u0000\u0017>a\u001c\u000b\r>A<+-UA',5YV*: XC=\"&"));
        f2737z = r0;
    }

    /* renamed from: a */
    public static String m7029a(int i) throws C1011t {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            int i2 = 0;
            for (NetworkInterface hardwareAddress : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                byte[] hardwareAddress2 = hardwareAddress.getHardwareAddress();
                if (hardwareAddress2 != null) {
                    if (i2 == i) {
                        for (int i3 = 0; i3 < hardwareAddress2.length; i3++) {
                            stringBuilder.append(String.format(f2737z[3], new Object[]{Byte.valueOf(hardwareAddress2[i3])}));
                        }
                        if (stringBuilder.length() > 0) {
                            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                        }
                        return stringBuilder == null ? stringBuilder.toString() : "";
                    }
                    i2++;
                }
            }
            if (stringBuilder == null) {
            }
            return stringBuilder == null ? stringBuilder.toString() : "";
        } catch (Exception e) {
            throw e;
        } catch (Exception e2) {
            throw e2;
        } catch (Exception e22) {
            throw e22;
        } catch (Exception e222) {
            throw new C1011t(e222.getMessage());
        }
    }

    /* renamed from: a */
    public static String m7030a(int i, int i2) throws C1011t {
        StringBuilder stringBuilder = null;
        try {
            int i3 = 0;
            for (NetworkInterface inetAddresses : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                for (InetAddress inetAddress : Collections.list(inetAddresses.getInetAddresses())) {
                    int i4;
                    if (inetAddress.isLoopbackAddress()) {
                        i4 = i3;
                    } else {
                        String hostAddress = inetAddress.getHostAddress();
                        Object obj = hostAddress.indexOf(58) < 0 ? 1 : null;
                        if ((obj == null || (i2 & 1) != 0) && !(obj == null && (i2 & 2) == 0)) {
                            StringBuilder stringBuilder2;
                            if (i >= 0) {
                                if (i == i3) {
                                    return hostAddress;
                                }
                                stringBuilder2 = stringBuilder;
                            } else if (stringBuilder != null) {
                                stringBuilder.append(f2737z[0]).append(hostAddress);
                                stringBuilder2 = stringBuilder;
                            } else {
                                stringBuilder2 = new StringBuilder(hostAddress);
                            }
                            stringBuilder = stringBuilder2;
                            i4 = i3 + 1;
                        }
                    }
                    i3 = i4;
                }
            }
            return stringBuilder != null ? stringBuilder.toString() : "";
        } catch (Exception e) {
            throw e;
        } catch (Exception e2) {
            throw e2;
        } catch (Exception e22) {
            throw new C1011t(e22.getMessage());
        }
    }

    /* renamed from: a */
    public static final boolean m7031a() {
        try {
            WDAppManager.m2571b(f2737z[1]);
        } catch (C0653m e) {
            WDErreurManager.m2883a(e.getMessage());
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) WDAppManager.m2544C().getSystemService(f2737z[2])).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return false;
        }
        try {
            return activeNetworkInfo.isConnectedOrConnecting();
        } catch (C0653m e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    public static final boolean m7032a(C0486m c0486m) {
        try {
            if (f2733m != null) {
                WDAppManager.m2561a(f2733m);
                f2733m = null;
            }
            if (!C0808l.m4053k(c0486m.toString())) {
                try {
                    WDAppManager.m2571b(f2737z[1]);
                } catch (C0653m e) {
                    WDErreurManager.m2883a(e.getMessage());
                }
                f2733m = new C0972b(WDCallback.m2239a(c0486m, -1, true));
                WDAppManager.m2562a(f2733m, new IntentFilter(f2737z[4]), false);
            }
            return true;
        } catch (C0653m e2) {
            throw e2;
        }
    }

    /* renamed from: z */
    private static String m7033z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 99;
                    break;
                case 1:
                    i2 = 16;
                    break;
                case 2:
                    i2 = 2;
                    break;
                case 3:
                    i2 = 115;
                    break;
                default:
                    i2 = 101;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7034z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 101);
        }
        return toCharArray;
    }
}
