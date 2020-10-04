package chapter4.animalspecies;

public class Main {

    public static void assertEquals(String expected, String actual){
        if(!expected.equals(actual)){
            throw new AssertionException("Expected: [" + expected + "], but got: [" + actual + "]");
        }
    }

    public static void assertEquals(Long expected, Long actual){
        if(Long.compare(expected, actual) != 0) {
            throw new AssertionException("Expected: [" + expected + "], but got: [" + actual + "]");
        }
    }

    public static void assertEquals(Double expected, Double actual){
        if(Double.compare(expected, actual) != 0){
            throw new AssertionException("Expected: [" + expected + "], but got: [" + actual + "]");
        }
    }

    public static void assertTrue(Boolean actual){
        if(!actual){
            throw new AssertionException("Expected true, but is false");
        }
    }

    public static void main(String[] args) {

        AnimalSpecies canine = new AnimalSpecies("Canine", 2L, 0.0);
        AnimalSpecies feline = new AnimalSpecies("Feline",2L, 3.0);
        AnimalSpecies human = new AnimalSpecies("Human", 2L, -0.3);

        assertEquals("Canine", canine.getName());
        assertEquals(2L, human.getPopulation());
        assertEquals(3.0, feline.getGrowthRate());
        assertTrue(human.endangered());
    }
}
