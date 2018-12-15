package fr.pcsoft.wdjava.net.http;

import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.utils.C0808l;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* renamed from: fr.pcsoft.wdjava.net.http.h */
class C0985h implements C0983n {
    /* renamed from: z */
    private static final String[] f2800z = new String[]{C0985h.m7159z(C0985h.m7160z("/1")), C0985h.m7159z(C0985h.m7160z("\\|\u0004\u0001lfx\u0016\u0002z5u\u0011Nmür\u0001\u001eögt\u0006Nst1\u0007\u001a~ad\u0007Ns|\u0011N{p1\u0018\u000f?gt\u0005\u001bõatT&KAAZ")), C0985h.m7159z(C0985h.m7160z("]E >")), C0985h.m7159z(C0985h.m7160z("\u0018\u001b"))};
    /* renamed from: a */
    private HttpURLConnection f2801a = null;

    C0985h(HttpURLConnection httpURLConnection) {
        this.f2801a = httpURLConnection;
    }

    /* renamed from: z */
    private static String m7159z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 21;
                    break;
                case 1:
                    i2 = 17;
                    break;
                case 2:
                    i2 = 116;
                    break;
                case 3:
                    i2 = 110;
                    break;
                default:
                    i2 = 31;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7160z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 31);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public InputStream mo3270a() throws IOException {
        try {
            return this.f2801a != null ? this.f2801a.getInputStream() : null;
        } catch (IOException e) {
            throw e;
        }
    }

    /* renamed from: b */
    public int mo3271b() {
        int i = -1;
        try {
            if (this.f2801a != null) {
                i = this.f2801a.getResponseCode();
            }
        } catch (IOException e) {
        }
        return i;
    }

    /* renamed from: c */
    public String mo3272c() {
        try {
            return this.f2801a != null ? this.f2801a.getContentType() : "";
        } catch (NullPointerException e) {
            throw e;
        }
    }

    /* renamed from: d */
    public void mo3273d() {
        if (this.f2801a != null) {
            try {
                InputStream inputStream = this.f2801a.getInputStream();
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw e;
            } catch (IOException e2) {
            }
            this.f2801a.disconnect();
        }
    }

    /* renamed from: e */
    public int mo3274e() {
        try {
            return this.f2801a != null ? this.f2801a.getContentLength() : 0;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    /* renamed from: f */
    public String mo3275f() {
        String headerFieldKey;
        StringBuffer stringBuffer = new StringBuffer("");
        if (this.f2801a != null) {
            String str = "";
            str = "";
            int i = 0;
            while (true) {
                headerFieldKey = this.f2801a.getHeaderFieldKey(i);
                if (headerFieldKey == null) {
                    headerFieldKey = this.f2801a.getHeaderField(i);
                    if (headerFieldKey == null) {
                        break;
                    }
                    if (i > 0) {
                        try {
                            stringBuffer.append(f2800z[3]);
                        } catch (NullPointerException e) {
                            throw e;
                        }
                    }
                    stringBuffer.append(headerFieldKey);
                } else {
                    String headerField = this.f2801a.getHeaderField(i);
                    if (i > 0) {
                        try {
                            stringBuffer.append(f2800z[3]);
                        } catch (NullPointerException e2) {
                            throw e2;
                        }
                    }
                    stringBuffer.append(headerFieldKey).append(f2800z[0]).append(headerField);
                }
                i++;
            }
        }
        headerFieldKey = stringBuffer.toString();
        if (!headerFieldKey.startsWith(f2800z[2])) {
            try {
                str = this.f2801a.getHeaderField(null);
            } catch (Exception e3) {
                C0691a.m2857a(f2800z[1], e3);
                str = null;
            }
            if (!C0808l.m4053k(str)) {
                stringBuffer.insert(0, str + f2800z[3]);
                return stringBuffer.toString();
            }
        }
        return headerFieldKey;
    }

    /* renamed from: g */
    public InputStream mo3276g() throws IOException {
        try {
            return this.f2801a != null ? this.f2801a.getErrorStream() : null;
        } catch (IOException e) {
            throw e;
        }
    }

    /* renamed from: h */
    public String mo3277h() {
        try {
            return this.f2801a != null ? this.f2801a.getResponseMessage() : "";
        } catch (IOException e) {
            return "";
        }
    }
}
