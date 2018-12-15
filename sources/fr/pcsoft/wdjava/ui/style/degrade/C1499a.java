package fr.pcsoft.wdjava.ui.style.degrade;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.database.hf.requete.parsing.C0538a;

/* renamed from: fr.pcsoft.wdjava.ui.style.degrade.a */
public class C1499a implements IWDDegrade {
    /* renamed from: z */
    private static final String f4532z = C1499a.m10396z(C1499a.m10397z("@r\u0016kq%u\u000b.qi~\u0010ou`1\u001a{2aø\u0019|saø"));
    /* renamed from: a */
    private int f4533a;
    /* renamed from: b */
    private int f4534b;
    /* renamed from: c */
    private int f4535c;
    /* renamed from: d */
    private Shader f4536d;
    /* renamed from: e */
    private float[] f4537e;
    /* renamed from: f */
    private int f4538f;
    /* renamed from: g */
    private int f4539g;
    /* renamed from: h */
    private int[] f4540h;

    public C1499a(int[] iArr, int i) {
        this(iArr, i, null);
    }

    public C1499a(int[] iArr, int i, float[] fArr) {
        this.f4535c = 0;
        this.f4536d = null;
        this.f4533a = 0;
        this.f4538f = 0;
        this.f4539g = 0;
        this.f4534b = 0;
        this.f4540h = iArr;
        this.f4537e = fArr;
        this.f4535c = Math.min(360, Math.max(Math.abs(i), 0));
        int i2 = this.f4535c % 45;
        if (i2 <= 0) {
            return;
        }
        if (i2 > 23) {
            try {
                this.f4535c = (45 - i2) + this.f4535c;
                return;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        this.f4535c -= i2;
    }

    /* renamed from: z */
    private static String m10396z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 5;
                    break;
                case 1:
                    i2 = 17;
                    break;
                case 2:
                    i2 = 126;
                    break;
                case 3:
                    i2 = 14;
                    break;
                default:
                    i2 = 18;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m10397z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 18);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public int mo3805a(int i) {
        int i2 = 1;
        try {
            if (this.f4540h.length == 0) {
                throw new IllegalArgumentException();
            }
            try {
                if (this.f4540h.length == 1) {
                    return this.f4540h[0];
                }
                float[] fArr = new float[this.f4540h.length];
                fArr[0] = 0.0f;
                int length = this.f4540h.length - 2;
                if (length > 0) {
                    int i3 = 1;
                    while (i3 <= length) {
                        try {
                            if (this.f4537e == null) {
                                fArr[i3] = fArr[i3 - 1] + ((float) ((int) Math.ceil(100.0d / ((double) (length + 1)))));
                            } else {
                                fArr[i3] = this.f4537e[i3 - 1];
                            }
                            i3++;
                        } catch (IllegalArgumentException e) {
                            throw e;
                        }
                    }
                }
                try {
                    fArr[this.f4540h.length - 1] = 100.0f;
                    if (((float) i) <= fArr[0]) {
                        return this.f4540h[0];
                    }
                    try {
                        if (((float) i) >= fArr[fArr.length - 1]) {
                            return this.f4540h[fArr.length - 1];
                        }
                        while (i2 < fArr.length) {
                            try {
                                if (((float) i) <= fArr[i2]) {
                                    float f = (((float) i) - fArr[i2 - 1]) / (fArr[i2] - fArr[i2 - 1]);
                                    int i4 = this.f4540h[i2 - 1];
                                    i2 = this.f4540h[i2];
                                    return Color.argb((int) Math.floor((double) ((((float) Color.alpha(i4)) * (1.0f - f)) + (((float) Color.alpha(i2)) * f))), (int) Math.floor((double) ((((float) Color.red(i4)) * (1.0f - f)) + (((float) Color.red(i2)) * f))), (int) Math.floor((double) ((((float) Color.green(i4)) * (1.0f - f)) + (((float) Color.green(i2)) * f))), (int) Math.floor((double) ((((float) Color.blue(i2)) * f) + (((float) Color.blue(i4)) * (1.0f - f)))));
                                }
                                i2++;
                            } catch (IllegalArgumentException e2) {
                                throw e2;
                            }
                        }
                        return -16777216;
                    } catch (IllegalArgumentException e22) {
                        throw e22;
                    }
                } catch (IllegalArgumentException e222) {
                    throw e222;
                }
            } catch (IllegalArgumentException e2222) {
                throw e2222;
            }
        } catch (IllegalArgumentException e22222) {
            throw e22222;
        }
    }

    /* renamed from: a */
    public Shader mo3806a(int i, int i2) {
        return mo3807a(0, 0, i, i2);
    }

    /* renamed from: a */
    public Shader mo3807a(int i, int i2, int i3, int i4) {
        try {
            int i5;
            int i6;
            int i7;
            int i8;
            if (this.f4536d != null) {
                if (this.f4539g == i3) {
                    try {
                        if (this.f4534b == i4) {
                            try {
                                if (this.f4533a == i) {
                                    try {
                                        if (this.f4538f == i2) {
                                            return this.f4536d;
                                        }
                                    } catch (IllegalArgumentException e) {
                                        throw e;
                                    }
                                }
                            } catch (IllegalArgumentException e2) {
                                throw e2;
                            }
                        }
                    } catch (IllegalArgumentException e22) {
                        throw e22;
                    }
                }
            }
            switch (this.f4535c) {
                case 45:
                    i5 = i2 + i4;
                    i6 = i2;
                    i7 = i + i3;
                    i8 = i;
                    break;
                case 90:
                    i5 = i2 + i4;
                    i6 = i2;
                    i7 = i;
                    i8 = i;
                    break;
                case C0538a.Nb /*135*/:
                    i8 = i + i3;
                    i5 = i2 + i4;
                    i6 = i2;
                    i7 = i;
                    break;
                case 180:
                    i5 = i2;
                    i6 = i2;
                    i7 = i;
                    i8 = i + i3;
                    break;
                case 225:
                    i8 = i + i3;
                    i5 = i2;
                    i6 = i2 + i4;
                    i7 = i;
                    break;
                case C0607n.al /*270*/:
                    i5 = i2;
                    i6 = i2 + i4;
                    i7 = i;
                    i8 = i;
                    break;
                case 315:
                    i5 = i2;
                    i6 = i2 + i4;
                    i7 = i + i3;
                    i8 = i;
                    break;
                default:
                    i5 = i2;
                    i6 = i2;
                    i7 = i + i3;
                    i8 = i;
                    break;
            }
            this.f4536d = new LinearGradient((float) i8, (float) i6, (float) i7, (float) i5, this.f4540h, this.f4537e, TileMode.CLAMP);
            this.f4533a = i;
            this.f4538f = i2;
            this.f4539g = i3;
            this.f4534b = i4;
            return this.f4536d;
        } catch (IllegalArgumentException e222) {
            throw e222;
        } catch (IllegalArgumentException e2222) {
            throw e2222;
        }
    }

    /* renamed from: a */
    public final GradientDrawable mo3808a() {
        Orientation orientation = Orientation.TOP_BOTTOM;
        switch (this.f4535c) {
            case 45:
                orientation = Orientation.TL_BR;
                break;
            case 90:
                orientation = Orientation.TOP_BOTTOM;
                break;
            case C0538a.Nb /*135*/:
                orientation = Orientation.TR_BL;
                break;
            case 180:
                orientation = Orientation.RIGHT_LEFT;
                break;
            case 225:
                orientation = Orientation.BR_TL;
                break;
            case C0607n.al /*270*/:
                orientation = Orientation.BOTTOM_TOP;
                break;
            case 315:
                orientation = Orientation.BL_TR;
                break;
            default:
                orientation = Orientation.LEFT_RIGHT;
                break;
        }
        return new GradientDrawable(orientation, this.f4540h);
    }

    /* renamed from: b */
    public int mo3809b() {
        try {
            return this.f4540h != null ? this.f4540h.length > 0 ? this.f4540h[0] : 0 : 0;
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    /* renamed from: c */
    public void mo3810c() {
        this.f4540h = null;
        this.f4537e = null;
        this.f4536d = null;
    }

    /* renamed from: d */
    public /* bridge */ /* synthetic */ IWDDegrade mo3811d() {
        return m10405e();
    }

    /* renamed from: e */
    public C1499a m10405e() {
        try {
            C1499a c1499a = (C1499a) clone();
            c1499a.f4536d = null;
            return c1499a;
        } catch (Exception e) {
            C0691a.m2863b(f4532z, e);
            return this;
        }
    }
}
