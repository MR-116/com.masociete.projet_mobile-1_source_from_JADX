package fr.pcsoft.wdjava.net.http;

import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* renamed from: fr.pcsoft.wdjava.net.http.i */
final class C0986i implements X509TrustManager {
    /* renamed from: z */
    private static final String f2802z = C0986i.m7170z(C0986i.m7171z("3V\u0005C\u001f\u0016Z\u0014V\u0002\u0015a\u0012A\u0019\u001bV\u0013r\u000e\u0013V\u0007C\u001f\u001f]"));
    final X509TrustManager val$defaultTrustmanager;
    final int val$nIgnoreCertifateErrorFlags;

    C0986i(X509TrustManager x509TrustManager, int i) {
        this.val$defaultTrustmanager = x509TrustManager;
        this.val$nIgnoreCertifateErrorFlags = i;
    }

    /* renamed from: a */
    private void m7169a(CertificateException certificateException) throws CertificateException {
        try {
            if (!(certificateException instanceof CertificateExpiredException)) {
                try {
                    if (!certificateException.getClass().getSimpleName().equals(f2802z)) {
                        try {
                            if ((this.val$nIgnoreCertifateErrorFlags & 1) == 0) {
                                throw certificateException;
                            }
                        } catch (CertificateException e) {
                            throw e;
                        }
                    } else if ((this.val$nIgnoreCertifateErrorFlags & 32) == 0) {
                        throw certificateException;
                    }
                } catch (CertificateException e2) {
                    throw e2;
                } catch (CertificateException e22) {
                    throw e22;
                }
            } else if ((this.val$nIgnoreCertifateErrorFlags & 4) == 0) {
                throw certificateException;
            }
        } catch (CertificateException e222) {
            throw e222;
        } catch (CertificateException e2222) {
            throw e2222;
        }
    }

    /* renamed from: z */
    private static String m7170z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 112;
                    break;
                case 1:
                    i2 = 51;
                    break;
                case 2:
                    i2 = 119;
                    break;
                case 3:
                    i2 = 55;
                    break;
                default:
                    i2 = 118;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7171z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 118);
        }
        return toCharArray;
    }

    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        try {
            this.val$defaultTrustmanager.checkClientTrusted(x509CertificateArr, str);
        } catch (CertificateException e) {
            m7169a(e);
        }
    }

    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        try {
            this.val$defaultTrustmanager.checkServerTrusted(x509CertificateArr, str);
        } catch (CertificateException e) {
            m7169a(e);
        }
    }

    public X509Certificate[] getAcceptedIssuers() {
        return this.val$defaultTrustmanager.getAcceptedIssuers();
    }
}
