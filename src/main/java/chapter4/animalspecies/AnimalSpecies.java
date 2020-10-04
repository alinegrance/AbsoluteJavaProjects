package chapter4.animalspecies;

public class AnimalSpecies {
    private String name;
    private Long population;
    private Double growthRate;

    public AnimalSpecies(String name) {
        this(name, null, null);
    }

    public AnimalSpecies(String name, Long population) {
        this(name, population, null);
    }

    public AnimalSpecies(String name, Long population, Double growthRate) {
        if(population != null && population < 0) {
            throw new IllegalArgumentException("population must be non-negative");
        }

        this.name = name;
        this.population = population;
        this.growthRate = growthRate;
    }

    public String getName() {
        return this.name;
    }

    public Long getPopulation() {
        return this.population;
    }

    public Double getGrowthRate() {
        return this.growthRate;
    }

    public void setPopulation(Long population) {
        if(population < 0){
            throw new IllegalArgumentException("population must be non-negative");
        }

        this.population = population;
    }

    public void setGrowthRate(Double growthRate) {
        this.growthRate = growthRate;
    }

    public boolean endangered(){
        return growthRate < 0.0;
    }

    @Override
    public String toString(){
        return "AnimalSpecies(" + name + ", " + population + ", " + growthRate + "), endangered: " + endangered();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null){
            return false;
        } else if (getClass() != o.getClass()){
            return false;
        } else {
            AnimalSpecies otherSpecies = (AnimalSpecies) o;
            return this.name.equals(otherSpecies.name);
        }

    }
}
