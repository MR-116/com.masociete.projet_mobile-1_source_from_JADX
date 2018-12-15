package com.masociete.projet_mobile.wdgen;

import fr.pcsoft.wdjava.database.hf.requete.parsing.WDDescRequeteWDR;
import fr.pcsoft.wdjava.database.hf.requete.parsing.WDDescRequeteWDR.Requete;
import fr.pcsoft.wdjava.database.hf.requete.parsing.WDInvalidSQLException;

public class GWDRREQ_updateuser extends WDDescRequeteWDR {
    public String getNomLogique() {
        return "REQ_updateuser";
    }

    public String getCodeSQLOriginal() {
        return " UPDATE  Utilisateur SET IDlangue = 1";
    }

    public Requete initArbre() throws WDInvalidSQLException {
        Fichier fic_Utilisateur = new Fichier();
        fic_Utilisateur.setNom("Utilisateur");
        fic_Utilisateur.setAlias("Utilisateur");
        Requete varReqUpdate = new Requete(3);
        varReqUpdate.ajouterClause(fic_Utilisateur);
        Set varSet = new Set();
        Rubrique rub_IDlangue = new Rubrique();
        rub_IDlangue.setNom("Utilisateur.IDlangue");
        rub_IDlangue.setAlias("IDlangue");
        rub_IDlangue.setNomFichier("Utilisateur");
        rub_IDlangue.setAliasFichier("Utilisateur");
        Literal varLiteral = new Literal();
        varLiteral.setValeur("1");
        varLiteral.setTypeWL(9);
        varSet.ajouterElement(rub_IDlangue);
        varSet.ajouterElement(varLiteral);
        varReqUpdate.ajouterClause(varSet);
        return varReqUpdate;
    }

    public String getNomFichier(int nIndex) {
        switch (nIndex) {
            case 0:
                return "Utilisateur";
            default:
                return null;
        }
    }

    public String getAliasFichier(int nIndex) {
        switch (nIndex) {
            case 0:
                return "Utilisateur";
            default:
                return null;
        }
    }
}
