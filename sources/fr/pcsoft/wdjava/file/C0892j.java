package fr.pcsoft.wdjava.file;

import java.io.File;

/* renamed from: fr.pcsoft.wdjava.file.j */
class C0892j {
    /* renamed from: c */
    private static C0892j f2385c = new C0892j();
    /* renamed from: a */
    private boolean f2386a = true;
    /* renamed from: b */
    private File[] f2387b = null;
    /* renamed from: d */
    private int f2388d = 0;

    private C0892j() {
    }

    /* renamed from: a */
    static C0892j m6218a() {
        return f2385c;
    }

    static boolean access$000(C0892j c0892j) {
        return c0892j.f2386a;
    }

    static boolean access$002(C0892j c0892j, boolean z) {
        c0892j.f2386a = z;
        return z;
    }

    static File[] access$100(C0892j c0892j) {
        return c0892j.f2387b;
    }

    static File[] access$102(C0892j c0892j, File[] fileArr) {
        c0892j.f2387b = fileArr;
        return fileArr;
    }

    static int access$200(C0892j c0892j) {
        return c0892j.f2388d;
    }

    static int access$202(C0892j c0892j, int i) {
        c0892j.f2388d = i;
        return i;
    }

    static int access$208(C0892j c0892j) {
        int i = c0892j.f2388d;
        c0892j.f2388d = i + 1;
        return i;
    }
}
