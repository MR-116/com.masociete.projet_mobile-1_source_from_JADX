package fr.pcsoft.wdjava.core.utils;

class fc {
    /* renamed from: a */
    private static byte[] f2058a = new byte[64];
    /* renamed from: b */
    private static final char f2059b = '=';

    static {
        int i;
        int i2 = 0;
        int i3 = 65;
        while (i3 <= 90) {
            i = i2 + 1;
            f2058a[i2] = (byte) i3;
            i3 = (char) (i3 + 1);
            i2 = i;
        }
        i3 = 97;
        while (i3 <= 122) {
            i = i2 + 1;
            f2058a[i2] = (byte) i3;
            i3 = (char) (i3 + 1);
            i2 = i;
        }
        i3 = 48;
        while (i3 <= 57) {
            i = i2 + 1;
            f2058a[i2] = (byte) i3;
            i3 = (char) (i3 + 1);
            i2 = i;
        }
        i = i2 + 1;
        f2058a[i2] = (byte) 43;
        i2 = i + 1;
        f2058a[i] = (byte) 47;
    }

    fc() {
    }

    /* renamed from: a */
    private static final int m3889a(byte[] bArr, int i) {
        return (bArr[i] & 252) >> 2;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public static byte[] m3890a(byte[] r13) throws java.io.IOException {
        /*
        r12 = 3;
        r1 = 0;
        r4 = new java.io.ByteArrayInputStream;
        r4.<init>(r13);
        r5 = new java.io.ByteArrayOutputStream;
        r5.<init>();
        r6 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r7 = new byte[r6];	 Catch:{ all -> 0x0065 }
        r0 = r1;
    L_0x0011:
        r2 = r6 - r0;
        r2 = r4.read(r7, r0, r2);	 Catch:{ all -> 0x0065 }
        if (r2 <= 0) goto L_0x0078;
    L_0x0019:
        if (r2 < r12) goto L_0x0076;
    L_0x001b:
        r8 = r2 + r0;
        r3 = r1;
    L_0x001e:
        r0 = r3 + 3;
        if (r0 > r8) goto L_0x0052;
    L_0x0022:
        r0 = m3889a(r7, r3);	 Catch:{ all -> 0x0065 }
        r2 = m3893d(r7, r3);	 Catch:{ all -> 0x0065 }
        r9 = m3891b(r7, r3);	 Catch:{ all -> 0x0065 }
        r10 = m3892c(r7, r3);	 Catch:{ all -> 0x0065 }
        r11 = f2058a;	 Catch:{ all -> 0x0065 }
        r0 = r11[r0];	 Catch:{ all -> 0x0065 }
        r5.write(r0);	 Catch:{ all -> 0x0065 }
        r0 = f2058a;	 Catch:{ all -> 0x0065 }
        r0 = r0[r2];	 Catch:{ all -> 0x0065 }
        r5.write(r0);	 Catch:{ all -> 0x0065 }
        r0 = f2058a;	 Catch:{ all -> 0x0065 }
        r0 = r0[r9];	 Catch:{ all -> 0x0065 }
        r5.write(r0);	 Catch:{ all -> 0x0065 }
        r0 = f2058a;	 Catch:{ all -> 0x0065 }
        r0 = r0[r10];	 Catch:{ all -> 0x0065 }
        r5.write(r0);	 Catch:{ all -> 0x0065 }
        r0 = r3 + 3;
        r3 = r0;
        goto L_0x001e;
    L_0x0052:
        r2 = r1;
    L_0x0053:
        if (r2 >= r12) goto L_0x0073;
    L_0x0055:
        r0 = r8 - r3;
        if (r2 >= r0) goto L_0x0071;
    L_0x0059:
        r0 = r3 + r2;
        r0 = r7[r0];	 Catch:{ IOException -> 0x0063 }
    L_0x005d:
        r7[r2] = r0;	 Catch:{ all -> 0x0065 }
        r0 = r2 + 1;
        r2 = r0;
        goto L_0x0053;
    L_0x0063:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0065 }
    L_0x0065:
        r0 = move-exception;
        if (r4 == 0) goto L_0x006b;
    L_0x0068:
        r4.close();	 Catch:{ IOException -> 0x010f }
    L_0x006b:
        if (r5 == 0) goto L_0x0070;
    L_0x006d:
        r5.close();	 Catch:{ IOException -> 0x0111 }
    L_0x0070:
        throw r0;
    L_0x0071:
        r0 = r1;
        goto L_0x005d;
    L_0x0073:
        r0 = r8 - r3;
        goto L_0x0011;
    L_0x0076:
        r0 = r0 + r2;
        goto L_0x0011;
    L_0x0078:
        switch(r0) {
            case 1: goto L_0x008a;
            case 2: goto L_0x00af;
            case 3: goto L_0x00d9;
            default: goto L_0x007b;
        };
    L_0x007b:
        r0 = r5.toByteArray();	 Catch:{ all -> 0x0065 }
        if (r4 == 0) goto L_0x0084;
    L_0x0081:
        r4.close();	 Catch:{ IOException -> 0x010b }
    L_0x0084:
        if (r5 == 0) goto L_0x0089;
    L_0x0086:
        r5.close();	 Catch:{ IOException -> 0x010d }
    L_0x0089:
        return r0;
    L_0x008a:
        r0 = f2058a;	 Catch:{ IOException -> 0x00ad }
        r1 = 0;
        r1 = m3889a(r7, r1);	 Catch:{ IOException -> 0x00ad }
        r0 = r0[r1];	 Catch:{ IOException -> 0x00ad }
        r5.write(r0);	 Catch:{ IOException -> 0x00ad }
        r0 = f2058a;	 Catch:{ IOException -> 0x00ad }
        r1 = 0;
        r1 = m3893d(r7, r1);	 Catch:{ IOException -> 0x00ad }
        r0 = r0[r1];	 Catch:{ IOException -> 0x00ad }
        r5.write(r0);	 Catch:{ IOException -> 0x00ad }
        r0 = 61;
        r5.write(r0);	 Catch:{ IOException -> 0x00ad }
        r0 = 61;
        r5.write(r0);	 Catch:{ IOException -> 0x00ad }
        goto L_0x007b;
    L_0x00ad:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0065 }
    L_0x00af:
        r0 = f2058a;	 Catch:{ all -> 0x0065 }
        r1 = 0;
        r1 = m3889a(r7, r1);	 Catch:{ all -> 0x0065 }
        r0 = r0[r1];	 Catch:{ all -> 0x0065 }
        r5.write(r0);	 Catch:{ all -> 0x0065 }
        r0 = f2058a;	 Catch:{ all -> 0x0065 }
        r1 = 0;
        r1 = m3893d(r7, r1);	 Catch:{ all -> 0x0065 }
        r0 = r0[r1];	 Catch:{ all -> 0x0065 }
        r5.write(r0);	 Catch:{ all -> 0x0065 }
        r0 = f2058a;	 Catch:{ all -> 0x0065 }
        r1 = 0;
        r1 = m3891b(r7, r1);	 Catch:{ all -> 0x0065 }
        r0 = r0[r1];	 Catch:{ all -> 0x0065 }
        r5.write(r0);	 Catch:{ all -> 0x0065 }
        r0 = 61;
        r5.write(r0);	 Catch:{ all -> 0x0065 }
        goto L_0x007b;
    L_0x00d9:
        r0 = f2058a;	 Catch:{ all -> 0x0065 }
        r1 = 0;
        r1 = m3889a(r7, r1);	 Catch:{ all -> 0x0065 }
        r0 = r0[r1];	 Catch:{ all -> 0x0065 }
        r5.write(r0);	 Catch:{ all -> 0x0065 }
        r0 = f2058a;	 Catch:{ all -> 0x0065 }
        r1 = 0;
        r1 = m3893d(r7, r1);	 Catch:{ all -> 0x0065 }
        r0 = r0[r1];	 Catch:{ all -> 0x0065 }
        r5.write(r0);	 Catch:{ all -> 0x0065 }
        r0 = f2058a;	 Catch:{ all -> 0x0065 }
        r1 = 0;
        r1 = m3891b(r7, r1);	 Catch:{ all -> 0x0065 }
        r0 = r0[r1];	 Catch:{ all -> 0x0065 }
        r5.write(r0);	 Catch:{ all -> 0x0065 }
        r0 = f2058a;	 Catch:{ all -> 0x0065 }
        r1 = 0;
        r1 = m3892c(r7, r1);	 Catch:{ all -> 0x0065 }
        r0 = r0[r1];	 Catch:{ all -> 0x0065 }
        r5.write(r0);	 Catch:{ all -> 0x0065 }
        goto L_0x007b;
    L_0x010b:
        r0 = move-exception;
        throw r0;
    L_0x010d:
        r0 = move-exception;
        throw r0;
    L_0x010f:
        r0 = move-exception;
        throw r0;
    L_0x0111:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.core.utils.fc.a(byte[]):byte[]");
    }

    /* renamed from: b */
    private static final int m3891b(byte[] bArr, int i) {
        return ((bArr[i + 1] & 15) << 2) | ((bArr[i + 2] & 192) >>> 6);
    }

    /* renamed from: c */
    private static final int m3892c(byte[] bArr, int i) {
        return bArr[i + 2] & 63;
    }

    /* renamed from: d */
    private static final int m3893d(byte[] bArr, int i) {
        return ((bArr[i] & 3) << 4) | ((bArr[i + 1] & 240) >>> 4);
    }
}
