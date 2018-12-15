package fr.pcsoft.wdjava.core.erreur.report;

import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;

/* renamed from: fr.pcsoft.wdjava.core.erreur.report.k */
public enum C0706k {
    ERROR_DATETIME(C0702f.ERROR),
    ERROR_MESSAGE(C0702f.ERROR),
    ERROR_SYSTEM_MESSAGE(C0702f.ERROR),
    ERROR_DEBUG_MESSAGE(C0702f.ERROR),
    ERROR_CODE(C0702f.ERROR),
    ERROR_WL_FUNCTION(C0702f.ERROR),
    ERROR_WL_PROCESS(C0702f.ERROR),
    ERROR_WL_STACK_TRACE(C0702f.ERROR),
    ERROR_STACK_TRACE(C0702f.ERROR),
    ERROR_THREAD(C0702f.ERROR),
    SCREENSHOT_PATH(C0702f.SCREENSHOT),
    APP_NAME(C0702f.APPLICATION),
    APP_VERSION(C0702f.APPLICATION),
    APP_PACKAGE_NAME(C0702f.APPLICATION),
    APP_START_DATETIME(C0702f.APPLICATION),
    APP_FRAMEWORK_VERSION(C0702f.APPLICATION),
    DEVICE_MODEL(C0702f.DEVICE),
    DEVICE_MANUFACTURER(C0702f.DEVICE),
    DEVICE_BRAND(C0702f.DEVICE),
    ANDROID_VERSION_NUM(C0702f.SYSTEM),
    ANDROID_API_LEVEL(C0702f.SYSTEM),
    TOTAL_MEMORY_SIZE(C0702f.SYSTEM),
    AVAILABLE_MEM_SIZE(C0702f.SYSTEM),
    DISPLAY_DENSITY(C0702f.SYSTEM),
    DISPLAY_RESOLUTION(C0702f.SYSTEM);
    
    /* renamed from: z */
    private static final String[] f1815z = null;
    /* renamed from: b */
    private C0702f f1816b;

    private C0706k(C0702f c0702f) {
        this.f1816b = c0702f;
    }

    /* renamed from: z */
    private static String m2943z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 75;
                    break;
                case 1:
                    i2 = 30;
                    break;
                case 2:
                    i2 = 96;
                    break;
                case 3:
                    i2 = 18;
                    break;
                default:
                    i2 = 46;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2944z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 46);
        }
        return toCharArray;
    }

    public C0702f getCategory() {
        return this.f1816b;
    }

    public String getName() {
        switch (C0700d.f1799a[ordinal()]) {
            case 1:
                return C0745b.m3224c(f1815z[24], new String[0]);
            case 2:
                return C0745b.m3224c(f1815z[7], new String[0]);
            case 3:
                return C0745b.m3224c(f1815z[0], new String[0]);
            case 4:
                return C0745b.m3224c(f1815z[1], new String[0]);
            case 5:
                return C0745b.m3224c(f1815z[25], new String[0]);
            case 6:
                return C0745b.m3224c(f1815z[17], new String[0]);
            case 7:
                return C0745b.m3224c(f1815z[22], new String[0]);
            case 8:
                return C0745b.m3224c(f1815z[11], new String[0]);
            case 9:
                return C0745b.m3224c(f1815z[4], new String[0]);
            case 10:
                return C0745b.m3224c(f1815z[19], new String[0]);
            case 11:
                return C0745b.m3224c(f1815z[18], new String[0]);
            case 12:
                return C0745b.m3224c(f1815z[13], new String[0]);
            case 13:
                return C0745b.m3224c(f1815z[12], new String[0]);
            case 14:
                return C0745b.m3224c(f1815z[9], new String[0]);
            case 15:
                return C0745b.m3224c(f1815z[14], new String[0]);
            case 16:
                return C0745b.m3224c(f1815z[6], new String[0]);
            case 17:
                return C0745b.m3224c(f1815z[20], new String[0]);
            case 18:
                return C0745b.m3224c(f1815z[23], new String[0]);
            case 19:
                return C0745b.m3224c(f1815z[10], new String[0]);
            case 20:
                return C0745b.m3224c(f1815z[2], new String[0]);
            case 21:
                return C0745b.m3224c(f1815z[16], new String[0]);
            case 22:
                return C0745b.m3224c(f1815z[8], new String[0]);
            case 23:
                return C0745b.m3224c(f1815z[15], new String[0]);
            case 24:
                return C0745b.m3224c(f1815z[3], new String[0]);
            case 25:
                return C0745b.m3224c(f1815z[21], new String[0]);
            default:
                C0691a.m2856a(f1815z[5]);
                return "";
        }
    }
}
