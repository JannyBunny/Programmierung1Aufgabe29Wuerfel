import java.util.Random;
/**
 * Aufgabe 29.
 * a. Definieren Sie in einem geeigneten Projekt eine Klasse ZufallszahlenTester. Objekte der
 * Klasse ZufallszahlenTester sollen eine Instanz der Klasse Random haben und deren Methoden
 * für ihre Zwecke benutzen.
 * 
 * @author Jan-René Grünhagen 
 * @version 04.02.2016
 */
public class ZufallszahlenTester
{
    private Random zufall;
    /**
     * Konstruktor für Objekte der Klasse ZufallszahlenTester
     */
     public ZufallszahlenTester()
    {
        //Einfach ein Objektkonstruktor weil ichs kann.
        zufall = new Random();
    }
    
    /**
     * b. Definieren Sie in der Klasse ZufallszahlenTester eine Methode eineZufallszahlAusgeben(),
     * die bei jedem Aufruf eine Zufallszahl ausgeben soll, und eine Methode zufallszahlenAusgeben
     * (int anzahl), die bei jedem Aufruf mehrere Zufallszahlen ausgibt. Der Parameter
     * anzahl gibt an, wie viele Zufallszahlen ausgegeben werden sollen. Die beiden
     * Methoden sollen Methoden des Random-Objektes benutzen. Testen Sie!
     */
    public void eineZufallszahlAusgeben() 
    {
        System.out.println(zufall.nextLong() );
    }
    
    /** 
     * b. Definieren Sie in der Klasse ZufallszahlenTester eine Methode eineZufallszahlAusgeben(),
     * die bei jedem Aufruf eine Zufallszahl ausgeben soll, und eine Methode zufallszahlenAusgeben
     * (int anzahl), die bei jedem Aufruf mehrere Zufallszahlen ausgibt. Der Parameter
     * anzahl gibt an, wie viele Zufallszahlen ausgegeben werden sollen. Die beiden
     * Methoden sollen Methoden des Random-Objektes benutzen. Testen Sie!
     * @param anzahl anzahl an zurückgegebenen Zufallszahlen
     * @return Gibt Zufallszahlen zurück.
     */
    public void zufallszahlenAusgeben(int anzahl) 
    {
        for (int i=1; i<=anzahl;i++) {
            System.out.println(zufall.nextLong());
        }
    }
    
    /**
     * c. Schauen Sie in der Doku von Random die Methode nextInt() nach. Nutzen Sie diese für
     * die folgende Methode: Überladen Sie die Methode eineZufallszahlAusgeben() so, dass
     * sie einen Parameter max erhält und eine Zufallszahl im Bereich 1 bis max ausgibt.
     * @param max Eingabe der maximalen Zahl zu welcher ausgegeben wird.
     */
    public void eineZufallszahlAusgeben(int max)
    {
        System.out.println(zufall.nextInt(max)+1);
    }
    
    /**
     * d. Schreiben Sie in Ihrer Klasse ZufallszahlenTester eine Methode wuerfeln(), die Werte
     * von 1 bis 6 zurückliefert.
     * @return Rückgabe der gewürfelten Zahl.
     */
    public int wuerfeln() 
    {
        return zufall.nextInt(6)+1;
    }
    
    /**
     * e. Schreiben Sie eine Methode gibAntwort(), die zufällig eine der drei Zeichenketten "ja",
     * "nein" oder "vielleicht" zurückliefert.
     * @return Rückgabe der Antwort je nach ermitteltem Wert.
     */
    public String gibAntwort() 
    {
        int i = zufall.nextInt(3)+1;
        if (i == 1)
            return "ja";
        if (i == 2)
            return "nein";
        return "vielleicht";
    }
    
    /**
     * f. Ergänzen Sie eine Methode wuerfelTesten(), mit deren Hilfe getestet werden soll, dass
     * die Methode wuerfeln() im Mittel alle Zahlen gleich häufig liefert. Die Methode wuerfel-
     * Testen() soll dazu mehrfach würfeln. Sie soll über einen Parameter verfügen, der angibt,
     * wie häufig gewürfelt werden soll. Sie soll mitzählen, wie häufig die einzelnen Zahlen
     * gewürfelt wurden. Zum Zählen soll sie ein geeignetes Array verwenden und die ermittelten
     * Häufigkeiten ausgeben.
     */
    public void wuerfelTesten()
    {
    }
}
