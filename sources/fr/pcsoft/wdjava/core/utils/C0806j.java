package fr.pcsoft.wdjava.core.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.p042b.C0657a;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.p032m.C0938m;
import java.lang.reflect.Method;

/* renamed from: fr.pcsoft.wdjava.core.utils.j */
public class C0806j {
    /* renamed from: a */
    public static final int f2096a = 1108;
    /* renamed from: b */
    public static final int f2097b = 5182;
    /* renamed from: c */
    private static Method f2098c = null;
    /* renamed from: d */
    public static int f2099d = f2102g;
    /* renamed from: e */
    public static final int f2100e = 3183;
    /* renamed from: f */
    private static final SparseArray<bc> f2101f = new SparseArray();
    /* renamed from: g */
    public static final int f2102g = 5500;
    /* renamed from: h */
    public static final int f2103h = 1;
    /* renamed from: i */
    public static final ThreadLocal f2104i = new ThreadLocal();
    /* renamed from: j */
    public static final int f2105j = 2;
    /* renamed from: z */
    private static final String[] f2106z = new String[]{C0806j.m3955z(C0806j.m3956z(";¥;\tR\f)&\rO\u000bl/\r\u0001\u0013-k\u0018H\u0013)k\f@\u0011?k\u0004D_89\tH\u000b)&\rO\u000bl&\tO\n)'HE\u001al'\t\u0001\u001d#>\u000bM\u001al/\r\u0001\u0012)8\u001b@\u0018)")), C0806j.m3955z(C0806j.m3956z("\u0011)3\u001c")), C0806j.m3955z(C0806j.m3956z("6\"?\rS\r9;\u001cH\u0010\"k\fT_*'\u0007U_(l\rY\u001a/>\u001cH\u0010\"k\fT\r-%\u001c\u0001\u0013)k\u001cS\u001e%?\rL\u001a\"?HL\u001e\">\rM_(.HM\u001el)\u0007T\u001c .HE\u001al&\rR\f-,\r")), C0806j.m3955z(C0806j.m3956z("\\\u001a\u000e:r6\u0003\u00057r;\u0007\u0014)o;\u001e\u0004!e \u0005\u0005+n2\u001c\n<h=\u0000\u000e")), C0806j.m3955z(C0806j.m3956z("6!;\u0007R\f%)\u0004D_(.HS\u001a/2\u000bM\u001a>k\u0004D_!.\u001bR\u001e+."))};

    static {
        f2098c = null;
        if (kb.m3965a(C0657a.LOLLIPOP)) {
            try {
                f2098c = Message.class.getDeclaredMethod(C0806j.m3955z(C0806j.m3956z("\r)(\u0011B\u0013)\u001e\u0006B\u0017)(\u0003D\u001b")), (Class[]) null);
                f2098c.setAccessible(true);
            } catch (NoSuchMethodException e) {
                WDErreurManager.m2883a(C0745b.m3222b(f2106z[3], new String[0]));
            }
        }
    }

    /* renamed from: a */
    public static final void m3949a() {
        if (!C0938m.m6815b() && Looper.myLooper() == null) {
            Looper.prepare();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public static void m3950a(long r10, int r12, int r13, fr.pcsoft.wdjava.ui.champs.fenetre.C0508h r14) {
        /*
        r1 = 0;
        r0 = r13 & 1;
        if (r0 <= 0) goto L_0x00bb;
    L_0x0005:
        r0 = fr.pcsoft.wdjava.p032m.C0938m.m6815b();	 Catch:{ NoSuchMethodException -> 0x00b9 }
        if (r0 == 0) goto L_0x00bb;
    L_0x000b:
        r0 = 1;
        r2 = r0;
    L_0x000d:
        if (r2 == 0) goto L_0x01b8;
    L_0x000f:
        if (r14 != 0) goto L_0x0019;
    L_0x0011:
        r0 = fr.pcsoft.wdjava.core.context.WDAppelContexte.getContexte();	 Catch:{ NoSuchMethodException -> 0x00bf }
        r14 = r0.m2722h();	 Catch:{ NoSuchMethodException -> 0x00bf }
    L_0x0019:
        if (r14 == 0) goto L_0x01b8;
    L_0x001b:
        r0 = r14.isBloqueTouchEvent();
        r1 = 1;
        r14.setBloqueTouchEvent(r1);
        r3 = r0;
    L_0x0024:
        r1 = 0;
        r6 = fr.pcsoft.wdjava.core.utils.C0806j.m3954d();
        r0 = f2101f;	 Catch:{ all -> 0x00c3 }
        r0 = r0.get(r12);	 Catch:{ all -> 0x00c3 }
        r0 = (fr.pcsoft.wdjava.core.utils.bc) r0;	 Catch:{ all -> 0x00c3 }
        if (r0 == 0) goto L_0x00e0;
    L_0x0033:
        r0.m3849a();	 Catch:{ NoSuchMethodException -> 0x00c1 }
    L_0x0036:
        r7 = android.os.Looper.myQueue();	 Catch:{ all -> 0x00c3 }
        r4 = 0;
        r5 = android.os.MessageQueue.class;
        r0 = f2106z;	 Catch:{ NoSuchMethodException -> 0x00ed }
        r8 = 1;
        r8 = r0[r8];	 Catch:{ NoSuchMethodException -> 0x00ed }
        r0 = 0;
        r0 = (java.lang.Class[]) r0;	 Catch:{ NoSuchMethodException -> 0x00ed }
        r0 = r5.getDeclaredMethod(r8, r0);	 Catch:{ NoSuchMethodException -> 0x00ed }
        r4 = 1;
        r0.setAccessible(r4);	 Catch:{ NoSuchMethodException -> 0x01b0 }
        r5 = r0;
    L_0x004e:
        r8 = 0;
        r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1));
        if (r0 == 0) goto L_0x01b5;
    L_0x0054:
        r0 = new fr.pcsoft.wdjava.core.utils.mb;	 Catch:{ NoSuchMethodException -> 0x0101 }
        r0.<init>(r6, r12);	 Catch:{ NoSuchMethodException -> 0x0101 }
        r8 = java.lang.Math.abs(r10);	 Catch:{ NoSuchMethodException -> 0x0101 }
        r6.postDelayed(r0, r8);	 Catch:{ NoSuchMethodException -> 0x0101 }
        r4 = r1;
    L_0x0061:
        r0 = 0;
        r0 = new java.lang.Object[r0];	 Catch:{ Exception -> 0x0103 }
        r0 = r5.invoke(r7, r0);	 Catch:{ Exception -> 0x0103 }
        r0 = (android.os.Message) r0;	 Catch:{ Exception -> 0x0103 }
        if (r0 == 0) goto L_0x017f;
    L_0x006c:
        r1 = -1;
        r8 = r0.getTarget();	 Catch:{ NoSuchMethodException -> 0x012d }
        if (r8 == 0) goto L_0x0083;
    L_0x0073:
        r1 = r0.getTarget();	 Catch:{ NoSuchMethodException -> 0x012d }
        if (r1 != r6) goto L_0x0157;
    L_0x0079:
        r1 = f2101f;	 Catch:{ all -> 0x012f }
        r8 = r0.what;	 Catch:{ all -> 0x012f }
        r1 = r1.indexOfKey(r8);	 Catch:{ all -> 0x012f }
        if (r1 < 0) goto L_0x0157;
    L_0x0083:
        if (r1 < 0) goto L_0x009f;
    L_0x0085:
        r1 = r0.what;	 Catch:{ NoSuchMethodException -> 0x0132 }
        if (r1 != r12) goto L_0x013f;
    L_0x0089:
        r1 = f2101f;	 Catch:{ all -> 0x012f }
        r5 = r0.what;	 Catch:{ all -> 0x012f }
        r1 = r1.get(r5);	 Catch:{ all -> 0x012f }
        r1 = (fr.pcsoft.wdjava.core.utils.bc) r1;	 Catch:{ all -> 0x012f }
        if (r1 == 0) goto L_0x0136;
    L_0x0095:
        r5 = r1.m3850b();	 Catch:{ NoSuchMethodException -> 0x0134 }
        r7 = 1;
        if (r5 <= r7) goto L_0x0136;
    L_0x009c:
        r1.m3851c();	 Catch:{ NoSuchMethodException -> 0x0134 }
    L_0x009f:
        if (r4 == 0) goto L_0x014d;
    L_0x00a1:
        r0 = r4.isEmpty();	 Catch:{ NoSuchMethodException -> 0x014b }
        if (r0 != 0) goto L_0x014d;
    L_0x00a7:
        r0 = r4.size();	 Catch:{ NoSuchMethodException -> 0x014b }
        if (r0 <= 0) goto L_0x014d;
    L_0x00ad:
        r0 = r4.poll();	 Catch:{ NoSuchMethodException -> 0x00b7 }
        r0 = (android.os.Message) r0;	 Catch:{ NoSuchMethodException -> 0x00b7 }
        r6.sendMessage(r0);	 Catch:{ NoSuchMethodException -> 0x00b7 }
        goto L_0x00a7;
    L_0x00b7:
        r0 = move-exception;
        throw r0;
    L_0x00b9:
        r0 = move-exception;
        throw r0;
    L_0x00bb:
        r0 = 0;
        r2 = r0;
        goto L_0x000d;
    L_0x00bf:
        r0 = move-exception;
        throw r0;
    L_0x00c1:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00c3 }
    L_0x00c3:
        r0 = move-exception;
        r4 = r1;
        r1 = r0;
    L_0x00c6:
        if (r4 == 0) goto L_0x019d;
    L_0x00c8:
        r0 = r4.isEmpty();	 Catch:{ NoSuchMethodException -> 0x019b }
        if (r0 != 0) goto L_0x019d;
    L_0x00ce:
        r0 = r4.size();	 Catch:{ NoSuchMethodException -> 0x019b }
        if (r0 <= 0) goto L_0x019d;
    L_0x00d4:
        r0 = r4.poll();	 Catch:{ NoSuchMethodException -> 0x00de }
        r0 = (android.os.Message) r0;	 Catch:{ NoSuchMethodException -> 0x00de }
        r6.sendMessage(r0);	 Catch:{ NoSuchMethodException -> 0x00de }
        goto L_0x00ce;
    L_0x00de:
        r0 = move-exception;
        throw r0;
    L_0x00e0:
        r0 = f2101f;	 Catch:{ all -> 0x00c3 }
        r4 = new fr.pcsoft.wdjava.core.utils.bc;	 Catch:{ all -> 0x00c3 }
        r5 = 1;
        r4.<init>(r5);	 Catch:{ all -> 0x00c3 }
        r0.put(r12, r4);	 Catch:{ all -> 0x00c3 }
        goto L_0x0036;
    L_0x00ed:
        r0 = move-exception;
        r0 = r4;
    L_0x00ef:
        r4 = f2106z;	 Catch:{ all -> 0x00c3 }
        r5 = 3;
        r4 = r4[r5];	 Catch:{ all -> 0x00c3 }
        r5 = 0;
        r5 = new java.lang.String[r5];	 Catch:{ all -> 0x00c3 }
        r4 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r4, r5);	 Catch:{ all -> 0x00c3 }
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2883a(r4);	 Catch:{ all -> 0x00c3 }
        r5 = r0;
        goto L_0x004e;
    L_0x0101:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00c3 }
    L_0x0103:
        r0 = move-exception;
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2888b(r0);	 Catch:{ all -> 0x012f }
        if (r4 == 0) goto L_0x0123;
    L_0x0109:
        r0 = r4.isEmpty();	 Catch:{ NoSuchMethodException -> 0x0121 }
        if (r0 != 0) goto L_0x0123;
    L_0x010f:
        r0 = r4.size();	 Catch:{ NoSuchMethodException -> 0x0121 }
        if (r0 <= 0) goto L_0x0123;
    L_0x0115:
        r0 = r4.poll();	 Catch:{ NoSuchMethodException -> 0x011f }
        r0 = (android.os.Message) r0;	 Catch:{ NoSuchMethodException -> 0x011f }
        r6.sendMessage(r0);	 Catch:{ NoSuchMethodException -> 0x011f }
        goto L_0x010f;
    L_0x011f:
        r0 = move-exception;
        throw r0;
    L_0x0121:
        r0 = move-exception;
        throw r0;	 Catch:{ NoSuchMethodException -> 0x011f }
    L_0x0123:
        if (r2 == 0) goto L_0x012a;
    L_0x0125:
        if (r14 == 0) goto L_0x012a;
    L_0x0127:
        r14.setBloqueTouchEvent(r3);	 Catch:{ NoSuchMethodException -> 0x012b }
    L_0x012a:
        return;
    L_0x012b:
        r0 = move-exception;
        throw r0;
    L_0x012d:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x012f }
    L_0x012f:
        r0 = move-exception;
        r1 = r0;
        goto L_0x00c6;
    L_0x0132:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x012f }
    L_0x0134:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x012f }
    L_0x0136:
        r1 = f2101f;	 Catch:{ all -> 0x012f }
        r0 = r0.what;	 Catch:{ all -> 0x012f }
        r1.remove(r0);	 Catch:{ all -> 0x012f }
        goto L_0x009f;
    L_0x013f:
        r1 = android.os.Message.obtain(r0);	 Catch:{ all -> 0x012f }
        r6.sendMessage(r1);	 Catch:{ all -> 0x012f }
        fr.pcsoft.wdjava.core.utils.C0806j.m3951a(r0);	 Catch:{ all -> 0x012f }
        goto L_0x0061;
    L_0x014b:
        r0 = move-exception;
        throw r0;	 Catch:{ NoSuchMethodException -> 0x00b7 }
    L_0x014d:
        if (r2 == 0) goto L_0x012a;
    L_0x014f:
        if (r14 == 0) goto L_0x012a;
    L_0x0151:
        r14.setBloqueTouchEvent(r3);	 Catch:{ NoSuchMethodException -> 0x0155 }
        goto L_0x012a;
    L_0x0155:
        r0 = move-exception;
        throw r0;
    L_0x0157:
        r1 = r0.what;	 Catch:{ StackOverflowError -> 0x01ae, i -> 0x01ac }
        r8 = 1108; // 0x454 float:1.553E-42 double:5.474E-321;
        if (r1 != r8) goto L_0x0175;
    L_0x015d:
        r1 = r13 & 2;
        if (r1 <= 0) goto L_0x0175;
    L_0x0161:
        if (r4 != 0) goto L_0x01b3;
    L_0x0163:
        r1 = new java.util.LinkedList;	 Catch:{ StackOverflowError -> 0x01ae, i -> 0x01ac }
        r1.<init>();	 Catch:{ StackOverflowError -> 0x01ae, i -> 0x01ac }
    L_0x0168:
        r4 = android.os.Message.obtain(r0);	 Catch:{ StackOverflowError -> 0x0183, i -> 0x018f, all -> 0x01a7 }
        r1.add(r4);	 Catch:{ StackOverflowError -> 0x0183, i -> 0x018f, all -> 0x01a7 }
        fr.pcsoft.wdjava.core.utils.C0806j.m3951a(r0);	 Catch:{ StackOverflowError -> 0x0183, i -> 0x018f, all -> 0x01a7 }
        r4 = r1;
        goto L_0x0061;
    L_0x0175:
        r1 = r0.getTarget();	 Catch:{ StackOverflowError -> 0x01ae, i -> 0x01ac }
        r1.dispatchMessage(r0);	 Catch:{ StackOverflowError -> 0x01ae, i -> 0x01ac }
    L_0x017c:
        fr.pcsoft.wdjava.core.utils.C0806j.m3951a(r0);	 Catch:{ all -> 0x012f }
    L_0x017f:
        r0 = r4;
        r4 = r0;
        goto L_0x0061;
    L_0x0183:
        r4 = move-exception;
        r4 = r1;
    L_0x0185:
        r1 = f2106z;	 Catch:{ all -> 0x012f }
        r8 = 0;
        r1 = r1[r8];	 Catch:{ all -> 0x012f }
        r8 = 0;
        fr.pcsoft.wdjava.core.debug.C0691a.m2857a(r1, r8);	 Catch:{ all -> 0x012f }
        goto L_0x017c;
    L_0x018f:
        r4 = move-exception;
        r4 = r1;
    L_0x0191:
        r1 = f2106z;	 Catch:{ all -> 0x012f }
        r8 = 2;
        r1 = r1[r8];	 Catch:{ all -> 0x012f }
        r8 = 0;
        fr.pcsoft.wdjava.core.debug.C0691a.m2857a(r1, r8);	 Catch:{ all -> 0x012f }
        goto L_0x017c;
    L_0x019b:
        r0 = move-exception;
        throw r0;	 Catch:{ NoSuchMethodException -> 0x00de }
    L_0x019d:
        if (r2 == 0) goto L_0x01a4;
    L_0x019f:
        if (r14 == 0) goto L_0x01a4;
    L_0x01a1:
        r14.setBloqueTouchEvent(r3);	 Catch:{ NoSuchMethodException -> 0x01a5 }
    L_0x01a4:
        throw r1;
    L_0x01a5:
        r0 = move-exception;
        throw r0;
    L_0x01a7:
        r0 = move-exception;
        r4 = r1;
        r1 = r0;
        goto L_0x00c6;
    L_0x01ac:
        r1 = move-exception;
        goto L_0x0191;
    L_0x01ae:
        r1 = move-exception;
        goto L_0x0185;
    L_0x01b0:
        r4 = move-exception;
        goto L_0x00ef;
    L_0x01b3:
        r1 = r4;
        goto L_0x0168;
    L_0x01b5:
        r4 = r1;
        goto L_0x0061;
    L_0x01b8:
        r3 = r1;
        goto L_0x0024;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.core.utils.j.a(long, int, int, fr.pcsoft.wdjava.ui.champs.fenetre.h):void");
    }

    /* renamed from: a */
    private static final void m3951a(Message message) {
        if (f2098c != null) {
            try {
                f2098c.invoke(message, new Object[0]);
                return;
            } catch (Exception e) {
                C0691a.m2857a(f2106z[4], e);
                return;
            }
        }
        message.recycle();
    }

    /* renamed from: b */
    public static final int m3952b() {
        if (f2099d == Integer.MAX_VALUE) {
            f2099d = f2102g;
        } else {
            f2099d++;
        }
        return f2099d;
    }

    /* renamed from: c */
    public static final void m3953c() {
        int b = C0806j.m3952b();
        Message.obtain(C0806j.m3954d(), b).sendToTarget();
        C0806j.m3950a(0, b, 3, null);
    }

    /* renamed from: d */
    public static final synchronized Handler m3954d() {
        Handler handler;
        synchronized (C0806j.class) {
            handler = (Handler) f2104i.get();
            if (handler == null) {
                C0806j.m3949a();
                handler = new Handler();
                f2104i.set(handler);
            }
        }
        return handler;
    }

    /* renamed from: z */
    private static String m3955z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = C0607n.bx;
                    break;
                case 1:
                    i2 = 76;
                    break;
                case 2:
                    i2 = 75;
                    break;
                case 3:
                    i2 = 104;
                    break;
                default:
                    i2 = 33;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m3956z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 33);
        }
        return toCharArray;
    }
}
