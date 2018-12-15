package fr.pcsoft.wdjava.database.hf.p052d;

import fr.pcsoft.wdjava.database.hf.WDHF_Contexte;
import fr.pcsoft.wdjava.file.C0897o;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.helpers.DefaultHandler;

/* renamed from: fr.pcsoft.wdjava.database.hf.d.a */
public class C0847a {
    /* renamed from: a */
    public static void m5778a(WDHF_Contexte wDHF_Contexte, String str) {
        wDHF_Contexte.m5011c(new C0847a().m5781b(wDHF_Contexte, str));
    }

    /* renamed from: b */
    public static void m5779b(WDHF_Contexte wDHF_Contexte, InputStream inputStream) {
        wDHF_Contexte.m5011c(new C0847a().m5780a(wDHF_Contexte, inputStream));
    }

    /* renamed from: a */
    public boolean m5780a(WDHF_Contexte wDHF_Contexte, InputStream inputStream) {
        if (inputStream == null) {
            return false;
        }
        DefaultHandler c0848b = new C0848b(wDHF_Contexte);
        try {
            SAXParserFactory.newInstance().newSAXParser().parse(inputStream, c0848b);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                }
            }
            c0848b.m5784a();
            return true;
        } catch (Exception e2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e3) {
                }
            }
            c0848b.m5784a();
            return false;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e4) {
                }
            }
            c0848b.m5784a();
        }
    }

    /* renamed from: b */
    public boolean m5781b(WDHF_Contexte wDHF_Contexte, String str) {
        File file = new File(C0897o.m6281f(str));
        try {
            if (!file.exists()) {
                return false;
            }
            DefaultHandler c0848b = new C0848b(wDHF_Contexte);
            try {
                SAXParserFactory.newInstance().newSAXParser().parse(file, c0848b);
                return true;
            } catch (Exception e) {
                return false;
            } finally {
                c0848b.m5784a();
            }
        } catch (Exception e2) {
            throw e2;
        }
    }
}
