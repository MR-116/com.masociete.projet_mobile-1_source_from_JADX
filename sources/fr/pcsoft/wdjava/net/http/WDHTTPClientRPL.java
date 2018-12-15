package fr.pcsoft.wdjava.net.http;

import fr.pcsoft.wdjava.file.C0897o;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.params.HttpParams;

public class WDHTTPClientRPL extends cb {
    /* renamed from: a */
    private int f2757a = -1;
    /* renamed from: b */
    private Exception f2758b = null;
    /* renamed from: c */
    private byte[] f2759c = null;
    /* renamed from: d */
    private String f2760d = "";
    /* renamed from: e */
    private File f2761e = null;

    private WDHTTPClientRPL(ClientConnectionManager clientConnectionManager, HttpParams httpParams) {
        super(clientConnectionManager, httpParams);
    }

    /* renamed from: a */
    private final void m7073a(C0983n c0983n) throws IOException {
        Throwable th;
        InputStream inputStream;
        OutputStream outputStream;
        InputStream inputStream2 = null;
        File file = this.f2761e;
        m7074b();
        this.f2757a = c0983n.mo3271b();
        this.f2760d = c0983n.mo3275f();
        try {
            OutputStream bufferedOutputStream;
            InputStream a = c0983n.mo3270a();
            if (file != null) {
                try {
                    bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = a;
                    outputStream = null;
                    inputStream2 = inputStream;
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException e) {
                        }
                    }
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException e2) {
                        }
                    }
                    throw th;
                }
            }
            bufferedOutputStream = new ByteArrayOutputStream(c0983n.mo3274e());
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = a.read(bArr, 0, 8192);
                    if (read != -1) {
                        bufferedOutputStream.write(bArr, 0, read);
                    } else {
                        try {
                            break;
                        } catch (IOException e3) {
                            throw e3;
                        } catch (IOException e32) {
                            throw e32;
                        }
                    }
                }
                bufferedOutputStream.flush();
                if (file == null) {
                    if (bufferedOutputStream instanceof ByteArrayOutputStream) {
                        this.f2759c = ((ByteArrayOutputStream) bufferedOutputStream).toByteArray();
                    }
                }
                if (bufferedOutputStream != null) {
                    try {
                        bufferedOutputStream.close();
                    } catch (IOException e4) {
                    }
                }
                if (a != null) {
                    try {
                        a.close();
                    } catch (IOException e5) {
                    }
                }
            } catch (IOException e322) {
                throw e322;
            } catch (Throwable th3) {
                th = th3;
                inputStream = a;
                outputStream = bufferedOutputStream;
                inputStream2 = inputStream;
            }
        } catch (Throwable th4) {
            th = th4;
            outputStream = null;
            if (outputStream != null) {
                outputStream.close();
            }
            if (inputStream2 != null) {
                inputStream2.close();
            }
            throw th;
        }
    }

    /* renamed from: b */
    private final void m7074b() {
        this.f2761e = null;
        this.f2759c = null;
        this.f2760d = "";
        this.f2757a = -1;
        this.f2758b = null;
    }

    public static final WDHTTPClientRPL createDefaultHttpClientRPL() {
        HttpParams a = cb.m7065a();
        return new WDHTTPClientRPL(cb.m7064a(a), a);
    }

    public final boolean executeHttpRequest(String str, byte[] bArr, String str2) {
        try {
            m7073a(m7070a(str, bArr, null, str2));
            return true;
        } catch (Exception e) {
            this.f2758b = e;
            return false;
        }
    }

    public final String getLastError() {
        return this.f2758b != null ? this.f2758b.getMessage() : "";
    }

    public final byte[] getResponseContent() {
        return this.f2759c;
    }

    public final String getResponseHeader() {
        return this.f2760d;
    }

    public final int getStatusCode() {
        return this.f2757a;
    }

    public void release() {
        super.release();
        this.f2761e = null;
        this.f2759c = null;
        this.f2760d = null;
        this.f2758b = null;
    }

    public final boolean sendHttpForm(WDHTTPForm wDHTTPForm, String str) {
        if (wDHTTPForm == null) {
            return false;
        }
        try {
            m7073a(m7069a(wDHTTPForm, str, 2, null, null));
            return true;
        } catch (Exception e) {
            this.f2758b = e;
            return false;
        }
    }

    public final boolean setDestinationFile(String str) {
        this.f2761e = C0897o.m6290j(str);
        if (!this.f2761e.exists()) {
            try {
                this.f2761e.createNewFile();
            } catch (Exception e) {
                this.f2758b = e;
                return false;
            }
        }
        return true;
    }
}
