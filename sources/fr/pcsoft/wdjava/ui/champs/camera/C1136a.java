package fr.pcsoft.wdjava.ui.champs.camera;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.Camera;
import android.hardware.Camera.PreviewCallback;
import android.os.Handler;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import fr.pcsoft.wdjava.media.C0939a;
import fr.pcsoft.wdjava.media.C0949k;
import fr.pcsoft.wdjava.media.C0957s;

/* renamed from: fr.pcsoft.wdjava.ui.champs.camera.a */
class C1136a extends SurfaceView implements C0949k, PreviewCallback {
    final WDChampCamera this$0;

    public C1136a(WDChampCamera wDChampCamera, Context context) {
        this.this$0 = wDChampCamera;
        super(context);
        setKeepScreenOn(true);
    }

    /* renamed from: a */
    private final void m8304a(C0939a c0939a) {
        boolean z = true;
        if (c0939a != null) {
            c0939a.f2583b = C0957s.m6869c().m6896j();
            Rect decodeFrameRect = this.this$0.getDecodeFrameRect();
            if (decodeFrameRect != null) {
                float width;
                float height;
                if ((this.this$0.Jc.getWidth() >= this.this$0.Jc.getHeight()) == (c0939a.f2583b.m10571a() >= c0939a.f2583b.m10572b())) {
                    z = false;
                }
                c0939a.f2585d = z;
                if (c0939a.f2585d) {
                    width = ((float) c0939a.f2583b.f4667b) / ((float) this.this$0.Jc.getWidth());
                    height = ((float) c0939a.f2583b.f4666a) / ((float) this.this$0.Jc.getHeight());
                } else {
                    width = ((float) c0939a.f2583b.f4666a) / ((float) this.this$0.Jc.getWidth());
                    height = ((float) c0939a.f2583b.f4667b) / ((float) this.this$0.Jc.getHeight());
                }
                c0939a.f2584c = new Rect((int) (((float) decodeFrameRect.left) * width), (int) (((float) decodeFrameRect.top) * height), (int) (width * ((float) decodeFrameRect.right)), (int) (height * ((float) decodeFrameRect.bottom)));
            }
        }
    }

    /* renamed from: a */
    public void mo3413a() {
        this.this$0.demarrerFlux();
    }

    /* renamed from: b */
    public void mo3414b() {
        if (this.this$0.Ec != null) {
            this.this$0.Ec.m6841d();
        }
    }

    /* renamed from: c */
    public final void m8307c() {
        Camera i = C0957s.m6869c().m6895i();
        if (i != null) {
            i.setOneShotPreviewCallback(this);
        }
    }

    /* renamed from: d */
    public void m8308d() {
        C0957s.m6869c().m6881a((C0949k) this);
    }

    /* renamed from: e */
    void m8309e() {
        SurfaceHolder holder = getHolder();
        holder.setType(3);
        holder.addCallback(new C1137b(this));
        C0957s.m6869c().m6887b((C0949k) this);
    }

    public void onPreviewFrame(byte[] bArr, Camera camera) {
        if (this.this$0.Ec != null) {
            Handler b = this.this$0.Ec.m6839b();
            if (b != null) {
                C0939a c0939a = new C0939a();
                m8304a(c0939a);
                c0939a.f2582a = bArr;
                b.obtainMessage(1, c0939a).sendToTarget();
            }
        }
    }
}
