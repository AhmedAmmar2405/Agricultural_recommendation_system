package miniProjet;

import java.util.ArrayList;
import java.util.List;
import org.jpl7.Atom;
import org.jpl7.Query;
import org.jpl7.Term;
import org.jpl7.Variable;

public class recomandation {
    private String typeOfSoil;
    private String climate;
    private String temperature;
    private String season;
    private String previousCulture;
    private List<String> cultureList;
    

    public recomandation(String typeOfSoil, String climate, String temperature, String season, String previousCulture) {
        this.typeOfSoil = typeOfSoil;
        this.climate = climate;
        this.temperature = temperature;
        this.season = season;
        this.previousCulture = previousCulture;
        this.cultureList = new ArrayList<>();

        // Ensure the correct path to agri.pl
        
        Query q1 = new Query("consult", new Term[]{new Atom("appClientModule/prolog/agri.pl")});
        System.out.println("Consult " + (q1.hasSolution() ? "succeeded" : "failed"));
    }

    public void runPrologQuery() {
        // Execute Prolog query
        Query query = new Query("recommandation", new Term[]{
                new Atom(typeOfSoil),
                new Atom(climate),
                new Atom(temperature),
                new Atom(season),
                new Variable("Culture"),
                new Atom(previousCulture)
        });
    	

    	if (query.hasSolution()) {
    	    System.out.println("succes");
    	} else {
    	    // Handle the case where no solution is found
    	    System.out.println("No solution found for the query.");
    	}
        

        // Print and store the results
        while (query.hasMoreSolutions()) {
            java.util.Map<String, Term> solution = query.nextSolution();
            Term cultureTerm = solution.get("Culture");
            String culture = cultureTerm.toString();
            cultureList.add(culture);
            
        }

        // Close the query
        query.close();
    }

    public List<String> getCulture() {
        return cultureList;
    }
}
