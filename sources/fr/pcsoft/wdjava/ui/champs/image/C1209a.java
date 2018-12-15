package fr.pcsoft.wdjava.ui.champs.image;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import fr.pcsoft.wdjava.core.utils.C0800d;
import fr.pcsoft.wdjava.ui.p069g.C1409j;

/* renamed from: fr.pcsoft.wdjava.ui.champs.image.a */
public class C1209a extends SimpleOnGestureListener {
    final C1216i this$0;

    public C1209a(C1216i c1216i) {
        this.this$0 = c1216i;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        boolean z = false;
        if (this.this$0.isEnabled()) {
            try {
                if (this.this$0.f3638n) {
                    if (this.this$0.getDrawable() != null) {
                        float access$300 = this.this$0.m8558q();
                        access$300 = (access$300 <= this.this$0.f3629e || C0800d.m3856a((double) access$300, (double) this.this$0.f3629e)) ? 1.0f : this.this$0.f3629e;
                        this.this$0.f3642t = access$300;
                        this.this$0.m8566a(access$300, motionEvent.getX(), motionEvent.getY(), (int) C1409j.f4188e);
                        this.this$0.invalidate();
                    } else if (this.this$0.f3627b != null) {
                        this.this$0.f3627b.onDoubleTap((int) motionEvent.getX(), (int) motionEvent.getY());
                    }
                }
                z = super.onDoubleTap(motionEvent);
                if (this.this$0.f3627b != null) {
                    this.this$0.f3627b.onDoubleTap((int) motionEvent.getX(), (int) motionEvent.getY());
                }
            } catch (Throwable th) {
                if (this.this$0.f3627b != null) {
                    this.this$0.f3627b.onDoubleTap((int) motionEvent.getX(), (int) motionEvent.getY());
                }
            }
        }
        return z;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        boolean z = false;
        if (this.this$0.isEnabled()) {
            try {
                if (this.this$0.f3630f && (Math.abs(f) > 800.0f || Math.abs(f2) > 800.0f)) {
                    if (this.this$0.getDrawable() == null) {
                        if (this.this$0.f3627b != null) {
                            this.this$0.f3627b.onFling((int) f, (int) f2);
                        }
                    } else if (this.this$0.mo3473a(motionEvent) == this.this$0.mo3473a(motionEvent2) && !this.this$0.mo3479o()) {
                        this.this$0.m8567a((motionEvent2.getX() - motionEvent.getX()) / 2.0f, (motionEvent2.getY() - motionEvent.getY()) / 2.0f, (int) C1409j.f4188e);
                        this.this$0.invalidate();
                    } else if (this.this$0.f3627b != null) {
                        this.this$0.f3627b.onFling((int) f, (int) f2);
                    }
                }
                z = super.onFling(motionEvent, motionEvent2, f, f2);
                if (this.this$0.f3627b != null) {
                    this.this$0.f3627b.onFling((int) f, (int) f2);
                }
            } catch (Throwable th) {
                if (this.this$0.f3627b != null) {
                    this.this$0.f3627b.onFling((int) f, (int) f2);
                }
            }
        }
        return z;
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        boolean z = false;
        if (this.this$0.isEnabled()) {
            try {
                if (this.this$0.f3630f) {
                    if (this.this$0.getDrawable() != null) {
                        if (!(motionEvent == null || motionEvent2 == null)) {
                            if (this.this$0.mo3473a(motionEvent) == this.this$0.mo3473a(motionEvent2) && !this.this$0.mo3479o()) {
                                this.this$0.m8564a(-f, -f2);
                                this.this$0.invalidate();
                            }
                        }
                        if (this.this$0.f3627b != null) {
                            this.this$0.f3627b.onScroll((int) f, (int) f2);
                        }
                    } else if (this.this$0.f3627b != null) {
                        this.this$0.f3627b.onScroll((int) f, (int) f2);
                    }
                }
                z = super.onScroll(motionEvent, motionEvent2, f, f2);
                if (this.this$0.f3627b != null) {
                    this.this$0.f3627b.onScroll((int) f, (int) f2);
                }
            } catch (Throwable th) {
                if (this.this$0.f3627b != null) {
                    this.this$0.f3627b.onScroll((int) f, (int) f2);
                }
            }
        }
        return z;
    }
}
