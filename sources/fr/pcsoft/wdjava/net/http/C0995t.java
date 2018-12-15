package fr.pcsoft.wdjava.net.http;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/* renamed from: fr.pcsoft.wdjava.net.http.t */
final class C0995t implements HostnameVerifier {
    C0995t() {
    }

    public boolean verify(String str, SSLSession sSLSession) {
        return true;
    }
}
