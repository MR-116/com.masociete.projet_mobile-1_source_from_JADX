package fr.pcsoft.wdjava.core;

import fr.pcsoft.wdjava.core.utils.gb;

/* renamed from: fr.pcsoft.wdjava.core.j */
class C0726j extends gb<WDObjet> {
    final WDCallback this$0;
    final WDObjet[] val$finalParameters;
    final int val$nOptions;

    C0726j(WDCallback wDCallback, int i, WDObjet[] wDObjetArr) {
        this.this$0 = wDCallback;
        this.val$nOptions = i;
        this.val$finalParameters = wDObjetArr;
    }

    /* renamed from: b */
    public WDObjet m3089b() throws Exception {
        return this.this$0.m2248a(this.val$nOptions, this.val$finalParameters);
    }

    public /* bridge */ /* synthetic */ Object call() throws Exception {
        return m3089b();
    }
}
