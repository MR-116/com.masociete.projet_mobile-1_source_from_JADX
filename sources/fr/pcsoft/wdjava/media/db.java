package fr.pcsoft.wdjava.media;

import android.os.Handler;
import android.os.Message;
import p000a.p001a.p002a.C0208m;

public class db extends Handler {
    /* renamed from: b */
    public static final int f2588b = 240;
    /* renamed from: c */
    public static final int f2589c = 240;
    /* renamed from: d */
    public static final int f2590d = 2;
    /* renamed from: g */
    public static final int f2591g = 3;
    /* renamed from: h */
    public static final int f2592h = 4;
    /* renamed from: i */
    public static final int f2593i = 1;
    /* renamed from: a */
    private C0947i f2594a = null;
    /* renamed from: e */
    private int f2595e = 0;
    /* renamed from: f */
    private bb f2596f = null;

    public db(int i) {
        this.f2595e = i;
    }

    /* renamed from: a */
    public final void m6836a() {
        m6837a(this.f2595e);
    }

    /* renamed from: a */
    public final synchronized void m6837a(int i) {
        if (!(this.f2594a == null || this.f2595e == i)) {
            m6841d();
            this.f2595e = i;
        }
        if (this.f2594a == null) {
            this.f2594a = new C0947i(this, null);
            this.f2594a.start();
        }
    }

    /* renamed from: a */
    public void m6838a(bb bbVar) {
        this.f2596f = bbVar;
    }

    /* renamed from: b */
    public Handler m6839b() {
        return this.f2594a != null ? C0947i.access$000(this.f2594a) : null;
    }

    /* renamed from: c */
    public void m6840c() {
        m6841d();
        this.f2594a = null;
        this.f2596f = null;
    }

    /* renamed from: d */
    public final synchronized void m6841d() {
        if (this.f2594a != null) {
            Message.obtain(C0947i.access$000(this.f2594a), 2).sendToTarget();
            try {
                this.f2594a.join(500);
            } catch (InterruptedException e) {
            }
            removeMessages(3);
            removeMessages(4);
            this.f2594a = null;
        }
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case 3:
                if (this.f2596f != null) {
                    this.f2596f.onBarcodeDecoded((C0208m) message.obj);
                    return;
                }
                return;
            case 4:
                if (this.f2596f != null) {
                    this.f2596f.onDecodingFailed();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
