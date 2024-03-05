public class Film {
    private String name;
    private String director;
    private int lenght;
    private int budget;
    private int fees;

    public Film(String name,String director, int lenght,int budget, int fees){
        this.name=name;
        this.director=director;
        this.lenght=lenght;
        this.budget=budget;
        this.fees=fees;
    }
    public String printinfo(){
       return "Film name is "+name+", it's director is "+director+" It lenghts "+lenght+" minutes and its budget was "+budget+" million dollars and box office is "+fees+" million dollars";
    }
    public String income(){
        double in = getFees()-getBudget();
        if (in>0){
            return "Film incomes are "+in+" million dollars"+"\n";
        } else {
            return "Film has negative income with "+in+" million dollars"+"\n";
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }
}
