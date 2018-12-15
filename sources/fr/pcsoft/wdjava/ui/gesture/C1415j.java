package fr.pcsoft.wdjava.ui.gesture;

/* renamed from: fr.pcsoft.wdjava.ui.gesture.j */
final class C1415j extends C1414i {
    final C1290a this$0;

    C1415j(C1290a c1290a, int i) {
        this.this$0 = c1290a;
        super(c1290a, i);
    }

    public void start() {
        if (this.this$0.mo3529e(this.a) != null) {
            setIntValues(new int[]{(int) this.this$0.mo3529e(this.a).getTranslationX(), 0});
            super.start();
        }
    }
}
