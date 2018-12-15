package fr.pcsoft.wdjava.media;

import fr.pcsoft.wdjava.file.C0897o;

/* renamed from: fr.pcsoft.wdjava.media.z */
public class C0964z {
    /* renamed from: a */
    private static final int f2697a = 96;
    /* renamed from: z */
    private static final String[] f2698z = new String[]{C0964z.m6943z(C0964z.m6944z("\u0016S{\u00005pN}\u0000+vB`\u001d$j[`\u001c#tB|\u0000/j@`\u0016/z")), C0964z.m6943z(C0964z.m6944z("\u0016S{\u00005pN}\u0000+vB`\u001d$j[`\u001c#tB|\u0000/")), C0964z.m6943z(C0964z.m6944z("jbA'\u0007W8C\"\r"))};

    /* renamed from: a */
    private static final String m6941a(String str) {
        return C0897o.m6259b(str, 7) + f2698z[2];
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public static final void m6942a(java.lang.String r9, java.lang.String r10, int r11, int r12) throws fr.pcsoft.wdjava.media.ib {
        /*
        r2 = 0;
        if (r10 == 0) goto L_0x000b;
    L_0x0003:
        r0 = "";
        r0 = r10.equals(r0);	 Catch:{ IOException -> 0x007e }
        if (r0 == 0) goto L_0x000f;
    L_0x000b:
        r10 = fr.pcsoft.wdjava.media.C0964z.m6941a(r9);
    L_0x000f:
        r0 = 0;
        r5 = fr.pcsoft.wdjava.core.utils.bb.m3842a(r9, r0);	 Catch:{ Exception -> 0x010c, all -> 0x00f6 }
        r3 = android.graphics.BitmapFactory.decodeStream(r5);	 Catch:{ Exception -> 0x0112, all -> 0x00fc }
        if (r3 != 0) goto L_0x0080;
    L_0x001a:
        r0 = fr.pcsoft.wdjava.file.C0897o.m6290j(r9);	 Catch:{ Exception -> 0x0118, all -> 0x0101 }
        r0 = r0.getPath();	 Catch:{ Exception -> 0x0118, all -> 0x0101 }
        r1 = 3;
        r1 = android.media.ThumbnailUtils.createVideoThumbnail(r0, r1);	 Catch:{ Exception -> 0x0118, all -> 0x0101 }
        if (r1 != 0) goto L_0x00a2;
    L_0x0029:
        r0 = new fr.pcsoft.wdjava.media.ib;	 Catch:{ IOException -> 0x003b }
        r4 = f2698z;	 Catch:{ IOException -> 0x003b }
        r6 = 0;
        r4 = r4[r6];	 Catch:{ IOException -> 0x003b }
        r6 = 0;
        r6 = new java.lang.String[r6];	 Catch:{ IOException -> 0x003b }
        r4 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r4, r6);	 Catch:{ IOException -> 0x003b }
        r0.<init>(r4);	 Catch:{ IOException -> 0x003b }
        throw r0;	 Catch:{ IOException -> 0x003b }
    L_0x003b:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x003d, all -> 0x0105 }
    L_0x003d:
        r0 = move-exception;
        r4 = r5;
        r8 = r2;
        r2 = r3;
        r3 = r8;
    L_0x0042:
        r5 = new fr.pcsoft.wdjava.media.ib;	 Catch:{ all -> 0x0058 }
        r6 = f2698z;	 Catch:{ all -> 0x0058 }
        r7 = 1;
        r6 = r6[r7];	 Catch:{ all -> 0x0058 }
        r7 = 0;
        r7 = new java.lang.String[r7];	 Catch:{ all -> 0x0058 }
        r6 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r6, r7);	 Catch:{ all -> 0x0058 }
        r0 = r0.getMessage();	 Catch:{ all -> 0x0058 }
        r5.<init>(r6, r0);	 Catch:{ all -> 0x0058 }
        throw r5;	 Catch:{ all -> 0x0058 }
    L_0x0058:
        r0 = move-exception;
        r5 = r4;
        r8 = r3;
        r3 = r2;
        r2 = r8;
    L_0x005d:
        if (r5 == 0) goto L_0x0062;
    L_0x005f:
        r5.close();	 Catch:{ IOException -> 0x00f0, ib -> 0x00e4 }
    L_0x0062:
        if (r2 == 0) goto L_0x0067;
    L_0x0064:
        r2.close();	 Catch:{ IOException -> 0x00f3, ib -> 0x00e6 }
    L_0x0067:
        if (r3 == 0) goto L_0x0072;
    L_0x0069:
        r2 = r3.isRecycled();	 Catch:{ IOException -> 0x00e8 }
        if (r2 != 0) goto L_0x0072;
    L_0x006f:
        r3.recycle();	 Catch:{ IOException -> 0x00e8 }
    L_0x0072:
        if (r1 == 0) goto L_0x007d;
    L_0x0074:
        r2 = r1.isRecycled();	 Catch:{ IOException -> 0x00ea }
        if (r2 != 0) goto L_0x007d;
    L_0x007a:
        r1.recycle();	 Catch:{ IOException -> 0x00ea }
    L_0x007d:
        throw r0;
    L_0x007e:
        r0 = move-exception;
        throw r0;
    L_0x0080:
        if (r11 <= 0) goto L_0x0084;
    L_0x0082:
        if (r12 > 0) goto L_0x009d;
    L_0x0084:
        r0 = r3.getWidth();	 Catch:{ Exception -> 0x0118, all -> 0x0101 }
        r0 = (float) r0;	 Catch:{ Exception -> 0x0118, all -> 0x0101 }
        r1 = r3.getHeight();	 Catch:{ Exception -> 0x0118, all -> 0x0101 }
        r1 = (float) r1;	 Catch:{ Exception -> 0x0118, all -> 0x0101 }
        r0 = r0 / r1;
        r0 = java.lang.Float.valueOf(r0);	 Catch:{ Exception -> 0x0118, all -> 0x0101 }
        r1 = 1119879168; // 0x42c00000 float:96.0 double:5.532938244E-315;
        r0 = r0.floatValue();	 Catch:{ Exception -> 0x0118, all -> 0x0101 }
        r0 = r0 * r1;
        r11 = (int) r0;	 Catch:{ Exception -> 0x0118, all -> 0x0101 }
        r12 = 96;
    L_0x009d:
        r0 = 2;
        r1 = android.media.ThumbnailUtils.extractThumbnail(r3, r11, r12, r0);	 Catch:{ Exception -> 0x0118, all -> 0x0101 }
    L_0x00a2:
        if (r1 == 0) goto L_0x0126;
    L_0x00a4:
        r0 = fr.pcsoft.wdjava.ui.p065b.C1098i.m7959a(r9);	 Catch:{ Exception -> 0x003d, all -> 0x0105 }
        r1 = fr.pcsoft.wdjava.ui.p065b.C1098i.m7961a(r1, r0);	 Catch:{ Exception -> 0x003d, all -> 0x0105 }
        r4 = new java.io.FileOutputStream;	 Catch:{ Exception -> 0x003d, all -> 0x0105 }
        r4.<init>(r10);	 Catch:{ Exception -> 0x003d, all -> 0x0105 }
        r0 = android.graphics.Bitmap.CompressFormat.JPEG;	 Catch:{ Exception -> 0x0120, all -> 0x0108 }
        r2 = 100;
        r1.compress(r0, r2, r4);	 Catch:{ Exception -> 0x0120, all -> 0x0108 }
        r4.flush();	 Catch:{ Exception -> 0x0120, all -> 0x0108 }
    L_0x00bb:
        if (r5 == 0) goto L_0x00c0;
    L_0x00bd:
        r5.close();	 Catch:{ IOException -> 0x00ec, ib -> 0x00dc }
    L_0x00c0:
        if (r4 == 0) goto L_0x00c5;
    L_0x00c2:
        r4.close();	 Catch:{ IOException -> 0x00ee, ib -> 0x00de }
    L_0x00c5:
        if (r3 == 0) goto L_0x00d0;
    L_0x00c7:
        r0 = r3.isRecycled();	 Catch:{ IOException -> 0x00e0 }
        if (r0 != 0) goto L_0x00d0;
    L_0x00cd:
        r3.recycle();	 Catch:{ IOException -> 0x00e0 }
    L_0x00d0:
        if (r1 == 0) goto L_0x00db;
    L_0x00d2:
        r0 = r1.isRecycled();	 Catch:{ IOException -> 0x00e2 }
        if (r0 != 0) goto L_0x00db;
    L_0x00d8:
        r1.recycle();	 Catch:{ IOException -> 0x00e2 }
    L_0x00db:
        return;
    L_0x00dc:
        r0 = move-exception;
        throw r0;
    L_0x00de:
        r0 = move-exception;
        throw r0;
    L_0x00e0:
        r0 = move-exception;
        throw r0;
    L_0x00e2:
        r0 = move-exception;
        throw r0;
    L_0x00e4:
        r0 = move-exception;
        throw r0;
    L_0x00e6:
        r0 = move-exception;
        throw r0;
    L_0x00e8:
        r0 = move-exception;
        throw r0;
    L_0x00ea:
        r0 = move-exception;
        throw r0;
    L_0x00ec:
        r0 = move-exception;
        goto L_0x00c0;
    L_0x00ee:
        r0 = move-exception;
        goto L_0x00c5;
    L_0x00f0:
        r4 = move-exception;
        goto L_0x0062;
    L_0x00f3:
        r2 = move-exception;
        goto L_0x0067;
    L_0x00f6:
        r0 = move-exception;
        r1 = r2;
        r3 = r2;
        r5 = r2;
        goto L_0x005d;
    L_0x00fc:
        r0 = move-exception;
        r1 = r2;
        r3 = r2;
        goto L_0x005d;
    L_0x0101:
        r0 = move-exception;
        r1 = r2;
        goto L_0x005d;
    L_0x0105:
        r0 = move-exception;
        goto L_0x005d;
    L_0x0108:
        r0 = move-exception;
        r2 = r4;
        goto L_0x005d;
    L_0x010c:
        r0 = move-exception;
        r1 = r2;
        r3 = r2;
        r4 = r2;
        goto L_0x0042;
    L_0x0112:
        r0 = move-exception;
        r1 = r2;
        r3 = r2;
        r4 = r5;
        goto L_0x0042;
    L_0x0118:
        r0 = move-exception;
        r1 = r2;
        r4 = r5;
        r8 = r2;
        r2 = r3;
        r3 = r8;
        goto L_0x0042;
    L_0x0120:
        r0 = move-exception;
        r2 = r3;
        r3 = r4;
        r4 = r5;
        goto L_0x0042;
    L_0x0126:
        r4 = r2;
        goto L_0x00bb;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.media.z.a(java.lang.String, java.lang.String, int, int):void");
    }

    /* renamed from: z */
    private static String m6943z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 53;
                    break;
                case 1:
                    i2 = 22;
                    break;
                case 2:
                    i2 = 41;
                    break;
                case 3:
                    i2 = 82;
                    break;
                default:
                    i2 = 106;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m6944z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 106);
        }
        return toCharArray;
    }
}
