package fr.pcsoft.wdjava.net.http;

import java.io.IOException;
import java.io.InputStream;
import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;

/* renamed from: fr.pcsoft.wdjava.net.http.g */
final class C0984g implements C0983n {
    /* renamed from: z */
    private static final String[] f2798z = new String[]{C0984g.m7149z(C0984g.m7150z("I\u0000")), C0984g.m7149z(C0984g.m7150z("~*"))};
    /* renamed from: a */
    private HttpResponse f2799a = null;

    public C0984g(HttpResponse httpResponse) {
        this.f2799a = httpResponse;
    }

    /* renamed from: z */
    private static String m7149z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 115;
                    break;
                case 1:
                    i2 = 32;
                    break;
                case 2:
                    i2 = 84;
                    break;
                case 3:
                    i2 = 74;
                    break;
                default:
                    i2 = 70;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7150z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 70);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public InputStream mo3270a() throws IOException {
        InputStream inputStream = null;
        if (this.f2799a != null) {
            HttpEntity entity = this.f2799a.getEntity();
            if (entity != null) {
                try {
                    inputStream = entity.getContent();
                } catch (IOException e) {
                    throw e;
                }
            }
        }
        return inputStream;
    }

    /* renamed from: b */
    public int mo3271b() {
        StatusLine statusLine = this.f2799a.getStatusLine();
        return statusLine != null ? statusLine.getStatusCode() : -1;
    }

    /* renamed from: c */
    public String mo3272c() {
        if (this.f2799a == null) {
            return "";
        }
        HttpEntity entity = this.f2799a.getEntity();
        Header contentType = entity != null ? entity.getContentType() : null;
        return contentType != null ? contentType.getValue() : "";
    }

    /* renamed from: d */
    public void mo3273d() {
        if (this.f2799a != null) {
            try {
                HttpEntity entity = this.f2799a.getEntity();
                if (entity != null) {
                    entity.consumeContent();
                }
            } catch (IOException e) {
                throw e;
            } catch (IOException e2) {
            }
            this.f2799a = null;
        }
    }

    /* renamed from: e */
    public int mo3274e() {
        HttpEntity entity = this.f2799a.getEntity();
        return (int) (entity != null ? entity.getContentLength() : 0);
    }

    /* renamed from: f */
    public String mo3275f() {
        StringBuffer stringBuffer = new StringBuffer("");
        if (this.f2799a != null) {
            int i;
            StatusLine statusLine = this.f2799a.getStatusLine();
            if (statusLine != null) {
                stringBuffer.append(statusLine);
                i = 1;
            } else {
                i = 0;
            }
            HeaderIterator headerIterator = this.f2799a.headerIterator();
            while (headerIterator.hasNext()) {
                if (i > 0) {
                    stringBuffer.append(f2798z[1]);
                }
                Header nextHeader = headerIterator.nextHeader();
                stringBuffer.append(nextHeader.getName()).append(f2798z[0]).append(nextHeader.getValue());
                i++;
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: g */
    public InputStream mo3276g() throws IOException {
        return mo3270a();
    }

    /* renamed from: h */
    public String mo3277h() {
        StatusLine statusLine = this.f2799a.getStatusLine();
        return statusLine != null ? statusLine.getReasonPhrase() : "";
    }
}
