package fr.pcsoft.wdjava.net.http;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.types.WDChaine;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Random;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.message.BasicHeader;

/* renamed from: fr.pcsoft.wdjava.net.http.s */
public class C0994s implements HttpEntity {
    /* renamed from: b */
    private static final char[] f2843b = C0994s.m7234z(C0994s.m7235z("\u001f5\u001eOa\u0006_\u0019Jj\u000bZN\u001f1V\u000fI\u001a:[\u0000D\u0011?\\\u0005_\f A\u001eZ\u000b%J\u0013U<\u0010q.j;\u0015z#e6\u001e$`-\u0003`9{(\u0004e2v'")).toCharArray();
    /* renamed from: z */
    private static final String[] f2844z = new String[]{C0994s.m7234z(C0994s.m7235z("a\u001e]\u00183_\u0003A\u001arW\u0004[\u0014&KJK\u00127AJA\u0012&\u0012\u0003B\r>W\u0007J\u0013&\u0012IL\u0012<A\u001fB\u0018\u0011]\u0004[\u0018<FB\u0006")), C0994s.m7234z(C0994s.m7235z("\u001fC\t;B\u000b]\trT\u0005]\u0010rW\u0004[\u0014&KJK\u00127AJA\u0012&\u0012\u0003B\r>W\u0007J\u0013&\u0012IH\u0018&q\u0005A\t7\\\u001e\u0007T")), C0994s.m7234z(C0994s.m7235z("q\u0005A\t7\\\u001e\u0002)+B\u000f")), C0994s.m7234z(C0994s.m7235z("T\u0005]\u0010V\u000b[\u001c")), C0994s.m7234z(C0994s.m7235z("\tJL\u00153@\u0019J\to")), C0994s.m7234z(C0994s.m7235z("_\u001fC\t;B\u000b]\t}T\u0005]\u0010V\u000b[\u001ci\u0012\b@\b<V\u000b]\u0004o"))};
    /* renamed from: a */
    private volatile boolean f2845a;
    /* renamed from: c */
    private final Header f2846c;
    /* renamed from: d */
    private long f2847d;
    /* renamed from: e */
    private final C0989m f2848e;

    public C0994s() {
        this(C0993r.STRICT, null, null);
    }

    public C0994s(C0993r c0993r) {
        this(c0993r, null, null);
    }

    public C0994s(C0993r c0993r, String str, Charset charset) {
        if (str == null) {
            str = m7236a();
        }
        if (c0993r == null) {
            c0993r = C0993r.STRICT;
        }
        this.f2848e = new C0989m(f2844z[3], charset, str, c0993r);
        this.f2846c = new BasicHeader(f2844z[2], m7237a(str, charset));
        this.f2845a = true;
    }

    /* renamed from: z */
    private static String m7234z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 50;
                    break;
                case 1:
                    i2 = 106;
                    break;
                case 2:
                    i2 = 47;
                    break;
                case 3:
                    i2 = 125;
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
    private static char[] m7235z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 82);
        }
        return toCharArray;
    }

    /* renamed from: a */
    protected String m7236a() {
        StringBuilder stringBuilder = new StringBuilder();
        Random random = new Random();
        int nextInt = random.nextInt(11) + 30;
        int i = 0;
        while (i < nextInt) {
            try {
                stringBuilder.append(f2843b[random.nextInt(f2843b.length)]);
                i++;
            } catch (UnsupportedOperationException e) {
                throw e;
            }
        }
        return stringBuilder.toString();
    }

    /* renamed from: a */
    protected String m7237a(String str, Charset charset) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            stringBuilder.append(f2844z[5]);
            stringBuilder.append(str);
            if (charset != null) {
                stringBuilder.append(f2844z[4]);
                stringBuilder.append(charset.name());
            }
            return stringBuilder.toString();
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    /* renamed from: a */
    public void m7238a(C0991p c0991p) {
        this.f2848e.m7182a(c0991p);
        this.f2845a = true;
    }

    /* renamed from: a */
    public void m7239a(String str, WDObjet wDObjet) throws IOException {
        try {
            if (wDObjet.isMemoBinaire()) {
                m7240a(str, new C0980d(this, wDObjet.getDonneeBinaire(), null));
                return;
            }
            WDChaine wDChaine = (WDChaine) wDObjet.checkType(WDChaine.class);
            if (wDChaine != null) {
                try {
                    m7240a(str, new C0982f(wDChaine.getString(), Charset.forName(wDChaine.mo2547d())));
                    return;
                } catch (IOException e) {
                    throw e;
                }
            }
            m7240a(str, new C0982f(wDObjet.getString()));
        } catch (IOException e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    public void m7240a(String str, C0978b c0978b) {
        m7238a(new C0991p(str, c0978b));
    }

    /* renamed from: a */
    public void m7241a(String str, C0997v c0997v) throws IOException {
        m7240a(str, new C0981e(this, c0997v, c0997v.m7242a()));
    }

    public void consumeContent() throws IOException, UnsupportedOperationException {
        try {
            if (isStreaming()) {
                throw new UnsupportedOperationException(f2844z[0]);
            }
        } catch (IOException e) {
            throw e;
        }
    }

    public InputStream getContent() throws IOException, UnsupportedOperationException {
        throw new UnsupportedOperationException(f2844z[1]);
    }

    public Header getContentEncoding() {
        return null;
    }

    public long getContentLength() {
        try {
            if (this.f2845a) {
                this.f2847d = this.f2848e.m7181a();
                this.f2845a = false;
            }
            return this.f2847d;
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    public Header getContentType() {
        return this.f2846c;
    }

    public boolean isChunked() {
        try {
            return !isRepeatable();
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    public boolean isRepeatable() {
        for (C0991p b : this.f2848e.m7184b()) {
            try {
                if (b.m7228b().mo3267b() < 0) {
                    return false;
                }
            } catch (UnsupportedOperationException e) {
                throw e;
            }
        }
        return true;
    }

    public boolean isStreaming() {
        try {
            return !isRepeatable();
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        this.f2848e.m7183a(outputStream);
    }
}
