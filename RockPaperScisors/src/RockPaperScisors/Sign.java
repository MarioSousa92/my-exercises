package RockPaperScisors;

public enum Sign {
    ROCK ("rock"),
    PAPER ("paper"),
    SCISSORS ("scissors");

     private String description;

     Sign(String description) {
         this.description = description;
}

public String getDescription() {
    return this.description;
}
    Sign chooseSign() {
        Sign[] mySigns = Sign.values();

        mySigns[0]{
            mySigns = (Math.random() * 2 );
            System.out.println(mySigns);
        }


    }
}