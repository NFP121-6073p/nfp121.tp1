package question3;

/**
 * NFP121 TpIntroduction, usage de BlueJ et du "Submitter".
 * 
 * @version septembre 2009
 * @author � compl�ter
 * @see java.lang.String, java.lang.Math
 */
public class AuditeurCNAM {
    /** l'attribut nom de chaque auditeur. */
    private String nom;
    /** l'attribut prenom de chaque auditeur. */
    private String prenom;
    /** l'attribut matricule de chaque auditeur. */
    private String matricule;

    /**
     * "Cr�ation", le constructeur d'un auditeur avec son nom, son pr�nom et son
     * matricule.
     * 
     * @param nom
     *            le nom de l'auditeur
     * @param prenom
     *            son pr�nom
     * @param matricule
     *            sur la carte d'inscription, pr�s de la photo
     */
    public AuditeurCNAM(String nom, String prenom, String matricule) {
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
    }

    /**
     * le login au Cnam : 6 premi�res lettres du nom suivies de la premi�re
     * lettre du pr�nom s�par�es de '_' . le login retourn� est en minuscules,
     * le trait d'union, ou sp�ciaux <i>(pour unix)</i> sont remplac�s par des
     * '_' pas de caract�res accentu�s pour le login voir les classes
     * pr�d�fines, java.lang.String : les m�thodes replaceAll, toLowerCase et
     * substring java.lang.Math : la m�thode min<br>
     * <b>BlueJ : Menu Aide</b>
     * 
     * @return le login du Cnam simplifi�, sans les adaptations dues aux
     *         homonymes...
     */
    public String login() {
        
        String n=this.nom;
        String p=this.prenom
        /**
         * Pas de caract�res accentu�es pour le login
         * /  
           n=sansAccents(n);//
           retourner le nom sans accents
           p=sansAccents(p);//
           retourner le prenom sans accents
           /**
            * Le trait d'union,ou sp�cieux<i>(pour unix)</i>sont remplac�s par des'_'*/
            n=n.replaceAll("[�-zA-Z0-9]+","_");//retourner le nom en remplacant le trait d'union,ou sp�ciaux <i>(pour unix)</i>par'_'
            /**
             * Le login est converis en minuscules
             */
            String nomAjuste=n.toLowerCase();
            /**
             * Le login est compos� des 6 premi�re lettres du nom suivies de la premi�re lettre du pr�nom s�par�es de'_'*/
             if(nomAjuste.length()>=6)
            }
            return
            nomAjuste.substring(0,6)+"_"+prenomAjuste.substring(0,1);
        }
        else return nomAjuste+"_"+prenomAjuste.substring(0,1);
    }
    /**
     * M�thode pour v�rifiez si la Chaine est nulle ou vide.*/
     
     public boolean chaineVide(String s){
         if(s!=null &&! s.trim().isEmpty())
         {
             return false;
            }
            else return true;
        }
        /**
         * M�thode pour enlever les accents et le retourne sans accents */
         public String sansAccents(String s){String avecAccent="������";//tableau des lettres avec accents
             String sansAccent="aaaaeeeiiiooouuu";//tableau ayant les m�mes lettres mais sans accents
             int 1= avecAccent.charAt.length();
             for(int i=0; i<I; i++)
             s= s.replace(avecAccent.charAt(i));//enlever les accents
            } return s;
            
     }
        
    }

    /**
     * Lecture du nom de l'auditeur.
     * 
     * @return son nom
     */
    public String nom() {
        return this.nom;// � compl�ter
    }

    /**
     * Lecture du pr�nom de l'auditeur.
     * 
     * @return son pr�nom
     */
    public String prenom() {
        return this.prenom;// � compl�ter
    }

    /**
     * Lecture du matricule de l'auditeur.
     * 
     * @return son matricule
     */
    public String matricule() {
        return this.matricule;// � compl�ter
    }

    /**
     * m�thode toString ( m�thode red�finie de la classe Object).
     * 
     * @return la concat�nation du nom, du pr�nom et du login, selon cette
     *         syntaxe
     *         <code>nom() + " " + prenom() +  " login : " + login()</code>
     */
    @Override
    public String toString() {
        return nom() + " " + prenom() + " login : " + login();
    }

}
