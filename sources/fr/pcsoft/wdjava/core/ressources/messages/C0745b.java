package fr.pcsoft.wdjava.core.ressources.messages;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.application.C0638a;
import fr.pcsoft.wdjava.core.application.C0651k;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.utils.C0808l;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/* renamed from: fr.pcsoft.wdjava.core.ressources.messages.b */
public class C0745b {
    /* renamed from: a */
    private static ResourceBundle f1906a = null;
    /* renamed from: b */
    private static ResourceBundle f1907b = null;
    /* renamed from: c */
    private static final String f1908c = C0745b.m3227z(C0745b.m3228z("a\u0010\fR\u000br\u0002Q\u000b\u001d~\u0006\u0018#\ta\u001a\u000f\u0019\u000bg\f"));
    /* renamed from: d */
    private static final int f1909d = 6;
    /* renamed from: e */
    private static Locale f1910e = null;
    /* renamed from: f */
    private static final String f1911f = C0745b.m3227z(C0745b.m3228z("a\u0010\fR\u000br\u0002Q\u000b\u001d~\u0006\u0018#\u000fr\u0007\u0016\u001d\u001b\u0010"));
    /* renamed from: g */
    private static ResourceBundle f1912g = null;
    /* renamed from: h */
    private static final String f1913h = C0745b.m3227z(C0745b.m3228z("a\u0010\fR\u000br\u0002Q\u000b\u001d~\u0006\u0018#\u001ca\u0007\u0010\u000e"));
    /* renamed from: i */
    private static final int f1914i = 5;
    /* renamed from: j */
    private static ResourceBundle f1915j = null;
    /* renamed from: k */
    private static final String f1916k = C0745b.m3227z(C0745b.m3228z("a\u0010\fR\u000br\u0002Q\u000b\u001d~\u0006\u0018#\rj\u0005\u001a"));
    /* renamed from: l */
    private static final String f1917l = C0745b.m3227z(C0745b.m3228z("a\u0010\fR\u000br\u0002Q\u000b\u001d~\u0006\u0018#"));
    /* renamed from: m */
    private static final int f1918m = 4;
    /* renamed from: n */
    private static ResourceBundle f1919n = null;
    /* renamed from: o */
    private static final String f1920o = C0745b.m3227z(C0745b.m3228z("a\u0010\fR\u000br\u0002Q\u000b\u001d~\u0006\u0018#\u001ff\u001b\u001c\b\u0010|\u001b"));
    /* renamed from: p */
    private static ResourceBundle f1921p = null;
    /* renamed from: q */
    private static final String f1922q = C0745b.m3227z(C0745b.m3228z("a\u0010\fR\u000br\u0002Q\u000b\u001d~\u0006\u0018#\fz"));
    /* renamed from: r */
    private static final int f1923r = 3;
    /* renamed from: z */
    private static final String[] f1924z;

    static {
        r0 = new String[8];
        r0[0] = C0745b.m3227z(C0745b.m3228z("U<<40V' 57V-6/-R;+"));
        r0[1] = C0745b.m3227z(C0745b.m3228z("_\u0010_\u001a\u0016a\u0018\u001e\bYw\u0000_\u001a\u0010p\u001d\u0016\u0019\u000b3\";1Yv\u0006\u000b\\\ra\u001a\u000f\\\u0018}\u0016\u0016\u0019\u0017="));
        r0[2] = C0745b.m3227z(C0745b.m3228z("_\u0010_\u001a\u0010p\u001d\u0016\u0019\u000b3\u001bX\u0019\ngU\u000f\u001d\n3\u0000\u0011\\.W8Q"));
        r0[3] = C0745b.m3227z(C0745b.m3228z("@\u001c\u0018\u0012\u0018g\u0000\r\u0019Yz\u001b\t\u001d\u0015z\u0011\u001aR"));
        r0[4] = C0745b.m3227z(C0745b.m3228z("=\u0002\u001b\u0011"));
        r0[5] = C0745b.m3227z(C0745b.m3228z("g\u0018\u000f"));
        r0[6] = C0745b.m3227z(C0745b.m3228z("F!9QA"));
        r0[7] = C0745b.m3227z(C0745b.m3228z("U:-18G*62/R968<"));
        f1924z = r0;
        f1910e = new Locale(C0745b.m3227z(C0745b.m3228z("u\u0007")));
        String a = C0651k.m2644a(C0638a.BUILD, C0745b.m3227z(C0745b.m3228z("\u001a\u001c\u001d\u0015v")), C0745b.m3227z(C0745b.m3228z("U'")));
        if (a == null) {
            C0691a.m2856a(C0745b.m3227z(C0745b.m3228z("C\u0014\f\\\u001dvU\u0013\u001d\u0017t\u0000\u001a\\\u001dú\u0013\u0016\u0012\u0010vU\u001b\u001d\u0017`U\u0013\u0019\n3\u0005\r\u0013\ta\u001c\b`U\u001b\u0019Yq\u0000\u0016\u0010\u001d?U\u0010\u0012Yu\u001a\r\u001f\u001c3\u0019\u001e\\\u0015|\u0016\u001e\u0010\u001c33-R")));
            a = C0745b.m3227z(C0745b.m3228z("u\u0007"));
        }
        f1910e = new Locale(a);
    }

    /* renamed from: a */
    public static String m3219a(String str) {
        try {
            if (f1912g == null) {
                f1912g = ResourceBundle.getBundle(f1908c, f1910e);
            }
            return f1912g.getString(C0745b.m3226e(str));
        } catch (MissingResourceException e) {
            return "";
        }
    }

    /* renamed from: a */
    public static String m3220a(String str, String... strArr) {
        try {
            if (f1907b == null) {
                f1907b = ResourceBundle.getBundle(f1916k, f1910e);
            }
            return C0808l.m4021a(f1907b.getString(C0745b.m3226e(str)), strArr);
        } catch (MissingResourceException e) {
            return "";
        }
    }

    /* renamed from: b */
    public static String m3221b(String str) {
        try {
            if (f1915j == null) {
                f1915j = ResourceBundle.getBundle(f1920o, f1910e);
            }
            return f1915j.getString(C0745b.m3226e(str));
        } catch (MissingResourceException e) {
            return "";
        }
    }

    /* renamed from: b */
    public static String m3222b(String str, String... strArr) {
        try {
            if (f1906a == null) {
                f1906a = ResourceBundle.getBundle(f1913h, f1910e);
            }
            String string = f1906a.getString(C0745b.m3226e(str));
            return strArr.length > 0 ? C0808l.m4021a(string, strArr) : string;
        } catch (MissingResourceException e) {
            throw e;
        } catch (MissingResourceException e2) {
            return "";
        }
    }

    /* renamed from: c */
    public static String m3223c(String str) {
        try {
            if (f1921p == null) {
                f1921p = ResourceBundle.getBundle(f1911f, f1910e);
            }
            return f1921p.getString(C0745b.m3226e(str));
        } catch (MissingResourceException e) {
            return "";
        }
    }

    /* renamed from: c */
    public static String m3224c(String str, String... strArr) {
        try {
            if (f1919n == null) {
                f1919n = ResourceBundle.getBundle(f1922q, f1910e);
            }
            String string = f1919n.getString(C0745b.m3226e(str));
            return strArr.length > 0 ? C0808l.m4021a(string, strArr) : string;
        } catch (MissingResourceException e) {
            throw e;
        } catch (MissingResourceException e2) {
            return "";
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: d */
    public static final void m3225d(java.lang.String r15) throws fr.pcsoft.wdjava.file.C0901s {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Exception block dominator not found, method:fr.pcsoft.wdjava.core.ressources.messages.b.d(java.lang.String):void. bs: [B:10:0x0034, B:25:0x007c, B:34:0x0096, B:52:0x00f7, B:59:0x0120]
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:86)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/70807318.run(Unknown Source)
*/
        /*
        r0 = fr.pcsoft.wdjava.file.C0897o.m6290j(r15);
        r1 = r0.exists();	 Catch:{ IOException -> 0x0041 }
        if (r1 != 0) goto L_0x0024;	 Catch:{ IOException -> 0x0041 }
    L_0x000a:
        r1 = fr.pcsoft.wdjava.core.ressources.C0743a.m3205b(r15);	 Catch:{ IOException -> 0x0041 }
        if (r1 == 0) goto L_0x0055;	 Catch:{ IOException -> 0x0041 }
    L_0x0010:
        r0 = f1924z;	 Catch:{ IOException -> 0x0041 }
        r2 = 5;	 Catch:{ IOException -> 0x0041 }
        r0 = r0[r2];	 Catch:{ IOException -> 0x0041 }
        r2 = f1924z;	 Catch:{ IOException -> 0x0041 }
        r3 = 4;	 Catch:{ IOException -> 0x0041 }
        r2 = r2[r3];	 Catch:{ IOException -> 0x0041 }
        r0 = java.io.File.createTempFile(r0, r2);	 Catch:{ IOException -> 0x0041 }
        r0.deleteOnExit();	 Catch:{ IOException -> 0x0041 }
        fr.pcsoft.wdjava.core.utils.bb.m3845a(r1, r0);	 Catch:{ IOException -> 0x0041 }
    L_0x0024:
        r2 = new fr.pcsoft.wdjava.core.ressources.messages.a;	 Catch:{ IOException -> 0x0041 }
        r1 = "r";	 Catch:{ IOException -> 0x0041 }
        r2.<init>(r0, r1);	 Catch:{ IOException -> 0x0041 }
        r0 = r2.readInt();	 Catch:{ IOException -> 0x0041 }
        r1 = 1346589440; // 0x50435300 float:1.31079864E10 double:6.653035814E-315;
        if (r0 == r1) goto L_0x006f;
    L_0x0034:
        r0 = new java.io.IOException;	 Catch:{ IOException -> 0x003f }
        r1 = f1924z;	 Catch:{ IOException -> 0x003f }
        r2 = 3;	 Catch:{ IOException -> 0x003f }
        r1 = r1[r2];	 Catch:{ IOException -> 0x003f }
        r0.<init>(r1);	 Catch:{ IOException -> 0x003f }
        throw r0;	 Catch:{ IOException -> 0x003f }
    L_0x003f:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0041 }
    L_0x0041:
        r0 = move-exception;
        r0 = new fr.pcsoft.wdjava.file.s;
        r1 = 2;
        r2 = f1924z;
        r3 = 7;
        r2 = r2[r3];
        r3 = 0;
        r3 = new java.lang.String[r3];
        r2 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r2, r3);
        r0.<init>(r1, r2);
        throw r0;
    L_0x0055:
        r1 = new fr.pcsoft.wdjava.file.s;	 Catch:{ IOException -> 0x0041 }
        r2 = 1;	 Catch:{ IOException -> 0x0041 }
        r3 = f1924z;	 Catch:{ IOException -> 0x0041 }
        r4 = 0;	 Catch:{ IOException -> 0x0041 }
        r3 = r3[r4];	 Catch:{ IOException -> 0x0041 }
        r4 = 1;	 Catch:{ IOException -> 0x0041 }
        r4 = new java.lang.String[r4];	 Catch:{ IOException -> 0x0041 }
        r5 = 0;	 Catch:{ IOException -> 0x0041 }
        r0 = r0.getPath();	 Catch:{ IOException -> 0x0041 }
        r4[r5] = r0;	 Catch:{ IOException -> 0x0041 }
        r0 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r3, r4);	 Catch:{ IOException -> 0x0041 }
        r1.<init>(r2, r0);	 Catch:{ IOException -> 0x0041 }
        throw r1;	 Catch:{ IOException -> 0x0041 }
    L_0x006f:
        r0 = 4;	 Catch:{ IOException -> 0x0041 }
        r2.skipBytes(r0);	 Catch:{ IOException -> 0x0041 }
        r0 = r2.m3218b();	 Catch:{ IOException -> 0x0041 }
        r1 = 1048577; // 0x100001 float:1.46937E-39 double:5.18066E-318;
        if (r0 == r1) goto L_0x0089;
    L_0x007c:
        r0 = new java.io.IOException;	 Catch:{ IOException -> 0x0087 }
        r1 = f1924z;	 Catch:{ IOException -> 0x0087 }
        r2 = 2;	 Catch:{ IOException -> 0x0087 }
        r1 = r1[r2];	 Catch:{ IOException -> 0x0087 }
        r0.<init>(r1);	 Catch:{ IOException -> 0x0087 }
        throw r0;	 Catch:{ IOException -> 0x0087 }
    L_0x0087:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0041 }
    L_0x0089:
        r0 = 8;	 Catch:{ IOException -> 0x0041 }
        r2.skipBytes(r0);	 Catch:{ IOException -> 0x0041 }
        r0 = r2.m3218b();	 Catch:{ IOException -> 0x0041 }
        r1 = 2301; // 0x8fd float:3.224E-42 double:1.137E-320;
        if (r0 >= r1) goto L_0x00a3;
    L_0x0096:
        r0 = new java.io.IOException;	 Catch:{ IOException -> 0x00a1 }
        r1 = f1924z;	 Catch:{ IOException -> 0x00a1 }
        r2 = 1;	 Catch:{ IOException -> 0x00a1 }
        r1 = r1[r2];	 Catch:{ IOException -> 0x00a1 }
        r0.<init>(r1);	 Catch:{ IOException -> 0x00a1 }
        throw r0;	 Catch:{ IOException -> 0x00a1 }
    L_0x00a1:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0041 }
    L_0x00a3:
        r0 = r2.m3218b();	 Catch:{ IOException -> 0x0041 }
        r2.skipBytes(r0);	 Catch:{ IOException -> 0x0041 }
        r4 = r2.getFilePointer();	 Catch:{ IOException -> 0x0041 }
        r0 = 8;	 Catch:{ IOException -> 0x0041 }
        r2.skipBytes(r0);	 Catch:{ IOException -> 0x0041 }
        r0 = r2.m3217a();	 Catch:{ IOException -> 0x0041 }
        r0 = r0 + r4;	 Catch:{ IOException -> 0x0041 }
        r2.seek(r0);	 Catch:{ IOException -> 0x0041 }
        r0 = 12;	 Catch:{ IOException -> 0x0041 }
        r2.skipBytes(r0);	 Catch:{ IOException -> 0x0041 }
        r0 = r2.m3218b();	 Catch:{ IOException -> 0x0041 }
        r0 = r0 + -4;	 Catch:{ IOException -> 0x0041 }
        r2.skipBytes(r0);	 Catch:{ IOException -> 0x0041 }
        r3 = r2.m3218b();	 Catch:{ IOException -> 0x0041 }
        r0 = 0;	 Catch:{ IOException -> 0x0041 }
        r1 = r0;	 Catch:{ IOException -> 0x0041 }
    L_0x00cf:
        if (r1 >= r3) goto L_0x012a;	 Catch:{ IOException -> 0x0041 }
    L_0x00d1:
        r6 = r2.getFilePointer();	 Catch:{ IOException -> 0x0041 }
        r8 = r2.m3218b();	 Catch:{ IOException -> 0x0041 }
        r9 = r2.m3218b();	 Catch:{ IOException -> 0x0041 }
        r10 = r2.m3217a();	 Catch:{ IOException -> 0x0041 }
        r12 = r2.m3217a();	 Catch:{ IOException -> 0x0041 }
        r0 = 0;
        r14 = 6;
        if (r9 == r14) goto L_0x00fe;
    L_0x00e9:
        r14 = 5;
        if (r9 == r14) goto L_0x00fe;
    L_0x00ec:
        if (r0 == 0) goto L_0x00f1;
    L_0x00ee:
        switch(r9) {
            case 3: goto L_0x0120;
            case 4: goto L_0x0125;
            case 5: goto L_0x0120;
            case 6: goto L_0x0125;
            default: goto L_0x00f1;
        };
    L_0x00f1:
        r0 = r3 + -1;
        if (r1 >= r0) goto L_0x00fa;
    L_0x00f5:
        r8 = (long) r8;
        r6 = r6 + r8;
        r2.seek(r6);	 Catch:{ IOException -> 0x0128 }
    L_0x00fa:
        r0 = r1 + 1;
        r1 = r0;
        goto L_0x00cf;
    L_0x00fe:
        r10 = r10 + r4;
        r2.seek(r10);	 Catch:{ IOException -> 0x0041 }
        r0 = (int) r12;	 Catch:{ IOException -> 0x0041 }
        r0 = new byte[r0];	 Catch:{ IOException -> 0x0041 }
        r2.read(r0);	 Catch:{ IOException -> 0x0041 }
        r10 = new java.io.ByteArrayInputStream;	 Catch:{ IOException -> 0x0041 }
        r10.<init>(r0);	 Catch:{ IOException -> 0x0041 }
        r0 = new java.util.PropertyResourceBundle;	 Catch:{ IOException -> 0x0041 }
        r11 = new java.io.InputStreamReader;	 Catch:{ IOException -> 0x0041 }
        r12 = f1924z;	 Catch:{ IOException -> 0x0041 }
        r13 = 6;	 Catch:{ IOException -> 0x0041 }
        r12 = r12[r13];	 Catch:{ IOException -> 0x0041 }
        r11.<init>(r10, r12);	 Catch:{ IOException -> 0x0041 }
        r0.<init>(r11);	 Catch:{ IOException -> 0x0041 }
        r10.close();	 Catch:{ IOException -> 0x0041 }
        goto L_0x00ec;
    L_0x0120:
        f1919n = r0;	 Catch:{ IOException -> 0x0123 }
        goto L_0x00f1;
    L_0x0123:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0041 }
    L_0x0125:
        f1906a = r0;	 Catch:{ IOException -> 0x0041 }
        goto L_0x00f1;	 Catch:{ IOException -> 0x0041 }
    L_0x0128:
        r0 = move-exception;	 Catch:{ IOException -> 0x0041 }
        throw r0;	 Catch:{ IOException -> 0x0041 }
    L_0x012a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.core.ressources.messages.b.d(java.lang.String):void");
    }

    /* renamed from: e */
    private static final String m3226e(String str) {
        try {
            if (str.length() > 0 && str.charAt(0) == '#') {
                str = str.substring(1);
            }
            return str.trim();
        } catch (MissingResourceException e) {
            throw e;
        }
    }

    /* renamed from: z */
    private static String m3227z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 19;
                    break;
                case 1:
                    i2 = 117;
                    break;
                case 2:
                    i2 = C0607n.bx;
                    break;
                case 3:
                    i2 = C0607n.Hn;
                    break;
                default:
                    i2 = 121;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m3228z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 121);
        }
        return toCharArray;
    }
}
