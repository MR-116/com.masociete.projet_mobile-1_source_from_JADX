package fr.pcsoft.wdjava.ui.gesture;

/* renamed from: fr.pcsoft.wdjava.ui.gesture.k */
final class C1416k extends C1414i {
    /* renamed from: d */
    private long f4195d = 0;
    final C1290a this$0;

    C1416k(C1290a c1290a, int i) {
        this.this$0 = c1290a;
        super(c1290a, i);
    }

    /* renamed from: c */
    public final long m10006c() {
        return this.f4195d;
    }

    public void start() {
        if (this.this$0.mo3529e(this.a) != null) {
            this.f4195d = System.currentTimeMillis();
            if (this.this$0.f3838y == 1) {
                setIntValues(new int[]{(int) r0.getTranslationX(), this.this$0.mo3528c(this.a, this.this$0.f3838y)});
            } else {
                setIntValues(new int[]{(int) r0.getTranslationX(), -this.this$0.mo3528c(this.a, this.this$0.f3838y)});
            }
            super.start();
        }
    }
}
