package fr.pcsoft.wdjava.core.types.collection;

import fr.pcsoft.wdjava.api.WDAPICollection;
import fr.pcsoft.wdjava.core.C0723g;
import fr.pcsoft.wdjava.core.allocation.IWDAllocateur;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;

@C0723g(a = {WDAPICollection.class})
public class WDFile extends C0753g {
    /* renamed from: z */
    private static final String f1960z = m3340z(m3341z("T\u0010-\u000b\u0003"));

    public WDFile(int i) {
        super(C0757h.QUEUE, i, null);
    }

    public WDFile(IWDAllocateur iWDAllocateur) {
        super(C0757h.QUEUE, iWDAllocateur.getTypeWL(), iWDAllocateur);
    }

    /* renamed from: z */
    private static String m3340z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 119;
                    break;
                case 1:
                    i2 = 86;
                    break;
                case 2:
                    i2 = 100;
                    break;
                case 3:
                    i2 = 71;
                    break;
                default:
                    i2 = 70;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m3341z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 70);
        }
        return toCharArray;
    }

    public String getNomType() {
        return C0745b.m3220a(f1960z, new String[0]);
    }

    public int getTypeVar() {
        return 113;
    }

    /* renamed from: n */
    public C0753g mo2630n() {
        return this.a != null ? new WDFile(this.a) : new WDFile(this.d);
    }
}
