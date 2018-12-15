package fr.pcsoft.wdjava.file;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: fr.pcsoft.wdjava.file.b */
public class C0885b {
    /* renamed from: z */
    private static final String f2376z = C0885b.m6203z(C0885b.m6204z("<,"));
    /* renamed from: a */
    private Integer f2377a = null;
    /* renamed from: b */
    private String f2378b = null;
    /* renamed from: c */
    private String f2379c = "";
    /* renamed from: d */
    private boolean f2380d = false;
    /* renamed from: e */
    private RandomAccessFile f2381e = null;

    public C0885b(File file, Integer num, int i) throws IOException {
        this.f2379c = file.getAbsolutePath();
        this.f2377a = num;
        if (i == 0) {
            this.f2381e = new RandomAccessFile(file, "r");
        } else {
            this.f2381e = new RandomAccessFile(file, f2376z);
        }
        C0895m b = C0897o.m6256b(file);
        if (b != null) {
            try {
                this.f2378b = b.m6228c();
            } catch (IOException e) {
                throw e;
            }
        }
    }

    /* renamed from: z */
    private static String m6203z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 78;
                    break;
                case 1:
                    i2 = 91;
                    break;
                case 2:
                    i2 = 114;
                    break;
                case 3:
                    i2 = 21;
                    break;
                default:
                    i2 = 44;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m6204z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 44);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public final String m6205a() {
        return this.f2378b;
    }

    /* renamed from: a */
    public final void m6206a(boolean z) {
        this.f2380d = z;
    }

    /* renamed from: b */
    public final void m6207b() throws IOException {
        RandomAccessFile c = m6208c();
        if (c != null) {
            try {
                c.close();
            } catch (Throwable th) {
                try {
                    if (this.f2380d) {
                        new File(this.f2379c).delete();
                    }
                    m6211f();
                } catch (IOException e) {
                    throw e;
                }
            }
        }
        try {
            if (this.f2380d) {
                new File(this.f2379c).delete();
            }
            m6211f();
        } catch (IOException e2) {
            throw e2;
        }
    }

    /* renamed from: c */
    public final RandomAccessFile m6208c() {
        return this.f2381e;
    }

    /* renamed from: d */
    public final Integer m6209d() {
        return this.f2377a;
    }

    /* renamed from: e */
    public final String m6210e() {
        return this.f2379c;
    }

    /* renamed from: f */
    public void m6211f() {
        this.f2379c = null;
        this.f2377a = null;
        this.f2381e = null;
        this.f2378b = null;
    }

    public String toString() {
        return this.f2379c;
    }
}
