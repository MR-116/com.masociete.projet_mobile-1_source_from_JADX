package fr.pcsoft.wdjava.core.utils;

class yb {
    /* renamed from: a */
    private static final char f2181a = '=';
    /* renamed from: z */
    private static final String f2182z = m4195z(m4196z("Iy\u0016<3{6\r?1`d\u001641{"));

    yb() {
    }

    /* renamed from: a */
    static final int m4190a(int i) {
        if (i >= 65 && i <= 90) {
            return i - 65;
        }
        if (i >= 97 && i <= 122) {
            return (i - 97) + 26;
        }
        if (i >= 48 && i <= 57) {
            return (i - 48) + 52;
        }
        switch (i) {
            case 43:
                return 62;
            case 47:
                return 63;
            case 61:
                return 65;
            default:
                return -1;
        }
    }

    /* renamed from: a */
    private static final int m4191a(byte[] bArr, int i) {
        return ((bArr[i] & 63) << 2) | ((bArr[i + 1] & 48) >>> 4);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public static byte[] m4192a(byte[] r12) throws java.io.IOException {
        /*
        r11 = 65;
        r10 = 4;
        r3 = 0;
        r4 = new java.io.ByteArrayInputStream;
        r4.<init>(r12);
        r5 = new java.io.ByteArrayOutputStream;
        r5.<init>();
        r0 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
        r6 = new byte[r0];	 Catch:{ all -> 0x0037 }
        r0 = 4;
        r7 = new byte[r0];	 Catch:{ all -> 0x0037 }
        r1 = r3;
    L_0x0016:
        r8 = r4.read(r6);	 Catch:{ all -> 0x0037 }
        if (r8 <= 0) goto L_0x00a6;
    L_0x001c:
        r0 = r3;
    L_0x001d:
        if (r0 >= r8) goto L_0x0016;
    L_0x001f:
        if (r1 >= r10) goto L_0x0043;
    L_0x0021:
        if (r0 >= r8) goto L_0x0016;
    L_0x0023:
        r2 = r0 + 1;
        r0 = r6[r0];	 Catch:{ all -> 0x0037 }
        r9 = m4190a(r0);	 Catch:{ all -> 0x0037 }
        if (r9 < 0) goto L_0x00cc;
    L_0x002d:
        r0 = r1 + 1;
        r9 = (byte) r9;
        r7[r1] = r9;	 Catch:{ IOException -> 0x0035 }
    L_0x0032:
        r1 = r0;
        r0 = r2;
        goto L_0x001f;
    L_0x0035:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0037 }
    L_0x0037:
        r0 = move-exception;
        if (r4 == 0) goto L_0x003d;
    L_0x003a:
        r4.close();	 Catch:{ IOException -> 0x00c8 }
    L_0x003d:
        if (r5 == 0) goto L_0x0042;
    L_0x003f:
        r5.close();	 Catch:{ IOException -> 0x00ca }
    L_0x0042:
        throw r0;
    L_0x0043:
        r1 = 2;
        r1 = r7[r1];	 Catch:{ all -> 0x0037 }
        if (r1 != r11) goto L_0x0063;
    L_0x0048:
        r0 = 0;
        r0 = m4191a(r7, r0);	 Catch:{ all -> 0x0037 }
        r5.write(r0);	 Catch:{ all -> 0x0037 }
        r0 = r5.toByteArray();	 Catch:{ all -> 0x0037 }
        if (r4 == 0) goto L_0x0059;
    L_0x0056:
        r4.close();	 Catch:{ IOException -> 0x005f }
    L_0x0059:
        if (r5 == 0) goto L_0x005e;
    L_0x005b:
        r5.close();	 Catch:{ IOException -> 0x0061 }
    L_0x005e:
        return r0;
    L_0x005f:
        r0 = move-exception;
        throw r0;
    L_0x0061:
        r0 = move-exception;
        throw r0;
    L_0x0063:
        r1 = 3;
        r1 = r7[r1];	 Catch:{ all -> 0x0037 }
        if (r1 != r11) goto L_0x008b;
    L_0x0068:
        r0 = 0;
        r0 = m4191a(r7, r0);	 Catch:{ all -> 0x0037 }
        r5.write(r0);	 Catch:{ all -> 0x0037 }
        r0 = 0;
        r0 = m4193b(r7, r0);	 Catch:{ all -> 0x0037 }
        r5.write(r0);	 Catch:{ all -> 0x0037 }
        r0 = r5.toByteArray();	 Catch:{ all -> 0x0037 }
        if (r4 == 0) goto L_0x0081;
    L_0x007e:
        r4.close();	 Catch:{ IOException -> 0x0089 }
    L_0x0081:
        if (r5 == 0) goto L_0x005e;
    L_0x0083:
        r5.close();	 Catch:{ IOException -> 0x0087 }
        goto L_0x005e;
    L_0x0087:
        r0 = move-exception;
        throw r0;
    L_0x0089:
        r0 = move-exception;
        throw r0;
    L_0x008b:
        r1 = 0;
        r1 = m4191a(r7, r1);	 Catch:{ all -> 0x0037 }
        r5.write(r1);	 Catch:{ all -> 0x0037 }
        r1 = 0;
        r1 = m4193b(r7, r1);	 Catch:{ all -> 0x0037 }
        r5.write(r1);	 Catch:{ all -> 0x0037 }
        r1 = 0;
        r1 = m4194c(r7, r1);	 Catch:{ all -> 0x0037 }
        r5.write(r1);	 Catch:{ all -> 0x0037 }
        r1 = r3;
        goto L_0x001d;
    L_0x00a6:
        if (r1 == 0) goto L_0x00b2;
    L_0x00a8:
        r0 = new java.io.IOException;	 Catch:{ IOException -> 0x00b0 }
        r1 = f2182z;	 Catch:{ IOException -> 0x00b0 }
        r0.<init>(r1);	 Catch:{ IOException -> 0x00b0 }
        throw r0;	 Catch:{ IOException -> 0x00b0 }
    L_0x00b0:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0037 }
    L_0x00b2:
        r5.flush();	 Catch:{ all -> 0x0037 }
        r0 = r5.toByteArray();	 Catch:{ all -> 0x0037 }
        if (r4 == 0) goto L_0x00be;
    L_0x00bb:
        r4.close();	 Catch:{ IOException -> 0x00c6 }
    L_0x00be:
        if (r5 == 0) goto L_0x005e;
    L_0x00c0:
        r5.close();	 Catch:{ IOException -> 0x00c4 }
        goto L_0x005e;
    L_0x00c4:
        r0 = move-exception;
        throw r0;
    L_0x00c6:
        r0 = move-exception;
        throw r0;
    L_0x00c8:
        r0 = move-exception;
        throw r0;
    L_0x00ca:
        r0 = move-exception;
        throw r0;
    L_0x00cc:
        r0 = r1;
        goto L_0x0032;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.core.utils.yb.a(byte[]):byte[]");
    }

    /* renamed from: b */
    private static final int m4193b(byte[] bArr, int i) {
        return ((bArr[i + 1] & 15) << 4) | ((bArr[i + 2] & 60) >>> 2);
    }

    /* renamed from: c */
    private static final int m4194c(byte[] bArr, int i) {
        return ((bArr[i + 2] & 3) << 6) | (bArr[i + 3] & 63);
    }

    /* renamed from: z */
    private static String m4195z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 15;
                    break;
                case 1:
                    i2 = 22;
                    break;
                case 2:
                    i2 = 100;
                    break;
                case 3:
                    i2 = 81;
                    break;
                default:
                    i2 = 82;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m4196z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 82);
        }
        return toCharArray;
    }
}
