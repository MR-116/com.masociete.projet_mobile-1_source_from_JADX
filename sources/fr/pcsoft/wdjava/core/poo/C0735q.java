package fr.pcsoft.wdjava.core.poo;

import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDVoid;
import fr.pcsoft.wdjava.core.utils.C0808l;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: fr.pcsoft.wdjava.core.poo.q */
public class C0735q {
    /* renamed from: z */
    private static final String[] f1869z = new String[]{C0735q.m3134z(C0735q.m3135z("GLgOa0HwQ{%\\j^q*ZaOk']pHl;ZtSm;YtO)")), C0735q.m3134z(C0735q.m3135z("\t^qB")), C0735q.m3134z(C0735q.m3135z("\u0012^qB")), C0735q.m3134z(C0735q.m3135z("GLgOa'EtNm!V|S{<@fI*]p")), C0735q.m3134z(C0735q.m3135z("\u0002^qB")), C0735q.m3134z(C0735q.m3135z("#^q^")), C0735q.m3134z(C0735q.m3135z("#^q^n")), C0735q.m3134z(C0735q.m3135z("DyTo\u001e\rgAoQ\u0017yP~J\rf[")), C0735q.m3134z(C0735q.m3135z("3Mvq_\u0017zP")), C0735q.m3134z(C0735q.m3135z("-dErM\u0017`Wq[Dm\u0012|]\u0007àQxLDh@=S\u0001dWo[D")), C0735q.m3134z(C0735q.m3135z("\u0013mRxP")), C0735q.m3134z(C0735q.m3135z("GGzBs!]}Rz!")), C0735q.m3134z(C0735q.m3135z("\u0014^qB")), C0735q.m3134z(C0735q.m3135z("GGzBs!DwO{")), C0735q.m3134z(C0735q.m3135z("GLgO{1[jO{'\\eXl%]|Rp;DpP|6L")), C0735q.m3134z(C0735q.m3135z("GJy\\m7LjN*ZjM6HxXj6L")), C0735q.m3134z(C0735q.m3135z("\u0002{\u001bm]\u0017fSi\u0010\u0013m_|H\u0005'RxQJ^qZ[\u000bYZnW\u0010`Zs")), C0735q.m3134z(C0735q.m3135z("3MrxQ4fFtJ\rf[")), C0735q.m3134z(C0735q.m3135z("-dErM\u0017`Wq[DmP=J\u0016f@k[\u0016)Y|\u001e\u0007eTnM\u0001)Qh\u001e @{R\u001e#àZmQ\u0017`AtQ\n'"))};

    /* renamed from: a */
    public static WDObjet m3112a(WDObjet wDObjet, String str, String str2) {
        Field a = C0735q.m3120a(wDObjet.getClass(), str, str2);
        if (a != null) {
            try {
                a.setAccessible(true);
                return (WDObjet) a.get(wDObjet);
            } catch (Exception e) {
                WDErreurManager.m2883a(C0745b.m3222b(f1869z[14], C0735q.m3127c(str), C0735q.m3117a((Object) wDObjet)));
                return null;
            }
        }
        WDErreurManager.m2883a(C0745b.m3222b(f1869z[13], C0735q.m3117a((Object) wDObjet), C0735q.m3127c(str)));
        return null;
    }

    /* renamed from: a */
    public static WDObjet m3113a(WDObjet wDObjet, String str, WDObjet[] wDObjetArr) {
        if (str != null) {
            try {
                if (!str.equals("")) {
                    Class[] clsArr;
                    if (wDObjetArr != null) {
                        clsArr = new Class[wDObjetArr.length];
                        int i = 0;
                        while (i < clsArr.length) {
                            try {
                                clsArr[i] = WDObjet.class;
                                i++;
                            } catch (NoSuchMethodException e) {
                                throw e;
                            }
                        }
                    }
                    clsArr = null;
                    try {
                        Method method = wDObjet.getClass().getMethod(str, clsArr);
                        method.setAccessible(true);
                        WDObjet wDObjet2 = (WDObjet) method.invoke(wDObjet, (Object[]) wDObjetArr);
                        return wDObjet2 == null ? new WDVoid(C0735q.m3133h(str)) : wDObjet2;
                    } catch (NoSuchMethodException e2) {
                        throw e2;
                    } catch (Throwable e3) {
                        WDErreurManager.m2888b(e3);
                        return null;
                    } catch (NoSuchMethodException e4) {
                        WDErreurManager.m2883a(C0745b.m3222b(f1869z[11], C0735q.m3117a((Object) wDObjet), C0735q.m3133h(str)));
                        return null;
                    }
                }
            } catch (NoSuchMethodException e22) {
                throw e22;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static Object m3114a(Class cls, Class cls2, Object obj) throws SecurityException, NoSuchMethodException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Constructor declaredConstructor = cls.getDeclaredConstructor(new Class[]{cls2});
        declaredConstructor.setAccessible(true);
        return declaredConstructor.newInstance(new Object[]{obj});
    }

    /* renamed from: a */
    public static Object m3115a(Class cls, Class cls2, Object obj, Class[] clsArr, Object[] objArr) throws SecurityException, NoSuchMethodException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Object obj2 = new Class[(clsArr.length + 1)];
        obj2[0] = cls2;
        System.arraycopy(clsArr, 0, obj2, 1, clsArr.length);
        Constructor declaredConstructor = cls.getDeclaredConstructor(obj2);
        declaredConstructor.setAccessible(true);
        Object obj3 = new Object[(objArr.length + 1)];
        obj3[0] = obj;
        System.arraycopy(objArr, 0, obj3, 1, objArr.length);
        return declaredConstructor.newInstance(obj3);
    }

    /* renamed from: a */
    public static String m3116a(Class cls) {
        String name = cls.getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            try {
                name = name.substring(lastIndexOf + 1);
            } catch (SecurityException e) {
                throw e;
            }
        }
        return name;
    }

    /* renamed from: a */
    public static String m3117a(Object obj) {
        return obj != null ? C0735q.m3128d(obj.getClass()) : "";
    }

    /* renamed from: a */
    public static final Constructor m3118a(String str) throws NoSuchMethodException {
        try {
            return C0735q.m3125b(C0735q.m3130e(str));
        } catch (ClassNotFoundException e) {
            WDErreurManager.m2883a(C0745b.m3222b(f1869z[3], str));
            return null;
        }
    }

    /* renamed from: a */
    public static Constructor<C0558c> m3119a(String str, boolean z) {
        if (!z) {
            return C0735q.m3118a(str);
        }
        try {
            return C0735q.m3132g(str);
        } catch (NoSuchMethodException e) {
            WDErreurManager.m2883a(C0745b.m3222b(f1869z[0], new String[0]));
            return null;
        }
    }

    /* renamed from: a */
    public static final Field m3120a(Class cls, String str, String str2) {
        int i = 0;
        try {
            if (!(C0808l.m4053k(str2) || str.startsWith(str2))) {
                str = str2 + str;
            }
            String a = C0725i.m3031a(str, false);
            Field[] a2 = C0735q.m3123a(cls, true);
            if (a2 != null) {
                while (i < a2.length) {
                    Field field = a2[i];
                    try {
                        if (field.getName().equalsIgnoreCase(a)) {
                            field.setAccessible(true);
                            return field;
                        }
                        i++;
                    } catch (SecurityException e) {
                        throw e;
                    }
                }
            }
            try {
                return !str2.equals(f1869z[2]) ? C0735q.m3120a(cls, a, f1869z[2]) : null;
            } catch (SecurityException e2) {
                throw e2;
            }
        } catch (SecurityException e22) {
            throw e22;
        }
    }

    /* renamed from: a */
    public static final Field m3121a(Class cls, String str, boolean z) {
        Field a;
        Exception e;
        if (z) {
            Class superclass = cls.getSuperclass();
            if (superclass != null) {
                try {
                    if (!superclass.getSimpleName().equals(f1869z[8])) {
                        a = C0735q.m3120a(cls, str, "");
                        return a;
                    }
                } catch (Exception e2) {
                    throw e2;
                }
            }
        }
        try {
            a = cls.getDeclaredField(str);
            try {
                a.setAccessible(true);
            } catch (Exception e3) {
                e = e3;
                C0691a.m2857a(f1869z[9] + str + f1869z[7], e);
                return a;
            }
        } catch (Exception e22) {
            Exception exception = e22;
            a = null;
            e = exception;
            C0691a.m2857a(f1869z[9] + str + f1869z[7], e);
            return a;
        }
        return a;
    }

    /* renamed from: a */
    public static Method m3122a(Class cls, String str, int i) {
        int i2 = 0;
        Method method = null;
        Method[] methods = cls.getMethods();
        int i3 = 0;
        while (i3 < methods.length) {
            try {
                Method method2;
                if (methods[i3].getName().equalsIgnoreCase(str)) {
                    Method method3 = methods[i3];
                    int length = method3.getParameterTypes().length;
                    if (i >= 0) {
                        if (length == i) {
                            return method3;
                        }
                    } else if (length >= i2) {
                        i2 = length;
                        method2 = method3;
                        i3++;
                        method = method2;
                    }
                }
                method2 = method;
                i3++;
                method = method2;
            } catch (SecurityException e) {
                throw e;
            }
        }
        return method;
    }

    /* renamed from: a */
    public static Field[] m3123a(Class cls, boolean z) {
        Object declaredFields = cls.getDeclaredFields();
        if (z) {
            Class superclass = cls.getSuperclass();
            if (superclass != null) {
                Object a = C0735q.m3123a(superclass, z);
                int length = a.length;
                if (a != null && length > 0) {
                    Object obj = new Field[(declaredFields.length + length)];
                    System.arraycopy(a, 0, obj, 0, length);
                    System.arraycopy(declaredFields, 0, obj, length, declaredFields.length);
                    return obj;
                }
            }
        }
        return declaredFields;
    }

    /* renamed from: b */
    public static final Class m3124b(String str) {
        Class cls = null;
        try {
            if (str.equalsIgnoreCase(f1869z[17])) {
                try {
                    cls = Class.forName(f1869z[16]);
                } catch (Exception e) {
                    C0691a.m2857a(f1869z[18], e);
                }
            }
            return cls;
        } catch (SecurityException e2) {
            throw e2;
        }
    }

    /* renamed from: b */
    public static final Constructor m3125b(Class cls) throws NoSuchMethodException {
        Constructor declaredConstructor = cls.getDeclaredConstructor((Class[]) null);
        declaredConstructor.setAccessible(true);
        return declaredConstructor;
    }

    /* renamed from: c */
    public static final Class m3126c(Class cls) {
        Class superclass = cls.getSuperclass();
        if (superclass != null) {
            try {
                if (superclass.getSimpleName().startsWith(f1869z[5])) {
                    return superclass;
                }
            } catch (SecurityException e) {
                throw e;
            }
        }
        return null;
    }

    /* renamed from: c */
    public static String m3127c(String str) {
        return str.startsWith(f1869z[1]) ? str.substring(f1869z[1].length(), str.length()) : str;
    }

    /* renamed from: d */
    public static String m3128d(Class cls) {
        return C0735q.m3129d(C0735q.m3116a(cls));
    }

    /* renamed from: d */
    public static String m3129d(String str) {
        return str != null ? str.startsWith(f1869z[5]) ? str.substring(f1869z[5].length(), str.length()) : str : "";
    }

    /* renamed from: e */
    public static Class m3130e(String str) throws ClassNotFoundException {
        Class b = C0735q.m3124b(str);
        if (b != null) {
            return b;
        }
        try {
            if (str.indexOf(46) < 0) {
                str = WDProjet.getInstance().getPackageRacine() + "." + f1869z[10] + "." + str;
            }
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw e;
        }
    }

    /* renamed from: f */
    public static String m3131f(String str) {
        return str.startsWith(f1869z[12]) ? str.substring(f1869z[12].length(), str.length()) : str;
    }

    /* renamed from: g */
    public static Constructor m3132g(String str) throws NoSuchMethodException {
        try {
            Constructor[] declaredConstructors = C0735q.m3130e(str).getDeclaredConstructors();
            if (declaredConstructors.length > 0) {
                Constructor constructor = declaredConstructors[0];
                constructor.setAccessible(true);
                return constructor;
            }
            WDErreurManager.m2883a(C0745b.m3222b(f1869z[15], new String[0]));
            return null;
        } catch (ClassNotFoundException e) {
            WDErreurManager.m2883a(C0745b.m3222b(f1869z[3], str));
            return null;
        }
    }

    /* renamed from: h */
    public static String m3133h(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        try {
            if (str.startsWith(f1869z[6])) {
                stringBuilder.replace(0, f1869z[6].length(), "");
            } else {
                try {
                    if (str.startsWith(f1869z[5])) {
                        stringBuilder.replace(0, f1869z[5].length(), "");
                    }
                } catch (SecurityException e) {
                    throw e;
                }
            }
            int indexOf = stringBuilder.indexOf(f1869z[4]);
            if (indexOf >= 0) {
                try {
                    stringBuilder.replace(indexOf, f1869z[4].length() + indexOf, "");
                } catch (SecurityException e2) {
                    throw e2;
                }
            }
            return stringBuilder.toString();
        } catch (SecurityException e22) {
            throw e22;
        }
    }

    /* renamed from: z */
    private static String m3134z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 100;
                    break;
                case 1:
                    i2 = 9;
                    break;
                case 2:
                    i2 = 53;
                    break;
                case 3:
                    i2 = 29;
                    break;
                default:
                    i2 = 62;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m3135z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 62);
        }
        return toCharArray;
    }
}
