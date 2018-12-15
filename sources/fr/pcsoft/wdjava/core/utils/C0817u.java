package fr.pcsoft.wdjava.core.utils;

import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import java.util.Random;
import java.util.UUID;

/* renamed from: fr.pcsoft.wdjava.core.utils.u */
public class C0817u {
    /* renamed from: a */
    public static Random f2167a = new Random();
    /* renamed from: b */
    public static final int f2168b = 0;
    /* renamed from: c */
    public static final int f2169c = 1;
    /* renamed from: z */
    private static final String[] f2170z = new String[]{C0817u.m4152z(C0817u.m4153z("\u0015e]J$di")), C0817u.m4152z(C0817u.m4153z("\u0015oSK+srLU0erL\\1yY"))};

    /* renamed from: a */
    public static final synchronized double m4148a() {
        double nextDouble;
        synchronized (C0817u.class) {
            nextDouble = f2167a.nextDouble();
        }
        return nextDouble;
    }

    /* renamed from: a */
    public static final synchronized int m4149a(int i, int i2) {
        int nextInt;
        synchronized (C0817u.class) {
            if (i2 == Integer.MAX_VALUE) {
                i2--;
            }
            if (i > i2) {
                WDErreurManager.m2883a(C0745b.m3222b(f2170z[1], C0745b.m3221b(f2170z[0])));
            }
            nextInt = f2167a.nextInt(Math.abs(i2 - i) + 1) + i;
        }
        return nextInt;
    }

    /* renamed from: a */
    public static final synchronized void m4150a(int i) {
        synchronized (C0817u.class) {
            if (i == -1) {
                f2167a.setSeed(System.currentTimeMillis());
            } else {
                f2167a.setSeed((long) i);
            }
        }
    }

    /* renamed from: b */
    public static final String m4151b(int i) {
        String uuid = UUID.randomUUID().toString();
        return i == 0 ? C0808l.m4018a(uuid, "-", "") : new StringBuilder(uuid.length() + 2).append('{').append(uuid).append('}').toString();
    }

    /* renamed from: z */
    private static String m4152z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 54;
                    break;
                case 1:
                    i2 = 45;
                    break;
                case 2:
                    i2 = 28;
                    break;
                case 3:
                    i2 = 25;
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
    private static char[] m4153z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 101);
        }
        return toCharArray;
    }
}
