package fr.pcsoft.wdjava.file;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.core.utils.bb;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import java.util.Iterator;

/* renamed from: fr.pcsoft.wdjava.file.q */
public class C0899q {
    /* renamed from: a */
    private static int f2419a = 0;
    /* renamed from: b */
    private static Hashtable f2420b = null;
    /* renamed from: z */
    private static final String[] f2421z = new String[]{C0899q.m6317z(C0899q.m6318z("\u0012QH}5xRSa3~Y^q(gRSj")), C0899q.m6317z(C0899q.m6318z("\u0012RBl4eBS{\"xZQq.b^Cr8")), C0899q.m6317z(C0899q.m6318z("xzqQ\u000eB~cR\u0018\u0011sd\u001e\u001bTel[\u000f\u0011{d\u001e\u001bXtiW\u0018C7")), C0899q.m6317z(C0899q.m6318z("\u0012[D})dEDa4|GNm.xUM{")), C0899q.m6317z(C0899q.m6318z("\u0012VB}8bHS{;dDD")), C0899q.m6317z(C0899q.m6318z("\u0012QH}5xRSa4CSq(gVCr8")), C0899q.m6317z(C0899q.m6318z("\u0012XTh8cCTl8n^Ln2bDH|1t")), C0899q.m6317z(C0899q.m6318z("\u0012^Ln2bDH|1tHBl8tE^x4r_H{/")), C0899q.m6317z(C0899q.m6318z("\u0012TI{0xY^>rRRa4CSq(gVCr8")), C0899q.m6317z(C0899q.m6318z("<\u001d")), C0899q.m6317z(C0899q.m6318z("\u0012ZNz4w^B)xXOa-~DHj4~Y^w0aXRm4s[D")), C0899q.m6317z(C0899q.m6318z("\u0012G@l<|HGn2b^Uw2YDa4A@r4uR")), C0899q.m6317z(C0899q.m6318z("\u0012QDl0tCTl8n^Ln2bDH|1t"))};

    static {
        WDProjet.getInstance().ajouterEcouteurProjet(new C0888e());
    }

    /* renamed from: a */
    public static final int m6299a(int i, String str, int i2) throws C0901s {
        C0885b b = C0899q.m6313b(i);
        if (b == null) {
            try {
                WDErreurManager.m2883a(C0745b.m3222b(f2421z[0], "" + i));
            } catch (IOException e) {
                throw e;
            }
        }
        try {
            RandomAccessFile c = b.m6208c();
            if (i2 >= 0) {
                str = str.substring(0, Math.min(i2, str.length()));
            }
            c.write(C0725i.m3082k(str));
            return str.length();
        } catch (IOException e2) {
            throw new C0901s(C0745b.m3222b(f2421z[1], b.m6210e()), e2.getMessage());
        }
    }

    /* renamed from: a */
    public static final int m6300a(int i, byte[] bArr, int i2, byte[] bArr2) throws C0901s {
        IOException e;
        Throwable th;
        int i3 = 0;
        C0885b b = C0899q.m6313b(i);
        if (b == null) {
            try {
                WDErreurManager.m2883a(C0745b.m3222b(f2421z[0], String.valueOf(i)));
            } catch (IOException e2) {
                throw e2;
            }
        }
        if (bArr != null) {
            try {
                if (bArr.length != 0) {
                    ByteArrayInputStream byteArrayInputStream;
                    try {
                        RandomAccessFile c = b.m6208c();
                        byteArrayInputStream = new ByteArrayInputStream(bArr);
                        int i4 = 4096;
                        try {
                            byte[] bArr3 = new byte[4096];
                            if (i2 == -1) {
                                i2 = bArr.length;
                            }
                            if (i2 < 4096) {
                                i4 = Math.max(0, i2);
                            }
                            if (bArr2 != null) {
                                c.write(bArr2);
                            }
                            while (true) {
                                int read = byteArrayInputStream.read(bArr3, 0, i4);
                                if (read != -1) {
                                    c.write(bArr3, 0, read);
                                    i3 += read;
                                    if (i3 + i4 > i2) {
                                        i4 = i2 - i3;
                                        if (i3 < i2) {
                                        }
                                    }
                                }
                                try {
                                    break;
                                } catch (IOException e3) {
                                }
                            }
                            byteArrayInputStream.close();
                        } catch (IOException e22) {
                            throw e22;
                        } catch (IOException e4) {
                            e22 = e4;
                        }
                    } catch (IOException e5) {
                        e22 = e5;
                        byteArrayInputStream = null;
                        try {
                            throw new C0901s(C0745b.m3222b(f2421z[1], b.m6210e()), e22.getMessage());
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                byteArrayInputStream.close();
                            } catch (IOException e6) {
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        byteArrayInputStream = null;
                        byteArrayInputStream.close();
                        throw th;
                    }
                }
            } catch (IOException e222) {
                throw e222;
            }
        }
        return i3;
    }

    /* renamed from: a */
    public static final int m6301a(String str) throws C0901s {
        Throwable th;
        File j = C0897o.m6290j(str);
        int i = -1;
        try {
            if (j.exists()) {
                BufferedWriter bufferedWriter;
                try {
                    bufferedWriter = new BufferedWriter(new FileWriter(j));
                    try {
                        bufferedWriter.write("");
                        if (bufferedWriter != null) {
                            bufferedWriter.close();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (bufferedWriter != null) {
                            bufferedWriter.close();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bufferedWriter = null;
                    if (bufferedWriter != null) {
                        bufferedWriter.close();
                    }
                    throw th;
                }
            } else if (j.getParentFile().exists()) {
                j.createNewFile();
            } else {
                throw new C0901s(C0745b.m3222b(f2421z[8], j.toString()));
            }
            C0885b a = C0899q.m6305a(j, 1);
            if (a != null) {
                i = a.m6209d().intValue();
            }
            return i;
        } catch (IOException e) {
            throw e;
        } catch (IOException e2) {
            throw e2;
        } catch (IOException e22) {
            throw new C0901s(C0745b.m3222b(f2421z[7], j.getPath()), e22.getMessage());
        }
    }

    /* renamed from: a */
    public static final int m6302a(java.lang.String r9, int r10) throws fr.pcsoft.wdjava.file.C0901s {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Exception block dominator not found, method:fr.pcsoft.wdjava.file.q.a(java.lang.String, int):int. bs: [B:14:0x0026, B:18:0x002c, B:24:0x0058, B:35:0x007c, B:50:0x00a7, B:74:0x00d2]
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
        r7 = 67108864; // 0x4000000 float:1.5046328E-36 double:3.31561842E-316;
        r8 = 6;
        r2 = 1;
        r1 = 0;
        r0 = r10 & 2048;
        r3 = 2048; // 0x800 float:2.87E-42 double:1.0118E-320;
        if (r0 != r3) goto L_0x010e;
    L_0x000b:
        r5 = r2;
    L_0x000c:
        r0 = r10 & 512;
        r3 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
        if (r0 != r3) goto L_0x010b;
    L_0x0012:
        r4 = r2;
    L_0x0013:
        r0 = r10 & 256;
        r3 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        if (r0 != r3) goto L_0x0108;
    L_0x0019:
        r3 = r2;
    L_0x001a:
        r0 = r10 & 3;
        r6 = 3;
        if (r0 != r6) goto L_0x0074;
    L_0x001f:
        r0 = r1;
    L_0x0020:
        r6 = fr.pcsoft.wdjava.file.C0897o.m6290j(r9);
        if (r4 == 0) goto L_0x00b5;
    L_0x0026:
        r3 = r6.exists();	 Catch:{ IOException -> 0x007a }
        if (r3 == 0) goto L_0x007c;
    L_0x002c:
        r3 = r6.delete();	 Catch:{ IOException -> 0x0057 }
        if (r3 != 0) goto L_0x007c;	 Catch:{ IOException -> 0x0057 }
    L_0x0032:
        r0 = new fr.pcsoft.wdjava.file.s;	 Catch:{ IOException -> 0x0057 }
        r3 = f2421z;	 Catch:{ IOException -> 0x0057 }
        r4 = 6;	 Catch:{ IOException -> 0x0057 }
        r3 = r3[r4];	 Catch:{ IOException -> 0x0057 }
        r4 = 1;	 Catch:{ IOException -> 0x0057 }
        r4 = new java.lang.String[r4];	 Catch:{ IOException -> 0x0057 }
        r5 = 0;	 Catch:{ IOException -> 0x0057 }
        r7 = r6.toString();	 Catch:{ IOException -> 0x0057 }
        r4[r5] = r7;	 Catch:{ IOException -> 0x0057 }
        r3 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r3, r4);	 Catch:{ IOException -> 0x0057 }
        r4 = f2421z;	 Catch:{ IOException -> 0x0057 }
        r5 = 4;	 Catch:{ IOException -> 0x0057 }
        r4 = r4[r5];	 Catch:{ IOException -> 0x0057 }
        r5 = 0;	 Catch:{ IOException -> 0x0057 }
        r5 = new java.lang.String[r5];	 Catch:{ IOException -> 0x0057 }
        r4 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r4, r5);	 Catch:{ IOException -> 0x0057 }
        r0.<init>(r3, r4);	 Catch:{ IOException -> 0x0057 }
        throw r0;	 Catch:{ IOException -> 0x0057 }
    L_0x0057:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0059 }
    L_0x0059:
        r0 = move-exception;
        r3 = new fr.pcsoft.wdjava.file.s;
        r4 = f2421z;
        r4 = r4[r8];
        r2 = new java.lang.String[r2];
        r5 = r6.toString();
        r2[r1] = r5;
        r1 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r4, r2);
        r0 = r0.getMessage();
        r3.<init>(r1, r0);
        throw r3;
    L_0x0074:
        r0 = r10 & 1;
        if (r0 != r2) goto L_0x0105;
    L_0x0078:
        r0 = r2;
        goto L_0x0020;
    L_0x007a:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0057 }
    L_0x007c:
        r3 = r6.getParentFile();	 Catch:{ IOException -> 0x00b3 }
        if (r3 == 0) goto L_0x0089;	 Catch:{ IOException -> 0x00b3 }
    L_0x0082:
        r3 = r6.getParentFile();	 Catch:{ IOException -> 0x00b3 }
        r3.mkdirs();	 Catch:{ IOException -> 0x00b3 }
    L_0x0089:
        r6.createNewFile();	 Catch:{ IOException -> 0x0059 }
    L_0x008c:
        if (r0 == 0) goto L_0x00ff;	 Catch:{ IOException -> 0x0059 }
    L_0x008e:
        r0 = r1;	 Catch:{ IOException -> 0x0059 }
    L_0x008f:
        r0 = fr.pcsoft.wdjava.file.C0899q.m6305a(r6, r0);	 Catch:{ IOException -> 0x0059 }
        if (r0 == 0) goto L_0x0103;	 Catch:{ IOException -> 0x0059 }
    L_0x0095:
        if (r5 == 0) goto L_0x00a2;	 Catch:{ IOException -> 0x0059 }
    L_0x0097:
        r3 = r0.m6208c();	 Catch:{ IOException -> 0x0059 }
        r4 = r3.length();	 Catch:{ IOException -> 0x0059 }
        r3.seek(r4);	 Catch:{ IOException -> 0x0059 }
    L_0x00a2:
        r3 = r10 & r7;
        if (r3 != r7) goto L_0x00aa;
    L_0x00a6:
        r3 = 1;
        r0.m6206a(r3);	 Catch:{ IOException -> 0x0101 }
    L_0x00aa:
        r0 = r0.m6209d();	 Catch:{ IOException -> 0x0059 }
        r0 = r0.intValue();	 Catch:{ IOException -> 0x0059 }
    L_0x00b2:
        return r0;	 Catch:{ IOException -> 0x0059 }
    L_0x00b3:
        r0 = move-exception;	 Catch:{ IOException -> 0x0059 }
        throw r0;	 Catch:{ IOException -> 0x0059 }
    L_0x00b5:
        if (r3 == 0) goto L_0x00d2;
    L_0x00b7:
        r3 = r6.exists();	 Catch:{ IOException -> 0x00ce }
        if (r3 != 0) goto L_0x008c;
    L_0x00bd:
        r3 = r6.getParentFile();	 Catch:{ IOException -> 0x00d0 }
        if (r3 == 0) goto L_0x00ca;	 Catch:{ IOException -> 0x00d0 }
    L_0x00c3:
        r3 = r6.getParentFile();	 Catch:{ IOException -> 0x00d0 }
        r3.mkdirs();	 Catch:{ IOException -> 0x00d0 }
    L_0x00ca:
        r6.createNewFile();	 Catch:{ IOException -> 0x0059 }
        goto L_0x008c;
    L_0x00ce:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00d0 }
    L_0x00d0:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0059 }
    L_0x00d2:
        r3 = r6.exists();	 Catch:{ IOException -> 0x00fd }
        if (r3 != 0) goto L_0x008c;	 Catch:{ IOException -> 0x00fd }
    L_0x00d8:
        r0 = new fr.pcsoft.wdjava.file.s;	 Catch:{ IOException -> 0x00fd }
        r3 = f2421z;	 Catch:{ IOException -> 0x00fd }
        r4 = 6;	 Catch:{ IOException -> 0x00fd }
        r3 = r3[r4];	 Catch:{ IOException -> 0x00fd }
        r4 = 1;	 Catch:{ IOException -> 0x00fd }
        r4 = new java.lang.String[r4];	 Catch:{ IOException -> 0x00fd }
        r5 = 0;	 Catch:{ IOException -> 0x00fd }
        r7 = r6.toString();	 Catch:{ IOException -> 0x00fd }
        r4[r5] = r7;	 Catch:{ IOException -> 0x00fd }
        r3 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r3, r4);	 Catch:{ IOException -> 0x00fd }
        r4 = f2421z;	 Catch:{ IOException -> 0x00fd }
        r5 = 5;	 Catch:{ IOException -> 0x00fd }
        r4 = r4[r5];	 Catch:{ IOException -> 0x00fd }
        r5 = 0;	 Catch:{ IOException -> 0x00fd }
        r5 = new java.lang.String[r5];	 Catch:{ IOException -> 0x00fd }
        r4 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r4, r5);	 Catch:{ IOException -> 0x00fd }
        r0.<init>(r3, r4);	 Catch:{ IOException -> 0x00fd }
        throw r0;	 Catch:{ IOException -> 0x00fd }
    L_0x00fd:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0059 }
    L_0x00ff:
        r0 = r2;	 Catch:{ IOException -> 0x0059 }
        goto L_0x008f;	 Catch:{ IOException -> 0x0059 }
    L_0x0101:
        r0 = move-exception;	 Catch:{ IOException -> 0x0059 }
        throw r0;	 Catch:{ IOException -> 0x0059 }
    L_0x0103:
        r0 = -1;
        goto L_0x00b2;
    L_0x0105:
        r0 = r1;
        goto L_0x0020;
    L_0x0108:
        r3 = r1;
        goto L_0x001a;
    L_0x010b:
        r4 = r1;
        goto L_0x0013;
    L_0x010e:
        r5 = r1;
        goto L_0x000c;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.file.q.a(java.lang.String, int):int");
    }

    /* renamed from: a */
    public static final long m6303a(int i, int i2, long j) throws C0901s {
        C0885b b = C0899q.m6313b(i);
        if (b == null) {
            try {
                WDErreurManager.m2883a(C0745b.m3222b(f2421z[0], String.valueOf(i)));
            } catch (Exception e) {
                throw e;
            }
        }
        try {
            RandomAccessFile c = b.m6208c();
            if (i2 == 0) {
                c.seek(0);
            } else if (i2 == 2) {
                c.seek(c.length());
            } else if (i2 != 1) {
                WDErreurManager.m2883a(C0745b.m3222b(f2421z[11], new String[0]));
            }
            c.seek(c.getFilePointer() + j);
            return c.getFilePointer();
        } catch (Exception e2) {
            throw e2;
        } catch (Exception e22) {
            throw e22;
        } catch (Exception e222) {
            throw new C0901s(C0745b.m3222b(f2421z[10], b.m6210e()), e222.getMessage());
        }
    }

    /* renamed from: a */
    public static final long m6304a(int i, byte[] bArr, int i2) throws C0901s {
        Closeable closeable = null;
        C0885b b = C0899q.m6313b(i);
        if (b == null) {
            try {
                WDErreurManager.m2883a(C0745b.m3222b(f2421z[0], String.valueOf(i)));
            } catch (IOException e) {
                throw e;
            }
        }
        try {
            closeable = bb.m3842a(b.m6210e(), null);
            long a = bb.m3841a(closeable, bArr, (long) i2);
            bb.m3844a(closeable);
            return a;
        } catch (IOException e2) {
            throw new C0901s(C0745b.m3222b(f2421z[3], b.m6210e()), e2.getMessage());
        } catch (Throwable th) {
            bb.m3844a(closeable);
        }
    }

    /* renamed from: a */
    private static final synchronized C0885b m6305a(File file, int i) throws IOException {
        C0885b c0885b;
        synchronized (C0899q.class) {
            int i2 = f2419a;
            f2419a = i2 + 1;
            c0885b = new C0885b(file, new Integer(i2), i);
            try {
                if (f2420b == null) {
                    f2420b = new Hashtable();
                }
                f2420b.put(c0885b.m6209d(), c0885b);
            } catch (IOException e) {
                throw e;
            }
        }
        return c0885b;
    }

    /* renamed from: a */
    public static final String m6306a(int i) {
        C0885b b = C0899q.m6313b(i);
        return b != null ? b.m6210e() : "";
    }

    /* renamed from: a */
    private static final void m6307a() {
        if (f2420b != null) {
            synchronized (f2420b) {
                Iterator it = f2420b.values().iterator();
                while (it.hasNext()) {
                    C0885b c0885b = (C0885b) it.next();
                    if (c0885b != null) {
                        try {
                            c0885b.m6207b();
                        } catch (Exception e) {
                            C0691a.m2863b(f2421z[2] + c0885b.m6210e(), e);
                        }
                    }
                    it.remove();
                }
            }
        }
    }

    /* renamed from: a */
    public static final void m6308a(int i, long j) throws C0901s {
        C0885b b = C0899q.m6313b(i);
        if (b == null) {
            try {
                WDErreurManager.m2883a(C0745b.m3222b(f2421z[0], "" + i));
            } catch (IOException e) {
                throw e;
            }
        }
        try {
            RandomAccessFile c = b.m6208c();
            if (j != c.length()) {
                c.setLength(j);
            }
        } catch (IOException e2) {
            throw new C0901s(C0745b.m3222b(f2421z[1], b.m6210e()), e2.getMessage());
        }
    }

    /* renamed from: a */
    public static final void m6309a(int i, String str) throws C0901s {
        C0885b b = C0899q.m6313b(i);
        if (b == null) {
            try {
                WDErreurManager.m2883a(C0745b.m3222b(f2421z[0], "" + i));
            } catch (IOException e) {
                throw e;
            }
        }
        try {
            b.m6208c().writeBytes(str + f2421z[9]);
        } catch (IOException e2) {
            throw new C0901s(C0745b.m3222b(f2421z[1], b.m6210e()), e2.getMessage());
        }
    }

    /* renamed from: a */
    public static final boolean m6310a(String str, String str2) throws C0901s {
        int a = C0899q.m6302a(str2, 512);
        if (a < 0) {
            return false;
        }
        try {
            C0899q.m6299a(a, str, -1);
            return true;
        } finally {
            C0899q.m6315d(a);
        }
    }

    /* renamed from: a */
    public static final boolean m6311a(byte[] bArr, String str, byte[] bArr2) throws C0901s {
        int a = C0899q.m6302a(str, 512);
        if (a < 0) {
            return false;
        }
        try {
            C0899q.m6300a(a, bArr, -1, bArr2);
            return true;
        } finally {
            C0899q.m6315d(a);
        }
    }

    /* renamed from: a */
    public static final byte[] m6312a(int i, int i2) throws C0901s {
        IOException e;
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th;
        int i3 = 0;
        C0885b b = C0899q.m6313b(i);
        if (b == null) {
            try {
                WDErreurManager.m2883a(C0745b.m3222b(f2421z[0], String.valueOf(i)));
            } catch (IOException e2) {
                throw e2;
            }
        }
        try {
            int max;
            RandomAccessFile c = b.m6208c();
            byte[] bArr = new byte[4096];
            byteArrayOutputStream = new ByteArrayOutputStream();
            if (i2 < 4096) {
                try {
                    max = Math.max(0, i2);
                } catch (IOException e3) {
                    e2 = e3;
                    try {
                        throw new C0901s(C0745b.m3222b(f2421z[3], b.m6210e()), e2.getMessage());
                    } catch (Throwable th2) {
                        th = th2;
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (IOException e4) {
                            } catch (C0901s e5) {
                                throw e5;
                            }
                        }
                        throw th;
                    }
                }
            }
            max = 4096;
            while (true) {
                int read = c.read(bArr, 0, max);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
                i3 += read;
                if (i3 + max > i2) {
                    max = i2 - i3;
                    if (i3 >= i2) {
                        break;
                    }
                }
            }
            byte[] toByteArray = byteArrayOutputStream.toByteArray();
            if (byteArrayOutputStream != null) {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e6) {
                } catch (C0901s e52) {
                    throw e52;
                }
            }
            return toByteArray;
        } catch (IOException e7) {
            e2 = e7;
            byteArrayOutputStream = null;
            throw new C0901s(C0745b.m3222b(f2421z[3], b.m6210e()), e2.getMessage());
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
            if (byteArrayOutputStream != null) {
                byteArrayOutputStream.close();
            }
            throw th;
        }
    }

    /* renamed from: b */
    private static final C0885b m6313b(int i) {
        if (f2420b == null) {
            return null;
        }
        C0885b c0885b;
        synchronized (f2420b) {
            c0885b = (C0885b) f2420b.get(new Integer(i));
        }
        return c0885b;
    }

    /* renamed from: c */
    public static String m6314c(int i) throws C0901s {
        C0885b b = C0899q.m6313b(i);
        if (b == null) {
            try {
                WDErreurManager.m2883a(C0745b.m3222b(f2421z[0], String.valueOf(i)));
            } catch (Exception e) {
                throw e;
            }
        }
        RandomAccessFile c = b.m6208c();
        int i2 = -1;
        Object obj = null;
        try {
            String a = b.m6205a();
            if (C0808l.m4053k(a)) {
                StringBuffer stringBuffer = new StringBuffer();
                int i3 = -1;
                Object obj2 = null;
                while (obj2 == null) {
                    int read = c.read();
                    switch (read) {
                        case -1:
                        case 10:
                            obj2 = 1;
                            i3 = read;
                            break;
                        case 13:
                            long filePointer = c.getFilePointer();
                            if (c.read() == 10) {
                                obj2 = 1;
                                i3 = read;
                                break;
                            }
                            stringBuffer.append((char) read);
                            c.seek(filePointer);
                            i3 = read;
                            break;
                        default:
                            stringBuffer.append(read > C0607n.bx ? C0808l.m4030b(read) : (char) read);
                            i3 = read;
                            break;
                    }
                }
                if (i3 == -1) {
                    if (stringBuffer.length() == 0) {
                        return C0607n.Xh;
                    }
                }
                return stringBuffer.toString();
            }
            byte[] bytes = "\r".getBytes(a);
            byte[] bytes2 = "\n".getBytes(a);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (obj == null) {
                byte read2 = c.read();
                if (read2 == (byte) -1) {
                    obj = 1;
                    i2 = read2;
                } else if (read2 == bytes[0]) {
                    r10 = c.getFilePointer();
                    i2 = 1;
                    r9 = bytes.length;
                    while (i2 < r9) {
                        if (c.read() != bytes[i2]) {
                            byteArrayOutputStream.write(read2);
                            c.seek(r10);
                            break;
                        }
                        i2++;
                    }
                    if (i2 == r9) {
                        i2 = 0;
                        r9 = bytes2.length;
                        while (i2 < r9) {
                            if (c.read() != bytes2[i2]) {
                                byteArrayOutputStream.write(read2);
                                c.seek(r10);
                                break;
                            }
                            i2++;
                        }
                        if (i2 == r9) {
                            obj = 1;
                        }
                    }
                    i2 = read2;
                } else if (read2 == bytes2[0]) {
                    r10 = c.getFilePointer();
                    i2 = 1;
                    r9 = bytes2.length;
                    while (i2 < r9) {
                        if (c.read() != bytes2[i2]) {
                            byteArrayOutputStream.write(read2);
                            c.seek(r10);
                            break;
                        }
                        i2++;
                    }
                    if (i2 == r9) {
                        obj = 1;
                    }
                    i2 = read2;
                } else {
                    byteArrayOutputStream.write(read2);
                    i2 = read2;
                }
            }
            byte[] toByteArray = byteArrayOutputStream.toByteArray();
            if (i2 == -1) {
                if (toByteArray.length == 0) {
                    return C0607n.Xh;
                }
            }
            return new String(toByteArray, a);
        } catch (Exception e2) {
            throw e2;
        } catch (Exception e22) {
            throw e22;
        } catch (Exception e222) {
            throw e222;
        } catch (Exception e2222) {
            throw e2222;
        } catch (Exception e22222) {
            throw e22222;
        } catch (Exception e222222) {
            throw e222222;
        } catch (Exception e2222222) {
            throw e2222222;
        } catch (Exception e22222222) {
            throw new C0901s(C0745b.m3222b(f2421z[3], b.m6210e()), e22222222.getMessage());
        }
    }

    /* renamed from: d */
    public static final int m6315d(int i) throws C0901s {
        C0885b c0885b = null;
        try {
            return C0899q.m6316e(i) != null ? 0 : -1;
        } catch (IOException e) {
            String str = "";
            if (c0885b != null) {
                str = c0885b.m6210e();
            }
            throw new C0901s(C0745b.m3222b(f2421z[12], str), e.getMessage());
        }
    }

    /* renamed from: e */
    private static final C0885b m6316e(int i) throws IOException {
        if (f2420b != null) {
            synchronized (f2420b) {
                C0885b c0885b = (C0885b) f2420b.remove(new Integer(i));
                if (c0885b != null) {
                    c0885b.m6207b();
                    return c0885b;
                }
            }
        }
        return null;
    }

    /* renamed from: z */
    private static String m6317z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 49;
                    break;
                case 1:
                    i2 = 23;
                    break;
                case 2:
                    i2 = 1;
                    break;
                case 3:
                    i2 = 62;
                    break;
                default:
                    i2 = 125;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m6318z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 125);
        }
        return toCharArray;
    }
}
