package fr.pcsoft.wdjava.geo;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.net.Uri;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.application.WDAppManager;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.p042b.C0657a;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.core.utils.kb;
import fr.pcsoft.wdjava.ui.activite.C1056i;
import fr.pcsoft.wdjava.ui.dialogue.C1372f;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: fr.pcsoft.wdjava.geo.d */
public class C0915d {
    /* renamed from: a */
    public static final int f2498a = 23;
    /* renamed from: b */
    public static final int f2499b = 2;
    /* renamed from: c */
    public static final int f2500c = 1;
    /* renamed from: z */
    private static final String[] f2501z = new String[]{C0915d.m6528z(C0915d.m6529z("\u0000->}}j=>plf17`hb22|jw74atm15poj-+`")), C0915d.m6528z(C0915d.m6529z("J\r+]NP\u001b\u0015[")), C0915d.m6528z(C0915d.m6529z("\u0000;#lns*2`e|9>`hl:>}")), C0915d.m6528z(C0915d.m6529z("p\u001b\tYB@\u001b[ADW^:YJJ\u0012\u001aMGF")), C0915d.m6528z(C0915d.m6529z("p\u001b\tYB@\u001b[FX\u0003\u0010\u0014[\u000bB\b\u001aFGB\u001c\u0017J")), C0915d.m6528z(C0915d.m6529z("}V'\u0002\u0014\u001aPs\u0005\u001c\"\u001f\u0005\u0002\rQ\u0003wPTSs\u0006\u001c\"\u001f\u0004w\rA'K\u0001\nZ")), C0915d.m6528z(C0915d.m6529z("f\u001d\u0013JH\u0003\u001a\u001e\u000fG\u0004\u001f\u000b_NO^\u001fJ\u000bO\u001f[BÂW\u0016\u0014KN\u0003\r\u000fN_J\u000f\u000eJ\u000bJ\r+]NP\u001b\u0015[\u000bG\u001b[CJ\u0003\u001d\u0017NXP\u001b[hNL=\u0014KNQP")), C0915d.m6528z(C0915d.m6529z("\u0000;)}td;4cd`?7fxb*2`e|22j~")), C0915d.m6528z(C0915d.m6529z("\u0000;)}tb+8zef!:kyf-(j")), C0915d.m6528z(C0915d.m6529z("\u0000;)}tm<$|n`15kn|=3nbm;$|n{?<jxj3:cn")), C0915d.m6528z(C0915d.m6529z("\u0000;)}te1)bjw!8gjj0$|n{?<jxj3:c")), C0915d.m6528z(C0915d.m6529z("\u0000;)}tm<$bbm+/jt`6:fef!(jsb9>|bn?7j")), C0915d.m6528z(C0915d.m6529z("\u0006\r^\u001f\u0018GÎ^\u001f\u0019GY^\u001f\u0019GY\\")), C0915d.m6528z(C0915d.m6529z("@\u0011\u0016\u0001LL\u0011\u001cCN\r\u001f\u0015KYL\u0017\u001f\u0001JS\u000e\b\u0001FB\u000e\b")), C0915d.m6528z(C0915d.m6529z("D\u001b\u0014\u0015\u000e\u0012R^\u001d\u0014RC^\u001e\u0007\u0006LS\n\u0018\n")), C0915d.m6528z(C0915d.m6529z("\u0000?+gj!8nyw1<}js62jtm15pq1.ynf")), C0915d.m6528z(C0915d.m6529z("@\u0011\u0016\u0001LL\u0011\u001cCN\r\u001f\u0015KYL\u0017\u001f\u0001FB\u000e\b\u0001fB\u000e\bnHW\u0017\rF_Z")), C0915d.m6528z(C0915d.m6529z("B\u0010\u001f]DJ\u001aUFEW\u001b\u0015[\u0005B\u001d\u000fFDMP-fnt")), C0915d.m6528z(C0915d.m6529z("\u000f^")), C0915d.m6528z(C0915d.m6529z("\u0000?8{bl0$nem+7jn|+/fgj-:{nv,")), C0915d.m6528z(C0915d.m6529z("K\n\u000f_\u0011\fQ\u0016N[PP\u001c@DD\u0012\u001e\u0001HL\u0013TBJS\rDI\u0016GX\bNOG\fF\n\u001a\u000f[I\tOB\u001a\u001f]\u0016\u0006MW\n\u001f")), C0915d.m6528z(C0915d.m6529z("D\u0011\u0014HGFP\b[YF\u001b\u000fYBF\tALIO\u0012F\n\u001a\u000f[I\tFYC^\u001c")), C0915d.m6528z(C0915d.m6529z("\u0000=4axw?5{n|75ldq,>lf")), C0915d.m6528z(C0915d.m6529z("D\u001b\u0014\u0015\u000e\u0012R^\u001d\u0014YC^\u001c"))};

    /* renamed from: a */
    public static final Address m6518a(String str) throws C0918i {
        List<Address> a = C0915d.m6521a(str, 10);
        if (a != null) {
            try {
                if (!a.isEmpty()) {
                    if (a.size() <= 1) {
                        return (Address) a.get(0);
                    }
                    String[] strArr = new String[a.size()];
                    int i = 0;
                    for (Address a2 : a) {
                        try {
                            int i2 = i + 1;
                            strArr[i] = C0915d.m6520a(a2);
                            i = i2;
                        } catch (C0918i e) {
                            throw e;
                        }
                    }
                    int a3 = C1372f.m9828a().mo3744a(strArr);
                    if (a3 >= 0) {
                        try {
                            return (Address) a.get(a3);
                        } catch (C0918i e2) {
                            throw e2;
                        }
                    }
                    throw new C0918i(C0745b.m3222b(f2501z[19], new String[0]));
                }
            } catch (C0918i e22) {
                throw e22;
            }
        }
        throw new C0918i(C0745b.m3222b(f2501z[8], new String[0]));
    }

    /* renamed from: a */
    public static final String m6519a(double d) {
        int i;
        int i2;
        int i3;
        int i4 = (int) d;
        double abs = Math.abs(d - ((double) i4));
        i4 %= 360;
        if (abs != 0.0d) {
            abs *= 60.0d;
            i = (int) abs;
            abs -= (double) i;
            if (abs != 0.0d) {
                i2 = (int) ((abs * 60.0d) + 0.5d);
                if (i2 >= 60) {
                    i++;
                    i2 -= 60;
                }
            } else {
                i2 = 0;
            }
            if (i >= 60) {
                i3 = (i4 > 0 ? 1 : -1) + i4;
                i -= 60;
            } else {
                i3 = i4;
            }
        } else {
            i = 0;
            i2 = 0;
            i3 = i4;
        }
        i4 = i3 < 0 ? -i3 : i3;
        try {
            String str = f2501z[12];
            Object[] objArr = new Object[4];
            objArr[0] = d < 0.0d ? "-" : "";
            objArr[1] = Integer.valueOf(i4);
            objArr[2] = Integer.valueOf(i);
            objArr[3] = Integer.valueOf(i2);
            return String.format(str, objArr);
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    /* renamed from: a */
    private static final String m6520a(Address address) {
        StringBuilder stringBuilder = new StringBuilder();
        int maxAddressLineIndex = address.getMaxAddressLineIndex();
        for (int i = 0; i <= maxAddressLineIndex; i++) {
            if (i > 0) {
                try {
                    stringBuilder.append(f2501z[18]);
                } catch (ActivityNotFoundException e) {
                    throw e;
                }
            }
            stringBuilder.append(address.getAddressLine(i));
        }
        String countryName = address.getCountryName();
        if (countryName != null) {
            try {
                if (!stringBuilder.toString().endsWith(countryName)) {
                    if (stringBuilder.length() > 0) {
                        stringBuilder.append(f2501z[18]);
                    }
                    stringBuilder.append(countryName);
                }
            } catch (ActivityNotFoundException e2) {
                throw e2;
            } catch (ActivityNotFoundException e22) {
                throw e22;
            }
        }
        return stringBuilder.toString();
    }

    /* renamed from: a */
    private static final List<Address> m6521a(String str, int i) throws C0918i {
        if (kb.m3986p() >= C0657a.GINGERBREAD.getNumero()) {
            try {
                if (!((Boolean) Geocoder.class.getMethod(f2501z[1], new Class[0]).invoke(null, new Object[0])).booleanValue()) {
                    throw new C0918i(C0745b.m3222b(f2501z[0], new String[0]));
                }
            } catch (Exception e) {
                throw e;
            } catch (Exception e2) {
                C0691a.m2856a(f2501z[6]);
            }
        }
        Geocoder geocoder = new Geocoder(WDAppManager.m2544C());
        try {
            Matcher matcher = Pattern.compile(f2501z[5]).matcher(str.trim());
            return (matcher.matches() && matcher.groupCount() == 2) ? geocoder.getFromLocation(C0725i.m3084m(matcher.group(1)), C0725i.m3084m(matcher.group(2)), 1) : geocoder.getFromLocationName(str, Math.max(1, i));
        } catch (Exception e3) {
            throw e3;
        } catch (IOException e4) {
            try {
                if (e4.getMessage().indexOf(f2501z[4]) < 0) {
                    if (e4.getMessage().indexOf(f2501z[3]) < 0) {
                        throw new C0918i(C0745b.m3222b(f2501z[7], new String[0]), e4.getMessage());
                    }
                }
                throw new C0918i(C0745b.m3222b(f2501z[2], new String[0]));
            } catch (Exception e32) {
                throw e32;
            } catch (Exception e322) {
                throw e322;
            }
        }
    }

    /* renamed from: a */
    public static final void m6522a(WDGeoPosition wDGeoPosition, int i, int i2) throws C0918i {
        String str = "";
        int max = Math.max(1, Math.min(23, i));
        switch (i2) {
            case 1:
                str = C0808l.m4021a(f2501z[23], String.valueOf(wDGeoPosition.m6480n().getLatitude()), String.valueOf(wDGeoPosition.m6480n().getLongitude()), String.valueOf(max));
                break;
            case 2:
                str = C0808l.m4021a(f2501z[21], String.valueOf(wDGeoPosition.m6480n().getLatitude()), String.valueOf(wDGeoPosition.m6480n().getLongitude()), String.valueOf(max));
                break;
            default:
                WDErreurManager.m2883a(C0745b.m3222b(f2501z[22], new String[0]));
                break;
        }
        try {
            C1056i.m7562a().startActivity(new Intent(f2501z[17], Uri.parse(str)));
        } catch (ActivityNotFoundException e) {
            WDErreurManager.m2883a(C0745b.m3222b(f2501z[15], new String[0]));
        }
    }

    /* renamed from: a */
    public static final void m6523a(WDGeoPosition wDGeoPosition, WDGeoPosition wDGeoPosition2) throws C0918i {
        try {
            Intent intent = new Intent(f2501z[17], Uri.parse(C0808l.m4021a(f2501z[20], String.valueOf(wDGeoPosition.m6480n().getLatitude()), String.valueOf(wDGeoPosition.m6480n().getLongitude()), String.valueOf(wDGeoPosition2.m6480n().getLatitude()), String.valueOf(wDGeoPosition2.m6480n().getLongitude()))));
            intent.setComponent(new ComponentName(f2501z[13], f2501z[16]));
            Context a = C1056i.m7562a();
            if (a == null) {
                a = WDAppManager.m2544C();
                intent.setFlags(268435456);
            }
            a.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            WDErreurManager.m2883a(C0745b.m3222b(f2501z[15], new String[0]));
        }
    }

    /* renamed from: a */
    public static final void m6524a(WDGeoPosition wDGeoPosition, String str) throws C0918i {
        try {
            Intent intent = new Intent(f2501z[17], Uri.parse(C0808l.m4021a(f2501z[14], String.valueOf(wDGeoPosition.m6480n().getLatitude()), String.valueOf(wDGeoPosition.m6480n().getLongitude()), str)));
            intent.setComponent(new ComponentName(f2501z[13], f2501z[16]));
            C1056i.m7562a().startActivity(intent);
        } catch (ActivityNotFoundException e) {
            WDErreurManager.m2883a(C0745b.m3222b(f2501z[15], new String[0]));
        }
    }

    /* renamed from: b */
    public static final List<Address> m6525b(String str, int i) throws C0918i {
        List<Address> a = C0915d.m6521a(str, i);
        if (a != null) {
            try {
                if (!a.isEmpty()) {
                    return a;
                }
            } catch (C0918i e) {
                throw e;
            }
        }
        throw new C0918i(C0745b.m3222b(f2501z[8], new String[0]));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    private static final double[] m6526b(java.lang.String r15) throws java.text.ParseException {
        /*
        r14 = 3;
        r13 = 1;
        r3 = -1;
        r12 = 2;
        r2 = 0;
        r4 = new double[r14];
        r5 = new int[r14];
        r5 = {-1, -1, -1};
        r6 = r15.length();
        r0 = 176; // 0xb0 float:2.47E-43 double:8.7E-322;
        r0 = r15.indexOf(r0);
        r5[r2] = r0;
        r0 = 18;
        r1 = new char[r0];
        r1 = {39, 8217, 699, 700, 701, 702, 703, 712, 1370, 8216, 8221, 96, 180, 8242, 8245, 697, -22645, -22644};
        r0 = r2;
    L_0x0020:
        r7 = 2;
        r7 = r5[r7];	 Catch:{ ParseException -> 0x004a }
        if (r7 != r3) goto L_0x004c;
    L_0x0025:
        r7 = r1.length;	 Catch:{ ParseException -> 0x004a }
        if (r0 >= r7) goto L_0x004c;
    L_0x0028:
        r7 = r1[r0];
        r7 = java.lang.String.valueOf(r7);
        r8 = new java.lang.StringBuilder;
        r8.<init>();
        r7 = r8.append(r7);
        r8 = r1[r0];
        r7 = r7.append(r8);
        r7 = r7.toString();
        r7 = r15.indexOf(r7);
        r5[r12] = r7;
        r0 = r0 + 1;
        goto L_0x0020;
    L_0x004a:
        r0 = move-exception;
        throw r0;
    L_0x004c:
        r0 = 2;
        r0 = r5[r0];	 Catch:{ ParseException -> 0x0077 }
        if (r0 != r3) goto L_0x005a;
    L_0x0051:
        r0 = 2;
        r7 = 34;
        r7 = r15.indexOf(r7);	 Catch:{ ParseException -> 0x0077 }
        r5[r0] = r7;	 Catch:{ ParseException -> 0x0077 }
    L_0x005a:
        r0 = r2;
    L_0x005b:
        r7 = 1;
        r7 = r5[r7];	 Catch:{ ParseException -> 0x0079 }
        if (r7 == r3) goto L_0x0068;
    L_0x0060:
        r7 = 1;
        r7 = r5[r7];	 Catch:{ ParseException -> 0x007b }
        r8 = 2;
        r8 = r5[r8];	 Catch:{ ParseException -> 0x007b }
        if (r7 != r8) goto L_0x007f;
    L_0x0068:
        r7 = r1.length;	 Catch:{ ParseException -> 0x007d }
        if (r0 >= r7) goto L_0x007f;
    L_0x006b:
        r7 = 1;
        r8 = r1[r0];	 Catch:{ ParseException -> 0x007d }
        r8 = r15.indexOf(r8);	 Catch:{ ParseException -> 0x007d }
        r5[r7] = r8;	 Catch:{ ParseException -> 0x007d }
        r0 = r0 + 1;
        goto L_0x005b;
    L_0x0077:
        r0 = move-exception;
        throw r0;
    L_0x0079:
        r0 = move-exception;
        throw r0;	 Catch:{ ParseException -> 0x007b }
    L_0x007b:
        r0 = move-exception;
        throw r0;	 Catch:{ ParseException -> 0x007d }
    L_0x007d:
        r0 = move-exception;
        throw r0;
    L_0x007f:
        r0 = 1;
        r0 = r5[r0];	 Catch:{ ParseException -> 0x00ed }
        r1 = 2;
        r1 = r5[r1];	 Catch:{ ParseException -> 0x00ed }
        if (r0 != r1) goto L_0x008b;
    L_0x0087:
        r0 = 1;
        r1 = -1;
        r5[r0] = r1;	 Catch:{ ParseException -> 0x00ed }
    L_0x008b:
        r0 = 1;
        r0 = r5[r0];	 Catch:{ ParseException -> 0x00ef }
        if (r0 == r3) goto L_0x0098;
    L_0x0090:
        r0 = 0;
        r0 = r5[r0];	 Catch:{ ParseException -> 0x00f1 }
        r1 = 1;
        r1 = r5[r1];	 Catch:{ ParseException -> 0x00f1 }
        if (r0 > r1) goto L_0x00a5;
    L_0x0098:
        r0 = 2;
        r0 = r5[r0];	 Catch:{ ParseException -> 0x00f3 }
        if (r0 == r3) goto L_0x00a9;
    L_0x009d:
        r0 = 0;
        r0 = r5[r0];	 Catch:{ ParseException -> 0x00f5 }
        r1 = 2;
        r1 = r5[r1];	 Catch:{ ParseException -> 0x00f5 }
        if (r0 <= r1) goto L_0x00a9;
    L_0x00a5:
        r0 = 0;
        r1 = -1;
        r5[r0] = r1;	 Catch:{ ParseException -> 0x00f5 }
    L_0x00a9:
        r1 = r2;
        r0 = r3;
    L_0x00ab:
        if (r1 >= r14) goto L_0x014f;
    L_0x00ad:
        r8 = 0;
        r4[r1] = r8;	 Catch:{ ParseException -> 0x00f7 }
        r7 = r5[r1];	 Catch:{ ParseException -> 0x00f7 }
        if (r7 == 0) goto L_0x014b;
    L_0x00b5:
        r7 = r5[r1];	 Catch:{ ParseException -> 0x00f9 }
        if (r7 <= r0) goto L_0x014b;
    L_0x00b9:
        r7 = r0 + 1;
        if (r7 >= r6) goto L_0x0149;
    L_0x00bd:
        r0 = r0 + 1;
        r0 = r15.substring(r0);
        if (r1 >= r12) goto L_0x00fd;
    L_0x00c5:
        r8 = r4[r1];	 Catch:{ ParseException -> 0x00fb }
        r0 = fr.pcsoft.wdjava.core.C0725i.m3064d(r0);	 Catch:{ ParseException -> 0x00fb }
        r10 = (double) r0;	 Catch:{ ParseException -> 0x00fb }
        r8 = r8 + r10;
        r4[r1] = r8;	 Catch:{ ParseException -> 0x00fb }
    L_0x00cf:
        r8 = r4[r1];	 Catch:{ ParseException -> 0x00eb }
        r10 = 0;
        r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r0 >= 0) goto L_0x0107;
    L_0x00d7:
        r0 = new java.text.ParseException;	 Catch:{ ParseException -> 0x00eb }
        r1 = f2501z;	 Catch:{ ParseException -> 0x00eb }
        r2 = 10;
        r1 = r1[r2];	 Catch:{ ParseException -> 0x00eb }
        r2 = 0;
        r2 = new java.lang.String[r2];	 Catch:{ ParseException -> 0x00eb }
        r1 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r1, r2);	 Catch:{ ParseException -> 0x00eb }
        r2 = 0;
        r0.<init>(r1, r2);	 Catch:{ ParseException -> 0x00eb }
        throw r0;	 Catch:{ ParseException -> 0x00eb }
    L_0x00eb:
        r0 = move-exception;
        throw r0;
    L_0x00ed:
        r0 = move-exception;
        throw r0;
    L_0x00ef:
        r0 = move-exception;
        throw r0;	 Catch:{ ParseException -> 0x00f1 }
    L_0x00f1:
        r0 = move-exception;
        throw r0;	 Catch:{ ParseException -> 0x00f3 }
    L_0x00f3:
        r0 = move-exception;
        throw r0;	 Catch:{ ParseException -> 0x00f5 }
    L_0x00f5:
        r0 = move-exception;
        throw r0;
    L_0x00f7:
        r0 = move-exception;
        throw r0;	 Catch:{ ParseException -> 0x00f9 }
    L_0x00f9:
        r0 = move-exception;
        throw r0;
    L_0x00fb:
        r0 = move-exception;
        throw r0;
    L_0x00fd:
        r8 = r4[r1];
        r10 = fr.pcsoft.wdjava.core.C0725i.m3084m(r0);
        r8 = r8 + r10;
        r4[r1] = r8;
        goto L_0x00cf;
    L_0x0107:
        if (r1 != r13) goto L_0x0128;
    L_0x0109:
        r0 = 1;
        r8 = r4[r0];	 Catch:{ ParseException -> 0x0126 }
        r10 = 4633641066610819072; // 0x404e000000000000 float:0.0 double:60.0;
        r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r0 < 0) goto L_0x0128;
    L_0x0112:
        r0 = new java.text.ParseException;	 Catch:{ ParseException -> 0x0126 }
        r1 = f2501z;	 Catch:{ ParseException -> 0x0126 }
        r2 = 11;
        r1 = r1[r2];	 Catch:{ ParseException -> 0x0126 }
        r2 = 0;
        r2 = new java.lang.String[r2];	 Catch:{ ParseException -> 0x0126 }
        r1 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r1, r2);	 Catch:{ ParseException -> 0x0126 }
        r2 = 0;
        r0.<init>(r1, r2);	 Catch:{ ParseException -> 0x0126 }
        throw r0;	 Catch:{ ParseException -> 0x0126 }
    L_0x0126:
        r0 = move-exception;
        throw r0;
    L_0x0128:
        if (r1 != r12) goto L_0x0149;
    L_0x012a:
        r0 = 2;
        r8 = r4[r0];	 Catch:{ ParseException -> 0x0147 }
        r10 = 4633641066610819072; // 0x404e000000000000 float:0.0 double:60.0;
        r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r0 < 0) goto L_0x0149;
    L_0x0133:
        r0 = new java.text.ParseException;	 Catch:{ ParseException -> 0x0147 }
        r1 = f2501z;	 Catch:{ ParseException -> 0x0147 }
        r2 = 9;
        r1 = r1[r2];	 Catch:{ ParseException -> 0x0147 }
        r2 = 0;
        r2 = new java.lang.String[r2];	 Catch:{ ParseException -> 0x0147 }
        r1 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r1, r2);	 Catch:{ ParseException -> 0x0147 }
        r2 = 0;
        r0.<init>(r1, r2);	 Catch:{ ParseException -> 0x0147 }
        throw r0;	 Catch:{ ParseException -> 0x0147 }
    L_0x0147:
        r0 = move-exception;
        throw r0;
    L_0x0149:
        r0 = r5[r1];
    L_0x014b:
        r1 = r1 + 1;
        goto L_0x00ab;
    L_0x014f:
        if (r0 == r3) goto L_0x0152;
    L_0x0151:
        return r4;
    L_0x0152:
        r0 = new java.text.ParseException;
        r1 = f2501z;
        r3 = 10;
        r1 = r1[r3];
        r3 = new java.lang.String[r2];
        r1 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r1, r3);
        r0.<init>(r1, r2);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.geo.d.b(java.lang.String):double[]");
    }

    /* renamed from: c */
    public static final double m6527c(String str) throws C0918i {
        try {
            if (C0808l.m4053k(str)) {
                return 0.0d;
            }
            int i;
            Object obj = new double[]{0.0d, 0.0d, 0.0d};
            if (str.charAt(0) == '-') {
                i = -1;
                str = str.substring(1);
            } else {
                i = 1;
            }
            try {
                double[] b = C0915d.m6526b(str);
                return (((0.0d + ((double) (((int) b[0]) % 360))) + (b[1] / 60.0d)) + (b[2] / 3600.0d)) * ((double) i);
            } catch (ParseException e) {
                throw new C0918i(e.getMessage());
            }
        } catch (ParseException e2) {
            throw e2;
        }
    }

    /* renamed from: z */
    private static String m6528z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 35;
                    break;
                case 1:
                    i2 = 126;
                    break;
                case 2:
                    i2 = 123;
                    break;
                case 3:
                    i2 = 47;
                    break;
                default:
                    i2 = 43;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m6529z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 43);
        }
        return toCharArray;
    }
}
