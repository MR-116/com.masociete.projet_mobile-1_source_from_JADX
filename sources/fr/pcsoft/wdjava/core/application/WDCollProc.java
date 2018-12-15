package fr.pcsoft.wdjava.core.application;

import fr.pcsoft.wdjava.core.WDCallback;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.context.WDAppelContexte;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.poo.C0735q;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDVoid;
import fr.pcsoft.wdjava.core.utils.C0808l;
import java.util.HashMap;

public abstract class WDCollProc {
    /* renamed from: a */
    private static HashMap<String, WDObjet> f1599a = null;
    /* renamed from: z */
    private static final String f1600z = m2603z(m2604z("@\u0006\bR{&\u0012\u000fO}<\u001f\u0014^w-\u0018\u000fX"));

    /* renamed from: a */
    private static WDObjet m2602a(String str, Object... objArr) {
        int length = objArr.length;
        WDCallback a = WDCallback.m2240a(str, length);
        if (a != null) {
            WDObjet[] wDObjetArr = new WDObjet[length];
            if (length > 0) {
                for (length = 0; length < objArr.length; length++) {
                    Object obj = objArr[length];
                    if (obj instanceof Number) {
                        if (obj instanceof Integer) {
                            wDObjetArr[length] = WDCallback.m2247a(((Integer) obj).intValue());
                        } else if (obj instanceof Double) {
                            wDObjetArr[length] = WDCallback.m2246a(((Double) obj).doubleValue());
                        } else if (obj instanceof Long) {
                            wDObjetArr[length] = WDCallback.m2249a(((Long) obj).longValue());
                        } else if (obj instanceof Short) {
                            wDObjetArr[length] = WDCallback.m2247a(((Short) obj).intValue());
                        } else if (obj instanceof Byte) {
                            wDObjetArr[length] = WDCallback.m2247a(((Byte) obj).intValue());
                        }
                    } else if (obj instanceof Boolean) {
                        wDObjetArr[length] = WDCallback.m2254a(((Boolean) obj).booleanValue());
                    } else {
                        wDObjetArr[length] = WDCallback.m2253a(obj.toString());
                    }
                }
            }
            WDObjet execute = a.execute(wDObjetArr);
            return execute == null ? new WDVoid(C0735q.m3133h(str)) : execute;
        } else {
            WDErreurManager.m2883a(C0745b.m3222b(f1600z, str));
            return null;
        }
    }

    public static void appelProcedureWL(String str, Object... objArr) {
        m2602a(str, objArr);
    }

    public static String appelProcedureWL_String(String str, Object... objArr) {
        return m2602a(str, objArr).getString();
    }

    public static boolean appelProcedureWL_boolean(String str, Object... objArr) {
        return m2602a(str, objArr).getBoolean();
    }

    public static double appelProcedureWL_double(String str, Object... objArr) {
        return m2602a(str, objArr).getDouble();
    }

    public static int appelProcedureWL_int(String str, Object... objArr) {
        return m2602a(str, objArr).getInt();
    }

    public static long appelProcedureWL_long(String str, Object... objArr) {
        return m2602a(str, objArr).getLong();
    }

    public static void callWLProcedure(String str, Object... objArr) {
        appelProcedureWL(str, objArr);
    }

    public static String callWLProcedure_String(String str, Object... objArr) {
        return appelProcedureWL_String(str, objArr);
    }

    public static boolean callWLProcedure_boolean(String str, Object... objArr) {
        return appelProcedureWL_boolean(str, objArr);
    }

    public static double callWLProcedure_double(String str, Object... objArr) {
        return callWLProcedure_double(str, objArr);
    }

    public static int callWLProcedure_int(String str, Object... objArr) {
        return appelProcedureWL_int(str, objArr);
    }

    public static long callWLProcedure_long(String str, Object... objArr) {
        return appelProcedureWL_long(str, objArr);
    }

    protected static final void declarerVariableGlobale(String str, String str2, WDObjet wDObjet) {
        if (f1599a == null) {
            f1599a = new HashMap();
        }
        f1599a.put(C0808l.m4016a(new StringBuilder((str.length() + str2.length()) + 1).append(str).append('.').append(str2).toString(), 20, 0), wDObjet);
    }

    protected static void finExecProcGlobale() {
        WDAppelContexte.getContexte().m2736x();
    }

    public static final WDObjet findVariable(String str) {
        if (f1599a == null || f1599a.isEmpty()) {
            return null;
        }
        return (WDObjet) f1599a.get(C0808l.m4016a(str, 20, 0));
    }

    protected static void initExecProcGlobale(String str) {
        WDAppelContexte.getContexte().m2699a(str);
    }

    /* renamed from: z */
    private static String m2603z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 99;
                    break;
                case 1:
                    i2 = 86;
                    break;
                case 2:
                    i2 = 90;
                    break;
                case 3:
                    i2 = 29;
                    break;
                default:
                    i2 = 56;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2604z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 56);
        }
        return toCharArray;
    }
}
