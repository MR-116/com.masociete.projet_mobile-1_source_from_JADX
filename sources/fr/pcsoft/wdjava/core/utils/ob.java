package fr.pcsoft.wdjava.core.utils;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDEntier8;
import fr.pcsoft.wdjava.ui.p065b.p067a.qb;
import java.io.ByteArrayOutputStream;

public class ob {
    /* renamed from: a */
    public static final char[] f2140a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', qb.f3206v, 'b', qb.f3191f, 'd', 'e', 'f'};
    /* renamed from: z */
    private static final String[] f2141z = new String[]{m4113z(m4114z("\u0001\nM\u001b+a\u001dS\u0007%l\u0016Z\b&k\rI")), m4113z(m4114z("\u0007y4\u0011")), m4113z(m4114z("/C")), m4113z(m4114z("\u0007y8\u0011")), m4113z(m4114z("\u0001\nC\u00079v\bB\u001d/}\u0000B\u001f+n\u0000H\f")), m4113z(m4114z("\u0001\u000fC\u001b'c\u001dS\u0000$t\b@\u0000.g")), m4113z(m4114z("\u0007y>\u0011"))};

    /* renamed from: a */
    public static final long m4108a(String str) {
        long j = 0;
        try {
            j = Long.parseLong(str, 16);
        } catch (NumberFormatException e) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                switch (str.charAt(i)) {
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                    case 'A':
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'E':
                    case 'F':
                    case 'a':
                    case 'b':
                    case 'c':
                    case 'd':
                    case 'e':
                    case 'f':
                        break;
                    default:
                        WDErreurManager.m2883a(C0745b.m3222b(f2141z[0], String.valueOf(r5)));
                        break;
                }
            }
        }
        return j;
    }

    /* renamed from: a */
    public static final String m4109a(byte b) {
        return String.format(f2141z[6], new Object[]{Integer.valueOf(b & 255)});
    }

    /* renamed from: a */
    public static final String m4110a(WDObjet wDObjet, int i) {
        int i2;
        StringBuilder stringBuilder = new StringBuilder();
        if (((WDEntier8) wDObjet.getValeur().checkType(WDEntier8.class)) != null) {
            i2 = 16;
            stringBuilder.append(Long.toHexString(wDObjet.getLong()).toUpperCase());
        } else {
            i2 = 8;
            stringBuilder.append(Integer.toHexString(wDObjet.getInt()).toUpperCase());
        }
        while (stringBuilder.length() < i2) {
            try {
                stringBuilder.insert(0, '0');
            } catch (NumberFormatException e) {
                throw e;
            }
        }
        int max = Math.max(0, i);
        if (max > 0 && max < i2) {
            i2 %= max;
            if (i2 > 0) {
                try {
                    stringBuilder.insert(i2, ' ');
                    i2++;
                } catch (NumberFormatException e2) {
                    throw e2;
                }
            }
            while (true) {
                i2 += max;
                try {
                    if (i2 >= stringBuilder.length()) {
                        break;
                    }
                    stringBuilder.insert(i2, ' ');
                    i2++;
                } catch (NumberFormatException e22) {
                    throw e22;
                }
            }
        }
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public static final String m4111a(byte[] bArr, int i, int i2) {
        int i3;
        int length = bArr.length;
        if (i == 0) {
            i3 = 1;
            Object obj = null;
        } else {
            int i4 = 1;
            i3 = i;
        }
        if (i3 == 1 || i3 == 2 || i3 == 4) {
            Object obj2;
            int i5;
            Object obj3;
            int i6;
            if ((i2 & 512) > 0) {
                obj2 = 1;
                i5 = i2 & -513;
            } else {
                obj2 = null;
                i5 = i2;
            }
            if ((i5 & 1024) > 0) {
                obj3 = null;
                i6 = i5 & -1025;
            } else {
                int i7 = 1;
                i6 = i5;
            }
            if (i6 == 0) {
                i6 = 16;
            }
            int max = Math.max(i6, i3);
            StringBuilder stringBuilder = new StringBuilder(length * 2);
            int i8 = 0;
            i5 = 0;
            i6 = i3;
            while (i8 < length) {
                if (i6 == 2 && i8 + 1 >= length) {
                    i6 = 1;
                }
                i3 = (i6 != 4 || i8 + 3 < length) ? i6 : 1;
                if (i3 == 1) {
                    byte b = bArr[i8];
                    i8++;
                    i6 = i5 + 1;
                    stringBuilder.append(m4109a(b));
                    i5 = i8;
                } else if (i3 == 2) {
                    i6 = obj2 != null ? ((bArr[i8] & 255) << 8) + (bArr[i8 + 1] & 255) : ((bArr[i8 + 1] & 255) << 8) + (bArr[i8] & 255);
                    i8 += 2;
                    i5 += 2;
                    stringBuilder.append(String.format(f2141z[3], new Object[]{Integer.valueOf(i6)}));
                    i6 = i5;
                    i5 = i8;
                } else {
                    if (i3 == 4) {
                        i6 = obj2 != null ? ((((bArr[i8] & 255) << 24) + ((bArr[i8 + 1] & 255) << 16)) + ((bArr[i8 + 2] & 255) << 8)) + (bArr[i8 + 3] & 255) : ((((bArr[i8 + 3] & 255) << 24) + ((bArr[i8 + 2] & 255) << 16)) + ((bArr[i8 + 1] & 255) << 8)) + (bArr[i8] & 255);
                        i8 += 4;
                        i5 += 4;
                        stringBuilder.append(String.format(f2141z[1], new Object[]{Integer.valueOf(i6)}));
                    }
                    i6 = i5;
                    i5 = i8;
                }
                if (obj3 != null && i6 >= max && i5 < length) {
                    stringBuilder.append(f2141z[2]);
                    i8 = i5;
                    i5 = 0;
                    i6 = i3;
                } else if (obj == null || i5 >= length) {
                    i8 = i5;
                    i5 = i6;
                    i6 = i3;
                } else {
                    stringBuilder.append(' ');
                    i8 = i5;
                    i5 = i6;
                    i6 = i3;
                }
            }
            return stringBuilder.toString();
        }
        try {
            WDErreurManager.m2883a(C0745b.m3222b(f2141z[4], new String[0]));
            return "";
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* renamed from: a */
    public static final byte[] m4112a(String str, int i, int i2) {
        if (i == 0) {
            i = 1;
        }
        if (i == 1 || i == 2 || i == 4) {
            int length = str.length();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[i];
            int i3 = 0;
            int i4 = 0;
            while (i4 < length) {
                int i5;
                char charAt = str.charAt(i4);
                switch (charAt) {
                    case '\n':
                    case '\r':
                    case ' ':
                        i4++;
                        continue;
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                    case 'A':
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'E':
                    case 'F':
                    case 'a':
                    case 'b':
                    case 'c':
                    case 'd':
                    case 'e':
                    case 'f':
                        break;
                    default:
                        WDErreurManager.m2883a(C0745b.m3222b(f2141z[5], new String[0]));
                        break;
                }
                if (i4 + 1 >= length) {
                    try {
                        WDErreurManager.m2883a(C0745b.m3222b(f2141z[5], new String[0]));
                    } catch (NumberFormatException e) {
                        throw e;
                    }
                }
                byte digit = (byte) ((Character.digit(charAt, 16) << 4) + Character.digit(str.charAt(i4 + 1), 16));
                if (i3 < i) {
                    i5 = i3 + 1;
                    try {
                        bArr[i3] = digit;
                    } catch (NumberFormatException e2) {
                        throw e2;
                    }
                }
                i5 = i3;
                i4 += 2;
                if (i5 == i || i4 >= length) {
                    if ((i2 & 512) > 0) {
                        i3 = 0;
                        while (i3 < i5) {
                            try {
                                byteArrayOutputStream.write(bArr[i3]);
                                i3++;
                            } catch (NumberFormatException e22) {
                                throw e22;
                            }
                        }
                        i5 = 0;
                    } else {
                        i5--;
                        while (i5 >= 0) {
                            try {
                                byteArrayOutputStream.write(bArr[i5]);
                                i5--;
                            } catch (NumberFormatException e222) {
                                throw e222;
                            }
                        }
                        i5 = 0;
                    }
                }
                i3 = i5;
            }
            return byteArrayOutputStream.toByteArray();
        }
        try {
            WDErreurManager.m2883a(C0745b.m3222b(f2141z[4], new String[0]));
            return new byte[0];
        } catch (NumberFormatException e2222) {
            throw e2222;
        }
    }

    /* renamed from: z */
    private static String m4113z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 34;
                    break;
                case 1:
                    i2 = 73;
                    break;
                case 2:
                    i2 = 12;
                    break;
                case 3:
                    i2 = 73;
                    break;
                default:
                    i2 = 106;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m4114z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 106);
        }
        return toCharArray;
    }
}
