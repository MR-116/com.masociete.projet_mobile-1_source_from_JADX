package fr.pcsoft.wdjava.net.oauth2;

import android.content.Intent;
import android.os.AsyncTask;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.application.WDAppManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.core.utils.bb;
import fr.pcsoft.wdjava.net.C0974g;
import fr.pcsoft.wdjava.net.oauth2.WDOAuth2Manager.OAuth2Parameters;
import fr.pcsoft.wdjava.net.oauth2.WDOAuth2Manager.OAuth2Token;
import fr.pcsoft.wdjava.net.oauth2.WDOAuth2Manager.OAuthActivity;
import fr.pcsoft.wdjava.p059n.C0969g;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* renamed from: fr.pcsoft.wdjava.net.oauth2.d */
class C1005d extends AsyncTask<OAuth2Parameters, Void, OAuth2Token> {
    /* renamed from: z */
    private static final String[] f2907z = new String[]{C1005d.m7314z(C1005d.m7315z("U]\u0010A[OQ\u000bX_^")), C1005d.m7314z(C1005d.m7315z("U]\u0010A[O@\u0016AUB")), C1005d.m7314z(C1005d.m7315z("@J\u0017G")), C1005d.m7314z(C1005d.m7315z("qf'vicZ0|quk")), C1005d.m7314z(C1005d.m7315z("\u001d\u000f")), C1005d.m7314z(C1005d.m7315z("R`%ab")), C1005d.m7314z(C1005d.m7315z("Sj*g~qiGc``")), C1005d.m7314z(C1005d.m7315z("dj/vtOq=c")), C1005d.m7314z(C1005d.m7315z("uw6|h")), C1005d.m7314z(C1005d.m7315z("sj v")), C1005d.m7314z(C1005d.m7315z("cq%g")), C1005d.m7314z(C1005d.m7315z("qu4ssd0zu~*<>mgriuubhifh|`*put` ")), C1005d.m7314z(C1005d.m7315z("EQ\u0002>\"")), C1005d.m7314z(C1005d.m7315z("3@\u0016AEC@\u0007FHYQ\u0001LUQP\u0010[")), C1005d.m7314z(C1005d.m7315z("3C\u0001AWUW\u001b][FL\u0003RNUP\u0016")), C1005d.m7314z(C1005d.m7315z("XQ\u0010C5!+u3( 5d\\Q\u001d\u000f\u0007|t~`'gsk~3y|j7v\u0017\u001af+}nuk0>niu!):d`<g5xq)!0f,rhc`0.odci+\u0017\u001a\u000fN/rdh(-&x`%w$,q-gvu;a\"&?q-gvu;x<rud -&rj j$57x<xa=-&?m0~v.")), C1005d.m7314z(C1005d.m7315z("3D\u0011GRUK\u0010Z\\YF\u0005GS_K\u001bTU_B\bV")), C1005d.m7314z(C1005d.m7315z("GH\u001b@USN\u0001GE_D\u0011GR"))};
    /* renamed from: a */
    private Exception f2908a = null;
    final OAuthActivity this$0;

    C1005d(OAuthActivity oAuthActivity) {
        this.this$0 = oAuthActivity;
    }

    /* renamed from: a */
    private OAuth2Token m7312a(OAuth2Parameters oAuth2Parameters, byte[] bArr) throws C1010i {
        IOException iOException;
        Throwable th;
        HttpURLConnection httpURLConnection = null;
        if (bArr != null) {
            try {
                if (bArr.length != 0) {
                    String str;
                    try {
                        str = new String(bArr, f2907z[12]);
                    } catch (UnsupportedEncodingException e) {
                        str = null;
                    }
                    int indexOf = C0808l.m4049g(str).indexOf(f2907z[4]);
                    if (indexOf > 0) {
                        str = str.substring(0, indexOf);
                    }
                    indexOf = str.indexOf(63);
                    if (indexOf >= 0) {
                        str = str.substring(indexOf + 1);
                    } else {
                        indexOf = str.indexOf(35);
                        str = indexOf >= 0 ? str.substring(indexOf + 1) : null;
                    }
                    indexOf = str.lastIndexOf(32);
                    if (indexOf >= 0) {
                        str = str.substring(0, indexOf);
                    }
                    try {
                        if (C0808l.m4053k(str)) {
                            throw new C1010i("");
                        }
                        Map hashMap = new HashMap();
                        C0974g.m7039a(str, hashMap);
                        str = (String) hashMap.get(f2907z[8]);
                        try {
                            if (C0808l.m4053k(str)) {
                                str = (String) hashMap.get(f2907z[10]);
                                try {
                                    if (!C0808l.m4053k(str)) {
                                        if (str.equals(String.valueOf(oAuth2Parameters.m7260a()))) {
                                            str = (String) hashMap.get(f2907z[3]);
                                            if (C0808l.m4053k(str)) {
                                                str = (String) hashMap.get(f2907z[9]);
                                                try {
                                                    if (C0808l.m4053k(str)) {
                                                        throw new C1010i("");
                                                    }
                                                    try {
                                                        HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(oAuth2Parameters.m7273g(str)).openConnection();
                                                        try {
                                                            httpURLConnection2.setRequestMethod(f2907z[2]);
                                                            httpURLConnection2.setRequestProperty(f2907z[6], f2907z[11]);
                                                            if (httpURLConnection2.getResponseCode() != C0607n.Dt) {
                                                                throw new C1010i(bb.m3843a(httpURLConnection2.getErrorStream()));
                                                            }
                                                            OAuth2Token oAuth2Token = new OAuth2Token(oAuth2Parameters, bb.m3846b(httpURLConnection2.getInputStream()));
                                                            if (httpURLConnection2 != null) {
                                                                try {
                                                                    httpURLConnection2.disconnect();
                                                                } catch (UnsupportedEncodingException e2) {
                                                                    throw e2;
                                                                }
                                                            }
                                                            return oAuth2Token;
                                                        } catch (UnsupportedEncodingException e3) {
                                                            throw e3;
                                                        } catch (IOException e4) {
                                                            IOException iOException2 = e4;
                                                            httpURLConnection = httpURLConnection2;
                                                            iOException = iOException2;
                                                        } catch (Throwable th2) {
                                                            Throwable th3 = th2;
                                                            httpURLConnection = httpURLConnection2;
                                                            th = th3;
                                                            if (httpURLConnection != null) {
                                                                try {
                                                                    httpURLConnection.disconnect();
                                                                } catch (UnsupportedEncodingException e22) {
                                                                    throw e22;
                                                                }
                                                            }
                                                            throw th;
                                                        }
                                                    } catch (IOException e5) {
                                                        iOException = e5;
                                                        try {
                                                            throw new C1010i(iOException.getMessage());
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            if (httpURLConnection != null) {
                                                                httpURLConnection.disconnect();
                                                            }
                                                            throw th;
                                                        }
                                                    }
                                                } catch (UnsupportedEncodingException e222) {
                                                    throw e222;
                                                }
                                            }
                                            String str2 = (String) hashMap.get(f2907z[7]);
                                            if (C0808l.m4053k(str2)) {
                                                str2 = f2907z[5];
                                            }
                                            return new OAuth2Token(oAuth2Parameters, str, str2, bArr);
                                        }
                                    }
                                    throw new C1010i(C0745b.m3222b(f2907z[13], new String[0]));
                                } catch (UnsupportedEncodingException e2222) {
                                    throw e2222;
                                } catch (UnsupportedEncodingException e22222) {
                                    throw e22222;
                                }
                            }
                            throw new C1010i(str);
                        } catch (UnsupportedEncodingException e222222) {
                            throw e222222;
                        }
                    } catch (UnsupportedEncodingException e2222222) {
                        throw e2222222;
                    }
                }
            } catch (UnsupportedEncodingException e22222222) {
                throw e22222222;
            }
        }
        throw new C1010i("");
    }

    /* renamed from: a */
    private final void m7313a(OAuth2Token oAuth2Token) {
        if (!this.this$0.isFinishing()) {
            int i;
            Intent intent = new Intent();
            if (this.f2908a != null) {
                intent.putExtra(f2907z[1], this.f2908a.getMessage());
                i = 0;
            } else if (oAuth2Token != null) {
                i = -1;
                intent.putExtra(f2907z[0], oAuth2Token);
            } else {
                i = 0;
            }
            this.this$0.setResult(i, intent);
            WDAppManager.m2567a(null, new WDObjet[0]);
            this.this$0.finish();
        }
    }

    /* renamed from: z */
    private static String m7314z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 16;
                    break;
                case 1:
                    i2 = 5;
                    break;
                case 2:
                    i2 = 68;
                    break;
                case 3:
                    i2 = 19;
                    break;
                default:
                    i2 = 26;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7315z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 26);
        }
        return toCharArray;
    }

    /* renamed from: a */
    protected OAuth2Token m7316a(OAuth2Parameters... oAuth2ParametersArr) {
        Throwable th;
        do {
            try {
                if (C0969g.m7015a(f2907z[17]) && C0969g.m7016a(f2907z[17], 100)) {
                    String c;
                    try {
                        c = C0969g.m7022c(f2907z[17]);
                        try {
                            byte[] a = C0969g.m7019a(c, false, 1000, 4096);
                            C0969g.m7013a(c, C0808l.m4021a(f2907z[15], C0745b.m3224c(f2907z[16], new String[0]), C0745b.m3224c(f2907z[14], new String[0])).getBytes(f2907z[12]));
                            OAuth2Token a2 = m7312a(oAuth2ParametersArr[0], a);
                            if (C0808l.m4053k(c)) {
                                return a2;
                            }
                            C0969g.m7023d(c);
                            return a2;
                        } catch (Throwable th2) {
                            th = th2;
                            if (!C0808l.m4053k(c)) {
                                C0969g.m7023d(c);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        c = null;
                        if (C0808l.m4053k(c)) {
                            C0969g.m7023d(c);
                        }
                        throw th;
                    }
                }
            } catch (Exception e) {
                throw e;
            } catch (Exception e2) {
                throw e2;
            } catch (Exception e22) {
                this.f2908a = e22;
                return null;
            }
        } while (!isCancelled());
        return null;
    }

    /* renamed from: b */
    protected void m7317b(OAuth2Token oAuth2Token) {
        m7313a(oAuth2Token);
    }

    /* renamed from: c */
    protected void m7318c(OAuth2Token oAuth2Token) {
        m7313a(oAuth2Token);
    }

    protected /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        return m7316a((OAuth2Parameters[]) objArr);
    }

    protected /* bridge */ /* synthetic */ void onCancelled(Object obj) {
        m7318c((OAuth2Token) obj);
    }

    protected /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        m7317b((OAuth2Token) obj);
    }
}
