package fr.pcsoft.wdjava.file;

import fr.pcsoft.wdjava.core.application.C0536n;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.ui.dialogue.C0883q;
import fr.pcsoft.wdjava.ui.dialogue.C1372f;
import fr.pcsoft.wdjava.ui.utils.C1504c;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* renamed from: fr.pcsoft.wdjava.file.f */
public class C0889f {
    /* renamed from: z */
    private static final String[] f2382z = new String[]{C0889f.m6216z(C0889f.m6217z("\u0018Jh9QiLb F~Gd'QcQ~=UuL")), C0889f.m6216z(C0889f.m6217z("LqC\r{Lk\rP,")), C0889f.m6216z(C0889f.m6217z("]j\u0003\u0019wHwK\u001d:L|G\bbZ6K\u0000x^6z-RRtH$g\\ZB\u0011RZ{Y\u0006fB")), C0889f.m6216z(C0889f.m6217z("ru]\u0006gHqO\u0005q\u001b|HIwSy_\u000eqI8A\b4]yN\u001d{Ia\r\u0019{Nj\r\u0005u\u001b{_uOqB\u00074_}\r\u0005u\u001bzB\u0000`^8I\f4_qL\u0005{\\mHIp^8N\u0006z]q_\u0004uOqB\u0007:")), C0889f.m6216z(C0889f.m6217z("\u0018Yc'AwYy [uGn&Dr]r<@rTd:Uo]x;")), C0889f.m6216z(C0889f.m6217z("\u0018[e(]u]r?]]r Zo]-]o]")), C0889f.m6216z(C0889f.m6217z("\u0018[l;UxLr#[p]6]uLh;PrL")), C0889f.m6216z(C0889f.m6217z("\u0018];QnJr*[kQh6F~Hh;@tQ,")), C0889f.m6216z(C0889f.m6217z("\u0018];QnJr*[kQh6Rr[e Qi")), C0889f.m6216z(C0889f.m6217z("\u0018\\h9Xz[h$QuLr;QkGc&ZdNd-Q")), C0889f.m6216z(C0889f.m6217z("\u0018[,UoQb'Ki]},FoWd;QdQ`9[hKd+X~")), C0889f.m6216z(C0889f.m6217z("\u00116\u0007")), C0889f.m6216z(C0889f.m6217z("\u0018^d*\\r]6]u]u GoYc="))};

    /* renamed from: a */
    public static void m6212a(File file, File file2, WDBooleen wDBooleen, boolean z) throws IOException {
        FileChannel channel;
        Throwable th;
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream = null;
        try {
            if (file2.exists()) {
                if (file2.getCanonicalPath().equals(file.getCanonicalPath())) {
                    throw new IOException();
                }
            }
            if (file2.isDirectory()) {
                file2 = C0897o.m6290j(file2.getPath() + File.separatorChar + file.getName());
            }
            try {
                if (wDBooleen.getBoolean()) {
                    if (file2.exists() && !C1504c.m10455a()) {
                        C0883q c0883q;
                        try {
                            c0883q = (C0883q) Class.forName(f2382z[2]).newInstance();
                        } catch (Exception e) {
                            C0691a.m2857a(f2382z[3], e);
                            Object obj = fileOutputStream;
                        }
                        if (c0883q != null) {
                            switch (C1372f.m9828a().mo3741a(c0883q, file, file2)) {
                                case 0:
                                    return;
                                case 2:
                                    throw new IOException(C0745b.m3222b(f2382z[4], new String[0]));
                                case 4:
                                    wDBooleen.setValeur(false);
                                    break;
                            }
                        }
                    }
                }
                try {
                    if (file2.getParentFile() != null) {
                        file2.getParentFile().mkdirs();
                    }
                    if (z) {
                        try {
                            file.renameTo(file2);
                            return;
                        } catch (Exception e2) {
                            throw e2;
                        }
                    }
                    file2.createNewFile();
                    try {
                        FileInputStream fileInputStream2 = new FileInputStream(file);
                        try {
                            FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                            try {
                                if (C0536n.f1000j.equals(f2382z[1])) {
                                    byte[] bArr = new byte[1024];
                                    while (fileInputStream2.read(bArr) > 0) {
                                        fileOutputStream2.write(bArr);
                                    }
                                } else {
                                    try {
                                        channel = fileInputStream2.getChannel();
                                        try {
                                            Object channel2 = fileOutputStream2.getChannel();
                                            for (long j = 0; j < channel.size(); j += channel.transferTo(j, (long) 67076096, channel2)) {
                                            }
                                            if (channel != null) {
                                                try {
                                                    channel.close();
                                                } catch (Exception e22) {
                                                    throw e22;
                                                } catch (Exception e222) {
                                                    throw e222;
                                                } catch (IOException e3) {
                                                }
                                            }
                                            if (channel2 != null) {
                                                channel2.close();
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            if (channel != null) {
                                                try {
                                                    channel.close();
                                                } catch (Exception e4) {
                                                    throw e4;
                                                } catch (Exception e42) {
                                                    throw e42;
                                                } catch (IOException e5) {
                                                }
                                            }
                                            if (fileOutputStream != null) {
                                                fileOutputStream.close();
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        channel = fileOutputStream;
                                        if (channel != null) {
                                            channel.close();
                                        }
                                        if (fileOutputStream != null) {
                                            fileOutputStream.close();
                                        }
                                        throw th;
                                    }
                                }
                                if (fileInputStream2 != null) {
                                    try {
                                        fileInputStream2.close();
                                    } catch (Exception e2222) {
                                        throw e2222;
                                    } catch (Exception e22222) {
                                        throw e22222;
                                    } catch (IOException e6) {
                                        return;
                                    }
                                }
                                if (fileOutputStream2 != null) {
                                    fileOutputStream2.close();
                                }
                            } catch (Exception e222222) {
                                throw e222222;
                            } catch (Throwable th4) {
                                th = th4;
                                fileOutputStream = fileOutputStream2;
                                fileInputStream = fileInputStream2;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            fileInputStream = fileInputStream2;
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (Exception e422) {
                                    throw e422;
                                } catch (Exception e4222) {
                                    throw e4222;
                                } catch (IOException e7) {
                                }
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        Object obj2 = fileOutputStream;
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        throw th;
                    }
                } catch (Exception e2222222) {
                    throw e2222222;
                }
            } catch (Exception e22222222) {
                throw e22222222;
            } catch (Exception e222222222) {
                throw e222222222;
            }
        } catch (Exception e2222222222) {
            throw e2222222222;
        } catch (Exception e22222222222) {
            throw e22222222222;
        }
    }

    /* renamed from: a */
    public static final void m6213a(java.lang.String r10, java.lang.String r11, int r12, boolean r13, boolean r14) throws fr.pcsoft.wdjava.file.C0901s {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Exception block dominator not found, method:fr.pcsoft.wdjava.file.f.a(java.lang.String, java.lang.String, int, boolean, boolean):void. bs: [B:47:0x007e, B:60:0x00a7, B:64:0x00ad, B:80:0x00d8, B:90:0x00f4]
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
        r9 = 2;
        r8 = -1;
        r1 = 1;
        r2 = 0;
        r0 = r12 & 1;
        if (r0 != r1) goto L_0x0134;
    L_0x0008:
        r3 = r1;
    L_0x0009:
        r0 = r12 & 4;
        r4 = 4;
        if (r0 != r4) goto L_0x0131;
    L_0x000e:
        r0 = r1;
    L_0x000f:
        r4 = "";	 Catch:{ IOException -> 0x0073 }
        r4 = r10.equals(r4);	 Catch:{ IOException -> 0x0073 }
        if (r4 != 0) goto L_0x001f;
    L_0x0017:
        r4 = "";	 Catch:{ IOException -> 0x0075 }
        r4 = r11.equals(r4);	 Catch:{ IOException -> 0x0075 }
        if (r4 == 0) goto L_0x002e;	 Catch:{ IOException -> 0x0075 }
    L_0x001f:
        r4 = f2382z;	 Catch:{ IOException -> 0x0075 }
        r5 = 5;	 Catch:{ IOException -> 0x0075 }
        r4 = r4[r5];	 Catch:{ IOException -> 0x0075 }
        r5 = 0;	 Catch:{ IOException -> 0x0075 }
        r5 = new java.lang.String[r5];	 Catch:{ IOException -> 0x0075 }
        r4 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r4, r5);	 Catch:{ IOException -> 0x0075 }
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2883a(r4);	 Catch:{ IOException -> 0x0075 }
    L_0x002e:
        r4 = 42;
        r4 = r11.indexOf(r4);	 Catch:{ IOException -> 0x0077 }
        if (r4 != r8) goto L_0x003e;
    L_0x0036:
        r4 = 63;
        r4 = r11.indexOf(r4);	 Catch:{ IOException -> 0x0079 }
        if (r4 == r8) goto L_0x0058;	 Catch:{ IOException -> 0x0079 }
    L_0x003e:
        r4 = f2382z;	 Catch:{ IOException -> 0x0079 }
        r5 = 6;	 Catch:{ IOException -> 0x0079 }
        r4 = r4[r5];	 Catch:{ IOException -> 0x0079 }
        r5 = 1;	 Catch:{ IOException -> 0x0079 }
        r5 = new java.lang.String[r5];	 Catch:{ IOException -> 0x0079 }
        r6 = 0;	 Catch:{ IOException -> 0x0079 }
        r7 = fr.pcsoft.wdjava.core.context.WDAppelContexte.getContexte();	 Catch:{ IOException -> 0x0079 }
        r7 = r7.m2731r();	 Catch:{ IOException -> 0x0079 }
        r5[r6] = r7;	 Catch:{ IOException -> 0x0079 }
        r4 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r4, r5);	 Catch:{ IOException -> 0x0079 }
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2883a(r4);	 Catch:{ IOException -> 0x0079 }
    L_0x0058:
        if (r13 != 0) goto L_0x006a;
    L_0x005a:
        r4 = "*";	 Catch:{ IOException -> 0x007b }
        r4 = r10.indexOf(r4);	 Catch:{ IOException -> 0x007b }
        if (r4 != r8) goto L_0x006a;
    L_0x0062:
        r4 = "?";	 Catch:{ IOException -> 0x007d }
        r4 = r10.indexOf(r4);	 Catch:{ IOException -> 0x007d }
        if (r4 == r8) goto L_0x00a1;	 Catch:{ IOException -> 0x007d }
    L_0x006a:
        r4 = new fr.pcsoft.wdjava.core.types.WDBooleen;	 Catch:{ IOException -> 0x007d }
        r4.<init>(r0);	 Catch:{ IOException -> 0x007d }
        fr.pcsoft.wdjava.file.C0889f.m6214a(r10, r11, r4, r3, r14);	 Catch:{ IOException -> 0x007d }
    L_0x0072:
        return;
    L_0x0073:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0075 }
    L_0x0075:
        r0 = move-exception;
        throw r0;
    L_0x0077:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0079 }
    L_0x0079:
        r0 = move-exception;
        throw r0;
    L_0x007b:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x007d }
    L_0x007d:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x007f }
    L_0x007f:
        r0 = move-exception;
        if (r13 == 0) goto L_0x0118;
    L_0x0082:
        r1 = new fr.pcsoft.wdjava.file.s;	 Catch:{ IOException -> 0x009f }
        r2 = f2382z;	 Catch:{ IOException -> 0x009f }
        r3 = 8;	 Catch:{ IOException -> 0x009f }
        r2 = r2[r3];	 Catch:{ IOException -> 0x009f }
        r3 = 2;	 Catch:{ IOException -> 0x009f }
        r3 = new java.lang.String[r3];	 Catch:{ IOException -> 0x009f }
        r4 = 0;	 Catch:{ IOException -> 0x009f }
        r3[r4] = r10;	 Catch:{ IOException -> 0x009f }
        r4 = 1;	 Catch:{ IOException -> 0x009f }
        r3[r4] = r11;	 Catch:{ IOException -> 0x009f }
        r2 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r2, r3);	 Catch:{ IOException -> 0x009f }
        r0 = r0.getMessage();	 Catch:{ IOException -> 0x009f }
        r1.<init>(r2, r0);	 Catch:{ IOException -> 0x009f }
        throw r1;	 Catch:{ IOException -> 0x009f }
    L_0x009f:
        r0 = move-exception;
        throw r0;
    L_0x00a1:
        if (r14 == 0) goto L_0x010e;
    L_0x00a3:
        r4 = fr.pcsoft.wdjava.file.C0897o.m6290j(r10);	 Catch:{ IOException -> 0x007f }
        r5 = r4.exists();	 Catch:{ IOException -> 0x00ce }
        if (r5 == 0) goto L_0x00b3;
    L_0x00ad:
        r5 = r4.isDirectory();	 Catch:{ IOException -> 0x00cc }
        if (r5 != 0) goto L_0x00d0;	 Catch:{ IOException -> 0x00cc }
    L_0x00b3:
        r0 = new fr.pcsoft.wdjava.file.s;	 Catch:{ IOException -> 0x00cc }
        r3 = f2382z;	 Catch:{ IOException -> 0x00cc }
        r5 = 0;	 Catch:{ IOException -> 0x00cc }
        r3 = r3[r5];	 Catch:{ IOException -> 0x00cc }
        r5 = 1;	 Catch:{ IOException -> 0x00cc }
        r5 = new java.lang.String[r5];	 Catch:{ IOException -> 0x00cc }
        r6 = 0;	 Catch:{ IOException -> 0x00cc }
        r4 = r4.toString();	 Catch:{ IOException -> 0x00cc }
        r5[r6] = r4;	 Catch:{ IOException -> 0x00cc }
        r3 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r3, r5);	 Catch:{ IOException -> 0x00cc }
        r0.<init>(r3);	 Catch:{ IOException -> 0x00cc }
        throw r0;	 Catch:{ IOException -> 0x00cc }
    L_0x00cc:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x007f }
    L_0x00ce:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00cc }
    L_0x00d0:
        if (r3 != 0) goto L_0x00f0;
    L_0x00d2:
        r5 = r4.list();	 Catch:{ IOException -> 0x007f }
        if (r5 == 0) goto L_0x00db;
    L_0x00d8:
        r5 = r5.length;	 Catch:{ IOException -> 0x00ee }
        if (r5 != 0) goto L_0x00f0;	 Catch:{ IOException -> 0x00ee }
    L_0x00db:
        r0 = new fr.pcsoft.wdjava.file.s;	 Catch:{ IOException -> 0x00ee }
        r3 = f2382z;	 Catch:{ IOException -> 0x00ee }
        r4 = 9;	 Catch:{ IOException -> 0x00ee }
        r3 = r3[r4];	 Catch:{ IOException -> 0x00ee }
        r4 = 0;	 Catch:{ IOException -> 0x00ee }
        r4 = new java.lang.String[r4];	 Catch:{ IOException -> 0x00ee }
        r3 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r3, r4);	 Catch:{ IOException -> 0x00ee }
        r0.<init>(r3);	 Catch:{ IOException -> 0x00ee }
        throw r0;	 Catch:{ IOException -> 0x00ee }
    L_0x00ee:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x007f }
    L_0x00f0:
        r5 = fr.pcsoft.wdjava.file.C0897o.m6290j(r11);	 Catch:{ IOException -> 0x007f }
        r6 = r5.exists();	 Catch:{ IOException -> 0x0107 }
        if (r6 == 0) goto L_0x0109;	 Catch:{ IOException -> 0x0107 }
    L_0x00fa:
        r5 = new fr.pcsoft.wdjava.core.types.WDBooleen;	 Catch:{ IOException -> 0x0107 }
        r5.<init>(r0);	 Catch:{ IOException -> 0x0107 }
        fr.pcsoft.wdjava.file.C0889f.m6215b(r10, r11, r5, r3, r14);	 Catch:{ IOException -> 0x0107 }
        r4.delete();	 Catch:{ IOException -> 0x0107 }
        goto L_0x0072;
    L_0x0107:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x007f }
    L_0x0109:
        r4.renameTo(r5);	 Catch:{ IOException -> 0x007f }
        goto L_0x0072;	 Catch:{ IOException -> 0x007f }
    L_0x010e:
        r4 = new fr.pcsoft.wdjava.core.types.WDBooleen;	 Catch:{ IOException -> 0x007f }
        r4.<init>(r0);	 Catch:{ IOException -> 0x007f }
        fr.pcsoft.wdjava.file.C0889f.m6215b(r10, r11, r4, r3, r14);	 Catch:{ IOException -> 0x007f }
        goto L_0x0072;
    L_0x0118:
        r3 = new fr.pcsoft.wdjava.file.s;
        r4 = f2382z;
        r5 = 7;
        r4 = r4[r5];
        r5 = new java.lang.String[r9];
        r5[r2] = r10;
        r5[r1] = r11;
        r1 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r4, r5);
        r0 = r0.getMessage();
        r3.<init>(r1, r0);
        throw r3;
    L_0x0131:
        r0 = r2;
        goto L_0x000f;
    L_0x0134:
        r3 = r2;
        goto L_0x0009;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.file.f.a(java.lang.String, java.lang.String, int, boolean, boolean):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private static void m6214a(java.lang.String r8, java.lang.String r9, fr.pcsoft.wdjava.core.types.WDBooleen r10, boolean r11, boolean r12) throws java.io.IOException, fr.pcsoft.wdjava.file.C0901s {
        /*
        r5 = -1;
        r7 = 1;
        r0 = 0;
        r1 = fr.pcsoft.wdjava.file.C0897o.m6290j(r8);
        r2 = 42;
        r2 = r8.indexOf(r2);	 Catch:{ IOException -> 0x0045 }
        if (r2 != r5) goto L_0x006b;
    L_0x000f:
        r2 = 63;
        r2 = r8.indexOf(r2);	 Catch:{ IOException -> 0x0047 }
        if (r2 != r5) goto L_0x006b;
    L_0x0017:
        r2 = r1.exists();	 Catch:{ IOException -> 0x0049 }
        if (r2 == 0) goto L_0x0023;
    L_0x001d:
        r2 = r1.isFile();	 Catch:{ IOException -> 0x004b }
        if (r2 != 0) goto L_0x0063;
    L_0x0023:
        r2 = r1.isFile();	 Catch:{ IOException -> 0x0043 }
        if (r2 == 0) goto L_0x004d;
    L_0x0029:
        r0 = new fr.pcsoft.wdjava.file.s;	 Catch:{ IOException -> 0x0043 }
        r2 = f2382z;	 Catch:{ IOException -> 0x0043 }
        r3 = 12;
        r2 = r2[r3];	 Catch:{ IOException -> 0x0043 }
        r3 = 1;
        r3 = new java.lang.String[r3];	 Catch:{ IOException -> 0x0043 }
        r4 = 0;
        r1 = r1.toString();	 Catch:{ IOException -> 0x0043 }
        r3[r4] = r1;	 Catch:{ IOException -> 0x0043 }
        r1 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r2, r3);	 Catch:{ IOException -> 0x0043 }
        r0.<init>(r1);	 Catch:{ IOException -> 0x0043 }
        throw r0;	 Catch:{ IOException -> 0x0043 }
    L_0x0043:
        r0 = move-exception;
        throw r0;
    L_0x0045:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0047 }
    L_0x0047:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0049 }
    L_0x0049:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x004b }
    L_0x004b:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0043 }
    L_0x004d:
        r2 = new fr.pcsoft.wdjava.file.s;
        r3 = f2382z;
        r3 = r3[r0];
        r4 = new java.lang.String[r7];
        r1 = r1.toString();
        r4[r0] = r1;
        r0 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r3, r4);
        r2.<init>(r0);
        throw r2;
    L_0x0063:
        r0 = fr.pcsoft.wdjava.file.C0897o.m6290j(r9);
        fr.pcsoft.wdjava.file.C0889f.m6212a(r1, r0, r10, r12);
    L_0x006a:
        return;
    L_0x006b:
        r3 = fr.pcsoft.wdjava.file.C0897o.m6290j(r9);
        r1 = fr.pcsoft.wdjava.file.C0897o.m6291k(r8);
        if (r11 == 0) goto L_0x014a;
    L_0x0075:
        r2 = java.io.File.separatorChar;
        r4 = r8.lastIndexOf(r2);
        if (r4 == r5) goto L_0x014a;
    L_0x007d:
        if (r12 == 0) goto L_0x0091;
    L_0x007f:
        r2 = r4 + 1;
        r2 = r8.substring(r2);	 Catch:{ IOException -> 0x00e0 }
        r5 = f2382z;	 Catch:{ IOException -> 0x00e0 }
        r6 = 11;
        r5 = r5[r6];	 Catch:{ IOException -> 0x00e0 }
        r2 = r2.equals(r5);	 Catch:{ IOException -> 0x00e0 }
        if (r2 == 0) goto L_0x014a;
    L_0x0091:
        r1 = r8.substring(r0, r4);
        r1 = fr.pcsoft.wdjava.file.C0897o.m6290j(r1);
        r2 = r1.exists();
        if (r2 == 0) goto L_0x0134;
    L_0x009f:
        r1 = r1.listFiles();
        if (r1 == 0) goto L_0x014a;
    L_0x00a5:
        r2 = r0;
    L_0x00a6:
        r5 = r1.length;	 Catch:{ IOException -> 0x00e2 }
        if (r2 >= r5) goto L_0x014a;
    L_0x00a9:
        r5 = r1[r2];	 Catch:{ IOException -> 0x00e4 }
        r5 = r5.isDirectory();	 Catch:{ IOException -> 0x00e4 }
        if (r5 == 0) goto L_0x00dd;
    L_0x00b1:
        if (r12 == 0) goto L_0x00e8;
    L_0x00b3:
        r5 = r1[r2];	 Catch:{ IOException -> 0x00e6 }
        r6 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x00e6 }
        r6.<init>();	 Catch:{ IOException -> 0x00e6 }
        r7 = r3.getPath();	 Catch:{ IOException -> 0x00e6 }
        r6 = r6.append(r7);	 Catch:{ IOException -> 0x00e6 }
        r7 = java.io.File.separatorChar;	 Catch:{ IOException -> 0x00e6 }
        r6 = r6.append(r7);	 Catch:{ IOException -> 0x00e6 }
        r7 = r1[r2];	 Catch:{ IOException -> 0x00e6 }
        r7 = r7.getName();	 Catch:{ IOException -> 0x00e6 }
        r6 = r6.append(r7);	 Catch:{ IOException -> 0x00e6 }
        r6 = r6.toString();	 Catch:{ IOException -> 0x00e6 }
        r6 = fr.pcsoft.wdjava.file.C0897o.m6290j(r6);	 Catch:{ IOException -> 0x00e6 }
        r5.renameTo(r6);	 Catch:{ IOException -> 0x00e6 }
    L_0x00dd:
        r2 = r2 + 1;
        goto L_0x00a6;
    L_0x00e0:
        r0 = move-exception;
        throw r0;
    L_0x00e2:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00e4 }
    L_0x00e4:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00e6 }
    L_0x00e6:
        r0 = move-exception;
        throw r0;
    L_0x00e8:
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = r1[r2];
        r6 = r6.getPath();
        r5 = r5.append(r6);
        r6 = java.io.File.separatorChar;
        r5 = r5.append(r6);
        r6 = r4 + 1;
        r7 = r8.length();
        r6 = r8.substring(r6, r7);
        r5 = r5.append(r6);
        r5 = r5.toString();
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r7 = r3.getPath();
        r6 = r6.append(r7);
        r7 = java.io.File.separatorChar;
        r6 = r6.append(r7);
        r7 = r1[r2];
        r7 = r7.getName();
        r6 = r6.append(r7);
        r6 = r6.toString();
        fr.pcsoft.wdjava.file.C0889f.m6214a(r5, r6, r10, r11, r12);
        goto L_0x00dd;
    L_0x0134:
        r2 = new fr.pcsoft.wdjava.file.s;
        r3 = f2382z;
        r3 = r3[r0];
        r4 = new java.lang.String[r7];
        r1 = r1.toString();
        r4[r0] = r1;
        r0 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r3, r4);
        r2.<init>(r0);
        throw r2;
    L_0x014a:
        if (r1 == 0) goto L_0x006a;
    L_0x014c:
        r2 = r3.isDirectory();	 Catch:{ IOException -> 0x0186 }
        if (r2 != 0) goto L_0x0188;
    L_0x0152:
        r2 = r3.mkdirs();	 Catch:{ IOException -> 0x0184 }
        if (r2 != 0) goto L_0x0188;
    L_0x0158:
        r0 = f2382z;	 Catch:{ IOException -> 0x0184 }
        r1 = 10;
        r0 = r0[r1];	 Catch:{ IOException -> 0x0184 }
        r1 = 1;
        r1 = new java.lang.String[r1];	 Catch:{ IOException -> 0x0184 }
        r2 = 0;
        r4 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0184 }
        r4.<init>();	 Catch:{ IOException -> 0x0184 }
        r5 = "";
        r4 = r4.append(r5);	 Catch:{ IOException -> 0x0184 }
        r3 = r3.toString();	 Catch:{ IOException -> 0x0184 }
        r3 = r4.append(r3);	 Catch:{ IOException -> 0x0184 }
        r3 = r3.toString();	 Catch:{ IOException -> 0x0184 }
        r1[r2] = r3;	 Catch:{ IOException -> 0x0184 }
        r0 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r0, r1);	 Catch:{ IOException -> 0x0184 }
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2883a(r0);	 Catch:{ IOException -> 0x0184 }
        goto L_0x006a;
    L_0x0184:
        r0 = move-exception;
        throw r0;
    L_0x0186:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0184 }
    L_0x0188:
        r2 = r1.length;	 Catch:{ IOException -> 0x019b }
        if (r0 >= r2) goto L_0x006a;
    L_0x018b:
        r2 = r1[r0];	 Catch:{ IOException -> 0x019d }
        r2 = r2.isDirectory();	 Catch:{ IOException -> 0x019d }
        if (r2 != 0) goto L_0x0198;
    L_0x0193:
        r2 = r1[r0];	 Catch:{ IOException -> 0x019d }
        fr.pcsoft.wdjava.file.C0889f.m6212a(r2, r3, r10, r12);	 Catch:{ IOException -> 0x019d }
    L_0x0198:
        r0 = r0 + 1;
        goto L_0x0188;
    L_0x019b:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x019d }
    L_0x019d:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.file.f.a(java.lang.String, java.lang.String, fr.pcsoft.wdjava.core.types.WDBooleen, boolean, boolean):void");
    }

    /* renamed from: b */
    private static void m6215b(String str, String str2, WDBooleen wDBooleen, boolean z, boolean z2) throws IOException, C0901s {
        int i = 0;
        File j = C0897o.m6290j(str);
        try {
            if (j.exists()) {
                if (j.isDirectory()) {
                    File j2 = C0897o.m6290j(str2);
                    try {
                        if (!j2.isDirectory()) {
                            if (!j2.mkdirs()) {
                                throw new IOException();
                            }
                        }
                        File[] listFiles = j.listFiles();
                        if (listFiles != null) {
                            while (i < listFiles.length) {
                                try {
                                    if (z) {
                                        try {
                                            if (listFiles[i].isDirectory()) {
                                                if (z2) {
                                                    try {
                                                        if (j2.exists()) {
                                                            C0889f.m6215b(listFiles[i].getPath(), j2.getPath() + File.separator + listFiles[i].getName(), wDBooleen, z, z2);
                                                            listFiles[i].delete();
                                                        } else {
                                                            listFiles[i].renameTo(C0897o.m6290j(j2.getPath() + File.separator + listFiles[i].getName()));
                                                        }
                                                    } catch (IOException e) {
                                                        throw e;
                                                    }
                                                }
                                                C0889f.m6215b(listFiles[i].getPath(), j2.getPath() + File.separator + listFiles[i].getName(), wDBooleen, z, z2);
                                                i++;
                                            }
                                        } catch (IOException e2) {
                                            try {
                                                throw e2;
                                            } catch (IOException e22) {
                                                throw e22;
                                            }
                                        }
                                    }
                                    try {
                                        if (listFiles[i].isFile()) {
                                            C0889f.m6212a(listFiles[i], C0897o.m6290j(j2.getPath() + File.separatorChar + listFiles[i].getName()), wDBooleen, z2);
                                        }
                                        i++;
                                    } catch (IOException e222) {
                                        throw e222;
                                    }
                                } catch (IOException e2222) {
                                    throw e2222;
                                } catch (IOException e22222) {
                                    throw e22222;
                                }
                            }
                            return;
                        }
                        return;
                    } catch (IOException e222222) {
                        throw e222222;
                    } catch (IOException e2222222) {
                        throw e2222222;
                    }
                }
            }
            throw new C0901s(C0745b.m3222b(f2382z[0], j.toString()));
        } catch (IOException e22222222) {
            throw e22222222;
        } catch (IOException e222222222) {
            throw e222222222;
        }
    }

    /* renamed from: z */
    private static String m6216z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 59;
                    break;
                case 1:
                    i2 = 24;
                    break;
                case 2:
                    i2 = 45;
                    break;
                case 3:
                    i2 = 105;
                    break;
                default:
                    i2 = 20;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m6217z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 20);
        }
        return toCharArray;
    }
}
