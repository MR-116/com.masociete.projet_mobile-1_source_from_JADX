package fr.pcsoft.wdjava.core.utils;

import fr.pcsoft.wdjava.core.C0725i;

/* renamed from: fr.pcsoft.wdjava.core.utils.h */
final class C0804h extends C0801e {
    C0804h(String str) {
        super(str);
    }

    /* renamed from: a */
    public boolean mo2757a(zb zbVar) {
        return zbVar.m4199a() == C0725i.m3064d(this.a.substring(0, 4)) && zbVar.m4204c() == C0725i.m3064d(this.a.substring(4, 6)) && zbVar.m4207e() == C0725i.m3064d(this.a.substring(6, 8));
    }
}
