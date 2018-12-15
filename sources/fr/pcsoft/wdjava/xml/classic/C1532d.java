package fr.pcsoft.wdjava.xml.classic;

import java.io.IOException;
import java.io.StringReader;
import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/* renamed from: fr.pcsoft.wdjava.xml.classic.d */
final class C1532d implements EntityResolver {
    C1532d() {
    }

    public InputSource resolveEntity(String str, String str2) throws SAXException, IOException {
        return new InputSource(new StringReader(""));
    }
}
