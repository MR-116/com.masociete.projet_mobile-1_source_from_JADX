package fr.pcsoft.wdjava.ui.champs.zr;

import fr.pcsoft.wdjava.core.WDObjet;

/* renamed from: fr.pcsoft.wdjava.ui.champs.zr.t */
public abstract class C1311t implements ub {
    /* renamed from: a */
    public static final int f3919a = 4096;
    /* renamed from: b */
    private int f3920b = 0;

    /* renamed from: a */
    public int m9221a(int[] iArr, String str, int i, int i2) {
        int a = mo3586a();
        String toLowerCase = str.toLowerCase();
        for (int max = Math.max(0, i2); max < a; max++) {
            ec ecVar = (ec) mo3593b(max);
            if (ecVar != null) {
                for (int b : iArr) {
                    WDObjet b2 = ecVar.m9107b(b);
                    if (b2 != null) {
                        String toLowerCase2 = b2.getString().toLowerCase();
                        switch (i) {
                            case 0:
                                if (!toLowerCase2.startsWith(toLowerCase)) {
                                    break;
                                }
                                return max;
                            case 2:
                                if (toLowerCase2.indexOf(toLowerCase) < 0) {
                                    break;
                                }
                                return max;
                            default:
                                if (!toLowerCase2.equals(toLowerCase)) {
                                    break;
                                }
                                return max;
                        }
                    }
                }
                continue;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public void mo3577a(int i, boolean z) {
        if (!z) {
            if (i < mo3582d()) {
                this.f3920b = Math.max(0, this.f3920b - 1);
            } else {
                return;
            }
        }
        mo3588a(i);
    }

    /* renamed from: a */
    public void mo3578a(ec ecVar, int i, boolean z) {
        if (!z) {
            this.f3920b++;
        } else if (mo3583e() > 0) {
            this.f3920b++;
        }
        mo3590a(ecVar, i);
    }

    /* renamed from: a */
    public void mo3579a(ec ecVar, boolean z) {
        if (!z) {
            this.f3920b++;
        } else if (mo3583e() > 0) {
            this.f3920b++;
        }
        mo3595b((Object) ecVar);
    }

    /* renamed from: a */
    public boolean mo3580a(int[] iArr) {
        mo3592a(new fb(this, iArr));
        return true;
    }

    /* renamed from: b */
    public void mo3581b() {
        this.f3920b = 0;
    }

    /* renamed from: d */
    public int mo3582d() {
        return this.f3920b;
    }

    /* renamed from: e */
    public int mo3583e() {
        return Math.max(0, mo3586a() - mo3582d());
    }
}
