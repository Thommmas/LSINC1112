class IntervalVerification {
    public static void main(String[] args) {
        double x = 3.5; // Réel à vérifier
        double debut = 2.0; // Borne inférieure de l'intervalle
        double fin = 4.0; // Borne supérieure de l'intervalle
        boolean fermeture = true; // Indicateur de fermeture de l'intervalle
        
        boolean in;
        
        if (fermeture) {
            in = (x >= debut) && (x <= fin);
        } else {
            in = (x > debut) && (x < fin);
        }
        
        System.out.println("Le réel x se trouve dans l'intervalle : " + in);
    }
}
