package fr.pcsoft.wdjava.p037c;

import android.content.Context;
import android.media.MediaScannerConnection;
import android.media.MediaScannerConnection.MediaScannerConnectionClient;
import android.net.Uri;

/* renamed from: fr.pcsoft.wdjava.c.b */
class C0553b implements MediaScannerConnectionClient {
    /* renamed from: a */
    private MediaScannerConnection f1251a;
    /* renamed from: b */
    private String f1252b;

    public C0553b(Context context) {
        this.f1251a = new MediaScannerConnection(context, this);
    }

    /* renamed from: a */
    public final void m1764a() {
        this.f1251a = null;
        this.f1252b = null;
    }

    /* renamed from: a */
    public final void m1765a(String str) {
        this.f1252b = str;
        this.f1251a.connect();
    }

    public void onMediaScannerConnected() {
        this.f1251a.scanFile(this.f1252b, null);
    }

    public void onScanCompleted(String str, Uri uri) {
        this.f1251a.disconnect();
        m1764a();
    }
}
