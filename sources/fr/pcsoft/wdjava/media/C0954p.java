package fr.pcsoft.wdjava.media;

import android.content.BroadcastReceiver;
import android.net.Uri;

/* renamed from: fr.pcsoft.wdjava.media.p */
class C0954p extends BroadcastReceiver {
    /* renamed from: z */
    private static final String[] f2609z = new String[]{C0954p.m6862z(C0954p.m6863z("\u001dTaWB\u0018QqWyG\b*")), C0954p.m6862z(C0954p.m6863z("\u001dTaWB\u0018QqWy")), C0954p.m6862z(C0954p.m6863z(".xJqR=pJ`X-z@`B8vA{K0aL")), C0954p.m6862z(C0954p.m6863z("<mA`\\&`G{B4pQ{\\")), C0954p.m6862z(C0954p.m6863z("0Xe]n\n\\w^xYQp\u0012o\u001c[z_p\u001cG5^xYS|Qu\u0010Pg\u0012i\u001cXe]o\u0018\\gW3")), C0954p.m6862z(C0954p.m6863z("&QtF|")), C0954p.m6862z(C0954p.m6863z("\u001dTaWB\u0018QqWyYtFq")), C0954p.m6862z(C0954p.m6863z("&\\q"))};
    final fb this$1;
    final Uri val$outputUri;
    final String val$strCheminFichierTemp;

    C0954p(fb fbVar, Uri uri, String str) {
        this.this$1 = fbVar;
        this.val$outputUri = uri;
        this.val$strCheminFichierTemp = str;
    }

    /* renamed from: z */
    private static String m6862z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 121;
                    break;
                case 1:
                    i2 = 53;
                    break;
                case 2:
                    i2 = 21;
                    break;
                case 3:
                    i2 = 50;
                    break;
                default:
                    i2 = 29;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m6863z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 29);
        }
        return toCharArray;
    }

    public void onReceive(android.content.Context r13, android.content.Intent r14) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Exception block dominator not found, method:fr.pcsoft.wdjava.media.p.onReceive(android.content.Context, android.content.Intent):void. bs: [B:6:0x001e, B:10:0x0026, B:14:0x005f, B:22:0x008e, B:25:0x0093, B:51:0x0104, B:67:0x012d, B:80:0x013a, B:93:0x014c]
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:86)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/70807318.run(Unknown Source)
*/
        /*
        r12 = this;
        r4 = 2;
        r9 = 0;
        r2 = f2609z;	 Catch:{ all -> 0x0116 }
        r3 = 2;	 Catch:{ all -> 0x0116 }
        r2 = r2[r3];	 Catch:{ all -> 0x0116 }
        r3 = 0;	 Catch:{ all -> 0x0116 }
        r2 = r14.getIntExtra(r2, r3);	 Catch:{ all -> 0x0116 }
        r3 = -1;	 Catch:{ all -> 0x0116 }
        if (r2 != r3) goto L_0x014c;	 Catch:{ all -> 0x0116 }
    L_0x000f:
        r2 = f2609z;	 Catch:{ all -> 0x0116 }
        r3 = 3;	 Catch:{ all -> 0x0116 }
        r2 = r2[r3];	 Catch:{ all -> 0x0116 }
        r2 = r14.getParcelableExtra(r2);	 Catch:{ all -> 0x0116 }
        r0 = r2;	 Catch:{ all -> 0x0116 }
        r0 = (android.net.Uri) r0;	 Catch:{ all -> 0x0116 }
        r8 = r0;	 Catch:{ all -> 0x0116 }
        if (r8 != 0) goto L_0x0164;
    L_0x001e:
        r2 = r12.this$1;	 Catch:{ s -> 0x0114 }
        r2 = r2.val$nTypeCapture;	 Catch:{ s -> 0x0114 }
        if (r2 != r4) goto L_0x0124;	 Catch:{ s -> 0x0114 }
    L_0x0024:
        r3 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI;	 Catch:{ s -> 0x0114 }
    L_0x0026:
        r2 = r12.this$1;	 Catch:{ all -> 0x0116 }
        r2 = r2.val$activiteEnCours;	 Catch:{ all -> 0x0116 }
        r2 = r2.getContentResolver();	 Catch:{ all -> 0x0116 }
        r4 = 2;	 Catch:{ all -> 0x0116 }
        r4 = new java.lang.String[r4];	 Catch:{ all -> 0x0116 }
        r5 = 0;	 Catch:{ all -> 0x0116 }
        r6 = f2609z;	 Catch:{ all -> 0x0116 }
        r7 = 7;	 Catch:{ all -> 0x0116 }
        r6 = r6[r7];	 Catch:{ all -> 0x0116 }
        r4[r5] = r6;	 Catch:{ all -> 0x0116 }
        r5 = 1;	 Catch:{ all -> 0x0116 }
        r6 = f2609z;	 Catch:{ all -> 0x0116 }
        r7 = 1;	 Catch:{ all -> 0x0116 }
        r6 = r6[r7];	 Catch:{ all -> 0x0116 }
        r4[r5] = r6;	 Catch:{ all -> 0x0116 }
        r5 = f2609z;	 Catch:{ all -> 0x0116 }
        r6 = 0;	 Catch:{ all -> 0x0116 }
        r5 = r5[r6];	 Catch:{ all -> 0x0116 }
        r6 = 1;	 Catch:{ all -> 0x0116 }
        r6 = new java.lang.String[r6];	 Catch:{ all -> 0x0116 }
        r7 = 0;	 Catch:{ all -> 0x0116 }
        r10 = r12.this$1;	 Catch:{ all -> 0x0116 }
        r10 = r10.val$lDateCourante;	 Catch:{ all -> 0x0116 }
        r10 = java.lang.String.valueOf(r10);	 Catch:{ all -> 0x0116 }
        r6[r7] = r10;	 Catch:{ all -> 0x0116 }
        r7 = f2609z;	 Catch:{ all -> 0x0116 }
        r10 = 6;	 Catch:{ all -> 0x0116 }
        r7 = r7[r10];	 Catch:{ all -> 0x0116 }
        r4 = r2.query(r3, r4, r5, r6, r7);	 Catch:{ all -> 0x0116 }
        if (r4 == 0) goto L_0x0161;
    L_0x005f:
        r2 = r4.moveToFirst();	 Catch:{ all -> 0x012a }
        if (r2 == 0) goto L_0x0161;	 Catch:{ all -> 0x012a }
    L_0x0065:
        r2 = f2609z;	 Catch:{ all -> 0x012a }
        r5 = 1;	 Catch:{ all -> 0x012a }
        r2 = r2[r5];	 Catch:{ all -> 0x012a }
        r2 = r4.getColumnIndex(r2);	 Catch:{ all -> 0x012a }
        r6 = r4.getLong(r2);	 Catch:{ all -> 0x012a }
        r2 = r12.this$1;	 Catch:{ all -> 0x012a }
        r10 = r2.val$lDateCourante;	 Catch:{ all -> 0x012a }
        r2 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1));	 Catch:{ all -> 0x012a }
        if (r2 < 0) goto L_0x0161;	 Catch:{ all -> 0x012a }
    L_0x007a:
        r2 = f2609z;	 Catch:{ all -> 0x012a }
        r5 = 7;	 Catch:{ all -> 0x012a }
        r2 = r2[r5];	 Catch:{ all -> 0x012a }
        r2 = r4.getColumnIndex(r2);	 Catch:{ all -> 0x012a }
        r2 = r4.getString(r2);	 Catch:{ all -> 0x012a }
        r8 = android.net.Uri.withAppendedPath(r3, r2);	 Catch:{ all -> 0x012a }
        r3 = r8;
    L_0x008c:
        if (r4 == 0) goto L_0x0091;
    L_0x008e:
        r4.close();	 Catch:{ s -> 0x0128 }
    L_0x0091:
        if (r3 == 0) goto L_0x0107;
    L_0x0093:
        r2 = r12.val$outputUri;	 Catch:{ s -> 0x0133 }
        r2 = r2.equals(r3);	 Catch:{ s -> 0x0133 }
        if (r2 != 0) goto L_0x00aa;	 Catch:{ s -> 0x0133 }
    L_0x009b:
        r2 = r12.this$1;	 Catch:{ s -> 0x0133 }
        r2 = r2.val$activiteEnCours;	 Catch:{ s -> 0x0133 }
        r2 = r2.getContentResolver();	 Catch:{ s -> 0x0133 }
        r4 = r12.val$outputUri;	 Catch:{ s -> 0x0133 }
        r5 = 0;	 Catch:{ s -> 0x0133 }
        r6 = 0;	 Catch:{ s -> 0x0133 }
        r2.delete(r4, r5, r6);	 Catch:{ s -> 0x0133 }
    L_0x00aa:
        r2 = 2;
        r4 = new java.lang.String[r2];	 Catch:{ all -> 0x015e }
        r2 = 0;	 Catch:{ all -> 0x015e }
        r5 = f2609z;	 Catch:{ all -> 0x015e }
        r6 = 5;	 Catch:{ all -> 0x015e }
        r5 = r5[r6];	 Catch:{ all -> 0x015e }
        r4[r2] = r5;	 Catch:{ all -> 0x015e }
        r2 = 1;	 Catch:{ all -> 0x015e }
        r5 = f2609z;	 Catch:{ all -> 0x015e }
        r6 = 7;	 Catch:{ all -> 0x015e }
        r5 = r5[r6];	 Catch:{ all -> 0x015e }
        r4[r2] = r5;	 Catch:{ all -> 0x015e }
        r2 = r12.this$1;	 Catch:{ all -> 0x015e }
        r2 = r2.val$activiteEnCours;	 Catch:{ all -> 0x015e }
        r2 = r2.getContentResolver();	 Catch:{ all -> 0x015e }
        r5 = 0;	 Catch:{ all -> 0x015e }
        r6 = 0;	 Catch:{ all -> 0x015e }
        r7 = 0;	 Catch:{ all -> 0x015e }
        r3 = r2.query(r3, r4, r5, r6, r7);	 Catch:{ all -> 0x015e }
        r2 = f2609z;	 Catch:{ all -> 0x0137 }
        r4 = 5;	 Catch:{ all -> 0x0137 }
        r2 = r2[r4];	 Catch:{ all -> 0x0137 }
        r2 = r3.getColumnIndex(r2);	 Catch:{ all -> 0x0137 }
        r4 = r3.moveToFirst();	 Catch:{ all -> 0x0137 }
        if (r4 == 0) goto L_0x0102;	 Catch:{ all -> 0x0137 }
    L_0x00db:
        r4 = new java.io.File;	 Catch:{ all -> 0x0137 }
        r2 = r3.getString(r2);	 Catch:{ all -> 0x0137 }
        r4.<init>(r2);	 Catch:{ all -> 0x0137 }
        r2 = r4.exists();	 Catch:{ all -> 0x0137 }
        if (r2 == 0) goto L_0x0102;	 Catch:{ all -> 0x0137 }
    L_0x00ea:
        r5 = r4.getPath();	 Catch:{ all -> 0x0137 }
        r2 = r12.val$strCheminFichierTemp;	 Catch:{ s -> 0x0135 }
        if (r2 == 0) goto L_0x00fd;	 Catch:{ s -> 0x0135 }
    L_0x00f2:
        r2 = r4.delete();	 Catch:{ s -> 0x0135 }
        if (r2 == 0) goto L_0x00fd;
    L_0x00f8:
        r2 = r12.val$strCheminFichierTemp;	 Catch:{ s -> 0x013e }
        fr.pcsoft.wdjava.file.C0897o.m6286g(r2, r5);	 Catch:{ s -> 0x013e }
    L_0x00fd:
        r2 = r12.this$1;	 Catch:{ all -> 0x0137 }
        fr.pcsoft.wdjava.media.fb.access$300(r2, r5);	 Catch:{ all -> 0x0137 }
    L_0x0102:
        if (r3 == 0) goto L_0x0107;
    L_0x0104:
        r3.close();	 Catch:{ s -> 0x0148 }
    L_0x0107:
        r2 = r12.this$1;
        r2 = r2.val$activiteEnCours;
        r2.unregisterReceiver(r12);
        r2 = r12.this$1;
        r2.m1784a();
        return;
    L_0x0114:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x0116 }
    L_0x0116:
        r2 = move-exception;
        r3 = r12.this$1;
        r3 = r3.val$activiteEnCours;
        r3.unregisterReceiver(r12);
        r3 = r12.this$1;
        r3.m1784a();
        throw r2;
    L_0x0124:
        r3 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI;	 Catch:{ all -> 0x0116 }
        goto L_0x0026;	 Catch:{ all -> 0x0116 }
    L_0x0128:
        r2 = move-exception;	 Catch:{ all -> 0x0116 }
        throw r2;	 Catch:{ all -> 0x0116 }
    L_0x012a:
        r2 = move-exception;
        if (r4 == 0) goto L_0x0130;
    L_0x012d:
        r4.close();	 Catch:{ s -> 0x0131 }
    L_0x0130:
        throw r2;	 Catch:{ all -> 0x0116 }
    L_0x0131:
        r2 = move-exception;	 Catch:{ all -> 0x0116 }
        throw r2;	 Catch:{ all -> 0x0116 }
    L_0x0133:
        r2 = move-exception;	 Catch:{ all -> 0x0116 }
        throw r2;	 Catch:{ all -> 0x0116 }
    L_0x0135:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x0137 }
    L_0x0137:
        r2 = move-exception;
    L_0x0138:
        if (r3 == 0) goto L_0x013d;
    L_0x013a:
        r3.close();	 Catch:{ s -> 0x014a }
    L_0x013d:
        throw r2;	 Catch:{ all -> 0x0116 }
    L_0x013e:
        r2 = move-exception;
        r4 = f2609z;	 Catch:{ all -> 0x0137 }
        r6 = 4;	 Catch:{ all -> 0x0137 }
        r4 = r4[r6];	 Catch:{ all -> 0x0137 }
        fr.pcsoft.wdjava.core.debug.C0691a.m2857a(r4, r2);	 Catch:{ all -> 0x0137 }
        goto L_0x00fd;
    L_0x0148:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x0116 }
    L_0x014a:
        r2 = move-exception;	 Catch:{ all -> 0x0116 }
        throw r2;	 Catch:{ all -> 0x0116 }
    L_0x014c:
        r2 = r12.val$outputUri;	 Catch:{ s -> 0x015c }
        if (r2 == 0) goto L_0x0107;	 Catch:{ s -> 0x015c }
    L_0x0150:
        r2 = fr.pcsoft.wdjava.core.application.WDAppManager.m2553L();	 Catch:{ s -> 0x015c }
        r3 = r12.val$outputUri;	 Catch:{ s -> 0x015c }
        r4 = 0;	 Catch:{ s -> 0x015c }
        r5 = 0;	 Catch:{ s -> 0x015c }
        r2.delete(r3, r4, r5);	 Catch:{ s -> 0x015c }
        goto L_0x0107;
    L_0x015c:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x0116 }
    L_0x015e:
        r2 = move-exception;
        r3 = r9;
        goto L_0x0138;
    L_0x0161:
        r3 = r8;
        goto L_0x008c;
    L_0x0164:
        r3 = r8;
        goto L_0x0091;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.media.p.onReceive(android.content.Context, android.content.Intent):void");
    }
}
