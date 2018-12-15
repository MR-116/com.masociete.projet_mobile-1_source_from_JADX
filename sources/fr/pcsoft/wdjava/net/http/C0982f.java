package fr.pcsoft.wdjava.net.http;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: fr.pcsoft.wdjava.net.http.f */
class C0982f extends C0979c {
    /* renamed from: z */
    private static final String[] f2795z = new String[]{C0982f.m7134z(C0982f.m7135z("EM QEAD9L\u0004")), C0982f.m7134z(C0982f.m7135z("\tJ1Q")), C0982f.m7134z(C0982f.m7135z("~],U\u001fE\b+Q\u0018TI5\u0005\u0007PQxK\u0005E\b:@J_]4I")), C0982f.m7134z(C0982f.m7135z("eM QJ\\I!\u0005\u0004^\\xG\u000f\u0011F-I\u0006")), C0982f.m7134z(C0982f.m7135z("d{ud9ra\u0011"))};
    /* renamed from: d */
    private final byte[] f2796d;
    /* renamed from: e */
    private final Charset f2797e;

    public C0982f(String str) throws UnsupportedEncodingException {
        this(str, f2795z[0], null);
    }

    public C0982f(String str, String str2, Charset charset) throws UnsupportedEncodingException {
        super(str2);
        if (str == null) {
            throw new IllegalArgumentException(f2795z[3]);
        }
        if (charset == null) {
            charset = Charset.forName(f2795z[4]);
        }
        this.f2796d = str.getBytes(charset.name());
        this.f2797e = charset;
    }

    public C0982f(String str, Charset charset) throws UnsupportedEncodingException {
        this(str, f2795z[0], charset);
    }

    /* renamed from: z */
    private static String m7134z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 49;
                    break;
                case 1:
                    i2 = 40;
                    break;
                case 2:
                    i2 = 88;
                    break;
                case 3:
                    i2 = 37;
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
    private static char[] m7135z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 106);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public String mo3265a() {
        return null;
    }

    /* renamed from: a */
    public void mo3266a(OutputStream outputStream) throws IOException {
        if (outputStream == null) {
            try {
                throw new IllegalArgumentException(f2795z[2]);
            } catch (IOException e) {
                throw e;
            }
        }
        InputStream byteArrayInputStream = new ByteArrayInputStream(this.f2796d);
        byte[] bArr = new byte[4096];
        while (true) {
            int read = byteArrayInputStream.read(bArr);
            if (read != -1) {
                try {
                    outputStream.write(bArr, 0, read);
                } catch (IOException e2) {
                    throw e2;
                }
            }
            outputStream.flush();
            return;
        }
    }

    /* renamed from: b */
    public long mo3267b() {
        return (long) this.f2796d.length;
    }

    /* renamed from: c */
    public String mo3268c() {
        return this.f2797e.name();
    }

    /* renamed from: f */
    public String mo3269f() {
        return f2795z[1];
    }
}
