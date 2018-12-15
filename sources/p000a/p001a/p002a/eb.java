package p000a.p001a.p002a;

import p000a.p001a.p002a.p019g.p028a.C0175a;

/* renamed from: a.a.a.eb */
public class eb {
    /* renamed from: a */
    private final float f160a;
    /* renamed from: b */
    private final float f161b;

    public eb(float f, float f2) {
        this.f161b = f;
        this.f160a = f2;
    }

    /* renamed from: a */
    public static float m308a(eb ebVar, eb ebVar2) {
        return C0175a.m1080a(ebVar.f161b, ebVar.f160a, ebVar2.f161b, ebVar2.f160a);
    }

    /* renamed from: a */
    private static float m309a(eb ebVar, eb ebVar2, eb ebVar3) {
        float f = ebVar2.f161b;
        float f2 = ebVar2.f160a;
        return ((ebVar3.f161b - f) * (ebVar.f160a - f2)) - ((ebVar.f161b - f) * (ebVar3.f160a - f2));
    }

    /* renamed from: a */
    public static void m310a(eb[] ebVarArr) {
        eb ebVar;
        eb ebVar2;
        eb ebVar3;
        float a = eb.m308a(ebVarArr[0], ebVarArr[1]);
        float a2 = eb.m308a(ebVarArr[1], ebVarArr[2]);
        float a3 = eb.m308a(ebVarArr[0], ebVarArr[2]);
        if (a2 >= a && a2 >= a3) {
            ebVar = ebVarArr[0];
            ebVar2 = ebVarArr[1];
            ebVar3 = ebVarArr[2];
        } else if (a3 < a2 || a3 < a) {
            ebVar = ebVarArr[2];
            ebVar2 = ebVarArr[0];
            ebVar3 = ebVarArr[1];
        } else {
            ebVar = ebVarArr[1];
            ebVar2 = ebVarArr[0];
            ebVar3 = ebVarArr[2];
        }
        if (eb.m309a(ebVar2, ebVar, ebVar3) >= 0.0f) {
            eb ebVar4 = ebVar3;
            ebVar3 = ebVar2;
            ebVar2 = ebVar4;
        }
        ebVarArr[0] = ebVar3;
        ebVarArr[1] = ebVar;
        ebVarArr[2] = ebVar2;
    }

    /* renamed from: a */
    public final float m311a() {
        return this.f160a;
    }

    /* renamed from: b */
    public final float m312b() {
        return this.f161b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof eb)) {
            return false;
        }
        eb ebVar = (eb) obj;
        return this.f161b == ebVar.f161b && this.f160a == ebVar.f160a;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f161b) * 31) + Float.floatToIntBits(this.f160a);
    }

    public final String toString() {
        return "(" + this.f161b + ',' + this.f160a + ')';
    }
}
