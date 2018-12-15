package fr.pcsoft.wdjava.net.http;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.util.ByteArrayBuffer;

/* renamed from: fr.pcsoft.wdjava.net.http.m */
class C0989m {
    /* renamed from: a */
    private static final ByteArrayBuffer f2805a = C0989m.m7172a(db.f2786d, C0989m.m7179z(C0989m.m7180z("\u001d\u001c")));
    /* renamed from: c */
    private static final ByteArrayBuffer f2806c = C0989m.m7172a(db.f2786d, C0989m.m7179z(C0989m.m7180z("\n\u0011")));
    /* renamed from: f */
    private static final ByteArrayBuffer f2807f = C0989m.m7172a(db.f2786d, C0989m.m7179z(C0989m.m7180z("=;")));
    /* renamed from: z */
    private static final String[] f2808z = new String[]{C0989m.m7179z(C0989m.m7180z("}Dr`D@Pl`\rCD|`T@T>yLI\u0011p{Y\u0010S{4CE]r")), C0989m.m7179z(C0989m.m7180z("}Dr`D@Pl`\rR^kzIQCg4@QH>zBD\u0011|q\r^Drx")), C0989m.m7179z(C0989m.m7180z("s^p`H^E3@T@T")), C0989m.m7179z(C0989m.m7180z("s^p`H^E3PDCAqgDDXqz"))};
    /* renamed from: b */
    private final Charset f2809b;
    /* renamed from: d */
    private final String f2810d;
    /* renamed from: e */
    private final C0993r f2811e;
    /* renamed from: g */
    private final List<C0991p> f2812g;
    /* renamed from: h */
    private final String f2813h;

    public C0989m(String str, Charset charset, String str2, C0993r c0993r) {
        if (str == null) {
            throw new IllegalArgumentException(f2808z[0]);
        } else if (str2 == null) {
            try {
                throw new IllegalArgumentException(f2808z[1]);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } else {
            try {
                this.f2810d = str;
                if (charset == null) {
                    charset = db.f2786d;
                }
                this.f2809b = charset;
                this.f2813h = str2;
                this.f2812g = new ArrayList();
                this.f2811e = c0993r;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
    }

    /* renamed from: a */
    private static ByteArrayBuffer m7172a(Charset charset, String str) {
        ByteBuffer encode = charset.encode(CharBuffer.wrap(str));
        ByteArrayBuffer byteArrayBuffer = new ByteArrayBuffer(encode.remaining());
        byteArrayBuffer.append(encode.array(), encode.position(), encode.remaining());
        return byteArrayBuffer;
    }

    /* renamed from: a */
    private void m7173a(C0993r c0993r, OutputStream outputStream, boolean z) throws IOException {
        ByteArrayBuffer a = C0989m.m7172a(this.f2809b, m7185c());
        for (C0991p c0991p : this.f2812g) {
            C0989m.m7178a(f2805a, outputStream);
            C0989m.m7178a(a, outputStream);
            C0989m.m7178a(f2807f, outputStream);
            eb c = c0991p.m7230c();
            switch (C0988l.f2804a[c0993r.ordinal()]) {
                case 1:
                    Iterator it = c.iterator();
                    while (it.hasNext()) {
                        C0989m.m7174a((C1000y) it.next(), outputStream);
                    }
                    break;
                case 2:
                    C0989m.m7175a(c0991p.m7230c().m7132a(f2808z[3]), this.f2809b, outputStream);
                    if (c0991p.m7228b().mo3265a() != null) {
                        C0989m.m7175a(c0991p.m7230c().m7132a(f2808z[2]), this.f2809b, outputStream);
                        break;
                    }
                    break;
            }
            try {
                C0989m.m7178a(f2807f, outputStream);
                if (z) {
                    c0991p.m7228b().mo3266a(outputStream);
                }
                C0989m.m7178a(f2807f, outputStream);
            } catch (IOException e) {
                throw e;
            }
        }
        C0989m.m7178a(f2805a, outputStream);
        C0989m.m7178a(a, outputStream);
        C0989m.m7178a(f2805a, outputStream);
        C0989m.m7178a(f2807f, outputStream);
    }

    /* renamed from: a */
    private static void m7174a(C1000y c1000y, OutputStream outputStream) throws IOException {
        C0989m.m7176a(c1000y.m7246b(), outputStream);
        C0989m.m7178a(f2806c, outputStream);
        C0989m.m7176a(c1000y.m7245a(), outputStream);
        C0989m.m7178a(f2807f, outputStream);
    }

    /* renamed from: a */
    private static void m7175a(C1000y c1000y, Charset charset, OutputStream outputStream) throws IOException {
        C0989m.m7177a(c1000y.m7246b(), charset, outputStream);
        C0989m.m7178a(f2806c, outputStream);
        C0989m.m7177a(c1000y.m7245a(), charset, outputStream);
        C0989m.m7178a(f2807f, outputStream);
    }

    /* renamed from: a */
    private static void m7176a(String str, OutputStream outputStream) throws IOException {
        C0989m.m7178a(C0989m.m7172a(db.f2786d, str), outputStream);
    }

    /* renamed from: a */
    private static void m7177a(String str, Charset charset, OutputStream outputStream) throws IOException {
        C0989m.m7178a(C0989m.m7172a(charset, str), outputStream);
    }

    /* renamed from: a */
    private static void m7178a(ByteArrayBuffer byteArrayBuffer, OutputStream outputStream) throws IOException {
        outputStream.write(byteArrayBuffer.buffer(), 0, byteArrayBuffer.length());
    }

    /* renamed from: z */
    private static String m7179z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 48;
                    break;
                case 1:
                    i2 = 49;
                    break;
                case 2:
                    i2 = 30;
                    break;
                case 3:
                    i2 = 20;
                    break;
                default:
                    i2 = 45;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7180z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 45);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public long m7181a() {
        long j = 0;
        for (C0991p b : this.f2812g) {
            long b2 = b.m7228b().mo3267b();
            if (b2 < 0) {
                return -1;
            }
            j = b2 + j;
        }
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            m7173a(this.f2811e, byteArrayOutputStream, false);
            return ((long) byteArrayOutputStream.toByteArray().length) + j;
        } catch (IOException e) {
            return -1;
        }
    }

    /* renamed from: a */
    public void m7182a(C0991p c0991p) {
        if (c0991p != null) {
            this.f2812g.add(c0991p);
        }
    }

    /* renamed from: a */
    public void m7183a(OutputStream outputStream) throws IOException {
        m7173a(this.f2811e, outputStream, true);
    }

    /* renamed from: b */
    public List<C0991p> m7184b() {
        return this.f2812g;
    }

    /* renamed from: c */
    public String m7185c() {
        return this.f2813h;
    }
}
