package fr.pcsoft.wdjava.file;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

/* renamed from: fr.pcsoft.wdjava.file.k */
public class C0893k extends InputStream {
    /* renamed from: a */
    private final C0895m f2389a;
    /* renamed from: b */
    private final PushbackInputStream f2390b;
    /* renamed from: c */
    private boolean f2391c = false;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0893k(java.io.InputStream r5) throws java.lang.NullPointerException, java.io.IOException {
        /*
        r4 = this;
        r0 = 0;
        r4.<init>();
        r4.f2391c = r0;
        r0 = new java.io.PushbackInputStream;
        r1 = fr.pcsoft.wdjava.file.C0895m.m6225d();
        r0.<init>(r5, r1);
        r4.f2390b = r0;
        r0 = fr.pcsoft.wdjava.file.C0895m.m6225d();
        r0 = new byte[r0];
        r1 = r4.f2390b;
        r1 = r1.read(r0);
        switch(r1) {
            case 2: goto L_0x0059;
            case 3: goto L_0x004a;
            case 4: goto L_0x002c;
            default: goto L_0x0020;
        };
    L_0x0020:
        r2 = 0;
        r4.f2389a = r2;
    L_0x0023:
        if (r1 <= 0) goto L_0x002b;
    L_0x0025:
        r2 = r4.f2390b;	 Catch:{ NullPointerException -> 0x0077 }
        r3 = 0;
        r2.unread(r0, r3, r1);	 Catch:{ NullPointerException -> 0x0077 }
    L_0x002b:
        return;
    L_0x002c:
        r2 = fr.pcsoft.wdjava.file.C0895m.f2396f;	 Catch:{ NullPointerException -> 0x0039 }
        r2 = r2.m6222a(r0);	 Catch:{ NullPointerException -> 0x0039 }
        if (r2 == 0) goto L_0x003b;
    L_0x0034:
        r2 = fr.pcsoft.wdjava.file.C0895m.f2396f;	 Catch:{ NullPointerException -> 0x0039 }
        r4.f2389a = r2;	 Catch:{ NullPointerException -> 0x0039 }
        goto L_0x0023;
    L_0x0039:
        r0 = move-exception;
        throw r0;
    L_0x003b:
        r2 = fr.pcsoft.wdjava.file.C0895m.f2394d;	 Catch:{ NullPointerException -> 0x0048 }
        r2 = r2.m6222a(r0);	 Catch:{ NullPointerException -> 0x0048 }
        if (r2 == 0) goto L_0x004a;
    L_0x0043:
        r2 = fr.pcsoft.wdjava.file.C0895m.f2394d;	 Catch:{ NullPointerException -> 0x0048 }
        r4.f2389a = r2;	 Catch:{ NullPointerException -> 0x0048 }
        goto L_0x0023;
    L_0x0048:
        r0 = move-exception;
        throw r0;
    L_0x004a:
        r2 = fr.pcsoft.wdjava.file.C0895m.f2393c;	 Catch:{ NullPointerException -> 0x0057 }
        r2 = r2.m6222a(r0);	 Catch:{ NullPointerException -> 0x0057 }
        if (r2 == 0) goto L_0x0059;
    L_0x0052:
        r2 = fr.pcsoft.wdjava.file.C0895m.f2393c;	 Catch:{ NullPointerException -> 0x0057 }
        r4.f2389a = r2;	 Catch:{ NullPointerException -> 0x0057 }
        goto L_0x0023;
    L_0x0057:
        r0 = move-exception;
        throw r0;
    L_0x0059:
        r2 = fr.pcsoft.wdjava.file.C0895m.f2397g;	 Catch:{ NullPointerException -> 0x0066 }
        r2 = r2.m6222a(r0);	 Catch:{ NullPointerException -> 0x0066 }
        if (r2 == 0) goto L_0x0068;
    L_0x0061:
        r2 = fr.pcsoft.wdjava.file.C0895m.f2397g;	 Catch:{ NullPointerException -> 0x0066 }
        r4.f2389a = r2;	 Catch:{ NullPointerException -> 0x0066 }
        goto L_0x0023;
    L_0x0066:
        r0 = move-exception;
        throw r0;
    L_0x0068:
        r2 = fr.pcsoft.wdjava.file.C0895m.f2394d;	 Catch:{ NullPointerException -> 0x0075 }
        r2 = r2.m6222a(r0);	 Catch:{ NullPointerException -> 0x0075 }
        if (r2 == 0) goto L_0x0020;
    L_0x0070:
        r2 = fr.pcsoft.wdjava.file.C0895m.f2395e;	 Catch:{ NullPointerException -> 0x0075 }
        r4.f2389a = r2;	 Catch:{ NullPointerException -> 0x0075 }
        goto L_0x0023;
    L_0x0075:
        r0 = move-exception;
        throw r0;
    L_0x0077:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.file.k.<init>(java.io.InputStream):void");
    }

    /* renamed from: a */
    public final C0893k m6219a() throws IOException {
        try {
            if (!this.f2391c) {
                if (this.f2389a != null) {
                    this.f2390b.skip((long) this.f2389a.m6223b().length);
                    this.f2391c = true;
                }
            }
            return this;
        } catch (IOException e) {
            throw e;
        } catch (IOException e2) {
            throw e2;
        }
    }

    public int available() throws IOException {
        return this.f2390b.available();
    }

    /* renamed from: b */
    public final C0895m m6220b() {
        return this.f2389a;
    }

    public void close() throws IOException {
        this.f2390b.close();
    }

    public synchronized void mark(int i) {
        this.f2390b.mark(i);
    }

    public boolean markSupported() {
        return this.f2390b.markSupported();
    }

    public int read() throws IOException {
        return this.f2390b.read();
    }

    public int read(byte[] bArr) throws IOException, NullPointerException {
        return this.f2390b.read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) throws IOException, NullPointerException {
        return this.f2390b.read(bArr, i, i2);
    }

    public synchronized void reset() throws IOException {
        this.f2390b.reset();
    }

    public long skip(long j) throws IOException {
        return this.f2390b.skip(j);
    }
}
