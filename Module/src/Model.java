package lab1;

/**
 * @author Darius Cristurean
 */
public class Model {
    static String occupation = "modeling";
    private String firstName;
    private String lastName;
    private int height;
    private double weight;
    private boolean canTravel;
    private boolean smokes;

    public Model(){

    }

    public Model(String firstName, String lastName, int height, double weight, boolean canTravel, boolean smokes){
    String firstName = firstName;
        String lastName =lastName;
        int height = height;
        double weight = weight;
        boolean canTravel = canTravel;
        boolean smokes = smokes;
    }
    public Model(String firstName, String lastName, int height, double weight,) {
        String firstName = firstName;
        String lastName = lastName;
        int height = height;
        double weight = weight;
        boolean canTravel = canTravel;
        boolean smokes = smokes;

        // getters (accesors)
        public static String getOccupation () {
            return occupation;
        }
        /**
         * Getter for firstName
         * @return firstName
         */

        public void setFirstName (String firstName){
            this.firstName = firstName;
        }

        public String getLastName () {
            return lastName;
        }

        public void setLastName (String lastName){
            this.lastName = lastName;
        }

        public int getHeight () {
            return height;
        }

        public void setHeight ( int height){
            this.height = height;
        }

        public double getWeight () {
            return weight;
        }

        public void setWeight ( double weight){
            this.weight = weight;
        }

        public String getHeightInCmAndFeet () {
            int cm = height * 12;
            int feet = height * 12;

            String n_unit = "";
            if (feet > 1) {
                n_unit = feet + " feet";
            } else if (feet == 1) {
                n_unit = feet + " foot";
            }

            String a_unit = "";
            if (cm > 1) {
                a_unit = cm + " inches";
            } else if (cm == 1) {
                a_unit = cm + " inch";
            }

            return a_unit + n_unit;
        }

        public double getWeight () {
            return weight;
        }

        public long getWeightKg () {
            return Math.round(weight * 0.45);
        }

        public boolean isCanTravel () {
            return canTravel;
        }

        public boolean isSmokes () {
            return smokes;
        }

        public final void setCanTravel(boolean canTravel) {
            this.canTravel = canTravel;
        }
// setters (mutators)
        public final void setCanTravel(boolean canTravel) {
            this.canTravel = canTravel;
        }

        public final void setFirstName(String firstName) {
            if ((firstName != null) && (firstName.length() >= 3) && (firstName.length() <= 20)) {
                this.firstName = firstName;
            }
        }

        public final void setLastName(String lastName) {
            if ((lastName != null) && (lastName.length() >= 3) && (lastName.length() <= 20)) {
                this.lastName = lastName;
            }
        }

        public final void setHeight(int inches) {
            if (inches >= 24 && inches <= 84) {
                this.height = inches;
            }
        }

        public final void setHeight(int feet, int inches) {
            int inInches = feet * 12 + inches;
            setHeight(inInches);
        }

        public final void setWeight(double pounds) {
            if (pounds >= 80 && pounds <= 280) {
                this.weight = pounds;
            }
        }

        public final void setWeight(long kilograms) {
            double inPounds = kilograms * 2.205;
            setWeight(inPounds);
        }

        public void setSmokes(boolean smokes) {
            this.smokes = smokes;
        }

        public void printDetails() {
            System.out.println("Name: " + getFirstName() + " " + getLastName());
            System.out.println("Height: " + getHeight() + " inches");
            System.out.println("Weight: " + Math.round(getWeight()) + " pounds");
            if (canTravel) {
                System.out.println("Does travel ");
            } else {
                System.out.println("Does not travel ");
            }

            if (smokes) {
                System.out.println("Does smoke ");
            } else {
                System.out.println("Does not smoke ");
            }
        }
    }
