package fr.pcsoft.wdjava.core.utils;

public enum jc {
    ARCHOS_101_IT,
    KINDLE_FIRE,
    GALAXY_SII,
    GALAXY_S4,
    COOLPIX_S800C,
    NEXUS_5,
    GALAXY_TAB3;
    
    /* renamed from: a */
    private static final jc[] f2107a = null;

    static {
        ARCHOS_101_IT = new jc(m3957z(m3958z("\u0011S\u0006@g\u0003^t8\u0019\u000fH\u0011")), 0);
        KINDLE_FIRE = new jc(m3957z(m3958z("\u001bH\u000bLd\u0015^\u0003Az\u0015")), 1);
        GALAXY_SII = new jc(m3957z(m3958z("\u0017@\tIp\t^\u0016Aa")), 2);
        GALAXY_S4 = new jc(m3957z(m3958z("\u0017@\tIp\t^\u0016<")), 3);
        COOLPIX_S800C = new jc(m3957z(m3958z("\u0013N\nDx\u0019Y\u001a[\u0010`1\u0006")), 4);
        NEXUS_5 = new jc(m3957z(m3958z("\u001eD\u001d]{\u000f4")), 5);
        GALAXY_TAB3 = new jc(m3957z(m3958z("\u0017@\tIp\t^\u0011Ijc")), 6);
        f2107a = new jc[]{ARCHOS_101_IT, KINDLE_FIRE, GALAXY_SII, GALAXY_S4, COOLPIX_S800C, NEXUS_5, GALAXY_TAB3};
    }

    /* renamed from: z */
    private static String m3957z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 80;
                    break;
                case 1:
                    i2 = 1;
                    break;
                case 2:
                    i2 = 69;
                    break;
                case 3:
                    i2 = 8;
                    break;
                default:
                    i2 = 40;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m3958z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 40);
        }
        return toCharArray;
    }
}
