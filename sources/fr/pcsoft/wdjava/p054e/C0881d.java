package fr.pcsoft.wdjava.p054e;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentFilter;
import android.telephony.gsm.SmsManager;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.application.WDAppManager;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.p042b.C0657a;
import fr.pcsoft.wdjava.core.utils.ic;
import fr.pcsoft.wdjava.core.utils.jc;
import fr.pcsoft.wdjava.core.utils.kb;
import java.util.ArrayList;

/* renamed from: fr.pcsoft.wdjava.e.d */
final class C0881d extends ic {
    /* renamed from: z */
    private static final String[] f2373z = new String[]{C0881d.m6187z(C0881d.m6188z("mt\u001bZ e~Q\\*`\u000f@ bcQ{\"W\u001eF.k\r")), C0881d.m6187z(C0881d.m6188z("Iy\u0017M,,~\u001a\b#m:\u0012Á;du\u001bMoh=\u001aF9cs_L*,I2{ojK&js\u000e]*,{\n\b\bmv\u001eP6,I6aou\n[oMt\u001bZ e~")), C0881d.m6187z(C0881d.m6188z("_W,w\u001cIT+")), C0881d.m6187z(C0881d.m6188z("\u0011L\u0002yv\u000bA?mh\u000b|*tn2M<{\u0018M")), C0881d.m6187z(C0881d.m6188z("k\u000bl*j{\nD;"))};
    final String val$strMessageSMS;
    final String val$strNumeroSMS;

    C0881d(String str, String str2) {
        this.val$strMessageSMS = str;
        this.val$strNumeroSMS = str2;
    }

    static void access$100(C0881d c0881d, Object obj) {
        c0881d.m1787a(obj);
    }

    /* renamed from: z */
    private static String m6187z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 12;
                    break;
                case 1:
                    i2 = 26;
                    break;
                case 2:
                    i2 = C0607n.bx;
                    break;
                case 3:
                    i2 = 40;
                    break;
                default:
                    i2 = 79;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m6188z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 79);
        }
        return toCharArray;
    }

    /* renamed from: c */
    protected void mo2434c() {
        int i = 0;
        String str = f2373z[2];
        PendingIntent broadcast = PendingIntent.getBroadcast(WDAppManager.m2544C(), 0, new Intent(str), 0);
        WDAppManager.m2562a(new C0879b(this), new IntentFilter(str), true);
        SmsManager smsManager = SmsManager.getDefault();
        int length = this.val$strMessageSMS.length();
        int i2 = 0;
        while (i2 < length) {
            try {
                if (this.val$strMessageSMS.charAt(i2) > '') {
                    length = 0;
                    break;
                }
                i2++;
            } catch (Exception e) {
                throw e;
            }
        }
        boolean z = true;
        try {
            boolean z2;
            ArrayList divideMessage;
            ArrayList arrayList;
            Object invoke;
            if (kb.m3966a(jc.GALAXY_SII)) {
                if (WDProjet.getInstance().isVersionCompatible(C0657a.ICE_CREAM_SANDWICH.getNumero())) {
                    z2 = true;
                    if (length != 0 || z2) {
                        divideMessage = smsManager.divideMessage(this.val$strMessageSMS);
                        arrayList = new ArrayList(divideMessage.size());
                        while (i < divideMessage.size()) {
                            try {
                                arrayList.add(null);
                                i++;
                            } catch (Exception e2) {
                                throw e2;
                            }
                        }
                        arrayList.set(arrayList.size() - 1, broadcast);
                        if (z2) {
                            smsManager.sendMultipartTextMessage(this.val$strNumeroSMS, null, divideMessage, arrayList, null);
                            return;
                        }
                        try {
                            invoke = Class.forName(f2373z[0]).getMethod(f2373z[4], new Class[0]).invoke(null, new Object[0]);
                            invoke.getClass().getMethod(f2373z[3], new Class[]{String.class, String.class, ArrayList.class, ArrayList.class, ArrayList.class, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(invoke, new Object[]{this.val$strNumeroSMS, null, divideMessage, arrayList, null, Boolean.valueOf(false), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0)});
                        } catch (Exception e3) {
                            C0691a.m2857a(f2373z[1], e3);
                            smsManager.sendMultipartTextMessage(this.val$strNumeroSMS, null, divideMessage, arrayList, null);
                            return;
                        }
                    }
                    smsManager.sendTextMessage(this.val$strNumeroSMS, null, this.val$strMessageSMS, broadcast, null);
                    return;
                }
            }
            z2 = false;
            if (length != 0) {
            }
            divideMessage = smsManager.divideMessage(this.val$strMessageSMS);
            arrayList = new ArrayList(divideMessage.size());
            while (i < divideMessage.size()) {
                arrayList.add(null);
                i++;
            }
            arrayList.set(arrayList.size() - 1, broadcast);
            if (z2) {
                smsManager.sendMultipartTextMessage(this.val$strNumeroSMS, null, divideMessage, arrayList, null);
                return;
            }
            invoke = Class.forName(f2373z[0]).getMethod(f2373z[4], new Class[0]).invoke(null, new Object[0]);
            invoke.getClass().getMethod(f2373z[3], new Class[]{String.class, String.class, ArrayList.class, ArrayList.class, ArrayList.class, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(invoke, new Object[]{this.val$strNumeroSMS, null, divideMessage, arrayList, null, Boolean.valueOf(false), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0)});
        } catch (Exception e22) {
            throw e22;
        } catch (Exception e222) {
            throw e222;
        }
    }
}
