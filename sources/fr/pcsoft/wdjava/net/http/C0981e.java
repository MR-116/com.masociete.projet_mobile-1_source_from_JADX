package fr.pcsoft.wdjava.net.http;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: fr.pcsoft.wdjava.net.http.e */
class C0981e extends C0979c {
    /* renamed from: z */
    private static final String[] f2789z = new String[]{C0981e.m7125z(C0981e.m7126z("\u0017Ro+k<Zzn%>O#,.qUv\"'")), C0981e.m7125z(C0981e.m7126z("3Rm/9(")), C0981e.m7125z(C0981e.m7126z("\u001eNw>>%\u001bp:94Znn&0B# $%\u001ba+k?No\""))};
    /* renamed from: d */
    private final File f2790d;
    /* renamed from: e */
    private final String f2791e;
    /* renamed from: f */
    private final String f2792f;
    final C0994s this$0;

    public C0981e(C0994s c0994s, File file, String str) {
        this(c0994s, file, str, null);
    }

    public C0981e(C0994s c0994s, File file, String str, String str2) {
        this(c0994s, file, null, str, str2);
    }

    public C0981e(C0994s c0994s, File file, String str, String str2, String str3) {
        this.this$0 = c0994s;
        super(str2);
        if (file == null) {
            throw new IllegalArgumentException(f2789z[0]);
        }
        try {
            this.f2790d = file;
            if (str != null) {
                this.f2791e = str;
            } else {
                this.f2791e = file.getName();
            }
            this.f2792f = str3;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* renamed from: z */
    private static String m7125z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 81;
                    break;
                case 1:
                    i2 = 59;
                    break;
                case 2:
                    i2 = 3;
                    break;
                case 3:
                    i2 = 78;
                    break;
                default:
                    i2 = 75;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7126z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 75);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public String mo3265a() {
        return this.f2791e;
    }

    /* renamed from: a */
    public void mo3266a(OutputStream outputStream) throws IOException {
        if (outputStream == null) {
            try {
                throw new IllegalArgumentException(f2789z[2]);
            } catch (IOException e) {
                throw e;
            }
        }
        InputStream fileInputStream = new FileInputStream(this.f2790d);
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                } else {
                    outputStream.flush();
                    fileInputStream.close();
                    return;
                }
            }
        } catch (IOException e2) {
            throw e2;
        } catch (Throwable th) {
            fileInputStream.close();
        }
    }

    /* renamed from: b */
    public long mo3267b() {
        return this.f2790d.length();
    }

    /* renamed from: c */
    public String mo3268c() {
        return this.f2792f;
    }

    /* renamed from: f */
    public String mo3269f() {
        return f2789z[1];
    }
}
