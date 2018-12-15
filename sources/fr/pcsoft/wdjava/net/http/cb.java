package fr.pcsoft.wdjava.net.http;

import android.webkit.URLUtil;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.net.C1011t;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpVersion;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;

public class cb extends DefaultHttpClient {
    /* renamed from: z */
    private static final String[] f2756z = new String[]{m7067z(m7068z("\u001e\u0017pH\r\n\tp")), m7067z(m7068z("\u0003\u0010aJM\u0019\u000b`N\u0006E\u0000p\\\u0002\u001e\ba\u0017\u0013\u0019\u000bmC")), m7067z(m7068z("\u001b\u0005fI\u0014\u0004\u0016q")), m7067z(m7068z("\u0003\u0010aJM\u001e\u0017pH\u0002\f\u0001{N")), m7067z(m7068z("\"7Z\u0017[SQ,\u0017R")), m7067z(m7068z(".\u0016g_\u0016\u0019DqO\u0011\n\na\u001a\u000fL\u0005fI\f\b\u0005aS\f\u0005Dq_\u0010K\u0014tH\u0002\u0006aH\u0006\u0018Dõ\u001a\u000f\nDg_\u0012\u001ea_M")), m7067z(m7068z("\u001e\u0010s\u0017[")), m7067z(m7068z("(\u000b{N\u0006\u0005\u00108n\u001a\u001b\u0001")), m7067z(m7068z(".\u0016g_\u0016\u0019DqO\u0011\n\na\u001a\u000fL\u0005U\u0016\u001fDqOC\u001b\u0005g[\u000e\u0010g_CDy[C\u0019\u0001dO\u001f\u00015r7?4;")), m7067z(m7068z("\n\u0014eV\n\b\u0005aS\f\u0005Km\u0017\u0014\u001c\u00138\\\f\u0019\t8O\u0011\u0007\u0001{Y\f\u000f\u0001q")), m7067z(m7068z("\u0003\u0010aJYDK")), m7067z(m7068z(".\u0016g_\u0016\u0019DqO\u0011\n\na\u001a\u000fL\u0005U\u0016\u001fDqOC\r\rvR\n\u000e\u00165ÚC\u0007\u00055H\u0006\u001a\u0011ÿN\u0006K,An3E")), m7067z(m7068z("\u0003\u0010aJ")), m7067z(m7068z("\u0003\u0010aJ\u0010"))};

    protected cb(ClientConnectionManager clientConnectionManager, HttpParams httpParams) {
        super(clientConnectionManager, httpParams);
    }

    private cb(HttpParams httpParams) {
        super(httpParams);
    }

    /* renamed from: a */
    public static final cb m7063a(boolean z) {
        HttpParams a = m7065a();
        cb cbVar = z ? new cb(m7064a(a), a) : new cb(a);
        C0976a f = C0990o.m7217f();
        if (f != null) {
            if (!C0808l.m4053k(f.f2772a)) {
                cbVar.getCredentialsProvider().setCredentials(new AuthScope(f.f2774c, f.f2773b), new UsernamePasswordCredentials(f2756z[0], f2756z[2]));
            }
            cbVar.getParams().setParameter(f2756z[1], new HttpHost(f.f2774c, f.f2773b));
        }
        return cbVar;
    }

    /* renamed from: a */
    protected static final ClientConnectionManager m7064a(HttpParams httpParams) {
        SchemeRegistry schemeRegistry = new SchemeRegistry();
        schemeRegistry.register(new Scheme(f2756z[12], PlainSocketFactory.getSocketFactory(), 80));
        schemeRegistry.register(new Scheme(f2756z[13], SSLSocketFactory.getSocketFactory(), 443));
        return new ThreadSafeClientConnManager(httpParams, schemeRegistry);
    }

    /* renamed from: a */
    protected static final HttpParams m7065a() {
        HttpParams basicHttpParams = new BasicHttpParams();
        HttpProtocolParams.setVersion(basicHttpParams, HttpVersion.HTTP_1_1);
        HttpProtocolParams.setContentCharset(basicHttpParams, f2756z[4]);
        HttpProtocolParams.setUseExpectContinue(basicHttpParams, false);
        HttpProtocolParams.setUserAgent(basicHttpParams, C0990o.f2830q);
        ConnManagerParams.setTimeout(basicHttpParams, 1000);
        int a = C0990o.m7186a();
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, a);
        HttpConnectionParams.setSoTimeout(basicHttpParams, a);
        HttpConnectionParams.setSocketBufferSize(basicHttpParams, 8192);
        HttpConnectionParams.setStaleCheckingEnabled(basicHttpParams, false);
        HttpClientParams.setRedirecting(basicHttpParams, false);
        return basicHttpParams;
    }

    /* renamed from: a */
    private final void m7066a(HttpRequest httpRequest, String str) {
        for (String str2 : C0808l.m4055m(str)) {
            int indexOf = str2.indexOf(58);
            if (indexOf > 0) {
                httpRequest.addHeader(str2.substring(0, indexOf), str2.substring(indexOf + 1));
            }
        }
    }

    /* renamed from: z */
    private static String m7067z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 107;
                    break;
                case 1:
                    i2 = 100;
                    break;
                case 2:
                    i2 = 21;
                    break;
                case 3:
                    i2 = 58;
                    break;
                default:
                    i2 = 99;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7068z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 99);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public final C0983n m7069a(WDHTTPForm wDHTTPForm, String str, int i, String str2, String str3) throws C1011t {
        HttpRequest httpGet;
        Object obj;
        Iterator paramIterator;
        StringBuilder stringBuilder;
        String str4;
        WDObjet paramByName;
        List linkedList;
        HttpEntity c0994s;
        switch (i) {
            case 1:
                httpGet = new HttpGet();
                break;
            case 3:
                httpGet = new HttpPut();
                break;
            case 4:
                httpGet = new HttpDelete();
                break;
            default:
                httpGet = new HttpPost();
                break;
        }
        boolean z = httpGet instanceof HttpEntityEnclosingRequestBase;
        if (z) {
            try {
                if (wDHTTPForm.getNbFiles() > 0) {
                    obj = 1;
                    if (obj != null) {
                        paramIterator = wDHTTPForm.getParamIterator();
                        if (paramIterator != null) {
                            if (z && str3 != null) {
                                try {
                                    if (!str3.equalsIgnoreCase(f2756z[9])) {
                                        stringBuilder = new StringBuilder();
                                        while (paramIterator.hasNext()) {
                                            str4 = (String) paramIterator.next();
                                            paramByName = wDHTTPForm.getParamByName(str4);
                                            try {
                                                if (stringBuilder.length() > 0) {
                                                    stringBuilder.append('&');
                                                }
                                                stringBuilder.append(str4);
                                                stringBuilder.append('=');
                                                stringBuilder.append(paramByName.getString());
                                            } catch (UnsupportedEncodingException e) {
                                                throw e;
                                            }
                                        }
                                        try {
                                            ((HttpEntityEnclosingRequestBase) httpGet).setEntity(new StringEntity(stringBuilder.toString()));
                                        } catch (Exception e2) {
                                            C0691a.m2857a(f2756z[5], e2);
                                        }
                                    }
                                } catch (UnsupportedEncodingException e3) {
                                    throw e3;
                                }
                            }
                            linkedList = new LinkedList();
                            while (paramIterator.hasNext()) {
                                str4 = (String) paramIterator.next();
                                linkedList.add(new BasicNameValuePair(str4, wDHTTPForm.getParamByName(str4).getString()));
                            }
                            if (z) {
                                if (!str.endsWith("?")) {
                                    str = str + "?";
                                }
                                str = str + URLEncodedUtils.format(linkedList, f2756z[6]);
                            } else {
                                try {
                                    ((HttpEntityEnclosingRequestBase) httpGet).setEntity(new UrlEncodedFormEntity(linkedList));
                                } catch (Exception e22) {
                                    C0691a.m2857a(f2756z[5], e22);
                                } catch (C1011t e4) {
                                    throw e4;
                                }
                            }
                        }
                    }
                    c0994s = new C0994s();
                    paramIterator = wDHTTPForm.getParamIterator();
                    if (paramIterator != null) {
                        while (paramIterator.hasNext()) {
                            try {
                                str4 = (String) paramIterator.next();
                                paramByName = wDHTTPForm.getParamByName(str4);
                                if (paramByName != null) {
                                    try {
                                        c0994s.m7239a(str4, paramByName);
                                    } catch (Exception e222) {
                                        C0691a.m2857a(f2756z[8], e222);
                                    } catch (C1011t e42) {
                                        throw e42;
                                    }
                                }
                            } catch (UnsupportedEncodingException e32) {
                                throw e32;
                            }
                        }
                    }
                    paramIterator = wDHTTPForm.getFileIterator();
                    if (paramIterator != null) {
                        while (paramIterator.hasNext()) {
                            try {
                                str4 = (String) paramIterator.next();
                                try {
                                    c0994s.m7241a(str4, wDHTTPForm.getFileByName(str4));
                                } catch (Exception e2222) {
                                    C0691a.m2857a(f2756z[11], e2222);
                                }
                            } catch (UnsupportedEncodingException e322) {
                                throw e322;
                            }
                        }
                    }
                    ((HttpEntityEnclosingRequestBase) httpGet).setEntity(c0994s);
                    if (!URLUtil.isNetworkUrl(str)) {
                        str = f2756z[10] + str;
                    }
                    if (str3 != null) {
                        try {
                            httpGet.setHeader(f2756z[7], str3);
                        } catch (UnsupportedEncodingException e3222) {
                            throw e3222;
                        }
                    }
                    httpGet.setURI(URI.create(str));
                    if (!C0808l.m4053k(str2)) {
                        m7066a(httpGet, str2);
                    }
                    try {
                        return new C0984g(execute(httpGet));
                    } catch (Exception e22222) {
                        throw new C1011t(e22222.getMessage());
                    }
                }
            } catch (UnsupportedEncodingException e32222) {
                throw e32222;
            }
        }
        obj = null;
        if (obj != null) {
            c0994s = new C0994s();
            paramIterator = wDHTTPForm.getParamIterator();
            if (paramIterator != null) {
                while (paramIterator.hasNext()) {
                    str4 = (String) paramIterator.next();
                    paramByName = wDHTTPForm.getParamByName(str4);
                    if (paramByName != null) {
                        c0994s.m7239a(str4, paramByName);
                    }
                }
            }
            paramIterator = wDHTTPForm.getFileIterator();
            if (paramIterator != null) {
                while (paramIterator.hasNext()) {
                    str4 = (String) paramIterator.next();
                    c0994s.m7241a(str4, wDHTTPForm.getFileByName(str4));
                }
            }
            ((HttpEntityEnclosingRequestBase) httpGet).setEntity(c0994s);
        } else {
            paramIterator = wDHTTPForm.getParamIterator();
            if (paramIterator != null) {
                if (str3.equalsIgnoreCase(f2756z[9])) {
                    stringBuilder = new StringBuilder();
                    while (paramIterator.hasNext()) {
                        str4 = (String) paramIterator.next();
                        paramByName = wDHTTPForm.getParamByName(str4);
                        if (stringBuilder.length() > 0) {
                            stringBuilder.append('&');
                        }
                        stringBuilder.append(str4);
                        stringBuilder.append('=');
                        stringBuilder.append(paramByName.getString());
                    }
                    ((HttpEntityEnclosingRequestBase) httpGet).setEntity(new StringEntity(stringBuilder.toString()));
                }
                linkedList = new LinkedList();
                while (paramIterator.hasNext()) {
                    str4 = (String) paramIterator.next();
                    linkedList.add(new BasicNameValuePair(str4, wDHTTPForm.getParamByName(str4).getString()));
                }
                if (z) {
                    if (str.endsWith("?")) {
                        str = str + "?";
                    }
                    str = str + URLEncodedUtils.format(linkedList, f2756z[6]);
                } else {
                    ((HttpEntityEnclosingRequestBase) httpGet).setEntity(new UrlEncodedFormEntity(linkedList));
                }
            }
        }
        if (URLUtil.isNetworkUrl(str)) {
            str = f2756z[10] + str;
        }
        if (str3 != null) {
            httpGet.setHeader(f2756z[7], str3);
        }
        try {
            httpGet.setURI(URI.create(str));
            if (C0808l.m4053k(str2)) {
                m7066a(httpGet, str2);
            }
            return new C0984g(execute(httpGet));
        } catch (UnsupportedEncodingException e322222) {
            throw e322222;
        }
    }

    /* renamed from: a */
    protected C0983n m7070a(String str, byte[] bArr, String str2, String str3) throws C1011t {
        try {
            HttpUriRequest httpPost;
            if (!C0808l.m4053k(str2)) {
                m7066a(null, str2);
            }
            if (bArr != null) {
                httpPost = new HttpPost(str);
                HttpEntity byteArrayEntity = new ByteArrayEntity(bArr);
                byteArrayEntity.setContentType(str3);
                ((HttpPost) httpPost).setEntity(byteArrayEntity);
            } else {
                httpPost = new HttpGet(str);
            }
            try {
                return new C0984g(execute(httpPost));
            } catch (Exception e) {
                throw new C1011t(e.getMessage());
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    public final void m7071a(String str) {
        getParams().setParameter(f2756z[3], str);
    }

    /* renamed from: a */
    public final void m7072a(String str, String str2) {
        if (!C0808l.m4053k(str)) {
            CredentialsProvider basicCredentialsProvider = new BasicCredentialsProvider();
            AuthScope authScope = new AuthScope(AuthScope.ANY_HOST, -1);
            if (str2 == null) {
                str2 = "";
            }
            basicCredentialsProvider.setCredentials(authScope, new UsernamePasswordCredentials(str, str2));
            setCredentialsProvider(basicCredentialsProvider);
        }
    }

    public void release() {
    }
}
