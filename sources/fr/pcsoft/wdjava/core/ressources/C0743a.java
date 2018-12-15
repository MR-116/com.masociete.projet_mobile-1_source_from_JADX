package fr.pcsoft.wdjava.core.ressources;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.webkit.URLUtil;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.application.WDAppManager;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.p035c.C0665g;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.core.utils.bb;
import fr.pcsoft.wdjava.core.utils.kb;
import fr.pcsoft.wdjava.core.utils.nb;
import fr.pcsoft.wdjava.file.C0897o;
import fr.pcsoft.wdjava.file.C0901s;
import fr.pcsoft.wdjava.p061q.p062a.C1014a;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.zip.CRC32;

/* renamed from: fr.pcsoft.wdjava.core.ressources.a */
public class C0743a {
    /* renamed from: a */
    public static final String f1886a = C0743a.m3215z(C0743a.m3216z("L\\h\"\u00158\b"));
    /* renamed from: b */
    public static final String f1887b = C0743a.m3215z(C0743a.m3216z("L\\h\"\u0012:\b"));
    /* renamed from: c */
    public static final String f1888c = C0743a.m3215z(C0743a.m3216z("L\\h\"\u00118\b"));
    /* renamed from: d */
    private static final String f1889d = C0743a.m3215z(C0743a.m3216z("/\u001b^\u0002oIk;h"));
    /* renamed from: e */
    public static final String f1890e = C0743a.m3215z(C0743a.m3216z("L\\h\"\u00174\b"));
    /* renamed from: f */
    private static final String f1891f = C0743a.m3215z(C0743a.m3216z("/\u001bZ\u000fg/\u001b"));
    /* renamed from: g */
    public static final String f1892g = C0743a.m3215z(C0743a.m3216z("L\\h\"\u0010t"));
    /* renamed from: h */
    private static final HashMap<String, Integer> f1893h = new HashMap();
    /* renamed from: i */
    public static final String f1894i = C0743a.m3215z(C0743a.m3216z("L\\h\"\u0012S\r`"));
    /* renamed from: j */
    private static final String f1895j = C0743a.m3215z(C0743a.m3216z("/\u001bT\u0002a_\u001b;"));
    /* renamed from: k */
    public static final String f1896k = C0743a.m3215z(C0743a.m3216z("/\u001bK\u0012pX}Uh\u0000"));
    /* renamed from: l */
    private static nb<String, Object> f1897l = null;
    /* renamed from: m */
    public static final String f1898m = C0743a.m3215z(C0743a.m3216z("L\\h\"\u0010>\b"));
    /* renamed from: n */
    public static final String f1899n = C0743a.m3215z(C0743a.m3216z("L\\h\"\u0011t"));
    /* renamed from: o */
    private static final String f1900o = C0743a.m3215z(C0743a.m3216z("/\u001bK\u000f`Mj\\h\u0000"));
    /* renamed from: p */
    public static final String f1901p = C0743a.m3215z(C0743a.m3216z("L\\h\"\u0017t"));
    /* renamed from: q */
    public static final String f1902q = C0743a.m3215z(C0743a.m3216z("L\\h\""));
    /* renamed from: r */
    public static final String f1903r = C0743a.m3215z(C0743a.m3216z("L\\h\"\u0012t"));
    /* renamed from: z */
    private static final String[] f1904z;

    static {
        r0 = new String[19];
        r0[0] = C0743a.m3215z(C0743a.m3216z("EUh$PQz'F,\\}k@dYj,F~\u0018t*\u0003|Wt\"@i\u0018h.QWv%B`Qk¢F\""));
        r0[1] = C0743a.m3215z(C0743a.m3216z("MM{>Mi\u0018q&Bk]8/F,T?*S|Tq(BxQw%\u0003b]8(L~J}8ScV|kBy\u0018v$N,\u00028"));
        r0[2] = C0743a.m3215z(C0743a.m3216z("La'F"));
        r0[3] = C0743a.m3215z(C0743a.m3216z("`Ya$Vx"));
        r0[4] = C0743a.m3215z(C0743a.m3216z("`Qz8"));
        r0[5] = C0743a.m3215z(C0743a.m3216z("/}@\u001fqM{L\u0002lBgJ\u000ep_wM\u0019`IgQ\u0006sCkK\u0002a@}"));
        r0[6] = C0743a.m3215z(C0743a.m3216z("/j]\u0018pCmJ\bfSqV\u001fqCmN\na@}"));
        r0[7] = C0743a.m3215z(C0743a.m3216z("hJy<BnT}"));
        r0[8] = C0743a.m3215z(C0743a.m3216z("6\u00177"));
        r0[9] = C0743a.m3215z(C0743a.m3216z("mV|9Le\\69FWm9@i\u00027d"));
        r0[10] = C0743a.m3215z(C0743a.m3216z("EUh$PQz'F,\\?$VzJq9\u0003yV8-Oy@8.M,T}(WyJ}kPyJ8'B,J}8PcMj(F,\u00028"));
        r0[11] = C0743a.m3215z(C0743a.m3216z("S]`.@"));
        r0[12] = C0743a.m3215z(C0743a.m3216z("~Yo"));
        r0[13] = C0743a.m3215z(C0743a.m3216z("I[p.@,\\}kO+]`?Qm[l\"Lb\u0018y>WcUy?J}M}kGi\u0018t*\u0003~]k8LyJ{.\u0003"));
        r0[14] = C0743a.m3215z(C0743a.m3216z(")\t\"n\u0011#\u001d+"));
        r0[15] = C0743a.m3215z(C0743a.m3216z("/vW\u0006|^}H\u000eqXwQ\u0019fSqV\u001db@q\\\u000e"));
        r0[16] = C0743a.m3215z(C0743a.m3216z("\u00012"));
        r0[17] = C0743a.m3215z(C0743a.m3216z("a]v>"));
        r0[18] = C0743a.m3215z(C0743a.m3216z("e\\"));
        f1904z = r0;
    }

    /* renamed from: a */
    public static final long m3196a(int i) {
        long j = 0;
        Closeable closeable = null;
        try {
            closeable = WDAppManager.m2569b().openRawResource(i);
            if (closeable != null) {
                CRC32 crc32 = new CRC32();
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = closeable.read(bArr);
                    if (read < 0) {
                        break;
                    }
                    crc32.update(bArr, 0, read);
                }
                j = crc32.getValue();
                bb.m3844a(closeable);
            } else {
                bb.m3844a(closeable);
            }
        } catch (IOException e) {
            throw e;
        } catch (IOException e2) {
            bb.m3844a(closeable);
        } catch (Throwable th) {
            bb.m3844a(closeable);
        }
        return j;
    }

    /* renamed from: a */
    public static final Typeface m3197a(String str, int i) {
        Typeface typeface = null;
        if (f1897l == null) {
            return null;
        }
        Object l = C0808l.m4054l(str);
        Collection<Object> d = f1897l.m4103d(l);
        if (d == null) {
            return null;
        }
        try {
            if (d.isEmpty()) {
                return null;
            }
            Collection<Typeface> linkedList = new LinkedList();
            if (d.get(0) instanceof Typeface) {
                linkedList.addAll(d);
            } else {
                try {
                    for (Object obj : d) {
                        linkedList.add(Typeface.createFromAsset(WDAppManager.m2547F(), obj.toString()));
                    }
                    f1897l.m4093a(l, (Collection) linkedList);
                } catch (Exception e) {
                    C0691a.m2857a(f1904z[0], e);
                    f1897l.m4092a(l);
                }
            }
            try {
                if (!linkedList.isEmpty()) {
                    typeface = (Typeface) linkedList.get(0);
                }
                Typeface typeface2 = typeface;
                for (Typeface typeface3 : linkedList) {
                    int style = typeface3.getStyle();
                    if (style == i) {
                        return typeface3;
                    }
                    if (style != 0) {
                        typeface3 = typeface2;
                    }
                    typeface2 = typeface3;
                }
                return typeface2;
            } catch (Exception e2) {
                throw e2;
            }
        } catch (Exception e22) {
            throw e22;
        }
    }

    /* renamed from: a */
    public static final InputStream m3198a(String str, boolean z) {
        try {
            if (C0808l.m4053k(str)) {
                return null;
            }
            String b = C0725i.m3050b(str);
            if (!z) {
                b = b + f1904z[11];
            }
            Context C = WDAppManager.m2544C();
            Resources resources = C.getResources();
            int identifier = resources.getIdentifier(b, f1904z[12], C.getPackageName());
            if (identifier <= 0) {
                return null;
            }
            try {
                return resources.openRawResource(identifier);
            } catch (NotFoundException e) {
                throw e;
            }
        } catch (NotFoundException e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    public static final String m3199a() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : f1893h.keySet()) {
            try {
                if (C0743a.m3203a(str)) {
                    if (stringBuilder.length() > 0) {
                        stringBuilder.append(f1904z[16]);
                    }
                    stringBuilder.append(str);
                }
            } catch (NotFoundException e) {
                throw e;
            } catch (NotFoundException e2) {
                throw e2;
            }
        }
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public static final void m3200a(String str, int i, String str2) {
        try {
            f1893h.put(C0808l.m4054l(str), new Integer(i));
            if (!C0808l.m4053k(str2)) {
                try {
                    C0743a.m3202a(str, str2, C0808l.m4053k(str2));
                } catch (Exception e) {
                    C0691a.m2857a(f1904z[13] + str, e);
                }
            }
        } catch (NotFoundException e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    public static final void m3201a(String str, String str2) {
        try {
            if (f1897l == null) {
                f1897l = new nb();
            }
            f1897l.m4095a(C0808l.m4054l(str), (Object) str2);
        } catch (NotFoundException e) {
            throw e;
        }
    }

    /* renamed from: a */
    public static final void m3202a(String str, String str2, boolean z) throws C0901s {
        BufferedInputStream bufferedInputStream;
        IOException e;
        Throwable th;
        BufferedOutputStream bufferedOutputStream = null;
        int j = C0743a.m3214j(str);
        if (j == -1) {
            try {
                throw new C0901s(C0745b.m3222b(f1904z[5], str), C0745b.m3222b(f1904z[6], new String[0]));
            } catch (C0665g e2) {
                throw e2;
            }
        }
        File h;
        if (str2.equals("")) {
            str2 = str;
        } else if (str2.indexOf(35) >= 0) {
            int i = 0;
            while (i < 4) {
                String str3;
                switch (i) {
                    case 1:
                        str3 = f1891f;
                        break;
                    case 2:
                        str3 = f1900o;
                        break;
                    case 3:
                        str3 = f1895j;
                        break;
                    default:
                        str3 = f1889d;
                        break;
                }
                if (str2.startsWith(str3)) {
                    String e3;
                    switch (i) {
                        case 1:
                            h = WDAppManager.m2581h();
                            break;
                        case 2:
                            h = kb.m3975e();
                            break;
                        case 3:
                            String c;
                            try {
                                c = C1014a.m7327b().mo3285c();
                            } catch (C0665g e4) {
                                c = null;
                            }
                            try {
                                if (!C0808l.m4053k(c)) {
                                    h = new File(c);
                                    break;
                                } else {
                                    h = new File(WDAppManager.m2582i(), f1904z[4]);
                                    break;
                                }
                            } catch (C0665g e22) {
                                throw e22;
                            }
                        default:
                            h = WDAppManager.m2594u();
                            break;
                    }
                    if (h != null) {
                        try {
                            e3 = C0897o.m6277e(h.getPath());
                        } catch (C0665g e222) {
                            throw e222;
                        }
                    }
                    e3 = "";
                    str2 = C0808l.m4018a(str2, str3, e3);
                } else {
                    i++;
                }
            }
        }
        BufferedInputStream bufferedInputStream2 = null;
        BufferedOutputStream bufferedOutputStream2 = null;
        BufferedOutputStream bufferedOutputStream3;
        try {
            File file;
            byte[] bArr;
            int read;
            h = C0897o.m6290j(str2);
            if (h.exists()) {
                if (h.isDirectory()) {
                    file = new File(h, C0897o.m6259b(str, 12));
                    h = file.getParentFile();
                    if (h != null) {
                        if (!h.exists()) {
                            h.mkdirs();
                        }
                    }
                    file.createNewFile();
                    bufferedInputStream = new BufferedInputStream(WDAppManager.m2569b().openRawResource(j));
                    bufferedOutputStream3 = new BufferedOutputStream(new FileOutputStream(file));
                    try {
                        bArr = new byte[4096];
                        while (true) {
                            read = bufferedInputStream.read(bArr);
                            if (read <= 0) {
                                bufferedOutputStream3.write(bArr, 0, read);
                            } else {
                                bufferedOutputStream3.flush();
                                if (bufferedOutputStream3 != null) {
                                    try {
                                        bufferedOutputStream3.close();
                                    } catch (IOException e5) {
                                    }
                                }
                                if (bufferedInputStream != null) {
                                    try {
                                        bufferedInputStream.close();
                                        return;
                                    } catch (IOException e6) {
                                        return;
                                    } catch (C0901s e7) {
                                        throw e7;
                                    }
                                }
                                return;
                            }
                        }
                    } catch (C0665g e2222) {
                        throw e2222;
                    } catch (IOException e8) {
                        e = e8;
                        bufferedOutputStream = bufferedInputStream;
                        try {
                            throw new C0901s(C0745b.m3222b(f1904z[5], str), e.getMessage());
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedInputStream = bufferedOutputStream;
                            bufferedOutputStream = bufferedOutputStream3;
                            if (bufferedOutputStream != null) {
                                try {
                                    bufferedOutputStream.close();
                                } catch (IOException e9) {
                                } catch (C0901s e72) {
                                    throw e72;
                                }
                            }
                            if (bufferedInputStream != null) {
                                try {
                                    bufferedInputStream.close();
                                } catch (IOException e10) {
                                } catch (C0901s e722) {
                                    throw e722;
                                }
                            }
                            throw th;
                        }
                    } catch (NotFoundException e11) {
                        bufferedOutputStream = bufferedOutputStream3;
                        try {
                            throw new C0901s(C0745b.m3222b(f1904z[5], str), C0745b.m3222b(f1904z[6], new String[0]));
                        } catch (Throwable th3) {
                            th = th3;
                            if (bufferedOutputStream != null) {
                                bufferedOutputStream.close();
                            }
                            if (bufferedInputStream != null) {
                                bufferedInputStream.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        bufferedOutputStream = bufferedOutputStream3;
                        if (bufferedOutputStream != null) {
                            bufferedOutputStream.close();
                        }
                        if (bufferedInputStream != null) {
                            bufferedInputStream.close();
                        }
                        throw th;
                    }
                } else if (!z) {
                    if (null != null) {
                        try {
                            bufferedOutputStream2.close();
                        } catch (IOException e12) {
                        } catch (C0901s e7222) {
                            throw e7222;
                        }
                    }
                    if (null != null) {
                        try {
                            bufferedInputStream2.close();
                            return;
                        } catch (IOException e13) {
                            return;
                        } catch (C0901s e72222) {
                            throw e72222;
                        }
                    }
                    return;
                }
            }
            file = h;
            h = file.getParentFile();
            if (h != null) {
                if (h.exists()) {
                    h.mkdirs();
                }
            }
            file.createNewFile();
            bufferedInputStream = new BufferedInputStream(WDAppManager.m2569b().openRawResource(j));
            try {
                bufferedOutputStream3 = new BufferedOutputStream(new FileOutputStream(file));
                bArr = new byte[4096];
                while (true) {
                    read = bufferedInputStream.read(bArr);
                    if (read <= 0) {
                        bufferedOutputStream3.flush();
                        if (bufferedOutputStream3 != null) {
                            bufferedOutputStream3.close();
                        }
                        if (bufferedInputStream != null) {
                            bufferedInputStream.close();
                            return;
                        }
                        return;
                    }
                    bufferedOutputStream3.write(bArr, 0, read);
                }
            } catch (IOException e14) {
                e = e14;
                bufferedOutputStream3 = null;
                Object obj = bufferedInputStream;
                throw new C0901s(C0745b.m3222b(f1904z[5], str), e.getMessage());
            } catch (NotFoundException e15) {
                throw new C0901s(C0745b.m3222b(f1904z[5], str), C0745b.m3222b(f1904z[6], new String[0]));
            }
        } catch (C0665g e22222) {
            throw e22222;
        } catch (C0665g e222222) {
            throw e222222;
        } catch (IOException e16) {
            e = e16;
            bufferedOutputStream3 = null;
        } catch (NotFoundException e17) {
            bufferedInputStream = null;
            throw new C0901s(C0745b.m3222b(f1904z[5], str), C0745b.m3222b(f1904z[6], new String[0]));
        } catch (Throwable th5) {
            th = th5;
            bufferedInputStream = null;
            if (bufferedOutputStream != null) {
                bufferedOutputStream.close();
            }
            if (bufferedInputStream != null) {
                bufferedInputStream.close();
            }
            throw th;
        }
    }

    /* renamed from: a */
    private static final boolean m3203a(String str) {
        try {
            if (str.indexOf(47) < 0) {
                if (str.indexOf(92) < 0) {
                    return true;
                }
            }
            return false;
        } catch (NotFoundException e) {
            throw e;
        } catch (NotFoundException e2) {
            throw e2;
        }
    }

    /* renamed from: b */
    private static int m3204b(String str, String str2) {
        Resources b = WDAppManager.m2569b();
        int identifier = b.getIdentifier(str, str2, WDAppManager.m2544C().getPackageName());
        if (identifier != 0) {
            return identifier;
        }
        return b.getIdentifier(C0808l.m4021a(f1904z[14], r2, str2, str), null, null);
    }

    /* renamed from: b */
    public static final InputStream m3205b(String str) {
        int j = C0743a.m3214j(str);
        if (j >= 0) {
            try {
                return WDAppManager.m2569b().openRawResource(j);
            } catch (Exception e) {
                C0691a.m2857a(f1904z[10] + str, e);
            }
        }
        return null;
    }

    /* renamed from: c */
    public static final int m3206c(String str) {
        return C0743a.m3204b(str, f1904z[7]);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: c */
    public static final int m3207c(java.lang.String r6, java.lang.String r7) throws fr.pcsoft.wdjava.file.C0901s {
        /*
        r0 = 0;
        r1 = 1;
        r2 = 0;
        r3 = 42;
        r3 = r6.indexOf(r3);	 Catch:{ s -> 0x005c }
        if (r3 >= 0) goto L_0x0013;
    L_0x000b:
        r3 = 63;
        r3 = r6.indexOf(r3);	 Catch:{ s -> 0x005c }
        if (r3 < 0) goto L_0x00af;
    L_0x0013:
        r3 = "*";
        r3 = r6.equals(r3);
        if (r3 != 0) goto L_0x00ac;
    L_0x001b:
        r2 = fr.pcsoft.wdjava.core.utils.C0808l.m4020a(r6, r1);
        r4 = 34;
        r2 = java.util.regex.Pattern.compile(r2, r4);
        r4 = r1;
    L_0x0026:
        if (r4 == 0) goto L_0x00a6;
    L_0x0028:
        r1 = fr.pcsoft.wdjava.file.C0897o.m6290j(r7);
        r4 = r1.exists();	 Catch:{ s -> 0x005e }
        if (r4 == 0) goto L_0x0038;
    L_0x0032:
        r4 = r1.isDirectory();	 Catch:{ s -> 0x0060 }
        if (r4 == 0) goto L_0x0044;
    L_0x0038:
        r4 = r1.exists();	 Catch:{ s -> 0x0062 }
        if (r4 != 0) goto L_0x0064;
    L_0x003e:
        r1 = r1.mkdirs();	 Catch:{ s -> 0x005a }
        if (r1 != 0) goto L_0x0064;
    L_0x0044:
        r0 = new fr.pcsoft.wdjava.file.s;	 Catch:{ s -> 0x005a }
        r1 = f1904z;	 Catch:{ s -> 0x005a }
        r2 = 15;
        r1 = r1[r2];	 Catch:{ s -> 0x005a }
        r2 = 1;
        r2 = new java.lang.String[r2];	 Catch:{ s -> 0x005a }
        r3 = 0;
        r2[r3] = r7;	 Catch:{ s -> 0x005a }
        r1 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r1, r2);	 Catch:{ s -> 0x005a }
        r0.<init>(r1);	 Catch:{ s -> 0x005a }
        throw r0;	 Catch:{ s -> 0x005a }
    L_0x005a:
        r0 = move-exception;
        throw r0;
    L_0x005c:
        r0 = move-exception;
        throw r0;
    L_0x005e:
        r0 = move-exception;
        throw r0;	 Catch:{ s -> 0x0060 }
    L_0x0060:
        r0 = move-exception;
        throw r0;	 Catch:{ s -> 0x0062 }
    L_0x0062:
        r0 = move-exception;
        throw r0;	 Catch:{ s -> 0x005a }
    L_0x0064:
        r1 = f1893h;
        r1 = r1.keySet();
        r4 = r1.iterator();
        r1 = r0;
    L_0x006f:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x00a9;
    L_0x0075:
        r0 = r4.next();
        r0 = (java.lang.String) r0;
        r5 = fr.pcsoft.wdjava.core.ressources.C0743a.m3203a(r0);	 Catch:{ s -> 0x008c }
        if (r5 == 0) goto L_0x00aa;
    L_0x0081:
        if (r3 == 0) goto L_0x0090;
    L_0x0083:
        r5 = 1;
        fr.pcsoft.wdjava.core.ressources.C0743a.m3202a(r0, r7, r5);	 Catch:{ s -> 0x008e }
        r1 = r1 + 1;
        r0 = r1;
    L_0x008a:
        r1 = r0;
        goto L_0x006f;
    L_0x008c:
        r0 = move-exception;
        throw r0;	 Catch:{ s -> 0x008e }
    L_0x008e:
        r0 = move-exception;
        throw r0;
    L_0x0090:
        if (r2 == 0) goto L_0x00aa;
    L_0x0092:
        r5 = r2.matcher(r0);	 Catch:{ s -> 0x00a4 }
        r5 = r5.matches();	 Catch:{ s -> 0x00a4 }
        if (r5 == 0) goto L_0x00aa;
    L_0x009c:
        r5 = 1;
        fr.pcsoft.wdjava.core.ressources.C0743a.m3202a(r0, r7, r5);	 Catch:{ s -> 0x00a4 }
        r1 = r1 + 1;
        r0 = r1;
        goto L_0x008a;
    L_0x00a4:
        r0 = move-exception;
        throw r0;
    L_0x00a6:
        fr.pcsoft.wdjava.core.ressources.C0743a.m3202a(r6, r7, r1);
    L_0x00a9:
        return r1;
    L_0x00aa:
        r0 = r1;
        goto L_0x008a;
    L_0x00ac:
        r4 = r1;
        goto L_0x0026;
    L_0x00af:
        r3 = r0;
        r4 = r0;
        goto L_0x0026;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.core.ressources.a.c(java.lang.String, java.lang.String):int");
    }

    /* renamed from: d */
    public static final int m3208d(String str) {
        return C0743a.m3204b(str, f1904z[3]);
    }

    /* renamed from: e */
    public static final int m3209e(String str) {
        return C0743a.m3204b(str, f1904z[17]);
    }

    /* renamed from: f */
    public static final Drawable m3210f(String str) {
        int c = C0743a.m3206c(str);
        if (c > 0) {
            try {
                return WDAppManager.m2569b().getDrawable(c);
            } catch (NotFoundException e) {
                throw e;
            }
        }
        C0691a.m2856a(f1904z[1] + str);
        return null;
    }

    /* renamed from: g */
    public static final int m3211g(String str) {
        return C0743a.m3204b(str, f1904z[2]);
    }

    /* renamed from: h */
    public static final Uri m3212h(String str) {
        int j = C0743a.m3214j(str);
        if (j > 0) {
            try {
                return Uri.parse(f1904z[9] + WDProjet.getInstance().getPackageRacine() + "/" + j);
            } catch (NotFoundException e) {
                throw e;
            }
        }
        try {
            if (!URLUtil.isNetworkUrl(str)) {
                if (str.indexOf(f1904z[8]) <= 0) {
                    File j2 = C0897o.m6290j(str);
                    try {
                        return j2.exists() ? Uri.fromFile(j2) : null;
                    } catch (NotFoundException e2) {
                        throw e2;
                    }
                }
            }
            return Uri.parse(str);
        } catch (NotFoundException e22) {
            throw e22;
        } catch (NotFoundException e222) {
            throw e222;
        }
    }

    /* renamed from: i */
    public static final int m3213i(String str) {
        return C0743a.m3204b(str, f1904z[18]);
    }

    /* renamed from: j */
    public static final int m3214j(String str) {
        try {
            if (f1893h != null) {
                String stringBuilder;
                Integer num;
                if (str.startsWith(f1896k)) {
                    str = str.substring(f1896k.length());
                }
                String l = C0808l.m4054l(str);
                int indexOf = l.indexOf(f1902q);
                if (indexOf > 0) {
                    int indexOf2 = l.indexOf(46, indexOf);
                    if (indexOf2 > 0) {
                        StringBuilder stringBuilder2 = new StringBuilder(l);
                        stringBuilder2.delete(indexOf, indexOf2);
                        stringBuilder = stringBuilder2.toString();
                        num = (Integer) f1893h.get(stringBuilder);
                        if (num != null) {
                            try {
                                return num.intValue();
                            } catch (NotFoundException e) {
                                throw e;
                            }
                        }
                        try {
                            if (stringBuilder.indexOf(47) == -1 && stringBuilder.indexOf(92) == -1) {
                                for (String l2 : f1893h.keySet()) {
                                    if (C0897o.m6259b(l2, 12).equalsIgnoreCase(stringBuilder)) {
                                        num = (Integer) f1893h.get(l2);
                                        if (num != null) {
                                            try {
                                                return num.intValue();
                                            } catch (NotFoundException e2) {
                                                throw e2;
                                            }
                                        }
                                    }
                                }
                            }
                        } catch (NotFoundException e22) {
                            throw e22;
                        }
                    }
                }
                stringBuilder = l2;
                num = (Integer) f1893h.get(stringBuilder);
                if (num != null) {
                    return num.intValue();
                }
                for (String l22 : f1893h.keySet()) {
                    if (C0897o.m6259b(l22, 12).equalsIgnoreCase(stringBuilder)) {
                        num = (Integer) f1893h.get(l22);
                        if (num != null) {
                            return num.intValue();
                        }
                    }
                }
            }
            return -1;
        } catch (NotFoundException e222) {
            throw e222;
        }
    }

    /* renamed from: z */
    private static String m3215z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 12;
                    break;
                case 1:
                    i2 = 56;
                    break;
                case 2:
                    i2 = 24;
                    break;
                case 3:
                    i2 = 75;
                    break;
                default:
                    i2 = 35;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m3216z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 35);
        }
        return toCharArray;
    }
}
