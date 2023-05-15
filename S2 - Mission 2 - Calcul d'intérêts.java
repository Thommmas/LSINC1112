class CalculDinterets {
    public static void main(String[] args) {
        double capital = 1000.0; // Montant initial
        double interet = 5.0; // Taux d'intérêt annuel en pourcentage
        int duree = 3; // Durée en années
        
        double result = calculateSavings(capital, interet, duree);
        
        System.out.println("La somme après la durée spécifiée est : " + result);
    }

    public static double calculateSavings(double capital, double interet, int duree) {
        double tauxInteret = interet / 100; // Conversion du pourcentage en décimal
        double sommeInterets = capital * tauxInteret * duree; // Calcul des intérêts
        double result = capital + sommeInterets; // Calcul de la somme totale
        
        return result;
    }
}
