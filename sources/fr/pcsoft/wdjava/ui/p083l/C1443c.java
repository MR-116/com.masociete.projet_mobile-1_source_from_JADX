package fr.pcsoft.wdjava.ui.p083l;

import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.core.types.WDMonetaire;
import fr.pcsoft.wdjava.core.types.WDReel;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.ui.champs.C0515x;
import fr.pcsoft.wdjava.ui.champs.gc;
import java.text.CharacterIterator;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.StringCharacterIterator;
import java.util.Currency;
import java.util.Locale;

/* renamed from: fr.pcsoft.wdjava.ui.l.c */
public class C1443c implements nb {
    /* renamed from: B */
    private static final String[] f4270B;
    /* renamed from: g */
    private static final int f4271g = 2;
    /* renamed from: j */
    private static final String f4272j = C1443c.m10124z(C1443c.m10125z("i+%\nw=8\u001bcI\t*\u001cm"));
    /* renamed from: l */
    private static final char f4273l = ' ';
    /* renamed from: n */
    private static final int f4274n = 1;
    /* renamed from: p */
    private static final String f4275p = C1443c.m10124z(C1443c.m10125z("`-8\u0004UM>."));
    /* renamed from: t */
    private static final int f4276t = 0;
    /* renamed from: v */
    private static final String f4277v = C1443c.m10124z(C1443c.m10125z("i+%\nw=8\u001bcI\t*\u001cm\u0000"));
    /* renamed from: A */
    private C0515x f4278A;
    /* renamed from: a */
    private String f4279a = "";
    /* renamed from: b */
    private boolean f4280b = false;
    /* renamed from: c */
    private char f4281c = f4273l;
    /* renamed from: d */
    private int f4282d = 0;
    /* renamed from: e */
    private int f4283e = 0;
    /* renamed from: f */
    private char f4284f = ',';
    /* renamed from: h */
    private boolean f4285h = false;
    /* renamed from: i */
    private int f4286i = 0;
    /* renamed from: k */
    private boolean f4287k = false;
    /* renamed from: m */
    private boolean f4288m = false;
    /* renamed from: o */
    private boolean f4289o = false;
    /* renamed from: q */
    private String f4290q = "";
    /* renamed from: r */
    private int f4291r = -1;
    /* renamed from: s */
    private String f4292s = "€";
    /* renamed from: u */
    private int f4293u = 0;
    /* renamed from: w */
    private boolean f4294w = false;
    /* renamed from: x */
    private DecimalFormat f4295x = new DecimalFormat();
    /* renamed from: y */
    private boolean f4296y = true;
    /* renamed from: z */
    private String f4297z = "";

    static {
        r0 = new String[15];
        r0[0] = C1443c.m10124z(C1443c.m10125z("xj\u001646\t}\u0016\u00146\b"));
        r0[1] = C1443c.m10124z(C1443c.m10125z("\f\u001f\u0017A"));
        r0[2] = C1443c.m10124z(C1443c.m10125z("j\u0016\u00146Y"));
        r0[3] = C1443c.m10124z(C1443c.m10125z("Xl\u0010"));
        r0[4] = C1443c.m10124z(C1443c.m10125z("Ymb"));
        r0[5] = C1443c.m10124z(C1443c.m10125z("y{b"));
        r0[6] = C1443c.m10124z(C1443c.m10125z("tfV[_tg"));
        r0[7] = C1443c.m10124z(C1443c.m10125z("\ng"));
        r0[8] = C1443c.m10124z(C1443c.m10125z("y{"));
        r0[9] = C1443c.m10124z(C1443c.m10125z("zi0_*\u00159"));
        r0[10] = C1443c.m10124z(C1443c.m10125z("e1(\u001ah\u0004'#\u000ekTd%HcW0k\u000euW+(\u0006ï\u0004%>OkE7:\u001ac\n"));
        r0[11] = C1443c.m10124z(C1443c.m10125z("\u001d}rV?\u001d}rV?\u001d}rV?\u001d}rV?\u001d"));
        r0[12] = C1443c.m10124z(C1443c.m10125z("\u0004`"));
        r0[13] = C1443c.m10124z(C1443c.m10125z("\u000f}kV?\u001ddrV?\u0004}rV"));
        r0[14] = C1443c.m10124z(C1443c.m10125z("\b}r"));
        f4270B = r0;
    }

    public C1443c(C0515x c0515x, boolean z) {
        this.f4278A = c0515x;
        this.f4294w = z;
    }

    /* renamed from: a */
    private String m10120a(String str, boolean z) {
        return str;
    }

    /* renamed from: a */
    public static final void m10121a(int i, String str) {
    }

    /* renamed from: b */
    private void m10122b(String str) {
        Object obj = null;
        try {
            if (this.f4278A == null) {
                C0691a.m2856a(f4270B[10]);
            } else if (this.f4278A.isFinSaisieAutomatique()) {
                int length = str.length();
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                while (i < length) {
                    char charAt = str.charAt(i);
                    try {
                        if (!Character.isDigit(charAt)) {
                            if (charAt != '.') {
                                try {
                                    if (charAt != this.f4284f) {
                                    }
                                } catch (IllegalArgumentException e) {
                                    throw e;
                                }
                            }
                            obj = 1;
                        } else if (obj != null) {
                            i2++;
                        } else {
                            i3++;
                        }
                        i++;
                    } catch (IllegalArgumentException e2) {
                        throw e2;
                    } catch (IllegalArgumentException e22) {
                        throw e22;
                    }
                }
                try {
                    if (i2 + i3 < this.f4286i) {
                        if (this.f4287k) {
                            try {
                                if (i2 < this.f4293u) {
                                    return;
                                }
                            } catch (IllegalArgumentException e222) {
                                throw e222;
                            }
                        }
                        return;
                    }
                    ((gc) this.f4278A).transfererFocus();
                } catch (IllegalArgumentException e2222) {
                    throw e2222;
                } catch (IllegalArgumentException e22222) {
                    throw e22222;
                }
            }
        } catch (IllegalArgumentException e222222) {
            throw e222222;
        }
    }

    /* renamed from: d */
    private void m10123d(String str) {
        CharacterIterator stringCharacterIterator = new StringCharacterIterator(str);
        char first = stringCharacterIterator.first();
        while (stringCharacterIterator.getIndex() < stringCharacterIterator.getEndIndex()) {
            try {
                switch (first) {
                    case '%':
                        try {
                            if (stringCharacterIterator.getIndex() < str.length() - 1) {
                                if (str.charAt(stringCharacterIterator.getIndex()) == '%') {
                                    this.f4279a = this.f4279a.substring(0, stringCharacterIterator.getIndex()) + this.f4279a.substring(stringCharacterIterator.getIndex() + 1, this.f4279a.length());
                                    stringCharacterIterator.next();
                                    break;
                                }
                            }
                            this.f4285h = true;
                            break;
                        } catch (IllegalArgumentException e) {
                            throw e;
                        } catch (IllegalArgumentException e2) {
                            throw e2;
                        }
                    case '+':
                        this.f4288m = true;
                        break;
                    case ',':
                        this.f4287k = true;
                        break;
                    case '0':
                        try {
                            if (this.f4291r == -1) {
                                this.f4291r = stringCharacterIterator.getIndex();
                            }
                            try {
                                if (this.f4287k) {
                                    this.f4283e++;
                                    this.f4293u++;
                                } else {
                                    this.f4282d++;
                                }
                                this.f4286i++;
                                break;
                            } catch (IllegalArgumentException e22) {
                                throw e22;
                            }
                        } catch (IllegalArgumentException e222) {
                            throw e222;
                        }
                    case '9':
                        try {
                            if (this.f4291r == -1) {
                                this.f4291r = stringCharacterIterator.getIndex();
                            }
                            try {
                                if (this.f4287k) {
                                    this.f4293u++;
                                } else {
                                    this.f4282d++;
                                }
                                this.f4286i++;
                                break;
                            } catch (IllegalArgumentException e2222) {
                                throw e2222;
                            }
                        } catch (IllegalArgumentException e22222) {
                            throw e22222;
                        }
                    default:
                        break;
                }
                first = stringCharacterIterator.next();
            } catch (IllegalArgumentException e222222) {
                throw e222222;
            } catch (IllegalArgumentException e2222222) {
                throw e2222222;
            }
        }
        try {
            if (this.f4286i == 0) {
                this.f4297z = f4270B[2];
            } else {
                try {
                    if (this.f4288m) {
                        this.f4297z = f4270B[9];
                        this.f4297z += f4270B[6] + this.f4282d + "}";
                    } else {
                        this.f4297z = f4270B[6] + this.f4282d + "}";
                    }
                    String a = C0808l.m4020a(String.valueOf(this.f4284f), false);
                    try {
                        if (this.f4287k) {
                            this.f4297z += f4270B[1] + a + f4270B[8];
                            this.f4297z += f4270B[3] + a + f4270B[0] + this.f4293u + f4270B[4];
                        } else {
                            this.f4297z += f4270B[1] + a + f4270B[5];
                        }
                    } catch (IllegalArgumentException e22222222) {
                        throw e22222222;
                    }
                } catch (IllegalArgumentException e222222222) {
                    throw e222222222;
                }
            }
            try {
                this.f4290q = "#";
                if (this.f4287k) {
                    this.f4290q += f4270B[7];
                }
                try {
                    this.f4295x.applyPattern(this.f4290q);
                    this.f4295x.setGroupingSize(0);
                    this.f4295x.setMaximumIntegerDigits(this.f4282d);
                    this.f4295x.setMinimumIntegerDigits(1);
                    if (this.f4287k) {
                        this.f4295x.setMinimumFractionDigits(this.f4293u - this.f4283e);
                        this.f4295x.setMaximumFractionDigits(this.f4293u);
                    }
                } catch (IllegalArgumentException e2222222222) {
                    throw e2222222222;
                }
            } catch (IllegalArgumentException e22222222222) {
                throw e22222222222;
            }
        } catch (IllegalArgumentException e222222222222) {
            throw e222222222222;
        }
    }

    /* renamed from: z */
    private static String m10124z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 36;
                    break;
                case 1:
                    i2 = 68;
                    break;
                case 2:
                    i2 = 75;
                    break;
                case 3:
                    i2 = 111;
                    break;
                default:
                    i2 = 6;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m10125z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 6);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public final int mo3780a() {
        return 0;
    }

    /* renamed from: a */
    public String mo3781a(C0515x c0515x, String str, int i, int i2, nb nbVar) {
        try {
            if (this.f4278A == null) {
                C0691a.m2856a(f4270B[10]);
                return str;
            }
            this.f4280b = false;
            String str2 = "";
            try {
                str2 = c0515x.getTexteAffiche().substring(0, i) + str + c0515x.getTexteAffiche().substring(i + i2, c0515x.getTexteAffiche().length());
                try {
                    if (str2.matches(this.f4297z)) {
                        this.f4296y = true;
                        str2 = str2.replace(this.f4284f, '.');
                        if (this.f4285h) {
                            str2 = String.valueOf(C0725i.m3084m(str2) / 100.0d);
                        }
                        try {
                            if (this.f4294w) {
                                this.f4278A.modifValeurInterne(new WDMonetaire(str2).getString());
                            } else {
                                this.f4278A.modifValeurInterne(str2);
                            }
                            m10122b(str2);
                            return str;
                        } catch (StringIndexOutOfBoundsException e) {
                            throw e;
                        }
                    }
                    this.f4296y = false;
                    if (this.f4289o) {
                        c0515x.selectionnerTout();
                    }
                    return "";
                } catch (StringIndexOutOfBoundsException e2) {
                    throw e2;
                } catch (StringIndexOutOfBoundsException e22) {
                    throw e22;
                }
            } catch (StringIndexOutOfBoundsException e3) {
                return str;
            }
        } catch (StringIndexOutOfBoundsException e222) {
            throw e222;
        }
    }

    /* renamed from: a */
    public String mo3782a(C0515x c0515x, String str, int i, int i2, boolean z, boolean z2, nb nbVar) {
        try {
            if (this.f4278A == null) {
                C0691a.m2856a(f4270B[10]);
                return str;
            } else if (i < 0) {
                return str;
            } else {
                this.f4280b = z2;
                str = m10120a(str, z);
                String str2 = "";
                try {
                    str2 = c0515x.getTexteAffiche().substring(0, i) + str + c0515x.getTexteAffiche().substring(i + i2, c0515x.getTexteAffiche().length());
                    try {
                        if (str2.matches(this.f4297z)) {
                            this.f4296y = true;
                            str2 = str2.replace(this.f4284f, '.');
                            if (this.f4285h) {
                                str2 = String.valueOf(C0725i.m3084m(str2) / 100.0d);
                            }
                            try {
                                if (this.f4294w) {
                                    this.f4278A.modifValeurInterne(new WDMonetaire(str2).getString());
                                } else {
                                    this.f4278A.modifValeurInterne(str2);
                                }
                                m10122b(str2);
                                return str;
                            } catch (StringIndexOutOfBoundsException e) {
                                throw e;
                            }
                        }
                        this.f4296y = false;
                        if (this.f4289o) {
                            c0515x.selectionnerTout();
                        }
                        return "";
                    } catch (StringIndexOutOfBoundsException e2) {
                        throw e2;
                    } catch (StringIndexOutOfBoundsException e22) {
                        throw e22;
                    }
                } catch (StringIndexOutOfBoundsException e3) {
                    return str;
                }
            }
        } catch (StringIndexOutOfBoundsException e222) {
            throw e222;
        }
    }

    /* renamed from: a */
    public void mo3783a(String str) {
        WDProjet instance = WDProjet.getInstance();
        boolean equals = str.equals(f4272j);
        boolean equals2 = !equals ? str.equals(f4277v) : false;
        if (equals || equals2) {
            StringBuilder stringBuilder = new StringBuilder(f4270B[13]);
            int nombreDecimaleMonetaire = instance.getNombreDecimaleMonetaire();
            if (nombreDecimaleMonetaire < 0) {
                try {
                    stringBuilder.append(f4270B[14]);
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            } else if (nombreDecimaleMonetaire > 0) {
                stringBuilder.append(',');
                int i = 0;
                while (i < nombreDecimaleMonetaire) {
                    try {
                        stringBuilder.append('9');
                        i++;
                    } catch (IllegalArgumentException e2) {
                        throw e2;
                    }
                }
            }
            if (equals2) {
                try {
                    stringBuilder.append(f4270B[12]);
                } catch (IllegalArgumentException e22) {
                    throw e22;
                }
            }
            str = stringBuilder.toString();
        } else if (str.equals(f4275p)) {
            str = f4270B[11];
            this.f4289o = true;
        }
        try {
            boolean z = !this.f4279a.equals("");
            this.f4282d = 0;
            this.f4293u = 0;
            this.f4286i = 0;
            this.f4288m = false;
            this.f4287k = false;
            this.f4297z = "";
            this.f4296y = true;
            this.f4285h = false;
            this.f4295x = new DecimalFormat();
            DecimalFormatSymbols decimalFormatSymbols = this.f4295x.getDecimalFormatSymbols();
            try {
                String separateurDecimaleMonetaire = this.f4294w ? instance.getSeparateurDecimaleMonetaire() : instance.getSeparateurDecimale();
                try {
                    if (C0808l.m4053k(separateurDecimaleMonetaire)) {
                        this.f4284f = decimalFormatSymbols.getDecimalSeparator();
                        equals2 = false;
                    } else {
                        this.f4284f = separateurDecimaleMonetaire.charAt(0);
                        decimalFormatSymbols.setDecimalSeparator(this.f4284f);
                        equals2 = true;
                    }
                    try {
                        String separateurMillierMonetaire = this.f4294w ? instance.getSeparateurMillierMonetaire() : instance.getSeparateurMillier();
                        try {
                            if (C0808l.m4053k(separateurMillierMonetaire)) {
                                this.f4281c = f4273l;
                            } else {
                                this.f4281c = separateurMillierMonetaire.charAt(0);
                            }
                            if (equals2) {
                                try {
                                    this.f4295x.setDecimalFormatSymbols(decimalFormatSymbols);
                                } catch (IllegalArgumentException e222) {
                                    throw e222;
                                }
                            }
                            try {
                                if (this.f4294w) {
                                    try {
                                        this.f4292s = WDProjet.getInstance().getSymboleMonetaire();
                                        if (C0808l.m4053k(this.f4292s)) {
                                            try {
                                                this.f4292s = Currency.getInstance(Locale.getDefault()).getSymbol();
                                            } catch (IllegalArgumentException e3) {
                                                this.f4292s = "€";
                                            }
                                        }
                                    } catch (StringIndexOutOfBoundsException e4) {
                                        throw e4;
                                    }
                                }
                                try {
                                    this.f4290q = "";
                                    this.f4291r = -1;
                                    this.f4283e = 0;
                                    this.f4279a = str;
                                    m10123d(this.f4279a);
                                    if (!z) {
                                        return;
                                    }
                                    if (this.f4278A != null) {
                                        ((gc) this.f4278A).setValeur(((gc) this.f4278A).getValeur().getString());
                                    }
                                } catch (IllegalArgumentException e2222) {
                                    throw e2222;
                                } catch (IllegalArgumentException e22222) {
                                    throw e22222;
                                }
                            } catch (IllegalArgumentException e222222) {
                                throw e222222;
                            }
                        } catch (IllegalArgumentException e2222222) {
                            throw e2222222;
                        }
                    } catch (IllegalArgumentException e22222222) {
                        throw e22222222;
                    }
                } catch (IllegalArgumentException e222222222) {
                    throw e222222222;
                }
            } catch (IllegalArgumentException e2222222222) {
                throw e2222222222;
            }
        } catch (IllegalArgumentException e22222222222) {
            throw e22222222222;
        }
    }

    /* renamed from: b */
    public final int mo3784b() {
        return 0;
    }

    /* renamed from: c */
    public String m10131c(String str) {
        Object obj = null;
        try {
            if (this.f4289o) {
                return str;
            }
            try {
                if (str.equals("")) {
                    return this.f4295x.format(0.0d);
                }
                String format;
                StringBuffer stringBuffer = new StringBuffer("");
                StringCharacterIterator stringCharacterIterator = new StringCharacterIterator(str);
                char first = stringCharacterIterator.first();
                Object obj2 = null;
                Object obj3 = null;
                while (stringCharacterIterator.getIndex() < stringCharacterIterator.getEndIndex()) {
                    try {
                        if (Character.isDigit(first)) {
                            stringBuffer.append(first);
                        } else {
                            try {
                                if ((first == this.f4284f || first == '.') && r2 == null) {
                                    stringBuffer.append('.');
                                    int i = 1;
                                    int i2 = 1;
                                } else if (first == '-' && r3 == null) {
                                    stringBuffer.append('-');
                                    int i3 = 1;
                                }
                            } catch (Exception e) {
                                throw e;
                            } catch (Exception e2) {
                                throw e2;
                            }
                        }
                        first = stringCharacterIterator.next();
                    } catch (Exception e22) {
                        throw e22;
                    } catch (Exception e222) {
                        throw e222;
                    }
                }
                String str2 = "";
                if (obj3 != null) {
                    try {
                        format = this.f4295x.format(Double.parseDouble(stringBuffer.toString()));
                    } catch (Exception e3) {
                        return str;
                    }
                }
                format = this.f4295x.format(Long.parseLong(stringBuffer.toString()));
                return format;
            } catch (Exception e2222) {
                throw e2222;
            }
        } catch (Exception e22222) {
            throw e22222;
        }
    }

    /* renamed from: c */
    public void mo3785c() {
        this.f4279a = null;
        this.f4297z = null;
        this.f4295x = null;
        this.f4290q = null;
        this.f4278A = null;
    }

    /* renamed from: d */
    public boolean mo3786d() {
        return this.f4296y;
    }

    /* renamed from: e */
    public String m10134e(String str) {
        try {
            if (this.f4278A == null) {
                C0691a.m2856a(f4270B[10]);
                return str;
            }
            double m = C0725i.m3084m(str);
            try {
                if (this.f4294w) {
                    this.f4278A.modifValeurInterne(new WDMonetaire(str).getString());
                } else if (m - ((double) ((int) m)) == 0.0d) {
                    try {
                        this.f4278A.modifValeurInterne(new WDEntier4(m).getString());
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                } else {
                    this.f4278A.modifValeurInterne(new WDReel(m).getString());
                }
                if (this.f4285h) {
                    m *= 100.0d;
                }
                int i = this.f4282d;
                try {
                    if (this.f4288m && m < 0.0d) {
                        i++;
                    }
                    if (new Long((long) m).toString().length() <= i) {
                        return m10136f("" + m);
                    }
                    StringBuffer stringBuffer = new StringBuffer("");
                    int i2 = 0;
                    while (i2 < this.f4282d) {
                        try {
                            stringBuffer.append('+');
                            i2++;
                        } catch (IllegalArgumentException e2) {
                            throw e2;
                        }
                    }
                    return stringBuffer.toString();
                } catch (IllegalArgumentException e22) {
                    throw e22;
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

    /* renamed from: e */
    public boolean m10135e() {
        try {
            if (!this.f4287k) {
                if (!this.f4285h) {
                    return false;
                }
            }
            return true;
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    /* renamed from: f */
    public String m10136f(String str) {
        String replace = str.replace(this.f4284f, '.');
        try {
            if (this.f4289o) {
                if (this.f4278A != null) {
                    replace = ((gc) this.f4278A).getString();
                }
                return C0808l.m4012a(C0725i.m3084m(replace), 5182);
            }
            int indexOf;
            int indexOf2;
            char charAt;
            char c;
            double m = C0725i.m3084m(replace);
            if (m == 0.0d) {
                try {
                    if (this.f4278A != null) {
                        if (this.f4278A.isMiseABlancSiZero()) {
                            return "";
                        }
                    }
                } catch (IllegalArgumentException e) {
                    throw e;
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            }
            String format = this.f4295x.format(m);
            StringBuffer stringBuffer = new StringBuffer("");
            replace = "";
            if (m < 0.0d) {
                replace = "-";
                format = format.substring(1, format.length());
            }
            if (this.f4287k) {
                indexOf = this.f4279a.indexOf(44) - 1;
                indexOf2 = format.indexOf(this.f4284f) - 1;
                if (indexOf2 < -1) {
                    indexOf2 = format.length() - 1;
                }
            } else {
                indexOf = this.f4279a.length() - 1;
                indexOf2 = format.length() - 1;
            }
            Object obj = indexOf2 < 0 ? 1 : null;
            while (indexOf >= 0) {
                charAt = this.f4279a.charAt(indexOf);
                c = '\u0000';
                if (obj == null) {
                    c = format.charAt(indexOf2);
                }
                if (obj == null && c == '-') {
                    indexOf2--;
                }
                switch (charAt) {
                    case ' ':
                    case '.':
                        try {
                            if (indexOf < this.f4291r) {
                                stringBuffer.insert(0, charAt);
                                break;
                            } else if (obj == null) {
                                try {
                                    stringBuffer.insert(0, this.f4281c);
                                    break;
                                } catch (IllegalArgumentException e22) {
                                    throw e22;
                                }
                            }
                        } catch (IllegalArgumentException e222) {
                            throw e222;
                        }
                        break;
                    case '$':
                        if (indexOf > 0) {
                            try {
                                if (this.f4279a.charAt(indexOf - 1) == '$') {
                                    stringBuffer.insert(0, '$');
                                    indexOf--;
                                    break;
                                }
                            } catch (IllegalArgumentException e2222) {
                                throw e2222;
                            }
                        }
                        stringBuffer.insert(0, this.f4292s);
                        break;
                    case '+':
                        stringBuffer.insert(0, replace);
                        break;
                    case '0':
                        if (obj != null) {
                            stringBuffer.insert(0, '0');
                            break;
                        }
                        try {
                            stringBuffer.insert(0, c);
                            indexOf2--;
                            break;
                        } catch (IllegalArgumentException e22222) {
                            throw e22222;
                        }
                    case '9':
                        if (obj == null) {
                            try {
                                stringBuffer.insert(0, c);
                                indexOf2--;
                                break;
                            } catch (IllegalArgumentException e222222) {
                                throw e222222;
                            }
                        }
                        break;
                    default:
                        stringBuffer.insert(0, charAt);
                        break;
                }
                if (obj == null && r3 < 0) {
                    indexOf2 = 0;
                    obj = 1;
                }
                indexOf--;
            }
            if (this.f4287k) {
                indexOf = this.f4279a.indexOf(44) + 1;
                indexOf2 = format.indexOf(this.f4284f) + 1;
                if (indexOf2 == 0) {
                    indexOf2 = format.length();
                } else {
                    stringBuffer.append(this.f4284f);
                }
                try {
                    obj = indexOf2 >= format.length() ? 1 : null;
                    while (indexOf < this.f4279a.length()) {
                        charAt = this.f4279a.charAt(indexOf);
                        c = '\u0000';
                        if (obj == null) {
                            c = format.charAt(indexOf2);
                        }
                        switch (charAt) {
                            case ' ':
                            case '.':
                                if (obj != null) {
                                    stringBuffer.append(' ');
                                    break;
                                }
                                try {
                                    stringBuffer.append(this.f4281c);
                                    break;
                                } catch (IllegalArgumentException e2222222) {
                                    throw e2222222;
                                }
                            case '$':
                                try {
                                    if (indexOf < this.f4279a.length() - 1) {
                                        if (this.f4279a.charAt(indexOf + 1) == '$') {
                                            stringBuffer.append('$');
                                            indexOf++;
                                            break;
                                        }
                                    }
                                    stringBuffer.append(this.f4292s);
                                    break;
                                } catch (IllegalArgumentException e22222222) {
                                    throw e22222222;
                                } catch (IllegalArgumentException e222222222) {
                                    throw e222222222;
                                }
                            case '+':
                                stringBuffer.append(replace);
                                break;
                            case '0':
                            case '9':
                                if (obj == null) {
                                    try {
                                        stringBuffer.append(c);
                                        indexOf2++;
                                        break;
                                    } catch (IllegalArgumentException e2222222222) {
                                        throw e2222222222;
                                    }
                                }
                                break;
                            default:
                                stringBuffer.append(charAt);
                                break;
                        }
                        if (obj == null) {
                            try {
                                if (indexOf2 >= format.length()) {
                                    indexOf2 = 0;
                                    obj = 1;
                                }
                            } catch (IllegalArgumentException e22222222222) {
                                throw e22222222222;
                            }
                        }
                        indexOf++;
                    }
                } catch (IllegalArgumentException e222222222222) {
                    throw e222222222222;
                }
            }
            return stringBuffer.toString();
        } catch (IllegalArgumentException e2222222222222) {
            throw e2222222222222;
        } catch (IllegalArgumentException e22222222222222) {
            throw e22222222222222;
        }
    }

    /* renamed from: f */
    public final boolean m10137f() {
        return this.f4287k;
    }

    /* renamed from: g */
    public final boolean m10138g() {
        return this.f4288m;
    }

    public String toString() {
        return this.f4279a;
    }
}
